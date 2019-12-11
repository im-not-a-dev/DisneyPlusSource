package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* compiled from: KotlinClassFinder.kt */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class Result {

        /* compiled from: KotlinClassFinder.kt */
        public static final class ClassFileContent extends Result {
            private final byte[] content;

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.content, (java.lang.Object) ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) r2).content) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent
                    if (r0 == 0) goto L_0x0013
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder$Result$ClassFileContent r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) r2
                    byte[] r0 = r1.content
                    byte[] r2 = r2.content
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent.equals(java.lang.Object):boolean");
            }

            public final byte[] getContent() {
                return this.content;
            }

            public int hashCode() {
                byte[] bArr = this.content;
                if (bArr != null) {
                    return Arrays.hashCode(bArr);
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ClassFileContent(content=");
                sb.append(Arrays.toString(this.content));
                sb.append(")");
                return sb.toString();
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class KotlinClass extends Result {
            private final KotlinJvmBinaryClass kotlinJvmBinaryClass;

            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass2) {
                super(null);
                this.kotlinJvmBinaryClass = kotlinJvmBinaryClass2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.kotlinJvmBinaryClass, (java.lang.Object) ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) r2).kotlinJvmBinaryClass) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass
                    if (r0 == 0) goto L_0x0013
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder$Result$KotlinClass r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) r2
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r0 = r1.kotlinJvmBinaryClass
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r2 = r2.kotlinJvmBinaryClass
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass.equals(java.lang.Object):boolean");
            }

            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.kotlinJvmBinaryClass;
            }

            public int hashCode() {
                KotlinJvmBinaryClass kotlinJvmBinaryClass2 = this.kotlinJvmBinaryClass;
                if (kotlinJvmBinaryClass2 != null) {
                    return kotlinJvmBinaryClass2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("KotlinClass(kotlinJvmBinaryClass=");
                sb.append(this.kotlinJvmBinaryClass);
                sb.append(")");
                return sb.toString();
            }
        }

        private Result() {
        }

        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = (KotlinClass) (!(this instanceof KotlinClass) ? null : this);
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    Result findKotlinClassOrContent(JavaClass javaClass);

    Result findKotlinClassOrContent(ClassId classId);
}
