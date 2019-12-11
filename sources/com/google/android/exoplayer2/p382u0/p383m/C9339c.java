package com.google.android.exoplayer2.p382u0.p383m;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p382u0.C9330i;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.m.c */
/* compiled from: Cea708Decoder */
public final class C9339c extends C9343e {

    /* renamed from: g */
    private final C9572w f21414g = new C9572w();

    /* renamed from: h */
    private final C9571v f21415h = new C9571v();

    /* renamed from: i */
    private final int f21416i;

    /* renamed from: j */
    private final C9340a[] f21417j;

    /* renamed from: k */
    private C9340a f21418k;

    /* renamed from: l */
    private List<C9322b> f21419l;

    /* renamed from: m */
    private List<C9322b> f21420m;

    /* renamed from: n */
    private C9341b f21421n;

    /* renamed from: o */
    private int f21422o;

    /* renamed from: com.google.android.exoplayer2.u0.m.c$a */
    /* compiled from: Cea708Decoder */
    private static final class C9340a {

        /* renamed from: A */
        private static final int[] f21423A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        private static final int[] f21424B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        private static final boolean[] f21425C = {false, false, false, true, true, true, false};

        /* renamed from: D */
        private static final int[] f21426D;

        /* renamed from: E */
        private static final int[] f21427E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        private static final int[] f21428F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G */
        private static final int[] f21429G;

        /* renamed from: w */
        public static final int f21430w = m28458a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f21431x = m28458a(0, 0, 0, 0);

        /* renamed from: y */
        public static final int f21432y = m28458a(0, 0, 0, 3);

        /* renamed from: z */
        private static final int[] f21433z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a */
        private final List<SpannableString> f21434a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f21435b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f21436c;

        /* renamed from: d */
        private boolean f21437d;

        /* renamed from: e */
        private int f21438e;

        /* renamed from: f */
        private boolean f21439f;

        /* renamed from: g */
        private int f21440g;

        /* renamed from: h */
        private int f21441h;

        /* renamed from: i */
        private int f21442i;

        /* renamed from: j */
        private int f21443j;

        /* renamed from: k */
        private boolean f21444k;

        /* renamed from: l */
        private int f21445l;

        /* renamed from: m */
        private int f21446m;

        /* renamed from: n */
        private int f21447n;

        /* renamed from: o */
        private int f21448o;

        /* renamed from: p */
        private int f21449p;

        /* renamed from: q */
        private int f21450q;

        /* renamed from: r */
        private int f21451r;

        /* renamed from: s */
        private int f21452s;

        /* renamed from: t */
        private int f21453t;

        /* renamed from: u */
        private int f21454u;

        /* renamed from: v */
        private int f21455v;

        static {
            int i = f21431x;
            int i2 = f21432y;
            f21426D = new int[]{i, i2, i, i, i2, i, i};
            f21429G = new int[]{i, i, i, i, i, i2, i2};
        }

        public C9340a() {
            mo24180h();
        }

