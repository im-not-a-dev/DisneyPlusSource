package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: JvmMemberSignature.kt */
public abstract class JvmMemberSignature {

    /* compiled from: JvmMemberSignature.kt */
    public static final class Field extends JvmMemberSignature {
        private final String desc;
        private final String name;

        public Field(String str, String str2) {
            super(null);
            this.name = str;
            this.desc = str2;
        }

        public String asString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getName());
            sb.append(':');
            sb.append(getDesc());
            return sb.toString();
        }

        public final String component1() {
            return getName();
        }

        public final String component2() {
            return getDesc();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getDesc(), (java.lang.Object) r3.getDesc()) != false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0027
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field
                if (r0 == 0) goto L_0x0025
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field) r3
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = r3.getName()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0025
                java.lang.String r0 = r2.getDesc()
                java.lang.String r3 = r3.getDesc()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r3 = 0
                return r3
            L_0x0027:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field.equals(java.lang.Object):boolean");
        }

        public String getDesc() {
            return this.desc;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String name2 = getName();
            int i = 0;
            int hashCode = (name2 != null ? name2.hashCode() : 0) * 31;
            String desc2 = getDesc();
            if (desc2 != null) {
                i = desc2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class Method extends JvmMemberSignature {
        private final String desc;
        private final String name;

        public Method(String str, String str2) {
            super(null);
            this.name = str;
            this.desc = str2;
        }

        public String asString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getName());
            sb.append(getDesc());
            return sb.toString();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getDesc(), (java.lang.Object) r3.getDesc()) != false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0027
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method
                if (r0 == 0) goto L_0x0025
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Method r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) r3
                java.lang.String r0 = r2.getName()
                java.lang.String r1 = r3.getName()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0025
                java.lang.String r0 = r2.getDesc()
                java.lang.String r3 = r3.getDesc()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r3 = 0
                return r3
            L_0x0027:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method.equals(java.lang.Object):boolean");
        }

        public String getDesc() {
            return this.desc;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String name2 = getName();
            int i = 0;
            int hashCode = (name2 != null ? name2.hashCode() : 0) * 31;
            String desc2 = getDesc();
            if (desc2 != null) {
                i = desc2.hashCode();
            }
            return hashCode + i;
        }
    }

    private JvmMemberSignature() {
    }

    public abstract String asString();

    public abstract String getDesc();

    public abstract String getName();

    public final String toString() {
        return asString();
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
