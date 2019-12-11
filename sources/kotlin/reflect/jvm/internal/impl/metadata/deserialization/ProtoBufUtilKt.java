package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;

/* compiled from: ProtoBufUtil.kt */
public final class ProtoBufUtilKt {
    public static final <M extends ExtendableMessage<M>, T> T getExtensionOrNull(ExtendableMessage<M> extendableMessage, GeneratedExtension<M, T> generatedExtension) {
        if (extendableMessage.hasExtension(generatedExtension)) {
            return extendableMessage.getExtension(generatedExtension);
        }
        return null;
    }

    public static final <M extends ExtendableMessage<M>, T> T getExtensionOrNull(ExtendableMessage<M> extendableMessage, GeneratedExtension<M, List<T>> generatedExtension, int i) {
        if (i < extendableMessage.getExtensionCount(generatedExtension)) {
            return extendableMessage.getExtension(generatedExtension, i);
        }
        return null;
    }
}
