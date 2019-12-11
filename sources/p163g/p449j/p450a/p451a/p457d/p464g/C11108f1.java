package p163g.p449j.p450a.p451a.p457d.p464g;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3926a;

/* renamed from: g.j.a.a.d.g.f1 */
public final class C11108f1 implements C11164j1 {

    /* renamed from: f */
    static final Map<Uri, C11108f1> f26189f = new C3926a();

    /* renamed from: g */
    private static final String[] f26190g = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f26191a;

    /* renamed from: b */
    private final Uri f26192b;

    /* renamed from: c */
    private final Object f26193c = new Object();

    /* renamed from: d */
    private volatile Map<String, String> f26194d;

    /* renamed from: e */
    private final List<C11178k1> f26195e = new ArrayList();

    private C11108f1(ContentResolver contentResolver, Uri uri) {
        this.f26191a = contentResolver;
        this.f26192b = uri;
        this.f26191a.registerContentObserver(uri, false, new C11136h1(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p163g.p449j.p450a.p451a.p457d.p464g.C11108f1 m35126a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<g.j.a.a.d.g.f1> r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11108f1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, g.j.a.a.d.g.f1> r1 = f26189f     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            g.j.a.a.d.g.f1 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11108f1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            g.j.a.a.d.g.f1 r2 = new g.j.a.a.d.g.f1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, g.j.a.a.d.g.f1> r3 = f26189f     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11108f1.m35126a(android.content.ContentResolver, android.net.Uri):g.j.a.a.d.g.f1");
    }

    /* renamed from: d */
    private final Map<String, String> m35127d() {
        try {
            return (Map) C11213m1.m35728a(new C11150i1(this));
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo28507b() {
        synchronized (this.f26193c) {
            this.f26194d = null;
            C11283r1.m36018c();
        }
        synchronized (this) {
            for (C11178k1 a : this.f26195e) {
                a.mo28618a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo28508c() {
        Map map;
        Cursor query = this.f26191a.query(this.f26192b, f26190g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C3926a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo28506a() {
        Map<String, String> map = this.f26194d;
        if (map == null) {
            synchronized (this.f26193c) {
                map = this.f26194d;
                if (map == null) {
                    map = m35127d();
                    this.f26194d = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28505a(String str) {
        return (String) mo28506a().get(str);
    }
}
