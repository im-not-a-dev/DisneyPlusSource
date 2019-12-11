package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;

/* compiled from: JavaClassDataFinder.kt */
public final class JavaClassDataFinder implements ClassDataFinder {
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final KotlinClassFinder kotlinClassFinder;

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder2, DeserializedDescriptorResolver deserializedDescriptorResolver2) {
        this.kotlinClassFinder = kotlinClassFinder2;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver2;
    }

    public ClassData findClassData(ClassId classId) {
        KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId);
        if (findKotlinClass == null) {
            return null;
        }
        boolean a = Intrinsics.areEqual((Object) findKotlinClass.getClassId(), (Object) classId);
        if (!C13147x.f29590a || a) {
            return this.deserializedDescriptorResolver.readClassData$descriptors_jvm(findKotlinClass);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class with incorrect id found: expected ");
        sb.append(classId);
        sb.append(", actual ");
        sb.append(findKotlinClass.getClassId());
        throw new AssertionError(sb.toString());
    }
}
