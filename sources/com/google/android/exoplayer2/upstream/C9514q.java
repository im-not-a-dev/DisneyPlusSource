package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.q */
/* compiled from: DefaultDataSource */
public final class C9514q implements DataSource {

    /* renamed from: a */
    private final Context f22182a;

    /* renamed from: b */
    private final List<TransferListener> f22183b = new ArrayList();

    /* renamed from: c */
    private final DataSource f22184c;

    /* renamed from: d */
    private DataSource f22185d;

    /* renamed from: e */
    private DataSource f22186e;

    /* renamed from: f */
    private DataSource f22187f;

    /* renamed from: g */
    private DataSource f22188g;

    /* renamed from: h */
    private DataSource f22189h;

    /* renamed from: i */
    private DataSource f22190i;

    /* renamed from: j */
    private DataSource f22191j;

    /* renamed from: k */
    private DataSource f22192k;

    public C9514q(Context context, DataSource dataSource) {
        this.f22182a = context.getApplicationContext();
        Assertions.checkNotNull(dataSource);
        this.f22184c = dataSource;
    }

    /* renamed from: b */
    private DataSource m29244b() {
        if (this.f22186e == null) {
            this.f22186e = new C9494g(this.f22182a);
            m29242a(this.f22186e);
        }
        return this.f22186e;
    }

    /* renamed from: c */
    private DataSource m29245c() {
        if (this.f22187f == null) {
            this.f22187f = new C9499i(this.f22182a);
            m29242a(this.f22187f);
        }
        return this.f22187f;
    }

    /* renamed from: d */
    private DataSource m29246d() {
        if (this.f22190i == null) {
            this.f22190i = new C9503j();
            m29242a(this.f22190i);
        }
        return this.f22190i;
    }

    /* renamed from: e */
    private DataSource m29247e() {
        if (this.f22185d == null) {
            this.f22185d = new C9520w();
            m29242a(this.f22185d);
        }
        return this.f22185d;
    }

    /* renamed from: f */
    private DataSource m29248f() {
        if (this.f22191j == null) {
            this.f22191j = new C9492f0(this.f22182a);
            m29242a(this.f22191j);
        }
        return this.f22191j;
    }

    /* renamed from: g */
    private DataSource m29249g() {
        if (this.f22188g == null) {
            try {
                this.f22188g = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                m29242a(this.f22188g);
            } catch (ClassNotFoundException unused) {
                Log.m29500d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f22188g == null) {
                this.f22188g = this.f22184c;
            }
        }
        return this.f22188g;
    }

    /* renamed from: h */
    private DataSource m29250h() {
        if (this.f22189h == null) {
            this.f22189h = new C9501i0();
            m29242a(this.f22189h);
        }
        return this.f22189h;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        DataSource dataSource = this.f22192k;
        return dataSource == null ? Collections.emptyMap() : dataSource.mo9243a();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f22184c.addTransferListener(transferListener);
        this.f22183b.add(transferListener);
        m29243a(this.f22185d, transferListener);
        m29243a(this.f22186e, transferListener);
        m29243a(this.f22187f, transferListener);
        m29243a(this.f22188g, transferListener);
        m29243a(this.f22189h, transferListener);
        m29243a(this.f22190i, transferListener);
        m29243a(this.f22191j, transferListener);
    }

    public void close() throws IOException {
        DataSource dataSource = this.f22192k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f22192k = null;
            }
        }
    }

    public Uri getUri() {
        DataSource dataSource = this.f22192k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    public long open(DataSpec dataSpec) throws IOException {
        Assertions.checkState(this.f22192k == null);
        String scheme = dataSpec.f21938a.getScheme();
        if (Util.isLocalFileUri(dataSpec.f21938a)) {
            String path = dataSpec.f21938a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f22192k = m29247e();
            } else {
                this.f22192k = m29244b();
            }
        } else if ("asset".equals(scheme)) {
            this.f22192k = m29244b();
        } else if ("content".equals(scheme)) {
            this.f22192k = m29245c();
        } else if ("rtmp".equals(scheme)) {
            this.f22192k = m29249g();
        } else if ("udp".equals(scheme)) {
            this.f22192k = m29250h();
        } else if ("data".equals(scheme)) {
            this.f22192k = m29246d();
        } else if ("rawresource".equals(scheme)) {
            this.f22192k = m29248f();
        } else {
            this.f22192k = this.f22184c;
        }
        return this.f22192k.open(dataSpec);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        DataSource dataSource = this.f22192k;
        Assertions.checkNotNull(dataSource);
        return dataSource.read(bArr, i, i2);
    }

    /* renamed from: a */
    private void m29242a(DataSource dataSource) {
        for (int i = 0; i < this.f22183b.size(); i++) {
            dataSource.addTransferListener((TransferListener) this.f22183b.get(i));
        }
    }

    /* renamed from: a */
    private void m29243a(DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }
}
