package kotlin.p584g0;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, mo31007d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.g0.b */
/* compiled from: PlatformRandom.kt */
public final class C12745b extends C12744a {

    /* renamed from: c */
    private final C12746a f29412c = new C12746a();

    /* renamed from: kotlin.g0.b$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C12746a extends ThreadLocal<Random> {
        C12746a() {
        }

        /* access modifiers changed from: protected */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo31068c() {
        Object obj = this.f29412c.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "implStorage.get()");
        return (Random) obj;
    }
}
