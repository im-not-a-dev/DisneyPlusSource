package com.bamtechmedia.dominguez.auth;

import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.functions.C11945a;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/AuthSuccessActionImpl;", "Lcom/bamtechmedia/dominguez/auth/AuthSuccessAction;", "authListener", "Lcom/bamtechmedia/dominguez/auth/api/AuthListener;", "logInAction", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "firstTimeUser", "", "(Lcom/bamtechmedia/dominguez/auth/api/AuthListener;Lcom/bamtechmedia/dominguez/auth/login/LogInAction;Z)V", "getFirstTimeUser", "()Z", "onSuccess", "Lio/reactivex/disposables/Disposable;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.x */
/* compiled from: AuthSuccessActionImpl.kt */
public final class C3141x implements C3140w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2740b f8060a;

    /* renamed from: b */
    private final C2783b f8061b;

    /* renamed from: c */
    private final boolean f8062c;

    /* renamed from: com.bamtechmedia.dominguez.auth.x$a */
    /* compiled from: AuthSuccessActionImpl.kt */
    static final class C3142a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C3141x f8063a;

        C3142a(C3141x xVar) {
            this.f8063a = xVar;
        }

        public final void run() {
            this.f8063a.f8060a.mo11752a(this.f8063a.mo12180a());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.x$b */
    /* compiled from: AuthSuccessActionImpl.kt */
    static final /* synthetic */ class C3143b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3143b f8064c = new C3143b();

        C3143b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12181a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12181a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C3141x(C2740b bVar, C2783b bVar2, boolean z) {
        this.f8060a = bVar;
        this.f8061b = bVar2;
        this.f8062c = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.auth.x$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.auth.y] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p520io.reactivex.disposables.Disposable onSuccess() {
        /*
            r4 = this;
            com.bamtechmedia.dominguez.auth.q0.b r0 = r4.f8061b
            io.reactivex.Completable r0 = r0.mo11569a()
            com.bamtechmedia.dominguez.auth.x$a r1 = new com.bamtechmedia.dominguez.auth.x$a
            r1.<init>(r4)
            com.bamtechmedia.dominguez.auth.x$b r2 = com.bamtechmedia.dominguez.auth.C3141x.C3143b.f8064c
            if (r2 == 0) goto L_0x0015
            com.bamtechmedia.dominguez.auth.y r3 = new com.bamtechmedia.dominguez.auth.y
            r3.<init>(r2)
            r2 = r3
        L_0x0015:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo30047a(r1, r2)
            java.lang.String r1 = "logInAction.onLogin()\n  …stTimeUser) }, Timber::e)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.C3141x.onSuccess():io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public final boolean mo12180a() {
        return this.f8062c;
    }
}
