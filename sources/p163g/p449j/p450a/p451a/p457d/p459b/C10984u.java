package p163g.p449j.p450a.p451a.p457d.p459b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: g.j.a.a.d.b.u */
public final class C10984u implements Creator<C10983t> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            if (C9919b.m30888a(a) != 1) {
                C9919b.m30910o(parcel, a);
            } else {
                credential = (Credential) C9919b.m30891a(parcel, a, Credential.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C10983t(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10983t[i];
    }
}
