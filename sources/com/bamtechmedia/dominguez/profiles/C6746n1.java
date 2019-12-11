package com.bamtechmedia.dominguez.profiles;

import com.bamtech.sdk4.account.DefaultUserProfile;
import com.bamtech.sdk4.account.UserProfileApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11920c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002J\u0016\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020!0\f2\u0006\u0010\u001d\u001a\u00020!J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\fJ\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020!J$\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/RemoteProfiles;", "", "userProfileApi", "Lcom/bamtech/sdk4/account/UserProfileApi;", "(Lcom/bamtech/sdk4/account/UserProfileApi;)V", "asMap", "", "", "Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "getAsMap", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;)Ljava/util/Map;", "create", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/ProfileImpl;", "profileName", "attributes", "createProfileImpl", "userProfile", "Lcom/bamtech/sdk4/account/DefaultUserProfile;", "currentlySelected", "", "createProfileList", "", "allProfiles", "activeProfile", "delete", "Lio/reactivex/Completable;", "profileId", "determineActiveProfile", "profile", "generateLanguagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "get", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "profileAttributes", "profilesOnce", "setActive", "update", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.n1 */
/* compiled from: RemoteProfiles.kt */
public final class C6746n1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final UserProfileApi f15122a;

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$a */
    /* compiled from: RemoteProfiles.kt */
    static final class C6747a<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15123c;

        C6747a(C6746n1 n1Var) {
            this.f15123c = n1Var;
        }

        /* renamed from: a */
        public final C6659f0 apply(DefaultUserProfile defaultUserProfile) {
            return this.f15123c.m20825a(defaultUserProfile, false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$b */
    /* compiled from: RemoteProfiles.kt */
    static final class C6748b<T, R> implements Function<DefaultUserProfile, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15124c;

        C6748b(C6746n1 n1Var) {
            this.f15124c = n1Var;
        }

        /* renamed from: a */
        public final Completable apply(DefaultUserProfile defaultUserProfile) {
            return this.f15124c.f15122a.deleteUserProfile(defaultUserProfile);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$c */
    /* compiled from: RemoteProfiles.kt */
    static final class C6749c<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15125U;

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15126c;

        C6749c(C6746n1 n1Var, C6626c0 c0Var) {
            this.f15126c = n1Var;
            this.f15125U = c0Var;
        }

        /* renamed from: a */
        public final C6659f0 apply(DefaultUserProfile defaultUserProfile) {
            return this.f15126c.m20825a(defaultUserProfile, this.f15125U.mo19353Q());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$d */
    /* compiled from: RemoteProfiles.kt */
    static final class C6750d<T, R> implements Function<Throwable, DefaultUserProfile> {

        /* renamed from: c */
        public static final C6750d f15127c = new C6750d();

        C6750d() {
        }

        /* renamed from: a */
        public final DefaultUserProfile apply(Throwable th) {
            DefaultUserProfile defaultUserProfile = new DefaultUserProfile("", null, null, null, 14, null);
            return defaultUserProfile;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$e */
    /* compiled from: RemoteProfiles.kt */
    static final class C6751e<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15128c;

        C6751e(C6746n1 n1Var) {
            this.f15128c = n1Var;
        }

        /* renamed from: a */
        public final List<C6659f0> apply(Pair<? extends List<DefaultUserProfile>, DefaultUserProfile> pair) {
            C6746n1 n1Var = this.f15128c;
            List list = (List) pair.mo31015c();
            Object d = pair.mo31016d();
            Intrinsics.checkReturnedValueIsNotNull(d, "it.second");
            return n1Var.m20829a(list, (DefaultUserProfile) d);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$f */
    /* compiled from: RemoteProfiles.kt */
    static final class C6752f<T, R> implements Function<DefaultUserProfile, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15129c;

        C6752f(C6746n1 n1Var) {
            this.f15129c = n1Var;
        }

        /* renamed from: a */
        public final Completable apply(DefaultUserProfile defaultUserProfile) {
            return this.f15129c.f15122a.setActiveUserProfile(defaultUserProfile);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$g */
    /* compiled from: RemoteProfiles.kt */
    static final class C6753g<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ String f15130U;

        /* renamed from: V */
        final /* synthetic */ C6654e0 f15131V;

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15132c;

        C6753g(C6746n1 n1Var, String str, C6654e0 e0Var) {
            this.f15132c = n1Var;
            this.f15130U = str;
            this.f15131V = e0Var;
        }

        /* renamed from: a */
        public final DefaultUserProfile apply(DefaultUserProfile defaultUserProfile) {
            return DefaultUserProfile.copy$default(defaultUserProfile, null, this.f15130U, this.f15132c.m20830a(this.f15131V), null, 9, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$h */
    /* compiled from: RemoteProfiles.kt */
    static final class C6754h<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15133c;

        C6754h(C6746n1 n1Var) {
            this.f15133c = n1Var;
        }

        /* renamed from: a */
        public final Single<DefaultUserProfile> apply(DefaultUserProfile defaultUserProfile) {
            return this.f15133c.f15122a.updateUserProfile(defaultUserProfile);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.n1$i */
    /* compiled from: RemoteProfiles.kt */
    static final class C6755i<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15134U;

        /* renamed from: c */
        final /* synthetic */ C6746n1 f15135c;

        C6755i(C6746n1 n1Var, C6626c0 c0Var) {
            this.f15135c = n1Var;
            this.f15134U = c0Var;
        }

        /* renamed from: a */
        public final C6659f0 apply(DefaultUserProfile defaultUserProfile) {
            return this.f15135c.m20825a(defaultUserProfile, this.f15134U.mo19353Q());
        }
    }

    public C6746n1(UserProfileApi userProfileApi) {
        this.f15122a = userProfileApi;
    }

    /* renamed from: b */
    public final Completable mo19476b(C6626c0 c0Var) {
        Completable b = this.f15122a.getUserProfile(c0Var.getProfileId()).mo30217b((Function<? super T, ? extends CompletableSource>) new C6752f<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "userProfileApi.getUserPr…etActiveUserProfile(it) }");
        return b;
    }

    /* renamed from: a */
    public final Single<List<C6659f0>> mo19472a() {
        Single userProfiles = this.f15122a.getUserProfiles();
        Single i = this.f15122a.getActiveUserProfile().mo30237i(C6750d.f15127c);
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "userProfileApi.getActive… DefaultUserProfile(\"\") }");
        Single<List<C6659f0>> g = C11920c.m38475a(userProfiles, i).mo30233g(new C6751e(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "userProfileApi.getUserPr…st(it.first, it.second) }");
        return g;
    }

    /* renamed from: a */
    private final boolean m20832a(DefaultUserProfile defaultUserProfile, DefaultUserProfile defaultUserProfile2) {
        if (C6758o1.m20851b(defaultUserProfile2)) {
            return m20824a(defaultUserProfile).isDefault();
        }
        return Intrinsics.areEqual((Object) defaultUserProfile.getProfileId(), (Object) defaultUserProfile2.getProfileId());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6659f0 m20825a(DefaultUserProfile defaultUserProfile, boolean z) {
        String profileId = defaultUserProfile.getProfileId();
        String profileName = defaultUserProfile.getProfileName();
        if (profileName != null) {
            return new C6659f0(profileId, profileName, m20824a(defaultUserProfile), z);
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Single<com.bamtechmedia.dominguez.profiles.C6659f0> mo19475a(java.lang.String r3, com.bamtechmedia.dominguez.profiles.C6654e0 r4) {
        /*
            r2 = this;
            com.bamtech.sdk4.account.UserProfileApi r0 = r2.f15122a
            if (r4 == 0) goto L_0x000b
            java.util.Map r4 = r2.m20830a(r4)
            if (r4 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            java.util.Map r4 = kotlin.p590y.C13173j0.m40350a()
        L_0x000f:
            java.util.Map r1 = kotlin.p590y.C13173j0.m40350a()
            io.reactivex.Single r3 = r0.createUserProfile(r3, r4, r1)
            com.bamtechmedia.dominguez.profiles.n1$a r4 = new com.bamtechmedia.dominguez.profiles.n1$a
            r4.<init>(r2)
            io.reactivex.Single r3 = r3.mo30233g(r4)
            java.lang.String r4 = "userProfileApi.createUse…eProfileImpl(it, false) }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6746n1.mo19475a(java.lang.String, com.bamtechmedia.dominguez.profiles.e0):io.reactivex.Single");
    }

    /* renamed from: a */
    public final Single<C6626c0> mo19474a(C6626c0 c0Var, String str, C6654e0 e0Var) {
        Single<C6626c0> g = this.f15122a.getUserProfile(c0Var.getProfileId()).mo30233g(new C6753g(this, str, e0Var)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6754h<Object,Object>(this)).mo30233g(new C6755i(this, c0Var));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "userProfileApi.getUserPr…file.currentlySelected) }");
        return g;
    }

    /* renamed from: a */
    public final Single<? extends C6626c0> mo19473a(C6626c0 c0Var) {
        Single<? extends C6626c0> g = this.f15122a.getUserProfile(c0Var.getProfileId()).mo30233g(new C6749c(this, c0Var));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "userProfileApi.getUserPr…file.currentlySelected) }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, Object> m20830a(C6654e0 e0Var) {
        String str = "playbackSettings";
        String str2 = "avatar";
        String str3 = "languagePreferences";
        return C13173j0.m40356a(C12907r.m40244a("isDefault", Boolean.valueOf(e0Var.isDefault())), C12907r.m40244a("kidsModeEnabled", Boolean.valueOf(e0Var.mo19338Y())), C12907r.m40244a(str, C13173j0.m40356a(C12907r.m40244a("autoplay", Boolean.valueOf(e0Var.mo19337X())), C12907r.m40244a("backgroundVideo", Boolean.valueOf(e0Var.mo19334O())))), C12907r.m40244a(str2, C13173j0.m40356a(C12907r.m40244a("id", e0Var.mo19343j()), C12907r.m40244a("userSelected", Boolean.valueOf(e0Var.mo19336S())))), C12907r.m40244a(str3, C13173j0.m40356a(C12907r.m40244a("appLanguage", e0Var.mo19335P().mo19792X()), C12907r.m40244a("playbackLanguage", e0Var.mo19335P().mo19793Y()), C12907r.m40244a("preferAudioDescription", e0Var.mo19335P().mo19794Z()), C12907r.m40244a("preferSDH", e0Var.mo19335P().mo19796a0()), C12907r.m40244a("subtitleLanguage", e0Var.mo19335P().mo19797b0()), C12907r.m40244a("subtitlesEnabled", e0Var.mo19335P().mo19798c0()))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r4 != null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bamtechmedia.dominguez.profiles.C6654e0 m20824a(com.bamtech.sdk4.account.DefaultUserProfile r10) {
        /*
            r9 = this;
            java.util.Map r10 = r10.getAttributes()
            com.bamtechmedia.dominguez.profiles.e0 r8 = new com.bamtechmedia.dominguez.profiles.e0
            r0 = 0
            if (r10 == 0) goto L_0x001b
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "isDefault"
            java.lang.Object r1 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.booleanValue()
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r10 == 0) goto L_0x002f
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "kidsModeEnabled"
            java.lang.Object r1 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.booleanValue()
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            java.lang.String r2 = "avatar"
            if (r10 == 0) goto L_0x0043
            java.lang.String r4 = "id"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.Object r4 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r2, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            java.lang.String r4 = ""
        L_0x0045:
            if (r10 == 0) goto L_0x005b
            java.lang.String r5 = "userSelected"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.Object r2 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r2, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x005b
            boolean r0 = r2.booleanValue()
            r5 = r0
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            java.lang.String r0 = "playbackSettings"
            r2 = 1
            if (r10 == 0) goto L_0x0074
            java.lang.String r6 = "autoplay"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Object r6 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r0, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0074
            boolean r6 = r6.booleanValue()
            goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r10 == 0) goto L_0x008b
            java.lang.String r7 = "backgroundVideo"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.Object r0 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r0, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.booleanValue()
            r7 = r0
            goto L_0x008c
        L_0x008b:
            r7 = 1
        L_0x008c:
            com.bamtechmedia.dominguez.profiles.z r10 = r9.m20827a(r10)
            r0 = r8
            r2 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6746n1.m20824a(com.bamtech.sdk4.account.DefaultUserProfile):com.bamtechmedia.dominguez.profiles.e0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r6 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r8 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r10 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r3 != null) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bamtechmedia.dominguez.profiles.C7019z m20827a(java.util.Map<java.lang.String, ? extends java.lang.Object> r10) {
        /*
            r9 = this;
            com.bamtechmedia.dominguez.profiles.z r7 = new com.bamtechmedia.dominguez.profiles.z
            java.lang.String r0 = "en-GB"
            java.lang.String r1 = "languagePreferences"
            if (r10 == 0) goto L_0x0017
            java.lang.String r2 = "appLanguage"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.Object r2 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            if (r10 == 0) goto L_0x0029
            java.lang.String r3 = "playbackLanguage"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.Object r3 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r3 = r0
        L_0x002a:
            r4 = 0
            if (r10 == 0) goto L_0x003c
            java.lang.String r5 = "preferAudioDescription"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.Object r5 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
        L_0x0040:
            if (r10 == 0) goto L_0x0051
            java.lang.String r6 = "preferSDH"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Object r6 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
        L_0x0055:
            if (r10 == 0) goto L_0x0066
            java.lang.String r8 = "subtitleLanguage"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.Object r8 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r8 = r0
        L_0x0067:
            if (r10 == 0) goto L_0x0078
            java.lang.String r0 = "subtitlesEnabled"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Object r10 = com.bamtechmedia.dominguez.core.utils.C5859p.m18897a(r10, r1, r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
        L_0x007c:
            r0 = r7
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6746n1.m20827a(java.util.Map):com.bamtechmedia.dominguez.profiles.z");
    }

    /* renamed from: a */
    public final Completable mo19471a(String str) {
        Completable b = this.f15122a.getUserProfile(str).mo30217b((Function<? super T, ? extends CompletableSource>) new C6748b<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "userProfileApi.getUserPr…i.deleteUserProfile(it) }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C6659f0> m20829a(List<DefaultUserProfile> list, DefaultUserProfile defaultUserProfile) {
        ArrayList<DefaultUserProfile> arrayList = new ArrayList<>();
        for (Object next : list) {
            String profileName = ((DefaultUserProfile) next).getProfileName();
            if (!(profileName == null || C12832w.m40118a(profileName))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (DefaultUserProfile defaultUserProfile2 : arrayList) {
            arrayList2.add(m20825a(defaultUserProfile2, m20832a(defaultUserProfile2, defaultUserProfile)));
        }
        return arrayList2;
    }
}
