package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.b0 */
/* compiled from: LoaderErrorThrower */
public interface LoaderErrorThrower {

    /* renamed from: com.google.android.exoplayer2.upstream.b0$a */
    /* compiled from: LoaderErrorThrower */
    public static final class Dummy implements LoaderErrorThrower {
        /* renamed from: a */
        public void maybeThrowError() throws IOException {
        }
    }

    /* renamed from: a */
    void maybeThrowError() throws IOException;
}
