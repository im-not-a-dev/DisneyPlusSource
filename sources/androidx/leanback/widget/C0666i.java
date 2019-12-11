package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.C0668j.C0669a;

/* renamed from: androidx.leanback.widget.i */
/* compiled from: ItemAlignment */
class C0666i {

    /* renamed from: a */
    private int f2868a = 0;

    /* renamed from: b */
    public final C0667a f2869b = new C0667a(1);

    /* renamed from: c */
    public final C0667a f2870c = new C0667a(0);

    /* renamed from: d */
    private C0667a f2871d = this.f2870c;

    /* renamed from: androidx.leanback.widget.i$a */
    /* compiled from: ItemAlignment */
    static final class C0667a extends C0669a {

        /* renamed from: g */
        private int f2872g;

        C0667a(int i) {
            this.f2872g = i;
        }

        /* renamed from: a */
        public int mo3969a(View view) {
            return C0670k.m3579a(view, this, this.f2872g);
        }
    }

    C0666i() {
    }

    /* renamed from: a */
    public final C0667a mo3967a() {
        return this.f2871d;
    }

    /* renamed from: a */
    public final void mo3968a(int i) {
        this.f2868a = i;
        if (this.f2868a == 0) {
            this.f2871d = this.f2870c;
        } else {
            this.f2871d = this.f2869b;
        }
    }
}
