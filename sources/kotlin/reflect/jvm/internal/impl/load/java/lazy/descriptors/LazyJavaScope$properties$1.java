package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$properties$1 extends C12881k implements Function1<Name, List<? extends PropertyDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(1);
    }

    public final List<PropertyDescriptor> invoke(Name name) {
        ArrayList arrayList = new ArrayList();
        JavaField findFieldByName = ((DeclaredMemberIndex) this.this$0.getDeclaredMemberIndex().invoke()).findFieldByName(name);
        if (findFieldByName != null && !findFieldByName.isEnumEntry()) {
            arrayList.add(this.this$0.resolveProperty(findFieldByName));
        }
        this.this$0.computeNonDeclaredProperties(name, arrayList);
        if (DescriptorUtils.isAnnotationClass(this.this$0.getOwnerDescriptor())) {
            return C13199w.m40606q(arrayList);
        }
        return C13199w.m40606q(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), arrayList));
    }
}
