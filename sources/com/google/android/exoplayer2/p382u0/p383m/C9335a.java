package com.google.android.exoplayer2.p382u0.p383m;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.m.a */
/* compiled from: Cea608Decoder */
public final class C9335a extends C9343e {

    /* renamed from: A */
    private static final int[] f21378A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: B */
    private static final int[] f21379B = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, HttpStatus.HTTP_OK, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: C */
    private static final int[] f21380C = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: D */
    private static final boolean[] f21381D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: w */
    private static final int[] f21382w = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: x */
    private static final int[] f21383x = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final int[] f21384y = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: z */
    private static final int[] f21385z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: g */
    private final C9572w f21386g = new C9572w();

    /* renamed from: h */
    private final int f21387h;

    /* renamed from: i */
    private final int f21388i;

    /* renamed from: j */
    private final int f21389j;

    /* renamed from: k */
    private final ArrayList<C9336a> f21390k = new ArrayList<>();

    /* renamed from: l */
    private C9336a f21391l = new C9336a(0, 4);

    /* renamed from: m */
    private List<C9322b> f21392m;

    /* renamed from: n */
    private List<C9322b> f21393n;

    /* renamed from: o */
    private int f21394o;

    /* renamed from: p */
    private int f21395p;

    /* renamed from: q */
    private boolean f21396q;

    /* renamed from: r */
    private boolean f21397r;

    /* renamed from: s */
    private byte f21398s;

    /* renamed from: t */
    private byte f21399t;

    /* renamed from: u */
    private int f21400u = 0;

    /* renamed from: v */
    private boolean f21401v;

    /* renamed from: com.google.android.exoplayer2.u0.m.a$a */
    /* compiled from: Cea608Decoder */
    private static class C9336a {

        /* renamed from: a */
        private final List<C9337a> f21402a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f21403b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f21404c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f21405d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f21406e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f21407f;

        /* renamed from: g */
        private int f21408g;

        /* renamed from: h */
        private int f21409h;

        /* renamed from: com.google.android.exoplayer2.u0.m.a$a$a */
        /* compiled from: Cea608Decoder */
        private static class C9337a {

            /* renamed from: a */
            public final int f21410a;

            /* renamed from: b */
            public final boolean f21411b;

            /* renamed from: c */
            public int f21412c;

            public C9337a(int i, boolean z, int i2) {
                this.f21410a = i;
                this.f21411b = z;
                this.f21412c = i2;
            }
        }

        public C9336a(int i, int i2) {
            mo24159b(i);
            mo24163d(i2);
        }

        /* renamed from: d */
        public void mo24163d(int i) {
            this.f21409h = i;
        }

