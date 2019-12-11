package p551j.p552a.p560j;

import java.util.Random;
import p520io.sentry.event.Event;

/* renamed from: j.a.j.n */
/* compiled from: RandomEventSampler */
public class C12645n implements C12636f {

    /* renamed from: a */
    private double f29322a;

    /* renamed from: b */
    private Random f29323b;

    public C12645n(double d) {
        this(d, new Random());
    }

    /* renamed from: a */
    public boolean mo30938a(Event event) {
        return this.f29322a >= Math.abs(this.f29323b.nextDouble());
    }

    public C12645n(double d, Random random) {
        this.f29322a = d;
        this.f29323b = random;
    }
}
