package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.i */
public final class C10073i extends C9918a implements Iterable<String> {
    public static final Creator<C10073i> CREATOR = new C10095k();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Bundle f23527c;

    C10073i(Bundle bundle) {
        this.f23527c = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo25783a(String str) {
        return this.f23527c.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo25784b(String str) {
        return Long.valueOf(this.f23527c.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo25786c(String str) {
        return this.f23527c.getString(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Double mo25787d(String str) {
        return Double.valueOf(this.f23527c.getDouble(str));
    }

    public final Iterator<String> iterator() {
        return new C10062h(this);
    }

    public final int size() {
        return this.f23527c.size();
    }

    public final String toString() {
        return this.f23527c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30915a(parcel, 2, mo25785c(), false);
        C9921c.m30912a(parcel, a);
    }

    /* renamed from: c */
    public final Bundle mo25785c() {
        return new Bundle(this.f23527c);
    }
}
