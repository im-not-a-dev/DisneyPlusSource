package com.bamtechmedia.dominguez.channels.p073tv;

import android.content.Context;
import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.core.utils.C5850n;
import p096e.p155q.p156a.p157a.C4342e;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.c */
/* compiled from: FeatureChannelModule */
public abstract class C3207c {
    /* renamed from: a */
    static SharedPreferences m11157a(Context context) {
        return new C5850n(context, "ChannelsSharedPrefs");
    }

    /* renamed from: b */
    static C4342e m11158b(Context context) {
        return new C4342e(context);
    }
}
