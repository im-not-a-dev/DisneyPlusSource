package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: g.j.a.a.d.b.t */
public final class C10983t extends C9918a {
    public static final Creator<C10983t> CREATOR = new C10984u();

    /* renamed from: c */
    private final Credential f26022c;

    public C10983t(Credential credential) {
        this.f26022c = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30917a(parcel, 1, (Parcelable) this.f26022c, i, false);
        C9921c.m30912a(parcel, a);
    }
}
