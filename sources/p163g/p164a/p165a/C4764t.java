package p163g.p164a.p165a;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: g.a.a.t */
/* compiled from: MessageFullScreenActivity */
public class C4764t extends C4658c {

    /* renamed from: c */
    protected C4759s f11853c;

    /* renamed from: g.a.a.t$a */
    /* compiled from: MessageFullScreenActivity */
    class C4765a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f11855c;

        C4765a(ViewGroup viewGroup) {
            this.f11855c = viewGroup;
        }

        public void run() {
            C4759s sVar = C4764t.this.f11853c;
            sVar.f11846w = this.f11855c;
            sVar.mo16144k();
        }
    }

    /* renamed from: a */
    private boolean m16543a() {
        if (this.f11853c != null) {
            return true;
        }
        C4783y0.m16640c("Messages - unable to display fullscreen message, message is undefined", new Object[0]);
        C4721o0.m16410a((C4746q) null);
        finish();
        overridePendingTransition(0, 0);
        return false;
    }

    public void onBackPressed() {
        C4759s sVar = this.f11853c;
        if (sVar != null) {
            sVar.f11820f = false;
            sVar.mo16134i();
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11853c = m16542a(bundle);
            C4721o0.m16411a(this.f11853c);
        } else {
            this.f11853c = C4721o0.m16414b();
        }
        if (m16543a()) {
            this.f11853c.f11845v = this;
            requestWindowFeature(1);
            setContentView(new RelativeLayout(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (m16543a()) {
            try {
                ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                if (viewGroup == null) {
                    C4783y0.m16636b("Messages - unable to get root view group from os", new Object[0]);
                    finish();
                    overridePendingTransition(0, 0);
                } else {
                    viewGroup.post(new C4765a(viewGroup));
                }
            } catch (NullPointerException e) {
                C4783y0.m16640c("Messages - content view is in undefined state (%s)", e.getMessage());
                finish();
                overridePendingTransition(0, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("MessageFullScreenActivity.messageId", this.f11853c.f11815a);
        bundle.putString("MessageFullScreenActivity.replacedHtml", this.f11853c.f11843t);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private C4759s m16542a(Bundle bundle) {
        C4759s a = C4721o0.m16407a(bundle.getString("MessageFullScreenActivity.messageId"));
        if (a != null) {
            a.f11843t = bundle.getString("MessageFullScreenActivity.replacedHtml");
        }
        return a;
    }
}
