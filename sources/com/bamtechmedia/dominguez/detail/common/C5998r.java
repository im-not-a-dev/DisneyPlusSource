package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import java.util.List;
import java.util.Locale;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/PromoLabelFormatter;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "config", "Lcom/bamtechmedia/dominguez/detail/common/PromoConfig;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/detail/common/PromoConfig;)V", "currentDate", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "getCurrentDate", "()Lorg/joda/time/DateTime;", "formatLabel", "", "label", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "isDateValid", "", "isSupportedType", "key", "subType", "uiDate", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.r */
/* compiled from: PromoLabelFormatter.kt */
public final class C5998r {

    /* renamed from: c */
    private static final DateTimeFormatter f13840c;

    /* renamed from: a */
    private final C3572r0 f13841a;

    /* renamed from: b */
    private final C5996p f13842b;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.r$a */
    /* compiled from: PromoLabelFormatter.kt */
    public static final class C5999a {
        private C5999a() {
        }

        public /* synthetic */ C5999a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5999a(null);
        DateTimeFormatter mediumDate = DateTimeFormat.mediumDate();
        Intrinsics.checkReturnedValueIsNotNull((Object) mediumDate, "DateTimeFormat.mediumDate()");
        f13840c = mediumDate;
    }

    public C5998r(C3572r0 r0Var, C5996p pVar) {
        this.f13841a = r0Var;
        this.f13842b = pVar;
    }

    /* renamed from: a */
    private final DateTime m19213a() {
        DateTime b = this.f13842b.mo18040b();
        return b != null ? b : DateTime.now();
    }

    /* renamed from: b */
    private final boolean m19214b(PromoLabel promoLabel) {
        DateTime a = m19213a();
        return promoLabel.mo12811Z().isBefore((ReadableInstant) a) && promoLabel.mo12813a0().isAfter((ReadableInstant) a);
    }

    /* renamed from: c */
    private final boolean m19215c(PromoLabel promoLabel) {
        List list = (List) this.f13842b.mo18042d().get(promoLabel.mo12814b0());
        if (list != null) {
            return C13199w.m40564a((Iterable) list, (Object) m19217e(promoLabel));
        }
        return false;
    }

    /* renamed from: d */
    private final String m19216d(PromoLabel promoLabel) {
        String b0 = promoLabel.mo12814b0();
        Locale locale = Locale.US;
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "Locale.US");
        if (b0 != null) {
            String lowerCase = b0.toLowerCase(locale);
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    private final String m19217e(PromoLabel promoLabel) {
        String Y = promoLabel.mo12810Y();
        if (Y == null) {
            return null;
        }
        Locale locale = Locale.US;
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "Locale.US");
        if (Y != null) {
            String lowerCase = Y.toLowerCase(locale);
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    private final DateTime m19218f(PromoLabel promoLabel) {
        return this.f13842b.mo18041c().contains(promoLabel.mo12814b0()) ? promoLabel.mo12811Z() : promoLabel.mo12813a0();
    }

    /* renamed from: a */
    public final String mo18046a(PromoLabel promoLabel) {
        if (promoLabel != null) {
            if ((m19215c(promoLabel) && m19214b(promoLabel) ? promoLabel : null) != null) {
                C3572r0 r0Var = this.f13841a;
                StringBuilder sb = new StringBuilder();
                sb.append("promo_");
                sb.append(m19216d(promoLabel));
                sb.append('_');
                sb.append(m19217e(promoLabel));
                return r0Var.mo12773a(sb.toString(), C13173j0.m40356a(C12907r.m40244a("date", f13840c.print((ReadableInstant) m19218f(promoLabel))), C12907r.m40244a("season_number", promoLabel.mo12808F()), C12907r.m40244a("episode_sequence_number", promoLabel.mo12809X())));
            }
        }
        return null;
    }
}
