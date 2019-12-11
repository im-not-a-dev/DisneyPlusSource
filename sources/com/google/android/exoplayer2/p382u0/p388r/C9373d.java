package com.google.android.exoplayer2.p382u0.p388r;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.u0.r.d */
/* compiled from: TtmlRenderUtil */
final class C9373d {
    /* renamed from: a */
    public static C9374e m28591a(C9374e eVar, String[] strArr, Map<String, C9374e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (eVar == null && strArr.length == 1) {
            return (C9374e) map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            C9374e eVar2 = new C9374e();
            int length = strArr.length;
            while (i < length) {
                eVar2.mo24201a((C9374e) map.get(strArr[i]));
                i++;
            }
            return eVar2;
        } else if (eVar == null || strArr == null || strArr.length != 1) {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    eVar.mo24201a((C9374e) map.get(strArr[i]));
                    i++;
                }
            }
            return eVar;
        } else {
            eVar.mo24201a((C9374e) map.get(strArr[0]));
            return eVar;
        }
    }

    /* renamed from: a */
    public static void m28594a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C9374e eVar) {
        if (eVar.mo24215g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.mo24215g()), i, i2, 33);
        }
        if (eVar.mo24219k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (eVar.mo24220l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (eVar.mo24218j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.mo24204b()), i, i2, 33);
        }
        if (eVar.mo24217i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.mo24197a()), i, i2, 33);
        }
        if (eVar.mo24210c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.mo24210c()), i, i2, 33);
        }
        if (eVar.mo24216h() != null) {
            spannableStringBuilder.setSpan(new Standard(eVar.mo24216h()), i, i2, 33);
        }
        int e = eVar.mo24213e();
        if (e == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) eVar.mo24211d(), true), i, i2, 33);
        } else if (e == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.mo24211d()), i, i2, 33);
        } else if (e == 3) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.mo24211d() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: a */
    static void m28593a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: a */
    static String m28592a(String str) {
        String str2 = "\n";
        String str3 = " ";
        return str.replaceAll("\r\n", str2).replaceAll(" *\n *", str2).replaceAll(str2, str3).replaceAll("[ \t\\x0B\f\r]+", str3);
    }
}
