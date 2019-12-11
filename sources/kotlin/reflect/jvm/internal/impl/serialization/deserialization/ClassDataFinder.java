package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.name.ClassId;

public interface ClassDataFinder {
    ClassData findClassData(ClassId classId);
}
