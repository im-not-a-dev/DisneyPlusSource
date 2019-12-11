package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty;
import kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty;
import kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$_javaField$1 extends C12881k implements Function0<Field> {
    final /* synthetic */ KPropertyImpl this$0;

    KPropertyImpl$_javaField$1(KPropertyImpl kPropertyImpl) {
        this.this$0 = kPropertyImpl;
        super(0);
    }

    public final Field invoke() {
        Class cls;
        JvmPropertySignature mapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(this.this$0.getDescriptor());
        if (mapPropertySignature instanceof KotlinProperty) {
            KotlinProperty kotlinProperty = (KotlinProperty) mapPropertySignature;
            PropertyDescriptor descriptor = kotlinProperty.getDescriptor();
            JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), false, 8, null);
            if (jvmFieldSignature$default == null) {
                return null;
            }
            if (JvmAbi.isPropertyWithBackingFieldInOuterClass(descriptor) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(kotlinProperty.getProto())) {
                cls = this.this$0.getContainer().getJClass().getEnclosingClass();
            } else {
                DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                if (containingDeclaration instanceof ClassDescriptor) {
                    cls = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
                } else {
                    cls = this.this$0.getContainer().getJClass();
                }
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(jvmFieldSignature$default.getName());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        } else if (mapPropertySignature instanceof JavaField) {
            return ((JavaField) mapPropertySignature).getField();
        } else {
            if ((mapPropertySignature instanceof JavaMethodProperty) || (mapPropertySignature instanceof MappedKotlinProperty)) {
                return null;
            }
            throw new C12898l();
        }
    }
}
