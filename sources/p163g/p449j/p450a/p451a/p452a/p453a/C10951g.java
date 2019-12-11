package p163g.p449j.p450a.p451a.p452a.p453a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C9660i;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9864d;
import java.util.Collections;
import java.util.List;

/* renamed from: g.j.a.a.a.a.g */
final class C10951g extends C9679a<C9660i, GoogleSignInOptions> {
    C10951g() {
    }

    /* renamed from: a */
    public final /* synthetic */ C9689f mo25020a(Context context, Looper looper, C9864d dVar, Object obj, C9700b bVar, C9701c cVar) {
        C9660i iVar = new C9660i(context, looper, dVar, (GoogleSignInOptions) obj, bVar, cVar);
        return iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo25024a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo24912e();
    }
}
