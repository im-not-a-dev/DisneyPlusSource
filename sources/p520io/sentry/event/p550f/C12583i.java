package p520io.sentry.event.p550f;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import p551j.p552a.p564n.C12656a;

/* renamed from: io.sentry.event.f.i */
/* compiled from: SentryStackTraceElement */
public class C12583i implements Serializable {

    /* renamed from: U */
    private final String f29169U;

    /* renamed from: V */
    private final String f29170V;

    /* renamed from: W */
    private final int f29171W;

    /* renamed from: X */
    private final Integer f29172X;

    /* renamed from: Y */
    private final String f29173Y;

    /* renamed from: Z */
    private final String f29174Z;

    /* renamed from: a0 */
    private final Map<String, Object> f29175a0;

    /* renamed from: c */
    private final String f29176c;

    public C12583i(String str, String str2, String str3, int i, Integer num, String str4, String str5, Map<String, Object> map) {
        this.f29176c = str;
        this.f29169U = str2;
        this.f29170V = str3;
        this.f29171W = i;
        this.f29172X = num;
        this.f29173Y = str4;
        this.f29174Z = str5;
        this.f29175a0 = map;
    }

    /* renamed from: a */
    public String mo30817a() {
        return this.f29173Y;
    }

    /* renamed from: b */
    public Integer mo30818b() {
        return this.f29172X;
    }

    /* renamed from: c */
    public String mo30819c() {
        return this.f29170V;
    }

    /* renamed from: d */
    public String mo30820d() {
        return this.f29169U;
    }

    /* renamed from: e */
    public int mo30821e() {
        return this.f29171W;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12583i.class != obj.getClass()) {
            return false;
        }
        C12583i iVar = (C12583i) obj;
        if (this.f29171W != iVar.f29171W || !Objects.equals(this.f29176c, iVar.f29176c) || !Objects.equals(this.f29169U, iVar.f29169U) || !Objects.equals(this.f29170V, iVar.f29170V) || !Objects.equals(this.f29172X, iVar.f29172X) || !Objects.equals(this.f29173Y, iVar.f29173Y) || !Objects.equals(this.f29174Z, iVar.f29174Z) || !Objects.equals(this.f29175a0, iVar.f29175a0)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public Map<String, Object> mo30823f() {
        return this.f29175a0;
    }

    /* renamed from: g */
    public String mo30824g() {
        return this.f29176c;
    }

    /* renamed from: h */
    public String mo30825h() {
        return this.f29174Z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f29176c, this.f29169U, this.f29170V, Integer.valueOf(this.f29171W), this.f29172X, this.f29173Y, this.f29174Z, this.f29175a0});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SentryStackTraceElement{module='");
        sb.append(this.f29176c);
        sb.append('\'');
        sb.append(", function='");
        sb.append(this.f29169U);
        sb.append('\'');
        sb.append(", fileName='");
        sb.append(this.f29170V);
        sb.append('\'');
        sb.append(", lineno=");
        sb.append(this.f29171W);
        sb.append(", colno=");
        sb.append(this.f29172X);
        sb.append(", absPath='");
        sb.append(this.f29173Y);
        sb.append('\'');
        sb.append(", platform='");
        sb.append(this.f29174Z);
        sb.append('\'');
        sb.append(", locals='");
        sb.append(this.f29175a0);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C12583i[] m39467a(StackTraceElement[] stackTraceElementArr, C12656a[] aVarArr) {
        C12583i[] iVarArr = new C12583i[stackTraceElementArr.length];
        int i = 0;
        int i2 = 0;
        while (i < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            Map map = null;
            if (aVarArr != null) {
                while (i2 < aVarArr.length && !stackTraceElement.getMethodName().equals(aVarArr[i2].mo30975b().getName())) {
                    i2++;
                }
                if (i2 < aVarArr.length) {
                    map = aVarArr[i2].mo30974a();
                }
            }
            iVarArr[i] = m39466a(stackTraceElement, map);
            i++;
            i2++;
        }
        return iVarArr;
    }

    /* renamed from: a */
    private static C12583i m39466a(StackTraceElement stackTraceElement, Map<String, Object> map) {
        C12583i iVar = new C12583i(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), null, null, null, map);
        return iVar;
    }
}
