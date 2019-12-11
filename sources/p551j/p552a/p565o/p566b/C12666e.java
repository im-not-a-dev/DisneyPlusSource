package p551j.p552a.p565o.p566b;

import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.UUID;
import p163g.p441i.p442a.p443a.C10900d;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.C12559a;
import p520io.sentry.event.C12566c;
import p520io.sentry.event.Event;
import p520io.sentry.event.Event.C12558a;
import p520io.sentry.event.p550f.C12582h;
import p551j.p552a.p565o.C12660a;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.o.b.e */
/* compiled from: JsonMarshaller */
public class C12666e implements C12660a {

    /* renamed from: e */
    private static final ThreadLocal<DateFormat> f29350e = new C12667a();

    /* renamed from: f */
    private static final C13459b f29351f = C13460c.m41415a(C12666e.class);

    /* renamed from: a */
    private final C10900d f29352a;

    /* renamed from: b */
    private final Map<Class<? extends C12582h>, C12665d<?>> f29353b;

    /* renamed from: c */
    private boolean f29354c;

    /* renamed from: d */
    private final int f29355d;

    /* renamed from: j.a.o.b.e$a */
    /* compiled from: JsonMarshaller */
    static class C12667a extends ThreadLocal<DateFormat> {
        C12667a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    /* renamed from: j.a.o.b.e$b */
    /* compiled from: JsonMarshaller */
    static /* synthetic */ class C12668b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29356a = new int[C12558a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                io.sentry.event.Event$a[] r0 = p520io.sentry.event.Event.C12558a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29356a = r0
                int[] r0 = f29356a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.sentry.event.Event$a r1 = p520io.sentry.event.Event.C12558a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f29356a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.sentry.event.Event$a r1 = p520io.sentry.event.Event.C12558a.FATAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f29356a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.sentry.event.Event$a r1 = p520io.sentry.event.Event.C12558a.WARNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f29356a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.sentry.event.Event$a r1 = p520io.sentry.event.Event.C12558a.INFO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f29356a     // Catch:{ NoSuchFieldError -> 0x0040 }
                io.sentry.event.Event$a r1 = p520io.sentry.event.Event.C12558a.ERROR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p565o.p566b.C12666e.C12668b.<clinit>():void");
        }
    }

    public C12666e() {
        this(1000);
    }

    /* renamed from: b */
    private void m39721b(C10903f fVar, Map<String, Object> map) throws IOException {
        fVar.mo28065i("extra");
        for (Entry entry : map.entrySet()) {
            fVar.mo28063g((String) entry.getKey());
            fVar.mo28054b(entry.getValue());
        }
        fVar.mo28055c();
    }

