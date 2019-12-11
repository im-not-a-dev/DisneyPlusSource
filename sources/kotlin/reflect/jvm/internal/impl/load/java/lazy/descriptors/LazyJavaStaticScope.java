package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: LazyJavaStaticScope.kt */
public abstract class LazyJavaStaticScope extends LazyJavaScope {
    public LazyJavaStaticScope(LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext);
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
    }

    /* access modifiers changed from: protected */
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    /* access modifiers changed from: protected */
    public MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2) {
        MethodSignatureData methodSignatureData = new MethodSignatureData(kotlinType, null, list2, list, false, C13185o.m40513a());
        return methodSignatureData;
    }
}
