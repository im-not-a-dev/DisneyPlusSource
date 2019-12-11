package com.google.android.exoplayer2.source.hls.p377r;

import android.net.Uri;
import com.google.android.exoplayer2.offline.C8809c;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.C9549j0;
import com.google.android.exoplayer2.source.hls.playlist.C9182e;
import com.google.android.exoplayer2.source.hls.playlist.C9185f;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.r.a */
/* compiled from: HlsDownloader */
public final class C9195a extends C8809c<HlsPlaylist> {
    public C9195a(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    /* renamed from: b */
    private static HlsPlaylist m27709b(DataSource dataSource, DataSpec dataSpec) throws IOException {
        return (HlsPlaylist) ParsingLoadable.m28987a(dataSource, (Parser<? extends T>) new C9185f<Object>(), dataSpec, 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HlsPlaylist m27711a(DataSource dataSource, DataSpec dataSpec) throws IOException {
        return m27709b(dataSource, dataSpec);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C8811b> mo23038a(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (hlsPlaylist instanceof C9182e) {
            m27708a(((C9182e) hlsPlaylist).f20749d, (List<DataSpec>) arrayList);
        } else {
            arrayList.add(C8809c.m25535a(Uri.parse(hlsPlaylist.f20714a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DataSpec dataSpec = (DataSpec) it.next();
            arrayList2.add(new C8811b(0, dataSpec));
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) m27709b(dataSource, dataSpec);
                C9176a aVar = null;
                List<C9176a> list = hlsMediaPlaylist.f20701o;
                for (int i = 0; i < list.size(); i++) {
                    C9176a aVar2 = (C9176a) list.get(i);
                    C9176a aVar3 = aVar2.f20703U;
                    if (!(aVar3 == null || aVar3 == aVar)) {
                        m27707a(hlsMediaPlaylist, aVar3, hashSet, arrayList2);
                        aVar = aVar3;
                    }
                    m27707a(hlsMediaPlaylist, aVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m27708a(List<Uri> list, List<DataSpec> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(C8809c.m25535a((Uri) list.get(i)));
        }
    }

    /* renamed from: a */
    private void m27707a(HlsMediaPlaylist hlsMediaPlaylist, C9176a aVar, HashSet<Uri> hashSet, ArrayList<C8811b> arrayList) {
        String str = hlsMediaPlaylist.f20714a;
        long j = hlsMediaPlaylist.f20692f + aVar.f20706X;
        String str2 = aVar.f20708Z;
        if (str2 != null) {
            Uri b = C9549j0.m29368b(str, str2);
            if (hashSet.add(b)) {
                arrayList.add(new C8811b(j, C8809c.m25535a(b)));
            }
        }
        DataSpec dataSpec = new DataSpec(C9549j0.m29368b(str, aVar.f20711c), aVar.f20710b0, aVar.f20712c0, null);
        arrayList.add(new C8811b(j, dataSpec));
    }
}
