package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import java.util.List;

public class Credential extends C9918a implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C9637h();

    /* renamed from: U */
    private final String f22574U;

    /* renamed from: V */
    private final Uri f22575V;

    /* renamed from: W */
    private final List<IdToken> f22576W;

    /* renamed from: X */
    private final String f22577X;

    /* renamed from: Y */
    private final String f22578Y;

    /* renamed from: Z */
    private final String f22579Z;

    /* renamed from: a0 */
    private final String f22580a0;

    /* renamed from: c */
    private final String f22581c;

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C9626a {

        /* renamed from: a */
        private final String f22582a;

        /* renamed from: b */
        private String f22583b;

        /* renamed from: c */
        private Uri f22584c;

        /* renamed from: d */
        private List<IdToken> f22585d;

        /* renamed from: e */
        private String f22586e;

        /* renamed from: f */
        private String f22587f;

        /* renamed from: g */
        private String f22588g;

        /* renamed from: h */
        private String f22589h;

        public C9626a(String str) {
            this.f22582a = str;
        }

        /* renamed from: a */
        public C9626a mo24855a(String str) {
            this.f22586e = str;
            return this;
        }

        /* renamed from: a */
        public Credential mo24856a() {
            Credential credential = new Credential(this.f22582a, this.f22583b, this.f22584c, this.f22585d, this.f22586e, this.f22587f, this.f22588g, this.f22589h);
            return credential;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if ("https".equalsIgnoreCase(r0.getScheme()) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Credential(java.lang.String r5, java.lang.String r6, android.net.Uri r7, java.util.List<com.google.android.gms.auth.api.credentials.IdToken> r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            com.google.android.gms.common.internal.C9908u.m30854a(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.C9908u.m30855a(r5, r0)
            if (r9 == 0) goto L_0x0024
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password must not be empty if set"
            r5.<init>(r6)
            throw r5
        L_0x0024:
            if (r10 == 0) goto L_0x007e
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 != 0) goto L_0x006b
            android.net.Uri r0 = android.net.Uri.parse(r10)
            boolean r2 = r0.isAbsolute()
            if (r2 == 0) goto L_0x006b
            boolean r2 = r0.isHierarchical()
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x006b
            java.lang.String r2 = r0.getAuthority()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0052
            goto L_0x006b
        L_0x0052:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x006a
            java.lang.String r0 = r0.getScheme()
            java.lang.String r2 = "https"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r1 = 1
        L_0x006b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Account type must be a valid Http/Https URI"
            r5.<init>(r6)
            throw r5
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0093
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x008b
            goto L_0x0093
        L_0x008b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password and AccountType are mutually exclusive"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            if (r6 == 0) goto L_0x00a0
            java.lang.String r0 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a0
            r6 = 0
        L_0x00a0:
            r4.f22574U = r6
            r4.f22575V = r7
            if (r8 != 0) goto L_0x00ab
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x00af
        L_0x00ab:
            java.util.List r6 = java.util.Collections.unmodifiableList(r8)
        L_0x00af:
            r4.f22576W = r6
            r4.f22581c = r5
            r4.f22577X = r9
            r4.f22578Y = r10
            r4.f22579Z = r11
            r4.f22580a0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    public String mo24844c() {
        return this.f22578Y;
    }

    /* renamed from: d */
    public String mo24845d() {
        return this.f22580a0;
    }

    /* renamed from: e */
    public String mo24846e() {
        return this.f22579Z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f22581c, credential.f22581c) && TextUtils.equals(this.f22574U, credential.f22574U) && C9901s.m30841a(this.f22575V, credential.f22575V) && TextUtils.equals(this.f22577X, credential.f22577X) && TextUtils.equals(this.f22578Y, credential.f22578Y);
    }

    /* renamed from: f */
    public String mo24848f() {
        return this.f22581c;
    }

    /* renamed from: g */
    public List<IdToken> mo24849g() {
        return this.f22576W;
    }

    /* renamed from: h */
    public String mo24850h() {
        return this.f22574U;
    }

    public int hashCode() {
        return C9901s.m30839a(this.f22581c, this.f22574U, this.f22575V, this.f22577X, this.f22578Y);
    }

    /* renamed from: i */
    public String mo24852i() {
        return this.f22577X;
    }

    /* renamed from: j */
    public Uri mo24853j() {
        return this.f22575V;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30922a(parcel, 1, mo24848f(), false);
        C9921c.m30922a(parcel, 2, mo24850h(), false);
        C9921c.m30917a(parcel, 3, (Parcelable) mo24853j(), i, false);
        C9921c.m30930b(parcel, 4, mo24849g(), false);
        C9921c.m30922a(parcel, 5, mo24852i(), false);
        C9921c.m30922a(parcel, 6, mo24844c(), false);
        C9921c.m30922a(parcel, 9, mo24846e(), false);
        C9921c.m30922a(parcel, 10, mo24845d(), false);
        C9921c.m30912a(parcel, a);
    }
}
