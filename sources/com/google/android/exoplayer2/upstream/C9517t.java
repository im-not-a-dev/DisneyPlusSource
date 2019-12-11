package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9436a;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9440e;

/* renamed from: com.google.android.exoplayer2.upstream.t */
/* compiled from: DefaultHttpDataSourceFactory */
public final class C9517t extends C9436a {

    /* renamed from: b */
    private final String f22214b;

    /* renamed from: c */
    private final TransferListener f22215c;

    /* renamed from: d */
    private final int f22216d;

    /* renamed from: e */
    private final int f22217e;

    /* renamed from: f */
    private final boolean f22218f;

    public C9517t(String str, TransferListener transferListener) {
        this(str, transferListener, 8000, 8000, false);
    }

    public C9517t(String str, TransferListener transferListener, int i, int i2, boolean z) {
        C9537e.m29298a(str);
        this.f22214b = str;
        this.f22215c = transferListener;
        this.f22216d = i;
        this.f22217e = i2;
        this.f22218f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9516s m29265a(C9440e eVar) {
        C9516s sVar = new C9516s(this.f22214b, null, this.f22216d, this.f22217e, this.f22218f, eVar);
        TransferListener transferListener = this.f22215c;
        if (transferListener != null) {
            sVar.addTransferListener(transferListener);
        }
        return sVar;
    }
}
