package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

public class JavaVisibilities {
    public static final Visibility PACKAGE_VISIBILITY = new Visibility("package", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 5) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        objArr[0] = "classDescriptor";
                    } else if (i != 5) {
                        objArr[0] = "what";
                    }
                }
                objArr[0] = str2;
            } else {
                objArr[0] = "visibility";
            }
            String str3 = "effectiveVisibility";
            if (i == 3) {
                objArr[1] = "normalize";
            } else if (i != 5) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                if (i == 4) {
                    objArr[2] = str3;
                } else if (i != 5) {
                    objArr[2] = "isVisible";
                }
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        public Integer compareTo(Visibility visibility) {
            if (visibility == null) {
                $$$reportNull$$$0(2);
            }
            if (this == visibility) {
                return Integer.valueOf(0);
            }
            if (Visibilities.isPrivate(visibility)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        public String getDisplayName() {
            return "public/*package*/";
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return JavaVisibilities.areInSamePackage(declarationDescriptorWithVisibility, declarationDescriptor);
        }

        public Visibility normalize() {
            Visibility visibility = Visibilities.PROTECTED;
            if (visibility == null) {
                $$$reportNull$$$0(3);
            }
            return visibility;
        }
    };
    public static final Visibility PROTECTED_AND_PACKAGE = new Visibility("protected_and_package", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "visibility";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = str2;
            }
            if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "normalize";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* access modifiers changed from: protected */
        public Integer compareTo(Visibility visibility) {
            if (visibility == null) {
                $$$reportNull$$$0(2);
            }
            if (this == visibility) {
                return Integer.valueOf(0);
            }
            if (visibility == Visibilities.INTERNAL) {
                return null;
            }
            if (Visibilities.isPrivate(visibility)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        public String getDisplayName() {
            return "protected/*protected and package*/";
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return JavaVisibilities.isVisibleForProtectedAndPackage(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }

        public Visibility normalize() {
            Visibility visibility = Visibilities.PROTECTED;
            if (visibility == null) {
                $$$reportNull$$$0(3);
            }
            return visibility;
        }
    };
    public static final Visibility PROTECTED_STATIC_VISIBILITY = new Visibility("protected_static", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                objArr[0] = "what";
            } else {
                objArr[0] = str2;
            }
            if (i != 2) {
                objArr[1] = str2;
            } else {
                objArr[1] = "normalize";
            }
            if (i != 2) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String getDisplayName() {
            return "protected/*protected static*/";
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return JavaVisibilities.isVisibleForProtectedAndPackage(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }

        public Visibility normalize() {
            Visibility visibility = Visibilities.PROTECTED;
            if (visibility == null) {
                $$$reportNull$$$0(2);
            }
            return visibility;
        }
    };

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* access modifiers changed from: private */
    public static boolean areInSamePackage(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Class<PackageFragmentDescriptor> cls = PackageFragmentDescriptor.class;
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, cls, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor2, cls, false);
        if (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean isVisibleForProtectedAndPackage(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (areInSamePackage(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return Visibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
    }
}
