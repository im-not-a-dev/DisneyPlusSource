package com.bamtechmedia.dominguez.core.content.search;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "fallbackCode", "getFallbackCode", "setFallbackCode", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.j */
/* compiled from: UiLanguageCodeRepo.kt */
public interface C3749j {

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.j$a */
    /* compiled from: UiLanguageCodeRepo.kt */
    public static final class C3750a {
        /* renamed from: a */
        public static Locale m12700a(C3749j jVar) {
            String code = jVar.getCode();
            if (code == null) {
                code = jVar.mo13595a();
            }
            Locale forLanguageTag = Locale.forLanguageTag(code);
            C12880j.m40222a((Object) forLanguageTag, "Locale.forLanguageTag(code ?: fallbackCode)");
            return forLanguageTag;
        }
    }

    /* renamed from: a */
    String mo13595a();

    /* renamed from: a */
    void mo13596a(String str);

    /* renamed from: b */
    Locale mo13597b();

    /* renamed from: b */
    void mo13598b(String str);

    String getCode();
}
