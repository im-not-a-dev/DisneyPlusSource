package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends C12881k implements Function0<Type> {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl$Data$supertypes$2 this$0;

    KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(KotlinType kotlinType, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        this.$kotlinType = kotlinType;
        this.this$0 = kClassImpl$Data$supertypes$2;
        super(0);
    }

    public final Type invoke() {
        ClassifierDescriptor declarationDescriptor = this.$kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class javaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (javaClass == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported superclass of ");
                sb.append(this.this$0.this$0);
                sb.append(": ");
                sb.append(declarationDescriptor);
                throw new KotlinReflectionInternalError(sb.toString());
            } else if (C12880j.m40224a((Object) KClassImpl.this.getJClass().getSuperclass(), (Object) javaClass)) {
                Type genericSuperclass = KClassImpl.this.getJClass().getGenericSuperclass();
                C12880j.m40222a((Object) genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class[] interfaces = KClassImpl.this.getJClass().getInterfaces();
                C12880j.m40222a((Object) interfaces, "jClass.interfaces");
                int c = C13174k.m40396c((Object[]) interfaces, (Object) javaClass);
                if (c >= 0) {
                    Type type = KClassImpl.this.getJClass().getGenericInterfaces()[c];
                    C12880j.m40222a((Object) type, "jClass.genericInterfaces[index]");
                    return type;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No superclass of ");
                sb2.append(this.this$0.this$0);
                sb2.append(" in Java reflection for ");
                sb2.append(declarationDescriptor);
                throw new KotlinReflectionInternalError(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Supertype not a class: ");
            sb3.append(declarationDescriptor);
            throw new KotlinReflectionInternalError(sb3.toString());
        }
    }
}
