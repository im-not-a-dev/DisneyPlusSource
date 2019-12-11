package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* compiled from: AbstractTypeChecker.kt */
final class AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1 extends C12881k implements Function2<SimpleTypeMarker, SimpleTypeMarker, Boolean> {
    final /* synthetic */ AbstractTypeCheckerContext $this_checkSubtypeForIntegerLiteralType;

    AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1(AbstractTypeCheckerContext abstractTypeCheckerContext) {
        this.$this_checkSubtypeForIntegerLiteralType = abstractTypeCheckerContext;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((SimpleTypeMarker) obj, (SimpleTypeMarker) obj2));
    }

    public final boolean invoke(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        Collection<KotlinTypeMarker> possibleIntegerTypes = this.$this_checkSubtypeForIntegerLiteralType.possibleIntegerTypes(simpleTypeMarker);
        if ((possibleIntegerTypes instanceof Collection) && possibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker typeConstructor : possibleIntegerTypes) {
            if (C12880j.m40224a((Object) this.$this_checkSubtypeForIntegerLiteralType.typeConstructor(typeConstructor), (Object) this.$this_checkSubtypeForIntegerLiteralType.typeConstructor(simpleTypeMarker2))) {
                return true;
            }
        }
        return false;
    }
}
