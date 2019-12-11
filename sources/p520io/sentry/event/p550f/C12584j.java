package p520io.sentry.event.p550f;

import java.util.Arrays;
import p551j.p552a.p564n.C12656a;

/* renamed from: io.sentry.event.f.j */
/* compiled from: StackTraceInterface */
public class C12584j implements C12582h {

    /* renamed from: U */
    private final int f29177U;

    /* renamed from: c */
    private final C12583i[] f29178c;

    public C12584j(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, C12656a[] aVarArr) {
        this.f29178c = C12583i.m39467a(stackTraceElementArr, aVarArr);
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTraceElementArr2.length - 1;
        while (length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2])) {
            length--;
            length2--;
        }
        this.f29177U = (stackTraceElementArr.length - 1) - length;
    }

    /* renamed from: Z */
    public String mo30763Z() {
        return "sentry.interfaces.Stacktrace";
    }

    /* renamed from: a */
    public int mo30828a() {
        return this.f29177U;
    }

    /* renamed from: b */
    public C12583i[] mo30829b() {
        C12583i[] iVarArr = this.f29178c;
        return (C12583i[]) Arrays.copyOf(iVarArr, iVarArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12584j.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f29178c, ((C12584j) obj).f29178c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29178c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StackTraceInterface{stackTrace=");
        sb.append(Arrays.toString(this.f29178c));
        sb.append('}');
        return sb.toString();
    }
}
