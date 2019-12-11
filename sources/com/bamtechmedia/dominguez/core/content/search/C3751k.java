package com.bamtechmedia.dominguez.core.content.search;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.core.content.search.C3749j.C3750a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepoImpl;", "Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "code", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "fallbackCode", "getFallbackCode", "setFallbackCode", "Companion", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.k */
/* compiled from: UiLanguageCodeRepoImpl.kt */
public final class C3751k implements C3749j {

    /* renamed from: a */
    private final SharedPreferences f9354a;

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.k$a */
    /* compiled from: UiLanguageCodeRepoImpl.kt */
    public static final class C3752a {
        private C3752a() {
        }

        public /* synthetic */ C3752a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3752a(null);
    }

    public C3751k(SharedPreferences sharedPreferences) {
        this.f9354a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo13595a() {
        String string = this.f9354a.getString("ui_language_fallback_code", "en");
        if (string != null) {
            return string;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: b */
    public Locale mo13597b() {
        return C3750a.m12700a(this);
    }

    public String getCode() {
        return this.f9354a.getString("ui_language_code", null);
    }

    /* renamed from: a */
    public void mo13596a(String str) {
        Editor edit = this.f9354a.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putString("ui_language_fallback_code", str);
        edit.apply();
    }

    /* renamed from: b */
    public void mo13598b(String str) {
        Editor edit = this.f9354a.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putString("ui_language_code", str);
        edit.apply();
    }
}
