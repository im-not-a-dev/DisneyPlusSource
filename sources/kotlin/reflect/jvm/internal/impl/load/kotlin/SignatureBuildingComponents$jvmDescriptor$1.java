package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: methodSignatureBuilding.kt */
final class SignatureBuildingComponents$jvmDescriptor$1 extends C12881k implements Function1<String, String> {
    public static final SignatureBuildingComponents$jvmDescriptor$1 INSTANCE = new SignatureBuildingComponents$jvmDescriptor$1();

    SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    public final String invoke(String str) {
        return SignatureBuildingComponents.INSTANCE.escapeClassName(str);
    }
}
