package p163g.p164a.p165a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.r */
/* compiled from: MessageAlert */
final class C4753r extends C4746q {

    /* renamed from: s */
    protected String f11827s;

    /* renamed from: t */
    protected String f11828t;

    /* renamed from: u */
    protected String f11829u;

    /* renamed from: v */
    protected String f11830v;

    /* renamed from: w */
    protected String f11831w;

    /* renamed from: x */
    protected AlertDialog f11832x;

    /* renamed from: g.a.a.r$a */
    /* compiled from: MessageAlert */
    private static final class C4754a implements Runnable {

        /* renamed from: c */
        private final C4753r f11833c;

        /* renamed from: g.a.a.r$a$a */
        /* compiled from: MessageAlert */
        private static final class C4755a implements OnCancelListener {

            /* renamed from: c */
            private final C4753r f11834c;

            public C4755a(C4753r rVar) {
                this.f11834c = rVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f11834c.mo16134i();
                this.f11834c.f11820f = false;
            }
        }

        /* renamed from: g.a.a.r$a$b */
        /* compiled from: MessageAlert */
        private static final class C4756b implements OnClickListener {

            /* renamed from: c */
            private final C4753r f11835c;

            public C4756b(C4753r rVar) {
                this.f11835c = rVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f11835c.mo16134i();
                this.f11835c.f11820f = false;
            }
        }

        /* renamed from: g.a.a.r$a$c */
        /* compiled from: MessageAlert */
        private static final class C4757c implements OnClickListener {

            /* renamed from: c */
            private final C4753r f11836c;

            public C4757c(C4753r rVar) {
                this.f11836c = rVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f11836c.mo16128b();
                C4753r rVar = this.f11836c;
                rVar.f11820f = false;
                String str = rVar.f11829u;
                if (str != null && str.length() > 0) {
                    new HashMap();
                    C4753r rVar2 = this.f11836c;
                    HashMap a = rVar2.mo16125a(rVar2.mo16124a(rVar2.f11829u), true);
                    String str2 = "0";
                    String str3 = "{userId}";
                    a.put(str3, str2);
                    String str4 = "{trackingId}";
                    a.put(str4, str2);
                    a.put("{messageId}", this.f11836c.f11815a);
                    a.put("{lifetimeValue}", C4682g.m16301a().toString());
                    if (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
                        String str5 = "";
                        a.put(str3, C4783y0.m16610H() == null ? str5 : C4783y0.m16610H());
                        if (C4783y0.m16634b() != null) {
                            str5 = C4783y0.m16634b();
                        }
                        a.put(str4, str5);
                    }
                    String a2 = C4783y0.m16620a(this.f11836c.f11829u, (Map<String, String>) a);
                    try {
                        Activity m = C4783y0.m16653m();
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(a2));
                            m.startActivity(intent);
                        } catch (Exception e) {
                            C4783y0.m16630a("Messages - Could not load click-through intent for message (%s)", e.toString());
                        }
                    } catch (C4784a e2) {
                        C4783y0.m16636b(e2.getMessage(), new Object[0]);
                    }
                }
            }
        }

        public C4754a(C4753r rVar) {
            this.f11833c = rVar;
        }

        public void run() {
            try {
                try {
                    Builder builder = new Builder(C4783y0.m16653m());
                    builder.setTitle(this.f11833c.f11827s);
                    builder.setMessage(this.f11833c.f11828t);
                    if (this.f11833c.f11830v != null && !this.f11833c.f11830v.isEmpty()) {
                        builder.setPositiveButton(this.f11833c.f11830v, new C4757c(this.f11833c));
                    }
                    builder.setNegativeButton(this.f11833c.f11831w, new C4756b(this.f11833c));
                    builder.setOnCancelListener(new C4755a(this.f11833c));
                    this.f11833c.f11832x = builder.create();
                    this.f11833c.f11832x.setCanceledOnTouchOutside(false);
                    this.f11833c.f11832x.show();
                    this.f11833c.f11820f = true;
                } catch (Exception e) {
                    C4783y0.m16630a("Messages - Could not show alert message (%s)", e.toString());
                }
            } catch (C4784a e2) {
                C4783y0.m16636b(e2.getMessage(), new Object[0]);
            }
        }
    }

    C4753r() {
    }

    /* renamed from: j */
    protected static void m16528j() {
        C4746q c = C4721o0.m16415c();
        if (c != null && (c instanceof C4753r) && c.f11821g != C4783y0.m16654n()) {
            C4753r rVar = (C4753r) c;
            AlertDialog alertDialog = rVar.f11832x;
            if (alertDialog != null && alertDialog.isShowing()) {
                rVar.f11832x.dismiss();
            }
            rVar.f11832x = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16048a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || !super.mo16048a(jSONObject)) {
            return false;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                C4783y0.m16640c("Messages - Unable to create alert message \"%s\", payload is empty", this.f11815a);
                return false;
            }
            try {
                this.f11827s = jSONObject2.getString("title");
                if (this.f11827s.length() <= 0) {
                    C4783y0.m16640c("Messages - Unable to create alert message \"%s\", title is empty", this.f11815a);
                    return false;
                }
                try {
                    this.f11828t = jSONObject2.getString("content");
                    if (this.f11828t.length() <= 0) {
                        C4783y0.m16640c("Messages - Unable to create alert message \"%s\", content is empty", this.f11815a);
                        return false;
                    }
                    try {
                        this.f11831w = jSONObject2.getString("cancel");
                        if (this.f11831w.length() <= 0) {
                            C4783y0.m16640c("Messages - Unable to create alert message \"%s\", cancel is empty", this.f11815a);
                            return false;
                        }
                        try {
                            this.f11830v = jSONObject2.getString("confirm");
                        } catch (JSONException unused) {
                            C4783y0.m16630a("Messages - Tried to read \"confirm\" for alert message but found none. This is not a required field", new Object[0]);
                        }
                        try {
                            this.f11829u = jSONObject2.getString("url");
                        } catch (JSONException unused2) {
                            C4783y0.m16630a("Messages - Tried to read url for alert message but found none. This is not a required field", new Object[0]);
                        }
                        return true;
                    } catch (JSONException unused3) {
                        C4783y0.m16640c("Messages - Unable to create alert message \"%s\", cancel is required", this.f11815a);
                        return false;
                    }
                } catch (JSONException unused4) {
                    C4783y0.m16640c("Messages - Unable to create alert message \"%s\", content is required", this.f11815a);
                    return false;
                }
            } catch (JSONException unused5) {
                C4783y0.m16640c("Messages - Unable to create alert message \"%s\", title is required", this.f11815a);
                return false;
            }
        } catch (JSONException unused6) {
            C4783y0.m16640c("Messages - Unable to create alert message \"%s\", payload is required", this.f11815a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        String str = this.f11831w;
        if (str == null || str.length() < 1) {
            String str2 = this.f11830v;
            if (str2 == null || str2.length() < 1) {
                return;
            }
        }
        super.mo16033h();
        mo16132f();
        new Handler(Looper.getMainLooper()).post(new C4754a(this));
    }
}
