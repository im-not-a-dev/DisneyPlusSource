package p163g.p201e.p203b.p204d.p206w0;

import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.List;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p204d.C5386f;
import p163g.p201e.p203b.p204d.C5402j;
import p163g.p201e.p203b.p204d.C5407l0;
import p163g.p201e.p203b.p204d.C5409m0;
import p163g.p201e.p203b.p204d.C5415p0;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cH&R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/item/AccountSettingsItemsFactory;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "router", "Lcom/bamtechmedia/dominguez/account/AccountSettingsRouter;", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "accountSettingAccessibility", "Lcom/bamtechmedia/dominguez/account/AccountSettingAccessibilty;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/account/AccountSettingsRouter;Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;Lcom/bamtechmedia/dominguez/account/AccountSettingAccessibilty;)V", "getAccountSettingAccessibility$account_release", "()Lcom/bamtechmedia/dominguez/account/AccountSettingAccessibilty;", "getOtpRouter$account_release", "()Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "getRouter$account_release", "()Lcom/bamtechmedia/dominguez/account/AccountSettingsRouter;", "createChangePasswordItem", "Lcom/bamtechmedia/dominguez/account/item/EditItem;", "account", "Lcom/bamtech/sdk4/account/DefaultAccount;", "createChangePasswordItem$account_release", "createEditPasswordClickHandler", "Lkotlin/Function0;", "", "createEmailItem", "createEmailItem$account_release", "createItems", "", "Lcom/xwray/groupie/Group;", "subscriptions", "Lcom/bamtech/sdk4/subscription/Subscription;", "Companion", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.w0.a */
/* compiled from: AccountSettingsItemsFactory.kt */
public abstract class C5490a {

    /* renamed from: a */
    private final C3572r0 f13020a;

    /* renamed from: b */
    private final C5402j f13021b;

    /* renamed from: c */
    private final C2755d f13022c;

    /* renamed from: d */
    private final C5386f f13023d;

    /* renamed from: g.e.b.d.w0.a$a */
    /* compiled from: AccountSettingsItemsFactory.kt */
    public static final class C5491a {
        private C5491a() {
        }

        public /* synthetic */ C5491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d.w0.a$b */
    /* compiled from: AccountSettingsItemsFactory.kt */
    static final class C5492b extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ DefaultAccount f13024U;

        /* renamed from: c */
        final /* synthetic */ C5490a f13025c;

        C5492b(C5490a aVar, DefaultAccount defaultAccount) {
            this.f13025c = aVar;
            this.f13024U = defaultAccount;
            super(0);
        }

        public final void invoke() {
            this.f13025c.mo17240b().mo17148b(C5407l0.m18171a(this.f13024U));
        }
    }

    /* renamed from: g.e.b.d.w0.a$c */
    /* compiled from: AccountSettingsItemsFactory.kt */
    static final class C5493c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ DefaultAccount f13026U;

        /* renamed from: c */
        final /* synthetic */ C5490a f13027c;

        C5493c(C5490a aVar, DefaultAccount defaultAccount) {
            this.f13027c = aVar;
            this.f13026U = defaultAccount;
            super(0);
        }

        public final void invoke() {
            this.f13027c.mo17237a().mo11770a(C5407l0.m18171a(this.f13026U), false);
        }
    }

    /* renamed from: g.e.b.d.w0.a$d */
    /* compiled from: AccountSettingsItemsFactory.kt */
    static final class C5494d extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ DefaultAccount f13028U;

        /* renamed from: c */
        final /* synthetic */ C5490a f13029c;

        C5494d(C5490a aVar, DefaultAccount defaultAccount) {
            this.f13029c = aVar;
            this.f13028U = defaultAccount;
            super(0);
        }

        public final void invoke() {
            this.f13029c.mo17240b().mo17147a(C5407l0.m18171a(this.f13028U));
        }
    }

    static {
        new C5491a(null);
    }

    public C5490a(C3572r0 r0Var, C5402j jVar, C2755d dVar, C5386f fVar) {
        this.f13020a = r0Var;
        this.f13021b = jVar;
        this.f13022c = dVar;
        this.f13023d = fVar;
    }

    /* renamed from: c */
    private final Function0<C13145v> m18279c(DefaultAccount defaultAccount) {
        if (C5407l0.m18172b(defaultAccount)) {
            return new C5492b(this, defaultAccount);
        }
        return new C5493c(this, defaultAccount);
    }

    /* renamed from: a */
    public final C2755d mo17237a() {
        return this.f13022c;
    }

    /* renamed from: a */
    public abstract List<C11847b> mo17239a(DefaultAccount defaultAccount, List<Subscription> list);

    /* renamed from: b */
    public final C5402j mo17240b() {
        return this.f13021b;
    }

    /* renamed from: a */
    public final C5496c mo17238a(DefaultAccount defaultAccount) {
        String str = "password";
        C5496c cVar = new C5496c(str, C3573a.m12035a(this.f13020a, C5415p0.login_hide_password_asterisk, (Map) null, 2, (Object) null), 0, false, this.f13023d.mo17133a(), m18279c(defaultAccount), 12, null);
        return cVar;
    }

    /* renamed from: b */
    public final C5496c mo17241b(DefaultAccount defaultAccount) {
        if (C5407l0.m18172b(defaultAccount)) {
            C5496c cVar = new C5496c("email", C5407l0.m18171a(defaultAccount), 0, false, this.f13023d.mo17134a(C5407l0.m18171a(defaultAccount)), new C5494d(this, defaultAccount), 12, null);
            return cVar;
        }
        DefaultAccount defaultAccount2 = defaultAccount;
        C5496c cVar2 = new C5496c("email", C5407l0.m18171a(defaultAccount), C5409m0.vader_white_40, false, this.f13023d.mo17134a(C5407l0.m18171a(defaultAccount)), null, 40, null);
        return cVar2;
    }
}
