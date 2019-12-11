package com.bamtechmedia.dominguez.brand;

import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo31007d2 = {"getBrandName", "", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "core_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.brand.d */
/* compiled from: BrandAnalyticsExt.kt */
public final class C3174d {

    /* renamed from: com.bamtechmedia.dominguez.brand.d$a */
    /* compiled from: BrandAnalyticsExt.kt */
    static final class C3175a extends C12881k implements Function1<String, String> {

        /* renamed from: c */
        public static final C3175a f8129c = new C3175a();

        C3175a() {
            super(1);
        }

        public final String invoke(String str) {
            return C12832w.m40125f(str);
        }
    }

    /* renamed from: a */
    public static final String m11086a(C3676k kVar) {
        Matcher matcher = Pattern.compile("([a-z]+-[a-z]+|[a-z]+)(-[0-9]+)?").matcher(kVar.mo13377a0());
        if (!matcher.find()) {
            return "Brand name missing.";
        }
        String group = matcher.group(1);
        Intrinsics.checkReturnedValueIsNotNull((Object) group, "matcher.group(1)");
        return C13199w.m40559a(C12833x.m40142a((CharSequence) group, new String[]{"-"}, false, 0, 6, (Object) null), " ", null, null, 0, null, C3175a.f8129c, 30, null);
    }
}
