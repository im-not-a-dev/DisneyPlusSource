package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField;

/* compiled from: JvmFlags.kt */
public final class JvmFlags {
    public static final JvmFlags INSTANCE = new JvmFlags();
    private static final BooleanFlagField IS_MOVED_FROM_INTERFACE_COMPANION = FlagField.booleanFirst();

    private JvmFlags() {
    }

    public final BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
