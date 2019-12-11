package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import com.bamtechmedia.dominguez.profiles.p258db.C6639c;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.C11978b;
import p520io.reactivex.subjects.C11981d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0013H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0016J\u001e\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00110 0\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0\u0010H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0011H\u0016J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010'\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesRepositoryImpl;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "dao", "Lcom/bamtechmedia/dominguez/profiles/db/ProfilesDao;", "avatarDao", "Lcom/bamtechmedia/dominguez/profiles/db/AvatarsDao;", "remoteProfiles", "Lcom/bamtechmedia/dominguez/profiles/RemoteProfiles;", "brazeAnalytics", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "profilesConfig", "Lcom/bamtechmedia/dominguez/profiles/ProfilesConfig;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/profiles/db/ProfilesDao;Lcom/bamtechmedia/dominguez/profiles/db/AvatarsDao;Lcom/bamtechmedia/dominguez/profiles/RemoteProfiles;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;Lcom/bamtechmedia/dominguez/profiles/ProfilesConfig;Lio/reactivex/Scheduler;)V", "activeProfileOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "activeProfileStream", "Lio/reactivex/Flowable;", "create", "profileName", "", "attributes", "Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "avatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "delete", "Lio/reactivex/Completable;", "profileId", "latestActiveProfileOnce", "profilesStream", "", "requestRefresh", "", "refresh", "remoteProfilesOnce", "Lcom/bamtechmedia/dominguez/profiles/ProfileImpl;", "setActive", "profile", "update", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.i1 */
/* compiled from: ProfilesRepositoryImpl.kt */
public final class C6677i1 implements C6667g1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6639c f15031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6632a f15032b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6746n1 f15033c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2436p f15034d;

    /* renamed from: e */
    private final C6745n0 f15035e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11969r f15036f;

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$a */
    /* compiled from: ProfilesRepositoryImpl.kt */
    public static final class C6678a {
        private C6678a() {
        }

        public /* synthetic */ C6678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$b */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6679b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15037c;

        C6679b(C6677i1 i1Var) {
            this.f15037c = i1Var;
        }

        /* renamed from: a */
        public final Single<C6659f0> apply(C6659f0 f0Var) {
            return this.f15037c.f15031a.mo19312a(f0Var).mo30045a(f0Var);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$c */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6680c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C6653e f15038U;

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15039c;

        C6680c(C6677i1 i1Var, C6653e eVar) {
            this.f15039c = i1Var;
            this.f15038U = eVar;
        }

        /* renamed from: a */
        public final Single<C6659f0> apply(C6659f0 f0Var) {
            C6653e eVar = this.f15038U;
            if (eVar != null) {
                return this.f15039c.f15032b.mo19302a((C6669h) eVar).mo30045a(f0Var);
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.profiles.AvatarImpl");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$d */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6681d extends C12879i implements Function1<C6626c0, C13145v> {
        C6681d(C11981d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo19408a(C6626c0 c0Var) {
            ((C11981d) this.receiver).onSuccess(c0Var);
        }

        public final String getName() {
            return "onSuccess";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11981d.class);
        }

        public final String getSignature() {
            return "onSuccess(Ljava/lang/Object;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19408a((C6626c0) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$e */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6682e extends C12879i implements Function1<Throwable, C13145v> {
        C6682e(C11981d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo19409a(Throwable th) {
            ((C11981d) this.receiver).onError(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11981d.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19409a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$f */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6683f<T> implements Consumer<List<? extends C6659f0>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15040c;

        C6683f(C6677i1 i1Var) {
            this.f15040c = i1Var;
        }

        /* renamed from: a */
        public final void accept(List<C6659f0> list) {
            C6639c c = this.f15040c.f15031a;
            C12880j.m40222a((Object) list, "it");
            c.mo19317b(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$g */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6684g extends C12879i implements Function0<C13145v> {
        C6684g(C11978b bVar) {
            super(0, bVar);
        }

        public final String getName() {
            return "onComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onComplete()V";
        }

        public final void invoke() {
            ((C11978b) this.receiver).onComplete();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$h */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6685h extends C12879i implements Function1<Throwable, C13145v> {
        C6685h(C11978b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo19411a(Throwable th) {
            ((C11978b) this.receiver).onError(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19411a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$i */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6686i<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15041c;

        C6686i(C6677i1 i1Var) {
            this.f15041c = i1Var;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C6626c0 c0Var) {
            return this.f15041c.f15033c.mo19473a(c0Var).mo30203a(5, TimeUnit.SECONDS, this.f15041c.f15036f);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$j */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6687j<T, R> implements Function<Throwable, SingleSource<? extends C6626c0>> {

        /* renamed from: c */
        final /* synthetic */ Single f15042c;

        C6687j(Single single) {
            this.f15042c = single;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(Throwable th) {
            return this.f15042c;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$k */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6688k extends C12879i implements Function1<List<? extends C6659f0>, C13145v> {
        C6688k(C6639c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo19414a(List<C6659f0> list) {
            ((C6639c) this.receiver).mo19317b(list);
        }

        public final String getName() {
            return "store";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C6639c.class);
        }

        public final String getSignature() {
            return "store(Ljava/util/List;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19414a((List) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$l */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6689l extends C12879i implements Function0<C13145v> {
        C6689l(C11978b bVar) {
            super(0, bVar);
        }

        public final String getName() {
            return "onComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onComplete()V";
        }

        public final void invoke() {
            ((C11978b) this.receiver).onComplete();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$m */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6690m extends C12879i implements Function1<Throwable, C13145v> {
        C6690m(C11978b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo19415a(Throwable th) {
            ((C11978b) this.receiver).onError(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19415a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$n */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6691n<T> implements Consumer<List<? extends C6659f0>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15043c;

        C6691n(C6677i1 i1Var) {
            this.f15043c = i1Var;
        }

        /* renamed from: a */
        public final void accept(List<C6659f0> list) {
            C12880j.m40222a((Object) list, "profiles");
            for (C6659f0 f0Var : list) {
                if (f0Var.mo19357a()) {
                    this.f15043c.f15034d.mo11566a(f0Var.getProfileId(), C6666g0.m20662a(f0Var), f0Var.mo19354R());
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$o */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6692o implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6677i1 f15044a;

        /* renamed from: b */
        final /* synthetic */ C6626c0 f15045b;

        C6692o(C6677i1 i1Var, C6626c0 c0Var) {
            this.f15044a = i1Var;
            this.f15045b = c0Var;
        }

        public final void run() {
            this.f15044a.f15034d.mo11566a(this.f15045b.getProfileId(), C6666g0.m20662a(this.f15045b), this.f15045b.mo19354R());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$p */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6693p extends C12879i implements Function0<C13145v> {
        C6693p(C11978b bVar) {
            super(0, bVar);
        }

        public final String getName() {
            return "onComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onComplete()V";
        }

        public final void invoke() {
            ((C11978b) this.receiver).onComplete();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$q */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6694q extends C12879i implements Function1<Throwable, C13145v> {
        C6694q(C11978b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo19417a(Throwable th) {
            ((C11978b) this.receiver).onError(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19417a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$r */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6695r<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15046c;

        C6695r(C6677i1 i1Var) {
            this.f15046c = i1Var;
        }

        /* renamed from: a */
        public final Single<List<C6659f0>> apply(C6626c0 c0Var) {
            return this.f15046c.m20712e();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$s */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6696s<T> implements Consumer<List<? extends C6659f0>> {

        /* renamed from: c */
        final /* synthetic */ C6677i1 f15047c;

        C6696s(C6677i1 i1Var) {
            this.f15047c = i1Var;
        }

        /* renamed from: a */
        public final void accept(List<C6659f0> list) {
            C6639c c = this.f15047c.f15031a;
            C12880j.m40222a((Object) list, "it");
            c.mo19317b(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$t */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final class C6697t<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6626c0 f15048c;

        C6697t(C6626c0 c0Var) {
            this.f15048c = c0Var;
        }

        /* renamed from: a */
        public final C6659f0 apply(List<C6659f0> list) {
            for (C6659f0 f0Var : list) {
                if (C12880j.m40224a((Object) f0Var.getProfileId(), (Object) this.f15048c.getProfileId())) {
                    return f0Var;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$u */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6698u extends C12879i implements Function1<C6626c0, C13145v> {
        C6698u(C11981d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo19421a(C6626c0 c0Var) {
            ((C11981d) this.receiver).onSuccess(c0Var);
        }

        public final String getName() {
            return "onSuccess";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11981d.class);
        }

        public final String getSignature() {
            return "onSuccess(Ljava/lang/Object;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19421a((C6626c0) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.i1$v */
    /* compiled from: ProfilesRepositoryImpl.kt */
    static final /* synthetic */ class C6699v extends C12879i implements Function1<Throwable, C13145v> {
        C6699v(C11981d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo19422a(Throwable th) {
            ((C11981d) this.receiver).onError(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11981d.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19422a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6678a(null);
    }

    public C6677i1(C6639c cVar, C6632a aVar, C6746n1 n1Var, C2436p pVar, C6745n0 n0Var, C11969r rVar) {
        this.f15031a = cVar;
        this.f15032b = aVar;
        this.f15033c = n1Var;
        this.f15034d = pVar;
        this.f15035e = n0Var;
        this.f15036f = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final Single<List<C6659f0>> m20712e() {
        Single<List<C6659f0>> d = this.f15033c.mo19472a().mo30227d((Consumer<? super T>) new C6691n<Object>(this));
        C12880j.m40222a((Object) d, "remoteProfiles.profilesO…)\n            }\n        }");
        return d;
    }

    /* renamed from: a */
    public Flowable<? extends List<C6626c0>> mo19378a(boolean z) {
        Flowable<? extends List<C6626c0>> b = this.f15031a.mo19319d().mo30086b(this.f15036f);
        if (z) {
            mo19383d();
        }
        C12880j.m40222a((Object) b, "dao.profilesStream()\n   …estRefresh) { refresh() }");
        return b;
    }

    /* renamed from: b */
    public Single<? extends C6626c0> mo19381b() {
        Single<? extends C6626c0> b = this.f15031a.mo19314a().mo30220b(this.f15036f);
        C12880j.m40222a((Object) b, "dao.activeProfileOnce()\n….subscribeOn(ioScheduler)");
        return b;
    }

    /* renamed from: c */
    public Single<? extends C6626c0> mo19382c() {
        Single b = mo19381b();
        Single<? extends C6626c0> h = b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6686i<Object,Object>(this)).mo30235h(new C6687j(b));
        C12880j.m40222a((Object) h, "localActiveProfile\n     …xt { localActiveProfile }");
        return h;
    }

    /* renamed from: d */
    public Completable mo19383d() {
        C11978b j = C11978b.m38573j();
        C12880j.m40222a((Object) j, "CompletableSubject.create()");
        Completable e = m20712e().mo30227d((Consumer<? super T>) new C6715j1<Object>(new C6688k(this.f15031a))).mo30228e();
        C12880j.m40222a((Object) e, "remoteProfilesOnce()\n   …         .ignoreElement()");
        C5826e0.m18822a(e, new C6689l(j), new C6690m(j));
        return j;
    }

    /* renamed from: a */
    public Flowable<? extends C6626c0> mo19377a() {
        Flowable<? extends C6626c0> b = this.f15031a.mo19316b().mo30086b(this.f15036f);
        C12880j.m40222a((Object) b, "dao.activeProfileStream(….subscribeOn(ioScheduler)");
        return b;
    }

    /* renamed from: a */
    public Completable mo19375a(C6626c0 c0Var) {
        Long a = this.f15035e.mo19470a();
        if (!c0Var.mo19353Q() && a != null) {
            C3724a.f9310a.mo13579a(Long.valueOf(System.currentTimeMillis() + a.longValue()));
        }
        C11978b j = C11978b.m38573j();
        C12880j.m40222a((Object) j, "CompletableSubject.create()");
        Completable b = this.f15033c.mo19476b(c0Var).mo30034a((CompletableSource) this.f15031a.mo19313a(c0Var.getProfileId())).mo30050b((C11945a) new C6692o(this, c0Var));
        C12880j.m40222a((Object) b, "remoteProfiles.setActive…e.kidsOnly)\n            }");
        C5826e0.m18822a(b, new C6693p(j), new C6694q(j));
        return j;
    }

    /* renamed from: a */
    public Single<C6626c0> mo19380a(String str, C6654e0 e0Var, C6653e eVar) {
        C11981d k = C11981d.m38579k();
        C12880j.m40222a((Object) k, "SingleSubject.create<Profile>()");
        Single a = this.f15033c.mo19475a(str, e0Var).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6679b<Object,Object>(this)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6680c<Object,Object>(this, eVar));
        C12880j.m40222a((Object) a, "remoteProfiles.create(pr…oSingleDefault(profile) }");
        Completable i = Completable.m38170i();
        C12880j.m40222a((Object) i, "Completable.never()");
        Object a2 = a.mo30215a((C11974s<T, ? extends R>) C11793e.m37931a((CompletableSource) i));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(scope))");
        ((C11792d0) a2).mo29920a(new C6715j1(new C6681d(k)), new C6715j1(new C6682e(k)));
        return k;
    }

    /* renamed from: a */
    public Single<C6626c0> mo19379a(C6626c0 c0Var, String str, C6654e0 e0Var) {
        C11981d k = C11981d.m38579k();
        C12880j.m40222a((Object) k, "SingleSubject.create<Profile>()");
        Single g = this.f15033c.mo19474a(c0Var, str, e0Var).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6695r<Object,Object>(this)).mo30227d((Consumer<? super T>) new C6696s<Object>(this)).mo30233g(new C6697t(c0Var));
        C12880j.m40222a((Object) g, "remoteProfiles.update(pr… == profile.profileId } }");
        Completable i = Completable.m38170i();
        C12880j.m40222a((Object) i, "Completable.never()");
        Object a = g.mo30215a((C11974s<T, ? extends R>) C11793e.m37931a((CompletableSource) i));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(scope))");
        ((C11792d0) a).mo29920a(new C6715j1(new C6698u(k)), new C6715j1(new C6699v(k)));
        return k;
    }

    /* renamed from: a */
    public Completable mo19376a(String str) {
        C11978b j = C11978b.m38573j();
        C12880j.m40222a((Object) j, "CompletableSubject.create()");
        Completable e = this.f15033c.mo19471a(str).mo30044a((SingleSource<T>) m20712e()).mo30227d((Consumer<? super T>) new C6683f<Object>(this)).mo30228e();
        C12880j.m40222a((Object) e, "remoteProfiles.delete(pr…         .ignoreElement()");
        C5826e0.m18822a(e, new C6684g(j), new C6685h(j));
        return j;
    }
}
