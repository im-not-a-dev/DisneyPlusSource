package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class TransientReceiver extends AbstractReceiverValue {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public TransientReceiver(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
        this(kotlinType, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Transient} : ");
        sb.append(getType());
        return sb.toString();
    }

    private TransientReceiver(KotlinType kotlinType, ReceiverValue receiverValue) {
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        super(kotlinType, receiverValue);
    }
}
