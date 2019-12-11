package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p033s.C1563i;

/* renamed from: f.a.i6 */
public class C4475i6 {

    /* renamed from: a */
    private final SharedPreferences f11106a;

    public C4475i6(Context context) {
        this.f11106a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
    }

    /* renamed from: a */
    public String mo15626a() {
        return this.f11106a.getString("last_user", "");
    }

    /* renamed from: a */
    public void mo15627a(String str) {
        C1563i.m7485a(str);
        Editor edit = this.f11106a.edit();
        edit.putString("last_user", str);
        edit.apply();
    }
}
