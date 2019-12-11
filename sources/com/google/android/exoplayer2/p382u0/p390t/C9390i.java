package com.google.android.exoplayer2.p382u0.p390t;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.t.i */
/* compiled from: WebvttSubtitle */
final class C9390i implements C9325e {

    /* renamed from: U */
    private final int f21670U;

    /* renamed from: V */
    private final long[] f21671V = new long[(this.f21670U * 2)];

    /* renamed from: W */
    private final long[] f21672W;

    /* renamed from: c */
    private final List<C9382e> f21673c;

    public C9390i(List<C9382e> list) {
        this.f21673c = list;
        this.f21670U = list.size();
        for (int i = 0; i < this.f21670U; i++) {
            C9382e eVar = (C9382e) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f21671V;
            jArr[i2] = eVar.f21641i0;
            jArr[i2 + 1] = eVar.f21642j0;
        }
        long[] jArr2 = this.f21671V;
        this.f21672W = Arrays.copyOf(jArr2, jArr2.length);
        Arrays.sort(this.f21672W);
    }

    /* renamed from: a */
    public int mo24145a(long j) {
        int a = C9554k0.m29386a(this.f21672W, j, false, false);
        if (a < this.f21672W.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C9322b> mo24147b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        C9382e eVar = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.f21670U; i++) {
            long[] jArr = this.f21671V;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C9382e eVar2 = (C9382e) this.f21673c.get(i);
                if (!eVar2.mo24245a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else {
                    String str = "\n";
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(eVar.f21354c).append(str).append(eVar2.f21354c);
                    } else {
                        spannableStringBuilder.append(str).append(eVar2.f21354c);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C9382e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public int mo24144a() {
        return this.f21672W.length;
    }

    /* renamed from: a */
    public long mo24146a(int i) {
        boolean z = true;
        C9537e.m29299a(i >= 0);
        if (i >= this.f21672W.length) {
            z = false;
        }
        C9537e.m29299a(z);
        return this.f21672W[i];
    }
}
