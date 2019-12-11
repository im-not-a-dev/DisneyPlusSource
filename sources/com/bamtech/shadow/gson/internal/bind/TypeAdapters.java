package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2131g;
import com.bamtech.shadow.gson.C2133i;
import com.bamtech.shadow.gson.C2233j;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2237n;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonObject;
import com.bamtech.shadow.gson.internal.C2214e;
import com.bamtech.shadow.gson.p050r.C2246c;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
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

public final class TypeAdapters {

    /* renamed from: A */
    public static final C2241p<String> f6207A = new C2172g();

    /* renamed from: B */
    public static final C2241p<BigDecimal> f6208B = new C2173h();

    /* renamed from: C */
    public static final C2241p<BigInteger> f6209C = new C2174i();

    /* renamed from: D */
    public static final C2243q f6210D = m8363a(String.class, f6207A);

    /* renamed from: E */
    public static final C2241p<StringBuilder> f6211E = new C2175j();

    /* renamed from: F */
    public static final C2243q f6212F = m8363a(StringBuilder.class, f6211E);

    /* renamed from: G */
    public static final C2241p<StringBuffer> f6213G = new C2177l();

    /* renamed from: H */
    public static final C2243q f6214H = m8363a(StringBuffer.class, f6213G);

    /* renamed from: I */
    public static final C2241p<URL> f6215I = new C2178m();

    /* renamed from: J */
    public static final C2243q f6216J = m8363a(URL.class, f6215I);

    /* renamed from: K */
    public static final C2241p<URI> f6217K = new C2179n();

    /* renamed from: L */
    public static final C2243q f6218L = m8363a(URI.class, f6217K);

    /* renamed from: M */
    public static final C2241p<InetAddress> f6219M = new C2180o();

    /* renamed from: N */
    public static final C2243q f6220N = m8365b(InetAddress.class, f6219M);

    /* renamed from: O */
    public static final C2241p<UUID> f6221O = new C2181p();

    /* renamed from: P */
    public static final C2243q f6222P = m8363a(UUID.class, f6221O);

    /* renamed from: Q */
    public static final C2241p<Currency> f6223Q = new C2182q().mo11270a();

    /* renamed from: R */
    public static final C2243q f6224R = m8363a(Currency.class, f6223Q);

