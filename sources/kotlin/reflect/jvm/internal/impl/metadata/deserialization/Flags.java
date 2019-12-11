package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;

public class Flags {
    public static final FlagField<Kind> CLASS_KIND = FlagField.after(MODALITY, Kind.values());
    public static final BooleanFlagField DECLARES_DEFAULT_VALUE = FlagField.booleanAfter(HAS_ANNOTATIONS);
    public static final BooleanFlagField HAS_ANNOTATIONS = FlagField.booleanFirst();
    public static final BooleanFlagField HAS_CONSTANT = FlagField.booleanAfter(IS_LATEINIT);
    public static final BooleanFlagField HAS_GETTER = FlagField.booleanAfter(IS_VAR);
    public static final BooleanFlagField HAS_SETTER = FlagField.booleanAfter(HAS_GETTER);
    public static final BooleanFlagField IS_CONST = FlagField.booleanAfter(HAS_SETTER);
    public static final BooleanFlagField IS_CROSSINLINE = FlagField.booleanAfter(DECLARES_DEFAULT_VALUE);
    public static final BooleanFlagField IS_DATA = FlagField.booleanAfter(IS_INNER);
    public static final BooleanFlagField IS_DELEGATED = FlagField.booleanAfter(IS_EXTERNAL_PROPERTY);
    public static final BooleanFlagField IS_EXPECT_CLASS = FlagField.booleanAfter(IS_EXTERNAL_CLASS);
    public static final BooleanFlagField IS_EXPECT_FUNCTION = FlagField.booleanAfter(IS_SUSPEND);
    public static final BooleanFlagField IS_EXPECT_PROPERTY = FlagField.booleanAfter(IS_DELEGATED);
    public static final BooleanFlagField IS_EXTERNAL_ACCESSOR = FlagField.booleanAfter(IS_NOT_DEFAULT);
    public static final BooleanFlagField IS_EXTERNAL_CLASS = FlagField.booleanAfter(IS_DATA);
    public static final BooleanFlagField IS_EXTERNAL_FUNCTION = FlagField.booleanAfter(IS_TAILREC);
    public static final BooleanFlagField IS_EXTERNAL_PROPERTY = FlagField.booleanAfter(HAS_CONSTANT);
    public static final BooleanFlagField IS_INFIX = FlagField.booleanAfter(IS_OPERATOR);
    public static final BooleanFlagField IS_INLINE = FlagField.booleanAfter(IS_INFIX);
    public static final BooleanFlagField IS_INLINE_ACCESSOR = FlagField.booleanAfter(IS_EXTERNAL_ACCESSOR);
    public static final BooleanFlagField IS_INLINE_CLASS = FlagField.booleanAfter(IS_EXPECT_CLASS);
    public static final BooleanFlagField IS_INNER = FlagField.booleanAfter(CLASS_KIND);
    public static final BooleanFlagField IS_LATEINIT = FlagField.booleanAfter(IS_CONST);
    public static final BooleanFlagField IS_NEGATED = FlagField.booleanFirst();
    public static final BooleanFlagField IS_NOINLINE = FlagField.booleanAfter(IS_CROSSINLINE);
    public static final BooleanFlagField IS_NOT_DEFAULT = FlagField.booleanAfter(MODALITY);
    public static final BooleanFlagField IS_NULL_CHECK_PREDICATE = FlagField.booleanAfter(IS_NEGATED);
    public static final BooleanFlagField IS_OPERATOR = FlagField.booleanAfter(MEMBER_KIND);
    public static final BooleanFlagField IS_SECONDARY = FlagField.booleanAfter(VISIBILITY);
    public static final BooleanFlagField IS_SUSPEND = FlagField.booleanAfter(IS_EXTERNAL_FUNCTION);
    public static final BooleanFlagField IS_TAILREC = FlagField.booleanAfter(IS_INLINE);
    public static final BooleanFlagField IS_UNSIGNED = FlagField.booleanFirst();
    public static final BooleanFlagField IS_VAR = FlagField.booleanAfter(MEMBER_KIND);
    public static final FlagField<MemberKind> MEMBER_KIND = FlagField.after(MODALITY, MemberKind.values());
    public static final FlagField<Modality> MODALITY = FlagField.after(VISIBILITY, Modality.values());
    public static final BooleanFlagField SUSPEND_TYPE = FlagField.booleanFirst();
    public static final FlagField<Visibility> VISIBILITY = FlagField.after(HAS_ANNOTATIONS, Visibility.values());

    public static class BooleanFlagField extends FlagField<Boolean> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        public BooleanFlagField(int i) {
            super(i, 1);
        }

        public Boolean get(int i) {
            boolean z = true;
            if ((i & (1 << this.offset)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null) {
                $$$reportNull$$$0(0);
            }
            return valueOf;
        }

        public int toFlags(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    private static class EnumLiteFlagField<E extends EnumLite> extends FlagField<E> {
        private final E[] values;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, bitWidth(eArr));
            this.values = eArr;
        }

        private static <E> int bitWidth(E[] eArr) {
            if (eArr == null) {
                $$$reportNull$$$0(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Empty enum: ");
            sb.append(eArr.getClass());
            throw new IllegalStateException(sb.toString());
        }

        public E get(int i) {
            E[] eArr;
            int i2 = (1 << this.bitWidth) - 1;
            int i3 = this.offset;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.values) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }

        public int toFlags(E e) {
            return e.getNumber() << this.offset;
        }
    }

    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        public static <E extends EnumLite> FlagField<E> after(FlagField<?> flagField, E[] eArr) {
            return new EnumLiteFlagField(flagField.offset + flagField.bitWidth, eArr);
        }

        public static BooleanFlagField booleanAfter(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        public static BooleanFlagField booleanFirst() {
            return new BooleanFlagField(0);
        }

        public abstract E get(int i);

        public abstract int toFlags(E e);

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.$$$reportNull$$$0(int):void");
    }

    public static int getAccessorFlags(boolean z, Visibility visibility, Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (modality == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | IS_NOT_DEFAULT.toFlags(Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(Boolean.valueOf(z4));
    }
}
