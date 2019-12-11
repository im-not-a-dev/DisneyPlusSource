package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: javaElements.kt */
public interface JavaPackage extends JavaAnnotationOwner, JavaElement {
    Collection<JavaClass> getClasses(Function1<? super Name, Boolean> function1);

    FqName getFqName();

    Collection<JavaPackage> getSubPackages();
}
