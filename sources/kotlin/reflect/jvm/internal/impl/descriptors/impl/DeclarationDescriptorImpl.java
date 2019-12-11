package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {
    private final Name name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = str2;
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        String str3 = "toString";
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = str3;
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public DeclarationDescriptorImpl(Annotations annotations, Name name2) {
        if (annotations == null) {
            $$$reportNull$$$0(0);
        }
        if (name2 == null) {
            $$$reportNull$$$0(1);
        }
        super(annotations);
        this.name = name2;
    }

    public Name getName() {
        Name name2 = this.name;
        if (name2 == null) {
            $$$reportNull$$$0(2);
        }
        return name2;
    }

    public DeclarationDescriptor getOriginal() {
        return this;
    }

    public String toString() {
        return toString(this);
    }

    public static String toString(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(DescriptorRenderer.DEBUG_TEXT.render(declarationDescriptor));
            sb.append("[");
            sb.append(declarationDescriptor.getClass().getSimpleName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(declarationDescriptor)));
            sb.append("]");
            String sb2 = sb.toString();
            if (sb2 == null) {
                $$$reportNull$$$0(5);
            }
            return sb2;
        } catch (Throwable unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(declarationDescriptor.getClass().getSimpleName());
            sb3.append(" ");
            sb3.append(declarationDescriptor.getName());
            String sb4 = sb3.toString();
            if (sb4 == null) {
                $$$reportNull$$$0(6);
            }
            return sb4;
        }
    }
}
