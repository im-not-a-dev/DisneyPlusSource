package com.bumptech.glide.load.p339o;

import android.util.Base64;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.e */
/* compiled from: DataUrlLoader */
public final class C8279e<Model, Data> implements C8306n<Model, Data> {

    /* renamed from: a */
    private final C8280a<Data> f17738a;

    /* renamed from: com.bumptech.glide.load.o.e$a */
    /* compiled from: DataUrlLoader */
    public interface C8280a<Data> {
        /* renamed from: a */
        Class<Data> mo21451a();

        /* renamed from: a */
        Data mo21452a(String str) throws IllegalArgumentException;

        /* renamed from: a */
        void mo21453a(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.o.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C8281b<Data> implements C8122d<Data> {

        /* renamed from: U */
        private final C8280a<Data> f17739U;

        /* renamed from: V */
        private Data f17740V;

        /* renamed from: c */
        private final String f17741c;

        C8281b(String str, C8280a<Data> aVar) {
            this.f17741c = str;
            this.f17739U = aVar;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super Data> aVar) {
            try {
                this.f17740V = this.f17739U.mo21452a(this.f17741c);
                aVar.mo21180a(this.f17740V);
            } catch (IllegalArgumentException e) {
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
            try {
                this.f17739U.mo21453a(this.f17740V);
            } catch (IOException unused) {
            }
        }

        /* renamed from: a */
        public Class<Data> mo21140a() {
            return this.f17739U.mo21451a();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C8282c<Model> implements C8308o<Model, InputStream> {

        /* renamed from: a */
        private final C8280a<InputStream> f17742a = new C8283a(this);

        /* renamed from: com.bumptech.glide.load.o.e$c$a */
        /* compiled from: DataUrlLoader */
        class C8283a implements C8280a<InputStream> {
            C8283a(C8282c cVar) {
            }

            /* renamed from: a */
            public InputStream m24069a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }

            /* renamed from: a */
            public void mo21453a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo21451a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C8306n<Model, InputStream> mo19954a(C8314r rVar) {
            return new C8279e(this.f17742a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8279e(C8280a<Data> aVar) {
        this.f17738a = aVar;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(Model model, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(model), new C8281b(model.toString(), this.f17738a));
    }

    /* renamed from: a */
    public boolean mo19953a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
