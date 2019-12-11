package p096e.p121h.p132q;

import java.util.Locale;

/* renamed from: e.h.q.f */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C4096f {

    /* renamed from: a */
    public static final C4095e f10350a = new C4101e(null, false);

    /* renamed from: b */
    public static final C4095e f10351b = new C4101e(null, true);

    /* renamed from: c */
    public static final C4095e f10352c = new C4101e(C4098b.f10356a, false);

    /* renamed from: d */
    public static final C4095e f10353d = new C4101e(C4098b.f10356a, true);

    /* renamed from: e.h.q.f$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4097a implements C4099c {

        /* renamed from: b */
        static final C4097a f10354b = new C4097a(true);

        /* renamed from: a */
        private final boolean f10355a;

        private C4097a(boolean z) {
            this.f10355a = z;
        }

        /* renamed from: a */
        public int mo14655a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C4096f.m14054a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f10355a) {
                        return 1;
                    }
                } else if (this.f10355a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f10355a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: e.h.q.f$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4098b implements C4099c {

        /* renamed from: a */
        static final C4098b f10356a = new C4098b();

        private C4098b() {
        }

        /* renamed from: a */
        public int mo14655a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C4096f.m14055b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: e.h.q.f$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C4099c {
        /* renamed from: a */
        int mo14655a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: e.h.q.f$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C4100d implements C4095e {

        /* renamed from: a */
        private final C4099c f10357a;

        C4100d(C4099c cVar) {
            this.f10357a = cVar;
        }

        /* renamed from: b */
        private boolean m14059b(CharSequence charSequence, int i, int i2) {
            int a = this.f10357a.mo14655a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo14656a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo14656a();

        /* renamed from: a */
        public boolean mo14654a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f10357a == null) {
                return mo14656a();
            } else {
                return m14059b(charSequence, i, i2);
            }
        }
    }

    /* renamed from: e.h.q.f$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4101e extends C4100d {

        /* renamed from: b */
        private final boolean f10358b;

        C4101e(C4099c cVar, boolean z) {
            super(cVar);
            this.f10358b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo14656a() {
            return this.f10358b;
        }
    }

    /* renamed from: e.h.q.f$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4102f extends C4100d {

        /* renamed from: b */
        static final C4102f f10359b = new C4102f();

        C4102f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo14656a() {
            return C4103g.m14065b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C4101e(C4097a.f10354b, false);
        C4102f fVar = C4102f.f10359b;
    }

    /* renamed from: a */
    static int m14054a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m14055b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
