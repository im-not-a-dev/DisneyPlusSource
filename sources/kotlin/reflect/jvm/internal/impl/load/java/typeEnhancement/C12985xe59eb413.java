package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$14 */
/* compiled from: predefinedEnhancementInfo.kt */
final class C12985xe59eb413 extends C12881k implements Function1<FunctionEnhancementBuilder, C13145v> {
    final /* synthetic */ String $JFBiConsumer$inlined;
    final /* synthetic */ String $JFBiFunction$inlined;
    final /* synthetic */ String $JFConsumer$inlined;
    final /* synthetic */ String $JFFunction$inlined;
    final /* synthetic */ String $JFPredicate$inlined;
    final /* synthetic */ String $JFUnaryOperator$inlined;
    final /* synthetic */ String $JLObject$inlined;
    final /* synthetic */ String $JUOptional$inlined;
    final /* synthetic */ String $JUStream$inlined;
    final /* synthetic */ SignatureBuildingComponents $this_signatures$inlined;

    C12985xe59eb413(SignatureBuildingComponents signatureBuildingComponents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.$this_signatures$inlined = signatureBuildingComponents;
        this.$JFConsumer$inlined = str;
        this.$JFPredicate$inlined = str2;
        this.$JUStream$inlined = str3;
        this.$JFUnaryOperator$inlined = str4;
        this.$JFBiConsumer$inlined = str5;
        this.$JLObject$inlined = str6;
        this.$JFBiFunction$inlined = str7;
        this.$JFFunction$inlined = str8;
        this.$JUOptional$inlined = str9;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FunctionEnhancementBuilder) obj);
        return C13145v.f29587a;
    }

    public final void invoke(FunctionEnhancementBuilder functionEnhancementBuilder) {
        functionEnhancementBuilder.parameter(this.$JLObject$inlined, PredefinedEnhancementInfoKt.NOT_PLATFORM);
        functionEnhancementBuilder.parameter(this.$JFBiFunction$inlined, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_PLATFORM, PredefinedEnhancementInfoKt.NOT_NULLABLE, PredefinedEnhancementInfoKt.NULLABLE);
        functionEnhancementBuilder.returns(this.$JLObject$inlined, PredefinedEnhancementInfoKt.NULLABLE);
    }
}
