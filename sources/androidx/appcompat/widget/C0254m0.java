package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0076a.C0079c;
import androidx.appcompat.widget.C0224f0.C0225a;
import p096e.p097a.C3858a;
import p096e.p097a.p104o.C3888a;

/* renamed from: androidx.appcompat.widget.m0 */
/* compiled from: ScrollingTabContainerView */
public class C0254m0 extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: U */
    private C0257c f1141U;

    /* renamed from: V */
    C0224f0 f1142V;

    /* renamed from: W */
    private Spinner f1143W;

    /* renamed from: a0 */
    private boolean f1144a0;

    /* renamed from: b0 */
    int f1145b0;

    /* renamed from: c */
    Runnable f1146c;

    /* renamed from: c0 */
    int f1147c0;

    /* renamed from: d0 */
    private int f1148d0;

    /* renamed from: e0 */
    private int f1149e0;

    /* renamed from: androidx.appcompat.widget.m0$a */
    /* compiled from: ScrollingTabContainerView */
    class C0255a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f1151c;

        C0255a(View view) {
            this.f1151c = view;
        }

        public void run() {
            C0254m0.this.smoothScrollTo(this.f1151c.getLeft() - ((C0254m0.this.getWidth() - this.f1151c.getWidth()) / 2), 0);
            C0254m0.this.f1146c = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0256b extends BaseAdapter {
        C0256b() {
        }

        public int getCount() {
            return C0254m0.this.f1142V.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0258d) C0254m0.this.f1142V.getChildAt(i)).mo1792a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0254m0.this.mo1775a((C0079c) getItem(i), true);
            }
            ((C0258d) view).mo1793a((C0079c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0257c implements OnClickListener {
        C0257c() {
        }

        public void onClick(View view) {
            ((C0258d) view).mo1792a().mo411e();
            int childCount = C0254m0.this.f1142V.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0254m0.this.f1142V.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0258d extends LinearLayout {

        /* renamed from: U */
        private C0079c f1154U;

        /* renamed from: V */
        private TextView f1155V;

        /* renamed from: W */
        private ImageView f1156W;

        /* renamed from: a0 */
        private View f1157a0;

        /* renamed from: c */
        private final int[] f1159c = {16842964};

        public C0258d(Context context, C0079c cVar, boolean z) {
            super(context, null, C3858a.actionBarTabStyle);
            this.f1154U = cVar;
            C0284t0 a = C0284t0.m1486a(context, null, this.f1159c, C3858a.actionBarTabStyle, 0);
            if (a.mo1922g(0)) {
                setBackgroundDrawable(a.mo1912b(0));
            }
            a.mo1908a();
            if (z) {
                setGravity(8388627);
            }
            mo1794b();
        }

        /* renamed from: a */
        public void mo1793a(C0079c cVar) {
            this.f1154U = cVar;
            mo1794b();
        }

        /* renamed from: b */
        public void mo1794b() {
            C0079c cVar = this.f1154U;
            View b = cVar.mo408b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1157a0 = b;
                TextView textView = this.f1155V;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1156W;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1156W.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1157a0;
            if (view != null) {
                removeView(view);
                this.f1157a0 = null;
            }
            Drawable c = cVar.mo409c();
            CharSequence d = cVar.mo410d();
            if (c != null) {
                if (this.f1156W == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1156W = appCompatImageView;
                }
                this.f1156W.setImageDrawable(c);
                this.f1156W.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1156W;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1156W.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1155V == null) {
                    C0293w wVar = new C0293w(getContext(), null, C3858a.actionBarTabTextStyle);
                    wVar.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    wVar.setLayoutParams(layoutParams2);
                    addView(wVar);
                    this.f1155V = wVar;
                }
                this.f1155V.setText(d);
                this.f1155V.setVisibility(0);
            } else {
                TextView textView2 = this.f1155V;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1155V.setText(null);
                }
            }
            ImageView imageView3 = this.f1156W;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo407a());
            }
            if (!z) {
                charSequence = cVar.mo407a();
            }
            C0292v0.m1576a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0254m0.this.f1145b0 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0254m0.this.f1145b0;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: a */
        public C0079c mo1792a() {
            return this.f1154U;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1394a() {
        C0272t tVar = new C0272t(getContext(), null, C3858a.actionDropDownStyle);
        tVar.setLayoutParams(new C0225a(-2, -1));
        tVar.setOnItemSelectedListener(this);
        return tVar;
    }

    /* renamed from: b */
    private boolean m1395b() {
        Spinner spinner = this.f1143W;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1396c() {
        if (!m1395b()) {
            if (this.f1143W == null) {
                this.f1143W = m1394a();
            }
            removeView(this.f1142V);
            addView(this.f1143W, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1143W.getAdapter() == null) {
                this.f1143W.setAdapter(new C0256b());
            }
            Runnable runnable = this.f1146c;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1146c = null;
            }
            this.f1143W.setSelection(this.f1149e0);
        }
    }

    /* renamed from: d */
    private boolean m1397d() {
        if (!m1395b()) {
            return false;
        }
        removeView(this.f1143W);
        addView(this.f1142V, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1143W.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1146c;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3888a a = C3888a.m13030a(getContext());
        setContentHeight(a.mo13905e());
        this.f1147c0 = a.mo13904d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1146c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0258d) view).mo1792a().mo411e();
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1142V.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1145b0 = -1;
        } else {
            if (childCount > 2) {
                this.f1145b0 = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1145b0 = MeasureSpec.getSize(i) / 2;
            }
            this.f1145b0 = Math.min(this.f1145b0, this.f1147c0);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1148d0, 1073741824);
        if (z2 || !this.f1144a0) {
            z = false;
        }
        if (z) {
            this.f1142V.measure(0, makeMeasureSpec);
            if (this.f1142V.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1396c();
            } else {
                m1397d();
            }
        } else {
            m1397d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1149e0);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1144a0 = z;
    }

    public void setContentHeight(int i) {
        this.f1148d0 = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1149e0 = i;
        int childCount = this.f1142V.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1142V.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1776a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1143W;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: a */
    public void mo1776a(int i) {
        View childAt = this.f1142V.getChildAt(i);
        Runnable runnable = this.f1146c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f1146c = new C0255a(childAt);
        post(this.f1146c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0258d mo1775a(C0079c cVar, boolean z) {
        C0258d dVar = new C0258d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1148d0));
        } else {
            dVar.setFocusable(true);
            if (this.f1141U == null) {
                this.f1141U = new C0257c();
            }
            dVar.setOnClickListener(this.f1141U);
        }
        return dVar;
    }
}
