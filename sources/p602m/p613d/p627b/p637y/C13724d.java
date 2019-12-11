package p602m.p613d.p627b.p637y;

import p602m.p613d.p627b.C13711o;
import p602m.p613d.p683g.C14086g;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.d */
/* compiled from: LongDigest */
public abstract class C13724d implements C13711o, C14086g, C13721a {

    /* renamed from: o */
    static final long[] f30483o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a */
    private byte[] f30484a = new byte[8];

    /* renamed from: b */
    private int f30485b = 0;

    /* renamed from: c */
    private long f30486c;

    /* renamed from: d */
    private long f30487d;

    /* renamed from: e */
    protected long f30488e;

    /* renamed from: f */
    protected long f30489f;

    /* renamed from: g */
    protected long f30490g;

    /* renamed from: h */
    protected long f30491h;

    /* renamed from: i */
    protected long f30492i;

    /* renamed from: j */
    protected long f30493j;

    /* renamed from: k */
    protected long f30494k;

    /* renamed from: l */
    protected long f30495l;

    /* renamed from: m */
    private long[] f30496m = new long[80];

    /* renamed from: n */
    private int f30497n;

    protected C13724d() {
        reset();
    }

    /* renamed from: a */
    private long m42147a(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    /* renamed from: a */
    private long m42148a(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    /* renamed from: b */
    private long m42149b(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    /* renamed from: b */
    private long m42150b(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* renamed from: c */
    private long m42151c(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* renamed from: d */
    private long m42152d(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    /* renamed from: e */
    private void m42153e() {
        long j = this.f30486c;
        if (j > 2305843009213693951L) {
            this.f30487d += j >>> 61;
            this.f30486c = j & 2305843009213693951L;
        }
    }

    /* renamed from: a */
    public void mo34987a(byte b) {
        byte[] bArr = this.f30484a;
        int i = this.f30485b;
        this.f30485b = i + 1;
        bArr[i] = b;
        if (this.f30485b == bArr.length) {
            mo34989b(bArr, 0);
            this.f30485b = 0;
        }
        this.f30486c++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34989b(byte[] bArr, int i) {
        this.f30496m[this.f30497n] = C14087h.m44476b(bArr, i);
        int i2 = this.f30497n + 1;
        this.f30497n = i2;
        if (i2 == 16) {
            mo34991d();
        }
    }

    /* renamed from: c */
    public void mo34990c() {
        m42153e();
        long j = this.f30486c << 3;
        long j2 = this.f30487d;
        mo34987a(Byte.MIN_VALUE);
        while (this.f30485b != 0) {
            mo34987a(0);
        }
        mo34988a(j, j2);
        mo34991d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34991d() {
        m42153e();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f30496m;
            long b = m42149b(jArr[i - 2]);
            long[] jArr2 = this.f30496m;
            jArr[i] = b + jArr2[i - 7] + m42147a(jArr2[i - 15]) + this.f30496m[i - 16];
        }
        long j = this.f30488e;
        long j2 = this.f30489f;
        long j3 = this.f30490g;
        long j4 = this.f30491h;
        long j5 = this.f30492i;
        long j6 = this.f30493j;
        long j7 = j4;
        long j8 = this.f30494k;
        long j9 = j;
        long j10 = this.f30495l;
        long j11 = j8;
        long j12 = j6;
        int i2 = 0;
        int i3 = 0;
        long j13 = j2;
        long j14 = j5;
        long j15 = j9;
        long j16 = j7;
        long j17 = j3;
        long j18 = j14;
        while (i2 < 10) {
            long j19 = j18;
            int i4 = i3 + 1;
            long d = j10 + m42152d(j18) + m42148a(j18, j12, j11) + f30483o[i3] + this.f30496m[i3];
            long j20 = j15;
            long j21 = j16 + d;
            long c = d + m42151c(j15) + m42150b(j15, j13, j17);
            long j22 = j21;
            long j23 = c;
            int i5 = i4 + 1;
            long d2 = j11 + m42152d(j21) + m42148a(j21, j19, j12) + f30483o[i4] + this.f30496m[i4];
            int i6 = i2;
            long j24 = j23;
            long j25 = j17 + d2;
            int i7 = i5 + 1;
            long d3 = j12 + m42152d(j25) + m42148a(j25, j22, j19) + f30483o[i5] + this.f30496m[i5];
            long j26 = j13 + d3;
            long c2 = d2 + m42151c(j23) + m42150b(j23, j20, j13);
            long j27 = c2;
            long c3 = d3 + m42151c(c2) + m42150b(c2, j24, j20);
            long j28 = j26;
            long j29 = c3;
            int i8 = i7 + 1;
            long d4 = j19 + m42152d(j26) + m42148a(j26, j25, j22) + f30483o[i7] + this.f30496m[i7];
            long j30 = j29;
            long j31 = j20 + d4;
            long j32 = j31;
            long c4 = d4 + m42151c(j29) + m42150b(j29, j27, j24);
            int i9 = i8 + 1;
            long d5 = j22 + m42152d(j31) + m42148a(j31, j28, j25) + f30483o[i8] + this.f30496m[i8];
            long j33 = j24 + d5;
            long c5 = m42151c(c4);
            long j34 = c4;
            long j35 = j33;
            long b2 = d5 + c5 + m42150b(c4, j30, j27);
            int i10 = i9 + 1;
            long d6 = j25 + m42152d(j35) + m42148a(j35, j32, j28) + f30483o[i9] + this.f30496m[i9];
            long j36 = j27 + d6;
            long j37 = b2;
            long j38 = j36;
            long c6 = d6 + m42151c(b2) + m42150b(b2, j34, j30);
            int i11 = i10 + 1;
            long d7 = j28 + m42152d(j38) + m42148a(j38, j35, j32) + f30483o[i10] + this.f30496m[i10];
            long j39 = j30 + d7;
            long c7 = m42151c(c6);
            long j40 = c6;
            long j41 = j39;
            long b3 = d7 + c7 + m42150b(c6, j37, j34);
            long d8 = m42152d(j41);
            j12 = j41;
            long j42 = b3;
            long a = j32 + d8 + m42148a(j41, j38, j35) + f30483o[i11] + this.f30496m[i11];
            long c8 = a + m42151c(j42) + m42150b(j42, j40, j37);
            j18 = j34 + a;
            j16 = j37;
            j17 = j40;
            j10 = j35;
            j11 = j38;
            j15 = c8;
            j13 = j42;
            i3 = i11 + 1;
            i2 = i6 + 1;
        }
        long j43 = j18;
        this.f30488e += j15;
        this.f30489f += j13;
        this.f30490g += j17;
        this.f30491h += j16;
        this.f30492i += j43;
        this.f30493j += j12;
        this.f30494k += j11;
        this.f30495l += j10;
        this.f30497n = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.f30496m[i12] = 0;
        }
    }

    public void reset() {
        this.f30486c = 0;
        this.f30487d = 0;
        int i = 0;
        this.f30485b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f30484a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f30497n = 0;
        while (true) {
            long[] jArr = this.f30496m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo34972a(byte[] bArr, int i, int i2) {
        while (this.f30485b != 0 && i2 > 0) {
            mo34987a(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f30484a.length) {
            mo34989b(bArr, i);
            byte[] bArr2 = this.f30484a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f30486c += (long) bArr2.length;
        }
        while (i2 > 0) {
            mo34987a(bArr[i]);
            i++;
            i2--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34988a(long j, long j2) {
        if (this.f30497n > 14) {
            mo34991d();
        }
        long[] jArr = this.f30496m;
        jArr[14] = j2;
        jArr[15] = j;
    }
}
