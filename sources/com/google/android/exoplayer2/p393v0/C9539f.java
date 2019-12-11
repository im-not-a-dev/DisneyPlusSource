package com.google.android.exoplayer2.p393v0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.exoplayer2.v0.f */
/* compiled from: AtomicFile */
public final class C9539f {

    /* renamed from: a */
    private final File f22252a;

    /* renamed from: b */
    private final File f22253b;

    /* renamed from: com.google.android.exoplayer2.v0.f$a */
    /* compiled from: AtomicFile */
    private static final class C9540a extends OutputStream {

        /* renamed from: U */
        private boolean f22254U = false;

        /* renamed from: c */
        private final FileOutputStream f22255c;

        public C9540a(File file) throws FileNotFoundException {
            this.f22255c = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f22254U) {
                this.f22254U = true;
                flush();
                try {
                    this.f22255c.getFD().sync();
                } catch (IOException e) {
                    C9563q.m29498b("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f22255c.close();
            }
        }

        public void flush() throws IOException {
            this.f22255c.flush();
        }

        public void write(int i) throws IOException {
            this.f22255c.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f22255c.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f22255c.write(bArr, i, i2);
        }
    }

    public C9539f(File file) {
        this.f22252a = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.f22253b = new File(sb.toString());
    }

    /* renamed from: e */
    private void m29306e() {
        if (this.f22253b.exists()) {
            this.f22252a.delete();
            this.f22253b.renameTo(this.f22252a);
        }
    }

    /* renamed from: a */
    public void mo24608a() {
        this.f22252a.delete();
        this.f22253b.delete();
    }

    /* renamed from: b */
    public boolean mo24610b() {
        return this.f22252a.exists() || this.f22253b.exists();
    }

    /* renamed from: c */
    public InputStream mo24611c() throws FileNotFoundException {
        m29306e();
        return new FileInputStream(this.f22252a);
    }

    /* renamed from: d */
    public OutputStream mo24612d() throws IOException {
        if (this.f22252a.exists()) {
            if (this.f22253b.exists()) {
                this.f22252a.delete();
            } else if (!this.f22252a.renameTo(this.f22253b)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't rename file ");
                sb.append(this.f22252a);
                sb.append(" to backup file ");
                sb.append(this.f22253b);
                C9563q.m29500d("AtomicFile", sb.toString());
            }
        }
        try {
            return new C9540a(this.f22252a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f22252a.getParentFile();
            String str = "Couldn't create ";
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f22252a);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new C9540a(this.f22252a);
            } catch (FileNotFoundException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.f22252a);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public void mo24609a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f22253b.delete();
    }
}
