package com.bamtechmedia.dominguez.auth.p064p0;

import android.content.Intent;
import androidx.fragment.app.C0532d;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "", "clear", "", "credentials", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginCredentials;", "onAutoLoginFailed", "Lkotlin/Function0;", "credentialsMaybe", "Lio/reactivex/Maybe;", "initResolution", "activity", "Landroidx/fragment/app/FragmentActivity;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "store", "email", "", "password", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.p0.a */
/* compiled from: AutoLogin.kt */
public interface C2760a {

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.a$a */
    /* compiled from: AutoLogin.kt */
    public static final class C2761a {

        /* renamed from: com.bamtechmedia.dominguez.auth.p0.a$a$a */
        /* compiled from: AutoLogin.kt */
        static final class C2762a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            public static final C2762a f7504c = new C2762a();

            C2762a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m10413a(C2760a aVar, C2770d dVar, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = null;
                }
                if ((i & 2) != 0) {
                    function0 = C2762a.f7504c;
                }
                aVar.mo11778a(dVar, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }
    }

    /* renamed from: a */
    Maybe<C2770d> mo11775a();

    /* renamed from: a */
    void mo11776a(int i, int i2, Intent intent);

    /* renamed from: a */
    void mo11777a(C0532d dVar);

    /* renamed from: a */
    void mo11778a(C2770d dVar, Function0<C13145v> function0);

    void store(String str, String str2);
}
