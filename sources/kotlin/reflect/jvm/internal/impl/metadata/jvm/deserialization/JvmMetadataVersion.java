package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* compiled from: JvmMetadataVersion.kt */
public final class JvmMetadataVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final JvmMetadataVersion INSTANCE = new JvmMetadataVersion(1, 1, 15);
    public static final JvmMetadataVersion INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    private final boolean isStrictSemantics;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JvmMetadataVersion(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.isStrictSemantics = z;
    }

    public boolean isCompatible() {
        if (getMajor() == 1 && getMinor() == 0) {
            return false;
        }
        boolean z = this.isStrictSemantics ? isCompatibleTo(INSTANCE) : getMajor() == 1 && getMinor() <= 4;
        if (z) {
            return true;
        }
        return false;
    }

    public JvmMetadataVersion(int... iArr) {
        this(iArr, false);
    }
}
