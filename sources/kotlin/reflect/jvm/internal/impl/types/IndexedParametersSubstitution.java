package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* compiled from: TypeSubstitution.kt */
public final class IndexedParametersSubstitution extends TypeSubstitution {
    private final boolean approximateCapturedTypes;
    private final TypeProjection[] arguments;
    private final TypeParameterDescriptor[] parameters;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(typeParameterDescriptorArr, typeProjectionArr, z);
    }

    public boolean approximateContravariantCapturedTypes() {
        return this.approximateCapturedTypes;
    }

    public TypeProjection get(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
            declarationDescriptor = null;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) declarationDescriptor;
        if (typeParameterDescriptor != null) {
            int index = typeParameterDescriptor.getIndex();
            TypeParameterDescriptor[] typeParameterDescriptorArr = this.parameters;
            if (index < typeParameterDescriptorArr.length && Intrinsics.areEqual((Object) typeParameterDescriptorArr[index].getTypeConstructor(), (Object) typeParameterDescriptor.getTypeConstructor())) {
                return this.arguments[index];
            }
        }
        return null;
    }

    public final TypeProjection[] getArguments() {
        return this.arguments;
    }

    public final TypeParameterDescriptor[] getParameters() {
        return this.parameters;
    }

    public boolean isEmpty() {
        return this.arguments.length == 0;
    }

    public IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z) {
        this.parameters = typeParameterDescriptorArr;
        this.arguments = typeProjectionArr;
        this.approximateCapturedTypes = z;
        boolean z2 = this.parameters.length <= this.arguments.length;
        if (C13147x.f29590a && !z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Number of arguments should not be less then number of parameters, but: parameters=");
            sb.append(this.parameters.length);
            sb.append(", args=");
            sb.append(this.arguments.length);
            throw new AssertionError(sb.toString());
        }
    }

    public IndexedParametersSubstitution(List<? extends TypeParameterDescriptor> list, List<? extends TypeProjection> list2) {
        Object[] array = list.toArray(new TypeParameterDescriptor[0]);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (array != null) {
            TypeParameterDescriptor[] typeParameterDescriptorArr = (TypeParameterDescriptor[]) array;
            Object[] array2 = list2.toArray(new TypeProjection[0]);
            if (array2 != null) {
                this(typeParameterDescriptorArr, (TypeProjection[]) array2, false, 4, null);
                return;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }
}
