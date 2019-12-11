package com.bamtechmedia.dominguez.dictionaries;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionaryDebugSettings;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getPreferences", "()Landroid/content/SharedPreferences;", "debugEnabled", "", "resourceKey", "", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.c */
/* compiled from: DictionaryDebugSettings.kt */
public final class C6065c {

    /* renamed from: b */
    private static final Set<String> f13966b = C13186o0.m40524a("application");

    /* renamed from: a */
    private final SharedPreferences f13967a;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.c$a */
    /* compiled from: DictionaryDebugSettings.kt */
    public static final class C6066a {
        private C6066a() {
        }

        public /* synthetic */ C6066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6066a(null);
    }

    public C6065c(SharedPreferences sharedPreferences) {
        this.f13967a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean mo18343a(String str) {
        if (!f13966b.contains(str) || !this.f13967a.getBoolean("DEBUG_DICTIONARY", false)) {
            return false;
        }
        return true;
    }
}
