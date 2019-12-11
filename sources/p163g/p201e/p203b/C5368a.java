package p163g.p201e.p203b;

import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1544n;
import com.appboy.p034ui.inappmessage.InAppMessageCloser;
import com.appboy.p034ui.inappmessage.InAppMessageOperation;
import com.appboy.p034ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.bamtechmedia.dominguez.analytics.C2447q;
import p686n.p687a.Timber;

/* renamed from: g.e.b.a */
/* compiled from: InAppMessageManager.kt */
public final class C5368a implements IInAppMessageManagerListener {

    /* renamed from: a */
    private final C2447q f12864a;

    public C5368a(C2447q qVar) {
        this.f12864a = qVar;
    }

    public InAppMessageOperation beforeInAppMessageDisplayed(C1532b bVar) {
        if (!this.f12864a.mo11575a()) {
            return InAppMessageOperation.DISPLAY_NOW;
        }
        Timber.m44522a("kidsmode profile enabled, in app message was dropped", new Object[0]);
        return InAppMessageOperation.DISCARD;
    }

    public boolean onInAppMessageButtonClicked(C1544n nVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public boolean onInAppMessageClicked(C1532b bVar, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public void onInAppMessageDismissed(C1532b bVar) {
    }

    public boolean onInAppMessageReceived(C1532b bVar) {
        return false;
    }
}
