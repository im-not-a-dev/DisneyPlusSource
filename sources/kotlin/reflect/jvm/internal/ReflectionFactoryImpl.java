package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C12863c;
import kotlin.jvm.internal.C12878h;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12882l;
import kotlin.jvm.internal.C12883m;
import kotlin.jvm.internal.C12885o;
import kotlin.jvm.internal.C12888r;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12892v;
import kotlin.jvm.internal.C12896z;
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
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

public class ReflectionFactoryImpl extends C12896z {
    public static void clearCaches() {
        KClassCacheKt.clearKClassCache();
        ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }

    private static KDeclarationContainerImpl getOwner(C12863c cVar) {
        KDeclarationContainer owner = cVar.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    public KClass createKotlinClass(Class cls) {
        return new KClassImpl(cls);
    }

    public KFunction function(C12879i iVar) {
        return new KFunctionImpl(getOwner(iVar), iVar.getName(), iVar.getSignature(), iVar.getBoundReceiver());
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return KClassCacheKt.getOrCreateKotlinClass(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    public KMutableProperty0 mutableProperty0(C12882l lVar) {
        return new KMutableProperty0Impl(getOwner(lVar), lVar.getName(), lVar.getSignature(), lVar.getBoundReceiver());
    }

    public KMutableProperty1 mutableProperty1(C12883m mVar) {
        return new KMutableProperty1Impl(getOwner(mVar), mVar.getName(), mVar.getSignature(), mVar.getBoundReceiver());
    }

    public KMutableProperty2 mutableProperty2(C12885o oVar) {
        return new KMutableProperty2Impl(getOwner(oVar), oVar.getName(), oVar.getSignature());
    }

    public KProperty0 property0(C12888r rVar) {
        return new KProperty0Impl(getOwner(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    public KProperty1 property1(C12890t tVar) {
        return new KProperty1Impl(getOwner(tVar), tVar.getName(), tVar.getSignature(), tVar.getBoundReceiver());
    }

    public KProperty2 property2(C12892v vVar) {
        return new KProperty2Impl(getOwner(vVar), vVar.getName(), vVar.getSignature());
    }

    public String renderLambdaToString(C12881k kVar) {
        return renderLambdaToString((C12878h) kVar);
    }

    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return KClassifiers.createType(kClassifier, list, z, Collections.emptyList());
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new KClassImpl(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return KClassCacheKt.getOrCreateKotlinClass(cls);
    }

    public String renderLambdaToString(C12878h hVar) {
        KFunction reflect = ReflectLambdaKt.reflect(hVar);
        if (reflect != null) {
            KFunctionImpl asKFunctionImpl = UtilKt.asKFunctionImpl(reflect);
            if (asKFunctionImpl != null) {
                return ReflectionObjectRenderer.INSTANCE.renderLambda(asKFunctionImpl.getDescriptor());
            }
        }
        return super.renderLambdaToString(hVar);
    }
}
