package com.bamtechmedia.dominguez.core.utils.p223t0;

import okhttp3.Call;
import okhttp3.Response;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;

/* renamed from: com.bamtechmedia.dominguez.core.utils.t0.a */
/* compiled from: CallExecuteSingle */
final class C5876a extends Single<Response> {

    /* renamed from: c */
    private final Call f13658c;

    /* renamed from: com.bamtechmedia.dominguez.core.utils.t0.a$a */
    /* compiled from: CallExecuteSingle */
    private static final class C5877a implements Disposable {

        /* renamed from: U */
        private volatile boolean f13659U;

        /* renamed from: c */
        private final Call f13660c;

        C5877a(Call call) {
            this.f13660c = call;
        }

        public void dispose() {
            this.f13659U = true;
            this.f13660c.cancel();
        }

        public boolean isDisposed() {
            return this.f13659U;
        }
    }

    C5876a(Call call) {
        this.f13658c = call;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17771b(p520io.reactivex.C11987u<? super okhttp3.Response> r6) {
        /*
            r5 = this;
            okhttp3.Call r0 = r5.f13658c
            okhttp3.Call r0 = r0.clone()
            com.bamtechmedia.dominguez.core.utils.t0.a$a r1 = new com.bamtechmedia.dominguez.core.utils.t0.a$a
            r1.<init>(r0)
            r6.onSubscribe(r1)
            r2 = 1
            r3 = 0
            okhttp3.Response r0 = r0.mo35726n0()     // Catch:{ all -> 0x0030 }
            boolean r4 = r1.isDisposed()     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0058
            boolean r4 = r0.mo35863f()     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x0024
            r6.onSuccess(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0058
        L_0x0024:
            com.bamtechmedia.dominguez.core.utils.t0.b r4 = new com.bamtechmedia.dominguez.core.utils.t0.b     // Catch:{ all -> 0x002d }
            r4.<init>(r0)     // Catch:{ all -> 0x002d }
            r6.onError(r4)     // Catch:{ all -> 0x002d }
            goto L_0x0058
        L_0x002d:
            r0 = move-exception
            r4 = 1
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r4 = 0
        L_0x0032:
            p520io.reactivex.p530x.C12003b.m38614b(r0)
            if (r4 == 0) goto L_0x003b
            p520io.reactivex.p523c0.C11915a.m38466b(r0)
            goto L_0x0058
        L_0x003b:
            boolean r1 = r1.isDisposed()
            if (r1 != 0) goto L_0x0058
            r6.onError(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0058
        L_0x0045:
            r6 = move-exception
            p520io.reactivex.p530x.C12003b.m38614b(r6)
            io.reactivex.x.a r1 = new io.reactivex.x.a
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r3] = r0
            r4[r2] = r6
            r1.<init>(r4)
            p520io.reactivex.p523c0.C11915a.m38466b(r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.utils.p223t0.C5876a.mo17771b(io.reactivex.u):void");
    }
}
