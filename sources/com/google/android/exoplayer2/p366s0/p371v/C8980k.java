package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.s0.v.k */
/* compiled from: PsshAtomUtil */
public final class C8980k {

    /* renamed from: com.google.android.exoplayer2.s0.v.k$a */
    /* compiled from: PsshAtomUtil */
    private static class C8981a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f19658a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f19659b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final byte[] f19660c;

        public C8981a(UUID uuid, int i, byte[] bArr) {
            this.f19658a = uuid;
            this.f19659b = i;
            this.f19660c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m26491a(UUID uuid, byte[] bArr) {
        return m26492a(uuid, null, bArr);
    }

    /* renamed from: b */
    private static C8981a m26494b(byte[] bArr) {
        C9572w wVar = new C9572w(bArr);
        if (wVar.mo24690d() < 32) {
            return null;
        }
        wVar.mo24693e(0);
        if (wVar.mo24698i() != wVar.mo24679a() + 4 || wVar.mo24698i() != C8958c.f19464i0) {
            return null;
        }
        int c = C8958c.m26357c(wVar.mo24698i());
        if (c > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported pssh version: ");
            sb.append(c);
            Log.m29500d("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(wVar.mo24707r(), wVar.mo24707r());
        if (c == 1) {
            wVar.mo24695f(wVar.mo24715z() * 16);
        }
        int z = wVar.mo24715z();
        if (z != wVar.mo24679a()) {
            return null;
        }
        byte[] bArr2 = new byte[z];
        wVar.mo24685a(bArr2, 0, z);
        return new C8981a(uuid, c, bArr2);
    }

    /* renamed from: c */
    public static UUID m26495c(byte[] bArr) {
        C8981a b = m26494b(bArr);
        if (b == null) {
            return null;
        }
        return b.f19658a;
    }

    /* renamed from: d */
    public static int m26496d(byte[] bArr) {
        C8981a b = m26494b(bArr);
        if (b == null) {
            return -1;
        }
        return b.f19659b;
    }

    /* renamed from: a */
    public static byte[] m26492a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(C8958c.f19464i0);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: a */
    public static boolean m26490a(byte[] bArr) {
        return m26494b(bArr) != null;
    }

    /* renamed from: a */
    public static byte[] m26493a(byte[] bArr, UUID uuid) {
        C8981a b = m26494b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid == null || uuid.equals(b.f19658a)) {
            return b.f19660c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UUID mismatch. Expected: ");
        sb.append(uuid);
        sb.append(", got: ");
        sb.append(b.f19658a);
        sb.append(".");
        Log.m29500d("PsshAtomUtil", sb.toString());
        return null;
    }
}
