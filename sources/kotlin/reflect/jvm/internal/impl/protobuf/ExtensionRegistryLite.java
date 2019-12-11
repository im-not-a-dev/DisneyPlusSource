package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;

public class ExtensionRegistryLite {
    private static final ExtensionRegistryLite EMPTY = new ExtensionRegistryLite(true);
    private static volatile boolean eagerlyParseMessageSets = false;
    private final Map<ObjectIntPair, GeneratedExtension<?, ?>> extensionsByNumber;

    private static final class ObjectIntPair {
        private final int number;
        private final Object object;

        ObjectIntPair(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            if (this.object == objectIntPair.object && this.number == objectIntPair.number) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return EMPTY;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedExtension) this.extensionsByNumber.get(new ObjectIntPair(containingtype, i));
    }

    private ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }
}
