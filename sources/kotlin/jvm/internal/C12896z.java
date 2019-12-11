package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* renamed from: kotlin.jvm.internal.z */
/* compiled from: ReflectionFactory */
public class C12896z {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KClass createKotlinClass(Class cls) {
        return new C12868e(cls);
    }

    public KFunction function(C12879i iVar) {
        return iVar;
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new C12868e(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new C12887q(cls, str);
    }

    public KMutableProperty0 mutableProperty0(C12882l lVar) {
        return lVar;
    }

    public KMutableProperty1 mutableProperty1(C12883m mVar) {
        return mVar;
    }

    public KMutableProperty2 mutableProperty2(C12885o oVar) {
        return oVar;
    }

    public KProperty0 property0(C12888r rVar) {
        return rVar;
    }

    public KProperty1 property1(C12890t tVar) {
        return tVar;
    }

    public KProperty2 property2(C12892v vVar) {
        return vVar;
    }

    public String renderLambdaToString(C12881k kVar) {
        return renderLambdaToString((C12878h) kVar);
    }

    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return new C12869e0(kClassifier, list, z);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new C12868e(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return new C12868e(cls);
    }

    public String renderLambdaToString(C12878h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(KOTLIN_JVM_FUNCTIONS) ? obj.substring(21) : obj;
    }
}
