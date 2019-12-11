package p602m.p603a.p604a.p605a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m.a.a.a.h */
/* compiled from: Option */
public class C13440h implements Cloneable, Serializable {

    /* renamed from: U */
    private String f29934U;

    /* renamed from: V */
    private String f29935V = "arg";

    /* renamed from: W */
    private String f29936W;

    /* renamed from: X */
    private boolean f29937X;

    /* renamed from: Y */
    private boolean f29938Y;

    /* renamed from: Z */
    private int f29939Z = -1;

    /* renamed from: a0 */
    private Object f29940a0;

    /* renamed from: b0 */
    private List f29941b0 = new ArrayList();

    /* renamed from: c */
    private String f29942c;

    /* renamed from: c0 */
    private char f29943c0;

    public C13440h(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        C13442j.m41343a(str);
        this.f29942c = str;
        this.f29934U = str2;
        if (z) {
            this.f29939Z = 1;
        }
        this.f29936W = str3;
    }

    /* renamed from: p */
    private boolean m41322p() {
        return this.f29941b0.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34662a(String str) {
        if (this.f29939Z != -1) {
            m41321c(str);
            return;
        }
        throw new RuntimeException("NO_ARGS_ALLOWED");
    }

    /* renamed from: b */
    public String mo34663b() {
        return this.f29935V;
    }

    /* renamed from: c */
    public String mo34664c() {
        return this.f29936W;
    }

    public Object clone() {
        try {
            C13440h hVar = (C13440h) super.clone();
            hVar.f29941b0 = new ArrayList(this.f29941b0);
            return hVar;
        } catch (CloneNotSupportedException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("A CloneNotSupportedException was thrown: ");
            stringBuffer.append(e.getMessage());
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo34666d() {
        String str = this.f29942c;
        return str == null ? this.f29934U : str;
    }

    /* renamed from: e */
    public String mo34667e() {
        return this.f29934U;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13440h.class != obj.getClass()) {
            return false;
        }
        C13440h hVar = (C13440h) obj;
        String str = this.f29942c;
        if (str == null ? hVar.f29942c != null : !str.equals(hVar.f29942c)) {
            return false;
        }
        String str2 = this.f29934U;
        String str3 = hVar.f29934U;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    /* renamed from: f */
    public String mo34669f() {
        return this.f29942c;
    }

    /* renamed from: g */
    public char mo34670g() {
        return this.f29943c0;
    }

    /* renamed from: h */
    public String[] mo34671h() {
        if (m41322p()) {
            return null;
        }
        List list = this.f29941b0;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public int hashCode() {
        String str = this.f29942c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29934U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public boolean mo34673i() {
        int i = this.f29939Z;
        return i > 0 || i == -2;
    }

    /* renamed from: j */
    public boolean mo34674j() {
        String str = this.f29935V;
        return str != null && str.length() > 0;
    }

    /* renamed from: k */
    public boolean mo34675k() {
        int i = this.f29939Z;
        return i > 1 || i == -2;
    }

    /* renamed from: l */
    public boolean mo34676l() {
        return this.f29934U != null;
    }

    /* renamed from: m */
    public boolean mo34677m() {
        return this.f29938Y;
    }

    /* renamed from: n */
    public boolean mo34678n() {
        return this.f29943c0 > 0;
    }

    /* renamed from: o */
    public boolean mo34679o() {
        return this.f29937X;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ option: ");
        stringBuffer.append(this.f29942c);
        String str = " ";
        if (this.f29934U != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.f29934U);
        }
        stringBuffer.append(str);
        if (mo34675k()) {
            stringBuffer.append("[ARG...]");
        } else if (mo34673i()) {
            stringBuffer.append(" [ARG]");
        }
        String str2 = " :: ";
        stringBuffer.append(str2);
        stringBuffer.append(this.f29936W);
        if (this.f29940a0 != null) {
            stringBuffer.append(str2);
            stringBuffer.append(this.f29940a0);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private void m41320b(String str) {
        if (this.f29939Z <= 0 || this.f29941b0.size() <= this.f29939Z - 1) {
            this.f29941b0.add(str);
            return;
        }
        throw new RuntimeException("Cannot add value, list full.");
    }

    /* renamed from: c */
    private void m41321c(String str) {
        if (mo34678n()) {
            char g = mo34670g();
            int indexOf = str.indexOf(g);
            while (indexOf != -1 && this.f29941b0.size() != this.f29939Z - 1) {
                m41320b(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
                indexOf = str.indexOf(g);
            }
        }
        m41320b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34661a() {
        this.f29941b0.clear();
    }
}
