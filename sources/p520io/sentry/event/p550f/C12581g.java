package p520io.sentry.event.p550f;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import p551j.p552a.p564n.C12658b;

/* renamed from: io.sentry.event.f.g */
/* compiled from: SentryException */
public final class C12581g implements Serializable {

    /* renamed from: U */
    private final String f29164U;

    /* renamed from: V */
    private final String f29165V;

    /* renamed from: W */
    private final C12584j f29166W;

    /* renamed from: X */
    private final C12577c f29167X;

    /* renamed from: c */
    private final String f29168c;

    public C12581g(Throwable th, StackTraceElement[] stackTraceElementArr, C12577c cVar) {
        Package packageR = th.getClass().getPackage();
        String name = th.getClass().getName();
        this.f29168c = th.getMessage();
        if (packageR != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(packageR.getName());
            sb.append(".");
            name = name.replace(sb.toString(), "");
        }
        this.f29164U = name;
        this.f29165V = packageR != null ? packageR.getName() : null;
        this.f29166W = new C12584j(th.getStackTrace(), stackTraceElementArr, C12658b.m39697a(th));
        this.f29167X = cVar;
    }

    /* renamed from: a */
    public static Deque<C12581g> m39459a(Throwable th) {
        C12577c cVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        while (th != null && hashSet.add(th)) {
            if (th instanceof C12578d) {
                C12578d dVar = (C12578d) th;
                cVar = dVar.mo30780a();
                th = dVar.mo30781b();
            } else {
                cVar = null;
            }
            arrayDeque.add(new C12581g(th, stackTraceElementArr, cVar));
            stackTraceElementArr = th.getStackTrace();
            th = th.getCause();
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public C12577c mo30810b() {
        return this.f29167X;
    }

    /* renamed from: c */
    public String mo30811c() {
        return this.f29168c;
    }

    /* renamed from: d */
    public String mo30812d() {
        String str = this.f29165V;
        return str != null ? str : "(default)";
    }

    /* renamed from: e */
    public C12584j mo30813e() {
        return this.f29166W;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12581g.class != obj.getClass()) {
            return false;
        }
        C12581g gVar = (C12581g) obj;
        if (!this.f29164U.equals(gVar.f29164U)) {
            return false;
        }
        String str = this.f29168c;
        if (str == null ? gVar.f29168c != null : !str.equals(gVar.f29168c)) {
            return false;
        }
        String str2 = this.f29165V;
        if (str2 == null ? gVar.f29165V != null : !str2.equals(gVar.f29165V)) {
            return false;
        }
        C12577c cVar = this.f29167X;
        if (cVar == null ? gVar.f29167X == null : cVar.equals(gVar.f29167X)) {
            return this.f29166W.equals(gVar.f29166W);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f29168c;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29164U.hashCode()) * 31;
        String str2 = this.f29165V;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SentryException{exceptionMessage='");
        sb.append(this.f29168c);
        sb.append('\'');
        sb.append(", exceptionClassName='");
        sb.append(this.f29164U);
        sb.append('\'');
        sb.append(", exceptionPackageName='");
        sb.append(this.f29165V);
        sb.append('\'');
        sb.append(", exceptionMechanism='");
        sb.append(this.f29167X);
        sb.append('\'');
        sb.append(", stackTraceInterface=");
        sb.append(this.f29166W);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public String mo30809a() {
        return this.f29164U;
    }
}
