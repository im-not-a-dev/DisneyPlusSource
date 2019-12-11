package p163g.p449j.p450a.p451a.p457d.p464g;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: g.j.a.a.d.g.j6 */
class C11169j6<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public List<C11246o6> f26271U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Map<K, V> f26272V;

    /* renamed from: W */
    private boolean f26273W;

    /* renamed from: X */
    private volatile C11274q6 f26274X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public Map<K, V> f26275Y;

    /* renamed from: Z */
    private volatile C11183k6 f26276Z;

    /* renamed from: c */
    private final int f26277c;

    private C11169j6(int i) {
        this.f26277c = i;
        this.f26271U = Collections.emptyList();
        this.f26272V = Collections.emptyMap();
        this.f26275Y = Collections.emptyMap();
    }

    /* renamed from: b */
    static <FieldDescriptorType extends C11357w3<FieldDescriptorType>> C11169j6<FieldDescriptorType, Object> m35409b(int i) {
        return new C11155i6(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m35414f() {
        if (this.f26273W) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m35415g() {
        m35414f();
        if (this.f26272V.isEmpty() && !(this.f26272V instanceof TreeMap)) {
            this.f26272V = new TreeMap();
            this.f26275Y = ((TreeMap) this.f26272V).descendingMap();
        }
        return (SortedMap) this.f26272V;
    }

    /* renamed from: a */
    public final boolean mo28600a() {
        return this.f26273W;
    }

    /* renamed from: c */
    public final int mo28601c() {
        return this.f26271U.size();
    }

    public void clear() {
        m35414f();
        if (!this.f26271U.isEmpty()) {
            this.f26271U.clear();
        }
        if (!this.f26272V.isEmpty()) {
            this.f26272V.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m35406a((K) comparable) >= 0 || this.f26272V.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo28604d() {
        if (this.f26272V.isEmpty()) {
            return C11232n6.m35789a();
        }
        return this.f26272V.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo28605e() {
        if (this.f26276Z == null) {
            this.f26276Z = new C11183k6(this, null);
        }
        return this.f26276Z;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f26274X == null) {
            this.f26274X = new C11274q6(this, null);
        }
        return this.f26274X;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11169j6)) {
            return super.equals(obj);
        }
        C11169j6 j6Var = (C11169j6) obj;
        int size = size();
        if (size != j6Var.size()) {
            return false;
        }
        int c = mo28601c();
        if (c != j6Var.mo28601c()) {
            return entrySet().equals(j6Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo28599a(i).equals(j6Var.mo28599a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f26272V.equals(j6Var.f26272V);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m35406a((K) comparable);
        if (a >= 0) {
            return ((C11246o6) this.f26271U.get(a)).getValue();
        }
        return this.f26272V.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo28601c(); i2++) {
            i += ((C11246o6) this.f26271U.get(i2)).hashCode();
        }
        return this.f26272V.size() > 0 ? i + this.f26272V.hashCode() : i;
    }

    public V remove(Object obj) {
        m35414f();
        Comparable comparable = (Comparable) obj;
        int a = m35406a((K) comparable);
        if (a >= 0) {
            return m35411c(a);
        }
        if (this.f26272V.isEmpty()) {
            return null;
        }
        return this.f26272V.remove(comparable);
    }

    public int size() {
        return this.f26271U.size() + this.f26272V.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m35411c(int i) {
        m35414f();
        V value = ((C11246o6) this.f26271U.remove(i)).getValue();
        if (!this.f26272V.isEmpty()) {
            Iterator it = m35415g().entrySet().iterator();
            this.f26271U.add(new C11246o6(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    public final Entry<K, V> mo28599a(int i) {
        return (Entry) this.f26271U.get(i);
    }

    /* renamed from: b */
    public void mo28583b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f26273W) {
            if (this.f26272V.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f26272V);
            }
            this.f26272V = map;
            if (this.f26275Y.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f26275Y);
            }
            this.f26275Y = map2;
            this.f26273W = true;
        }
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m35414f();
        int a = m35406a(k);
        if (a >= 0) {
            return ((C11246o6) this.f26271U.get(a)).setValue(v);
        }
        m35414f();
        if (this.f26271U.isEmpty() && !(this.f26271U instanceof ArrayList)) {
            this.f26271U = new ArrayList(this.f26277c);
        }
        int i = -(a + 1);
        if (i >= this.f26277c) {
            return m35415g().put(k, v);
        }
        int size = this.f26271U.size();
        int i2 = this.f26277c;
        if (size == i2) {
            C11246o6 o6Var = (C11246o6) this.f26271U.remove(i2 - 1);
            m35415g().put((Comparable) o6Var.getKey(), o6Var.getValue());
        }
        this.f26271U.add(i, new C11246o6(this, k, v));
        return null;
    }

    /* synthetic */ C11169j6(int i, C11155i6 i6Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m35406a(K k) {
        int size = this.f26271U.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C11246o6) this.f26271U.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C11246o6) this.f26271U.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
