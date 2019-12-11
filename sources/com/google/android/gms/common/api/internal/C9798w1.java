package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C9817s;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.w1 */
final class C9798w1 implements DeathRecipient, C9801x1 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f22986a;

    /* renamed from: b */
    private final WeakReference<C9817s> f22987b;

    /* renamed from: c */
    private final WeakReference<IBinder> f22988c;

    private C9798w1(BasePendingResult<?> basePendingResult, C9817s sVar, IBinder iBinder) {
        this.f22987b = new WeakReference<>(sVar);
        this.f22986a = new WeakReference<>(basePendingResult);
        this.f22988c = new WeakReference<>(iBinder);
    }

    /* renamed from: a */
    public final void mo25252a(BasePendingResult<?> basePendingResult) {
        m30530a();
    }

    public final void binderDied() {
        m30530a();
    }

    /* renamed from: a */
    private final void m30530a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f22986a.get();
        C9817s sVar = (C9817s) this.f22987b.get();
        if (!(sVar == null || basePendingResult == null)) {
            sVar.mo25265a(basePendingResult.mo25090d().intValue());
        }
        IBinder iBinder = (IBinder) this.f22988c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ C9798w1(BasePendingResult basePendingResult, C9817s sVar, IBinder iBinder, C9795v1 v1Var) {
        this(basePendingResult, null, iBinder);
    }
}
