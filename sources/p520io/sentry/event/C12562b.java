package p520io.sentry.event;

import com.bamtech.sdk4.internal.device.Device;
import com.facebook.stetho.common.Utf8Charset;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p520io.sentry.event.Event.C12558a;
import p520io.sentry.event.p550f.C12582h;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: io.sentry.event.b */
/* compiled from: EventBuilder */
public class C12562b {

    /* renamed from: d */
    public static final long f29118d = TimeUnit.HOURS.toMillis(5);

    /* renamed from: e */
    private static final C12564b f29119e = new C12564b(f29118d);

    /* renamed from: a */
    private final Event f29120a;

    /* renamed from: b */
    private boolean f29121b;

    /* renamed from: c */
    private Set<String> f29122c;

    /* renamed from: io.sentry.event.b$b */
    /* compiled from: EventBuilder */
    private static final class C12564b {

        /* renamed from: e */
        public static final long f29123e = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: f */
        private static final C13459b f29124f = C13460c.m41415a(C12564b.class);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f29125a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public volatile String f29126b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile long f29127c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AtomicBoolean f29128d;

        /* renamed from: io.sentry.event.b$b$a */
        /* compiled from: EventBuilder */
        class C12565a implements Callable<Void> {
            C12565a() {
            }

            /* JADX INFO: finally extract failed */
            public Void call() throws Exception {
                try {
                    C12564b.this.f29126b = InetAddress.getLocalHost().getCanonicalHostName();
                    C12564b.this.f29127c = System.currentTimeMillis() + C12564b.this.f29125a;
                    C12564b.this.f29128d.set(false);
                    return null;
                } catch (Throwable th) {
                    C12564b.this.f29128d.set(false);
                    throw th;
                }
            }
        }

        private C12564b(long j) {
            this.f29126b = Device.ATTRIBUTE_UNAVAILABLE;
            this.f29128d = new AtomicBoolean(false);
            this.f29125a = j;
        }

        /* renamed from: b */
        public void mo30754b() {
            C12565a aVar = new C12565a();
            try {
                f29124f.mo34720a("Updating the hostname cache");
                FutureTask futureTask = new FutureTask(aVar);
                new Thread(futureTask).start();
                futureTask.get(f29123e, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                this.f29127c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1);
                f29124f.mo34722a("Localhost hostname lookup failed, keeping the value '{}'. If this persists it may mean your DNS is incorrectly configured and you may want to hardcode your server name: https://docs.sentry.io/clients/java/config/", this.f29126b, e);
            }
        }

        /* renamed from: a */
        public String mo30753a() {
            if (this.f29127c < System.currentTimeMillis() && this.f29128d.compareAndSet(false, true)) {
                mo30754b();
            }
            return this.f29126b;
        }
    }

    static {
        Charset.forName(Utf8Charset.NAME);
    }

    public C12562b() {
        this(UUID.randomUUID());
    }

    /* renamed from: c */
    private void m39389c() {
        if (this.f29120a.getTimestamp() == null) {
            this.f29120a.setTimestamp(new Date());
        }
        if (this.f29120a.getPlatform() == null) {
            this.f29120a.setPlatform("java");
        }
        if (this.f29120a.getSdk() == null) {
            this.f29120a.setSdk(new C12566c("sentry-java", "1.7.27-f6366", this.f29122c));
        }
        if (this.f29120a.getServerName() == null) {
            this.f29120a.setServerName(f29119e.mo30753a());
        }
    }

    /* renamed from: d */
    private void m39390d() {
        Event event = this.f29120a;
        event.setTags(Collections.unmodifiableMap(event.getTags()));
        Event event2 = this.f29120a;
        event2.setBreadcrumbs(Collections.unmodifiableList(event2.getBreadcrumbs()));
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f29120a.getContexts().entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap((Map) entry.getValue()));
        }
        this.f29120a.setContexts(Collections.unmodifiableMap(hashMap));
        Event event3 = this.f29120a;
        event3.setExtra(Collections.unmodifiableMap(event3.getExtra()));
        Event event4 = this.f29120a;
        event4.setSentryInterfaces(Collections.unmodifiableMap(event4.getSentryInterfaces()));
    }

    /* renamed from: a */
    public C12562b mo30738a(C12558a aVar) {
        this.f29120a.setLevel(aVar);
        return this;
    }

    /* renamed from: b */
    public C12562b mo30747b(String str) {
        this.f29120a.setEnvironment(str);
        return this;
    }

    /* renamed from: e */
    public C12562b mo30750e(String str) {
        this.f29122c.add(str);
        return this;
    }

    /* renamed from: f */
    public C12562b mo30751f(String str) {
        this.f29120a.setServerName(str);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventBuilder{event=");
        sb.append(this.f29120a);
        sb.append(", alreadyBuilt=");
        sb.append(this.f29121b);
        sb.append('}');
        return sb.toString();
    }

    public C12562b(UUID uuid) {
        this.f29121b = false;
        this.f29122c = new HashSet();
        this.f29120a = new Event(uuid);
    }

    /* renamed from: a */
    public C12562b mo30741a(String str) {
        this.f29120a.setDist(str);
        return this;
    }

    /* renamed from: b */
    public Event mo30746b() {
        return this.f29120a;
    }

    /* renamed from: a */
    public C12562b mo30743a(String str, String str2) {
        this.f29120a.getTags().put(str, str2);
        return this;
    }

    /* renamed from: a */
    public C12562b mo30744a(List<C12559a> list) {
        this.f29120a.setBreadcrumbs(list);
        return this;
    }

    /* renamed from: a */
    public C12562b mo30745a(Map<String, Map<String, Object>> map) {
        this.f29120a.setContexts(map);
        return this;
    }

    /* renamed from: a */
    public C12562b mo30742a(String str, Object obj) {
        this.f29120a.getExtra().put(str, obj);
        return this;
    }

    /* renamed from: a */
    public C12562b mo30739a(C12582h hVar) {
        mo30740a(hVar, true);
        return this;
    }

    /* renamed from: a */
    public C12562b mo30740a(C12582h hVar, boolean z) {
        if (z || !this.f29120a.getSentryInterfaces().containsKey(hVar.mo30763Z())) {
            this.f29120a.getSentryInterfaces().put(hVar.mo30763Z(), hVar);
        }
        return this;
    }

    /* renamed from: c */
    public C12562b mo30748c(String str) {
        this.f29120a.setMessage(str);
        return this;
    }

    /* renamed from: d */
    public C12562b mo30749d(String str) {
        this.f29120a.setRelease(str);
        return this;
    }

    /* renamed from: a */
    public synchronized Event mo30737a() {
        if (!this.f29121b) {
            m39389c();
            m39390d();
            this.f29121b = true;
        } else {
            throw new IllegalStateException("A message can't be built twice");
        }
        return this.f29120a;
    }
}
