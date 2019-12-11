package com.bumptech.glide.load.p332m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.a */
/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class C8119a extends C8137l<AssetFileDescriptor> {
    public C8119a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AssetFileDescriptor m23551a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21171a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo21140a() {
        return AssetFileDescriptor.class;
    }
}
