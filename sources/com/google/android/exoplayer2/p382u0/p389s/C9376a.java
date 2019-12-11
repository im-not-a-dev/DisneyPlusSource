package com.google.android.exoplayer2.p382u0.p389s;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.s.a */
/* compiled from: Tx3gDecoder */
public final class C9376a extends C9323c {

    /* renamed from: u */
    private static final int f21605u = Util.m29428b("styl");

    /* renamed from: v */
    private static final int f21606v = Util.m29428b("tbox");

    /* renamed from: n */
    private final C9572w f21607n = new C9572w();

    /* renamed from: o */
    private boolean f21608o;

    /* renamed from: p */
    private int f21609p;

    /* renamed from: q */
    private int f21610q;

    /* renamed from: r */
    private String f21611r;

    /* renamed from: s */
    private float f21612s;

    /* renamed from: t */
    private int f21613t;

    public C9376a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f21609p = bArr[24];
            this.f21610q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(Util.m29400a(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.f21611r = str;
            this.f21613t = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f21608o = z;
            if (this.f21608o) {
                this.f21612s = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f21613t);
                this.f21612s = Util.m29379a(this.f21612s, 0.0f, 0.95f);
                return;
            }
            this.f21612s = 0.85f;
            return;
        }
        this.f21609p = 0;
        this.f21610q = -1;
        this.f21611r = str;
        this.f21608o = false;
        this.f21612s = 0.85f;
    }

    /* renamed from: b */
    private static void m28629b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9325e mo24140a(byte[] bArr, int i, boolean z) throws C9327g {
        this.f21607n.mo24684a(bArr, i);
        String a = m28624a(this.f21607n);
        if (a.isEmpty()) {
            return C9377b.f21614U;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m28629b(spannableStringBuilder2, this.f21609p, 0, 0, spannableStringBuilder.length(), 16711680);
        m28625a(spannableStringBuilder2, this.f21610q, -1, 0, spannableStringBuilder.length(), 16711680);
        m28626a(spannableStringBuilder2, this.f21611r, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.f21612s;
        while (this.f21607n.mo24679a() >= 8) {
            int c = this.f21607n.mo24688c();
            int i2 = this.f21607n.mo24698i();
            int i3 = this.f21607n.mo24698i();
            boolean z2 = true;
            if (i3 == f21605u) {
                if (this.f21607n.mo24679a() < 2) {
                    z2 = false;
                }
                m28628a(z2);
                int B = this.f21607n.mo24676B();
                for (int i4 = 0; i4 < B; i4++) {
                    m28627a(this.f21607n, spannableStringBuilder);
                }
            } else if (i3 == f21606v && this.f21608o) {
                if (this.f21607n.mo24679a() < 2) {
                    z2 = false;
                }
                m28628a(z2);
                f = Util.m29379a(((float) this.f21607n.mo24676B()) / ((float) this.f21613t), 0.0f, 0.95f);
            }
            this.f21607n.mo24693e(c + i2);
        }
        C9322b bVar = new C9322b(spannableStringBuilder, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
        return new C9377b(bVar);
    }

    /* renamed from: a */
    private static String m28624a(C9572w wVar) throws C9327g {
        m28628a(wVar.mo24679a() >= 2);
        int B = wVar.mo24676B();
        if (B == 0) {
            return "";
        }
        if (wVar.mo24679a() >= 2) {
            char e = wVar.mo24692e();
            if (e == 65279 || e == 65534) {
                return wVar.mo24681a(B, Charset.forName("UTF-16"));
            }
        }
        return wVar.mo24681a(B, Charset.forName(Utf8Charset.NAME));
    }

    /* renamed from: a */
    private void m28627a(C9572w wVar, SpannableStringBuilder spannableStringBuilder) throws C9327g {
        m28628a(wVar.mo24679a() >= 12);
        int B = wVar.mo24676B();
        int B2 = wVar.mo24676B();
        wVar.mo24695f(2);
        int v = wVar.mo24711v();
        wVar.mo24695f(1);
        int i = wVar.mo24698i();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = B;
        int i3 = B2;
        m28629b(spannableStringBuilder2, v, this.f21609p, i2, i3, 0);
        m28625a(spannableStringBuilder2, i, this.f21610q, i2, i3, 0);
    }

    /* renamed from: a */
    private static void m28625a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m28626a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: a */
    private static void m28628a(boolean z) throws C9327g {
        if (!z) {
            throw new C9327g("Unexpected subtitle format.");
        }
    }
}
