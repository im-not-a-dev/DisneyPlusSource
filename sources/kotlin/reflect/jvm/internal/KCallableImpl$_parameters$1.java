package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KParameter;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_parameters$1 extends C12881k implements Function0<ArrayList<KParameter>> {
    final /* synthetic */ KCallableImpl this$0;

    KCallableImpl$_parameters$1(KCallableImpl kCallableImpl) {
        this.this$0 = kCallableImpl;
        super(0);
    }

    public final ArrayList<KParameter> invoke() {
        int i;
        final CallableMemberDescriptor descriptor = this.this$0.getDescriptor();
        ArrayList<KParameter> arrayList = new ArrayList<>();
        final int i2 = 0;
        if (!this.this$0.isBound()) {
            final ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
            if (instanceReceiverParameter != null) {
                arrayList.add(new KParameterImpl(this.this$0, 0, Kind.INSTANCE, new Function0<ReceiverParameterDescriptor>() {
                    public final ReceiverParameterDescriptor invoke() {
                        return instanceReceiverParameter;
                    }
                }));
                i = 1;
            } else {
                i = 0;
            }
            final ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                int i3 = i + 1;
                arrayList.add(new KParameterImpl(this.this$0, i, Kind.EXTENSION_RECEIVER, new Function0<ReceiverParameterDescriptor>() {
                    public final ReceiverParameterDescriptor invoke() {
                        return extensionReceiverParameter;
                    }
                }));
                i = i3;
            }
        } else {
            i = 0;
        }
        List valueParameters = descriptor.getValueParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "descriptor.valueParameters");
        int size = valueParameters.size();
        while (i2 < size) {
            int i4 = i + 1;
            arrayList.add(new KParameterImpl(this.this$0, i, Kind.VALUE, new Function0<ValueParameterDescriptor>() {
                public final ValueParameterDescriptor invoke() {
                    Object obj = descriptor.getValueParameters().get(i2);
                    Intrinsics.checkReturnedValueIsNotNull(obj, "descriptor.valueParameters[i]");
                    return (ValueParameterDescriptor) obj;
                }
            }));
            i2++;
            i = i4;
        }
        if (this.this$0.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            C13194s.m40541a(arrayList, new KCallableImpl$_parameters$1$$special$$inlined$sortBy$1());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
