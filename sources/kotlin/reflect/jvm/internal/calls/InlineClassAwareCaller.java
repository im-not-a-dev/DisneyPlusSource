package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: InlineClassAwareCaller.kt */
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {
    private final Caller<M> caller;
    private final BoxUnboxData data;
    private final boolean isDefault;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class BoxUnboxData {
        private final C12757d argumentRange;
        private final Method box;
        private final Method[] unbox;

        public BoxUnboxData(C12757d dVar, Method[] methodArr, Method method) {
            this.argumentRange = dVar;
            this.unbox = methodArr;
            this.box = method;
        }

        public final C12757d component1() {
            return this.argumentRange;
        }

        public final Method[] component2() {
            return this.unbox;
        }

        public final Method component3() {
            return this.box;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if ((r0 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InlineClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8, kotlin.reflect.jvm.internal.calls.Caller<? extends M> r9, boolean r10) {
        /*
            r7 = this;
            r7.<init>()
            r7.caller = r9
            r7.isDefault = r10
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = r8.getReturnType()
            r10 = 0
            if (r9 == 0) goto L_0x0180
            java.lang.String r0 = "descriptor.returnType!!"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r9, r0)
            java.lang.Class r9 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass(r9)
            if (r9 == 0) goto L_0x001e
            java.lang.reflect.Method r9 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getBoxMethod(r9, r8)
            goto L_0x001f
        L_0x001e:
            r9 = r10
        L_0x001f:
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0036
            kotlin.h0.d$a r8 = kotlin.p586h0.C12757d.f29425Y
            kotlin.h0.d r8 = r8.mo31084a()
            java.lang.reflect.Method[] r10 = new java.lang.reflect.Method[r1]
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData r0 = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData
            r0.<init>(r8, r10, r9)
            r8 = r0
            goto L_0x012f
        L_0x0036:
            kotlin.reflect.jvm.internal.calls.Caller<M> r0 = r7.caller
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic
            java.lang.String r3 = "descriptor.containingDeclaration"
            r4 = -1
            if (r2 == 0) goto L_0x0040
            goto L_0x0067
        L_0x0040:
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r2 == 0) goto L_0x0049
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller
            if (r0 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0049:
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r8.getDispatchReceiverParameter()
            if (r0 == 0) goto L_0x0066
            kotlin.reflect.jvm.internal.calls.Caller<M> r0 = r7.caller
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller
            if (r0 != 0) goto L_0x0066
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r8.getContainingDeclaration()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(r0)
            if (r0 == 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r0 = 1
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            boolean r0 = r7.isDefault
            if (r0 == 0) goto L_0x006d
            r0 = 2
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5 = r8.getExtensionReceiverParameter()
            if (r5 == 0) goto L_0x007e
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            goto L_0x007f
        L_0x007e:
            r5 = r10
        L_0x007f:
            if (r5 == 0) goto L_0x0085
            r2.add(r5)
            goto L_0x00cd
        L_0x0085:
            boolean r5 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r5 == 0) goto L_0x00b3
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = r3.getConstructedClass()
            java.lang.String r5 = "descriptor.constructedClass"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r5)
            boolean r5 = r3.isInner()
            if (r5 == 0) goto L_0x00cd
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r3.getContainingDeclaration()
            if (r3 == 0) goto L_0x00ab
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.getDefaultType()
            r2.add(r3)
            goto L_0x00cd
        L_0x00ab:
            kotlin.s r8 = new kotlin.s
            java.lang.String r9 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r8.<init>(r9)
            throw r8
        L_0x00b3:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r5 = r8.getContainingDeclaration()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r3)
            boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r3 == 0) goto L_0x00cd
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r5
            boolean r3 = r5.isInline()
            if (r3 == 0) goto L_0x00cd
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r5.getDefaultType()
            r2.add(r3)
        L_0x00cd:
            java.util.List r3 = r8.getValueParameters()
            java.lang.String r5 = "descriptor.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00da:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ee
            java.lang.Object r5 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r5
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            r2.add(r5)
            goto L_0x00da
        L_0x00ee:
            int r3 = r2.size()
            int r3 = r3 + r4
            int r3 = r3 + r0
            int r0 = kotlin.reflect.jvm.internal.calls.CallerKt.getArity(r7)
            if (r0 != r3) goto L_0x0132
            int r0 = java.lang.Math.max(r4, r1)
            int r5 = r2.size()
            int r5 = r5 + r4
            kotlin.h0.d r0 = kotlin.p586h0.C12762h.m39920d(r0, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r3]
        L_0x0109:
            if (r1 >= r3) goto L_0x012a
            boolean r6 = r0.mo31083f(r1)
            if (r6 == 0) goto L_0x0124
            int r6 = r1 - r4
            java.lang.Object r6 = r2.get(r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r6
            java.lang.Class r6 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass(r6)
            if (r6 == 0) goto L_0x0124
            java.lang.reflect.Method r6 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getUnboxMethod(r6, r8)
            goto L_0x0125
        L_0x0124:
            r6 = r10
        L_0x0125:
            r5[r1] = r6
            int r1 = r1 + 1
            goto L_0x0109
        L_0x012a:
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData r8 = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData
            r8.<init>(r0, r5, r9)
        L_0x012f:
            r7.data = r8
            return
        L_0x0132:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r10.append(r0)
            int r0 = kotlin.reflect.jvm.internal.calls.CallerKt.getArity(r7)
            r10.append(r0)
            java.lang.String r0 = " != "
            r10.append(r0)
            r10.append(r3)
            r0 = 10
            r10.append(r0)
            java.lang.String r1 = "Calling: "
            r10.append(r1)
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = "Parameter types: "
            r10.append(r8)
            java.util.List r8 = r7.getParameterTypes()
            r10.append(r8)
            java.lang.String r8 = ")\n"
            r10.append(r8)
            java.lang.String r8 = "Default: "
            r10.append(r8)
            boolean r8 = r7.isDefault
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x0180:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.calls.Caller, boolean):void");
    }

    public Object call(Object[] objArr) {
        BoxUnboxData boxUnboxData = this.data;
        C12757d component1 = boxUnboxData.component1();
        Method[] component2 = boxUnboxData.component2();
        Method component3 = boxUnboxData.component3();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkReturnedValueIsNotNull((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        if (copyOf != null) {
            int b = component1.mo31070b();
            int c = component1.mo31071c();
            if (b <= c) {
                while (true) {
                    Method method = component2[b];
                    Object obj = objArr[b];
                    if (!(method == null || obj == null)) {
                        obj = method.invoke(obj, new Object[0]);
                    }
                    copyOf[b] = obj;
                    if (b == c) {
                        break;
                    }
                    b++;
                }
            }
            Object call = this.caller.call(copyOf);
            if (component3 == null) {
                return call;
            }
            Object invoke = component3.invoke(null, new Object[]{call});
            return invoke != null ? invoke : call;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public M getMember() {
        return this.caller.getMember();
    }

    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
