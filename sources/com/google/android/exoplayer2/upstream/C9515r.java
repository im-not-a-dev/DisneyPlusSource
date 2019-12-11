package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;

/* renamed from: com.google.android.exoplayer2.upstream.r */
/* compiled from: DefaultDataSourceFactory */
public final class C9515r implements DataSource {

    /* renamed from: a */
    private final Context f22193a;

    /* renamed from: b */
    private final TransferListener f22194b;

    /* renamed from: c */
    private final DataSource f22195c;

    public C9515r(Context context, String str) {
        this(context, str, (TransferListener) null);
    }

    public C9515r(Context context, String str, TransferListener transferListener) {
        this(context, transferListener, (DataSource) new DefaultHttpDataSourceFactory(str, transferListener));
    }

    /* renamed from: a */
    public C9514q m29253a() {
        C9514q qVar = new C9514q(this.f22193a, this.f22195c.mo24448a());
        TransferListener transferListener = this.f22194b;
        if (transferListener != null) {
            qVar.addTransferListener(transferListener);
        }
        return qVar;
    }

    public C9515r(Context context, TransferListener transferListener, DataSource aVar) {
        this.f22193a = context.getApplicationContext();
        this.f22194b = transferListener;
        this.f22195c = aVar;
    }
}
