package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: ModuleVisibilityHelper.kt */
public interface ModuleVisibilityHelper {

    /* compiled from: ModuleVisibilityHelper.kt */
    public static final class EMPTY implements ModuleVisibilityHelper {
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        public boolean isInFriendModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            return true;
        }
    }

    boolean isInFriendModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2);
}
