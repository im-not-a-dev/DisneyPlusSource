package com.bumptech.glide.load;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.g */
/* compiled from: Key */
public interface C8111g {

    /* renamed from: a */
    public static final Charset f17370a = Charset.forName(Utf8Charset.NAME);

    /* renamed from: a */
    void mo21152a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
