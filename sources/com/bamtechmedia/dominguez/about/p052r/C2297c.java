package com.bamtechmedia.dominguez.about.p052r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import com.bamtechmedia.dominguez.about.C2285p;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/GeneralAboutSectionFactory;", "", "itemsFactory", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "widevineUtils", "Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;", "context", "Landroid/content/Context;", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;Landroid/content/Context;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "create", "Lcom/xwray/groupie/Group;", "deviceScreenInfo", "", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.c */
/* compiled from: GeneralAboutSectionFactory.kt */
public final class C2297c {

    /* renamed from: a */
    private final C2323a f6439a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5862q0 f6440b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f6441c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.c$a */
    /* compiled from: GeneralAboutSectionFactory.kt */
    static final class C2298a extends C12881k implements Function1<C2324a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2297c f6442c;

        C2298a(C2297c cVar) {
            this.f6442c = cVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0085, code lost:
            if (r0 != null) goto L_0x008a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11337a(com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a r13) {
            /*
                r12 = this;
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_app_version
                java.lang.String r2 = "1.1.5.-1"
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r13
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r0, r1, r2, r3, r4, r5)
                int r7 = com.bamtechmedia.dominguez.about.C2285p.about_os_version
                java.lang.String r8 = android.os.Build.VERSION.RELEASE
                java.lang.String r0 = "Build.VERSION.RELEASE"
                kotlin.jvm.internal.C12880j.m40222a(r8, r0)
                r9 = 0
                r10 = 4
                r11 = 0
                r6 = r13
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r6, r7, r8, r9, r10, r11)
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_phone_model
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = android.os.Build.MANUFACTURER
                r0.append(r2)
                r2 = 32
                r0.append(r2)
                java.lang.String r2 = android.os.Build.MODEL
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r0 = r13
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r0, r1, r2, r3, r4, r5)
                int r7 = com.bamtechmedia.dominguez.about.C2285p.about_carrier
                com.bamtechmedia.dominguez.about.r.c r0 = r12.f6442c
                android.telephony.TelephonyManager r0 = r0.m8736c()
                java.lang.String r8 = r0.getNetworkOperatorName()
                java.lang.String r0 = "telephonyManager.networkOperatorName"
                kotlin.jvm.internal.C12880j.m40222a(r8, r0)
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r6, r7, r8, r9, r10, r11)
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_device_id
                com.bamtechmedia.dominguez.about.r.c r0 = r12.f6442c
                android.content.Context r0 = r0.f6441c
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r2 = "android_id"
                java.lang.String r2 = android.provider.Settings.Secure.getString(r0, r2)
                java.lang.String r0 = "Settings.Secure.getStrin…ttings.Secure.ANDROID_ID)"
                kotlin.jvm.internal.C12880j.m40222a(r2, r0)
                r0 = r13
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r0, r1, r2, r3, r4, r5)
                int r7 = com.bamtechmedia.dominguez.about.C2285p.about_device_screen
                com.bamtechmedia.dominguez.about.r.c r0 = r12.f6442c
                java.lang.String r8 = r0.m8735b()
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r6, r7, r8, r9, r10, r11)
                int r1 = com.bamtechmedia.dominguez.about.C2285p.about_widevine
                com.bamtechmedia.dominguez.about.r.c r0 = r12.f6442c
                com.bamtechmedia.dominguez.core.utils.q0 r0 = r0.f6440b
                com.bamtechmedia.dominguez.core.utils.p0 r0 = r0.mo17767a()
                if (r0 == 0) goto L_0x0088
                java.lang.String r0 = r0.toString()
                if (r0 == 0) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                java.lang.String r0 = ""
            L_0x008a:
                r2 = r0
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r13
                com.bamtechmedia.dominguez.about.p052r.p053i.C2323a.C2324a.m8769a(r0, r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.p052r.C2297c.C2298a.mo11337a(com.bamtechmedia.dominguez.about.r.i.a$a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11337a((C2324a) obj);
            return C13145v.f29587a;
        }
    }

    public C2297c(C2323a aVar, C5862q0 q0Var, Context context) {
        this.f6439a = aVar;
        this.f6440b = q0Var;
        this.f6441c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m8735b() {
        Point point = new Point();
        Object systemService = this.f6441c.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            Resources resources = this.f6441c.getResources();
            String str = "context.resources";
            C12880j.m40222a((Object) resources, str);
            int i = resources.getDisplayMetrics().densityDpi;
            Resources resources2 = this.f6441c.getResources();
            C12880j.m40222a((Object) resources2, str);
            float f = resources2.getDisplayMetrics().density;
            StringBuilder sb = new StringBuilder();
            sb.append(point.x);
            sb.append('x');
            sb.append(point.y);
            sb.append(' ');
            sb.append(i);
            sb.append("dpi density ");
            sb.append(f);
            return sb.toString();
        }
        throw new C13142s("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final TelephonyManager m8736c() {
        Object systemService = this.f6441c.getSystemService("phone");
        if (systemService != null) {
            return (TelephonyManager) systemService;
        }
        throw new C13142s("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    /* renamed from: a */
    public final C11847b mo11336a() {
        return this.f6439a.mo11350a(C2285p.about_section_general, new C2298a(this));
    }
}
