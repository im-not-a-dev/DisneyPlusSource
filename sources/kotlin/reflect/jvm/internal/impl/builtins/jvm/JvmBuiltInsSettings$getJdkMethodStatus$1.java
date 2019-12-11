package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$getJdkMethodStatus$1<N> implements Neighbors<N> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$getJdkMethodStatus$1(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
    }

    public final List<LazyJavaClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        C12880j.m40222a((Object) classDescriptor, "it");
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "it.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (KotlinType constructor : supertypes) {
            ClassifierDescriptor declarationDescriptor = constructor.getConstructor().getDeclarationDescriptor();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            ClassifierDescriptor original = declarationDescriptor != null ? declarationDescriptor.getOriginal() : null;
            if (!(original instanceof ClassDescriptor)) {
                original = null;
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) original;
            if (classDescriptor2 != null) {
                lazyJavaClassDescriptor = this.this$0.getJavaAnalogue(classDescriptor2);
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }
}
