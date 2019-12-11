package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.c */
public class C9822c extends DialogFragment {

    /* renamed from: U */
    private OnCancelListener f23028U = null;

    /* renamed from: c */
    private Dialog f23029c = null;

    /* renamed from: a */
    public static C9822c m30597a(Dialog dialog, OnCancelListener onCancelListener) {
        C9822c cVar = new C9822c();
        C9908u.m30854a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f23029c = dialog2;
        if (onCancelListener != null) {
            cVar.f23028U = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f23028U;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f23029c == null) {
            setShowsDialog(false);
        }
        return this.f23029c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
