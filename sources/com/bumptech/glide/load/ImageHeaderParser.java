package com.bumptech.glide.load;

import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: c */
        private final boolean f17355c;

        private ImageType(boolean z) {
            this.f17355c = z;
        }

        public boolean hasAlpha() {
            return this.f17355c;
        }
    }

    /* renamed from: a */
    int mo21147a(InputStream inputStream, C8154b bVar) throws IOException;

    /* renamed from: a */
    ImageType mo21148a(InputStream inputStream) throws IOException;

    /* renamed from: a */
    ImageType mo21149a(ByteBuffer byteBuffer) throws IOException;
}
