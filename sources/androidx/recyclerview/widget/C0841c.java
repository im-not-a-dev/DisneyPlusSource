package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: BatchingListUpdateCallback */
public class C0841c implements C0889n {

    /* renamed from: a */
    final C0889n f3421a;

    /* renamed from: b */
    int f3422b = 0;

    /* renamed from: c */
    int f3423c = -1;

    /* renamed from: d */
    int f3424d = -1;

    /* renamed from: e */
    Object f3425e = null;

    public C0841c(C0889n nVar) {
        this.f3421a = nVar;
    }

    /* renamed from: a */
    public void mo4953a() {
        int i = this.f3422b;
        if (i != 0) {
            if (i == 1) {
                this.f3421a.mo4951b(this.f3423c, this.f3424d);
            } else if (i == 2) {
                this.f3421a.mo4952c(this.f3423c, this.f3424d);
            } else if (i == 3) {
                this.f3421a.mo4950a(this.f3423c, this.f3424d, this.f3425e);
            }
            this.f3425e = null;
            this.f3422b = 0;
        }
    }

    /* renamed from: b */
    public void mo4951b(int i, int i2) {
        if (this.f3422b == 1) {
            int i3 = this.f3423c;
            if (i >= i3) {
                int i4 = this.f3424d;
                if (i <= i3 + i4) {
                    this.f3424d = i4 + i2;
                    this.f3423c = Math.min(i, i3);
                    return;
                }
            }
        }
        mo4953a();
        this.f3423c = i;
        this.f3424d = i2;
        this.f3422b = 1;
    }

    /* renamed from: c */
    public void mo4952c(int i, int i2) {
        if (this.f3422b == 2) {
            int i3 = this.f3423c;
            if (i3 >= i && i3 <= i + i2) {
                this.f3424d += i2;
                this.f3423c = i;
                return;
            }
        }
        mo4953a();
        this.f3423c = i;
        this.f3424d = i2;
        this.f3422b = 2;
    }

    /* renamed from: a */
    public void mo4949a(int i, int i2) {
        mo4953a();
        this.f3421a.mo4949a(i, i2);
    }

    /* renamed from: a */
    public void mo4950a(int i, int i2, Object obj) {
        if (this.f3422b == 3) {
            int i3 = this.f3423c;
            int i4 = this.f3424d;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.f3425e == obj) {
                    int i6 = i4 + i3;
                    this.f3423c = Math.min(i, i3);
                    this.f3424d = Math.max(i6, i5) - this.f3423c;
                    return;
                }
            }
        }
        mo4953a();
        this.f3423c = i;
        this.f3424d = i2;
        this.f3425e = obj;
        this.f3422b = 3;
    }
}
