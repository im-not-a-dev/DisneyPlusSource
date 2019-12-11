package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C9900r0;
import com.google.android.gms.common.internal.C9903s0;
import com.google.android.gms.common.internal.C9908u;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10957b;

/* renamed from: com.google.android.gms.common.v */
abstract class C9958v extends C9903s0 {

    /* renamed from: a */
    private int f23231a;

    protected C9958v(byte[] bArr) {
        C9908u.m30860a(bArr.length == 25);
        this.f23231a = Arrays.hashCode(bArr);
    }

    /* renamed from: b */
    protected static byte[] m31005b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final int mo25433e() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C9900r0)) {
            try {
                C9900r0 r0Var = (C9900r0) obj;
                if (r0Var.mo25433e() != hashCode()) {
                    return false;
                }
                C10954a g = r0Var.mo25434g();
                if (g == null) {
                    return false;
                }
                return Arrays.equals(mo25481j(), (byte[]) C10957b.m34644a(g));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final C10954a mo25434g() {
        return C10957b.m34643a(mo25481j());
    }

    public int hashCode() {
        return this.f23231a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public abstract byte[] mo25481j();
}
