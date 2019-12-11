package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$toIndexed$1 extends C12881k implements Function2<KotlinType, LazyJavaResolverContext, C13145v> {
    final /* synthetic */ ArrayList $list;

    SignatureEnhancement$SignatureParts$toIndexed$1(ArrayList arrayList) {
        this.$list = arrayList;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((KotlinType) obj, (LazyJavaResolverContext) obj2);
        return C13145v.f29587a;
    }

    public final void invoke(KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext) {
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
        ArrayList arrayList = this.$list;
        JavaTypeQualifiersByElementType defaultTypeQualifiers = copyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
        arrayList.add(new TypeAndDefaultQualifiers(kotlinType, defaultTypeQualifiers != null ? defaultTypeQualifiers.get(QualifierApplicabilityType.TYPE_USE) : null));
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            String str = "arg.type";
            if (typeProjection.isStarProjection()) {
                ArrayList arrayList2 = this.$list;
                KotlinType type = typeProjection.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, str);
                arrayList2.add(new TypeAndDefaultQualifiers(type, null));
            } else {
                KotlinType type2 = typeProjection.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type2, str);
                invoke(type2, copyWithNewDefaultTypeQualifiers);
            }
        }
    }
}
