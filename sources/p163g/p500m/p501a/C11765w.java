package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11737m.C11740c;
import p163g.p500m.p501a.p502z.C11781a;

/* renamed from: g.m.a.w */
/* compiled from: StandardJsonAdapters */
final class C11765w {

    /* renamed from: a */
    public static final C11732g f27397a = new C11768c();

    /* renamed from: b */
    static final C11725h<Boolean> f27398b = new C11769d();

    /* renamed from: c */
    static final C11725h<Byte> f27399c = new C11770e();

    /* renamed from: d */
    static final C11725h<Character> f27400d = new C11771f();

    /* renamed from: e */
    static final C11725h<Double> f27401e = new C11772g();

    /* renamed from: f */
    static final C11725h<Float> f27402f = new C11773h();

    /* renamed from: g */
    static final C11725h<Integer> f27403g = new C11774i();

    /* renamed from: h */
    static final C11725h<Long> f27404h = new C11775j();

    /* renamed from: i */
    static final C11725h<Short> f27405i = new C11776k();

    /* renamed from: j */
    static final C11725h<String> f27406j = new C11766a();

    /* renamed from: g.m.a.w$a */
    /* compiled from: StandardJsonAdapters */
    class C11766a extends C11725h<String> {
        C11766a() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, String str) throws IOException {
            sVar.mo29799g(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }

        public String fromJson(C11737m mVar) throws IOException {
            return mVar.mo29779n();
        }
    }

    /* renamed from: g.m.a.w$b */
    /* compiled from: StandardJsonAdapters */
    static /* synthetic */ class C11767b {

        /* renamed from: a */
        static final /* synthetic */ int[] f27407a = new int[C11740c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                g.m.a.m$c[] r0 = p163g.p500m.p501a.C11737m.C11740c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27407a = r0
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27407a     // Catch:{ NoSuchFieldError -> 0x004b }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11765w.C11767b.<clinit>():void");
        }
    }

    /* renamed from: g.m.a.w$c */
    /* compiled from: StandardJsonAdapters */
    class C11768c implements C11732g {
        C11768c() {
        }

