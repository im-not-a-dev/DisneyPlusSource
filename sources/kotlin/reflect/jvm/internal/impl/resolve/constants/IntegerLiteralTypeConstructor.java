package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C12898l;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(IntegerLiteralTypeConstructor.class), "supertypes", "getSupertypes()Ljava/util/List;"))};
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public final ModuleDescriptor module;
    private final Set<KotlinType> possibleTypes;
    private final Lazy supertypes$delegate;
    /* access modifiers changed from: private */
    public final SimpleType type;
    /* access modifiers changed from: private */
    public final long value;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class Companion {

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        private enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Mode.values().length];

            static {
                $EnumSwitchMapping$0[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                $EnumSwitchMapping$0[Mode.INTERSECTION_TYPE.ordinal()] = 2;
            }
        }

        private Companion() {
        }

        private final SimpleType findCommonSuperTypeOrIntersectionType(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    SimpleType simpleType = (SimpleType) next;
                    next = IntegerLiteralTypeConstructor.Companion.fold(simpleType, (SimpleType) it.next(), mode);
                }
                return (SimpleType) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final SimpleType fold(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType == null || simpleType2 == null) {
                return null;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            TypeConstructor constructor2 = simpleType2.getConstructor();
            boolean z = constructor instanceof IntegerLiteralTypeConstructor;
            if (z && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                return fold((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, mode);
            }
            if (z) {
                return fold((IntegerLiteralTypeConstructor) constructor, simpleType2);
            }
            if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                return fold((IntegerLiteralTypeConstructor) constructor2, simpleType);
            }
            return null;
        }

        public final SimpleType findIntersectionType(Collection<? extends SimpleType> collection) {
            return findCommonSuperTypeOrIntersectionType(collection, Mode.INTERSECTION_TYPE);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set set;
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                set = C13199w.m40568b((Iterable) integerLiteralTypeConstructor.getPossibleTypes(), (Iterable) integerLiteralTypeConstructor2.getPossibleTypes());
            } else if (i == 2) {
                set = C13199w.m40584d((Iterable) integerLiteralTypeConstructor.getPossibleTypes(), (Iterable) integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                throw new C12898l();
            }
            IntegerLiteralTypeConstructor integerLiteralTypeConstructor3 = new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, set, null);
            return KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), integerLiteralTypeConstructor3, false);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }

    private final List<KotlinType> getSupertypes() {
        Lazy lazy = this.supertypes$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (List) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean isContainsOnlyUnsignedTypes() {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if ((allSignedLiteralTypes instanceof Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        for (KotlinType contains : allSignedLiteralTypes) {
            if (!(!this.possibleTypes.contains(contains))) {
                return false;
            }
        }
        return true;
    }

    private final String valueToString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(C13199w.m40559a(this.possibleTypes, ",", null, null, 0, null, IntegerLiteralTypeConstructor$valueToString$1.INSTANCE, 30, null));
        sb.append(']');
        return sb.toString();
    }

    public final boolean checkConstructor(TypeConstructor typeConstructor) {
        Set<KotlinType> set = this.possibleTypes;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (KotlinType constructor : set) {
            if (Intrinsics.areEqual((Object) constructor.getConstructor(), (Object) typeConstructor)) {
                return true;
            }
        }
        return false;
    }

    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public List<TypeParameterDescriptor> getParameters() {
        return C13185o.m40513a();
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    /* renamed from: getSupertypes reason: collision with other method in class */
    public Collection<KotlinType> m45854getSupertypes() {
        return getSupertypes();
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntegerLiteralType");
        sb.append(valueToString());
        return sb.toString();
    }

    private IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.type = KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), this, false);
        this.supertypes$delegate = C12763i.m39921a(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.value = j;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }
}
