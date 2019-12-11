package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* renamed from: g.a.a.k0 */
/* compiled from: MessageOpenURL */
final class C4695k0 extends C4712m0 {
    C4695k0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        try {
            Activity m = C4783y0.m16653m();
            if (this.f11816b == C4726e.MESSAGE_SHOW_RULE_ONCE) {
                mo16126a();
            }
            String j = mo16049j();
            C4783y0.m16630a("%s - Creating intent with uri: %s", mo16034l(), j);
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(j));
                m.startActivity(intent);
            } catch (Exception e) {
                C4783y0.m16630a("%s - Could not load intent for message (%s)", mo16034l(), e.toString());
            }
        } catch (C4784a e2) {
            C4783y0.m16636b(e2.getMessage(), new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo16034l() {
        return "OpenURL";
    }
}
