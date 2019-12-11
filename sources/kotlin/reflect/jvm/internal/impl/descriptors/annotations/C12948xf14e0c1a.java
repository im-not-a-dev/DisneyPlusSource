package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 */
/* compiled from: annotationUtil.kt */
final class C12948xf14e0c1a extends C12881k implements Function1<ModuleDescriptor, SimpleType> {
    final /* synthetic */ KotlinBuiltIns $this_createDeprecatedAnnotation;

    C12948xf14e0c1a(KotlinBuiltIns kotlinBuiltIns) {
        this.$this_createDeprecatedAnnotation = kotlinBuiltIns;
        super(1);
    }

    public final SimpleType invoke(ModuleDescriptor moduleDescriptor) {
        SimpleType arrayType = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, this.$this_createDeprecatedAnnotation.getStringType());
        Intrinsics.checkReturnedValueIsNotNull((Object) arrayType, "module.builtIns.getArray…ce.INVARIANT, stringType)");
        return arrayType;
    }
}
