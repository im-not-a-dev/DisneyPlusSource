package p602m.p613d.p614a;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: m.d.a.b2 */
/* compiled from: StreamUtil */
class C13485b2 {

    /* renamed from: a */
    private static final long f30021a = Runtime.getRuntime().maxMemory();

    /* renamed from: a */
    static int m41537a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m41538a(InputStream inputStream) {
        if (inputStream instanceof C13663z1) {
            return ((C13663z1) inputStream).mo34876a();
        }
        if (inputStream instanceof C13526k) {
            return ((C13526k) inputStream).mo34809b();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j = f30021a;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    /* renamed from: b */
    static int m41539b(int i) throws IOException {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int length = bArr.length - 1;
        bArr[length] = (byte) (i & 127);
        do {
            i >>= 7;
            length--;
            bArr[length] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (bArr.length - length);
    }
}
