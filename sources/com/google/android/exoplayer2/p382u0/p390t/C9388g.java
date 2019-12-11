package com.google.android.exoplayer2.p382u0.p390t;

import android.text.TextUtils;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.p382u0.p390t.C9382e.C9384b;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.t.g */
/* compiled from: WebvttDecoder */
public final class C9388g extends C9323c {

    /* renamed from: n */
    private final C9385f f21664n = new C9385f();

    /* renamed from: o */
    private final C9572w f21665o = new C9572w();

    /* renamed from: p */
    private final C9384b f21666p = new C9384b();

    /* renamed from: q */
    private final C9378a f21667q = new C9378a();

    /* renamed from: r */
    private final List<C9381d> f21668r = new ArrayList();

    public C9388g() {
        super("WebvttDecoder");
    }

    /* renamed from: b */
    private static void m28712b(C9572w wVar) {
        do {
        } while (!TextUtils.isEmpty(wVar.mo24700k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9390i m28714a(byte[] bArr, int i, boolean z) throws C9327g {
        this.f21665o.mo24684a(bArr, i);
        this.f21666p.mo24255b();
        this.f21668r.clear();
        try {
            C9389h.m28719c(this.f21665o);
            do {
            } while (!TextUtils.isEmpty(this.f21665o.mo24700k()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int a = m28711a(this.f21665o);
                if (a == 0) {
                    return new C9390i(arrayList);
                }
                if (a == 1) {
                    m28712b(this.f21665o);
                } else if (a == 2) {
                    if (arrayList.isEmpty()) {
                        this.f21665o.mo24700k();
                        this.f21668r.addAll(this.f21667q.mo24221a(this.f21665o));
                    } else {
                        throw new C9327g("A style block was found after the first cue.");
                    }
                } else if (a == 3 && this.f21664n.mo24258a(this.f21665o, this.f21666p, this.f21668r)) {
                    arrayList.add(this.f21666p.mo24251a());
                    this.f21666p.mo24255b();
                }
            }
        } catch (C8723g0 e) {
            throw new C9327g((Exception) e);
        }
    }

    /* renamed from: a */
    private static int m28711a(C9572w wVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = wVar.mo24688c();
            String k = wVar.mo24700k();
            i = k == null ? 0 : "STYLE".equals(k) ? 2 : k.startsWith("NOTE") ? 1 : 3;
        }
        wVar.mo24693e(i2);
        return i;
    }
}
