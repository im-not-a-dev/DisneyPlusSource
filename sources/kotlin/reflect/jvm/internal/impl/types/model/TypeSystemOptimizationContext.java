package kotlin.reflect.jvm.internal.impl.types.model;

/* compiled from: TypeSystemContext.kt */
public interface TypeSystemOptimizationContext {

    /* compiled from: TypeSystemContext.kt */
    public static final class DefaultImpls {
        public static boolean identicalArguments(TypeSystemOptimizationContext typeSystemOptimizationContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            return false;
        }
    }

    boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2);
}
