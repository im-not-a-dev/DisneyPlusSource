package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, mo31007d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: KTypesJvm.kt */
public final class KTypesJvm {
    public static final KClass<?> getJvmErasure(KType kType) {
        KClassifier classifier = kType.getClassifier();
        if (classifier != null) {
            KClass<?> jvmErasure = getJvmErasure(classifier);
            if (jvmErasure != null) {
                return jvmErasure;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(kType);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public static /* synthetic */ void jvmErasure$annotations(KType kType) {
    }

    public static final KClass<?> getJvmErasure(KClassifier kClassifier) {
        Object obj;
        boolean z;
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (kClassifier instanceof KTypeParameter) {
            List upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
            Iterator it = upperBounds.iterator();
            while (true) {
                ClassDescriptor classDescriptor = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                KType kType = (KType) obj;
                if (kType != null) {
                    ClassifierDescriptor declarationDescriptor = ((KTypeImpl) kType).getType().getConstructor().getDeclarationDescriptor();
                    if (declarationDescriptor instanceof ClassDescriptor) {
                        classDescriptor = declarationDescriptor;
                    }
                    ClassDescriptor classDescriptor2 = classDescriptor;
                    if (classDescriptor2 == null || classDescriptor2.getKind() == ClassKind.INTERFACE || classDescriptor2.getKind() == ClassKind.ANNOTATION_CLASS) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            KType kType2 = (KType) obj;
            if (kType2 == null) {
                kType2 = (KType) C13199w.m40591g(upperBounds);
            }
            if (kType2 != null) {
                KClass<?> jvmErasure = getJvmErasure(kType2);
                if (jvmErasure != null) {
                    return jvmErasure;
                }
            }
            return C12895y.m40230a(Object.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(kClassifier);
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
