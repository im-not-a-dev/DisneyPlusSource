package com.bamtechmedia.dominguez.core.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.Map;
import p163g.p171c.p172a.p173a.C4793a;

/* renamed from: com.bamtechmedia.dominguez.core.utils.u */
/* compiled from: OverrideStringsExt.kt */
public final class C5880u {
    /* renamed from: a */
    private static final C4793a m18935a() {
        return C5882v.f13663b.mo17774a();
    }

    /* renamed from: a */
    public static final void m18941a(TextView textView, int i) {
        textView.setText(m18935a().mo16170a(i));
    }

    /* renamed from: a */
    public static final String m18938a(Context context, int i) {
        return m18935a().mo16170a(i);
    }

    /* renamed from: a */
    public static final String m18940a(Fragment fragment, int i) {
        return m18935a().mo16170a(i);
    }

    /* renamed from: a */
    public static final String m18936a(int i) {
        return m18935a().mo16170a(i);
    }

    /* renamed from: a */
    public static final String m18937a(int i, Map<String, String> map) {
        return m18935a().mo16171a(i, map);
    }

    /* renamed from: a */
    public static final String m18939a(TypedArray typedArray, int i, boolean z) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (z) {
            return typedArray.getResources().getString(resourceId);
        }
        if (resourceId != 0) {
            return m18936a(resourceId);
        }
        return null;
    }
}
