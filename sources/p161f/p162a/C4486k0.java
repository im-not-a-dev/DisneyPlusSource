package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.UUID;

/* renamed from: f.a.k0 */
public class C4486k0 implements C4611w0 {

    /* renamed from: a */
    final SharedPreferences f11124a;

    public C4486k0(Context context) {
        this.f11124a = context.getSharedPreferences("com.appboy.device", 0);
    }

    /* renamed from: b */
    static String m15529b() {
        return String.valueOf("android_id".hashCode());
    }

    /* renamed from: c */
    private boolean m15530c() {
        String str = "persistent_device_id";
        if (!this.f11124a.contains(str)) {
            return false;
        }
        return !m15529b().equals(this.f11124a.getString(str, ""));
    }

    /* renamed from: a */
    public String mo15647a() {
        String string = this.f11124a.getString("device_id", null);
        if (m15530c()) {
            string = null;
        }
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            m15528a(uuid);
            return uuid;
        }
        if (!this.f11124a.contains("persistent_device_id")) {
            m15528a(string);
        }
        return string;
    }

    /* renamed from: a */
    private void m15528a(String str) {
        Editor edit = this.f11124a.edit();
        edit.putString("device_id", str);
        edit.putString("persistent_device_id", m15529b());
        edit.apply();
    }
}
