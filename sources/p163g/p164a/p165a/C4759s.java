package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.stetho.common.Utf8Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.s */
/* compiled from: MessageFullScreen */
class C4759s extends C4746q {

    /* renamed from: s */
    protected String f11842s;

    /* renamed from: t */
    protected String f11843t;

    /* renamed from: u */
    protected WebView f11844u;

    /* renamed from: v */
    protected Activity f11845v;

    /* renamed from: w */
    protected ViewGroup f11846w;

    /* renamed from: x */
    protected boolean f11847x = true;

    /* renamed from: g.a.a.s$a */
    /* compiled from: MessageFullScreen */
    protected static class C4760a implements Runnable {

        /* renamed from: c */
        private C4759s f11848c;

        protected C4760a(C4759s sVar) {
            this.f11848c = sVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WebView mo16043a() {
            WebView webView = new WebView(this.f11848c.f11845v);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setBackgroundColor(0);
            webView.setWebViewClient(this.f11848c.mo16041j());
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setDefaultTextEncodingName(Utf8Charset.NAME);
            return webView;
        }

        public void run() {
            try {
                this.f11848c.f11844u = mo16043a();
                this.f11848c.f11844u.loadDataWithBaseURL("file:///android_asset/", this.f11848c.f11843t, "text/html", Utf8Charset.NAME, null);
                if (this.f11848c.f11846w == null) {
                    C4783y0.m16636b("Messages - unable to get root view group from os", new Object[0]);
                    C4759s.m16533c(this.f11848c);
                    return;
                }
                int measuredWidth = this.f11848c.f11846w.getMeasuredWidth();
                int measuredHeight = this.f11848c.f11846w.getMeasuredHeight();
                if (measuredWidth != 0) {
                    if (measuredHeight != 0) {
                        if (this.f11848c.f11820f) {
                            this.f11848c.f11846w.addView(this.f11848c.f11844u, measuredWidth, measuredHeight);
                        } else {
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) measuredHeight, 0.0f);
                            translateAnimation.setDuration(300);
                            this.f11848c.f11844u.setAnimation(translateAnimation);
                            this.f11848c.f11846w.addView(this.f11848c.f11844u, measuredWidth, measuredHeight);
                        }
                        this.f11848c.f11820f = true;
                        return;
                    }
                }
                C4783y0.m16636b("Messages - root view hasn't been measured, cannot show message", new Object[0]);
                C4759s.m16533c(this.f11848c);
            } catch (Exception e) {
                C4783y0.m16630a("Messages - Failed to show full screen message (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: g.a.a.s$b */
    /* compiled from: MessageFullScreen */
    protected static class C4761b extends WebViewClient {

        /* renamed from: a */
        protected C4759s f11849a;

        /* renamed from: g.a.a.s$b$a */
        /* compiled from: MessageFullScreen */
        class C4762a implements AnimationListener {
            C4762a() {
            }

            public void onAnimationEnd(Animation animation) {
                C4759s.m16533c(C4761b.this.f11849a);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        protected C4761b(C4759s sVar) {
            this.f11849a = sVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16146a(WebView webView) {
            ViewGroup viewGroup = this.f11849a.f11846w;
            if (viewGroup == null) {
                C4783y0.m16636b("Messages - unable to get root view group from os", new Object[0]);
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) viewGroup.getMeasuredHeight());
            translateAnimation.setDuration(300);
            translateAnimation.setAnimationListener(new C4762a());
            webView.setAnimation(translateAnimation);
            this.f11849a.f11846w.removeView(webView);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith("adbinapp")) {
                return true;
            }
            if (str.contains("cancel")) {
                C4759s sVar = this.f11849a;
                if (sVar.f11847x) {
                    sVar.mo16134i();
                }
                mo16146a(webView);
            } else if (str.contains("confirm")) {
                C4759s sVar2 = this.f11849a;
                if (sVar2.f11847x) {
                    sVar2.mo16128b();
                }
                mo16146a(webView);
                int indexOf = str.indexOf("url=");
                if (indexOf < 0) {
                    return true;
                }
                String substring = str.substring(indexOf + 4);
                C4759s sVar3 = this.f11849a;
                HashMap a = sVar3.mo16125a(sVar3.mo16124a(substring), true);
                String str2 = "0";
                String str3 = "{userId}";
                a.put(str3, str2);
                String str4 = "{trackingId}";
                a.put(str4, str2);
                a.put("{messageId}", this.f11849a.f11815a);
                a.put("{lifetimeValue}", C4682g.m16301a().toString());
                if (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
                    String str5 = "";
                    a.put(str3, C4783y0.m16610H() == null ? str5 : C4783y0.m16610H());
                    if (C4783y0.m16634b() != null) {
                        str5 = C4783y0.m16634b();
                    }
                    a.put(str4, str5);
                }
                String a2 = C4783y0.m16620a(substring, (Map<String, String>) a);
                if (a2 != null && !a2.isEmpty()) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(a2));
                        this.f11849a.f11845v.startActivity(intent);
                    } catch (Exception e) {
                        C4783y0.m16630a("Messages - unable to launch intent from full screen message (%s)", e.getMessage());
                    }
                }
            }
            return true;
        }
    }

