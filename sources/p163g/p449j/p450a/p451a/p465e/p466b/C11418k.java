package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.internal.C9912w;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: g.j.a.a.e.b.k */
public final class C11418k extends C9918a {
    public static final Creator<C11418k> CREATOR = new C11419l();

    /* renamed from: U */
    private final C9820b f26754U;

    /* renamed from: V */
    private final C9912w f26755V;

    /* renamed from: c */
    private final int f26756c;

    C11418k(int i, C9820b bVar, C9912w wVar) {
        this.f26756c = i;
        this.f26754U = bVar;
        this.f26755V = wVar;
    }

    /* renamed from: c */
    public final C9820b mo29239c() {
        return this.f26754U;
    }

    /* renamed from: d */
    public final C9912w mo29240d() {
        return this.f26755V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f26756c);
        C9921c.m30917a(parcel, 2, (Parcelable) this.f26754U, i, false);
        C9921c.m30917a(parcel, 3, (Parcelable) this.f26755V, i, false);
        C9921c.m30912a(parcel, a);
    }

    public C11418k(int i) {
        this(new C9820b(8, null), null);
    }

    private C11418k(C9820b bVar, C9912w wVar) {
        this(1, bVar, null);
    }
}
