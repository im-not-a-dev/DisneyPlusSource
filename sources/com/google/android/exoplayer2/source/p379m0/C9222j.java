package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Arrays;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.source.m0.j */
/* compiled from: DataChunk */
public abstract class C9222j extends C9212d {

    /* renamed from: i */
    private byte[] f20916i;

    /* renamed from: j */
    private volatile boolean f20917j;

    public C9222j(DataSource dataSource, DataSpec dataSpec, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f20916i = bArr;
    }

    /* renamed from: a */
    public final void mo23567a() {
        this.f20917j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23806a(byte[] bArr, int i) throws IOException;

    /* renamed from: f */
    public byte[] mo23957f() {
        return this.f20916i;
    }

    public final void load() throws IOException, InterruptedException {
        try {
            this.f20863h.open(this.f20856a);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f20917j) {
                m27826a(i2);
                i = this.f20863h.read(this.f20916i, i2, DateUtils.FORMAT_ABBREV_TIME);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f20917j) {
                mo23806a(this.f20916i, i2);
            }
        } finally {
            Util.m29405a((DataSource) this.f20863h);
        }
    }

    /* renamed from: a */
    private void m27826a(int i) {
        byte[] bArr = this.f20916i;
        if (bArr == null) {
            this.f20916i = new byte[DateUtils.FORMAT_ABBREV_TIME];
        } else if (bArr.length < i + DateUtils.FORMAT_ABBREV_TIME) {
            this.f20916i = Arrays.copyOf(bArr, bArr.length + DateUtils.FORMAT_ABBREV_TIME);
        }
    }
}
