package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$notConsideredDeprecation$2 extends C12881k implements Function0<Annotations> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$notConsideredDeprecation$2(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
        super(0);
    }

    public final Annotations invoke() {
        return Annotations.Companion.create(C13183n.m40498a(AnnotationUtilKt.createDeprecatedAnnotation$default(this.this$0.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
    }
}
