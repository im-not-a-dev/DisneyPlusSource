package com.bumptech.glide.load.p339o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.f */
/* compiled from: FileLoader */
public class C8284f<Data> implements C8306n<File, Data> {

    /* renamed from: a */
    private final C8289d<Data> f17743a;

    /* renamed from: com.bumptech.glide.load.o.f$a */
    /* compiled from: FileLoader */
    public static class C8285a<Data> implements C8308o<File, Data> {

        /* renamed from: a */
        private final C8289d<Data> f17744a;

        public C8285a(C8289d<Data> dVar) {
            this.f17744a = dVar;
        }

        /* renamed from: a */
        public final C8306n<File, Data> mo19954a(C8314r rVar) {
            return new C8284f(this.f17744a);
        }

        /* renamed from: a */
        public final void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$b */
    /* compiled from: FileLoader */
    public static class C8286b extends C8285a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.o.f$b$a */
        /* compiled from: FileLoader */
        class C8287a implements C8289d<ParcelFileDescriptor> {
            C8287a() {
            }

            /* renamed from: a */
            public ParcelFileDescriptor m24080a(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: a */
            public void mo21460a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo21458a() {
                return ParcelFileDescriptor.class;
            }
        }

        public C8286b() {
            super(new C8287a());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$c */
    /* compiled from: FileLoader */
    private static final class C8288c<Data> implements C8122d<Data> {

        /* renamed from: U */
        private final C8289d<Data> f17745U;

        /* renamed from: V */
        private Data f17746V;

        /* renamed from: c */
        private final File f17747c;

        C8288c(File file, C8289d<Data> dVar) {
            this.f17747c = file;
            this.f17745U = dVar;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super Data> aVar) {
            try {
                this.f17746V = this.f17745U.mo21457a(this.f17747c);
                aVar.mo21180a(this.f17746V);
            } catch (FileNotFoundException e) {
                String str = "FileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to open file", e);
                }
                aVar.mo21179a((Exception) e);
            }
        }

        /* renamed from: b */
        public C8105a mo21142b() {
            return C8105a.LOCAL;
        }

        public void cancel() {
        }

        public void cleanup() {
            Data data = this.f17746V;
            if (data != null) {
                try {
                    this.f17745U.mo21460a(data);
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public Class<Data> mo21140a() {
            return this.f17745U.mo21458a();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$d */
    /* compiled from: FileLoader */
    public interface C8289d<Data> {
        /* renamed from: a */
        Class<Data> mo21458a();

        /* renamed from: a */
        Data mo21457a(File file) throws FileNotFoundException;

        /* renamed from: a */
        void mo21460a(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.o.f$e */
    /* compiled from: FileLoader */
    public static class C8290e extends C8285a<InputStream> {

        /* renamed from: com.bumptech.glide.load.o.f$e$a */
        /* compiled from: FileLoader */
        class C8291a implements C8289d<InputStream> {
            C8291a() {
            }

            /* renamed from: a */
            public InputStream m24091a(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            /* renamed from: a */
            public void mo21460a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo21458a() {
                return InputStream.class;
            }
        }

        public C8290e() {
            super(new C8291a());
        }
    }

    public C8284f(C8289d<Data> dVar) {
        this.f17743a = dVar;
    }

    /* renamed from: a */
    public boolean mo19953a(File file) {
        return true;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(File file, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(file), new C8288c(file, this.f17743a));
    }
}
