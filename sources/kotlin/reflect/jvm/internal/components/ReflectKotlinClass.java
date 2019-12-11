package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", "location", "", "getLocation", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectKotlinClass.kt */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    public static final Factory Factory = new Factory(null);
    private final KotlinClassHeader classHeader;
    private final Class<?> klass;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¨\u0006\u0007"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "klass", "Ljava/lang/Class;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ReflectKotlinClass.kt */
    public static final class Factory {
        private Factory() {
        }

        public final ReflectKotlinClass create(Class<?> cls) {
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            ReflectClassStructure.INSTANCE.loadClassAnnotations(cls, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader createHeader = readKotlinClassHeaderAnnotationVisitor.createHeader();
            if (createHeader != null) {
                return new ReflectKotlinClass(cls, createHeader, null);
            }
            return null;
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.klass = cls;
        this.classHeader = kotlinClassHeader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectKotlinClass) && C12880j.m40224a((Object) this.klass, (Object) ((ReflectKotlinClass) obj).klass);
    }

    public KotlinClassHeader getClassHeader() {
        return this.classHeader;
    }

    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.klass);
    }

    public final Class<?> getKlass() {
        return this.klass;
    }

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.klass.getName();
        C12880j.m40222a((Object) name, "klass.name");
        sb.append(C12832w.m40115a(name, '.', '/', false, 4, (Object) null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public void loadClassAnnotations(AnnotationVisitor annotationVisitor, byte[] bArr) {
        ReflectClassStructure.INSTANCE.loadClassAnnotations(this.klass, annotationVisitor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectKotlinClass.class.getName());
        sb.append(": ");
        sb.append(this.klass);
        return sb.toString();
    }

    public void visitMembers(MemberVisitor memberVisitor, byte[] bArr) {
        ReflectClassStructure.INSTANCE.visitMembers(this.klass, memberVisitor);
    }

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }
}
