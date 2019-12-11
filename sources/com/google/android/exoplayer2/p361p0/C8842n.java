package com.google.android.exoplayer2.p361p0;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8878d;
import com.google.android.exoplayer2.p393v0.Assertions;

/* renamed from: com.google.android.exoplayer2.p0.n */
/* compiled from: AudioRendererEventListener */
public interface C8842n {

    /* renamed from: com.google.android.exoplayer2.p0.n$a */
    /* compiled from: AudioRendererEventListener */
    public static final class C8843a {

        /* renamed from: a */
        private final Handler f18848a;

        /* renamed from: b */
        private final C8842n f18849b;

        public C8843a(Handler handler, C8842n nVar) {
            Handler handler2;
            if (nVar != null) {
                Assertions.checkNotNull(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f18848a = handler2;
            this.f18849b = nVar;
        }

        /* renamed from: a */
        public void mo23097a(String str, long j, long j2) {
            if (this.f18849b != null) {
                Handler handler = this.f18848a;
                C8817b bVar = new C8817b(this, str, j, j2);
                handler.post(bVar);
            }
        }

        /* renamed from: b */
        public void mo23101b(C8878d dVar) {
            if (this.f18849b != null) {
                this.f18848a.post(new C8819c(this, dVar));
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo23103c(C8878d dVar) {
            dVar.mo23222a();
            this.f18849b.mo7738a(dVar);
        }

        /* renamed from: d */
        public /* synthetic */ void mo23104d(C8878d dVar) {
            this.f18849b.mo7741b(dVar);
        }

        /* renamed from: a */
        public void mo23095a(Format format) {
            if (this.f18849b != null) {
                this.f18848a.post(new C8815a(this, format));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo23102b(String str, long j, long j2) {
            this.f18849b.mo7742b(str, j, j2);
        }

        /* renamed from: b */
        public /* synthetic */ void mo23100b(Format format) {
            this.f18849b.mo7740b(format);
        }

        /* renamed from: a */
        public void mo23094a(int i, long j, long j2) {
            if (this.f18849b != null) {
                Handler handler = this.f18848a;
                C8824f fVar = new C8824f(this, i, j, j2);
                handler.post(fVar);
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo23099b(int i, long j, long j2) {
            this.f18849b.mo7735a(i, j, j2);
        }

        /* renamed from: b */
        public /* synthetic */ void mo23098b(int i) {
            this.f18849b.mo7732a(i);
        }

        /* renamed from: a */
        public void mo23096a(C8878d dVar) {
            dVar.mo23222a();
            if (this.f18849b != null) {
                this.f18848a.post(new C8823e(this, dVar));
            }
        }

        /* renamed from: a */
        public void mo23093a(int i) {
            if (this.f18849b != null) {
                this.f18848a.post(new C8821d(this, i));
            }
        }
    }

    /* renamed from: a */
    void mo7732a(int i);

    /* renamed from: a */
    void mo7735a(int i, long j, long j2);

    /* renamed from: a */
    void mo7738a(C8878d dVar);

    /* renamed from: b */
    void mo7740b(Format format);

    /* renamed from: b */
    void mo7741b(C8878d dVar);

    /* renamed from: b */
    void mo7742b(String str, long j, long j2);
}
