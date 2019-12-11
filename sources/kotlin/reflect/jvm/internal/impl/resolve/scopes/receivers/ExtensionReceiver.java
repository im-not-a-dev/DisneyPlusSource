package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class ExtensionReceiver extends AbstractReceiverValue implements ImplicitReceiver {
    private final CallableDescriptor descriptor;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = str2;
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public ExtensionReceiver(CallableDescriptor callableDescriptor, KotlinType kotlinType, ReceiverValue receiverValue) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        super(kotlinType, receiverValue);
        this.descriptor = callableDescriptor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getType());
        sb.append(": Ext {");
        sb.append(this.descriptor);
        sb.append("}");
        return sb.toString();
    }
}
