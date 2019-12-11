package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.api.h */
public final class C9704h {

    /* renamed from: com.google.android.gms.common.api.h$a */
    private static final class C9705a<R extends C9810l> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f22739q;

        public C9705a(C9698f fVar, R r) {
            super(fVar);
            this.f22739q = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final R mo24966a(Status status) {
            return this.f22739q;
        }
    }

    /* renamed from: a */
    public static <R extends C9810l> C9702g<R> m30133a(R r, C9698f fVar) {
        C9908u.m30854a(r, (Object) "Result must not be null");
        C9908u.m30861a(!r.getStatus().mo25010f(), (Object) "Status code must not be SUCCESS");
        C9705a aVar = new C9705a(fVar, r);
        aVar.mo25086a(r);
        return aVar;
    }
}
