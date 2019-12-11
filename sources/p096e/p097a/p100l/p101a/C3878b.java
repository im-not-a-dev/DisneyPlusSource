package p096e.p097a.p100l.p101a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0492a;

/* renamed from: e.a.l.a.b */
/* compiled from: DrawableContainer */
class C3878b extends Drawable implements Callback {

    /* renamed from: U */
    private Rect f9555U;

    /* renamed from: V */
    private Drawable f9556V;

    /* renamed from: W */
    private Drawable f9557W;

    /* renamed from: X */
    private int f9558X = 255;

    /* renamed from: Y */
    private boolean f9559Y;

    /* renamed from: Z */
    private int f9560Z = -1;

    /* renamed from: a0 */
    private boolean f9561a0;

    /* renamed from: b0 */
    private Runnable f9562b0;

    /* renamed from: c */
    private C3881c f9563c;

    /* renamed from: c0 */
    private long f9564c0;

    /* renamed from: d0 */
    private long f9565d0;

    /* renamed from: e0 */
    private C3880b f9566e0;

    /* renamed from: e.a.l.a.b$a */
    /* compiled from: DrawableContainer */
    class C3879a implements Runnable {
        C3879a() {
        }

        public void run() {
            C3878b.this.mo13804a(true);
            C3878b.this.invalidateSelf();
        }
    }

    /* renamed from: e.a.l.a.b$b */
    /* compiled from: DrawableContainer */
    static class C3880b implements Callback {

        /* renamed from: c */
        private Callback f9568c;

        C3880b() {
        }

        /* renamed from: a */
        public C3880b mo13839a(Callback callback) {
            this.f9568c = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f9568c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f9568c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* renamed from: a */
        public Callback mo13838a() {
            Callback callback = this.f9568c;
            this.f9568c = null;
            return callback;
        }
    }

    /* renamed from: e.a.l.a.b$c */
    /* compiled from: DrawableContainer */
    static abstract class C3881c extends ConstantState {

        /* renamed from: A */
        int f9569A;

        /* renamed from: B */
        int f9570B;

        /* renamed from: C */
        boolean f9571C;

        /* renamed from: D */
        ColorFilter f9572D;

        /* renamed from: E */
        boolean f9573E;

        /* renamed from: F */
        ColorStateList f9574F;

        /* renamed from: G */
        Mode f9575G;

        /* renamed from: H */
        boolean f9576H;

        /* renamed from: I */
        boolean f9577I;

        /* renamed from: a */
        final C3878b f9578a;

        /* renamed from: b */
        Resources f9579b;

        /* renamed from: c */
        int f9580c = 160;

        /* renamed from: d */
        int f9581d;

        /* renamed from: e */
        int f9582e;

        /* renamed from: f */
        SparseArray<ConstantState> f9583f;

        /* renamed from: g */
        Drawable[] f9584g;

        /* renamed from: h */
        int f9585h;

        /* renamed from: i */
        boolean f9586i;

        /* renamed from: j */
        boolean f9587j;

        /* renamed from: k */
        Rect f9588k;

        /* renamed from: l */
        boolean f9589l;

        /* renamed from: m */
        boolean f9590m;

        /* renamed from: n */
        int f9591n;

        /* renamed from: o */
        int f9592o;

        /* renamed from: p */
        int f9593p;

        /* renamed from: q */
        int f9594q;

        /* renamed from: r */
        boolean f9595r;

        /* renamed from: s */
        int f9596s;

        /* renamed from: t */
        boolean f9597t;

        /* renamed from: u */
        boolean f9598u;

        /* renamed from: v */
        boolean f9599v;

        /* renamed from: w */
        boolean f9600w;

        /* renamed from: x */
        boolean f9601x;

        /* renamed from: y */
        boolean f9602y;

        /* renamed from: z */
        int f9603z;

