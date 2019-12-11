package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: androidx.work.impl.utils.e */
/* compiled from: Preferences */
public class C1138e {

    /* renamed from: a */
    private Context f4336a;

    /* renamed from: b */
    private SharedPreferences f4337b;

    public C1138e(Context context) {
        this.f4336a = context;
    }

    /* renamed from: b */
    private SharedPreferences m5917b() {
        SharedPreferences sharedPreferences;
        synchronized (C1138e.class) {
            if (this.f4337b == null) {
                this.f4337b = this.f4336a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f4337b;
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo5907a() {
        return m5917b().getBoolean("reschedule_needed", false);
    }

    /* renamed from: a */
    public void mo5906a(boolean z) {
        m5917b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
