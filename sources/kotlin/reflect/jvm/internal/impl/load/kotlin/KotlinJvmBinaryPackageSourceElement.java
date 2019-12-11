package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {
    private final LazyJavaPackageFragment packageFragment;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.packageFragment = lazyJavaPackageFragment;
    }

    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C12880j.m40222a((Object) sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.packageFragment);
        sb.append(": ");
        sb.append(this.packageFragment.getBinaryClasses$descriptors_jvm().keySet());
        return sb.toString();
    }
}
