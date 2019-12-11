package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C8800n0;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.trackselection.m */
/* compiled from: TrackSelectorResult */
public final class C9318m {

    /* renamed from: a */
    public final int f21310a;

    /* renamed from: b */
    public final C8800n0[] f21311b;

    /* renamed from: c */
    public final TrackSelectionArray f21312c;

    /* renamed from: d */
    public final Object f21313d;

    public C9318m(C8800n0[] n0VarArr, TrackSelection[] jVarArr, Object obj) {
        this.f21311b = n0VarArr;
        this.f21312c = new TrackSelectionArray(jVarArr);
        this.f21313d = obj;
        this.f21310a = n0VarArr.length;
    }

    /* renamed from: a */
    public boolean mo24134a(int i) {
        return this.f21311b[i] != null;
    }

    /* renamed from: a */
    public boolean mo24135a(C9318m mVar) {
        if (mVar == null || mVar.f21312c.f21167a != this.f21312c.f21167a) {
            return false;
        }
        for (int i = 0; i < this.f21312c.f21167a; i++) {
            if (!mo24136a(mVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo24136a(C9318m mVar, int i) {
        boolean z = false;
        if (mVar == null) {
            return false;
        }
        if (Util.m29414a((Object) this.f21311b[i], (Object) mVar.f21311b[i]) && Util.m29414a((Object) this.f21312c.mo24040a(i), (Object) mVar.f21312c.mo24040a(i))) {
            z = true;
        }
        return z;
    }
}
