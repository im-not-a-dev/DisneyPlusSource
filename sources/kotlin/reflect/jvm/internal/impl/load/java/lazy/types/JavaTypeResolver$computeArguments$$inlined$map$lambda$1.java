package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolver$computeArguments$$inlined$map$lambda$1 extends C12881k implements Function0<KotlinType> {
    final /* synthetic */ JavaTypeAttributes $attr$inlined;
    final /* synthetic */ TypeConstructor $constructor$inlined;
    final /* synthetic */ boolean $isRaw$inlined;
    final /* synthetic */ TypeParameterDescriptor $parameter;
    final /* synthetic */ JavaTypeResolver this$0;

    JavaTypeResolver$computeArguments$$inlined$map$lambda$1(TypeParameterDescriptor typeParameterDescriptor, JavaTypeResolver javaTypeResolver, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, boolean z) {
        this.$parameter = typeParameterDescriptor;
        this.this$0 = javaTypeResolver;
        this.$attr$inlined = javaTypeAttributes;
        this.$constructor$inlined = typeConstructor;
        this.$isRaw$inlined = z;
        super(0);
    }

    public final KotlinType invoke() {
        TypeParameterDescriptor typeParameterDescriptor = this.$parameter;
        Intrinsics.checkReturnedValueIsNotNull((Object) typeParameterDescriptor, "parameter");
        return JavaTypeResolverKt.getErasedUpperBound(typeParameterDescriptor, this.$attr$inlined.getUpperBoundOfTypeParameter(), new Function0<KotlinType>(this) {
            final /* synthetic */ JavaTypeResolver$computeArguments$$inlined$map$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            public final KotlinType invoke() {
                ClassifierDescriptor declarationDescriptor = this.this$0.$constructor$inlined.getDeclarationDescriptor();
                if (declarationDescriptor != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "constructor.declarationDescriptor!!");
                    SimpleType defaultType = declarationDescriptor.getDefaultType();
                    Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "constructor.declarationDescriptor!!.defaultType");
                    return TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
                }
                Intrinsics.throwNpe();
                throw null;
            }
        });
    }
}
