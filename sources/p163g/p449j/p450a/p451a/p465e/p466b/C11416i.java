package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9910v;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: g.j.a.a.e.b.i */
public final class C11416i extends C9918a {
    public static final Creator<C11416i> CREATOR = new C11417j();

    /* renamed from: U */
    private final C9910v f26752U;

    /* renamed from: c */
    private final int f26753c;

    C11416i(int i, C9910v vVar) {
        this.f26753c = i;
        this.f26752U = vVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f26753c);
        C9921c.m30917a(parcel, 2, (Parcelable) this.f26752U, i, false);
        C9921c.m30912a(parcel, a);
    }

    public C11416i(C9910v vVar) {
        this(1, vVar);
    }
}
