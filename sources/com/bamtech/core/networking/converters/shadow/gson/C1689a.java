package com.bamtech.core.networking.converters.shadow.gson;

import com.bamtech.core.networking.converters.C1684a;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.gson.Gson;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import java.io.InputStream;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14258u;
import okio.BufferedSource;
import okio.C14287m;
import okio.C14302x;

/* renamed from: com.bamtech.core.networking.converters.shadow.gson.a */
/* compiled from: GsonConverter.kt */
public final class C1689a implements Converter, C1684a {

    /* renamed from: a */
    private final Gson f5883a;

    public C1689a(Gson gson) {
        this.f5883a = gson;
        C14258u.m45482b(DefaultLegalApi.MIME_TYPE_JSON);
    }

    /* renamed from: a */
    public <T> T mo7495a(String str, Class<?> cls) {
        return this.f5883a.mo11043a(str, cls);
    }

    public <T> T deserialize(String str, Type type) {
        return this.f5883a.mo11044a(str, type);
    }

    public <T> String serialize(T t) {
        String a = this.f5883a.mo11046a((Object) t);
        C12880j.m40222a((Object) a, "gson.toJson(model)");
        return a;
    }

    /* renamed from: a */
    public <T> T mo7496a(BufferedSource bufferedSource, Class<?> cls) {
        if (bufferedSource == null) {
            return null;
        }
        InputStream g0 = C14287m.m45716a((C14302x) bufferedSource).mo36334g0();
        C12880j.m40222a((Object) g0, "Okio.buffer(it).inputStream()");
        return mo7504a(g0, cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        kotlin.p580c0.C12724b.m39863a(r2, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo7504a(java.io.InputStream r2, java.lang.Class<?> r3) {
        /*
            r1 = this;
            com.bamtech.shadow.gson.Gson r0 = r1.f5883a
            com.bamtech.shadow.gson.p r3 = r0.mo11037a(r3)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0014 }
            r0.<init>(r2)     // Catch:{ all -> 0x0014 }
            java.lang.Object r3 = r3.mo11271a(r0)     // Catch:{ all -> 0x0014 }
            r0 = 0
            kotlin.p580c0.C12724b.m39863a(r2, r0)
            return r3
        L_0x0014:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.core.networking.converters.shadow.gson.C1689a.mo7504a(java.io.InputStream, java.lang.Class):java.lang.Object");
    }
}
