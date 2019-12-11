package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
/* compiled from: HttpException */
public final class C8109e extends IOException {
    public C8109e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Http request failed with status code: ");
        sb.append(i);
        this(sb.toString(), i);
    }

    public C8109e(String str) {
        this(str, -1);
    }

    public C8109e(String str, int i) {
        this(str, i, null);
    }

    public C8109e(String str, int i, Throwable th) {
        super(str, th);
    }
}
