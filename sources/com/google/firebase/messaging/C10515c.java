package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import java.util.Map;
import p096e.p113e.C3926a;

/* renamed from: com.google.firebase.messaging.c */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public final class C10515c extends C9918a {
    public static final Creator<C10515c> CREATOR = new C10527o();

    /* renamed from: U */
    private Map<String, String> f24910U;

    /* renamed from: c */
    Bundle f24911c;

    public C10515c(Bundle bundle) {
        this.f24911c = bundle;
    }

    /* renamed from: c */
    public final Map<String, String> mo27381c() {
        if (this.f24910U == null) {
            Bundle bundle = this.f24911c;
            C3926a aVar = new C3926a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f24910U = aVar;
        }
        return this.f24910U;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30915a(parcel, 2, this.f24911c, false);
        C9921c.m30912a(parcel, a);
    }
}
