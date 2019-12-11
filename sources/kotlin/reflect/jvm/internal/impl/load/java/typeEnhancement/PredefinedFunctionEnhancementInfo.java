package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedFunctionEnhancementInfo {
    private final List<TypeEnhancementInfo> parametersInfo;
    private final TypeEnhancementInfo returnTypeInfo;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, 3, null);
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List<TypeEnhancementInfo> list) {
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = list;
    }

    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }

    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            typeEnhancementInfo = null;
        }
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        this(typeEnhancementInfo, list);
    }
}
