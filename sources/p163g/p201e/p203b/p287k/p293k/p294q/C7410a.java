package p163g.p201e.p203b.p287k.p293k.p294q;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3653c.C3654a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.core.recycler.C5811a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5844l0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.detail.common.C5897a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5900b;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5901c;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5902d;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5903e;
import com.bamtechmedia.dominguez.detail.common.C5905b;
import com.bamtechmedia.dominguez.detail.common.C5918e;
import com.bamtechmedia.dominguez.detail.common.C5998r;
import com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p287k.C7309c;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.C7407o;
import p163g.p201e.p203b.p287k.p293k.C7408p;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0002IJBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J&\u0010+\u001a\u00020,2\u0006\u00101\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0016J\t\u00104\u001a\u00020\u0003HÂ\u0003J\t\u00105\u001a\u00020\u0015HÂ\u0003J\t\u00106\u001a\u00020\u0005HÂ\u0003J\t\u00107\u001a\u00020\u0007HÂ\u0003J\t\u00108\u001a\u00020\tHÂ\u0003J\t\u00109\u001a\u00020\u000bHÂ\u0003J\t\u0010:\u001a\u00020\rHÂ\u0003J\t\u0010;\u001a\u00020\u000fHÂ\u0003J\t\u0010<\u001a\u00020\u0011HÂ\u0003J\t\u0010=\u001a\u00020\u0013HÂ\u0003Jm\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\n\u0010?\u001a\u0004\u0018\u00010\"H\u0002J\u0013\u0010@\u001a\u00020)2\b\u0010A\u001a\u0004\u0018\u000103HÖ\u0003J\u0018\u0010B\u001a\u0004\u0018\u0001032\f\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010DH\u0016J\b\u0010E\u001a\u000200H\u0016J\t\u0010F\u001a\u000200HÖ\u0001J\u0016\u0010G\u001a\u00020)2\f\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010DH\u0016J\t\u0010H\u001a\u00020\u001aHÖ\u0001R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "dataParams", "Lcom/bamtechmedia/dominguez/detail/series/SeriesHeaderMetadataParams;", "titleTreatment", "Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "seriesDetailViewModel", "Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;", "bookmarkStateBinder", "Lcom/bamtechmedia/dominguez/detail/common/DetailBookmarkStateBinder;", "contentTypeRouter", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "seriesMetadataFormatter", "Lcom/bamtechmedia/dominguez/detail/series/SeriesMetadataFormatter;", "seriesDetailAnalytics", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailAnalytics;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "promoLabelFormatter", "Lcom/bamtechmedia/dominguez/detail/common/PromoLabelFormatter;", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/detail/series/SeriesHeaderMetadataParams;Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;Lcom/bamtechmedia/dominguez/detail/common/DetailBookmarkStateBinder;Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;Lcom/bamtechmedia/dominguez/detail/series/SeriesMetadataFormatter;Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailAnalytics;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/detail/common/PromoLabelFormatter;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "activeEpisode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "description", "", "elements", "", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "episodeLevelDescription", "formatAvailability", "", "metadataSpannable", "Landroid/text/Spannable;", "playBtnState", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;", "promoLabelText", "series", "Lcom/bamtechmedia/dominguez/core/content/Series;", "seriesDetailLoaded", "", "seriesLevelDescription", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "createMetadata", "equals", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isSameAs", "toString", "Elements", "Factory", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.q.a */
/* compiled from: SeriesDetailHeaderItem.kt */
public final class C7410a extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3685g f16270U;

    /* renamed from: V */
    private final String f16271V;

    /* renamed from: W */
    private final String f16272W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final String f16273X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C3791v f16274Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final String f16275Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final CharSequence f16276a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final Spannable f16277b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f16278c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C5898a f16279c0;

    /* renamed from: d0 */
    private final List<C7411a> f16280d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C7407o f16281e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final C3850c f16282f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C7454a f16283g0;

    /* renamed from: h0 */
    private final C5918e f16284h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final C3653c f16285i0;

    /* renamed from: j0 */
    private final C7408p f16286j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final C7391d f16287k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C3572r0 f16288l0;

    /* renamed from: m0 */
    private final C5998r f16289m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final C5948c f16290n0;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\"\b\u0002\u0012\u0019\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH$R$\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "", "valueProvider", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getValueProvider", "()Lkotlin/jvm/functions/Function1;", "bind", "", "item", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "payloads", "", "bindAlways", "bindIfChanged", "TITLE_TREATMENT", "DESCRIPTION", "PROMO_LABEL", "FEATURED_EPISODE", "FORMAT_AVAILABILITY", "METADATA", "PLAY_BUTTON", "WATCHLIST", "SERIES_DETAIL_LOADED", "HEADER_IMAGE", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.q.a$a */
    /* compiled from: SeriesDetailHeaderItem.kt */
    public enum C7411a {
        ;
        

        /* renamed from: c */
        private final Function1<C7410a, Object> f16302c;

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$DESCRIPTION;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$a */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7412a extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$a$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7413a extends C12881k implements Function1<C7410a, String> {

                /* renamed from: c */
                public static final C7413a f16303c = null;

                static {
                    f16303c = new C7413a();
                }

                C7413a() {
                    super(1);
                }

                /* renamed from: a */
                public final String invoke(C7410a aVar) {
                    return aVar.f16273X;
                }
            }

            C7412a(String str, int i) {
                super(str, i, C7413a.f16303c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.videoDetailDescription);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "holder.videoDetailDescription");
                C5844l0.m18865a(textView, (CharSequence) aVar.f16273X, false, 2, (Object) null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$FEATURED_EPISODE;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$b */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7414b extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$b$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7415a extends C12881k implements Function1<C7410a, C3685g> {

                /* renamed from: c */
                public static final C7415a f16304c = null;

                static {
                    f16304c = new C7415a();
                }

                C7415a() {
                    super(1);
                }

                /* renamed from: a */
                public final C3685g invoke(C7410a aVar) {
                    return aVar.f16270U;
                }
            }

            C7414b(String str, int i) {
                super(str, i, C7415a.f16304c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                C3685g a = aVar.f16270U;
                if (a != null) {
                    TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.featuredEpisodeTitle);
                    Intrinsics.checkReturnedValueIsNotNull((Object) textView, "holder.featuredEpisodeTitle");
                    C5844l0.m18865a(textView, (CharSequence) aVar.f16288l0.mo12775b("season_episode_title_placeholder", C13173j0.m40356a(C12907r.m40244a("S", String.valueOf(a.mo12876F())), C12907r.m40244a("E", String.valueOf(a.mo12878I())), C12907r.m40244a("TITLE", a.getTitle()))), false, 2, (Object) null);
                }
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$FORMAT_AVAILABILITY;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$c */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7416c extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$c$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7417a extends C12881k implements Function1<C7410a, CharSequence> {

                /* renamed from: c */
                public static final C7417a f16305c = null;

                static {
                    f16305c = new C7417a();
                }

                C7417a() {
                    super(1);
                }

                /* renamed from: a */
                public final CharSequence invoke(C7410a aVar) {
                    return aVar.f16276a0;
                }
            }

            C7416c(String str, int i) {
                super(str, i, C7417a.f16305c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.formatAvailability);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "holder.formatAvailability");
                C5844l0.m18865a(textView, aVar.f16276a0, false, 2, (Object) null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$HEADER_IMAGE;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$d */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7418d extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$d$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7419a extends C12881k implements Function1<C7410a, Image> {

                /* renamed from: c */
                public static final C7419a f16306c = null;

                static {
                    f16306c = new C7419a();
                }

                C7419a() {
                    super(1);
                }

                /* renamed from: a */
                public final Image invoke(C7410a aVar) {
                    C3626b b = aVar.f16281e0.mo20243b();
                    if (b != null) {
                        return b.mo12845a(C3688j.BACKGROUND_DETAILS, C3623a.f9125b0.mo13248a());
                    }
                    return null;
                }
            }

            C7418d(String str, int i) {
                super(str, i, C7419a.f16306c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                C3626b b = aVar.f16281e0.mo20243b();
                if (b != null) {
                    AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C7310d.headerImage);
                    if (aspectRatioImageView != null) {
                        C4127b0.m14131b(aspectRatioImageView, true);
                    }
                    View findViewById = bVar.mo20994a().findViewById(C7310d.headerImageGradient);
                    if (findViewById != null) {
                        C4127b0.m14131b(findViewById, true);
                    }
                    AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) bVar.mo20994a().findViewById(C7310d.headerImage);
                    if (aspectRatioImageView2 != null) {
                        C5763b.m18702a(aspectRatioImageView2, b.mo12845a(C3688j.BACKGROUND_DETAILS, C3623a.f9125b0.mo13248a()), C7309c.fallback_1_78_tile, null, null, false, false, false, 124, null);
                    }
                }
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$METADATA;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$e */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7420e extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$e$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7421a extends C12881k implements Function1<C7410a, Spannable> {

                /* renamed from: c */
                public static final C7421a f16307c = null;

                static {
                    f16307c = new C7421a();
                }

                C7421a() {
                    super(1);
                }

                /* renamed from: a */
                public final Spannable invoke(C7410a aVar) {
                    return aVar.f16277b0;
                }
            }

            C7420e(String str, int i) {
                super(str, i, C7421a.f16307c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.metaData);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "holder.metaData");
                C5844l0.m18865a(textView, (CharSequence) aVar.f16277b0, false, 2, (Object) null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$PLAY_BUTTON;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindAlways", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "bindIfChanged", "bindPlaybackListeners", "startPlayerButton", "Landroid/view/View;", "restartButton", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$f */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7422f extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$f$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7423a extends C12881k implements Function1<C7410a, C5898a> {

                /* renamed from: c */
                public static final C7423a f16308c = null;

                static {
                    f16308c = new C7423a();
                }

                C7423a() {
                    super(1);
                }

                /* renamed from: a */
                public final C5898a invoke(C7410a aVar) {
                    return aVar.f16279c0;
                }
            }

            /* renamed from: g.e.b.k.k.q.a$a$f$b */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7424b implements OnClickListener {

                /* renamed from: U */
                final /* synthetic */ C3685g f16309U;

                /* renamed from: c */
                final /* synthetic */ C7410a f16310c;

                C7424b(C7410a aVar, C3685g gVar) {
                    this.f16310c = aVar;
                    this.f16309U = gVar;
                }

                public final void onClick(View view) {
                    long j;
                    if (this.f16310c.f16279c0 instanceof C5900b) {
                        C3654a.m12426a(this.f16310c.f16285i0, ((C5900b) this.f16310c.f16279c0).mo17800b(), 0, 2, null);
                        return;
                    }
                    C3685g gVar = this.f16309U;
                    if (gVar != null) {
                        Bookmark d = this.f16310c.f16281e0.mo20245d();
                        if (d != null) {
                            if (C5905b.m18989a(d)) {
                                d = null;
                            }
                            if (d != null) {
                                j = d.getPlayhead();
                                C3685g a = gVar.mo12893a(j);
                                C3654a.m12426a(this.f16310c.f16285i0, a, 0, 2, null);
                                this.f16310c.f16287k0.mo20218a(a);
                            }
                        }
                        j = 0;
                        C3685g a2 = gVar.mo12893a(j);
                        C3654a.m12426a(this.f16310c.f16285i0, a2, 0, 2, null);
                        this.f16310c.f16287k0.mo20218a(a2);
                    }
                }
            }

            /* renamed from: g.e.b.k.k.q.a$a$f$c */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7425c implements OnClickListener {

                /* renamed from: U */
                final /* synthetic */ C7410a f16311U;

                /* renamed from: c */
                final /* synthetic */ C3685g f16312c;

                C7425c(C3685g gVar, C7410a aVar) {
                    this.f16312c = gVar;
                    this.f16311U = aVar;
                }

                public final void onClick(View view) {
                    C3685g gVar = this.f16312c;
                    if (gVar != null) {
                        C3685g a = gVar.mo12893a(-1);
                        C3654a.m12426a(this.f16311U.f16285i0, a, 0, 2, null);
                        this.f16311U.f16287k0.mo20221b(a);
                    }
                }
            }

            C7422f(String str, int i) {
                super(str, i, C7423a.f16308c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo20263a(C7410a aVar, C11867b bVar) {
                View findViewById = bVar.itemView.findViewById(C7310d.startPlayerButton);
                Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "playerButton");
                m22205a(aVar, findViewById, (DefaultBookmarkButton) bVar.mo20994a().findViewById(C7310d.restartButton));
                int i = C7310d.focusHelperExpandContentDetailHeaderOnFocus;
                Boolean valueOf = Boolean.valueOf(true);
                findViewById.setTag(i, valueOf);
                findViewById.setTag(C7310d.focusHelperHorizontalFocusSearchWithinParent, valueOf);
                DefaultBookmarkButton defaultBookmarkButton = (DefaultBookmarkButton) bVar.mo20994a().findViewById(C7310d.restartButton);
                if (defaultBookmarkButton != null) {
                    defaultBookmarkButton.setTag(C7310d.focusHelperExpandContentDetailHeaderOnFocus, valueOf);
                }
                DefaultBookmarkButton defaultBookmarkButton2 = (DefaultBookmarkButton) bVar.mo20994a().findViewById(C7310d.restartButton);
                if (defaultBookmarkButton2 != null) {
                    defaultBookmarkButton2.setTag(C7310d.focusHelperHorizontalFocusSearchWithinParent, valueOf);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                C5897a aVar2 = (C5897a) bVar.itemView.findViewById(C7310d.startPlayerButton);
                Intrinsics.checkReturnedValueIsNotNull((Object) aVar2, "playerButton");
                aVar2.setVisibility(aVar.f16278c ? 0 : 8);
                if (aVar.f16279c0 != null) {
                    aVar2.setState(aVar.f16279c0);
                    if (aVar.f16290n0.mo17878g()) {
                        C5898a aVar3 = aVar.f16279c0 instanceof C5902d ? C5901c.f13691a : C5903e.f13694a;
                        DefaultBookmarkButton defaultBookmarkButton = (DefaultBookmarkButton) bVar.mo20994a().findViewById(C7310d.restartButton);
                        if (defaultBookmarkButton != null) {
                            defaultBookmarkButton.setState(aVar3);
                        }
                    }
                }
            }

            /* renamed from: a */
            private final void m22205a(C7410a aVar, View view, C5897a aVar2) {
                C3685g a = aVar.f16281e0.mo20242a();
                view.setOnClickListener(new C7424b(aVar, a));
                if (aVar2 != null) {
                    aVar2.setOnClickListener(new C7425c(a, aVar));
                }
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$PROMO_LABEL;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$g */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7426g extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$g$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7427a extends C12881k implements Function1<C7410a, String> {

                /* renamed from: c */
                public static final C7427a f16313c = null;

                static {
                    f16313c = new C7427a();
                }

                C7427a() {
                    super(1);
                }

                /* renamed from: a */
                public final String invoke(C7410a aVar) {
                    return aVar.f16275Z;
                }
            }

            C7426g(String str, int i) {
                super(str, i, C7427a.f16313c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.promoLabelTextView);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "holder.promoLabelTextView");
                C5844l0.m18865a(textView, (CharSequence) aVar.f16275Z, false, 2, (Object) null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$SERIES_DETAIL_LOADED;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$h */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7428h extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$h$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7429a extends C12881k implements Function1<C7410a, Boolean> {

                /* renamed from: c */
                public static final C7429a f16314c = null;

                static {
                    f16314c = new C7429a();
                }

                C7429a() {
                    super(1);
                }

                /* renamed from: a */
                public final boolean mo20275a(C7410a aVar) {
                    return aVar.f16278c;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(mo20275a((C7410a) obj));
                }
            }

            C7428h(String str, int i) {
                super(str, i, C7429a.f16314c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                if (aVar.f16278c) {
                    View view = bVar.itemView;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
                    Context context = view.getContext();
                    Intrinsics.checkReturnedValueIsNotNull((Object) context, "holder.itemView.context");
                    if (C5837i.m18843e(context)) {
                        View findViewById = bVar.itemView.findViewById(C7310d.startPlayerButton);
                        ImageView imageView = (ImageView) bVar.itemView.findViewById(C7310d.watchlistButton);
                        Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "playerButton");
                        boolean z = true;
                        if (findViewById.getVisibility() == 0) {
                            findViewById.requestFocus();
                            return;
                        }
                        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "addWatchlistButton");
                        if (imageView.getVisibility() != 0) {
                            z = false;
                        }
                        if (z) {
                            imageView.requestFocus();
                        }
                    }
                }
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$TITLE_TREATMENT;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindIfChanged", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$i */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7430i extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$i$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7431a extends C12881k implements Function1<C7410a, C3850c> {

                /* renamed from: c */
                public static final C7431a f16315c = null;

                static {
                    f16315c = new C7431a();
                }

                C7431a() {
                    super(1);
                }

                /* renamed from: a */
                public final C3850c invoke(C7410a aVar) {
                    return aVar.f16282f0;
                }
            }

            C7430i(String str, int i) {
                super(str, i, C7431a.f16315c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                ImageView imageView = (ImageView) bVar.mo20994a().findViewById(C7310d.contentDetailTitleImage);
                if (imageView != null) {
                    aVar.f16282f0.mo13768a(aVar.f16274Y, imageView);
                    imageView.setContentDescription(aVar.f16274Y.getTitle());
                }
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements$WATCHLIST;", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem$Elements;", "bindAlways", "", "item", "Lcom/bamtechmedia/dominguez/detail/series/item/SeriesDetailHeaderItem;", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "bindIfChanged", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: g.e.b.k.k.q.a$a$j */
        /* compiled from: SeriesDetailHeaderItem.kt */
        static final class C7432j extends C7411a {

            /* renamed from: g.e.b.k.k.q.a$a$j$a */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7433a extends C12881k implements Function1<C7410a, Boolean> {

                /* renamed from: c */
                public static final C7433a f16316c = null;

                static {
                    f16316c = new C7433a();
                }

                C7433a() {
                    super(1);
                }

                /* renamed from: a */
                public final Boolean invoke(C7410a aVar) {
                    return aVar.f16281e0.mo20253j();
                }
            }

            /* renamed from: g.e.b.k.k.q.a$a$j$b */
            /* compiled from: SeriesDetailHeaderItem.kt */
            static final class C7434b implements OnClickListener {

                /* renamed from: c */
                final /* synthetic */ C7410a f16317c;

                C7434b(C7410a aVar) {
                    this.f16317c = aVar;
                }

                public final void onClick(View view) {
                    this.f16317c.f16283g0.mo20299G();
                }
            }

            C7432j(String str, int i) {
                super(str, i, C7433a.f16316c, null);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo20263a(C7410a aVar, C11867b bVar) {
                ImageView imageView = (ImageView) bVar.itemView.findViewById(C7310d.watchlistButton);
                imageView.setOnClickListener(new C7434b(aVar));
                int i = C7310d.focusHelperExpandContentDetailHeaderOnFocus;
                Boolean valueOf = Boolean.valueOf(true);
                imageView.setTag(i, valueOf);
                imageView.setTag(C7310d.focusHelperHorizontalFocusSearchWithinParent, valueOf);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo20265b(C7410a aVar, C11867b bVar) {
                int i;
                ImageView imageView = (ImageView) bVar.itemView.findViewById(C7310d.watchlistButton);
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "addWatchlistButton");
                Boolean j = aVar.f16281e0.mo20253j();
                int i2 = 0;
                Boolean valueOf = Boolean.valueOf(true);
                if (!(j != null)) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                if (!Intrinsics.areEqual((Object) Boolean.valueOf(imageView.isSelected()), (Object) aVar.f16281e0.mo20253j())) {
                    imageView.setSelected(Intrinsics.areEqual((Object) aVar.f16281e0.mo20253j(), (Object) valueOf));
                }
                if (Intrinsics.areEqual((Object) aVar.f16281e0.mo20253j(), (Object) valueOf)) {
                    i = C7313g.a11y_details_watchlist_remove;
                } else {
                    i = C7313g.a11y_details_watchlist;
                }
                imageView.setContentDescription(C5880u.m18936a(i));
            }
        }

        private C7411a(Function1<? super C7410a, ? extends Object> function1) {
            this.f16302c = function1;
        }

        /* renamed from: a */
        public final Function1<C7410a, Object> mo20262a() {
            return this.f16302c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo20263a(C7410a aVar, C11867b bVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo20265b(C7410a aVar, C11867b bVar);

        /* renamed from: a */
        public final void mo20264a(C7410a aVar, C11867b bVar, List<? extends Object> list) {
            boolean z;
            boolean z2;
            mo20263a(aVar, bVar);
            boolean z3 = true;
            if (!list.isEmpty()) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (!(next instanceof C5811a) || !((C5811a) next).mo17723a().contains(this)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z3 = false;
                }
            }
            if (z3) {
                mo20265b(aVar, bVar);
            }
        }
    }

    /* renamed from: g.e.b.k.k.q.a$b */
    /* compiled from: SeriesDetailHeaderItem.kt */
    public static final class C7435b {

        /* renamed from: a */
        private final C3850c f16318a;

        /* renamed from: b */
        private final C7454a f16319b;

        /* renamed from: c */
        private final C5918e f16320c;

        /* renamed from: d */
        private final C3653c f16321d;

        /* renamed from: e */
        private final C7408p f16322e;

        /* renamed from: f */
        private final C7391d f16323f;

        /* renamed from: g */
        private final C3572r0 f16324g;

        /* renamed from: h */
        private final C5998r f16325h;

        /* renamed from: i */
        private final C5948c f16326i;

        public C7435b(C3850c cVar, C7454a aVar, C5918e eVar, C3653c cVar2, C7408p pVar, C7391d dVar, C3572r0 r0Var, C5998r rVar, C5948c cVar3) {
            this.f16318a = cVar;
            this.f16319b = aVar;
            this.f16320c = eVar;
            this.f16321d = cVar2;
            this.f16322e = pVar;
            this.f16323f = dVar;
            this.f16324g = r0Var;
            this.f16325h = rVar;
            this.f16326i = cVar3;
        }

        /* renamed from: a */
        public final C7410a mo20279a(C7407o oVar) {
            C7410a aVar = new C7410a(oVar, this.f16318a, this.f16319b, this.f16320c, this.f16321d, this.f16322e, this.f16323f, this.f16324g, this.f16325h, this.f16326i);
            return aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r6 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        if (((kotlin.p588j0.C12832w.m40118a(r1) ^ true) && r0.f16290n0.mo17876e()) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e0, code lost:
        if ((r0.f16278c && (kotlin.p588j0.C12832w.m40118a(r1) ^ true)) != false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7410a(p163g.p201e.p203b.p287k.p293k.C7407o r1, com.bamtechmedia.dominguez.core.p088i.p091p.C3850c r2, p163g.p201e.p203b.p287k.p293k.p297t.C7454a r3, com.bamtechmedia.dominguez.detail.common.C5918e r4, com.bamtechmedia.dominguez.core.content.C3653c r5, p163g.p201e.p203b.p287k.p293k.C7408p r6, p163g.p201e.p203b.p287k.p293k.C7391d r7, com.bamtechmedia.dominguez.config.C3572r0 r8, com.bamtechmedia.dominguez.detail.common.C5998r r9, com.bamtechmedia.dominguez.detail.common.p230g0.C5948c r10) {
        /*
            r0 = this;
            r0.<init>()
            r0.f16281e0 = r1
            r0.f16282f0 = r2
            r0.f16283g0 = r3
            r0.f16284h0 = r4
            r0.f16285i0 = r5
            r0.f16286j0 = r6
            r0.f16287k0 = r7
            r0.f16288l0 = r8
            r0.f16289m0 = r9
            r0.f16290n0 = r10
            g.e.b.k.k.o r1 = r0.f16281e0
            com.bamtechmedia.dominguez.detail.series.models.d r1 = r1.mo20252i()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            r0.f16278c = r1
            g.e.b.k.k.o r1 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.g r1 = r1.mo20242a()
            g.e.b.k.k.o r4 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.g r4 = r4.mo20242a()
            if (r4 == 0) goto L_0x0045
            int r4 = r4.mo12879J()
            if (r4 != r3) goto L_0x0045
            g.e.b.k.k.o r4 = r0.f16281e0
            com.bamtech.sdk4.bookmarks.Bookmark r4 = r4.mo20245d()
            if (r4 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r4 = 0
            goto L_0x0046
        L_0x0045:
            r4 = 1
        L_0x0046:
            r5 = 0
            if (r4 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = r5
        L_0x004b:
            r0.f16270U = r1
            g.e.b.k.k.o r1 = r0.f16281e0
            java.lang.String r1 = r1.mo20246e()
            r0.f16271V = r1
            com.bamtechmedia.dominguez.core.content.g r1 = r0.f16270U
            r4 = 2
            if (r1 == 0) goto L_0x0061
            com.bamtechmedia.dominguez.core.content.assets.t r6 = com.bamtechmedia.dominguez.core.content.assets.C3649t.BRIEF
            java.lang.String r1 = com.bamtechmedia.dominguez.core.content.C3651b.C3652a.m12419a(r1, r6, r5, r4, r5)
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            r0.f16272W = r1
            java.lang.String r1 = r0.f16272W
            if (r1 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            java.lang.String r1 = r0.f16271V
        L_0x006b:
            boolean r6 = r0.f16278c
            if (r6 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r1 = r5
        L_0x0071:
            r0.f16273X = r1
            g.e.b.k.k.o r1 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.v r1 = r1.mo20250h()
            r0.f16274Y = r1
            com.bamtechmedia.dominguez.detail.common.r r1 = r0.f16289m0
            g.e.b.k.k.o r6 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.PromoLabel r6 = r6.mo20248f()
            java.lang.String r1 = r1.mo18046a(r6)
            if (r1 == 0) goto L_0x00a9
            g.e.b.k.k.o r6 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.PromoLabel r6 = r6.mo20248f()
            if (r6 == 0) goto L_0x00a5
            boolean r6 = r0.f16278c
            if (r6 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a0
            int r6 = r1.length()
            if (r6 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            goto L_0x00a1
        L_0x00a0:
            r6 = 1
        L_0x00a1:
            if (r6 != 0) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = r5
        L_0x00aa:
            r0.f16275Z = r1
            g.e.b.k.k.o r1 = r0.f16281e0
            java.lang.CharSequence r1 = r1.mo20244c()
            if (r1 == 0) goto L_0x00c9
            boolean r6 = kotlin.p588j0.C12832w.m40118a(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x00c5
            com.bamtechmedia.dominguez.detail.common.g0.c r6 = r0.f16290n0
            boolean r6 = r6.mo17876e()
            if (r6 == 0) goto L_0x00c5
            r6 = 1
            goto L_0x00c6
        L_0x00c5:
            r6 = 0
        L_0x00c6:
            if (r6 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r1 = r5
        L_0x00ca:
            r0.f16276a0 = r1
            android.text.Spannable r1 = r0.m22175a()
            if (r1 == 0) goto L_0x00e3
            boolean r6 = r0.f16278c
            if (r6 == 0) goto L_0x00df
            boolean r6 = kotlin.p588j0.C12832w.m40118a(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x00df
            r6 = 1
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r1 = r5
        L_0x00e4:
            r0.f16277b0 = r1
            com.bamtechmedia.dominguez.detail.common.e r1 = r0.f16284h0
            g.e.b.k.k.o r6 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.g r6 = r6.mo20242a()
            g.e.b.k.k.o r7 = r0.f16281e0
            com.bamtech.sdk4.bookmarks.Bookmark r7 = r7.mo20245d()
            g.e.b.k.k.o r8 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.o r8 = r8.mo20249g()
            g.e.b.k.k.o r9 = r0.f16281e0
            com.bamtechmedia.dominguez.core.content.PromoLabel r9 = r9.mo20248f()
            com.bamtechmedia.dominguez.detail.common.a$a r1 = r1.mo17820a(r6, r7, r8, r9)
            boolean r6 = r0.f16278c
            if (r6 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = r5
        L_0x010a:
            r0.f16279c0 = r1
            r1 = 10
            g.e.b.k.k.q.a$a[] r1 = new p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a[r1]
            g.e.b.k.k.q.a$a r5 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16291U
            r1[r2] = r5
            g.e.b.k.k.q.a$a r2 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16292V
            r1[r3] = r2
            g.e.b.k.k.q.a$a r2 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16293W
            r1[r4] = r2
            r2 = 3
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16294X
            r1[r2] = r3
            r2 = 4
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16295Y
            r1[r2] = r3
            r2 = 5
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16296Z
            r1[r2] = r3
            r2 = 6
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16297a0
            r1[r2] = r3
            r2 = 7
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16298b0
            r1[r2] = r3
            r2 = 8
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16299c0
            r1[r2] = r3
            r2 = 9
            g.e.b.k.k.q.a$a r3 = p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7411a.f16300d0
            r1[r2] = r3
            java.util.List r1 = kotlin.p590y.C13185o.m40522d(r1)
            r0.f16280d0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p294q.C7410a.<init>(g.e.b.k.k.o, com.bamtechmedia.dominguez.core.i.p.c, g.e.b.k.k.t.a, com.bamtechmedia.dominguez.detail.common.e, com.bamtechmedia.dominguez.core.content.c, g.e.b.k.k.p, g.e.b.k.k.d, com.bamtechmedia.dominguez.config.r0, com.bamtechmedia.dominguez.detail.common.r, com.bamtechmedia.dominguez.detail.common.g0.c):void");
    }

    public void bind(C11867b bVar, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f16290n0, (java.lang.Object) r3.f16290n0) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof p163g.p201e.p203b.p287k.p293k.p294q.C7410a
            if (r0 == 0) goto L_0x006d
            g.e.b.k.k.q.a r3 = (p163g.p201e.p203b.p287k.p293k.p294q.C7410a) r3
            g.e.b.k.k.o r0 = r2.f16281e0
            g.e.b.k.k.o r1 = r3.f16281e0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.core.i.p.c r0 = r2.f16282f0
            com.bamtechmedia.dominguez.core.i.p.c r1 = r3.f16282f0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            g.e.b.k.k.t.a r0 = r2.f16283g0
            g.e.b.k.k.t.a r1 = r3.f16283g0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.detail.common.e r0 = r2.f16284h0
            com.bamtechmedia.dominguez.detail.common.e r1 = r3.f16284h0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.core.content.c r0 = r2.f16285i0
            com.bamtechmedia.dominguez.core.content.c r1 = r3.f16285i0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            g.e.b.k.k.p r0 = r2.f16286j0
            g.e.b.k.k.p r1 = r3.f16286j0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            g.e.b.k.k.d r0 = r2.f16287k0
            g.e.b.k.k.d r1 = r3.f16287k0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.config.r0 r0 = r2.f16288l0
            com.bamtechmedia.dominguez.config.r0 r1 = r3.f16288l0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.detail.common.r r0 = r2.f16289m0
            com.bamtechmedia.dominguez.detail.common.r r1 = r3.f16289m0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r2.f16290n0
            com.bamtechmedia.dominguez.detail.common.g0.c r3 = r3.f16290n0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p294q.C7410a.equals(java.lang.Object):boolean");
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (!(eVar instanceof C7410a)) {
            eVar = null;
        }
        C7410a aVar = (C7410a) eVar;
        if (aVar == null) {
            return C13145v.f29587a;
        }
        List<C7411a> list = this.f16280d0;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C7411a aVar2 = (C7411a) next;
            if (!Intrinsics.areEqual(aVar2.mo20262a().invoke(aVar), aVar2.mo20262a().invoke(this))) {
                arrayList.add(next);
            }
        }
        return new C5811a(arrayList);
    }

    public int getLayout() {
        return C7312f.content_detail_header;
    }

    public int hashCode() {
        C7407o oVar = this.f16281e0;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        C3850c cVar = this.f16282f0;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C7454a aVar = this.f16283g0;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C5918e eVar = this.f16284h0;
        int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C3653c cVar2 = this.f16285i0;
        int hashCode5 = (hashCode4 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C7408p pVar = this.f16286j0;
        int hashCode6 = (hashCode5 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C7391d dVar = this.f16287k0;
        int hashCode7 = (hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C3572r0 r0Var = this.f16288l0;
        int hashCode8 = (hashCode7 + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
        C5998r rVar = this.f16289m0;
        int hashCode9 = (hashCode8 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C5948c cVar3 = this.f16290n0;
        if (cVar3 != null) {
            i = cVar3.hashCode();
        }
        return hashCode9 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C7410a) && Intrinsics.areEqual((Object) ((C7410a) eVar).f16274Y.mo12903f(), (Object) this.f16274Y.mo12903f());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesDetailHeaderItem(dataParams=");
        sb.append(this.f16281e0);
        sb.append(", titleTreatment=");
        sb.append(this.f16282f0);
        sb.append(", seriesDetailViewModel=");
        sb.append(this.f16283g0);
        sb.append(", bookmarkStateBinder=");
        sb.append(this.f16284h0);
        sb.append(", contentTypeRouter=");
        sb.append(this.f16285i0);
        sb.append(", seriesMetadataFormatter=");
        sb.append(this.f16286j0);
        sb.append(", seriesDetailAnalytics=");
        sb.append(this.f16287k0);
        sb.append(", stringDictionary=");
        sb.append(this.f16288l0);
        sb.append(", promoLabelFormatter=");
        sb.append(this.f16289m0);
        sb.append(", contentDetailConfig=");
        sb.append(this.f16290n0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private final Spannable m22175a() {
        C3685g a = this.f16281e0.mo20242a();
        C6046d i = this.f16281e0.mo20252i();
        if (i != null) {
            return this.f16286j0.mo20255a(i, a);
        }
        return null;
    }

    public void bind(C11867b bVar, int i, List<? extends Object> list) {
        View findViewById = bVar.mo20994a().findViewById(C7310d.contentDetailButtons);
        if (!(findViewById instanceof ViewStub)) {
            findViewById = null;
        }
        ViewStub viewStub = (ViewStub) findViewById;
        if (viewStub != null) {
            viewStub.inflate();
        }
        for (C7411a a : this.f16280d0) {
            a.mo20264a(this, bVar, list);
        }
    }
}
