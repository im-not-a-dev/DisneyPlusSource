package p602m.p613d.p627b.p637y;

/* renamed from: m.d.b.y.j */
/* compiled from: SHA512tDigest */
public class C13730j extends C13724d {

    /* renamed from: p */
    private int f30527p;

    /* renamed from: q */
    private long f30528q;

    /* renamed from: r */
    private long f30529r;

    /* renamed from: s */
    private long f30530s;

    /* renamed from: t */
    private long f30531t;

    /* renamed from: u */
    private long f30532u;

    /* renamed from: v */
    private long f30533v;

    /* renamed from: w */
    private long f30534w;

    /* renamed from: x */
    private long f30535x;

    public C13730j(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        } else if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        } else if (i != 384) {
            this.f30527p = i / 8;
            m42199a(this.f30527p * 8);
            reset();
        } else {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
    }

    /* renamed from: a */
    public String mo34971a() {
        StringBuilder sb = new StringBuilder();
        sb.append("SHA-512/");
        sb.append(Integer.toString(this.f30527p * 8));
        return sb.toString();
    }

    /* renamed from: b */
    public int mo34973b() {
        return this.f30527p;
    }

    public void reset() {
        super.reset();
        this.f30488e = this.f30528q;
        this.f30489f = this.f30529r;
        this.f30490g = this.f30530s;
        this.f30491h = this.f30531t;
        this.f30492i = this.f30532u;
        this.f30493j = this.f30533v;
        this.f30494k = this.f30534w;
        this.f30495l = this.f30535x;
    }

    /* renamed from: a */
    public int mo34970a(byte[] bArr, int i) {
        mo34990c();
        m42201a(this.f30488e, bArr, i, this.f30527p);
        m42201a(this.f30489f, bArr, i + 8, this.f30527p - 8);
        m42201a(this.f30490g, bArr, i + 16, this.f30527p - 16);
        m42201a(this.f30491h, bArr, i + 24, this.f30527p - 24);
        m42201a(this.f30492i, bArr, i + 32, this.f30527p - 32);
        m42201a(this.f30493j, bArr, i + 40, this.f30527p - 40);
        m42201a(this.f30494k, bArr, i + 48, this.f30527p - 48);
        m42201a(this.f30495l, bArr, i + 56, this.f30527p - 56);
        reset();
        return this.f30527p;
    }

    /* renamed from: a */
    private void m42199a(int i) {
        this.f30488e = -3482333909917012819L;
        this.f30489f = 2216346199247487646L;
        this.f30490g = -7364697282686394994L;
        this.f30491h = 65953792586715988L;
        this.f30492i = -816286391624063116L;
        this.f30493j = 4512832404995164602L;
        this.f30494k = -5033199132376557362L;
        this.f30495l = -124578254951840548L;
        mo34987a(83);
        mo34987a(72);
        mo34987a(65);
        mo34987a((byte) Framer.STDIN_FRAME_PREFIX);
        mo34987a(53);
        mo34987a((byte) Framer.STDOUT_FRAME_PREFIX);
        mo34987a((byte) Framer.STDERR_FRAME_PREFIX);
        mo34987a(47);
        if (i > 100) {
            mo34987a((byte) ((i / 100) + 48));
            int i2 = i % 100;
            mo34987a((byte) ((i2 / 10) + 48));
            mo34987a((byte) ((i2 % 10) + 48));
        } else if (i > 10) {
            mo34987a((byte) ((i / 10) + 48));
            mo34987a((byte) ((i % 10) + 48));
        } else {
            mo34987a((byte) (i + 48));
        }
        mo34990c();
        this.f30528q = this.f30488e;
        this.f30529r = this.f30489f;
        this.f30530s = this.f30490g;
        this.f30531t = this.f30491h;
        this.f30532u = this.f30492i;
        this.f30533v = this.f30493j;
        this.f30534w = this.f30494k;
        this.f30535x = this.f30495l;
    }

    /* renamed from: a */
    private static void m42201a(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            m42200a((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                m42200a((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    /* renamed from: a */
    private static void m42200a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(4, i3);
        while (true) {
            min--;
            if (min >= 0) {
                bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
            } else {
                return;
            }
        }
    }
}
