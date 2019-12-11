package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
final class C9742h0 implements C9700b, C9701c {

    /* renamed from: a */
    private final /* synthetic */ C9802y f22842a;

    private C9742h0(C9802y yVar) {
        this.f22842a = yVar;
    }

    /* renamed from: a */
    public final void mo25078a(C9820b bVar) {
        this.f22842a.f22992b.lock();
        try {
            if (this.f22842a.m30543a(bVar)) {
                this.f22842a.m30557g();
                this.f22842a.m30552e();
            } else {
                this.f22842a.m30545b(bVar);
            }
        } finally {
            this.f22842a.f22992b.unlock();
        }
    }

    /* renamed from: b */
    public final void mo25076b(int i) {
    }

    /* renamed from: b */
    public final void mo25077b(Bundle bundle) {
        if (this.f22842a.f23008r.mo25365k()) {
            this.f22842a.f22992b.lock();
            try {
                if (this.f22842a.f23001k != null) {
                    this.f22842a.f23001k.mo29223a(new C9734f0(this.f22842a));
                    this.f22842a.f22992b.unlock();
                }
            } finally {
                this.f22842a.f22992b.unlock();
            }
        } else {
            this.f22842a.f23001k.mo29223a(new C9734f0(this.f22842a));
        }
    }

    /* synthetic */ C9742h0(C9802y yVar, C9805z zVar) {
        this(yVar);
    }
}
