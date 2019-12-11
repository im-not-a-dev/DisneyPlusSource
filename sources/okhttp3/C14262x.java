package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.p688d0.C14126e;
import okio.C14280f;

/* renamed from: okhttp3.x */
/* compiled from: RequestBody */
public abstract class C14262x {

    /* renamed from: okhttp3.x$a */
    /* compiled from: RequestBody */
    class C14263a extends C14262x {

        /* renamed from: a */
        final /* synthetic */ C14258u f31836a;

        /* renamed from: b */
        final /* synthetic */ int f31837b;

        /* renamed from: c */
        final /* synthetic */ byte[] f31838c;

        /* renamed from: d */
        final /* synthetic */ int f31839d;

        C14263a(C14258u uVar, int i, byte[] bArr, int i2) {
            this.f31836a = uVar;
            this.f31837b = i;
            this.f31838c = bArr;
            this.f31839d = i2;
        }

        /* renamed from: a */
        public long mo35741a() {
            return (long) this.f31837b;
        }

        /* renamed from: b */
        public C14258u mo35743b() {
            return this.f31836a;
        }

        /* renamed from: a */
        public void mo35742a(C14280f fVar) throws IOException {
            fVar.write(this.f31838c, this.f31839d, this.f31837b);
        }
    }

    /* renamed from: a */
    public static C14262x m45501a(C14258u uVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (uVar != null) {
            charset = uVar.mo36260a();
            if (charset == null) {
                charset = StandardCharsets.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(uVar);
                sb.append("; charset=utf-8");
                uVar = C14258u.m45482b(sb.toString());
            }
        }
        return m45502a(uVar, str.getBytes(charset));
    }

    /* renamed from: a */
    public abstract long mo35741a() throws IOException;

    /* renamed from: a */
    public abstract void mo35742a(C14280f fVar) throws IOException;

    /* renamed from: b */
    public abstract C14258u mo35743b();

    /* renamed from: c */
    public boolean mo36275c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo36276d() {
        return false;
    }

    /* renamed from: a */
    public static C14262x m45502a(C14258u uVar, byte[] bArr) {
        return m45503a(uVar, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C14262x m45503a(C14258u uVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C14126e.m44829a((long) bArr.length, (long) i, (long) i2);
            return new C14263a(uVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }
}
