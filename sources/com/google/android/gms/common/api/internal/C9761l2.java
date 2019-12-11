package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C9820b;

/* renamed from: com.google.android.gms.common.api.internal.l2 */
final class C9761l2 implements C9748i1 {

    /* renamed from: a */
    private final /* synthetic */ C9749i2 f22895a;

    private C9761l2(C9749i2 i2Var) {
        this.f22895a = i2Var;
    }

    /* renamed from: a */
    public final void mo25190a(Bundle bundle) {
        this.f22895a.f22858m.lock();
        try {
            this.f22895a.f22856k = C9820b.f23019X;
            this.f22895a.m30322i();
        } finally {
            this.f22895a.f22858m.unlock();
        }
    }

    /* synthetic */ C9761l2(C9749i2 i2Var, C9753j2 j2Var) {
        this(i2Var);
    }

    /* renamed from: a */
    public final void mo25191a(C9820b bVar) {
        this.f22895a.f22858m.lock();
        try {
            this.f22895a.f22856k = bVar;
            this.f22895a.m30322i();
        } finally {
            this.f22895a.f22858m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25189a(int i, boolean z) {
        this.f22895a.f22858m.lock();
        try {
            if (this.f22895a.f22857l) {
                this.f22895a.f22857l = false;
                this.f22895a.m30307a(i, z);
                return;
            }
            this.f22895a.f22857l = true;
            this.f22895a.f22849d.mo25076b(i);
            this.f22895a.f22858m.unlock();
        } finally {
            this.f22895a.f22858m.unlock();
        }
    }
}
