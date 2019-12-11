package com.bamtech.core.networking.converters;

import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;
import okhttp3.C14258u;
import okio.BufferedSource;

/* renamed from: com.bamtech.core.networking.converters.b */
/* compiled from: RawBytesConverter.kt */
public final class C1685b implements Converter {
    public C1685b() {
        C14258u.m45482b("application/octet-stream");
    }

    /* renamed from: a */
    public <T> T mo7495a(String str, Class<?> cls) {
        if (str == null) {
            return null;
        }
        Charset charset = C12801c.f29474a;
        if (str != null) {
            Object bytes = str.getBytes(charset);
            Intrinsics.checkReturnedValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public <T> String serialize(T t) {
        if (t != null) {
            return new String((byte[]) t, C12801c.f29474a);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
    }

    /* renamed from: a */
    public <T> T mo7496a(BufferedSource bufferedSource, Class<?> cls) {
        if (bufferedSource != null) {
            return bufferedSource.mo36287Y();
        }
        return null;
    }
}
