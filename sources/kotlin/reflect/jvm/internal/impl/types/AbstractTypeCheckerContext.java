package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: AbstractTypeChecker.kt */
public abstract class AbstractTypeCheckerContext implements TypeSystemContext {
    /* access modifiers changed from: private */
    public int argumentsDepth;
    private ArrayDeque<SimpleTypeMarker> supertypesDeque;
    private boolean supertypesLocked;
    private Set<SimpleTypeMarker> supertypesSet;

    /* compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    public enum SeveralSupertypesWithSameConstructorPolicy {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class SupertypesPolicy {

        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            public SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                return abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            public Void transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            public SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                return abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker);
            }
        }

        private SupertypesPolicy() {
        }

        public abstract SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker);

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Boolean addSubtypeConstraint(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        return null;
    }

    public abstract boolean areEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    public final void clear() {
        ArrayDeque<SimpleTypeMarker> arrayDeque = this.supertypesDeque;
        if (arrayDeque != null) {
            arrayDeque.clear();
            Set<SimpleTypeMarker> set = this.supertypesSet;
            if (set != null) {
                set.clear();
                this.supertypesLocked = false;
                return;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    public List<SimpleTypeMarker> fastCorrespondingSupertypes(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return DefaultImpls.fastCorrespondingSupertypes(this, simpleTypeMarker, typeConstructorMarker);
    }

    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        return DefaultImpls.get(this, typeArgumentListMarker, i);
    }

    public TypeArgumentMarker getArgumentOrNull(SimpleTypeMarker simpleTypeMarker, int i) {
        return DefaultImpls.getArgumentOrNull(this, simpleTypeMarker, i);
    }

    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(SimpleTypeMarker simpleTypeMarker, CapturedTypeMarker capturedTypeMarker) {
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public SeveralSupertypesWithSameConstructorPolicy getSameConstructorPolicy() {
        return SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    public final ArrayDeque<SimpleTypeMarker> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final Set<SimpleTypeMarker> getSupertypesSet() {
        return this.supertypesSet;
    }

    public boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.hasFlexibleNullability(this, kotlinTypeMarker);
    }

    public boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }

    public final void initialize() {
        boolean z = !this.supertypesLocked;
        if (!C13147x.f29590a || z) {
            this.supertypesLocked = true;
            if (this.supertypesDeque == null) {
                this.supertypesDeque = new ArrayDeque<>(4);
            }
            if (this.supertypesSet == null) {
                this.supertypesSet = SmartSet.Companion.create();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public abstract boolean isAllowedTypeVariable(KotlinTypeMarker kotlinTypeMarker);

    public boolean isClassType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isClassType(this, simpleTypeMarker);
    }

    public boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isDefinitelyNotNullType(this, kotlinTypeMarker);
    }

    public boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isDynamic(this, kotlinTypeMarker);
    }

    public abstract boolean isErrorTypeEqualsToAnything();

    public boolean isIntegerLiteralType(SimpleTypeMarker simpleTypeMarker) {
        return DefaultImpls.isIntegerLiteralType(this, simpleTypeMarker);
    }

    public boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.isNothing(this, kotlinTypeMarker);
    }

    public SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.lowerBoundIfFlexible(this, kotlinTypeMarker);
    }

    public KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker) {
        return kotlinTypeMarker;
    }

    public int size(TypeArgumentListMarker typeArgumentListMarker) {
        return DefaultImpls.size(this, typeArgumentListMarker);
    }

    public abstract SupertypesPolicy substitutionSupertypePolicy(SimpleTypeMarker simpleTypeMarker);

    public TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.typeConstructor(this, kotlinTypeMarker);
    }

    public SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        return DefaultImpls.upperBoundIfFlexible(this, kotlinTypeMarker);
    }
}
