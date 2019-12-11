package p163g.p449j.p482b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9916y;
import com.google.android.gms.common.util.C9950n;

/* renamed from: g.j.b.d */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class C11518d {

    /* renamed from: a */
    private final String f26925a;

    /* renamed from: b */
    private final String f26926b;

    /* renamed from: c */
    private final String f26927c;

    /* renamed from: d */
    private final String f26928d;

    /* renamed from: e */
    private final String f26929e;

    /* renamed from: f */
    private final String f26930f;

    /* renamed from: g */
    private final String f26931g;

    private C11518d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C9908u.m30865b(!C9950n.m31000a(str), "ApplicationId must be set.");
        this.f26926b = str;
        this.f26925a = str2;
        this.f26927c = str3;
        this.f26928d = str4;
        this.f26929e = str5;
        this.f26930f = str6;
        this.f26931g = str7;
    }

    /* renamed from: a */
    public static C11518d m37144a(Context context) {
        C9916y yVar = new C9916y(context);
        String a = yVar.mo25448a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C11518d dVar = new C11518d(a, yVar.mo25448a("google_api_key"), yVar.mo25448a("firebase_database_url"), yVar.mo25448a("ga_trackingId"), yVar.mo25448a("gcm_defaultSenderId"), yVar.mo25448a("google_storage_bucket"), yVar.mo25448a("project_id"));
        return dVar;
    }

    /* renamed from: b */
    public String mo29443b() {
        return this.f26929e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C11518d)) {
            return false;
        }
        C11518d dVar = (C11518d) obj;
        if (C9901s.m30841a(this.f26926b, dVar.f26926b) && C9901s.m30841a(this.f26925a, dVar.f26925a) && C9901s.m30841a(this.f26927c, dVar.f26927c) && C9901s.m30841a(this.f26928d, dVar.f26928d) && C9901s.m30841a(this.f26929e, dVar.f26929e) && C9901s.m30841a(this.f26930f, dVar.f26930f) && C9901s.m30841a(this.f26931g, dVar.f26931g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C9901s.m30839a(this.f26926b, this.f26925a, this.f26927c, this.f26928d, this.f26929e, this.f26930f, this.f26931g);
    }

    public String toString() {
        C9902a a = C9901s.m30840a((Object) this);
        a.mo25435a("applicationId", this.f26926b);
        a.mo25435a("apiKey", this.f26925a);
        a.mo25435a("databaseUrl", this.f26927c);
        a.mo25435a("gcmSenderId", this.f26929e);
        a.mo25435a("storageBucket", this.f26930f);
        a.mo25435a("projectId", this.f26931g);
        return a.toString();
    }

    /* renamed from: a */
    public String mo29442a() {
        return this.f26926b;
    }
}
