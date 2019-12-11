package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface ReflectJavaModifierListOwner extends JavaModifierListOwner {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class DefaultImpls {
        public static Visibility getVisibility(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            Visibility visibility;
            int modifiers = reflectJavaModifierListOwner.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                Visibility visibility2 = Visibilities.PUBLIC;
                C12880j.m40222a((Object) visibility2, "Visibilities.PUBLIC");
                return visibility2;
            } else if (Modifier.isPrivate(modifiers)) {
                Visibility visibility3 = Visibilities.PRIVATE;
                C12880j.m40222a((Object) visibility3, "Visibilities.PRIVATE");
                return visibility3;
            } else if (Modifier.isProtected(modifiers)) {
                if (Modifier.isStatic(modifiers)) {
                    visibility = JavaVisibilities.PROTECTED_STATIC_VISIBILITY;
                } else {
                    visibility = JavaVisibilities.PROTECTED_AND_PACKAGE;
                }
                C12880j.m40222a((Object) visibility, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return visibility;
            } else {
                Visibility visibility4 = JavaVisibilities.PACKAGE_VISIBILITY;
                C12880j.m40222a((Object) visibility4, "JavaVisibilities.PACKAGE_VISIBILITY");
                return visibility4;
            }
        }

        public static boolean isAbstract(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isAbstract(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isFinal(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isFinal(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isStatic(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isStatic(reflectJavaModifierListOwner.getModifiers());
        }
    }

    int getModifiers();
}
