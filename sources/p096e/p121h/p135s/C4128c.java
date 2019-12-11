package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.view.DisplayCutout;

/* renamed from: e.h.s.c */
/* compiled from: DisplayCutoutCompat */
public final class C4128c {

    /* renamed from: a */
    private final Object f10403a;

    private C4128c(Object obj) {
        this.f10403a = obj;
    }

    /* renamed from: a */
    public int mo14691a() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f10403a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo14692b() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f10403a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo14693c() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f10403a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo14694d() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f10403a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4128c.class != obj.getClass()) {
            return false;
        }
        C4128c cVar = (C4128c) obj;
        Object obj2 = this.f10403a;
        Object obj3 = cVar.f10403a;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.f10403a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.f10403a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static C4128c m14132a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C4128c(obj);
    }
}
