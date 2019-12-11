package com.bumptech.glide.load.p332m;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.m */
/* compiled from: StreamAssetPathFetcher */
public class C8138m extends C8120b<InputStream> {
    public C8138m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m23604a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21173a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo21140a() {
        return InputStream.class;
    }
}
