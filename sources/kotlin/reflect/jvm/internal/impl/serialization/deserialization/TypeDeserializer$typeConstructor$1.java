package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$typeConstructor$1 extends C12881k implements Function1<Integer, ClassDescriptor> {
    final /* synthetic */ Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$typeConstructor$1(TypeDeserializer typeDeserializer, Type type) {
        this.this$0 = typeDeserializer;
        this.$proto = type;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final ClassDescriptor invoke(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.this$0.f29576c.getNameResolver(), i);
        List h = C12788p.m40001h(C12788p.m39994d(C12781n.m39973a(this.$proto, (Function1<? super T, ? extends T>) new TypeDeserializer$typeConstructor$1$typeParametersCount$1<Object,Object>(this)), TypeDeserializer$typeConstructor$1$typeParametersCount$2.INSTANCE));
        int d = C12788p.m39993d(C12781n.m39973a(classId, (Function1<? super T, ? extends T>) TypeDeserializer$typeConstructor$1$classNestingLevel$1.INSTANCE));
        while (h.size() < d) {
            h.add(Integer.valueOf(0));
        }
        return this.this$0.f29576c.getComponents().getNotFoundClasses().getClass(classId, h);
    }
}
