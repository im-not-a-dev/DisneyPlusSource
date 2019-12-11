package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Predicate;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderListener;
import com.facebook.stetho.inspector.elements.NodeDescriptor;
import com.facebook.stetho.inspector.elements.ObjectDescriptor;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.ArrayList;
import java.util.List;

final class AndroidDocumentProvider extends ThreadBoundProxy implements DocumentProvider, AndroidDescriptorHost {
    private static final int INSPECT_HOVER_COLOR = 1077952767;
    private static final int INSPECT_OVERLAY_COLOR = 1090519039;
    private static final long REPORT_CHANGED_INTERVAL_MS = 1000;
    /* access modifiers changed from: private */
    public final Application mApplication;
    private final DescriptorMap mDescriptorMap;
    private final AndroidDocumentRoot mDocumentRoot;
    /* access modifiers changed from: private */
    public final ViewHighlighter mHighlighter;
    /* access modifiers changed from: private */
    public final Rect mHighlightingBoundsRect = new Rect();
    /* access modifiers changed from: private */
    public final Rect mHitRect = new Rect();
    private final InspectModeHandler mInspectModeHandler;
    /* access modifiers changed from: private */
    public boolean mIsReportChangesTimerPosted;
    /* access modifiers changed from: private */
    public DocumentProviderListener mListener;
    private final Runnable mReportChangesTimer;

    private final class InspectModeHandler {
        /* access modifiers changed from: private */
        public List<View> mOverlays;
        private final Predicate<View> mViewSelector;

        private final class OverlayView extends DocumentHiddenView {
            public OverlayView(Context context) {
                super(context);
            }

            /* access modifiers changed from: protected */
            public void onDraw(Canvas canvas) {
                canvas.drawColor(AndroidDocumentProvider.INSPECT_OVERLAY_COLOR);
                super.onDraw(canvas);
            }

            public boolean onTouchEvent(MotionEvent motionEvent) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Object parent = getParent();
                while (true) {
                    HighlightableDescriptor highlightableDescriptor = AndroidDocumentProvider.this.getHighlightableDescriptor(parent);
                    if (highlightableDescriptor == null) {
                        break;
                    }
                    AndroidDocumentProvider.this.mHitRect.setEmpty();
                    Object elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(parent, x, y, AndroidDocumentProvider.this.mHitRect);
                    x -= AndroidDocumentProvider.this.mHitRect.left;
                    y -= AndroidDocumentProvider.this.mHitRect.top;
                    if (elementToHighlightAtPosition == parent) {
                        break;
                    }
                    parent = elementToHighlightAtPosition;
                }
                if (parent != null) {
                    HighlightableDescriptor highlightableDescriptor2 = AndroidDocumentProvider.this.getHighlightableDescriptor(parent);
                    if (highlightableDescriptor2 != null) {
                        View viewAndBoundsForHighlighting = highlightableDescriptor2.getViewAndBoundsForHighlighting(parent, AndroidDocumentProvider.this.mHighlightingBoundsRect);
                        if (!(motionEvent.getAction() == 3 || viewAndBoundsForHighlighting == null)) {
                            AndroidDocumentProvider.this.mHighlighter.setHighlightedView(viewAndBoundsForHighlighting, AndroidDocumentProvider.this.mHighlightingBoundsRect, AndroidDocumentProvider.INSPECT_HOVER_COLOR);
                            if (motionEvent.getAction() == 1 && AndroidDocumentProvider.this.mListener != null) {
                                AndroidDocumentProvider.this.mListener.onInspectRequested(parent);
                            }
                        }
                    }
                }
                return true;
            }
        }

        private InspectModeHandler() {
            this.mViewSelector = new Predicate<View>() {
                public boolean apply(View view) {
                    return !(view instanceof DocumentHiddenView);
                }
            };
        }

