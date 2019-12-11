package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.UpperIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* compiled from: AbstractTypeChecker.kt */
public final class AbstractNullabilityChecker {
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    private final boolean runIsPossibleSubtype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            boolean z = abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker) || abstractTypeCheckerContext.isIntersection(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker)) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker);
            if (!C13147x.f29590a || z) {
                boolean z2 = abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker2) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker2);
                if (C13147x.f29590a && !z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not singleClassifierType superType: ");
                    sb.append(simpleTypeMarker2);
                    throw new AssertionError(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not singleClassifierType and not intersection subType: ");
                sb2.append(simpleTypeMarker);
                throw new AssertionError(sb2.toString());
            }
        }
        if (abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2) || abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker) || hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker, LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (!abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker2) && !hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker2, UpperIfFlexible.INSTANCE) && !abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return hasPathByNotMarkedNullableNodes(abstractTypeCheckerContext, simpleTypeMarker, abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2));
        }
        return false;
    }

    public final boolean hasNotNullSupertype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SupertypesPolicy supertypesPolicy) {
        AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        if ((abstractTypeCheckerContext.isClassType(simpleTypeMarker) && !abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker)) || abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker)) {
            return true;
        }
        abstractTypeCheckerContext.initialize();
        ArrayDeque supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque != null) {
            Set supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            if (supertypesSet != null) {
                supertypesDeque.push(simpleTypeMarker2);
                while (!supertypesDeque.isEmpty()) {
                    if (supertypesSet.size() <= 1000) {
                        SimpleTypeMarker simpleTypeMarker3 = (SimpleTypeMarker) supertypesDeque.pop();
                        Intrinsics.checkReturnedValueIsNotNull((Object) simpleTypeMarker3, "current");
                        if (supertypesSet.add(simpleTypeMarker3)) {
                            SupertypesPolicy supertypesPolicy2 = abstractTypeCheckerContext2.isMarkedNullable(simpleTypeMarker3) ? None.INSTANCE : supertypesPolicy;
                            if (!(!Intrinsics.areEqual((Object) supertypesPolicy2, (Object) None.INSTANCE))) {
                                supertypesPolicy2 = null;
                            }
                            if (supertypesPolicy2 != null) {
                                for (KotlinTypeMarker transformType : abstractTypeCheckerContext2.supertypes(abstractTypeCheckerContext2.typeConstructor(simpleTypeMarker3))) {
                                    SimpleTypeMarker transformType2 = supertypesPolicy2.transformType(abstractTypeCheckerContext2, transformType);
                                    if ((abstractTypeCheckerContext2.isClassType(transformType2) && !abstractTypeCheckerContext2.isMarkedNullable(transformType2)) || abstractTypeCheckerContext2.isDefinitelyNotNullType(transformType2)) {
                                        abstractTypeCheckerContext.clear();
                                        return true;
                                    }
                                    supertypesDeque.add(transformType2);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(simpleTypeMarker2);
                        sb.append(". Supertypes = ");
                        sb.append(C13199w.m40559a(supertypesSet, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                abstractTypeCheckerContext.clear();
                return false;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public final boolean hasPathByNotMarkedNullableNodes(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        TypeConstructorMarker typeConstructorMarker2 = typeConstructorMarker;
        if (abstractTypeCheckerContext.isNothing(simpleTypeMarker) || (!abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker) && abstractTypeCheckerContext2.isEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker2))) {
            return true;
        }
        abstractTypeCheckerContext.initialize();
        ArrayDeque supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque != null) {
            Set supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            if (supertypesSet != null) {
                supertypesDeque.push(simpleTypeMarker2);
                while (!supertypesDeque.isEmpty()) {
                    if (supertypesSet.size() <= 1000) {
                        SimpleTypeMarker simpleTypeMarker3 = (SimpleTypeMarker) supertypesDeque.pop();
                        Intrinsics.checkReturnedValueIsNotNull((Object) simpleTypeMarker3, "current");
                        if (supertypesSet.add(simpleTypeMarker3)) {
                            SupertypesPolicy supertypesPolicy = abstractTypeCheckerContext2.isMarkedNullable(simpleTypeMarker3) ? None.INSTANCE : LowerIfFlexible.INSTANCE;
                            if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) None.INSTANCE))) {
                                supertypesPolicy = null;
                            }
                            if (supertypesPolicy != null) {
                                for (KotlinTypeMarker transformType : abstractTypeCheckerContext2.supertypes(abstractTypeCheckerContext2.typeConstructor(simpleTypeMarker3))) {
                                    SimpleTypeMarker transformType2 = supertypesPolicy.transformType(abstractTypeCheckerContext2, transformType);
                                    if (abstractTypeCheckerContext2.isNothing(transformType2) || (!abstractTypeCheckerContext2.isMarkedNullable(transformType2) && abstractTypeCheckerContext2.isEqualTypeConstructors(abstractTypeCheckerContext2.typeConstructor(transformType2), typeConstructorMarker2))) {
                                        abstractTypeCheckerContext.clear();
                                        return true;
                                    }
                                    supertypesDeque.add(transformType2);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(simpleTypeMarker2);
                        sb.append(". Supertypes = ");
                        sb.append(C13199w.m40559a(supertypesSet, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                abstractTypeCheckerContext.clear();
                return false;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public final boolean isPossibleSubtype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return runIsPossibleSubtype(abstractTypeCheckerContext, simpleTypeMarker, simpleTypeMarker2);
    }
}
