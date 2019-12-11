package com.bumptech.glide.load.p332m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import java.io.IOException;
import p163g.p413f.p414a.C10657j;

/* renamed from: com.bumptech.glide.load.m.b */
/* compiled from: AssetPathFetcher */
public abstract class C8120b<T> implements C8122d<T> {

    /* renamed from: U */
    private final AssetManager f17377U;

    /* renamed from: V */
    private T f17378V;

    /* renamed from: c */
    private final String f17379c;

    public C8120b(AssetManager assetManager, String str) {
        this.f17377U = assetManager;
        this.f17379c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo21172a(AssetManager assetManager, String str) throws IOException;

    /* renamed from: a */
    public void mo21141a(C10657j jVar, C8123a<? super T> aVar) {
        try {
            this.f17378V = mo21172a(this.f17377U, this.f17379c);
            aVar.mo21180a(this.f17378V);
        } catch (IOException e) {
            String str = "AssetPathFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to load data from asset manager", e);
            }
            aVar.mo21179a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21173a(T t) throws IOException;

    /* renamed from: b */
    public C8105a mo21142b() {
        return C8105a.LOCAL;
    }

    public void cancel() {
    }

    public void cleanup() {
        T t = this.f17378V;
        if (t != null) {
            try {
                mo21173a(t);
            } catch (IOException unused) {
            }
        }
    }
}
