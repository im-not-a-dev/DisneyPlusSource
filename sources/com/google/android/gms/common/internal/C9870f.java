package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C9870f implements OnClickListener {
    /* renamed from: a */
    public static C9870f m30767a(Activity activity, Intent intent, int i) {
        return new C9849b0(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25303a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo25303a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
