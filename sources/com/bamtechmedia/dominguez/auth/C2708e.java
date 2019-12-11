package com.bamtechmedia.dominguez.auth;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.auth.p061o0.C2739a;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.auth.e */
/* compiled from: AuthFragmentFactoryImpl.kt */
public final class C2708e implements C2739a {
    /* renamed from: a */
    public Fragment mo11739a() {
        C2712g gVar = new C2712g();
        gVar.setArguments(m10343a(1));
        return gVar;
    }

    /* renamed from: b */
    public Fragment mo11740b() {
        C2712g gVar = new C2712g();
        gVar.setArguments(m10343a(0));
        return gVar;
    }

    /* renamed from: a */
    private final Bundle m10343a(int i) {
        return C5833g.m18829a(C12907r.m40244a("initialViewType", Integer.valueOf(i)));
    }
}
