package com.facebook.stetho.server.http;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public abstract class LightHttpBody {
    public static LightHttpBody create(String str, String str2) {
        try {
            return create(str.getBytes(Utf8Charset.NAME), str2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract int contentLength();

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static LightHttpBody create(final byte[] bArr, final String str) {
        return new LightHttpBody() {
            public int contentLength() {
                return bArr.length;
            }

            public String contentType() {
                return str;
            }

            public void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
    }
}
