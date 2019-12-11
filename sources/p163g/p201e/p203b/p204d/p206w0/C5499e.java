package p163g.p201e.p203b.p204d.p206w0;

import com.bamtech.sdk4.subscription.Subscription;
import com.bamtech.sdk4.subscription.SubscriptionProvider;
import java.util.Locale;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.e.b.d.w0.e */
/* compiled from: SubscriptionExt.kt */
public final class C5499e {
    /* renamed from: a */
    public static final String m18286a(Subscription subscription) {
        return m18287a("message", subscription);
    }

    /* renamed from: b */
    public static final String m18288b(Subscription subscription) {
        return m18287a("title", subscription);
    }

    /* renamed from: a */
    private static final String m18287a(String str, Subscription subscription) {
        String companion = SubscriptionProvider.Companion.toString(subscription.getSource().getProvider());
        Locale locale = Locale.US;
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "Locale.US");
        if (companion != null) {
            String lowerCase = companion.toLowerCase(locale);
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String str2 = "account_subscription_";
            if (C5498d.$EnumSwitchMapping$0[subscription.getBundleStatus().ordinal()] != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                sb.append('_');
                sb.append(lowerCase);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append('_');
            sb2.append(lowerCase);
            sb2.append("_bundle");
            return sb2.toString();
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }
}
