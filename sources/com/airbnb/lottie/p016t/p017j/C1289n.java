package com.airbnb.lottie.p016t.p017j;

import com.airbnb.lottie.p023x.C1376a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.j.n */
/* compiled from: BaseAnimatableValue */
abstract class C1289n<V, O> implements C1288m<V, O> {

    /* renamed from: a */
    final List<C1376a<V>> f4801a;

    C1289n(V v) {
        this(Collections.singletonList(new C1376a(v)));
    }

    /* renamed from: b */
    public List<C1376a<V>> mo6224b() {
        return this.f4801a;
    }

    public boolean isStatic() {
        return this.f4801a.isEmpty() || (this.f4801a.size() == 1 && ((C1376a) this.f4801a.get(0)).mo6426g());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f4801a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f4801a.toArray()));
        }
        return sb.toString();
    }

    C1289n(List<C1376a<V>> list) {
        this.f4801a = list;
    }
}
