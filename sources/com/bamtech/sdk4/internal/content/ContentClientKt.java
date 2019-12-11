package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.SearchOverrides;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, mo31007d2 = {"toTemplates", "", "Lcom/bamtech/sdk4/internal/content/OptionalHeaderTemplate;", "Lcom/bamtech/sdk4/content/SearchOverrides;", "extension-content"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public final class ContentClientKt {
    public static final List<OptionalHeaderTemplate> toTemplates(SearchOverrides searchOverrides) {
        ArrayList arrayList = new ArrayList();
        Long activeDate = searchOverrides.getActiveDate();
        if (activeDate != null) {
            long longValue = activeDate.longValue();
            String x_delorian_header = ContentClient.Companion.getX_DELORIAN_HEADER();
            String x_delorian_template = ContentClient.Companion.getX_DELORIAN_TEMPLATE();
            String abstractDateTime = new DateTime(longValue, DateTimeZone.UTC).toString();
            C12880j.m40222a((Object) abstractDateTime, "DateTime(timeInMilliseco…eTimeZone.UTC).toString()");
            arrayList.add(new OptionalHeaderTemplate(x_delorian_header, x_delorian_template, abstractDateTime));
        }
        String countryCode = searchOverrides.getCountryCode();
        if (countryCode != null) {
            arrayList.add(new OptionalHeaderTemplate(ContentClient.Companion.getX_GEO_OVERRIDE_HEADER(), ContentClient.Companion.getX_GEO_OVERRIDE_TEMPLATE(), countryCode));
        }
        return C13199w.m40606q(arrayList);
    }
}
