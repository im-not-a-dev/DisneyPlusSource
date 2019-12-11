package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.v */
/* compiled from: ViewBoundsCheck */
class C0903v {

    /* renamed from: a */
    final C0905b f3639a;

    /* renamed from: b */
    C0904a f3640b = new C0904a();

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* compiled from: ViewBoundsCheck */
    static class C0904a {

        /* renamed from: a */
        int f3641a = 0;

        /* renamed from: b */
        int f3642b;

        /* renamed from: c */
        int f3643c;

        /* renamed from: d */
        int f3644d;

        /* renamed from: e */
        int f3645e;

        C0904a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5153a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5155a(int i, int i2, int i3, int i4) {
            this.f3642b = i;
            this.f3643c = i2;
            this.f3644d = i3;
            this.f3645e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5157b() {
            this.f3641a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5154a(int i) {
            this.f3641a = i | this.f3641a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5156a() {
            int i = this.f3641a;
            if ((i & 7) != 0 && (i & (mo5153a(this.f3644d, this.f3642b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3641a;
            if ((i2 & 112) != 0 && (i2 & (mo5153a(this.f3644d, this.f3643c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3641a;
            if ((i3 & 1792) != 0 && (i3 & (mo5153a(this.f3645e, this.f3642b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3641a;
            if ((i4 & 28672) == 0 || (i4 & (mo5153a(this.f3645e, this.f3643c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$b */
    /* compiled from: ViewBoundsCheck */
    interface C0905b {
        /* renamed from: a */
        int mo4765a();

        /* renamed from: a */
        int mo4766a(View view);

        /* renamed from: a */
        View mo4767a(int i);

        /* renamed from: b */
        int mo4768b();

        /* renamed from: b */
        int mo4769b(View view);
    }

    C0903v(C0905b bVar) {
        this.f3639a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5151a(int i, int i2, int i3, int i4) {
        int a = this.f3639a.mo4765a();
        int b = this.f3639a.mo4768b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3639a.mo4767a(i);
            this.f3640b.mo5155a(a, b, this.f3639a.mo4766a(a2), this.f3639a.mo4769b(a2));
            if (i3 != 0) {
                this.f3640b.mo5157b();
                this.f3640b.mo5154a(i3);
                if (this.f3640b.mo5156a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3640b.mo5157b();
                this.f3640b.mo5154a(i4);
                if (this.f3640b.mo5156a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5152a(View view, int i) {
        this.f3640b.mo5155a(this.f3639a.mo4765a(), this.f3639a.mo4768b(), this.f3639a.mo4766a(view), this.f3639a.mo4769b(view));
        if (i == 0) {
            return false;
        }
        this.f3640b.mo5157b();
        this.f3640b.mo5154a(i);
        return this.f3640b.mo5156a();
    }
}
