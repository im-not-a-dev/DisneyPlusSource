package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;

/* renamed from: f.a.z0 */
public class C4637z0 implements C4628y0 {

    /* renamed from: c */
    private static final String f11574c = C1557c.m7461a(C4637z0.class);

    /* renamed from: a */
    private final C1489b f11575a;

    /* renamed from: b */
    final SharedPreferences f11576b;

    public C4637z0(Context context, C1489b bVar) {
        this.f11575a = bVar;
        this.f11576b = context.getSharedPreferences("com.appboy.push_registration", 0);
    }

    /* renamed from: b */
    private boolean m16143b() {
        return this.f11575a.mo6732y() || this.f11575a.mo6705A();
    }

    /* renamed from: a */
    public synchronized String mo15916a() {
        if (m16143b() && this.f11576b.contains("version_code") && this.f11575a.mo6731x() != this.f11576b.getInt("version_code", Integer.MIN_VALUE)) {
            return null;
        }
        if (this.f11576b.contains("device_identifier")) {
            if (!C4486k0.m15529b().equals(this.f11576b.getString("device_identifier", ""))) {
                C1557c.m7469c(f11574c, "Device identifier differs from saved device identifier. Returning null token.");
                return null;
            }
        }
        return this.f11576b.getString("registration_id", null);
    }

    /* renamed from: a */
    public synchronized void mo15917a(String str) {
        if (str != null) {
            Editor edit = this.f11576b.edit();
            edit.putString("registration_id", str);
            edit.putInt("version_code", this.f11575a.mo6731x());
            edit.putString("device_identifier", C4486k0.m15529b());
            edit.apply();
        } else {
            throw new NullPointerException();
        }
    }
}
