package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: DescriptorRenderer.kt */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);
    
    public static final Set<DescriptorRendererModifier> ALL = null;
    public static final Companion Companion = null;
    public static final Set<DescriptorRendererModifier> DEFAULTS = null;
    private final boolean includeByDefault;

    /* compiled from: DescriptorRenderer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i;
        Companion = new Companion(null);
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : values) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        DEFAULTS = C13199w.m40609t(arrayList);
        ALL = C13174k.m40414n(values());
    }

    private DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }
}
