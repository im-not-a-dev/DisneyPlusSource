package com.bamtechmedia.dominguez.profiles.p258db;

import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c.C2794a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/db/ProfilesLogoutAction;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "profilesDatabase", "Lcom/bamtechmedia/dominguez/profiles/db/ProfilesDatabase;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/profiles/db/ProfilesDatabase;Lio/reactivex/Scheduler;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "onLogout", "Lio/reactivex/Completable;", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.db.e */
/* compiled from: ProfilesLogoutAction.kt */
public final class C6649e implements C2793c {

    /* renamed from: a */
    private final String f14983a = "profiles";

    /* renamed from: b */
    private final ProfilesDatabase f14984b;

    /* renamed from: c */
    private final C11969r f14985c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.e$a */
    /* compiled from: ProfilesLogoutAction.kt */
    static final class C6650a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6650a f14986c = new C6650a();

        C6650a() {
        }

        /* renamed from: a */
        public final void mo19329a(ProfilesDatabase profilesDatabase) {
            profilesDatabase.clearAllTables();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo19329a((ProfilesDatabase) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.e$b */
    /* compiled from: ProfilesLogoutAction.kt */
    static final class C6651b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6651b f14987c = new C6651b();

        C6651b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "ProfilesLogoutAction failed", new Object[0]);
        }
    }

    public C6649e(ProfilesDatabase profilesDatabase, C11969r rVar) {
        this.f14984b = profilesDatabase;
        this.f14985c = rVar;
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable e = Single.m38399b(this.f14984b).mo30220b(this.f14985c).mo30233g(C6650a.f14986c).mo30218b((Consumer<? super Throwable>) C6651b.f14987c).mo30228e();
        C14100a.m44522a("Profiles Database cleared", new Object[0]);
        C12880j.m40222a((Object) e, "Single.just(profilesData…iles Database cleared\") }");
        return e;
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f14983a;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        return C2794a.m10466a(this);
    }
}
