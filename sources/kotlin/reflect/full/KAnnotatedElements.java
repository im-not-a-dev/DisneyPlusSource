package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.KAnnotatedElement;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\b¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\b¨\u0006\u0007"}, mo31007d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "hasAnnotation", "", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: KAnnotatedElements.kt */
public final class KAnnotatedElements {
    public static final /* synthetic */ <T extends Annotation> T findAnnotation(KAnnotatedElement kAnnotatedElement) {
        Iterator it = kAnnotatedElement.getAnnotations().iterator();
        if (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            C12880j.m40221a(3, "T");
            throw null;
        }
        C12880j.m40221a(1, "T?");
        throw null;
    }

    public static final /* synthetic */ <T extends Annotation> boolean hasAnnotation(KAnnotatedElement kAnnotatedElement) {
        Iterator it = kAnnotatedElement.getAnnotations().iterator();
        if (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            C12880j.m40221a(3, "T");
            throw null;
        }
        C12880j.m40221a(1, "T?");
        throw null;
    }
}
