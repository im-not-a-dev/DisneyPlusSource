package com.bamtechmedia.dominguez.core.utils;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.p583f0.C12741c;

/* renamed from: com.bamtechmedia.dominguez.core.utils.w */
/* compiled from: FragmentExt.kt */
public final class C5883w<T extends Parcelable> implements C12741c<Fragment, T> {

    /* renamed from: a */
    private final String f13664a;

    /* renamed from: b */
    private final Function0<T> f13665b;

    public C5883w(String str, Function0<? extends T> function0) {
        this.f13664a = str;
        this.f13665b = function0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2 != null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo17776a(androidx.fragment.app.Fragment r2, kotlin.reflect.KProperty<?> r3) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.getArguments()
            if (r2 == 0) goto L_0x000f
            java.lang.String r3 = r1.f13664a
            android.os.Parcelable r2 = r2.getParcelable(r3)
            if (r2 == 0) goto L_0x000f
            goto L_0x001b
        L_0x000f:
            kotlin.jvm.functions.Function0<T> r2 = r1.f13665b
            if (r2 == 0) goto L_0x001a
            java.lang.Object r2 = r2.invoke()
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r0 = 39
            r3.append(r0)
            java.lang.String r0 = r1.f13664a
            r3.append(r0)
            java.lang.String r0 = "' must be specified"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.utils.C5883w.mo17776a(androidx.fragment.app.Fragment, kotlin.reflect.KProperty):android.os.Parcelable");
    }
}
