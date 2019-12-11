package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.internal.C9709a;
import com.google.android.gms.common.api.internal.C9717b2;
import com.google.android.gms.common.api.internal.C9718c;
import com.google.android.gms.common.api.internal.C9726e;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import com.google.android.gms.common.api.internal.C9731e1;
import com.google.android.gms.common.api.internal.C9762m;
import com.google.android.gms.common.api.internal.C9768n1;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.api.e */
public class C9695e<O extends C9682d> {

    /* renamed from: a */
    private final Context f22709a;

    /* renamed from: b */
    private final C9678a<O> f22710b;

    /* renamed from: c */
    private final O f22711c;

    /* renamed from: d */
    private final C9717b2<O> f22712d;

    /* renamed from: e */
    private final Looper f22713e;

    /* renamed from: f */
    private final int f22714f;

    /* renamed from: g */
    private final C9698f f22715g;

    /* renamed from: h */
    protected final C9726e f22716h;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C9696a {

        /* renamed from: a */
        public final C9762m f22717a;

        /* renamed from: b */
        public final Looper f22718b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C9697a {

            /* renamed from: a */
            private C9762m f22719a;

            /* renamed from: b */
            private Looper f22720b;

            /* renamed from: a */
            public C9697a mo25056a(C9762m mVar) {
                C9908u.m30854a(mVar, (Object) "StatusExceptionMapper must not be null.");
                this.f22719a = mVar;
                return this;
            }

            /* renamed from: a */
            public C9696a mo25057a() {
                if (this.f22719a == null) {
                    this.f22719a = new C9709a();
                }
                if (this.f22720b == null) {
                    this.f22720b = Looper.getMainLooper();
                }
                return new C9696a(this.f22719a, this.f22720b);
            }
        }

        static {
            new C9697a().mo25057a();
        }

        private C9696a(C9762m mVar, Account account, Looper looper) {
            this.f22717a = mVar;
            this.f22718b = looper;
        }
    }

    protected C9695e(Context context, C9678a<O> aVar, Looper looper) {
        C9908u.m30854a(context, (Object) "Null context is not permitted.");
        C9908u.m30854a(aVar, (Object) "Api must not be null.");
        C9908u.m30854a(looper, (Object) "Looper must not be null.");
        this.f22709a = context.getApplicationContext();
        this.f22710b = aVar;
        this.f22711c = null;
        this.f22713e = looper;
        this.f22712d = C9717b2.m30170a(aVar);
        this.f22715g = new C9731e1(this);
        this.f22716h = C9726e.m30189a(this.f22709a);
        this.f22714f = this.f22716h.mo25139b();
        new C9709a();
    }

    /* renamed from: a */
    private final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T m30092a(int i, T t) {
        t.mo25092f();
        this.f22716h.mo25137a(this, i, t);
        return t;
    }

    /* renamed from: b */
    public <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25049b(T t) {
        m30092a(1, t);
        return t;
    }

    /* renamed from: c */
    public final C9678a<O> mo25051c() {
        return this.f22710b;
    }

    /* renamed from: d */
    public Context mo25052d() {
        return this.f22709a;
    }

    /* renamed from: e */
    public final int mo25053e() {
        return this.f22714f;
    }

    /* renamed from: f */
    public Looper mo25054f() {
        return this.f22713e;
    }

    /* renamed from: g */
    public final C9717b2<O> mo25055g() {
        return this.f22712d;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C9864d.C9865a mo25050b() {
        /*
            r3 = this;
            com.google.android.gms.common.internal.d$a r0 = new com.google.android.gms.common.internal.d$a
            r0.<init>()
            O r1 = r3.f22711c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C9678a.C9682d.C9684b
            if (r2 == 0) goto L_0x0018
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C9678a.C9682d.C9684b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo25022a()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.mo24895c()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.f22711c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C9678a.C9682d.C9683a
            if (r2 == 0) goto L_0x0025
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C9678a.C9682d.C9683a) r1
            android.accounts.Account r1 = r1.getAccount()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.mo25366a(r1)
            O r1 = r3.f22711c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C9678a.C9682d.C9684b
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C9678a.C9682d.C9684b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo25022a()
            if (r1 == 0) goto L_0x003c
            java.util.Set r1 = r1.mo24905k()
            goto L_0x0040
        L_0x003c:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0040:
            r0.mo25368a(r1)
            android.content.Context r1 = r3.f22709a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.mo25367a(r1)
            android.content.Context r1 = r3.f22709a
            java.lang.String r1 = r1.getPackageName()
            r0.mo25370b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C9695e.mo25050b():com.google.android.gms.common.internal.d$a");
    }

    /* renamed from: a */
    public <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25047a(T t) {
        m30092a(0, t);
        return t;
    }

    /* renamed from: a */
    public C9689f mo25045a(Looper looper, C9727a<O> aVar) {
        return this.f22710b.mo25019d().mo25020a(this.f22709a, looper, mo25050b().mo25369a(), this.f22711c, aVar, aVar);
    }

    /* renamed from: a */
    public C9698f mo25046a() {
        return this.f22715g;
    }

    /* renamed from: a */
    public C9768n1 mo25048a(Context context, Handler handler) {
        return new C9768n1(context, handler, mo25050b().mo25369a());
    }

    public C9695e(Context context, C9678a<O> aVar, O o, C9696a aVar2) {
        C9908u.m30854a(context, (Object) "Null context is not permitted.");
        C9908u.m30854a(aVar, (Object) "Api must not be null.");
        C9908u.m30854a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f22709a = context.getApplicationContext();
        this.f22710b = aVar;
        this.f22711c = o;
        this.f22713e = aVar2.f22718b;
        this.f22712d = C9717b2.m30171a(this.f22710b, this.f22711c);
        this.f22715g = new C9731e1(this);
        this.f22716h = C9726e.m30189a(this.f22709a);
        this.f22714f = this.f22716h.mo25139b();
        C9762m mVar = aVar2.f22717a;
        this.f22716h.mo25136a(this);
    }

    @Deprecated
    public C9695e(Context context, C9678a<O> aVar, O o, C9762m mVar) {
        C9697a aVar2 = new C9697a();
        aVar2.mo25056a(mVar);
        this(context, aVar, o, aVar2.mo25057a());
    }
}
