package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.x */
abstract class C9960x extends C9958v {

    /* renamed from: c */
    private static final WeakReference<byte[]> f23233c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f23234b = f23233c;

    C9960x(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final byte[] mo25481j() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f23234b.get();
            if (bArr == null) {
                bArr = mo24995k();
                this.f23234b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract byte[] mo24995k();
}
