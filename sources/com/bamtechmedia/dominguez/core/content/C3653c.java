package com.bamtechmedia.dominguez.core.content;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "", "startMovieDetail", "", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "popCurrentFromStack", "", "startPlayback", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "requestCode", "", "contentId", "", "startSeriesDetail", "series", "Lcom/bamtechmedia/dominguez/core/content/Series;", "encodedSeriesId", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.c */
/* compiled from: ContentTypeRouter.kt */
public interface C3653c {

    /* renamed from: com.bamtechmedia.dominguez.core.content.c$a */
    /* compiled from: ContentTypeRouter.kt */
    public static final class C3654a {
        /* renamed from: a */
        public static /* synthetic */ void m12425a(C3653c cVar, C3692n nVar, C3690l lVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    lVar = C3690l.NONE;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                cVar.mo13291a(nVar, lVar, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMovieDetail");
        }

        /* renamed from: a */
        public static /* synthetic */ void m12427a(C3653c cVar, C3791v vVar, C3690l lVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    lVar = C3690l.NONE;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                cVar.mo13293a(vVar, lVar, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSeriesDetail");
        }

        /* renamed from: a */
        public static /* synthetic */ void m12428a(C3653c cVar, String str, C3690l lVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    lVar = C3690l.NONE;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                cVar.mo13294a(str, lVar, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSeriesDetail");
        }

        /* renamed from: a */
        public static /* synthetic */ void m12426a(C3653c cVar, C3693o oVar, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 7004;
                }
                cVar.mo13292a(oVar, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlayback");
        }
    }

    /* renamed from: a */
    void mo13291a(C3692n nVar, C3690l lVar, boolean z);

    /* renamed from: a */
    void mo13292a(C3693o oVar, int i);

    /* renamed from: a */
    void mo13293a(C3791v vVar, C3690l lVar, boolean z);

    /* renamed from: a */
    void mo13294a(String str, C3690l lVar, boolean z);
}
