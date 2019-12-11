package com.bumptech.glide.load.p332m.p333o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C8110f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.m.o.e */
/* compiled from: ThumbnailStreamOpener */
class C8146e {

    /* renamed from: f */
    private static final C8140a f17412f = new C8140a();

    /* renamed from: a */
    private final C8140a f17413a;

    /* renamed from: b */
    private final C8145d f17414b;

    /* renamed from: c */
    private final C8154b f17415c;

    /* renamed from: d */
    private final ContentResolver f17416d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f17417e;

    C8146e(List<ImageHeaderParser> list, C8145d dVar, C8154b bVar, ContentResolver contentResolver) {
        this(list, f17412f, dVar, bVar, contentResolver);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private String m23633c(Uri uri) {
        Cursor a = this.f17414b.mo21202a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    if (a != null) {
                        a.close();
                    }
                    return string;
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo21203a(Uri uri) {
        String str = "ThumbStreamOpener";
        InputStream inputStream = null;
        try {
            inputStream = this.f17416d.openInputStream(uri);
            int a = C8110f.m23527a(this.f17417e, inputStream, this.f17415c);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException e) {
            inputStream = Log.isLoggable(str, 3);
            if (inputStream) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
                Log.d(str, sb.toString(), e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* renamed from: b */
    public InputStream mo21204b(Uri uri) throws FileNotFoundException {
        String c = m23633c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f17413a.mo21199a(c);
        if (!m23632a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f17416d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    C8146e(List<ImageHeaderParser> list, C8140a aVar, C8145d dVar, C8154b bVar, ContentResolver contentResolver) {
        this.f17413a = aVar;
        this.f17414b = dVar;
        this.f17415c = bVar;
        this.f17416d = contentResolver;
        this.f17417e = list;
    }

    /* renamed from: a */
    private boolean m23632a(File file) {
        return this.f17413a.mo21200a(file) && 0 < this.f17413a.mo21201b(file);
    }
}
