package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9850c.C9853c;
import com.google.android.gms.common.internal.C9850c.C9855e;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9886m;
import com.google.android.gms.common.internal.C9908u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C9678a<O extends C9682d> {

    /* renamed from: a */
    private final C9679a<?, O> f22704a;

    /* renamed from: b */
    private final C9690g<?> f22705b;

    /* renamed from: c */
    private final String f22706c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C9679a<T extends C9689f, O> extends C9688e<T, O> {
        /* renamed from: a */
        public abstract T mo25020a(Context context, Looper looper, C9864d dVar, O o, C9700b bVar, C9701c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C9680b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C9681c<C extends C9680b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C9682d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C9683a extends C9685c, C9686d {
            Account getAccount();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C9684b extends C9685c {
            /* renamed from: a */
            GoogleSignInAccount mo25022a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C9685c extends C9682d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C9686d extends C9682d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C9687e extends C9685c, C9686d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C9688e<T extends C9680b, O> {
        /* renamed from: a */
        public int mo25023a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo25024a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C9689f extends C9680b {
        /* renamed from: a */
        void mo25025a();

        /* renamed from: a */
        void mo25026a(C9853c cVar);

        /* renamed from: a */
        void mo25027a(C9855e eVar);

        /* renamed from: a */
        void mo25028a(C9886m mVar, Set<Scope> set);

        /* renamed from: a */
        void mo25029a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo25030c();

        /* renamed from: d */
        boolean mo24961d();

        /* renamed from: e */
        boolean mo25031e();

        /* renamed from: f */
        String mo25032f();

        /* renamed from: h */
        boolean mo25033h();

        /* renamed from: i */
        int mo24962i();

        /* renamed from: j */
        C9824d[] mo25034j();

        /* renamed from: k */
        Intent mo24963k();

        /* renamed from: l */
        boolean mo25035l();

        /* renamed from: m */
        IBinder mo25036m();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C9690g<C extends C9689f> extends C9681c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C9691h<T extends IInterface> extends C9680b {
        /* renamed from: a */
        T mo25037a(IBinder iBinder);

        /* renamed from: a */
        void mo25038a(int i, T t);

        /* renamed from: n */
        String mo25039n();

        /* renamed from: o */
        String mo25040o();
    }

    public <C extends C9689f> C9678a(String str, C9679a<C, O> aVar, C9690g<C> gVar) {
        C9908u.m30854a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C9908u.m30854a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f22706c = str;
        this.f22704a = aVar;
        this.f22705b = gVar;
    }

    /* renamed from: a */
    public final C9681c<?> mo25016a() {
        C9690g<?> gVar = this.f22705b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo25017b() {
        return this.f22706c;
    }

    /* renamed from: c */
    public final C9688e<?, O> mo25018c() {
        return this.f22704a;
    }

    /* renamed from: d */
    public final C9679a<?, O> mo25019d() {
        C9908u.m30865b(this.f22704a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f22704a;
    }
}