        public void disable() {
            AndroidDocumentProvider.this.verifyThreadAccess();
            if (this.mOverlays != null) {
                for (int i = 0; i < this.mOverlays.size(); i++) {
                    View view = (View) this.mOverlays.get(i);
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.mOverlays = null;
            }
        }

        public void enable() {
            AndroidDocumentProvider.this.verifyThreadAccess();
            if (this.mOverlays != null) {
                disable();
            }
            this.mOverlays = new ArrayList();
            AndroidDocumentProvider.this.getWindows(new Accumulator<Window>() {
                public void store(Window window) {
                    if (window.peekDecorView() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) window.peekDecorView();
                        InspectModeHandler inspectModeHandler = InspectModeHandler.this;
                        OverlayView overlayView = new OverlayView(AndroidDocumentProvider.this.mApplication);
                        LayoutParams layoutParams = new LayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        viewGroup.addView(overlayView, layoutParams);
                        viewGroup.bringChildToFront(overlayView);
                        InspectModeHandler.this.mOverlays.add(overlayView);
                    }
                }
            });
        }
    }

    public AndroidDocumentProvider(Application application, List<DescriptorProvider> list, ThreadBound threadBound) {
        super(threadBound);
        this.mIsReportChangesTimerPosted = false;
        this.mReportChangesTimer = new Runnable() {
            public void run() {
                AndroidDocumentProvider.this.mIsReportChangesTimerPosted = false;
                if (AndroidDocumentProvider.this.mListener != null) {
                    AndroidDocumentProvider.this.mListener.onPossiblyChanged();
                    AndroidDocumentProvider.this.mIsReportChangesTimerPosted = true;
                    AndroidDocumentProvider.this.postDelayed(this, AndroidDocumentProvider.REPORT_CHANGED_INTERVAL_MS);
                }
            }
        };
        this.mApplication = (Application) Util.throwIfNull(application);
        this.mDocumentRoot = new AndroidDocumentRoot(application);
        this.mDescriptorMap = new DescriptorMap().beginInit().registerDescriptor(Activity.class, (Descriptor) new ActivityDescriptor()).registerDescriptor(AndroidDocumentRoot.class, (Descriptor) this.mDocumentRoot).registerDescriptor(Application.class, (Descriptor) new ApplicationDescriptor()).registerDescriptor(Dialog.class, (Descriptor) new DialogDescriptor()).registerDescriptor(Object.class, (Descriptor) new ObjectDescriptor()).registerDescriptor(TextView.class, (Descriptor) new TextViewDescriptor()).registerDescriptor(View.class, (Descriptor) new ViewDescriptor()).registerDescriptor(ViewGroup.class, (Descriptor) new ViewGroupDescriptor()).registerDescriptor(Window.class, (Descriptor) new WindowDescriptor());
        DialogFragmentDescriptor.register(this.mDescriptorMap);
        FragmentDescriptor.register(this.mDescriptorMap);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((DescriptorProvider) list.get(i)).registerDescriptor(this.mDescriptorMap);
        }
        this.mDescriptorMap.setHost(this).endInit();
        this.mHighlighter = ViewHighlighter.newInstance();
        this.mInspectModeHandler = new InspectModeHandler();
    }

    /* access modifiers changed from: private */
    public void getWindows(final Accumulator<Window> accumulator) {
        Descriptor descriptor = getDescriptor(this.mApplication);
        if (descriptor != null) {
            descriptor.getChildren(this.mApplication, new Accumulator<Object>() {
                public void store(Object obj) {
                    if (obj instanceof Window) {
                        accumulator.store((Window) obj);
                        return;
                    }
                    Descriptor descriptor = AndroidDocumentProvider.this.getDescriptor(obj);
                    if (descriptor != null) {
                        descriptor.getChildren(obj, this);
                    }
                }
            });
        }
    }

    public void dispose() {
        verifyThreadAccess();
        this.mHighlighter.clearHighlight();
        this.mInspectModeHandler.disable();
        removeCallbacks(this.mReportChangesTimer);
        this.mIsReportChangesTimerPosted = false;
        this.mListener = null;
    }

    public Descriptor getDescriptor(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.mDescriptorMap.get(obj.getClass());
    }

    public HighlightableDescriptor getHighlightableDescriptor(Object obj) {
        if (obj == null) {
            return null;
        }
        Class cls = obj.getClass();
        HighlightableDescriptor highlightableDescriptor = null;
        Descriptor descriptor = null;
        while (highlightableDescriptor == null && cls != null) {
            Descriptor descriptor2 = this.mDescriptorMap.get(cls);
            if (descriptor2 == null) {
                return null;
            }
            if (descriptor2 != descriptor && (descriptor2 instanceof HighlightableDescriptor)) {
                highlightableDescriptor = (HighlightableDescriptor) descriptor2;
            }
            cls = cls.getSuperclass();
            descriptor = descriptor2;
        }
        return highlightableDescriptor;
    }

    public NodeDescriptor getNodeDescriptor(Object obj) {
        verifyThreadAccess();
        return getDescriptor(obj);
    }

    public Object getRootElement() {
        verifyThreadAccess();
        return this.mDocumentRoot;
    }

    public void hideHighlight() {
        verifyThreadAccess();
        this.mHighlighter.clearHighlight();
    }

    public void highlightElement(Object obj, int i) {
        verifyThreadAccess();
        HighlightableDescriptor highlightableDescriptor = getHighlightableDescriptor(obj);
        if (highlightableDescriptor == null) {
            this.mHighlighter.clearHighlight();
            return;
        }
        this.mHighlightingBoundsRect.setEmpty();
        View viewAndBoundsForHighlighting = highlightableDescriptor.getViewAndBoundsForHighlighting(obj, this.mHighlightingBoundsRect);
        if (viewAndBoundsForHighlighting == null) {
            this.mHighlighter.clearHighlight();
        } else {
            this.mHighlighter.setHighlightedView(viewAndBoundsForHighlighting, this.mHighlightingBoundsRect, i);
        }
    }

    public void onAttributeModified(Object obj, String str, String str2) {
        DocumentProviderListener documentProviderListener = this.mListener;
        if (documentProviderListener != null) {
            documentProviderListener.onAttributeModified(obj, str, str2);
        }
    }

    public void onAttributeRemoved(Object obj, String str) {
        DocumentProviderListener documentProviderListener = this.mListener;
        if (documentProviderListener != null) {
            documentProviderListener.onAttributeRemoved(obj, str);
        }
    }

    public void setAttributesAsText(Object obj, String str) {
        verifyThreadAccess();
        Descriptor descriptor = this.mDescriptorMap.get(obj.getClass());
        if (descriptor != null) {
            descriptor.setAttributesAsText(obj, str);
        }
    }

    public void setInspectModeEnabled(boolean z) {
        verifyThreadAccess();
        if (z) {
            this.mInspectModeHandler.enable();
        } else {
            this.mInspectModeHandler.disable();
        }
    }

    public void setListener(DocumentProviderListener documentProviderListener) {
        verifyThreadAccess();
        this.mListener = documentProviderListener;
        if (this.mListener == null && this.mIsReportChangesTimerPosted) {
            this.mIsReportChangesTimerPosted = false;
            removeCallbacks(this.mReportChangesTimer);
        } else if (this.mListener != null && !this.mIsReportChangesTimerPosted) {
            this.mIsReportChangesTimerPosted = true;
            postDelayed(this.mReportChangesTimer, REPORT_CHANGED_INTERVAL_MS);
        }
    }
}
