package p161f.p162a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p161f.p162a.C4439f0.C4442c;

/* renamed from: f.a.g0 */
final class C4452g0 {

    /* renamed from: a */
    final String f11059a;

    /* renamed from: b */
    final long[] f11060b;

    /* renamed from: c */
    boolean f11061c;

    /* renamed from: d */
    C4442c f11062d;

    /* renamed from: e */
    long f11063e;

    /* renamed from: f */
    private int f11064f;

    /* renamed from: g */
    private File f11065g;

    C4452g0(String str, int i, File file) {
        this.f11059a = str;
        this.f11064f = i;
        this.f11065g = file;
        this.f11060b = new long[i];
    }

    /* renamed from: a */
    public String mo15562a() {
        long[] jArr;
        StringBuilder sb = new StringBuilder();
        for (long j : this.f11060b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public IOException mo15565b(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected journal line: ");
        sb.append(Arrays.toString(strArr));
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    public File mo15564b(int i) {
        File file = this.f11065g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11059a);
        sb.append(".");
        sb.append(i);
        sb.append(".tmp");
        return new File(file, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15563a(String[] strArr) {
        if (strArr.length == this.f11064f) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f11060b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    mo15565b(strArr);
                    throw null;
                }
            }
            return;
        }
        mo15565b(strArr);
        throw null;
    }

    /* renamed from: a */
    public File mo15561a(int i) {
        File file = this.f11065g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11059a);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }
}
