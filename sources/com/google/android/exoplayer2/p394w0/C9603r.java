package com.google.android.exoplayer2.p394w0;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p393v0.Assertions;

/* renamed from: com.google.android.exoplayer2.w0.r */
/* compiled from: VideoRendererEventListener */
public interface C9603r {

    /* renamed from: com.google.android.exoplayer2.w0.r$a */
    /* compiled from: VideoRendererEventListener */
    public static final class C9604a {

        /* renamed from: a */
        private final Handler f22458a;

        /* renamed from: b */
        private final C9603r f22459b;

        public C9604a(Handler handler, C9603r rVar) {
            Handler handler2;
            if (rVar != null) {
                Assertions.checkNotNull(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f22458a = handler2;
            this.f22459b = rVar;
        }

        /* renamed from: a */
        public void mo24784a(String str, long j, long j2) {
            if (this.f22459b != null) {
                Handler handler = this.f22458a;
                C9581d dVar = new C9581d(this, str, j, j2);
                handler.post(dVar);
            }
        }

        /* renamed from: b */
        public void mo24789b(C8878d dVar) {
            if (this.f22459b != null) {
                this.f22458a.post(new C9582e(this, dVar));
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo24791c(C8878d dVar) {
            dVar.mo23222a();
            this.f22459b.mo7744d(dVar);
        }

        /* renamed from: d */
        public /* synthetic */ void mo24792d(C8878d dVar) {
            this.f22459b.mo7743c(dVar);
        }

        /* renamed from: a */
        public void mo24782a(Format format) {
            if (this.f22459b != null) {
                this.f22458a.post(new C9578a(this, format));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo24790b(String str, long j, long j2) {
            this.f22459b.mo7739a(str, j, j2);
        }

        /* renamed from: b */
        public /* synthetic */ void mo24788b(Format format) {
            this.f22459b.mo7737a(format);
        }

        /* renamed from: a */
        public void mo24780a(int i, long j) {
            if (this.f22459b != null) {
                this.f22458a.post(new C9584g(this, i, j));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo24786b(int i, long j) {
            this.f22459b.mo7734a(i, j);
        }

        /* renamed from: b */
        public void mo24785b(int i, int i2, int i3, float f) {
            if (this.f22459b != null) {
                Handler handler = this.f22458a;
                C9580c cVar = new C9580c(this, i, i2, i3, f);
                handler.post(cVar);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo24779a(int i, int i2, int i3, float f) {
            this.f22459b.mo7733a(i, i2, i3, f);
        }

        /* renamed from: a */
        public /* synthetic */ void mo24781a(Surface surface) {
            this.f22459b.mo7736a(surface);
        }

        /* renamed from: b */
        public void mo24787b(Surface surface) {
            if (this.f22459b != null) {
                this.f22458a.post(new C9579b(this, surface));
            }
        }

        /* renamed from: a */
        public void mo24783a(C8878d dVar) {
            dVar.mo23222a();
            if (this.f22459b != null) {
                this.f22458a.post(new C9583f(this, dVar));
            }
        }
    }

    /* renamed from: a */
    void mo7733a(int i, int i2, int i3, float f);

    /* renamed from: a */
    void mo7734a(int i, long j);

    /* renamed from: a */
    void mo7736a(Surface surface);

    /* renamed from: a */
    void mo7737a(Format format);

    /* renamed from: a */
    void mo7739a(String str, long j, long j2);

    /* renamed from: c */
    void mo7743c(C8878d dVar);

    /* renamed from: d */
    void mo7744d(C8878d dVar);
}
