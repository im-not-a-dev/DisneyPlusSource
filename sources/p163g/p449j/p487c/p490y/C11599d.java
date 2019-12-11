package p163g.p449j.p487c.p490y;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p163g.p449j.p487c.C11538b;
import p163g.p449j.p487c.C11539c;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p489x.C11574a;
import p163g.p449j.p487c.p489x.C11577d;
import p163g.p449j.p487c.p489x.C11578e;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.d */
/* compiled from: Excluder */
public final class C11599d implements C11573w, Cloneable {

    /* renamed from: Z */
    public static final C11599d f27047Z = new C11599d();

    /* renamed from: U */
    private int f27048U = 136;

    /* renamed from: V */
    private boolean f27049V = true;

    /* renamed from: W */
    private boolean f27050W;

    /* renamed from: X */
    private List<C11538b> f27051X = Collections.emptyList();

    /* renamed from: Y */
    private List<C11538b> f27052Y = Collections.emptyList();

    /* renamed from: c */
    private double f27053c = -1.0d;

    /* renamed from: g.j.c.y.d$a */
    /* compiled from: Excluder */
    class C11600a extends C11571v<T> {

        /* renamed from: a */
        private C11571v<T> f27054a;

        /* renamed from: b */
        final /* synthetic */ boolean f27055b;

        /* renamed from: c */
        final /* synthetic */ boolean f27056c;

        /* renamed from: d */
        final /* synthetic */ C11547f f27057d;

        /* renamed from: e */
        final /* synthetic */ C11689a f27058e;

        C11600a(boolean z, boolean z2, C11547f fVar, C11689a aVar) {
            this.f27055b = z;
            this.f27056c = z2;
            this.f27057d = fVar;
            this.f27058e = aVar;
        }

        /* renamed from: b */
        private C11571v<T> m37379b() {
            C11571v<T> vVar = this.f27054a;
            if (vVar != null) {
                return vVar;
            }
            C11571v<T> a = this.f27057d.mo29509a((C11573w) C11599d.this, this.f27058e);
            this.f27054a = a;
            return a;
        }

        /* renamed from: a */
        public T mo29458a(C11533a aVar) throws IOException {
            if (!this.f27055b) {
                return m37379b().mo29458a(aVar);
            }
            aVar.mo29480p();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, T t) throws IOException {
            if (this.f27056c) {
                cVar.mo29503h();
            } else {
                m37379b().mo29459a(cVar, t);
            }
        }
    }

    /* renamed from: b */
    private boolean m37374b(Class<?> cls) {
        return cls.isMemberClass() && !m37375c(cls);
    }

    /* renamed from: c */
    private boolean m37375c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        Class a = aVar.mo29701a();
        boolean a2 = mo29594a(a, true);
        boolean a3 = mo29594a(a, false);
        if (!a2 && !a3) {
            return null;
        }
        C11600a aVar2 = new C11600a(a3, a2, fVar, aVar);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    public C11599d clone() {
        try {
            return (C11599d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public boolean mo29595a(Field field, boolean z) {
        if ((this.f27048U & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f27053c != -1.0d && !m37371a((C11577d) field.getAnnotation(C11577d.class), (C11578e) field.getAnnotation(C11578e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f27050W) {
            C11574a aVar = (C11574a) field.getAnnotation(C11574a.class);
            if (aVar == null || (!z ? !aVar.deserialize() : !aVar.serialize())) {
                return true;
            }
        }
        if ((!this.f27049V && m37374b(field.getType())) || m37373a(field.getType())) {
            return true;
        }
        List<C11538b> list = z ? this.f27051X : this.f27052Y;
        if (!list.isEmpty()) {
            C11539c cVar = new C11539c(field);
            for (C11538b a : list) {
                if (a.mo29504a(cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo29594a(Class<?> cls, boolean z) {
        if (this.f27053c != -1.0d && !m37371a((C11577d) cls.getAnnotation(C11577d.class), (C11578e) cls.getAnnotation(C11578e.class))) {
            return true;
        }
        if ((!this.f27049V && m37374b(cls)) || m37373a(cls)) {
            return true;
        }
        for (C11538b a : z ? this.f27051X : this.f27052Y) {
            if (a.mo29505a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m37373a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    private boolean m37371a(C11577d dVar, C11578e eVar) {
        return m37370a(dVar) && m37372a(eVar);
    }

    /* renamed from: a */
    private boolean m37370a(C11577d dVar) {
        return dVar == null || dVar.value() <= this.f27053c;
    }

    /* renamed from: a */
    private boolean m37372a(C11578e eVar) {
        return eVar == null || eVar.value() > this.f27053c;
    }
}
