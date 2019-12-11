package p096e.p150n.p152b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p096e.p121h.p134r.C4109a;

/* renamed from: e.n.b.b */
/* compiled from: Loader */
public class C4246b<D> {

    /* renamed from: a */
    int f10589a;

    /* renamed from: b */
    C4248b<D> f10590b;

    /* renamed from: c */
    C4247a<D> f10591c;

    /* renamed from: d */
    boolean f10592d = false;

    /* renamed from: e */
    boolean f10593e = false;

    /* renamed from: f */
    boolean f10594f = true;

    /* renamed from: g */
    boolean f10595g = false;

    /* renamed from: h */
    boolean f10596h = false;

    /* renamed from: e.n.b.b$a */
    /* compiled from: Loader */
    public interface C4247a<D> {
        /* renamed from: a */
        void mo14977a(C4246b<D> bVar);
    }

    /* renamed from: e.n.b.b$b */
    /* compiled from: Loader */
    public interface C4248b<D> {
        /* renamed from: a */
        void mo14926a(C4246b<D> bVar, D d);
    }

    public C4246b(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo14959a(int i, C4248b<D> bVar) {
        if (this.f10590b == null) {
            this.f10590b = bVar;
            this.f10589a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: b */
    public void mo14961b(D d) {
        C4248b<D> bVar = this.f10590b;
        if (bVar != null) {
            bVar.mo14926a(this, d);
        }
    }

    /* renamed from: c */
    public void mo14963c() {
        this.f10596h = false;
    }

    /* renamed from: d */
    public void mo14964d() {
        C4247a<D> aVar = this.f10591c;
        if (aVar != null) {
            aVar.mo14977a(this);
        }
    }

    /* renamed from: e */
    public void mo14965e() {
        mo14947j();
    }

    /* renamed from: f */
    public boolean mo14966f() {
        return this.f10593e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo14967g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo14946h() {
        throw null;
    }

    /* renamed from: i */
    public void mo14968i() {
        if (this.f10592d) {
            mo14965e();
        } else {
            this.f10595g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo14947j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo14969k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo14970l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo14971m() {
    }

    /* renamed from: n */
    public void mo14972n() {
        mo14969k();
        this.f10594f = true;
        this.f10592d = false;
        this.f10593e = false;
        this.f10595g = false;
        this.f10596h = false;
    }

    /* renamed from: o */
    public void mo14973o() {
        if (this.f10596h) {
            mo14968i();
        }
    }

    /* renamed from: p */
    public final void mo14974p() {
        this.f10592d = true;
        this.f10594f = false;
        this.f10593e = false;
        mo14970l();
    }

    /* renamed from: q */
    public void mo14975q() {
        this.f10592d = false;
        mo14971m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C4109a.m14083a(this, sb);
        sb.append(" id=");
        sb.append(this.f10589a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: b */
    public boolean mo14962b() {
        return mo14946h();
    }

    /* renamed from: a */
    public void mo14960a(C4248b<D> bVar) {
        C4248b<D> bVar2 = this.f10590b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f10590b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo14958a() {
        this.f10593e = true;
        mo14967g();
    }

    /* renamed from: a */
    public String mo14957a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C4109a.m14083a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo14943a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f10589a);
        printWriter.print(" mListener=");
        printWriter.println(this.f10590b);
        if (this.f10592d || this.f10595g || this.f10596h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f10592d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f10595g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f10596h);
        }
        if (this.f10593e || this.f10594f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f10593e);
            printWriter.print(" mReset=");
            printWriter.println(this.f10594f);
        }
    }
}
