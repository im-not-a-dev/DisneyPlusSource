package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public abstract class KotlinBuiltIns {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("annotation"));
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME = FqName.topLevel(BUILT_INS_PACKAGE_NAME);
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES = C13188p0.m40533b(BUILT_INS_PACKAGE_FQ_NAME, COLLECTIONS_PACKAGE_FQ_NAME, RANGES_PACKAGE_FQ_NAME, ANNOTATION_PACKAGE_FQ_NAME, ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("internal")), DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE);
    public static final Name BUILT_INS_PACKAGE_NAME = Name.identifier("kotlin");
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("collections"));
    public static final FqNames FQ_NAMES = new FqNames();
    public static final FqName RANGES_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("ranges"));
    public static final FqName TEXT_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("text"));
    private final MemoizedFunctionToNotNull<Name, ClassDescriptor> builtInClassesByName;
    private final NotNullLazyValue<Collection<PackageViewDescriptor>> builtInPackagesImportedByDefault;
    /* access modifiers changed from: private */
    public ModuleDescriptorImpl builtInsModule;
    private final NotNullLazyValue<Primitives> primitives;
    private final StorageManager storageManager;

    public static class FqNames {
        public final FqNameUnsafe _boolean = fqNameUnsafe("Boolean");
        public final FqNameUnsafe _byte = fqNameUnsafe("Byte");
        public final FqNameUnsafe _char = fqNameUnsafe("Char");
        public final FqNameUnsafe _double = fqNameUnsafe("Double");
        public final FqNameUnsafe _enum = fqNameUnsafe("Enum");
        public final FqNameUnsafe _float = fqNameUnsafe("Float");
        public final FqNameUnsafe _int = fqNameUnsafe("Int");
        public final FqNameUnsafe _long = fqNameUnsafe("Long");
        public final FqNameUnsafe _short = fqNameUnsafe("Short");
        public final FqName annotation = fqName("Annotation");
        public final FqName annotationRetention = annotationName("AnnotationRetention");
        public final FqName annotationTarget = annotationName("AnnotationTarget");
        public final FqNameUnsafe any = fqNameUnsafe("Any");
        public final FqNameUnsafe array = fqNameUnsafe("Array");
        public final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
        public final FqNameUnsafe charSequence = fqNameUnsafe("CharSequence");
        public final FqNameUnsafe cloneable = fqNameUnsafe("Cloneable");
        public final FqName collection = collectionsFqName("Collection");
        public final FqName comparable = fqName("Comparable");
        public final FqName deprecated = fqName("Deprecated");
        public final FqName deprecationLevel = fqName("DeprecationLevel");
        public final FqName extensionFunctionType = fqName("ExtensionFunctionType");
        public final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
        public final FqNameUnsafe functionSupertype = fqNameUnsafe("Function");
        public final FqNameUnsafe intRange = rangesFqName("IntRange");
        public final FqName iterable = collectionsFqName("Iterable");
        public final FqName iterator = collectionsFqName("Iterator");
        public final FqNameUnsafe kCallable = reflect("KCallable");
        public final FqNameUnsafe kClass = reflect("KClass");
        public final FqNameUnsafe kDeclarationContainer = reflect("KDeclarationContainer");
        public final FqNameUnsafe kMutableProperty0 = reflect("KMutableProperty0");
        public final FqNameUnsafe kMutableProperty1 = reflect("KMutableProperty1");
        public final FqNameUnsafe kMutableProperty2 = reflect("KMutableProperty2");
        public final FqNameUnsafe kMutablePropertyFqName = reflect("KMutableProperty");
        public final ClassId kProperty = ClassId.topLevel(this.kPropertyFqName.toSafe());
        public final FqNameUnsafe kProperty0 = reflect("KProperty0");
        public final FqNameUnsafe kProperty1 = reflect("KProperty1");
        public final FqNameUnsafe kProperty2 = reflect("KProperty2");
        public final FqNameUnsafe kPropertyFqName = reflect("KProperty");
        public final FqName list = collectionsFqName("List");
        public final FqName listIterator = collectionsFqName("ListIterator");
        public final FqNameUnsafe longRange = rangesFqName("LongRange");
        public final FqName map = collectionsFqName("Map");
        public final FqName mapEntry = this.map.child(Name.identifier("Entry"));
        public final FqName mustBeDocumented = annotationName("MustBeDocumented");
        public final FqName mutableCollection = collectionsFqName("MutableCollection");
        public final FqName mutableIterable = collectionsFqName("MutableIterable");
        public final FqName mutableIterator = collectionsFqName("MutableIterator");
        public final FqName mutableList = collectionsFqName("MutableList");
        public final FqName mutableListIterator = collectionsFqName("MutableListIterator");
        public final FqName mutableMap = collectionsFqName("MutableMap");
        public final FqName mutableMapEntry = this.mutableMap.child(Name.identifier("MutableEntry"));
        public final FqName mutableSet = collectionsFqName("MutableSet");
        public final FqNameUnsafe nothing = fqNameUnsafe("Nothing");
        public final FqNameUnsafe number = fqNameUnsafe("Number");
        public final FqName parameterName = fqName("ParameterName");
        public final Set<Name> primitiveArrayTypeShortNames = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
        public final Set<Name> primitiveTypeShortNames = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
        public final FqName publishedApi = fqName("PublishedApi");
        public final FqName repeatable = annotationName("Repeatable");
        public final FqName replaceWith = fqName("ReplaceWith");
        public final FqName retention = annotationName("Retention");
        public final FqName set = collectionsFqName("Set");
        public final FqNameUnsafe string = fqNameUnsafe("String");
        public final FqName suppress = fqName("Suppress");
        public final FqName target = annotationName("Target");
        public final FqName throwable = fqName("Throwable");
        public final ClassId uByte = ClassId.topLevel(this.uByteFqName);
        public final FqName uByteFqName = fqName("UByte");
        public final ClassId uInt = ClassId.topLevel(this.uIntFqName);
        public final FqName uIntFqName = fqName("UInt");
        public final ClassId uLong = ClassId.topLevel(this.uLongFqName);
        public final FqName uLongFqName = fqName("ULong");
        public final ClassId uShort = ClassId.topLevel(this.uShortFqName);
        public final FqName uShortFqName = fqName("UShort");
        public final FqNameUnsafe unit = fqNameUnsafe("Unit");
        public final FqName unsafeVariance = fqName("UnsafeVariance");

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) {
                objArr[0] = str2;
            } else {
                objArr[0] = "simpleName";
            }
            String str3 = "annotationName";
            String str4 = "reflect";
            String str5 = "rangesFqName";
            String str6 = "collectionsFqName";
            String str7 = "fqName";
            String str8 = "fqNameUnsafe";
            if (i2 == 1) {
                objArr[1] = str8;
            } else if (i2 == 3) {
                objArr[1] = str7;
            } else if (i2 == 5) {
                objArr[1] = str6;
            } else if (i2 == 7) {
                objArr[1] = str5;
            } else if (i2 == 9) {
                objArr[1] = str4;
            } else if (i2 != 11) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = str7;
                    break;
                case 4:
                    objArr[2] = str6;
                    break;
                case 6:
                    objArr[2] = str5;
                    break;
                case 8:
                    objArr[2] = str4;
                    break;
                case 10:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = str8;
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public FqNames() {
            PrimitiveType[] values;
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                this.primitiveTypeShortNames.add(primitiveType.getTypeName());
                this.primitiveArrayTypeShortNames.add(primitiveType.getArrayTypeName());
                this.fqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getTypeName().asString()), primitiveType);
                this.arrayClassFqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getArrayTypeName().asString()), primitiveType);
            }
        }

        private static FqName annotationName(String str) {
            if (str == null) {
                $$$reportNull$$$0(10);
            }
            FqName child = KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            if (child == null) {
                $$$reportNull$$$0(11);
            }
            return child;
        }

        private static FqName collectionsFqName(String str) {
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            FqName child = KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            if (child == null) {
                $$$reportNull$$$0(5);
            }
            return child;
        }

        private static FqName fqName(String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            FqName child = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            if (child == null) {
                $$$reportNull$$$0(3);
            }
            return child;
        }

        private static FqNameUnsafe fqNameUnsafe(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            FqNameUnsafe unsafe = fqName(str).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(1);
            }
            return unsafe;
        }

        private static FqNameUnsafe rangesFqName(String str) {
            if (str == null) {
                $$$reportNull$$$0(6);
            }
            FqNameUnsafe unsafe = KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(7);
            }
            return unsafe;
        }

        private static FqNameUnsafe reflect(String str) {
            if (str == null) {
                $$$reportNull$$$0(8);
            }
            FqNameUnsafe unsafe = ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME().child(Name.identifier(str)).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(9);
            }
            return unsafe;
        }
    }

    private static class Primitives {
        public final Map<SimpleType, SimpleType> kotlinArrayTypeToPrimitiveKotlinType;
        public final Map<KotlinType, SimpleType> primitiveKotlinTypeToKotlinArrayType;
        public final Map<PrimitiveType, SimpleType> primitiveTypeToArrayKotlinType;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private Primitives(Map<PrimitiveType, SimpleType> map, Map<KotlinType, SimpleType> map2, Map<SimpleType, SimpleType> map3) {
            if (map == null) {
                $$$reportNull$$$0(0);
            }
            if (map2 == null) {
                $$$reportNull$$$0(1);
            }
            if (map3 == null) {
                $$$reportNull$$$0(2);
            }
            this.primitiveTypeToArrayKotlinType = map;
            this.primitiveKotlinTypeToKotlinArrayType = map2;
            this.kotlinArrayTypeToPrimitiveKotlinType = map3;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
        switch (i) {
            case 1:
            case 71:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                objArr[0] = str2;
                break;
            case 8:
            case 9:
            case 76:
            case 77:
            case 85:
            case 92:
            case 99:
            case 103:
            case 104:
            case 136:
            case 137:
            case 139:
            case 147:
            case 148:
            case 149:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 94:
            case 96:
            case 98:
            case 100:
            case 102:
            case 126:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 52:
            case 84:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 93:
            case 95:
            case 101:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 138:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 151:
                objArr[0] = "type";
                break;
            case 45:
                objArr[0] = "classSimpleName";
                break;
            case 66:
                objArr[0] = "arrayType";
                break;
            case 70:
                objArr[0] = "notNullArrayType";
                break;
            case 72:
            case 152:
                objArr[0] = "primitiveType";
                break;
            case 74:
                objArr[0] = "kotlinType";
                break;
            case 75:
                objArr[0] = "arrayFqName";
                break;
            case 78:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 81:
                objArr[0] = "argument";
                break;
            case 97:
                objArr[0] = "typeConstructor";
                break;
            case 108:
                objArr[0] = "classDescriptor";
                break;
            case 150:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "getEnumType";
        String str4 = "getArrayType";
        String str5 = "getPrimitiveArrayKotlinType";
        String str6 = "getArrayElementType";
        String str7 = "getPrimitiveKotlinType";
        String str8 = "getBuiltInTypeByClassName";
        String str9 = "getBuiltInClassByName";
        String str10 = "getBuiltInClassByFqName";
        switch (i) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = str10;
                break;
            case 14:
                objArr[1] = str9;
                break;
            case 17:
                objArr[1] = "getFunctionName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKClass";
                break;
            case 20:
                objArr[1] = "getKDeclarationContainer";
                break;
            case 21:
                objArr[1] = "getKCallable";
                break;
            case 22:
                objArr[1] = "getKProperty";
                break;
            case 23:
                objArr[1] = "getKProperty0";
                break;
            case 24:
                objArr[1] = "getKProperty1";
                break;
            case 25:
                objArr[1] = "getKProperty2";
                break;
            case 26:
                objArr[1] = "getKMutableProperty0";
                break;
            case 27:
                objArr[1] = "getKMutableProperty1";
                break;
            case 28:
                objArr[1] = "getKMutableProperty2";
                break;
            case 29:
                objArr[1] = "getIterator";
                break;
            case 30:
                objArr[1] = "getIterable";
                break;
            case 31:
                objArr[1] = "getMutableIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterator";
                break;
            case 33:
                objArr[1] = "getCollection";
                break;
            case 34:
                objArr[1] = "getMutableCollection";
                break;
            case 35:
                objArr[1] = "getList";
                break;
            case 36:
                objArr[1] = "getMutableList";
                break;
            case 37:
                objArr[1] = "getSet";
                break;
            case 38:
                objArr[1] = "getMutableSet";
                break;
            case 39:
                objArr[1] = "getMap";
                break;
            case 40:
                objArr[1] = "getMutableMap";
                break;
            case 41:
                objArr[1] = "getMapEntry";
                break;
            case 42:
                objArr[1] = "getMutableMapEntry";
                break;
            case 43:
                objArr[1] = "getListIterator";
                break;
            case 44:
                objArr[1] = "getMutableListIterator";
                break;
            case 46:
                objArr[1] = str8;
                break;
            case 47:
                objArr[1] = "getNothingType";
                break;
            case 48:
                objArr[1] = "getNullableNothingType";
                break;
            case 49:
                objArr[1] = "getAnyType";
                break;
            case 50:
                objArr[1] = "getNullableAnyType";
                break;
            case 51:
                objArr[1] = "getDefaultBound";
                break;
            case 53:
                objArr[1] = str7;
                break;
            case 54:
                objArr[1] = "getNumberType";
                break;
            case 55:
                objArr[1] = "getByteType";
                break;
            case 56:
                objArr[1] = "getShortType";
                break;
            case 57:
                objArr[1] = "getIntType";
                break;
            case 58:
                objArr[1] = "getLongType";
                break;
            case 59:
                objArr[1] = "getFloatType";
                break;
            case 60:
                objArr[1] = "getDoubleType";
                break;
            case 61:
                objArr[1] = "getCharType";
                break;
            case 62:
                objArr[1] = "getBooleanType";
                break;
            case 63:
                objArr[1] = "getUnitType";
                break;
            case 64:
                objArr[1] = "getStringType";
                break;
            case 65:
                objArr[1] = "getIterableType";
                break;
            case 67:
            case 68:
            case 69:
                objArr[1] = str6;
                break;
            case 73:
                objArr[1] = str5;
                break;
            case 80:
                objArr[1] = str4;
                break;
            case 82:
                objArr[1] = str3;
                break;
            case 83:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = str10;
                break;
            case 13:
                objArr[2] = str9;
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 45:
                objArr[2] = str8;
                break;
            case 52:
                objArr[2] = str7;
                break;
            case 66:
                objArr[2] = str6;
                break;
            case 70:
            case 71:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 72:
                objArr[2] = str5;
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 75:
            case 87:
                objArr[2] = "isPrimitiveArray";
                break;
            case 76:
            case 89:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
                objArr[2] = str4;
                break;
            case 81:
                objArr[2] = str3;
                break;
            case 84:
                objArr[2] = "isArray";
                break;
            case 85:
            case 86:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 88:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 90:
                objArr[2] = "isPrimitiveType";
                break;
            case 91:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 92:
                objArr[2] = "isPrimitiveClass";
                break;
            case 93:
            case 94:
            case 95:
            case 96:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 97:
            case 98:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 99:
            case 100:
                objArr[2] = "classFqNameEquals";
                break;
            case 101:
            case 102:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 103:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 104:
            case 105:
                objArr[2] = "isAny";
                break;
            case 106:
            case 108:
                objArr[2] = "isBoolean";
                break;
            case 107:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 109:
                objArr[2] = "isNumber";
                break;
            case 110:
                objArr[2] = "isChar";
                break;
            case 111:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 112:
                objArr[2] = "isInt";
                break;
            case 113:
                objArr[2] = "isByte";
                break;
            case 114:
                objArr[2] = "isLong";
                break;
            case 115:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 116:
                objArr[2] = "isShort";
                break;
            case 117:
                objArr[2] = "isFloat";
                break;
            case 118:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 119:
                objArr[2] = "isDouble";
                break;
            case 120:
                objArr[2] = "isUByte";
                break;
            case 121:
                objArr[2] = "isUShort";
                break;
            case 122:
                objArr[2] = "isUInt";
                break;
            case 123:
                objArr[2] = "isULong";
                break;
            case 124:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 125:
            case 126:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 127:
                objArr[2] = "isNothing";
                break;
            case 128:
                objArr[2] = "isNullableNothing";
                break;
            case 129:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 130:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 131:
                objArr[2] = "isNullableAny";
                break;
            case 132:
                objArr[2] = "isDefaultBound";
                break;
            case 133:
                objArr[2] = "isUnit";
                break;
            case 134:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 135:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 136:
                objArr[2] = "isMemberOfAny";
                break;
            case 137:
            case 138:
                objArr[2] = "isEnum";
                break;
            case 139:
            case 140:
                objArr[2] = "isComparable";
                break;
            case 141:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 142:
                objArr[2] = "isListOrNullableList";
                break;
            case 143:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 144:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 145:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 146:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 147:
                objArr[2] = "isKClass";
                break;
            case 148:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 149:
                objArr[2] = "isCloneable";
                break;
            case 150:
                objArr[2] = "isDeprecated";
                break;
            case 151:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 152:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    protected KotlinBuiltIns(StorageManager storageManager2) {
        if (storageManager2 == null) {
            $$$reportNull$$$0(0);
        }
        this.storageManager = storageManager2;
        this.builtInPackagesImportedByDefault = storageManager2.createLazyValue(new Function0<Collection<PackageViewDescriptor>>() {
            public Collection<PackageViewDescriptor> invoke() {
                return Arrays.asList(new PackageViewDescriptor[]{KotlinBuiltIns.this.builtInsModule.getPackage(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.getPackage(KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.getPackage(KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.getPackage(KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME)});
            }
        });
        this.primitives = storageManager2.createLazyValue(new Function0<Primitives>() {
            public Primitives invoke() {
                PrimitiveType[] values;
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    SimpleType access$200 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getTypeName().asString());
                    SimpleType access$2002 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getArrayTypeName().asString());
                    enumMap.put(primitiveType, access$2002);
                    hashMap.put(access$200, access$2002);
                    hashMap2.put(access$2002, access$200);
                }
                return new Primitives(enumMap, hashMap, hashMap2);
            }
        });
        this.builtInClassesByName = storageManager2.createMemoizedFunction(new Function1<Name, ClassDescriptor>() {
            public ClassDescriptor invoke(Name name) {
                ClassifierDescriptor contributedClassifier = KotlinBuiltIns.this.getBuiltInsPackageScope().getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
                if (contributedClassifier == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Built-in class ");
                    sb.append(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(name));
                    sb.append(" is not found");
                    throw new AssertionError(sb.toString());
                } else if (contributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) contributedClassifier;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Must be a class descriptor ");
                    sb2.append(name);
                    sb2.append(", but was ");
                    sb2.append(contributedClassifier);
                    throw new AssertionError(sb2.toString());
                }
            }
        });
    }

    private static boolean classFqNameEquals(ClassifierDescriptor classifierDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(100);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(DescriptorUtils.getFqName(classifierDescriptor));
    }

    private ClassDescriptor getBuiltInClassByName(String str) {
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) this.builtInClassesByName.invoke(Name.identifier(str));
        if (classDescriptor == null) {
            $$$reportNull$$$0(14);
        }
        return classDescriptor;
    }

    /* access modifiers changed from: private */
    public SimpleType getBuiltInTypeByClassName(String str) {
        if (str == null) {
            $$$reportNull$$$0(45);
        }
        SimpleType defaultType = getBuiltInClassByName(str).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(46);
        }
        return defaultType;
    }

    private static KotlinType getElementTypeForUnsignedArray(KotlinType kotlinType, ModuleDescriptor moduleDescriptor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(70);
        }
        if (moduleDescriptor == null) {
            $$$reportNull$$$0(71);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null || !UnsignedTypes.INSTANCE.isShortNameOfUnsignedArray(declarationDescriptor.getName())) {
            return null;
        }
        ClassId classId = DescriptorUtilsKt.getClassId(declarationDescriptor);
        if (classId == null) {
            return null;
        }
        ClassId unsignedClassIdByArrayClassId = UnsignedTypes.INSTANCE.getUnsignedClassIdByArrayClassId(classId);
        if (unsignedClassIdByArrayClassId == null) {
            return null;
        }
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, unsignedClassIdByArrayClassId);
        if (findClassAcrossModuleDependencies == null) {
            return null;
        }
        return findClassAcrossModuleDependencies.getDefaultType();
    }

    public static ClassId getFunctionClassId(int i) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i)));
    }

    public static String getFunctionName(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Function");
        sb.append(i);
        String sb2 = sb.toString();
        if (sb2 == null) {
            $$$reportNull$$$0(17);
        }
        return sb2;
    }

    public static PrimitiveType getPrimitiveArrayType(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(77);
        }
        if (FQ_NAMES.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return (PrimitiveType) FQ_NAMES.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    private ClassDescriptor getPrimitiveClassDescriptor(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(15);
        }
        return getBuiltInClassByName(primitiveType.getTypeName().asString());
    }

    public static FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(152);
        }
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    public static PrimitiveType getPrimitiveType(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(76);
        }
        if (FQ_NAMES.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return (PrimitiveType) FQ_NAMES.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static boolean isAny(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(104);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.any);
    }

    public static boolean isAnyOrNullableAny(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(130);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.any);
    }

    public static boolean isArray(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(84);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.array);
    }

    public static boolean isArrayOrPrimitiveArray(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(85);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.array) || getPrimitiveArrayType(classDescriptor) != null;
    }

    public static boolean isBoolean(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(106);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._boolean);
    }

    public static boolean isBuiltIn(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    public static boolean isByte(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(113);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._byte);
    }

    public static boolean isChar(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(110);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._char);
    }

    private static boolean isConstructedFromGivenClass(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(93);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(94);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(125);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(126);
        }
        return isConstructedFromGivenClass(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
    }

    public static boolean isDefaultBound(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(132);
        }
        return isNullableAny(kotlinType);
    }

    public static boolean isDeprecated(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(150);
        }
        boolean z = true;
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(FQ_NAMES.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
        boolean isVar = propertyDescriptor.isVar();
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter == null || !isDeprecated(getter) || (isVar && (setter == null || !isDeprecated(setter)))) {
            z = false;
        }
        return z;
    }

    public static boolean isDouble(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(119);
        }
        return isDoubleOrNullableDouble(kotlinType) && !kotlinType.isMarkedNullable();
    }

    public static boolean isDoubleOrNullableDouble(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(124);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._double);
    }

    public static boolean isFloat(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(117);
        }
        return isFloatOrNullableFloat(kotlinType) && !kotlinType.isMarkedNullable();
    }

    public static boolean isFloatOrNullableFloat(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(118);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._float);
    }

    public static boolean isInt(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(112);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._int);
    }

    public static boolean isKClass(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(147);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.kClass);
    }

    public static boolean isLong(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(114);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._long);
    }

    private static boolean isNotNullConstructedFromGivenClass(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(101);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(102);
        }
        return !kotlinType.isMarkedNullable() && isConstructedFromGivenClass(kotlinType, fqNameUnsafe);
    }

    public static boolean isNothing(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(127);
        }
        return isNothingOrNullableNothing(kotlinType) && !TypeUtils.isNullableType(kotlinType);
    }

    public static boolean isNothingOrNullableNothing(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(129);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.nothing);
    }

    public static boolean isNullableAny(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(131);
        }
        return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
    }

    public static boolean isPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(75);
        }
        return FQ_NAMES.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }

    public static boolean isPrimitiveClass(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(92);
        }
        return getPrimitiveType(classDescriptor) != null;
    }

    public static boolean isPrimitiveType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(90);
        }
        return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(91);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor instanceof ClassDescriptor) && isPrimitiveClass((ClassDescriptor) declarationDescriptor);
    }

    public static boolean isShort(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(116);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._short);
    }

    public static boolean isSpecialClassWithNoSupertypes(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(103);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.any) || classFqNameEquals(classDescriptor, FQ_NAMES.nothing);
    }

    public static boolean isString(KotlinType kotlinType) {
        return kotlinType != null && isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.string);
    }

    public static boolean isTypeConstructorForGivenClass(TypeConstructor typeConstructor, FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(97);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(98);
        }
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        return (declarationDescriptor instanceof ClassDescriptor) && classFqNameEquals(declarationDescriptor, fqNameUnsafe);
    }

    public static boolean isUnderKotlinPackage(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(133);
        }
        return isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.unit);
    }

    /* access modifiers changed from: protected */
    public void createBuiltInsModule(boolean z) {
        this.builtInsModule = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z));
        ModuleDescriptorImpl moduleDescriptorImpl = this.builtInsModule;
        moduleDescriptorImpl.setDependencies(moduleDescriptorImpl);
    }

    /* access modifiers changed from: protected */
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        None none = None.INSTANCE;
        if (none == null) {
            $$$reportNull$$$0(2);
        }
        return none;
    }

    public ClassDescriptor getAny() {
        return getBuiltInClassByName("Any");
    }

    public SimpleType getAnyType() {
        SimpleType defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(49);
        }
        return defaultType;
    }

    public ClassDescriptor getArray() {
        return getBuiltInClassByName("Array");
    }

    public KotlinType getArrayElementType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(66);
        }
        if (!isArray(kotlinType)) {
            KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
            KotlinType kotlinType2 = (KotlinType) ((Primitives) this.primitives.invoke()).kotlinArrayTypeToPrimitiveKotlinType.get(makeNotNullable);
            if (kotlinType2 != null) {
                if (kotlinType2 == null) {
                    $$$reportNull$$$0(68);
                }
                return kotlinType2;
            }
            ModuleDescriptor containingModuleOrNull = DescriptorUtils.getContainingModuleOrNull(makeNotNullable);
            if (containingModuleOrNull != null) {
                KotlinType elementTypeForUnsignedArray = getElementTypeForUnsignedArray(makeNotNullable, containingModuleOrNull);
                if (elementTypeForUnsignedArray != null) {
                    if (elementTypeForUnsignedArray == null) {
                        $$$reportNull$$$0(69);
                    }
                    return elementTypeForUnsignedArray;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("not array: ");
            sb.append(kotlinType);
            throw new IllegalStateException(sb.toString());
        } else if (kotlinType.getArguments().size() == 1) {
            KotlinType type = ((TypeProjection) kotlinType.getArguments().get(0)).getType();
            if (type == null) {
                $$$reportNull$$$0(67);
            }
            return type;
        } else {
            throw new IllegalStateException();
        }
    }

    public SimpleType getArrayType(Variance variance, KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(78);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(79);
        }
        SimpleType simpleNotNullType = KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleNotNullType == null) {
            $$$reportNull$$$0(80);
        }
        return simpleNotNullType;
    }

    public SimpleType getBooleanType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(62);
        }
        return primitiveKotlinType;
    }

    public ClassDescriptor getBuiltInClassByFqName(FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(11);
        }
        ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(this.builtInsModule, fqName, NoLookupLocation.FROM_BUILTINS);
        if (resolveClassByFqName == null) {
            $$$reportNull$$$0(12);
        }
        return resolveClassByFqName;
    }

    public ModuleDescriptorImpl getBuiltInsModule() {
        ModuleDescriptorImpl moduleDescriptorImpl = this.builtInsModule;
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(6);
        }
        return moduleDescriptorImpl;
    }

    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope = this.builtInsModule.getPackage(BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(10);
        }
        return memberScope;
    }

    public SimpleType getByteType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(55);
        }
        return primitiveKotlinType;
    }

    public SimpleType getCharType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(61);
        }
        return primitiveKotlinType;
    }

    /* access modifiers changed from: protected */
    public Iterable<ClassDescriptorFactory> getClassDescriptorFactories() {
        List singletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.storageManager, this.builtInsModule));
        if (singletonList == null) {
            $$$reportNull$$$0(4);
        }
        return singletonList;
    }

    public ClassDescriptor getCollection() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(FQ_NAMES.collection);
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(33);
        }
        return builtInClassByFqName;
    }

    public ClassDescriptor getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    public SimpleType getDefaultBound() {
        SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(51);
        }
        return nullableAnyType;
    }

    public SimpleType getDoubleType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(60);
        }
        return primitiveKotlinType;
    }

    public SimpleType getFloatType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(59);
        }
        return primitiveKotlinType;
    }

    public ClassDescriptor getFunction(int i) {
        return getBuiltInClassByName(getFunctionName(i));
    }

    public SimpleType getIntType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(57);
        }
        return primitiveKotlinType;
    }

    public ClassDescriptor getKClass() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(FQ_NAMES.kClass.toSafe());
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(19);
        }
        return builtInClassByFqName;
    }

    public SimpleType getLongType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(58);
        }
        return primitiveKotlinType;
    }

    public ClassDescriptor getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    public SimpleType getNothingType() {
        SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(47);
        }
        return defaultType;
    }

    public SimpleType getNullableAnyType() {
        SimpleType makeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified == null) {
            $$$reportNull$$$0(50);
        }
        return makeNullableAsSpecified;
    }

    public SimpleType getNullableNothingType() {
        SimpleType makeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified == null) {
            $$$reportNull$$$0(48);
        }
        return makeNullableAsSpecified;
    }

    public ClassDescriptor getNumber() {
        return getBuiltInClassByName("Number");
    }

    public SimpleType getNumberType() {
        SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(54);
        }
        return defaultType;
    }

    /* access modifiers changed from: protected */
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        NoPlatformDependent noPlatformDependent = NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            $$$reportNull$$$0(3);
        }
        return noPlatformDependent;
    }

    public SimpleType getPrimitiveArrayKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(72);
        }
        SimpleType simpleType = (SimpleType) ((Primitives) this.primitives.invoke()).primitiveTypeToArrayKotlinType.get(primitiveType);
        if (simpleType == null) {
            $$$reportNull$$$0(73);
        }
        return simpleType;
    }

    public SimpleType getPrimitiveKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(52);
        }
        SimpleType defaultType = getPrimitiveClassDescriptor(primitiveType).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(53);
        }
        return defaultType;
    }

    public SimpleType getShortType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(56);
        }
        return primitiveKotlinType;
    }

    /* access modifiers changed from: protected */
    public StorageManager getStorageManager() {
        StorageManager storageManager2 = this.storageManager;
        if (storageManager2 == null) {
            $$$reportNull$$$0(5);
        }
        return storageManager2;
    }

    public ClassDescriptor getString() {
        return getBuiltInClassByName("String");
    }

    public SimpleType getStringType() {
        SimpleType defaultType = getString().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(64);
        }
        return defaultType;
    }

    public ClassDescriptor getSuspendFunction(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(Kind.SuspendFunction.getClassNamePrefix());
        sb.append(i);
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(sb.toString())));
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(18);
        }
        return builtInClassByFqName;
    }

    public ClassDescriptor getUnit() {
        return getBuiltInClassByName("Unit");
    }

    public SimpleType getUnitType() {
        SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(63);
        }
        return defaultType;
    }

    public void setBuiltInsModule(final ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(1);
        }
        this.storageManager.compute(new Function0<Void>() {
            public Void invoke() {
                if (KotlinBuiltIns.this.builtInsModule == null) {
                    KotlinBuiltIns.this.builtInsModule = moduleDescriptorImpl;
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Built-ins module is already set: ");
                sb.append(KotlinBuiltIns.this.builtInsModule);
                sb.append(" (attempting to reset to ");
                sb.append(moduleDescriptorImpl);
                sb.append(")");
                throw new AssertionError(sb.toString());
            }
        });
    }

    public static boolean isPrimitiveArray(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(87);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor == null || getPrimitiveArrayType(declarationDescriptor) == null) ? false : true;
    }
}
