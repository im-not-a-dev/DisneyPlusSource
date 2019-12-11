package p163g.p201e.p203b.p298l;

import com.bamtechmedia.dominguez.config.C3524e;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/FreeTrialConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V", "amazonStoreLink", "", "getAmazonStoreLink", "()Ljava/lang/String;", "playStoreLink", "getPlayStoreLink", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.b */
/* compiled from: FreeTrialConfig.kt */
public final class C7501b {

    /* renamed from: a */
    private final C3524e f16462a;

    /* renamed from: g.e.b.l.b$a */
    /* compiled from: FreeTrialConfig.kt */
    public static final class C7502a {
        private C7502a() {
        }

        public /* synthetic */ C7502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7502a(null);
    }

    public C7501b(C3524e eVar) {
        this.f16462a = eVar;
    }

    /* renamed from: a */
    public final String mo20394a() {
        String str = (String) this.f16462a.mo12720d("paywall", "amazonStoreLink");
        return str != null ? str : "amzn://apps/android?p=";
    }

    /* renamed from: b */
    public final String mo20395b() {
        String str = (String) this.f16462a.mo12720d("paywall", "playStoreLink");
        return str != null ? str : "https://play.google.com/store/apps/details?id=";
    }
}
