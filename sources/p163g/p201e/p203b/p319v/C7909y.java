package p163g.p201e.p203b.p319v;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.p300y.C7576g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessageImpl;", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "preferences", "Landroid/content/SharedPreferences;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "(Landroid/content/SharedPreferences;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "value", "", "subscriptionMessageRequested", "getSubscriptionMessageRequested", "()Z", "setSubscriptionMessageRequested", "(Z)V", "setRequested", "", "requested", "showIfRequested", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.y */
/* compiled from: SubscriptionMessageImpl.kt */
public final class C7909y implements C7908x {

    /* renamed from: a */
    private final SharedPreferences f17043a;

    /* renamed from: b */
    private final C7547h f17044b;

    /* renamed from: g.e.b.v.y$a */
    /* compiled from: SubscriptionMessageImpl.kt */
    private static final class C7910a {
        private C7910a() {
        }

        public /* synthetic */ C7910a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7910a(null);
    }

    public C7909y(SharedPreferences sharedPreferences, C7547h hVar) {
        this.f17043a = sharedPreferences;
        this.f17044b = hVar;
    }

    /* renamed from: b */
    private final boolean m23124b() {
        return this.f17043a.getBoolean("subscriptionMessageRequested", false);
    }

    /* renamed from: a */
    public void mo20834a(boolean z) {
        m23123b(z);
    }

    /* renamed from: b */
    private final void m23123b(boolean z) {
        Editor edit = this.f17043a.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putBoolean("subscriptionMessageRequested", z);
        edit.apply();
    }

    /* renamed from: a */
    public void mo20833a() {
        if (m23124b()) {
            m23123b(false);
            this.f17044b.mo20489a(C7576g.SUCCESS, C7906v.purchase_success);
        }
    }
}
