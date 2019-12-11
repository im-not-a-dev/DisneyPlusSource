package kotlin.reflect.jvm;

import kotlin.C12730d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, mo31007d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: reflectLambda.kt */
public final class ReflectLambdaKt {
    public static final <R> KFunction<R> reflect(C12730d<? extends R> dVar) {
        Metadata metadata = (Metadata) dVar.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d1 = metadata.mo31006d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                Pair readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.mo31007d2());
                JvmNameResolver jvmNameResolver = (JvmNameResolver) readFunctionDataFrom.mo31013a();
                Function function = (Function) readFunctionDataFrom.mo31014b();
                int[] mv = metadata.mo31009mv();
                if ((metadata.mo31011xi() & 8) == 0) {
                    z = false;
                }
                JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(mv, z);
                Class cls = dVar.getClass();
                TypeTable typeTable = function.getTypeTable();
                Intrinsics.checkReturnedValueIsNotNull((Object) typeTable, "proto.typeTable");
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) UtilKt.deserializeToDescriptor(cls, function, jvmNameResolver, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), jvmMetadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE);
                if (simpleFunctionDescriptor != null) {
                    return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, simpleFunctionDescriptor);
                }
            }
        }
        return null;
    }
}
