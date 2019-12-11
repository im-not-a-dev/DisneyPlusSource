package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.e */
/* compiled from: HlsMasterPlaylist */
public final class C9182e extends HlsPlaylist {

    /* renamed from: l */
    public static final C9182e f20748l;

    /* renamed from: d */
    public final List<Uri> f20749d;

    /* renamed from: e */
    public final List<C9184b> f20750e;

    /* renamed from: f */
    public final List<C9183a> f20751f;

    /* renamed from: g */
    public final List<C9183a> f20752g;

    /* renamed from: h */
    public final Format f20753h;

    /* renamed from: i */
    public final List<Format> f20754i;

    /* renamed from: j */
    public final Map<String, String> f20755j;

    /* renamed from: k */
    public final List<DrmInitData> f20756k;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.e$a */
    /* compiled from: HlsMasterPlaylist */
    public static final class C9183a {

        /* renamed from: a */
        public final Uri f20757a;

        /* renamed from: b */
        public final Format f20758b;

        /* renamed from: c */
        public final String f20759c;

        public C9183a(Uri uri, Format format, String str, String str2) {
            this.f20757a = uri;
            this.f20758b = format;
            this.f20759c = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.e$b */
    /* compiled from: HlsMasterPlaylist */
    public static final class C9184b {

        /* renamed from: a */
        public final Uri f20760a;

        /* renamed from: b */
        public final Format f20761b;

        /* renamed from: c */
        public final String f20762c;

        /* renamed from: d */
        public final String f20763d;

        /* renamed from: e */
        public final String f20764e;

        /* renamed from: f */
        public final String f20765f;

        public C9184b(Uri uri, Format format, String str, String str2, String str3, String str4) {
            this.f20760a = uri;
            this.f20761b = format;
            this.f20762c = str;
            this.f20763d = str2;
            this.f20764e = str3;
            this.f20765f = str4;
        }

        /* renamed from: a */
        public static C9184b m27657a(Uri uri) {
            C9184b bVar = new C9184b(uri, Format.m24880a("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null);
            return bVar;
        }

        /* renamed from: a */
        public C9184b mo23895a(Format format) {
            C9184b bVar = new C9184b(this.f20760a, format, this.f20762c, this.f20763d, this.f20764e, this.f20765f);
            return bVar;
        }
    }

    static {
        C9182e eVar = new C9182e("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
        f20748l = eVar;
    }

    public C9182e(String str, List<String> list, List<C9184b> list2, List<C9183a> list3, List<C9183a> list4, List<C9183a> list5, List<C9183a> list6, Format format, List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.f20749d = Collections.unmodifiableList(m27653a(list2, list3, list4, list5, list6));
        this.f20750e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f20751f = Collections.unmodifiableList(list4);
        this.f20752g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f20753h = format;
        this.f20754i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f20755j = Collections.unmodifiableMap(map);
        this.f20756k = Collections.unmodifiableList(list8);
    }

    /* renamed from: a */
    public C9182e m27656a(List<StreamKey> list) {
        C9182e eVar = new C9182e(this.f20714a, this.f20715b, m27652a(this.f20750e, 0, list), Collections.emptyList(), m27652a(this.f20751f, 1, list), m27652a(this.f20752g, 2, list), Collections.emptyList(), this.f20753h, this.f20754i, this.f20716c, this.f20755j, this.f20756k);
        return eVar;
    }

    /* renamed from: a */
    public static C9182e m27651a(String str) {
        C9182e eVar = new C9182e(null, Collections.emptyList(), Collections.singletonList(C9184b.m27657a(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        return eVar;
    }

    /* renamed from: a */
    private static List<Uri> m27653a(List<C9184b> list, List<C9183a> list2, List<C9183a> list3, List<C9183a> list4, List<C9183a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C9184b) list.get(i)).f20760a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m27654a(list2, arrayList);
        m27654a(list3, arrayList);
        m27654a(list4, arrayList);
        m27654a(list5, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m27654a(List<C9183a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C9183a) list.get(i)).f20757a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: a */
    private static <T> List<T> m27652a(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                StreamKey streamKey = (StreamKey) list2.get(i3);
                if (streamKey.f18722U == i && streamKey.f18723V == i2) {
                    arrayList.add(obj);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }
}
