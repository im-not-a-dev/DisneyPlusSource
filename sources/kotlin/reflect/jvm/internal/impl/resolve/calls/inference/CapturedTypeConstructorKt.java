package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorKt {
    /* access modifiers changed from: private */
    public static final TypeProjection createCapturedIfNeeded(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        TypeProjectionImpl typeProjectionImpl;
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (typeProjection.isStarProjection()) {
            StorageManager storageManager = LockBasedStorageManager.NO_LOCKS;
            C12880j.m40222a((Object) storageManager, "LockBasedStorageManager.NO_LOCKS");
            typeProjectionImpl = new TypeProjectionImpl(new LazyWrappedType(storageManager, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(typeProjection)));
        } else {
            typeProjectionImpl = new TypeProjectionImpl(typeProjection.getType());
        }
        return typeProjectionImpl;
    }

    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        CapturedType capturedType = new CapturedType(typeProjection, null, false, null, 14, null);
        return capturedType;
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(TypeSubstitution typeSubstitution, boolean z) {
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(typeSubstitution, z, typeSubstitution);
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        List<Pair> a = C13174k.m40377a((Object[]) indexedParametersSubstitution.getArguments(), (Object[]) indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (Pair pair : a) {
            arrayList.add(createCapturedIfNeeded((TypeProjection) pair.mo31015c(), (TypeParameterDescriptor) pair.mo31016d()));
        }
        Object[] array = arrayList.toArray(new TypeProjection[0]);
        if (array != null) {
            return new IndexedParametersSubstitution(parameters, (TypeProjection[]) array, z);
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }
}
