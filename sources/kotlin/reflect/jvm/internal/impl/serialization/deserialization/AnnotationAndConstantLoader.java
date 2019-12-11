package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: AnnotationAndConstantLoader.kt */
public interface AnnotationAndConstantLoader<A, C> {
    List<A> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    List<A> loadClassAnnotations(Class classR);

    List<A> loadEnumEntryAnnotations(ProtoContainer protoContainer, EnumEntry enumEntry);

    List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    List<A> loadPropertyBackingFieldAnnotations(ProtoContainer protoContainer, Property property);

    C loadPropertyConstant(ProtoContainer protoContainer, Property property, KotlinType kotlinType);

    List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer protoContainer, Property property);

    List<A> loadTypeAnnotations(Type type, NameResolver nameResolver);

    List<A> loadTypeParameterAnnotations(TypeParameter typeParameter, NameResolver nameResolver);

    List<A> loadValueParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ValueParameter valueParameter);
}
