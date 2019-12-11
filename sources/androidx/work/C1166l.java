package androidx.work;

import androidx.work.impl.p011m.C1111j;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.l */
/* compiled from: WorkRequest */
public abstract class C1166l {

    /* renamed from: a */
    private UUID f4399a;

    /* renamed from: b */
    private C1111j f4400b;

    /* renamed from: c */
    private Set<String> f4401c;

    /* renamed from: androidx.work.l$a */
    /* compiled from: WorkRequest */
    public static abstract class C1167a<B extends C1167a, W extends C1166l> {

        /* renamed from: a */
        boolean f4402a = false;

        /* renamed from: b */
        UUID f4403b = UUID.randomUUID();

        /* renamed from: c */
        C1111j f4404c;

        /* renamed from: d */
        Set<String> f4405d = new HashSet();

        C1167a(Class<? extends ListenableWorker> cls) {
            this.f4404c = new C1111j(this.f4403b.toString(), cls.getName());
            mo5957a(cls.getName());
        }

        /* renamed from: a */
        public final B mo5955a(C1024a aVar, long j, TimeUnit timeUnit) {
            this.f4402a = true;
            C1111j jVar = this.f4404c;
            jVar.f4291l = aVar;
            jVar.mo5850a(timeUnit.toMillis(j));
            return mo5617c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract W mo5616b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract B mo5617c();

        /* renamed from: a */
        public final B mo5956a(C1027c cVar) {
            this.f4404c.f4289j = cVar;
            return mo5617c();
        }

        /* renamed from: a */
        public final B mo5954a(Data data) {
            this.f4404c.f4284e = data;
            return mo5617c();
        }

        /* renamed from: a */
        public final B mo5957a(String str) {
            this.f4405d.add(str);
            return mo5617c();
        }

        /* renamed from: a */
        public final W mo5958a() {
            W b = mo5616b();
            this.f4403b = UUID.randomUUID();
            this.f4404c = new C1111j(this.f4404c);
            this.f4404c.f4280a = this.f4403b.toString();
            return b;
        }
    }

    protected C1166l(UUID uuid, C1111j jVar, Set<String> set) {
        this.f4399a = uuid;
        this.f4400b = jVar;
        this.f4401c = set;
    }

    /* renamed from: a */
    public String mo5951a() {
        return this.f4399a.toString();
    }

    /* renamed from: b */
    public Set<String> mo5952b() {
        return this.f4401c;
    }

    /* renamed from: c */
    public C1111j mo5953c() {
        return this.f4400b;
    }
}
