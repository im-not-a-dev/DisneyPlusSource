package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p096e.p113e.C3926a;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.google.firebase.iid.t */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10499t {

    /* renamed from: a */
    private final SharedPreferences f24880a;

    /* renamed from: b */
    private final Context f24881b;

    /* renamed from: c */
    private final C10496r0 f24882c;

    /* renamed from: d */
    private final Map<String, C10500t0> f24883d;

    public C10499t(Context context) {
        this(context, new C10496r0());
    }

    /* renamed from: c */
    private final synchronized boolean m33128c() {
        return this.f24880a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized String mo27342a() {
        return this.f24880a.getString("topic_operation_queue", "");
    }

    /* renamed from: b */
    public final synchronized void mo27346b() {
        this.f24883d.clear();
        C10496r0.m33109a(this.f24881b);
        this.f24880a.edit().clear().commit();
    }

    private C10499t(Context context, C10496r0 r0Var) {
        String str = "FirebaseInstanceId";
        this.f24883d = new C3926a();
        this.f24881b = context;
        this.f24880a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f24882c = r0Var;
        File file = new File(C4025a.m13796b(this.f24881b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m33128c()) {
                    Log.i(str, "App restored, clearing state");
                    mo27346b();
                    FirebaseInstanceId.getInstance().zze();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: c */
    private static String m33127c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo27343a(String str) {
        this.f24880a.edit().putString("topic_operation_queue", str).apply();
    }

    /* renamed from: c */
    public final synchronized void mo27348c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f24880a.edit();
        for (String str2 : this.f24880a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: a */
    static String m33126a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized C10497s mo27341a(String str, String str2, String str3) {
        return C10497s.m33123b(this.f24880a.getString(m33127c(str, str2, str3), null));
    }

    /* renamed from: b */
    public final synchronized void mo27347b(String str, String str2, String str3) {
        String c = m33127c(str, str2, str3);
        Editor edit = this.f24880a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: a */
    public final synchronized void mo27344a(String str, String str2, String str3, String str4, String str5) {
        String a = C10497s.m33122a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f24880a.edit();
            edit.putString(m33127c(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized C10500t0 mo27345b(String str) {
        C10500t0 t0Var;
        C10500t0 t0Var2 = (C10500t0) this.f24883d.get(str);
        if (t0Var2 != null) {
            return t0Var2;
        }
        try {
            t0Var = this.f24882c.mo27337a(this.f24881b, str);
        } catch (C10502u0 unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.getInstance().zze();
            t0Var = this.f24882c.mo27338b(this.f24881b, str);
        }
        this.f24883d.put(str, t0Var);
        return t0Var;
    }
}
