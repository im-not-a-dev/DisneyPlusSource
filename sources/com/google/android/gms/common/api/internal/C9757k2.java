package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C9820b;

/* renamed from: com.google.android.gms.common.api.internal.k2 */
final class C9757k2 implements C9748i1 {

    /* renamed from: a */
    private final /* synthetic */ C9749i2 f22893a;

    private C9757k2(C9749i2 i2Var) {
        this.f22893a = i2Var;
    }

    /* renamed from: a */
    public final void mo25190a(Bundle bundle) {
        this.f22893a.f22858m.lock();
        try {
            this.f22893a.m30308a(bundle);
            this.f22893a.f22855j = C9820b.f23019X;
            this.f22893a.m30322i();
        } finally {
            this.f22893a.f22858m.unlock();
        }
    }

    /* synthetic */ C9757k2(C9749i2 i2Var, C9753j2 j2Var) {
        this(i2Var);
    }

    /* renamed from: a */
    public final void mo25191a(C9820b bVar) {
        this.f22893a.f22858m.lock();
        try {
            this.f22893a.f22855j = bVar;
            this.f22893a.m30322i();
        } finally {
            this.f22893a.f22858m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25189a(int i, boolean z) {
        this.f22893a.f22858m.lock();
        try {
            if (!this.f22893a.f22857l && this.f22893a.f22856k != null) {
                if (this.f22893a.f22856k.mo25275g()) {
                    this.f22893a.f22857l = true;
                    this.f22893a.f22850e.mo25076b(i);
                    this.f22893a.f22858m.unlock();
                    return;
                }
            }
            this.f22893a.f22857l = false;
            this.f22893a.m30307a(i, z);
        } finally {
            this.f22893a.f22858m.unlock();
        }
    }
}
