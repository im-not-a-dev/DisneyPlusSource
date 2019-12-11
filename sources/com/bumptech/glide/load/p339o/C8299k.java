package com.bumptech.glide.load.p339o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p332m.p333o.C8141b;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.io.FileNotFoundException;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.k */
/* compiled from: MediaStoreFileLoader */
public final class C8299k implements C8306n<Uri, File> {

    /* renamed from: a */
    private final Context f17762a;

    /* renamed from: com.bumptech.glide.load.o.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C8300a implements C8308o<Uri, File> {

        /* renamed from: a */
        private final Context f17763a;

        public C8300a(Context context) {
            this.f17763a = context;
        }

        /* renamed from: a */
        public C8306n<Uri, File> mo19954a(C8314r rVar) {
            return new C8299k(this.f17763a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C8301b implements C8122d<File> {

        /* renamed from: V */
        private static final String[] f17764V = {"_data"};

        /* renamed from: U */
        private final Uri f17765U;

        /* renamed from: c */
        private final Context f17766c;

        C8301b(Context context, Uri uri) {
            this.f17766c = context;
            this.f17765U = uri;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super File> aVar) {
            Cursor query = this.f17766c.getContentResolver().query(this.f17765U, f17764V, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.f17765U);
                aVar.mo21179a((Exception) new FileNotFoundException(sb.toString()));
                return;
            }
            aVar.mo21180a(new File(str));
        }

        /* renamed from: b */
        public C8105a mo21142b() {
            return C8105a.LOCAL;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        /* renamed from: a */
        public Class<File> mo21140a() {
            return File.class;
        }
    }

    public C8299k(Context context) {
        this.f17762a = context;
    }

    /* renamed from: a */
    public C8307a<File> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(uri), new C8301b(this.f17762a, uri));
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return C8141b.m23619b(uri);
    }
}
