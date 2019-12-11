package com.bamtechmedia.dominguez.about;

import android.content.Context;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.about.p052r.C2287a;
import com.bamtechmedia.dominguez.about.p052r.C2290b;
import com.bamtechmedia.dominguez.about.p052r.C2297c;
import com.bamtechmedia.dominguez.about.p052r.C2299d;
import com.bamtechmedia.dominguez.about.p052r.C2316g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.List;
import kotlin.Metadata;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/AboutPresenter;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "generalAboutSectionFactory", "Lcom/bamtechmedia/dominguez/about/items/GeneralAboutSectionFactory;", "generalDebugSettingFactory", "Lcom/bamtechmedia/dominguez/about/items/GeneralDebugSettingFactory;", "downloadDebugSettingsFactory", "Lcom/bamtechmedia/dominguez/about/items/DownloadDebugSettingsFactory;", "appConfigSectionFactory", "Lcom/bamtechmedia/dominguez/about/items/AppConfigSectionFactory;", "sessionInfoSectionFactory", "Lcom/bamtechmedia/dominguez/about/items/SessionInfoSectionFactory;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/about/items/GeneralAboutSectionFactory;Lcom/bamtechmedia/dominguez/about/items/GeneralDebugSettingFactory;Lcom/bamtechmedia/dominguez/about/items/DownloadDebugSettingsFactory;Lcom/bamtechmedia/dominguez/about/items/AppConfigSectionFactory;Lcom/bamtechmedia/dominguez/about/items/SessionInfoSectionFactory;)V", "createItems", "", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AboutPresenter.kt */
public final class AboutPresenter implements C0710d {

    /* renamed from: U */
    private final C2297c f6380U;

    /* renamed from: V */
    private final C2299d f6381V;

    /* renamed from: W */
    private final C2290b f6382W;

    /* renamed from: X */
    private final C2287a f6383X;

    /* renamed from: Y */
    private final C2316g f6384Y;

    /* renamed from: c */
    private final Context f6385c;

    public AboutPresenter(Context context, C2297c cVar, C2299d dVar, C2290b bVar, C2287a aVar, C2316g gVar) {
        this.f6385c = context;
        this.f6380U = cVar;
        this.f6381V = dVar;
        this.f6382W = bVar;
        this.f6383X = aVar;
        this.f6384Y = gVar;
    }

    /* renamed from: a */
    public final List<C11847b> mo11296a(C2266d dVar) {
        C11847b[] bVarArr = new C11847b[5];
        boolean z = false;
        bVarArr[0] = this.f6380U.mo11336a();
        C11847b a = this.f6381V.mo11338a(dVar);
        if (!dVar.mo11312e()) {
            a = null;
        }
        bVarArr[1] = a;
        C11847b a2 = this.f6382W.mo11332a(dVar);
        if (dVar.mo11312e() && !C5837i.m18843e(this.f6385c)) {
            z = true;
        }
        if (!z) {
            a2 = null;
        }
        bVarArr[2] = a2;
        C11847b a3 = this.f6383X.mo11330a(dVar);
        if (!dVar.mo11312e()) {
            a3 = null;
        }
        bVarArr[3] = a3;
        C11847b a4 = this.f6384Y.mo11344a(dVar);
        if (!dVar.mo11312e()) {
            a4 = null;
        }
        bVarArr[4] = a4;
        return C13185o.m40522d(bVarArr);
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }
}
