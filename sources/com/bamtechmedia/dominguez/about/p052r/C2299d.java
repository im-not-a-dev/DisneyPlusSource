package com.bamtechmedia.dominguez.about.p052r;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.appboy.C1440a;
import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a;
import com.bamtechmedia.dominguez.auth.p061o0.C2743d;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a.C2761a;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.google.common.base.Optional;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/GeneralDebugSettingFactory;", "", "itemsFactory", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "context", "Landroid/content/Context;", "timeTravelHelper", "Lcom/bamtechmedia/dominguez/about/items/TimeTravelHelper;", "locationOverrideHelper", "Lcom/bamtechmedia/dominguez/about/items/LocationOverrideHelper;", "logOutListener", "Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;", "logOutAction", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "autoLoginOptional", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;Landroid/content/Context;Lcom/bamtechmedia/dominguez/about/items/TimeTravelHelper;Lcom/bamtechmedia/dominguez/about/items/LocationOverrideHelper;Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;Lcom/google/common/base/Optional;)V", "create", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "designSampleIntent", "Landroid/content/Intent;", "restartApp", "", "softLogout", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.d */
/* compiled from: GeneralDebugSettingFactory.kt */
public final class C2299d {

    /* renamed from: a */
    private final C2323a f6443a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f6444b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2320h f6445c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2313f f6446d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2743d f6447e;

    /* renamed from: f */
    private final C2793c f6448f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Optional<C2760a> f6449g;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.r.d$a */
    /* compiled from: GeneralDebugSettingFactory.kt */
    static final class C2300a extends C12881k implements Function1<C2324a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C2266d f6450U;

