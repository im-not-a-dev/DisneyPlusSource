package p551j.p552a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.Event;
import p520io.sentry.event.Event.C12558a;
import p520io.sentry.event.p549e.C12570c;
import p520io.sentry.event.p549e.C12573f;
import p520io.sentry.event.p550f.C12576b;
import p520io.sentry.event.p550f.C12582h;
import p551j.p552a.p560j.C12634d;
import p551j.p552a.p560j.C12641j;
import p551j.p552a.p560j.C12646o;
import p551j.p552a.p561k.C12647a;
import p551j.p552a.p561k.C12648b;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.c */
/* compiled from: SentryClient */
public class C12590c {

    /* renamed from: m */
    private static final C13459b f29200m;

    /* renamed from: a */
    protected String f29201a;

    /* renamed from: b */
    protected String f29202b;

    /* renamed from: c */
    protected String f29203c;

    /* renamed from: d */
    protected String f29204d;

    /* renamed from: e */
    protected Map<String, String> f29205e = new HashMap();

    /* renamed from: f */
    protected Set<String> f29206f = new HashSet();

    /* renamed from: g */
    protected Map<String, Object> f29207g = new HashMap();

    /* renamed from: h */
    private final Set<C12573f> f29208h = new HashSet();

    /* renamed from: i */
    private final C12634d f29209i;

    /* renamed from: j */
    private final List<C12570c> f29210j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private final C12648b f29211k;

    /* renamed from: l */
    private C12593f f29212l;

    static {
        Class<C12590c> cls = C12590c.class;
        f29200m = C13460c.m41415a(cls);
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(".lockdown");
        C13460c.m41416a(sb.toString());
    }

    public C12590c(C12634d dVar, C12648b bVar) {
        this.f29209i = dVar;
        this.f29211k = bVar;
    }

    /* renamed from: a */
    public void mo30886a(Event event) {
        for (C12573f fVar : this.f29208h) {
            if (!fVar.mo30762a(event)) {
                f29200m.mo34725b("Not sending Event because of ShouldSendEventCallback: {}", (Object) fVar);
                return;
            }
        }
        try {
            this.f29209i.mo30925a(event);
        } catch (C12641j | C12646o unused) {
            C13459b bVar = f29200m;
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping an Event due to lockdown: ");
            sb.append(event);
            bVar.mo34720a(sb.toString());
        } catch (Exception e) {
            f29200m.mo34723a("An exception occurred while sending the event to Sentry.", (Throwable) e);
        } catch (Throwable th) {
            mo30885a().mo30956a(event.getId());
            throw th;
        }
        mo30885a().mo30956a(event.getId());
    }

    /* renamed from: b */
    public void mo30893b(C12562b bVar) {
        for (C12570c a : this.f29210j) {
            a.mo30761a(bVar);
        }
    }

    /* renamed from: c */
    public void mo30895c(C12562b bVar) {
        mo30886a(mo30884a(bVar));
    }

    /* renamed from: d */
    public void mo30897d(String str) {
        this.f29201a = str;
    }

    /* renamed from: e */
    public void mo30898e(String str) {
        this.f29204d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SentryClient{release='");
        sb.append(this.f29201a);
        sb.append('\'');
        sb.append(", dist='");
        sb.append(this.f29202b);
        sb.append('\'');
        sb.append(", environment='");
        sb.append(this.f29203c);
        sb.append('\'');
        sb.append(", serverName='");
        sb.append(this.f29204d);
        sb.append('\'');
        sb.append(", tags=");
        sb.append(this.f29205e);
        sb.append(", mdcTags=");
        sb.append(this.f29206f);
        sb.append(", extra=");
        sb.append(this.f29207g);
        sb.append(", connection=");
        sb.append(this.f29209i);
        sb.append(", builderHelpers=");
        sb.append(this.f29210j);
        sb.append(", contextManager=");
        sb.append(this.f29211k);
        sb.append(", uncaughtExceptionHandler=");
        sb.append(this.f29212l);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public void mo30894b(String str) {
        this.f29202b = str;
    }

    /* renamed from: c */
    public void mo30896c(String str) {
        this.f29203c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30892b() {
        this.f29212l = C12593f.m39558a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Event mo30884a(C12562b bVar) {
        Event b = bVar.mo30746b();
        if (!C12677b.m39771a(this.f29201a) && b.getRelease() == null) {
            bVar.mo30749d(this.f29201a.trim());
            if (!C12677b.m39771a(this.f29202b)) {
                bVar.mo30741a(this.f29202b.trim());
            }
        }
        if (!C12677b.m39771a(this.f29203c) && b.getEnvironment() == null) {
            bVar.mo30747b(this.f29203c.trim());
        }
        if (!C12677b.m39771a(this.f29204d) && b.getServerName() == null) {
            bVar.mo30751f(this.f29204d.trim());
        }
        for (Entry entry : this.f29205e.entrySet()) {
            Map tags = b.getTags();
            String str = (String) tags.put(entry.getKey(), entry.getValue());
            if (str != null) {
                tags.put(entry.getKey(), str);
            }
        }
        for (Entry entry2 : this.f29207g.entrySet()) {
            Map extra = b.getExtra();
            Object put = extra.put(entry2.getKey(), entry2.getValue());
            if (put != null) {
                extra.put(entry2.getKey(), put);
            }
        }
        mo30893b(bVar);
        return bVar.mo30737a();
    }

    /* renamed from: a */
    public void mo30891a(Throwable th) {
        C12562b bVar = new C12562b();
        bVar.mo30748c(th.getMessage());
        bVar.mo30738a(C12558a.ERROR);
        bVar.mo30739a((C12582h) new C12576b(th));
        mo30895c(bVar);
    }

    /* renamed from: a */
    public void mo30887a(C12570c cVar) {
        f29200m.mo34729c("Adding '{}' to the list of builder helpers.", (Object) cVar);
        this.f29210j.add(cVar);
    }

    /* renamed from: a */
    public C12647a mo30885a() {
        return this.f29211k.mo30961b();
    }

    /* renamed from: a */
    public void mo30890a(String str, String str2) {
        this.f29205e.put(str, str2);
    }

    /* renamed from: a */
    public void mo30888a(String str) {
        this.f29206f.add(str);
    }

    /* renamed from: a */
    public void mo30889a(String str, Object obj) {
        this.f29207g.put(str, obj);
    }
}
