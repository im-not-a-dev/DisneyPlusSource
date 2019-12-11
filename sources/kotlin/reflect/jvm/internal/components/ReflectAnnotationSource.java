package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectAnnotationSource;", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceElement;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "getContainingFile", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceFile;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectAnnotationSource.kt */
public final class ReflectAnnotationSource implements SourceElement {
    private final Annotation annotation;

    public ReflectAnnotationSource(Annotation annotation2) {
        this.annotation = annotation2;
    }

    public final Annotation getAnnotation() {
        return this.annotation;
    }

    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C12880j.m40222a((Object) sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }
}
