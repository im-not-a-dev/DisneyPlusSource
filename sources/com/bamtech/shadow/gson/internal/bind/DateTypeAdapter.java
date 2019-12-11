package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class DateTypeAdapter extends C2241p<Date> {

    /* renamed from: c */
    public static final C2243q f6162c = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f6163a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b */
    private final DateFormat f6164b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: a */
    public Date m8315a(C2249a aVar) throws IOException {
        if (aVar.peek() != C2251b.NULL) {
            return m8313a(aVar.mo11174o());
        }
        aVar.mo11173n();
        return null;
    }

    /* JADX INFO: used method not loaded: com.bamtech.shadow.gson.internal.bind.d.a.a(java.lang.String, java.text.ParsePosition):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return com.bamtech.shadow.gson.internal.bind.p049d.C2197a.m8534a(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw new com.bamtech.shadow.gson.C2237n(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r2.f6163a.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.Date m8313a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f6164b     // Catch:{ ParseException -> 0x000b }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x0026
        L_0x000b:
            java.text.DateFormat r0 = r2.f6163a     // Catch:{ ParseException -> 0x0013 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x0013:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x001f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x001f }
            java.util.Date r3 = com.bamtech.shadow.gson.internal.bind.p049d.C2197a.m8534a(r3, r0)     // Catch:{ ParseException -> 0x001f }
            monitor-exit(r2)
            return r3
        L_0x001f:
            r0 = move-exception
            com.bamtech.shadow.gson.n r1 = new com.bamtech.shadow.gson.n     // Catch:{ all -> 0x0009 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.bind.DateTypeAdapter.m8313a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public synchronized void mo11057a(C2252c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo11193h();
        } else {
            cVar.mo11192g(this.f6163a.format(date));
        }
    }
}
