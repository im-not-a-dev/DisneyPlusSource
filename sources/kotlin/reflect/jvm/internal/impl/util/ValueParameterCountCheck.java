package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;

/* compiled from: modifierChecks.kt */
public abstract class ValueParameterCountCheck implements Check {
    private final String description;

    /* compiled from: modifierChecks.kt */
    public static final class AtLeast extends ValueParameterCountCheck {

        /* renamed from: n */
        private final int f29584n;

        public AtLeast(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.f29584n = i;
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return functionDescriptor.getValueParameters().size() >= this.f29584n;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class Equals extends ValueParameterCountCheck {

        /* renamed from: n */
        private final int f29585n;

        public Equals(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have exactly ");
            sb.append(i);
            sb.append(" value parameters");
            super(sb.toString(), null);
            this.f29585n = i;
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return functionDescriptor.getValueParameters().size() == this.f29585n;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        public boolean check(FunctionDescriptor functionDescriptor) {
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    private ValueParameterCountCheck(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String invoke(FunctionDescriptor functionDescriptor) {
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
