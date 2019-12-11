package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C9832i;

/* renamed from: com.google.android.gms.ads.identifier.b */
public final class C9624b {

    /* renamed from: a */
    private SharedPreferences f22573a;

    public C9624b(Context context) {
        try {
            Context c = C9832i.m30632c(context);
            this.f22573a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f22573a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo24841a(String str, float f) {
        try {
            if (this.f22573a == null) {
                return 0.0f;
            }
            return this.f22573a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo24842a(String str, String str2) {
        try {
            return this.f22573a == null ? str2 : this.f22573a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo24843a(String str, boolean z) {
        try {
            if (this.f22573a == null) {
                return false;
            }
            return this.f22573a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
