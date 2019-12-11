package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 */
/* compiled from: signatureEnhancement.kt */
final class C13009x28f4b533 extends C12881k implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ JavaTypeQualifiers[] $computedResult;

    C13009x28f4b533(JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.$computedResult = javaTypeQualifiersArr;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final JavaTypeQualifiers invoke(int i) {
        JavaTypeQualifiers[] javaTypeQualifiersArr = this.$computedResult;
        return (i < 0 || i > C13174k.m40407g(javaTypeQualifiersArr)) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i];
    }
}
