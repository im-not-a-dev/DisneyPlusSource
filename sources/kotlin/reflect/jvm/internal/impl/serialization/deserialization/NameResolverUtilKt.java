package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: NameResolverUtil.kt */
public final class NameResolverUtilKt {
    public static final ClassId getClassId(NameResolver nameResolver, int i) {
        ClassId fromString = ClassId.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
        C12880j.m40222a((Object) fromString, "ClassId.fromString(getQu… isLocalClassName(index))");
        return fromString;
    }

    public static final Name getName(NameResolver nameResolver, int i) {
        Name guessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i));
        C12880j.m40222a((Object) guessByFirstCharacter, "Name.guessByFirstCharacter(getString(index))");
        return guessByFirstCharacter;
    }
}