        C3881c(C3881c cVar, C3878b bVar, Resources resources) {
            this.f9586i = false;
            this.f9589l = false;
            this.f9601x = true;
            this.f9569A = 0;
            this.f9570B = 0;
            this.f9578a = bVar;
            Resources resources2 = resources != null ? resources : cVar != null ? cVar.f9579b : null;
            this.f9579b = resources2;
            this.f9580c = C3878b.m12984a(resources, cVar != null ? cVar.f9580c : 0);
            if (cVar != null) {
                this.f9581d = cVar.f9581d;
                this.f9582e = cVar.f9582e;
                this.f9599v = true;
                this.f9600w = true;
                this.f9586i = cVar.f9586i;
                this.f9589l = cVar.f9589l;
                this.f9601x = cVar.f9601x;
                this.f9602y = cVar.f9602y;
                this.f9603z = cVar.f9603z;
                this.f9569A = cVar.f9569A;
                this.f9570B = cVar.f9570B;
                this.f9571C = cVar.f9571C;
                this.f9572D = cVar.f9572D;
                this.f9573E = cVar.f9573E;
                this.f9574F = cVar.f9574F;
                this.f9575G = cVar.f9575G;
                this.f9576H = cVar.f9576H;
                this.f9577I = cVar.f9577I;
                if (cVar.f9580c == this.f9580c) {
                    if (cVar.f9587j) {
                        this.f9588k = new Rect(cVar.f9588k);
                        this.f9587j = true;
                    }
                    if (cVar.f9590m) {
                        this.f9591n = cVar.f9591n;
                        this.f9592o = cVar.f9592o;
                        this.f9593p = cVar.f9593p;
                        this.f9594q = cVar.f9594q;
                        this.f9590m = true;
                    }
                }
                if (cVar.f9595r) {
                    this.f9596s = cVar.f9596s;
                    this.f9595r = true;
                }
                if (cVar.f9597t) {
                    this.f9598u = cVar.f9598u;
                    this.f9597t = true;
                }
                Drawable[] drawableArr = cVar.f9584g;
                this.f9584g = new Drawable[drawableArr.length];
                this.f9585h = cVar.f9585h;
                SparseArray<ConstantState> sparseArray = cVar.f9583f;
                if (sparseArray != null) {
                    this.f9583f = sparseArray.clone();
                } else {
                    this.f9583f = new SparseArray<>(this.f9585h);
                }
                int i = this.f9585h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f9583f.put(i2, constantState);
                        } else {
                            this.f9584g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f9584g = new Drawable[10];
            this.f9585h = 0;
        }

        /* renamed from: b */
        private Drawable m12995b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f9603z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9578a);
            return mutate;
        }

