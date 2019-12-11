package kotlin.reflect.jvm.internal.components;

import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "()V", "reportCannotInferVisibility", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "reportIncompleteHierarchy", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "unresolvedSuperClasses", "", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RuntimeErrorReporter.kt */
public final class RuntimeErrorReporter implements ErrorReporter {
    public static final RuntimeErrorReporter INSTANCE = new RuntimeErrorReporter();

    private RuntimeErrorReporter() {
    }

    public void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot infer visibility for ");
        sb.append(callableMemberDescriptor);
        throw new IllegalStateException(sb.toString());
    }

    public void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Incomplete hierarchy for class ");
        sb.append(classDescriptor.getName());
        sb.append(", unresolved classes ");
        sb.append(list);
        throw new IllegalStateException(sb.toString());
    }
}
