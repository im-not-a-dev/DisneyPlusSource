package com.bamtechmedia.dominguez.core.utils;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.utils.s */
/* compiled from: OnKeyDownHandler.kt */
public final class C5866s {
    /* renamed from: a */
    public static final boolean m18914a(C0538i iVar, int i) {
        Fragment f = iVar.mo3160f();
        if (f != null) {
            return m18913a(f, i);
        }
        return false;
    }

    /* renamed from: a */
    private static final boolean m18913a(Fragment fragment, int i) {
        C0538i childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "fragment.childFragmentManager");
        Fragment f = childFragmentManager.mo3160f();
        if (f != null && m18913a(f, i)) {
            return true;
        }
        if (fragment instanceof C5864r) {
            return ((C5864r) fragment).mo12232a(i);
        }
        return false;
    }
}
