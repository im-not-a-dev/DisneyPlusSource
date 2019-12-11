package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* compiled from: LazyJavaClassDescriptor.kt */
final class LazyJavaClassDescriptor$declaredParameters$1 extends C12881k implements Function0<List<? extends TypeParameterDescriptor>> {
    final /* synthetic */ LazyJavaClassDescriptor this$0;

    LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.this$0 = lazyJavaClassDescriptor;
        super(0);
    }

    public final List<TypeParameterDescriptor> invoke() {
        List<JavaTypeParameter> typeParameters = this.this$0.getJClass().getTypeParameters();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter = this.this$0.f29557c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
            if (resolveTypeParameter != null) {
                arrayList.add(resolveTypeParameter);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Parameter ");
                sb.append(javaTypeParameter);
                sb.append(" surely belongs to class ");
                sb.append(this.this$0.getJClass());
                sb.append(", so it must be resolved");
                throw new AssertionError(sb.toString());
            }
        }
        return arrayList;
    }
}
