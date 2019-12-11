package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.p033s.C1557c;

/* renamed from: f.a.c3 */
public class C4415c3 {

    /* renamed from: b */
    private static final String f10999b = C1557c.m7461a(C4415c3.class);

    /* renamed from: a */
    private final SharedPreferences f11000a;

    public C4415c3(Context context) {
        this.f11000a = context.getSharedPreferences("persistent.com.appboy.storage.sdk_enabled_cache", 0);
    }

    /* renamed from: a */
    public boolean mo15491a() {
        return this.f11000a.getBoolean("appboy_sdk_disabled", false);
    }

    /* renamed from: a */
    public void mo15490a(boolean z) {
        String str = f10999b;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting Appboy SDK disabled to: ");
        sb.append(z);
        C1557c.m7469c(str, sb.toString());
        this.f11000a.edit().putBoolean("appboy_sdk_disabled", z).apply();
    }
}
