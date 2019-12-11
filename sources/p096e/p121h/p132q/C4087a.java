package p096e.p121h.p132q;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: e.h.q.a */
/* compiled from: BidiFormatter */
public final class C4087a {

    /* renamed from: d */
    static final C4095e f10320d = C4096f.f10352c;

    /* renamed from: e */
    private static final String f10321e = Character.toString(8206);

    /* renamed from: f */
    private static final String f10322f = Character.toString(8207);

    /* renamed from: g */
    static final C4087a f10323g = new C4087a(false, 2, f10320d);

    /* renamed from: h */
    static final C4087a f10324h = new C4087a(true, 2, f10320d);

    /* renamed from: a */
    private final boolean f10325a;

    /* renamed from: b */
    private final int f10326b;

    /* renamed from: c */
    private final C4095e f10327c;

    /* renamed from: e.h.q.a$a */
    /* compiled from: BidiFormatter */
    public static final class C4088a {

        /* renamed from: a */
        private boolean f10328a;

        /* renamed from: b */
        private int f10329b;

        /* renamed from: c */
        private C4095e f10330c;

        public C4088a() {
            m14028b(C4087a.m14019a(Locale.getDefault()));
        }

        /* renamed from: a */
        private static C4087a m14027a(boolean z) {
            return z ? C4087a.f10324h : C4087a.f10323g;
        }

        /* renamed from: b */
        private void m14028b(boolean z) {
            this.f10328a = z;
            this.f10330c = C4087a.f10320d;
            this.f10329b = 2;
        }

        /* renamed from: a */
        public C4087a mo14625a() {
            if (this.f10329b == 2 && this.f10330c == C4087a.f10320d) {
                return m14027a(this.f10328a);
            }
            return new C4087a(this.f10328a, this.f10329b, this.f10330c);
        }
    }

    /* renamed from: e.h.q.a$b */
    /* compiled from: BidiFormatter */
    private static class C4089b {

        /* renamed from: f */
        private static final byte[] f10331f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f10332a;

        /* renamed from: b */
        private final boolean f10333b;

        /* renamed from: c */
        private final int f10334c;

        /* renamed from: d */
        private int f10335d;

        /* renamed from: e */
        private char f10336e;

        static {
            for (int i = 0; i < 1792; i++) {
                f10331f[i] = Character.getDirectionality(i);
            }
        }

