package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: versionSpecificBehavior.kt */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(BinaryVersion binaryVersion) {
        return binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(BinaryVersion binaryVersion) {
        return isKotlin1Dot4OrLater(binaryVersion);
    }
}
