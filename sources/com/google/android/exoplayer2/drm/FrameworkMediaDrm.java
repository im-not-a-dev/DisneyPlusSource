package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.drm.ExoMediaDrm.C8695a;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.p366s0.p371v.C8980k;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(23)
public final class FrameworkMediaDrm implements ExoMediaDrm<C8713o> {

    /* renamed from: a */
    private final UUID f18473a;

    /* renamed from: b */
    private final MediaDrm f18474b;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        C9537e.m29296a(uuid);
        C9537e.m29300a(!C8883r.f19043b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f18473a = uuid;
        this.f18474b = new MediaDrm(m25191a(uuid));
        if (C8883r.f19045d.equals(uuid) && m25196c()) {
            m25192a(this.f18474b);
        }
    }

    /* renamed from: e */
    private static byte[] m25197e(byte[] bArr) {
        C9572w wVar = new C9572w(bArr);
        int l = wVar.mo24701l();
        short n = wVar.mo24703n();
        short n2 = wVar.mo24703n();
        String str = "FrameworkMediaDrm";
        if (n == 1 && n2 == 1) {
            String str2 = "UTF-16LE";
            String a = wVar.mo24681a((int) wVar.mo24703n(), Charset.forName(str2));
            if (a.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a.indexOf("</DATA>");
            if (indexOf == -1) {
                C9563q.m29500d(str, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, indexOf));
            sb.append("<LA_URL>https://x</LA_URL>");
            sb.append(a.substring(indexOf));
            String sb2 = sb.toString();
            int i = l + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) n);
            allocate.putShort((short) n2);
            allocate.putShort((short) (sb2.length() * 2));
            allocate.put(sb2.getBytes(Charset.forName(str2)));
            return allocate.array();
        }
        C9563q.m29499c(str, "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: a */
    public void mo22778a(C8695a<? super C8713o> aVar) {
        this.f18474b.setOnEventListener(aVar == null ? null : new C8699d(this, aVar));
    }

    /* renamed from: c */
    public void mo22784c(byte[] bArr) {
        this.f18474b.closeSession(bArr);
    }

    /* renamed from: d */
    public void mo22785d(byte[] bArr) throws DeniedByServerException {
        this.f18474b.provideProvisionResponse(bArr);
    }

    /* renamed from: b */
    public static FrameworkMediaDrm m25194b(UUID uuid) throws C8716r {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C8716r(1, e);
        } catch (Exception e2) {
            throw new C8716r(2, e2);
        }
    }

    /* renamed from: c */
    private static boolean m25196c() {
        return "ASUS_Z00AD".equals(C9554k0.f22284d);
    }

    /* renamed from: a */
    public /* synthetic */ void mo22791a(C8695a aVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        aVar.mo22747a(this, bArr, i, i2, bArr2);
    }

