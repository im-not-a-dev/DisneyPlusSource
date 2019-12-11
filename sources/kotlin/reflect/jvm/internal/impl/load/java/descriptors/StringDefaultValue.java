package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: util.kt */
public final class StringDefaultValue extends AnnotationDefaultValue {
    private final String value;

    public StringDefaultValue(String str) {
        super(null);
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
