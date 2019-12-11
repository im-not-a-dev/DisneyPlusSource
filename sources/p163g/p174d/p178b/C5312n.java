package p163g.p174d.p178b;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import p163g.p174d.p178b.p181c0.C4938a;
import p686n.p687a.C14100a;

/* renamed from: g.d.b.n */
/* compiled from: PlayerPreferences */
public class C5312n {

    /* renamed from: a */
    final String f12795a;

    /* renamed from: b */
    private final SharedPreferences f12796b;

    /* renamed from: c */
    private final C4938a f12797c;

    C5312n(SharedPreferences sharedPreferences, C4938a aVar, String str) {
        this.f12796b = sharedPreferences;
        this.f12797c = aVar;
        if (str != null) {
            this.f12795a = str;
        } else {
            this.f12795a = "en";
        }
    }

    /* renamed from: a */
    private boolean m17971a(String str, boolean z) {
        return this.f12796b.getBoolean(str, z);
    }

    /* renamed from: b */
    private void m17973b(String str, boolean z) {
        this.f12796b.edit().putBoolean(str, z).apply();
    }

    /* renamed from: c */
    public String mo17094c() {
        return m17970a("PREFERED_SUBTITLELANG_KEY", this.f12795a);
    }

    /* renamed from: a */
    private String m17970a(String str, String str2) {
        return this.f12796b.getString(str, str2);
    }

    /* renamed from: b */
    private void m17972b(String str, String str2) {
        this.f12796b.edit().putString(str, str2).apply();
    }

    /* renamed from: c */
    public void mo17095c(String str) {
        m17972b("PREFERED_SUBTITLELANG_KEY", mo17089a(str));
    }

    /* renamed from: a */
    public boolean mo17091a() {
        return m17971a("CAPTIONS_ENABLED_KEY", this.f12797c.mo16338a());
    }

    /* renamed from: b */
    public String mo17092b() {
        return m17970a("PREFERED_AUDIOLANG_KEY", this.f12795a);
    }

    /* renamed from: a */
    public void mo17090a(boolean z) {
        m17973b("CAPTIONS_ENABLED_KEY", z);
    }

    /* renamed from: b */
    public void mo17093b(String str) {
        m17972b("PREFERED_AUDIOLANG_KEY", mo17089a(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo17089a(String str) {
        if (str != null && str.length() <= 5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Language code was too long, Max length: 5. Your language code: ");
        sb.append(str);
        C14100a.m44526b(sb.toString(), new Object[0]);
        return this.f12795a;
    }

    public C5312n(Context context) {
        this(context.getSharedPreferences("BAMPLAYER", 0), new C4938a(context), Locale.getDefault().getLanguage());
    }
}
