package com.bamtechmedia.dominguez.main.startup;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.config.C3517b;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6228i;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p208e.C5554a;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J\r\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&J\u0006\u0010'\u001a\u00020!J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168B@BX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00128B@BX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/startup/VersionCheck;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "appConfig", "Lcom/bamtechmedia/dominguez/config/AppConfig;", "context", "Landroid/content/Context;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "stateHolder", "Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;", "preferences", "Landroid/content/SharedPreferences;", "(Lcom/bamtechmedia/dominguez/config/AppConfig;Landroid/content/Context;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;Landroid/content/SharedPreferences;)V", "activityManager", "Landroid/app/ActivityManager;", "getActivityManager", "()Landroid/app/ActivityManager;", "bareStoredVersionCode", "", "getBareStoredVersionCode", "()I", "value", "", "storedEnvironment", "getStoredEnvironment", "()Ljava/lang/String;", "setStoredEnvironment", "(Ljava/lang/String;)V", "storedVersionCode", "getStoredVersionCode", "setStoredVersionCode", "(I)V", "checkRecommendation", "Lio/reactivex/Completable;", "checkVersion", "clearDataRecommendation", "isOutdated", "", "isOutdated$appStart_release", "markVersion", "onAlertDialogAction", "requestId", "which", "Companion", "appStart_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.startup.m */
/* compiled from: VersionCheck.kt */
public final class C6199m implements C7536a {

    /* renamed from: U */
    private final C3517b f14214U;

    /* renamed from: V */
    private final Context f14215V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final BuildInfo f14216W;

    /* renamed from: X */
    private final C6234e f14217X;

    /* renamed from: Y */
    private final SharedPreferences f14218Y;

    /* renamed from: c */
    private final int f14219c = this.f14218Y.getInt("devVersionCode", -1);

    /* renamed from: com.bamtechmedia.dominguez.main.startup.m$a */
    /* compiled from: VersionCheck.kt */
    private static final class C6200a {
        private C6200a() {
        }

        public /* synthetic */ C6200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.m$b */
    /* compiled from: VersionCheck.kt */
    static final class C6201b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6199m f14220a;

        C6201b(C6199m mVar) {
            this.f14220a = mVar;
        }

        public final void run() {
            C6199m mVar = this.f14220a;
            mVar.m19671a(mVar.f14216W.mo12781d());
            C6199m mVar2 = this.f14220a;
            mVar2.m19674a(mVar2.f14216W.mo12778a().toString());
        }
    }

    static {
        new C6200a(null);
    }

    public C6199m(C3517b bVar, Context context, BuildInfo buildInfo, C6234e eVar, SharedPreferences sharedPreferences) {
        this.f14214U = bVar;
        this.f14215V = context;
        this.f14216W = buildInfo;
        this.f14217X = eVar;
        this.f14218Y = sharedPreferences;
    }

    /* renamed from: e */
    private final Completable m19675e() {
        String g = m19677g();
        if (g != null) {
            this.f14217X.mo18829a(new C6220a(g));
            Completable a = Completable.m38154a((Throwable) new C6186f(g));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.error(Illega…xception(recommendation))");
            return a;
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: f */
    private final Completable m19676f() {
        if (mo18800b()) {
            this.f14217X.mo18829a(C6228i.f14265a);
            StringBuilder sb = new StringBuilder();
            sb.append("Outdated version - ");
            sb.append(this.f14216W.mo12781d());
            sb.append(" lower than ");
            sb.append(this.f14214U.mo12726a());
            sb.append(' ');
            Completable a = Completable.m38154a((Throwable) new C6186f(sb.toString()));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.error(Illega…pStateException(message))");
            return a;
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: g */
    private final String m19677g() {
        return null;
    }

    /* renamed from: h */
    private final ActivityManager m19678h() {
        Object systemService = this.f14215V.getSystemService("activity");
        if (systemService != null) {
            return (ActivityManager) systemService;
        }
        throw new C13142s("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: b */
    public final boolean mo18800b() {
        return this.f14216W.mo12781d() < this.f14214U.mo12726a();
    }

    /* renamed from: c */
    public final Completable mo18801c() {
        Completable b = Completable.m38157a(m19675e(), m19676f()).mo30050b((C11945a) new C6201b(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.mergeArray(c….toString()\n            }");
        return b;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19674a(String str) {
        Editor edit = this.f14218Y.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putString("devEnvironment", str);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19671a(int i) {
        Editor edit = this.f14218Y.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putInt("devVersionCode", i);
        edit.apply();
    }

    /* renamed from: a */
    public final int mo18799a() {
        return this.f14219c;
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        boolean z = i == C5554a.clear_data_dialog && i2 == -1;
        if (z) {
            m19678h().clearApplicationUserData();
        }
        return z;
    }
}
