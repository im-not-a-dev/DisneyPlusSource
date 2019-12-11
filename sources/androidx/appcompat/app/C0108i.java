package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0530c;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: AppCompatDialogFragment */
public class C0108i extends C0530c {
    public Dialog onCreateDialog(Bundle bundle) {
        return new C0106h(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C0106h) {
            C0106h hVar = (C0106h) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            hVar.mo564a(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
