package com.bamtechmedia.dominguez.about.p052r;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import androidx.appcompat.app.C0081c.C0082a;
import androidx.work.WorkInfo;
import com.bamtechmedia.dominguez.about.C2258d;
import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.about.C2282m;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a;
import com.bamtechmedia.dominguez.config.C3558l;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.core.utils.C5836h0;
import com.bamtechmedia.dominguez.core.utils.C5850n;
import com.bamtechmedia.dominguez.offline.C6239a;
import com.google.common.base.Optional;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;
import org.joda.time.DateTime;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020$H\u0002J\u001e\u0010)\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00120\u00120*2\u0006\u0010+\u001a\u00020,H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u0012\u0012\u0002\b\u00030\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R:\u0010\u0019\u001a(\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b \u001c*\u0014\u0012\u000e\b\u0001\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/DownloadDebugSettingsFactory;", "Landroid/content/DialogInterface$OnClickListener;", "itemsFactory", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "context", "Landroid/content/Context;", "fragment", "Lcom/bamtechmedia/dominguez/about/AboutFragment;", "devConfig", "Lcom/bamtechmedia/dominguez/config/DevConfig;", "contentLicenseRenewal", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/offline/ContentLicenseRenewal;", "debugPreferences", "Landroid/content/SharedPreferences;", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;Landroid/content/Context;Lcom/bamtechmedia/dominguez/about/AboutFragment;Lcom/bamtechmedia/dominguez/config/DevConfig;Lcom/google/common/base/Optional;Landroid/content/SharedPreferences;)V", "debugErrorLog", "", "", "getDebugErrorLog", "()Ljava/util/Map;", "overridePosition", "", "getOverridePosition", "()I", "playbackScenarioOverrides", "", "", "kotlin.jvm.PlatformType", "getPlaybackScenarioOverrides", "()[Ljava/lang/CharSequence;", "create", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "showOverridesList", "tagsForDisplay", "", "workInfo", "Landroidx/work/WorkInfo;", "Companion", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.b */
/* compiled from: DownloadDebugSettingsFactory.kt */
public final class C2290b implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Context f6427U;

    /* renamed from: V */
    private final C2258d f6428V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C3558l f6429W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Optional<C6239a> f6430X;

    /* renamed from: Y */
    private final SharedPreferences f6431Y;

    /* renamed from: c */
    private final C2323a f6432c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.b$a */
    /* compiled from: DownloadDebugSettingsFactory.kt */
    private static final class C2291a {
        private C2291a() {
        }

        public /* synthetic */ C2291a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.r.b$b */
    /* compiled from: DownloadDebugSettingsFactory.kt */
    static final class C2292b extends C12881k implements Function1<C2324a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C2266d f6433U;

        /* renamed from: c */
        final /* synthetic */ C2290b f6434c;

        /* renamed from: com.bamtechmedia.dominguez.about.r.b$b$a */
        /* compiled from: DownloadDebugSettingsFactory.kt */
        static final class C2293a extends C12881k implements Function1<WorkInfo, String> {

            /* renamed from: c */
            final /* synthetic */ C2292b f6435c;

            C2293a(C2292b bVar) {
                this.f6435c = bVar;
                super(1);
            }

            /* renamed from: a */
            public final String invoke(WorkInfo workInfo) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tags: ");
                sb.append(this.f6435c.f6434c.m8718a(workInfo));
                sb.append(", State: ");
                sb.append(workInfo.mo5630a());
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.b$b$b */
        /* compiled from: DownloadDebugSettingsFactory.kt */
        static final class C2294b extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2292b f6436c;

            C2294b(C2292b bVar) {
                this.f6436c = bVar;
                super(0);
            }

            public final void invoke() {
                this.f6436c.f6434c.m8726d();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.b$b$c */
        /* compiled from: DownloadDebugSettingsFactory.kt */
        static final class C2295c extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2292b f6437c;

            C2295c(C2292b bVar) {
                this.f6437c = bVar;
                super(0);
            }

            public final void invoke() {
                C5826e0.m18823a(((C6239a) this.f6437c.f6434c.f6430X.mo27104a()).mo18833a(), null, null, 3, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.about.r.b$b$d */
        /* compiled from: DownloadDebugSettingsFactory.kt */
        static final class C2296d extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C2292b f6438c;

            C2296d(C2292b bVar) {
                this.f6438c = bVar;
                super(0);
            }

            public final void invoke() {
                C2312e.m8754a(this.f6438c.f6434c.f6427U, this.f6438c.f6434c.m8720a().toString());
            }
        }

        C2292b(C2290b bVar, C2266d dVar) {
            this.f6434c = bVar;
            this.f6433U = dVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
            if (r1 != null) goto L_0x0026;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11334a(com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a r19) {
            /*
                r18 = this;
                r0 = r18
                r8 = r19
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_active_workers
                com.bamtechmedia.dominguez.about.f$d r1 = r0.f6433U
                java.util.List r9 = r1.mo11308a()
                if (r9 == 0) goto L_0x0024
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                com.bamtechmedia.dominguez.about.r.b$b$a r15 = new com.bamtechmedia.dominguez.about.r.b$b$a
                r15.<init>(r0)
                r16 = 30
                r17 = 0
                java.lang.String r10 = "\n"
                java.lang.String r1 = kotlin.p590y.C13199w.m40559a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                java.lang.String r1 = "None"
            L_0x0026:
                r3 = r1
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r19
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r1, r2, r3, r4, r5, r6)
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_base_playback_scenario_overrides
                com.bamtechmedia.dominguez.about.r.b r2 = r0.f6434c
                java.lang.CharSequence[] r2 = r2.m8724c()
                com.bamtechmedia.dominguez.about.r.b r3 = r0.f6434c
                int r3 = r3.m8721b()
                r2 = r2[r3]
                java.lang.String r2 = r2.toString()
                com.bamtechmedia.dominguez.about.r.b$b$b r3 = new com.bamtechmedia.dominguez.about.r.b$b$b
                r3.<init>(r0)
                r8.mo11352a(r1, r2, r3)
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_available_for_download
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                com.bamtechmedia.dominguez.config.l r1 = r1.f6429W
                boolean r4 = r1.mo12769f()
                r9 = 0
                r10 = 8
                r11 = 0
                r5 = 0
                r6 = 8
                r7 = 0
                java.lang.String r3 = "AVAILABLE_FOR_DOWNLOAD_OVERRIDE"
                r1 = r19
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8770a(r1, r2, r3, r4, r5, r6, r7)
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_season_download_button
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                com.bamtechmedia.dominguez.config.l r1 = r1.f6429W
                boolean r4 = r1.mo12767d()
                java.lang.String r3 = "DOWNLOAD_SEASON_BUTTON_OVERRIDE"
                r1 = r19
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8770a(r1, r2, r3, r4, r5, r6, r7)
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_download_super_low_quality
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                com.bamtechmedia.dominguez.config.l r1 = r1.f6429W
                boolean r4 = r1.mo12768e()
                java.lang.String r3 = "DOWNLOAD_SUPER_LOW_QUALITY"
                r1 = r19
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8770a(r1, r2, r3, r4, r5, r6, r7)
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_force_notifications
                r4 = 0
                java.lang.String r3 = "DOWNLOAD_MODALS_AS_NOTIFICATIONS"
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8770a(r1, r2, r3, r4, r5, r6, r7)
                int r2 = com.bamtechmedia.dominguez.about.C2285p.about_detail_download_logging
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                com.bamtechmedia.dominguez.config.l r1 = r1.f6429W
                boolean r4 = r1.mo12764a()
                java.lang.String r3 = "PREF_DOWNLOAD_DEBUG_LOGGING"
                r1 = r19
                r5 = r9
                r6 = r10
                r7 = r11
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8770a(r1, r2, r3, r4, r5, r6, r7)
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                com.google.common.base.Optional r1 = r1.f6430X
                boolean r1 = r1.mo27106b()
                if (r1 == 0) goto L_0x00c2
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_force_license_renewal
                com.bamtechmedia.dominguez.about.r.b$b$c r2 = new com.bamtechmedia.dominguez.about.r.b$b$c
                r2.<init>(r0)
                java.lang.String r3 = ""
                r8.mo11352a(r1, r3, r2)
            L_0x00c2:
                com.bamtechmedia.dominguez.about.r.b r1 = r0.f6434c
                java.util.Map r1 = r1.m8720a()
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x00f5
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_detail_download_error_logs_share
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.bamtechmedia.dominguez.about.r.b r3 = r0.f6434c
                java.util.Map r3 = r3.m8720a()
                int r3 = r3.size()
                r2.append(r3)
                java.lang.String r3 = " Errors in log"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.bamtechmedia.dominguez.about.r.b$b$d r3 = new com.bamtechmedia.dominguez.about.r.b$b$d
                r3.<init>(r0)
                r8.mo11352a(r1, r2, r3)
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.p052r.C2290b.C2292b.mo11334a(com.bamtechmedia.dominguez.about.r.i.a$a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11334a((C2324a) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C2291a(null);
    }

    public C2290b(C2323a aVar, Context context, C2258d dVar, C3558l lVar, Optional<C6239a> optional, SharedPreferences sharedPreferences) {
        this.f6432c = aVar;
        this.f6427U = context;
        this.f6428V = dVar;
        this.f6429W = lVar;
        this.f6430X = optional;
        this.f6431Y = sharedPreferences;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence;
        C5836h0.m18832a(this.f6431Y, "SCENARIO_OVERWRITE_POSITION", Integer.valueOf(i));
        SharedPreferences sharedPreferences = this.f6431Y;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = m8724c()[i];
        }
        C5836h0.m18832a(sharedPreferences, "BASE_PLAYBACK_SCENARIO_OVERRIDE", charSequence);
        this.f6428V.mo11301p();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int m8721b() {
        Integer num;
        SharedPreferences sharedPreferences = this.f6431Y;
        Integer valueOf = Integer.valueOf(0);
        KClass a = C12895y.m40230a(Integer.class);
        String str = "SCENARIO_OVERWRITE_POSITION";
        if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(String.class))) {
            if (!(valueOf instanceof String)) {
                valueOf = null;
            }
            num = (Integer) sharedPreferences.getString(str, (String) valueOf);
        } else if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(Integer.TYPE))) {
            num = Integer.valueOf(sharedPreferences.getInt(str, valueOf != null ? valueOf.intValue() : -1));
        } else if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(Boolean.TYPE))) {
            if (!(valueOf instanceof Boolean)) {
                valueOf = null;
            }
            Boolean bool = (Boolean) valueOf;
            num = (Integer) Boolean.valueOf(sharedPreferences.getBoolean(str, bool != null ? bool.booleanValue() : false));
        } else if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(Float.TYPE))) {
            if (!(valueOf instanceof Float)) {
                valueOf = null;
            }
            Float f = (Float) valueOf;
            num = (Integer) Float.valueOf(sharedPreferences.getFloat(str, f != null ? f.floatValue() : -1.0f));
        } else if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(Long.TYPE))) {
            if (!(valueOf instanceof Long)) {
                valueOf = null;
            }
            Long l = (Long) valueOf;
            num = (Integer) Long.valueOf(sharedPreferences.getLong(str, l != null ? l.longValue() : -1));
        } else if (C12880j.m40224a((Object) a, (Object) C12895y.m40230a(DateTime.class))) {
            if (!(valueOf instanceof String)) {
                valueOf = null;
            }
            String str2 = (String) valueOf;
            if (str2 == null) {
                str2 = DateTime.now().toString();
            }
            num = (Integer) DateTime.parse(sharedPreferences.getString(str, str2));
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final CharSequence[] m8724c() {
        return this.f6427U.getResources().getTextArray(C2282m.base_playback_scenario_overrides);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m8726d() {
        C0082a aVar = new C0082a(this.f6428V.requireContext());
        aVar.mo417a(C2285p.about_base_playback_scenario_overrides);
        aVar.mo424a(m8724c(), m8721b(), (OnClickListener) this);
        aVar.mo428c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, ?> m8720a() {
        return new C5850n(this.f6427U, "DMGZ_DLERRORS").getAll();
    }

    /* renamed from: a */
    public final C11847b mo11332a(C2266d dVar) {
        return this.f6432c.mo11350a(C2285p.about_section_download_settings, new C2292b(this, dVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (kotlin.p588j0.C12832w.m40123b(r2, "com.bamtech", false, 2, null) == false) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> m8718a(androidx.work.WorkInfo r9) {
        /*
            r8 = this;
            java.util.Set r9 = r9.mo5631b()
            java.lang.String r0 = "workInfo.tags"
            kotlin.jvm.internal.C12880j.m40222a(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0012:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r9.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "sdk-download-worker"
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r2, r3)
            r4 = 1
            r3 = r3 ^ r4
            r5 = 0
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "it"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            r3 = 2
            r6 = 0
            java.lang.String r7 = "com.bamtech"
            boolean r2 = kotlin.p588j0.C12832w.m40123b(r2, r7, r5, r3, r6)
            if (r2 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 == 0) goto L_0x0012
            r0.add(r1)
            goto L_0x0012
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.p052r.C2290b.m8718a(androidx.work.WorkInfo):java.util.List");
    }
}
