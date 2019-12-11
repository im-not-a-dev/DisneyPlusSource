package com.bamtechmedia.dominguez.detail.common.p230g0;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.p088i.p089n.C3844a;
import com.bamtechmedia.dominguez.core.p088i.p089n.C3844a.C3845a;
import com.bamtechmedia.dominguez.detail.common.C5908c;
import com.google.common.base.Optional;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b(\u0010%R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0013\u0010#\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "castConnection", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/detail/common/CastConnection;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/google/common/base/Optional;)V", "backgroundBlurMinSdk", "", "getBackgroundBlurMinSdk", "()I", "backgroundBlurRadius", "getBackgroundBlurRadius", "continueWatchingTimeoutSeconds", "", "getContinueWatchingTimeoutSeconds", "()J", "defaultMoviesTabs", "", "", "defaultSeriesTabs", "formatAvailabilityEnabled", "", "getFormatAvailabilityEnabled", "()Z", "movieTabs", "getMovieTabs", "()Ljava/util/List;", "restartFromBeginningEnabled", "getRestartFromBeginningEnabled", "seriesTabs", "getSeriesTabs", "useNative4kDetectionEnabled", "getUseNative4kDetectionEnabled", "userDataRefreshIntervalSeconds", "getUserDataRefreshIntervalSeconds", "()Ljava/lang/Long;", "userDataRefreshIntervalSecondsDuringCast", "getUserDataRefreshIntervalSecondsDuringCast", "userDataRefreshIntervalSeconds$contentDetail_release", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.c */
/* compiled from: ContentDetailConfig.kt */
public final class C5948c implements C3844a {

    /* renamed from: a */
    private final List<String> f13755a;

    /* renamed from: b */
    private final List<String> f13756b;

    /* renamed from: c */
    private final C3524e f13757c;

    /* renamed from: d */
    private final Optional<C5908c> f13758d;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.c$a */
    /* compiled from: ContentDetailConfig.kt */
    public static final class C5949a {
        private C5949a() {
        }

        public /* synthetic */ C5949a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5949a(null);
    }

    public C5948c(C3524e eVar, Optional<C5908c> optional) {
        this.f13757c = eVar;
        this.f13758d = optional;
        String str = "details";
        String str2 = "extras";
        String str3 = "related";
        this.f13755a = C13185o.m40520c(str3, str2, str);
        this.f13756b = C13185o.m40520c("episodes", str3, str2, str);
    }

    /* renamed from: l */
    private final Long m19079l() {
        Long a = this.f13757c.mo12716a("contentDetail", "userDataRefreshIntervalSecondsDuringCast");
        return Long.valueOf(a != null ? a.longValue() : 300);
    }

    /* renamed from: a */
    public boolean mo13753a() {
        return C3845a.m12922a(this);
    }

    /* renamed from: b */
    public int mo13754b() {
        Integer c = this.f13757c.mo12719c("contentDetail", "backgroundBlurMinSdk");
        if (c != null) {
            return c.intValue();
        }
        return 23;
    }

    /* renamed from: c */
    public int mo13755c() {
        Integer c = this.f13757c.mo12719c("contentDetail", "backgroundBlurRadius");
        if (c != null) {
            return c.intValue();
        }
        return 300;
    }

    /* renamed from: d */
    public final long mo17875d() {
        Long a = this.f13757c.mo12716a("contentDetail", "continueWatchingTimeoutSeconds");
        if (a != null) {
            return a.longValue();
        }
        return 5;
    }

    /* renamed from: e */
    public final boolean mo17876e() {
        Boolean bool = (Boolean) this.f13757c.mo12720d("contentDetail", "formatAvailabilityEnabled");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: f */
    public final List<String> mo17877f() {
        List<String> list = (List) this.f13757c.mo12720d("contentDetail", "movieTabs");
        return list != null ? list : this.f13755a;
    }

    /* renamed from: g */
    public final boolean mo17878g() {
        Boolean bool = (Boolean) this.f13757c.mo12720d("contentDetail", "restartFromBeginningEnabled");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: h */
    public final List<String> mo17879h() {
        List<String> list = (List) this.f13757c.mo12720d("contentDetail", "seriesTabs");
        return list != null ? list : this.f13756b;
    }

    /* renamed from: i */
    public final boolean mo17880i() {
        Boolean bool = (Boolean) this.f13757c.mo12720d("contentDetail", "useNative4kDetectionEnabled");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: j */
    public final Long mo17881j() {
        return this.f13757c.mo12716a("contentDetail", "userDataRefreshIntervalSeconds");
    }

    /* renamed from: k */
    public final Long mo17882k() {
        C5908c cVar = (C5908c) this.f13758d.mo27107c();
        if (cVar == null || !cVar.mo17813a()) {
            return mo17881j();
        }
        return m19079l();
    }
}
