package com.bumptech.glide.load.p332m.p333o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p332m.C8129g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10657j;

/* renamed from: com.bumptech.glide.load.m.o.c */
/* compiled from: ThumbFetcher */
public class C8142c implements C8122d<InputStream> {

    /* renamed from: U */
    private final C8146e f17405U;

    /* renamed from: V */
    private InputStream f17406V;

    /* renamed from: c */
    private final Uri f17407c;

    /* renamed from: com.bumptech.glide.load.m.o.c$a */
    /* compiled from: ThumbFetcher */
    static class C8143a implements C8145d {

        /* renamed from: b */
        private static final String[] f17408b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f17409a;

        C8143a(ContentResolver contentResolver) {
            this.f17409a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21202a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f17409a.query(Thumbnails.EXTERNAL_CONTENT_URI, f17408b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.m.o.c$b */
    /* compiled from: ThumbFetcher */
    static class C8144b implements C8145d {

        /* renamed from: b */
        private static final String[] f17410b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f17411a;

        C8144b(ContentResolver contentResolver) {
            this.f17411a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo21202a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f17411a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f17410b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    C8142c(Uri uri, C8146e eVar) {
        this.f17407c = uri;
        this.f17405U = eVar;
    }

    /* renamed from: a */
    public static C8142c m23622a(Context context, Uri uri) {
        return m23623a(context, uri, new C8143a(context.getContentResolver()));
    }

    /* renamed from: b */
    public static C8142c m23624b(Context context, Uri uri) {
        return m23623a(context, uri, new C8144b(context.getContentResolver()));
    }

    /* renamed from: c */
    private InputStream m23625c() throws FileNotFoundException {
        InputStream b = this.f17405U.mo21204b(this.f17407c);
        int a = b != null ? this.f17405U.mo21203a(this.f17407c) : -1;
        return a != -1 ? new C8129g(b, a) : b;
    }

    public void cancel() {
    }

    public void cleanup() {
        InputStream inputStream = this.f17406V;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static C8142c m23623a(Context context, Uri uri, C8145d dVar) {
        return new C8142c(uri, new C8146e(C10652e.m33418b(context).mo27527g().mo27554a(), dVar, C10652e.m33418b(context).mo27521b(), context.getContentResolver()));
    }

    /* renamed from: b */
    public C8105a mo21142b() {
        return C8105a.LOCAL;
    }

    /* renamed from: a */
    public void mo21141a(C10657j jVar, C8123a<? super InputStream> aVar) {
        try {
            this.f17406V = m23625c();
            aVar.mo21180a(this.f17406V);
        } catch (FileNotFoundException e) {
            String str = "MediaStoreThumbFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to find thumbnail file", e);
            }
            aVar.mo21179a((Exception) e);
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo21140a() {
        return InputStream.class;
    }
}
