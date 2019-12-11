package com.bumptech.glide.load.p341p.p346g;

import android.util.Log;
import com.bumptech.glide.load.C8110f;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.bumptech.glide.load.p.g.j */
/* compiled from: StreamGifDecoder */
public class C8424j implements C8116j<InputStream, C8412c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f17951a;

    /* renamed from: b */
    private final C8116j<ByteBuffer, C8412c> f17952b;

    /* renamed from: c */
    private final C8154b f17953c;

    public C8424j(List<ImageHeaderParser> list, C8116j<ByteBuffer, C8412c> jVar, C8154b bVar) {
        this.f17951a = list;
        this.f17952b = jVar;
        this.f17953c = bVar;
    }

    /* renamed from: a */
    public boolean mo21166a(InputStream inputStream, C8115i iVar) throws IOException {
        return !((Boolean) iVar.mo21162a(C8423i.f17950b)).booleanValue() && C8110f.m23529b(this.f17951a, inputStream, this.f17953c) == ImageType.GIF;
    }

    /* renamed from: a */
    public C8258v<C8412c> mo21165a(InputStream inputStream, int i, int i2, C8115i iVar) throws IOException {
        byte[] a = m24512a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f17952b.mo21165a(ByteBuffer.wrap(a), i, i2, iVar);
    }

    /* renamed from: a */
    private static byte[] m24512a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DateUtils.FORMAT_ABBREV_TIME);
        try {
            byte[] bArr = new byte[DateUtils.FORMAT_ABBREV_TIME];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            String str = "StreamGifDecoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Error reading data from stream", e);
            }
            return null;
        }
    }
}
