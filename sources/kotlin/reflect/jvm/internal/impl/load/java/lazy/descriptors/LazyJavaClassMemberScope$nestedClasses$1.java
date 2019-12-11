package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$nestedClasses$1 extends C12881k implements Function1<Name, ClassDescriptorBase> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f29559$c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaClassMemberScope;
        this.f29559$c = lazyJavaResolverContext;
        super(1);
    }

    public final ClassDescriptorBase invoke(Name name) {
        Name name2 = name;
        if (!((Set) this.this$0.nestedClassIndex.invoke()).contains(name2)) {
            JavaField javaField = (JavaField) ((Map) this.this$0.enumEntryIndex.invoke()).get(name2);
            if (javaField == null) {
                return null;
            }
            NotNullLazyValue createLazyValue = this.f29559$c.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this));
            return EnumEntrySyntheticClassDescriptor.create(this.f29559$c.getStorageManager(), this.this$0.getOwnerDescriptor(), name, createLazyValue, LazyJavaAnnotationsKt.resolveAnnotations(this.f29559$c, javaField), this.f29559$c.getComponents().getSourceElementFactory().source(javaField));
        }
        JavaClassFinder finder = this.f29559$c.getComponents().getFinder();
        ClassId classId = DescriptorUtilsKt.getClassId(this.this$0.getOwnerDescriptor());
        if (classId != null) {
            ClassId createNestedClassId = classId.createNestedClassId(name2);
            C12880j.m40222a((Object) createNestedClassId, "ownerDescriptor.classId!…createNestedClassId(name)");
            Request request = new Request(createNestedClassId, null, this.this$0.jClass, 2, null);
            JavaClass findClass = finder.findClass(request);
            if (findClass == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f29559$c, this.this$0.getOwnerDescriptor(), findClass, null, 8, null);
            this.f29559$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        C12880j.m40220a();
        throw null;
    }
}