    /* renamed from: S */
    public static final C2243q f6225S = new C2243q() {

        /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$26$a */
        class C2154a extends C2241p<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C2241p f6259a;

            C2154a(C215326 r1, C2241p pVar) {
                this.f6259a = pVar;
            }

            /* renamed from: a */
            public Timestamp m8369a(C2249a aVar) throws IOException {
                Date date = (Date) this.f6259a.mo11055a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: a */
            public void mo11057a(C2252c cVar, Timestamp timestamp) throws IOException {
                this.f6259a.mo11057a(cVar, timestamp);
            }
        }

        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new C2154a(this, gson.mo11037a(Date.class));
        }
    };

    /* renamed from: T */
    public static final C2241p<Calendar> f6226T = new C2183r();

    /* renamed from: U */
    public static final C2243q f6227U = m8366b(Calendar.class, GregorianCalendar.class, f6226T);

    /* renamed from: V */
    public static final C2241p<Locale> f6228V = new C2184s();

    /* renamed from: W */
    public static final C2243q f6229W = m8363a(Locale.class, f6228V);

    /* renamed from: X */
    public static final C2241p<JsonElement> f6230X = new C2185t();

    /* renamed from: Y */
    public static final C2243q f6231Y = m8365b(JsonElement.class, f6230X);

    /* renamed from: Z */
    public static final C2243q f6232Z = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            Class<Enum> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new C2169d0(rawType);
        }
    };

    /* renamed from: a */
    public static final C2241p<Class> f6233a = new C2176k().mo11270a();

    /* renamed from: b */
    public static final C2243q f6234b = m8363a(Class.class, f6233a);

    /* renamed from: c */
    public static final C2241p<BitSet> f6235c = new C2186u().mo11270a();

    /* renamed from: d */
    public static final C2243q f6236d = m8363a(BitSet.class, f6235c);

    /* renamed from: e */
    public static final C2241p<Boolean> f6237e = new C2188w();

    /* renamed from: f */
    public static final C2241p<Boolean> f6238f = new C2189x();

    /* renamed from: g */
    public static final C2243q f6239g = m8364a(Boolean.TYPE, Boolean.class, f6237e);

    /* renamed from: h */
    public static final C2241p<Number> f6240h = new C2190y();

    /* renamed from: i */
    public static final C2243q f6241i = m8364a(Byte.TYPE, Byte.class, f6240h);

    /* renamed from: j */
    public static final C2241p<Number> f6242j = new C2191z();

    /* renamed from: k */
    public static final C2243q f6243k = m8364a(Short.TYPE, Short.class, f6242j);

    /* renamed from: l */
    public static final C2241p<Number> f6244l = new C2163a0();

    /* renamed from: m */
    public static final C2243q f6245m = m8364a(Integer.TYPE, Integer.class, f6244l);

    /* renamed from: n */
    public static final C2241p<AtomicInteger> f6246n = new C2165b0().mo11270a();

    /* renamed from: o */
    public static final C2243q f6247o = m8363a(AtomicInteger.class, f6246n);

    /* renamed from: p */
    public static final C2241p<AtomicBoolean> f6248p = new C2167c0().mo11270a();

    /* renamed from: q */
    public static final C2243q f6249q = m8363a(AtomicBoolean.class, f6248p);

    /* renamed from: r */
    public static final C2241p<AtomicIntegerArray> f6250r = new C2162a().mo11270a();

    /* renamed from: s */
    public static final C2243q f6251s = m8363a(AtomicIntegerArray.class, f6250r);

    /* renamed from: t */
    public static final C2241p<Number> f6252t = new C2164b();

    /* renamed from: u */
    public static final C2241p<Number> f6253u = new C2166c();

    /* renamed from: v */
    public static final C2241p<Number> f6254v = new C2168d();

    /* renamed from: w */
    public static final C2241p<Number> f6255w = new C2170e();

    /* renamed from: x */
    public static final C2243q f6256x = m8363a(Number.class, f6255w);

    /* renamed from: y */
    public static final C2241p<Character> f6257y = new C2171f();

    /* renamed from: z */
    public static final C2243q f6258z = m8364a(Character.TYPE, Character.class, f6257y);

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$a */
    static class C2162a extends C2241p<AtomicIntegerArray> {
        C2162a() {
        }

        /* renamed from: a */
        public AtomicIntegerArray m8381a(C2249a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo11161a();
            while (aVar.mo11166f()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo11170k()));
                } catch (NumberFormatException e) {
                    throw new C2237n((Throwable) e);
                }
            }
            aVar.mo11164d();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.mo11181a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo11182a((long) atomicIntegerArray.get(i));
            }
            cVar.mo11186c();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$a0 */
    static class C2163a0 extends C2241p<Number> {
        C2163a0() {
        }

        /* renamed from: a */
        public Number m8385a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo11170k());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$b */
    static class C2164b extends C2241p<Number> {
        C2164b() {
        }

        /* renamed from: a */
        public Number m8389a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo11171l());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$b0 */
    static class C2165b0 extends C2241p<AtomicInteger> {
        C2165b0() {
        }

        /* renamed from: a */
        public AtomicInteger m8393a(C2249a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo11170k());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.mo11182a((long) atomicInteger.get());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$c */
    static class C2166c extends C2241p<Number> {
        C2166c() {
        }

        /* renamed from: a */
        public Number m8397a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Float.valueOf((float) aVar.mo11168j());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$c0 */
    static class C2167c0 extends C2241p<AtomicBoolean> {
        C2167c0() {
        }

        /* renamed from: a */
        public AtomicBoolean m8401a(C2249a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo11167i());
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.mo11189d(atomicBoolean.get());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$d */
    static class C2168d extends C2241p<Number> {
        C2168d() {
        }

        /* renamed from: a */
        public Number m8405a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Double.valueOf(aVar.mo11168j());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$d0 */
    private static final class C2169d0<T extends Enum<T>> extends C2241p<T> {

        /* renamed from: a */
        private final Map<String, T> f6274a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f6275b = new HashMap();

        public C2169d0(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C2246c cVar = (C2246c) cls.getField(name).getAnnotation(C2246c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f6274a.put(put, enumR);
                        }
                    }
                    this.f6274a.put(name, enumR);
                    this.f6275b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m8409a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return (Enum) this.f6274a.get(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, T t) throws IOException {
            cVar.mo11192g(t == null ? null : (String) this.f6275b.get(t));
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$e */
    static class C2170e extends C2241p<Number> {
        C2170e() {
        }

        /* renamed from: a */
        public Number m8413a(C2249a aVar) throws IOException {
            C2251b peek = aVar.peek();
            int i = C2187v.f6276a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C2214e(aVar.mo11174o());
            }
            if (i == 4) {
                aVar.mo11173n();
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting number, got: ");
            sb.append(peek);
            throw new C2237n(sb.toString());
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$f */
    static class C2171f extends C2241p<Character> {
        C2171f() {
        }

        /* renamed from: a */
        public Character m8417a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            String o = aVar.mo11174o();
            if (o.length() == 1) {
                return Character.valueOf(o.charAt(0));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting character, got: ");
            sb.append(o);
            throw new C2237n(sb.toString());
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Character ch) throws IOException {
            cVar.mo11192g(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$g */
    static class C2172g extends C2241p<String> {
        C2172g() {
        }

        /* renamed from: a */
        public String m8421a(C2249a aVar) throws IOException {
            C2251b peek = aVar.peek();
            if (peek == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            } else if (peek == C2251b.BOOLEAN) {
                return Boolean.toString(aVar.mo11167i());
            } else {
                return aVar.mo11174o();
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, String str) throws IOException {
            cVar.mo11192g(str);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$h */
    static class C2173h extends C2241p<BigDecimal> {
        C2173h() {
        }

        /* renamed from: a */
        public BigDecimal m8425a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo11174o());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.mo11184a((Number) bigDecimal);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$i */
    static class C2174i extends C2241p<BigInteger> {
        C2174i() {
        }

        /* renamed from: a */
        public BigInteger m8429a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return new BigInteger(aVar.mo11174o());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, BigInteger bigInteger) throws IOException {
            cVar.mo11184a((Number) bigInteger);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$j */
    static class C2175j extends C2241p<StringBuilder> {
        C2175j() {
        }

        /* renamed from: a */
        public StringBuilder m8433a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return new StringBuilder(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, StringBuilder sb) throws IOException {
            cVar.mo11192g(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$k */
    static class C2176k extends C2241p<Class> {
        C2176k() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo11057a(C2252c cVar, Object obj) throws IOException {
            mo11146a(cVar, (Class) obj);
            throw null;
        }

        /* renamed from: a */
        public void mo11146a(C2252c cVar, Class cls) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: a */
        public Class mo11055a(C2249a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$l */
    static class C2177l extends C2241p<StringBuffer> {
        C2177l() {
        }

        /* renamed from: a */
        public StringBuffer m8441a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return new StringBuffer(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.mo11192g(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$m */
    static class C2178m extends C2241p<URL> {
        C2178m() {
        }

        /* renamed from: a */
        public URL m8445a(C2249a aVar) throws IOException {
            URL url = null;
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            String o = aVar.mo11174o();
            if (!"null".equals(o)) {
                url = new URL(o);
            }
            return url;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, URL url) throws IOException {
            cVar.mo11192g(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$n */
    static class C2179n extends C2241p<URI> {
        C2179n() {
        }

        /* renamed from: a */
        public URI m8449a(C2249a aVar) throws IOException {
            URI uri = null;
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                String o = aVar.mo11174o();
                if (!"null".equals(o)) {
                    uri = new URI(o);
                }
                return uri;
            } catch (URISyntaxException e) {
                throw new C2133i((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, URI uri) throws IOException {
            cVar.mo11192g(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$o */
    static class C2180o extends C2241p<InetAddress> {
        C2180o() {
        }

        /* renamed from: a */
        public InetAddress m8453a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return InetAddress.getByName(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, InetAddress inetAddress) throws IOException {
            cVar.mo11192g(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$p */
    static class C2181p extends C2241p<UUID> {
        C2181p() {
        }

        /* renamed from: a */
        public UUID m8457a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return UUID.fromString(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, UUID uuid) throws IOException {
            cVar.mo11192g(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$q */
    static class C2182q extends C2241p<Currency> {
        C2182q() {
        }

        /* renamed from: a */
        public Currency m8461a(C2249a aVar) throws IOException {
            return Currency.getInstance(aVar.mo11174o());
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Currency currency) throws IOException {
            cVar.mo11192g(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$r */
    static class C2183r extends C2241p<Calendar> {
        C2183r() {
        }

        /* renamed from: a */
        public Calendar m8465a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            aVar.mo11162b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.peek() != C2251b.END_OBJECT) {
                String m = aVar.mo11172m();
                int k = aVar.mo11170k();
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
            aVar.mo11165e();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.mo11193h();
                return;
            }
            cVar.mo11185b();
            cVar.mo11190e("year");
            cVar.mo11182a((long) calendar.get(1));
            cVar.mo11190e("month");
            cVar.mo11182a((long) calendar.get(2));
            cVar.mo11190e("dayOfMonth");
            cVar.mo11182a((long) calendar.get(5));
            cVar.mo11190e("hourOfDay");
            cVar.mo11182a((long) calendar.get(11));
            cVar.mo11190e("minute");
            cVar.mo11182a((long) calendar.get(12));
            cVar.mo11190e("second");
            cVar.mo11182a((long) calendar.get(13));
            cVar.mo11188d();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$s */
    static class C2184s extends C2241p<Locale> {
        C2184s() {
        }

        /* renamed from: a */
        public Locale m8469a(C2249a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo11174o(), "_");
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
        public void mo11057a(C2252c cVar, Locale locale) throws IOException {
            cVar.mo11192g(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$t */
    static class C2185t extends C2241p<JsonElement> {
        C2185t() {
        }

        /* renamed from: a */
        public JsonElement m8473a(C2249a aVar) throws IOException {
            switch (C2187v.f6276a[aVar.peek().ordinal()]) {
                case 1:
                    return new C2235l((Number) new C2214e(aVar.mo11174o()));
                case 2:
                    return new C2235l(Boolean.valueOf(aVar.mo11167i()));
                case 3:
                    return new C2235l(aVar.mo11174o());
                case 4:
                    aVar.mo11173n();
                    return C2233j.f6335a;
                case 5:
                    C2131g gVar = new C2131g();
                    aVar.mo11161a();
                    while (aVar.mo11166f()) {
                        gVar.mo11094a(m8473a(aVar));
                    }
                    aVar.mo11164d();
                    return gVar;
                case 6:
                    JsonObject jsonObject = new JsonObject();
                    aVar.mo11162b();
                    while (aVar.mo11166f()) {
                        jsonObject.mo11081a(aVar.mo11172m(), m8473a(aVar));
                    }
                    aVar.mo11165e();
                    return jsonObject;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, JsonElement jsonElement) throws IOException {
            if (jsonElement == null || jsonElement.mo11076g()) {
                cVar.mo11193h();
            } else if (jsonElement.mo11078i()) {
                C2235l d = jsonElement.mo11073d();
                if (d.mo11267q()) {
                    cVar.mo11184a(d.mo11265o());
                } else if (d.mo11266p()) {
                    cVar.mo11189d(d.mo11260j());
                } else {
                    cVar.mo11192g(d.mo11074e());
                }
            } else if (jsonElement.mo11075f()) {
                cVar.mo11181a();
                Iterator it = jsonElement.mo11071b().iterator();
                while (it.hasNext()) {
                    mo11057a(cVar, (JsonElement) it.next());
                }
                cVar.mo11186c();
            } else if (jsonElement.mo11077h()) {
                cVar.mo11185b();
                for (Entry entry : jsonElement.mo11072c().mo11086j()) {
                    cVar.mo11190e((String) entry.getKey());
                    mo11057a(cVar, (JsonElement) entry.getValue());
                }
                cVar.mo11188d();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't write ");
                sb.append(jsonElement.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$u */
    static class C2186u extends C2241p<BitSet> {
        C2186u() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo11170k() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet m8477a(com.bamtech.shadow.gson.p051s.C2249a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo11161a()
                com.bamtech.shadow.gson.s.b r1 = r8.peek()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.bamtech.shadow.gson.s.b r4 = com.bamtech.shadow.gson.p051s.C2251b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = com.bamtech.shadow.gson.internal.bind.TypeAdapters.C2187v.f6276a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo11174o()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.bamtech.shadow.gson.n r8 = new com.bamtech.shadow.gson.n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x0047:
                com.bamtech.shadow.gson.n r8 = new com.bamtech.shadow.gson.n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo11167i()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo11170k()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.bamtech.shadow.gson.s.b r1 = r8.peek()
                goto L_0x000e
            L_0x0075:
                r8.mo11164d()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.bind.TypeAdapters.C2186u.m8477a(com.bamtech.shadow.gson.s.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, BitSet bitSet) throws IOException {
            cVar.mo11181a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo11182a(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo11186c();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$v */
    static /* synthetic */ class C2187v {

        /* renamed from: a */
        static final /* synthetic */ int[] f6276a = new int[C2251b.values().length];

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
                com.bamtech.shadow.gson.s.b[] r0 = com.bamtech.shadow.gson.p051s.C2251b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6276a = r0
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f6276a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.bind.TypeAdapters.C2187v.<clinit>():void");
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$w */
    static class C2188w extends C2241p<Boolean> {
        C2188w() {
        }

        /* renamed from: a */
        public Boolean m8481a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            } else if (aVar.peek() == C2251b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo11174o()));
            } else {
                return Boolean.valueOf(aVar.mo11167i());
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Boolean bool) throws IOException {
            cVar.mo11183a(bool);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$x */
    static class C2189x extends C2241p<Boolean> {
        C2189x() {
        }

        /* renamed from: a */
        public Boolean m8485a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Boolean.valueOf(aVar.mo11174o());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Boolean bool) throws IOException {
            cVar.mo11192g(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$y */
    static class C2190y extends C2241p<Number> {
        C2190y() {
        }

        /* renamed from: a */
        public Number m8489a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo11170k());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$z */
    static class C2191z extends C2241p<Number> {
        C2191z() {
        }

        /* renamed from: a */
        public Number m8493a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo11170k());
            } catch (NumberFormatException e) {
                throw new C2237n((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            cVar.mo11184a(number);
        }
    }

    /* renamed from: a */
    public static <TT> C2243q m8362a(final TypeToken<TT> typeToken, final C2241p<TT> pVar) {
        return new C2243q() {
            /* renamed from: a */
            public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.equals(typeToken)) {
                    return pVar;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> C2243q m8366b(final Class<TT> cls, final Class<? extends TT> cls2, final C2241p<? super TT> pVar) {
        return new C2243q() {
            /* renamed from: a */
            public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return pVar;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(pVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: a */
    public static <TT> C2243q m8363a(final Class<TT> cls, final C2241p<TT> pVar) {
        return new C2243q() {
            /* renamed from: a */
            public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return pVar;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(pVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: b */
    public static <T1> C2243q m8365b(final Class<T1> cls, final C2241p<T1> pVar) {
        return new C2243q() {

            /* renamed from: com.bamtech.shadow.gson.internal.bind.TypeAdapters$35$a */
            class C2161a extends C2241p<T1> {

                /* renamed from: a */
                final /* synthetic */ Class f6272a;

                C2161a(Class cls) {
                    this.f6272a = cls;
                }

                /* renamed from: a */
                public void mo11057a(C2252c cVar, T1 t1) throws IOException {
                    pVar.mo11057a(cVar, t1);
                }

                /* renamed from: a */
                public T1 mo11055a(C2249a aVar) throws IOException {
                    T1 a = pVar.mo11055a(aVar);
                    if (a == null || this.f6272a.isInstance(a)) {
                        return a;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected a ");
                    sb.append(this.f6272a.getName());
                    sb.append(" but was ");
                    sb.append(a.getClass().getName());
                    throw new C2237n(sb.toString());
                }
            }

            /* renamed from: a */
            public <T2> C2241p<T2> mo11098a(Gson gson, TypeToken<T2> typeToken) {
                Class rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C2161a(rawType);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(pVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: a */
    public static <TT> C2243q m8364a(final Class<TT> cls, final Class<TT> cls2, final C2241p<? super TT> pVar) {
        return new C2243q() {
            /* renamed from: a */
            public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return pVar;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(pVar);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
