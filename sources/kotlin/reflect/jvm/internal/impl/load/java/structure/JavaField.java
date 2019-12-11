package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* compiled from: javaElements.kt */
public interface JavaField extends JavaMember {
    boolean getHasConstantNotNullInitializer();

    JavaType getType();

    boolean isEnumEntry();
}
