package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;

/* compiled from: modifierChecks.kt */
public abstract class ReturnsCheck implements Check {
    private final String description;
    private final String name;
    private final Function1<KotlinBuiltIns, KotlinType> type;

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", C131361.INSTANCE, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        private ReturnsInt() {
            super("Int", C131371.INSTANCE, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", C131381.INSTANCE, null);
        }
    }

    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.name = str;
        this.type = function1;
        StringBuilder sb = new StringBuilder();
        sb.append("must return ");
        sb.append(this.name);
        this.description = sb.toString();
    }

    public boolean check(FunctionDescriptor functionDescriptor) {
        return C12880j.m40224a((Object) functionDescriptor.getReturnType(), (Object) (KotlinType) this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    public String getDescription() {
        return this.description;
    }

    public String invoke(FunctionDescriptor functionDescriptor) {
        return DefaultImpls.invoke(this, functionDescriptor);
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }
}
