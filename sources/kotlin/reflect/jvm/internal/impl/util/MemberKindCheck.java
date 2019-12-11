package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;

/* compiled from: modifierChecks.kt */
public abstract class MemberKindCheck implements Check {
    private final String description;

    /* compiled from: modifierChecks.kt */
    public static final class Member extends MemberKindCheck {
        public static final Member INSTANCE = new Member();

        private Member() {
            super("must be a member function", null);
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class MemberOrExtension extends MemberKindCheck {
        public static final MemberOrExtension INSTANCE = new MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    private MemberKindCheck(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String invoke(FunctionDescriptor functionDescriptor) {
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    public /* synthetic */ MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
