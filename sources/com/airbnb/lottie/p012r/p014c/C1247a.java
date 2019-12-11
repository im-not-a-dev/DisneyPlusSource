package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.a */
/* compiled from: BaseKeyframeAnimation */
public abstract class C1247a<K, A> {

    /* renamed from: a */
    final List<C1248a> f4695a = new ArrayList(1);

    /* renamed from: b */
    private boolean f4696b = false;

    /* renamed from: c */
    private final List<? extends C1376a<K>> f4697c;

    /* renamed from: d */
    private float f4698d = 0.0f;

    /* renamed from: e */
    protected C1378c<A> f4699e;

    /* renamed from: f */
    private C1376a<K> f4700f;

    /* renamed from: g */
    private C1376a<K> f4701g;

    /* renamed from: h */
    private float f4702h = -1.0f;

    /* renamed from: i */
    private A f4703i = null;

    /* renamed from: j */
    private float f4704j = -1.0f;

    /* renamed from: k */
    private float f4705k = -1.0f;

    /* renamed from: com.airbnb.lottie.r.c.a$a */
    /* compiled from: BaseKeyframeAnimation */
    public interface C1248a {
        /* renamed from: a */
        void mo6141a();
    }

    C1247a(List<? extends C1376a<K>> list) {
        this.f4697c = list;
    }

    /* renamed from: i */
    private float mo6173i() {
        if (this.f4704j == -1.0f) {
            this.f4704j = this.f4697c.isEmpty() ? 0.0f : ((C1376a) this.f4697c.get(0)).mo6423d();
        }
        return this.f4704j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract A mo6161a(C1376a<K> aVar, float f);

    /* renamed from: a */
    public void mo6163a(C1248a aVar) {
        this.f4695a.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo6165b() {
        float f;
        if (this.f4705k == -1.0f) {
            if (this.f4697c.isEmpty()) {
                f = 1.0f;
            } else {
                List<? extends C1376a<K>> list = this.f4697c;
                f = ((C1376a) list.get(list.size() - 1)).mo6419a();
            }
            this.f4705k = f;
        }
        return this.f4705k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo6166c() {
        C1376a a = mo6160a();
        if (a.mo6426g()) {
            return 0.0f;
        }
        return a.f5055d.getInterpolation(mo6167d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo6167d() {
        if (this.f4696b) {
            return 0.0f;
        }
        C1376a a = mo6160a();
        if (a.mo6426g()) {
            return 0.0f;
        }
        return (this.f4698d - a.mo6423d()) / (a.mo6419a() - a.mo6423d());
    }

    /* renamed from: e */
    public float mo6168e() {
        return this.f4698d;
    }

    /* renamed from: f */
    public A mo6169f() {
        C1376a<K> a = mo6160a();
        float c = mo6166c();
        if (this.f4699e == null && a == this.f4701g && this.f4702h == c) {
            return this.f4703i;
        }
        this.f4701g = a;
        this.f4702h = c;
        A a2 = mo6161a(a, c);
        this.f4703i = a2;
        return a2;
    }

    /* renamed from: g */
    public void mo6170g() {
        for (int i = 0; i < this.f4695a.size(); i++) {
            ((C1248a) this.f4695a.get(i)).mo6141a();
        }
    }

    /* renamed from: h */
    public void mo6171h() {
        this.f4696b = true;
    }

    /* renamed from: a */
    public void mo6162a(float f) {
        if (!this.f4697c.isEmpty()) {
            C1376a a = mo6160a();
            if (f < mo6173i()) {
                f = mo6173i();
            } else if (f > mo6165b()) {
                f = mo6165b();
            }
            if (f != this.f4698d) {
                this.f4698d = f;
                C1376a a2 = mo6160a();
                if (a != a2 || !a2.mo6426g()) {
                    mo6170g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1376a<K> mo6160a() {
        C1376a<K> aVar = this.f4700f;
        if (aVar != null && aVar.mo6420a(this.f4698d)) {
            return this.f4700f;
        }
        List<? extends C1376a<K>> list = this.f4697c;
        C1376a<K> aVar2 = (C1376a) list.get(list.size() - 1);
        if (this.f4698d < aVar2.mo6423d()) {
            for (int size = this.f4697c.size() - 1; size >= 0; size--) {
                aVar2 = (C1376a) this.f4697c.get(size);
                if (aVar2.mo6420a(this.f4698d)) {
                    break;
                }
            }
        }
        this.f4700f = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public void mo6164a(C1378c<A> cVar) {
        C1378c<A> cVar2 = this.f4699e;
        if (cVar2 != null) {
            cVar2.mo6431a(null);
        }
        this.f4699e = cVar;
        if (cVar != null) {
            cVar.mo6431a(this);
        }
    }
}
