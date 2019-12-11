package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C9886m.C9887a;

/* renamed from: com.google.android.gms.common.internal.a */
public class C9833a extends C9887a {
    /* renamed from: a */
    public static Account m30637a(C9886m mVar) {
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mVar.getAccount();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
