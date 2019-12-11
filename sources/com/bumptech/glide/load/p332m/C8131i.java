package com.bumptech.glide.load.p332m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.i */
/* compiled from: FileDescriptorLocalUriFetcher */
public class C8131i extends C8137l<ParcelFileDescriptor> {
    public C8131i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m23581a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21171a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo21140a() {
        return ParcelFileDescriptor.class;
    }
}
