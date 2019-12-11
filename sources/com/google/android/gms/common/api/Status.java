package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;

public final class Status extends C9918a implements C9810l, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C9819u();

    /* renamed from: X */
    public static final Status f22695X = new Status(0);

    /* renamed from: Y */
    public static final Status f22696Y = new Status(14);

    /* renamed from: Z */
    public static final Status f22697Z = new Status(8);

    /* renamed from: a0 */
    public static final Status f22698a0 = new Status(15);

    /* renamed from: b0 */
    public static final Status f22699b0 = new Status(16);

    /* renamed from: U */
    private final int f22700U;

    /* renamed from: V */
    private final String f22701V;

    /* renamed from: W */
    private final PendingIntent f22702W;

    /* renamed from: c */
    private final int f22703c;

    static {
        new Status(17);
        new Status(18);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f22703c = i;
        this.f22700U = i2;
        this.f22701V = str;
        this.f22702W = pendingIntent;
    }

    /* renamed from: a */
    public final void mo25005a(Activity activity, int i) throws SendIntentException {
        if (mo25008e()) {
            activity.startIntentSenderForResult(this.f22702W.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: c */
    public final int mo25006c() {
        return this.f22700U;
    }

    /* renamed from: d */
    public final String mo25007d() {
        return this.f22701V;
    }

    /* renamed from: e */
    public final boolean mo25008e() {
        return this.f22702W != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f22703c != status.f22703c || this.f22700U != status.f22700U || !C9901s.m30841a(this.f22701V, status.f22701V) || !C9901s.m30841a(this.f22702W, status.f22702W)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25010f() {
        return this.f22700U <= 0;
    }

    /* renamed from: g */
    public final String mo25011g() {
        String str = this.f22701V;
        if (str != null) {
            return str;
        }
        return C9694d.m30091a(this.f22700U);
    }

    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return C9901s.m30839a(Integer.valueOf(this.f22703c), Integer.valueOf(this.f22700U), this.f22701V, this.f22702W);
    }

    public final String toString() {
        C9902a a = C9901s.m30840a((Object) this);
        a.mo25435a("statusCode", mo25011g());
        a.mo25435a("resolution", this.f22702W);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, mo25006c());
        C9921c.m30922a(parcel, 2, mo25007d(), false);
        C9921c.m30917a(parcel, 3, (Parcelable) this.f22702W, i, false);
        C9921c.m30913a(parcel, 1000, this.f22703c);
        C9921c.m30912a(parcel, a);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}
