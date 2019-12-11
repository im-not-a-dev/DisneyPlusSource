package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends C12881k implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.this$0 = lazyJavaAnnotationDescriptor;
        super(0);
    }

    public final Map<Name, ConstantValue<?>> invoke() {
        Collection<JavaAnnotationArgument> arguments = this.this$0.javaAnnotation.getArguments();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue access$resolveAnnotationArgument = this.this$0.resolveAnnotationArgument(javaAnnotationArgument);
            Pair a = access$resolveAnnotationArgument != null ? C12907r.m40244a(name, access$resolveAnnotationArgument) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }
}
