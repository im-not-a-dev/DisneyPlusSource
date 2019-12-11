package p163g.p426g.p436g;

import java.util.List;
import p163g.p426g.p427a.C10817h;
import p163g.p426g.p427a.C10817h.C10818a;
import p163g.p426g.p427a.p429j.C10831e;
import p163g.p426g.p427a.p429j.C10834h;

/* renamed from: g.g.g.i */
/* compiled from: Logger */
public class C10880i implements C10878g {

    /* renamed from: a */
    C10831e f25777a;

    /* renamed from: b */
    C10834h f25778b;

    /* renamed from: c */
    C10817h f25779c;

    /* renamed from: d */
    List<String> f25780d;

    /* renamed from: e */
    String f25781e;

    /* renamed from: f */
    String f25782f;

    /* renamed from: g */
    int f25783g;

    /* renamed from: g.g.g.i$a */
    /* compiled from: Logger */
    static /* synthetic */ class C10881a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25784a = new int[C10818a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                g.g.a.h$a[] r0 = p163g.p426g.p427a.C10817h.C10818a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25784a = r0
                int[] r0 = f25784a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.g.a.h$a r1 = p163g.p426g.p427a.C10817h.C10818a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25784a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.g.a.h$a r1 = p163g.p426g.p427a.C10817h.C10818a.INFO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25784a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.g.a.h$a r1 = p163g.p426g.p427a.C10817h.C10818a.WARNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25784a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.g.a.h$a r1 = p163g.p426g.p427a.C10817h.C10818a.ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f25784a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.g.a.h$a r1 = p163g.p426g.p427a.C10817h.C10818a.NONE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p436g.C10880i.C10881a.<clinit>():void");
        }
    }

    public C10880i(C10831e eVar, C10834h hVar, C10817h hVar2, List<String> list, String str) {
        this.f25777a = eVar;
        this.f25778b = hVar;
        this.f25779c = hVar2;
        this.f25780d = list;
        this.f25781e = str;
    }

    /* renamed from: g */
    private String m34322g(String str) {
        String str2 = this.f25781e;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[Conviva] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: h */
    private String m34323h(String str) {
        String str2 = this.f25782f;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f25782f);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    private String m34324i(String str) {
        if (this.f25783g <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sid=");
        sb.append(this.f25783g);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: j */
    private String m34325j(String str) {
        String format = String.format("%.2f", new Object[]{Double.valueOf(this.f25778b.mo27910a() / 1000.0d)});
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(format);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo27988a(String str) {
        mo27991a(str, C10818a.ERROR);
    }

    /* renamed from: b */
    public void mo27989b(String str) {
        this.f25782f = str;
    }

    /* renamed from: c */
    public void mo27992c(String str) {
        mo27991a(str, C10818a.DEBUG);
    }

    /* renamed from: d */
    public void mo27993d(String str) {
        mo27991a(str, C10818a.INFO);
    }

    /* renamed from: e */
    public String mo27994e(String str) {
        String str2 = this.f25781e;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f25781e);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    public void mo27995f(String str) {
        mo27991a(str, C10818a.WARNING);
    }

    /* renamed from: b */
    private String m34320b(String str, C10818a aVar) {
        return m34322g(m34325j(m34321c(mo27994e(m34323h(m34324i(str))), aVar)));
    }

    /* renamed from: c */
    private String m34321c(String str, C10818a aVar) {
        String a = m34319a(aVar);
        String str2 = this.f25781e;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(a);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0 != p163g.p426g.p427a.C10817h.C10818a.ERROR) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r0 != p163g.p426g.p427a.C10817h.C10818a.WARNING) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r0 != p163g.p426g.p427a.C10817h.C10818a.INFO) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r3.f25779c.f25584a == p163g.p426g.p427a.C10817h.C10818a.DEBUG) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27991a(java.lang.String r4, p163g.p426g.p427a.C10817h.C10818a r5) {
        /*
            r3 = this;
            int[] r0 = p163g.p426g.p436g.C10880i.C10881a.f25784a
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0048
            r2 = 2
            if (r0 == r2) goto L_0x003b
            r2 = 3
            if (r0 == r2) goto L_0x002a
            r2 = 4
            if (r0 == r2) goto L_0x0015
            goto L_0x0051
        L_0x0015:
            g.g.a.h r0 = r3.f25779c
            g.g.a.h$a r0 = r0.f25584a
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.DEBUG
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.INFO
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.WARNING
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.ERROR
            if (r0 != r2) goto L_0x0051
            goto L_0x0052
        L_0x002a:
            g.g.a.h r0 = r3.f25779c
            g.g.a.h$a r0 = r0.f25584a
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.DEBUG
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.INFO
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.WARNING
            if (r0 != r2) goto L_0x0051
            goto L_0x0052
        L_0x003b:
            g.g.a.h r0 = r3.f25779c
            g.g.a.h$a r0 = r0.f25584a
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.DEBUG
            if (r0 == r2) goto L_0x0052
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.INFO
            if (r0 != r2) goto L_0x0051
            goto L_0x0052
        L_0x0048:
            g.g.a.h r0 = r3.f25779c
            g.g.a.h$a r0 = r0.f25584a
            g.g.a.h$a r2 = p163g.p426g.p427a.C10817h.C10818a.DEBUG
            if (r0 != r2) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0062
            java.lang.String r4 = r3.m34320b(r4, r5)
            java.util.List<java.lang.String> r0 = r3.f25780d
            r0.add(r4)
            g.g.a.j.e r0 = r3.f25777a
            r0.mo27898a(r4, r5)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p436g.C10880i.mo27991a(java.lang.String, g.g.a.h$a):void");
    }

    /* renamed from: a */
    public void mo27990a(int i) {
        this.f25783g = i;
    }

    /* renamed from: a */
    private static String m34319a(C10818a aVar) {
        int i = C10881a.f25784a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "INFO";
            }
            if (i == 3) {
                return "WARNING";
            }
            if (i == 4) {
                return "ERROR";
            }
            if (i != 5) {
                return "";
            }
        }
        return "NONE";
    }
}
