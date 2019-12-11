package p163g.p201e.p203b.p287k.p288j.p289h;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3653c.C3654a;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView;
import com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView.C5635b;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.detail.common.C5897a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5900b;
import com.bamtechmedia.dominguez.detail.common.C5918e;
import com.bamtechmedia.dominguez.detail.common.C5998r;
import com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.movie.models.C6026d;
import com.bamtechmedia.dominguez.offline.C6242c;
import com.bamtechmedia.dominguez.offline.C6243d;
import com.google.common.base.C10368c;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.p288j.C7316a;
import p163g.p201e.p203b.p287k.p288j.C7326g;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001WB
\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J&\u0010-\u001a\u00020*2\u0006\u00102\u001a\u00020/2\u0006\u00100\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0007J\t\u00107\u001a\u00020\u0003HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\t\u00109\u001a\u00020\u0019HÂ\u0003J\t\u0010:\u001a\u00020\u001bHÂ\u0003J\t\u0010;\u001a\u00020\u001dHÂ\u0003J\t\u0010<\u001a\u00020\u0005HÂ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÂ\u0003J\t\u0010?\u001a\u00020\u000bHÂ\u0003J\t\u0010@\u001a\u00020\rHÂ\u0003J\t\u0010A\u001a\u00020\u000fHÂ\u0003J\t\u0010B\u001a\u00020\u0011HÂ\u0003J\u001b\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00140\u0013HÂ\u0003J¡\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00140\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010E\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u000105HÖ\u0003J\u0018\u0010G\u001a\u0004\u0018\u0001052\f\u0010H\u001a\b\u0012\u0002\b\u0003\u0018\u00010IH\u0016J\b\u0010J\u001a\u000201H\u0016J\t\u0010K\u001a\u000201HÖ\u0001J\u0016\u0010L\u001a\u00020\"2\f\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010IH\u0016J\t\u0010M\u001a\u00020NHÖ\u0001J\u001a\u0010O\u001a\u00020**\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u001a\u0010P\u001a\u00020**\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u001a\u0010Q\u001a\u00020**\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u001a\u0010R\u001a\u00020**\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u000e\u0010S\u001a\u0004\u0018\u00010T*\u00020UH\u0002J\u001a\u0010V\u001a\u00020**\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/mobile/MovieDetailHeaderItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "dataParams", "Lcom/bamtechmedia/dominguez/detail/movie/MovieHeaderMetadataParams;", "titleTreatment", "Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "downloadState", "Lcom/bamtechmedia/dominguez/offline/DownloadState;", "ratingHelper", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "runtimeConverter", "Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "contentTypeRouter", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "movieDetailViewModel", "Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;", "bookmarkStateBinder", "Lcom/bamtechmedia/dominguez/detail/common/DetailBookmarkStateBinder;", "downloadStateMapper", "Lcom/google/common/base/Optional;", "Lcom/google/common/base/Function;", "Lcom/bamtechmedia/dominguez/core/design/widgets/DownloadStatusView$State;", "preferences", "Lcom/bamtechmedia/dominguez/offline/DownloadPreferences;", "analytics", "Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailAnalytics;", "promoLabelFormatter", "Lcom/bamtechmedia/dominguez/detail/common/PromoLabelFormatter;", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/detail/movie/MovieHeaderMetadataParams;Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;Lcom/bamtechmedia/dominguez/offline/DownloadState;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;Lcom/bamtechmedia/dominguez/detail/common/DetailBookmarkStateBinder;Lcom/google/common/base/Optional;Lcom/bamtechmedia/dominguez/offline/DownloadPreferences;Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailAnalytics;Lcom/bamtechmedia/dominguez/detail/common/PromoLabelFormatter;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "getDownloadState", "()Lcom/bamtechmedia/dominguez/offline/DownloadState;", "isDownloadButtonEnabled", "", "()Z", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "getMovie", "()Lcom/bamtechmedia/dominguez/core/content/Movie;", "movieDetailLoaded", "addFocusChangeListenerToScaleView", "", "view", "Landroid/view/View;", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "", "bindPlaybackListener", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isSameAs", "toString", "", "bindDownloadStatus", "bindMovie", "bindPlayRestartButtons", "bindWatchlistStatus", "getPhoto", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "requestInitialFocus", "ChangePayload", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.j.h.a */
/* compiled from: MovieDetailHeaderItem.kt */
public final class C7327a extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C7326g f16087U;

    /* renamed from: V */
    private final C3850c f16088V;

    /* renamed from: W */
    private final C6243d f16089W;

    /* renamed from: X */
    private final C3716q f16090X;

    /* renamed from: Y */
    private final C5821c0 f16091Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C3653c f16092Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C7352b f16093a0;

    /* renamed from: b0 */
    private final C5918e f16094b0;

    /* renamed from: c */
    private final boolean f16095c;

    /* renamed from: c0 */
    private final Optional<C10368c<C6243d, C5635b>> f16096c0;

    /* renamed from: d0 */
    private final C6242c f16097d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C7316a f16098e0;

    /* renamed from: f0 */
    private final C5998r f16099f0;

    /* renamed from: g0 */
    private final C5948c f16100g0;

    /* renamed from: g.e.b.k.j.h.a$a */
    /* compiled from: MovieDetailHeaderItem.kt */
    public static final class C7328a {

        /* renamed from: a */
        private final boolean f16101a;

        /* renamed from: b */
        private final boolean f16102b;

        /* renamed from: c */
        private final boolean f16103c;

        /* renamed from: d */
        private final boolean f16104d;

        /* renamed from: e */
        private final boolean f16105e;

        /* renamed from: f */
        private final boolean f16106f;

        /* renamed from: g */
        private final boolean f16107g;

        /* renamed from: h */
        private final boolean f16108h;

        public C7328a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.f16101a = z;
            this.f16102b = z2;
            this.f16103c = z3;
            this.f16104d = z4;
            this.f16105e = z5;
            this.f16106f = z6;
            this.f16107g = z7;
            this.f16108h = z8;
        }

        /* renamed from: a */
        public final boolean mo20137a() {
            return this.f16104d;
        }

        /* renamed from: b */
        public final boolean mo20138b() {
            return this.f16108h;
        }

        /* renamed from: c */
        public final boolean mo20139c() {
            return this.f16101a;
        }

        /* renamed from: d */
        public final boolean mo20140d() {
            return this.f16102b;
        }

        /* renamed from: e */
        public final boolean mo20141e() {
            return this.f16107g;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7328a) {
                    C7328a aVar = (C7328a) obj;
                    if (this.f16101a == aVar.f16101a) {
                        if (this.f16102b == aVar.f16102b) {
                            if (this.f16103c == aVar.f16103c) {
                                if (this.f16104d == aVar.f16104d) {
                                    if (this.f16105e == aVar.f16105e) {
                                        if (this.f16106f == aVar.f16106f) {
                                            if (this.f16107g == aVar.f16107g) {
                                                if (this.f16108h == aVar.f16108h) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo20143f() {
            return this.f16106f;
        }

        /* renamed from: g */
        public final boolean mo20144g() {
            return this.f16103c;
        }

        /* renamed from: h */
        public final boolean mo20145h() {
            return this.f16105e;
        }

        public int hashCode() {
            boolean z = this.f16101a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f16102b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f16103c;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f16104d;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f16105e;
            if (z5) {
                z5 = true;
            }
            int i6 = (i5 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f16106f;
            if (z6) {
                z6 = true;
            }
            int i7 = (i6 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f16107g;
            if (z7) {
                z7 = true;
            }
            int i8 = (i7 + (z7 ? 1 : 0)) * 31;
            boolean z8 = this.f16108h;
            if (!z8) {
                i = z8;
            }
            return i8 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(movieChanged=");
            sb.append(this.f16101a);
            sb.append(", movieDetailLoadedChanged=");
            sb.append(this.f16102b);
            sb.append(", userDataChanged=");
            sb.append(this.f16103c);
            sb.append(", downloadChanged=");
            sb.append(this.f16104d);
            sb.append(", watchlistChanged=");
            sb.append(this.f16105e);
            sb.append(", promoPlayableChanged=");
            sb.append(this.f16106f);
            sb.append(", promoLabelChanged=");
            sb.append(this.f16107g);
            sb.append(", imageChanged=");
            sb.append(this.f16108h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.k.j.h.a$b */
    /* compiled from: MovieDetailHeaderItem.kt */
    static final class C7329b implements OnFocusChangeListener {

        /* renamed from: c */
        public static final C7329b f16109c = new C7329b();

        C7329b() {
        }

        public final void onFocusChange(View view, boolean z) {
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "view");
            C5852n0.m18880a(view, z);
        }
    }

    /* renamed from: g.e.b.k.j.h.a$c */
    /* compiled from: MovieDetailHeaderItem.kt */
    static final class C7330c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7327a f16110c;

        C7330c(DownloadStatusView downloadStatusView, C7327a aVar, List list) {
            this.f16110c = aVar;
        }

        public final void onClick(View view) {
            this.f16110c.f16093a0.mo20172F();
        }
    }

    /* renamed from: g.e.b.k.j.h.a$d */
    /* compiled from: MovieDetailHeaderItem.kt */
    static final class C7331d implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C5897a f16111U;

        /* renamed from: c */
        final /* synthetic */ C7327a f16112c;

        C7331d(C7327a aVar, C5897a aVar2) {
            this.f16112c = aVar;
            this.f16111U = aVar2;
        }

        public final void onClick(View view) {
            long j;
            C5897a aVar = this.f16111U;
            C5898a buttonState = aVar != null ? aVar.getButtonState() : null;
            if (buttonState instanceof C5900b) {
                C3654a.m12426a(this.f16112c.f16092Z, ((C5900b) buttonState).mo17800b(), 0, 2, null);
                return;
            }
            C6026d g = this.f16112c.f16087U.mo20127g();
            if (g != null) {
                Bookmark a = g.mo18120a();
                if (a != null) {
                    j = a.getPlayhead();
                    C3692n a2 = this.f16112c.m21968a().mo12976a(j);
                    C3654a.m12426a(this.f16112c.f16092Z, a2, 0, 2, null);
                    this.f16112c.f16098e0.mo20114a(a2);
                }
            }
            j = 0;
            C3692n a22 = this.f16112c.m21968a().mo12976a(j);
            C3654a.m12426a(this.f16112c.f16092Z, a22, 0, 2, null);
            this.f16112c.f16098e0.mo20114a(a22);
        }
    }

    /* renamed from: g.e.b.k.j.h.a$e */
    /* compiled from: MovieDetailHeaderItem.kt */
    static final class C7332e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7327a f16113c;

        C7332e(C7327a aVar) {
            this.f16113c = aVar;
        }

        public final void onClick(View view) {
            C3692n a = this.f16113c.m21968a().mo12976a(-1);
            C3654a.m12426a(this.f16113c.f16092Z, a, 0, 2, null);
            this.f16113c.f16098e0.mo20118b(a);
        }
    }

    /* renamed from: g.e.b.k.j.h.a$f */
    /* compiled from: MovieDetailHeaderItem.kt */
    static final class C7333f implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7327a f16114c;

        C7333f(C7327a aVar) {
            this.f16114c = aVar;
        }

        public final void onClick(View view) {
            this.f16114c.f16093a0.mo20173G();
        }
    }

    public C7327a(C7326g gVar, C3850c cVar, C6243d dVar, C3716q qVar, C5821c0 c0Var, C3653c cVar2, C7352b bVar, C5918e eVar, Optional<C10368c<C6243d, C5635b>> optional, C6242c cVar3, C7316a aVar, C5998r rVar, C5948c cVar4) {
        this.f16087U = gVar;
        this.f16088V = cVar;
        this.f16089W = dVar;
        this.f16090X = qVar;
        this.f16091Y = c0Var;
        this.f16092Z = cVar2;
        this.f16093a0 = bVar;
        this.f16094b0 = eVar;
        this.f16096c0 = optional;
        this.f16097d0 = cVar3;
        this.f16098e0 = aVar;
        this.f16099f0 = rVar;
        this.f16100g0 = cVar4;
        this.f16095c = this.f16087U.mo20123d() != null;
    }

    public void bind(C11867b bVar, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f16100g0, (java.lang.Object) r3.f16100g0) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x008d
            boolean r0 = r3 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a
            if (r0 == 0) goto L_0x008b
            g.e.b.k.j.h.a r3 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a) r3
            g.e.b.k.j.g r0 = r2.f16087U
            g.e.b.k.j.g r1 = r3.f16087U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.core.i.p.c r0 = r2.f16088V
            com.bamtechmedia.dominguez.core.i.p.c r1 = r3.f16088V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.offline.d r0 = r2.f16089W
            com.bamtechmedia.dominguez.offline.d r1 = r3.f16089W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.core.content.q r0 = r2.f16090X
            com.bamtechmedia.dominguez.core.content.q r1 = r3.f16090X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.core.utils.c0 r0 = r2.f16091Y
            com.bamtechmedia.dominguez.core.utils.c0 r1 = r3.f16091Y
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.core.content.c r0 = r2.f16092Z
            com.bamtechmedia.dominguez.core.content.c r1 = r3.f16092Z
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            g.e.b.k.j.k.b r0 = r2.f16093a0
            g.e.b.k.j.k.b r1 = r3.f16093a0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.detail.common.e r0 = r2.f16094b0
            com.bamtechmedia.dominguez.detail.common.e r1 = r3.f16094b0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.google.common.base.Optional<com.google.common.base.c<com.bamtechmedia.dominguez.offline.d, com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$b>> r0 = r2.f16096c0
            com.google.common.base.Optional<com.google.common.base.c<com.bamtechmedia.dominguez.offline.d, com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$b>> r1 = r3.f16096c0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.offline.c r0 = r2.f16097d0
            com.bamtechmedia.dominguez.offline.c r1 = r3.f16097d0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            g.e.b.k.j.a r0 = r2.f16098e0
            g.e.b.k.j.a r1 = r3.f16098e0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.detail.common.r r0 = r2.f16099f0
            com.bamtechmedia.dominguez.detail.common.r r1 = r3.f16099f0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r2.f16100g0
            com.bamtechmedia.dominguez.detail.common.g0.c r3 = r3.f16100g0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r3 = 0
            return r3
        L_0x008d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p289h.C7327a.equals(java.lang.Object):boolean");
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C7327a aVar = (C7327a) eVar;
            C7328a aVar2 = new C7328a(!Intrinsics.areEqual((Object) aVar.m21968a(), (Object) m21968a()), aVar.f16095c != (this.f16087U.mo20123d() != null), !Intrinsics.areEqual((Object) aVar.f16087U.mo20127g(), (Object) this.f16087U.mo20127g()), !Intrinsics.areEqual((Object) aVar.f16089W, (Object) this.f16089W), aVar.f16087U.mo20128h() != this.f16087U.mo20128h(), !Intrinsics.areEqual((Object) aVar.f16087U.mo20126f(), (Object) this.f16087U.mo20126f()), !Intrinsics.areEqual((Object) aVar.f16087U.mo20124e(), (Object) this.f16087U.mo20124e()), !Intrinsics.areEqual((Object) m21967a((C3693o) aVar.f16087U.mo20122c()), (Object) m21967a((C3693o) this.f16087U.mo20122c())));
            return aVar2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.detail.movie.mobile.MovieDetailHeaderItem");
    }

    public int getLayout() {
        return C7312f.content_detail_header;
    }

    public int hashCode() {
        C7326g gVar = this.f16087U;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C3850c cVar = this.f16088V;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C6243d dVar = this.f16089W;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C3716q qVar = this.f16090X;
        int hashCode4 = (hashCode3 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        C5821c0 c0Var = this.f16091Y;
        int hashCode5 = (hashCode4 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        C3653c cVar2 = this.f16092Z;
        int hashCode6 = (hashCode5 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C7352b bVar = this.f16093a0;
        int hashCode7 = (hashCode6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C5918e eVar = this.f16094b0;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Optional<C10368c<C6243d, C5635b>> optional = this.f16096c0;
        int hashCode9 = (hashCode8 + (optional != null ? optional.hashCode() : 0)) * 31;
        C6242c cVar3 = this.f16097d0;
        int hashCode10 = (hashCode9 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        C7316a aVar = this.f16098e0;
        int hashCode11 = (hashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C5998r rVar = this.f16099f0;
        int hashCode12 = (hashCode11 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C5948c cVar4 = this.f16100g0;
        if (cVar4 != null) {
            i = cVar4.hashCode();
        }
        return hashCode12 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C7327a) && Intrinsics.areEqual((Object) ((C7327a) eVar).m21968a().mo12903f(), (Object) m21968a().mo12903f());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieDetailHeaderItem(dataParams=");
        sb.append(this.f16087U);
        sb.append(", titleTreatment=");
        sb.append(this.f16088V);
        sb.append(", downloadState=");
        sb.append(this.f16089W);
        sb.append(", ratingHelper=");
        sb.append(this.f16090X);
        sb.append(", runtimeConverter=");
        sb.append(this.f16091Y);
        sb.append(", contentTypeRouter=");
        sb.append(this.f16092Z);
        sb.append(", movieDetailViewModel=");
        sb.append(this.f16093a0);
        sb.append(", bookmarkStateBinder=");
        sb.append(this.f16094b0);
        sb.append(", downloadStateMapper=");
        sb.append(this.f16096c0);
        sb.append(", preferences=");
        sb.append(this.f16097d0);
        sb.append(", analytics=");
        sb.append(this.f16098e0);
        sb.append(", promoLabelFormatter=");
        sb.append(this.f16099f0);
        sb.append(", contentDetailConfig=");
        sb.append(this.f16100g0);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3692n m21968a() {
        return this.f16087U.mo20122c();
    }

    /* renamed from: b */
    private final boolean m21974b() {
        C6242c cVar = this.f16097d0;
        if (cVar != null) {
            return cVar.mo18835a() || m21968a().mo13263d();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x008c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21976c(p163g.p509o.p510a.p511l.C11867b r6, java.util.List<? extends java.lang.Object> r7) {
        /*
            r5 = this;
            r5.mo20131a(r6)
            android.view.View r0 = r6.itemView
            int r1 = p163g.p201e.p203b.p287k.C7310d.startPlayerButton
            android.view.View r0 = r0.findViewById(r1)
            com.bamtechmedia.dominguez.detail.common.a r0 = (com.bamtechmedia.dominguez.detail.common.C5897a) r0
            int r1 = p163g.p201e.p203b.p287k.C7310d.focusHelperExpandContentDetailHeaderOnFocus
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r0.setTag(r1, r3)
            int r1 = p163g.p201e.p203b.p287k.C7310d.focusHelperHorizontalFocusSearchWithinParent
            r0.setTag(r1, r3)
            android.view.View r1 = r6.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.restartButton
            android.view.View r1 = r1.findViewById(r4)
            com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton r1 = (com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton) r1
            if (r1 == 0) goto L_0x002f
            int r4 = p163g.p201e.p203b.p287k.C7310d.focusHelperExpandContentDetailHeaderOnFocus
            r1.setTag(r4, r3)
        L_0x002f:
            android.view.View r1 = r6.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.restartButton
            android.view.View r1 = r1.findViewById(r4)
            com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton r1 = (com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton) r1
            if (r1 == 0) goto L_0x0042
            int r4 = p163g.p201e.p203b.p287k.C7310d.focusHelperHorizontalFocusSearchWithinParent
            r1.setTag(r4, r3)
        L_0x0042:
            boolean r1 = r7.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0091
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0055
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0055
        L_0x0053:
            r7 = 0
            goto L_0x008d
        L_0x0055:
            java.util.Iterator r7 = r7.iterator()
        L_0x0059:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r7.next()
            boolean r4 = r1 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a
            if (r4 == 0) goto L_0x0089
            g.e.b.k.j.h.a$a r1 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a) r1
            boolean r4 = r1.mo20144g()
            if (r4 != 0) goto L_0x0084
            boolean r4 = r1.mo20143f()
            if (r4 != 0) goto L_0x0084
            boolean r4 = r1.mo20141e()
            if (r4 != 0) goto L_0x0084
            boolean r1 = r1.mo20140d()
            if (r1 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r1 = 0
            goto L_0x0085
        L_0x0084:
            r1 = 1
        L_0x0085:
            if (r1 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            if (r1 == 0) goto L_0x0059
            r7 = 1
        L_0x008d:
            if (r7 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            boolean r7 = r5.f16095c
            if (r7 != 0) goto L_0x00b1
            java.lang.String r7 = "playerButton"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r7)
            r7 = 8
            r0.setVisibility(r7)
            android.view.View r6 = r6.mo20994a()
            int r7 = p163g.p201e.p203b.p287k.C7310d.restartButton
            android.view.View r6 = r6.findViewById(r7)
            com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton r6 = (com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton) r6
            if (r6 == 0) goto L_0x0100
            p096e.p121h.p135s.C4127b0.m14131b(r6, r3)
            goto L_0x0100
        L_0x00b1:
            if (r2 == 0) goto L_0x0100
            com.bamtechmedia.dominguez.detail.common.e r7 = r5.f16094b0
            g.e.b.k.j.g r1 = r5.f16087U
            com.bamtechmedia.dominguez.core.content.n r1 = r1.mo20122c()
            g.e.b.k.j.g r2 = r5.f16087U
            com.bamtechmedia.dominguez.detail.movie.models.d r2 = r2.mo20127g()
            if (r2 == 0) goto L_0x00c8
            com.bamtech.sdk4.bookmarks.Bookmark r2 = r2.mo18120a()
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            g.e.b.k.j.g r3 = r5.f16087U
            com.bamtechmedia.dominguez.core.content.o r3 = r3.mo20126f()
            g.e.b.k.j.g r4 = r5.f16087U
            com.bamtechmedia.dominguez.core.content.PromoLabel r4 = r4.mo20124e()
            com.bamtechmedia.dominguez.detail.common.a$a r7 = r7.mo17820a(r1, r2, r3, r4)
            if (r0 == 0) goto L_0x00de
            r0.setState(r7)
        L_0x00de:
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r5.f16100g0
            boolean r0 = r0.mo17878g()
            if (r0 == 0) goto L_0x0100
            boolean r7 = r7 instanceof com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5902d
            if (r7 == 0) goto L_0x00ed
            com.bamtechmedia.dominguez.detail.common.a$a$c r7 = com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5901c.f13691a
            goto L_0x00ef
        L_0x00ed:
            com.bamtechmedia.dominguez.detail.common.a$a$e r7 = com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5903e.f13694a
        L_0x00ef:
            android.view.View r6 = r6.mo20994a()
            int r0 = p163g.p201e.p203b.p287k.C7310d.restartButton
            android.view.View r6 = r6.findViewById(r0)
            com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton r6 = (com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton) r6
            if (r6 == 0) goto L_0x0100
            r6.setState(r7)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p289h.C7327a.m21976c(g.o.a.l.b, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r6 == false) goto L_0x006b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21978d(p163g.p509o.p510a.p511l.C11867b r5, java.util.List<? extends java.lang.Object> r6) {
        /*
            r4 = this;
            android.view.View r5 = r5.itemView
            int r0 = p163g.p201e.p203b.p287k.C7310d.watchlistButton
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r0 = "watchlistButton"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r0)
            boolean r0 = r4.f16095c
            r1 = 0
            if (r0 == 0) goto L_0x0016
            r0 = 0
            goto L_0x0018
        L_0x0016:
            r0 = 8
        L_0x0018:
            r5.setVisibility(r0)
            g.e.b.k.j.h.a$f r0 = new g.e.b.k.j.h.a$f
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            int r0 = p163g.p201e.p203b.p287k.C7310d.focusHelperExpandContentDetailHeaderOnFocus
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r5.setTag(r0, r3)
            int r0 = p163g.p201e.p203b.p287k.C7310d.focusHelperHorizontalFocusSearchWithinParent
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r5.setTag(r0, r3)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x006a
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0048
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0048
        L_0x0046:
            r6 = 0
            goto L_0x0068
        L_0x0048:
            java.util.Iterator r6 = r6.iterator()
        L_0x004c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r6.next()
            boolean r3 = r0 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a
            if (r3 == 0) goto L_0x0064
            g.e.b.k.j.h.a$a r0 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a) r0
            boolean r0 = r0.mo20145h()
            if (r0 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x004c
            r6 = 1
        L_0x0068:
            if (r6 == 0) goto L_0x006b
        L_0x006a:
            r1 = 1
        L_0x006b:
            if (r1 == 0) goto L_0x0096
            boolean r6 = r5.isSelected()
            g.e.b.k.j.g r0 = r4.f16087U
            boolean r0 = r0.mo20128h()
            if (r6 == r0) goto L_0x0082
            g.e.b.k.j.g r6 = r4.f16087U
            boolean r6 = r6.mo20128h()
            r5.setSelected(r6)
        L_0x0082:
            g.e.b.k.j.g r6 = r4.f16087U
            boolean r6 = r6.mo20128h()
            if (r6 == 0) goto L_0x008d
            int r6 = p163g.p201e.p203b.p287k.C7313g.a11y_details_watchlist_remove
            goto L_0x008f
        L_0x008d:
            int r6 = p163g.p201e.p203b.p287k.C7313g.a11y_details_watchlist
        L_0x008f:
            java.lang.String r6 = com.bamtechmedia.dominguez.core.utils.C5880u.m18936a(r6)
            r5.setContentDescription(r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p289h.C7327a.m21978d(g.o.a.l.b, java.util.List):void");
    }

    /* renamed from: e */
    private final void m21980e(C11867b bVar, List<? extends Object> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(next instanceof C7328a) || !((C7328a) next).mo20140d()) {
                        z3 = false;
                        continue;
                    } else {
                        z3 = true;
                        continue;
                    }
                    if (z3) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                z = false;
                if (z && this.f16095c) {
                    View findViewById = bVar.itemView.findViewById(C7310d.startPlayerButton);
                    ImageView imageView = (ImageView) bVar.itemView.findViewById(C7310d.watchlistButton);
                    Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "playerButton");
                    if (findViewById.getVisibility() == 0) {
                        findViewById.requestFocus();
                        return;
                    }
                    Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "addWatchlistButton");
                    if (imageView.getVisibility() != 0) {
                        z4 = false;
                    }
                    if (z4) {
                        imageView.requestFocus();
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        if (z) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0042 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21973b(p163g.p509o.p510a.p511l.C11867b r11, java.util.List<? extends java.lang.Object> r12) {
        /*
            r10 = this;
            r10.mo20131a(r11)
            boolean r0 = r12.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0048
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0017
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0043
        L_0x0017:
            java.util.Iterator r0 = r12.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0015
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a
            if (r4 == 0) goto L_0x003f
            g.e.b.k.j.h.a$a r3 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a) r3
            boolean r4 = r3.mo20139c()
            if (r4 != 0) goto L_0x003a
            boolean r3 = r3.mo20140d()
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x001b
            r0 = 1
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            if (r0 == 0) goto L_0x0182
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.contentDetailTitleImage
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x006d
            com.bamtechmedia.dominguez.core.i.p.c r3 = r10.f16088V
            com.bamtechmedia.dominguez.core.content.n r4 = r10.m21968a()
            r3.mo13768a(r4, r0)
            com.bamtechmedia.dominguez.core.content.n r3 = r10.m21968a()
            java.lang.String r3 = r3.getTitle()
            r0.setContentDescription(r3)
        L_0x006d:
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.metaData
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "metaData"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            boolean r4 = r10.f16095c
            r5 = 8
            if (r4 == 0) goto L_0x0086
            r4 = 0
            goto L_0x0088
        L_0x0086:
            r4 = 8
        L_0x0088:
            r0.setVisibility(r4)
            android.view.View r0 = r11.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.metaData
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            com.bamtechmedia.dominguez.core.content.q r3 = r10.f16090X
            com.bamtechmedia.dominguez.core.content.n r4 = r10.m21968a()
            android.text.Spannable r3 = r3.mo13546a(r4)
            r0.setText(r3)
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.videoDetailDescription
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "videoDetailDescription"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            boolean r4 = r10.f16095c
            if (r4 == 0) goto L_0x00be
            r4 = 0
            goto L_0x00c0
        L_0x00be:
            r4 = 8
        L_0x00c0:
            r0.setVisibility(r4)
            android.view.View r0 = r11.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.videoDetailDescription
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            g.e.b.k.j.g r3 = r10.f16087U
            java.lang.String r3 = r3.mo20121b()
            r0.setText(r3)
            com.bamtechmedia.dominguez.detail.common.r r0 = r10.f16099f0
            g.e.b.k.j.g r3 = r10.f16087U
            com.bamtechmedia.dominguez.core.content.PromoLabel r3 = r3.mo20124e()
            java.lang.String r0 = r0.mo18046a(r3)
            android.view.View r3 = r11.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.promoLabelTextView
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = "promoLabelTextView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            g.e.b.k.j.g r6 = r10.f16087U
            com.bamtechmedia.dominguez.core.content.PromoLabel r6 = r6.mo20124e()
            if (r6 == 0) goto L_0x0114
            boolean r6 = r10.f16095c
            if (r6 == 0) goto L_0x0114
            if (r0 == 0) goto L_0x010f
            int r6 = r0.length()
            if (r6 != 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r6 = 0
            goto L_0x0110
        L_0x010f:
            r6 = 1
        L_0x0110:
            if (r6 != 0) goto L_0x0114
            r6 = 1
            goto L_0x0115
        L_0x0114:
            r6 = 0
        L_0x0115:
            if (r6 == 0) goto L_0x0119
            r6 = 0
            goto L_0x011b
        L_0x0119:
            r6 = 8
        L_0x011b:
            r3.setVisibility(r6)
            android.view.View r3 = r11.mo20994a()
            int r6 = p163g.p201e.p203b.p287k.C7310d.promoLabelTextView
            android.view.View r3 = r3.findViewById(r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            r3.setText(r0)
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r10.f16100g0
            boolean r0 = r0.mo17876e()
            if (r0 == 0) goto L_0x0182
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.formatAvailability
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "formatAvailability"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            g.e.b.k.j.g r4 = r10.f16087U
            java.lang.CharSequence r4 = r4.mo20120a()
            if (r4 == 0) goto L_0x015a
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = 0
            goto L_0x015b
        L_0x015a:
            r4 = 1
        L_0x015b:
            if (r4 != 0) goto L_0x0163
            boolean r4 = r10.f16095c
            if (r4 == 0) goto L_0x0163
            r4 = 1
            goto L_0x0164
        L_0x0163:
            r4 = 0
        L_0x0164:
            if (r4 == 0) goto L_0x0167
            r5 = 0
        L_0x0167:
            r0.setVisibility(r5)
            android.view.View r0 = r11.mo20994a()
            int r4 = p163g.p201e.p203b.p287k.C7310d.formatAvailability
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            g.e.b.k.j.g r3 = r10.f16087U
            java.lang.CharSequence r3 = r3.mo20120a()
            r0.setText(r3)
        L_0x0182:
            android.view.View r0 = r11.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            android.content.Context r0 = r0.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            boolean r0 = com.bamtechmedia.dominguez.core.utils.C5837i.m18842d(r0)
            if (r0 == 0) goto L_0x0216
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.headerImage
            android.view.View r0 = r0.findViewById(r3)
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r0 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r0
            if (r0 == 0) goto L_0x01a9
            p096e.p121h.p135s.C4127b0.m14131b(r0, r1)
        L_0x01a9:
            android.view.View r0 = r11.mo20994a()
            int r3 = p163g.p201e.p203b.p287k.C7310d.headerImageGradient
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x01b8
            p096e.p121h.p135s.C4127b0.m14131b(r0, r1)
        L_0x01b8:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x01ca
        L_0x01c8:
            r12 = 0
            goto L_0x01ea
        L_0x01ca:
            java.util.Iterator r12 = r12.iterator()
        L_0x01ce:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r12.next()
            boolean r3 = r0 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a
            if (r3 == 0) goto L_0x01e6
            g.e.b.k.j.h.a$a r0 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a) r0
            boolean r0 = r0.mo20138b()
            if (r0 == 0) goto L_0x01e6
            r0 = 1
            goto L_0x01e7
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            if (r0 == 0) goto L_0x01ce
            r12 = 1
        L_0x01ea:
            if (r12 == 0) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r1 = 0
        L_0x01ee:
            if (r1 == 0) goto L_0x0216
            android.view.View r11 = r11.mo20994a()
            int r12 = p163g.p201e.p203b.p287k.C7310d.headerImage
            android.view.View r11 = r11.findViewById(r12)
            r0 = r11
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r0 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r0
            if (r0 == 0) goto L_0x0216
            g.e.b.k.j.g r11 = r10.f16087U
            com.bamtechmedia.dominguez.core.content.n r11 = r11.mo20122c()
            com.bamtechmedia.dominguez.core.content.assets.Image r1 = r10.m21967a(r11)
            int r2 = p163g.p201e.p203b.p287k.C7309c.fallback_1_78_tile
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 0
            com.bamtechmedia.dominguez.core.p216l.C5763b.m18702a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p289h.C7327a.m21973b(g.o.a.l.b, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo20131a(C11867b bVar) {
        C5897a aVar = (C5897a) bVar.itemView.findViewById(C7310d.startPlayerButton);
        aVar.setOnClickListener(new C7331d(this, aVar));
        DefaultBookmarkButton defaultBookmarkButton = (DefaultBookmarkButton) bVar.mo20994a().findViewById(C7310d.restartButton);
        if (defaultBookmarkButton != null) {
            defaultBookmarkButton.setOnClickListener(new C7332e(this));
        }
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
        m21973b(bVar, list);
        m21976c(bVar, list);
        m21971a(bVar, list);
        m21978d(bVar, list);
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "itemView.context");
        if (C5837i.m18843e(context)) {
            m21980e(bVar, list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21971a(p163g.p509o.p510a.p511l.C11867b r6, java.util.List<? extends java.lang.Object> r7) {
        /*
            r5 = this;
            android.view.View r6 = r6.itemView
            int r0 = p163g.p201e.p203b.p287k.C7310d.downloadButton
            android.view.View r6 = r6.findViewById(r0)
            com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView r6 = (com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView) r6
            if (r6 == 0) goto L_0x0098
            g.e.b.k.j.g r0 = r5.f16087U
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r0.mo20124e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = com.bamtechmedia.dominguez.core.content.C3695p.m12564b(r0)
            if (r0 != r1) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            boolean r3 = r5.m21974b()
            if (r3 == 0) goto L_0x002d
            boolean r3 = r5.f16095c
            if (r3 == 0) goto L_0x002d
            if (r0 != 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0034
        L_0x0032:
            r0 = 8
        L_0x0034:
            r6.setVisibility(r0)
            r5.m21970a(r6)
            com.bamtechmedia.dominguez.offline.d r0 = r5.f16089W
            if (r0 == 0) goto L_0x0098
            g.e.b.k.j.h.a$c r3 = new g.e.b.k.j.h.a$c
            r3.<init>(r6, r5, r7)
            r6.setOnClickListener(r3)
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x007c
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0058
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0058
        L_0x0056:
            r7 = 0
            goto L_0x0078
        L_0x0058:
            java.util.Iterator r7 = r7.iterator()
        L_0x005c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r7.next()
            boolean r4 = r3 instanceof p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a
            if (r4 == 0) goto L_0x0074
            g.e.b.k.j.h.a$a r3 = (p163g.p201e.p203b.p287k.p288j.p289h.C7327a.C7328a) r3
            boolean r3 = r3.mo20137a()
            if (r3 == 0) goto L_0x0074
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x005c
            r7 = 1
        L_0x0078:
            if (r7 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 == 0) goto L_0x0098
            com.google.common.base.Optional<com.google.common.base.c<com.bamtechmedia.dominguez.offline.d, com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$b>> r7 = r5.f16096c0
            java.lang.Object r7 = r7.mo27107c()
            com.google.common.base.c r7 = (com.google.common.base.C10368c) r7
            if (r7 == 0) goto L_0x0098
            java.lang.Object r7 = r7.apply(r0)
            com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$b r7 = (com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView.C5635b) r7
            if (r7 == 0) goto L_0x0098
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r0)
            r6.mo17399a(r7)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p288j.p289h.C7327a.m21971a(g.o.a.l.b, java.util.List):void");
    }

    /* renamed from: a */
    private final void m21970a(View view) {
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "view.context");
        if (C5837i.m18843e(context)) {
            view.setOnFocusChangeListener(C7329b.f16109c);
        }
    }

    /* renamed from: a */
    private final Image m21967a(C3693o oVar) {
        return oVar.mo12845a(C3688j.BACKGROUND_DETAILS, C3623a.f9125b0.mo13248a());
    }
}
