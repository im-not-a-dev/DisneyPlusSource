package com.bumptech.glide.load.p341p.p342c;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.c.n */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C8377n implements ImageHeaderParser {
    /* renamed from: a */
    public ImageType mo21148a(InputStream inputStream) throws IOException {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public ImageType mo21149a(ByteBuffer byteBuffer) throws IOException {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public int mo21147a(InputStream inputStream, C8154b bVar) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
