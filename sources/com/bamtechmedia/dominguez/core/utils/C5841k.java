package com.bamtechmedia.dominguez.core.utils;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.p583f0.C12741c;
import kotlin.reflect.KProperty;

/* renamed from: com.bamtechmedia.dominguez.core.utils.k */
/* compiled from: FragmentExt.kt */
public final class C5841k implements C12741c<Fragment, Integer> {

    /* renamed from: a */
    private final String f13625a;

    /* renamed from: b */
    private final Integer f13626b;

    public C5841k(String str, Integer num) {
        this.f13625a = str;
        this.f13626b = num;
    }

    /* renamed from: a */
    public Integer mo17742a(Fragment fragment, KProperty<?> kProperty) {
        Integer num;
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt(this.f13625a));
        } else {
            num = this.f13626b;
        }
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(this.f13625a);
        sb.append("' must be specified");
        throw new IllegalArgumentException(sb.toString());
    }
}
