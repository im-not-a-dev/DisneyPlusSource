package p163g.p201e.p203b.p287k.p293k;

import android.text.SpannableStringBuilder;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p201e.p203b.p287k.C7313g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/SeriesMetadataFormatter;", "", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "ratingsFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "yearResId", "", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamnet/config/strings/OverrideStrings;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;I)V", "appendPrior", "", "prefix", "", "spannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "formatMetadata", "Landroid/text/Spannable;", "seriesDetail", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;", "activeEpisode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "formatYear", "series", "Lcom/bamtechmedia/dominguez/core/content/Series;", "getSeasonCountText", "shouldAppendYear", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.p */
/* compiled from: SeriesMetadataFormatter.kt */
public final class C7408p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3572r0 f16265a;

    /* renamed from: b */
    private final C4793a f16266b;

    /* renamed from: c */
    private final C3716q f16267c;

    /* renamed from: d */
    private final int f16268d;

    /* renamed from: g.e.b.k.k.p$a */
    /* compiled from: SeriesMetadataFormatter.kt */
    static final class C7409a extends C12881k implements Function1<GenreMeta, String> {

        /* renamed from: c */
        final /* synthetic */ C7408p f16269c;

        C7409a(C7408p pVar) {
            this.f16269c = pVar;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(GenreMeta genreMeta) {
            String Y = genreMeta.mo12798Y();
            C3572r0 a = this.f16269c.f16265a;
            StringBuilder sb = new StringBuilder();
            sb.append("genre_");
            sb.append(Y);
            return C3573a.m12037b(a, sb.toString(), null, 2, null);
        }
    }

    public C7408p(C3572r0 r0Var, C4793a aVar, C3716q qVar, int i) {
        this.f16265a = r0Var;
        this.f16266b = aVar;
        this.f16267c = qVar;
        this.f16268d = i;
    }

    /* renamed from: b */
    private final boolean m22172b(C3791v vVar) {
        if (!(vVar.mo13027N() == null || vVar.mo13026M() == null)) {
            Integer N = vVar.mo13027N();
            if (N == null || N.intValue() != 0) {
                Integer M = vVar.mo13026M();
                if (M == null || M.intValue() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r15 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Spannable mo20255a(com.bamtechmedia.dominguez.detail.series.models.C6046d r14, com.bamtechmedia.dominguez.core.content.C3685g r15) {
        /*
            r13 = this;
            com.bamtechmedia.dominguez.core.content.v r0 = r14.mo18288d0()
            if (r15 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.assets.Rating r15 = r15.mo13265g()
            if (r15 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.q r1 = r13.f16267c
            android.text.Spannable r15 = r1.mo13544a(r15)
            goto L_0x0014
        L_0x0013:
            r15 = 0
        L_0x0014:
            if (r15 == 0) goto L_0x0024
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r15)
            java.lang.String r15 = " "
            android.text.SpannableStringBuilder r15 = r1.append(r15)
            if (r15 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            android.text.SpannableStringBuilder r15 = new android.text.SpannableStringBuilder
            r15.<init>()
        L_0x0029:
            boolean r1 = r13.m22172b(r0)
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = r13.m22169a(r0)
            r15.append(r0)
        L_0x0036:
            java.lang.String r0 = r13.m22170a(r14)
            int r1 = r0.length()
            r2 = 1
            if (r1 <= 0) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            java.lang.String r3 = " • "
            if (r1 == 0) goto L_0x004e
            r13.m22171a(r3, r15)
            r15.append(r0)
        L_0x004e:
            java.util.List r0 = r14.mo18286c()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0074
            r13.m22171a(r3, r15)
            java.util.List r4 = r14.mo18286c()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            g.e.b.k.k.p$a r10 = new g.e.b.k.k.p$a
            r10.<init>(r13)
            r11 = 31
            r12 = 0
            java.lang.String r14 = kotlin.p590y.C13199w.m40559a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.append(r14)
        L_0x0074:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.C7408p.mo20255a(com.bamtechmedia.dominguez.detail.series.models.d, com.bamtechmedia.dominguez.core.content.g):android.text.Spannable");
    }

    /* renamed from: a */
    private final void m22171a(String str, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append(str);
        }
    }

    /* renamed from: a */
    private final String m22170a(C6046d dVar) {
        int i;
        int size = dVar.mo18287c0().size();
        if (size == 0) {
            return "";
        }
        if (size != 1) {
            i = C7313g.detail_total_seasons;
        } else {
            i = C7313g.detail_total_season;
        }
        return this.f16266b.mo16171a(i, C13170i0.m40332a(C12907r.m40244a("number_of_seasons", String.valueOf(size))));
    }

    /* renamed from: a */
    private final String m22169a(C3791v vVar) {
        return this.f16265a.mo12772a(this.f16268d, C13173j0.m40356a(C12907r.m40244a("min_year", String.valueOf(vVar.mo13027N())), C12907r.m40244a("max_year", String.valueOf(vVar.mo13026M()))));
    }
}
