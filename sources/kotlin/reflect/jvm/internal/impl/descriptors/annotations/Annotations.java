package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: Annotations.kt */
public interface Annotations extends Iterable<AnnotationDescriptor>, C12872a {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Annotations.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Annotations EMPTY = new Annotations$Companion$EMPTY$1();

        private Companion() {
        }

        public final Annotations create(List<? extends AnnotationDescriptor> list) {
            return list.isEmpty() ? EMPTY : new AnnotationsImpl(list);
        }

        public final Annotations getEMPTY() {
            return EMPTY;
        }
    }

    /* compiled from: Annotations.kt */
    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            Object obj;
            Iterator it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12880j.m40224a((Object) ((AnnotationDescriptor) obj).getFqName(), (Object) fqName)) {
                    break;
                }
            }
            return (AnnotationDescriptor) obj;
        }

        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            return annotations.findAnnotation(fqName) != null;
        }
    }

    AnnotationDescriptor findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();
}
