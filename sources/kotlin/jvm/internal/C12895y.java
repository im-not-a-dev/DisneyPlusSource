package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* renamed from: kotlin.jvm.internal.y */
/* compiled from: Reflection */
public class C12895y {

    /* renamed from: a */
    private static final C12896z f29535a;

    static {
        C12896z zVar = null;
        try {
            zVar = (C12896z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zVar == null) {
            zVar = new C12896z();
        }
        f29535a = zVar;
    }

    /* renamed from: a */
    public static KDeclarationContainer m40231a(Class cls, String str) {
        return f29535a.getOrCreateKotlinPackage(cls, str);
    }

    /* renamed from: a */
    public static KClass m40230a(Class cls) {
        return f29535a.getOrCreateKotlinClass(cls);
    }

    /* renamed from: a */
    public static String m40229a(C12881k kVar) {
        return f29535a.renderLambdaToString(kVar);
    }

    /* renamed from: a */
    public static String m40228a(C12878h hVar) {
        return f29535a.renderLambdaToString(hVar);
    }

    /* renamed from: a */
    public static KFunction m40232a(C12879i iVar) {
        return f29535a.function(iVar);
    }

    /* renamed from: a */
    public static KProperty0 m40234a(C12888r rVar) {
        return f29535a.property0(rVar);
    }

    /* renamed from: a */
    public static KProperty1 m40235a(C12890t tVar) {
        return f29535a.property1(tVar);
    }

    /* renamed from: a */
    public static KMutableProperty1 m40233a(C12883m mVar) {
        return f29535a.mutableProperty1(mVar);
    }
}
