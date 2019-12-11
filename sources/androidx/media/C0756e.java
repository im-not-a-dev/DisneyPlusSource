package androidx.media;

import android.text.TextUtils;
import p096e.p121h.p134r.C4111c;

/* renamed from: androidx.media.e */
/* compiled from: MediaSessionManagerImplBase */
class C0756e implements C0754c {

    /* renamed from: a */
    private String f3054a;

    /* renamed from: b */
    private int f3055b;

    /* renamed from: c */
    private int f3056c;

    C0756e(String str, int i, int i2) {
        this.f3054a = str;
        this.f3055b = i;
        this.f3056c = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0756e)) {
            return false;
        }
        C0756e eVar = (C0756e) obj;
        if (this.f3055b == -1 || eVar.f3055b == -1) {
            if (!TextUtils.equals(this.f3054a, eVar.f3054a) || this.f3056c != eVar.f3056c) {
                z = false;
            }
            return z;
        }
        if (!(TextUtils.equals(this.f3054a, eVar.f3054a) && this.f3055b == eVar.f3055b && this.f3056c == eVar.f3056c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4111c.m14085a(this.f3054a, Integer.valueOf(this.f3056c));
    }
}
