package p602m.p603a.p604a.p605a;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/* renamed from: m.a.a.a.m */
/* compiled from: Parser */
public abstract class C13445m implements C13433c {

    /* renamed from: a */
    protected C13432b f29951a;

    /* renamed from: b */
    private C13443k f29952b;

    /* renamed from: c */
    private List f29953c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34698a(C13443k kVar) {
        this.f29952b = kVar;
        this.f29953c = new ArrayList(kVar.mo34686a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13443k mo34699b() {
        return this.f29952b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo34649b(C13443k kVar, String[] strArr, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List mo34700c() {
        return this.f29953c;
    }

    /* renamed from: a */
    public C13432b mo34648a(C13443k kVar, String[] strArr, boolean z) throws C13444l {
        return mo34693a(kVar, strArr, null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[LOOP:2: B:27:0x0085->B:39:0x0085, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0037 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p602m.p603a.p604a.p605a.C13432b mo34693a(p602m.p603a.p604a.p605a.C13443k r6, java.lang.String[] r7, java.util.Properties r8, boolean r9) throws p602m.p603a.p604a.p605a.C13444l {
        /*
            r5 = this;
            java.util.List r0 = r6.mo34689b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            m.a.a.a.h r1 = (p602m.p603a.p604a.p605a.C13440h) r1
            r1.mo34661a()
            goto L_0x0008
        L_0x0018:
            r5.mo34698a(r6)
            m.a.a.a.b r6 = new m.a.a.a.b
            r6.<init>()
            r5.f29951a = r6
            r6 = 0
            if (r7 != 0) goto L_0x0027
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x0027:
            m.a.a.a.k r0 = r5.mo34699b()
            java.lang.String[] r7 = r5.mo34649b(r0, r7, r9)
            java.util.List r7 = java.util.Arrays.asList(r7)
            java.util.ListIterator r7 = r7.listIterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            r6 = 1
            goto L_0x0083
        L_0x004e:
            java.lang.String r2 = "-"
            boolean r4 = r2.equals(r0)
            if (r4 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x0059
            goto L_0x004c
        L_0x0059:
            m.a.a.a.b r2 = r5.f29951a
            r2.mo34645a(r0)
            goto L_0x0083
        L_0x005f:
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x007b
            if (r9 == 0) goto L_0x0077
            m.a.a.a.k r2 = r5.mo34699b()
            boolean r2 = r2.mo34691b(r0)
            if (r2 != 0) goto L_0x0077
            m.a.a.a.b r6 = r5.f29951a
            r6.mo34645a(r0)
            goto L_0x004c
        L_0x0077:
            r5.mo34695a(r0, r7)
            goto L_0x0083
        L_0x007b:
            m.a.a.a.b r2 = r5.f29951a
            r2.mo34645a(r0)
            if (r9 == 0) goto L_0x0083
            goto L_0x004c
        L_0x0083:
            if (r6 == 0) goto L_0x0037
        L_0x0085:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x0085
            m.a.a.a.b r2 = r5.f29951a
            r2.mo34645a(r0)
            goto L_0x0085
        L_0x009d:
            r5.mo34696a(r8)
            r5.mo34694a()
            m.a.a.a.b r6 = r5.f29951a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p603a.p604a.p605a.C13445m.mo34693a(m.a.a.a.k, java.lang.String[], java.util.Properties, boolean):m.a.a.a.b");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34696a(Properties properties) {
        if (properties != null) {
            Enumeration propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String obj = propertyNames.nextElement().toString();
                if (!this.f29951a.mo34647b(obj)) {
                    C13440h a = mo34699b().mo34687a(obj);
                    String property = properties.getProperty(obj);
                    if (!a.mo34673i()) {
                        if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                            break;
                        }
                    } else if (a.mo34671h() == null || a.mo34671h().length == 0) {
                        try {
                            a.mo34662a(property);
                        } catch (RuntimeException unused) {
                        }
                    }
                    this.f29951a.mo34646a(a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34694a() throws C13439g {
        if (!mo34700c().isEmpty()) {
            throw new C13439g(mo34700c());
        }
    }

    /* renamed from: a */
    public void mo34697a(C13440h hVar, ListIterator listIterator) throws C13444l {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (mo34699b().mo34691b(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            } else {
                try {
                    hVar.mo34662a(C13447o.m41362a(str));
                } catch (RuntimeException unused) {
                    listIterator.previous();
                }
            }
        }
        if (hVar.mo34671h() == null && !hVar.mo34677m()) {
            throw new C13438f(hVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34695a(String str, ListIterator listIterator) throws C13444l {
        if (mo34699b().mo34691b(str)) {
            C13440h hVar = (C13440h) mo34699b().mo34687a(str).clone();
            if (hVar.mo34679o()) {
                mo34700c().remove(hVar.mo34666d());
            }
            if (mo34699b().mo34690b(hVar) != null) {
                C13441i b = mo34699b().mo34690b(hVar);
                if (b.mo34684c()) {
                    mo34700c().remove(b);
                }
                b.mo34682a(hVar);
            }
            if (hVar.mo34673i()) {
                mo34697a(hVar, listIterator);
            }
            this.f29951a.mo34646a(hVar);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unrecognized option: ");
        stringBuffer.append(str);
        throw new C13446n(stringBuffer.toString(), str);
    }
}
