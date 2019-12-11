package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: RawType.kt */
public final class RawTypeImpl extends FlexibleType implements RawType {
    public RawTypeImpl(SimpleType simpleType, SimpleType simpleType2) {
        super(simpleType, simpleType2);
        boolean isSubtypeOf = KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
        if (C13147x.f29590a && !isSubtypeOf) {
            StringBuilder sb = new StringBuilder();
            sb.append("Lower bound ");
            sb.append(simpleType);
            sb.append(" of a flexible type must be a subtype of the upper bound ");
            sb.append(simpleType2);
            throw new AssertionError(sb.toString());
        }
    }

    public SimpleType getDelegate() {
        return getLowerBound();
    }

    public MemberScope getMemberScope() {
        ClassifierDescriptor declarationDescriptor = getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(RawSubstitution.INSTANCE);
            C12880j.m40222a((Object) memberScope, "classDescriptor.getMemberScope(RawSubstitution)");
            return memberScope;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incorrect classifier: ");
        sb.append(getConstructor().getDeclarationDescriptor());
        throw new IllegalStateException(sb.toString().toString());
    }

    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        RawTypeImpl$render$1 rawTypeImpl$render$1 = RawTypeImpl$render$1.INSTANCE;
        RawTypeImpl$render$2 rawTypeImpl$render$2 = new RawTypeImpl$render$2(descriptorRenderer);
        RawTypeImpl$render$3 rawTypeImpl$render$3 = RawTypeImpl$render$3.INSTANCE;
        String renderType = descriptorRenderer.renderType(getLowerBound());
        String renderType2 = descriptorRenderer.renderType(getUpperBound());
        if (descriptorRendererOptions.getDebugMode()) {
            StringBuilder sb = new StringBuilder();
            sb.append("raw (");
            sb.append(renderType);
            sb.append("..");
            sb.append(renderType2);
            sb.append(')');
            return sb.toString();
        } else if (getUpperBound().getArguments().isEmpty()) {
            return descriptorRenderer.renderFlexibleType(renderType, renderType2, TypeUtilsKt.getBuiltIns(this));
        } else {
            List invoke = rawTypeImpl$render$2.invoke((KotlinType) getLowerBound());
            List invoke2 = rawTypeImpl$render$2.invoke((KotlinType) getUpperBound());
            List list = invoke;
            String a = C13199w.m40559a(list, ", ", null, null, 0, null, RawTypeImpl$render$newArgs$1.INSTANCE, 30, null);
            List e = C13199w.m40586e((Iterable) invoke, (Iterable) invoke2);
            boolean z = true;
            if (!(e instanceof Collection) || !e.isEmpty()) {
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    if (!RawTypeImpl$render$1.INSTANCE.invoke((String) pair.mo31015c(), (String) pair.mo31016d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                renderType2 = rawTypeImpl$render$3.invoke(renderType2, a);
            }
            String invoke3 = rawTypeImpl$render$3.invoke(renderType, a);
            if (C12880j.m40224a((Object) invoke3, (Object) renderType2)) {
                return invoke3;
            }
            return descriptorRenderer.renderFlexibleType(invoke3, renderType2, TypeUtilsKt.getBuiltIns(this));
        }
    }

    public RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    public RawTypeImpl replaceAnnotations(Annotations annotations) {
        return new RawTypeImpl(getLowerBound().replaceAnnotations(annotations), getUpperBound().replaceAnnotations(annotations));
    }
}
