package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p096e.p121h.C4020e;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4155a;
import p096e.p121h.p135s.p136i0.C4158e;

/* renamed from: e.h.s.a */
/* compiled from: AccessibilityDelegateCompat */
public class C4119a {

    /* renamed from: c */
    private static final AccessibilityDelegate f10394c = new AccessibilityDelegate();

    /* renamed from: a */
    private final AccessibilityDelegate f10395a;

    /* renamed from: b */
    private final AccessibilityDelegate f10396b;

    /* renamed from: e.h.s.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C4120a extends AccessibilityDelegate {

        /* renamed from: a */
        final C4119a f10397a;

        C4120a(C4119a aVar) {
            this.f10397a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10397a.mo14671a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C4158e a = this.f10397a.mo14669a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo14796a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10397a.mo2818b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C4154d a = C4154d.m14213a(accessibilityNodeInfo);
            a.mo14773i(C4187x.m14343H(view));
            a.mo14770h(C4187x.m14338C(view));
            a.mo14764f(C4187x.m14381d(view));
            this.f10397a.mo2816a(view, a);
            a.mo14740a(accessibilityNodeInfo.getText(), view);
            List b = C4119a.m14105b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo14738a((C4155a) b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10397a.mo14673c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f10397a.mo14672a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f10397a.mo2817a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f10397a.mo14670a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f10397a.mo14674d(view, accessibilityEvent);
        }
    }

    public C4119a() {
        this(f10394c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo14668a() {
        return this.f10396b;
    }

    /* renamed from: b */
    public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
        this.f10395a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo14673c(View view, AccessibilityEvent accessibilityEvent) {
        this.f10395a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo14674d(View view, AccessibilityEvent accessibilityEvent) {
        this.f10395a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C4119a(AccessibilityDelegate accessibilityDelegate) {
        this.f10395a = accessibilityDelegate;
        this.f10396b = new C4120a(this);
    }

    /* renamed from: b */
    static List<C4155a> m14105b(View view) {
        List<C4155a> list = (List) view.getTag(C4020e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public void mo14670a(View view, int i) {
        this.f10395a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public boolean mo14671a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f10395a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo2816a(View view, C4154d dVar) {
        this.f10395a.onInitializeAccessibilityNodeInfo(view, dVar.mo14791w());
    }

    /* renamed from: a */
    public boolean mo14672a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f10395a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C4158e mo14669a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f10395a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C4158e(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo2817a(View view, int i, Bundle bundle) {
        List b = m14105b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C4155a aVar = (C4155a) b.get(i2);
            if (aVar.mo14792a() == i) {
                z = aVar.mo14793a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.f10395a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C4020e.accessibility_action_clickable_span) ? z : m14103a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    private boolean m14103a(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C4020e.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (m14104a(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m14104a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] h = C4154d.m14223h(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (h != null && i < h.length) {
                if (clickableSpan.equals(h[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
