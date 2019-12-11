package p163g.p449j.p450a.p451a.p457d.p459b;

import com.google.android.gms.auth.api.credentials.C9631c;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: g.j.a.a.d.b.e */
public final class C10968e implements C9631c {

    /* renamed from: U */
    private final Credential f26013U;

    /* renamed from: c */
    private final Status f26014c;

    public C10968e(Status status, Credential credential) {
        this.f26014c = status;
        this.f26013U = credential;
    }

    /* renamed from: a */
    public static C10968e m34662a(Status status) {
        return new C10968e(status, null);
    }

    /* renamed from: b */
    public final Credential mo24877b() {
        return this.f26013U;
    }

    public final Status getStatus() {
        return this.f26014c;
    }
}
