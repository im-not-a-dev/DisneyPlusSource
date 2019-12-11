package p163g.p413f.p414a.p420u.p422m;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C8105a;

/* renamed from: g.f.a.u.m.a */
/* compiled from: DrawableCrossFadeFactory */
public class C10751a implements C10758e<Drawable> {

    /* renamed from: a */
    private final int f25455a;

    /* renamed from: b */
    private final boolean f25456b;

    /* renamed from: c */
    private C10753b f25457c;

    /* renamed from: g.f.a.u.m.a$a */
    /* compiled from: DrawableCrossFadeFactory */
    public static class C10752a {

        /* renamed from: a */
        private final int f25458a;

        /* renamed from: b */
        private boolean f25459b;

        public C10752a(int i) {
            this.f25458a = i;
        }

        /* renamed from: a */
        public C10751a mo27773a() {
            return new C10751a(this.f25458a, this.f25459b);
        }
    }

    protected C10751a(int i, boolean z) {
        this.f25455a = i;
        this.f25456b = z;
    }

    /* renamed from: a */
    public C10756d<Drawable> mo27772a(C8105a aVar, boolean z) {
        return aVar == C8105a.MEMORY_CACHE ? C10754c.m33971a() : m33966a();
    }

    /* renamed from: a */
    private C10756d<Drawable> m33966a() {
        if (this.f25457c == null) {
            this.f25457c = new C10753b(this.f25455a, this.f25456b);
        }
        return this.f25457c;
    }
}
