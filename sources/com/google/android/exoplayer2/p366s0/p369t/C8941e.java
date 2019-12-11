package com.google.android.exoplayer2.p366s0.p369t;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.p361p0.C8825g;
import com.google.android.exoplayer2.p366s0.C8907b;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9564r;
import com.google.android.exoplayer2.p393v0.C9568u;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.joda.time.DateTimeConstants;

/* renamed from: com.google.android.exoplayer2.s0.t.e */
/* compiled from: MatroskaExtractor */
public class C8941e implements C8912g {

    /* renamed from: Z */
    private static final byte[] f19236Z = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    private static final byte[] f19237a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final byte[] f19238b0 = Util.m29447d("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: c0 */
    private static final byte[] f19239c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: d0 */
    private static final byte[] f19240d0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final UUID f19241e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f19242A;

    /* renamed from: B */
    private C9564r f19243B;

    /* renamed from: C */
    private C9564r f19244C;

    /* renamed from: D */
    private boolean f19245D;

    /* renamed from: E */
    private int f19246E;

    /* renamed from: F */
    private long f19247F;

    /* renamed from: G */
    private long f19248G;

    /* renamed from: H */
    private int f19249H;

    /* renamed from: I */
    private int f19250I;

    /* renamed from: J */
    private int[] f19251J;

    /* renamed from: K */
    private int f19252K;

    /* renamed from: L */
    private int f19253L;

    /* renamed from: M */
    private int f19254M;

    /* renamed from: N */
    private int f19255N;

    /* renamed from: O */
    private boolean f19256O;

    /* renamed from: P */
    private boolean f19257P;

    /* renamed from: Q */
    private boolean f19258Q;

    /* renamed from: R */
    private boolean f19259R;

    /* renamed from: S */
    private byte f19260S;

    /* renamed from: T */
    private int f19261T;

    /* renamed from: U */
    private int f19262U;

    /* renamed from: V */
    private int f19263V;

    /* renamed from: W */
    private boolean f19264W;

    /* renamed from: X */
    private boolean f19265X;

    /* renamed from: Y */
    private C8914i f19266Y;

    /* renamed from: a */
    private final C8940d f19267a;

    /* renamed from: b */
    private final C8947g f19268b;

    /* renamed from: c */
    private final SparseArray<C8944c> f19269c;

    /* renamed from: d */
    private final boolean f19270d;

    /* renamed from: e */
    private final C9572w f19271e;

    /* renamed from: f */
    private final C9572w f19272f;

    /* renamed from: g */
    private final C9572w f19273g;

    /* renamed from: h */
    private final C9572w f19274h;

    /* renamed from: i */
    private final C9572w f19275i;

    /* renamed from: j */
    private final C9572w f19276j;

    /* renamed from: k */
    private final C9572w f19277k;

    /* renamed from: l */
    private final C9572w f19278l;

    /* renamed from: m */
    private final C9572w f19279m;

    /* renamed from: n */
    private ByteBuffer f19280n;

    /* renamed from: o */
    private long f19281o;

    /* renamed from: p */
    private long f19282p;

    /* renamed from: q */
    private long f19283q;

    /* renamed from: r */
    private long f19284r;

    /* renamed from: s */
    private long f19285s;

    /* renamed from: t */
    private C8944c f19286t;

    /* renamed from: u */
    private boolean f19287u;

    /* renamed from: v */
    private int f19288v;

    /* renamed from: w */
    private long f19289w;

    /* renamed from: x */
    private boolean f19290x;

    /* renamed from: y */
    private long f19291y;

    /* renamed from: z */
    private long f19292z;

    /* renamed from: com.google.android.exoplayer2.s0.t.e$b */
    /* compiled from: MatroskaExtractor */
    private final class C8943b implements C8939c {
        private C8943b() {
        }

        /* renamed from: a */
        public void mo23337a(int i, long j, long j2) throws C8723g0 {
            C8941e.this.mo23345a(i, j, j2);
        }

        /* renamed from: b */
        public int mo23339b(int i) {
            return C8941e.this.mo23347b(i);
        }

        /* renamed from: c */
        public boolean mo23340c(int i) {
            return C8941e.this.mo23348c(i);
        }

        /* renamed from: a */
        public void mo23333a(int i) throws C8723g0 {
            C8941e.this.mo23341a(i);
        }

        /* renamed from: a */
        public void mo23336a(int i, long j) throws C8723g0 {
            C8941e.this.mo23344a(i, j);
        }

        /* renamed from: a */
        public void mo23334a(int i, double d) throws C8723g0 {
            C8941e.this.mo23342a(i, d);
        }

        /* renamed from: a */
        public void mo23338a(int i, String str) throws C8723g0 {
            C8941e.this.mo23346a(i, str);
        }

        /* renamed from: a */
        public void mo23335a(int i, int i2, C8913h hVar) throws IOException, InterruptedException {
            C8941e.this.mo23343a(i, i2, hVar);
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.t.e$c */
    /* compiled from: MatroskaExtractor */
    private static final class C8944c {

        /* renamed from: A */
        public int f19294A;

        /* renamed from: B */
        public float f19295B;

        /* renamed from: C */
        public float f19296C;

        /* renamed from: D */
        public float f19297D;

        /* renamed from: E */
        public float f19298E;

        /* renamed from: F */
        public float f19299F;

        /* renamed from: G */
        public float f19300G;

        /* renamed from: H */
        public float f19301H;

        /* renamed from: I */
        public float f19302I;

        /* renamed from: J */
        public float f19303J;

        /* renamed from: K */
        public float f19304K;

        /* renamed from: L */
        public int f19305L;

        /* renamed from: M */
        public int f19306M;

        /* renamed from: N */
        public int f19307N;

        /* renamed from: O */
        public long f19308O;

        /* renamed from: P */
        public long f19309P;

        /* renamed from: Q */
        public C8945d f19310Q;

        /* renamed from: R */
        public boolean f19311R;

        /* renamed from: S */
        public boolean f19312S;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public String f19313T;

        /* renamed from: U */
        public C8924q f19314U;

        /* renamed from: V */
        public int f19315V;

        /* renamed from: a */
        public String f19316a;

        /* renamed from: b */
        public String f19317b;

        /* renamed from: c */
        public int f19318c;

        /* renamed from: d */
        public int f19319d;

        /* renamed from: e */
        public int f19320e;

        /* renamed from: f */
        public boolean f19321f;

        /* renamed from: g */
        public byte[] f19322g;

        /* renamed from: h */
        public C8925a f19323h;

        /* renamed from: i */
        public byte[] f19324i;

        /* renamed from: j */
        public DrmInitData f19325j;

        /* renamed from: k */
        public int f19326k;

        /* renamed from: l */
        public int f19327l;

        /* renamed from: m */
        public int f19328m;

        /* renamed from: n */
        public int f19329n;

        /* renamed from: o */
        public int f19330o;

        /* renamed from: p */
        public int f19331p;

        /* renamed from: q */
        public float f19332q;

        /* renamed from: r */
        public float f19333r;

        /* renamed from: s */
        public float f19334s;

        /* renamed from: t */
        public byte[] f19335t;

        /* renamed from: u */
        public int f19336u;

        /* renamed from: v */
        public boolean f19337v;

        /* renamed from: w */
        public int f19338w;

        /* renamed from: x */
        public int f19339x;

        /* renamed from: y */
        public int f19340y;

        /* renamed from: z */
        public int f19341z;

        private C8944c() {
            this.f19326k = -1;
            this.f19327l = -1;
            this.f19328m = -1;
            this.f19329n = -1;
            this.f19330o = 0;
            this.f19331p = -1;
            this.f19332q = 0.0f;
            this.f19333r = 0.0f;
            this.f19334s = 0.0f;
            this.f19335t = null;
            this.f19336u = -1;
            this.f19337v = false;
            this.f19338w = -1;
            this.f19339x = -1;
            this.f19340y = -1;
            this.f19341z = 1000;
            this.f19294A = HttpStatus.HTTP_OK;
            this.f19295B = -1.0f;
            this.f19296C = -1.0f;
            this.f19297D = -1.0f;
            this.f19298E = -1.0f;
            this.f19299F = -1.0f;
            this.f19300G = -1.0f;
            this.f19301H = -1.0f;
            this.f19302I = -1.0f;
            this.f19303J = -1.0f;
            this.f19304K = -1.0f;
            this.f19305L = 1;
            this.f19306M = -1;
            this.f19307N = 8000;
            this.f19308O = 0;
            this.f19309P = 0;
            this.f19312S = true;
            this.f19313T = "eng";
        }

        /* renamed from: c */
        private byte[] m26297c() {
            if (this.f19295B == -1.0f || this.f19296C == -1.0f || this.f19297D == -1.0f || this.f19298E == -1.0f || this.f19299F == -1.0f || this.f19300G == -1.0f || this.f19301H == -1.0f || this.f19302I == -1.0f || this.f19303J == -1.0f || this.f19304K == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put(0);
            wrap.putShort((short) ((int) ((this.f19295B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19296C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19297D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19298E * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19299F * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19300G * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19301H * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f19302I * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.f19303J + 0.5f)));
            wrap.putShort((short) ((int) (this.f19304K + 0.5f)));
            wrap.putShort((short) this.f19341z);
            wrap.putShort((short) this.f19294A);
            return bArr;
        }

        /* renamed from: b */
        public void mo23351b() {
            C8945d dVar = this.f19310Q;
            if (dVar != null) {
                dVar.mo23352a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01de, code lost:
            r23 = r1;
            r1 = r11;
            r3 = null;
            r20 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x022e, code lost:
            r1 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x025b, code lost:
            r3 = null;
            r20 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d4, code lost:
            r20 = -1;
            r23 = -1;
            r31 = r3;
            r3 = r1;
            r1 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x031e, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x031f, code lost:
            r20 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0321, code lost:
            r23 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0323, code lost:
            r11 = r0.f19312S | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0328, code lost:
            if (r0.f19311R == false) goto L_0x032c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x032a, code lost:
            r12 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x032c, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x032d, code lost:
            r11 = r11 | r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0332, code lost:
            if (com.google.android.exoplayer2.p393v0.C9566t.m29517j(r1) == false) goto L_0x0359;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0334, code lost:
            r1 = com.google.android.exoplayer2.Format.m24874a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r20, r0.f19305L, r0.f19307N, r23, r3, r0.f19325j, r11 ? 1 : 0, r0.f19313T);
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x035d, code lost:
            if (com.google.android.exoplayer2.p393v0.C9566t.m29519l(r1) == false) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0361, code lost:
            if (r0.f19330o != 0) goto L_0x0373;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0363, code lost:
            r2 = r0.f19328m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0365, code lost:
            if (r2 != -1) goto L_0x0369;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0367, code lost:
            r2 = r0.f19326k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0369, code lost:
            r0.f19328m = r2;
            r2 = r0.f19329n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x036d, code lost:
            if (r2 != -1) goto L_0x0371;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x036f, code lost:
            r2 = r0.f19327l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0371, code lost:
            r0.f19329n = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0373, code lost:
            r4 = r0.f19328m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0377, code lost:
            if (r4 == -1) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0379, code lost:
            r7 = r0.f19329n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x037b, code lost:
            if (r7 == -1) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x037d, code lost:
            r26 = ((float) (r0.f19327l * r4)) / ((float) (r0.f19326k * r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x038b, code lost:
            r26 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x038f, code lost:
            if (r0.f19337v == false) goto L_0x03a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0391, code lost:
            r15 = new com.google.android.exoplayer2.p394w0.C9586i(r0.f19338w, r0.f19340y, r0.f19339x, m26297c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a0, code lost:
            r29 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03aa, code lost:
            if ("htc_video_rotA-000".equals(r0.f19316a) == false) goto L_0x03ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ac, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b6, code lost:
            if ("htc_video_rotA-090".equals(r0.f19316a) == false) goto L_0x03bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b8, code lost:
            r2 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c3, code lost:
            if ("htc_video_rotA-180".equals(r0.f19316a) == false) goto L_0x03c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c5, code lost:
            r2 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d0, code lost:
            if ("htc_video_rotA-270".equals(r0.f19316a) == false) goto L_0x03d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d2, code lost:
            r2 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d5, code lost:
            r2 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d8, code lost:
            if (r0.f19331p != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e1, code lost:
            if (java.lang.Float.compare(r0.f19332q, 0.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e9, code lost:
            if (java.lang.Float.compare(r0.f19333r, 0.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f1, code lost:
            if (java.lang.Float.compare(r0.f19334s, 0.0f) != 0) goto L_0x03f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f3, code lost:
            r25 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x03fe, code lost:
            if (java.lang.Float.compare(r0.f19333r, 90.0f) != 0) goto L_0x0405;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0400, code lost:
            r25 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x040d, code lost:
            if (java.lang.Float.compare(r0.f19333r, -180.0f) == 0) goto L_0x0429;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0417, code lost:
            if (java.lang.Float.compare(r0.f19333r, 180.0f) != 0) goto L_0x041a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0422, code lost:
            if (java.lang.Float.compare(r0.f19333r, -90.0f) != 0) goto L_0x042e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0424, code lost:
            r25 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0429, code lost:
            r25 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x042e, code lost:
            r25 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0430, code lost:
            r1 = com.google.android.exoplayer2.Format.m24872a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r20, r0.f19326k, r0.f19327l, -1.0f, r3, r25, r26, r0.f19335t, r0.f19336u, r29, r0.f19325j);
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x045d, code lost:
            if (r10.equals(r1) == false) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x045f, code lost:
            r1 = com.google.android.exoplayer2.Format.m24869a(java.lang.Integer.toString(r34), r1, r11 ? 1 : 0, r0.f19313T, r0.f19325j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0471, code lost:
            if (r9.equals(r1) == false) goto L_0x04a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0473, code lost:
            r2 = new java.util.ArrayList(2);
            r2.add(com.google.android.exoplayer2.p366s0.p369t.C8941e.m26267b());
            r2.add(r0.f19324i);
            r1 = com.google.android.exoplayer2.Format.m24876a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r11 ? 1 : 0, r0.f19313T, -1, r0.f19325j, Long.MAX_VALUE, (java.util.List<byte[]>) r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04aa, code lost:
            if (r2.equals(r1) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b2, code lost:
            if ("application/pgs".equals(r1) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ba, code lost:
            if ("application/dvbsubs".equals(r1) == false) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x04c4, code lost:
            throw new com.google.android.exoplayer2.C8723g0("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x04c5, code lost:
            r1 = com.google.android.exoplayer2.Format.m24878a(java.lang.Integer.toString(r34), r1, (java.lang.String) null, -1, r11 ? 1 : 0, r3, r0.f19313T, r0.f19325j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x04df, code lost:
            r0.f19314U = r33.mo23311a(r0.f19318c, r7);
            r0.f19314U.mo23304a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ee, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23350a(com.google.android.exoplayer2.p366s0.C8914i r33, int r34) throws com.google.android.exoplayer2.C8723g0 {
            /*
                r32 = this;
                r0 = r32
                java.lang.String r1 = r0.f19317b
                int r2 = r1.hashCode()
                r3 = 8
                r4 = 1
                r5 = 2
                r6 = 0
                r7 = 3
                r8 = -1
                switch(r2) {
                    case -2095576542: goto L_0x0161;
                    case -2095575984: goto L_0x0157;
                    case -1985379776: goto L_0x014c;
                    case -1784763192: goto L_0x0141;
                    case -1730367663: goto L_0x0136;
                    case -1482641358: goto L_0x012b;
                    case -1482641357: goto L_0x0120;
                    case -1373388978: goto L_0x0115;
                    case -933872740: goto L_0x010a;
                    case -538363189: goto L_0x00ff;
                    case -538363109: goto L_0x00f4;
                    case -425012669: goto L_0x00e8;
                    case -356037306: goto L_0x00dc;
                    case 62923557: goto L_0x00d0;
                    case 62923603: goto L_0x00c4;
                    case 62927045: goto L_0x00b8;
                    case 82318131: goto L_0x00ad;
                    case 82338133: goto L_0x00a2;
                    case 82338134: goto L_0x0097;
                    case 99146302: goto L_0x008b;
                    case 444813526: goto L_0x007f;
                    case 542569478: goto L_0x0073;
                    case 725957860: goto L_0x0067;
                    case 738597099: goto L_0x005b;
                    case 855502857: goto L_0x004f;
                    case 1422270023: goto L_0x0043;
                    case 1809237540: goto L_0x0038;
                    case 1950749482: goto L_0x002c;
                    case 1950789798: goto L_0x0020;
                    case 1951062397: goto L_0x0014;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x016b
            L_0x0014:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 12
                goto L_0x016c
            L_0x0020:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 22
                goto L_0x016c
            L_0x002c:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 17
                goto L_0x016c
            L_0x0038:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 3
                goto L_0x016c
            L_0x0043:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 25
                goto L_0x016c
            L_0x004f:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 8
                goto L_0x016c
            L_0x005b:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 26
                goto L_0x016c
            L_0x0067:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 24
                goto L_0x016c
            L_0x0073:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 20
                goto L_0x016c
            L_0x007f:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 10
                goto L_0x016c
            L_0x008b:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 28
                goto L_0x016c
            L_0x0097:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 1
                goto L_0x016c
            L_0x00a2:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 0
                goto L_0x016c
            L_0x00ad:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 2
                goto L_0x016c
            L_0x00b8:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 19
                goto L_0x016c
            L_0x00c4:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 16
                goto L_0x016c
            L_0x00d0:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 13
                goto L_0x016c
            L_0x00dc:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 21
                goto L_0x016c
            L_0x00e8:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 27
                goto L_0x016c
            L_0x00f4:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 7
                goto L_0x016c
            L_0x00ff:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 5
                goto L_0x016c
            L_0x010a:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 29
                goto L_0x016c
            L_0x0115:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 9
                goto L_0x016c
            L_0x0120:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 15
                goto L_0x016c
            L_0x012b:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 14
                goto L_0x016c
            L_0x0136:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 11
                goto L_0x016c
            L_0x0141:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 18
                goto L_0x016c
            L_0x014c:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 23
                goto L_0x016c
            L_0x0157:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 4
                goto L_0x016c
            L_0x0161:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x016b
                r1 = 6
                goto L_0x016c
            L_0x016b:
                r1 = -1
            L_0x016c:
                java.lang.String r2 = "application/vobsub"
                java.lang.String r9 = "text/x-ssa"
                java.lang.String r10 = "application/x-subrip"
                java.lang.String r11 = "audio/raw"
                r12 = 4096(0x1000, float:5.74E-42)
                java.lang.String r13 = "MatroskaExtractor"
                java.lang.String r14 = "audio/x-unknown"
                r15 = 0
                switch(r1) {
                    case 0: goto L_0x031c;
                    case 1: goto L_0x0319;
                    case 2: goto L_0x0316;
                    case 3: goto L_0x0313;
                    case 4: goto L_0x0306;
                    case 5: goto L_0x0306;
                    case 6: goto L_0x0306;
                    case 7: goto L_0x02f2;
                    case 8: goto L_0x02de;
                    case 9: goto L_0x02c1;
                    case 10: goto L_0x02be;
                    case 11: goto L_0x02af;
                    case 12: goto L_0x0269;
                    case 13: goto L_0x0260;
                    case 14: goto L_0x0259;
                    case 15: goto L_0x0256;
                    case 16: goto L_0x0252;
                    case 17: goto L_0x024e;
                    case 18: goto L_0x0243;
                    case 19: goto L_0x023f;
                    case 20: goto L_0x023f;
                    case 21: goto L_0x023b;
                    case 22: goto L_0x0231;
                    case 23: goto L_0x01e6;
                    case 24: goto L_0x01b7;
                    case 25: goto L_0x01b4;
                    case 26: goto L_0x01b1;
                    case 27: goto L_0x01a7;
                    case 28: goto L_0x01a3;
                    case 29: goto L_0x0186;
                    default: goto L_0x017e;
                }
            L_0x017e:
                com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x0186:
                r1 = 4
                byte[] r1 = new byte[r1]
                byte[] r3 = r0.f19324i
                byte r11 = r3[r6]
                r1[r6] = r11
                byte r11 = r3[r4]
                r1[r4] = r11
                byte r11 = r3[r5]
                r1[r5] = r11
                byte r3 = r3[r7]
                r1[r7] = r3
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r3 = "application/dvbsubs"
                goto L_0x02d4
            L_0x01a3:
                java.lang.String r1 = "application/pgs"
                goto L_0x031e
            L_0x01a7:
                byte[] r1 = r0.f19324i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r3 = r1
                r1 = r2
                goto L_0x031f
            L_0x01b1:
                r1 = r9
                goto L_0x031e
            L_0x01b4:
                r1 = r10
                goto L_0x031e
            L_0x01b7:
                int r1 = r0.f19306M
                int r1 = com.google.android.exoplayer2.p393v0.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L_0x01de
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f19306M
                r1.append(r3)
                java.lang.String r3 = ". Setting mimeType to "
                r1.append(r3)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.p393v0.Log.m29500d(r13, r1)
                goto L_0x022e
            L_0x01de:
                r23 = r1
                r1 = r11
                r3 = r15
                r20 = -1
                goto L_0x0323
            L_0x01e6:
                com.google.android.exoplayer2.v0.w r1 = new com.google.android.exoplayer2.v0.w
                byte[] r3 = r0.f19324i
                r1.<init>(r3)
                boolean r1 = m26296b(r1)
                if (r1 == 0) goto L_0x021a
                int r1 = r0.f19306M
                int r1 = com.google.android.exoplayer2.p393v0.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L_0x01de
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f19306M
                r1.append(r3)
                java.lang.String r3 = ". Setting mimeType to "
                r1.append(r3)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.p393v0.Log.m29500d(r13, r1)
                goto L_0x022e
            L_0x021a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.p393v0.Log.m29500d(r13, r1)
            L_0x022e:
                r1 = r14
                goto L_0x031e
            L_0x0231:
                byte[] r1 = r0.f19324i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r3 = "audio/flac"
                goto L_0x02d4
            L_0x023b:
                java.lang.String r1 = "audio/vnd.dts.hd"
                goto L_0x031e
            L_0x023f:
                java.lang.String r1 = "audio/vnd.dts"
                goto L_0x031e
            L_0x0243:
                com.google.android.exoplayer2.s0.t.e$d r1 = new com.google.android.exoplayer2.s0.t.e$d
                r1.<init>()
                r0.f19310Q = r1
                java.lang.String r1 = "audio/true-hd"
                goto L_0x031e
            L_0x024e:
                java.lang.String r1 = "audio/eac3"
                goto L_0x031e
            L_0x0252:
                java.lang.String r1 = "audio/ac3"
                goto L_0x031e
            L_0x0256:
                java.lang.String r1 = "audio/mpeg"
                goto L_0x025b
            L_0x0259:
                java.lang.String r1 = "audio/mpeg-L2"
            L_0x025b:
                r3 = r15
                r20 = 4096(0x1000, float:5.74E-42)
                goto L_0x0321
            L_0x0260:
                byte[] r1 = r0.f19324i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r3 = "audio/mp4a-latm"
                goto L_0x02d4
            L_0x0269:
                r1 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r7)
                byte[] r12 = r0.f19324i
                r11.add(r12)
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteOrder r13 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r12 = r12.order(r13)
                long r13 = r0.f19308O
                java.nio.ByteBuffer r12 = r12.putLong(r13)
                byte[] r12 = r12.array()
                r11.add(r12)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r3 = r3.order(r12)
                long r12 = r0.f19309P
                java.nio.ByteBuffer r3 = r3.putLong(r12)
                byte[] r3 = r3.array()
                r11.add(r3)
                java.lang.String r3 = "audio/opus"
                r1 = r3
                r3 = r11
                r20 = 5760(0x1680, float:8.071E-42)
                goto L_0x0321
            L_0x02af:
                r1 = 8192(0x2000, float:1.14794E-41)
                byte[] r3 = r0.f19324i
                java.util.List r3 = m26295a(r3)
                java.lang.String r11 = "audio/vorbis"
                r1 = r11
                r20 = 8192(0x2000, float:1.14794E-41)
                goto L_0x0321
            L_0x02be:
                java.lang.String r1 = "video/x-unknown"
                goto L_0x031e
            L_0x02c1:
                com.google.android.exoplayer2.v0.w r1 = new com.google.android.exoplayer2.v0.w
                byte[] r3 = r0.f19324i
                r1.<init>(r3)
                android.util.Pair r1 = m26293a(r1)
                java.lang.Object r3 = r1.first
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x02d4:
                r20 = -1
                r23 = -1
                r31 = r3
                r3 = r1
                r1 = r31
                goto L_0x0323
            L_0x02de:
                com.google.android.exoplayer2.v0.w r1 = new com.google.android.exoplayer2.v0.w
                byte[] r3 = r0.f19324i
                r1.<init>(r3)
                com.google.android.exoplayer2.w0.l r1 = com.google.android.exoplayer2.p394w0.C9592l.m29625a(r1)
                java.util.List<byte[]> r3 = r1.f22391a
                int r1 = r1.f22392b
                r0.f19315V = r1
                java.lang.String r1 = "video/hevc"
                goto L_0x031f
            L_0x02f2:
                com.google.android.exoplayer2.v0.w r1 = new com.google.android.exoplayer2.v0.w
                byte[] r3 = r0.f19324i
                r1.<init>(r3)
                com.google.android.exoplayer2.w0.h r1 = com.google.android.exoplayer2.p394w0.C9585h.m29615b(r1)
                java.util.List<byte[]> r3 = r1.f22370a
                int r1 = r1.f22371b
                r0.f19315V = r1
                java.lang.String r1 = "video/avc"
                goto L_0x031f
            L_0x0306:
                byte[] r1 = r0.f19324i
                if (r1 != 0) goto L_0x030c
                r1 = r15
                goto L_0x0310
            L_0x030c:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0310:
                java.lang.String r3 = "video/mp4v-es"
                goto L_0x02d4
            L_0x0313:
                java.lang.String r1 = "video/mpeg2"
                goto L_0x031e
            L_0x0316:
                java.lang.String r1 = "video/av01"
                goto L_0x031e
            L_0x0319:
                java.lang.String r1 = "video/x-vnd.on2.vp9"
                goto L_0x031e
            L_0x031c:
                java.lang.String r1 = "video/x-vnd.on2.vp8"
            L_0x031e:
                r3 = r15
            L_0x031f:
                r20 = -1
            L_0x0321:
                r23 = -1
            L_0x0323:
                boolean r11 = r0.f19312S
                r11 = r11 | r6
                boolean r12 = r0.f19311R
                if (r12 == 0) goto L_0x032c
                r12 = 2
                goto L_0x032d
            L_0x032c:
                r12 = 0
            L_0x032d:
                r11 = r11 | r12
                boolean r12 = com.google.android.exoplayer2.p393v0.C9566t.m29517j(r1)
                if (r12 == 0) goto L_0x0359
                java.lang.String r16 = java.lang.Integer.toString(r34)
                r18 = 0
                r19 = -1
                int r2 = r0.f19305L
                int r5 = r0.f19307N
                com.google.android.exoplayer2.drm.DrmInitData r6 = r0.f19325j
                java.lang.String r7 = r0.f19313T
                r17 = r1
                r21 = r2
                r22 = r5
                r24 = r3
                r25 = r6
                r26 = r11
                r27 = r7
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24874a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                r7 = 1
                goto L_0x04df
            L_0x0359:
                boolean r4 = com.google.android.exoplayer2.p393v0.C9566t.m29519l(r1)
                if (r4 == 0) goto L_0x0459
                int r2 = r0.f19330o
                if (r2 != 0) goto L_0x0373
                int r2 = r0.f19328m
                if (r2 != r8) goto L_0x0369
                int r2 = r0.f19326k
            L_0x0369:
                r0.f19328m = r2
                int r2 = r0.f19329n
                if (r2 != r8) goto L_0x0371
                int r2 = r0.f19327l
            L_0x0371:
                r0.f19329n = r2
            L_0x0373:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = r0.f19328m
                if (r4 == r8) goto L_0x038b
                int r7 = r0.f19329n
                if (r7 == r8) goto L_0x038b
                int r2 = r0.f19327l
                int r2 = r2 * r4
                float r2 = (float) r2
                int r4 = r0.f19326k
                int r4 = r4 * r7
                float r4 = (float) r4
                float r2 = r2 / r4
                r26 = r2
                goto L_0x038d
            L_0x038b:
                r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x038d:
                boolean r2 = r0.f19337v
                if (r2 == 0) goto L_0x03a0
                byte[] r2 = r32.m26297c()
                com.google.android.exoplayer2.w0.i r15 = new com.google.android.exoplayer2.w0.i
                int r4 = r0.f19338w
                int r7 = r0.f19340y
                int r9 = r0.f19339x
                r15.<init>(r4, r7, r9, r2)
            L_0x03a0:
                r29 = r15
                java.lang.String r2 = r0.f19316a
                java.lang.String r4 = "htc_video_rotA-000"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x03ae
                r2 = 0
                goto L_0x03d6
            L_0x03ae:
                java.lang.String r2 = r0.f19316a
                java.lang.String r4 = "htc_video_rotA-090"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x03bb
                r2 = 90
                goto L_0x03d6
            L_0x03bb:
                java.lang.String r2 = r0.f19316a
                java.lang.String r4 = "htc_video_rotA-180"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x03c8
                r2 = 180(0xb4, float:2.52E-43)
                goto L_0x03d6
            L_0x03c8:
                java.lang.String r2 = r0.f19316a
                java.lang.String r4 = "htc_video_rotA-270"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L_0x03d5
                r2 = 270(0x10e, float:3.78E-43)
                goto L_0x03d6
            L_0x03d5:
                r2 = -1
            L_0x03d6:
                int r4 = r0.f19331p
                if (r4 != 0) goto L_0x042e
                float r4 = r0.f19332q
                r7 = 0
                int r4 = java.lang.Float.compare(r4, r7)
                if (r4 != 0) goto L_0x042e
                float r4 = r0.f19333r
                int r4 = java.lang.Float.compare(r4, r7)
                if (r4 != 0) goto L_0x042e
                float r4 = r0.f19334s
                int r4 = java.lang.Float.compare(r4, r7)
                if (r4 != 0) goto L_0x03f6
                r25 = 0
                goto L_0x0430
            L_0x03f6:
                float r4 = r0.f19333r
                r6 = 1119092736(0x42b40000, float:90.0)
                int r4 = java.lang.Float.compare(r4, r6)
                if (r4 != 0) goto L_0x0405
                r6 = 90
                r25 = 90
                goto L_0x0430
            L_0x0405:
                float r4 = r0.f19333r
                r6 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r4 = java.lang.Float.compare(r4, r6)
                if (r4 == 0) goto L_0x0429
                float r4 = r0.f19333r
                r6 = 1127481344(0x43340000, float:180.0)
                int r4 = java.lang.Float.compare(r4, r6)
                if (r4 != 0) goto L_0x041a
                goto L_0x0429
            L_0x041a:
                float r4 = r0.f19333r
                r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r4 = java.lang.Float.compare(r4, r6)
                if (r4 != 0) goto L_0x042e
                r6 = 270(0x10e, float:3.78E-43)
                r25 = 270(0x10e, float:3.78E-43)
                goto L_0x0430
            L_0x0429:
                r6 = 180(0xb4, float:2.52E-43)
                r25 = 180(0xb4, float:2.52E-43)
                goto L_0x0430
            L_0x042e:
                r25 = r2
            L_0x0430:
                java.lang.String r16 = java.lang.Integer.toString(r34)
                r18 = 0
                r19 = -1
                int r2 = r0.f19326k
                int r4 = r0.f19327l
                r23 = -1082130432(0xffffffffbf800000, float:-1.0)
                byte[] r6 = r0.f19335t
                int r7 = r0.f19336u
                com.google.android.exoplayer2.drm.DrmInitData r8 = r0.f19325j
                r17 = r1
                r21 = r2
                r22 = r4
                r24 = r3
                r27 = r6
                r28 = r7
                r30 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24872a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                r7 = 2
                goto L_0x04df
            L_0x0459:
                boolean r4 = r10.equals(r1)
                if (r4 == 0) goto L_0x046d
                java.lang.String r2 = java.lang.Integer.toString(r34)
                java.lang.String r3 = r0.f19313T
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f19325j
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24869a(r2, r1, r11, r3, r4)
                goto L_0x04df
            L_0x046d:
                boolean r4 = r9.equals(r1)
                if (r4 == 0) goto L_0x04a6
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r5)
                byte[] r3 = com.google.android.exoplayer2.p366s0.p369t.C8941e.f19238b0
                r2.add(r3)
                byte[] r3 = r0.f19324i
                r2.add(r3)
                java.lang.String r16 = java.lang.Integer.toString(r34)
                r18 = 0
                r19 = -1
                java.lang.String r3 = r0.f19313T
                r22 = -1
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f19325j
                r24 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r17 = r1
                r20 = r11
                r21 = r3
                r23 = r4
                r26 = r2
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24876a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
                goto L_0x04df
            L_0x04a6:
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x04c5
                java.lang.String r2 = "application/pgs"
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x04c5
                java.lang.String r2 = "application/dvbsubs"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x04bd
                goto L_0x04c5
            L_0x04bd:
                com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x04c5:
                java.lang.String r16 = java.lang.Integer.toString(r34)
                r18 = 0
                r19 = -1
                java.lang.String r2 = r0.f19313T
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f19325j
                r17 = r1
                r20 = r11
                r21 = r3
                r22 = r2
                r23 = r4
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m24878a(r16, r17, r18, r19, r20, r21, r22, r23)
            L_0x04df:
                int r2 = r0.f19318c
                r3 = r33
                com.google.android.exoplayer2.s0.q r2 = r3.mo23311a(r2, r7)
                r0.f19314U = r2
                com.google.android.exoplayer2.s0.q r2 = r0.f19314U
                r2.mo23304a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p369t.C8941e.C8944c.mo23350a(com.google.android.exoplayer2.s0.i, int):void");
        }

        /* renamed from: b */
        private static boolean m26296b(C9572w wVar) throws C8723g0 {
            try {
                int q = wVar.mo24706q();
                boolean z = true;
                if (q == 1) {
                    return true;
                }
                if (q != 65534) {
                    return false;
                }
                wVar.mo24693e(24);
                if (!(wVar.mo24707r() == C8941e.f19241e0.getMostSignificantBits() && wVar.mo24707r() == C8941e.f19241e0.getLeastSignificantBits())) {
                    z = false;
                }
                return z;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C8723g0("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: a */
        public void mo23349a() {
            C8945d dVar = this.f19310Q;
            if (dVar != null) {
                dVar.mo23354a(this);
            }
        }

        /* renamed from: a */
        private static Pair<String, List<byte[]>> m26293a(C9572w wVar) throws C8723g0 {
            try {
                wVar.mo24695f(16);
                long o = wVar.mo24704o();
                if (o == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (o == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (o == 826496599) {
                    byte[] bArr = wVar.f22333a;
                    for (int c = wVar.mo24688c() + 20; c < bArr.length - 4; c++) {
                        if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, c, bArr.length)));
                        }
                    }
                    throw new C8723g0("Failed to find FourCC VC1 initialization data");
                }
                Log.m29500d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C8723g0("Error parsing FourCC private data");
            }
        }

        /* renamed from: a */
        private static List<byte[]> m26295a(byte[] bArr) throws C8723g0 {
            String str = "Error parsing vorbis codec private";
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while (bArr[i] == -1) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + bArr[i];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new C8723g0(str);
                        }
                        throw new C8723g0(str);
                    }
                    throw new C8723g0(str);
                }
                throw new C8723g0(str);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C8723g0(str);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.t.e$d */
    /* compiled from: MatroskaExtractor */
    private static final class C8945d {

        /* renamed from: a */
        private final byte[] f19342a = new byte[10];

        /* renamed from: b */
        private boolean f19343b;

        /* renamed from: c */
        private int f19344c;

        /* renamed from: d */
        private int f19345d;

        /* renamed from: e */
        private long f19346e;

        /* renamed from: f */
        private int f19347f;

        /* renamed from: a */
        public void mo23352a() {
            this.f19343b = false;
        }

        /* renamed from: a */
        public void mo23353a(C8913h hVar, int i, int i2) throws IOException, InterruptedException {
            if (!this.f19343b) {
                hVar.mo23294b(this.f19342a, 0, 10);
                hVar.mo23297c();
                if (C8825g.m25603b(this.f19342a) != 0) {
                    this.f19343b = true;
                    this.f19344c = 0;
                } else {
                    return;
                }
            }
            if (this.f19344c == 0) {
                this.f19347f = i;
                this.f19345d = 0;
            }
            this.f19345d += i2;
        }

        /* renamed from: a */
        public void mo23355a(C8944c cVar, long j) {
            if (this.f19343b) {
                int i = this.f19344c;
                this.f19344c = i + 1;
                if (i == 0) {
                    this.f19346e = j;
                }
                if (this.f19344c >= 16) {
                    cVar.f19314U.mo23303a(this.f19346e, this.f19347f, this.f19345d, 0, cVar.f19323h);
                    this.f19344c = 0;
                }
            }
        }

        /* renamed from: a */
        public void mo23354a(C8944c cVar) {
            if (this.f19343b && this.f19344c > 0) {
                cVar.f19314U.mo23303a(this.f19346e, this.f19347f, this.f19345d, 0, cVar.f19323h);
                this.f19344c = 0;
            }
        }
    }

    static {
        C8935a aVar = C8935a.f19226a;
    }

    public C8941e() {
        this(0);
    }

    /* renamed from: d */
    private C8920o m26269d() {
        if (!(this.f19282p == -1 || this.f19285s == -9223372036854775807L)) {
            C9564r rVar = this.f19243B;
            if (!(rVar == null || rVar.mo24655a() == 0)) {
                C9564r rVar2 = this.f19244C;
                if (rVar2 != null && rVar2.mo24655a() == this.f19243B.mo24655a()) {
                    int a = this.f19243B.mo24655a();
                    int[] iArr = new int[a];
                    long[] jArr = new long[a];
                    long[] jArr2 = new long[a];
                    long[] jArr3 = new long[a];
                    int i = 0;
                    for (int i2 = 0; i2 < a; i2++) {
                        jArr3[i2] = this.f19243B.mo24656a(i2);
                        jArr[i2] = this.f19282p + this.f19244C.mo24656a(i2);
                    }
                    while (true) {
                        int i3 = a - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            iArr[i] = (int) (jArr[i4] - jArr[i]);
                            jArr2[i] = jArr3[i4] - jArr3[i];
                            i = i4;
                        } else {
                            iArr[i3] = (int) ((this.f19282p + this.f19281o) - jArr[i3]);
                            jArr2[i3] = this.f19285s - jArr3[i3];
                            this.f19243B = null;
                            this.f19244C = null;
                            return new C8907b(iArr, jArr, jArr2, jArr3);
                        }
                    }
                }
            }
        }
        this.f19243B = null;
        this.f19244C = null;
        return new C8922b(this.f19285s);
    }

    /* renamed from: e */
    static /* synthetic */ C8912g[] m26270e() {
        return new C8912g[]{new C8941e()};
    }

    /* renamed from: f */
    private void m26271f() {
        this.f19255N = 0;
        this.f19263V = 0;
        this.f19262U = 0;
        this.f19256O = false;
        this.f19257P = false;
        this.f19259R = false;
        this.f19261T = 0;
        this.f19260S = 0;
        this.f19258Q = false;
        this.f19276j.mo24678D();
    }

    /* renamed from: a */
    public final void mo23307a() {
    }

    /* renamed from: a */
    public final boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return new C8946f().mo23356a(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23347b(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo23348c(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public C8941e(int i) {
        this(new C8936b(), i);
    }

    /* renamed from: a */
    public final void mo23309a(C8914i iVar) {
        this.f19266Y = iVar;
    }

    C8941e(C8940d dVar, int i) {
        this.f19282p = -1;
        this.f19283q = -9223372036854775807L;
        this.f19284r = -9223372036854775807L;
        this.f19285s = -9223372036854775807L;
        this.f19291y = -1;
        this.f19292z = -1;
        this.f19242A = -9223372036854775807L;
        this.f19267a = dVar;
        this.f19267a.mo23330a((C8939c) new C8943b());
        boolean z = true;
        if ((i & 1) != 0) {
            z = false;
        }
        this.f19270d = z;
        this.f19268b = new C8947g();
        this.f19269c = new SparseArray<>();
        this.f19273g = new C9572w(4);
        this.f19274h = new C9572w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19275i = new C9572w(4);
        this.f19271e = new C9572w(C9568u.f22309a);
        this.f19272f = new C9572w(4);
        this.f19276j = new C9572w();
        this.f19277k = new C9572w();
        this.f19278l = new C9572w(8);
        this.f19279m = new C9572w();
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19242A = -9223372036854775807L;
        this.f19246E = 0;
        this.f19267a.reset();
        this.f19268b.mo23359b();
        m26271f();
        for (int i = 0; i < this.f19269c.size(); i++) {
            ((C8944c) this.f19269c.valueAt(i)).mo23351b();
        }
    }

    /* renamed from: a */
    public final int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        this.f19264W = false;
        boolean z = true;
        while (z && !this.f19264W) {
            z = this.f19267a.mo23331a(hVar);
            if (z && m26264a(nVar, hVar.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f19269c.size(); i++) {
            ((C8944c) this.f19269c.valueAt(i)).mo23349a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23345a(int i, long j, long j2) throws C8723g0 {
        if (i == 160) {
            this.f19265X = false;
        } else if (i == 174) {
            this.f19286t = new C8944c();
        } else if (i == 187) {
            this.f19245D = false;
        } else if (i == 19899) {
            this.f19288v = -1;
            this.f19289w = -1;
        } else if (i == 20533) {
            this.f19286t.f19321f = true;
        } else if (i == 21968) {
            this.f19286t.f19337v = true;
        } else if (i == 25152) {
        } else {
            if (i == 408125543) {
                long j3 = this.f19282p;
                if (j3 == -1 || j3 == j) {
                    this.f19282p = j;
                    this.f19281o = j2;
                    return;
                }
                throw new C8723g0("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                this.f19243B = new C9564r();
                this.f19244C = new C9564r();
            } else if (i != 524531317 || this.f19287u) {
            } else {
                if (!this.f19270d || this.f19291y == -1) {
                    this.f19266Y.mo23313a(new C8922b(this.f19285s));
                    this.f19287u = true;
                    return;
                }
                this.f19290x = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23341a(int i) throws C8723g0 {
        if (i != 160) {
            if (i == 174) {
                if (m26265a(this.f19286t.f19317b)) {
                    C8944c cVar = this.f19286t;
                    cVar.mo23350a(this.f19266Y, cVar.f19318c);
                    SparseArray<C8944c> sparseArray = this.f19269c;
                    C8944c cVar2 = this.f19286t;
                    sparseArray.put(cVar2.f19318c, cVar2);
                }
                this.f19286t = null;
            } else if (i == 19899) {
                int i2 = this.f19288v;
                if (i2 != -1) {
                    long j = this.f19289w;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f19291y = j;
                        }
                    }
                }
                throw new C8723g0("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C8944c cVar3 = this.f19286t;
                if (cVar3.f19321f) {
                    C8925a aVar = cVar3.f19323h;
                    if (aVar != null) {
                        cVar3.f19325j = new DrmInitData(new C8692b(C.UUID_NIL, "video/webm", aVar.f19172b));
                    } else {
                        throw new C8723g0("Encrypted Track found but ContentEncKeyID was not found");
                    }
                }
            } else if (i == 28032) {
                C8944c cVar4 = this.f19286t;
                if (cVar4.f19321f && cVar4.f19322g != null) {
                    throw new C8723g0("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f19283q == -9223372036854775807L) {
                    this.f19283q = 1000000;
                }
                long j2 = this.f19284r;
                if (j2 != -9223372036854775807L) {
                    this.f19285s = m26256a(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f19287u) {
                    this.f19266Y.mo23313a(m26269d());
                    this.f19287u = true;
                }
            } else if (this.f19269c.size() != 0) {
                this.f19266Y.mo23312a();
            } else {
                throw new C8723g0("No valid tracks were found");
            }
        } else if (this.f19246E == 2) {
            if (!this.f19265X) {
                this.f19254M |= 1;
            }
            m26261a((C8944c) this.f19269c.get(this.f19252K), this.f19247F);
            this.f19246E = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23344a(int i, long j) throws C8723g0 {
        String str = " not supported";
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f19286t.f19319d = (int) j;
                        return;
                    case 136:
                        C8944c cVar = this.f19286t;
                        if (j == 1) {
                            z = true;
                        }
                        cVar.f19312S = z;
                        return;
                    case 155:
                        this.f19248G = m26256a(j);
                        return;
                    case 159:
                        this.f19286t.f19305L = (int) j;
                        return;
                    case 176:
                        this.f19286t.f19326k = (int) j;
                        return;
                    case 179:
                        this.f19243B.mo24657a(m26256a(j));
                        return;
                    case 186:
                        this.f19286t.f19327l = (int) j;
                        return;
                    case 215:
                        this.f19286t.f19318c = (int) j;
                        return;
                    case 231:
                        this.f19242A = m26256a(j);
                        return;
                    case 241:
                        if (!this.f19245D) {
                            this.f19244C.mo24657a(j);
                            this.f19245D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f19265X = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(str);
                            throw new C8723g0(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(str);
                            throw new C8723g0(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(str);
                            throw new C8723g0(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(str);
                            throw new C8723g0(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(str);
                            throw new C8723g0(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f19289w = j + this.f19282p;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f19286t.f19336u = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f19286t.f19336u = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f19286t.f19336u = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f19286t.f19336u = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f19286t.f19328m = (int) j;
                        return;
                    case 21682:
                        this.f19286t.f19330o = (int) j;
                        return;
                    case 21690:
                        this.f19286t.f19329n = (int) j;
                        return;
                    case 21930:
                        C8944c cVar2 = this.f19286t;
                        if (j == 1) {
                            z = true;
                        }
                        cVar2.f19311R = z;
                        return;
                    case 22186:
                        this.f19286t.f19308O = j;
                        return;
                    case 22203:
                        this.f19286t.f19309P = j;
                        return;
                    case 25188:
                        this.f19286t.f19306M = (int) j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f19286t.f19331p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f19286t.f19331p = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f19286t.f19331p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f19286t.f19331p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.f19286t.f19320e = (int) j;
                        return;
                    case 2807729:
                        this.f19283q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f19286t.f19340y = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f19286t.f19340y = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f19286t.f19339x = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f19286t.f19339x = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f19286t.f19339x = 3;
                                return;
                            case 21947:
                                C8944c cVar3 = this.f19286t;
                                cVar3.f19337v = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    cVar3.f19338w = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar3.f19338w = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.f19286t.f19338w = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f19286t.f19341z = (int) j;
                                return;
                            case 21949:
                                this.f19286t.f19294A = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(str);
                throw new C8723g0(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(str);
            throw new C8723g0(sb7.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23342a(int i, double d) throws C8723g0 {
        if (i == 181) {
            this.f19286t.f19307N = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f19286t.f19295B = (float) d;
                    return;
                case 21970:
                    this.f19286t.f19296C = (float) d;
                    return;
                case 21971:
                    this.f19286t.f19297D = (float) d;
                    return;
                case 21972:
                    this.f19286t.f19298E = (float) d;
                    return;
                case 21973:
                    this.f19286t.f19299F = (float) d;
                    return;
                case 21974:
                    this.f19286t.f19300G = (float) d;
                    return;
                case 21975:
                    this.f19286t.f19301H = (float) d;
                    return;
                case 21976:
                    this.f19286t.f19302I = (float) d;
                    return;
                case 21977:
                    this.f19286t.f19303J = (float) d;
                    return;
                case 21978:
                    this.f19286t.f19304K = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            this.f19286t.f19332q = (float) d;
                            return;
                        case 30324:
                            this.f19286t.f19333r = (float) d;
                            return;
                        case 30325:
                            this.f19286t.f19334s = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f19284r = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23346a(int i, String str) throws C8723g0 {
        if (i == 134) {
            this.f19286t.f19317b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                this.f19286t.f19316a = str;
            } else if (i == 2274716) {
                this.f19286t.f19313T = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C8723g0(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fd, code lost:
        throw new com.google.android.exoplayer2.C8723g0("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0253  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23343a(int r20, int r21, com.google.android.exoplayer2.p366s0.C8913h r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x0094
            if (r1 == r5) goto L_0x0094
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0087
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0077
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0058
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004b
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0034
            com.google.android.exoplayer2.s0.t.e$c r1 = r0.f19286t
            byte[] r4 = new byte[r2]
            r1.f19335t = r4
            byte[] r1 = r1.f19335t
            r3.mo23289a(r1, r7, r2)
            goto L_0x02b1
        L_0x0034:
            com.google.android.exoplayer2.g0 r2 = new com.google.android.exoplayer2.g0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x004b:
            com.google.android.exoplayer2.s0.t.e$c r1 = r0.f19286t
            byte[] r4 = new byte[r2]
            r1.f19324i = r4
            byte[] r1 = r1.f19324i
            r3.mo23289a(r1, r7, r2)
            goto L_0x02b1
        L_0x0058:
            com.google.android.exoplayer2.v0.w r1 = r0.f19275i
            byte[] r1 = r1.f22333a
            java.util.Arrays.fill(r1, r7)
            com.google.android.exoplayer2.v0.w r1 = r0.f19275i
            byte[] r1 = r1.f22333a
            int r6 = r6 - r2
            r3.mo23289a(r1, r6, r2)
            com.google.android.exoplayer2.v0.w r1 = r0.f19275i
            r1.mo24693e(r7)
            com.google.android.exoplayer2.v0.w r1 = r0.f19275i
            long r1 = r1.mo24713x()
            int r2 = (int) r1
            r0.f19288v = r2
            goto L_0x02b1
        L_0x0077:
            byte[] r1 = new byte[r2]
            r3.mo23289a(r1, r7, r2)
            com.google.android.exoplayer2.s0.t.e$c r2 = r0.f19286t
            com.google.android.exoplayer2.s0.q$a r3 = new com.google.android.exoplayer2.s0.q$a
            r3.<init>(r8, r1, r7, r7)
            r2.f19323h = r3
            goto L_0x02b1
        L_0x0087:
            com.google.android.exoplayer2.s0.t.e$c r1 = r0.f19286t
            byte[] r4 = new byte[r2]
            r1.f19322g = r4
            byte[] r1 = r1.f19322g
            r3.mo23289a(r1, r7, r2)
            goto L_0x02b1
        L_0x0094:
            int r4 = r0.f19246E
            r9 = 8
            if (r4 != 0) goto L_0x00b9
            com.google.android.exoplayer2.s0.t.g r4 = r0.f19268b
            long r10 = r4.mo23358a(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.f19252K = r4
            com.google.android.exoplayer2.s0.t.g r4 = r0.f19268b
            int r4 = r4.mo23357a()
            r0.f19253L = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f19248G = r10
            r0.f19246E = r8
            com.google.android.exoplayer2.v0.w r4 = r0.f19273g
            r4.mo24678D()
        L_0x00b9:
            android.util.SparseArray<com.google.android.exoplayer2.s0.t.e$c> r4 = r0.f19269c
            int r10 = r0.f19252K
            java.lang.Object r4 = r4.get(r10)
            com.google.android.exoplayer2.s0.t.e$c r4 = (com.google.android.exoplayer2.p366s0.p369t.C8941e.C8944c) r4
            if (r4 != 0) goto L_0x00cf
            int r1 = r0.f19253L
            int r1 = r2 - r1
            r3.mo23298c(r1)
            r0.f19246E = r7
            return
        L_0x00cf:
            int r10 = r0.f19246E
            if (r10 != r8) goto L_0x027e
            r10 = 3
            r0.m26257a(r3, r10)
            com.google.android.exoplayer2.v0.w r11 = r0.f19273g
            byte[] r11 = r11.f22333a
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00fa
            r0.f19250I = r8
            int[] r6 = r0.f19251J
            int[] r6 = m26266a(r6, r8)
            r0.f19251J = r6
            int[] r6 = r0.f19251J
            int r11 = r0.f19253L
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
        L_0x00f7:
            r6 = 1
            goto L_0x0211
        L_0x00fa:
            if (r1 != r5) goto L_0x0276
            r0.m26257a(r3, r6)
            com.google.android.exoplayer2.v0.w r14 = r0.f19273g
            byte[] r14 = r14.f22333a
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.f19250I = r14
            int[] r14 = r0.f19251J
            int r15 = r0.f19250I
            int[] r14 = m26266a(r14, r15)
            r0.f19251J = r14
            if (r11 != r12) goto L_0x0122
            int r10 = r0.f19253L
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.f19250I
            int r2 = r2 / r6
            int[] r10 = r0.f19251J
            java.util.Arrays.fill(r10, r7, r6, r2)
            goto L_0x00f7
        L_0x0122:
            if (r11 != r8) goto L_0x0159
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x0127:
            int r14 = r0.f19250I
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x014e
            int[] r14 = r0.f19251J
            r14[r6] = r7
        L_0x0131:
            int r10 = r10 + r8
            r0.m26257a(r3, r10)
            com.google.android.exoplayer2.v0.w r14 = r0.f19273g
            byte[] r14 = r14.f22333a
            int r15 = r10 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.f19251J
            r16 = r15[r6]
            int r16 = r16 + r14
            r15[r6] = r16
            if (r14 == r13) goto L_0x0131
            r14 = r15[r6]
            int r11 = r11 + r14
            int r6 = r6 + 1
            goto L_0x0127
        L_0x014e:
            int[] r6 = r0.f19251J
            int r14 = r14 - r8
            int r15 = r0.f19253L
            int r2 = r2 - r15
            int r2 = r2 - r10
            int r2 = r2 - r11
            r6[r14] = r2
            goto L_0x00f7
        L_0x0159:
            if (r11 != r10) goto L_0x025f
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x015e:
            int r14 = r0.f19250I
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x0206
            int[] r14 = r0.f19251J
            r14[r6] = r7
            int r10 = r10 + 1
            r0.m26257a(r3, r10)
            com.google.android.exoplayer2.v0.w r14 = r0.f19273g
            byte[] r14 = r14.f22333a
            int r15 = r10 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01fe
            r16 = 0
            r14 = 0
        L_0x017a:
            if (r14 >= r9) goto L_0x01c9
            int r18 = 7 - r14
            int r5 = r8 << r18
            com.google.android.exoplayer2.v0.w r12 = r0.f19273g
            byte[] r12 = r12.f22333a
            byte r12 = r12[r15]
            r12 = r12 & r5
            if (r12 == 0) goto L_0x01bf
            int r10 = r10 + r14
            r0.m26257a(r3, r10)
            com.google.android.exoplayer2.v0.w r12 = r0.f19273g
            byte[] r12 = r12.f22333a
            int r16 = r15 + 1
            byte r12 = r12[r15]
            r12 = r12 & r13
            int r5 = ~r5
            r5 = r5 & r12
            long r7 = (long) r5
            r5 = r16
        L_0x019b:
            r16 = r7
            if (r5 >= r10) goto L_0x01b1
            long r7 = r16 << r9
            com.google.android.exoplayer2.v0.w r15 = r0.f19273g
            byte[] r15 = r15.f22333a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x019b
        L_0x01b1:
            if (r6 <= 0) goto L_0x01c9
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            goto L_0x01c9
        L_0x01bf:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x017a
        L_0x01c9:
            r7 = r16
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01f6
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01f6
            int r5 = (int) r7
            int[] r7 = r0.f19251J
            if (r6 != 0) goto L_0x01df
            goto L_0x01e4
        L_0x01df:
            int r8 = r6 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01e4:
            r7[r6] = r5
            int[] r5 = r0.f19251J
            r5 = r5[r6]
            int r11 = r11 + r5
            int r6 = r6 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x015e
        L_0x01f6:
            com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01fe:
            com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x0206:
            int[] r5 = r0.f19251J
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.f19253L
            int r2 = r2 - r7
            int r2 = r2 - r10
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x0211:
            com.google.android.exoplayer2.v0.w r2 = r0.f19273g
            byte[] r2 = r2.f22333a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.f19242A
            long r7 = (long) r2
            long r7 = r0.m26256a(r7)
            long r5 = r5 + r7
            r0.f19247F = r5
            com.google.android.exoplayer2.v0.w r2 = r0.f19273g
            byte[] r2 = r2.f22333a
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0236
            r2 = 1
            goto L_0x0237
        L_0x0236:
            r2 = 0
        L_0x0237:
            int r6 = r4.f19319d
            if (r6 == r5) goto L_0x024d
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x024b
            com.google.android.exoplayer2.v0.w r6 = r0.f19273g
            byte[] r6 = r6.f22333a
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r5 = 0
            goto L_0x024e
        L_0x024d:
            r5 = 1
        L_0x024e:
            if (r2 == 0) goto L_0x0253
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0254
        L_0x0253:
            r7 = 0
        L_0x0254:
            r2 = r5 | r7
            r0.f19254M = r2
            r2 = 2
            r0.f19246E = r2
            r2 = 0
            r0.f19249H = r2
            goto L_0x027e
        L_0x025f:
            com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected lacing value: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0276:
            com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x027e:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x02a9
        L_0x0282:
            int r1 = r0.f19249H
            int r2 = r0.f19250I
            if (r1 >= r2) goto L_0x02a5
            int[] r2 = r0.f19251J
            r1 = r2[r1]
            r0.m26258a(r3, r4, r1)
            long r1 = r0.f19247F
            int r5 = r0.f19249H
            int r6 = r4.f19320e
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m26261a(r4, r1)
            int r1 = r0.f19249H
            r2 = 1
            int r1 = r1 + r2
            r0.f19249H = r1
            goto L_0x0282
        L_0x02a5:
            r1 = 0
            r0.f19246E = r1
            goto L_0x02b1
        L_0x02a9:
            r1 = 0
            int[] r2 = r0.f19251J
            r1 = r2[r1]
            r0.m26258a(r3, r4, r1)
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p369t.C8941e.mo23343a(int, int, com.google.android.exoplayer2.s0.h):void");
    }

    /* renamed from: a */
    private void m26261a(C8944c cVar, long j) {
        C8944c cVar2 = cVar;
        C8945d dVar = cVar2.f19310Q;
        if (dVar != null) {
            dVar.mo23355a(cVar2, j);
        } else {
            long j2 = j;
            if ("S_TEXT/UTF8".equals(cVar2.f19317b)) {
                C8944c cVar3 = cVar;
                m26262a(cVar3, "%02d:%02d:%02d,%03d", 19, 1000, f19237a0);
            } else {
                if ("S_TEXT/ASS".equals(cVar2.f19317b)) {
                    C8944c cVar4 = cVar;
                    m26262a(cVar4, "%01d:%02d:%02d:%02d", 21, 10000, f19240d0);
                }
            }
            cVar2.f19314U.mo23303a(j, this.f19254M, this.f19263V, 0, cVar2.f19323h);
        }
        this.f19264W = true;
        m26271f();
    }

    /* renamed from: a */
    private void m26257a(C8913h hVar, int i) throws IOException, InterruptedException {
        if (this.f19273g.mo24690d() < i) {
            if (this.f19273g.mo24686b() < i) {
                C9572w wVar = this.f19273g;
                byte[] bArr = wVar.f22333a;
                wVar.mo24684a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f19273g.mo24690d());
            }
            C9572w wVar2 = this.f19273g;
            hVar.mo23289a(wVar2.f22333a, wVar2.mo24690d(), i - this.f19273g.mo24690d());
            this.f19273g.mo24691d(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26258a(com.google.android.exoplayer2.p366s0.C8913h r11, com.google.android.exoplayer2.p366s0.p369t.C8941e.C8944c r12, int r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r10 = this;
            java.lang.String r0 = r12.f19317b
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
            byte[] r12 = f19236Z
            r10.m26259a(r11, r12, r13)
            return
        L_0x0010:
            java.lang.String r0 = r12.f19317b
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            byte[] r12 = f19239c0
            r10.m26259a(r11, r12, r13)
            return
        L_0x0020:
            com.google.android.exoplayer2.s0.q r0 = r12.f19314U
            boolean r1 = r10.f19256O
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x016e
            boolean r1 = r12.f19321f
            if (r1 == 0) goto L_0x0162
            int r1 = r10.f19254M
            r6 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r6
            r10.f19254M = r1
            boolean r1 = r10.f19257P
            r6 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x0060
            com.google.android.exoplayer2.v0.w r1 = r10.f19273g
            byte[] r1 = r1.f22333a
            r11.mo23289a(r1, r5, r4)
            int r1 = r10.f19255N
            int r1 = r1 + r4
            r10.f19255N = r1
            com.google.android.exoplayer2.v0.w r1 = r10.f19273g
            byte[] r1 = r1.f22333a
            byte r7 = r1[r5]
            r7 = r7 & r6
            if (r7 == r6) goto L_0x0058
            byte r1 = r1[r5]
            r10.f19260S = r1
            r10.f19257P = r4
            goto L_0x0060
        L_0x0058:
            com.google.android.exoplayer2.g0 r11 = new com.google.android.exoplayer2.g0
            java.lang.String r12 = "Extension bit is set in signal byte"
            r11.<init>(r12)
            throw r11
        L_0x0060:
            byte r1 = r10.f19260S
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            if (r1 == 0) goto L_0x016c
            byte r1 = r10.f19260S
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            int r7 = r10.f19254M
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r8
            r10.f19254M = r7
            boolean r7 = r10.f19258Q
            if (r7 != 0) goto L_0x00b7
            com.google.android.exoplayer2.v0.w r7 = r10.f19278l
            byte[] r7 = r7.f22333a
            r8 = 8
            r11.mo23289a(r7, r5, r8)
            int r7 = r10.f19255N
            int r7 = r7 + r8
            r10.f19255N = r7
            r10.f19258Q = r4
            com.google.android.exoplayer2.v0.w r7 = r10.f19273g
            byte[] r7 = r7.f22333a
            if (r1 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r6 = 0
        L_0x0095:
            r6 = r6 | r8
            byte r6 = (byte) r6
            r7[r5] = r6
            com.google.android.exoplayer2.v0.w r6 = r10.f19273g
            r6.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r6 = r10.f19273g
            r0.mo23305a(r6, r4)
            int r6 = r10.f19263V
            int r6 = r6 + r4
            r10.f19263V = r6
            com.google.android.exoplayer2.v0.w r6 = r10.f19278l
            r6.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r6 = r10.f19278l
            r0.mo23305a(r6, r8)
            int r6 = r10.f19263V
            int r6 = r6 + r8
            r10.f19263V = r6
        L_0x00b7:
            if (r1 == 0) goto L_0x016c
            boolean r1 = r10.f19259R
            if (r1 != 0) goto L_0x00d8
            com.google.android.exoplayer2.v0.w r1 = r10.f19273g
            byte[] r1 = r1.f22333a
            r11.mo23289a(r1, r5, r4)
            int r1 = r10.f19255N
            int r1 = r1 + r4
            r10.f19255N = r1
            com.google.android.exoplayer2.v0.w r1 = r10.f19273g
            r1.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r1 = r10.f19273g
            int r1 = r1.mo24711v()
            r10.f19261T = r1
            r10.f19259R = r4
        L_0x00d8:
            int r1 = r10.f19261T
            int r1 = r1 * 4
            com.google.android.exoplayer2.v0.w r6 = r10.f19273g
            r6.mo24689c(r1)
            com.google.android.exoplayer2.v0.w r6 = r10.f19273g
            byte[] r6 = r6.f22333a
            r11.mo23289a(r6, r5, r1)
            int r6 = r10.f19255N
            int r6 = r6 + r1
            r10.f19255N = r6
            int r1 = r10.f19261T
            int r1 = r1 / r3
            int r1 = r1 + r4
            short r1 = (short) r1
            int r6 = r1 * 6
            int r6 = r6 + r3
            java.nio.ByteBuffer r7 = r10.f19280n
            if (r7 == 0) goto L_0x00ff
            int r7 = r7.capacity()
            if (r7 >= r6) goto L_0x0105
        L_0x00ff:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r10.f19280n = r7
        L_0x0105:
            java.nio.ByteBuffer r7 = r10.f19280n
            r7.position(r5)
            java.nio.ByteBuffer r7 = r10.f19280n
            r7.putShort(r1)
            r1 = 0
            r7 = 0
        L_0x0111:
            int r8 = r10.f19261T
            if (r1 >= r8) goto L_0x0133
            com.google.android.exoplayer2.v0.w r8 = r10.f19273g
            int r8 = r8.mo24715z()
            int r9 = r1 % 2
            if (r9 != 0) goto L_0x0128
            java.nio.ByteBuffer r9 = r10.f19280n
            int r7 = r8 - r7
            short r7 = (short) r7
            r9.putShort(r7)
            goto L_0x012f
        L_0x0128:
            java.nio.ByteBuffer r9 = r10.f19280n
            int r7 = r8 - r7
            r9.putInt(r7)
        L_0x012f:
            int r1 = r1 + 1
            r7 = r8
            goto L_0x0111
        L_0x0133:
            int r1 = r10.f19255N
            int r1 = r13 - r1
            int r1 = r1 - r7
            int r8 = r8 % r3
            if (r8 != r4) goto L_0x0141
            java.nio.ByteBuffer r7 = r10.f19280n
            r7.putInt(r1)
            goto L_0x014c
        L_0x0141:
            java.nio.ByteBuffer r7 = r10.f19280n
            short r1 = (short) r1
            r7.putShort(r1)
            java.nio.ByteBuffer r1 = r10.f19280n
            r1.putInt(r5)
        L_0x014c:
            com.google.android.exoplayer2.v0.w r1 = r10.f19279m
            java.nio.ByteBuffer r7 = r10.f19280n
            byte[] r7 = r7.array()
            r1.mo24684a(r7, r6)
            com.google.android.exoplayer2.v0.w r1 = r10.f19279m
            r0.mo23305a(r1, r6)
            int r1 = r10.f19263V
            int r1 = r1 + r6
            r10.f19263V = r1
            goto L_0x016c
        L_0x0162:
            byte[] r1 = r12.f19322g
            if (r1 == 0) goto L_0x016c
            com.google.android.exoplayer2.v0.w r6 = r10.f19276j
            int r7 = r1.length
            r6.mo24684a(r1, r7)
        L_0x016c:
            r10.f19256O = r4
        L_0x016e:
            com.google.android.exoplayer2.v0.w r1 = r10.f19276j
            int r1 = r1.mo24690d()
            int r13 = r13 + r1
            java.lang.String r1 = r12.f19317b
            java.lang.String r6 = "V_MPEG4/ISO/AVC"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x01ac
            java.lang.String r1 = r12.f19317b
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x018a
            goto L_0x01ac
        L_0x018a:
            com.google.android.exoplayer2.s0.t.e$d r1 = r12.f19310Q
            if (r1 == 0) goto L_0x01a2
            com.google.android.exoplayer2.v0.w r1 = r10.f19276j
            int r1 = r1.mo24690d()
            if (r1 != 0) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            com.google.android.exoplayer2.p393v0.Assertions.checkState(r4)
            com.google.android.exoplayer2.s0.t.e$d r1 = r12.f19310Q
            int r3 = r10.f19254M
            r1.mo23353a(r11, r3, r13)
        L_0x01a2:
            int r1 = r10.f19255N
            if (r1 >= r13) goto L_0x01ea
            int r1 = r13 - r1
            r10.m26255a(r11, r0, r1)
            goto L_0x01a2
        L_0x01ac:
            com.google.android.exoplayer2.v0.w r1 = r10.f19272f
            byte[] r1 = r1.f22333a
            r1[r5] = r5
            r1[r4] = r5
            r1[r3] = r5
            int r3 = r12.f19315V
            int r4 = 4 - r3
        L_0x01ba:
            int r6 = r10.f19255N
            if (r6 >= r13) goto L_0x01ea
            int r6 = r10.f19262U
            if (r6 != 0) goto L_0x01e2
            r10.m26260a(r11, r1, r4, r3)
            com.google.android.exoplayer2.v0.w r6 = r10.f19272f
            r6.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r6 = r10.f19272f
            int r6 = r6.mo24715z()
            r10.f19262U = r6
            com.google.android.exoplayer2.v0.w r6 = r10.f19271e
            r6.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r6 = r10.f19271e
            r0.mo23305a(r6, r2)
            int r6 = r10.f19263V
            int r6 = r6 + r2
            r10.f19263V = r6
            goto L_0x01ba
        L_0x01e2:
            int r7 = r10.m26255a(r11, r0, r6)
            int r6 = r6 - r7
            r10.f19262U = r6
            goto L_0x01ba
        L_0x01ea:
            java.lang.String r11 = r12.f19317b
            java.lang.String r12 = "A_VORBIS"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0203
            com.google.android.exoplayer2.v0.w r11 = r10.f19274h
            r11.mo24693e(r5)
            com.google.android.exoplayer2.v0.w r11 = r10.f19274h
            r0.mo23305a(r11, r2)
            int r11 = r10.f19263V
            int r11 = r11 + r2
            r10.f19263V = r11
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p369t.C8941e.m26258a(com.google.android.exoplayer2.s0.h, com.google.android.exoplayer2.s0.t.e$c, int):void");
    }

    /* renamed from: a */
    private void m26259a(C8913h hVar, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        if (this.f19277k.mo24686b() < length) {
            this.f19277k.f22333a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.f19277k.f22333a, 0, bArr.length);
        }
        hVar.mo23289a(this.f19277k.f22333a, bArr.length, i);
        this.f19277k.mo24689c(length);
    }

    /* renamed from: a */
    private void m26262a(C8944c cVar, String str, int i, long j, byte[] bArr) {
        m26263a(this.f19277k.f22333a, this.f19248G, str, i, j, bArr);
        C8924q qVar = cVar.f19314U;
        C9572w wVar = this.f19277k;
        qVar.mo23305a(wVar, wVar.mo24690d());
        this.f19263V += this.f19277k.mo24690d();
    }

    /* renamed from: a */
    private static void m26263a(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (j == -9223372036854775807L) {
            bArr4 = bArr2;
            bArr3 = bArr4;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * DateTimeConstants.SECONDS_PER_HOUR)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * 1000000);
            int i4 = (int) (j4 / 1000000);
            int i5 = (int) ((j4 - (((long) i4) * 1000000)) / j2);
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            String str2 = str;
            bArr3 = Util.m29447d(String.format(Locale.US, str, objArr));
            bArr4 = bArr2;
        }
        byte[] bArr5 = bArr;
        int i6 = i;
        System.arraycopy(bArr3, 0, bArr, i, bArr4.length);
    }

    /* renamed from: a */
    private void m26260a(C8913h hVar, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.f19276j.mo24679a());
        hVar.mo23289a(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f19276j.mo24685a(bArr, i, min);
        }
        this.f19255N += i2;
    }

    /* renamed from: a */
    private int m26255a(C8913h hVar, C8924q qVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f19276j.mo24679a();
        if (a > 0) {
            i2 = Math.min(i, a);
            qVar.mo23305a(this.f19276j, i2);
        } else {
            i2 = qVar.mo23302a(hVar, i, false);
        }
        this.f19255N += i2;
        this.f19263V += i2;
        return i2;
    }

    /* renamed from: a */
    private boolean m26264a(C8919n nVar, long j) {
        if (this.f19290x) {
            this.f19292z = j;
            nVar.f19163a = this.f19291y;
            this.f19290x = false;
            return true;
        }
        if (this.f19287u) {
            long j2 = this.f19292z;
            if (j2 != -1) {
                nVar.f19163a = j2;
                this.f19292z = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private long m26256a(long j) throws C8723g0 {
        long j2 = this.f19283q;
        if (j2 != -9223372036854775807L) {
            return Util.m29439c(j, j2, 1000);
        }
        throw new C8723g0("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static boolean m26265a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    /* renamed from: a */
    private static int[] m26266a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
