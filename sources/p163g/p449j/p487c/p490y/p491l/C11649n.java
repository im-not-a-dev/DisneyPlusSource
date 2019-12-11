package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11556i;
import p163g.p449j.p487c.C11559l;
import p163g.p449j.p487c.C11560m;
import p163g.p449j.p487c.C11561n;
import p163g.p449j.p487c.C11562o;
import p163g.p449j.p487c.C11564q;
import p163g.p449j.p487c.C11567t;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p489x.C11576c;
import p163g.p449j.p487c.p490y.C11602f;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.n */
/* compiled from: TypeAdapters */
public final class C11649n {

    /* renamed from: A */
    public static final C11571v<String> f27151A = new C11663g();

    /* renamed from: B */
    public static final C11571v<BigDecimal> f27152B = new C11665h();

    /* renamed from: C */
    public static final C11571v<BigInteger> f27153C = new C11667i();

    /* renamed from: D */
    public static final C11573w f27154D = m37500a(String.class, f27151A);

    /* renamed from: E */
    public static final C11571v<StringBuilder> f27155E = new C11669j();

    /* renamed from: F */
    public static final C11573w f27156F = m37500a(StringBuilder.class, f27155E);

    /* renamed from: G */
    public static final C11571v<StringBuffer> f27157G = new C11672l();

    /* renamed from: H */
    public static final C11573w f27158H = m37500a(StringBuffer.class, f27157G);

    /* renamed from: I */
    public static final C11571v<URL> f27159I = new C11673m();

    /* renamed from: J */
    public static final C11573w f27160J = m37500a(URL.class, f27159I);

    /* renamed from: K */
    public static final C11571v<URI> f27161K = new C11674n();

    /* renamed from: L */
    public static final C11573w f27162L = m37500a(URI.class, f27161K);

    /* renamed from: M */
    public static final C11571v<InetAddress> f27163M = new C11675o();

    /* renamed from: N */
    public static final C11573w f27164N = m37502b(InetAddress.class, f27163M);

    /* renamed from: O */
    public static final C11571v<UUID> f27165O = new C11676p();

    /* renamed from: P */
    public static final C11573w f27166P = m37500a(UUID.class, f27165O);

    /* renamed from: Q */
    public static final C11571v<Currency> f27167Q = new C11677q().mo29567a();

    /* renamed from: R */
    public static final C11573w f27168R = m37500a(Currency.class, f27167Q);

    /* renamed from: S */
    public static final C11573w f27169S = new C11678r();

    /* renamed from: T */
    public static final C11571v<Calendar> f27170T = new C11680s();

    /* renamed from: U */
    public static final C11573w f27171U = m37503b(Calendar.class, GregorianCalendar.class, f27170T);

    /* renamed from: V */
    public static final C11571v<Locale> f27172V = new C11681t();

    /* renamed from: W */
    public static final C11573w f27173W = m37500a(Locale.class, f27172V);

    /* renamed from: X */
    public static final C11571v<C11559l> f27174X = new C11682u();

    /* renamed from: Y */
    public static final C11573w f27175Y = m37502b(C11559l.class, f27174X);

    /* renamed from: Z */
    public static final C11573w f27176Z = new C11684w();

    /* renamed from: a */
    public static final C11571v<Class> f27177a = new C11671k().mo29567a();

    /* renamed from: b */
    public static final C11573w f27178b = m37500a(Class.class, f27177a);

    /* renamed from: c */
    public static final C11571v<BitSet> f27179c = new C11683v().mo29567a();

    /* renamed from: d */
    public static final C11573w f27180d = m37500a(BitSet.class, f27179c);

    /* renamed from: e */
    public static final C11571v<Boolean> f27181e = new C11656c0();

    /* renamed from: f */
    public static final C11571v<Boolean> f27182f = new C11658d0();

    /* renamed from: g */
    public static final C11573w f27183g = m37501a(Boolean.TYPE, Boolean.class, f27181e);

    /* renamed from: h */
    public static final C11571v<Number> f27184h = new C11660e0();

    /* renamed from: i */
    public static final C11573w f27185i = m37501a(Byte.TYPE, Byte.class, f27184h);

    /* renamed from: j */
    public static final C11571v<Number> f27186j = new C11662f0();

    /* renamed from: k */
    public static final C11573w f27187k = m37501a(Short.TYPE, Short.class, f27186j);

    /* renamed from: l */
    public static final C11571v<Number> f27188l = new C11664g0();

