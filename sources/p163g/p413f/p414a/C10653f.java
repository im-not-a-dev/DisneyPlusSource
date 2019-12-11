package p163g.p413f.p414a;

import android.content.Context;
import com.bumptech.glide.load.p334n.C8233k;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p334n.p335a0.C8160f;
import com.bumptech.glide.load.p334n.p335a0.C8165j;
import com.bumptech.glide.load.p334n.p335a0.C8168k;
import com.bumptech.glide.load.p334n.p336b0.C8178a.C8179a;
import com.bumptech.glide.load.p334n.p336b0.C8188f;
import com.bumptech.glide.load.p334n.p336b0.C8190g;
import com.bumptech.glide.load.p334n.p336b0.C8191h;
import com.bumptech.glide.load.p334n.p336b0.C8193i;
import com.bumptech.glide.load.p334n.p336b0.C8193i.C8194a;
import com.bumptech.glide.load.p334n.p337c0.C8201a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p413f.p414a.p417r.C10690d;
import p163g.p413f.p414a.p417r.C10693f;
import p163g.p413f.p414a.p417r.C10700l;
import p163g.p413f.p414a.p417r.C10700l.C10702b;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;

/* renamed from: g.f.a.f */
/* compiled from: GlideBuilder */
public final class C10653f {

    /* renamed from: a */
    private final Map<Class<?>, C10670o<?, ?>> f25130a = new C3926a();

    /* renamed from: b */
    private C8233k f25131b;

    /* renamed from: c */
    private C8159e f25132c;

    /* renamed from: d */
    private C8154b f25133d;

    /* renamed from: e */
    private C8191h f25134e;

    /* renamed from: f */
    private C8201a f25135f;

    /* renamed from: g */
    private C8201a f25136g;

    /* renamed from: h */
    private C8179a f25137h;

    /* renamed from: i */
    private C8193i f25138i;

    /* renamed from: j */
    private C10690d f25139j;

    /* renamed from: k */
    private int f25140k = 4;

    /* renamed from: l */
    private C10731h f25141l = new C10731h();

    /* renamed from: m */
    private C10702b f25142m;

    /* renamed from: n */
    private C8201a f25143n;

    /* renamed from: o */
    private boolean f25144o;

    /* renamed from: p */
    private List<C10730g<Object>> f25145p;

    /* renamed from: q */
    private boolean f25146q;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27533a(C10702b bVar) {
        this.f25142m = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10652e mo27532a(Context context) {
        if (this.f25135f == null) {
            this.f25135f = C8201a.m23814d();
        }
        if (this.f25136g == null) {
            this.f25136g = C8201a.m23813c();
        }
        if (this.f25143n == null) {
            this.f25143n = C8201a.m23811b();
        }
        if (this.f25138i == null) {
            this.f25138i = new C8194a(context).mo21291a();
        }
        if (this.f25139j == null) {
            this.f25139j = new C10693f();
        }
        if (this.f25132c == null) {
            int b = this.f25138i.mo21289b();
            if (b > 0) {
                this.f25132c = new C8168k((long) b);
            } else {
                this.f25132c = new C8160f();
            }
        }
        if (this.f25133d == null) {
            this.f25133d = new C8165j(this.f25138i.mo21288a());
        }
        if (this.f25134e == null) {
            this.f25134e = new C8190g((long) this.f25138i.mo21290c());
        }
        if (this.f25137h == null) {
            this.f25137h = new C8188f(context);
        }
        if (this.f25131b == null) {
            C8233k kVar = new C8233k(this.f25134e, this.f25137h, this.f25136g, this.f25135f, C8201a.m23815e(), C8201a.m23811b(), this.f25144o);
            this.f25131b = kVar;
        }
        List<C10730g<Object>> list = this.f25145p;
        if (list == null) {
            this.f25145p = Collections.emptyList();
        } else {
            this.f25145p = Collections.unmodifiableList(list);
        }
        Context context2 = context;
        C10652e eVar = new C10652e(context2, this.f25131b, this.f25134e, this.f25132c, this.f25133d, new C10700l(this.f25142m), this.f25139j, this.f25140k, (C10731h) this.f25141l.mo19915B(), this.f25130a, this.f25145p, this.f25146q);
        return eVar;
    }
}
