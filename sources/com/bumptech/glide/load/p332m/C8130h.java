package com.bumptech.glide.load.p332m;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.h */
/* compiled from: FileDescriptorAssetPathFetcher */
public class C8130h extends C8120b<ParcelFileDescriptor> {
    public C8130h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m23576a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21173a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo21140a() {
        return ParcelFileDescriptor.class;
    }
}
