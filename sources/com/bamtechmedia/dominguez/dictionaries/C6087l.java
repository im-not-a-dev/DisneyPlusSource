package com.bamtechmedia.dominguez.dictionaries;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.config.C3572r0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001%B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ&\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bH\u0002J-\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b0\u001aH\u0010J(\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ.\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bH\u0016J&\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bH\u0016J&\u0010$\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bH\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/KeyValueDictionary;", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "resources", "Landroid/content/res/Resources;", "debugSettings", "Lcom/bamtechmedia/dominguez/dictionaries/DictionaryDebugSettings;", "localEntriesProvider", "Ljavax/inject/Provider;", "", "", "resourceKey", "(Landroid/content/res/Resources;Lcom/bamtechmedia/dominguez/dictionaries/DictionaryDebugSettings;Ljavax/inject/Provider;Ljava/lang/String;)V", "allKeys", "", "getAllKeys", "()Ljava/util/Set;", "cachedMap", "map", "getMap", "()Ljava/util/Map;", "debugValue", "key", "replacements", "", "format", "source", "", "Lkotlin/Pair;", "optionalString", "overrideEntries", "", "entries", "quantityString", "resourceId", "", "quantity", "string", "Factory", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.l */
/* compiled from: KeyValueDictionary.kt */
public final class C6087l implements C3572r0 {

    /* renamed from: a */
    private Map<String, String> f14012a;

    /* renamed from: b */
    private final Resources f14013b;

    /* renamed from: c */
    private final C6065c f14014c;

    /* renamed from: d */
    private final Provider<Map<String, String>> f14015d;

    /* renamed from: e */
    private final String f14016e;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.l$a */
    /* compiled from: KeyValueDictionary.kt */
    public static final class C6088a {

        /* renamed from: a */
        private final Resources f14017a;

        /* renamed from: b */
        private final C6065c f14018b;

        public C6088a(Resources resources, C6065c cVar) {
            this.f14017a = resources;
            this.f14018b = cVar;
        }

        /* renamed from: a */
        public final C6087l mo18362a(Provider<Map<String, String>> provider, String str) {
            return new C6087l(this.f14017a, this.f14018b, provider, str);
        }
    }

    public C6087l(Resources resources, C6065c cVar, Provider<Map<String, String>> provider, String str) {
        this.f14013b = resources;
        this.f14014c = cVar;
        this.f14015d = provider;
        this.f14016e = str;
    }

    /* renamed from: b */
    private final Map<String, String> m19475b() {
        Map<String, String> map = this.f14012a;
        if (map == null) {
            map = (Map) this.f14015d.get();
            if (map != null) {
                this.f14012a = map;
            } else {
                map = null;
            }
        }
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: c */
    private final String m19476c(String str, Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(map);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo18361a(Map<String, String> map) {
        this.f14012a = map;
    }

    /* renamed from: a */
    public Set<String> mo12774a() {
        return m19475b().keySet();
    }

    /* renamed from: a */
    public String mo12772a(int i, Map<String, ? extends Object> map) {
        String string = this.f14013b.getString(i);
        C12880j.m40222a((Object) string, "resources.getString(resourceId)");
        return mo12775b(string, map);
    }

    /* renamed from: a */
    public String mo12773a(String str, Map<String, ? extends Object> map) {
        if (this.f14012a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dictionary '");
            sb.append(this.f14016e);
            sb.append("' not yet loaded when '");
            sb.append(str);
            sb.append("' was requested");
            C14100a.m44529c(sb.toString(), new Object[0]);
        }
        if (this.f14014c.mo18343a(this.f14016e)) {
            return m19476c(str, map);
        }
        String str2 = (String) m19475b().get(str);
        if (str2 != null) {
            return m19474a(str2, C13177k0.m40416f(map));
        }
        return null;
    }

    /* renamed from: b */
    public String mo12775b(String str, Map<String, ? extends Object> map) {
        if (this.f14012a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dictionary '");
            sb.append(this.f14016e);
            sb.append("' not yet loaded when '");
            sb.append(str);
            sb.append("' was requested");
            C14100a.m44529c(sb.toString(), new Object[0]);
        }
        String str2 = (String) m19475b().get(str);
        if (str2 == null || this.f14014c.mo18343a(this.f14016e)) {
            return m19476c(str, map);
        }
        if (map.isEmpty()) {
            return str2;
        }
        return m19474a(str2, C13177k0.m40416f(map));
    }

    /* renamed from: a */
    private final String m19474a(String str, List<? extends Pair<String, ? extends Object>> list) {
        String str2 = str;
        while (!list.isEmpty()) {
            Pair pair = (Pair) C13199w.m40589f((List) list);
            StringBuilder sb = new StringBuilder();
            sb.append("${");
            sb.append((String) pair.mo31015c());
            sb.append('}');
            str2 = C12832w.m40117a(str2, sb.toString(), String.valueOf(pair.mo31016d()), false, 4, (Object) null);
            list = C13199w.m40571c((Iterable) list, 1);
        }
        return str2;
    }
}
