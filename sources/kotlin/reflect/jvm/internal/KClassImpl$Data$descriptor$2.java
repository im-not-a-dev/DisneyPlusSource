package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$descriptor$2 extends C12881k implements Function0<ClassDescriptor> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$descriptor$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final ClassDescriptor invoke() {
        ClassDescriptor classDescriptor;
        ClassId access$getClassId$p = KClassImpl.this.getClassId();
        RuntimeModuleData moduleData = ((Data) KClassImpl.this.getData().invoke()).getModuleData();
        if (access$getClassId$p.isLocal()) {
            classDescriptor = moduleData.getDeserialization().deserializeClass(access$getClassId$p);
        } else {
            classDescriptor = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), access$getClassId$p);
        }
        if (classDescriptor != null) {
            return classDescriptor;
        }
        KClassImpl.this.reportUnresolvedClass();
        throw null;
    }
}
