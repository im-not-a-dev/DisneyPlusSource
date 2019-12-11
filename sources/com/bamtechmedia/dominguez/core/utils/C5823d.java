package com.bamtechmedia.dominguez.core.utils;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.p583f0.C12741c;
import kotlin.reflect.KProperty;

/* renamed from: com.bamtechmedia.dominguez.core.utils.d */
/* compiled from: FragmentExt.kt */
public final class C5823d implements C12741c<Fragment, Boolean> {

    /* renamed from: a */
    private final String f13611a;

    /* renamed from: b */
    private final Boolean f13612b;

    public C5823d(String str, Boolean bool) {
        this.f13611a = str;
        this.f13612b = bool;
    }

    /* renamed from: a */
    public Boolean mo17732a(Fragment fragment, KProperty<?> kProperty) {
        Boolean bool;
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean(this.f13611a));
        } else {
            bool = this.f13612b;
        }
        if (bool != null) {
            return Boolean.valueOf(bool.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(this.f13611a);
        sb.append("' must be specified");
        throw new IllegalArgumentException(sb.toString());
    }
}
