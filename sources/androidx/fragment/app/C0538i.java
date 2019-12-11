package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentManager */
public abstract class C0538i {

    /* renamed from: U */
    static final C0536g f2344U = new C0536g();

    /* renamed from: c */
    private C0536g f2345c = null;

    /* renamed from: androidx.fragment.app.i$a */
    /* compiled from: FragmentManager */
    public interface C0539a {
        int getId();
    }

    /* renamed from: androidx.fragment.app.i$b */
    /* compiled from: FragmentManager */
    public static abstract class C0540b {
        /* renamed from: a */
        public void mo3163a(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: a */
        public void mo3164a(C0538i iVar, Fragment fragment, Context context) {
        }

        /* renamed from: a */
        public void mo3165a(C0538i iVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo3166a(C0538i iVar, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo3167b(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: b */
        public void mo3168b(C0538i iVar, Fragment fragment, Context context) {
        }

        /* renamed from: b */
        public void mo3169b(C0538i iVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo3170c(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: c */
        public void mo3171c(C0538i iVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo3172d(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: d */
        public void mo3173d(C0538i iVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo3174e(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo3175f(C0538i iVar, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo3176g(C0538i iVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.i$c */
    /* compiled from: FragmentManager */
    public interface C0541c {
        /* renamed from: b */
        void mo3177b();
    }

    /* renamed from: a */
    public abstract Fragment mo3145a(int i);

    /* renamed from: a */
    public abstract Fragment mo3146a(String str);

    /* renamed from: a */
    public abstract C0564o mo3147a();

    /* renamed from: a */
    public abstract void mo3148a(int i, int i2);

    /* renamed from: a */
    public void mo3149a(C0536g gVar) {
        this.f2345c = gVar;
    }

    /* renamed from: a */
    public abstract void mo3150a(C0540b bVar, boolean z);

    /* renamed from: a */
    public abstract void mo3151a(C0541c cVar);

    /* renamed from: a */
    public abstract void mo3152a(String str, int i);

    /* renamed from: a */
    public abstract void mo3153a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract C0539a mo3154b(int i);

    /* renamed from: b */
    public abstract void mo3155b(C0541c cVar);

    /* renamed from: b */
    public abstract boolean mo3156b();

    /* renamed from: c */
    public abstract int mo3157c();

    /* renamed from: d */
    public C0536g mo3158d() {
        if (this.f2345c == null) {
            this.f2345c = f2344U;
        }
        return this.f2345c;
    }

    /* renamed from: e */
    public abstract List<Fragment> mo3159e();

    /* renamed from: f */
    public abstract Fragment mo3160f();

    /* renamed from: g */
    public abstract void mo3161g();

    /* renamed from: h */
    public abstract boolean mo3162h();
}
