package com.bamtechmedia.dominguez.auth.p064p0;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailabilityImpl;", "Lcom/bamtechmedia/dominguez/auth/autologin/PasswordAvailability;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "setPasswordAvailable", "", "available", "", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.p0.h */
/* compiled from: PasswordAvailabilityImpl.kt */
public final class C2776h implements C2775g {

    /* renamed from: a */
    private final SharedPreferences f7529a;

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.h$a */
    /* compiled from: PasswordAvailabilityImpl.kt */
    public static final class C2777a {
        private C2777a() {
        }

        public /* synthetic */ C2777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2777a(null);
    }

    public C2776h(SharedPreferences sharedPreferences) {
        this.f7529a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo11791a(boolean z) {
        Editor edit = this.f7529a.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putBoolean("stored_credentials_with_smart_lock", z);
        edit.apply();
    }
}
