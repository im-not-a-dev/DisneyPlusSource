package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: util.kt */
public final class UtilKt {
    public static final List<ValueParameterDescriptor> copyValueParameters(Collection<ValueParameterData> collection, Collection<? extends ValueParameterDescriptor> collection2, CallableDescriptor callableDescriptor) {
        boolean z = collection.size() == collection2.size();
        if (!C13147x.f29590a || z) {
            List<Pair> e = C13199w.m40586e((Iterable) collection, (Iterable) collection2);
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) e, 10));
            for (Pair pair : e) {
                ValueParameterData valueParameterData = (ValueParameterData) pair.mo31013a();
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.mo31014b();
                int index = valueParameterDescriptor.getIndex();
                Annotations annotations = valueParameterDescriptor.getAnnotations();
                Name name = valueParameterDescriptor.getName();
                Intrinsics.checkReturnedValueIsNotNull((Object) name, "oldParameter.name");
                KotlinType type = valueParameterData.getType();
                boolean hasDefaultValue = valueParameterData.getHasDefaultValue();
                boolean isCrossinline = valueParameterDescriptor.isCrossinline();
                boolean isNoinline = valueParameterDescriptor.isNoinline();
                KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? DescriptorUtilsKt.getModule(callableDescriptor).getBuiltIns().getArrayElementType(valueParameterData.getType()) : null;
                SourceElement source = valueParameterDescriptor.getSource();
                Intrinsics.checkReturnedValueIsNotNull((Object) source, "oldParameter.source");
                ValueParameterDescriptorImpl valueParameterDescriptorImpl = r4;
                ValueParameterDescriptorImpl valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name, type, hasDefaultValue, isCrossinline, isNoinline, arrayElementType, source);
                arrayList.add(valueParameterDescriptorImpl);
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Different value parameters sizes: Enhanced = ");
        sb.append(collection.size());
        sb.append(", Old = ");
        sb.append(collection2.size());
        throw new AssertionError(sb.toString());
    }

    public static final AnnotationDefaultValue getDefaultValueFromAnnotation(ValueParameterDescriptor valueParameterDescriptor) {
        Annotations annotations = valueParameterDescriptor.getAnnotations();
        FqName fqName = JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (findAnnotation != null) {
            ConstantValue firstArgument = DescriptorUtilsKt.firstArgument(findAnnotation);
            if (firstArgument != null) {
                if (!(firstArgument instanceof StringValue)) {
                    firstArgument = null;
                }
                StringValue stringValue = (StringValue) firstArgument;
                if (stringValue != null) {
                    String str = (String) stringValue.getValue();
                    if (str != null) {
                        return new StringDefaultValue(str);
                    }
                }
            }
        }
        Annotations annotations2 = valueParameterDescriptor.getAnnotations();
        FqName fqName2 = JvmAnnotationNames.DEFAULT_NULL_FQ_NAME;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (annotations2.hasAnnotation(fqName2)) {
            return NullDefaultValue.INSTANCE;
        }
        return null;
    }

    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(ClassDescriptor classDescriptor) {
        ClassDescriptor superClassNotAny = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        LazyJavaStaticClassScope lazyJavaStaticClassScope = null;
        if (superClassNotAny == null) {
            return null;
        }
        MemberScope staticScope = superClassNotAny.getStaticScope();
        if (staticScope instanceof LazyJavaStaticClassScope) {
            lazyJavaStaticClassScope = staticScope;
        }
        LazyJavaStaticClassScope lazyJavaStaticClassScope2 = lazyJavaStaticClassScope;
        return lazyJavaStaticClassScope2 != null ? lazyJavaStaticClassScope2 : getParentJavaStaticClassScope(superClassNotAny);
    }
}
