package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C12907r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends C12881k implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        this.this$0 = javaTargetAnnotationDescriptor;
        super(0);
    }

    public final Map<Name, ConstantValue<?>> invoke() {
        JavaAnnotationArgument firstArgument = this.this$0.getFirstArgument();
        Map<Name, ConstantValue<?>> map = null;
        Object obj = firstArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) this.this$0.getFirstArgument()).getElements()) : firstArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(C13183n.m40498a(this.this$0.getFirstArgument())) : null;
        if (obj != null) {
            map = C13170i0.m40332a(C12907r.m40244a(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), obj));
        }
        return map != null ? map : C13173j0.m40350a();
    }
}
