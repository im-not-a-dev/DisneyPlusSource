package com.bamtechmedia.dominguez.core.utils;

import android.os.Parcelable;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.utils.j */
/* compiled from: FragmentExt.kt */
public final class C5839j {
    /* renamed from: a */
    public static final Fragment m18845a(C0538i iVar) {
        if (iVar != null) {
            List e = iVar.mo3159e();
            if (e != null) {
                List e2 = iVar.mo3159e();
                C12880j.m40222a((Object) e2, "fragments");
                return (Fragment) C13199w.m40578d(e, C13185o.m40507a(e2) - 1);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ C5840j0 m18854b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return m18853b(str, str2, str3);
    }

    /* renamed from: a */
    public static /* synthetic */ C5883w m18852a(String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        return m18851a(str, function0);
    }

    /* renamed from: b */
    public static final C5840j0 m18853b(String str, String str2, String str3) {
        return new C5840j0(str, str2, str3);
    }

    /* renamed from: a */
    public static final <T extends Parcelable> C5883w<T> m18851a(String str, Function0<? extends T> function0) {
        return new C5883w<>(str, function0);
    }

    /* renamed from: a */
    public static /* synthetic */ C5875t m18850a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return m18849a(str, str2, str3);
    }

    /* renamed from: a */
    public static final C5875t m18849a(String str, String str2, String str3) {
        return new C5875t(str, str2, str3);
    }

    /* renamed from: a */
    public static final C5841k m18848a(String str, Integer num) {
        return new C5841k(str, num);
    }

    /* renamed from: a */
    public static /* synthetic */ C5823d m18847a(String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return m18846a(str, bool);
    }

    /* renamed from: a */
    public static final C5823d m18846a(String str, Boolean bool) {
        return new C5823d(str, bool);
    }
}