        /* renamed from: a */
        public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C11765w.f27398b;
            }
            if (type == Byte.TYPE) {
                return C11765w.f27399c;
            }
            if (type == Character.TYPE) {
                return C11765w.f27400d;
            }
            if (type == Double.TYPE) {
                return C11765w.f27401e;
            }
            if (type == Float.TYPE) {
                return C11765w.f27402f;
            }
            if (type == Integer.TYPE) {
                return C11765w.f27403g;
            }
            if (type == Long.TYPE) {
                return C11765w.f27404h;
            }
            if (type == Short.TYPE) {
                return C11765w.f27405i;
            }
            if (type == Boolean.class) {
                return C11765w.f27398b.nullSafe();
            }
            if (type == Byte.class) {
                return C11765w.f27399c.nullSafe();
            }
            if (type == Character.class) {
                return C11765w.f27400d.nullSafe();
            }
            if (type == Double.class) {
                return C11765w.f27401e.nullSafe();
            }
            if (type == Float.class) {
                return C11765w.f27402f.nullSafe();
            }
            if (type == Integer.class) {
                return C11765w.f27403g.nullSafe();
            }
            if (type == Long.class) {
                return C11765w.f27404h.nullSafe();
            }
            if (type == Short.class) {
                return C11765w.f27405i.nullSafe();
            }
            if (type == String.class) {
                return C11765w.f27406j.nullSafe();
            }
            if (type == Object.class) {
                return new C11778m(vVar).nullSafe();
            }
            Class d = C11780y.m37902d(type);
            C11725h<?> a = C11781a.m37908a(vVar, type, d);
            if (a != null) {
                return a;
            }
            if (d.isEnum()) {
                return new C11777l(d).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: g.m.a.w$d */
    /* compiled from: StandardJsonAdapters */
    class C11769d extends C11725h<Boolean> {
        C11769d() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Boolean bool) throws IOException {
            sVar.mo29792c(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        public Boolean fromJson(C11737m mVar) throws IOException {
            return Boolean.valueOf(mVar.mo29772h());
        }
    }

    /* renamed from: g.m.a.w$e */
    /* compiled from: StandardJsonAdapters */
    class C11770e extends C11725h<Byte> {
        C11770e() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Byte b) throws IOException {
            sVar.mo29789a((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        public Byte fromJson(C11737m mVar) throws IOException {
            return Byte.valueOf((byte) C11765w.m37881a(mVar, "a byte", -128, 255));
        }
    }

    /* renamed from: g.m.a.w$f */
    /* compiled from: StandardJsonAdapters */
    class C11771f extends C11725h<Character> {
        C11771f() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Character ch) throws IOException {
            sVar.mo29799g(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }

        public Character fromJson(C11737m mVar) throws IOException {
            String n = mVar.mo29779n();
            if (n.length() <= 1) {
                return Character.valueOf(n.charAt(0));
            }
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(n);
            sb.append('\"');
            throw new C11734j(String.format("Expected %s but was %s at path %s", new Object[]{"a char", sb.toString(), mVar.mo29775j0()}));
        }
    }

    /* renamed from: g.m.a.w$g */
    /* compiled from: StandardJsonAdapters */
    class C11772g extends C11725h<Double> {
        C11772g() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Double d) throws IOException {
            sVar.mo29788a(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }

        public Double fromJson(C11737m mVar) throws IOException {
            return Double.valueOf(mVar.mo29773i());
        }
    }

    /* renamed from: g.m.a.w$h */
    /* compiled from: StandardJsonAdapters */
    class C11773h extends C11725h<Float> {
        C11773h() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Float f) throws IOException {
            if (f != null) {
                sVar.mo29790a((Number) f);
                return;
            }
            throw new NullPointerException();
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }

        public Float fromJson(C11737m mVar) throws IOException {
            float i = (float) mVar.mo29773i();
            if (mVar.mo29771g() || !Float.isInfinite(i)) {
                return Float.valueOf(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(i);
            sb.append(" at path ");
            sb.append(mVar.mo29775j0());
            throw new C11734j(sb.toString());
        }
    }

    /* renamed from: g.m.a.w$i */
    /* compiled from: StandardJsonAdapters */
    class C11774i extends C11725h<Integer> {
        C11774i() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Integer num) throws IOException {
            sVar.mo29789a((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }

        public Integer fromJson(C11737m mVar) throws IOException {
            return Integer.valueOf(mVar.mo29774j());
        }
    }

    /* renamed from: g.m.a.w$j */
    /* compiled from: StandardJsonAdapters */
    class C11775j extends C11725h<Long> {
        C11775j() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Long l) throws IOException {
            sVar.mo29789a(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }

        public Long fromJson(C11737m mVar) throws IOException {
            return Long.valueOf(mVar.mo29776k());
        }
    }

    /* renamed from: g.m.a.w$k */
    /* compiled from: StandardJsonAdapters */
    class C11776k extends C11725h<Short> {
        C11776k() {
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, Short sh) throws IOException {
            sVar.mo29789a((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }

        public Short fromJson(C11737m mVar) throws IOException {
            return Short.valueOf((short) C11765w.m37881a(mVar, "a short", -32768, 32767));
        }
    }

    /* renamed from: g.m.a.w$l */
    /* compiled from: StandardJsonAdapters */
    static final class C11777l<T extends Enum<T>> extends C11725h<T> {

        /* renamed from: a */
        private final Class<T> f27408a;

        /* renamed from: b */
        private final String[] f27409b;

        /* renamed from: c */
        private final T[] f27410c;

        /* renamed from: d */
        private final C11739b f27411d;

        C11777l(Class<T> cls) {
            this.f27408a = cls;
            try {
                this.f27410c = (Enum[]) cls.getEnumConstants();
                this.f27409b = new String[this.f27410c.length];
                for (int i = 0; i < this.f27410c.length; i++) {
                    T t = this.f27410c[i];
                    C11724g gVar = (C11724g) cls.getField(t.name()).getAnnotation(C11724g.class);
                    this.f27409b[i] = gVar != null ? gVar.name() : t.name();
                }
                this.f27411d = C11739b.m37729a(this.f27409b);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing field in ");
                sb.append(cls.getName());
                throw new AssertionError(sb.toString(), e);
            }
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, T t) throws IOException {
            sVar.mo29799g(this.f27409b[t.ordinal()]);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JsonAdapter(");
            sb.append(this.f27408a.getName());
            sb.append(")");
            return sb.toString();
        }

        public T fromJson(C11737m mVar) throws IOException {
            int b = mVar.mo29762b(this.f27411d);
            if (b != -1) {
                return this.f27410c[b];
            }
            String j0 = mVar.mo29775j0();
            String n = mVar.mo29779n();
            StringBuilder sb = new StringBuilder();
            sb.append("Expected one of ");
            sb.append(Arrays.asList(this.f27409b));
            sb.append(" but was ");
            sb.append(n);
            sb.append(" at path ");
            sb.append(j0);
            throw new C11734j(sb.toString());
        }
    }

    /* renamed from: g.m.a.w$m */
    /* compiled from: StandardJsonAdapters */
    static final class C11778m extends C11725h<Object> {

        /* renamed from: a */
        private final C11760v f27412a;

        /* renamed from: b */
        private final C11725h<List> f27413b;

        /* renamed from: c */
        private final C11725h<Map> f27414c;

        /* renamed from: d */
        private final C11725h<String> f27415d;

        /* renamed from: e */
        private final C11725h<Double> f27416e;

        /* renamed from: f */
        private final C11725h<Boolean> f27417f;

        C11778m(C11760v vVar) {
            this.f27412a = vVar;
            this.f27413b = vVar.mo29866a(List.class);
            this.f27414c = vVar.mo29866a(Map.class);
            this.f27415d = vVar.mo29866a(String.class);
            this.f27416e = vVar.mo29866a(Double.class);
            this.f27417f = vVar.mo29866a(Boolean.class);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class<?>, java.lang.Class] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Class<?> m37893a(java.lang.Class r2) {
            /*
                r1 = this;
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x000b
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                return r2
            L_0x000b:
                java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x0015
                java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            L_0x0015:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11765w.C11778m.m37893a(java.lang.Class):java.lang.Class");
        }

        public Object fromJson(C11737m mVar) throws IOException {
            switch (C11767b.f27407a[mVar.peek().ordinal()]) {
                case 1:
                    return this.f27413b.fromJson(mVar);
                case 2:
                    return this.f27414c.fromJson(mVar);
                case 3:
                    return this.f27415d.fromJson(mVar);
                case 4:
                    return this.f27416e.fromJson(mVar);
                case 5:
                    return this.f27417f.fromJson(mVar);
                case 6:
                    return mVar.mo29778m();
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected a value but was ");
                    sb.append(mVar.peek());
                    sb.append(" at path ");
                    sb.append(mVar.mo29775j0());
                    throw new IllegalStateException(sb.toString());
            }
        }

        public void toJson(C11747s sVar, Object obj) throws IOException {
            Class<Object> cls = obj.getClass();
            if (cls == Object.class) {
                sVar.mo29791b();
                sVar.mo29795e();
                return;
            }
            this.f27412a.mo29868a(m37893a(cls), C11781a.f27418a).toJson(sVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m37881a(C11737m mVar, String str, int i, int i2) throws IOException {
        int j = mVar.mo29774j();
        if (j >= i && j <= i2) {
            return j;
        }
        throw new C11734j(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(j), mVar.mo29775j0()}));
    }
}
