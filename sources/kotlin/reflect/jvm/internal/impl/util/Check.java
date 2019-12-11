package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* compiled from: modifierChecks.kt */
public interface Check {

    /* compiled from: modifierChecks.kt */
    public static final class DefaultImpls {
        public static String invoke(Check check, FunctionDescriptor functionDescriptor) {
            if (!check.check(functionDescriptor)) {
                return check.getDescription();
            }
            return null;
        }
    }

    boolean check(FunctionDescriptor functionDescriptor);

    String getDescription();

    String invoke(FunctionDescriptor functionDescriptor);
}
