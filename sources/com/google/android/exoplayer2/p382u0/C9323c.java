package com.google.android.exoplayer2.p382u0;

import com.google.android.exoplayer2.p362q0.C8881g;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.u0.c */
/* compiled from: SimpleSubtitleDecoder */
public abstract class C9323c extends C8881g<C9330i, C9331j, C9327g> implements C9326f {
    protected C9323c(String str) {
        super(new C9330i[2], new C9331j[2]);
        mo23230a(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C9325e mo24140a(byte[] bArr, int i, boolean z) throws C9327g;

    /* renamed from: a */
    public void mo24142a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9330i m28355d() {
        return new C9330i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C9331j m28357e() {
        return new C9324d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9327g m28351a(Throwable th) {
        return new C9327g("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24143a(C9331j jVar) {
        super.mo23232a(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9327g mo23228a(C9330i iVar, C9331j jVar, boolean z) {
        try {
            ByteBuffer byteBuffer = iVar.f19023V;
            C9331j jVar2 = jVar;
            jVar2.mo24150a(iVar.f19024W, mo24140a(byteBuffer.array(), byteBuffer.limit(), z), iVar.f21362Y);
            jVar.mo23209c(Integer.MIN_VALUE);
            return null;
        } catch (C9327g e) {
            return e;
        }
    }
}
