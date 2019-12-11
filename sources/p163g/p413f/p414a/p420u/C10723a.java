package p163g.p413f.p414a.p420u;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bumptech.glide.load.C8106b;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8112h;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.C8227j;
import com.bumptech.glide.load.p341p.p342c.C8356g;
import com.bumptech.glide.load.p341p.p342c.C8357h;
import com.bumptech.glide.load.p341p.p342c.C8363j;
import com.bumptech.glide.load.p341p.p342c.C8371k;
import com.bumptech.glide.load.p341p.p342c.C8376m;
import com.bumptech.glide.load.p341p.p342c.C8378o;
import com.bumptech.glide.load.p341p.p346g.C8412c;
import com.bumptech.glide.load.p341p.p346g.C8416f;
import com.bumptech.glide.load.p341p.p346g.C8423i;
import java.util.Map;
import net.danlew.android.joda.DateUtils;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p423v.C10759a;
import p163g.p413f.p414a.p424w.C10764b;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.u.a */
/* compiled from: BaseRequestOptions */
public abstract class C10723a<T extends C10723a<T>> implements Cloneable {

    /* renamed from: U */
    private float f25345U = 1.0f;

    /* renamed from: V */
    private C8227j f25346V = C8227j.f17610d;

    /* renamed from: W */
    private C10657j f25347W = C10657j.NORMAL;

    /* renamed from: X */
    private Drawable f25348X;

    /* renamed from: Y */
    private int f25349Y;

    /* renamed from: Z */
    private Drawable f25350Z;

    /* renamed from: a0 */
    private int f25351a0;

    /* renamed from: b0 */
    private boolean f25352b0 = true;

    /* renamed from: c */
    private int f25353c;

    /* renamed from: c0 */
    private int f25354c0 = -1;

    /* renamed from: d0 */
    private int f25355d0 = -1;

    /* renamed from: e0 */
    private C8111g f25356e0 = C10759a.m33979a();

    /* renamed from: f0 */
    private boolean f25357f0;

    /* renamed from: g0 */
    private boolean f25358g0 = true;

    /* renamed from: h0 */
    private Drawable f25359h0;

    /* renamed from: i0 */
    private int f25360i0;

    /* renamed from: j0 */
    private C8115i f25361j0 = new C8115i();

    /* renamed from: k0 */
    private Map<Class<?>, C8118l<?>> f25362k0 = new C10764b();

    /* renamed from: l0 */
    private Class<?> f25363l0 = Object.class;

    /* renamed from: m0 */
    private boolean f25364m0;

    /* renamed from: n0 */
    private Theme f25365n0;

    /* renamed from: o0 */
    private boolean f25366o0;

    /* renamed from: p0 */
    private boolean f25367p0;

    /* renamed from: q0 */
    private boolean f25368q0;

    /* renamed from: r0 */
    private boolean f25369r0 = true;

    /* renamed from: s0 */
    private boolean f25370s0;

    /* renamed from: F */
    private T mo27561F() {
        return this;
    }

