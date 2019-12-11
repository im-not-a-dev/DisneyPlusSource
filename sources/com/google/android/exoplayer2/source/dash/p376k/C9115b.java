package com.google.android.exoplayer2.source.dash.p376k;

import android.net.Uri;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.offline.C8807a;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.k.b */
/* compiled from: DashManifest */
public class C9115b implements C8807a<C9115b> {

    /* renamed from: a */
    public final long f20423a;

    /* renamed from: b */
    public final long f20424b;

    /* renamed from: c */
    public final long f20425c;

    /* renamed from: d */
    public final boolean f20426d;

    /* renamed from: e */
    public final long f20427e;

    /* renamed from: f */
    public final long f20428f;

    /* renamed from: g */
    public final long f20429g;

    /* renamed from: h */
    public final long f20430h;

    /* renamed from: i */
    public final C9135m f20431i;

    /* renamed from: j */
    public final Uri f20432j;

    /* renamed from: k */
    public final C9121g f20433k;

    /* renamed from: l */
    private final List<C9120f> f20434l;

    public C9115b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C9121g gVar, C9135m mVar, Uri uri, List<C9120f> list) {
        this.f20423a = j;
        this.f20424b = j2;
        this.f20425c = j3;
        this.f20426d = z;
        this.f20427e = j4;
        this.f20428f = j5;
        this.f20429g = j6;
        this.f20430h = j7;
        this.f20433k = gVar;
        this.f20431i = mVar;
        this.f20432j = uri;
        this.f20434l = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: b */
    public final long mo23676b(int i) {
        if (i != this.f20434l.size() - 1) {
            return ((C9120f) this.f20434l.get(i + 1)).f20454b - ((C9120f) this.f20434l.get(i)).f20454b;
        }
        long j = this.f20424b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ((C9120f) this.f20434l.get(i)).f20454b;
    }

    /* renamed from: c */
    public final long mo23677c(int i) {
        return C8883r.m25967a(mo23676b(i));
    }

    /* renamed from: a */
    public final int mo23674a() {
        return this.f20434l.size();
    }

    /* renamed from: a */
    public final C9120f mo23675a(int i) {
        return (C9120f) this.f20434l.get(i);
    }

    /* renamed from: a */
    public final C9115b m27262a(List<StreamKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= mo23674a()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f18724c != i) {
                long b = mo23676b(i);
                if (b != -9223372036854775807L) {
                    j2 += b;
                }
            } else {
                C9120f a = mo23675a(i);
                C9120f fVar = new C9120f(a.f20453a, a.f20454b - j2, m27258a(a.f20455c, linkedList), a.f20456d);
                arrayList.add(fVar);
            }
            i++;
        }
        long j3 = this.f20424b;
        if (j3 != -9223372036854775807L) {
            j = j3 - j2;
        }
        C9115b bVar = new C9115b(this.f20423a, j, this.f20425c, this.f20426d, this.f20427e, this.f20428f, this.f20429g, this.f20430h, this.f20433k, this.f20431i, this.f20432j, arrayList);
        return bVar;
    }

    /* renamed from: a */
    private static ArrayList<C9114a> m27258a(List<C9114a> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKey = (StreamKey) linkedList.poll();
        int i = streamKey.f18724c;
        ArrayList<C9114a> arrayList = new ArrayList<>();
        do {
            int i2 = streamKey.f18722U;
            C9114a aVar = (C9114a) list.get(i2);
            List<C9123i> list2 = aVar.f20420c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((C9123i) list2.get(streamKey.f18723V));
                streamKey = (StreamKey) linkedList.poll();
                if (streamKey.f18724c != i) {
                    break;
                }
            } while (streamKey.f18722U == i2);
            C9114a aVar2 = new C9114a(aVar.f20418a, aVar.f20419b, arrayList2, aVar.f20421d, aVar.f20422e);
            arrayList.add(aVar2);
        } while (streamKey.f18724c == i);
        linkedList.addFirst(streamKey);
        return arrayList;
    }
}
