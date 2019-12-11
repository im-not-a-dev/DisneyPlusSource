package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0714h;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import java.util.Map.Entry;
import p096e.p105b.p106a.p108b.C3909b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C3909b<String, C0955b> f3782a = new C3909b<>();

    /* renamed from: b */
    private Bundle f3783b;

    /* renamed from: c */
    private boolean f3784c;

    /* renamed from: d */
    boolean f3785d;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0954a {
        /* renamed from: a */
        void mo5300a(C0957b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0955b {
        /* renamed from: a */
        Bundle mo5301a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo5295a(String str) {
        if (this.f3784c) {
            Bundle bundle = this.f3783b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f3783b.remove(str);
            if (this.f3783b.isEmpty()) {
                this.f3783b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public void mo5299b(String str) {
        this.f3782a.remove(str);
    }

    /* renamed from: a */
    public void mo5298a(String str, C0955b bVar) {
        if (((C0955b) this.f3782a.mo13978b(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5297a(C0715i iVar, Bundle bundle) {
        if (!this.f3784c) {
            if (bundle != null) {
                this.f3783b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            iVar.mo4134a(new C0714h() {
                /* renamed from: a */
                public void mo330a(C0722m mVar, C0716a aVar) {
                    if (aVar == C0716a.ON_START) {
                        SavedStateRegistry.this.f3785d = true;
                    } else if (aVar == C0716a.ON_STOP) {
                        SavedStateRegistry.this.f3785d = false;
                    }
                }
            });
            this.f3784c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5296a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3783b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3913d d = this.f3782a.mo13985d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            bundle2.putBundle((String) entry.getKey(), ((C0955b) entry.getValue()).mo5301a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
