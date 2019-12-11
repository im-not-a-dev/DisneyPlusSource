package com.bamtechmedia.dominguez.collections;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.core.p215k.C5758a;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import kotlin.TypeCastException;
import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.collections.o */
/* compiled from: CollectionViewFocusHelper.kt */
public final class C3432o {

    /* renamed from: a */
    private final boolean f8656a;

    /* renamed from: b */
    private long f8657b;

    /* renamed from: c */
    private long f8658c;

    /* renamed from: d */
    private final C5758a f8659d;

    /* renamed from: e */
    private final C3441g f8660e;

    public C3432o(C5758a aVar, C3441g gVar) {
        this.f8659d = aVar;
        this.f8660e = gVar;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11717a(C3432o oVar, int i, View view, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return oVar.mo12605a(i, view, z);
    }

    /* renamed from: b */
    private final boolean m11719b(int i, View view, boolean z) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        boolean z2 = false;
        String str = "handleFocusEvent:";
        if (viewGroup != null) {
            if (z && C3453p.m11781g(view) && i == 17) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" skipping event -");
                str = sb.toString();
            } else if (m11718b(i, view, viewGroup) || m11720c(i, view, viewGroup) || m11721d(i, view, viewGroup)) {
                z2 = true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" consumed:");
        sb2.append(z2);
        m11716a(sb2.toString());
        return z2;
    }

    /* renamed from: c */
    private final boolean m11720c(int i, View view, ViewGroup viewGroup) {
        boolean z;
        String str = "consumedOnHorizontalFocusSearchWithinParentTag:";
        if (!C3453p.m11785k(view) || !this.f8659d.mo17640b(i)) {
            z = false;
        } else {
            boolean a = mo12604a(i, view, viewGroup);
            z = true;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" findNextFocus:");
            sb.append(a);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" - event consumed:");
        sb2.append(z);
        m11716a(sb2.toString());
        return z;
    }

    /* renamed from: d */
    private final boolean m11721d(int i, View view, ViewGroup viewGroup) {
        boolean a = C3453p.m11774b(viewGroup);
        boolean b = this.f8659d.mo17640b(i);
        boolean c = this.f8659d.mo17641c(i);
        boolean z = false;
        String str = "consumedOnShelfRecyclerView:";
        if (a) {
            long a2 = C3453p.m11775c();
            if (a2 < this.f8658c || a2 < this.f8657b) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" Blocked focus search");
                str = sb.toString();
            } else if (b) {
                this.f8658c = C3453p.m11775c() + this.f8660e.mo12616b();
                if (viewGroup != null) {
                    RecyclerView recyclerView = (RecyclerView) viewGroup;
                    int e = recyclerView.mo4430e(view);
                    int a3 = this.f8659d.mo17637a(i, e);
                    if (a3 >= 0) {
                        C0808o layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.mo3858a(recyclerView, (C0788a0) null, a3);
                            View c2 = layoutManager.mo4337c(a3);
                            if (c2 != null) {
                                C5852n0.m18886a(c2, 0, 1, (Object) null);
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" is horizontal focus direction { ");
                    sb2.append("focusPosition:");
                    sb2.append(e);
                    sb2.append(" nextFocusPosition:");
                    sb2.append(a3);
                    sb2.append(" }");
                    str = sb2.toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
            } else if (c) {
                this.f8657b = C3453p.m11775c() + this.f8660e.mo12617c();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" is vertical focus direction");
                str = sb3.toString();
            }
            z = true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(" - event consumed:");
        sb4.append(z);
        m11716a(sb4.toString());
        return z;
    }

    /* renamed from: a */
    public final boolean mo12605a(int i, View view, boolean z) {
        boolean z2;
        int d = this.f8659d.mo17642d(i);
        String str = "handleOnKeyDown:";
        if (mo12603a(d, view)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" skipping focus event");
            str = sb.toString();
            z2 = false;
        } else {
            z2 = m11719b(d, view, z);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        sb2.append(this.f8659d.mo17638a(d));
        sb2.append(" - consumed:");
        sb2.append(z2);
        m11716a(sb2.toString());
        return z2;
    }

    /* renamed from: a */
    public final boolean mo12603a(int i, View view) {
        return C3453p.m11786l(view) && this.f8659d.mo17640b(i);
    }

    /* renamed from: a */
    private final View m11715a(ViewGroup viewGroup, Rect rect, int i) {
        if (viewGroup == null) {
            return null;
        }
        View findNextFocusFromRect = C3453p.m11777d().findNextFocusFromRect(viewGroup, rect, i);
        if (findNextFocusFromRect == null) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            findNextFocusFromRect = m11715a((ViewGroup) parent, rect, i);
        }
        return findNextFocusFromRect;
    }

    /* renamed from: b */
    private final boolean m11718b(int i, View view, ViewGroup viewGroup) {
        boolean z;
        boolean z2 = true;
        String str = "consumedOnHeroShelf:";
        if (C3453p.m11784j(view) || C3453p.m11783i(view)) {
            if (i == 130) {
                Integer num = null;
                C3319e0 e0Var = C3453p.m11784j(view) ? C3453p.m11782h(viewGroup) : C3453p.m11783i(view) ? C3453p.m11782h(view) : null;
                int left = view.getLeft();
                Rect b = e0Var != null ? e0Var.mo12370b() : null;
                if (e0Var == null || e0Var.mo12369a() != 33) {
                    z2 = false;
                }
                Rect rect = new Rect();
                rect.top = view.getTop();
                rect.bottom = view.getTop() + view.getBottom();
                rect.left = (!z2 || b == null) ? left : b.left;
                rect.right = (!z2 || b == null) ? left : b.right;
                View a = m11715a(viewGroup, rect, i);
                z = a != null ? C5852n0.m18885a(a, i) : false;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" Focus down { leftEdgeCurrentFocus:");
                sb.append(left);
                sb.append(' ');
                sb.append("focusChangeInfoRect:");
                sb.append(b);
                sb.append(' ');
                sb.append("isFocusChangeInfoFocusUp");
                sb.append(z2);
                sb.append(" rect:");
                sb.append(rect);
                sb.append(' ');
                sb.append("findNextFocusRecursive:");
                if (a != null) {
                    num = Integer.valueOf(a.getId());
                }
                sb.append(num);
                sb.append("}}");
                str = sb.toString();
            } else if (i == 33) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" Focus up, ignoring event.");
                str = sb2.toString();
                z = true;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" - consumed:");
            sb3.append(z);
            m11716a(sb3.toString());
            return z;
        }
        z = false;
        StringBuilder sb32 = new StringBuilder();
        sb32.append(str);
        sb32.append(" - consumed:");
        sb32.append(z);
        m11716a(sb32.toString());
        return z;
    }

    /* renamed from: a */
    private final void m11716a(String str) {
        if (this.f8656a) {
            Timber.m44522a(str, new Object[0]);
        }
    }

    /* renamed from: a */
    public final boolean mo12604a(int i, View view, ViewGroup viewGroup) {
        View findNextFocus = C3453p.m11777d().findNextFocus(viewGroup, view, i);
        if (findNextFocus != null) {
            return C5852n0.m18886a(findNextFocus, 0, 1, (Object) null);
        }
        return false;
    }
}
