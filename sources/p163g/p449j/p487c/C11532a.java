package p163g.p449j.p487c;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;

/* renamed from: g.j.c.a */
/* compiled from: DefaultDateTypeAdapter */
final class C11532a extends C11571v<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f26944a;

    /* renamed from: b */
    private final DateFormat f26945b;

    /* renamed from: c */
    private final DateFormat f26946c;

    C11532a(Class<? extends Date> cls, String str) {
        this(cls, (DateFormat) new SimpleDateFormat(str, Locale.US), (DateFormat) new SimpleDateFormat(str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultDateTypeAdapter");
        sb.append('(');
        sb.append(this.f26946c.getClass().getSimpleName());
        sb.append(')');
        return sb.toString();
    }

    public C11532a(Class<? extends Date> cls, int i, int i2) {
        this(cls, DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    /* renamed from: a */
    public void mo29459a(C11536c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo29503h();
            return;
        }
        synchronized (this.f26946c) {
            cVar.mo29501g(this.f26945b.format(date));
        }
    }

    C11532a(Class<? extends Date> cls, DateFormat dateFormat, DateFormat dateFormat2) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f26944a = cls;
            this.f26945b = dateFormat;
            this.f26946c = dateFormat2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public Date m37171a(C11533a aVar) throws IOException {
        if (aVar.peek() == C11535b.NULL) {
            aVar.mo29478n();
            return null;
        }
        Date a = m37169a(aVar.mo29479o());
        Class<? extends Date> cls = this.f26944a;
        if (cls == Date.class) {
            return a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* JADX INFO: used method not loaded: g.j.c.y.l.o.a.a(java.lang.String, java.text.ParsePosition):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = p163g.p449j.p487c.p490y.p491l.p492o.C11688a.m37634a(r4, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw new p163g.p449j.p487c.C11567t(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = r3.f26945b.parse(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Date m37169a(java.lang.String r4) {
        /*
            r3 = this;
            java.text.DateFormat r0 = r3.f26946c
            monitor-enter(r0)
            java.text.DateFormat r1 = r3.f26946c     // Catch:{ ParseException -> 0x000d }
            java.util.Date r4 = r1.parse(r4)     // Catch:{ ParseException -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x000b:
            r4 = move-exception
            goto L_0x0028
        L_0x000d:
            java.text.DateFormat r1 = r3.f26945b     // Catch:{ ParseException -> 0x0015 }
            java.util.Date r4 = r1.parse(r4)     // Catch:{ ParseException -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x0015:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0021 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0021 }
            java.util.Date r4 = p163g.p449j.p487c.p490y.p491l.p492o.C11688a.m37634a(r4, r1)     // Catch:{ ParseException -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r4
        L_0x0021:
            r1 = move-exception
            g.j.c.t r2 = new g.j.c.t     // Catch:{ all -> 0x000b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x000b }
            throw r2     // Catch:{ all -> 0x000b }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.C11532a.m37169a(java.lang.String):java.util.Date");
    }
}
