package com.google.android.exoplayer2.p382u0.p390t;

import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.p382u0.p390t.C9382e.C9384b;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.u0.t.b */
/* compiled from: Mp4WebvttDecoder */
public final class C9379b extends C9323c {

    /* renamed from: p */
    private static final int f21619p = Util.m29428b("payl");

    /* renamed from: q */
    private static final int f21620q = Util.m29428b("sttg");

    /* renamed from: r */
    private static final int f21621r = Util.m29428b("vttc");

    /* renamed from: n */
    private final C9572w f21622n = new C9572w();

    /* renamed from: o */
    private final C9384b f21623o = new C9384b();

    public C9379b() {
        super("Mp4WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9380c m28650a(byte[] bArr, int i, boolean z) throws C9327g {
        this.f21622n.mo24684a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f21622n.mo24679a() > 0) {
            if (this.f21622n.mo24679a() >= 8) {
                int i2 = this.f21622n.mo24698i();
                if (this.f21622n.mo24698i() == f21621r) {
                    arrayList.add(m28648a(this.f21622n, this.f21623o, i2 - 8));
                } else {
                    this.f21622n.mo24695f(i2 - 8);
                }
            } else {
                throw new C9327g("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C9380c(arrayList);
    }

    /* renamed from: a */
    private static C9322b m28648a(C9572w wVar, C9384b bVar, int i) throws C9327g {
        bVar.mo24255b();
        while (i > 0) {
            if (i >= 8) {
                int i2 = wVar.mo24698i();
                int i3 = wVar.mo24698i();
                int i4 = i - 8;
                int i5 = i2 - 8;
                String a = Util.m29400a(wVar.f22333a, wVar.mo24688c(), i5);
                wVar.mo24695f(i5);
                i = i4 - i5;
                if (i3 == f21620q) {
                    C9385f.m28697a(a, bVar);
                } else if (i3 == f21619p) {
                    C9385f.m28699a((String) null, a.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new C9327g("Incomplete vtt cue box header found.");
            }
        }
        return bVar.mo24251a();
    }
}
