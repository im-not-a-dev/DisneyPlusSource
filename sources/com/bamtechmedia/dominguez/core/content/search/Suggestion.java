package com.bamtechmedia.dominguez.core.content.search;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/Suggestion;", "", "suggestionTerm", "", "suggestionType", "(Ljava/lang/String;Ljava/lang/String;)V", "getSuggestionTerm", "()Ljava/lang/String;", "getSuggestionType", "type", "Lcom/bamtechmedia/dominguez/core/content/search/Suggestion$SuggestionType;", "getType", "()Lcom/bamtechmedia/dominguez/core/content/search/Suggestion$SuggestionType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SuggestionType", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SearchSuggestionModels.kt */
public final class Suggestion {

    /* renamed from: a */
    private final SuggestionType f9307a;

    /* renamed from: b */
    private final String f9308b;

    /* renamed from: c */
    private final String f9309c;

    @Keep
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/Suggestion$SuggestionType;", "", "sortOrder", "", "(Ljava/lang/String;II)V", "getSortOrder", "()I", "TITLE", "SERIES", "BRAND", "CHARACTER", "STUDIO", "FRANCHISE", "GENRE", "PERSON", "UNKNOWN", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SearchSuggestionModels.kt */
    public enum SuggestionType {
        TITLE(1),
        SERIES(2),
        BRAND(3),
        CHARACTER(4),
        STUDIO(5),
        FRANCHISE(6),
        GENRE(7),
        PERSON(8),
        UNKNOWN(9);
        
        private final int sortOrder;

        private SuggestionType(int i) {
            this.sortOrder = i;
        }

        public final int getSortOrder() {
            return this.sortOrder;
        }
    }

    public Suggestion(String str, String str2) {
        SuggestionType suggestionType;
        this.f9308b = str;
        this.f9309c = str2;
        SuggestionType[] values = SuggestionType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                suggestionType = null;
                break;
            }
            suggestionType = values[i];
            if (Intrinsics.areEqual((Object) suggestionType.name(), (Object) this.f9309c)) {
                break;
            }
            i++;
        }
        if (suggestionType == null) {
            suggestionType = SuggestionType.UNKNOWN;
        }
        this.f9307a = suggestionType;
    }

    /* renamed from: a */
    public final String mo13568a() {
        return this.f9308b;
    }

    /* renamed from: b */
    public final String mo13569b() {
        return this.f9309c;
    }

    /* renamed from: c */
    public final SuggestionType mo13570c() {
        return this.f9307a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9309c, (java.lang.Object) r3.f9309c) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.search.Suggestion
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.search.Suggestion r3 = (com.bamtechmedia.dominguez.core.content.search.Suggestion) r3
            java.lang.String r0 = r2.f9308b
            java.lang.String r1 = r3.f9308b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f9309c
            java.lang.String r3 = r3.f9309c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.search.Suggestion.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9308b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9309c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Suggestion(suggestionTerm=");
        sb.append(this.f9308b);
        sb.append(", suggestionType=");
        sb.append(this.f9309c);
        sb.append(")");
        return sb.toString();
    }
}
