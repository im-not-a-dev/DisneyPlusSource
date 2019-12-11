package com.google.android.exoplayer2.metadata.p359j;

import com.facebook.stetho.common.Utf8Charset;
import com.google.android.exoplayer2.metadata.C8739b;
import com.google.android.exoplayer2.metadata.C8742d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.metadata.j.h */
/* compiled from: Id3Decoder */
public final class C8770h implements C8739b {

    /* renamed from: b */
    public static final int f18621b = C9554k0.m29428b("ID3");

    /* renamed from: a */
    private final C8771a f18622a;

    /* renamed from: com.google.android.exoplayer2.metadata.j.h$a */
    /* compiled from: Id3Decoder */
    public interface C8771a {
        /* renamed from: a */
        boolean mo22913a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.j.h$b */
    /* compiled from: Id3Decoder */
    private static final class C8772b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f18623a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f18624b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f18625c;

        public C8772b(int i, boolean z, int i2) {
            this.f18623a = i;
            this.f18624b = z;
            this.f18625c = i2;
        }
    }

    static {
        C8757a aVar = C8757a.f18597a;
    }

    public C8770h() {
        this(null);
    }

    /* renamed from: a */
    private static int m25393a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static C8780m m25408b(C9572w wVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int v = wVar.mo24711v();
        String b = m25409b(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.mo24685a(bArr, 0, i2);
        return new C8780m(str, null, new String(bArr, 0, m25405b(bArr, 0, v), b));
    }

    /* renamed from: b */
    private static String m25409b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : Utf8Charset.NAME : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: b */
    static /* synthetic */ boolean m25410b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: c */
    private static C8782n m25412c(C9572w wVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        wVar.mo24685a(bArr, 0, i);
        return new C8782n(str, null, new String(bArr, 0, m25404b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: d */
    private static C8778l m25413d(C9572w wVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        wVar.mo24685a(bArr, 0, i);
        int b = m25404b(bArr, 0);
        return new C8778l(new String(bArr, 0, b, "ISO-8859-1"), m25403a(bArr, b + 1, bArr.length));
    }

    /* renamed from: e */
    private static C8780m m25414e(C9572w wVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int v = wVar.mo24711v();
        String b = m25409b(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.mo24685a(bArr, 0, i2);
        int b2 = m25405b(bArr, 0, v);
        String str = new String(bArr, 0, b2, b);
        int a = b2 + m25393a(v);
        return new C8780m("TXXX", str, m25401a(bArr, a, m25405b(bArr, a, v), b));
    }

    /* renamed from: f */
    private static C8782n m25415f(C9572w wVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int v = wVar.mo24711v();
        String b = m25409b(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.mo24685a(bArr, 0, i2);
        int b2 = m25405b(bArr, 0, v);
        String str = new String(bArr, 0, b2, b);
        int a = b2 + m25393a(v);
        return new C8782n("WXXX", str, m25401a(bArr, a, m25404b(bArr, a), "ISO-8859-1"));
    }

    /* renamed from: g */
    private static int m25416g(C9572w wVar, int i) {
        byte[] bArr = wVar.f22333a;
        int c = wVar.mo24688c();
        int i2 = i;
        int i3 = c;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= c + i2) {
                return i2;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i2 - (i3 - c)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    /* renamed from: a */
    public Metadata mo22875a(C8742d dVar) {
        ByteBuffer byteBuffer = dVar.f19023V;
        return mo22946a(byteBuffer.array(), byteBuffer.limit());
    }

    public C8770h(C8771a aVar) {
        this.f18622a = aVar;
    }

    /* renamed from: a */
    public Metadata mo22946a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C9572w wVar = new C9572w(bArr, i);
        C8772b a = m25398a(wVar);
        if (a == null) {
            return null;
        }
        int c = wVar.mo24688c();
        int i2 = a.f18623a == 2 ? 6 : 10;
        int b = a.f18625c;
        if (a.f18624b) {
            b = m25416g(wVar, a.f18625c);
        }
        wVar.mo24691d(c + b);
        boolean z = false;
        if (!m25402a(wVar, a.f18623a, i2, false)) {
            if (a.f18623a != 4 || !m25402a(wVar, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(a.f18623a);
                C9563q.m29500d("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (wVar.mo24679a() >= i2) {
            C8773i a2 = m25399a(a.f18623a, wVar, z, i2, this.f18622a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new Metadata((List<? extends C8737b>) arrayList);
    }

    /* renamed from: c */
    private static C8776k m25411c(C9572w wVar, int i) {
        int B = wVar.mo24676B();
        int y = wVar.mo24714y();
        int y2 = wVar.mo24714y();
        int v = wVar.mo24711v();
        int v2 = wVar.mo24711v();
        C9571v vVar = new C9571v();
        vVar.mo24662a(wVar);
        int i2 = ((i - 10) * 8) / (v + v2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a = vVar.mo24660a(v);
            int a2 = vVar.mo24660a(v2);
            iArr[i3] = a;
            iArr2[i3] = a2;
        }
        C8776k kVar = new C8776k(B, y, y2, iArr, iArr2);
        return kVar;
    }

    /* renamed from: b */
    private static C8768g m25407b(C9572w wVar, int i) throws UnsupportedEncodingException {
        int v = wVar.mo24711v();
        String b = m25409b(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wVar.mo24685a(bArr, 0, i2);
        int b2 = m25404b(bArr, 0);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i3 = b2 + 1;
        int b3 = m25405b(bArr, i3, v);
        String a = m25401a(bArr, i3, b3, b);
        int a2 = b3 + m25393a(v);
        int b4 = m25405b(bArr, a2, v);
        return new C8768g(str, a, m25401a(bArr, a2, b4, b), m25403a(bArr, b4 + m25393a(v), bArr.length));
    }

    /* renamed from: a */
    private static C8772b m25398a(C9572w wVar) {
        String str = "Id3Decoder";
        if (wVar.mo24679a() < 10) {
            C9563q.m29500d(str, "Data too short to be an ID3 tag");
            return null;
        }
        int y = wVar.mo24714y();
        if (y != f18621b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: ");
            sb.append(y);
            C9563q.m29500d(str, sb.toString());
            return null;
        }
        int v = wVar.mo24711v();
        boolean z = true;
        wVar.mo24695f(1);
        int v2 = wVar.mo24711v();
        int u = wVar.mo24710u();
        if (v == 2) {
            if ((v2 & 64) != 0) {
                C9563q.m29500d(str, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (v == 3) {
            if ((v2 & 64) != 0) {
                int i = wVar.mo24698i();
                wVar.mo24695f(i);
                u -= i + 4;
            }
        } else if (v == 4) {
            if ((v2 & 64) != 0) {
                int u2 = wVar.mo24710u();
                wVar.mo24695f(u2 - 4);
                u -= u2;
            }
            if ((v2 & 16) != 0) {
                u -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(v);
            C9563q.m29500d(str, sb2.toString());
            return null;
        }
        if (v >= 4 || (v2 & 128) == 0) {
            z = false;
        }
        return new C8772b(v, z, u);
    }

    /* renamed from: b */
    private static C8764e m25406b(C9572w wVar, int i, int i2, boolean z, int i3, C8771a aVar) throws UnsupportedEncodingException {
        C9572w wVar2 = wVar;
        int c = wVar.mo24688c();
        int b = m25404b(wVar2.f22333a, c);
        String str = "ISO-8859-1";
        String str2 = new String(wVar2.f22333a, c, b - c, str);
        wVar.mo24693e(b + 1);
        int v = wVar.mo24711v();
        boolean z2 = (v & 2) != 0;
        boolean z3 = (v & 1) != 0;
        int v2 = wVar.mo24711v();
        String[] strArr = new String[v2];
        for (int i4 = 0; i4 < v2; i4++) {
            int c2 = wVar.mo24688c();
            int b2 = m25404b(wVar2.f22333a, c2);
            strArr[i4] = new String(wVar2.f22333a, c2, b2 - c2, str);
            wVar.mo24693e(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (wVar.mo24688c() < i5) {
            C8773i a = m25399a(i2, wVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C8773i[] iVarArr = new C8773i[arrayList.size()];
        arrayList.toArray(iVarArr);
        C8764e eVar = new C8764e(str2, z2, z3, strArr, iVarArr);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m25402a(com.google.android.exoplayer2.p393v0.C9572w r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo24688c()
        L_0x0008:
            int r3 = r18.mo24679a()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo24698i()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.mo24713x()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.mo24676B()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo24714y()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.mo24714y()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo24693e(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo24693e(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.mo24693e(r2)
            return r6
        L_0x009b:
            int r3 = r18.mo24679a()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.mo24693e(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.mo24695f(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.mo24693e(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.mo24693e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.p359j.C8770h.m25402a(com.google.android.exoplayer2.v0.w, int, int, boolean):boolean");
    }

    /* renamed from: b */
    private static int m25405b(byte[] bArr, int i, int i2) {
        int b = m25404b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m25404b(bArr, b + 1);
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static int m25404b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0193, code lost:
        if (r13 == 67) goto L_0x0195;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.p359j.C8773i m25399a(int r19, com.google.android.exoplayer2.p393v0.C9572w r20, boolean r21, int r22, com.google.android.exoplayer2.metadata.p359j.C8770h.C8771a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo24711v()
            int r9 = r20.mo24711v()
            int r10 = r20.mo24711v()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo24711v()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo24715z()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo24715z()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo24714y()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo24676B()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo24690d()
            r7.mo24693e(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo24688c()
            int r5 = r1 + r15
            int r1 = r20.mo24690d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r4, r0)
            int r0 = r20.mo24690d()
            r7.mo24693e(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo22913a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo24693e(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x022c
            if (r4 == 0) goto L_0x00f8
            goto L_0x022c
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo24695f(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo24695f(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010e
            int r1 = m25416g(r7, r15)
            r15 = r1
        L_0x010e:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0123
            if (r9 != r3) goto L_0x0123
            if (r10 != r3) goto L_0x0123
            if (r0 == r2) goto L_0x011d
            if (r13 != r3) goto L_0x0123
        L_0x011d:
            com.google.android.exoplayer2.metadata.j.m r1 = m25414e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x0123:
            if (r8 != r1) goto L_0x0132
            java.lang.String r1 = m25400a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            com.google.android.exoplayer2.metadata.j.m r1 = m25408b(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x012f:
            r0 = move-exception
            goto L_0x0228
        L_0x0132:
            r4 = 87
            if (r8 != r4) goto L_0x0144
            if (r9 != r3) goto L_0x0144
            if (r10 != r3) goto L_0x0144
            if (r0 == r2) goto L_0x013e
            if (r13 != r3) goto L_0x0144
        L_0x013e:
            com.google.android.exoplayer2.metadata.j.n r1 = m25415f(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x0144:
            r3 = 87
            if (r8 != r3) goto L_0x0152
            java.lang.String r1 = m25400a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            com.google.android.exoplayer2.metadata.j.n r1 = m25412c(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x0152:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0168
            r5 = 82
            if (r9 != r5) goto L_0x0168
            if (r10 != r3) goto L_0x0168
            r5 = 86
            if (r13 != r5) goto L_0x0168
            com.google.android.exoplayer2.metadata.j.l r1 = m25413d(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x0168:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x0180
            r5 = 69
            if (r9 != r5) goto L_0x0180
            if (r10 != r6) goto L_0x0180
            r5 = 66
            if (r13 == r5) goto L_0x017a
            if (r0 != r2) goto L_0x0180
        L_0x017a:
            com.google.android.exoplayer2.metadata.j.g r1 = m25407b(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x0180:
            r5 = 67
            if (r0 != r2) goto L_0x018b
            if (r8 != r4) goto L_0x019b
            if (r9 != r3) goto L_0x019b
            if (r10 != r5) goto L_0x019b
            goto L_0x0195
        L_0x018b:
            r11 = 65
            if (r8 != r11) goto L_0x019b
            if (r9 != r4) goto L_0x019b
            if (r10 != r3) goto L_0x019b
            if (r13 != r5) goto L_0x019b
        L_0x0195:
            com.google.android.exoplayer2.metadata.j.b r1 = m25394a(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x019b:
            r3 = 77
            if (r8 != r5) goto L_0x01ac
            if (r9 != r6) goto L_0x01ac
            if (r10 != r3) goto L_0x01ac
            if (r13 == r3) goto L_0x01a7
            if (r0 != r2) goto L_0x01ac
        L_0x01a7:
            com.google.android.exoplayer2.metadata.j.f r1 = m25397a(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x01ac:
            if (r8 != r5) goto L_0x01c8
            r2 = 72
            if (r9 != r2) goto L_0x01c8
            r2 = 65
            if (r10 != r2) goto L_0x01c8
            if (r13 != r4) goto L_0x01c8
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.j.d r1 = m25396a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x01c8:
            if (r8 != r5) goto L_0x01e0
            if (r9 != r1) goto L_0x01e0
            if (r10 != r6) goto L_0x01e0
            if (r13 != r5) goto L_0x01e0
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.j.e r1 = m25406b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x01e0:
            if (r8 != r3) goto L_0x01f1
            r2 = 76
            if (r9 != r2) goto L_0x01f1
            r2 = 76
            if (r10 != r2) goto L_0x01f1
            if (r13 != r1) goto L_0x01f1
            com.google.android.exoplayer2.metadata.j.k r1 = m25411c(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            goto L_0x01f9
        L_0x01f1:
            java.lang.String r1 = m25400a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            com.google.android.exoplayer2.metadata.j.c r1 = m25395a(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x021f }
        L_0x01f9:
            if (r1 != 0) goto L_0x021b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x021f }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x021f }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            java.lang.String r0 = m25400a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x021f }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x021f }
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x021f }
        L_0x021b:
            r7.mo24693e(r14)
            return r1
        L_0x021f:
            java.lang.String r0 = "Unsupported character encoding"
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r12, r0)     // Catch:{ all -> 0x012f }
            r7.mo24693e(r14)
            return r16
        L_0x0228:
            r7.mo24693e(r14)
            throw r0
        L_0x022c:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.exoplayer2.p393v0.C9563q.m29500d(r12, r0)
            r7.mo24693e(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.p359j.C8770h.m25399a(int, com.google.android.exoplayer2.v0.w, boolean, int, com.google.android.exoplayer2.metadata.j.h$a):com.google.android.exoplayer2.metadata.j.i");
    }

    /* renamed from: a */
    private static C8758b m25394a(C9572w wVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int v = wVar.mo24711v();
        String b = m25409b(v);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        wVar.mo24685a(bArr, 0, i4);
        String str2 = "image/";
        String str3 = "ISO-8859-1";
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C9554k0.m29457k(new String(bArr, 0, 3, str3)));
            str = sb.toString();
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m25404b(bArr, 0);
            String k = C9554k0.m29457k(new String(bArr, 0, i3, str3));
            if (k.indexOf(47) == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(k);
                str = sb2.toString();
            } else {
                str = k;
            }
        }
        byte b2 = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int b3 = m25405b(bArr, i5, v);
        return new C8758b(str, new String(bArr, i5, b3 - i5, b), b2, m25403a(bArr, b3 + m25393a(v), bArr.length));
    }

    /* renamed from: a */
    private static C8766f m25397a(C9572w wVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int v = wVar.mo24711v();
        String b = m25409b(v);
        byte[] bArr = new byte[3];
        wVar.mo24685a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        wVar.mo24685a(bArr2, 0, i2);
        int b2 = m25405b(bArr2, 0, v);
        String str2 = new String(bArr2, 0, b2, b);
        int a = b2 + m25393a(v);
        return new C8766f(str, str2, m25401a(bArr2, a, m25405b(bArr2, a, v), b));
    }

    /* renamed from: a */
    private static C8762d m25396a(C9572w wVar, int i, int i2, boolean z, int i3, C8771a aVar) throws UnsupportedEncodingException {
        C9572w wVar2 = wVar;
        int c = wVar.mo24688c();
        int b = m25404b(wVar2.f22333a, c);
        String str = new String(wVar2.f22333a, c, b - c, "ISO-8859-1");
        wVar.mo24693e(b + 1);
        int i4 = wVar.mo24698i();
        int i5 = wVar.mo24698i();
        long x = wVar.mo24713x();
        long j = x == 4294967295L ? -1 : x;
        long x2 = wVar.mo24713x();
        long j2 = x2 == 4294967295L ? -1 : x2;
        ArrayList arrayList = new ArrayList();
        int i6 = c + i;
        while (wVar.mo24688c() < i6) {
            C8773i a = m25399a(i2, wVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C8773i[] iVarArr = new C8773i[arrayList.size()];
        arrayList.toArray(iVarArr);
        C8762d dVar = new C8762d(str, i4, i5, j, j2, iVarArr);
        return dVar;
    }

    /* renamed from: a */
    private static C8760c m25395a(C9572w wVar, int i, String str) {
        byte[] bArr = new byte[i];
        wVar.mo24685a(bArr, 0, i);
        return new C8760c(str, bArr);
    }

    /* renamed from: a */
    private static String m25400a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static byte[] m25403a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C9554k0.f22286f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: a */
    private static String m25401a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}