        /* renamed from: d */
        private SpannableString m28427d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21404c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f21402a.size()) {
                C9337a aVar = (C9337a) this.f21402a.get(i);
                boolean z2 = aVar.f21411b;
                int i7 = aVar.f21410a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C9335a.f21384y[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f21412c;
                i++;
                if (i8 != (i < this.f21402a.size() ? ((C9337a) this.f21402a.get(i)).f21412c : length)) {
                    if (i2 != -1 && !z2) {
                        m28425b(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m28422a(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m28423a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m28425b(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m28422a(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m28423a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: b */
        public void mo24159b(int i) {
            this.f21408g = i;
            this.f21402a.clear();
            this.f21403b.clear();
            this.f21404c.setLength(0);
            this.f21405d = 15;
            this.f21406e = 0;
            this.f21407f = 0;
        }

        /* renamed from: c */
        public void mo24162c(int i) {
            this.f21408g = i;
        }

        /* renamed from: a */
        public void mo24158a(int i, boolean z) {
            this.f21402a.add(new C9337a(i, z, this.f21404c.length()));
        }

        /* renamed from: c */
        public void mo24161c() {
            this.f21403b.add(m28427d());
            this.f21404c.setLength(0);
            this.f21402a.clear();
            int min = Math.min(this.f21409h, this.f21405d);
            while (this.f21403b.size() >= min) {
                this.f21403b.remove(0);
            }
        }

        /* renamed from: a */
        public void mo24156a() {
            int length = this.f21404c.length();
            if (length > 0) {
                this.f21404c.delete(length - 1, length);
                int size = this.f21402a.size() - 1;
                while (size >= 0) {
                    C9337a aVar = (C9337a) this.f21402a.get(size);
                    int i = aVar.f21412c;
                    if (i == length) {
                        aVar.f21412c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean mo24160b() {
            return this.f21402a.isEmpty() && this.f21403b.isEmpty() && this.f21404c.length() == 0;
        }

        /* renamed from: a */
        public void mo24157a(char c) {
            this.f21404c.append(c);
        }

        /* renamed from: a */
        public C9322b mo24155a(int i) {
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f21403b.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.f21403b.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(m28427d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f21406e + this.f21407f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f21408g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.f21408g != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            if (this.f21408g != 1) {
                i3 = this.f21405d;
                if (i3 <= 7) {
                    i2 = 0;
                    C9322b bVar = new C9322b(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, Float.MIN_VALUE);
                    return bVar;
                }
            }
            i3 = (this.f21405d - 15) - 2;
            i2 = 2;
            C9322b bVar2 = new C9322b(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, Float.MIN_VALUE);
            return bVar2;
        }

        /* renamed from: b */
        private static void m28425b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: a */
        private static void m28422a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: a */
        private static void m28423a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }
    }

    public C9335a(String str, int i) {
        this.f21387h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f21389j = 0;
            this.f21388i = 0;
        } else if (i == 2) {
            this.f21389j = 1;
            this.f21388i = 0;
        } else if (i == 3) {
            this.f21389j = 0;
            this.f21388i = 1;
        } else if (i != 4) {
            Log.m29500d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f21389j = 0;
            this.f21388i = 0;
        } else {
            this.f21389j = 1;
            this.f21388i = 1;
        }
        m28391a(0);
        m28408h();
        this.f21401v = true;
    }

    /* renamed from: b */
    private static int m28393b(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: c */
    private static boolean m28397c(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: d */
    private static boolean m28399d(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: e */
    private static boolean m28401e(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: f */
    private static boolean m28403f(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: g */
    private void m28406g(byte b) {
        if (b == 32) {
            m28391a(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m28391a(1);
                    m28395b(2);
                    return;
                case 38:
                    m28391a(1);
                    m28395b(3);
                    return;
                case 39:
                    m28391a(1);
                    m28395b(4);
                    return;
                default:
                    int i = this.f21394o;
                    if (i != 0) {
                        if (b != 33) {
                            if (b != 36) {
                                switch (b) {
                                    case 44:
                                        this.f21392m = Collections.emptyList();
                                        int i2 = this.f21394o;
                                        if (i2 == 1 || i2 == 3) {
                                            m28408h();
                                            break;
                                        }
                                    case 45:
                                        if (i == 1 && !this.f21391l.mo24160b()) {
                                            this.f21391l.mo24161c();
                                            break;
                                        }
                                    case 46:
                                        m28408h();
                                        break;
                                    case 47:
                                        this.f21392m = m28405g();
                                        m28408h();
                                        break;
                                }
                            }
                        } else {
                            this.f21391l.mo24156a();
                        }
                        return;
                    }
                    return;
            }
        } else {
            m28391a(3);
        }
    }

    /* renamed from: g */
    private static boolean m28407g(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: h */
    private void m28408h() {
        this.f21391l.mo24159b(this.f21394o);
        this.f21390k.clear();
        this.f21390k.add(this.f21391l);
    }

    /* renamed from: h */
    private static boolean m28409h(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: h */
    private static boolean m28410h(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: i */
    private void m28411i(byte b, byte b2) {
        if (m28414k(b)) {
            this.f21401v = false;
        } else if (m28413j(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f21401v = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f21401v = true;
        }
    }

    /* renamed from: i */
    private static boolean m28412i(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: j */
    private static boolean m28413j(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: k */
    private static boolean m28414k(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: l */
    private boolean m28415l(byte b) {
        if (m28409h(b)) {
            this.f21400u = m28393b(b);
        }
        return this.f21400u == this.f21389j;
    }

    /* renamed from: a */
    public void mo23217a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C9325e mo24153d() {
        List<C9322b> list = this.f21392m;
        this.f21393n = list;
        return new C9347f(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo24154e() {
        return this.f21392m != this.f21393n;
    }

    public void flush() {
        super.flush();
        this.f21392m = null;
        this.f21393n = null;
        m28391a(0);
        m28395b(4);
        m28408h();
        this.f21396q = false;
        this.f21397r = false;
        this.f21398s = 0;
        this.f21399t = 0;
        this.f21400u = 0;
        this.f21401v = true;
    }

    /* renamed from: c */
    private static char m28396c(byte b) {
        return (char) f21379B[b & 31];
    }

    /* renamed from: e */
    private static char m28400e(byte b) {
        return (char) f21378A[b & 15];
    }

    /* renamed from: f */
    private void m28402f(byte b) {
        this.f21391l.mo24157a(' ');
        this.f21391l.mo24158a((b >> 1) & 7, (b & 1) == 1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0014 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24152a(com.google.android.exoplayer2.p382u0.C9330i r10) {
        /*
            r9 = this;
            com.google.android.exoplayer2.v0.w r0 = r9.f21386g
            java.nio.ByteBuffer r1 = r10.f19023V
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r10 = r10.f19023V
            int r10 = r10.limit()
            r0.mo24684a(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0014:
            com.google.android.exoplayer2.v0.w r2 = r9.f21386g
            int r2 = r2.mo24679a()
            int r3 = r9.f21387h
            if (r2 < r3) goto L_0x00f4
            r2 = 2
            if (r3 != r2) goto L_0x0023
            r2 = -4
            goto L_0x002a
        L_0x0023:
            com.google.android.exoplayer2.v0.w r2 = r9.f21386g
            int r2 = r2.mo24711v()
            byte r2 = (byte) r2
        L_0x002a:
            com.google.android.exoplayer2.v0.w r3 = r9.f21386g
            int r3 = r3.mo24711v()
            com.google.android.exoplayer2.v0.w r4 = r9.f21386g
            int r4 = r4.mo24711v()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            r5 = r2 & 1
            int r6 = r9.f21388i
            if (r5 == r6) goto L_0x0042
            goto L_0x0014
        L_0x0042:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x004d
            if (r6 != 0) goto L_0x004d
            goto L_0x0014
        L_0x004d:
            boolean r7 = r9.f21396q
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0060
            boolean[] r2 = f21381D
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0060
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            r9.f21396q = r2
            boolean r2 = r9.f21396q
            boolean r2 = r9.m28392a(r2, r5, r6)
            if (r2 == 0) goto L_0x006c
            goto L_0x0014
        L_0x006c:
            boolean r2 = r9.f21396q
            if (r2 != 0) goto L_0x0077
            if (r7 == 0) goto L_0x0014
            r9.m28408h()
        L_0x0075:
            r1 = 1
            goto L_0x0014
        L_0x0077:
            r9.m28411i(r5, r6)
            boolean r2 = r9.f21401v
            if (r2 != 0) goto L_0x007f
            goto L_0x0014
        L_0x007f:
            boolean r2 = r9.m28415l(r5)
            if (r2 != 0) goto L_0x0086
            goto L_0x0014
        L_0x0086:
            boolean r1 = m28409h(r5)
            if (r1 == 0) goto L_0x00dd
            boolean r1 = m28407g(r5, r6)
            if (r1 == 0) goto L_0x009c
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            char r2 = m28400e(r6)
            r1.mo24157a(r2)
            goto L_0x0075
        L_0x009c:
            boolean r1 = m28397c(r5, r6)
            if (r1 == 0) goto L_0x00b1
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            r1.mo24156a()
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            char r2 = m28390a(r5, r6)
            r1.mo24157a(r2)
            goto L_0x0075
        L_0x00b1:
            boolean r1 = m28399d(r5, r6)
            if (r1 == 0) goto L_0x00bb
            r9.m28402f(r6)
            goto L_0x0075
        L_0x00bb:
            boolean r1 = m28403f(r5, r6)
            if (r1 == 0) goto L_0x00c5
            r9.m28394b(r5, r6)
            goto L_0x0075
        L_0x00c5:
            boolean r1 = m28410h(r5, r6)
            if (r1 == 0) goto L_0x00d3
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            int r6 = r6 + -32
            r1.f21407f = r6
            goto L_0x0075
        L_0x00d3:
            boolean r1 = m28401e(r5, r6)
            if (r1 == 0) goto L_0x0075
            r9.m28406g(r6)
            goto L_0x0075
        L_0x00dd:
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            char r2 = m28389a(r5)
            r1.mo24157a(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0075
            com.google.android.exoplayer2.u0.m.a$a r1 = r9.f21391l
            char r2 = m28389a(r6)
            r1.mo24157a(r2)
            goto L_0x0075
        L_0x00f4:
            if (r1 == 0) goto L_0x0103
            int r10 = r9.f21394o
            if (r10 == r0) goto L_0x00fd
            r0 = 3
            if (r10 != r0) goto L_0x0103
        L_0x00fd:
            java.util.List r10 = r9.m28405g()
            r9.f21392m = r10
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p383m.C9335a.mo24152a(com.google.android.exoplayer2.u0.i):void");
    }

    /* renamed from: b */
    private void m28394b(byte b, byte b2) {
        int i = f21382w[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f21391l.f21405d) {
            if (this.f21394o != 1 && !this.f21391l.mo24160b()) {
                this.f21391l = new C9336a(this.f21394o, this.f21395p);
                this.f21390k.add(this.f21391l);
            }
            this.f21391l.f21405d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f21391l.mo24158a(z2 ? 8 : i2, z);
        if (z2) {
            this.f21391l.f21406e = f21383x[i2];
        }
    }

    /* renamed from: d */
    private static char m28398d(byte b) {
        return (char) f21380C[b & 31];
    }

    /* renamed from: b */
    private void m28395b(int i) {
        this.f21395p = i;
        this.f21391l.mo24163d(i);
    }

    /* renamed from: g */
    private List<C9322b> m28405g() {
        int size = this.f21390k.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C9322b a = ((C9336a) this.f21390k.get(i2)).mo24155a(Integer.MIN_VALUE);
            arrayList.add(a);
            if (a != null) {
                i = Math.min(i, a.f21352a0);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C9322b bVar = (C9322b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.f21352a0 != i) {
                    bVar = ((C9336a) this.f21390k.get(i3)).mo24155a(i);
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private boolean m28392a(boolean z, byte b, byte b2) {
        if (!z || !m28412i(b)) {
            this.f21397r = false;
        } else if (this.f21397r && this.f21398s == b && this.f21399t == b2) {
            this.f21397r = false;
            return true;
        } else {
            this.f21397r = true;
            this.f21398s = b;
            this.f21399t = b2;
        }
        return false;
    }

    /* renamed from: a */
    private void m28391a(int i) {
        int i2 = this.f21394o;
        if (i2 != i) {
            this.f21394o = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f21390k.size(); i3++) {
                    ((C9336a) this.f21390k.get(i3)).mo24162c(i);
                }
                return;
            }
            m28408h();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f21392m = Collections.emptyList();
            }
        }
    }

    /* renamed from: a */
    private static char m28389a(byte b) {
        return (char) f21385z[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: a */
    private static char m28390a(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m28396c(b2);
        }
        return m28398d(b2);
    }
}
