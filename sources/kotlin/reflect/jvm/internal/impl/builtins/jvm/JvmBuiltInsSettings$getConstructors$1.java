package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$getConstructors$1 extends C12881k implements Function2<ConstructorDescriptor, ConstructorDescriptor, Boolean> {
    final /* synthetic */ TypeSubstitutor $substitutor;

    JvmBuiltInsSettings$getConstructors$1(TypeSubstitutor typeSubstitutor) {
        this.$substitutor = typeSubstitutor;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((ConstructorDescriptor) obj, (ConstructorDescriptor) obj2));
    }

    public final boolean invoke(ConstructorDescriptor constructorDescriptor, ConstructorDescriptor constructorDescriptor2) {
        return OverridingUtil.getBothWaysOverridability(constructorDescriptor, constructorDescriptor2.substitute(this.$substitutor)) == Result.OVERRIDABLE;
    }
}
