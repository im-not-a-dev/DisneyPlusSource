package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p393v0.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.h */
/* compiled from: BaseDataSource */
public abstract class C9497h implements DataSource {

    /* renamed from: a */
    private final boolean f22111a;

    /* renamed from: b */
    private final ArrayList<TransferListener> f22112b = new ArrayList<>(1);

    /* renamed from: c */
    private int f22113c;

    /* renamed from: d */
    private DataSpec f22114d;

    protected C9497h(boolean z) {
        this.f22111a = z;
    }

    /* renamed from: a */
    public /* synthetic */ Map<String, List<String>> mo9243a() {
        return C9506l.m29212a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24567a(DataSpec dataSpec) {
        for (int i = 0; i < this.f22113c; i++) {
            ((TransferListener) this.f22112b.get(i)).onTransferInitializing(this, dataSpec, this.f22111a);
        }
    }

    public final void addTransferListener(TransferListener transferListener) {
        if (!this.f22112b.contains(transferListener)) {
            this.f22112b.add(transferListener);
            this.f22113c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24569b(DataSpec dataSpec) {
        this.f22114d = dataSpec;
        for (int i = 0; i < this.f22113c; i++) {
            ((TransferListener) this.f22112b.get(i)).onTransferStart(this, dataSpec, this.f22111a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24566a(int i) {
        DataSpec dataSpec = this.f22114d;
        Util.castNonNull(dataSpec);
        DataSpec dataSpec2 = dataSpec;
        for (int i2 = 0; i2 < this.f22113c; i2++) {
            ((TransferListener) this.f22112b.get(i2)).onBytesTransferred(this, dataSpec2, this.f22111a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24568b() {
        DataSpec dataSpec = this.f22114d;
        Util.castNonNull(dataSpec);
        DataSpec dataSpec2 = dataSpec;
        for (int i = 0; i < this.f22113c; i++) {
            ((TransferListener) this.f22112b.get(i)).onTransferEnd(this, dataSpec2, this.f22111a);
        }
        this.f22114d = null;
    }
}
