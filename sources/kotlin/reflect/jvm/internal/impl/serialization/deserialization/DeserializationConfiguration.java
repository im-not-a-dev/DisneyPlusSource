package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: DeserializationConfiguration.kt */
public interface DeserializationConfiguration {

    /* compiled from: DeserializationConfiguration.kt */
    public static final class Default implements DeserializationConfiguration {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public boolean getReleaseCoroutines() {
            return DefaultImpls.getReleaseCoroutines(this);
        }

        public boolean getReportErrorsOnPreReleaseDependencies() {
            return DefaultImpls.getReportErrorsOnPreReleaseDependencies(this);
        }

        public boolean getSkipMetadataVersionCheck() {
            return DefaultImpls.getSkipMetadataVersionCheck(this);
        }

        public boolean getTypeAliasesAllowed() {
            return DefaultImpls.getTypeAliasesAllowed(this);
        }
    }

    /* compiled from: DeserializationConfiguration.kt */
    public static final class DefaultImpls {
        public static boolean getReleaseCoroutines(DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getReportErrorsOnPreReleaseDependencies(DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getSkipMetadataVersionCheck(DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getTypeAliasesAllowed(DeserializationConfiguration deserializationConfiguration) {
            return true;
        }
    }

    boolean getReleaseCoroutines();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getTypeAliasesAllowed();
}
