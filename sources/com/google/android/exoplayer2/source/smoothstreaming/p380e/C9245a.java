package com.google.android.exoplayer2.source.smoothstreaming.p380e;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.C8807a;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p366s0.p371v.C8984n;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9549j0;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.a */
/* compiled from: SsManifest */
public class C9245a implements C8807a<C9245a> {

    /* renamed from: a */
    public final int f21002a;

    /* renamed from: b */
    public final int f21003b;

    /* renamed from: c */
    public final int f21004c;

    /* renamed from: d */
    public final boolean f21005d;

    /* renamed from: e */
    public final C9246a f21006e;

    /* renamed from: f */
    public final C9247b[] f21007f;

    /* renamed from: g */
    public final long f21008g;

    /* renamed from: h */
    public final long f21009h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.a$a */
    /* compiled from: SsManifest */
    public static class C9246a {

        /* renamed from: a */
        public final UUID f21010a;

        /* renamed from: b */
        public final byte[] f21011b;

        /* renamed from: c */
        public final C8984n[] f21012c;

        public C9246a(UUID uuid, byte[] bArr, C8984n[] nVarArr) {
            this.f21010a = uuid;
            this.f21011b = bArr;
            this.f21012c = nVarArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.e.a$b */
    /* compiled from: SsManifest */
    public static class C9247b {

        /* renamed from: a */
        public final int f21013a;

        /* renamed from: b */
        public final String f21014b;

        /* renamed from: c */
        public final long f21015c;

        /* renamed from: d */
        public final String f21016d;

        /* renamed from: e */
        public final int f21017e;

        /* renamed from: f */
        public final int f21018f;

        /* renamed from: g */
        public final int f21019g;

        /* renamed from: h */
        public final int f21020h;

        /* renamed from: i */
        public final String f21021i;

        /* renamed from: j */
        public final Format[] f21022j;

        /* renamed from: k */
        public final int f21023k;

        /* renamed from: l */
        private final String f21024l;

        /* renamed from: m */
        private final String f21025m;

        /* renamed from: n */
        private final List<Long> f21026n;

        /* renamed from: o */
        private final long[] f21027o;

        /* renamed from: p */
        private final long f21028p;

        public C9247b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            String str6 = str;
            String str7 = str2;
            int i6 = i;
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, C9554k0.m29418a(list, 1000000, j), C9554k0.m29439c(j2, 1000000, j));
        }

        /* renamed from: a */
        public C9247b mo23986a(Format[] formatArr) {
            Format[] formatArr2 = formatArr;
            C9247b bVar = new C9247b(this.f21024l, this.f21025m, this.f21013a, this.f21014b, this.f21015c, this.f21016d, this.f21017e, this.f21018f, this.f21019g, this.f21020h, this.f21021i, formatArr2, this.f21026n, this.f21027o, this.f21028p);
            return bVar;
        }

        /* renamed from: b */
        public long mo23987b(int i) {
            return this.f21027o[i];
        }

        /* renamed from: a */
        public int mo23983a(long j) {
            return C9554k0.m29429b(this.f21027o, j, true, true);
        }

        /* renamed from: a */
        public long mo23984a(int i) {
            if (i == this.f21023k - 1) {
                return this.f21028p;
            }
            long[] jArr = this.f21027o;
            return jArr[i + 1] - jArr[i];
        }

        private C9247b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.f21024l = str;
            this.f21025m = str2;
            this.f21013a = i;
            this.f21014b = str3;
            this.f21015c = j;
            this.f21016d = str4;
            this.f21017e = i2;
            this.f21018f = i3;
            this.f21019g = i4;
            this.f21020h = i5;
            this.f21021i = str5;
            this.f21022j = formatArr;
            this.f21026n = list;
            this.f21027o = jArr;
            this.f21028p = j2;
            this.f21023k = list.size();
        }

        /* renamed from: a */
        public Uri mo23985a(int i, int i2) {
            boolean z = true;
            C9537e.m29301b(this.f21022j != null);
            C9537e.m29301b(this.f21026n != null);
            if (i2 >= this.f21026n.size()) {
                z = false;
            }
            C9537e.m29301b(z);
            String num = Integer.toString(this.f21022j[i].f18345X);
            String l = ((Long) this.f21026n.get(i2)).toString();
            return C9549j0.m29368b(this.f21024l, this.f21025m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }
    }

    public C9245a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C9246a aVar, C9247b[] bVarArr) {
        long j4 = -9223372036854775807L;
        long c = j2 == 0 ? -9223372036854775807L : C9554k0.m29439c(j2, 1000000, j);
        if (j3 != 0) {
            j4 = C9554k0.m29439c(j3, 1000000, j);
        }
        this(i, i2, c, j4, i3, z, aVar, bVarArr);
    }

    /* renamed from: a */
    public final C9245a m27932a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C9247b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            C9247b bVar2 = this.f21007f[streamKey.f18722U];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.mo23986a((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f21022j[streamKey.f18723V]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.mo23986a((Format[]) arrayList3.toArray(new Format[0])));
        }
        C9245a aVar = new C9245a(this.f21002a, this.f21003b, this.f21008g, this.f21009h, this.f21004c, this.f21005d, this.f21006e, (C9247b[]) arrayList2.toArray(new C9247b[0]));
        return aVar;
    }

    private C9245a(int i, int i2, long j, long j2, int i3, boolean z, C9246a aVar, C9247b[] bVarArr) {
        this.f21002a = i;
        this.f21003b = i2;
        this.f21008g = j;
        this.f21009h = j2;
        this.f21004c = i3;
        this.f21005d = z;
        this.f21006e = aVar;
        this.f21007f = bVarArr;
    }
}
