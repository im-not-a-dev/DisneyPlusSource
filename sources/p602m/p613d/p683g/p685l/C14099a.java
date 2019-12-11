package p602m.p613d.p683g.p685l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: m.d.g.l.a */
/* compiled from: Streams */
public final class C14099a {

    /* renamed from: a */
    private static int f31121a = 4096;

    /* renamed from: a */
    public static byte[] m44520a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m44519a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static int m44517a(InputStream inputStream, byte[] bArr) throws IOException {
        return m44518a(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static int m44518a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    /* renamed from: a */
    public static void m44519a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[f31121a];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
