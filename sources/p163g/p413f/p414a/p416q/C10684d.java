package p163g.p413f.p414a.p416q;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: g.f.a.q.d */
/* compiled from: GifHeaderParser */
public class C10684d {

    /* renamed from: a */
    private final byte[] f25266a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f25267b;

    /* renamed from: c */
    private C10683c f25268c;

    /* renamed from: d */
    private int f25269d = 0;

    /* renamed from: c */
    private boolean m33580c() {
        return this.f25268c.f25254b != 0;
    }

    /* renamed from: d */
    private int m33581d() {
        try {
            return this.f25267b.get() & 255;
        } catch (Exception unused) {
            this.f25268c.f25254b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m33582e() {
        this.f25268c.f25256d.f25242a = m33589l();
        this.f25268c.f25256d.f25243b = m33589l();
        this.f25268c.f25256d.f25244c = m33589l();
        this.f25268c.f25256d.f25245d = m33589l();
        int d = m33581d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C10682b bVar = this.f25268c.f25256d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f25246e = z;
        if (z2) {
            this.f25268c.f25256d.f25252k = m33578a(pow);
        } else {
            this.f25268c.f25256d.f25252k = null;
        }
        this.f25268c.f25256d.f25251j = this.f25267b.position();
        m33592o();
        if (!m33580c()) {
            C10683c cVar = this.f25268c;
            cVar.f25255c++;
            cVar.f25257e.add(cVar.f25256d);
        }
    }

    /* renamed from: f */
    private void m33583f() {
        this.f25269d = m33581d();
        if (this.f25269d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f25269d) {
                try {
                    i2 = this.f25269d - i;
                    this.f25267b.get(this.f25266a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    String str = "GifHeaderParser";
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f25269d);
                        Log.d(str, sb.toString(), e);
                    }
                    this.f25268c.f25254b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m33584g() {
        m33579b(Integer.MAX_VALUE);
    }

    /* renamed from: h */
    private void m33585h() {
        m33581d();
        int d = m33581d();
        C10682b bVar = this.f25268c.f25256d;
        bVar.f25248g = (d & 28) >> 2;
        boolean z = true;
        if (bVar.f25248g == 0) {
            bVar.f25248g = 1;
        }
        C10682b bVar2 = this.f25268c.f25256d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f25247f = z;
        int l = m33589l();
        if (l < 2) {
            l = 10;
        }
        C10682b bVar3 = this.f25268c.f25256d;
        bVar3.f25250i = l * 10;
        bVar3.f25249h = m33581d();
        m33581d();
    }

    /* renamed from: i */
    private void m33586i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m33581d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f25268c.f25254b = 1;
            return;
        }
        m33587j();
        if (this.f25268c.f25260h && !m33580c()) {
            C10683c cVar = this.f25268c;
            cVar.f25253a = m33578a(cVar.f25261i);
            C10683c cVar2 = this.f25268c;
            cVar2.f25264l = cVar2.f25253a[cVar2.f25262j];
        }
    }

    /* renamed from: j */
    private void m33587j() {
        this.f25268c.f25258f = m33589l();
        this.f25268c.f25259g = m33589l();
        int d = m33581d();
        this.f25268c.f25260h = (d & 128) != 0;
        this.f25268c.f25261i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f25268c.f25262j = m33581d();
        this.f25268c.f25263k = m33581d();
    }

    /* renamed from: k */
    private void m33588k() {
        do {
            m33583f();
            byte[] bArr = this.f25266a;
            if (bArr[0] == 1) {
                this.f25268c.f25265m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f25269d <= 0) {
                return;
            }
        } while (!m33580c());
    }

    /* renamed from: l */
    private int m33589l() {
        return this.f25267b.getShort();
    }

    /* renamed from: m */
    private void m33590m() {
        this.f25267b = null;
        Arrays.fill(this.f25266a, 0);
        this.f25268c = new C10683c();
        this.f25269d = 0;
    }

    /* renamed from: n */
    private void m33591n() {
        int d;
        do {
            d = m33581d();
            this.f25267b.position(Math.min(this.f25267b.position() + d, this.f25267b.limit()));
        } while (d > 0);
    }

    /* renamed from: o */
    private void m33592o() {
        m33581d();
        m33591n();
    }

    /* renamed from: a */
    public C10684d mo27616a(ByteBuffer byteBuffer) {
        m33590m();
        this.f25267b = byteBuffer.asReadOnlyBuffer();
        this.f25267b.position(0);
        this.f25267b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: b */
    public C10683c mo27618b() {
        if (this.f25267b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m33580c()) {
            return this.f25268c;
        } else {
            m33586i();
            if (!m33580c()) {
                m33584g();
                C10683c cVar = this.f25268c;
                if (cVar.f25255c < 0) {
                    cVar.f25254b = 1;
                }
            }
            return this.f25268c;
        }
    }

    /* renamed from: a */
    public void mo27617a() {
        this.f25267b = null;
        this.f25268c = null;
    }

    /* renamed from: a */
    private int[] m33578a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f25267b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String str = "GifHeaderParser";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Format Error Reading Color Table", e);
            }
            this.f25268c.f25254b = 1;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m33579b(int i) {
        boolean z = false;
        while (!z && !m33580c() && this.f25268c.f25255c <= i) {
            int d = m33581d();
            if (d == 33) {
                int d2 = m33581d();
                if (d2 == 1) {
                    m33591n();
                } else if (d2 == 249) {
                    this.f25268c.f25256d = new C10682b();
                    m33585h();
                } else if (d2 == 254) {
                    m33591n();
                } else if (d2 != 255) {
                    m33591n();
                } else {
                    m33583f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f25266a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m33588k();
                    } else {
                        m33591n();
                    }
                }
            } else if (d == 44) {
                C10683c cVar = this.f25268c;
                if (cVar.f25256d == null) {
                    cVar.f25256d = new C10682b();
                }
                m33582e();
            } else if (d != 59) {
                this.f25268c.f25254b = 1;
            } else {
                z = true;
            }
        }
    }
}
