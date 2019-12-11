package p096e.p121h.p135s.p136i0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.h.s.i0.e */
/* compiled from: AccessibilityNodeProviderCompat */
public class C4158e {

    /* renamed from: a */
    private final Object f10466a;

    /* renamed from: e.h.s.i0.e$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C4159a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C4158e f10467a;

        C4159a(C4158e eVar) {
            this.f10467a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C4154d a = this.f10467a.mo14795a(i);
            if (a == null) {
                return null;
            }
            return a.mo14791w();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f10467a.mo14797a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C4154d) a.get(i2)).mo14791w());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f10467a.mo14798a(i, i2, bundle);
        }
    }

    /* renamed from: e.h.s.i0.e$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C4160b extends C4159a {
        C4160b(C4158e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C4154d b = this.f10467a.mo14799b(i);
            if (b == null) {
                return null;
            }
            return b.mo14791w();
        }
    }

    public C4158e() {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            this.f10466a = new C4160b(this);
        } else if (i >= 16) {
            this.f10466a = new C4159a(this);
        } else {
            this.f10466a = null;
        }
    }

    /* renamed from: a */
    public C4154d mo14795a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo14796a() {
        return this.f10466a;
    }

    /* renamed from: a */
    public List<C4154d> mo14797a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo14798a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C4154d mo14799b(int i) {
        return null;
    }

    public C4158e(Object obj) {
        this.f10466a = obj;
    }
}
