package com.bamtech.sdk4.internal.media.adapters.exoplayer;

import android.net.Uri;
import com.bamtech.sdk4.media.drm.SilkDrmProvider;
import com.bamtech.sdk4.service.ServiceException;
import com.google.android.exoplayer2.upstream.C9506l;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9437b;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/KeyRequestDataSource;", "Lcom/google/android/exoplayer2/upstream/DataSource;", "drmProvider", "Lcom/bamtech/sdk4/media/drm/SilkDrmProvider;", "(Lcom/bamtech/sdk4/media/drm/SilkDrmProvider;)V", "listeners", "", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "source", "Lokio/Buffer;", "spec", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "uri", "Landroid/net/Uri;", "addTransferListener", "", "transferListener", "close", "getUri", "open", "", "read", "", "buffer", "", "offset", "readLength", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KeyRequestDataSource.kt */
public final class KeyRequestDataSource implements DataSource {
    private final SilkDrmProvider drmProvider;
    private final List<TransferListener> listeners = new ArrayList();
    private final Buffer source = new Buffer();
    private DataSpec spec;
    private Uri uri;

    public KeyRequestDataSource(SilkDrmProvider silkDrmProvider) {
        this.drmProvider = silkDrmProvider;
    }

    /* renamed from: a */
    public /* synthetic */ Map<String, List<String>> mo9243a() {
        return C9506l.m29212a(this);
    }

    public void addTransferListener(TransferListener transferListener) {
        if (transferListener != null) {
            this.listeners.add(transferListener);
        }
    }

    public void close() {
        for (TransferListener onTransferEnd : this.listeners) {
            onTransferEnd.onTransferEnd(this, this.spec, true);
        }
        this.source.mo36308a();
        this.source.close();
    }

    public Uri getUri() {
        return this.uri;
    }

    public long open(DataSpec dataSpec) {
        if (dataSpec != null) {
            this.spec = dataSpec;
            for (TransferListener onTransferInitializing : this.listeners) {
                onTransferInitializing.onTransferInitializing(this, dataSpec, true);
            }
            try {
                this.uri = dataSpec.f21938a;
                Buffer buffer = this.source;
                SilkDrmProvider silkDrmProvider = this.drmProvider;
                Uri uri2 = this.uri;
                if (uri2 != null) {
                    String uri3 = uri2.toString();
                    if (uri3 != null) {
                        Object c = silkDrmProvider.getKey(uri3).mo30224c();
                        Intrinsics.checkReturnedValueIsNotNull(c, "drmProvider.getKey(uri?.…           .blockingGet()");
                        buffer.write((byte[]) c);
                        return this.source.mo36335h();
                    }
                }
                return 0;
            } catch (ServiceException e) {
                throw new C9437b(e.getMessage(), dataSpec, 2);
            }
        } else {
            throw new C9437b(dataSpec, 1);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = this.source.mo36292a(bArr, i, i2);
        if (a > 0) {
            for (TransferListener onBytesTransferred : this.listeners) {
                onBytesTransferred.onBytesTransferred(this, this.spec, true, a);
            }
        }
        return a;
    }
}
