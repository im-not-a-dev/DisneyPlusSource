package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9726e;
import com.google.android.gms.common.p398n.C9927a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
public final class C9661j {

    /* renamed from: a */
    private static C9927a f22680a = new C9927a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m30009a(Context context, GoogleSignInOptions googleSignInOptions) {
        f22680a.mo25452a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String str = "config";
        bundle.putParcelable(str, signInConfiguration);
        intent.putExtra(str, bundle);
        return intent;
    }

    /* renamed from: a */
    public static C9702g<Status> m30010a(C9698f fVar, Context context, boolean z) {
        f22680a.mo25452a("Revoking access", new Object[0]);
        String d = C9654c.m29983a(context).mo24951d();
        m30011a(context);
        if (z) {
            return C9657f.m29997a(d);
        }
        return fVar.mo25063b(new C9662k(fVar));
    }

    /* renamed from: a */
    private static void m30011a(Context context) {
        C9665n.m30015a(context).mo24969a();
        for (C9698f g : C9698f.m30106h()) {
            g.mo25068g();
        }
        C9726e.m30194d();
    }
}
