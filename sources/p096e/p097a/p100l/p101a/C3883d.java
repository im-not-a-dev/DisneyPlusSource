package p096e.p097a.p100l.p101a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.d */
/* compiled from: StateListDrawable */
class C3883d extends C3878b {

    /* renamed from: f0 */
    private C3884a f9605f0;

    /* renamed from: g0 */
    private boolean f9606g0;

    /* renamed from: e.a.l.a.d$a */
    /* compiled from: StateListDrawable */
    static class C3884a extends C3881c {

        /* renamed from: J */
        int[][] f9607J;

        C3884a(C3884a aVar, C3883d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f9607J = aVar.f9607J;
            } else {
                this.f9607J = new int[mo13854c()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13898a(int[] iArr, Drawable drawable) {
            int a = mo13843a(drawable);
            this.f9607J[a] = iArr;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo13795m() {
            int[][] iArr = this.f9607J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f9607J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f9607J = iArr2;
        }

        public Drawable newDrawable() {
            return new C3883d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3883d(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo13897a(int[] iArr) {
            int[][] iArr2 = this.f9607J;
            int d = mo13857d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo13845a(int i, int i2) {
            super.mo13845a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f9607J, 0, iArr, 0, i);
            this.f9607J = iArr;
        }
    }

    C3883d(C3884a aVar, Resources resources) {
        mo13780a((C3881c) new C3884a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f9606g0) {
            super.mutate();
            if (this == this) {
                this.f9605f0.mo13795m();
                this.f9606g0 = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f9605f0.mo13897a(iArr);
        if (a < 0) {
            a = this.f9605f0.mo13897a(StateSet.WILD_CARD);
        }
        return mo13805a(a) || onStateChange;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo13896a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C3883d(C3884a aVar) {
        if (aVar != null) {
            mo13780a((C3881c) aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3884a m13023a() {
        return new C3884a(this.f9605f0, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13780a(C3881c cVar) {
        super.mo13780a(cVar);
        if (cVar instanceof C3884a) {
            this.f9605f0 = (C3884a) cVar;
        }
    }
}
