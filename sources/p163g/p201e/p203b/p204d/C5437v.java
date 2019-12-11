package p163g.p201e.p203b.p204d;

import android.content.SharedPreferences;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedCheckerImpl;", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "accountSettingsViewed", "getAccountSettingsViewed", "()Z", "setAccountSettingsViewed", "(Z)V", "Companion", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.v */
/* compiled from: AccountSettingsViewedCheckerImpl.kt */
public final class C5437v implements C5434u {

    /* renamed from: a */
    private final SharedPreferences f12946a;

    /* renamed from: g.e.b.d.v$a */
    /* compiled from: AccountSettingsViewedCheckerImpl.kt */
    public static final class C5438a {
        private C5438a() {
        }

        public /* synthetic */ C5438a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5438a(null);
    }

    public C5437v(SharedPreferences sharedPreferences) {
        this.f12946a = sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo17168a() {
        return this.f12946a.getBoolean("accountSettingsViewed", false);
    }

    /* renamed from: a */
    public void mo17167a(boolean z) {
        this.f12946a.edit().putBoolean("accountSettingsViewed", z).apply();
    }
}
