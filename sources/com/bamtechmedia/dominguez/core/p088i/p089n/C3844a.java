package com.bamtechmedia.dominguez.core.p088i.p089n;

import android.os.Build.VERSION;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;", "", "backgroundBlurMinSdk", "", "getBackgroundBlurMinSdk", "()I", "backgroundBlurRadius", "getBackgroundBlurRadius", "isBackgroundBlurSupported", "", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.i.n.a */
/* compiled from: BlurConfig.kt */
public interface C3844a {

    /* renamed from: com.bamtechmedia.dominguez.core.i.n.a$a */
    /* compiled from: BlurConfig.kt */
    public static final class C3845a {
        /* renamed from: a */
        public static boolean m12922a(C3844a aVar) {
            return VERSION.SDK_INT >= aVar.mo13754b();
        }
    }

    /* renamed from: a */
    boolean mo13753a();

    /* renamed from: b */
    int mo13754b();

    /* renamed from: c */
    int mo13755c();
}
