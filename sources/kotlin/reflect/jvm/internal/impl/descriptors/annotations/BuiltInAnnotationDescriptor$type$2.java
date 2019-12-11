package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: BuiltInAnnotationDescriptor.kt */
final class BuiltInAnnotationDescriptor$type$2 extends C12881k implements Function0<SimpleType> {
    final /* synthetic */ BuiltInAnnotationDescriptor this$0;

    BuiltInAnnotationDescriptor$type$2(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        this.this$0 = builtInAnnotationDescriptor;
        super(0);
    }

    public final SimpleType invoke() {
        ClassDescriptor builtInClassByFqName = this.this$0.builtIns.getBuiltInClassByFqName(this.this$0.getFqName());
        C12880j.m40222a((Object) builtInClassByFqName, "builtIns.getBuiltInClassByFqName(fqName)");
        return builtInClassByFqName.getDefaultType();
    }
}
