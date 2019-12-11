package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: DescriptorRenderer.kt */
public final class ExcludedTypeAnnotations {
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();
    private static final Set<FqName> internalAnnotationsForResolve = C13188p0.m40533b(new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact"));

    private ExcludedTypeAnnotations() {
    }

    public final Set<FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
