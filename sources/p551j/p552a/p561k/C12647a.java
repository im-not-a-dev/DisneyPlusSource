package p551j.p552a.p561k;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p520io.sentry.event.C12559a;
import p520io.sentry.event.C12567d;
import p520io.sentry.event.p550f.C12579e;
import p551j.p552a.p569r.C12676a;

/* renamed from: j.a.k.a */
/* compiled from: Context */
public class C12647a implements Serializable {

    /* renamed from: U */
    private volatile C12567d f29324U;

    /* renamed from: V */
    private volatile Map<String, String> f29325V;

    /* renamed from: W */
    private volatile Map<String, Object> f29326W;

    /* renamed from: X */
    private volatile C12579e f29327X;

    /* renamed from: c */
    private volatile C12676a<C12559a> f29328c;

    public C12647a() {
        this(100);
    }

    /* renamed from: a */
    public synchronized List<C12559a> mo30955a() {
        if (this.f29328c == null) {
        } else {
            this.f29328c.isEmpty();
            throw null;
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo30956a(UUID uuid) {
    }

    /* renamed from: b */
    public synchronized Map<String, Object> mo30957b() {
        if (this.f29326W != null) {
            if (!this.f29326W.isEmpty()) {
                return Collections.unmodifiableMap(this.f29326W);
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public synchronized C12579e mo30958c() {
        return this.f29327X;
    }

    /* renamed from: d */
    public synchronized Map<String, String> mo30959d() {
        if (this.f29325V != null) {
            if (!this.f29325V.isEmpty()) {
                return Collections.unmodifiableMap(this.f29325V);
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public C12567d mo30960e() {
        return this.f29324U;
    }

    public C12647a(int i) {
    }
}