    /* renamed from: m */
    public static final C11573w f27189m = m37501a(Integer.TYPE, Integer.class, f27188l);

    /* renamed from: n */
    public static final C11571v<AtomicInteger> f27190n = new C11666h0().mo29567a();

    /* renamed from: o */
    public static final C11573w f27191o = m37500a(AtomicInteger.class, f27190n);

    /* renamed from: p */
    public static final C11571v<AtomicBoolean> f27192p = new C11668i0().mo29567a();

    /* renamed from: q */
    public static final C11573w f27193q = m37500a(AtomicBoolean.class, f27192p);

    /* renamed from: r */
    public static final C11571v<AtomicIntegerArray> f27194r = new C11650a().mo29567a();

    /* renamed from: s */
    public static final C11573w f27195s = m37500a(AtomicIntegerArray.class, f27194r);

    /* renamed from: t */
    public static final C11571v<Number> f27196t = new C11653b();

    /* renamed from: u */
    public static final C11571v<Number> f27197u = new C11655c();

    /* renamed from: v */
    public static final C11571v<Number> f27198v = new C11657d();

    /* renamed from: w */
    public static final C11571v<Number> f27199w = new C11659e();

    /* renamed from: x */
    public static final C11573w f27200x = m37500a(Number.class, f27199w);

    /* renamed from: y */
    public static final C11571v<Character> f27201y = new C11661f();

    /* renamed from: z */
    public static final C11573w f27202z = m37501a(Character.TYPE, Character.class, f27201y);

    /* renamed from: g.j.c.y.l.n$a */
    /* compiled from: TypeAdapters */
    static class C11650a extends C11571v<AtomicIntegerArray> {
        C11650a() {
        }

