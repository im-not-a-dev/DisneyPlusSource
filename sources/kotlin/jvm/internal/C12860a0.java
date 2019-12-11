package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.a0 */
/* compiled from: SpreadBuilder */
public class C12860a0 {

    /* renamed from: a */
    private final ArrayList<Object> f29514a;

    public C12860a0(int i) {
        this.f29514a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public int mo31154a() {
        return this.f29514a.size();
    }

    /* renamed from: b */
    public void mo31157b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f29514a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f29514a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f29514a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f29514a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f29514a.add(it.next());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo31155a(Object obj) {
        this.f29514a.add(obj);
    }

    /* renamed from: a */
    public Object[] mo31156a(Object[] objArr) {
        return this.f29514a.toArray(objArr);
    }
}
