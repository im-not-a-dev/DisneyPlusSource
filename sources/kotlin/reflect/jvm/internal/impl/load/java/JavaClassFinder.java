package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JavaClassFinder.kt */
public interface JavaClassFinder {

    /* compiled from: JavaClassFinder.kt */
    public static final class Request {
        private final ClassId classId;
        private final JavaClass outerClass;
        private final byte[] previouslyFoundClassFileContent;

        public Request(ClassId classId2, byte[] bArr, JavaClass javaClass) {
            this.classId = classId2;
            this.previouslyFoundClassFileContent = bArr;
            this.outerClass = javaClass;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.outerClass, (java.lang.Object) r3.outerClass) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request
                if (r0 == 0) goto L_0x0027
                kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$Request r3 = (kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request) r3
                kotlin.reflect.jvm.internal.impl.name.ClassId r0 = r2.classId
                kotlin.reflect.jvm.internal.impl.name.ClassId r1 = r3.classId
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                byte[] r0 = r2.previouslyFoundClassFileContent
                byte[] r1 = r3.previouslyFoundClassFileContent
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r2.outerClass
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r3 = r3.outerClass
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request.equals(java.lang.Object):boolean");
        }

        public final ClassId getClassId() {
            return this.classId;
        }

        public int hashCode() {
            ClassId classId2 = this.classId;
            int i = 0;
            int hashCode = (classId2 != null ? classId2.hashCode() : 0) * 31;
            byte[] bArr = this.previouslyFoundClassFileContent;
            int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            JavaClass javaClass = this.outerClass;
            if (javaClass != null) {
                i = javaClass.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Request(classId=");
            sb.append(this.classId);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(Arrays.toString(this.previouslyFoundClassFileContent));
            sb.append(", outerClass=");
            sb.append(this.outerClass);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ Request(ClassId classId2, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            if ((i & 4) != 0) {
                javaClass = null;
            }
            this(classId2, bArr, javaClass);
        }
    }

    JavaClass findClass(Request request);

    JavaPackage findPackage(FqName fqName);

    Set<String> knownClassNamesInPackage(FqName fqName);
}
