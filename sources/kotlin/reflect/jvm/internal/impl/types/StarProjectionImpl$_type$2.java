package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* compiled from: StarProjectionImpl.kt */
final class StarProjectionImpl$_type$2 extends C12881k implements Function0<KotlinType> {
    final /* synthetic */ StarProjectionImpl this$0;

    StarProjectionImpl$_type$2(StarProjectionImpl starProjectionImpl) {
        this.this$0 = starProjectionImpl;
        super(0);
    }

    public final KotlinType invoke() {
        return StarProjectionImplKt.starProjectionType(this.this$0.typeParameter);
    }
}
