package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00130\u0006J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "defaultAudioLanguageCodes", "", "", "defaultCaptionsCodes", "defaultUiLanguageCode", "firstAudioLanguageCodes", "originalLanguage", "firstCaptionsLanguageCodes", "firstCodesForKey", "keyPrefix", "firstUiLanguageCodes", "insertOriginalLanguage", "", "languageCodeNamePairs", "Lkotlin/Pair;", "preferredAudioLanguageCodes", "languageCode", "preferredCaptionsLanguageCodes", "preferredCodesForKey", "key", "preferredUiLanguageCodes", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.e */
/* compiled from: LanguageFallbackLogic.kt */
public final class C6913e {

    /* renamed from: a */
    private final C3572r0 f15389a;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.e$a */
    /* compiled from: LanguageFallbackLogic.kt */
    public static final class C6914a {
        private C6914a() {
        }

        public /* synthetic */ C6914a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.e$b */
    /* compiled from: Comparisons.kt */
    public static final class C6915b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a((String) ((Pair) t).mo31015c(), (String) ((Pair) t2).mo31015c());
        }
    }

    static {
        new C6914a(null);
    }

    public C6913e(C3572r0 r0Var) {
        this.f15389a = r0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ List m21125a(C6913e eVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.mo19674a(str, str2);
    }

    /* renamed from: b */
    public static /* synthetic */ List m21126b(C6913e eVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.mo19676b(str, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ List m21128c(C6913e eVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.mo19678c(str, str2);
    }

    /* renamed from: d */
    private final List<String> m21129d(String str, String str2) {
        for (String str3 : this.f15389a.mo12774a()) {
            boolean z = false;
            if (C12833x.m40154a((CharSequence) str3, (CharSequence) str, false, 2, (Object) null) && !C12833x.m40154a((CharSequence) str3, (CharSequence) "default", false, 2, (Object) null)) {
                z = true;
                continue;
            }
            if (z) {
                return C12833x.m40142a((CharSequence) this.f15389a.mo12775b(str3, m21127b(str2)), new String[]{"|"}, false, 0, 6, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: e */
    private final List<String> m21130e(String str, String str2) {
        String a = this.f15389a.mo12773a(str, m21127b(str2));
        if (a != null) {
            List<String> a2 = C12833x.m40142a((CharSequence) a, new String[]{"|"}, false, 0, 6, (Object) null);
            if (a2 != null) {
                return a2;
            }
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    public final List<String> mo19674a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("audio_");
        sb.append(str);
        return m21130e(sb.toString(), str2);
    }

    /* renamed from: b */
    public final List<String> mo19676b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("timed_text_");
        sb.append(str);
        return m21130e(sb.toString(), str2);
    }

    /* renamed from: c */
    public final List<String> mo19678c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("ui_");
        sb.append(str);
        return m21130e(sb.toString(), str2);
    }

    /* renamed from: a */
    public final List<String> mo19672a() {
        return C12833x.m40142a((CharSequence) C3573a.m12037b(this.f15389a, "audio_default", null, 2, null), new String[]{"|"}, false, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public final List<String> mo19675b() {
        return C12833x.m40142a((CharSequence) C3573a.m12037b(this.f15389a, "timed_text_default", null, 2, null), new String[]{"|"}, false, 0, 6, (Object) null);
    }

    /* renamed from: c */
    public final String mo19677c() {
        String a = C3573a.m12036a(this.f15389a, "ui_default", (Map) null, 2, (Object) null);
        return a != null ? a : "";
    }

    /* renamed from: b */
    private final Map<String, String> m21127b(String str) {
        if (str == null) {
            str = "UNKNOWN";
        }
        return C13170i0.m40332a(C12907r.m40244a("originalLanguage", str));
    }

    /* renamed from: a */
    public final List<String> mo19673a(String str) {
        return m21129d("audio_", str);
    }

    /* renamed from: d */
    public final List<Pair<String, String>> mo19679d() {
        Set a = this.f15389a.mo12774a();
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (C12833x.m40154a((CharSequence) (String) next, (CharSequence) "supported_ui_code", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (String b : arrayList) {
            String b2 = C3573a.m12037b(this.f15389a, b, null, 2, null);
            C3572r0 r0Var = this.f15389a;
            StringBuilder sb = new StringBuilder();
            sb.append("name_");
            sb.append(b2);
            arrayList2.add(new Pair(C3573a.m12037b(r0Var, sb.toString(), null, 2, null), b2));
        }
        return C13199w.m40562a((Iterable) arrayList2, (Comparator) new C6915b());
    }
}
