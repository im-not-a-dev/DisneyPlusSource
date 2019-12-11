package com.google.android.exoplayer2.p366s0.p368s;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.s.e */
/* compiled from: TagPayloadReader */
abstract class C8932e {

    /* renamed from: a */
    protected final C8924q f19219a;

    /* renamed from: com.google.android.exoplayer2.s0.s.e$a */
    /* compiled from: TagPayloadReader */
    public static final class C8933a extends C8723g0 {
        public C8933a(String str) {
            super(str);
        }
    }

    protected C8932e(C8924q qVar) {
        this.f19219a = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23326a(C9572w wVar) throws C8723g0;

    /* renamed from: a */
    public final boolean mo23329a(C9572w wVar, long j) throws C8723g0 {
        return mo23326a(wVar) && mo23327b(wVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo23327b(C9572w wVar, long j) throws C8723g0;
}
