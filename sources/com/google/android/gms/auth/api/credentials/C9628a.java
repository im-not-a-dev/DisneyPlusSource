package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C9627a;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.auth.api.credentials.a */
public final class C9628a extends C9918a {
    public static final Creator<C9628a> CREATOR = new C9641l();

    /* renamed from: U */
    private final boolean f22599U;

    /* renamed from: V */
    private final String[] f22600V;

    /* renamed from: W */
    private final CredentialPickerConfig f22601W;

    /* renamed from: X */
    private final CredentialPickerConfig f22602X;

    /* renamed from: Y */
    private final boolean f22603Y;

    /* renamed from: Z */
    private final String f22604Z;

    /* renamed from: a0 */
    private final String f22605a0;

    /* renamed from: b0 */
    private final boolean f22606b0;

    /* renamed from: c */
    private final int f22607c;

    /* renamed from: com.google.android.gms.auth.api.credentials.a$a */
    public static final class C9629a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f22608a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f22609b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CredentialPickerConfig f22610c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f22611d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f22612e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f22613f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f22614g;

        /* renamed from: a */
        public final C9629a mo24874a(boolean z) {
            this.f22608a = z;
            return this;
        }

        /* renamed from: a */
        public final C9628a mo24875a() {
            if (this.f22609b == null) {
                this.f22609b = new String[0];
            }
            if (this.f22608a || this.f22609b.length != 0) {
                return new C9628a(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    C9628a(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f22607c = i;
        this.f22599U = z;
        C9908u.m30853a(strArr);
        this.f22600V = strArr;
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C9627a().mo24861a();
        }
        this.f22601W = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C9627a().mo24861a();
        }
        this.f22602X = credentialPickerConfig2;
        if (i < 3) {
            this.f22603Y = true;
            this.f22604Z = null;
            this.f22605a0 = null;
        } else {
            this.f22603Y = z2;
            this.f22604Z = str;
            this.f22605a0 = str2;
        }
        this.f22606b0 = z3;
    }

    /* renamed from: c */
    public final String[] mo24866c() {
        return this.f22600V;
    }

    /* renamed from: d */
    public final CredentialPickerConfig mo24867d() {
        return this.f22602X;
    }

    /* renamed from: e */
    public final CredentialPickerConfig mo24868e() {
        return this.f22601W;
    }

    /* renamed from: f */
    public final String mo24869f() {
        return this.f22605a0;
    }

    /* renamed from: g */
    public final String mo24870g() {
        return this.f22604Z;
    }

    /* renamed from: h */
    public final boolean mo24871h() {
        return this.f22603Y;
    }

    /* renamed from: i */
    public final boolean mo24872i() {
        return this.f22599U;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30924a(parcel, 1, mo24872i());
        C9921c.m30926a(parcel, 2, mo24866c(), false);
        C9921c.m30917a(parcel, 3, (Parcelable) mo24868e(), i, false);
        C9921c.m30917a(parcel, 4, (Parcelable) mo24867d(), i, false);
        C9921c.m30924a(parcel, 5, mo24871h());
        C9921c.m30922a(parcel, 6, mo24870g(), false);
        C9921c.m30922a(parcel, 7, mo24869f(), false);
        C9921c.m30913a(parcel, 1000, this.f22607c);
        C9921c.m30924a(parcel, 8, this.f22606b0);
        C9921c.m30912a(parcel, a);
    }

    private C9628a(C9629a aVar) {
        this(4, aVar.f22608a, aVar.f22609b, aVar.f22610c, aVar.f22611d, aVar.f22612e, aVar.f22613f, aVar.f22614g, false);
    }
}
