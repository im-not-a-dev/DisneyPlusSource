package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource.C9435a;

/* renamed from: com.google.android.exoplayer2.upstream.x */
/* compiled from: FileDataSourceFactory */
public final class C9522x implements C9435a {

    /* renamed from: a */
    private final TransferListener f22224a;

    public C9522x() {
        this(null);
    }

    /* renamed from: a */
    public DataSource mo24448a() {
        C9520w wVar = new C9520w();
        TransferListener transferListener = this.f22224a;
        if (transferListener != null) {
            wVar.addTransferListener(transferListener);
        }
        return wVar;
    }

    public C9522x(TransferListener transferListener) {
        this.f22224a = transferListener;
    }
}
