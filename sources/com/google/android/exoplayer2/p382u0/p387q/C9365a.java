package com.google.android.exoplayer2.p382u0.p387q;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9564r;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.u0.q.a */
/* compiled from: SubripDecoder */
public final class C9365a extends C9323c {

    /* renamed from: p */
    private static final Pattern f21544p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: q */
    private static final Pattern f21545q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n */
    private final StringBuilder f21546n = new StringBuilder();

    /* renamed from: o */
    private final ArrayList<String> f21547o = new ArrayList<>();

    public C9365a() {
        super("SubripDecoder");
    }

    /* renamed from: b */
    static float m28554b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9366b m28556a(byte[] bArr, int i, boolean z) {
        String str = "SubripDecoder";
        ArrayList arrayList = new ArrayList();
        C9564r rVar = new C9564r();
        C9572w wVar = new C9572w(bArr, i);
        while (true) {
            String k = wVar.mo24700k();
            if (k == null) {
                break;
            } else if (k.length() != 0) {
                try {
                    Integer.parseInt(k);
                    String k2 = wVar.mo24700k();
                    if (k2 == null) {
                        Log.m29500d(str, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f21544p.matcher(k2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        rVar.mo24657a(m28551a(matcher, 1));
                        int i2 = 0;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            rVar.mo24657a(m28551a(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.f21546n.setLength(0);
                        this.f21547o.clear();
                        for (String k3 = wVar.mo24700k(); !TextUtils.isEmpty(k3); k3 = wVar.mo24700k()) {
                            if (this.f21546n.length() > 0) {
                                this.f21546n.append("<br>");
                            }
                            this.f21546n.append(m28553a(k3, this.f21547o));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f21546n.toString());
                        String str2 = null;
                        while (true) {
                            if (i2 >= this.f21547o.size()) {
                                break;
                            }
                            String str3 = (String) this.f21547o.get(i2);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str3;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m28552a(fromHtml, str2));
                        if (z2) {
                            arrayList.add(C9322b.f21345h0);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Skipping invalid timing: ");
                        sb.append(k2);
                        Log.m29500d(str, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping invalid index: ");
                    sb2.append(k);
                    Log.m29500d(str, sb2.toString());
                }
            }
        }
        C9322b[] bVarArr = new C9322b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new C9366b(bVarArr, rVar.mo24658b());
    }

    /* renamed from: a */
    private String m28553a(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f21545q.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.p382u0.C9322b m28552a(android.text.Spanned r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r19
            if (r0 != 0) goto L_0x000c
            com.google.android.exoplayer2.u0.b r0 = new com.google.android.exoplayer2.u0.b
            r2 = r18
            r0.<init>(r2)
            return r0
        L_0x000c:
            r2 = r18
            int r1 = r19.hashCode()
            java.lang.String r3 = "{\\an8}"
            java.lang.String r4 = "{\\an7}"
            java.lang.String r5 = "{\\an6}"
            java.lang.String r6 = "{\\an5}"
            java.lang.String r7 = "{\\an4}"
            java.lang.String r8 = "{\\an3}"
            java.lang.String r9 = "{\\an2}"
            java.lang.String r10 = "{\\an1}"
            r13 = 5
            r14 = 4
            r15 = 3
            r11 = 2
            r12 = 1
            switch(r1) {
                case -685620710: goto L_0x006e;
                case -685620679: goto L_0x0066;
                case -685620648: goto L_0x005e;
                case -685620617: goto L_0x0056;
                case -685620586: goto L_0x004e;
                case -685620555: goto L_0x0046;
                case -685620524: goto L_0x003e;
                case -685620493: goto L_0x0035;
                case -685620462: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0076
        L_0x002b:
            java.lang.String r1 = "{\\an9}"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0076
            r1 = 5
            goto L_0x0077
        L_0x0035:
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0076
            r1 = 8
            goto L_0x0077
        L_0x003e:
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L_0x0076
            r1 = 2
            goto L_0x0077
        L_0x0046:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x0076
            r1 = 4
            goto L_0x0077
        L_0x004e:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0076
            r1 = 7
            goto L_0x0077
        L_0x0056:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x005e:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0076
            r1 = 3
            goto L_0x0077
        L_0x0066:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0076
            r1 = 6
            goto L_0x0077
        L_0x006e:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0076
            r1 = 0
            goto L_0x0077
        L_0x0076:
            r1 = -1
        L_0x0077:
            if (r1 == 0) goto L_0x0089
            if (r1 == r12) goto L_0x0089
            if (r1 == r11) goto L_0x0089
            if (r1 == r15) goto L_0x0086
            if (r1 == r14) goto L_0x0086
            if (r1 == r13) goto L_0x0086
            r16 = 1
            goto L_0x008b
        L_0x0086:
            r16 = 2
            goto L_0x008b
        L_0x0089:
            r16 = 0
        L_0x008b:
            int r1 = r19.hashCode()
            switch(r1) {
                case -685620710: goto L_0x00d6;
                case -685620679: goto L_0x00ce;
                case -685620648: goto L_0x00c6;
                case -685620617: goto L_0x00be;
                case -685620586: goto L_0x00b6;
                case -685620555: goto L_0x00ad;
                case -685620524: goto L_0x00a5;
                case -685620493: goto L_0x009d;
                case -685620462: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x00de
        L_0x0093:
            java.lang.String r1 = "{\\an9}"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00de
            r0 = 5
            goto L_0x00df
        L_0x009d:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00de
            r0 = 4
            goto L_0x00df
        L_0x00a5:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00de
            r0 = 3
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00de
            r0 = 8
            goto L_0x00df
        L_0x00b6:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00de
            r0 = 7
            goto L_0x00df
        L_0x00be:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00de
            r0 = 6
            goto L_0x00df
        L_0x00c6:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00de
            r0 = 2
            goto L_0x00df
        L_0x00ce:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00de
            r0 = 1
            goto L_0x00df
        L_0x00d6:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00de
            r0 = 0
            goto L_0x00df
        L_0x00de:
            r0 = -1
        L_0x00df:
            if (r0 == 0) goto L_0x00ef
            if (r0 == r12) goto L_0x00ef
            if (r0 == r11) goto L_0x00ef
            if (r0 == r15) goto L_0x00ed
            if (r0 == r14) goto L_0x00ed
            if (r0 == r13) goto L_0x00ed
            r6 = 1
            goto L_0x00f0
        L_0x00ed:
            r6 = 0
            goto L_0x00f0
        L_0x00ef:
            r6 = 2
        L_0x00f0:
            com.google.android.exoplayer2.u0.b r0 = new com.google.android.exoplayer2.u0.b
            r3 = 0
            float r4 = m28554b(r6)
            r5 = 0
            float r7 = m28554b(r16)
            r9 = 1
            r1 = r0
            r2 = r18
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p387q.C9365a.m28552a(android.text.Spanned, java.lang.String):com.google.android.exoplayer2.u0.b");
    }

    /* renamed from: a */
    private static long m28551a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }
}
