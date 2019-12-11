package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* compiled from: JvmBytecodeBinaryVersion.kt */
public final class JvmBytecodeBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final JvmBytecodeBinaryVersion INSTANCE = new JvmBytecodeBinaryVersion(1, 0, 3);
    public static final JvmBytecodeBinaryVersion INVALID_VERSION = new JvmBytecodeBinaryVersion(new int[0]);

    /* compiled from: JvmBytecodeBinaryVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JvmBytecodeBinaryVersion(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
    }
}
