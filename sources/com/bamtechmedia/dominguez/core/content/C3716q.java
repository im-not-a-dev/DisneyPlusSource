package com.bamtechmedia.dominguez.core.content;

import android.text.Spannable;
import com.bamtechmedia.dominguez.core.content.assets.Rating;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0004\u001a\u00020\u0005H&J3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0013\"\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "", "format", "Landroid/text/Spannable;", "rating", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "formatRatingWithMovieInfo", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "formatWithExtraInfo", "extra", "Lcom/bamtechmedia/dominguez/core/content/Extra;", "getRatingImageId", "", "getRatingText", "getReasonImageIds", "", "getReasonTexts", "additionalReasonIds", "", "(Lcom/bamtechmedia/dominguez/core/content/assets/Rating;[Ljava/lang/String;)Ljava/util/List;", "prefetchRatingIcons", "Lio/reactivex/Completable;", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.q */
/* compiled from: RatingAdvisoriesFormatter.kt */
public interface C3716q {

    /* renamed from: com.bamtechmedia.dominguez.core.content.q$a */
    /* compiled from: RatingAdvisoriesFormatter.kt */
    public static final class C3717a {

        /* renamed from: a */
        static final /* synthetic */ C3717a f9290a = new C3717a();

        private C3717a() {
        }
    }

    static {
        C3717a aVar = C3717a.f9290a;
    }

    /* renamed from: a */
    Spannable mo13544a(Rating rating);

    /* renamed from: a */
    Spannable mo13545a(C3686h hVar);

    /* renamed from: a */
    Spannable mo13546a(C3692n nVar);

    /* renamed from: a */
    Completable mo13547a();

    /* renamed from: a */
    List<String> mo13548a(Rating rating, String... strArr);

    /* renamed from: b */
    String mo13549b(Rating rating);
}
