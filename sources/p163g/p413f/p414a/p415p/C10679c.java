package p163g.p413f.p414a.p415p;

import com.facebook.stetho.common.Utf8Charset;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g.f.a.p.c */
/* compiled from: Util */
final class C10679c {

    /* renamed from: a */
    static final Charset f25241a = Charset.forName("US-ASCII");

    static {
        Charset.forName(Utf8Charset.NAME);
    }

    /* renamed from: a */
    static void m33558a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m33558a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    /* renamed from: a */
    static void m33557a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
