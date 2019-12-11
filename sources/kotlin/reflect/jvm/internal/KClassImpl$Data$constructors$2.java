package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$constructors$2 extends C12881k implements Function0<List<? extends KFunction<? extends T>>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$constructors$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final List<KFunction<T>> invoke() {
        Collection<ConstructorDescriptor> constructorDescriptors = KClassImpl.this.getConstructorDescriptors();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) constructorDescriptors, 10));
        for (ConstructorDescriptor kFunctionImpl : constructorDescriptors) {
            arrayList.add(new KFunctionImpl(KClassImpl.this, kFunctionImpl));
        }
        return arrayList;
    }
}
