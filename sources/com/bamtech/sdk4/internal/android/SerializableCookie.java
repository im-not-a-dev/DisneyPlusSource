package com.bamtech.sdk4.internal.android;

import java.io.Serializable;
import kotlin.Metadata;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/SerializableCookie;", "Ljava/io/Serializable;", "()V", "cookie", "Lokhttp3/Cookie;", "decode", "encodedCookie", "", "encode", "readObject", "", "stream", "Ljava/io/ObjectInputStream;", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SerializableCookie.kt */
public final class SerializableCookie implements Serializable {
    private transient Cookie cookie;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/SerializableCookie$Companion;", "", "()V", "NON_VALID_EXPIRES_AT", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SerializableCookie.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003f, code lost:
        kotlin.p580c0.C12724b.m39863a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0042, code lost:
        throw r1;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Cookie decode(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 8
            byte[] r5 = android.util.Base64.decode(r5, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            java.io.InputStream r1 = r0.mo36334g0()     // Catch:{ all -> 0x003c }
            r1.read(r5)     // Catch:{ all -> 0x003c }
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0029
            com.bamtech.sdk4.internal.android.SerializableCookie r1 = (com.bamtech.sdk4.internal.android.SerializableCookie) r1     // Catch:{ all -> 0x0031 }
            okhttp3.Cookie r1 = r1.cookie     // Catch:{ all -> 0x0031 }
            kotlin.p580c0.C12724b.m39863a(r2, r5)     // Catch:{  }
            kotlin.p580c0.C12724b.m39863a(r0, r5)     // Catch:{ IOException | ClassNotFoundException -> 0x0038 }
            return r1
        L_0x0029:
            kotlin.s r1 = new kotlin.s     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "null cannot be cast to non-null type com.bamtech.sdk4.internal.android.SerializableCookie"
            r1.<init>(r3)     // Catch:{ all -> 0x0031 }
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r3 = move-exception
            kotlin.p580c0.C12724b.m39863a(r2, r1)     // Catch:{  }
            throw r3     // Catch:{  }
        L_0x0038:
            kotlin.p580c0.C12724b.m39863a(r0, r5)
            return r5
        L_0x003c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.android.SerializableCookie.decode(java.lang.String):okhttp3.Cookie");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = kotlin.C13145v.f29587a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        kotlin.p580c0.C12724b.m39863a(r0, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        kotlin.p580c0.C12724b.m39863a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002e */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String encode(okhttp3.Cookie r5) {
        /*
            r4 = this;
            r4.cookie = r5
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            java.io.OutputStream r1 = r0.mo36316c()     // Catch:{ all -> 0x0034 }
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x002e }
            r3.<init>(r1)     // Catch:{ IOException -> 0x002e }
            r3.writeObject(r5)     // Catch:{ all -> 0x0027 }
            kotlin.v r5 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0027 }
            kotlin.p580c0.C12724b.m39863a(r3, r2)     // Catch:{ IOException -> 0x002e }
            byte[] r5 = r0.mo36287Y()     // Catch:{ IOException -> 0x002e }
            r1 = 8
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)     // Catch:{ IOException -> 0x002e }
            kotlin.p580c0.C12724b.m39863a(r0, r2)     // Catch:{  }
            return r5
        L_0x0027:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r3, r5)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            kotlin.v r5 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0034 }
            kotlin.p580c0.C12724b.m39863a(r0, r2)
            return r2
        L_0x0034:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            kotlin.p580c0.C12724b.m39863a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.android.SerializableCookie.encode(okhttp3.Cookie):java.lang.String");
    }
}
