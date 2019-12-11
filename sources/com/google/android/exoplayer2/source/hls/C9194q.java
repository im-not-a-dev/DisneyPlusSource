package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p382u0.p390t.C9389h;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.source.hls.q */
/* compiled from: WebvttExtractor */
public final class C9194q implements C8912g {

    /* renamed from: g */
    private static final Pattern f20806g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    private static final Pattern f20807h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    private final String f20808a;

    /* renamed from: b */
    private final C9545h0 f20809b;

    /* renamed from: c */
    private final C9572w f20810c = new C9572w();

    /* renamed from: d */
    private C8914i f20811d;

    /* renamed from: e */
    private byte[] f20812e = new byte[1024];

    /* renamed from: f */
    private int f20813f;

    public C9194q(String str, C9545h0 h0Var) {
        this.f20808a = str;
        this.f20809b = h0Var;
    }

    /* renamed from: b */
    private void m27701b() throws C8723g0 {
        C9572w wVar = new C9572w(this.f20812e);
        C9389h.m28719c(wVar);
        long j = 0;
        long j2 = 0;
        while (true) {
            String k = wVar.mo24700k();
            if (TextUtils.isEmpty(k)) {
                Matcher a = C9389h.m28716a(wVar);
                if (a == null) {
                    m27700a(0);
                    return;
                }
                long b = C9389h.m28717b(a.group(1));
                long b2 = this.f20809b.mo24632b(C9545h0.m29344e((j + b) - j2));
                C8924q a2 = m27700a(b2 - b);
                this.f20810c.mo24684a(this.f20812e, this.f20813f);
                a2.mo23305a(this.f20810c, this.f20813f);
                a2.mo23303a(b2, 1, this.f20813f, 0, null);
                return;
            } else if (k.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f20806g.matcher(k);
                if (matcher.find()) {
                    Matcher matcher2 = f20807h.matcher(k);
                    if (matcher2.find()) {
                        j2 = C9389h.m28717b(matcher.group(1));
                        j = C9545h0.m29343d(Long.parseLong(matcher2.group(1)));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                        sb.append(k);
                        throw new C8723g0(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    sb2.append(k);
                    throw new C8723g0(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23296b(this.f20812e, 0, 6, false);
        this.f20810c.mo24684a(this.f20812e, 6);
        if (C9389h.m28718b(this.f20810c)) {
            return true;
        }
        hVar.mo23296b(this.f20812e, 6, 3, false);
        this.f20810c.mo24684a(this.f20812e, 9);
        return C9389h.m28718b(this.f20810c);
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f20811d = iVar;
        iVar.mo23313a(new C8922b(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        int i;
        int a = (int) hVar.mo23287a();
        int i2 = this.f20813f;
        byte[] bArr = this.f20812e;
        if (i2 == bArr.length) {
            if (a != -1) {
                i = a;
            } else {
                i = bArr.length;
            }
            this.f20812e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f20812e;
        int i3 = this.f20813f;
        int read = hVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            this.f20813f += read;
            if (a == -1 || this.f20813f != a) {
                return 0;
            }
        }
        m27701b();
        return -1;
    }

    /* renamed from: a */
    private C8924q m27700a(long j) {
        C8924q a = this.f20811d.mo23311a(0, 3);
        a.mo23304a(Format.m24877a((String) null, "text/vtt", (String) null, -1, 0, this.f20808a, (DrmInitData) null, j));
        this.f20811d.mo23312a();
        return a;
    }
}
