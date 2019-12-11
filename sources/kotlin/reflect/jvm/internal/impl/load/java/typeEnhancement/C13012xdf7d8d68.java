package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 */
/* compiled from: signatureEnhancement.kt */
final class C13012xdf7d8d68 extends C12881k implements Function1<CallableMemberDescriptor, KotlinType> {

    /* renamed from: $p */
    final /* synthetic */ ValueParameterDescriptor f29566$p;

    C13012xdf7d8d68(ValueParameterDescriptor valueParameterDescriptor) {
        this.f29566$p = valueParameterDescriptor;
        super(1);
    }

    public final KotlinType invoke(CallableMemberDescriptor callableMemberDescriptor) {
        Object obj = callableMemberDescriptor.getValueParameters().get(this.f29566$p.getIndex());
        C12880j.m40222a(obj, "it.valueParameters[p.index]");
        KotlinType type = ((ValueParameterDescriptor) obj).getType();
        C12880j.m40222a((Object) type, "it.valueParameters[p.index].type");
        return type;
    }
}
