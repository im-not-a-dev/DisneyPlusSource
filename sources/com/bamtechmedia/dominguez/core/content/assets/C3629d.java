package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformationsImpl;", "Lcom/bamtechmedia/dominguez/core/content/assets/ContentClicksTransformations;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "convertToContentId", "", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "convertToMap", "", "episodeExtras", "playableExtras", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.assets.d */
/* compiled from: ContentClicksTransformationsImpl.kt */
public final class C3629d implements C3628c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3572r0 f9127a;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.d$a */
    /* compiled from: ContentClicksTransformationsImpl.kt */
    static final class C3630a extends C12881k implements Function1<GenreMeta, String> {

        /* renamed from: c */
        final /* synthetic */ C3629d f9128c;

        C3630a(C3629d dVar, C3626b bVar) {
            this.f9128c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(GenreMeta genreMeta) {
            String Y = genreMeta.mo12798Y();
            C3572r0 a = this.f9128c.f9127a;
            StringBuilder sb = new StringBuilder();
            sb.append("genre_");
            sb.append(Y);
            return C3573a.m12037b(a, sb.toString(), null, 2, null);
        }
    }

    public C3629d(C3572r0 r0Var) {
        this.f9127a = r0Var;
    }

    /* renamed from: c */
    private final Map<String, String> m12348c(C3626b bVar) {
        if (!(bVar instanceof C3685g)) {
            bVar = null;
        }
        C3685g gVar = (C3685g) bVar;
        if (gVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('s');
            sb.append(gVar.mo12876F());
            sb.append('e');
            sb.append(gVar.mo12878I());
            Map<String, String> a = C13173j0.m40356a(C12907r.m40244a("contentSeriesEpisodeNumber", sb.toString()), C12907r.m40244a("contentSeasonSequenceNumber", String.valueOf(gVar.mo12876F())), C12907r.m40244a("contentEpisodeNumber", String.valueOf(gVar.mo12878I())));
            if (a != null) {
                return a;
            }
        }
        return C13173j0.m40350a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m12349d(com.bamtechmedia.dominguez.core.content.assets.C3626b r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.bamtechmedia.dominguez.core.content.C3693o
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r15
        L_0x0008:
            com.bamtechmedia.dominguez.core.content.o r0 = (com.bamtechmedia.dominguez.core.content.C3693o) r0
            if (r0 == 0) goto L_0x00e4
            boolean r2 = r15 instanceof com.bamtechmedia.dominguez.core.content.C3685g
            if (r2 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r15
        L_0x0012:
            com.bamtechmedia.dominguez.core.content.g r1 = (com.bamtechmedia.dominguez.core.content.C3685g) r1
            java.lang.String r2 = " - "
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 115(0x73, float:1.61E-43)
            r4.append(r5)
            int r5 = r1.mo12876F()
            r4.append(r5)
            r5 = 101(0x65, float:1.42E-43)
            r4.append(r5)
            int r1 = r1.mo12878I()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            if (r1 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            r4 = 7
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.mo12903f()
            r6.append(r7)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = r0.getTitle()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "contentAssetName"
            kotlin.Pair r1 = kotlin.C12907r.m40244a(r2, r1)
            r4[r5] = r1
            r1 = 1
            java.lang.String r2 = r0.mo12903f()
            java.lang.String r5 = "contentId"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r5, r2)
            r4[r1] = r2
            r1 = 2
            java.lang.String r2 = r0.getMediaId()
            java.lang.String r5 = "mediaId"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r5, r2)
            r4[r1] = r2
            r1 = 3
            java.lang.String r2 = r0.getTitle()
            java.lang.String r5 = "contentTitle"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r5, r2)
            r4[r1] = r2
            r1 = 4
            java.lang.String r2 = r0.getContentType()
            if (r2 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r2 = r3
        L_0x009b:
            java.lang.String r3 = "contentType"
            kotlin.Pair r2 = kotlin.C12907r.m40244a(r3, r2)
            r4[r1] = r2
            r1 = 5
            java.util.List r5 = r0.mo12896c()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.bamtechmedia.dominguez.core.content.assets.d$a r11 = new com.bamtechmedia.dominguez.core.content.assets.d$a
            r11.<init>(r14, r15)
            r12 = 31
            r13 = 0
            java.lang.String r15 = kotlin.p590y.C13199w.m40559a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "contentGenre"
            kotlin.Pair r15 = kotlin.C12907r.m40244a(r2, r15)
            r4[r1] = r15
            r15 = 6
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "it.javaClass.simpleName"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            java.lang.String r1 = "Dmc"
            java.lang.String r0 = kotlin.p588j0.C12833x.m40137a(r0, r1)
            java.lang.String r1 = "contentProgramType"
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r1, r0)
            r4[r15] = r0
            java.util.Map r15 = kotlin.p590y.C13173j0.m40356a(r4)
            if (r15 == 0) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            java.util.Map r15 = kotlin.p590y.C13173j0.m40350a()
        L_0x00e8:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.C3629d.m12349d(com.bamtechmedia.dominguez.core.content.assets.b):java.util.Map");
    }

    /* renamed from: b */
    public Map<String, String> mo13258b(C3626b bVar) {
        return C13173j0.m40353a(m12349d(bVar), m12348c(bVar));
    }

    /* renamed from: a */
    public String mo13257a(C3626b bVar) {
        if (!(bVar instanceof C3693o)) {
            bVar = null;
        }
        C3693o oVar = (C3693o) bVar;
        if (oVar != null) {
            String f = oVar.mo12903f();
            if (f != null) {
                return f;
            }
        }
        return "";
    }
}