        /* renamed from: a */
        public void mo24172a(boolean z) {
            this.f21437d = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.p382u0.p383m.C9338b mo24174b() {
            /*
                r15 = this;
                boolean r0 = r15.mo24178f()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f21434a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f21434a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo24175c()
                r2.append(r1)
                int r1 = r15.f21445l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f21445l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f21439f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f21441h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f21440g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f21441h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f21440g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f21442i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0099
            L_0x0093:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x0098
                r8 = 1
                goto L_0x0099
            L_0x0098:
                r8 = 2
            L_0x0099:
                int r1 = r15.f21442i
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x00a1
                r9 = 0
                goto L_0x00a7
            L_0x00a1:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a6
                r9 = 1
                goto L_0x00a7
            L_0x00a6:
                r9 = 2
            L_0x00a7:
                int r1 = r15.f21448o
                int r3 = f21431x
                if (r1 == r3) goto L_0x00ae
                r0 = 1
            L_0x00ae:
                com.google.android.exoplayer2.u0.m.b r13 = new com.google.android.exoplayer2.u0.m.b
                r5 = 0
                r11 = 1
                int r12 = r15.f21448o
                int r14 = r15.f21438e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p383m.C9339c.C9340a.mo24174b():com.google.android.exoplayer2.u0.m.b");
        }

        /* renamed from: c */
        public SpannableString mo24175c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21435b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f21449p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f21449p, length, 33);
                }
                if (this.f21450q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f21450q, length, 33);
                }
                if (this.f21451r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f21452s), this.f21451r, length, 33);
                }
                if (this.f21453t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f21454u), this.f21453t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public void mo24176d() {
            this.f21434a.clear();
            this.f21435b.clear();
            this.f21449p = -1;
            this.f21450q = -1;
            this.f21451r = -1;
            this.f21453t = -1;
            this.f21455v = 0;
        }

        /* renamed from: e */
        public boolean mo24177e() {
            return this.f21436c;
        }

        /* renamed from: f */
        public boolean mo24178f() {
            return !mo24177e() || (this.f21434a.isEmpty() && this.f21435b.length() == 0);
        }

        /* renamed from: g */
        public boolean mo24179g() {
            return this.f21437d;
        }

        /* renamed from: h */
        public void mo24180h() {
            mo24176d();
            this.f21436c = false;
            this.f21437d = false;
            this.f21438e = 4;
            this.f21439f = false;
            this.f21440g = 0;
            this.f21441h = 0;
            this.f21442i = 0;
            this.f21443j = 15;
            this.f21444k = true;
            this.f21445l = 0;
            this.f21446m = 0;
            this.f21447n = 0;
            int i = f21431x;
            this.f21448o = i;
            this.f21452s = f21430w;
            this.f21454u = i;
        }

        /* renamed from: a */
        public void mo24173a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f21436c = true;
            this.f21437d = z;
            this.f21444k = z5;
            this.f21438e = i;
            this.f21439f = z4;
            this.f21440g = i2;
            this.f21441h = i3;
            this.f21442i = i6;
            int i11 = i4 + 1;
            if (this.f21443j != i11) {
                this.f21443j = i11;
                while (true) {
                    if ((!z5 || this.f21434a.size() < this.f21443j) && this.f21434a.size() < 15) {
                        break;
                    }
                    this.f21434a.remove(0);
                }
            }
            if (!(i9 == 0 || this.f21446m == i9)) {
                this.f21446m = i9;
                int i12 = i9 - 1;
                mo24171a(f21426D[i12], f21432y, f21425C[i12], 0, f21423A[i12], f21424B[i12], f21433z[i12]);
            }
            if (i10 != 0 && this.f21447n != i10) {
                this.f21447n = i10;
                int i13 = i10 - 1;
                mo24170a(0, 1, 1, false, false, f21428F[i13], f21427E[i13]);
                mo24169a(f21430w, f21429G[i13], f21431x);
            }
        }

        /* renamed from: a */
        public void mo24171a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f21448o = i;
            this.f21445l = i6;
        }

        /* renamed from: b */
        public static int m28459b(int i, int i2, int i3) {
            return m28458a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public void mo24170a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f21449p != -1) {
                if (!z) {
                    this.f21435b.setSpan(new StyleSpan(2), this.f21449p, this.f21435b.length(), 33);
                    this.f21449p = -1;
                }
            } else if (z) {
                this.f21449p = this.f21435b.length();
            }
            if (this.f21450q != -1) {
                if (!z2) {
                    this.f21435b.setSpan(new UnderlineSpan(), this.f21450q, this.f21435b.length(), 33);
                    this.f21450q = -1;
                }
            } else if (z2) {
                this.f21450q = this.f21435b.length();
            }
        }

        /* renamed from: a */
        public void mo24169a(int i, int i2, int i3) {
            if (this.f21451r != -1) {
                int i4 = this.f21452s;
                if (i4 != i) {
                    this.f21435b.setSpan(new ForegroundColorSpan(i4), this.f21451r, this.f21435b.length(), 33);
                }
            }
            if (i != f21430w) {
                this.f21451r = this.f21435b.length();
                this.f21452s = i;
            }
            if (this.f21453t != -1) {
                int i5 = this.f21454u;
                if (i5 != i2) {
                    this.f21435b.setSpan(new BackgroundColorSpan(i5), this.f21453t, this.f21435b.length(), 33);
                }
            }
            if (i2 != f21431x) {
                this.f21453t = this.f21435b.length();
                this.f21454u = i2;
            }
        }

        /* renamed from: a */
        public void mo24168a(int i, int i2) {
            if (this.f21455v != i) {
                mo24167a(10);
            }
            this.f21455v = i;
        }

        /* renamed from: a */
        public void mo24166a() {
            int length = this.f21435b.length();
            if (length > 0) {
                this.f21435b.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void mo24167a(char c) {
            if (c == 10) {
                this.f21434a.add(mo24175c());
                this.f21435b.clear();
                if (this.f21449p != -1) {
                    this.f21449p = 0;
                }
                if (this.f21450q != -1) {
                    this.f21450q = 0;
                }
                if (this.f21451r != -1) {
                    this.f21451r = 0;
                }
                if (this.f21453t != -1) {
                    this.f21453t = 0;
                }
                while (true) {
                    if ((this.f21444k && this.f21434a.size() >= this.f21443j) || this.f21434a.size() >= 15) {
                        this.f21434a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f21435b.append(c);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m28458a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                r1 = 0
                com.google.android.exoplayer2.util.Assertions.m29295a(r4, r1, r0)
                com.google.android.exoplayer2.util.Assertions.m29295a(r5, r1, r0)
                com.google.android.exoplayer2.util.Assertions.m29295a(r6, r1, r0)
                com.google.android.exoplayer2.util.Assertions.m29295a(r7, r1, r0)
                r0 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x001b
                if (r7 == r0) goto L_0x001b
                r3 = 2
                if (r7 == r3) goto L_0x0020
                r3 = 3
                if (r7 == r3) goto L_0x001e
            L_0x001b:
                r7 = 255(0xff, float:3.57E-43)
                goto L_0x0022
            L_0x001e:
                r7 = 0
                goto L_0x0022
            L_0x0020:
                r7 = 127(0x7f, float:1.78E-43)
            L_0x0022:
                if (r4 <= r0) goto L_0x0027
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0028
            L_0x0027:
                r4 = 0
            L_0x0028:
                if (r5 <= r0) goto L_0x002d
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                if (r6 <= r0) goto L_0x0032
                r1 = 255(0xff, float:3.57E-43)
            L_0x0032:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p383m.C9339c.C9340a.m28458a(int, int, int, int):int");
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.m.c$b */
    /* compiled from: Cea708Decoder */
    private static final class C9341b {

        /* renamed from: a */
        public final int f21456a;

        /* renamed from: b */
        public final int f21457b;

        /* renamed from: c */
        public final byte[] f21458c;

        /* renamed from: d */
        int f21459d = 0;

        public C9341b(int i, int i2) {
            this.f21456a = i;
            this.f21457b = i2;
            this.f21458c = new byte[((i2 * 2) - 1)];
        }
    }

    public C9339c(int i, List<byte[]> list) {
        if (i == -1) {
            i = 1;
        }
        this.f21416i = i;
        this.f21417j = new C9340a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f21417j[i2] = new C9340a();
        }
        this.f21418k = this.f21417j[0];
        m28454m();
    }

    /* renamed from: f */
    private void m28443f() {
        if (this.f21421n != null) {
            m28453l();
            this.f21421n = null;
        }
    }

    /* renamed from: g */
    private void m28446g(int i) {
        this.f21418k.mo24167a((char) (i & 255));
    }

    /* renamed from: h */
    private void m28448h(int i) {
        if (i == 32) {
            this.f21418k.mo24167a(' ');
        } else if (i == 33) {
            this.f21418k.mo24167a(160);
        } else if (i == 37) {
            this.f21418k.mo24167a(8230);
        } else if (i == 42) {
            this.f21418k.mo24167a(352);
        } else if (i == 44) {
            this.f21418k.mo24167a(338);
        } else if (i == 63) {
            this.f21418k.mo24167a(376);
        } else if (i == 57) {
            this.f21418k.mo24167a(8482);
        } else if (i == 58) {
            this.f21418k.mo24167a(353);
        } else if (i == 60) {
            this.f21418k.mo24167a(339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f21418k.mo24167a(9608);
                    return;
                case 49:
                    this.f21418k.mo24167a(8216);
                    return;
                case 50:
                    this.f21418k.mo24167a(8217);
                    return;
                case 51:
                    this.f21418k.mo24167a(8220);
                    return;
                case 52:
                    this.f21418k.mo24167a(8221);
                    return;
                case 53:
                    this.f21418k.mo24167a(8226);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f21418k.mo24167a(8539);
                            return;
                        case 119:
                            this.f21418k.mo24167a(8540);
                            return;
                        case 120:
                            this.f21418k.mo24167a(8541);
                            return;
                        case 121:
                            this.f21418k.mo24167a(8542);
                            return;
                        case 122:
                            this.f21418k.mo24167a(9474);
                            return;
                        case 123:
                            this.f21418k.mo24167a(9488);
                            return;
                        case 124:
                            this.f21418k.mo24167a(9492);
                            return;
                        case 125:
                            this.f21418k.mo24167a(9472);
                            return;
                        case 126:
                            this.f21418k.mo24167a(9496);
                            return;
                        case 127:
                            this.f21418k.mo24167a(9484);
                            return;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid G2 character: ");
                            sb.append(i);
                            Log.m29500d("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            this.f21418k.mo24167a(8480);
        }
    }

    /* renamed from: i */
    private void m28450i(int i) {
        if (i == 160) {
            this.f21418k.mo24167a(13252);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid G3 character: ");
        sb.append(i);
        Log.m29500d("Cea708Decoder", sb.toString());
        this.f21418k.mo24167a('_');
    }

    /* renamed from: j */
    private void m28451j() {
        this.f21415h.mo24670c(4);
        int a = this.f21415h.mo24660a(4);
        this.f21415h.mo24670c(2);
        this.f21418k.mo24168a(a, this.f21415h.mo24660a(6));
    }

    /* renamed from: k */
    private void m28452k() {
        int a = C9340a.m28458a(this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2));
        int a2 = this.f21415h.mo24660a(2);
        int b = C9340a.m28459b(this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2));
        if (this.f21415h.mo24673e()) {
            a2 |= 4;
        }
        int i = a2;
        boolean e = this.f21415h.mo24673e();
        int a3 = this.f21415h.mo24660a(2);
        int a4 = this.f21415h.mo24660a(2);
        int a5 = this.f21415h.mo24660a(2);
        this.f21415h.mo24670c(8);
        this.f21418k.mo24171a(a, b, e, i, a3, a4, a5);
    }

    /* renamed from: l */
    private void m28453l() {
        C9341b bVar = this.f21421n;
        int i = bVar.f21459d;
        String str = "Cea708Decoder";
        if (i != (bVar.f21457b * 2) - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f21421n.f21457b * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f21421n.f21459d);
            sb.append(" (sequence number ");
            sb.append(this.f21421n.f21456a);
            sb.append("); ignoring packet");
            Log.m29500d(str, sb.toString());
            return;
        }
        this.f21415h.mo24664a(bVar.f21458c, i);
        int a = this.f21415h.mo24660a(3);
        int a2 = this.f21415h.mo24660a(5);
        if (a == 7) {
            this.f21415h.mo24670c(2);
            a = this.f21415h.mo24660a(6);
            if (a < 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid extended service number: ");
                sb2.append(a);
                Log.m29500d(str, sb2.toString());
            }
        }
        if (a2 == 0) {
            if (a != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(a);
                sb3.append(") when blockSize is 0");
                Log.m29500d(str, sb3.toString());
            }
        } else if (a == this.f21416i) {
            boolean z = false;
            while (this.f21415h.mo24659a() > 0) {
                int a3 = this.f21415h.mo24660a(8);
                if (a3 == 16) {
                    int a4 = this.f21415h.mo24660a(8);
                    if (a4 <= 31) {
                        m28440c(a4);
                    } else if (a4 <= 127) {
                        m28448h(a4);
                    } else if (a4 <= 159) {
                        m28441d(a4);
                    } else if (a4 <= 255) {
                        m28450i(a4);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid extended command: ");
                        sb4.append(a4);
                        Log.m29500d(str, sb4.toString());
                    }
                } else if (a3 <= 31) {
                    m28438a(a3);
                } else if (a3 <= 127) {
                    m28444f(a3);
                } else if (a3 <= 159) {
                    m28439b(a3);
                } else if (a3 <= 255) {
                    m28446g(a3);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid base command: ");
                    sb5.append(a3);
                    Log.m29500d(str, sb5.toString());
                }
                z = true;
            }
            if (z) {
                this.f21419l = m28445g();
            }
        }
    }

    /* renamed from: m */
    private void m28454m() {
        for (int i = 0; i < 8; i++) {
            this.f21417j[i].mo24180h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C9325e mo24153d() {
        List<C9322b> list = this.f21419l;
        this.f21420m = list;
        return new C9347f(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo24154e() {
        return this.f21419l != this.f21420m;
    }

    public void flush() {
        super.flush();
        this.f21419l = null;
        this.f21420m = null;
        this.f21422o = 0;
        this.f21418k = this.f21417j[this.f21422o];
        m28454m();
        this.f21421n = null;
    }

    /* renamed from: c */
    private void m28440c(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f21415h.mo24670c(8);
            } else if (i <= 23) {
                this.f21415h.mo24670c(16);
            } else if (i <= 31) {
                this.f21415h.mo24670c(24);
            }
        }
    }

    /* renamed from: e */
    private void m28442e(int i) {
        C9340a aVar = this.f21417j[i];
        this.f21415h.mo24670c(2);
        boolean e = this.f21415h.mo24673e();
        boolean e2 = this.f21415h.mo24673e();
        boolean e3 = this.f21415h.mo24673e();
        int a = this.f21415h.mo24660a(3);
        boolean e4 = this.f21415h.mo24673e();
        int a2 = this.f21415h.mo24660a(7);
        int a3 = this.f21415h.mo24660a(8);
        int a4 = this.f21415h.mo24660a(4);
        int a5 = this.f21415h.mo24660a(4);
        this.f21415h.mo24670c(2);
        int a6 = this.f21415h.mo24660a(6);
        this.f21415h.mo24670c(2);
        aVar.mo24173a(e, e2, e3, a, e4, a2, a3, a5, a6, a4, this.f21415h.mo24660a(3), this.f21415h.mo24660a(3));
    }

    /* renamed from: g */
    private List<C9322b> m28445g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f21417j[i].mo24178f() && this.f21417j[i].mo24179g()) {
                arrayList.add(this.f21417j[i].mo24174b());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f21415h.mo24673e() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f21417j[8 - r2].mo24180h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f21415h.mo24673e() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f21417j[8 - r2].mo24172a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f21415h.mo24673e() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f21417j[8 - r2].mo24176d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28439b(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            com.google.android.exoplayer2.util.Log.m29500d(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.m28442e(r5)
            int r0 = r4.f21422o
            if (r0 == r5) goto L_0x0117
            r4.f21422o = r5
            com.google.android.exoplayer2.u0.m.c$a[] r0 = r4.f21417j
            r5 = r0[r5]
            r4.f21418k = r5
            goto L_0x0117
        L_0x0033:
            com.google.android.exoplayer2.u0.m.c$a r5 = r4.f21418k
            boolean r5 = r5.mo24177e()
            if (r5 != 0) goto L_0x0044
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            r0 = 32
            r5.mo24670c(r0)
            goto L_0x0117
        L_0x0044:
            r4.m28452k()
            goto L_0x0117
        L_0x0049:
            com.google.android.exoplayer2.u0.m.c$a r5 = r4.f21418k
            boolean r5 = r5.mo24177e()
            if (r5 != 0) goto L_0x0058
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            r5.mo24670c(r0)
            goto L_0x0117
        L_0x0058:
            r4.m28451j()
            goto L_0x0117
        L_0x005d:
            com.google.android.exoplayer2.u0.m.c$a r5 = r4.f21418k
            boolean r5 = r5.mo24177e()
            if (r5 != 0) goto L_0x006e
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            r0 = 24
            r5.mo24670c(r0)
            goto L_0x0117
        L_0x006e:
            r4.m28449i()
            goto L_0x0117
        L_0x0073:
            com.google.android.exoplayer2.u0.m.c$a r5 = r4.f21418k
            boolean r5 = r5.mo24177e()
            if (r5 != 0) goto L_0x0082
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            r5.mo24670c(r0)
            goto L_0x0117
        L_0x0082:
            r4.m28447h()
            goto L_0x0117
        L_0x0087:
            r4.m28454m()
            goto L_0x0117
        L_0x008c:
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            r5.mo24670c(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            boolean r5 = r5.mo24673e()
            if (r5 == 0) goto L_0x00a6
            com.google.android.exoplayer2.u0.m.c$a[] r5 = r4.f21417j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo24180h()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            com.google.android.exoplayer2.v0.v r0 = r4.f21415h
            boolean r0 = r0.mo24673e()
            if (r0 == 0) goto L_0x00c2
            com.google.android.exoplayer2.u0.m.c$a[] r0 = r4.f21417j
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo24179g()
            r3 = r3 ^ r2
            r0.mo24172a(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            boolean r5 = r5.mo24673e()
            if (r5 == 0) goto L_0x00d9
            com.google.android.exoplayer2.u0.m.c$a[] r5 = r4.f21417j
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo24172a(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            com.google.android.exoplayer2.v0.v r0 = r4.f21415h
            boolean r0 = r0.mo24673e()
            if (r0 == 0) goto L_0x00f0
            com.google.android.exoplayer2.u0.m.c$a[] r0 = r4.f21417j
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo24172a(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            com.google.android.exoplayer2.v0.v r5 = r4.f21415h
            boolean r5 = r5.mo24673e()
            if (r5 == 0) goto L_0x0106
            com.google.android.exoplayer2.u0.m.c$a[] r5 = r4.f21417j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo24176d()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f21422o
            if (r0 == r5) goto L_0x0117
            r4.f21422o = r5
            com.google.android.exoplayer2.u0.m.c$a[] r0 = r4.f21417j
            r5 = r0[r5]
            r4.f21418k = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p383m.C9339c.m28439b(int):void");
    }

    /* renamed from: d */
    private void m28441d(int i) {
        if (i <= 135) {
            this.f21415h.mo24670c(32);
        } else if (i <= 143) {
            this.f21415h.mo24670c(40);
        } else if (i <= 159) {
            this.f21415h.mo24670c(2);
            this.f21415h.mo24670c(this.f21415h.mo24660a(6) * 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24152a(C9330i iVar) {
        this.f21414g.mo24684a(iVar.f19023V.array(), iVar.f19023V.limit());
        while (this.f21414g.mo24679a() >= 3) {
            int v = this.f21414g.mo24711v() & 7;
            int i = v & 3;
            boolean z = false;
            boolean z2 = (v & 4) == 4;
            byte v2 = (byte) this.f21414g.mo24711v();
            byte v3 = (byte) this.f21414g.mo24711v();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m28443f();
                    int i2 = (v2 & 192) >> 6;
                    byte b = v2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    this.f21421n = new C9341b(i2, b);
                    C9341b bVar = this.f21421n;
                    byte[] bArr = bVar.f21458c;
                    int i3 = bVar.f21459d;
                    bVar.f21459d = i3 + 1;
                    bArr[i3] = v3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    Assertions.checkArgument(z);
                    C9341b bVar2 = this.f21421n;
                    if (bVar2 == null) {
                        Log.m29497b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.f21458c;
                        int i4 = bVar2.f21459d;
                        bVar2.f21459d = i4 + 1;
                        bArr2[i4] = v2;
                        int i5 = bVar2.f21459d;
                        bVar2.f21459d = i5 + 1;
                        bArr2[i5] = v3;
                    }
                }
                C9341b bVar3 = this.f21421n;
                if (bVar3.f21459d == (bVar3.f21457b * 2) - 1) {
                    m28443f();
                }
            }
        }
    }

    /* renamed from: f */
    private void m28444f(int i) {
        if (i == 127) {
            this.f21418k.mo24167a(9835);
        } else {
            this.f21418k.mo24167a((char) (i & 255));
        }
    }

    /* renamed from: i */
    private void m28449i() {
        int a = C9340a.m28458a(this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2));
        int a2 = C9340a.m28458a(this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2));
        this.f21415h.mo24670c(2);
        this.f21418k.mo24169a(a, a2, C9340a.m28459b(this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2)));
    }

    /* renamed from: a */
    private void m28438a(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f21419l = m28445g();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m28454m();
                    return;
                case 13:
                    this.f21418k.mo24167a(10);
                    return;
                case 14:
                    return;
                default:
                    String str = "Cea708Decoder";
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i);
                        Log.m29500d(str, sb.toString());
                        this.f21415h.mo24670c(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i);
                        Log.m29500d(str, sb2.toString());
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i);
                        Log.m29500d(str, sb3.toString());
                        this.f21415h.mo24670c(16);
                        return;
                    }
            }
        } else {
            this.f21418k.mo24166a();
        }
    }

    /* renamed from: h */
    private void m28447h() {
        this.f21418k.mo24170a(this.f21415h.mo24660a(4), this.f21415h.mo24660a(2), this.f21415h.mo24660a(2), this.f21415h.mo24673e(), this.f21415h.mo24673e(), this.f21415h.mo24660a(3), this.f21415h.mo24660a(3));
    }
}
