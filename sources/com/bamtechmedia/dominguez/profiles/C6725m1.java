package com.bamtechmedia.dominguez.profiles;

import com.bamtech.sdk4.service.BadRequestException;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p163g.p201e.p203b.p330z.C7949h;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0013J$\u0010\u001b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0002J\u0006\u0010\u001f\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u001eJ@\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020&R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "avatarsRepository", "Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;", "languageSwitcher", "Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "clearProfileDependentCollectionsCache", "", "clearProfiles", "downloadAvatarImages", "Lio/reactivex/Completable;", "profileAvatarList", "", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "fetchProfilesState", "loadAvatars", "Lio/reactivex/Single;", "profiles", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "refreshProfiles", "selectProfile", "profile", "update", "profileName", "", "kidsOnly", "", "isAutoPlay", "avatarId", "userSelected", "State", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.m1 */
/* compiled from: ProfilesViewModel.kt */
public final class C6725m1 extends C5741g<C6726a> {

    /* renamed from: a */
    private final C6667g1 f15090a;

    /* renamed from: b */
    private final C6675i f15091b;

    /* renamed from: c */
    private final C6090n f15092c;

    /* renamed from: d */
    private final C3419l f15093d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7547h f15094e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7614e f15095f;

    /* renamed from: g */
    private final C6657f f15096g;

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$a */
    /* compiled from: ProfilesViewModel.kt */
    public static final class C6726a {

        /* renamed from: a */
        private final Map<String, C6653e> f15097a;

        /* renamed from: b */
        private final List<C6626c0> f15098b;

        /* renamed from: c */
        private final List<C6653e> f15099c;

        /* renamed from: d */
        private final boolean f15100d;

        /* renamed from: e */
        private final boolean f15101e;

        /* renamed from: f */
        private final C7619i f15102f;

        public C6726a() {
            this(null, null, false, false, null, 31, null);
        }