        /* renamed from: c */
        final /* synthetic */ C2299d f6451c;

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$a */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2301a extends C12881k implements Function0<C13145v> {

            /* renamed from: U */
            final /* synthetic */ C2300a f6452U;

            /* renamed from: c */
            final /* synthetic */ Intent f6453c;

            C2301a(Intent intent, C2300a aVar, C2324a aVar2) {
                this.f6453c = intent;
                this.f6452U = aVar;
                super(0);
            }

            public final void invoke() {
                this.f6452U.f6451c.f6444b.startActivity(this.f6453c);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$b */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2302b extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6454c;

            C2302b(C2300a aVar) {
                this.f6454c = aVar;
                super(0);
            }

            public final void invoke() {
                this.f6454c.f6451c.f6445c.mo11347a();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$c */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2303c extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6455c;

            C2303c(C2300a aVar) {
                this.f6455c = aVar;
                super(0);
            }

            public final void invoke() {
                this.f6455c.f6451c.f6446d.mo11342a(this.f6455c.f6450U.mo11310c());
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$d */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2304d extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6456c;

            C2304d(C2300a aVar) {
                this.f6456c = aVar;
                super(0);
            }

            public final void invoke() {
                Object systemService = this.f6456c.f6451c.f6444b.getSystemService("activity");
                if (systemService != null) {
                    ((ActivityManager) systemService).clearApplicationUserData();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$e */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2305e extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6457c;

            C2305e(C2300a aVar) {
                this.f6457c = aVar;
                super(0);
            }

            public final void invoke() {
                this.f6457c.f6451c.m8746c();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$f */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2306f extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6458c;

            C2306f(C2300a aVar) {
                this.f6458c = aVar;
                super(0);
            }

            public final void invoke() {
                this.f6458c.f6451c.m8744b();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$g */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2307g extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6459c;

            C2307g(C2300a aVar) {
                this.f6459c = aVar;
                super(0);
            }

            public final void invoke() {
                Context c = this.f6459c.f6451c.f6444b;
                StringBuilder sb = new StringBuilder();
                sb.append("ProfileId: ");
                C6626c0 b = this.f6459c.f6450U.mo11309b();
                sb.append(b != null ? b.getProfileId() : null);
                C2312e.m8754a(c, sb.toString());
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$h */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2308h extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6460c;

            C2308h(C2300a aVar) {
                this.f6460c = aVar;
                super(0);
            }

            public final void invoke() {
                C1440a.m6921c(this.f6460c.f6451c.f6444b).mo6588j();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.d$a$i */
        /* compiled from: GeneralDebugSettingFactory.kt */
        static final class C2309i extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2300a f6461c;

            C2309i(C2300a aVar) {
                this.f6461c = aVar;
                super(0);
            }

            public final void invoke() {
                C2761a.m10413a((C2760a) this.f6461c.f6451c.f6449g.mo27104a(), null, null, 3, null);
            }
        }

        C2300a(C2299d dVar, C2266d dVar2) {
            this.f6451c = dVar;
            this.f6450U = dVar2;
            super(1);
        }

        /* renamed from: a */
        public final void mo11339a(C2324a aVar) {
            C2324a aVar2 = aVar;
            C2324a.m8770a(aVar2, C2285p.about_debug_dictionary, "DEBUG_DICTIONARY", false, null, 8, null);
            C2324a.m8770a(aVar, C2285p.vader_grid, "VADER_GRID_ENABLED", false, null, 8, null);
            C2324a.m8770a(aVar2, C2285p.about_debug_player_overlay, "DEBUG_PLAYER_OVERLAY", false, null, 8, null);
            aVar.mo11352a(C2285p.about_time_travel, this.f6451c.f6445c.mo11348b(), new C2302b(this));
            aVar.mo11352a(C2285p.about_location_override, this.f6451c.f6446d.mo11341a(), new C2303c(this));
            String str = "";
            aVar.mo11352a(C2285p.about_reset, str, new C2304d(this));
            aVar.mo11352a(C2285p.about_soft_logout, str, new C2305e(this));
            aVar.mo11352a(C2285p.about_restart, str, new C2306f(this));
            int i = C2285p.about_profile_id;
            C6626c0 b = this.f6450U.mo11309b();
            aVar.mo11352a(i, String.valueOf(b != null ? b.getProfileId() : null), new C2307g(this));
            aVar.mo11352a(C2285p.about_flush_braze, str, new C2308h(this));
            Intent a = this.f6451c.m8741a();
            if (a != null) {
                aVar.mo11352a(C2285p.about_design_guide, str, new C2301a(a, this, aVar));
            }
            if (this.f6451c.f6449g.mo27106b()) {
                aVar.mo11352a(C2285p.about_clear_smartlock, str, new C2309i(this));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11339a((C2324a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.r.d$b */
    /* compiled from: GeneralDebugSettingFactory.kt */
    static final class C2310b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2299d f6462c;

        C2310b(C2299d dVar) {
            this.f6462c = dVar;
            super(0);
        }

        public final void invoke() {
            this.f6462c.f6447e.mo11753a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.r.d$c */
    /* compiled from: GeneralDebugSettingFactory.kt */
    static final class C2311c extends C12881k implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C2311c f6463c = new C2311c();

        C2311c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            throw null;
        }

        public final void invoke(Throwable th) {
            throw th;
        }
    }

    public C2299d(C2323a aVar, Context context, C2320h hVar, C2313f fVar, C2743d dVar, C2793c cVar, Optional<C2760a> optional) {
        this.f6443a = aVar;
        this.f6444b = context;
        this.f6445c = hVar;
        this.f6446d = fVar;
        this.f6447e = dVar;
        this.f6448f = cVar;
        this.f6449g = optional;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m8744b() {
        Intent launchIntentForPackage = this.f6444b.getPackageManager().getLaunchIntentForPackage(this.f6444b.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(67108864);
            launchIntentForPackage.addFlags(268435456);
        } else {
            launchIntentForPackage = null;
        }
        this.f6444b.startActivity(launchIntentForPackage);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8746c() {
        C5826e0.m18822a(this.f6448f.mo11572c(), new C2310b(this), C2311c.f6463c);
    }

    /* renamed from: a */
    public final C11847b mo11338a(C2266d dVar) {
        return this.f6443a.mo11350a(C2285p.about_section_general_debug, new C2300a(this, dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Intent m8741a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6444b.getPackageName());
        sb.append(".action.DESIGN_SAMPLE");
        Intent addFlags = new Intent(sb.toString()).addFlags(268435456);
        if (addFlags.resolveActivity(this.f6444b.getPackageManager()) != null) {
            return addFlags;
        }
        return null;
    }
}
