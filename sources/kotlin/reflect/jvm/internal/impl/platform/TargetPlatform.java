package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;

/* compiled from: TargetPlatform.kt */
public class TargetPlatform implements Collection<SimplePlatform>, C12872a {
    private final Set<SimplePlatform> componentPlatforms;

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return contains((SimplePlatform) obj);
        }
        return false;
    }

    public boolean contains(SimplePlatform simplePlatform) {
        return this.componentPlatforms.contains(simplePlatform);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.componentPlatforms.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetPlatform) && !(Intrinsics.areEqual((Object) this.componentPlatforms, (Object) ((TargetPlatform) obj).componentPlatforms) ^ true);
    }

    public final Set<SimplePlatform> getComponentPlatforms() {
        return this.componentPlatforms;
    }

    public int getSize() {
        return this.componentPlatforms.size();
    }

    public int hashCode() {
        return this.componentPlatforms.hashCode();
    }

    public boolean isEmpty() {
        return this.componentPlatforms.isEmpty();
    }

    public Iterator<SimplePlatform> iterator() {
        return this.componentPlatforms.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        return PlatformUtilKt.getPresentableDescription(this);
    }
}