    C4759s() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m16533c(C4759s sVar) {
        sVar.f11845v.finish();
        sVar.f11845v.overridePendingTransition(0, 0);
        sVar.f11820f = false;
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
                C4783y0.m16630a("Messages - Unable to create fullscreen message \"%s\", payload is empty", this.f11815a);
                return false;
            }
            try {
                this.f11842s = jSONObject2.getString("html");
                if (this.f11842s.length() <= 0) {
                    C4783y0.m16630a("Messages - Unable to create fullscreen message \"%s\", html is empty", this.f11815a);
                    return false;
                }
                try {
                    JSONArray jSONArray = jSONObject2.getJSONArray("assets");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        this.f11822h = new ArrayList<>();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                            if (jSONArray2 != null && jSONArray2.length() > 0) {
                                ArrayList arrayList = new ArrayList();
                                int length2 = jSONArray2.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    arrayList.add(jSONArray2.getString(i2));
                                }
                                this.f11822h.add(arrayList);
                            }
                        }
                    }
                } catch (JSONException unused) {
                    C4783y0.m16630a("Messages - No assets found for fullscreen message \"%s\"", this.f11815a);
                }
                return true;
            } catch (JSONException unused2) {
                C4783y0.m16630a("Messages - Unable to create fullscreen message \"%s\", html is required", this.f11815a);
                return false;
            }
        } catch (JSONException unused3) {
            C4783y0.m16630a("Messages - Unable to create fullscreen message \"%s\", payload is required", this.f11815a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if ((!p163g.p164a.p165a.C4772v0.m16588k(r5)) != false) goto L_0x0075;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16033h() {
        /*
            r12 = this;
            r0 = 0
            android.app.Activity r1 = p163g.p164a.p165a.C4783y0.m16653m()     // Catch:{ a -> 0x00a9 }
            super.mo16033h()
            boolean r2 = r12.f11847x
            if (r2 == 0) goto L_0x000f
            r12.mo16132f()
        L_0x000f:
            p163g.p164a.p165a.C4721o0.m16411a(r12)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList<java.util.ArrayList<java.lang.String>> r3 = r12.f11822h
            r4 = 1
            if (r3 == 0) goto L_0x007b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007b
            java.util.ArrayList<java.util.ArrayList<java.lang.String>> r3 = r12.f11822h
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r3.next()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 > 0) goto L_0x003b
            goto L_0x0028
        L_0x003b:
            java.lang.Object r7 = r5.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            java.util.Iterator r9 = r5.iterator()
        L_0x0046:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "messageImages"
            java.io.File r10 = p163g.p164a.p165a.C4772v0.m16575b(r10, r11)
            if (r10 == 0) goto L_0x0046
            java.net.URI r8 = r10.toURI()
            java.lang.String r8 = r8.toString()
        L_0x0062:
            if (r8 != 0) goto L_0x0074
            int r6 = r6 + -1
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = p163g.p164a.p165a.C4772v0.m16588k(r5)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r5 = r8
        L_0x0075:
            if (r5 == 0) goto L_0x0028
            r2.put(r7, r5)
            goto L_0x0028
        L_0x007b:
            java.lang.String r3 = r12.f11842s
            java.lang.String r2 = p163g.p164a.p165a.C4783y0.m16620a(r3, r2)
            r12.f11843t = r2
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x009a }
            android.content.Context r3 = r1.getApplicationContext()     // Catch:{ ActivityNotFoundException -> 0x009a }
            java.lang.Class<g.a.a.t> r5 = p163g.p164a.p165a.C4764t.class
            r2.<init>(r3, r5)     // Catch:{ ActivityNotFoundException -> 0x009a }
            r3 = 65536(0x10000, float:9.18355E-41)
            r2.addFlags(r3)     // Catch:{ ActivityNotFoundException -> 0x009a }
            r1.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x009a }
            r1.overridePendingTransition(r0, r0)     // Catch:{ ActivityNotFoundException -> 0x009a }
            goto L_0x00a8
        L_0x009a:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = r1.getMessage()
            r2[r0] = r1
            java.lang.String r0 = "Messages - Must declare MessageFullScreenActivity in AndroidManifest.xml in order to show full screen messages (%s)"
            p163g.p164a.p165a.C4783y0.m16640c(r0, r2)
        L_0x00a8:
            return
        L_0x00a9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p163g.p164a.p165a.C4783y0.m16636b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4759s.mo16033h():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C4761b mo16041j() {
        return new C4761b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16144k() {
        int n = C4783y0.m16654n();
        if (!this.f11820f || this.f11821g != n) {
            this.f11821g = n;
            new Handler(Looper.getMainLooper()).post(mo16040a(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16143a(boolean z) {
        this.f11847x = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4760a mo16040a(C4759s sVar) {
        return new C4760a(sVar);
    }
}
