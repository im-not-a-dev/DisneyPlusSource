package okhttp3.p688d0.p693k;

import okhttp3.p688d0.C14126e;
import okio.ByteString;

/* renamed from: okhttp3.d0.k.c */
/* compiled from: Header */
public final class C14180c {

    /* renamed from: d */
    public static final ByteString f31543d = ByteString.m45615e(":");

    /* renamed from: e */
    public static final ByteString f31544e = ByteString.m45615e(":status");

    /* renamed from: f */
    public static final ByteString f31545f = ByteString.m45615e(":method");

    /* renamed from: g */
    public static final ByteString f31546g = ByteString.m45615e(":path");

    /* renamed from: h */
    public static final ByteString f31547h = ByteString.m45615e(":scheme");

    /* renamed from: i */
    public static final ByteString f31548i = ByteString.m45615e(":authority");

    /* renamed from: a */
    public final ByteString f31549a;

    /* renamed from: b */
    public final ByteString f31550b;

    /* renamed from: c */
    final int f31551c;

    public C14180c(String str, String str2) {
        this(ByteString.m45615e(str), ByteString.m45615e(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14180c)) {
            return false;
        }
        C14180c cVar = (C14180c) obj;
        if (!this.f31549a.equals(cVar.f31549a) || !this.f31550b.equals(cVar.f31550b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f31549a.hashCode()) * 31) + this.f31550b.hashCode();
    }

    public String toString() {
        return C14126e.m44817a("%s: %s", this.f31549a.mo36394m(), this.f31550b.mo36394m());
    }

    public C14180c(ByteString byteString, String str) {
        this(byteString, ByteString.m45615e(str));
    }

    public C14180c(ByteString byteString, ByteString byteString2) {
        this.f31549a = byteString;
        this.f31550b = byteString2;
        this.f31551c = byteString.size() + 32 + byteString2.size();
    }
}
