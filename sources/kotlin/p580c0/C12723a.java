package kotlin.p580c0;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: kotlin.c0.a */
/* compiled from: IOStreams.kt */
public final class C12723a {
    /* renamed from: a */
    public static /* synthetic */ long m39862a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ContentServiceClientExtras.URL_SIZE_LIMIT;
        }
        return m39861a(inputStream, outputStream, i);
    }

    /* renamed from: a */
    public static final long m39861a(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
