package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    private JavaFlexibleTypeDeserializer() {
    }

    public KotlinType create(Type type, String str, SimpleType simpleType, SimpleType simpleType2) {
        if (!C12880j.m40224a((Object) str, (Object) "kotlin.jvm.PlatformType")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error java flexible type with id: ");
            sb.append(str);
            sb.append(". (");
            sb.append(simpleType);
            sb.append("..");
            sb.append(simpleType2);
            sb.append(')');
            SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
            C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return createErrorType;
        } else if (type.hasExtension(JvmProtoBuf.isRaw)) {
            return new RawTypeImpl(simpleType, simpleType2);
        } else {
            return KotlinTypeFactory.flexibleType(simpleType, simpleType2);
        }
    }
}
