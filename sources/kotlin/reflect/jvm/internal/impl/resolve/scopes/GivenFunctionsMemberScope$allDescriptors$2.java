package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: GivenFunctionsMemberScope.kt */
final class GivenFunctionsMemberScope$allDescriptors$2 extends C12881k implements Function0<List<? extends DeclarationDescriptor>> {
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.this$0 = givenFunctionsMemberScope;
        super(0);
    }

    public final List<DeclarationDescriptor> invoke() {
        List computeDeclaredFunctions = this.this$0.computeDeclaredFunctions();
        return C13199w.m40583d((Collection) computeDeclaredFunctions, (Iterable) this.this$0.createFakeOverrides(computeDeclaredFunctions));
    }
}
