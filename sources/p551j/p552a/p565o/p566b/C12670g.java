package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p441i.p442a.p443a.C10897a;
import p163g.p441i.p442a.p443a.C10903f;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.o.b.g */
/* compiled from: SentryJsonGenerator */
public class C12670g extends C10903f {

    /* renamed from: Z */
    private static final C13459b f29358Z = C13460c.m41415a(C12677b.class);

    /* renamed from: U */
    private int f29359U = 10;

    /* renamed from: V */
    private int f29360V = 400;

    /* renamed from: W */
    private int f29361W = 50;

    /* renamed from: X */
    private int f29362X = 3;

    /* renamed from: Y */
    private C10903f f29363Y;

    public C12670g(C10903f fVar) {
        this.f29363Y = fVar;
    }

    /* renamed from: a */
    private void m39732a(Object obj, int i) throws IOException {
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            while (i2 < bArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28053b((int) bArr[i2]);
                i2++;
            }
            if (bArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i2 < sArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28053b((int) sArr[i2]);
                i2++;
            }
            if (sArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i2 < iArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28053b(iArr[i2]);
                i2++;
            }
            if (iArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i2 < jArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28039a(jArr[i2]);
                i2++;
            }
            if (jArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i2 < fArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28038a(fArr[i2]);
                i2++;
            }
            if (fArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i2 < dArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28037a(dArr[i2]);
                i2++;
            }
            if (dArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i2 < cArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28066j(String.valueOf(cArr[i2]));
                i2++;
            }
            if (cArr.length > this.f29359U) {
                m39734g();
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i2 < zArr.length && i2 < this.f29359U) {
                this.f29363Y.mo28050a(zArr[i2]);
                i2++;
            }
            if (zArr.length > this.f29359U) {
                m39734g();
            }
        } else {
            Object[] objArr = (Object[]) obj;
            while (i2 < objArr.length && i2 < this.f29359U) {
                m39733b(objArr[i2], i + 1);
                i2++;
            }
            if (objArr.length > this.f29359U) {
                m39734g();
            }
        }
    }

    /* renamed from: g */
    private void m39734g() throws IOException {
        this.f29363Y.mo28066j("...");
    }

    /* renamed from: b */
    public void mo28054b(Object obj) throws IOException {
        m39733b(obj, 0);
    }

    /* renamed from: c */
    public void mo28055c() throws IOException {
        this.f29363Y.mo28055c();
    }

    public void close() throws IOException {
        this.f29363Y.close();
    }

    /* renamed from: d */
    public void mo28057d() throws IOException {
        this.f29363Y.mo28057d();
    }

    /* renamed from: e */
    public void mo28058e() throws IOException {
        this.f29363Y.mo28058e();
    }

    /* renamed from: f */
    public void mo28060f() throws IOException {
        this.f29363Y.mo28060f();
    }

    public void flush() throws IOException {
        this.f29363Y.flush();
    }

    /* renamed from: j */
    public void mo28066j(String str) throws IOException {
        this.f29363Y.mo28066j(str);
    }

    /* renamed from: b */
    private void m39733b(Object obj, int i) throws IOException {
        if (i >= this.f29362X) {
            this.f29363Y.mo28066j("<recursion limit hit>");
            return;
        }
        if (obj == null) {
            this.f29363Y.mo28057d();
        } else if (obj.getClass().isArray()) {
            this.f29363Y.mo28058e();
            m39732a(obj, i);
            this.f29363Y.mo28052b();
        } else {
            int i2 = 0;
            if (obj instanceof Map) {
                this.f29363Y.mo28060f();
                for (Entry entry : ((Map) obj).entrySet()) {
                    if (i2 >= this.f29361W) {
                        break;
                    }
                    if (entry.getKey() == null) {
                        this.f29363Y.mo28063g("null");
                    } else {
                        this.f29363Y.mo28063g(C12677b.m39768a(entry.getKey().toString(), this.f29360V));
                    }
                    m39733b(entry.getValue(), i + 1);
                    i2++;
                }
                this.f29363Y.mo28055c();
            } else if (obj instanceof Collection) {
                this.f29363Y.mo28058e();
                Iterator it = ((Collection) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (i2 >= this.f29359U) {
                        m39734g();
                        break;
                    } else {
                        m39733b(next, i + 1);
                        i2++;
                    }
                }
                this.f29363Y.mo28052b();
            } else if (obj instanceof String) {
                this.f29363Y.mo28066j(C12677b.m39768a((String) obj, this.f29360V));
            } else {
                try {
                    this.f29363Y.mo28054b(obj);
                } catch (IllegalStateException unused) {
                    f29358Z.mo34722a("Couldn't marshal '{}' of type '{}', had to be converted into a String", obj, obj.getClass());
                    try {
                        this.f29363Y.mo28066j(C12677b.m39768a(obj.toString(), this.f29360V));
                    } catch (Exception unused2) {
                        this.f29363Y.mo28066j("<exception calling toString on object>");
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo28063g(String str) throws IOException {
        this.f29363Y.mo28063g(str);
    }

    /* renamed from: b */
    public void mo28052b() throws IOException {
        this.f29363Y.mo28052b();
    }

    /* renamed from: b */
    public void mo28053b(int i) throws IOException {
        this.f29363Y.mo28053b(i);
    }

    /* renamed from: a */
    public void mo28040a(C10897a aVar, byte[] bArr, int i, int i2) throws IOException {
        this.f29363Y.mo28040a(aVar, bArr, i, i2);
    }

    /* renamed from: a */
    public void mo28039a(long j) throws IOException {
        this.f29363Y.mo28039a(j);
    }

    /* renamed from: a */
    public void mo28048a(BigInteger bigInteger) throws IOException {
        this.f29363Y.mo28048a(bigInteger);
    }

    /* renamed from: a */
    public void mo28037a(double d) throws IOException {
        this.f29363Y.mo28037a(d);
    }

    /* renamed from: a */
    public void mo28038a(float f) throws IOException {
        this.f29363Y.mo28038a(f);
    }

    /* renamed from: a */
    public void mo28047a(BigDecimal bigDecimal) throws IOException {
        this.f29363Y.mo28047a(bigDecimal);
    }

    /* renamed from: a */
    public void mo28050a(boolean z) throws IOException {
        this.f29363Y.mo28050a(z);
    }
}
