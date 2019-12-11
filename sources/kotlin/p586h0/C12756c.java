package kotlin.p586h0;

import java.util.NoSuchElementException;
import kotlin.p590y.C13162e0;

/* renamed from: kotlin.h0.c */
/* compiled from: ProgressionIterators.kt */
public final class C12756c extends C13162e0 {

    /* renamed from: U */
    private boolean f29420U;

    /* renamed from: V */
    private int f29421V;

    /* renamed from: W */
    private final int f29422W;

    /* renamed from: c */
    private final int f29423c;

    public C12756c(int i, int i2, int i3) {
        this.f29422W = i3;
        this.f29423c = i2;
        boolean z = true;
        if (this.f29422W <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f29420U = z;
        if (!this.f29420U) {
            i = this.f29423c;
        }
        this.f29421V = i;
    }

    /* renamed from: b */
    public int mo31079b() {
        int i = this.f29421V;
        if (i != this.f29423c) {
            this.f29421V = this.f29422W + i;
        } else if (this.f29420U) {
            this.f29420U = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f29420U;
    }
}
