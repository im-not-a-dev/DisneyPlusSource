package com.bamtechmedia.dominguez.about.p052r;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.bamtechmedia.dominguez.about.r.e */
/* compiled from: GeneralDebugSettingFactory.kt */
public final class C2312e {
    /* renamed from: a */
    public static final void m8754a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", str).setType("text/plain").addFlags(268435456));
    }
}
