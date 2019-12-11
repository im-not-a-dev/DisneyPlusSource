package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C12898l;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* compiled from: AbstractTypeChecker.kt */
public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[SeveralSupertypesWithSameConstructorPolicy.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[TypeVariance.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[LowerCapturedTypePolicy.values().length];

        static {
            $EnumSwitchMapping$0[SeveralSupertypesWithSameConstructorPolicy.FORCE_NOT_SUBTYPE.ordinal()] = 1;
            $EnumSwitchMapping$0[SeveralSupertypesWithSameConstructorPolicy.TAKE_FIRST_FOR_SUBTYPING.ordinal()] = 2;
            $EnumSwitchMapping$0[SeveralSupertypesWithSameConstructorPolicy.CHECK_ANY_OF_THEM.ordinal()] = 3;
            $EnumSwitchMapping$0[SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN.ordinal()] = 4;
            $EnumSwitchMapping$1[TypeVariance.INV.ordinal()] = 1;
            $EnumSwitchMapping$1[TypeVariance.OUT.ordinal()] = 2;
            $EnumSwitchMapping$1[TypeVariance.IN.ordinal()] = 3;
            $EnumSwitchMapping$2[LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            $EnumSwitchMapping$2[LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            $EnumSwitchMapping$2[LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        }
    }

    private AbstractTypeChecker() {
    }

    private final Boolean checkSubtypeForIntegerLiteralType(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (!abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1 abstractTypeChecker$checkSubtypeForIntegerLiteralType$1 = new AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1(abstractTypeCheckerContext);
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return Boolean.valueOf(true);
        }
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (abstractTypeChecker$checkSubtypeForIntegerLiteralType$1.invoke(simpleTypeMarker, simpleTypeMarker2)) {
                return Boolean.valueOf(true);
            }
        } else if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2) && abstractTypeChecker$checkSubtypeForIntegerLiteralType$1.invoke(simpleTypeMarker2, simpleTypeMarker)) {
            return Boolean.valueOf(true);
        }
        return null;
    }

    private final Boolean checkSubtypeForSpecialCases(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        boolean isError = abstractTypeCheckerContext.isError(simpleTypeMarker);
        boolean z = true;
        Boolean valueOf = Boolean.valueOf(true);
        if (isError || abstractTypeCheckerContext.isError(simpleTypeMarker2)) {
            if (abstractTypeCheckerContext.isErrorTypeEqualsToAnything()) {
                return valueOf;
            }
            if (!abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker) || abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2)) {
                return Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(abstractTypeCheckerContext, abstractTypeCheckerContext.withNullability(simpleTypeMarker, false), abstractTypeCheckerContext.withNullability(simpleTypeMarker2, false)));
            }
            return Boolean.valueOf(false);
        } else if (abstractTypeCheckerContext.isStubType(simpleTypeMarker) || abstractTypeCheckerContext.isStubType(simpleTypeMarker2)) {
            return valueOf;
        } else {
            CapturedTypeMarker asCapturedType = abstractTypeCheckerContext.asCapturedType(simpleTypeMarker2);
            KotlinTypeMarker lowerType = asCapturedType != null ? abstractTypeCheckerContext.lowerType(asCapturedType) : null;
            if (!(asCapturedType == null || lowerType == null)) {
                int i = WhenMappings.$EnumSwitchMapping$2[abstractTypeCheckerContext.getLowerCapturedTypePolicy(simpleTypeMarker, asCapturedType).ordinal()];
                if (i == 1) {
                    return Boolean.valueOf(isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker, lowerType));
                }
                if (i == 2) {
                    if (isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker, lowerType)) {
                        return valueOf;
                    }
                }
            }
            TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2);
            if (!abstractTypeCheckerContext.isIntersection(typeConstructor)) {
                return null;
            }
            boolean z2 = !abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2);
            if (!C13147x.f29590a || z2) {
                Collection supertypes = abstractTypeCheckerContext.supertypes(typeConstructor);
                if (!(supertypes instanceof Collection) || !supertypes.isEmpty()) {
                    Iterator it = supertypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!INSTANCE.isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker, (KotlinTypeMarker) it.next())) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Intersection type should not be marked nullable!: ");
            sb.append(simpleTypeMarker2);
            throw new AssertionError(sb.toString());
        }
    }

    private final List<SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        SupertypesPolicy supertypesPolicy;
        List<SimpleTypeMarker> list;
        List<SimpleTypeMarker> fastCorrespondingSupertypes = abstractTypeCheckerContext.fastCorrespondingSupertypes(simpleTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) && abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return C13185o.m40513a();
        }
        if (abstractTypeCheckerContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
                SimpleTypeMarker captureFromArguments = abstractTypeCheckerContext.captureFromArguments(simpleTypeMarker, CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments == null) {
                    captureFromArguments = simpleTypeMarker;
                }
                list = C13183n.m40498a(captureFromArguments);
            } else {
                list = C13185o.m40513a();
            }
            return list;
        }
        SmartList smartList = new SmartList();
        abstractTypeCheckerContext.initialize();
        ArrayDeque supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque != null) {
            Set supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            if (supertypesSet != null) {
                supertypesDeque.push(simpleTypeMarker);
                while (!supertypesDeque.isEmpty()) {
                    if (supertypesSet.size() <= 1000) {
                        SimpleTypeMarker simpleTypeMarker2 = (SimpleTypeMarker) supertypesDeque.pop();
                        C12880j.m40222a((Object) simpleTypeMarker2, "current");
                        if (supertypesSet.add(simpleTypeMarker2)) {
                            SimpleTypeMarker captureFromArguments2 = abstractTypeCheckerContext.captureFromArguments(simpleTypeMarker2, CaptureStatus.FOR_SUBTYPING);
                            if (captureFromArguments2 == null) {
                                captureFromArguments2 = simpleTypeMarker2;
                            }
                            if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(captureFromArguments2), typeConstructorMarker)) {
                                smartList.add(captureFromArguments2);
                                supertypesPolicy = None.INSTANCE;
                            } else if (abstractTypeCheckerContext.argumentsCount(captureFromArguments2) == 0) {
                                supertypesPolicy = LowerIfFlexible.INSTANCE;
                            } else {
                                supertypesPolicy = abstractTypeCheckerContext.substitutionSupertypePolicy(captureFromArguments2);
                            }
                            if (!(!C12880j.m40224a((Object) supertypesPolicy, (Object) None.INSTANCE))) {
                                supertypesPolicy = null;
                            }
                            if (supertypesPolicy != null) {
                                for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2))) {
                                    supertypesDeque.add(supertypesPolicy.transformType(abstractTypeCheckerContext, transformType));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(simpleTypeMarker);
                        sb.append(". Supertypes = ");
                        sb.append(C13199w.m40559a(supertypesSet, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                abstractTypeCheckerContext.clear();
                return smartList;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    private final List<SimpleTypeMarker> collectAndFilter(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(abstractTypeCheckerContext, collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker));
    }

    private final boolean completeIsSubTypeOf(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Boolean checkSubtypeForSpecialCases = checkSubtypeForSpecialCases(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
        if (checkSubtypeForSpecialCases != null) {
            boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
            return booleanValue;
        }
        Boolean addSubtypeConstraint = abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
        if (addSubtypeConstraint != null) {
            return addSubtypeConstraint.booleanValue();
        }
        return isSubtypeOfForSingleClassifierType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
    }

    private final boolean hasNothingSupertype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker) {
        SupertypesPolicy supertypesPolicy;
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        if (abstractTypeCheckerContext.isClassTypeConstructor(typeConstructor)) {
            return abstractTypeCheckerContext.isNothingConstructor(typeConstructor);
        }
        boolean z = true;
        if (!abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            abstractTypeCheckerContext.initialize();
            ArrayDeque supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
            if (supertypesDeque != null) {
                Set supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
                if (supertypesSet != null) {
                    supertypesDeque.push(simpleTypeMarker);
                    loop0:
                    while (true) {
                        if (!(!supertypesDeque.isEmpty())) {
                            abstractTypeCheckerContext.clear();
                            z = false;
                            break;
                        } else if (supertypesSet.size() <= 1000) {
                            SimpleTypeMarker simpleTypeMarker2 = (SimpleTypeMarker) supertypesDeque.pop();
                            C12880j.m40222a((Object) simpleTypeMarker2, "current");
                            if (supertypesSet.add(simpleTypeMarker2)) {
                                if (abstractTypeCheckerContext.isClassType(simpleTypeMarker2)) {
                                    supertypesPolicy = None.INSTANCE;
                                } else {
                                    supertypesPolicy = LowerIfFlexible.INSTANCE;
                                }
                                if (!(!C12880j.m40224a((Object) supertypesPolicy, (Object) None.INSTANCE))) {
                                    supertypesPolicy = null;
                                }
                                if (supertypesPolicy != null) {
                                    for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2))) {
                                        SimpleTypeMarker transformType2 = supertypesPolicy.transformType(abstractTypeCheckerContext, transformType);
                                        if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(transformType2))) {
                                            abstractTypeCheckerContext.clear();
                                            break loop0;
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
                            sb.append(simpleTypeMarker);
                            sb.append(". Supertypes = ");
                            sb.append(C13199w.m40559a(supertypesSet, null, null, null, 0, null, null, 63, null));
                            throw new IllegalStateException(sb.toString().toString());
                        }
                    }
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
        return z;
    }

    private final boolean isCommonDenotableType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
        return abstractTypeCheckerContext.isDenotable(abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker)) && !abstractTypeCheckerContext.isDynamic(kotlinTypeMarker) && !abstractTypeCheckerContext.isDefinitelyNotNullType(kotlinTypeMarker) && C12880j.m40224a((Object) abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker)), (Object) abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext r13, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r14, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r15) {
        /*
            r12 = this;
            boolean r0 = RUN_SLOW_ASSERTIONS
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006c
            boolean r0 = r13.isSingleClassifierType(r14)
            if (r0 != 0) goto L_0x001f
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r0 = r13.typeConstructor(r14)
            boolean r0 = r13.isIntersection(r0)
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.isAllowedTypeVariable(r14)
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = kotlin.C13147x.f29590a
            if (r3 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x0027
            goto L_0x003e
        L_0x0027:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Not singleClassifierType and not intersection subType: "
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r13)
            throw r14
        L_0x003e:
            boolean r0 = r13.isSingleClassifierType(r15)
            if (r0 != 0) goto L_0x004d
            boolean r0 = r13.isAllowedTypeVariable(r15)
            if (r0 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            boolean r3 = kotlin.C13147x.f29590a
            if (r3 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x0055
            goto L_0x006c
        L_0x0055:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Not singleClassifierType superType: "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r13)
            throw r14
        L_0x006c:
            kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker r0 = kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE
            boolean r0 = r0.isPossibleSubtype(r13, r14, r15)
            if (r0 != 0) goto L_0x0075
            return r1
        L_0x0075:
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r0 = r13.lowerBoundIfFlexible(r14)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r3 = r13.upperBoundIfFlexible(r15)
            java.lang.Boolean r0 = r12.checkSubtypeForIntegerLiteralType(r13, r0, r3)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.booleanValue()
            r13.addSubtypeConstraint(r14, r15)
            return r0
        L_0x008b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r0 = r13.typeConstructor(r15)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r3 = r13.typeConstructor(r14)
            boolean r3 = r13.isEqualTypeConstructors(r3, r0)
            if (r3 == 0) goto L_0x00a0
            int r3 = r13.parametersCount(r0)
            if (r3 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r3 = r13.typeConstructor(r15)
            boolean r3 = r13.isAnyConstructor(r3)
            if (r3 == 0) goto L_0x00ab
            return r2
        L_0x00ab:
            java.util.List r3 = r12.findCorrespondingSupertypes(r13, r14, r0)
            int r4 = r3.size()
            if (r4 == 0) goto L_0x01ad
            if (r4 == r2) goto L_0x019e
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy r4 = r13.getSameConstructorPolicy()
            int[] r5 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r2) goto L_0x019d
            r5 = 2
            if (r4 == r5) goto L_0x018e
            r5 = 3
            if (r4 == r5) goto L_0x00cf
            r5 = 4
            if (r4 == r5) goto L_0x00cf
            goto L_0x00fb
        L_0x00cf:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00db
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00db
        L_0x00d9:
            r4 = 0
            goto L_0x00f8
        L_0x00db:
            java.util.Iterator r4 = r3.iterator()
        L_0x00df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d9
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r5 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r5
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r6 = INSTANCE
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r5 = r13.asArgumentList(r5)
            boolean r5 = r6.isSubtypeForSameConstructor(r13, r5, r15)
            if (r5 == 0) goto L_0x00df
            r4 = 1
        L_0x00f8:
            if (r4 == 0) goto L_0x00fb
            return r2
        L_0x00fb:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy r4 = r13.getSameConstructorPolicy()
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy r5 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
            if (r4 == r5) goto L_0x0104
            return r1
        L_0x0104:
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r4 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r5 = r13.parametersCount(r0)
            r4.<init>(r5)
            int r0 = r13.parametersCount(r0)
            r5 = 0
        L_0x0112:
            if (r5 >= r0) goto L_0x0189
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.p590y.C13187p.m40525a(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r3.iterator()
        L_0x0123:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x017b
            java.lang.Object r8 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r8 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r8
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r9 = r13.getArgumentOrNull(r8, r5)
            if (r9 == 0) goto L_0x0150
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r10 = r13.getVariance(r9)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r11 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r10 != r11) goto L_0x013f
            r10 = 1
            goto L_0x0140
        L_0x013f:
            r10 = 0
        L_0x0140:
            if (r10 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r9 = 0
        L_0x0144:
            if (r9 == 0) goto L_0x0150
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r9 = r13.getType(r9)
            if (r9 == 0) goto L_0x0150
            r6.add(r9)
            goto L_0x0123
        L_0x0150:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Incorrect type: "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r0 = ", subType: "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r14 = ", superType: "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x017b:
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r6 = r13.intersectTypes(r6)
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r6 = r13.asTypeArgument(r6)
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x0112
        L_0x0189:
            boolean r13 = r12.isSubtypeForSameConstructor(r13, r4, r15)
            return r13
        L_0x018e:
            java.lang.Object r14 = kotlin.p590y.C13199w.m40589f(r3)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r14 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r14 = r13.asArgumentList(r14)
            boolean r13 = r12.isSubtypeForSameConstructor(r13, r14, r15)
            return r13
        L_0x019d:
            return r1
        L_0x019e:
            java.lang.Object r14 = kotlin.p590y.C13199w.m40589f(r3)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r14 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r14 = r13.asArgumentList(r14)
            boolean r13 = r12.isSubtypeForSameConstructor(r13, r14, r15)
            return r13
        L_0x01ad:
            boolean r13 = r12.hasNothingSupertype(r13, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):boolean");
    }

    private final List<SimpleTypeMarker> selectOnlyPureKotlinSupertypes(AbstractTypeCheckerContext abstractTypeCheckerContext, List<? extends SimpleTypeMarker> list) {
        if (list.size() < 2) {
            return list;
        }
        List<? extends SimpleTypeMarker> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TypeArgumentListMarker asArgumentList = abstractTypeCheckerContext.asArgumentList((SimpleTypeMarker) next);
            int size = abstractTypeCheckerContext.size(asArgumentList);
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!(abstractTypeCheckerContext.asFlexibleType(abstractTypeCheckerContext.getType(abstractTypeCheckerContext.get(asArgumentList, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        return list;
    }

    public final TypeVariance effectiveVariance(TypeVariance typeVariance, TypeVariance typeVariance2) {
        TypeVariance typeVariance3 = TypeVariance.INV;
        if (typeVariance == typeVariance3) {
            return typeVariance2;
        }
        if (typeVariance2 == typeVariance3 || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    public final boolean equalTypes(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        boolean z = true;
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (INSTANCE.isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker) && INSTANCE.isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker2)) {
            SimpleTypeMarker lowerBoundIfFlexible = abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker);
            if (!abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker), abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker2))) {
                return false;
            }
            if (abstractTypeCheckerContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                if (!abstractTypeCheckerContext.hasFlexibleNullability(kotlinTypeMarker) && !abstractTypeCheckerContext.hasFlexibleNullability(kotlinTypeMarker2) && abstractTypeCheckerContext.isMarkedNullable(lowerBoundIfFlexible) != abstractTypeCheckerContext.isMarkedNullable(abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker2))) {
                    z = false;
                }
                return z;
            }
        }
        if (!INSTANCE.isSubtypeOf(abstractTypeCheckerContext, kotlinTypeMarker, kotlinTypeMarker2) || !INSTANCE.isSubtypeOf(abstractTypeCheckerContext, kotlinTypeMarker2, kotlinTypeMarker)) {
            z = false;
        }
        return z;
    }

    public final List<SimpleTypeMarker> findCorrespondingSupertypes(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        SupertypesPolicy supertypesPolicy;
        if (abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        if (!abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) && !abstractTypeCheckerContext.isIntegerLiteralTypeConstructor(typeConstructorMarker)) {
            return collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList<>();
        abstractTypeCheckerContext.initialize();
        ArrayDeque supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque != null) {
            Set supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            if (supertypesSet != null) {
                supertypesDeque.push(simpleTypeMarker);
                while (!supertypesDeque.isEmpty()) {
                    if (supertypesSet.size() <= 1000) {
                        SimpleTypeMarker simpleTypeMarker2 = (SimpleTypeMarker) supertypesDeque.pop();
                        C12880j.m40222a((Object) simpleTypeMarker2, "current");
                        if (supertypesSet.add(simpleTypeMarker2)) {
                            if (abstractTypeCheckerContext.isClassType(simpleTypeMarker2)) {
                                smartList.add(simpleTypeMarker2);
                                supertypesPolicy = None.INSTANCE;
                            } else {
                                supertypesPolicy = LowerIfFlexible.INSTANCE;
                            }
                            if (!(!C12880j.m40224a((Object) supertypesPolicy, (Object) None.INSTANCE))) {
                                supertypesPolicy = null;
                            }
                            if (supertypesPolicy != null) {
                                for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2))) {
                                    supertypesDeque.add(supertypesPolicy.transformType(abstractTypeCheckerContext, transformType));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Too many supertypes for type: ");
                        sb.append(simpleTypeMarker);
                        sb.append(". Supertypes = ");
                        sb.append(C13199w.m40559a(supertypesSet, null, null, null, 0, null, null, 63, null));
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                abstractTypeCheckerContext.clear();
                ArrayList arrayList = new ArrayList();
                for (SimpleTypeMarker simpleTypeMarker3 : smartList) {
                    AbstractTypeChecker abstractTypeChecker = INSTANCE;
                    C12880j.m40222a((Object) simpleTypeMarker3, "it");
                    C13196t.m40545a((Collection) arrayList, (Iterable) abstractTypeChecker.collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker3, typeConstructorMarker));
                }
                return arrayList;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    public final boolean isSubtypeForSameConstructor(AbstractTypeCheckerContext abstractTypeCheckerContext, TypeArgumentListMarker typeArgumentListMarker, SimpleTypeMarker simpleTypeMarker) {
        boolean z;
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        int parametersCount = abstractTypeCheckerContext.parametersCount(typeConstructor);
        for (int i = 0; i < parametersCount; i++) {
            TypeArgumentMarker argument = abstractTypeCheckerContext.getArgument(simpleTypeMarker, i);
            if (!abstractTypeCheckerContext.isStarProjection(argument)) {
                KotlinTypeMarker type = abstractTypeCheckerContext.getType(argument);
                TypeArgumentMarker typeArgumentMarker = abstractTypeCheckerContext.get(typeArgumentListMarker, i);
                boolean z2 = abstractTypeCheckerContext.getVariance(typeArgumentMarker) == TypeVariance.INV;
                if (!C13147x.f29590a || z2) {
                    KotlinTypeMarker type2 = abstractTypeCheckerContext.getType(typeArgumentMarker);
                    TypeVariance effectiveVariance = effectiveVariance(abstractTypeCheckerContext.getVariance(abstractTypeCheckerContext.getParameter(typeConstructor, i)), abstractTypeCheckerContext.getVariance(argument));
                    if (effectiveVariance == null) {
                        return abstractTypeCheckerContext.isErrorTypeEqualsToAnything();
                    }
                    if (abstractTypeCheckerContext.argumentsDepth <= 100) {
                        abstractTypeCheckerContext.argumentsDepth = abstractTypeCheckerContext.argumentsDepth + 1;
                        int i2 = WhenMappings.$EnumSwitchMapping$1[effectiveVariance.ordinal()];
                        if (i2 == 1) {
                            z = INSTANCE.equalTypes(abstractTypeCheckerContext, type2, type);
                        } else if (i2 == 2) {
                            z = INSTANCE.isSubtypeOf(abstractTypeCheckerContext, type2, type);
                        } else if (i2 == 3) {
                            z = INSTANCE.isSubtypeOf(abstractTypeCheckerContext, type, type2);
                        } else {
                            throw new C12898l();
                        }
                        abstractTypeCheckerContext.argumentsDepth = abstractTypeCheckerContext.argumentsDepth - 1;
                        if (!z) {
                            return false;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Arguments depth is too high. Some related argument: ");
                        sb.append(type2);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Incorrect sub argument: ");
                    sb2.append(typeArgumentMarker);
                    throw new AssertionError(sb2.toString());
                }
            }
        }
        return true;
    }

    public final boolean isSubtypeOf(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        return completeIsSubTypeOf(abstractTypeCheckerContext, abstractTypeCheckerContext.prepareType(kotlinTypeMarker), abstractTypeCheckerContext.prepareType(kotlinTypeMarker2));
    }
}
