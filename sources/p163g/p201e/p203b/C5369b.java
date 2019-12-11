package p163g.p201e.p203b;

import android.app.Application;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;

/* renamed from: g.e.b.b */
/* compiled from: InAppMessagesInitializationAction.kt */
public final class C5369b implements C3824a {

    /* renamed from: a */
    private final C5368a f12865a;

    public C5369b(C5368a aVar) {
        this.f12865a = aVar;
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        AppboyInAppMessageManager.getInstance().setCustomInAppMessageManagerListener(this.f12865a);
    }
}
