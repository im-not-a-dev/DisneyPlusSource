package com.bamtechmedia.dominguez.detail.common;

import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3695p;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5899a;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5900b;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5902d;
import com.bamtechmedia.dominguez.detail.common.C5897a.C5898a.C5903e;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.Metadata;
import p163g.p201e.p203b.p287k.C7313g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J2\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0010\u001a\u00020\u0011*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/DetailBookmarkStateBinder;", "", "promoPlayableHelper", "Lcom/bamtechmedia/dominguez/detail/common/PromoPlayableHelper;", "(Lcom/bamtechmedia/dominguez/detail/common/PromoPlayableHelper;)V", "getBookmarkState", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;", "bookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "getPromoPlayableState", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "getState", "promoPlayable", "promoLabel", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "remainingTime", "", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.e */
/* compiled from: DetailBookmarkStateBinder.kt */
public final class C5918e {

    /* renamed from: a */
    private final C6000s f13698a;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.e$a */
    /* compiled from: DetailBookmarkStateBinder.kt */
    public static final class C5919a {
        private C5919a() {
        }

        public /* synthetic */ C5919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5919a(null);
    }

    public C5918e(C6000s sVar) {
        this.f13698a = sVar;
    }

    /* renamed from: b */
    private final String m19004b(Bookmark bookmark) {
        int minutes = (int) TimeUnit.SECONDS.toMinutes(bookmark.getRuntime() - bookmark.getPlayhead());
        if (minutes < 60) {
            return C5880u.m18937a(C7313g.video_time_remaining, C13170i0.m40332a(C12907r.m40244a("time", String.valueOf(minutes))));
        }
        return C5880u.m18937a(C7313g.continue_watching_hours, C13173j0.m40356a(C12907r.m40244a("hours_remaining", String.valueOf(minutes / 60)), C12907r.m40244a("minutes_remaining", String.valueOf(minutes % 60))));
    }

    /* renamed from: a */
    public final C5898a mo17820a(C3693o oVar, Bookmark bookmark, C3693o oVar2, PromoLabel promoLabel) {
        if (oVar2 != null) {
            return m19003a(oVar2);
        }
        if ((oVar instanceof C3692n) && promoLabel != null && C3695p.m12563a(promoLabel)) {
            return C5903e.f13694a;
        }
        if (promoLabel != null && C3695p.m12563a(promoLabel) && oVar == null) {
            return C5903e.f13694a;
        }
        return m19002a(bookmark);
    }

    /* renamed from: a */
    private final C5898a m19003a(C3693o oVar) {
        return new C5900b(oVar, this.f13698a.mo18047a(oVar));
    }

    /* renamed from: a */
    private final C5898a m19002a(Bookmark bookmark) {
        if (bookmark == null || C5905b.m18989a(bookmark) || bookmark.getPlayhead() == 0) {
            return C5899a.f13688a;
        }
        return new C5902d((int) ((((double) bookmark.getPlayhead()) / ((double) bookmark.getRuntime())) * ((double) 100)), m19004b(bookmark));
    }
}
