package p096e.p150n.p151a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0730s;
import androidx.lifecycle.C0731t;
import androidx.lifecycle.C0741y;
import androidx.lifecycle.C0742z;
import androidx.lifecycle.C0742z.C0744b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p096e.p113e.C3942j;
import p096e.p121h.p134r.C4109a;
import p096e.p150n.p151a.C4237a.C4238a;
import p096e.p150n.p152b.C4246b;
import p096e.p150n.p152b.C4246b.C4248b;

/* renamed from: e.n.a.b */
/* compiled from: LoaderManagerImpl */
class C4239b extends C4237a {

    /* renamed from: c */
    static boolean f10565c = false;

    /* renamed from: a */
    private final C0722m f10566a;

    /* renamed from: b */
    private final C4242c f10567b;

    /* renamed from: e.n.a.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C4240a<D> extends C0730s<D> implements C4248b<D> {

        /* renamed from: k */
        private final int f10568k;

        /* renamed from: l */
        private final Bundle f10569l;

        /* renamed from: m */
        private final C4246b<D> f10570m;

        /* renamed from: n */
        private C0722m f10571n;

        /* renamed from: o */
        private C4241b<D> f10572o;

        /* renamed from: p */
        private C4246b<D> f10573p;

        C4240a(int i, Bundle bundle, C4246b<D> bVar, C4246b<D> bVar2) {
            this.f10568k = i;
            this.f10569l = bundle;
            this.f10570m = bVar;
            this.f10573p = bVar2;
            this.f10570m.mo14959a(i, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C4246b<D> mo14924a(C0722m mVar, C4238a<D> aVar) {
            C4241b<D> bVar = new C4241b<>(this.f10570m, aVar);
            mo4093a(mVar, bVar);
            C4241b<D> bVar2 = this.f10572o;
            if (bVar2 != null) {
                mo4094a((C0731t<? super D>) bVar2);
            }
            this.f10571n = mVar;
            this.f10572o = bVar;
            return this.f10570m;
        }

        /* renamed from: b */
        public void mo4096b(D d) {
            super.mo4096b(d);
            C4246b<D> bVar = this.f10573p;
            if (bVar != null) {
                bVar.mo14972n();
                this.f10573p = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4098c() {
            if (C4239b.f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f10570m.mo14974p();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4099d() {
            if (C4239b.f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f10570m.mo14975q();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C4246b<D> mo14928e() {
            return this.f10570m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo14929f() {
            C0722m mVar = this.f10571n;
            C4241b<D> bVar = this.f10572o;
            if (mVar != null && bVar != null) {
                super.mo4094a((C0731t<? super T>) bVar);
                mo4093a(mVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f10568k);
            sb.append(" : ");
            C4109a.m14083a(this.f10570m, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo4094a(C0731t<? super D> tVar) {
            super.mo4094a(tVar);
            this.f10571n = null;
            this.f10572o = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C4246b<D> mo14925a(boolean z) {
            if (C4239b.f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f10570m.mo14962b();
            this.f10570m.mo14958a();
            C4241b<D> bVar = this.f10572o;
            if (bVar != null) {
                mo4094a((C0731t<? super D>) bVar);
                if (z) {
                    bVar.mo14933b();
                }
            }
            this.f10570m.mo14960a((C4248b<D>) this);
            if ((bVar == null || bVar.mo14932a()) && !z) {
                return this.f10570m;
            }
            this.f10570m.mo14972n();
            return this.f10573p;
        }

        /* renamed from: a */
        public void mo14926a(C4246b<D> bVar, D d) {
            String str = "LoaderManager";
            if (C4239b.f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v(str, sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo4096b(d);
                return;
            }
            if (C4239b.f10565c) {
                Log.w(str, "onLoadComplete was incorrectly called on a background thread");
            }
            mo4095a(d);
        }

        /* renamed from: a */
        public void mo14927a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10568k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10569l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10570m);
            C4246b<D> bVar = this.f10570m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "  ";
            sb.append(str2);
            bVar.mo14943a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f10572o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10572o);
                C4241b<D> bVar2 = this.f10572o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                bVar2.mo14931a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo14928e().mo14957a(mo4091a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo4097b());
        }
    }

    /* renamed from: e.n.a.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C4241b<D> implements C0731t<D> {

        /* renamed from: a */
        private final C4246b<D> f10574a;

        /* renamed from: b */
        private final C4238a<D> f10575b;

        /* renamed from: c */
        private boolean f10576c = false;

        C4241b(C4246b<D> bVar, C4238a<D> aVar) {
            this.f10574a = bVar;
            this.f10575b = aVar;
        }

        /* renamed from: a */
        public void mo4149a(D d) {
            if (C4239b.f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f10574a);
                sb.append(": ");
                sb.append(this.f10574a.mo14957a(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.f10575b.mo14922a(this.f10574a, d);
            this.f10576c = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo14933b() {
            if (this.f10576c) {
                if (C4239b.f10565c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f10574a);
                    Log.v("LoaderManager", sb.toString());
                }
                this.f10575b.mo14921a(this.f10574a);
            }
        }

        public String toString() {
            return this.f10575b.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo14932a() {
            return this.f10576c;
        }

        /* renamed from: a */
        public void mo14931a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10576c);
        }
    }

    /* renamed from: e.n.a.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C4242c extends C0741y {

        /* renamed from: c */
        private static final C0744b f10577c = new C4243a();

        /* renamed from: a */
        private C3942j<C4240a> f10578a = new C3942j<>();

        /* renamed from: b */
        private boolean f10579b = false;

        /* renamed from: e.n.a.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C4243a implements C0744b {
            C4243a() {
            }

            /* renamed from: a */
            public <T extends C0741y> T mo3293a(Class<T> cls) {
                return new C4242c();
            }
        }

        C4242c() {
        }

        /* renamed from: a */
        static C4242c m14593a(C0707b0 b0Var) {
            return (C4242c) new C0742z(b0Var, f10577c).mo4180a(C4242c.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo14935A() {
            int b = this.f10578a.mo14175b();
            for (int i = 0; i < b; i++) {
                ((C4240a) this.f10578a.mo14182e(i)).mo14929f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public void mo14936B() {
            this.f10579b = true;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            int b = this.f10578a.mo14175b();
            for (int i = 0; i < b; i++) {
                ((C4240a) this.f10578a.mo14182e(i)).mo14925a(true);
            }
            this.f10578a.mo14173a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public void mo14940y() {
            this.f10579b = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public boolean mo14941z() {
            return this.f10579b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo14938a(int i, C4240a aVar) {
            this.f10578a.mo14179c(i, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <D> C4240a<D> mo14937a(int i) {
            return (C4240a) this.f10578a.mo14172a(i);
        }

        /* renamed from: a */
        public void mo14939a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10578a.mo14175b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f10578a.mo14175b(); i++) {
                    C4240a aVar = (C4240a) this.f10578a.mo14182e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10578a.mo14178c(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo14927a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    C4239b(C0722m mVar, C0707b0 b0Var) {
        this.f10566a = mVar;
        this.f10567b = C4242c.m14593a(b0Var);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C4246b<D> m14575a(int i, Bundle bundle, C4238a<D> aVar, C4246b<D> bVar) {
        try {
            this.f10567b.mo14936B();
            C4246b a = aVar.mo14920a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                C4240a aVar2 = new C4240a(i, bundle, a, bVar);
                if (f10565c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                    Log.v("LoaderManager", sb2.toString());
                }
                this.f10567b.mo14938a(i, aVar2);
                this.f10567b.mo14940y();
                return aVar2.mo14924a(this.f10566a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f10567b.mo14940y();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C4109a.m14083a(this.f10566a, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public <D> C4246b<D> mo14917a(int i, Bundle bundle, C4238a<D> aVar) {
        if (this.f10567b.mo14941z()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C4240a a = this.f10567b.mo14937a(i);
            String str = "LoaderManager";
            if (f10565c) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v(str, sb.toString());
            }
            if (a == null) {
                return m14575a(i, bundle, aVar, null);
            }
            if (f10565c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a);
                Log.v(str, sb2.toString());
            }
            return a.mo14924a(this.f10566a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public void mo14918a() {
        this.f10567b.mo14935A();
    }

    @Deprecated
    /* renamed from: a */
    public void mo14919a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10567b.mo14939a(str, fileDescriptor, printWriter, strArr);
    }
}
