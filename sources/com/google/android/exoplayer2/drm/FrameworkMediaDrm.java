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
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.p366s0.p371v.C8980k;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(23)
public final class FrameworkMediaDrm implements ExoMediaDrm<FrameworkMediaCrypto> {

    /* renamed from: a */
    private final UUID f18473a;

    /* renamed from: b */
    private final MediaDrm f18474b;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        Assertions.m29300a(!C.COMMON_PSSH_UUID.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f18473a = uuid;
        this.f18474b = new MediaDrm(m25191a(uuid));
        if (C.WIDEVINE_UUID.equals(uuid) && m25196c()) {
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
                Log.m29500d(str, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
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
        Log.m29499c(str, "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: a */
    public void mo22778a(OnKeyStatusChangeListener<? super FrameworkMediaCrypto> aVar) {
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
    public static FrameworkMediaDrm m25194b(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    /* renamed from: c */
    private static boolean m25196c() {
        return "ASUS_Z00AD".equals(Util.MODEL);
    }

    /* renamed from: a */
    public /* synthetic */ void mo22791a(OnKeyStatusChangeListener aVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        aVar.onKeyStatusChange(this, bArr, i, i2, bArr2);
    }

    /* renamed from: a */
    public KeyRequest mo22775a(byte[] bArr, List<SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        SchemeData bVar = null;
        if (list != null) {
            bVar = m25189a(this.f18473a, list);
            UUID uuid = this.f18473a;
            byte[] bArr3 = bVar.f18466X;
            Assertions.checkNotNull(bArr3);
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
        if (C.CLEARKEY_UUID.equals(this.f18473a)) {
            bArr2 = ClearKeyUtil.m25221b(bArr2);
        }
        return this.f18474b.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: b */
    public FrameworkMediaCrypto m25207b(byte[] bArr) throws MediaCryptoException {
        boolean z;
        if (Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(this.f18473a)) {
            if ("L3".equals(mo22790a("securityLevel"))) {
                z = true;
                return new FrameworkMediaCrypto(m25191a(this.f18473a), bArr, z);
            }
        }
        z = false;
        return new FrameworkMediaCrypto(m25191a(this.f18473a), bArr, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if ("AFTM".equals(com.google.android.exoplayer2.util.Util.MODEL) != false) goto L_0x0058;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m25195b(java.util.UUID r2, byte[] r3) {
        /*
            java.util.UUID r0 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001a
            byte[] r0 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26493a(r3, r2)
            if (r0 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            java.util.UUID r0 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            byte[] r3 = m25197e(r3)
            byte[] r3 = com.google.android.exoplayer2.p366s0.p371v.C8980k.m26491a(r0, r3)
        L_0x001a:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0028
            java.util.UUID r0 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0058
        L_0x0028:
            java.util.UUID r0 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
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
    private static SchemeData m25189a(UUID uuid, List<SchemeData> list) {
        boolean z;
        if (!C.WIDEVINE_UUID.equals(uuid)) {
            return (SchemeData) list.get(0);
        }
        if (Util.SDK_INT >= 28 && list.size() > 1) {
            SchemeData bVar = (SchemeData) list.get(0);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                SchemeData bVar2 = (SchemeData) list.get(i);
                byte[] bArr = bVar2.f18466X;
                Util.castNonNull(bArr);
                byte[] bArr2 = bArr;
                if (bVar2.f18467Y != bVar.f18467Y || !Util.m29414a((Object) bVar2.f18465W, (Object) bVar.f18465W) || !Util.m29414a((Object) bVar2.f18464V, (Object) bVar.f18464V) || !C8980k.m26490a(bArr2)) {
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
                    byte[] bArr4 = ((SchemeData) list.get(i4)).f18466X;
                    Util.castNonNull(bArr4);
                    byte[] bArr5 = bArr4;
                    int length = bArr5.length;
                    System.arraycopy(bArr5, 0, bArr3, i3, length);
                    i3 += length;
                }
                return bVar.mo22761a(bArr3);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            SchemeData bVar3 = (SchemeData) list.get(i5);
            byte[] bArr6 = bVar3.f18466X;
            Util.castNonNull(bArr6);
            int d = C8980k.m26496d(bArr6);
            if (Util.SDK_INT < 23 && d == 0) {
                return bVar3;
            }
            if (Util.SDK_INT >= 23 && d == 1) {
                return bVar3;
            }
        }
        return (SchemeData) list.get(0);
    }

    /* renamed from: a */
    private static UUID m25191a(UUID uuid) {
        return (Util.SDK_INT >= 27 || !C.CLEARKEY_UUID.equals(uuid)) ? uuid : C.COMMON_PSSH_UUID;
    }

    /* renamed from: a */
    private static String m25190a(UUID uuid, String str) {
        return (Util.SDK_INT >= 26 || !C.CLEARKEY_UUID.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    /* renamed from: a */
    private static byte[] m25193a(UUID uuid, byte[] bArr) {
        return C.CLEARKEY_UUID.equals(uuid) ? ClearKeyUtil.m25219a(bArr) : bArr;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private static void m25192a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
}
