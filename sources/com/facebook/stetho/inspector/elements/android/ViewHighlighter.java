package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

abstract class ViewHighlighter {

    private static final class NoopHighlighter extends ViewHighlighter {
        private NoopHighlighter() {
        }

        public void clearHighlight() {
        }

        public void setHighlightedView(View view, Rect rect, int i) {
        }
    }

    @TargetApi(18)
    private static final class OverlayHighlighter extends ViewHighlighter {
        private AtomicReference<Rect> mBoundsToHighlight = new AtomicReference<>();
        private AtomicInteger mContentColor = new AtomicInteger();
        private final Rect mEmptyRect = new Rect();
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        private final ViewHighlightOverlays mHighlightOverlays = ViewHighlightOverlays.newInstance();
        private final Runnable mHighlightViewOnUiThreadRunnable = new Runnable() {
            public void run() {
                OverlayHighlighter.this.highlightViewOnUiThread();
            }
        };
        private final Rect mHighlightedBounds = new Rect();
        private View mHighlightedView;
        private AtomicReference<View> mViewToHighlight = new AtomicReference<>();

        /* access modifiers changed from: private */
        public void highlightViewOnUiThread() {
            View view = (View) this.mViewToHighlight.getAndSet(null);
            Rect rect = (Rect) this.mBoundsToHighlight.getAndSet(null);
            if (rect == null) {
                rect = this.mEmptyRect;
            }
            if (view != this.mHighlightedView || !this.mHighlightedBounds.equals(rect)) {
                View view2 = this.mHighlightedView;
                if (view2 != null) {
                    this.mHighlightOverlays.removeHighlight(view2);
                }
                if (view != null) {
                    this.mHighlightOverlays.highlightView(view, rect, this.mContentColor.get());
                }
                this.mHighlightedView = view;
                if (rect == null) {
                    this.mHighlightedBounds.setEmpty();
                } else {
                    this.mHighlightedBounds.set(rect);
                }
            }
        }

        private void setHighlightedViewImpl(View view, Rect rect, int i) {
            this.mHandler.removeCallbacks(this.mHighlightViewOnUiThreadRunnable);
            this.mViewToHighlight.set(view);
            this.mBoundsToHighlight.set(rect);
            this.mContentColor.set(i);
            this.mHandler.postDelayed(this.mHighlightViewOnUiThreadRunnable, 100);
        }

        public void clearHighlight() {
            setHighlightedViewImpl(null, null, 0);
        }

        public void setHighlightedView(View view, Rect rect, int i) {
            setHighlightedViewImpl((View) Util.throwIfNull(view), rect, i);
        }
    }

    protected ViewHighlighter() {
    }

    public static ViewHighlighter newInstance() {
        if (VERSION.SDK_INT >= 18) {
            return new OverlayHighlighter();
        }
        LogUtil.m24855w("Running on pre-JBMR2: View highlighting is not supported");
        return new NoopHighlighter();
    }

    public abstract void clearHighlight();

    public abstract void setHighlightedView(View view, Rect rect, int i);
}
