package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: IntersectionType.kt */
public final class TypeIntersector {
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* compiled from: IntersectionType.kt */
    private enum ResultNullability {
        ;

        /* compiled from: IntersectionType.kt */
        static final class ACCEPT_NULL extends ResultNullability {
            ACCEPT_NULL(String str, int i) {
                super(str, i, null);
            }

            public ResultNullability combine(UnwrappedType unwrappedType) {
                return getResultNullability(unwrappedType);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class NOT_NULL extends ResultNullability {
            NOT_NULL(String str, int i) {
                super(str, i, null);
            }

            public NOT_NULL combine(UnwrappedType unwrappedType) {
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class START extends ResultNullability {
            START(String str, int i) {
                super(str, i, null);
            }

            public ResultNullability combine(UnwrappedType unwrappedType) {
                return getResultNullability(unwrappedType);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class UNKNOWN extends ResultNullability {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            public ResultNullability combine(UnwrappedType unwrappedType) {
                ResultNullability resultNullability = getResultNullability(unwrappedType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        public abstract ResultNullability combine(UnwrappedType unwrappedType);

        /* access modifiers changed from: protected */
        public final ResultNullability getResultNullability(UnwrappedType unwrappedType) {
            if (unwrappedType.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            if (NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    private TypeIntersector() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> filterTypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> r8, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.SimpleType, ? super kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r5
            if (r5 == r1) goto L_0x004d
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 == 0) goto L_0x0027
            r4 = 1
        L_0x0051:
            if (r4 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.filterTypes(java.util.Collection, kotlin.jvm.functions.Function2):java.util.Collection");
    }

    private final SimpleType intersectTypesWithoutIntersectionType(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) C13199w.m40602m(set);
        }
        C13125x7a6103fb typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 = new C13125x7a6103fb(set);
        Collection filterTypes = filterTypes(set, new C13126x702eebb8(this));
        boolean z = !filterTypes.isEmpty();
        if (!C13147x.f29590a || z) {
            SimpleType findIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(filterTypes);
            if (findIntersectionType != null) {
                return findIntersectionType;
            }
            Collection filterTypes2 = filterTypes(filterTypes, new C13127xc97d8c34(NewKotlinTypeChecker.INSTANCE));
            boolean isEmpty = true ^ filterTypes2.isEmpty();
            if (C13147x.f29590a && !isEmpty) {
                throw new AssertionError(typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1.invoke());
            } else if (filterTypes2.size() < 2) {
                return (SimpleType) C13199w.m40602m(filterTypes2);
            } else {
                IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(set);
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(Annotations.Companion.getEMPTY(), intersectionTypeConstructor, C13185o.m40513a(), false, intersectionTypeConstructor.createScopeForKotlinType());
            }
        } else {
            throw new AssertionError(typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1.invoke());
        }
    }

    /* access modifiers changed from: private */
    public final boolean isStrictSupertype(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeChecker newKotlinTypeChecker = NewKotlinTypeChecker.INSTANCE;
        return newKotlinTypeChecker.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeChecker.isSubtypeOf(kotlinType2, kotlinType);
    }

    public final SimpleType intersectTypes$descriptors(List<? extends SimpleType> list) {
        boolean z = list.size() > 1;
        if (!C13147x.f29590a || z) {
            ArrayList<UnwrappedType> arrayList = new ArrayList<>();
            for (SimpleType simpleType : list) {
                if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                    Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                    Intrinsics.checkReturnedValueIsNotNull((Object) supertypes, "type.constructor.supertypes");
                    ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) supertypes, 10));
                    for (KotlinType kotlinType : supertypes) {
                        Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType, "it");
                        SimpleType upperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                        if (simpleType.isMarkedNullable()) {
                            upperIfFlexible = upperIfFlexible.makeNullableAsSpecified(true);
                        }
                        arrayList2.add(upperIfFlexible);
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    arrayList.add(simpleType);
                }
            }
            ResultNullability resultNullability = ResultNullability.START;
            for (UnwrappedType combine : arrayList) {
                resultNullability = resultNullability.combine(combine);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SimpleType simpleType2 = (SimpleType) it.next();
                if (resultNullability == ResultNullability.NOT_NULL) {
                    simpleType2 = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType2);
                }
                linkedHashSet.add(simpleType2);
            }
            return intersectTypesWithoutIntersectionType(linkedHashSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Size should be at least 2, but it is ");
        sb.append(list.size());
        throw new AssertionError(sb.toString());
    }
}
