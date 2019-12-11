package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C9692b;
import com.google.android.gms.common.api.C9808j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public class C9848b {
    /* renamed from: a */
    public static C9692b m30651a(Status status) {
        if (status.mo25008e()) {
            return new C9808j(status);
        }
        return new C9692b(status);
    }
}
