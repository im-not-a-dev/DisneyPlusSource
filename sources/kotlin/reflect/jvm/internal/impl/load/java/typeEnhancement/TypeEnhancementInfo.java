package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;

/* compiled from: predefinedEnhancementInfo.kt */
public final class TypeEnhancementInfo {
    private final Map<Integer, JavaTypeQualifiers> map;

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map2) {
        this.map = map2;
    }

    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.map;
    }
}
