package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: ChildHelper */
class C0842d {

    /* renamed from: a */
    final C0844b f3426a;

    /* renamed from: b */
    final C0843a f3427b = new C0843a();

    /* renamed from: c */
    final List<View> f3428c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: ChildHelper */
    static class C0843a {

        /* renamed from: a */
        long f3429a = 0;

        /* renamed from: b */
        C0843a f3430b;

        C0843a() {
        }

        /* renamed from: b */
        private void m4763b() {
            if (this.f3430b == null) {
                this.f3430b = new C0843a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4973a(int i) {
            if (i >= 64) {
                C0843a aVar = this.f3430b;
                if (aVar != null) {
                    aVar.mo4973a(i - 64);
                    return;
                }
                return;
            }
            this.f3429a &= ~(1 << i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo4976c(int i) {
            if (i >= 64) {
                m4763b();
                return this.f3430b.mo4976c(i - 64);
            }
            return (this.f3429a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo4977d(int i) {
            if (i >= 64) {
                m4763b();
                return this.f3430b.mo4977d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3429a & j) != 0;
            this.f3429a &= ~j;
            long j2 = j - 1;
            long j3 = this.f3429a;
            this.f3429a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            C0843a aVar = this.f3430b;
            if (aVar != null) {
                if (aVar.mo4976c(0)) {
                    mo4978e(63);
                }
                this.f3430b.mo4977d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4978e(int i) {
            if (i >= 64) {
                m4763b();
                this.f3430b.mo4978e(i - 64);
                return;
            }
            this.f3429a |= 1 << i;
        }

        public String toString() {
            if (this.f3430b == null) {
                return Long.toBinaryString(this.f3429a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3430b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f3429a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4975b(int i) {
            C0843a aVar = this.f3430b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3429a);
                }
                return Long.bitCount(this.f3429a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3429a & ((1 << i) - 1));
            } else {
                return aVar.mo4975b(i - 64) + Long.bitCount(this.f3429a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4972a() {
            this.f3429a = 0;
            C0843a aVar = this.f3430b;
            if (aVar != null) {
                aVar.mo4972a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4974a(int i, boolean z) {
            if (i >= 64) {
                m4763b();
                this.f3430b.mo4974a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3429a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3429a;
            this.f3429a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo4978e(i);
            } else {
                mo4973a(i);
            }
            if (z2 || this.f3430b != null) {
                m4763b();
                this.f3430b.mo4974a(0, z2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: ChildHelper */
    interface C0844b {
        /* renamed from: a */
        int mo4592a();

        /* renamed from: a */
        View mo4593a(int i);

        /* renamed from: a */
        void mo4594a(View view);

        /* renamed from: a */
        void mo4595a(View view, int i);

        /* renamed from: a */
        void mo4596a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        int mo4597b(View view);

        /* renamed from: b */
        void mo4598b();

        /* renamed from: b */
        void mo4599b(int i);

        /* renamed from: c */
        C0794d0 mo4600c(View view);

        /* renamed from: c */
        void mo4601c(int i);

        /* renamed from: d */
        void mo4602d(View view);
    }

    C0842d(C0844b bVar) {
        this.f3426a = bVar;
    }

    /* renamed from: f */
    private int m4743f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3426a.mo4592a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f3427b.mo4975b(i2));
            if (b == 0) {
                while (this.f3427b.mo4976c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m4744g(View view) {
        this.f3428c.add(view);
        this.f3426a.mo4594a(view);
    }

    /* renamed from: h */
    private boolean m4745h(View view) {
        if (!this.f3428c.remove(view)) {
            return false;
        }
        this.f3426a.mo4602d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4959a(View view, boolean z) {
        mo4958a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4962b(int i) {
        int size = this.f3428c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f3428c.get(i2);
            C0794d0 c = this.f3426a.mo4600c(view);
            if (c.getLayoutPosition() == i && !c.isInvalid() && !c.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo4963c(int i) {
        return this.f3426a.mo4593a(m4743f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4967d(View view) {
        int b = this.f3426a.mo4597b(view);
        if (b >= 0) {
            if (this.f3427b.mo4977d(b)) {
                m4745h(view);
            }
            this.f3426a.mo4601c(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4968e(int i) {
        int f = m4743f(i);
        View a = this.f3426a.mo4593a(f);
        if (a != null) {
            if (this.f3427b.mo4977d(f)) {
                m4745h(a);
            }
            this.f3426a.mo4601c(f);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3427b.toString());
        sb.append(", hidden list:");
        sb.append(this.f3428c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4958a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3426a.mo4592a();
        } else {
            i2 = m4743f(i);
        }
        this.f3427b.mo4974a(i2, z);
        if (z) {
            m4744g(view);
        }
        this.f3426a.mo4595a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4964c() {
        this.f3427b.mo4972a();
        for (int size = this.f3428c.size() - 1; size >= 0; size--) {
            this.f3426a.mo4602d((View) this.f3428c.get(size));
            this.f3428c.remove(size);
        }
        this.f3426a.mo4598b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4970f(View view) {
        int b = this.f3426a.mo4597b(view);
        if (b < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3427b.mo4976c(b)) {
            this.f3427b.mo4973a(b);
            m4745h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo4966d(int i) {
        return this.f3426a.mo4593a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo4969e(View view) {
        int b = this.f3426a.mo4597b(view);
        if (b == -1) {
            m4745h(view);
            return true;
        } else if (!this.f3427b.mo4976c(b)) {
            return false;
        } else {
            this.f3427b.mo4977d(b);
            m4745h(view);
            this.f3426a.mo4601c(b);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4957a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3426a.mo4592a();
        } else {
            i2 = m4743f(i);
        }
        this.f3427b.mo4974a(i2, z);
        if (z) {
            m4744g(view);
        }
        this.f3426a.mo4596a(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4960b() {
        return this.f3426a.mo4592a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4961b(View view) {
        int b = this.f3426a.mo4597b(view);
        if (b != -1 && !this.f3427b.mo4976c(b)) {
            return b - this.f3427b.mo4975b(b);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4965c(View view) {
        return this.f3428c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4954a() {
        return this.f3426a.mo4592a() - this.f3428c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4955a(int i) {
        int f = m4743f(i);
        this.f3427b.mo4977d(f);
        this.f3426a.mo4599b(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4956a(View view) {
        int b = this.f3426a.mo4597b(view);
        if (b >= 0) {
            this.f3427b.mo4978e(b);
            m4744g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }
}