        /* renamed from: a */
        public AtomicIntegerArray m37505a(C11533a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo29462a();
            while (aVar.mo29469f()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo29475k()));
                } catch (NumberFormatException e) {
                    throw new C11567t((Throwable) e);
                }
            }
            aVar.mo29467d();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.mo29484a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo29485a((long) atomicIntegerArray.get(i));
            }
            cVar.mo29491c();
        }
    }

    /* renamed from: g.j.c.y.l.n$a0 */
    /* compiled from: TypeAdapters */
    static class C11651a0 implements C11573w {

        /* renamed from: U */
        final /* synthetic */ C11571v f27203U;

        /* renamed from: c */
        final /* synthetic */ Class f27204c;

        /* renamed from: g.j.c.y.l.n$a0$a */
        /* compiled from: TypeAdapters */
        class C11652a extends C11571v<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f27205a;

            C11652a(Class cls) {
                this.f27205a = cls;
            }

            /* renamed from: a */
            public void mo29459a(C11536c cVar, T1 t1) throws IOException {
                C11651a0.this.f27203U.mo29459a(cVar, t1);
            }

            /* renamed from: a */
            public T1 mo29458a(C11533a aVar) throws IOException {
                T1 a = C11651a0.this.f27203U.mo29458a(aVar);
                if (a == null || this.f27205a.isInstance(a)) {
                    return a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a ");
                sb.append(this.f27205a.getName());
                sb.append(" but was ");
                sb.append(a.getClass().getName());
                throw new C11567t(sb.toString());
            }
        }

        C11651a0(Class cls, C11571v vVar) {
            this.f27204c = cls;
            this.f27203U = vVar;
        }

        /* renamed from: a */
        public <T2> C11571v<T2> mo16202a(C11547f fVar, C11689a<T2> aVar) {
            Class a = aVar.mo29701a();
            if (!this.f27204c.isAssignableFrom(a)) {
                return null;
            }
            return new C11652a(a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[typeHierarchy=");
            sb.append(this.f27204c.getName());
            sb.append(",adapter=");
            sb.append(this.f27203U);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: g.j.c.y.l.n$b */
    /* compiled from: TypeAdapters */
    static class C11653b extends C11571v<Number> {
        C11653b() {
        }

        /* renamed from: a */
        public Number m37512a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo29476l());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$b0 */
    /* compiled from: TypeAdapters */
    static /* synthetic */ class C11654b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27207a = new int[C11535b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                g.j.c.a0.b[] r0 = p163g.p449j.p487c.p488a0.C11535b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27207a = r0
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x004b }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0056 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x0062 }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x006e }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f27207a     // Catch:{ NoSuchFieldError -> 0x007a }
                g.j.c.a0.b r1 = p163g.p449j.p487c.p488a0.C11535b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.p491l.C11649n.C11654b0.<clinit>():void");
        }
    }

    /* renamed from: g.j.c.y.l.n$c */
    /* compiled from: TypeAdapters */
    static class C11655c extends C11571v<Number> {
        C11655c() {
        }

        /* renamed from: a */
        public Number m37516a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Float.valueOf((float) aVar.mo29473j());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$c0 */
    /* compiled from: TypeAdapters */
    static class C11656c0 extends C11571v<Boolean> {
        C11656c0() {
        }

        /* renamed from: a */
        public Boolean m37520a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            } else if (aVar.peek() == C11535b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo29479o()));
            } else {
                return Boolean.valueOf(aVar.mo29472i());
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Boolean bool) throws IOException {
            cVar.mo29486a(bool);
        }
    }

    /* renamed from: g.j.c.y.l.n$d */
    /* compiled from: TypeAdapters */
    static class C11657d extends C11571v<Number> {
        C11657d() {
        }

        /* renamed from: a */
        public Number m37524a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Double.valueOf(aVar.mo29473j());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$d0 */
    /* compiled from: TypeAdapters */
    static class C11658d0 extends C11571v<Boolean> {
        C11658d0() {
        }

        /* renamed from: a */
        public Boolean m37528a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Boolean.valueOf(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Boolean bool) throws IOException {
            cVar.mo29501g(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: g.j.c.y.l.n$e */
    /* compiled from: TypeAdapters */
    static class C11659e extends C11571v<Number> {
        C11659e() {
        }

        /* renamed from: a */
        public Number m37532a(C11533a aVar) throws IOException {
            C11535b peek = aVar.peek();
            int i = C11654b0.f27207a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C11602f(aVar.mo29479o());
            }
            if (i == 4) {
                aVar.mo29478n();
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting number, got: ");
            sb.append(peek);
            throw new C11567t(sb.toString());
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$e0 */
    /* compiled from: TypeAdapters */
    static class C11660e0 extends C11571v<Number> {
        C11660e0() {
        }

        /* renamed from: a */
        public Number m37536a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo29475k());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$f */
    /* compiled from: TypeAdapters */
    static class C11661f extends C11571v<Character> {
        C11661f() {
        }

        /* renamed from: a */
        public Character m37540a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            String o = aVar.mo29479o();
            if (o.length() == 1) {
                return Character.valueOf(o.charAt(0));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting character, got: ");
            sb.append(o);
            throw new C11567t(sb.toString());
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Character ch) throws IOException {
            cVar.mo29501g(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: g.j.c.y.l.n$f0 */
    /* compiled from: TypeAdapters */
    static class C11662f0 extends C11571v<Number> {
        C11662f0() {
        }

        /* renamed from: a */
        public Number m37544a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo29475k());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$g */
    /* compiled from: TypeAdapters */
    static class C11663g extends C11571v<String> {
        C11663g() {
        }

        /* renamed from: a */
        public String m37548a(C11533a aVar) throws IOException {
            C11535b peek = aVar.peek();
            if (peek == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            } else if (peek == C11535b.BOOLEAN) {
                return Boolean.toString(aVar.mo29472i());
            } else {
                return aVar.mo29479o();
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, String str) throws IOException {
            cVar.mo29501g(str);
        }
    }

    /* renamed from: g.j.c.y.l.n$g0 */
    /* compiled from: TypeAdapters */
    static class C11664g0 extends C11571v<Number> {
        C11664g0() {
        }

        /* renamed from: a */
        public Number m37552a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo29475k());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.y.l.n$h */
    /* compiled from: TypeAdapters */
    static class C11665h extends C11571v<BigDecimal> {
        C11665h() {
        }

        /* renamed from: a */
        public BigDecimal m37556a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo29479o());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.mo29487a((Number) bigDecimal);
        }
    }

    /* renamed from: g.j.c.y.l.n$h0 */
    /* compiled from: TypeAdapters */
    static class C11666h0 extends C11571v<AtomicInteger> {
        C11666h0() {
        }

        /* renamed from: a */
        public AtomicInteger m37560a(C11533a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo29475k());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.mo29485a((long) atomicInteger.get());
        }
    }

    /* renamed from: g.j.c.y.l.n$i */
    /* compiled from: TypeAdapters */
    static class C11667i extends C11571v<BigInteger> {
        C11667i() {
        }

        /* renamed from: a */
        public BigInteger m37564a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                return new BigInteger(aVar.mo29479o());
            } catch (NumberFormatException e) {
                throw new C11567t((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, BigInteger bigInteger) throws IOException {
            cVar.mo29487a((Number) bigInteger);
        }
    }

    /* renamed from: g.j.c.y.l.n$i0 */
    /* compiled from: TypeAdapters */
    static class C11668i0 extends C11571v<AtomicBoolean> {
        C11668i0() {
        }

        /* renamed from: a */
        public AtomicBoolean m37568a(C11533a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo29472i());
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.mo29495d(atomicBoolean.get());
        }
    }

    /* renamed from: g.j.c.y.l.n$j */
    /* compiled from: TypeAdapters */
    static class C11669j extends C11571v<StringBuilder> {
        C11669j() {
        }

        /* renamed from: a */
        public StringBuilder m37572a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return new StringBuilder(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, StringBuilder sb) throws IOException {
            cVar.mo29501g(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: g.j.c.y.l.n$j0 */
    /* compiled from: TypeAdapters */
    private static final class C11670j0<T extends Enum<T>> extends C11571v<T> {

        /* renamed from: a */
        private final Map<String, T> f27208a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f27209b = new HashMap();

        public C11670j0(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C11576c cVar = (C11576c) cls.getField(name).getAnnotation(C11576c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f27208a.put(put, enumR);
                        }
                    }
                    this.f27208a.put(name, enumR);
                    this.f27209b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m37576a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return (Enum) this.f27208a.get(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, T t) throws IOException {
            cVar.mo29501g(t == null ? null : (String) this.f27209b.get(t));
        }
    }

    /* renamed from: g.j.c.y.l.n$k */
    /* compiled from: TypeAdapters */
    static class C11671k extends C11571v<Class> {
        C11671k() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo29459a(C11536c cVar, Object obj) throws IOException {
            mo29686a(cVar, (Class) obj);
            throw null;
        }

        /* renamed from: a */
        public void mo29686a(C11536c cVar, Class cls) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: a */
        public Class mo29458a(C11533a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: g.j.c.y.l.n$l */
    /* compiled from: TypeAdapters */
    static class C11672l extends C11571v<StringBuffer> {
        C11672l() {
        }

        /* renamed from: a */
        public StringBuffer m37584a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return new StringBuffer(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.mo29501g(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: g.j.c.y.l.n$m */
    /* compiled from: TypeAdapters */
    static class C11673m extends C11571v<URL> {
        C11673m() {
        }

        /* renamed from: a */
        public URL m37588a(C11533a aVar) throws IOException {
            URL url = null;
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            String o = aVar.mo29479o();
            if (!"null".equals(o)) {
                url = new URL(o);
            }
            return url;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, URL url) throws IOException {
            cVar.mo29501g(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: g.j.c.y.l.n$n */
    /* compiled from: TypeAdapters */
    static class C11674n extends C11571v<URI> {
        C11674n() {
        }

        /* renamed from: a */
        public URI m37592a(C11533a aVar) throws IOException {
            URI uri = null;
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            try {
                String o = aVar.mo29479o();
                if (!"null".equals(o)) {
                    uri = new URI(o);
                }
                return uri;
            } catch (URISyntaxException e) {
                throw new C11560m((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, URI uri) throws IOException {
            cVar.mo29501g(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: g.j.c.y.l.n$o */
    /* compiled from: TypeAdapters */
    static class C11675o extends C11571v<InetAddress> {
        C11675o() {
        }

        /* renamed from: a */
        public InetAddress m37596a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return InetAddress.getByName(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, InetAddress inetAddress) throws IOException {
            cVar.mo29501g(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: g.j.c.y.l.n$p */
    /* compiled from: TypeAdapters */
    static class C11676p extends C11571v<UUID> {
        C11676p() {
        }

        /* renamed from: a */
        public UUID m37600a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return UUID.fromString(aVar.mo29479o());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, UUID uuid) throws IOException {
            cVar.mo29501g(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: g.j.c.y.l.n$q */
    /* compiled from: TypeAdapters */
    static class C11677q extends C11571v<Currency> {
        C11677q() {
        }

        /* renamed from: a */
        public Currency m37604a(C11533a aVar) throws IOException {
            return Currency.getInstance(aVar.mo29479o());
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Currency currency) throws IOException {
            cVar.mo29501g(currency.getCurrencyCode());
        }
    }

    /* renamed from: g.j.c.y.l.n$r */
    /* compiled from: TypeAdapters */
    static class C11678r implements C11573w {

        /* renamed from: g.j.c.y.l.n$r$a */
        /* compiled from: TypeAdapters */
        class C11679a extends C11571v<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C11571v f27210a;

            C11679a(C11678r rVar, C11571v vVar) {
                this.f27210a = vVar;
            }

            /* renamed from: a */
            public Timestamp m37609a(C11533a aVar) throws IOException {
                Date date = (Date) this.f27210a.mo29458a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: a */
            public void mo29459a(C11536c cVar, Timestamp timestamp) throws IOException {
                this.f27210a.mo29459a(cVar, timestamp);
            }
        }

        C11678r() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() != Timestamp.class) {
                return null;
            }
            return new C11679a(this, fVar.mo29511a(Date.class));
        }
    }

    /* renamed from: g.j.c.y.l.n$s */
    /* compiled from: TypeAdapters */
    static class C11680s extends C11571v<Calendar> {
        C11680s() {
        }

        /* renamed from: a */
        public Calendar m37613a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            aVar.mo29464b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.peek() != C11535b.END_OBJECT) {
                String m = aVar.mo29477m();
                int k = aVar.mo29475k();
                if ("year".equals(m)) {
                    i = k;
                } else if ("month".equals(m)) {
                    i2 = k;
                } else if ("dayOfMonth".equals(m)) {
                    i3 = k;
                } else if ("hourOfDay".equals(m)) {
                    i4 = k;
                } else if ("minute".equals(m)) {
                    i5 = k;
                } else if ("second".equals(m)) {
                    i6 = k;
                }
            }
            aVar.mo29468e();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.mo29503h();
                return;
            }
            cVar.mo29489b();
            cVar.mo29496e("year");
            cVar.mo29485a((long) calendar.get(1));
            cVar.mo29496e("month");
            cVar.mo29485a((long) calendar.get(2));
            cVar.mo29496e("dayOfMonth");
            cVar.mo29485a((long) calendar.get(5));
            cVar.mo29496e("hourOfDay");
            cVar.mo29485a((long) calendar.get(11));
            cVar.mo29496e("minute");
            cVar.mo29485a((long) calendar.get(12));
            cVar.mo29496e("second");
            cVar.mo29485a((long) calendar.get(13));
            cVar.mo29494d();
        }
    }

    /* renamed from: g.j.c.y.l.n$t */
    /* compiled from: TypeAdapters */
    static class C11681t extends C11571v<Locale> {
        C11681t() {
        }

        /* renamed from: a */
        public Locale m37617a(C11533a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo29479o(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Locale locale) throws IOException {
            cVar.mo29501g(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: g.j.c.y.l.n$u */
    /* compiled from: TypeAdapters */
    static class C11682u extends C11571v<C11559l> {
        C11682u() {
        }

        /* renamed from: a */
        public C11559l m37621a(C11533a aVar) throws IOException {
            switch (C11654b0.f27207a[aVar.peek().ordinal()]) {
                case 1:
                    return new C11564q((Number) new C11602f(aVar.mo29479o()));
                case 2:
                    return new C11564q(Boolean.valueOf(aVar.mo29472i()));
                case 3:
                    return new C11564q(aVar.mo29479o());
                case 4:
                    aVar.mo29478n();
                    return C11561n.f27022a;
                case 5:
                    C11556i iVar = new C11556i();
                    aVar.mo29462a();
                    while (aVar.mo29469f()) {
                        iVar.mo29533a(m37621a(aVar));
                    }
                    aVar.mo29467d();
                    return iVar;
                case 6:
                    C11562o oVar = new C11562o();
                    aVar.mo29464b();
                    while (aVar.mo29469f()) {
                        oVar.mo29548a(aVar.mo29477m(), m37621a(aVar));
                    }
                    aVar.mo29468e();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, C11559l lVar) throws IOException {
            if (lVar == null || lVar.mo29542f()) {
                cVar.mo29503h();
            } else if (lVar.mo29544h()) {
                C11564q d = lVar.mo29540d();
                if (d.mo29563q()) {
                    cVar.mo29487a(d.mo29560n());
                } else if (d.mo29562p()) {
                    cVar.mo29495d(d.mo29555i());
                } else {
                    cVar.mo29501g(d.mo29561o());
                }
            } else if (lVar.mo29541e()) {
                cVar.mo29484a();
                Iterator it = lVar.mo29538b().iterator();
                while (it.hasNext()) {
                    mo29459a(cVar, (C11559l) it.next());
                }
                cVar.mo29491c();
            } else if (lVar.mo29543g()) {
                cVar.mo29489b();
                for (Entry entry : lVar.mo29539c().mo29551i()) {
                    cVar.mo29496e((String) entry.getKey());
                    mo29459a(cVar, (C11559l) entry.getValue());
                }
                cVar.mo29494d();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't write ");
                sb.append(lVar.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: g.j.c.y.l.n$v */
    /* compiled from: TypeAdapters */
    static class C11683v extends C11571v<BitSet> {
        C11683v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo29475k() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet m37625a(p163g.p449j.p487c.p488a0.C11533a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo29462a()
                g.j.c.a0.b r1 = r8.peek()
                r2 = 0
                r3 = 0
            L_0x000e:
                g.j.c.a0.b r4 = p163g.p449j.p487c.p488a0.C11535b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = p163g.p449j.p487c.p490y.p491l.C11649n.C11654b0.f27207a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo29479o()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                g.j.c.t r8 = new g.j.c.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x0047:
                g.j.c.t r8 = new g.j.c.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo29472i()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo29475k()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                g.j.c.a0.b r1 = r8.peek()
                goto L_0x000e
            L_0x0075:
                r8.mo29467d()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.p491l.C11649n.C11683v.m37625a(g.j.c.a0.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, BitSet bitSet) throws IOException {
            cVar.mo29484a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo29485a(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo29491c();
        }
    }

    /* renamed from: g.j.c.y.l.n$w */
    /* compiled from: TypeAdapters */
    static class C11684w implements C11573w {
        C11684w() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            Class<Enum> a = aVar.mo29701a();
            if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
                return null;
            }
            if (!a.isEnum()) {
                a = a.getSuperclass();
            }
            return new C11670j0(a);
        }
    }

    /* renamed from: g.j.c.y.l.n$x */
    /* compiled from: TypeAdapters */
    static class C11685x implements C11573w {

        /* renamed from: U */
        final /* synthetic */ C11571v f27211U;

        /* renamed from: c */
        final /* synthetic */ Class f27212c;

        C11685x(Class cls, C11571v vVar) {
            this.f27212c = cls;
            this.f27211U = vVar;
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            if (aVar.mo29701a() == this.f27212c) {
                return this.f27211U;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f27212c.getName());
            sb.append(",adapter=");
            sb.append(this.f27211U);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: g.j.c.y.l.n$y */
    /* compiled from: TypeAdapters */
    static class C11686y implements C11573w {

        /* renamed from: U */
        final /* synthetic */ Class f27213U;

        /* renamed from: V */
        final /* synthetic */ C11571v f27214V;

        /* renamed from: c */
        final /* synthetic */ Class f27215c;

        C11686y(Class cls, Class cls2, C11571v vVar) {
            this.f27215c = cls;
            this.f27213U = cls2;
            this.f27214V = vVar;
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            Class a = aVar.mo29701a();
            if (a == this.f27215c || a == this.f27213U) {
                return this.f27214V;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f27213U.getName());
            sb.append("+");
            sb.append(this.f27215c.getName());
            sb.append(",adapter=");
            sb.append(this.f27214V);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: g.j.c.y.l.n$z */
    /* compiled from: TypeAdapters */
    static class C11687z implements C11573w {

        /* renamed from: U */
        final /* synthetic */ Class f27216U;

        /* renamed from: V */
        final /* synthetic */ C11571v f27217V;

        /* renamed from: c */
        final /* synthetic */ Class f27218c;

        C11687z(Class cls, Class cls2, C11571v vVar) {
            this.f27218c = cls;
            this.f27216U = cls2;
            this.f27217V = vVar;
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            Class a = aVar.mo29701a();
            if (a == this.f27218c || a == this.f27216U) {
                return this.f27217V;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f27218c.getName());
            sb.append("+");
            sb.append(this.f27216U.getName());
            sb.append(",adapter=");
            sb.append(this.f27217V);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static <TT> C11573w m37500a(Class<TT> cls, C11571v<TT> vVar) {
        return new C11685x(cls, vVar);
    }

    /* renamed from: b */
    public static <TT> C11573w m37503b(Class<TT> cls, Class<? extends TT> cls2, C11571v<? super TT> vVar) {
        return new C11687z(cls, cls2, vVar);
    }

    /* renamed from: a */
    public static <TT> C11573w m37501a(Class<TT> cls, Class<TT> cls2, C11571v<? super TT> vVar) {
        return new C11686y(cls, cls2, vVar);
    }

    /* renamed from: b */
    public static <T1> C11573w m37502b(Class<T1> cls, C11571v<T1> vVar) {
        return new C11651a0(cls, vVar);
    }
}
