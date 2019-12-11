package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$2 extends C12881k implements Function1<KotlinType, List<? extends String>> {
    final /* synthetic */ DescriptorRenderer $renderer;

    RawTypeImpl$render$2(DescriptorRenderer descriptorRenderer) {
        this.$renderer = descriptorRenderer;
        super(1);
    }

    public final List<String> invoke(KotlinType kotlinType) {
        List<TypeProjection> arguments = kotlinType.getArguments();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) arguments, 10));
        for (TypeProjection renderTypeProjection : arguments) {
            arrayList.add(this.$renderer.renderTypeProjection(renderTypeProjection));
        }
        return arrayList;
    }
}
