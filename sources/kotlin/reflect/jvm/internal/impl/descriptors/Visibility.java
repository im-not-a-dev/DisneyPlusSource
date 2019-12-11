package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* compiled from: Visibility.kt */
public abstract class Visibility {
    private final boolean isPublicAPI;
    private final String name;

    protected Visibility(String str, boolean z) {
        this.name = str;
        this.isPublicAPI = z;
    }

    /* access modifiers changed from: protected */
    public Integer compareTo(Visibility visibility) {
        return Visibilities.compareLocal(this, visibility);
    }

    public String getDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    public abstract boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);

    public Visibility normalize() {
        return this;
    }

    public final String toString() {
        return getDisplayName();
    }
}