        /* renamed from: n */
        private void m12996n() {
            SparseArray<ConstantState> sparseArray = this.f9583f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f9584g[this.f9583f.keyAt(i)] = m12995b(((ConstantState) this.f9583f.valueAt(i)).newDrawable(this.f9579b));
                }
                this.f9583f = null;
            }
        }

        /* renamed from: a */
        public final int mo13843a(Drawable drawable) {
            int i = this.f9585h;
            if (i >= this.f9584g.length) {
                mo13845a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9578a);
            this.f9584g[i] = drawable;
            this.f9585h++;
            this.f9582e = drawable.getChangingConfigurations() | this.f9582e;
            mo13865k();
            this.f9588k = null;
            this.f9587j = false;
            this.f9590m = false;
            this.f9599v = false;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo13854c() {
            return this.f9584g.length;
        }

        public boolean canApplyTheme() {
            int i = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f9583f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo13857d() {
            return this.f9585h;
        }

        /* renamed from: e */
        public final int mo13858e() {
            if (!this.f9590m) {
                mo13850b();
            }
            return this.f9592o;
        }

        /* renamed from: f */
        public final int mo13859f() {
            if (!this.f9590m) {
                mo13850b();
            }
            return this.f9594q;
        }

        /* renamed from: g */
        public final int mo13860g() {
            if (!this.f9590m) {
                mo13850b();
            }
            return this.f9593p;
        }

        public int getChangingConfigurations() {
            return this.f9581d | this.f9582e;
        }

        /* renamed from: h */
        public final Rect mo13862h() {
            if (this.f9586i) {
                return null;
            }
            if (this.f9588k != null || this.f9587j) {
                return this.f9588k;
            }
            m12996n();
            Rect rect = new Rect();
            int i = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f9587j = true;
            this.f9588k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int mo13863i() {
            if (!this.f9590m) {
                mo13850b();
            }
            return this.f9591n;
        }

        /* renamed from: j */
        public final int mo13864j() {
            if (this.f9595r) {
                return this.f9596s;
            }
            m12996n();
            int i = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f9596s = opacity;
            this.f9595r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo13865k() {
            this.f9595r = false;
            this.f9597t = false;
        }

        /* renamed from: l */
        public final boolean mo13866l() {
            return this.f9589l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public abstract void mo13795m();

        /* renamed from: c */
        public final void mo13855c(int i) {
            this.f9570B = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo13853b(int i, int i2) {
            int i3 = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f9603z = i;
            return z;
        }

        /* renamed from: b */
        public final void mo13852b(boolean z) {
            this.f9586i = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo13850b() {
            this.f9590m = true;
            m12996n();
            int i = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            this.f9592o = -1;
            this.f9591n = -1;
            this.f9594q = 0;
            this.f9593p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9591n) {
                    this.f9591n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9592o) {
                    this.f9592o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9593p) {
                    this.f9593p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9594q) {
                    this.f9594q = minimumHeight;
                }
            }
        }

        /* renamed from: a */
        public final Drawable mo13844a(int i) {
            Drawable drawable = this.f9584g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f9583f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m12995b(((ConstantState) this.f9583f.valueAt(indexOfKey)).newDrawable(this.f9579b));
                    this.f9584g[i] = b;
                    this.f9583f.removeAt(indexOfKey);
                    if (this.f9583f.size() == 0) {
                        this.f9583f = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13847a(Resources resources) {
            if (resources != null) {
                this.f9579b = resources;
                int a = C3878b.m12984a(resources, this.f9580c);
                int i = this.f9580c;
                this.f9580c = a;
                if (i != a) {
                    this.f9590m = false;
                    this.f9587j = false;
                }
            }
        }

        /* renamed from: b */
        public final void mo13851b(int i) {
            this.f9569A = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13846a(Theme theme) {
            if (theme != null) {
                m12996n();
                int i = this.f9585h;
                Drawable[] drawableArr = this.f9584g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f9582e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo13847a(theme.getResources());
            }
        }

        /* renamed from: a */
        public final void mo13848a(boolean z) {
            this.f9589l = z;
        }

        /* renamed from: a */
        public void mo13845a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f9584g, 0, drawableArr, 0, i);
            this.f9584g = drawableArr;
        }

        /* renamed from: a */
        public synchronized boolean mo13849a() {
            if (this.f9599v) {
                return this.f9600w;
            }
            m12996n();
            this.f9599v = true;
            int i = this.f9585h;
            Drawable[] drawableArr = this.f9584g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f9600w = false;
                    return false;
                }
            }
            this.f9600w = true;
            return true;
        }
    }

    C3878b() {
    }

    /* renamed from: c */
    private boolean m12986c() {
        if (!isAutoMirrored() || C0492a.m2648e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3881c mo13778a() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13805a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9560Z
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.a.l.a.b$c r0 = r9.f9563c
            int r0 = r0.f9570B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f9557W
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f9556V
            if (r0 == 0) goto L_0x0029
            r9.f9557W = r0
            e.a.l.a.b$c r0 = r9.f9563c
            int r0 = r0.f9570B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9565d0 = r0
            goto L_0x0035
        L_0x0029:
            r9.f9557W = r4
            r9.f9565d0 = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f9556V
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.a.l.a.b$c r0 = r9.f9563c
            int r1 = r0.f9585h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo13844a(r10)
            r9.f9556V = r0
            r9.f9560Z = r10
            if (r0 == 0) goto L_0x005a
            e.a.l.a.b$c r10 = r9.f9563c
            int r10 = r10.f9569A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9564c0 = r2
        L_0x0051:
            r9.m12985a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f9556V = r4
            r10 = -1
            r9.f9560Z = r10
        L_0x005a:
            long r0 = r9.f9564c0
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f9565d0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f9562b0
            if (r0 != 0) goto L_0x0073
            e.a.l.a.b$a r0 = new e.a.l.a.b$a
            r0.<init>()
            r9.f9562b0 = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo13804a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p097a.p100l.p101a.C3878b.mo13805a(int):boolean");
    }

    public void applyTheme(Theme theme) {
        this.f9563c.mo13846a(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo13807b() {
        return this.f9560Z;
    }

    public boolean canApplyTheme() {
        return this.f9563c.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9556V;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9557W;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f9558X;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9563c.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f9563c.mo13849a()) {
            return null;
        }
        this.f9563c.f9581d = getChangingConfigurations();
        return this.f9563c;
    }

    public Drawable getCurrent() {
        return this.f9556V;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9555U;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f9563c.mo13866l()) {
            return this.f9563c.mo13858e();
        }
        Drawable drawable = this.f9556V;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f9563c.mo13866l()) {
            return this.f9563c.mo13863i();
        }
        Drawable drawable = this.f9556V;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f9563c.mo13866l()) {
            return this.f9563c.mo13859f();
        }
        Drawable drawable = this.f9556V;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f9563c.mo13866l()) {
            return this.f9563c.mo13860g();
        }
        Drawable drawable = this.f9556V;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f9556V;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9563c.mo13864j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f9556V;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f9563c.mo13862h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f9556V;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m12986c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C3881c cVar = this.f9563c;
        if (cVar != null) {
            cVar.mo13865k();
        }
        if (drawable == this.f9556V && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f9563c.f9571C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f9557W;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9557W = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9556V;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9559Y) {
                this.f9556V.setAlpha(this.f9558X);
            }
        }
        if (this.f9565d0 != 0) {
            this.f9565d0 = 0;
            z = true;
        }
        if (this.f9564c0 != 0) {
            this.f9564c0 = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f9561a0 && super.mutate() == this) {
            C3881c a = mo13778a();
            a.mo13795m();
            mo13780a(a);
            this.f9561a0 = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9557W;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9556V;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f9563c.mo13853b(i, mo13807b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9557W;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f9556V;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9557W;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9556V;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f9556V && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f9559Y || this.f9558X != i) {
            this.f9559Y = true;
            this.f9558X = i;
            Drawable drawable = this.f9556V;
            if (drawable == null) {
                return;
            }
            if (this.f9564c0 == 0) {
                drawable.setAlpha(i);
            } else {
                mo13804a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C3881c cVar = this.f9563c;
        if (cVar.f9571C != z) {
            cVar.f9571C = z;
            Drawable drawable = this.f9556V;
            if (drawable != null) {
                C0492a.m2641a(drawable, cVar.f9571C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C3881c cVar = this.f9563c;
        cVar.f9573E = true;
        if (cVar.f9572D != colorFilter) {
            cVar.f9572D = colorFilter;
            Drawable drawable = this.f9556V;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C3881c cVar = this.f9563c;
        if (cVar.f9601x != z) {
            cVar.f9601x = z;
            Drawable drawable = this.f9556V;
            if (drawable != null) {
                drawable.setDither(cVar.f9601x);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f9556V;
        if (drawable != null) {
            C0492a.m2635a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f9555U;
        if (rect == null) {
            this.f9555U = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f9556V;
        if (drawable != null) {
            C0492a.m2636a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C3881c cVar = this.f9563c;
        cVar.f9576H = true;
        if (cVar.f9574F != colorStateList) {
            cVar.f9574F = colorStateList;
            C0492a.m2637a(this.f9556V, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C3881c cVar = this.f9563c;
        cVar.f9577I = true;
        if (cVar.f9575G != mode) {
            cVar.f9575G = mode;
            C0492a.m2640a(this.f9556V, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f9557W;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f9556V;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f9556V && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private void m12985a(Drawable drawable) {
        if (this.f9566e0 == null) {
            this.f9566e0 = new C3880b();
        }
        C3880b bVar = this.f9566e0;
        bVar.mo13839a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f9563c.f9569A <= 0 && this.f9559Y) {
                drawable.setAlpha(this.f9558X);
            }
            if (this.f9563c.f9573E) {
                drawable.setColorFilter(this.f9563c.f9572D);
            } else {
                if (this.f9563c.f9576H) {
                    C0492a.m2637a(drawable, this.f9563c.f9574F);
                }
                if (this.f9563c.f9577I) {
                    C0492a.m2640a(drawable, this.f9563c.f9575G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9563c.f9601x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f9563c.f9571C);
            }
            Rect rect = this.f9555U;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f9566e0.mo13838a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13804a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9559Y = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9556V
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f9564c0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f9558X
            r3.setAlpha(r9)
            r13.f9564c0 = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.a.l.a.b$c r9 = r13.f9563c
            int r9 = r9.f9569A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9558X
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f9564c0 = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f9557W
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f9565d0
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f9557W = r0
            r13.f9565d0 = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.a.l.a.b$c r4 = r13.f9563c
            int r4 = r4.f9570B
            int r3 = r3 / r4
            int r4 = r13.f9558X
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f9565d0 = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f9562b0
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p097a.p100l.p101a.C3878b.mo13804a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13803a(Resources resources) {
        this.f9563c.mo13847a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13780a(C3881c cVar) {
        this.f9563c = cVar;
        int i = this.f9560Z;
        if (i >= 0) {
            this.f9556V = cVar.mo13844a(i);
            Drawable drawable = this.f9556V;
            if (drawable != null) {
                m12985a(drawable);
            }
        }
        this.f9557W = null;
    }

    /* renamed from: a */
    static int m12984a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
