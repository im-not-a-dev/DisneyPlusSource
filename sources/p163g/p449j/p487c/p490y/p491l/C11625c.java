package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.c */
/* compiled from: DateTypeAdapter */
public final class C11625c extends C11571v<Date> {

    /* renamed from: c */
    public static final C11573w f27099c = new C11626a();

    /* renamed from: a */
    private final DateFormat f27100a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b */
    private final DateFormat f27101b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: g.j.c.y.l.c$a */
    /* compiled from: DateTypeAdapter */
    static class C11626a implements C11573w {
        C11626a() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() == Date.class) {
                return new C11625c();
            }
            return null;
        }
    }

    /* renamed from: a */
    public Date m37421a(C11533a aVar) throws IOException {
        if (aVar.peek() != C11535b.NULL) {
            return m37419a(aVar.mo29479o());
        }
        aVar.mo29478n();
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return p163g.p449j.p487c.p490y.p491l.p492o.C11688a.m37634a(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw new p163g.p449j.p487c.C11567t(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r2.f27100a.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.Date m37419a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f27101b     // Catch:{ ParseException -> 0x000b }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x0026
        L_0x000b:
            java.text.DateFormat r0 = r2.f27100a     // Catch:{ ParseException -> 0x0013 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x0013:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x001f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x001f }
            java.util.Date r3 = p163g.p449j.p487c.p490y.p491l.p492o.C11688a.m37634a(r3, r0)     // Catch:{ ParseException -> 0x001f }
            monitor-exit(r2)
            return r3
        L_0x001f:
            r0 = move-exception
            g.j.c.t r1 = new g.j.c.t     // Catch:{ all -> 0x0009 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.p491l.C11625c.m37419a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public synchronized void mo29459a(C11536c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo29503h();
        } else {
            cVar.mo29501g(this.f27100a.format(date));
        }
    }
}
