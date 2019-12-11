package com.bamtechmedia.dominguez.background;

import android.content.Intent;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.background.BackgroundResponder;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5769c;
import com.bamtechmedia.dominguez.core.p087h.C3828d;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p286j.C7301l;
import p512h.C11868a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/background/MainActivityBackgroundResponder;", "Lcom/bamtechmedia/dominguez/core/background/BackgroundResponder;", "lazyRestartListener", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/core/app/ApplicationRestartListener;", "deepLinks", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "appPresence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "deeplinkOriginChecker", "Lcom/bamtechmedia/dominguez/deeplink/DeeplinkOriginChecker;", "(Ldagger/Lazy;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;Lcom/bamtechmedia/dominguez/deeplink/DeeplinkOriginChecker;)V", "getAppPresence", "()Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "currentIntent", "Landroid/content/Intent;", "isDeepLink", "", "maxBgTimeElapsed", "handleIntent", "", "intent", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "processPresence", "presence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MainActivityBackgroundResponder.kt */
public final class MainActivityBackgroundResponder extends BackgroundResponder {

    /* renamed from: U */
    private boolean f8068U;

    /* renamed from: V */
    private boolean f8069V;

    /* renamed from: W */
    private Intent f8070W;

    /* renamed from: X */
    private final C11868a<C3828d> f8071X;

    /* renamed from: Y */
    private final Provider<C7300k> f8072Y;

    /* renamed from: Z */
    private final C5765a f8073Z;

    /* renamed from: a0 */
    private final C7301l f8074a0;

    public MainActivityBackgroundResponder(C11868a<C3828d> aVar, Provider<C7300k> provider, C5765a aVar2, C7301l lVar) {
        this.f8071X = aVar;
        this.f8072Y = provider;
        this.f8073Z = aVar2;
        this.f8074a0 = lVar;
    }

    /* renamed from: a */
    public void mo4126a(C0722m mVar) {
        if (this.f8068U) {
            C7300k kVar = (C7300k) this.f8072Y.get();
            Intent intent = this.f8070W;
            if (intent != null) {
                kVar.mo20102a(intent, !this.f8069V);
            } else {
                C12880j.m40227c("currentIntent");
                throw null;
            }
        }
        this.f8068U = false;
        this.f8069V = false;
    }

    /* renamed from: b */
    public C5765a mo11410b() {
        return this.f8073Z;
    }

    /* renamed from: a */
    public final void mo12182a(Intent intent) {
        this.f8068U = true;
        this.f8070W = intent;
        if (this.f8074a0.mo20109a(intent)) {
            this.f8069V = false;
        }
    }

    /* renamed from: a */
    public void mo11409a(C5766a aVar) {
        if (aVar instanceof C5769c) {
            this.f8069V = true;
            ((C3828d) this.f8071X.get()).mo13751b();
        }
    }
}
