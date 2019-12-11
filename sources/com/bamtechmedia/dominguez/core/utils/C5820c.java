package com.bamtechmedia.dominguez.core.utils;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.utils.c */
/* compiled from: BackPressHandler.kt */
public final class C5820c {
    /* renamed from: a */
    public static final boolean m18813a(C0538i iVar) {
        Fragment f = iVar.mo3160f();
        if (f != null) {
            return m18812a(f);
        }
        return false;
    }

    /* renamed from: a */
    private static final boolean m18812a(Fragment fragment) {
        C0538i childFragmentManager = fragment.getChildFragmentManager();
        C12880j.m40222a((Object) childFragmentManager, "fragment.childFragmentManager");
        Fragment f = childFragmentManager.mo3160f();
        if (f != null && m18812a(f)) {
            return true;
        }
        if (fragment instanceof C5818b) {
            return ((C5818b) fragment).mo12236k();
        }
        return false;
    }
}
