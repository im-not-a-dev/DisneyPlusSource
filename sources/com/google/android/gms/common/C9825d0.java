package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C9937a;
import com.google.android.gms.common.util.C9946j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.d0 */
class C9825d0 {

    /* renamed from: d */
    private static final C9825d0 f23033d = new C9825d0(true, null, null);

    /* renamed from: a */
    final boolean f23034a;

    /* renamed from: b */
    private final String f23035b;

    /* renamed from: c */
    private final Throwable f23036c;

    C9825d0(boolean z, String str, Throwable th) {
        this.f23034a = z;
        this.f23035b = str;
        this.f23036c = th;
    }

    /* renamed from: a */
    static C9825d0 m30602a(Callable<String> callable) {
        return new C9829f0(callable);
    }

    /* renamed from: c */
    static C9825d0 m30604c() {
        return f23033d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25292b() {
        if (!this.f23034a) {
            String str = "GoogleCertificatesRslt";
            if (Log.isLoggable(str, 3)) {
                if (this.f23036c != null) {
                    Log.d(str, mo25291a(), this.f23036c);
                    return;
                }
                Log.d(str, mo25291a());
            }
        }
    }

    /* renamed from: a */
    static C9825d0 m30600a(String str) {
        return new C9825d0(false, str, null);
    }

    /* renamed from: a */
    static C9825d0 m30601a(String str, Throwable th) {
        return new C9825d0(false, str, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo25291a() {
        return this.f23035b;
    }

    /* renamed from: a */
    static String m30603a(String str, C9958v vVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C9946j.m30986a(C9937a.m30963a("SHA-1").digest(vVar.mo25481j())), Boolean.valueOf(z), "12451009.false"});
    }
}
