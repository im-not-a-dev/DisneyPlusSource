package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C12863c;
import kotlin.jvm.internal.C12878h;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenBoundConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.BoundConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J&\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0013\u0010;\u001a\u00020)2\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010=\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", "", "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl extends KCallableImpl<Object> implements C12878h<Object>, KFunction<Object>, FunctionWithAllInvokes {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final LazyVal caller$delegate;
    private final KDeclarationContainerImpl container;
    private final LazyVal defaultCaller$delegate;
    private final LazySoftVal descriptor$delegate;
    private final Object rawBoundReceiver;
    /* access modifiers changed from: private */
    public final String signature;

    static {
        Class<KFunctionImpl> cls = KFunctionImpl.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            obj = C12863c.NO_RECEIVER;
        }
        this(kDeclarationContainerImpl, str, str2, functionDescriptor, obj);
    }

    /* access modifiers changed from: private */
    public final CallerImpl<Constructor<?>> createConstructorCaller(Constructor<?> constructor, FunctionDescriptor functionDescriptor) {
        if (InlineClassManglingRulesKt.shouldHideConstructorDueToInlineClassTypeValueParameters(functionDescriptor)) {
            if (isBound()) {
                return new AccessorForHiddenBoundConstructor(constructor, getBoundReceiver());
            }
            return new AccessorForHiddenConstructor(constructor);
        } else if (isBound()) {
            return new BoundConstructor(constructor, getBoundReceiver());
        } else {
            return new CallerImpl.Constructor(constructor);
        }
    }

    /* access modifiers changed from: private */
    public final Method createInstanceMethodCaller(java.lang.reflect.Method method) {
        return isBound() ? new BoundInstance(method, getBoundReceiver()) : new Instance(method);
    }

    /* access modifiers changed from: private */
    public final Method createJvmStaticInObjectCaller(java.lang.reflect.Method method) {
        return isBound() ? new BoundJvmStaticInObject(method) : new JvmStaticInObject(method);
    }

    /* access modifiers changed from: private */
    public final Method createStaticMethodCaller(java.lang.reflect.Method method) {
        return isBound() ? new BoundStatic(method, getBoundReceiver()) : new Static(method);
    }

    private final Object getBoundReceiver() {
        return InlineClassAwareCallerKt.coerceToExpectedReceiverType(this.rawBoundReceiver, getDescriptor());
    }

    public boolean equals(Object obj) {
        KFunctionImpl asKFunctionImpl = UtilKt.asKFunctionImpl(obj);
        if (asKFunctionImpl == null || !C12880j.m40224a((Object) getContainer(), (Object) asKFunctionImpl.getContainer()) || !C12880j.m40224a((Object) getName(), (Object) asKFunctionImpl.getName()) || !C12880j.m40224a((Object) this.signature, (Object) asKFunctionImpl.signature) || !C12880j.m40224a(this.rawBoundReceiver, asKFunctionImpl.rawBoundReceiver)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return CallerKt.getArity(getCaller());
    }

    public Caller<?> getCaller() {
        return (Caller) this.caller$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    public Caller<?> getDefaultCaller() {
        return (Caller) this.defaultCaller$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public FunctionDescriptor getDescriptor() {
        return (FunctionDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public String getName() {
        String asString = getDescriptor().getName().asString();
        C12880j.m40222a((Object) asString, "descriptor.name.asString()");
        return asString;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public Object invoke() {
        return DefaultImpls.invoke(this);
    }

    public boolean isBound() {
        return !C12880j.m40224a(this.rawBoundReceiver, C12863c.NO_RECEIVER);
    }

    public boolean isExternal() {
        return getDescriptor().isExternal();
    }

    public boolean isInfix() {
        return getDescriptor().isInfix();
    }

    public boolean isInline() {
        return getDescriptor().isInline();
    }

    public boolean isOperator() {
        return getDescriptor().isOperator();
    }

    public boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderFunction(getDescriptor());
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor$delegate = ReflectProperties.lazySoft(functionDescriptor, new KFunctionImpl$descriptor$2(this, str));
        this.caller$delegate = ReflectProperties.lazy(new KFunctionImpl$caller$2(this));
        this.defaultCaller$delegate = ReflectProperties.lazy(new KFunctionImpl$defaultCaller$2(this));
    }

    public Object invoke(Object obj) {
        return DefaultImpls.invoke(this, obj);
    }

    public Object invoke(Object obj, Object obj2) {
        return DefaultImpls.invoke(this, obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return DefaultImpls.invoke(this, obj, obj2, obj3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4);
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5);
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, FunctionDescriptor functionDescriptor) {
        String asString = functionDescriptor.getName().asString();
        C12880j.m40222a((Object) asString, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, asString, RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor).asString(), functionDescriptor, null, 16, null);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
