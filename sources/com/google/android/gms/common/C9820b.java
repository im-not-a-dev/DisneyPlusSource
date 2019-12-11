package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

/* renamed from: com.google.android.gms.common.b */
public final class C9820b extends C9918a {
    public static final Creator<C9820b> CREATOR = new C9933r();

    /* renamed from: X */
    public static final C9820b f23019X = new C9820b(0);

    /* renamed from: U */
    private final int f23020U;

    /* renamed from: V */
    private final PendingIntent f23021V;

    /* renamed from: W */
    private final String f23022W;

    /* renamed from: c */
    private final int f23023c;

    C9820b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f23023c = i;
        this.f23020U = i2;
        this.f23021V = pendingIntent;
        this.f23022W = str;
    }

    /* renamed from: c */
    public final int mo25270c() {
        return this.f23020U;
    }

    /* renamed from: d */
    public final String mo25271d() {
        return this.f23022W;
    }

    /* renamed from: e */
    public final PendingIntent mo25272e() {
        return this.f23021V;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9820b)) {
            return false;
        }
        C9820b bVar = (C9820b) obj;
        return this.f23020U == bVar.f23020U && C9901s.m30841a(this.f23021V, bVar.f23021V) && C9901s.m30841a(this.f23022W, bVar.f23022W);
    }

    /* renamed from: f */
    public final boolean mo25274f() {
        return (this.f23020U == 0 || this.f23021V == null) ? false : true;
    }

    /* renamed from: g */
    public final boolean mo25275g() {
        return this.f23020U == 0;
    }

    public final int hashCode() {
        return C9901s.m30839a(Integer.valueOf(this.f23020U), this.f23021V, this.f23022W);
    }

    public final String toString() {
        C9902a a = C9901s.m30840a((Object) this);
        a.mo25435a("statusCode", m30590f(this.f23020U));
        a.mo25435a("resolution", this.f23021V);
        a.mo25435a("message", this.f23022W);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f23023c);
        C9921c.m30913a(parcel, 2, mo25270c());
        C9921c.m30917a(parcel, 3, (Parcelable) mo25272e(), i, false);
        C9921c.m30922a(parcel, 4, mo25271d(), false);
        C9921c.m30912a(parcel, a);
    }

    /* renamed from: f */
    static String m30590f(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public C9820b(int i) {
        this(i, null, null);
    }

    public C9820b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C9820b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
