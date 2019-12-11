package p163g.p500m.p501a;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C14288n;

/* renamed from: g.m.a.m */
/* compiled from: JsonReader */
public abstract class C11737m implements Closeable {

    /* renamed from: U */
    int[] f27299U = new int[32];

    /* renamed from: V */
    String[] f27300V = new String[32];

    /* renamed from: W */
    int[] f27301W = new int[32];

    /* renamed from: X */
    boolean f27302X;

    /* renamed from: Y */
    boolean f27303Y;

    /* renamed from: c */
    int f27304c;

    /* renamed from: g.m.a.m$a */
    /* compiled from: JsonReader */
    static /* synthetic */ class C11738a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27305a = new int[C11740c.values().length];

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
                f27305a = r0
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27305a     // Catch:{ NoSuchFieldError -> 0x004b }
                g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11737m.C11738a.<clinit>():void");
        }
    }

    /* renamed from: g.m.a.m$b */
    /* compiled from: JsonReader */
    public static final class C11739b {

        /* renamed from: a */
        final String[] f27306a;

        /* renamed from: b */
        final C14288n f27307b;

        private C11739b(String[] strArr, C14288n nVar) {
            this.f27306a = strArr;
            this.f27307b = nVar;
        }

        /* renamed from: a */
        public static C11739b m37729a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    C11743p.m37764a(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.mo36323d();
                }
                return new C11739b((String[]) strArr.clone(), C14288n.m45729a(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: g.m.a.m$c */
    /* compiled from: JsonReader */
    public enum C11740c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    C11737m() {
    }

    /* renamed from: a */
    public static C11737m m37702a(BufferedSource bufferedSource) {
        return new C11742o(bufferedSource);
    }

    /* renamed from: a */
    public abstract int mo29758a(C11739b bVar) throws IOException;

    /* renamed from: a */
    public abstract void mo29760a() throws IOException;

    /* renamed from: b */
    public abstract int mo29762b(C11739b bVar) throws IOException;

    /* renamed from: b */
    public abstract void mo29763b() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29764b(int i) {
        int i2 = this.f27304c;
        int[] iArr = this.f27299U;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f27299U = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f27300V;
                this.f27300V = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f27301W;
                this.f27301W = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(mo29775j0());
                throw new C11734j(sb.toString());
            }
        }
        int[] iArr3 = this.f27299U;
        int i3 = this.f27304c;
        this.f27304c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: c */
    public abstract void mo29766c() throws IOException;

    /* renamed from: d */
    public abstract void mo29767d() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C11735k mo29768e(String str) throws C11735k {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11735k(sb.toString());
    }

    /* renamed from: f */
    public abstract boolean mo29770f() throws IOException;

    /* renamed from: g */
    public final boolean mo29771g() {
        return this.f27302X;
    }

    /* renamed from: h */
    public abstract boolean mo29772h() throws IOException;

    /* renamed from: i */
    public abstract double mo29773i() throws IOException;

    /* renamed from: j */
    public abstract int mo29774j() throws IOException;

    /* renamed from: j0 */
    public final String mo29775j0() {
        return C11741n.m37730a(this.f27304c, this.f27299U, this.f27300V, this.f27301W);
    }

    /* renamed from: k */
    public abstract long mo29776k() throws IOException;

    /* renamed from: l */
    public abstract String mo29777l() throws IOException;

    /* renamed from: m */
    public abstract <T> T mo29778m() throws IOException;

    /* renamed from: n */
    public abstract String mo29779n() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public abstract void mo29780o() throws IOException;

    /* renamed from: p */
    public final Object mo29781p() throws IOException {
        switch (C11738a.f27305a[peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo29760a();
                while (mo29770f()) {
                    arrayList.add(mo29781p());
                }
                mo29766c();
                return arrayList;
            case 2:
                C11748t tVar = new C11748t();
                mo29763b();
                while (mo29770f()) {
                    String l = mo29777l();
                    Object p = mo29781p();
                    Object put = tVar.put(l, p);
                    if (put != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Map key '");
                        sb.append(l);
                        sb.append("' has multiple values at path ");
                        sb.append(mo29775j0());
                        sb.append(": ");
                        sb.append(put);
                        sb.append(" and ");
                        sb.append(p);
                        throw new C11734j(sb.toString());
                    }
                }
                mo29767d();
                return tVar;
            case 3:
                return mo29779n();
            case 4:
                return Double.valueOf(mo29773i());
            case 5:
                return Boolean.valueOf(mo29772h());
            case 6:
                return mo29778m();
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a value but was ");
                sb2.append(peek());
                sb2.append(" at path ");
                sb2.append(mo29775j0());
                throw new IllegalStateException(sb2.toString());
        }
    }

    public abstract C11740c peek() throws IOException;

    /* renamed from: q */
    public abstract void mo29783q() throws IOException;

    /* renamed from: r */
    public abstract void mo29784r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11734j mo29759a(Object obj, Object obj2) {
        String str = "Expected ";
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj2);
            sb.append(" but was null at path ");
            sb.append(mo29775j0());
            return new C11734j(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(obj2);
        sb2.append(" but was ");
        sb2.append(obj);
        sb2.append(", a ");
        sb2.append(obj.getClass().getName());
        sb2.append(", at path ");
        sb2.append(mo29775j0());
        return new C11734j(sb2.toString());
    }

    /* renamed from: e */
    public final boolean mo29769e() {
        return this.f27303Y;
    }

    /* renamed from: a */
    public final void mo29761a(boolean z) {
        this.f27303Y = z;
    }

    /* renamed from: b */
    public final void mo29765b(boolean z) {
        this.f27302X = z;
    }
}
