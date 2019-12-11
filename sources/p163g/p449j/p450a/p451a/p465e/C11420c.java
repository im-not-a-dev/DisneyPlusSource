package p163g.p449j.p450a.p451a.p465e;

import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9690g;
import com.google.android.gms.common.api.Scope;
import p163g.p449j.p450a.p451a.p465e.p466b.C11408a;

/* renamed from: g.j.a.a.e.c */
public final class C11420c {

    /* renamed from: a */
    private static final C9690g<C11408a> f26757a = new C9690g<>();

    /* renamed from: b */
    private static final C9690g<C11408a> f26758b = new C9690g<>();

    /* renamed from: c */
    public static final C9679a<C11408a, C11406a> f26759c = new C11421d();

    /* renamed from: d */
    private static final C9679a<C11408a, Object> f26760d = new C11422e();

    /* renamed from: e */
    public static final C9678a<C11406a> f26761e = new C9678a<>("SignIn.API", f26759c, f26757a);

    static {
        new Scope("profile");
        new Scope("email");
        new C9678a("SignIn.INTERNAL_API", f26760d, f26758b);
    }
}
