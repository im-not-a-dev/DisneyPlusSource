package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* compiled from: ClassifierNamePolicy.kt */
public interface ClassifierNamePolicy {

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {
        public static final FULLY_QUALIFIED INSTANCE = new FULLY_QUALIFIED();

        private FULLY_QUALIFIED() {
        }

        public String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                C12880j.m40222a((Object) name, "classifier.name");
                return descriptorRenderer.renderName(name, false);
            }
            FqNameUnsafe fqName = DescriptorUtils.getFqName(classifierDescriptor);
            C12880j.m40222a((Object) fqName, "DescriptorUtils.getFqName(classifier)");
            return descriptorRenderer.renderFqName(fqName);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class SHORT implements ClassifierNamePolicy {
        public static final SHORT INSTANCE = new SHORT();

        private SHORT() {
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, code=kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, for r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer r3) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                if (r0 == 0) goto L_0x0015
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
                kotlin.reflect.jvm.internal.impl.name.Name r2 = r2.getName()
                java.lang.String r0 = "classifier.name"
                kotlin.jvm.internal.C12880j.m40222a(r2, r0)
                r0 = 0
                java.lang.String r2 = r3.renderName(r2, r0)
                return r2
            L_0x0015:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x001a:
                kotlin.reflect.jvm.internal.impl.name.Name r0 = r2.getName()
                r3.add(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.getContainingDeclaration()
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r0 != 0) goto L_0x001a
                java.util.List r2 = kotlin.p590y.C13197u.m40553d(r3)
                java.lang.String r2 = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFqName(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer):java.lang.String");
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {
        public static final SOURCE_CODE_QUALIFIED INSTANCE = new SOURCE_CODE_QUALIFIED();

        private SOURCE_CODE_QUALIFIED() {
        }

        private final String qualifiedNameForSourceCode(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            C12880j.m40222a((Object) name, "descriptor.name");
            String render = RenderingUtilsKt.render(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return render;
            }
            DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
            C12880j.m40222a((Object) containingDeclaration, "descriptor.containingDeclaration");
            String qualifierName = qualifierName(containingDeclaration);
            if (qualifierName != null && (!C12880j.m40224a((Object) qualifierName, (Object) ""))) {
                StringBuilder sb = new StringBuilder();
                sb.append(qualifierName);
                sb.append(".");
                sb.append(render);
                render = sb.toString();
            }
            return render;
        }

        private final String qualifierName(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                return qualifiedNameForSourceCode((ClassifierDescriptor) declarationDescriptor);
            }
            if (!(declarationDescriptor instanceof PackageFragmentDescriptor)) {
                return null;
            }
            FqNameUnsafe unsafe = ((PackageFragmentDescriptor) declarationDescriptor).getFqName().toUnsafe();
            C12880j.m40222a((Object) unsafe, "descriptor.fqName.toUnsafe()");
            return RenderingUtilsKt.render(unsafe);
        }

        public String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer) {
            return qualifiedNameForSourceCode(classifierDescriptor);
        }
    }

    String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer);
}
