package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.f0 */
final class C9829f0 extends C9825d0 {

    /* renamed from: e */
    private final Callable<String> f23039e;

    private C9829f0(Callable<String> callable) {
        super(false, null, null);
        this.f23039e = callable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo25291a() {
        try {
            return (String) this.f23039e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
