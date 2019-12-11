package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public final class CredentialPickerConfig extends C9918a implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C9639j();

    /* renamed from: U */
    private final boolean f22590U;

    /* renamed from: V */
    private final boolean f22591V;

    /* renamed from: W */
    private final int f22592W;

    /* renamed from: c */
    private final int f22593c;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C9627a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f22594a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f22595b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f22596c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo24861a() {
            return new CredentialPickerConfig(this);
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f22593c = i;
        this.f22590U = z;
        this.f22591V = z2;
        int i3 = 3;
        if (i < 2) {
            if (!z3) {
                i3 = 1;
            }
            this.f22592W = i3;
            return;
        }
        this.f22592W = i2;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo24857c() {
        return this.f22592W == 3;
    }

    /* renamed from: d */
    public final boolean mo24858d() {
        return this.f22590U;
    }

    /* renamed from: e */
    public final boolean mo24859e() {
        return this.f22591V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30924a(parcel, 1, mo24858d());
        C9921c.m30924a(parcel, 2, mo24859e());
        C9921c.m30924a(parcel, 3, mo24857c());
        C9921c.m30913a(parcel, 4, this.f22592W);
        C9921c.m30913a(parcel, 1000, this.f22593c);
        C9921c.m30912a(parcel, a);
    }

    private CredentialPickerConfig(C9627a aVar) {
        this(2, aVar.f22594a, aVar.f22595b, false, aVar.f22596c);
    }
}
