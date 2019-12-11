package com.bamtechmedia.dominguez.app;

import android.content.Context;
import android.os.Trace;
import androidx.work.C1025b.C1026a;
import androidx.work.WorkManager;
import com.bamtechmedia.dominguez.config.C3558l;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.C3584a;
import com.bamtechmedia.dominguez.core.p087h.C3829e;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p277b0.C7233y;
import p512h.p513c.p514k.C11887f;

/* renamed from: com.bamtechmedia.dominguez.app.a */
/* compiled from: BaseApplication.kt */
public abstract class C2481a extends C11887f {

    /* renamed from: U */
    public C3829e f6779U;

    /* renamed from: V */
    public C3558l f6780V;

    /* renamed from: W */
    public C7233y f6781W;

    /* renamed from: a */
    public abstract void mo11592a(C2680u uVar);

    /* renamed from: b */
    public abstract BuildInfo mo11593b();

    public final void onCreate() {
        boolean z = true;
        if (mo11593b().mo12781d() == 1) {
            if ((mo11593b().mo12780c() == C3584a.TV) != C5837i.m18843e(this)) {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Current devices does not match the build target platform: ");
                sb.append(mo11593b().mo12780c());
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        C2680u uVar = new C2680u();
        Context applicationContext = getApplicationContext();
        C1026a aVar = new C1026a();
        aVar.mo5661a(uVar);
        WorkManager.m5491a(applicationContext, aVar.mo5662a());
        Trace.beginSection("DaggerInject");
        super.onCreate();
        Trace.endSection();
        mo11592a(uVar);
        C3829e eVar = this.f6779U;
        if (eVar != null) {
            eVar.mo11495a(this);
            C7233y yVar = this.f6781W;
            if (yVar != null) {
                yVar.mo20037a();
            } else {
                C12880j.m40227c("sdkInitBlocker");
                throw null;
            }
        } else {
            C12880j.m40227c("appInitializationAction");
            throw null;
        }
    }
}
