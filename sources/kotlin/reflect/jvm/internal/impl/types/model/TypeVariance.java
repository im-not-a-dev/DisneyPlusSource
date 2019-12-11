package kotlin.reflect.jvm.internal.impl.types.model;

/* compiled from: TypeSystemContext.kt */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    private TypeVariance(String str) {
        this.presentation = str;
    }

    public String toString() {
        return this.presentation;
    }
}
