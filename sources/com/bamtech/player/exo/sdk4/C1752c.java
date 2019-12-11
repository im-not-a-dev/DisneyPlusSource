package com.bamtech.player.exo.sdk4;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.media.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.p179a0.C4831f;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a.\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0002*\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a6\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0002*\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, mo31007d2 = {"downloadAllThumbnails", "Lio/reactivex/Single;", "", "Lcom/bamtech/player/bif/BifSpec;", "Lcom/bamtech/sdk4/media/MediaApi;", "item", "Lcom/bamtech/sdk4/media/MediaItem;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "toListOfSingleBifSpecs", "Lcom/bamtech/sdk4/BifThumbnailSet;", "api", "Lcom/bamtech/sdk4/Presentation;", "width", "", "height", "bamplayer-exoplayer-sdk4_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.sdk4.c */
/* compiled from: MediaApiEx.kt */
public final class C1752c {

    /* renamed from: com.bamtech.player.exo.sdk4.c$a */
    /* compiled from: MediaApiEx.kt */
    static final class C1753a<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ ThumbnailResolution f6059U;

        /* renamed from: c */
        final /* synthetic */ MediaApi f6060c;

        C1753a(MediaApi mediaApi, ThumbnailResolution thumbnailResolution) {
            this.f6060c = mediaApi;
            this.f6059U = thumbnailResolution;
        }

        /* renamed from: a */
        public final List<Single<C4831f>> apply(List<BifThumbnailSet> list) {
            return C1752c.m8118b(list, this.f6060c, this.f6059U);
        }
    }

    /* renamed from: com.bamtech.player.exo.sdk4.c$b */
    /* compiled from: MediaApiEx.kt */
    static final class C1754b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ Presentation f6061U;

        /* renamed from: V */
        final /* synthetic */ int f6062V;

        /* renamed from: W */
        final /* synthetic */ int f6063W;

        /* renamed from: c */
        final /* synthetic */ Presentation f6064c;

        C1754b(Presentation presentation, Presentation presentation2, int i, int i2) {
            this.f6064c = presentation;
            this.f6061U = presentation2;
            this.f6062V = i;
            this.f6063W = i2;
        }

        /* renamed from: a */
        public final C4831f apply(String str) {
            C4831f fVar = new C4831f(str, (int) this.f6064c.getOffsetMilliseconds(), (int) this.f6061U.getOffsetMilliseconds(), this.f6062V, this.f6063W);
            return fVar;
        }
    }

    /* renamed from: com.bamtech.player.exo.sdk4.c$c */
    /* compiled from: MediaApiEx.kt */
    static final class C1755c<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ int f6065U;

        /* renamed from: V */
        final /* synthetic */ int f6066V;

        /* renamed from: c */
        final /* synthetic */ Presentation f6067c;

        C1755c(Presentation presentation, int i, int i2) {
            this.f6067c = presentation;
            this.f6065U = i;
            this.f6066V = i2;
        }

        /* renamed from: a */
        public final C4831f apply(String str) {
            C4831f fVar = new C4831f(str, (int) this.f6067c.getOffsetMilliseconds(), Integer.MAX_VALUE, this.f6065U, this.f6066V);
            return fVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List<Single<C4831f>> m8118b(List<BifThumbnailSet> list, MediaApi mediaApi, ThumbnailResolution thumbnailResolution) {
        if (list.isEmpty()) {
            return C13185o.m40513a();
        }
        int i = C1751b.$EnumSwitchMapping$0[thumbnailResolution.ordinal()];
        int i2 = 2;
        if (i == 1 || i == 2) {
            i2 = 0;
        } else if (i == 3) {
            i2 = 1;
        } else if (i != 4) {
            throw new C12898l();
        }
        BifThumbnailSet bifThumbnailSet = (BifThumbnailSet) list.get(Math.min(i2, list.size() - 1));
        return m8116a(bifThumbnailSet.getPresentations(), mediaApi, (int) bifThumbnailSet.getThumbnailWidth(), (int) bifThumbnailSet.getThumbnailHeight());
    }

    /* renamed from: a */
    public static final Single<List<Single<C4831f>>> m8115a(MediaApi mediaApi, MediaItem mediaItem, ThumbnailResolution thumbnailResolution) {
        Single<List<Single<C4831f>>> g = mediaApi.getBifThumbnailSets(mediaItem).mo30233g(new C1753a(mediaApi, thumbnailResolution));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "getBifThumbnailSets(item…s, resolution)\n         }");
        return g;
    }

    /* renamed from: a */
    private static final List<Single<C4831f>> m8116a(List<Presentation> list, MediaApi mediaApi, int i, int i2) {
        if (list.isEmpty()) {
            return C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int size = list.size() - 1;
        while (i3 < size) {
            Presentation presentation = (Presentation) list.get(i3);
            i3++;
            Single g = mediaApi.getBifThumbnail(presentation).mo30233g(new C1754b(presentation, (Presentation) list.get(i3), i, i2));
            Intrinsics.checkReturnedValueIsNotNull((Object) g, "api.getBifThumbnail(pres…      )\n                }");
            arrayList.add(g);
        }
        Presentation presentation2 = (Presentation) C13199w.m40593h((List) list);
        Single g2 = mediaApi.getBifThumbnail(presentation2).mo30233g(new C1755c(presentation2, i, i2));
        Intrinsics.checkReturnedValueIsNotNull((Object) g2, "api.getBifThumbnail(last…    height)\n            }");
        arrayList.add(g2);
        return arrayList;
    }
}
