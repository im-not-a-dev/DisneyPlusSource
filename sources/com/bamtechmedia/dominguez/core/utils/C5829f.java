package com.bamtechmedia.dominguez.core.utils;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import p096e.p121h.p130o.C4064a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\r¢\u0006\u0002\u0010\u0010R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/utils/BundleFactory;", "", "()V", "implementation", "Lcom/bamtechmedia/dominguez/core/utils/BundleFactory$Implementation;", "implementation$annotations", "getImplementation", "()Lcom/bamtechmedia/dominguez/core/utils/BundleFactory$Implementation;", "setImplementation", "(Lcom/bamtechmedia/dominguez/core/utils/BundleFactory$Implementation;)V", "createBundle", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "DefaultImplementation", "Implementation", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.f */
/* compiled from: BundleFactory.kt */
public final class C5829f {

    /* renamed from: a */
    private static C5831b f13616a = new C5830a();

    /* renamed from: b */
    public static final C5829f f13617b = new C5829f();

    /* renamed from: com.bamtechmedia.dominguez.core.utils.f$a */
    /* compiled from: BundleFactory.kt */
    private static final class C5830a implements C5831b {
        /* renamed from: a */
        public Bundle mo17737a(Pair<String, ? extends Object>[] pairArr) {
            return C4064a.m13969a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.f$b */
    /* compiled from: BundleFactory.kt */
    public interface C5831b {
        /* renamed from: a */
        Bundle mo17737a(Pair<String, ? extends Object>[] pairArr);
    }

    private C5829f() {
    }

    /* renamed from: a */
    public final Bundle mo17736a(Pair<String, ? extends Object>[] pairArr) {
        return f13616a.mo17737a(pairArr);
    }
}
