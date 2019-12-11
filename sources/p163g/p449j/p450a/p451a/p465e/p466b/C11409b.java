package p163g.p449j.p450a.p451a.p465e.p466b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: g.j.a.a.e.b.b */
public final class C11409b extends C9918a implements C9810l {
    public static final Creator<C11409b> CREATOR = new C11410c();

    /* renamed from: U */
    private int f26749U;

    /* renamed from: V */
    private Intent f26750V;

    /* renamed from: c */
    private final int f26751c;

    C11409b(int i, int i2, Intent intent) {
        this.f26751c = i;
        this.f26749U = i2;
        this.f26750V = intent;
    }

    public final Status getStatus() {
        if (this.f26749U == 0) {
            return Status.f22695X;
        }
        return Status.f22699b0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f26751c);
        C9921c.m30913a(parcel, 2, this.f26749U);
        C9921c.m30917a(parcel, 3, (Parcelable) this.f26750V, i, false);
        C9921c.m30912a(parcel, a);
    }

    public C11409b() {
        this(0, null);
    }

    private C11409b(int i, Intent intent) {
        this(2, 0, null);
    }
}
