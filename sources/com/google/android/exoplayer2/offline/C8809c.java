package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.util.Pair;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.exoplayer2.offline.C8807a;
import com.google.android.exoplayer2.offline.Downloader.C8805a;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9575z;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.C9463d;
import com.google.android.exoplayer2.upstream.cache.C9469i;
import com.google.android.exoplayer2.upstream.cache.C9471k;
import com.google.android.exoplayer2.upstream.cache.C9471k.C9472a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.offline.c */
/* compiled from: SegmentDownloader */
public abstract class C8809c<M extends C8807a<M>> implements Downloader {

    /* renamed from: a */
    private final DataSpec f18727a;

    /* renamed from: b */
    private final Cache f18728b;

    /* renamed from: c */
    private final C9463d f18729c;

    /* renamed from: d */
    private final C9469i f18730d;

    /* renamed from: e */
    private final C9575z f18731e;

    /* renamed from: f */
    private final ArrayList<StreamKey> f18732f;

    /* renamed from: g */
    private final AtomicBoolean f18733g = new AtomicBoolean();

    /* renamed from: com.google.android.exoplayer2.offline.c$a */
    /* compiled from: SegmentDownloader */
    private static final class C8810a implements C9472a {

        /* renamed from: a */
        private final C8805a f18734a;

        /* renamed from: b */
        private final long f18735b;

        /* renamed from: c */
        private final int f18736c;

        /* renamed from: d */
        private long f18737d;

        /* renamed from: e */
        private int f18738e;

        public C8810a(C8805a aVar, long j, int i, long j2, int i2) {
            this.f18734a = aVar;
            this.f18735b = j;
            this.f18736c = i;
            this.f18737d = j2;
            this.f18738e = i2;
        }

        /* renamed from: b */
        private float m25539b() {
            long j = this.f18735b;
            if (j != -1 && j != 0) {
                return (((float) this.f18737d) * 100.0f) / ((float) j);
            }
            int i = this.f18736c;
            if (i != 0) {
                return (((float) this.f18738e) * 100.0f) / ((float) i);
            }
            return -1.0f;
        }

        /* renamed from: a */
        public void mo23040a(long j, long j2, long j3) {
            this.f18737d += j3;
            this.f18734a.onProgress(this.f18735b, this.f18737d, m25539b());
        }

        /* renamed from: a */
        public void mo23039a() {
            this.f18738e++;
            this.f18734a.onProgress(this.f18735b, this.f18737d, m25539b());
        }
    }

    /* renamed from: com.google.android.exoplayer2.offline.c$b */
    /* compiled from: SegmentDownloader */
    protected static class C8811b implements Comparable<C8811b> {

        /* renamed from: U */
        public final DataSpec f18739U;

        /* renamed from: c */
        public final long f18740c;

        public C8811b(long j, DataSpec dataSpec) {
            this.f18740c = j;
            this.f18739U = dataSpec;
        }

        /* renamed from: a */
        public int compareTo(C8811b bVar) {
            return C9554k0.m29426b(this.f18740c, bVar.f18740c);
        }
    }

    public C8809c(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        this.f18727a = m25535a(uri);
        this.f18732f = new ArrayList<>(list);
        this.f18728b = downloaderConstructorHelper.mo23023c();
        this.f18729c = downloaderConstructorHelper.mo23021a();
        downloaderConstructorHelper.mo23022b();
        this.f18730d = downloaderConstructorHelper.mo23024d();
        this.f18731e = downloaderConstructorHelper.mo23025e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract M mo23037a(DataSource dataSource, DataSpec dataSpec) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<C8811b> mo23038a(DataSource dataSource, M m, boolean z) throws InterruptedException, IOException;

    /* renamed from: a */
    public final void mo23019a(C8805a aVar) throws IOException, InterruptedException {
        this.f18731e.mo24725a(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        try {
            C8807a a = mo23037a(this.f18729c, this.f18727a);
            if (!this.f18732f.isEmpty()) {
                a = (C8807a) a.mo23035a(this.f18732f);
            }
            List a2 = mo23038a(this.f18729c, a, false);
            int size = a2.size();
            long j = 0;
            long j2 = 0;
            int i = 0;
            for (int size2 = a2.size() - 1; size2 >= 0; size2--) {
                Pair a3 = C9471k.m29046a(((C8811b) a2.get(size2)).f18739U, this.f18728b, this.f18730d);
                long longValue = ((Long) a3.first).longValue();
                long longValue2 = ((Long) a3.second).longValue();
                j2 += longValue2;
                if (longValue != -1) {
                    if (longValue == longValue2) {
                        i++;
                        a2.remove(size2);
                    }
                    if (j != -1) {
                        j += longValue;
                    }
                } else {
                    j = -1;
                }
            }
            Collections.sort(a2);
            C8810a aVar2 = null;
            if (aVar != null) {
                aVar2 = new C8810a(aVar, j, size, j2, i);
            }
            byte[] bArr = new byte[DateUtils.FORMAT_NUMERIC_DATE];
            for (int i2 = 0; i2 < a2.size(); i2++) {
                C9471k.m29050a(((C8811b) a2.get(i2)).f18739U, this.f18728b, this.f18730d, this.f18729c, bArr, this.f18731e, (int) NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, (C9472a) aVar2, this.f18733g, true);
                if (aVar2 != null) {
                    aVar2.mo23039a();
                }
            }
        } finally {
            this.f18731e.mo24728d(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
    }

    public void cancel() {
        this.f18733g.set(true);
    }

    /* renamed from: a */
    protected static DataSpec m25535a(Uri uri) {
        DataSpec dataSpec = new DataSpec(uri, 0, -1, null, 1);
        return dataSpec;
    }
}
