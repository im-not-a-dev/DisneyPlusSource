package com.google.android.exoplayer2.p382u0.p386p;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9564r;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.u0.p.a */
/* compiled from: SsaDecoder */
public final class C9363a extends C9323c {

    /* renamed from: s */
    private static final Pattern f21536s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: n */
    private final boolean f21537n;

    /* renamed from: o */
    private int f21538o;

    /* renamed from: p */
    private int f21539p;

    /* renamed from: q */
    private int f21540q;

    /* renamed from: r */
    private int f21541r;

    public C9363a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f21537n = false;
            return;
        }
        this.f21537n = true;
        String a = C9554k0.m29399a((byte[]) list.get(0));
        C9537e.m29299a(a.startsWith("Format: "));
        m28542a(a);
        m28540a(new C9572w((byte[]) list.get(1)));
    }

    /* renamed from: b */
    public static long m28544b(String str) {
        Matcher matcher = f21536s.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9364b m28546a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C9564r rVar = new C9564r();
        C9572w wVar = new C9572w(bArr, i);
        if (!this.f21537n) {
            m28540a(wVar);
        }
        m28541a(wVar, (List<C9322b>) arrayList, rVar);
        C9322b[] bVarArr = new C9322b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new C9364b(bVarArr, rVar.mo24658b());
    }

    /* renamed from: a */
    private void m28540a(C9572w wVar) {
        String k;
        do {
            k = wVar.mo24700k();
            if (k == null) {
                return;
            }
        } while (!k.startsWith("[Events]"));
    }

    /* renamed from: a */
    private void m28541a(C9572w wVar, List<C9322b> list, C9564r rVar) {
        while (true) {
            String k = wVar.mo24700k();
            if (k == null) {
                return;
            }
            if (!this.f21537n && k.startsWith("Format: ")) {
                m28542a(k);
            } else if (k.startsWith("Dialogue: ")) {
                m28543a(k, list, rVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28542a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.f21538o = r0
            r0 = -1
            r8.f21539p = r0
            r8.f21540q = r0
            r8.f21541r = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r8.f21538o
            if (r2 >= r3) goto L_0x006d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.m29457k(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0050
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0046
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            goto L_0x005b
        L_0x0046:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 2
            goto L_0x005b
        L_0x0050:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = -1
        L_0x005b:
            if (r3 == 0) goto L_0x0068
            if (r3 == r7) goto L_0x0065
            if (r3 == r6) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            r8.f21541r = r2
            goto L_0x006a
        L_0x0065:
            r8.f21540q = r2
            goto L_0x006a
        L_0x0068:
            r8.f21539p = r2
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x006d:
            int r9 = r8.f21539p
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f21540q
            if (r9 == r0) goto L_0x0079
            int r9 = r8.f21541r
            if (r9 != r0) goto L_0x007b
        L_0x0079:
            r8.f21538o = r1
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p386p.C9363a.m28542a(java.lang.String):void");
    }

    /* renamed from: a */
    private void m28543a(String str, List<C9322b> list, C9564r rVar) {
        long j;
        String str2 = "SsaDecoder";
        if (this.f21538o == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipping dialogue line before complete format: ");
            sb.append(str);
            C9563q.m29500d(str2, sb.toString());
            return;
        }
        String[] split = str.substring(10).split(",", this.f21538o);
        if (split.length != this.f21538o) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
            sb2.append(str);
            C9563q.m29500d(str2, sb2.toString());
            return;
        }
        long b = m28544b(split[this.f21539p]);
        String str3 = "Skipping invalid timing: ";
        if (b == -9223372036854775807L) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            C9563q.m29500d(str2, sb3.toString());
            return;
        }
        String str4 = split[this.f21540q];
        if (!str4.trim().isEmpty()) {
            j = m28544b(str4);
            if (j == -9223372036854775807L) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(str);
                C9563q.m29500d(str2, sb4.toString());
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        String replaceAll = split[this.f21541r].replaceAll("\\{.*?\\}", "");
        String str5 = "\n";
        list.add(new C9322b(replaceAll.replaceAll("\\\\N", str5).replaceAll("\\\\n", str5)));
        rVar.mo24657a(b);
        if (j != -9223372036854775807L) {
            list.add(C9322b.f21345h0);
            rVar.mo24657a(j);
        }
    }
}
