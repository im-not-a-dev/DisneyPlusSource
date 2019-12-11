package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.C12898l;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method;

/* compiled from: MemberSignature.kt */
public final class MemberSignature {
    public static final Companion Companion = new Companion(null);
    private final String signature;

    /* compiled from: MemberSignature.kt */
    public static final class Companion {
        private Companion() {
        }

        public final MemberSignature fromFieldNameAndDesc(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(str2);
            return new MemberSignature(sb.toString(), null);
        }

        public final MemberSignature fromJvmMemberSignature(JvmMemberSignature jvmMemberSignature) {
            if (jvmMemberSignature instanceof Method) {
                return fromMethodNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            if (jvmMemberSignature instanceof Field) {
                return fromFieldNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            throw new C12898l();
        }

        public final MemberSignature fromMethod(NameResolver nameResolver, JvmMethodSignature jvmMethodSignature) {
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        public final MemberSignature fromMethodNameAndDesc(String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return new MemberSignature(sb.toString(), null);
        }

        public final MemberSignature fromMethodSignatureAndParameterIndex(MemberSignature memberSignature, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(memberSignature.getSignature$descriptors_jvm());
            sb.append('@');
            sb.append(i);
            return new MemberSignature(sb.toString(), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MemberSignature(String str) {
        this.signature = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.signature, (java.lang.Object) ((kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) r2).signature) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature
            if (r0 == 0) goto L_0x0013
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) r2
            java.lang.String r0 = r1.signature
            java.lang.String r2 = r2.signature
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.equals(java.lang.Object):boolean");
    }

    public final String getSignature$descriptors_jvm() {
        return this.signature;
    }

    public int hashCode() {
        String str = this.signature;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MemberSignature(signature=");
        sb.append(this.signature);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