        public C6726a(List<? extends C6626c0> list, List<? extends C6653e> list2, boolean z, boolean z2, C7619i iVar) {
            this.f15098b = list;
            this.f15099c = list2;
            this.f15100d = z;
            this.f15101e = z2;
            this.f15102f = iVar;
            List<C6653e> list3 = this.f15099c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) list3, 10)), 16));
            for (Object next : list3) {
                linkedHashMap.put(((C6653e) next).mo19333j(), next);
            }
            this.f15097a = linkedHashMap;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.profiles.c0>, for r4v0, types: [java.util.List] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.profiles.e>, for r5v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.profiles.C6725m1.C6726a m20798a(com.bamtechmedia.dominguez.profiles.C6725m1.C6726a r3, java.util.List<com.bamtechmedia.dominguez.profiles.C6626c0> r4, java.util.List<com.bamtechmedia.dominguez.profiles.C6653e> r5, boolean r6, boolean r7, p163g.p201e.p203b.p307o.C7619i r8, int r9, java.lang.Object r10) {
            /*
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                java.util.List<com.bamtechmedia.dominguez.profiles.c0> r4 = r3.f15098b
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                java.util.List<com.bamtechmedia.dominguez.profiles.e> r5 = r3.f15099c
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                boolean r6 = r3.f15100d
            L_0x0013:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                boolean r7 = r3.f15101e
            L_0x001a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                g.e.b.o.i r8 = r3.f15102f
            L_0x0021:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                com.bamtechmedia.dominguez.profiles.m1$a r3 = r5.mo19445a(r6, r7, r8, r9, r10)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6725m1.C6726a.m20798a(com.bamtechmedia.dominguez.profiles.m1$a, java.util.List, java.util.List, boolean, boolean, g.e.b.o.i, int, java.lang.Object):com.bamtechmedia.dominguez.profiles.m1$a");
        }

        /* renamed from: a */
        public final C6726a mo19445a(List<? extends C6626c0> list, List<? extends C6653e> list2, boolean z, boolean z2, C7619i iVar) {
            C6726a aVar = new C6726a(list, list2, z, z2, iVar);
            return aVar;
        }

        /* renamed from: a */
        public final Map<String, C6653e> mo19446a() {
            return this.f15097a;
        }

        /* renamed from: b */
        public final C7619i mo19447b() {
            return this.f15102f;
        }

        /* renamed from: c */
        public final boolean mo19448c() {
            return this.f15100d;
        }

        /* renamed from: d */
        public final List<C6626c0> mo19449d() {
            return this.f15098b;
        }

        /* renamed from: e */
        public final C6626c0 mo19450e() {
            Object obj;
            Iterator it = this.f15098b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C6626c0) obj).mo19353Q()) {
                    break;
                }
            }
            return (C6626c0) obj;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6726a) {
                    C6726a aVar = (C6726a) obj;
                    if (C12880j.m40224a((Object) this.f15098b, (Object) aVar.f15098b) && C12880j.m40224a((Object) this.f15099c, (Object) aVar.f15099c)) {
                        if (this.f15100d == aVar.f15100d) {
                            if (!(this.f15101e == aVar.f15101e) || !C12880j.m40224a((Object) this.f15102f, (Object) aVar.f15102f)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo19452f() {
            return this.f15102f != null;
        }

        public int hashCode() {
            List<C6626c0> list = this.f15098b;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C6653e> list2 = this.f15099c;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.f15100d;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f15101e;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            C7619i iVar = this.f15102f;
            if (iVar != null) {
                i = iVar.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(profiles=");
            sb.append(this.f15098b);
            sb.append(", avatarList=");
            sb.append(this.f15099c);
            sb.append(", loading=");
            sb.append(this.f15100d);
            sb.append(", isSelectingProfile=");
            sb.append(this.f15101e);
            sb.append(", error=");
            sb.append(this.f15102f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C6726a(List list, List list2, boolean z, boolean z2, C7619i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                list2 = C13185o.m40513a();
            }
            List list3 = list2;
            boolean z3 = false;
            boolean z4 = (i & 4) != 0 ? false : z;
            if ((i & 8) == 0) {
                z3 = z2;
            }
            if ((i & 16) != 0) {
                iVar = null;
            }
            this(list, list3, z4, z3, iVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$b */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6727b extends C12881k implements Function1<C6726a, C6726a> {

        /* renamed from: c */
        public static final C6727b f15103c = new C6727b();

        C6727b() {
            super(1);
        }

        /* renamed from: a */
        public final C6726a invoke(C6726a aVar) {
            return C6726a.m20798a(aVar, C13185o.m40513a(), null, false, false, null, 22, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$c */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6728c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6728c f15104c = new C6728c();

        C6728c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "error loading avatars", new Object[0]);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a@\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "kotlin.jvm.PlatformType", "profiles", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$d */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6729d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15105c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$d$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6730a<T, R> implements Function<T, R> {

            /* renamed from: c */
            final /* synthetic */ List f15106c;

            C6730a(List list) {
                this.f15106c = list;
            }

            /* renamed from: a */
            public final Pair<List<C6626c0>, List<C6653e>> apply(List<? extends C6653e> list) {
                return new Pair<>(this.f15106c, list);
            }
        }

        C6729d(C6725m1 m1Var) {
            this.f15105c = m1Var;
        }

        /* renamed from: a */
        public final Single<Pair<List<C6626c0>, List<C6653e>>> apply(List<? extends C6626c0> list) {
            return this.f15105c.m20793b(list).mo30233g(new C6730a(list));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$e */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6731e<T> implements C11952h<Pair<? extends List<? extends C6626c0>, ? extends List<? extends C6653e>>> {

        /* renamed from: c */
        public static final C6731e f15107c = new C6731e();

        C6731e() {
        }

        /* renamed from: a */
        public final boolean test(Pair<? extends List<? extends C6626c0>, ? extends List<? extends C6653e>> pair) {
            return (((Collection) pair.mo31015c()).isEmpty() ^ true) && (((Collection) pair.mo31016d()).isEmpty() ^ true);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$f */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6732f<T> implements Consumer<Pair<? extends List<? extends C6626c0>, ? extends List<? extends C6653e>>> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15108c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$f$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6733a extends C12881k implements Function1<C6726a, C6726a> {

            /* renamed from: c */
            final /* synthetic */ Pair f15109c;

            C6733a(Pair pair) {
                this.f15109c = pair;
                super(1);
            }

            /* renamed from: a */
            public final C6726a invoke(C6726a aVar) {
                return C6726a.m20798a(aVar, (List) this.f15109c.mo31015c(), (List) this.f15109c.mo31016d(), false, false, null, 8, null);
            }
        }

        C6732f(C6725m1 m1Var) {
            this.f15108c = m1Var;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends List<? extends C6626c0>, ? extends List<? extends C6653e>> pair) {
            this.f15108c.updateState(new C6733a(pair));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$g */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6734g<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15110c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$g$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6735a extends C12881k implements Function1<C6726a, C6726a> {

            /* renamed from: U */
            final /* synthetic */ Throwable f15111U;

            /* renamed from: c */
            final /* synthetic */ C6734g f15112c;

            C6735a(C6734g gVar, Throwable th) {
                this.f15112c = gVar;
                this.f15111U = th;
                super(1);
            }

            /* renamed from: a */
            public final C6726a invoke(C6726a aVar) {
                C7614e b = this.f15112c.f15110c.f15095f;
                Throwable th = this.f15111U;
                C12880j.m40222a((Object) th, "error");
                return C6726a.m20798a(aVar, null, null, false, false, b.mo20538b(th), 11, null);
            }
        }

        C6734g(C6725m1 m1Var) {
            this.f15110c = m1Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44530c(th, "error loading profiles", new Object[0]);
            this.f15110c.updateState(new C6735a(this, th));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$h */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6736h<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15113c;

        C6736h(C6725m1 m1Var) {
            this.f15113c = m1Var;
        }

        /* renamed from: a */
        public final Single<List<C6653e>> apply(List<? extends C6653e> list) {
            return this.f15113c.m20790a(list).mo30045a(list);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$i */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6737i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15114c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$i$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6738a extends C12881k implements Function1<C6726a, C6726a> {

            /* renamed from: c */
            final /* synthetic */ C7619i f15115c;

            C6738a(C7619i iVar) {
                this.f15115c = iVar;
                super(1);
            }

            /* renamed from: a */
            public final C6726a invoke(C6726a aVar) {
                return C6726a.m20798a(aVar, null, null, false, false, this.f15115c, 3, null);
            }
        }

        C6737i(C6725m1 m1Var) {
            this.f15114c = m1Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C7614e b = this.f15114c.f15095f;
            C12880j.m40222a((Object) th, "error");
            C7619i b2 = b.mo20538b(th);
            if (!(th instanceof BadRequestException)) {
                String d = b2.mo20546d();
                C7547h a = this.f15114c.f15094e;
                C7544a aVar = new C7544a();
                aVar.mo20480g(Integer.valueOf(C7949h.btn_dismiss));
                aVar.mo20475d(d);
                a.mo20491b(aVar.mo20465a());
            }
            this.f15114c.updateState(new C6738a(b2));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$j */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6739j implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6725m1 f15116a;

        C6739j(C6725m1 m1Var) {
            this.f15116a = m1Var;
        }

        public final void run() {
            this.f15116a.mo19443y();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$k */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6740k implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6725m1 f15117a;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$k$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6741a extends C12881k implements Function1<C6726a, C6726a> {

            /* renamed from: c */
            public static final C6741a f15118c = new C6741a();

            C6741a() {
                super(1);
            }

            /* renamed from: a */
            public final C6726a invoke(C6726a aVar) {
                return C6726a.m20798a(aVar, null, null, false, false, null, 3, null);
            }
        }

        C6740k(C6725m1 m1Var) {
            this.f15117a = m1Var;
        }

        public final void run() {
            this.f15117a.updateState(C6741a.f15118c);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.m1$l */
    /* compiled from: ProfilesViewModel.kt */
    static final class C6742l<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C6725m1 f15119c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.m1$l$a */
        /* compiled from: ProfilesViewModel.kt */
        static final class C6743a extends C12881k implements Function1<C6726a, C6726a> {

            /* renamed from: c */
            public static final C6743a f15120c = new C6743a();

            C6743a() {
                super(1);
            }

            /* renamed from: a */
            public final C6726a invoke(C6726a aVar) {
                return C6726a.m20798a(aVar, null, null, true, true, null, 3, null);
            }
        }

        C6742l(C6725m1 m1Var) {
            this.f15119c = m1Var;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f15119c.updateState(C6743a.f15120c);
        }
    }

    public C6725m1(C6667g1 g1Var, C6675i iVar, C6090n nVar, C3419l lVar, C7547h hVar, C7614e eVar, C6657f fVar) {
        super(null, 1, null);
        this.f15090a = g1Var;
        this.f15091b = iVar;
        this.f15092c = nVar;
        this.f15093d = lVar;
        this.f15094e = hVar;
        this.f15095f = eVar;
        this.f15096g = fVar;
        C6726a aVar = new C6726a(null, null, true, false, null, 27, null);
        createState(aVar);
        mo19441A();
    }

    /* renamed from: A */
    public final void mo19441A() {
        Flowable a = this.f15090a.mo19378a(true).mo30094d(new C6729d(this)).mo30069a((C11952h<? super T>) C6731e.f15107c);
        C12880j.m40222a((Object) a, "profilesRepository.profi…air.second.isNotEmpty() }");
        Object a2 = a.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a2).mo29927a(new C6732f(this), new C6734g(this));
    }

    /* renamed from: y */
    public final void mo19443y() {
        this.f15093d.mo12598d();
    }

    /* renamed from: z */
    public final void mo19444z() {
        updateState(C6727b.f15103c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Single<? extends List<C6653e>> m20793b(List<? extends C6626c0> list) {
        C6675i iVar = this.f15091b;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C6626c0 j : list) {
            arrayList.add(j.mo19364j());
        }
        Single<? extends List<C6653e>> a = iVar.mo19405a((List<String>) arrayList).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6736h<Object,Object>(this));
        C12880j.m40222a((Object) a, "avatarsRepository\n      …it).toSingleDefault(it) }");
        return a;
    }

    /* renamed from: a */
    public final Completable mo19442a(C6626c0 c0Var) {
        Completable c = this.f15090a.mo19375a(c0Var).mo30036a((Consumer<? super Throwable>) new C6737i<Object>(this)).mo30050b((C11945a) new C6739j(this)).mo30034a((CompletableSource) this.f15092c.mo18350a(c0Var.mo19352P().mo19792X())).mo30034a((CompletableSource) Completable.m38166c((C11945a) new C6740k(this))).mo30052c((Consumer<? super Disposable>) new C6742l<Object>(this));
        C12880j.m40222a((Object) c, "profilesRepository.setAc…= true, error = null) } }");
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Completable m20790a(List<? extends C6653e> list) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C6653e a : list) {
            arrayList.add(this.f15096g.mo19348a(a));
        }
        Completable f = Completable.m38167c((Iterable<? extends CompletableSource>) arrayList).mo30036a((Consumer<? super Throwable>) C6728c.f15104c).mo30055f();
        C12880j.m40222a((Object) f, "Completable.mergeDelayEr…       .onErrorComplete()");
        return f;
    }
}
