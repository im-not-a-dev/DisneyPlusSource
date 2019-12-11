package kotlin.p590y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.z */
/* compiled from: Maps.kt */
final class C13204z implements Map, Serializable, C12872a {

    /* renamed from: c */
    public static final C13204z f29642c = new C13204z();

    private C13204z() {
    }

    /* renamed from: a */
    public boolean mo34307a(Void voidR) {
        return false;
    }

    /* renamed from: b */
    public Set<Entry> mo34308b() {
        return C13150a0.f29592c;
    }

    /* renamed from: c */
    public Set<Object> mo34309c() {
        return C13150a0.f29592c;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo34307a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public int mo34313d() {
        return 0;
    }

    /* renamed from: e */
    public Collection mo34314e() {
        return C13203y.f29641c;
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return mo34308b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo34309c();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo34313d();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo34314e();
    }
}
