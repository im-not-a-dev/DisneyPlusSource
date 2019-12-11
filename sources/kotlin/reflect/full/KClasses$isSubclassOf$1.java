package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
final /* synthetic */ class KClasses$isSubclassOf$1 extends C12890t {
    public static final KProperty1 INSTANCE = new KClasses$isSubclassOf$1();

    KClasses$isSubclassOf$1() {
    }

    public Object get(Object obj) {
        return KClasses.getSuperclasses((KClass) obj);
    }

    public String getName() {
        return "superclasses";
    }

    public KDeclarationContainer getOwner() {
        return C12895y.m40231a(KClasses.class, "kotlin-reflection");
    }

    public String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
