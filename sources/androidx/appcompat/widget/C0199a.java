package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p096e.p097a.C3858a;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0199a extends ViewGroup {

    /* renamed from: U */
    protected final Context f949U;

    /* renamed from: V */
    protected ActionMenuView f950V;

    /* renamed from: W */
    protected C0205c f951W;

    /* renamed from: a0 */
    protected int f952a0;

    /* renamed from: b0 */
    protected C4135d0 f953b0;

    /* renamed from: c */
    protected final C0200a f954c;

    /* renamed from: c0 */
    private boolean f955c0;

    /* renamed from: d0 */
    private boolean f956d0;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0200a implements C4140e0 {

        /* renamed from: a */
        private boolean f957a = false;

        /* renamed from: b */
        int f958b;

        protected C0200a() {
        }

        /* renamed from: a */
        public C0200a mo1482a(C4135d0 d0Var, int i) {
            C0199a.this.f953b0 = d0Var;
            this.f958b = i;
            return this;
        }

        /* renamed from: b */
        public void mo531b(View view) {
            if (!this.f957a) {
                C0199a aVar = C0199a.this;
                aVar.f953b0 = null;
                C0199a.super.setVisibility(this.f958b);
            }
        }

        /* renamed from: c */
        public void mo532c(View view) {
            C0199a.super.setVisibility(0);
            this.f957a = false;
        }

        /* renamed from: a */
        public void mo1483a(View view) {
            this.f957a = true;
        }
    }

    C0199a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static int m1138a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        if (this.f953b0 != null) {
            return this.f954c.f958b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f952a0;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C3867j.ActionBar, C3858a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C3867j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0205c cVar = this.f951W;
        if (cVar != null) {
            cVar.mo1519a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f956d0 = false;
        }
        if (!this.f956d0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f956d0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f956d0 = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f955c0 = false;
        }
        if (!this.f955c0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f955c0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f955c0 = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C4135d0 d0Var = this.f953b0;
            if (d0Var != null) {
                d0Var.mo14709a();
            }
            super.setVisibility(i);
        }
    }

    C0199a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C4135d0 mo1478a(int i, long j) {
        C4135d0 d0Var = this.f953b0;
        if (d0Var != null) {
            d0Var.mo14709a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C4135d0 a = C4187x.m14348a(this);
            a.mo14704a(1.0f);
            a.mo14705a(j);
            C0200a aVar = this.f954c;
            aVar.mo1482a(a, i);
            a.mo14707a((C4140e0) aVar);
            return a;
        }
        C4135d0 a2 = C4187x.m14348a(this);
        a2.mo14704a(0.0f);
        a2.mo14705a(j);
        C0200a aVar2 = this.f954c;
        aVar2.mo1482a(a2, i);
        a2.mo14707a((C4140e0) aVar2);
        return a2;
    }

    C0199a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f954c = new C0200a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C3858a.actionBarPopupTheme, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f949U = new ContextThemeWrapper(context, i2);
                return;
            }
        }
        this.f949U = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1476a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1477a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
