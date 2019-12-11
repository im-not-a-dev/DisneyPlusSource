package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.C12894x;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;

/* compiled from: JvmBuiltInsSettings.kt */
public final class JvmBuiltInsSettings$getJdkMethodStatus$2 extends AbstractNodeHandler<ClassDescriptor, JDKMemberStatus> {
    final /* synthetic */ String $jvmDescriptor;
    final /* synthetic */ C12894x $result;

    JvmBuiltInsSettings$getJdkMethodStatus$2(String str, C12894x xVar) {
        this.$jvmDescriptor = str;
        this.$result = xVar;
    }

    public boolean beforeChildren(ClassDescriptor classDescriptor) {
        String signature = SignatureBuildingComponents.INSTANCE.signature(classDescriptor, this.$jvmDescriptor);
        if (JvmBuiltInsSettings.Companion.getBLACK_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.f29534c = JDKMemberStatus.BLACK_LIST;
        } else if (JvmBuiltInsSettings.Companion.getWHITE_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.f29534c = JDKMemberStatus.WHITE_LIST;
        } else if (JvmBuiltInsSettings.Companion.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.f29534c = JDKMemberStatus.DROP;
        }
        return ((JDKMemberStatus) this.$result.f29534c) == null;
    }

    public JDKMemberStatus result() {
        JDKMemberStatus jDKMemberStatus = (JDKMemberStatus) this.$result.f29534c;
        return jDKMemberStatus != null ? jDKMemberStatus : JDKMemberStatus.NOT_CONSIDERED;
    }
}
