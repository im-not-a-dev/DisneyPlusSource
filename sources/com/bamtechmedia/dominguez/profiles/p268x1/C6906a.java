package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6673h1;
import com.bamtechmedia.dominguez.profiles.C6714j0;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6936o;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/CreateProfileLanguageSetupImpl;", "Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;", "deviceSettingsSelections", "Lcom/bamtechmedia/dominguez/profiles/api/settings/DeviceSettingsSelections;", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "mainThread", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/profiles/api/settings/DeviceSettingsSelections;Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lio/reactivex/Scheduler;)V", "createDefaultLanguagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "resolveInitialCaptionsLanguage", "", "resolveInitialPlaybackLanguage", "resolveInitialUiLanguage", "setValues", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "newProfile", "updatedLanguagePreferences", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.a */
/* compiled from: CreateProfileLanguageSetupImpl.kt */
public final class C6906a implements C6864d {

    /* renamed from: a */
    private final C6865a f15374a;

    /* renamed from: b */
    private final C6913e f15375b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6667g1 f15376c;

    /* renamed from: d */
    private final C11969r f15377d;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.a$a */
    /* compiled from: CreateProfileLanguageSetupImpl.kt */
    static final class C6907a<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15378U;

        /* renamed from: c */
        final /* synthetic */ C6906a f15379c;

        C6907a(C6906a aVar, C6626c0 c0Var) {
            this.f15379c = aVar;
            this.f15378U = c0Var;
        }

        public final C7019z call() {
            return this.f15379c.mo19634b(this.f15378U);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "it", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.a$b */
    /* compiled from: CreateProfileLanguageSetupImpl.kt */
    static final class C6908b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15380U;

        /* renamed from: c */
        final /* synthetic */ C6906a f15381c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.x1.a$b$a */
        /* compiled from: CreateProfileLanguageSetupImpl.kt */
        static final class C6909a extends C12881k implements Function1<C6714j0, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C7019z f15382c;

            C6909a(C7019z zVar) {
                this.f15382c = zVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo19671a(C6714j0 j0Var) {
                C7019z zVar = this.f15382c;
                C12880j.m40222a((Object) zVar, "it");
                j0Var.mo19435a(zVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo19671a((C6714j0) obj);
                return C13145v.f29587a;
            }
        }

        C6908b(C6906a aVar, C6626c0 c0Var) {
            this.f15381c = aVar;
            this.f15380U = c0Var;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C7019z zVar) {
            return C6673h1.m20691a(this.f15381c.f15376c, this.f15380U, new C6909a(zVar));
        }
    }

    public C6906a(C6865a aVar, C6913e eVar, C6667g1 g1Var, C11969r rVar) {
        this.f15374a = aVar;
        this.f15375b = eVar;
        this.f15376c = g1Var;
        this.f15377d = rVar;
    }

    /* renamed from: c */
    private final String m21115c() {
        for (String a : C6936o.m21182a(this.f15374a.mo19637c())) {
            String str = (String) C13199w.m40591g(C6913e.m21125a(this.f15375b, a, null, 2, null));
            if (str != null) {
                return str;
            }
        }
        return (String) C13199w.m40589f(this.f15375b.mo19672a());
    }

    /* renamed from: d */
    private final String m21116d() {
        for (String c : C6936o.m21182a(this.f15374a.mo19637c())) {
            String str = (String) C13199w.m40591g(C6913e.m21128c(this.f15375b, c, null, 2, null));
            if (str != null) {
                return str;
            }
        }
        return this.f15375b.mo19677c();
    }

    /* renamed from: b */
    public C7019z mo19634b(C6626c0 c0Var) {
        return C7019z.m21314a(c0Var.mo19352P(), m21116d(), m21115c(), null, null, m21114b(), Boolean.valueOf(this.f15374a.mo19636b()), 12, null);
    }

    /* renamed from: a */
    public Single<? extends C6626c0> mo19633a(C6626c0 c0Var) {
        Single<? extends C6626c0> a = Single.m38401c((Callable<? extends T>) new C6907a<Object>(this, c0Var)).mo30220b(this.f15377d).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6908b<Object,Object>(this, c0Var));
        C12880j.m40222a((Object) a, "Single.fromCallable { up…guagePreferences = it } }");
        return a;
    }

    /* renamed from: a */
    public C7019z mo19632a() {
        C7019z zVar = new C7019z(m21116d(), m21115c(), null, null, m21114b(), Boolean.valueOf(this.f15374a.mo19636b()), 12, null);
        return zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != null) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m21114b() {
        /*
            r5 = this;
            com.bamtechmedia.dominguez.profiles.u1.e.a r0 = r5.f15374a
            java.lang.String r0 = r0.mo19635a()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = kotlin.p590y.C13183n.m40498a(r0)
            java.util.List r0 = com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6936o.m21182a(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            java.util.List r0 = kotlin.p590y.C13185o.m40513a()
        L_0x0017:
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bamtechmedia.dominguez.profiles.x1.e r2 = r5.f15375b
            r3 = 2
            r4 = 0
            java.util.List r1 = com.bamtechmedia.dominguez.profiles.p268x1.C6913e.m21126b(r2, r1, r4, r3, r4)
            java.lang.Object r1 = kotlin.p590y.C13199w.m40591g(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x001b
            return r1
        L_0x0038:
            com.bamtechmedia.dominguez.profiles.x1.e r0 = r5.f15375b
            java.util.List r0 = r0.mo19675b()
            java.lang.Object r0 = kotlin.p590y.C13199w.m40589f(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p268x1.C6906a.m21114b():java.lang.String");
    }
}
