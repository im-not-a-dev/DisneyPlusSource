package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import androidx.fragment.app.C0530c;
import androidx.fragment.app.C0538i;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.l */
public class C9925l extends C0530c {

    /* renamed from: U */
    private OnCancelListener f23198U = null;

    /* renamed from: c */
    private Dialog f23199c = null;

    /* renamed from: a */
    public static C9925l m30938a(Dialog dialog, OnCancelListener onCancelListener) {
        C9925l lVar = new C9925l();
        C9908u.m30854a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f23199c = dialog2;
        if (onCancelListener != null) {
            lVar.f23198U = onCancelListener;
        }
        return lVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f23198U;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f23199c == null) {
            setShowsDialog(false);
        }
        return this.f23199c;
    }

    public void show(C0538i iVar, String str) {
        super.show(iVar, str);
    }
}
