package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: JavaAnnotationMapper.kt */
public class JavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    private final JavaAnnotationArgument firstArgument;
    private final FqName fqName;
    private final boolean isIdeExternalAnnotation;
    private final SourceElement source;
    private final NotNullLazyValue type$delegate;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JavaAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r2, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation r3, kotlin.reflect.jvm.internal.impl.name.FqName r4) {
        /*
            r1 = this;
            r1.<init>()
            r1.fqName = r4
            if (r3 == 0) goto L_0x0016
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r4 = r2.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory r4 = r4.getSourceElementFactory()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement r4 = r4.source(r3)
            if (r4 == 0) goto L_0x0016
            goto L_0x001d
        L_0x0016:
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r4 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            java.lang.String r0 = "SourceElement.NO_SOURCE"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
        L_0x001d:
            r1.source = r4
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r4 = r2.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2 r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r2 = r4.createLazyValue(r0)
            r1.type$delegate = r2
            if (r3 == 0) goto L_0x003d
            java.util.Collection r2 = r3.getArguments()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = kotlin.p590y.C13199w.m40590g(r2)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) r2
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            r1.firstArgument = r2
            r2 = 1
            if (r3 == 0) goto L_0x004a
            boolean r3 = r3.isIdeExternalAnnotation()
            if (r3 != r2) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.isIdeExternalAnnotation = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor.<init>(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation, kotlin.reflect.jvm.internal.impl.name.FqName):void");
    }

    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return C13173j0.m40350a();
    }

    /* access modifiers changed from: protected */
    public final JavaAnnotationArgument getFirstArgument() {
        return this.firstArgument;
    }

    public FqName getFqName() {
        return this.fqName;
    }

    public SourceElement getSource() {
        return this.source;
    }

    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }
}
