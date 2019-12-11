package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Member;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$defaultCaller$2 extends C12881k implements Function0<Caller<? extends Member>> {
    final /* synthetic */ KFunctionImpl this$0;

    KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        this.this$0 = kFunctionImpl;
        super(0);
    }

    public final Caller<Member> invoke() {
        Object obj;
        Caller caller;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        Caller<Member> caller2 = null;
        if (mapSignature instanceof KotlinFunction) {
            KDeclarationContainerImpl container = this.this$0.getContainer();
            KotlinFunction kotlinFunction = (KotlinFunction) mapSignature;
            String methodName = kotlinFunction.getMethodName();
            String methodDesc = kotlinFunction.getMethodDesc();
            Member member = this.this$0.getCaller().getMember();
            if (member != null) {
                obj = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(member.getModifiers()));
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        } else if (mapSignature instanceof KotlinConstructor) {
            if (this.this$0.isAnnotationConstructor()) {
                Class jClass = this.this$0.getContainer().getJClass();
                List<KParameter> parameters = this.this$0.getParameters();
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    if (name2 != null) {
                        arrayList.add(name2);
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                AnnotationConstructorCaller annotationConstructorCaller = new AnnotationConstructorCaller(jClass, arrayList, CallMode.CALL_BY_NAME, Origin.KOTLIN, null, 16, null);
                return annotationConstructorCaller;
            }
            obj = this.this$0.getContainer().findDefaultConstructor(((KotlinConstructor) mapSignature).getConstructorDesc());
        } else if (mapSignature instanceof FakeJavaAnnotationConstructor) {
            List<Method> methods = ((FakeJavaAnnotationConstructor) mapSignature).getMethods();
            Class jClass2 = this.this$0.getContainer().getJClass();
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) methods, 10));
            for (Method method : methods) {
                Intrinsics.checkReturnedValueIsNotNull((Object) method, "it");
                arrayList2.add(method.getName());
            }
            AnnotationConstructorCaller annotationConstructorCaller2 = new AnnotationConstructorCaller(jClass2, arrayList2, CallMode.CALL_BY_NAME, Origin.JAVA, methods);
            return annotationConstructorCaller2;
        } else {
            obj = null;
        }
        if (obj instanceof Constructor) {
            KFunctionImpl kFunctionImpl = this.this$0;
            caller = kFunctionImpl.createConstructorCaller((Constructor) obj, kFunctionImpl.getDescriptor());
        } else if (obj instanceof Method) {
            if (this.this$0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor containingDeclaration = this.this$0.getDescriptor().getContainingDeclaration();
                if (containingDeclaration == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                } else if (!((ClassDescriptor) containingDeclaration).isCompanionObject()) {
                    caller = this.this$0.createJvmStaticInObjectCaller((Method) obj);
                }
            }
            caller = this.this$0.createStaticMethodCaller((Method) obj);
        } else {
            caller = null;
        }
        if (caller != null) {
            caller2 = InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(caller, this.this$0.getDescriptor(), true);
        }
        return caller2;
    }
}
