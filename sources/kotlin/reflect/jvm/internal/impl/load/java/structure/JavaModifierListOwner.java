package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* compiled from: javaElements.kt */
public interface JavaModifierListOwner extends JavaElement {
    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isStatic();
}
