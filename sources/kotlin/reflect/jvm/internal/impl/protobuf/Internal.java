package kotlin.reflect.jvm.internal.impl.protobuf;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final ByteBuffer EMPTY_BYTE_BUFFER = ByteBuffer.wrap(EMPTY_BYTE_ARRAY);

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.isValidUtf8(bArr);
    }

    public static String toStringUtf8(byte[] bArr) {
        try {
            return new String(bArr, Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
