package com.bamtechmedia.dominguez.dictionaries;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.config.C3572r0;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12808i;
import kotlin.p588j0.C12815k;
import kotlin.p588j0.C12820m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J(\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016J.\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016J&\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016J&\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/NameSpacedDictionary;", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "resources", "Landroid/content/res/Resources;", "dictionaryManager", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/dictionaries/DictionaryManager;", "(Landroid/content/res/Resources;Ljavax/inject/Provider;)V", "allKeys", "", "", "getAllKeys", "()Ljava/util/Set;", "dictionary", "Lcom/bamtechmedia/dominguez/dictionaries/KeyValueDictionary;", "resourceKey", "optionalString", "key", "replacements", "", "", "quantityString", "resourceId", "", "quantity", "string", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.o */
/* compiled from: NameSpacedDictionary.kt */
public final class C6091o implements C3572r0 {

    /* renamed from: c */
    private static final C12815k f14021c = new C12815k("^ns_([a-z-]+)_([a-z0-9_-]+)", C12820m.IGNORE_CASE);

    /* renamed from: a */
    private final Resources f14022a;

    /* renamed from: b */
    private final Provider<C6072g> f14023b;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.o$a */
    /* compiled from: NameSpacedDictionary.kt */
    private static final class C6092a {
        private C6092a() {
        }

        public /* synthetic */ C6092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6092a(null);
    }

    public C6091o(Resources resources, Provider<C6072g> provider) {
        this.f14022a = resources;
        this.f14023b = provider;
    }

    /* renamed from: a */
    public Set<String> mo12774a() {
        return C13188p0.m40531a();
    }

    /* renamed from: b */
    public String mo12775b(String str, Map<String, ? extends Object> map) {
        C12808i a = C12815k.m40033a(f14021c, str, 0, 2, null);
        if (a != null) {
            String b = m19485a((String) a.mo31120b().get(1)).mo12775b((String) a.mo31120b().get(2), map);
            if (b != null) {
                return b;
            }
        }
        return m19485a("application").mo12775b(str, map);
    }

    /* renamed from: a */
    public String mo12772a(int i, Map<String, ? extends Object> map) {
        String string = this.f14022a.getString(i);
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "resources.getString(resourceId)");
        return mo12775b(string, map);
    }

    /* renamed from: a */
    public String mo12773a(String str, Map<String, ? extends Object> map) {
        C12808i a = C12815k.m40033a(f14021c, str, 0, 2, null);
        if (a != null) {
            String a2 = m19485a((String) a.mo31120b().get(1)).mo12773a((String) a.mo31120b().get(2), map);
            if (a2 != null) {
                return a2;
            }
        }
        return m19485a("application").mo12773a(str, map);
    }

    /* renamed from: a */
    private final C6087l m19485a(String str) {
        return ((C6072g) this.f14023b.get()).mo18351b(str);
    }
}
