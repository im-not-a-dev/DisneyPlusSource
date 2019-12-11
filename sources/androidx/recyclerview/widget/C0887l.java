package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0820v;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: LayoutState */
class C0887l {

    /* renamed from: a */
    boolean f3609a = true;

    /* renamed from: b */
    int f3610b;

    /* renamed from: c */
    int f3611c;

    /* renamed from: d */
    int f3612d;

    /* renamed from: e */
    int f3613e;

    /* renamed from: f */
    int f3614f = 0;

    /* renamed from: g */
    int f3615g = 0;

    /* renamed from: h */
    boolean f3616h;

    /* renamed from: i */
    boolean f3617i;

    C0887l() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5097a(C0788a0 a0Var) {
        int i = this.f3611c;
        return i >= 0 && i < a0Var.mo4531b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f3610b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f3611c);
        sb.append(", mItemDirection=");
        sb.append(this.f3612d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f3613e);
        sb.append(", mStartLine=");
        sb.append(this.f3614f);
        sb.append(", mEndLine=");
        sb.append(this.f3615g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5096a(C0820v vVar) {
        View d = vVar.mo4820d(this.f3611c);
        this.f3611c += this.f3612d;
        return d;
    }
}
