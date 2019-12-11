package com.bamtechmedia.dominguez.detail.common.p228e0;

import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3651b;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.assets.C3647r;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import com.bamtechmedia.dominguez.detail.common.formats.C5929b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactoryImpl;", "Lcom/bamtechmedia/dominguez/detail/common/metadata/MetadataFactory;", "availableFeaturesFormatter", "Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesFormatter;", "runtimeConverter", "Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "ratingAdvisoriesFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "(Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesFormatter;Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;)V", "create", "Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "browsable", "Lcom/bamtechmedia/dominguez/core/content/Browsable;", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "participants", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "formatGenres", "", "sourceEntity", "Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.e0.b */
/* compiled from: MetadataFactoryImpl.kt */
public final class C5921b implements C5920a {

    /* renamed from: a */
    private final C5929b f13699a;

    /* renamed from: b */
    private final C5821c0 f13700b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3572r0 f13701c;

    /* renamed from: d */
    private final C3716q f13702d;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.e0.b$a */
    /* compiled from: MetadataFactoryImpl.kt */
    static final class C5922a extends C12881k implements Function1<GenreMeta, String> {

        /* renamed from: c */
        final /* synthetic */ C5921b f13703c;

        C5922a(C5921b bVar) {
            this.f13703c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(GenreMeta genreMeta) {
            String Y = genreMeta.mo12798Y();
            C3572r0 a = this.f13703c.f13701c;
            StringBuilder sb = new StringBuilder();
            sb.append("genre_");
            sb.append(Y);
            return C3573a.m12037b(a, sb.toString(), null, 2, null);
        }
    }

    public C5921b(C5929b bVar, C5821c0 c0Var, C3572r0 r0Var, C3716q qVar) {
        this.f13699a = bVar;
        this.f13700b = c0Var;
        this.f13701c = r0Var;
        this.f13702d = qVar;
    }

    /* renamed from: b */
    private final C3647r m19009b(C3651b bVar) {
        if (bVar instanceof C3791v) {
            return C3647r.SERIES;
        }
        return C3647r.PROGRAM;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r5 != null) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtechmedia.dominguez.detail.common.p228e0.C5923c mo17821a(com.bamtechmedia.dominguez.core.content.C3651b r27, com.bamtechmedia.dominguez.core.content.C3693o r28, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Participant> r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            com.bamtechmedia.dominguez.core.content.assets.r r4 = r26.m19009b(r27)
            com.bamtechmedia.dominguez.core.content.assets.r r5 = com.bamtechmedia.dominguez.core.content.assets.C3647r.SERIES
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L_0x001a
            boolean r4 = r27.mo13268i()
            if (r4 == 0) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            java.lang.String r9 = r27.getTitle()
            java.lang.String r10 = r27.getDescription()
            if (r2 == 0) goto L_0x0033
            com.bamtechmedia.dominguez.core.utils.c0 r8 = r0.f13700b
            java.lang.Long r11 = r28.mo12913w()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r8 = r8.mo17731b(r11, r12)
            r11 = r8
            goto L_0x0034
        L_0x0033:
            r11 = 0
        L_0x0034:
            boolean r8 = r1 instanceof com.bamtechmedia.dominguez.core.content.C3791v
            if (r8 != 0) goto L_0x003a
            r8 = 0
            goto L_0x003b
        L_0x003a:
            r8 = r1
        L_0x003b:
            com.bamtechmedia.dominguez.core.content.v r8 = (com.bamtechmedia.dominguez.core.content.C3791v) r8
            if (r8 == 0) goto L_0x0074
            com.bamtechmedia.dominguez.config.r0 r8 = r0.f13701c
            int r12 = p163g.p201e.p203b.p287k.C7313g.series_year_range
            r13 = 2
            kotlin.Pair[] r13 = new kotlin.Pair[r13]
            r14 = r1
            com.bamtechmedia.dominguez.core.content.v r14 = (com.bamtechmedia.dominguez.core.content.C3791v) r14
            java.lang.Integer r15 = r14.mo13027N()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r5 = "min_year"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r5, r15)
            r13[r7] = r5
            java.lang.Integer r5 = r14.mo13026M()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r14 = "max_year"
            kotlin.Pair r5 = kotlin.C12907r.m40244a(r14, r5)
            r13[r6] = r5
            java.util.Map r5 = kotlin.p590y.C13173j0.m40356a(r13)
            java.lang.String r5 = r8.mo12772a(r12, r5)
            if (r5 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            java.lang.String r5 = r27.mo13267h()
        L_0x0078:
            r12 = r5
            java.lang.String r13 = r26.m19008a(r27)
            com.bamtechmedia.dominguez.core.content.assets.Rating r1 = r27.mo13265g()
            if (r1 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.core.content.q r5 = r0.f13702d
            android.text.Spannable r1 = r5.mo13544a(r1)
            r14 = r1
            goto L_0x008c
        L_0x008b:
            r14 = 0
        L_0x008c:
            if (r2 == 0) goto L_0x009c
            com.bamtechmedia.dominguez.detail.common.formats.b r1 = r0.f13699a
            io.reactivex.Single r1 = r1.mo17856a(r2, r7)
            java.lang.Object r1 = r1.mo30224c()
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x009d
        L_0x009c:
            r5 = 0
        L_0x009d:
            if (r4 != 0) goto L_0x00a1
            r15 = r5
            goto L_0x00a2
        L_0x00a1:
            r15 = 0
        L_0x00a2:
            if (r2 == 0) goto L_0x00b4
            com.bamtechmedia.dominguez.detail.common.formats.b r1 = r0.f13699a
            io.reactivex.Single r1 = r1.mo17856a(r2, r6)
            java.lang.Object r1 = r1.mo30224c()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r16 = r1
            r1 = 0
            goto L_0x00b7
        L_0x00b4:
            r1 = 0
            r16 = 0
        L_0x00b7:
            java.util.List r17 = com.bamtechmedia.dominguez.core.content.assets.C3642p.m12398a(r3, r7, r6, r1)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            java.lang.String r18 = "\n"
            java.lang.String r2 = kotlin.p590y.C13199w.m40559a(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r4 == 0) goto L_0x00d4
            r18 = r2
            goto L_0x00d6
        L_0x00d4:
            r18 = r1
        L_0x00d6:
            java.lang.String r17 = com.bamtechmedia.dominguez.core.content.assets.C3642p.m12396a(r29)
            if (r4 == 0) goto L_0x00de
            r1 = 6
            goto L_0x00df
        L_0x00de:
            r1 = 5
        L_0x00df:
            java.util.List r19 = com.bamtechmedia.dominguez.core.content.assets.C3642p.m12399b(r3, r1)
            com.bamtechmedia.dominguez.detail.common.e0.c r1 = new com.bamtechmedia.dominguez.detail.common.e0.c
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p228e0.C5921b.mo17821a(com.bamtechmedia.dominguez.core.content.b, com.bamtechmedia.dominguez.core.content.o, java.util.List):com.bamtechmedia.dominguez.detail.common.e0.c");
    }

    /* renamed from: a */
    private final String m19008a(C3651b bVar) {
        return C13199w.m40559a(bVar.mo12896c(), null, null, null, 0, null, new C5922a(this), 31, null);
    }
}
