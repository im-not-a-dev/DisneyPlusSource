package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: modifierChecks.kt */
public abstract class CheckResult {
    private final boolean isSuccess;

    /* compiled from: modifierChecks.kt */
    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class IllegalSignature extends CheckResult {
        private final String error;

        public IllegalSignature(String str) {
            super(false, null);
            this.error = str;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    private CheckResult(boolean z) {
        this.isSuccess = z;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public /* synthetic */ CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
