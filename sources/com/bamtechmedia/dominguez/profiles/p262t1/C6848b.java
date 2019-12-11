package com.bamtechmedia.dominguez.profiles.p262t1;

import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6667g1.C6668a;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalyticsContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "ioScheduler", "Lio/reactivex/Scheduler;", "userProfileModeTracker", "Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;)V", "createState", "Lio/reactivex/Single;", "", "", "hasMultipleProfiles", "profileList", "", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "numberOfProfilesSetUp", "userCurrentProfileMode", "it", "userCurrentProfileView", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.t1.b */
/* compiled from: ProfilesAnalyticsContributor.kt */
public final class C6848b implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6667g1 f15290a;

    /* renamed from: b */
    private final C11969r f15291b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6859b f15292c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.t1.b$a */
    /* compiled from: ProfilesAnalyticsContributor.kt */
    public static final class C6849a {
        private C6849a() {
        }

        public /* synthetic */ C6849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.t1.b$b */
    /* compiled from: ProfilesAnalyticsContributor.kt */
    static final class C6850b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6848b f15293c;

        C6850b(C6848b bVar) {
            this.f15293c = bVar;
        }

        /* renamed from: a */
        public final Map<String, String> apply(List<? extends C6626c0> list) {
            C6848b bVar = this.f15293c;
            C12880j.m40222a((Object) list, "profileList");
            return C13173j0.m40360b(C12907r.m40244a("userMultipleProfiles", bVar.m21005a(list)), C12907r.m40244a("userNumberofProfiles", this.f15293c.m21010b(list)));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "", "kotlin.jvm.PlatformType", "profilesMap", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.t1.b$c */
    /* compiled from: ProfilesAnalyticsContributor.kt */
    static final class C6851c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6848b f15294c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.t1.b$c$a */
        /* compiled from: ProfilesAnalyticsContributor.kt */
        static final class C6852a<T, R> implements Function<T, R> {

            /* renamed from: U */
            final /* synthetic */ Map f15295U;

            /* renamed from: c */
            final /* synthetic */ C6851c f15296c;

            C6852a(C6851c cVar, Map map) {
                this.f15296c = cVar;
                this.f15295U = map;
            }

            /* renamed from: a */
            public final Map<String, String> apply(C6626c0 c0Var) {
                Map map = this.f15295U;
                C12880j.m40222a((Object) map, "profilesMap");
                C6848b bVar = this.f15296c.f15294c;
                C12880j.m40222a((Object) c0Var, "it");
                Map a = C13173j0.m40354a(map, C12907r.m40244a("userCurrentProfileViewer", bVar.m21007b(c0Var)));
                String X = c0Var.getAttributes().mo19335P().mo19792X();
                String str = "";
                if (X == null) {
                    X = str;
                }
                Map a2 = C13173j0.m40354a(a, C12907r.m40244a("appLanguage", X));
                if (this.f15296c.f15294c.f15292c.mo19625a()) {
                    str = this.f15296c.f15294c.m21002a(c0Var);
                }
                return C13173j0.m40354a(a2, C12907r.m40244a("userProfileMode", str));
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.profiles.t1.b$c$b */
        /* compiled from: ProfilesAnalyticsContributor.kt */
        static final class C6853b<T, R> implements Function<Throwable, Map<String, ? extends String>> {

            /* renamed from: c */
            final /* synthetic */ Map f15297c;

            C6853b(Map map) {
                this.f15297c = map;
            }

            /* renamed from: a */
            public final Map<String, String> apply(Throwable th) {
                Map map = this.f15297c;
                C12880j.m40222a((Object) map, "profilesMap");
                return C13173j0.m40354a(map, C12907r.m40244a("userCurrentProfileViewer", ""));
            }
        }

        C6851c(C6848b bVar) {
            this.f15294c = bVar;
        }

        /* renamed from: a */
        public final Single<Map<String, String>> apply(Map<String, String> map) {
            return this.f15294c.f15290a.mo19377a().mo30087b().mo30233g(new C6852a(this, map)).mo30237i(new C6853b(map));
        }
    }

    static {
        new C6849a(null);
    }

    public C6848b(C6667g1 g1Var, C11969r rVar, C6859b bVar) {
        this.f15290a = g1Var;
        this.f15291b = rVar;
        this.f15292c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m21007b(C6626c0 c0Var) {
        return c0Var.isDefault() ? "primary" : "secondary";
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = C6668a.m20672a(this.f15290a, false, 1, null).mo30087b().mo30233g(new C6850b(this)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6851c<Object,Object>(this)).mo30220b(this.f15291b);
        C12880j.m40222a((Object) b, "profilesRepository.profi….subscribeOn(ioScheduler)");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m21010b(List<? extends C6626c0> list) {
        return String.valueOf(list.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m21002a(C6626c0 c0Var) {
        return c0Var.mo19354R() ? "Child Profile" : "Adult Profile";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m21005a(List<? extends C6626c0> list) {
        return list.size() > 1 ? "yes" : "no";
    }
}
