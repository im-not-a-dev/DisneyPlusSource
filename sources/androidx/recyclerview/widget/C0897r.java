package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.p136i0.C4154d;

/* renamed from: androidx.recyclerview.widget.r */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C0897r extends C4119a {

    /* renamed from: d */
    final RecyclerView f3631d;

    /* renamed from: e */
    final C4119a f3632e = new C0898a(this);

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C0898a extends C4119a {

        /* renamed from: d */
        final C0897r f3633d;

        public C0898a(C0897r rVar) {
            this.f3633d = rVar;
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            if (!this.f3633d.mo5130c() && this.f3633d.f3631d.getLayoutManager() != null) {
                this.f3633d.f3631d.getLayoutManager().mo4697a(view, dVar);
            }
        }

        /* renamed from: a */
        public boolean mo2817a(View view, int i, Bundle bundle) {
            if (super.mo2817a(view, i, bundle)) {
                return true;
            }
            if (this.f3633d.mo5130c() || this.f3633d.f3631d.getLayoutManager() == null) {
                return false;
            }
            return this.f3633d.f3631d.getLayoutManager().mo4708a(view, i, bundle);
        }
    }

    public C0897r(RecyclerView recyclerView) {
        this.f3631d = recyclerView;
    }

    /* renamed from: a */
    public boolean mo2817a(View view, int i, Bundle bundle) {
        if (super.mo2817a(view, i, bundle)) {
            return true;
        }
        if (mo5130c() || this.f3631d.getLayoutManager() == null) {
            return false;
        }
        return this.f3631d.getLayoutManager().mo4706a(i, bundle);
    }

    /* renamed from: b */
    public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2818b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo5130c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4330a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5130c() {
        return this.f3631d.mo4473k();
    }

    /* renamed from: a */
    public void mo2816a(View view, C4154d dVar) {
        super.mo2816a(view, dVar);
        dVar.mo14739a((CharSequence) RecyclerView.class.getName());
        if (!mo5130c() && this.f3631d.getLayoutManager() != null) {
            this.f3631d.getLayoutManager().mo4704a(dVar);
        }
    }

    /* renamed from: b */
    public C4119a mo5129b() {
        return this.f3632e;
    }
}
