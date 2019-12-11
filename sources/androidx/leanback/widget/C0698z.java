package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;
import java.util.Map.Entry;
import p096e.p113e.C3934g;

/* renamed from: androidx.leanback.widget.z */
/* compiled from: ViewsStateBundle */
class C0698z {

    /* renamed from: a */
    private int f2956a = 0;

    /* renamed from: b */
    private int f2957b = 100;

    /* renamed from: c */
    private C3934g<String, SparseArray<Parcelable>> f2958c;

    /* renamed from: a */
    public void mo4080a(int i) {
        C3934g<String, SparseArray<Parcelable>> gVar = this.f2958c;
        if (gVar != null && gVar.mo14080c() != 0) {
            this.f2958c.mo14081c(m3676d(i));
        }
    }

    /* renamed from: b */
    public void mo4083b() {
        C3934g<String, SparseArray<Parcelable>> gVar = this.f2958c;
        if (gVar != null) {
            gVar.mo14074a();
        }
    }

    /* renamed from: c */
    public final int mo4086c() {
        return this.f2957b;
    }

    /* renamed from: d */
    public final int mo4089d() {
        return this.f2956a;
    }

    /* renamed from: e */
    public final Bundle mo4090e() {
        C3934g<String, SparseArray<Parcelable>> gVar = this.f2958c;
        if (gVar == null || gVar.mo14080c() == 0) {
            return null;
        }
        Map d = this.f2958c.mo14082d();
        Bundle bundle = new Bundle();
        for (Entry entry : d.entrySet()) {
            bundle.putSparseParcelableArray((String) entry.getKey(), (SparseArray) entry.getValue());
        }
        return bundle;
    }

    /* renamed from: d */
    static String m3676d(int i) {
        return Integer.toString(i);
    }

    /* renamed from: c */
    public final void mo4087c(int i) {
        this.f2956a = i;
        mo4079a();
    }

    /* renamed from: a */
    public final void mo4081a(Bundle bundle) {
        C3934g<String, SparseArray<Parcelable>> gVar = this.f2958c;
        if (gVar != null && bundle != null) {
            gVar.mo14074a();
            for (String str : bundle.keySet()) {
                this.f2958c.mo14073a(str, bundle.getSparseParcelableArray(str));
            }
        }
    }

    /* renamed from: b */
    public final void mo4084b(int i) {
        this.f2957b = i;
        mo4079a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4088c(View view, int i) {
        if (this.f2958c != null) {
            String d = m3676d(i);
            SparseArray sparseArray = new SparseArray();
            view.saveHierarchyState(sparseArray);
            this.f2958c.mo14073a(d, sparseArray);
        }
    }

    /* renamed from: b */
    public final void mo4085b(View view, int i) {
        int i2 = this.f2956a;
        if (i2 == 1) {
            mo4080a(i);
        } else if (i2 == 2 || i2 == 3) {
            mo4088c(view, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4079a() {
        int i = this.f2956a;
        if (i == 2) {
            if (this.f2957b > 0) {
                C3934g<String, SparseArray<Parcelable>> gVar = this.f2958c;
                if (gVar == null || gVar.mo14077b() != this.f2957b) {
                    this.f2958c = new C3934g<>(this.f2957b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        } else if (i == 3 || i == 1) {
            C3934g<String, SparseArray<Parcelable>> gVar2 = this.f2958c;
            if (gVar2 == null || gVar2.mo14077b() != Integer.MAX_VALUE) {
                this.f2958c = new C3934g<>(Integer.MAX_VALUE);
            }
        } else {
            this.f2958c = null;
        }
    }

    /* renamed from: a */
    public final void mo4082a(View view, int i) {
        if (this.f2958c != null) {
            SparseArray sparseArray = (SparseArray) this.f2958c.mo14081c(m3676d(i));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo4078a(Bundle bundle, View view, int i) {
        if (this.f2956a != 0) {
            String d = m3676d(i);
            SparseArray sparseArray = new SparseArray();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(d, sparseArray);
        }
        return bundle;
    }
}
