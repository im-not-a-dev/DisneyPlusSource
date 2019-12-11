package okhttp3.p688d0.p694l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C14287m;
import okio.C14300v;
import okio.C14302x;

/* renamed from: okhttp3.d0.l.a */
/* compiled from: FileSystem */
public interface C14215a {

    /* renamed from: a */
    public static final C14215a f31699a = new C14216a();

    /* renamed from: okhttp3.d0.l.a$a */
    /* compiled from: FileSystem */
    class C14216a implements C14215a {
        C14216a() {
        }

        /* renamed from: a */
        public C14302x mo36123a(File file) throws FileNotFoundException {
            return C14287m.m45728c(file);
        }

        /* renamed from: b */
        public C14300v mo36125b(File file) throws FileNotFoundException {
            try {
                return C14287m.m45726b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C14287m.m45726b(file);
            }
        }

        /* renamed from: c */
        public void mo36126c(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo36126c(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
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

        /* renamed from: d */
        public boolean mo36127d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo36128e(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        /* renamed from: f */
        public C14300v mo36129f(File file) throws FileNotFoundException {
            try {
                return C14287m.m45719a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C14287m.m45719a(file);
            }
        }

        /* renamed from: g */
        public long mo36130g(File file) {
            return file.length();
        }

        /* renamed from: a */
        public void mo36124a(File file, File file2) throws IOException {
            mo36128e(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    C14302x mo36123a(File file) throws FileNotFoundException;

    /* renamed from: a */
    void mo36124a(File file, File file2) throws IOException;

    /* renamed from: b */
    C14300v mo36125b(File file) throws FileNotFoundException;

    /* renamed from: c */
    void mo36126c(File file) throws IOException;

    /* renamed from: d */
    boolean mo36127d(File file);

    /* renamed from: e */
    void mo36128e(File file) throws IOException;

    /* renamed from: f */
    C14300v mo36129f(File file) throws FileNotFoundException;

    /* renamed from: g */
    long mo36130g(File file);
}
