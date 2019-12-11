package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    private final AnnotationDeserializer annotationDeserializer = new AnnotationDeserializer(this.module, this.notFoundClasses);
    private final ModuleDescriptor module;
    private final NotFoundClasses notFoundClasses;

    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses2, StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses2;
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }

    /* access modifiers changed from: protected */
    public AnnotationArgumentVisitor loadAnnotation(ClassId classId, SourceElement sourceElement, List<AnnotationDescriptor> list) {
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(this, resolveClass(classId), list, sourceElement);
    }

    /* access modifiers changed from: protected */
    public ConstantValue<?> loadConstant(String str, Object obj) {
        boolean z = false;
        if (C12833x.m40154a((CharSequence) "ZBCS", (CharSequence) str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(obj);
    }

    /* access modifiers changed from: protected */
    public AnnotationDescriptor loadTypeAnnotation(Annotation annotation, NameResolver nameResolver) {
        return this.annotationDeserializer.deserializeAnnotation(annotation, nameResolver);
    }

    /* access modifiers changed from: protected */
    public ConstantValue<?> transformToUnsignedConstant(ConstantValue<?> constantValue) {
        if (constantValue instanceof ByteValue) {
            return new UByteValue(((Number) ((ByteValue) constantValue).getValue()).byteValue());
        }
        if (constantValue instanceof ShortValue) {
            return new UShortValue(((Number) ((ShortValue) constantValue).getValue()).shortValue());
        }
        if (constantValue instanceof IntValue) {
            return new UIntValue(((Number) ((IntValue) constantValue).getValue()).intValue());
        }
        return constantValue instanceof LongValue ? new ULongValue(((Number) ((LongValue) constantValue).getValue()).longValue()) : constantValue;
    }
}
