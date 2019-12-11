package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: typeParameterUtils.kt */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassifierDescriptorWithTypeParameters)) {
            declarationDescriptor = null;
        }
        return buildPossiblyInnerType(kotlinType, (ClassifierDescriptorWithTypeParameters) declarationDescriptor, 0);
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List list;
        Object obj;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        String str = "declaredTypeParameters";
        C12880j.m40222a((Object) declaredTypeParameters, str);
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List g = C12788p.m39999g(C12788p.m39992c(C12788p.m40000g(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), C12934x246a49e2.INSTANCE), C12935x246a49e3.INSTANCE));
        Iterator it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) obj;
        if (classDescriptor != null) {
            TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
            if (typeConstructor != null) {
                list = typeConstructor.getParameters();
            }
        }
        if (list == null) {
            list = C13185o.m40513a();
        }
        if (!g.isEmpty() || !list.isEmpty()) {
            List<TypeParameterDescriptor> d = C13199w.m40583d((Collection) g, (Iterable) list);
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : d) {
                C12880j.m40222a((Object) typeParameterDescriptor, "it");
                arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
            }
            return C13199w.m40583d((Collection) declaredTypeParameters, (Iterable) arrayList);
        }
        List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        C12880j.m40222a((Object) declaredTypeParameters2, str);
        return declaredTypeParameters2;
    }

    private static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = null;
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
        if (!classifierDescriptorWithTypeParameters.isInner()) {
            boolean z = size == kotlinType.getArguments().size() || DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
            if (!C13147x.f29590a || z) {
                return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinType.getArguments().size() - size);
            sb.append(" trailing arguments were found in ");
            sb.append(kotlinType);
            sb.append(" type");
            throw new AssertionError(sb.toString());
        }
        List subList = kotlinType.getArguments().subList(i, size);
        DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
        if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters2 = containingDeclaration;
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, buildPossiblyInnerType(kotlinType, classifierDescriptorWithTypeParameters2, size));
    }
}
