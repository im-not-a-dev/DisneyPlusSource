package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 */
/* compiled from: signatureEnhancement.kt */
final class C13011x4a76798a extends C12881k implements Function2<T, T, T> {
    public static final C13011x4a76798a INSTANCE = new C13011x4a76798a();

    C13011x4a76798a() {
        super(2);
    }

    public final <T> T invoke(T t, T t2) {
        if (t == null || t2 == null || C12880j.m40224a((Object) t, (Object) t2)) {
            return t != null ? t : t2;
        }
        return null;
    }
}
