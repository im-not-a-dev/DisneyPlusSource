package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.i6 */
final class C11155i6 extends C11169j6<FieldDescriptorType, Object> {
    C11155i6(int i) {
        super(i, null);
    }

    /* renamed from: b */
    public final void mo28583b() {
        if (!mo28600a()) {
            for (int i = 0; i < mo28601c(); i++) {
                Entry a = mo28599a(i);
                if (((C11357w3) a.getKey()).mo29094b0()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : mo28604d()) {
                if (((C11357w3) entry.getKey()).mo29094b0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo28583b();
    }
}
