package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.p033s.C1557c;

/* renamed from: f.a.q0 */
public class C4555q0 {

    /* renamed from: e */
    private static final String f11337e = C1557c.m7461a(C4555q0.class);

    /* renamed from: a */
    final SharedPreferences f11338a;

    /* renamed from: b */
    private final C4424d3 f11339b;

    /* renamed from: c */
    final C4419d f11340c;

    /* renamed from: d */
    boolean f11341d = false;

    public C4555q0(Context context, C4419d dVar, C4424d3 d3Var) {
        this.f11340c = dVar;
        this.f11339b = d3Var;
        this.f11338a = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15789a() {
        if (mo15791c()) {
            C1557c.m7458a(f11337e, "Publishing new messaging session event.");
            this.f11340c.mo15485a(C4485k.f11123a, C4485k.class);
            this.f11341d = true;
            return;
        }
        C1557c.m7458a(f11337e, "Messaging session not started.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15790b() {
        long a = C4472i3.m15480a();
        String str = f11337e;
        StringBuilder sb = new StringBuilder();
        sb.append("Messaging session stopped. Adding new messaging session timestamp: ");
        sb.append(a);
        C1557c.m7458a(str, sb.toString());
        this.f11338a.edit().putLong("messaging_session_timestamp", a).apply();
        this.f11341d = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo15791c() {
        long f = this.f11339b.mo15502f();
        if (f == -1 || this.f11341d) {
            return false;
        }
        long j = this.f11338a.getLong("messaging_session_timestamp", -1);
        long a = C4472i3.m15480a();
        String str = f11337e;
        StringBuilder sb = new StringBuilder();
        sb.append("Messaging session timeout: ");
        sb.append(f);
        sb.append(", current diff: ");
        sb.append(a - j);
        C1557c.m7458a(str, sb.toString());
        if (j + f < a) {
            return true;
        }
        return false;
    }
}
