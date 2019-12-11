package com.bumptech.glide.load.p332m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import java.io.FileNotFoundException;
import java.io.IOException;
import p163g.p413f.p414a.C10657j;

/* renamed from: com.bumptech.glide.load.m.l */
/* compiled from: LocalUriFetcher */
public abstract class C8137l<T> implements C8122d<T> {

    /* renamed from: U */
    private final ContentResolver f17401U;

    /* renamed from: V */
    private T f17402V;

    /* renamed from: c */
    private final Uri f17403c;

    public C8137l(ContentResolver contentResolver, Uri uri) {
        this.f17401U = contentResolver;
        this.f17403c = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo21169a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: a */
    public final void mo21141a(C10657j jVar, C8123a<? super T> aVar) {
        try {
            this.f17402V = mo21169a(this.f17403c, this.f17401U);
            aVar.mo21180a(this.f17402V);
        } catch (FileNotFoundException e) {
            String str = "LocalUriFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            aVar.mo21179a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21171a(T t) throws IOException;

    /* renamed from: b */
    public C8105a mo21142b() {
        return C8105a.LOCAL;
    }

    public void cancel() {
    }

    public void cleanup() {
        T t = this.f17402V;
        if (t != null) {
            try {
                mo21171a(t);
            } catch (IOException unused) {
            }
        }
    }
}
