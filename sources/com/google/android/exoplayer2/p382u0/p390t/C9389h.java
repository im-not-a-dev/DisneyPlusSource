package com.google.android.exoplayer2.p382u0.p390t;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.u0.t.h */
/* compiled from: WebvttParserUtil */
public final class C9389h {

    /* renamed from: a */
    private static final Pattern f21669a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: a */
    public static float m28715a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static boolean m28718b(C9572w wVar) {
        String k = wVar.mo24700k();
        return k != null && k.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static void m28719c(C9572w wVar) throws C8723g0 {
        int c = wVar.mo24688c();
        if (!m28718b(wVar)) {
            wVar.mo24693e(c);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected WEBVTT. Got ");
            sb.append(wVar.mo24700k());
            throw new C8723g0(sb.toString());
        }
    }

    /* renamed from: b */
    public static long m28717b(String str) throws NumberFormatException {
        String[] b = Util.m29437b(str, "\\.");
        long j = 0;
        for (String parseLong : Util.m29423a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public static Matcher m28716a(C9572w wVar) {
        String k;
        while (true) {
            String k2 = wVar.mo24700k();
            if (k2 == null) {
                return null;
            }
            if (f21669a.matcher(k2).matches()) {
                do {
                    k = wVar.mo24700k();
                    if (k == null) {
                        break;
                    }
                } while (!k.isEmpty());
            } else {
                Matcher matcher = C9385f.f21654b.matcher(k2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
