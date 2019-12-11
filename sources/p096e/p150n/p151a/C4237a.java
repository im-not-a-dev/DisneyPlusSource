package p096e.p150n.p151a;

import android.os.Bundle;
import androidx.lifecycle.C0709c0;
import androidx.lifecycle.C0722m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p096e.p150n.p152b.C4246b;

/* renamed from: e.n.a.a */
/* compiled from: LoaderManager */
public abstract class C4237a {

    /* renamed from: e.n.a.a$a */
    /* compiled from: LoaderManager */
    public interface C4238a<D> {
        /* renamed from: a */
        C4246b<D> mo14920a(int i, Bundle bundle);

        /* renamed from: a */
        void mo14921a(C4246b<D> bVar);

        /* renamed from: a */
        void mo14922a(C4246b<D> bVar, D d);
    }

    /* renamed from: a */
    public static <T extends C0722m & C0709c0> C4237a m14568a(T t) {
        return new C4239b(t, ((C0709c0) t).getViewModelStore());
    }

    /* renamed from: a */
    public abstract <D> C4246b<D> mo14917a(int i, Bundle bundle, C4238a<D> aVar);

    /* renamed from: a */
    public abstract void mo14918a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo14919a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