    /* renamed from: G */
    private T m33725G() {
        if (!this.f25364m0) {
            mo27561F();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: b */
    private static boolean mo27565b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final boolean mo27686A() {
        return C10775k.m34033b(this.f25355d0, this.f25354c0);
    }

    /* renamed from: B */
    public T mo19915B() {
        this.f25364m0 = true;
        mo27561F();
        return this;
    }

    /* renamed from: C */
    public T mo19916C() {
        return mo27688a(C8363j.f17845b, (C8118l<Bitmap>) new C8356g<Bitmap>());
    }

    /* renamed from: D */
    public T mo19917D() {
        return m33728c(C8363j.f17846c, new C8357h());
    }

    /* renamed from: E */
    public T mo19918E() {
        return m33728c(C8363j.f17844a, new C8378o());
    }

    /* renamed from: a */
    public T mo19920a(float f) {
        if (this.f25366o0) {
            return clone().mo19920a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f25345U = f;
        this.f25353c |= 2;
        m33725G();
        return this;
    }

    /* renamed from: b */
    public T mo19936b(boolean z) {
        if (this.f25366o0) {
            return clone().mo19936b(z);
        }
        this.f25370s0 = z;
        this.f25353c |= 1048576;
        m33725G();
        return this;
    }

    /* renamed from: c */
    public T mo19937c(int i) {
        if (this.f25366o0) {
            return clone().mo19937c(i);
        }
        this.f25351a0 = i;
        this.f25353c |= 128;
        this.f25350Z = null;
        this.f25353c &= -65;
        m33725G();
        return this;
    }

    /* renamed from: d */
    public final Drawable mo27693d() {
        return this.f25348X;
    }

    /* renamed from: e */
    public final Drawable mo27694e() {
        return this.f25359h0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10723a)) {
            return false;
        }
        C10723a aVar = (C10723a) obj;
        if (Float.compare(aVar.f25345U, this.f25345U) == 0 && this.f25349Y == aVar.f25349Y && C10775k.m34034b((Object) this.f25348X, (Object) aVar.f25348X) && this.f25351a0 == aVar.f25351a0 && C10775k.m34034b((Object) this.f25350Z, (Object) aVar.f25350Z) && this.f25360i0 == aVar.f25360i0 && C10775k.m34034b((Object) this.f25359h0, (Object) aVar.f25359h0) && this.f25352b0 == aVar.f25352b0 && this.f25354c0 == aVar.f25354c0 && this.f25355d0 == aVar.f25355d0 && this.f25357f0 == aVar.f25357f0 && this.f25358g0 == aVar.f25358g0 && this.f25367p0 == aVar.f25367p0 && this.f25368q0 == aVar.f25368q0 && this.f25346V.equals(aVar.f25346V) && this.f25347W == aVar.f25347W && this.f25361j0.equals(aVar.f25361j0) && this.f25362k0.equals(aVar.f25362k0) && this.f25363l0.equals(aVar.f25363l0) && C10775k.m34034b((Object) this.f25356e0, (Object) aVar.f25356e0) && C10775k.m34034b((Object) this.f25365n0, (Object) aVar.f25365n0)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo27696f() {
        return this.f25360i0;
    }

    /* renamed from: g */
    public final boolean mo27697g() {
        return this.f25368q0;
    }

    /* renamed from: h */
    public final C8115i mo27698h() {
        return this.f25361j0;
    }

    public int hashCode() {
        return C10775k.m34023a((Object) this.f25365n0, C10775k.m34023a((Object) this.f25356e0, C10775k.m34023a((Object) this.f25363l0, C10775k.m34023a((Object) this.f25362k0, C10775k.m34023a((Object) this.f25361j0, C10775k.m34023a((Object) this.f25347W, C10775k.m34023a((Object) this.f25346V, C10775k.m34024a(this.f25368q0, C10775k.m34024a(this.f25367p0, C10775k.m34024a(this.f25358g0, C10775k.m34024a(this.f25357f0, C10775k.m34019a(this.f25355d0, C10775k.m34019a(this.f25354c0, C10775k.m34024a(this.f25352b0, C10775k.m34023a((Object) this.f25359h0, C10775k.m34019a(this.f25360i0, C10775k.m34023a((Object) this.f25350Z, C10775k.m34019a(this.f25351a0, C10775k.m34023a((Object) this.f25348X, C10775k.m34019a(this.f25349Y, C10775k.m34017a(this.f25345U)))))))))))))))))))));
    }

    /* renamed from: i */
    public final int mo27700i() {
        return this.f25354c0;
    }

    /* renamed from: j */
    public final int mo27701j() {
        return this.f25355d0;
    }

    /* renamed from: k */
    public final Drawable mo27702k() {
        return this.f25350Z;
    }

    /* renamed from: l */
    public final int mo27703l() {
        return this.f25351a0;
    }

    /* renamed from: m */
    public final C10657j mo27704m() {
        return this.f25347W;
    }

    /* renamed from: n */
    public final Class<?> mo27705n() {
        return this.f25363l0;
    }

    /* renamed from: o */
    public final C8111g mo27706o() {
        return this.f25356e0;
    }

    /* renamed from: p */
    public final float mo27707p() {
        return this.f25345U;
    }

    /* renamed from: q */
    public final Theme mo27708q() {
        return this.f25365n0;
    }

    /* renamed from: r */
    public final Map<Class<?>, C8118l<?>> mo27709r() {
        return this.f25362k0;
    }

    /* renamed from: s */
    public final boolean mo27710s() {
        return this.f25370s0;
    }

    /* renamed from: t */
    public final boolean mo27711t() {
        return this.f25367p0;
    }

    /* renamed from: u */
    public final boolean mo27712u() {
        return this.f25352b0;
    }

    /* renamed from: v */
    public final boolean mo27713v() {
        return m33729d(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public boolean mo27714w() {
        return this.f25369r0;
    }

    /* renamed from: x */
    public final boolean mo27715x() {
        return this.f25358g0;
    }

    /* renamed from: y */
    public final boolean mo27716y() {
        return this.f25357f0;
    }

    /* renamed from: z */
    public final boolean mo27717z() {
        return m33729d(DateUtils.FORMAT_NO_MIDNIGHT);
    }

    /* renamed from: d */
    private boolean m33729d(int i) {
        return mo27565b(this.f25353c, i);
    }

    public T clone() {
        try {
            T t = (C10723a) super.clone();
            t.f25361j0 = new C8115i();
            t.f25361j0.mo21163a(this.f25361j0);
            t.f25362k0 = new C10764b();
            t.f25362k0.putAll(this.f25362k0);
            t.f25364m0 = false;
            t.f25366o0 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public T mo19935b(Drawable drawable) {
        if (this.f25366o0) {
            return clone().mo19935b(drawable);
        }
        this.f25350Z = drawable;
        this.f25353c |= 64;
        this.f25351a0 = 0;
        this.f25353c &= -129;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19928a(C8227j jVar) {
        if (this.f25366o0) {
            return clone().mo19928a(jVar);
        }
        C10774j.m34012a(jVar);
        this.f25346V = jVar;
        this.f25353c |= 4;
        m33725G();
        return this;
    }

    /* renamed from: c */
    private T m33728c(C8363j jVar, C8118l<Bitmap> lVar) {
        return m33726a(jVar, lVar, false);
    }

    /* renamed from: c */
    public final int mo27692c() {
        return this.f25349Y;
    }

    /* renamed from: a */
    public T mo19930a(C10657j jVar) {
        if (this.f25366o0) {
            return clone().mo19930a(jVar);
        }
        C10774j.m34012a(jVar);
        this.f25347W = jVar;
        this.f25353c |= 8;
        m33725G();
        return this;
    }

    /* renamed from: b */
    public T mo19934b(int i) {
        return mo19922a(i, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final T mo27691b(C8363j jVar, C8118l<Bitmap> lVar) {
        if (this.f25366o0) {
            return clone().mo27691b(jVar, lVar);
        }
        mo19929a(jVar);
        return mo19927a(lVar);
    }

    /* renamed from: a */
    public T mo19923a(Drawable drawable) {
        if (this.f25366o0) {
            return clone().mo19923a(drawable);
        }
        this.f25348X = drawable;
        this.f25353c |= 16;
        this.f25349Y = 0;
        this.f25353c &= -33;
        m33725G();
        return this;
    }

    /* renamed from: b */
    public final C8227j mo27690b() {
        return this.f25346V;
    }

    /* renamed from: a */
    public T mo19921a(int i) {
        if (this.f25366o0) {
            return clone().mo19921a(i);
        }
        this.f25349Y = i;
        this.f25353c |= 32;
        this.f25348X = null;
        this.f25353c &= -17;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19933a(boolean z) {
        if (this.f25366o0) {
            return clone().mo19933a(true);
        }
        this.f25352b0 = !z;
        this.f25353c |= 256;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19922a(int i, int i2) {
        if (this.f25366o0) {
            return clone().mo19922a(i, i2);
        }
        this.f25355d0 = i;
        this.f25354c0 = i2;
        this.f25353c |= DateUtils.FORMAT_NO_NOON;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19925a(C8111g gVar) {
        if (this.f25366o0) {
            return clone().mo19925a(gVar);
        }
        C10774j.m34012a(gVar);
        this.f25356e0 = gVar;
        this.f25353c |= 1024;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public <Y> T mo19926a(C8112h<Y> hVar, Y y) {
        if (this.f25366o0) {
            return clone().mo19926a(hVar, y);
        }
        C10774j.m34012a(hVar);
        C10774j.m34012a(y);
        this.f25361j0.mo21161a(hVar, y);
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19932a(Class<?> cls) {
        if (this.f25366o0) {
            return clone().mo19932a(cls);
        }
        C10774j.m34012a(cls);
        this.f25363l0 = cls;
        this.f25353c |= 4096;
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19924a(C8106b bVar) {
        C10774j.m34012a(bVar);
        return mo19926a(C8371k.f17853f, (Y) bVar).mo19926a(C8423i.f17949a, (Y) bVar);
    }

    /* renamed from: a */
    public T mo19929a(C8363j jVar) {
        C8112h<C8363j> hVar = C8363j.f17849f;
        C10774j.m34012a(jVar);
        return mo19926a(hVar, (Y) jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo27688a(C8363j jVar, C8118l<Bitmap> lVar) {
        if (this.f25366o0) {
            return clone().mo27688a(jVar, lVar);
        }
        mo19929a(jVar);
        return mo27687a(lVar, false);
    }

    /* renamed from: a */
    private T m33726a(C8363j jVar, C8118l<Bitmap> lVar, boolean z) {
        T b = z ? mo27691b(jVar, lVar) : mo27688a(jVar, lVar);
        b.f25369r0 = true;
        return b;
    }

    /* renamed from: a */
    public T mo19927a(C8118l<Bitmap> lVar) {
        return mo27687a(lVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo27687a(C8118l<Bitmap> lVar, boolean z) {
        if (this.f25366o0) {
            return clone().mo27687a(lVar, z);
        }
        C8376m mVar = new C8376m(lVar, z);
        mo27689a(Bitmap.class, lVar, z);
        mo27689a(Drawable.class, (C8118l<Y>) mVar, z);
        mVar.mo21544a();
        mo27689a(BitmapDrawable.class, (C8118l<Y>) mVar, z);
        mo27689a(C8412c.class, (C8118l<Y>) new C8416f<Y>(lVar), z);
        m33725G();
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y> T mo27689a(Class<Y> cls, C8118l<Y> lVar, boolean z) {
        if (this.f25366o0) {
            return clone().mo27689a(cls, lVar, z);
        }
        C10774j.m34012a(cls);
        C10774j.m34012a(lVar);
        this.f25362k0.put(cls, lVar);
        this.f25353c |= DateUtils.FORMAT_NO_MIDNIGHT;
        this.f25358g0 = true;
        this.f25353c |= DateUtils.FORMAT_ABBREV_MONTH;
        this.f25369r0 = false;
        if (z) {
            this.f25353c |= DateUtils.FORMAT_NUMERIC_DATE;
            this.f25357f0 = true;
        }
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19931a(C10723a<?> aVar) {
        if (this.f25366o0) {
            return clone().mo19931a(aVar);
        }
        if (mo27565b(aVar.f25353c, 2)) {
            this.f25345U = aVar.f25345U;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_ABBREV_RELATIVE)) {
            this.f25367p0 = aVar.f25367p0;
        }
        if (mo27565b(aVar.f25353c, 1048576)) {
            this.f25370s0 = aVar.f25370s0;
        }
        if (mo27565b(aVar.f25353c, 4)) {
            this.f25346V = aVar.f25346V;
        }
        if (mo27565b(aVar.f25353c, 8)) {
            this.f25347W = aVar.f25347W;
        }
        if (mo27565b(aVar.f25353c, 16)) {
            this.f25348X = aVar.f25348X;
            this.f25349Y = 0;
            this.f25353c &= -33;
        }
        if (mo27565b(aVar.f25353c, 32)) {
            this.f25349Y = aVar.f25349Y;
            this.f25348X = null;
            this.f25353c &= -17;
        }
        if (mo27565b(aVar.f25353c, 64)) {
            this.f25350Z = aVar.f25350Z;
            this.f25351a0 = 0;
            this.f25353c &= -129;
        }
        if (mo27565b(aVar.f25353c, 128)) {
            this.f25351a0 = aVar.f25351a0;
            this.f25350Z = null;
            this.f25353c &= -65;
        }
        if (mo27565b(aVar.f25353c, 256)) {
            this.f25352b0 = aVar.f25352b0;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_NO_NOON)) {
            this.f25355d0 = aVar.f25355d0;
            this.f25354c0 = aVar.f25354c0;
        }
        if (mo27565b(aVar.f25353c, 1024)) {
            this.f25356e0 = aVar.f25356e0;
        }
        if (mo27565b(aVar.f25353c, 4096)) {
            this.f25363l0 = aVar.f25363l0;
        }
        if (mo27565b(aVar.f25353c, (int) ContentServiceClientExtras.URL_SIZE_LIMIT)) {
            this.f25359h0 = aVar.f25359h0;
            this.f25360i0 = 0;
            this.f25353c &= -16385;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_ABBREV_TIME)) {
            this.f25360i0 = aVar.f25360i0;
            this.f25359h0 = null;
            this.f25353c &= -8193;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_ABBREV_WEEKDAY)) {
            this.f25365n0 = aVar.f25365n0;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_ABBREV_MONTH)) {
            this.f25358g0 = aVar.f25358g0;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_NUMERIC_DATE)) {
            this.f25357f0 = aVar.f25357f0;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_NO_MIDNIGHT)) {
            this.f25362k0.putAll(aVar.f25362k0);
            this.f25369r0 = aVar.f25369r0;
        }
        if (mo27565b(aVar.f25353c, (int) DateUtils.FORMAT_ABBREV_ALL)) {
            this.f25368q0 = aVar.f25368q0;
        }
        if (!this.f25358g0) {
            this.f25362k0.clear();
            this.f25353c &= -2049;
            this.f25357f0 = false;
            this.f25353c &= -131073;
            this.f25369r0 = true;
        }
        this.f25353c |= aVar.f25353c;
        this.f25361j0.mo21163a(aVar.f25361j0);
        m33725G();
        return this;
    }

    /* renamed from: a */
    public T mo19919a() {
        if (!this.f25364m0 || this.f25366o0) {
            this.f25366o0 = true;
            return mo19915B();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
}
