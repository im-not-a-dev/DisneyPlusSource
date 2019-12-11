package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

public interface Cache {

    /* renamed from: com.google.android.exoplayer2.upstream.cache.Cache$a */
    public static class C9457a extends IOException {
        public C9457a(String str) {
            super(str);
        }

        public C9457a(Throwable th) {
            super(th);
        }

        public C9457a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.Cache$b */
    public interface C9458b {
        /* renamed from: a */
        void mo24485a(Cache cache, C9470j jVar);

        /* renamed from: a */
        void mo24486a(Cache cache, C9470j jVar, C9470j jVar2);

        /* renamed from: b */
        void mo24487b(Cache cache, C9470j jVar);
    }

    /* renamed from: a */
    C9470j mo24475a(String str, long j) throws InterruptedException, C9457a;

    /* renamed from: a */
    C9480o mo24476a(String str);

    /* renamed from: a */
    File mo24477a(String str, long j, long j2) throws C9457a;

    /* renamed from: a */
    void mo24478a();

    /* renamed from: a */
    void mo24479a(C9470j jVar);

    /* renamed from: a */
    void mo24480a(File file, long j) throws C9457a;

    /* renamed from: a */
    void mo24481a(String str, C9481p pVar) throws C9457a;

    /* renamed from: b */
    long mo24482b();

    /* renamed from: b */
    long mo24483b(String str, long j, long j2);

    /* renamed from: b */
    C9470j mo24484b(String str, long j) throws C9457a;
}
