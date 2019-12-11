package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public class Visibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER = new ReceiverValue() {
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    public static final Visibility DEFAULT_VISIBILITY = PUBLIC;
    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED = new ReceiverValue() {
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    public static final Visibility INHERITED = new Visibility("inherited", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    };
    public static final Visibility INTERNAL = new Visibility("internal", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            if (!DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                return false;
            }
            return Visibilities.MODULE_VISIBILITY_HELPER.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    };
    public static final Visibility INVISIBLE_FAKE = new Visibility("invisible_fake", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return false;
        }
    };
    public static final Set<Visibility> INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(C13188p0.m40533b(PRIVATE, PRIVATE_TO_THIS, INTERNAL, LOCAL));
    /* access modifiers changed from: private */
    public static final ReceiverValue IRRELEVANT_RECEIVER = new ReceiverValue() {
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    public static final Visibility LOCAL = new Visibility("local", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    };
    /* access modifiers changed from: private */
    public static final ModuleVisibilityHelper MODULE_VISIBILITY_HELPER;
    private static final Map<Visibility, Integer> ORDERED_VISIBILITIES;
    public static final Visibility PRIVATE = new Visibility("private", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean hasContainingSourceFile(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(0);
            }
            return DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, code=kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, for r5v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r4, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r5, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6) {
            /*
                r3 = this;
                r4 = 1
                if (r5 != 0) goto L_0x0006
                $$$reportNull$$$0(r4)
            L_0x0006:
                if (r6 != 0) goto L_0x000c
                r0 = 2
                $$$reportNull$$$0(r0)
            L_0x000c:
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(r5)
                if (r0 == 0) goto L_0x001d
                boolean r0 = r3.hasContainingSourceFile(r6)
                if (r0 == 0) goto L_0x001d
                boolean r4 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.inSameFile(r5, r6)
                return r4
            L_0x001d:
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                if (r0 == 0) goto L_0x0049
                r0 = r5
                kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) r0
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = r0.getContainingDeclaration()
                boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSealedClass(r0)
                if (r1 == 0) goto L_0x0049
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(r0)
                if (r0 == 0) goto L_0x0049
                boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                if (r0 == 0) goto L_0x0049
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r6.getContainingDeclaration()
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(r0)
                if (r0 == 0) goto L_0x0049
                boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.inSameFile(r5, r6)
                if (r0 == 0) goto L_0x0049
                return r4
            L_0x0049:
                if (r5 == 0) goto L_0x005d
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r5 = r5.getContainingDeclaration()
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r0 == 0) goto L_0x0059
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(r5)
                if (r0 == 0) goto L_0x005d
            L_0x0059:
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
                if (r0 == 0) goto L_0x0049
            L_0x005d:
                r0 = 0
                if (r5 != 0) goto L_0x0061
                return r0
            L_0x0061:
                if (r6 == 0) goto L_0x0090
                if (r5 != r6) goto L_0x0066
                return r4
            L_0x0066:
                boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
                if (r1 == 0) goto L_0x008b
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
                if (r1 == 0) goto L_0x0089
                r1 = r5
                kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r1
                kotlin.reflect.jvm.internal.impl.name.FqName r1 = r1.getFqName()
                r2 = r6
                kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r2
                kotlin.reflect.jvm.internal.impl.name.FqName r2 = r2.getFqName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0089
                boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.areInSameModule(r6, r5)
                if (r5 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r4 = 0
            L_0x008a:
                return r4
            L_0x008b:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6 = r6.getContainingDeclaration()
                goto L_0x0061
            L_0x0090:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.C129361.isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):boolean");
        }
    };
    public static final Visibility PRIVATE_TO_THIS = new Visibility("private_to_this", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public String getDisplayName() {
            return "private/*private to this*/";
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            if (Visibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                if (receiverValue == Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue == Visibilities.IRRELEVANT_RECEIVER) {
                    return false;
                }
                DeclarationDescriptor parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
                if (parentOfType != null && (receiverValue instanceof ThisClassReceiver)) {
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                }
            }
            return false;
        }
    };
    public static final Visibility PROTECTED = new Visibility("protected", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean doesReceiverFitForProtectedVisibility(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, ClassDescriptor classDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(2);
            }
            if (classDescriptor == null) {
                $$$reportNull$$$0(3);
            }
            boolean z = false;
            if (receiverValue == Visibilities.FALSE_IF_PROTECTED) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                return true;
            }
            if (!(receiverValue == Visibilities.IRRELEVANT_RECEIVER || receiverValue == null)) {
                KotlinType thisType = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
                if (DescriptorUtils.isSubtypeOfClass(thisType, classDescriptor) || DynamicTypesKt.isDynamic(thisType)) {
                    z = true;
                }
            }
            return z;
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            Class<ClassDescriptor> cls = ClassDescriptor.class;
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, cls);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, cls, false);
            if (classDescriptor2 == null) {
                return false;
            }
            if (classDescriptor != null && DescriptorUtils.isCompanionObject(classDescriptor)) {
                ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor, cls);
                if (classDescriptor3 != null && DescriptorUtils.isSubclass(classDescriptor2, classDescriptor3)) {
                    return true;
                }
            }
            DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, cls);
            if (classDescriptor4 == null) {
                return false;
            }
            if (!DescriptorUtils.isSubclass(classDescriptor2, classDescriptor4) || !doesReceiverFitForProtectedVisibility(receiverValue, unwrapFakeOverrideToAnyDeclaration, classDescriptor2)) {
                return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor2.getContainingDeclaration());
            }
            return true;
        }
    };
    public static final Visibility PUBLIC = new Visibility("public", true) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return true;
        }
    };
    public static final Visibility UNKNOWN = new Visibility("unknown", false) {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return false;
        }
    };

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        Class<ModuleVisibilityHelper> cls = ModuleVisibilityHelper.class;
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(1);
        HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(PRIVATE_TO_THIS, valueOf);
        newHashMapWithExpectedSize.put(PRIVATE, valueOf);
        newHashMapWithExpectedSize.put(INTERNAL, valueOf2);
        newHashMapWithExpectedSize.put(PROTECTED, valueOf2);
        newHashMapWithExpectedSize.put(PUBLIC, Integer.valueOf(2));
        ORDERED_VISIBILITIES = Collections.unmodifiableMap(newHashMapWithExpectedSize);
        Iterator it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        MODULE_VISIBILITY_HELPER = it.hasNext() ? (ModuleVisibilityHelper) it.next() : EMPTY.INSTANCE;
    }

    public static Integer compare(Visibility visibility, Visibility visibility2) {
        if (visibility == null) {
            $$$reportNull$$$0(12);
        }
        if (visibility2 == null) {
            $$$reportNull$$$0(13);
        }
        Integer compareTo = visibility.compareTo(visibility2);
        if (compareTo != null) {
            return compareTo;
        }
        Integer compareTo2 = visibility2.compareTo(visibility);
        if (compareTo2 != null) {
            return Integer.valueOf(-compareTo2.intValue());
        }
        return null;
    }

    static Integer compareLocal(Visibility visibility, Visibility visibility2) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (visibility2 == null) {
            $$$reportNull$$$0(11);
        }
        if (visibility == visibility2) {
            return Integer.valueOf(0);
        }
        Integer num = (Integer) ORDERED_VISIBILITIES.get(visibility);
        Integer num2 = (Integer) ORDERED_VISIBILITIES.get(visibility2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(8);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal();
        while (declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor)) {
                return declarationDescriptorWithVisibility2;
            }
            declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class);
        }
        if (declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) {
            DeclarationDescriptorWithVisibility findInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor);
            if (findInvisibleMember != null) {
                return findInvisibleMember;
            }
        }
        return null;
    }

    public static boolean inSameFile(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(7);
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(Visibility visibility) {
        if (visibility == null) {
            $$$reportNull$$$0(14);
        }
        return visibility == PRIVATE || visibility == PRIVATE_TO_THIS;
    }

    public static boolean isVisibleIgnoringReceiver(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(2);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor) == null;
    }
}
