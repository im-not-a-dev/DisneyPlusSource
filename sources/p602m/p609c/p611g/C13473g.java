package p602m.p609c.p611g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p602m.p609c.C13458a;
import p602m.p609c.C13459b;
import p602m.p609c.p610f.C13466d;

/* renamed from: m.c.g.g */
/* compiled from: SubstituteLoggerFactory */
public class C13473g implements C13458a {

    /* renamed from: a */
    boolean f30006a = false;

    /* renamed from: b */
    final Map<String, C13472f> f30007b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C13466d> f30008c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public synchronized C13459b mo34719a(String str) {
        C13472f fVar;
        fVar = (C13472f) this.f30007b.get(str);
        if (fVar == null) {
            fVar = new C13472f(str, this.f30008c, this.f30006a);
            this.f30007b.put(str, fVar);
        }
        return fVar;
    }

    /* renamed from: b */
    public LinkedBlockingQueue<C13466d> mo34758b() {
        return this.f30008c;
    }

    /* renamed from: c */
    public List<C13472f> mo34759c() {
        return new ArrayList(this.f30007b.values());
    }

    /* renamed from: d */
    public void mo34760d() {
        this.f30006a = true;
    }

    /* renamed from: a */
    public void mo34757a() {
        this.f30007b.clear();
        this.f30008c.clear();
    }
}
