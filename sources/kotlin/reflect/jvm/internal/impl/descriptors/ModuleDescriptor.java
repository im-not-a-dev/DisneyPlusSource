package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: ModuleDescriptor.kt */
public interface ModuleDescriptor extends DeclarationDescriptor {

    /* compiled from: ModuleDescriptor.kt */
    public static final class DefaultImpls {
        public static <R, D> R accept(ModuleDescriptor moduleDescriptor, DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            return declarationDescriptorVisitor.visitModuleDeclaration(moduleDescriptor, d);
        }

        public static DeclarationDescriptor getContainingDeclaration(ModuleDescriptor moduleDescriptor) {
            return null;
        }
    }

    KotlinBuiltIns getBuiltIns();

    PackageViewDescriptor getPackage(FqName fqName);

    Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1);

    boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor);
}
