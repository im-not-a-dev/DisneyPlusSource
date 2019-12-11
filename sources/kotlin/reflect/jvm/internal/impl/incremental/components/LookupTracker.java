package kotlin.reflect.jvm.internal.impl.incremental.components;

/* compiled from: LookupTracker.kt */
public interface LookupTracker {

    /* compiled from: LookupTracker.kt */
    public static final class DO_NOTHING implements LookupTracker {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        private DO_NOTHING() {
        }

        public boolean getRequiresPosition() {
            return false;
        }

        public void record(String str, Position position, String str2, ScopeKind scopeKind, String str3) {
        }
    }

    boolean getRequiresPosition();

    void record(String str, Position position, String str2, ScopeKind scopeKind, String str3);
}
