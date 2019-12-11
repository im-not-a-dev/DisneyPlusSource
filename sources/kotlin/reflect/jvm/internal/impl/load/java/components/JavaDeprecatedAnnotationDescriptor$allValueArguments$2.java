package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C12907r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends C12881k implements Function0<Map<Name, ? extends StringValue>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 INSTANCE = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    public final Map<Name, StringValue> invoke() {
        return C13170i0.m40332a(C12907r.m40244a(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }
}
