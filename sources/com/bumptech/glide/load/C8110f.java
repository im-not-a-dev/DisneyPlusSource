package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p341p.p342c.C8381r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
/* compiled from: ImageHeaderParserUtils */
public final class C8110f {
    /* renamed from: a */
    public static ImageType m23528a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageType a = ((ImageHeaderParser) list.get(i)).mo21149a(byteBuffer);
            if (a != ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static ImageType m23529b(List<ImageHeaderParser> list, InputStream inputStream, C8154b bVar) throws IOException {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C8381r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageType a = ((ImageHeaderParser) list.get(i)).mo21148a(inputStream);
                if (a != ImageType.UNKNOWN) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m23527a(List<ImageHeaderParser> list, InputStream inputStream, C8154b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C8381r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).mo21147a(inputStream, bVar);
                if (a != -1) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }
}
