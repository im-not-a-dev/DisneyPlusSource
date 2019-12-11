package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 */
/* compiled from: signatureEnhancement.kt */
final class C13010x4a767989 extends C12881k implements Function2<List<? extends FqName>, T, T> {
    final /* synthetic */ Annotations $composedAnnotation;

    C13010x4a767989(Annotations annotations) {
        this.$composedAnnotation = annotations;
        super(2);
    }

    public final <T> T invoke(List<FqName> list, T t) {
        boolean z;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.$composedAnnotation.findAnnotation((FqName) it.next()) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            return t;
        }
        return null;
    }
}
