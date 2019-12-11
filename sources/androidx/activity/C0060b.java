package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: OnBackPressedCallback */
public abstract class C0060b {

    /* renamed from: a */
    private boolean f170a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0059a> f171b = new CopyOnWriteArrayList<>();

    public C0060b(boolean z) {
        this.f170a = z;
    }

    /* renamed from: a */
    public abstract void mo336a();

    /* renamed from: a */
    public final void mo338a(boolean z) {
        this.f170a = z;
    }

    /* renamed from: b */
    public final boolean mo340b() {
        return this.f170a;
    }

    /* renamed from: c */
    public final void mo341c() {
        Iterator it = this.f171b.iterator();
        while (it.hasNext()) {
            ((C0059a) it.next()).cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo337a(C0059a aVar) {
        this.f171b.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo339b(C0059a aVar) {
        this.f171b.remove(aVar);
    }
}
