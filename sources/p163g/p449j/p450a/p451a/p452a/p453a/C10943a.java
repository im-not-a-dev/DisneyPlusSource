package p163g.p449j.p450a.p451a.p452a.p453a;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.C9633e;
import com.google.android.gms.auth.api.signin.C9645a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C9659h;
import com.google.android.gms.auth.api.signin.internal.C9660i;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9682d.C9687e;
import com.google.android.gms.common.api.C9678a.C9690g;
import p163g.p449j.p450a.p451a.p452a.p453a.p454d.C10948a;
import p163g.p449j.p450a.p451a.p457d.p459b.C10969f;
import p163g.p449j.p450a.p451a.p457d.p459b.C10976m;

/* renamed from: g.j.a.a.a.a.a */
public final class C10943a {

    /* renamed from: a */
    public static final C9690g<C10976m> f25994a = new C9690g<>();

    /* renamed from: b */
    public static final C9690g<C9660i> f25995b = new C9690g<>();

    /* renamed from: c */
    private static final C9679a<C10976m, C10944a> f25996c = new C10950f();

    /* renamed from: d */
    private static final C9679a<C9660i, GoogleSignInOptions> f25997d = new C10951g();

    /* renamed from: e */
    public static final C9678a<C10944a> f25998e = new C9678a<>("Auth.CREDENTIALS_API", f25996c, f25994a);

    /* renamed from: f */
    public static final C9678a<GoogleSignInOptions> f25999f = new C9678a<>("Auth.GOOGLE_SIGN_IN_API", f25997d, f25995b);

    /* renamed from: g */
    public static final C9633e f26000g = new C10969f();

    /* renamed from: h */
    public static final C9645a f26001h = new C9659h();

    @Deprecated
    /* renamed from: g.j.a.a.a.a.a$a */
    public static class C10944a implements C9687e {

        /* renamed from: c */
        private final boolean f26002c;

        @Deprecated
        /* renamed from: g.j.a.a.a.a.a$a$a */
        public static class C10945a {

            /* renamed from: a */
            protected Boolean f26003a = Boolean.valueOf(false);

            /* renamed from: a */
            public C10944a mo24884a() {
                return new C10944a(this);
            }
        }

        static {
            new C10945a().mo24884a();
        }

        public C10944a(C10945a aVar) {
            this.f26002c = aVar.f26003a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo28191a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f26002c);
            return bundle;
        }
    }

    static {
        C9678a<C10947c> aVar = C10946b.f26006c;
        C10948a aVar2 = C10946b.f26007d;
    }
}
