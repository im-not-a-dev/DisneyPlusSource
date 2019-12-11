package kotlin.p584g0.p585e;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p584g0.C12744a;

/* renamed from: kotlin.g0.e.a */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class C12751a extends C12744a {
    /* renamed from: c */
    public Random mo31068c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkReturnedValueIsNotNull((Object) current, "ThreadLocalRandom.current()");
        return current;
    }
}
