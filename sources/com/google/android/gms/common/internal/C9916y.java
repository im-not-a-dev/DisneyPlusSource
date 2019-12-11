package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C9924k;

/* renamed from: com.google.android.gms.common.internal.y */
public class C9916y {

    /* renamed from: a */
    private final Resources f23194a;

    /* renamed from: b */
    private final String f23195b = this.f23194a.getResourcePackageName(C9924k.common_google_play_services_unknown_issue);

    public C9916y(Context context) {
        C9908u.m30853a(context);
        this.f23194a = context.getResources();
    }

    /* renamed from: a */
    public String mo25448a(String str) {
        int identifier = this.f23194a.getIdentifier(str, "string", this.f23195b);
        if (identifier == 0) {
            return null;
        }
        return this.f23194a.getString(identifier);
    }
}
