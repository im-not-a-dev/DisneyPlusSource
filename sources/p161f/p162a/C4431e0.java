package p161f.p162a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.appboy.p033s.C1557c;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import p161f.p162a.C4439f0.C4442c;
import p161f.p162a.C4439f0.C4444d;

/* renamed from: f.a.e0 */
public class C4431e0 {

    /* renamed from: b */
    private static final String f11016b = C1557c.m7461a(C4431e0.class);

    /* renamed from: a */
    private final C4439f0 f11017a;

    public C4431e0(File file, int i, int i2, long j) {
        this.f11017a = C4439f0.m15331a(file, i, i2, j);
    }

    /* renamed from: c */
    private String m15298c(String str) {
        return Integer.toString(str.hashCode());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo15514a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r7 = r6.m15298c(r7)
            r0 = 0
            f.a.f0 r1 = r6.f11017a     // Catch:{ all -> 0x001c }
            f.a.f0$d r1 = r1.mo15532a(r7)     // Catch:{ all -> 0x001c }
            r2 = 0
            java.io.InputStream r2 = r1.mo15547b(r2)     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            return r7
        L_0x001a:
            r2 = move-exception
            goto L_0x001e
        L_0x001c:
            r2 = move-exception
            r1 = r0
        L_0x001e:
            java.lang.String r3 = f11016b     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r4.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "Failed to get bitmap from disk cache for key "
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            r4.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0050 }
            com.appboy.p033s.C1557c.m7470c(r3, r4, r2)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            java.lang.String r1 = f11016b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load image from disk cache: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.appboy.p033s.C1557c.m7458a(r1, r7)
            return r0
        L_0x0050:
            r7 = move-exception
            if (r1 == 0) goto L_0x0056
            r1.close()
        L_0x0056:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4431e0.mo15514a(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public boolean mo15516b(String str) {
        String c = m15298c(str);
        boolean z = false;
        try {
            C4444d a = this.f11017a.mo15532a(c);
            if (a != null) {
                z = true;
            }
            if (a != null) {
                a.close();
            }
            return z;
        } catch (Throwable th) {
            String str2 = f11016b;
            StringBuilder sb = new StringBuilder();
            sb.append("Error while retrieving disk for key ");
            sb.append(c);
            C1557c.m7470c(str2, sb.toString(), th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo15515a(String str, Bitmap bitmap) {
        String str2;
        StringBuilder sb;
        String str3 = "Exception while closing disk cache output stream for key";
        String c = m15298c(str);
        OutputStream outputStream = null;
        try {
            C4442c b = this.f11017a.mo15534b(c);
            outputStream = b.mo15540a(0);
            bitmap.compress(CompressFormat.PNG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
            b.mo15541a();
            if (outputStream != null) {
                try {
                    outputStream.close();
                    return;
                } catch (IOException e) {
                    e = e;
                    str2 = f11016b;
                    sb = new StringBuilder();
                }
            } else {
                return;
            }
            sb.append(str3);
            sb.append(c);
            C1557c.m7470c(str2, sb.toString(), e);
        } catch (Throwable th) {
            String str4 = f11016b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error while producing output stream or compressing bitmap for key ");
            sb2.append(c);
            C1557c.m7470c(str4, sb2.toString(), th);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    e = e2;
                    str2 = f11016b;
                    sb = new StringBuilder();
                }
            }
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    String str5 = f11016b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    sb3.append(c);
                    C1557c.m7470c(str5, sb3.toString(), e3);
                }
            }
        }
    }
}
