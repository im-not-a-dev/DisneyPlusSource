package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.DefaultAccount;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.e.b.d.l0 */
/* compiled from: DefaultAccountExt.kt */
public final class C5407l0 {
    /* renamed from: a */
    public static final String m18171a(DefaultAccount defaultAccount) {
        Object obj = defaultAccount.getAttributes().get("email");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static final boolean m18172b(DefaultAccount defaultAccount) {
        return Intrinsics.areEqual(defaultAccount.getAttributes().get("userVerified"), (Object) Boolean.valueOf(true));
    }
}
