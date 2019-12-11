package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KDeclarationContainerImpl.kt */
final class KDeclarationContainerImpl$Data$moduleData$2 extends C12881k implements Function0<RuntimeModuleData> {
    final /* synthetic */ Data this$0;

    KDeclarationContainerImpl$Data$moduleData$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final RuntimeModuleData invoke() {
        return ModuleByClassLoaderKt.getOrCreateModule(KDeclarationContainerImpl.this.getJClass());
    }
}