    /* renamed from: c */
    private void m39722c(C10903f fVar, Map<String, C12582h> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            C12582h hVar = (C12582h) entry.getValue();
            if (this.f29353b.containsKey(hVar.getClass())) {
                fVar.mo28063g((String) entry.getKey());
                m39713a((T) hVar).mo30988a(fVar, (C12582h) entry.getValue());
            } else {
                f29351f.mo34730c("Couldn't parse the content of '{}' provided in {}.", entry.getKey(), hVar);
            }
        }
    }

    /* renamed from: d */
    private void m39723d(C10903f fVar, Map<String, String> map) throws IOException {
        fVar.mo28065i("tags");
        for (Entry entry : map.entrySet()) {
            fVar.mo28045a((String) entry.getKey(), (String) entry.getValue());
        }
        fVar.mo28055c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30980a(p520io.sentry.event.Event r4, java.io.OutputStream r5) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "An exception occurred while serialising the event."
            j.a.o.a$a r1 = new j.a.o.a$a
            r1.<init>(r5)
            boolean r5 = r3.f29354c
            if (r5 == 0) goto L_0x0011
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream
            r5.<init>(r1)
            goto L_0x0012
        L_0x0011:
            r5 = r1
        L_0x0012:
            g.i.a.a.f r1 = r3.mo30991a(r5)     // Catch:{ IOException -> 0x0039 }
            r3.m39716a(r1, r4)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001e
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x001e:
            r5.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0042
        L_0x0022:
            r4 = move-exception
            m.c.b r5 = f29351f
            r5.mo34723a(r0, r4)
            goto L_0x0042
        L_0x0029:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002b }
        L_0x002b:
            r2 = move-exception
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ IOException -> 0x0039 }
        L_0x0036:
            throw r2     // Catch:{ IOException -> 0x0039 }
        L_0x0037:
            r4 = move-exception
            goto L_0x0043
        L_0x0039:
            r4 = move-exception
            m.c.b r1 = f29351f     // Catch:{ all -> 0x0037 }
            r1.mo34723a(r0, r4)     // Catch:{ all -> 0x0037 }
            r5.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0042:
            return
        L_0x0043:
            r5.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r5 = move-exception
            m.c.b r1 = f29351f
            r1.mo34723a(r0, r5)
        L_0x004d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p565o.p566b.C12666e.mo30980a(io.sentry.event.Event, java.io.OutputStream):void");
    }

    public String getContentType() {
        return DefaultLegalApi.MIME_TYPE_JSON;
    }

    public C12666e(int i) {
        this.f29352a = new C10900d();
        this.f29353b = new HashMap();
        this.f29354c = true;
        this.f29355d = i;
    }

    /* renamed from: b */
    public boolean mo30994b() {
        return this.f29354c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10903f mo30991a(OutputStream outputStream) throws IOException {
        return new C12670g(this.f29352a.mo28024a(outputStream));
    }

    /* renamed from: a */
    public String mo30979a() {
        if (mo30994b()) {
            return "gzip";
        }
        return null;
    }

    /* renamed from: a */
    private void m39716a(C10903f fVar, Event event) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("event_id", m39715a(event.getId()));
        fVar.mo28045a("message", C12677b.m39768a(event.getMessage(), this.f29355d));
        fVar.mo28045a(StreamSampleTelemetryData.TIMESTAMP_KEY, ((DateFormat) f29350e.get()).format(event.getTimestamp()));
        fVar.mo28045a("level", m39714a(event.getLevel()));
        fVar.mo28045a("logger", event.getLogger());
        fVar.mo28045a("platform", event.getPlatform());
        fVar.mo28045a("culprit", event.getCulprit());
        fVar.mo28045a("transaction", event.getTransaction());
        m39717a(fVar, event.getSdk());
        m39723d(fVar, event.getTags());
        m39719a(fVar, event.getBreadcrumbs());
        m39720a(fVar, event.getContexts());
        fVar.mo28045a("server_name", event.getServerName());
        fVar.mo28045a("release", event.getRelease());
        fVar.mo28045a("dist", event.getDist());
        fVar.mo28045a("environment", event.getEnvironment());
        m39721b(fVar, event.getExtra());
        m39718a(fVar, "fingerprint", event.getFingerprint());
        fVar.mo28045a("checksum", event.getChecksum());
        m39722c(fVar, event.getSentryInterfaces());
        fVar.mo28055c();
    }

    /* renamed from: a */
    private <T extends C12582h> C12665d<? super T> m39713a(T t) {
        return (C12665d) this.f29353b.get(t.getClass());
    }

    /* renamed from: a */
    private void m39718a(C10903f fVar, String str, Collection<String> collection) throws IOException {
        if (collection != null && !collection.isEmpty()) {
            fVar.mo28061f(str);
            for (String j : collection) {
                fVar.mo28066j(j);
            }
            fVar.mo28052b();
        }
    }

    /* renamed from: a */
    private void m39717a(C10903f fVar, C12566c cVar) throws IOException {
        fVar.mo28065i("sdk");
        fVar.mo28045a("name", cVar.mo30757b());
        fVar.mo28045a("version", cVar.mo30758c());
        if (cVar.mo30756a() != null && !cVar.mo30756a().isEmpty()) {
            fVar.mo28061f("integrations");
            for (String j : cVar.mo30756a()) {
                fVar.mo28066j(j);
            }
            fVar.mo28052b();
        }
        fVar.mo28055c();
    }

    /* renamed from: a */
    private void m39719a(C10903f fVar, List<C12559a> list) throws IOException {
        if (!list.isEmpty()) {
            fVar.mo28065i("breadcrumbs");
            fVar.mo28061f("values");
            for (C12559a aVar : list) {
                fVar.mo28060f();
                fVar.mo28043a(StreamSampleTelemetryData.TIMESTAMP_KEY, aVar.mo30731e().getTime() / 1000);
                if (aVar.mo30733f() != null) {
                    fVar.mo28045a("type", aVar.mo30733f().mo30736a());
                }
                if (aVar.mo30729c() != null) {
                    fVar.mo28045a("level", aVar.mo30729c().mo30735a());
                }
                if (aVar.mo30730d() != null) {
                    fVar.mo28045a("message", aVar.mo30730d());
                }
                if (aVar.mo30727a() != null) {
                    fVar.mo28045a("category", aVar.mo30727a());
                }
                if (aVar.mo30728b() != null && !aVar.mo30728b().isEmpty()) {
                    fVar.mo28065i("data");
                    for (Entry entry : aVar.mo30728b().entrySet()) {
                        fVar.mo28045a((String) entry.getKey(), (String) entry.getValue());
                    }
                    fVar.mo28055c();
                }
                fVar.mo28055c();
            }
            fVar.mo28052b();
            fVar.mo28055c();
        }
    }

    /* renamed from: a */
    private void m39720a(C10903f fVar, Map<String, Map<String, Object>> map) throws IOException {
        if (!map.isEmpty()) {
            fVar.mo28065i("contexts");
            for (Entry entry : map.entrySet()) {
                fVar.mo28065i((String) entry.getKey());
                for (Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    fVar.mo28044a((String) entry2.getKey(), entry2.getValue());
                }
                fVar.mo28055c();
            }
            fVar.mo28055c();
        }
    }

    /* renamed from: a */
    private String m39715a(UUID uuid) {
        return uuid.toString().replaceAll("-", "");
    }

    /* renamed from: a */
    private String m39714a(C12558a aVar) {
        if (aVar == null) {
            return null;
        }
        int i = C12668b.f29356a[aVar.ordinal()];
        if (i == 1) {
            return "debug";
        }
        if (i == 2) {
            return "fatal";
        }
        if (i == 3) {
            return "warning";
        }
        if (i == 4) {
            return "info";
        }
        if (i == 5) {
            return "error";
        }
        f29351f.mo34732d("The level '{}' isn't supported, this should NEVER happen, contact Sentry developers", aVar.name());
        return null;
    }

    /* renamed from: a */
    public <T extends C12582h, F extends T> void mo30992a(Class<F> cls, C12665d<T> dVar) {
        this.f29353b.put(cls, dVar);
    }

    /* renamed from: a */
    public void mo30993a(boolean z) {
        this.f29354c = z;
    }
}