        C4089b(CharSequence charSequence, boolean z) {
            this.f10332a = charSequence;
            this.f10333b = z;
            this.f10334c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m14030a(char c) {
            return c < 1792 ? f10331f[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m14031e() {
            char c;
            int i = this.f10335d;
            do {
                int i2 = this.f10335d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10332a;
                int i3 = i2 - 1;
                this.f10335d = i3;
                this.f10336e = charSequence.charAt(i3);
                c = this.f10336e;
                if (c == '&') {
                    return 12;
                }
            } while (c != ';');
            this.f10335d = i;
            this.f10336e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m14032f() {
            char charAt;
            do {
                int i = this.f10335d;
                if (i >= this.f10334c) {
                    break;
                }
                CharSequence charSequence = this.f10332a;
                this.f10335d = i + 1;
                charAt = charSequence.charAt(i);
                this.f10336e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: g */
        private byte m14033g() {
            char charAt;
            int i = this.f10335d;
            while (true) {
                int i2 = this.f10335d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10332a;
                int i3 = i2 - 1;
                this.f10335d = i3;
                this.f10336e = charSequence.charAt(i3);
                char c = this.f10336e;
                if (c == '<') {
                    return 12;
                }
                if (c == '>') {
                    break;
                } else if (c == '\"' || c == '\'') {
                    char c2 = this.f10336e;
                    do {
                        int i4 = this.f10335d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f10332a;
                        int i5 = i4 - 1;
                        this.f10335d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f10336e = charAt;
                    } while (charAt != c2);
                }
            }
            this.f10335d = i;
            this.f10336e = '>';
            return 13;
        }

        /* renamed from: h */
        private byte m14034h() {
            char charAt;
            int i = this.f10335d;
            while (true) {
                int i2 = this.f10335d;
                if (i2 < this.f10334c) {
                    CharSequence charSequence = this.f10332a;
                    this.f10335d = i2 + 1;
                    this.f10336e = charSequence.charAt(i2);
                    char c = this.f10336e;
                    if (c == '>') {
                        return 12;
                    }
                    if (c == '\"' || c == '\'') {
                        char c2 = this.f10336e;
                        do {
                            int i3 = this.f10335d;
                            if (i3 >= this.f10334c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f10332a;
                            this.f10335d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f10336e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.f10335d = i;
                    this.f10336e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public byte mo14627b() {
            this.f10336e = this.f10332a.charAt(this.f10335d);
            if (Character.isHighSurrogate(this.f10336e)) {
                int codePointAt = Character.codePointAt(this.f10332a, this.f10335d);
                this.f10335d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f10335d++;
            byte a = m14030a(this.f10336e);
            if (this.f10333b) {
                char c = this.f10336e;
                if (c == '<') {
                    a = m14034h();
                } else if (c == '&') {
                    a = m14032f();
                }
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo14628c() {
            this.f10335d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f10335d < this.f10334c && i == 0) {
                byte b = mo14627b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f10335d > 0) {
                switch (mo14626a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo14629d() {
            /*
                r7 = this;
                int r0 = r7.f10334c
                r7.f10335d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f10335d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo14626a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p132q.C4087a.C4089b.mo14629d():int");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte mo14626a() {
            this.f10336e = this.f10332a.charAt(this.f10335d - 1);
            if (Character.isLowSurrogate(this.f10336e)) {
                int codePointBefore = Character.codePointBefore(this.f10332a, this.f10335d);
                this.f10335d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f10335d--;
            byte a = m14030a(this.f10336e);
            if (this.f10333b) {
                char c = this.f10336e;
                if (c == '>') {
                    a = m14033g();
                } else if (c == ';') {
                    a = m14031e();
                }
            }
            return a;
        }
    }

    C4087a(boolean z, int i, C4095e eVar) {
        this.f10325a = z;
        this.f10326b = i;
        this.f10327c = eVar;
    }

    /* renamed from: b */
    public static C4087a m14021b() {
        return new C4088a().mo14625a();
    }

    /* renamed from: c */
    private static int m14023c(CharSequence charSequence) {
        return new C4089b(charSequence, false).mo14629d();
    }

    /* renamed from: a */
    public boolean mo14624a() {
        return (this.f10326b & 2) != 0;
    }

    /* renamed from: a */
    private String m14018a(CharSequence charSequence, C4095e eVar) {
        boolean a = eVar.mo14654a(charSequence, 0, charSequence.length());
        if (this.f10325a || (!a && m14023c(charSequence) != 1)) {
            return (!this.f10325a || (a && m14023c(charSequence) != -1)) ? "" : f10322f;
        }
        return f10321e;
    }

    /* renamed from: b */
    private String m14022b(CharSequence charSequence, C4095e eVar) {
        boolean a = eVar.mo14654a(charSequence, 0, charSequence.length());
        if (this.f10325a || (!a && m14020b(charSequence) != 1)) {
            return (!this.f10325a || (a && m14020b(charSequence) != -1)) ? "" : f10322f;
        }
        return f10321e;
    }

    /* renamed from: b */
    private static int m14020b(CharSequence charSequence) {
        return new C4089b(charSequence, false).mo14628c();
    }

    /* renamed from: a */
    public CharSequence mo14623a(CharSequence charSequence, C4095e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo14654a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo14624a() && z) {
            spannableStringBuilder.append(m14022b(charSequence, a ? C4096f.f10351b : C4096f.f10350a));
        }
        if (a != this.f10325a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m14018a(charSequence, a ? C4096f.f10351b : C4096f.f10350a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public CharSequence mo14622a(CharSequence charSequence) {
        return mo14623a(charSequence, this.f10327c, true);
    }

    /* renamed from: a */
    static boolean m14019a(Locale locale) {
        return C4103g.m14065b(locale) == 1;
    }
}
