package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* compiled from: javaTypes.kt */
public interface JavaWildcardType extends JavaType {
    JavaType getBound();

    boolean isExtends();
}
