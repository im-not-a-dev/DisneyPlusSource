package com.bumptech.glide.load.p341p.p342c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.c.i */
/* compiled from: DefaultImageHeaderParser */
public final class C8358i implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f17839a = "Exif\u0000\u0000".getBytes(Charset.forName(Utf8Charset.NAME));

    /* renamed from: b */
    private static final int[] f17840b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.p.c.i$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C8359a implements C8361c {

        /* renamed from: a */
        private final ByteBuffer f17841a;

        C8359a(ByteBuffer byteBuffer) {
            this.f17841a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo21527a() {
            return ((getByte() << 8) & 65280) | (getByte() & 255);
        }

        /* renamed from: b */
        public short mo21529b() {
            return (short) (getByte() & 255);
        }

        public int getByte() {
            if (this.f17841a.remaining() < 1) {
                return -1;
            }
            return this.f17841a.get();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f17841a.remaining(), j);
            ByteBuffer byteBuffer = this.f17841a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: a */
        public int mo21528a(byte[] bArr, int i) {
            int min = Math.min(i, this.f17841a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f17841a.get(bArr, 0, min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.i$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C8360b {

        /* renamed from: a */
        private final ByteBuffer f17842a;

        C8360b(byte[] bArr, int i) {
            this.f17842a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21534a(ByteOrder byteOrder) {
            this.f17842a.order(byteOrder);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo21535b(int i) {
            if (m24293a(i, 4)) {
                return this.f17842a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo21532a() {
            return this.f17842a.remaining();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public short mo21533a(int i) {
            if (m24293a(i, 2)) {
                return this.f17842a.getShort(i);
            }
            return -1;
        }

        /* renamed from: a */
        private boolean m24293a(int i, int i2) {
            return this.f17842a.remaining() - i >= i2;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.i$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C8361c {
        /* renamed from: a */
        int mo21527a() throws IOException;

        /* renamed from: a */
        int mo21528a(byte[] bArr, int i) throws IOException;

        /* renamed from: b */
        short mo21529b() throws IOException;

        int getByte() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.p.c.i$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C8362d implements C8361c {

        /* renamed from: a */
        private final InputStream f17843a;

        C8362d(InputStream inputStream) {
            this.f17843a = inputStream;
        }

        /* renamed from: a */
        public int mo21527a() throws IOException {
            return ((this.f17843a.read() << 8) & 65280) | (this.f17843a.read() & 255);
        }

        /* renamed from: b */
        public short mo21529b() throws IOException {
            return (short) (this.f17843a.read() & 255);
        }

        public int getByte() throws IOException {
            return this.f17843a.read();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f17843a.skip(j2);
                if (skip <= 0) {
                    if (this.f17843a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: a */
        public int mo21528a(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f17843a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    private static int m24279a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m24284a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: b */
    private int m24286b(C8361c cVar) throws IOException {
        String str;
        short b;
        int a;
        long j;
        long skip;
        do {
            short b2 = cVar.mo21529b();
            str = "DfltImageHeaderParser";
            if (b2 != 255) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(b2);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            b = cVar.mo21529b();
            if (b == 218) {
                return -1;
            }
            if (b == 217) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo21527a() - 2;
            if (b == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(b);
            sb2.append(", wanted to skip: ");
            sb2.append(a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
            Log.d(str, sb2.toString());
        }
        return -1;
    }

    /* renamed from: a */
    public ImageType mo21148a(InputStream inputStream) throws IOException {
        C10774j.m34012a(inputStream);
        return m24283a((C8361c) new C8362d(inputStream));
    }

    /* renamed from: a */
    public ImageType mo21149a(ByteBuffer byteBuffer) throws IOException {
        C10774j.m34012a(byteBuffer);
        return m24283a((C8361c) new C8359a(byteBuffer));
    }

    /* renamed from: a */
    public int mo21147a(InputStream inputStream, C8154b bVar) throws IOException {
        C10774j.m34012a(inputStream);
        C8362d dVar = new C8362d(inputStream);
        C10774j.m34012a(bVar);
        return m24281a((C8361c) dVar, bVar);
    }

    /* renamed from: a */
    private ImageType m24283a(C8361c cVar) throws IOException {
        int a = cVar.mo21527a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        int a2 = ((a << 16) & -65536) | (cVar.mo21527a() & 65535);
        if (a2 == -1991225785) {
            cVar.skip(21);
            return cVar.getByte() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageType.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.mo21527a() << 16) & -65536) | (cVar.mo21527a() & 65535)) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo21527a() << 16) & -65536) | (cVar.mo21527a() & 65535);
            if ((a3 & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.getByte() & 16) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            } else if (i != 76) {
                return ImageType.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.getByte() & 8) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    private int m24281a(C8361c cVar, C8154b bVar) throws IOException {
        int a = cVar.mo21527a();
        String str = "DfltImageHeaderParser";
        if (!m24284a(a)) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            return -1;
        }
        int b = m24286b(cVar);
        if (b == -1) {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo21224b(b, byte[].class);
        try {
            return m24282a(cVar, bArr, b);
        } finally {
            bVar.mo21223a(bArr);
        }
    }

    /* renamed from: a */
    private int m24282a(C8361c cVar, byte[] bArr, int i) throws IOException {
        int a = cVar.mo21528a(bArr, i);
        String str = "DfltImageHeaderParser";
        if (a != i) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            return -1;
        } else if (m24285a(bArr, i)) {
            return m24280a(new C8360b(bArr, i));
        } else {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m24285a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f17839a.length;
        if (!z) {
            return z;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f17839a;
            if (i2 >= bArr2.length) {
                return z;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m24280a(C8360b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo21533a(6);
        String str = "DfltImageHeaderParser";
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo21534a(byteOrder);
        int b = bVar.mo21535b(10) + 6;
        short a2 = bVar.mo21533a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m24279a(b, i);
            short a4 = bVar.mo21533a(a3);
            if (a4 == 274) {
                short a5 = bVar.mo21533a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = bVar.mo21535b(a3 + 4);
                    if (b2 >= 0) {
                        String str2 = " tagType=";
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(str2);
                            sb2.append(a4);
                            sb2.append(" formatCode=");
                            sb2.append(a5);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                            Log.d(str, sb2.toString());
                        }
                        int i2 = b2 + f17840b[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > bVar.mo21532a()) {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(str2);
                                    sb3.append(a4);
                                    Log.d(str, sb3.toString());
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo21532a()) {
                                return bVar.mo21533a(i3);
                            } else {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a4);
                                    Log.d(str, sb4.toString());
                                }
                            }
                        } else if (Log.isLoggable(str, 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a5);
                            Log.d(str, sb5.toString());
                        }
                    } else if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(str, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a5);
                    Log.d(str, sb6.toString());
                }
            }
        }
        return -1;
    }
}
