package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.b0 */
/* compiled from: ViewModelStore */
public class C0707b0 {

    /* renamed from: a */
    private final HashMap<String, C0741y> f2992a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4120a(String str, C0741y yVar) {
        C0741y yVar2 = (C0741y) this.f2992a.put(str, yVar);
        if (yVar2 != null) {
            yVar2.onCleared();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0741y mo4118a(String str) {
        return (C0741y) this.f2992a.get(str);
    }

    /* renamed from: a */
    public final void mo4119a() {
        for (C0741y clear : this.f2992a.values()) {
            clear.clear();
        }
        this.f2992a.clear();
    }
}
