package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C13145v;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public abstract class ErrorValue extends ConstantValue<C13145v> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: constantValues.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ErrorValue create(String str) {
            return new ErrorValueWithMessage(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: constantValues.kt */
    public static final class ErrorValueWithMessage extends ErrorValue {
        private final String message;

        public ErrorValueWithMessage(String str) {
            this.message = str;
        }

        public String toString() {
            return this.message;
        }

        public SimpleType getType(ModuleDescriptor moduleDescriptor) {
            SimpleType createErrorType = ErrorUtils.createErrorType(this.message);
            C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorType(message)");
            return createErrorType;
        }
    }

    public ErrorValue() {
        super(C13145v.f29587a);
    }

    public C13145v getValue() {
        throw new UnsupportedOperationException();
    }
}
