package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;

/* compiled from: ContractDeserializer.kt */
public interface ContractDeserializer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ContractDeserializer.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContractDeserializer DEFAULT = new ContractDeserializer$Companion$DEFAULT$1();

        private Companion() {
        }

        public final ContractDeserializer getDEFAULT() {
            return DEFAULT;
        }
    }

    Pair<UserDataKey<?>, Object> deserializeContractFromFunction(Function function, FunctionDescriptor functionDescriptor, TypeTable typeTable, TypeDeserializer typeDeserializer);
}
