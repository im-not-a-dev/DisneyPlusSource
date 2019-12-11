package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* renamed from: kotlin.jvm.internal.w */
/* compiled from: PropertyReference */
public abstract class C12893w extends C12863c implements KProperty {
    public C12893w() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12893w) {
            C12893w wVar = (C12893w) obj;
            if (!getOwner().equals(wVar.getOwner()) || !getName().equals(wVar.getName()) || !getSignature().equals(wVar.getSignature()) || !C12880j.m40224a(getBoundReceiver(), wVar.getBoundReceiver())) {
                z = false;
            }
            return z;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public C12893w(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }
}
