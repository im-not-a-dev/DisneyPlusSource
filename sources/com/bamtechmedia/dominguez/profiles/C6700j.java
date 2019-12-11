package com.bamtechmedia.dominguez.profiles;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.C3593a;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.C11978b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\n2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00122\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J$\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0016J0\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarsRepositoryImpl;", "Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;", "dao", "Lcom/bamtechmedia/dominguez/profiles/db/AvatarsDao;", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/profiles/db/AvatarsDao;Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lio/reactivex/Scheduler;)V", "add", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/Avatar;", "Lcom/bamtechmedia/dominguez/profiles/RemoteAvatar;", "avatar", "alreadyInCache", "", "localAvatars", "", "Lcom/bamtechmedia/dominguez/profiles/AvatarImpl;", "id", "", "createAvatarImpl", "photo", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "fetchAvatars", "avatarIds", "filterMissingAvatars", "filterOutUnassignedAvatars", "getAvatarById", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "avatarId", "getAvatarsByAvatarIds", "getMissingAvatarsOnce", "storeAvatars", "Lio/reactivex/Completable;", "avatars", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.j */
/* compiled from: AvatarsRepositoryImpl.kt */
public final class C6700j implements C6675i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6632a f15049a;

    /* renamed from: b */
    private final C3724a f15050b;

    /* renamed from: c */
    private final C11969r f15051c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$a */
    /* compiled from: AvatarsRepositoryImpl.kt */
    public static final class C6701a {
        private C6701a() {
        }

        public /* synthetic */ C6701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$b */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6702b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6702b f15052c = new C6702b();

        C6702b() {
        }

        /* renamed from: a */
        public final List<ProfileAvatar> apply(GraphQlResponse<AvatarByAvatarIdResponse> graphQlResponse) {
            AvatarByAvatarIdResponse avatarByAvatarIdResponse = (AvatarByAvatarIdResponse) graphQlResponse.getData();
            if (avatarByAvatarIdResponse != null) {
                AvatarResponse a = avatarByAvatarIdResponse.mo19251a();
                if (a != null) {
                    List<ProfileAvatar> a2 = a.mo19258a();
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return C13185o.m40513a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$c */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6703c<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6700j f15053c;

        C6703c(C6700j jVar) {
            this.f15053c = jVar;
        }

        /* renamed from: a */
        public final List<C6669h> apply(List<ProfileAvatar> list) {
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (ProfileAvatar profileAvatar : list) {
                arrayList.add(this.f15053c.m20741a((C3593a) profileAvatar, profileAvatar.mo12845a(C3688j.CHARACTER, C3623a.f9125b0.mo13254f())));
            }
            return arrayList;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$d */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6704d<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: c */
        public static final C6704d f15054c = new C6704d();

        C6704d() {
        }

        /* renamed from: a */
        public final List<C6669h> mo19425a(List<C6669h> list) {
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo19425a(list);
            return list;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$e */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6705e<T> implements C11952h<C6669h> {

        /* renamed from: c */
        final /* synthetic */ List f15055c;

        C6705e(List list) {
            this.f15055c = list;
        }

        /* renamed from: a */
        public final boolean test(C6669h hVar) {
            return this.f15055c.contains(hVar.mo19333j());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$f */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6706f<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6706f f15056c = new C6706f();

        C6706f() {
        }

        /* renamed from: a */
        public final C6669h apply(List<C6669h> list) {
            return (C6669h) C13199w.m40589f((List) list);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/profiles/AvatarImpl;", "kotlin.jvm.PlatformType", "localAvatars", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.j$g */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6707g<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ List f15057U;

        /* renamed from: c */
        final /* synthetic */ C6700j f15058c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.j$g$a */
        /* compiled from: AvatarsRepositoryImpl.kt */
        static final class C6708a<T, R> implements Function<T, SingleSource<? extends R>> {

            /* renamed from: c */
            final /* synthetic */ List f15059c;

            C6708a(List list) {
                this.f15059c = list;
            }

            /* renamed from: a */
            public final Single<List<C6669h>> apply(List<C6669h> list) {
                List list2 = this.f15059c;
                Intrinsics.checkReturnedValueIsNotNull((Object) list2, "localAvatars");
                return Single.m38399b(C13199w.m40583d((Collection) list, (Iterable) list2));
            }
        }

        C6707g(C6700j jVar, List list) {
            this.f15058c = jVar;
            this.f15057U = list;
        }

        /* renamed from: a */
        public final Single<List<C6669h>> apply(List<C6669h> list) {
            return this.f15058c.m20748b(this.f15057U, list).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6708a<Object,Object>(list));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$h */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6709h<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6700j f15060c;

        C6709h(C6700j jVar) {
            this.f15060c = jVar;
        }

        /* renamed from: a */
        public final Single<List<C6669h>> apply(List<C6669h> list) {
            return this.f15060c.m20750d(list).mo30045a(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$i */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6710i<T, R> implements Function<Throwable, List<? extends C6669h>> {

        /* renamed from: c */
        public static final C6710i f15061c = new C6710i();

        C6710i() {
        }

        /* renamed from: a */
        public final List<C6669h> apply(Throwable th) {
            return C13185o.m40513a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$j */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final class C6711j<V> implements Callable<Object> {

        /* renamed from: U */
        final /* synthetic */ List f15062U;

        /* renamed from: c */
        final /* synthetic */ C6700j f15063c;

        C6711j(C6700j jVar, List list) {
            this.f15063c = jVar;
            this.f15062U = list;
        }

        public final void call() {
            this.f15063c.f15049a.mo19306b(this.f15062U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$k */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final /* synthetic */ class C6712k extends C12879i implements Function0<C13145v> {
        C6712k(C11978b bVar) {
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

    /* renamed from: com.bamtechmedia.dominguez.profiles.j$l */
    /* compiled from: AvatarsRepositoryImpl.kt */
    static final /* synthetic */ class C6713l extends C12879i implements Function1<Throwable, C13145v> {
        C6713l(C11978b bVar) {
            super(1, bVar);
        }

        /* renamed from: a */
        public final void mo19433a(Throwable th) {
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
            mo19433a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6701a(null);
    }

    public C6700j(C6632a aVar, C3724a aVar2, C11969r rVar) {
        this.f15049a = aVar;
        this.f15050b = aVar2;
        this.f15051c = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Single<List<C6669h>> m20748b(List<String> list, List<C6669h> list2) {
        Single<List<C6669h>> i = m20747b(m20745a(list, list2)).mo30237i(C6710i.f15061c);
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "fetchAvatars(filterMissi…rorReturn { emptyList() }");
        return i;
    }

    /* renamed from: c */
    private final Single<List<C6669h>> m20749c(List<String> list) {
        Single<List<C6669h>> k = this.f15049a.mo19303a().mo30231f(C6704d.f15054c).mo30150a((C11952h<? super T>) new C6705e<Object>(list)).mo30201k();
        Intrinsics.checkReturnedValueIsNotNull((Object) k, "dao.avatarsOnce()\n      …) }\n            .toList()");
        return k;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final Completable m20750d(List<C6669h> list) {
        C11978b j = C11978b.m38573j();
        Intrinsics.checkReturnedValueIsNotNull((Object) j, "CompletableSubject.create()");
        Completable c = Completable.m38168c((Callable<?>) new C6711j<Object>(this, list));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.fromCallable { dao.store(avatars) }");
        C5826e0.m18822a(c, new C6712k(j), new C6713l(j));
        return j;
    }

    /* renamed from: b */
    private final Single<List<C6669h>> m20747b(List<String> list) {
        Single<List<C6669h>> g = this.f15050b.mo13577a(AvatarByAvatarIdResponse.class, "core/AvatarByAvatarId", C13170i0.m40332a(C12907r.m40244a("avatarId", list)), null).mo30233g(C6702b.f15052c).mo30233g(new C6703c(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi\n            .t…          }\n            }");
        return g;
    }

    /* renamed from: a */
    public Single<C6653e> mo19404a(String str) {
        Single<C6653e> g = m20747b(C13183n.m40498a(str)).mo30233g(C6706f.f15056c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "fetchAvatars(listOf(avatarId)).map { it.first() }");
        return g;
    }

    /* renamed from: a */
    public Single<? extends List<C6653e>> mo19405a(List<String> list) {
        Single<? extends List<C6653e>> b = m20749c(list).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6707g<Object,Object>(this, list)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6709h<Object,Object>(this)).mo30220b(this.f15051c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "filterOutUnassignedAvata….subscribeOn(ioScheduler)");
        return b;
    }

    /* renamed from: a */
    public Single<C3593a> mo19403a(C3593a aVar) {
        Single<C3593a> a = this.f15049a.mo19302a(m20741a(aVar, aVar.mo12845a(C3688j.CHARACTER, C3623a.f9125b0.mo13254f()))).mo30045a(aVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "dao.add(createAvatarImpl…).toSingleDefault(avatar)");
        return a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r8 != null) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtechmedia.dominguez.profiles.C6669h m20741a(com.bamtechmedia.dominguez.core.content.C3593a r8, com.bamtechmedia.dominguez.core.content.assets.Image r9) {
        /*
            r7 = this;
            com.bamtechmedia.dominguez.profiles.h r6 = new com.bamtechmedia.dominguez.profiles.h
            java.lang.String r1 = r8.mo12824j()
            java.lang.String r2 = r8.getTitle()
            r8 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r0 = r9.mo13085U()
            r4 = r0
            goto L_0x0014
        L_0x0013:
            r4 = r8
        L_0x0014:
            if (r9 == 0) goto L_0x001a
            java.lang.Integer r8 = r9.mo13090a0()
        L_0x001a:
            r5 = r8
            if (r9 == 0) goto L_0x0024
            java.lang.String r8 = r9.getUrl()
            if (r8 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            java.lang.String r8 = ""
        L_0x0026:
            r3 = r8
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6700j.m20741a(com.bamtechmedia.dominguez.core.content.a, com.bamtechmedia.dominguez.core.content.assets.Image):com.bamtechmedia.dominguez.profiles.h");
    }

    /* renamed from: a */
    private final List<String> m20745a(List<String> list, List<C6669h> list2) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!m20746a(list2, (String) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m20746a(List<C6669h> list, String str) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C6669h j : list) {
            arrayList.add(j.mo19333j());
        }
        return arrayList.contains(str);
    }
}
