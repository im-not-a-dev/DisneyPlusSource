package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C0872i.C0884i;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0812d;
import androidx.recyclerview.widget.RecyclerView.C0813p;
import androidx.recyclerview.widget.RecyclerView.C0820v;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0827b;
import java.util.List;

public class LinearLayoutManager extends C0808o implements C0884i, C0827b {

    /* renamed from: A */
    int f3131A;

    /* renamed from: B */
    int f3132B;

    /* renamed from: C */
    private boolean f3133C;

    /* renamed from: D */
    C0785d f3134D;

    /* renamed from: E */
    final C0782a f3135E;

    /* renamed from: F */
    private final C0783b f3136F;

    /* renamed from: G */
    private int f3137G;

    /* renamed from: s */
    int f3138s;

    /* renamed from: t */
    private C0784c f3139t;

    /* renamed from: u */
    C0892p f3140u;

    /* renamed from: v */
    private boolean f3141v;

    /* renamed from: w */
    private boolean f3142w;

    /* renamed from: x */
    boolean f3143x;

    /* renamed from: y */
    private boolean f3144y;

    /* renamed from: z */
    private boolean f3145z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0782a {

        /* renamed from: a */
        C0892p f3146a;

        /* renamed from: b */
        int f3147b;

        /* renamed from: c */
        int f3148c;

        /* renamed from: d */
        boolean f3149d;

        /* renamed from: e */
        boolean f3150e;

        C0782a() {
            mo4351b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4348a() {
            int i;
            if (this.f3149d) {
                i = this.f3146a.mo5112b();
            } else {
                i = this.f3146a.mo5120f();
            }
            this.f3148c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4351b() {
            this.f3147b = -1;
            this.f3148c = Integer.MIN_VALUE;
            this.f3149d = false;
            this.f3150e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f3147b);
            sb.append(", mCoordinate=");
            sb.append(this.f3148c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f3149d);
            sb.append(", mValid=");
            sb.append(this.f3150e);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4350a(View view, C0788a0 a0Var) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            return !pVar.mo4774d() && pVar.mo4772b() >= 0 && pVar.mo4772b() < a0Var.mo4531b();
        }

        /* renamed from: b */
        public void mo4352b(View view, int i) {
            int h = this.f3146a.mo5123h();
            if (h >= 0) {
                mo4349a(view, i);
                return;
            }
            this.f3147b = i;
            if (this.f3149d) {
                int b = (this.f3146a.mo5112b() - h) - this.f3146a.mo5110a(view);
                this.f3148c = this.f3146a.mo5112b() - b;
                if (b > 0) {
                    int b2 = this.f3148c - this.f3146a.mo5113b(view);
                    int f = this.f3146a.mo5120f();
                    int min = b2 - (f + Math.min(this.f3146a.mo5117d(view) - f, 0));
                    if (min < 0) {
                        this.f3148c += Math.min(b, -min);
                    }
                }
            } else {
                int d = this.f3146a.mo5117d(view);
                int f2 = d - this.f3146a.mo5120f();
                this.f3148c = d;
                if (f2 > 0) {
                    int b3 = (this.f3146a.mo5112b() - Math.min(0, (this.f3146a.mo5112b() - h) - this.f3146a.mo5110a(view))) - (d + this.f3146a.mo5113b(view));
                    if (b3 < 0) {
                        this.f3148c -= Math.min(f2, -b3);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo4349a(View view, int i) {
            if (this.f3149d) {
                this.f3148c = this.f3146a.mo5110a(view) + this.f3146a.mo5123h();
            } else {
                this.f3148c = this.f3146a.mo5117d(view);
            }
            this.f3147b = i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0783b {

        /* renamed from: a */
        public int f3151a;

        /* renamed from: b */
        public boolean f3152b;

        /* renamed from: c */
        public boolean f3153c;

        /* renamed from: d */
        public boolean f3154d;

        protected C0783b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4354a() {
            this.f3151a = 0;
            this.f3152b = false;
            this.f3153c = false;
            this.f3154d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0784c {

        /* renamed from: a */
        boolean f3155a = true;

        /* renamed from: b */
        int f3156b;

        /* renamed from: c */
        int f3157c;

        /* renamed from: d */
        int f3158d;

        /* renamed from: e */
        int f3159e;

        /* renamed from: f */
        int f3160f;

        /* renamed from: g */
        int f3161g;

        /* renamed from: h */
        int f3162h = 0;

        /* renamed from: i */
        boolean f3163i;

        /* renamed from: j */
        int f3164j;

        /* renamed from: k */
        List<C0794d0> f3165k = null;

        /* renamed from: l */
        boolean f3166l;

        C0784c() {
        }

        /* renamed from: b */
        private View m4073b() {
            int size = this.f3165k.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0794d0) this.f3165k.get(i)).itemView;
                C0813p pVar = (C0813p) view.getLayoutParams();
                if (!pVar.mo4774d() && this.f3158d == pVar.mo4772b()) {
                    mo4357a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4358a(C0788a0 a0Var) {
            int i = this.f3158d;
            return i >= 0 && i < a0Var.mo4531b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo4355a(C0820v vVar) {
            if (this.f3165k != null) {
                return m4073b();
            }
            View d = vVar.mo4820d(this.f3158d);
            this.f3158d += this.f3159e;
            return d;
        }

        /* renamed from: a */
        public void mo4356a() {
            mo4357a((View) null);
        }

        /* renamed from: a */
        public void mo4357a(View view) {
            View b = mo4359b(view);
            if (b == null) {
                this.f3158d = -1;
            } else {
                this.f3158d = ((C0813p) b.getLayoutParams()).mo4772b();
            }
        }

        /* renamed from: b */
        public View mo4359b(View view) {
            int size = this.f3165k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0794d0) this.f3165k.get(i2)).itemView;
                C0813p pVar = (C0813p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo4774d()) {
                    int b = (pVar.mo4772b() - this.f3158d) * this.f3159e;
                    if (b >= 0 && b < i) {
                        view2 = view3;
                        if (b == 0) {
                            break;
                        }
                        i = b;
                    }
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0785d implements Parcelable {
        public static final Creator<C0785d> CREATOR = new C0786a();

        /* renamed from: U */
        int f3167U;

        /* renamed from: V */
        boolean f3168V;

        /* renamed from: c */
        int f3169c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0786a implements Creator<C0785d> {
            C0786a() {
            }

            public C0785d createFromParcel(Parcel parcel) {
                return new C0785d(parcel);
            }

            public C0785d[] newArray(int i) {
                return new C0785d[i];
            }
        }

        public C0785d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: X */
        public boolean mo4360X() {
            return this.f3169c >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Y */
        public void mo4361Y() {
            this.f3169c = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3169c);
            parcel.writeInt(this.f3167U);
            parcel.writeInt(this.f3168V ? 1 : 0);
        }

        C0785d(Parcel parcel) {
            this.f3169c = parcel.readInt();
            this.f3167U = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3168V = z;
        }

        public C0785d(C0785d dVar) {
            this.f3169c = dVar.f3169c;
            this.f3167U = dVar.f3167U;
            this.f3168V = dVar.f3168V;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: O */
    private View m3983O() {
        return mo4729d(this.f3143x ? 0 : mo4732e() - 1);
    }

    /* renamed from: P */
    private View m3984P() {
        return mo4729d(this.f3143x ? mo4732e() - 1 : 0);
    }

    /* renamed from: Q */
    private void m3985Q() {
        if (this.f3138s == 1 || !mo4323M()) {
            this.f3143x = this.f3142w;
        } else {
            this.f3143x = !this.f3142w;
        }
    }

    /* renamed from: j */
    private int m4008j(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        mo4317G();
        C0892p pVar = this.f3140u;
        View b = m3996b(!this.f3145z, true);
        return C0899s.m4998a(a0Var, pVar, b, m3987a(!this.f3145z, true), this, this.f3145z, this.f3143x);
    }

    /* renamed from: k */
    private int m4010k(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        mo4317G();
        C0892p pVar = this.f3140u;
        View b = m3996b(!this.f3145z, true);
        return C0899s.m4999b(a0Var, pVar, b, m3987a(!this.f3145z, true), this, this.f3145z);
    }

    /* renamed from: m */
    private View m4013m(C0820v vVar, C0788a0 a0Var) {
        if (this.f3143x) {
            return m4007i(vVar, a0Var);
        }
        return m4002g(vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo4315C() {
        return (mo4744i() == 1073741824 || mo4759s() == 1073741824 || !mo4760t()) ? false : true;
    }

    /* renamed from: E */
    public boolean mo3811E() {
        return this.f3134D == null && this.f3141v == this.f3144y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public C0784c mo4316F() {
        return new C0784c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo4317G() {
        if (this.f3139t == null) {
            this.f3139t = mo4316F();
        }
    }

    /* renamed from: H */
    public int mo4318H() {
        View a = mo4328a(0, mo4732e(), true, false);
        if (a == null) {
            return -1;
        }
        return mo4749l(a);
    }

    /* renamed from: I */
    public int mo4319I() {
        View a = mo4328a(0, mo4732e(), false, true);
        if (a == null) {
            return -1;
        }
        return mo4749l(a);
    }

    /* renamed from: J */
    public int mo4320J() {
        View a = mo4328a(mo4732e() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return mo4749l(a);
    }

    /* renamed from: K */
    public int mo4321K() {
        View a = mo4328a(mo4732e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo4749l(a);
    }

    /* renamed from: L */
    public int mo4322L() {
        return this.f3138s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo4323M() {
        return mo4746k() == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public boolean mo4324N() {
        return this.f3140u.mo5116d() == 0 && this.f3140u.mo5109a() == 0;
    }

    /* renamed from: a */
    public void mo4330a(AccessibilityEvent accessibilityEvent) {
        super.mo4330a(accessibilityEvent);
        if (mo4732e() > 0) {
            accessibilityEvent.setFromIndex(mo4319I());
            accessibilityEvent.setToIndex(mo4321K());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4300a(C0820v vVar, C0788a0 a0Var, C0782a aVar, int i) {
    }

    /* renamed from: b */
    public void mo4333b(RecyclerView recyclerView, C0820v vVar) {
        super.mo4333b(recyclerView, vVar);
        if (this.f3133C) {
            mo3876b(vVar);
            vVar.mo4800a();
        }
    }

    /* renamed from: c */
    public C0813p mo3884c() {
        return new C0813p(-2, -2);
    }

    /* renamed from: d */
    public int mo4338d(C0788a0 a0Var) {
        return m4006i(a0Var);
    }

    /* renamed from: e */
    public void mo3895e(C0820v vVar, C0788a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3134D == null && this.f3131A == -1) && a0Var.mo4531b() == 0) {
            mo3876b(vVar);
            return;
        }
        C0785d dVar = this.f3134D;
        if (dVar != null && dVar.mo4360X()) {
            this.f3131A = this.f3134D.f3169c;
        }
        mo4317G();
        this.f3139t.f3155a = false;
        m3985Q();
        View g = mo4739g();
        if (!this.f3135E.f3150e || this.f3131A != -1 || this.f3134D != null) {
            this.f3135E.mo4351b();
            C0782a aVar = this.f3135E;
            aVar.f3149d = this.f3143x ^ this.f3144y;
            m4000b(vVar, a0Var, aVar);
            this.f3135E.f3150e = true;
        } else if (g != null && (this.f3140u.mo5117d(g) >= this.f3140u.mo5112b() || this.f3140u.mo5110a(g) <= this.f3140u.mo5120f())) {
            this.f3135E.mo4352b(g, mo4749l(g));
        }
        int h = mo4343h(a0Var);
        if (this.f3139t.f3164j >= 0) {
            i = h;
            h = 0;
        } else {
            i = 0;
        }
        int f = h + this.f3140u.mo5120f();
        int c = i + this.f3140u.mo5114c();
        if (a0Var.mo4536g()) {
            int i10 = this.f3131A;
            if (!(i10 == -1 || this.f3132B == Integer.MIN_VALUE)) {
                View c2 = mo4337c(i10);
                if (c2 != null) {
                    if (this.f3143x) {
                        i7 = this.f3140u.mo5112b() - this.f3140u.mo5110a(c2);
                        i8 = this.f3132B;
                    } else {
                        i8 = this.f3140u.mo5117d(c2) - this.f3140u.mo5120f();
                        i7 = this.f3132B;
                    }
                    int i11 = i7 - i8;
                    if (i11 > 0) {
                        f += i11;
                    } else {
                        c -= i11;
                    }
                }
            }
        }
        if (!this.f3135E.f3149d ? !this.f3143x : this.f3143x) {
            i9 = 1;
        }
        mo4300a(vVar, a0Var, this.f3135E, i9);
        mo4699a(vVar);
        this.f3139t.f3166l = mo4324N();
        this.f3139t.f3163i = a0Var.mo4536g();
        C0782a aVar2 = this.f3135E;
        if (aVar2.f3149d) {
            m3997b(aVar2);
            C0784c cVar = this.f3139t;
            cVar.f3162h = f;
            mo4326a(vVar, cVar, a0Var, false);
            C0784c cVar2 = this.f3139t;
            i3 = cVar2.f3156b;
            int i12 = cVar2.f3158d;
            int i13 = cVar2.f3157c;
            if (i13 > 0) {
                c += i13;
            }
            m3989a(this.f3135E);
            C0784c cVar3 = this.f3139t;
            cVar3.f3162h = c;
            cVar3.f3158d += cVar3.f3159e;
            mo4326a(vVar, cVar3, a0Var, false);
            C0784c cVar4 = this.f3139t;
            i2 = cVar4.f3156b;
            int i14 = cVar4.f3157c;
            if (i14 > 0) {
                m4005h(i12, i3);
                C0784c cVar5 = this.f3139t;
                cVar5.f3162h = i14;
                mo4326a(vVar, cVar5, a0Var, false);
                i3 = this.f3139t.f3156b;
            }
        } else {
            m3989a(aVar2);
            C0784c cVar6 = this.f3139t;
            cVar6.f3162h = c;
            mo4326a(vVar, cVar6, a0Var, false);
            C0784c cVar7 = this.f3139t;
            i2 = cVar7.f3156b;
            int i15 = cVar7.f3158d;
            int i16 = cVar7.f3157c;
            if (i16 > 0) {
                f += i16;
            }
            m3997b(this.f3135E);
            C0784c cVar8 = this.f3139t;
            cVar8.f3162h = f;
            cVar8.f3158d += cVar8.f3159e;
            mo4326a(vVar, cVar8, a0Var, false);
            C0784c cVar9 = this.f3139t;
            i3 = cVar9.f3156b;
            int i17 = cVar9.f3157c;
            if (i17 > 0) {
                mo4305g(i15, i2);
                C0784c cVar10 = this.f3139t;
                cVar10.f3162h = i17;
                mo4326a(vVar, cVar10, a0Var, false);
                i2 = this.f3139t.f3156b;
            }
        }
        if (mo4732e() > 0) {
            if (this.f3143x ^ this.f3144y) {
                int a = m3986a(i2, vVar, a0Var, true);
                i5 = i3 + a;
                i4 = i2 + a;
                i6 = m3995b(i5, vVar, a0Var, false);
            } else {
                int b = m3995b(i3, vVar, a0Var, true);
                i5 = i3 + b;
                i4 = i2 + b;
                i6 = m3986a(i4, vVar, a0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        m3999b(vVar, a0Var, i3, i2);
        if (!a0Var.mo4536g()) {
            this.f3140u.mo5124i();
        } else {
            this.f3135E.mo4351b();
        }
        this.f3141v = this.f3144y;
    }

    /* renamed from: f */
    public void mo4342f(int i, int i2) {
        this.f3131A = i;
        this.f3132B = i2;
        C0785d dVar = this.f3134D;
        if (dVar != null) {
            dVar.mo4361Y();
        }
        mo4685A();
    }

    /* renamed from: g */
    public void mo3901g(C0788a0 a0Var) {
        super.mo3901g(a0Var);
        this.f3134D = null;
        this.f3131A = -1;
        this.f3132B = Integer.MIN_VALUE;
        this.f3135E.mo4351b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo4343h(C0788a0 a0Var) {
        if (a0Var.mo4535f()) {
            return this.f3140u.mo5122g();
        }
        return 0;
    }

    /* renamed from: i */
    public void mo3903i(int i) {
        this.f3131A = i;
        this.f3132B = Integer.MIN_VALUE;
        C0785d dVar = this.f3134D;
        if (dVar != null) {
            dVar.mo4361Y();
        }
        mo4685A();
    }

    /* renamed from: l */
    public void mo4346l(int i) {
        if (i == 0 || i == 1) {
            mo4331a((String) null);
            if (i != this.f3138s || this.f3140u == null) {
                this.f3140u = C0892p.m4933a(this, i);
                this.f3135E.f3146a = this.f3140u;
                this.f3138s = i;
                mo4685A();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: w */
    public boolean mo4347w() {
        return true;
    }

    /* renamed from: z */
    public Parcelable mo3930z() {
        C0785d dVar = this.f3134D;
        if (dVar != null) {
            return new C0785d(dVar);
        }
        C0785d dVar2 = new C0785d();
        if (mo4732e() > 0) {
            mo4317G();
            boolean z = this.f3141v ^ this.f3143x;
            dVar2.f3168V = z;
            if (z) {
                View O = m3983O();
                dVar2.f3167U = this.f3140u.mo5112b() - this.f3140u.mo5110a(O);
                dVar2.f3169c = mo4749l(O);
            } else {
                View P = m3984P();
                dVar2.f3169c = mo4749l(P);
                dVar2.f3167U = this.f3140u.mo5117d(P) - this.f3140u.mo5120f();
            }
        } else {
            dVar2.mo4361Y();
        }
        return dVar2;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3138s = 1;
        this.f3142w = false;
        this.f3143x = false;
        this.f3144y = false;
        this.f3145z = true;
        this.f3131A = -1;
        this.f3132B = Integer.MIN_VALUE;
        this.f3134D = null;
        this.f3135E = new C0782a();
        this.f3136F = new C0783b();
        this.f3137G = 2;
        mo4346l(i);
        mo4334b(z);
    }

    /* renamed from: c */
    public void mo4304c(boolean z) {
        mo4331a((String) null);
        if (this.f3144y != z) {
            this.f3144y = z;
            mo4685A();
        }
    }

    /* renamed from: h */
    private void m4005h(int i, int i2) {
        this.f3139t.f3157c = i2 - this.f3140u.mo5120f();
        C0784c cVar = this.f3139t;
        cVar.f3158d = i;
        cVar.f3159e = this.f3143x ? 1 : -1;
        C0784c cVar2 = this.f3139t;
        cVar2.f3160f = -1;
        cVar2.f3156b = i2;
        cVar2.f3161g = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public void mo3845a(Parcelable parcelable) {
        if (parcelable instanceof C0785d) {
            this.f3134D = (C0785d) parcelable;
            mo4685A();
        }
    }

    /* renamed from: b */
    public boolean mo3882b() {
        return this.f3138s == 1;
    }

    /* renamed from: g */
    private void mo4305g(int i, int i2) {
        this.f3139t.f3157c = this.f3140u.mo5112b() - i2;
        this.f3139t.f3159e = this.f3143x ? -1 : 1;
        C0784c cVar = this.f3139t;
        cVar.f3158d = i;
        cVar.f3160f = 1;
        cVar.f3156b = i2;
        cVar.f3161g = Integer.MIN_VALUE;
    }

    /* renamed from: i */
    private int m4006i(C0788a0 a0Var) {
        if (mo4732e() == 0) {
            return 0;
        }
        mo4317G();
        C0892p pVar = this.f3140u;
        View b = m3996b(!this.f3145z, true);
        return C0899s.m4997a(a0Var, pVar, b, m3987a(!this.f3145z, true), this, this.f3145z);
    }

    /* renamed from: b */
    public void mo4334b(boolean z) {
        mo4331a((String) null);
        if (z != this.f3142w) {
            this.f3142w = z;
            mo4685A();
        }
    }

    /* renamed from: c */
    public View mo4337c(int i) {
        int e = mo4732e();
        if (e == 0) {
            return null;
        }
        int l = i - mo4749l(mo4729d(0));
        if (l >= 0 && l < e) {
            View d = mo4729d(l);
            if (mo4749l(d) == i) {
                return d;
            }
        }
        return super.mo4337c(i);
    }

    /* renamed from: f */
    public int mo4341f(C0788a0 a0Var) {
        return m4010k(a0Var);
    }

    /* renamed from: f */
    private View m4001f(C0820v vVar, C0788a0 a0Var) {
        return mo4340e(0, mo4732e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo4344j(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f3138s != 1 && mo4323M()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3138s != 1 && mo4323M()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f3138s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f3138s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f3138s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f3138s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: k */
    public void mo4345k(int i) {
        this.f3137G = i;
    }

    /* renamed from: k */
    private View m4011k(C0820v vVar, C0788a0 a0Var) {
        if (this.f3143x) {
            return m4004h(vVar, a0Var);
        }
        return m4001f(vVar, a0Var);
    }

    /* renamed from: l */
    private View m4012l(C0820v vVar, C0788a0 a0Var) {
        if (this.f3143x) {
            return m4002g(vVar, a0Var);
        }
        return m4007i(vVar, a0Var);
    }

    /* renamed from: a */
    public boolean mo3862a() {
        return this.f3138s == 0;
    }

    /* renamed from: h */
    private View m4004h(C0820v vVar, C0788a0 a0Var) {
        return mo4340e(mo4732e() - 1, -1);
    }

    /* renamed from: a */
    public void mo3858a(RecyclerView recyclerView, C0788a0 a0Var, int i) {
        C0888m mVar = new C0888m(recyclerView.getContext());
        mVar.mo4846c(i);
        mo3877b((C0825z) mVar);
    }

    /* renamed from: b */
    private void m3999b(C0820v vVar, C0788a0 a0Var, int i, int i2) {
        C0820v vVar2 = vVar;
        C0788a0 a0Var2 = a0Var;
        if (a0Var.mo4537h() && mo4732e() != 0 && !a0Var.mo4536g() && mo3811E()) {
            List<C0794d0> f = vVar.mo4825f();
            int size = f.size();
            int l = mo4749l(mo4729d(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0794d0 d0Var = (C0794d0) f.get(i5);
                if (!d0Var.isRemoved()) {
                    char c = 1;
                    if ((d0Var.getLayoutPosition() < l) != this.f3143x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f3140u.mo5113b(d0Var.itemView);
                    } else {
                        i4 += this.f3140u.mo5113b(d0Var.itemView);
                    }
                }
            }
            this.f3139t.f3165k = f;
            if (i3 > 0) {
                m4005h(mo4749l(m3984P()), i);
                C0784c cVar = this.f3139t;
                cVar.f3162h = i3;
                cVar.f3157c = 0;
                cVar.mo4356a();
                mo4326a(vVar2, this.f3139t, a0Var2, false);
            }
            if (i4 > 0) {
                mo4305g(mo4749l(m3983O()), i2);
                C0784c cVar2 = this.f3139t;
                cVar2.f3162h = i4;
                cVar2.f3157c = 0;
                cVar2.mo4356a();
                mo4326a(vVar2, this.f3139t, a0Var2, false);
            }
            this.f3139t.f3165k = null;
        }
    }

    /* renamed from: c */
    public int mo4336c(C0788a0 a0Var) {
        return m4010k(a0Var);
    }

    /* renamed from: g */
    private View m4002g(C0820v vVar, C0788a0 a0Var) {
        return mo4296a(vVar, a0Var, 0, mo4732e(), a0Var.mo4531b());
    }

    /* renamed from: i */
    private View m4007i(C0820v vVar, C0788a0 a0Var) {
        return mo4296a(vVar, a0Var, mo4732e() - 1, -1, a0Var.mo4531b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4335c(int i, C0820v vVar, C0788a0 a0Var) {
        if (mo4732e() == 0 || i == 0) {
            return 0;
        }
        this.f3139t.f3155a = true;
        mo4317G();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3988a(i2, abs, true, a0Var);
        C0784c cVar = this.f3139t;
        int a = cVar.f3161g + mo4326a(vVar, cVar, a0Var, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f3140u.mo5111a(-i);
        this.f3139t.f3164j = i;
        return i;
    }

    /* renamed from: a */
    public PointF mo4327a(int i) {
        if (mo4732e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4749l(mo4729d(0))) {
            z = true;
        }
        if (z != this.f3143x) {
            i2 = -1;
        }
        if (this.f3138s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: j */
    private View m4009j(C0820v vVar, C0788a0 a0Var) {
        if (this.f3143x) {
            return m4001f(vVar, a0Var);
        }
        return m4004h(vVar, a0Var);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3138s = 1;
        this.f3142w = false;
        this.f3143x = false;
        this.f3144y = false;
        this.f3145z = true;
        this.f3131A = -1;
        this.f3132B = Integer.MIN_VALUE;
        this.f3134D = null;
        this.f3135E = new C0782a();
        this.f3136F = new C0783b();
        this.f3137G = 2;
        C0812d a = C0808o.m4305a(context, attributeSet, i, i2);
        mo4346l(a.f3312a);
        mo4334b(a.f3314c);
        mo4304c(a.f3315d);
    }

    /* renamed from: a */
    private boolean m3994a(C0820v vVar, C0788a0 a0Var, C0782a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo4732e() == 0) {
            return false;
        }
        View g = mo4739g();
        if (g != null && aVar.mo4350a(g, a0Var)) {
            aVar.mo4352b(g, mo4749l(g));
            return true;
        } else if (this.f3141v != this.f3144y) {
            return false;
        } else {
            if (aVar.f3149d) {
                view = m4012l(vVar, a0Var);
            } else {
                view = m4013m(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.mo4349a(view, mo4749l(view));
            if (!a0Var.mo4536g() && mo3811E()) {
                if (this.f3140u.mo5117d(view) >= this.f3140u.mo5112b() || this.f3140u.mo5110a(view) < this.f3140u.mo5120f()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f3149d) {
                        i = this.f3140u.mo5112b();
                    } else {
                        i = this.f3140u.mo5120f();
                    }
                    aVar.f3148c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private void m4000b(C0820v vVar, C0788a0 a0Var, C0782a aVar) {
        if (!m3993a(a0Var, aVar) && !m3994a(vVar, a0Var, aVar)) {
            aVar.mo4348a();
            aVar.f3147b = this.f3144y ? a0Var.mo4531b() - 1 : 0;
        }
    }

    /* renamed from: a */
    private boolean m3993a(C0788a0 a0Var, C0782a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo4536g()) {
            int i2 = this.f3131A;
            if (i2 != -1) {
                if (i2 < 0 || i2 >= a0Var.mo4531b()) {
                    this.f3131A = -1;
                    this.f3132B = Integer.MIN_VALUE;
                } else {
                    aVar.f3147b = this.f3131A;
                    C0785d dVar = this.f3134D;
                    if (dVar != null && dVar.mo4360X()) {
                        aVar.f3149d = this.f3134D.f3168V;
                        if (aVar.f3149d) {
                            aVar.f3148c = this.f3140u.mo5112b() - this.f3134D.f3167U;
                        } else {
                            aVar.f3148c = this.f3140u.mo5120f() + this.f3134D.f3167U;
                        }
                        return true;
                    } else if (this.f3132B == Integer.MIN_VALUE) {
                        View c = mo4337c(this.f3131A);
                        if (c == null) {
                            if (mo4732e() > 0) {
                                if ((this.f3131A < mo4749l(mo4729d(0))) == this.f3143x) {
                                    z = true;
                                }
                                aVar.f3149d = z;
                            }
                            aVar.mo4348a();
                        } else if (this.f3140u.mo5113b(c) > this.f3140u.mo5122g()) {
                            aVar.mo4348a();
                            return true;
                        } else if (this.f3140u.mo5117d(c) - this.f3140u.mo5120f() < 0) {
                            aVar.f3148c = this.f3140u.mo5120f();
                            aVar.f3149d = false;
                            return true;
                        } else if (this.f3140u.mo5112b() - this.f3140u.mo5110a(c) < 0) {
                            aVar.f3148c = this.f3140u.mo5112b();
                            aVar.f3149d = true;
                            return true;
                        } else {
                            if (aVar.f3149d) {
                                i = this.f3140u.mo5110a(c) + this.f3140u.mo5123h();
                            } else {
                                i = this.f3140u.mo5117d(c);
                            }
                            aVar.f3148c = i;
                        }
                        return true;
                    } else {
                        boolean z2 = this.f3143x;
                        aVar.f3149d = z2;
                        if (z2) {
                            aVar.f3148c = this.f3140u.mo5112b() - this.f3132B;
                        } else {
                            aVar.f3148c = this.f3140u.mo5120f() + this.f3132B;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m3995b(int i, C0820v vVar, C0788a0 a0Var, boolean z) {
        int f = i - this.f3140u.mo5120f();
        if (f <= 0) {
            return 0;
        }
        int i2 = -mo4335c(f, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int f2 = i3 - this.f3140u.mo5120f();
            if (f2 > 0) {
                this.f3140u.mo5111a(-f2);
                i2 -= f2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private void m3997b(C0782a aVar) {
        m4005h(aVar.f3147b, aVar.f3148c);
    }

    /* renamed from: b */
    public int mo3870b(int i, C0820v vVar, C0788a0 a0Var) {
        if (this.f3138s == 0) {
            return 0;
        }
        return mo4335c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo4332b(C0788a0 a0Var) {
        return m4008j(a0Var);
    }

    /* renamed from: b */
    private void m3998b(C0820v vVar, int i) {
        if (i >= 0) {
            int e = mo4732e();
            if (!this.f3143x) {
                int i2 = 0;
                while (true) {
                    if (i2 >= e) {
                        break;
                    }
                    View d = mo4729d(i2);
                    if (this.f3140u.mo5110a(d) > i || this.f3140u.mo5119e(d) > i) {
                        m3991a(vVar, 0, i2);
                    } else {
                        i2++;
                    }
                }
            } else {
                int i3 = e - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    View d2 = mo4729d(i4);
                    if (this.f3140u.mo5110a(d2) > i || this.f3140u.mo5119e(d2) > i) {
                        m3991a(vVar, i3, i4);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private View m3996b(boolean z, boolean z2) {
        if (this.f3143x) {
            return mo4328a(mo4732e() - 1, -1, z, z2);
        }
        return mo4328a(0, mo4732e(), z, z2);
    }

    /* renamed from: a */
    private int m3986a(int i, C0820v vVar, C0788a0 a0Var, boolean z) {
        int b = this.f3140u.mo5112b() - i;
        if (b <= 0) {
            return 0;
        }
        int i2 = -mo4335c(-b, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int b2 = this.f3140u.mo5112b() - i3;
            if (b2 > 0) {
                this.f3140u.mo5111a(b2);
                return b2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private void m3989a(C0782a aVar) {
        mo4305g(aVar.f3147b, aVar.f3148c);
    }

    /* renamed from: a */
    public int mo3833a(int i, C0820v vVar, C0788a0 a0Var) {
        if (this.f3138s == 1) {
            return 0;
        }
        return mo4335c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo4325a(C0788a0 a0Var) {
        return m4006i(a0Var);
    }

    /* renamed from: a */
    private void m3988a(int i, int i2, boolean z, C0788a0 a0Var) {
        int i3;
        this.f3139t.f3166l = mo4324N();
        this.f3139t.f3162h = mo4343h(a0Var);
        C0784c cVar = this.f3139t;
        cVar.f3160f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f3162h += this.f3140u.mo5114c();
            View O = m3983O();
            C0784c cVar2 = this.f3139t;
            if (!this.f3143x) {
                i4 = 1;
            }
            cVar2.f3159e = i4;
            C0784c cVar3 = this.f3139t;
            int l = mo4749l(O);
            C0784c cVar4 = this.f3139t;
            cVar3.f3158d = l + cVar4.f3159e;
            cVar4.f3156b = this.f3140u.mo5110a(O);
            i3 = this.f3140u.mo5110a(O) - this.f3140u.mo5112b();
        } else {
            View P = m3984P();
            this.f3139t.f3162h += this.f3140u.mo5120f();
            C0784c cVar5 = this.f3139t;
            if (this.f3143x) {
                i4 = 1;
            }
            cVar5.f3159e = i4;
            C0784c cVar6 = this.f3139t;
            int l2 = mo4749l(P);
            C0784c cVar7 = this.f3139t;
            cVar6.f3158d = l2 + cVar7.f3159e;
            cVar7.f3156b = this.f3140u.mo5117d(P);
            i3 = (-this.f3140u.mo5117d(P)) + this.f3140u.mo5120f();
        }
        C0784c cVar8 = this.f3139t;
        cVar8.f3157c = i2;
        if (z) {
            cVar8.f3157c -= i3;
        }
        this.f3139t.f3161g = i3;
    }

    /* renamed from: e */
    public int mo4339e(C0788a0 a0Var) {
        return m4008j(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo4340e(int i, int i2) {
        int i3;
        int i4;
        View view;
        mo4317G();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo4729d(i);
        }
        if (this.f3140u.mo5117d(mo4729d(i)) < this.f3140u.mo5120f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f3138s == 0) {
            view = this.f3296e.mo5151a(i, i2, i4, i3);
        } else {
            view = this.f3297f.mo5151a(i, i2, i4, i3);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4299a(C0788a0 a0Var, C0784c cVar, C0811c cVar2) {
        int i = cVar.f3158d;
        if (i >= 0 && i < a0Var.mo4531b()) {
            cVar2.mo4770a(i, Math.max(0, cVar.f3161g));
        }
    }

    /* renamed from: a */
    public void mo3844a(int i, C0811c cVar) {
        boolean z;
        int i2;
        C0785d dVar = this.f3134D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4360X()) {
            m3985Q();
            z = this.f3143x;
            i2 = this.f3131A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0785d dVar2 = this.f3134D;
            z = dVar2.f3168V;
            i2 = dVar2.f3169c;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.f3137G && i4 >= 0 && i4 < i; i5++) {
            cVar.mo4770a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo3841a(int i, int i2, C0788a0 a0Var, C0811c cVar) {
        if (this.f3138s != 0) {
            i = i2;
        }
        if (mo4732e() != 0 && i != 0) {
            mo4317G();
            m3988a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo4299a(a0Var, this.f3139t, cVar);
        }
    }

    /* renamed from: a */
    public void mo4331a(String str) {
        if (this.f3134D == null) {
            super.mo4331a(str);
        }
    }

    /* renamed from: a */
    private void m3991a(C0820v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4689a(i3, vVar);
                }
            } else {
                while (i > i2) {
                    mo4689a(i, vVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3990a(C0820v vVar, int i) {
        int e = mo4732e();
        if (i >= 0) {
            int a = this.f3140u.mo5109a() - i;
            if (this.f3143x) {
                for (int i2 = 0; i2 < e; i2++) {
                    View d = mo4729d(i2);
                    if (this.f3140u.mo5117d(d) < a || this.f3140u.mo5121f(d) < a) {
                        m3991a(vVar, 0, i2);
                        return;
                    }
                }
            } else {
                int i3 = e - 1;
                int i4 = i3;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    View d2 = mo4729d(i4);
                    if (this.f3140u.mo5117d(d2) < a || this.f3140u.mo5121f(d2) < a) {
                        m3991a(vVar, i3, i4);
                    } else {
                        i4--;
                    }
                }
                m3991a(vVar, i3, i4);
            }
        }
    }

    /* renamed from: a */
    private void m3992a(C0820v vVar, C0784c cVar) {
        if (cVar.f3155a && !cVar.f3166l) {
            if (cVar.f3160f == -1) {
                m3990a(vVar, cVar.f3161g);
            } else {
                m3998b(vVar, cVar.f3161g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4326a(C0820v vVar, C0784c cVar, C0788a0 a0Var, boolean z) {
        int i = cVar.f3157c;
        int i2 = cVar.f3161g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3161g = i2 + i;
            }
            m3992a(vVar, cVar);
        }
        int i3 = cVar.f3157c + cVar.f3162h;
        C0783b bVar = this.f3136F;
        while (true) {
            if ((!cVar.f3166l && i3 <= 0) || !cVar.mo4358a(a0Var)) {
                break;
            }
            bVar.mo4354a();
            mo4301a(vVar, a0Var, cVar, bVar);
            if (!bVar.f3152b) {
                cVar.f3156b += bVar.f3151a * cVar.f3160f;
                if (!bVar.f3153c || this.f3139t.f3165k != null || !a0Var.mo4536g()) {
                    int i4 = cVar.f3157c;
                    int i5 = bVar.f3151a;
                    cVar.f3157c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3161g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f3161g = i6 + bVar.f3151a;
                    int i7 = cVar.f3157c;
                    if (i7 < 0) {
                        cVar.f3161g += i7;
                    }
                    m3992a(vVar, cVar);
                }
                if (z && bVar.f3154d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3157c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4301a(C0820v vVar, C0788a0 a0Var, C0784c cVar, C0783b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo4355a(vVar);
        if (a == null) {
            bVar.f3152b = true;
            return;
        }
        C0813p pVar = (C0813p) a.getLayoutParams();
        if (cVar.f3165k == null) {
            if (this.f3143x == (cVar.f3160f == -1)) {
                mo4716b(a);
            } else {
                mo4717b(a, 0);
            }
        } else {
            if (this.f3143x == (cVar.f3160f == -1)) {
                mo4690a(a);
            } else {
                mo4691a(a, 0);
            }
        }
        mo4692a(a, 0, 0);
        bVar.f3151a = this.f3140u.mo5113b(a);
        if (this.f3138s == 1) {
            if (mo4323M()) {
                i5 = mo4758r() - mo4756p();
                i4 = i5 - this.f3140u.mo5115c(a);
            } else {
                i4 = mo4754o();
                i5 = this.f3140u.mo5115c(a) + i4;
            }
            if (cVar.f3160f == -1) {
                int i6 = cVar.f3156b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f3151a;
            } else {
                int i7 = cVar.f3156b;
                i3 = i7;
                i2 = i5;
                i = bVar.f3151a + i7;
            }
        } else {
            int q = mo4757q();
            int c = this.f3140u.mo5115c(a) + q;
            if (cVar.f3160f == -1) {
                int i8 = cVar.f3156b;
                i2 = i8;
                i3 = q;
                i = c;
                i4 = i8 - bVar.f3151a;
            } else {
                int i9 = cVar.f3156b;
                i3 = q;
                i2 = bVar.f3151a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo4693a(a, i4, i3, i2, i);
        if (pVar.mo4774d() || pVar.mo4773c()) {
            bVar.f3153c = true;
        }
        bVar.f3154d = a.hasFocusable();
    }

    /* renamed from: a */
    private View m3987a(boolean z, boolean z2) {
        if (this.f3143x) {
            return mo4328a(0, mo4732e(), z, z2);
        }
        return mo4328a(mo4732e() - 1, -1, z, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4296a(C0820v vVar, C0788a0 a0Var, int i, int i2, int i3) {
        mo4317G();
        int f = this.f3140u.mo5120f();
        int b = this.f3140u.mo5112b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo4729d(i);
            int l = mo4749l(d);
            if (l >= 0 && l < i3) {
                if (((C0813p) d.getLayoutParams()).mo4774d()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f3140u.mo5117d(d) < b && this.f3140u.mo5110a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4328a(int i, int i2, boolean z, boolean z2) {
        mo4317G();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f3138s == 0) {
            return this.f3296e.mo5151a(i, i2, i4, i3);
        }
        return this.f3297f.mo5151a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo4295a(View view, int i, C0820v vVar, C0788a0 a0Var) {
        View view2;
        View view3;
        m3985Q();
        if (mo4732e() == 0) {
            return null;
        }
        int j = mo4344j(i);
        if (j == Integer.MIN_VALUE) {
            return null;
        }
        mo4317G();
        mo4317G();
        m3988a(j, (int) (((float) this.f3140u.mo5122g()) * 0.33333334f), false, a0Var);
        C0784c cVar = this.f3139t;
        cVar.f3161g = Integer.MIN_VALUE;
        cVar.f3155a = false;
        mo4326a(vVar, cVar, a0Var, true);
        if (j == -1) {
            view2 = m4011k(vVar, a0Var);
        } else {
            view2 = m4009j(vVar, a0Var);
        }
        if (j == -1) {
            view3 = m3984P();
        } else {
            view3 = m3983O();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: a */
    public void mo4329a(View view, View view2, int i, int i2) {
        mo4331a("Cannot drop a view during a scroll or layout calculation");
        mo4317G();
        m3985Q();
        int l = mo4749l(view);
        int l2 = mo4749l(view2);
        char c = l < l2 ? (char) 1 : 65535;
        if (this.f3143x) {
            if (c == 1) {
                mo4342f(l2, this.f3140u.mo5112b() - (this.f3140u.mo5117d(view2) + this.f3140u.mo5113b(view)));
            } else {
                mo4342f(l2, this.f3140u.mo5112b() - this.f3140u.mo5110a(view2));
            }
        } else if (c == 65535) {
            mo4342f(l2, this.f3140u.mo5117d(view2));
        } else {
            mo4342f(l2, this.f3140u.mo5110a(view2) - this.f3140u.mo5113b(view));
        }
    }
}