    /* renamed from: a */
    public KeyRequest mo22775a(byte[] bArr, List<C8692b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        C8692b bVar = null;
        if (list != null) {
            bVar = m25189a(this.f18473a, list);
            UUID uuid = this.f18473a;
            byte[] bArr3 = bVar.f18466X;
            C9537e.m29296a(bArr3);
            bArr2 = m25195b(uuid, bArr3);
            str = m25190a(this.f18473a, bVar.f18465W);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f18474b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] a = m25193a(this.f18473a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f18464V)) {
            defaultUrl = bVar.f18464V;
        }
        return new KeyRequest(a, defaultUrl);
    }

    /* renamed from: b */
    public byte[] mo22782b() throws MediaDrmException {
        return this.f18474b.openSession();
    }

    /* renamed from: b */
    public byte[] mo22783b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C8883r.f19044c.equals(this.f18473a)) {
            bArr2 = C8703h.m25221b(bArr2);
        }
        return this.f18474b.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: b */
    public C8713o m25207b(byte[] bArr) throws MediaCryptoException {
        boolean z;
        if (C9554k0.f22281a < 21 && C8883r.f19045d.equals(this.f18473a)) {
            if ("L3".equals(mo22790a("securityLevel"))) {
                z = true;
                return new C8713o(m25191a(this.f18473a), bArr, z);
            }
        }
        z = false;
        return new C8713o(m25191a(this.f18473a), bArr, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if ("AFTM".equals(com.google.android.exoplayer2.p393v0.C9554k0.f22284d) != false) goto L_0x0058;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m25195b(java.util.UUID r2, byte[] r3) {
        /*
            java.util.UUID r0 = com.google.android.exoplayer2.C8883r.f19046e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001a
            byte[] r0 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26493a(r3, r2)
            if (r0 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            java.util.UUID r0 = com.google.android.exoplayer2.C8883r.f19046e
            byte[] r3 = m25197e(r3)
            byte[] r3 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26491a(r0, r3)
        L_0x001a:
            int r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r1 = 21
            if (r0 >= r1) goto L_0x0028
            java.util.UUID r0 = com.google.android.exoplayer2.C8883r.f19045d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0058
        L_0x0028:
            java.util.UUID r0 = com.google.android.exoplayer2.C8883r.f19046e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22283c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22284d
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22284d
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22284d
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r2 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26493a(r3, r2)
            if (r2 == 0) goto L_0x005f
            return r2
        L_0x005f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.FrameworkMediaDrm.m25195b(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: a */
    public ProvisionRequest mo22776a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f18474b.getProvisionRequest();
        return new ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: a */
    public Map<String, String> mo22777a(byte[] bArr) {
        return this.f18474b.queryKeyStatus(bArr);
    }

    /* renamed from: a */
    public void mo22780a(byte[] bArr, byte[] bArr2) {
        this.f18474b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: a */
    public String mo22790a(String str) {
        return this.f18474b.getPropertyString(str);
    }

    /* renamed from: a */
    public void mo22779a(String str, String str2) {
        this.f18474b.setPropertyString(str, str2);
    }

    /* renamed from: a */
    private static C8692b m25189a(UUID uuid, List<C8692b> list) {
        boolean z;
        if (!C8883r.f19045d.equals(uuid)) {
            return (C8692b) list.get(0);
        }
        if (C9554k0.f22281a >= 28 && list.size() > 1) {
            C8692b bVar = (C8692b) list.get(0);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                C8692b bVar2 = (C8692b) list.get(i);
                byte[] bArr = bVar2.f18466X;
                C9554k0.m29394a(bArr);
                byte[] bArr2 = bArr;
                if (bVar2.f18467Y != bVar.f18467Y || !C9554k0.m29414a((Object) bVar2.f18465W, (Object) bVar.f18465W) || !C9554k0.m29414a((Object) bVar2.f18464V, (Object) bVar.f18464V) || !C8980k.m26490a(bArr2)) {
                    z = false;
                } else {
                    i2 += bArr2.length;
                    i++;
                }
            }
            z = false;
            if (z) {
                byte[] bArr3 = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr4 = ((C8692b) list.get(i4)).f18466X;
                    C9554k0.m29394a(bArr4);
                    byte[] bArr5 = bArr4;
                    int length = bArr5.length;
                    System.arraycopy(bArr5, 0, bArr3, i3, length);
                    i3 += length;
                }
                return bVar.mo22761a(bArr3);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C8692b bVar3 = (C8692b) list.get(i5);
            byte[] bArr6 = bVar3.f18466X;
            C9554k0.m29394a(bArr6);
            int d = C8980k.m26496d(bArr6);
            if (C9554k0.f22281a < 23 && d == 0) {
                return bVar3;
            }
            if (C9554k0.f22281a >= 23 && d == 1) {
                return bVar3;
            }
        }
        return (C8692b) list.get(0);
    }

    /* renamed from: a */
    private static UUID m25191a(UUID uuid) {
        return (C9554k0.f22281a >= 27 || !C8883r.f19044c.equals(uuid)) ? uuid : C8883r.f19043b;
    }

    /* renamed from: a */
    private static String m25190a(UUID uuid, String str) {
        return (C9554k0.f22281a >= 26 || !C8883r.f19044c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    /* renamed from: a */
    private static byte[] m25193a(UUID uuid, byte[] bArr) {
        return C8883r.f19044c.equals(uuid) ? C8703h.m25219a(bArr) : bArr;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private static void m25192a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
}
