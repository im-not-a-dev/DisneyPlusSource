package p163g.p164a.p165a;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: g.a.a.l0 */
/* compiled from: MessageTargetExperienceUIFullScreen */
final class C4702l0 extends C4759s {

    /* renamed from: g.a.a.l0$a */
    /* compiled from: MessageTargetExperienceUIFullScreen */
    private static class C4703a extends C4761b {
        protected C4703a(C4759s sVar) {
            super(sVar);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            super.shouldOverrideUrlLoading(webView, str);
            if (!str.startsWith("adbinapp")) {
                Toast.makeText(webView.getContext(), "Error while reading the response from the Experience UI! (Response mal-formed)", 0).show();
                mo16146a(webView);
            } else if (str.contains("confirm")) {
                int indexOf = str.indexOf("at_preview_params=");
                if (indexOf >= 0) {
                    int indexOf2 = str.indexOf(38, indexOf);
                    if (indexOf2 < 0) {
                        indexOf2 = str.length();
                    }
                    String substring = str.substring(indexOf + 18, indexOf2);
                    if (!substring.isEmpty()) {
                        try {
                            C4648a1.m16198k().mo15967a(URLDecoder.decode(substring, Utf8Charset.NAME));
                        } catch (UnsupportedEncodingException e) {
                            C4783y0.m16630a("Could not decode the Target Preview parameters (%s)", e);
                        }
                    }
                }
                String g = C4648a1.m16198k().mo15976g();
                if (g != null && !g.isEmpty()) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(g));
                        this.f11849a.f11845v.startActivity(intent);
                    } catch (Exception e2) {
                        C4783y0.m16630a("Messages - unable to launch restart deeplink intent from Target Preview message (%s)", e2.getMessage());
                    }
                }
            } else if (str.contains("cancel")) {
                C4648a1.m16198k().mo15968b();
            }
            C4721o0.m16410a((C4746q) null);
            return true;
        }
    }

    /* renamed from: g.a.a.l0$b */
    /* compiled from: MessageTargetExperienceUIFullScreen */
    private static class C4704b extends C4760a {
        protected C4704b(C4759s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WebView mo16043a() {
            WebView a = super.mo16043a();
            WebSettings settings = a.getSettings();
            settings.setDomStorageEnabled(true);
            File k = C4783y0.m16651k();
            if (k != null) {
                settings.setDatabasePath(k.getPath());
                settings.setDatabaseEnabled(true);
            }
            return a;
        }
    }

    C4702l0() {
        mo16143a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4760a mo16040a(C4759s sVar) {
        return new C4704b(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        this.f11842s = C4648a1.m16198k().mo15977h();
        if (this.f11842s == null) {
            C4783y0.m16636b("Could not display the Target Preview Experience UI (no html payload found!)", new Object[0]);
            return;
        }
        super.mo16033h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C4761b mo16041j() {
        return new C4703a(this);
    }
}
