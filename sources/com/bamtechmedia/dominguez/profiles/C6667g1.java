package com.bamtechmedia.dominguez.profiles;

import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006H&J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H&J \u0010\u0012\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u000fH&J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004H&J,\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "", "activeProfileOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "activeProfileStream", "Lio/reactivex/Flowable;", "create", "profileName", "", "attributes", "Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "avatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "delete", "Lio/reactivex/Completable;", "profileId", "latestActiveProfileOnce", "profilesStream", "", "requestRefresh", "", "refresh", "setActive", "profile", "update", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.g1 */
/* compiled from: ProfilesRepository.kt */
public interface C6667g1 {

    /* renamed from: com.bamtechmedia.dominguez.profiles.g1$a */
    /* compiled from: ProfilesRepository.kt */
    public static final class C6668a {
        /* renamed from: a */
        public static /* synthetic */ Flowable m20672a(C6667g1 g1Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return g1Var.mo19378a(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profilesStream");
        }
    }

    /* renamed from: a */
    Completable mo19375a(C6626c0 c0Var);

    /* renamed from: a */
    Completable mo19376a(String str);

    /* renamed from: a */
    Flowable<? extends C6626c0> mo19377a();

    /* renamed from: a */
    Flowable<? extends List<C6626c0>> mo19378a(boolean z);

    /* renamed from: a */
    Single<? extends C6626c0> mo19379a(C6626c0 c0Var, String str, C6654e0 e0Var);

    /* renamed from: a */
    Single<C6626c0> mo19380a(String str, C6654e0 e0Var, C6653e eVar);

    /* renamed from: b */
    Single<? extends C6626c0> mo19381b();

    /* renamed from: c */
    Single<? extends C6626c0> mo19382c();

    /* renamed from: d */
    Completable mo19383d();
}
