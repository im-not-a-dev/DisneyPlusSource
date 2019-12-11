package okhttp3.p688d0.p693k;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.danlew.android.joda.DateUtils;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C14287m;
import okio.C14302x;

/* renamed from: okhttp3.d0.k.d */
/* compiled from: Hpack */
final class C14181d {

    /* renamed from: a */
    static final C14180c[] f31552a;

    /* renamed from: b */
    static final Map<ByteString, Integer> f31553b = m45091a();

    /* renamed from: okhttp3.d0.k.d$a */
    /* compiled from: Hpack */
    static final class C14182a {

        /* renamed from: a */
        private final List<C14180c> f31554a;

        /* renamed from: b */
        private final BufferedSource f31555b;

        /* renamed from: c */
        private final int f31556c;

        /* renamed from: d */
        private int f31557d;

        /* renamed from: e */
        C14180c[] f31558e;

        /* renamed from: f */
        int f31559f;

        /* renamed from: g */
        int f31560g;

        /* renamed from: h */
        int f31561h;

        C14182a(int i, C14302x xVar) {
            this(i, i, xVar);
        }

        /* renamed from: b */
        private int m45095b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f31558e.length;
                while (true) {
                    length--;
                    if (length < this.f31559f || i <= 0) {
                        C14180c[] cVarArr = this.f31558e;
                        int i3 = this.f31559f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f31560g);
                        this.f31559f += i2;
                    } else {
                        C14180c[] cVarArr2 = this.f31558e;
                        i -= cVarArr2[length].f31551c;
                        this.f31561h -= cVarArr2[length].f31551c;
                        this.f31560g--;
                        i2++;
                    }
                }
                C14180c[] cVarArr3 = this.f31558e;
                int i32 = this.f31559f;
                System.arraycopy(cVarArr3, i32 + 1, cVarArr3, i32 + 1 + i2, this.f31560g);
                this.f31559f += i2;
            }
            return i2;
        }

        /* renamed from: d */
        private void m45097d() {
            int i = this.f31557d;
            int i2 = this.f31561h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m45099e();
            } else {
                m45095b(i2 - i);
            }
        }

        /* renamed from: e */
        private void m45099e() {
            Arrays.fill(this.f31558e, null);
            this.f31559f = this.f31558e.length - 1;
            this.f31560g = 0;
            this.f31561h = 0;
        }

        /* renamed from: f */
        private void m45102f(int i) throws IOException {
            m45094a(-1, new C14180c(m45096c(i), mo36025b()));
        }

        /* renamed from: g */
        private void m45104g(int i) throws IOException {
            this.f31554a.add(new C14180c(m45096c(i), mo36025b()));
        }

        /* renamed from: h */
        private void m45105h() throws IOException {
            ByteString b = mo36025b();
            C14181d.m45092a(b);
            this.f31554a.add(new C14180c(b, mo36025b()));
        }

        /* renamed from: a */
        public List<C14180c> mo36024a() {
            ArrayList arrayList = new ArrayList(this.f31554a);
            this.f31554a.clear();
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36026c() throws IOException {
            while (!this.f31555b.mo36309a0()) {
                byte readByte = this.f31555b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m45100e(mo36023a((int) readByte, 127) - 1);
                } else if (readByte == 64) {
                    m45103g();
                } else if ((readByte & 64) == 64) {
                    m45102f(mo36023a((int) readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f31557d = mo36023a((int) readByte, 31);
                    int i = this.f31557d;
                    if (i < 0 || i > this.f31556c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.f31557d);
                        throw new IOException(sb.toString());
                    }
                    m45097d();
                } else if (readByte == 16 || readByte == 0) {
                    m45105h();
                } else {
                    m45104g(mo36023a((int) readByte, 15) - 1);
                }
            }
        }

        C14182a(int i, int i2, C14302x xVar) {
            this.f31554a = new ArrayList();
            this.f31558e = new C14180c[8];
            this.f31559f = this.f31558e.length - 1;
            this.f31560g = 0;
            this.f31561h = 0;
            this.f31556c = i;
            this.f31557d = i2;
            this.f31555b = C14287m.m45716a(xVar);
        }

        /* renamed from: a */
        private int m45093a(int i) {
            return this.f31559f + 1 + i;
        }

        /* renamed from: a */
        private void m45094a(int i, C14180c cVar) {
            this.f31554a.add(cVar);
            int i2 = cVar.f31551c;
            if (i != -1) {
                i2 -= this.f31558e[m45093a(i)].f31551c;
            }
            int i3 = this.f31557d;
            if (i2 > i3) {
                m45099e();
                return;
            }
            int b = m45095b((this.f31561h + i2) - i3);
            if (i == -1) {
                int i4 = this.f31560g + 1;
                C14180c[] cVarArr = this.f31558e;
                if (i4 > cVarArr.length) {
                    C14180c[] cVarArr2 = new C14180c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f31559f = this.f31558e.length - 1;
                    this.f31558e = cVarArr2;
                }
                int i5 = this.f31559f;
                this.f31559f = i5 - 1;
                this.f31558e[i5] = cVar;
                this.f31560g++;
            } else {
                this.f31558e[i + m45093a(i) + b] = cVar;
            }
            this.f31561h += i2;
        }

        /* renamed from: d */
        private boolean m45098d(int i) {
            return i >= 0 && i <= C14181d.f31552a.length - 1;
        }

        /* renamed from: f */
        private int m45101f() throws IOException {
            return this.f31555b.readByte() & 255;
        }

        /* renamed from: g */
        private void m45103g() throws IOException {
            ByteString b = mo36025b();
            C14181d.m45092a(b);
            m45094a(-1, new C14180c(b, mo36025b()));
        }

        /* renamed from: e */
        private void m45100e(int i) throws IOException {
            if (m45098d(i)) {
                this.f31554a.add(C14181d.f31552a[i]);
                return;
            }
            int a = m45093a(i - C14181d.f31552a.length);
            if (a >= 0) {
                C14180c[] cVarArr = this.f31558e;
                if (a < cVarArr.length) {
                    this.f31554a.add(cVarArr[a]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public ByteString mo36025b() throws IOException {
            int f = m45101f();
            boolean z = (f & 128) == 128;
            int a = mo36023a(f, 127);
            if (z) {
                return ByteString.m45612a(C14209k.m45263b().mo36108a(this.f31555b.mo36326e((long) a)));
            }
            return this.f31555b.mo36319c((long) a);
        }

        /* renamed from: c */
        private ByteString m45096c(int i) throws IOException {
            if (m45098d(i)) {
                return C14181d.f31552a[i].f31549a;
            }
            int a = m45093a(i - C14181d.f31552a.length);
            if (a >= 0) {
                C14180c[] cVarArr = this.f31558e;
                if (a < cVarArr.length) {
                    return cVarArr[a].f31549a;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo36023a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = m45101f();
                if ((f & 128) == 0) {
                    return i2 + (f << i4);
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: okhttp3.d0.k.d$b */
    /* compiled from: Hpack */
    static final class C14183b {

        /* renamed from: a */
        private final Buffer f31562a;

        /* renamed from: b */
        private final boolean f31563b;

        /* renamed from: c */
        private int f31564c;

        /* renamed from: d */
        private boolean f31565d;

        /* renamed from: e */
        int f31566e;

        /* renamed from: f */
        C14180c[] f31567f;

        /* renamed from: g */
        int f31568g;

        /* renamed from: h */
        int f31569h;

        /* renamed from: i */
        int f31570i;

        C14183b(Buffer buffer) {
            this(4096, true, buffer);
        }

        /* renamed from: a */
        private void m45111a(C14180c cVar) {
            int i = cVar.f31551c;
            int i2 = this.f31566e;
            if (i > i2) {
                m45113b();
                return;
            }
            m45112b((this.f31570i + i) - i2);
            int i3 = this.f31569h + 1;
            C14180c[] cVarArr = this.f31567f;
            if (i3 > cVarArr.length) {
                C14180c[] cVarArr2 = new C14180c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f31568g = this.f31567f.length - 1;
                this.f31567f = cVarArr2;
            }
            int i4 = this.f31568g;
            this.f31568g = i4 - 1;
            this.f31567f[i4] = cVar;
            this.f31569h++;
            this.f31570i += i;
        }

        /* renamed from: b */
        private void m45113b() {
            Arrays.fill(this.f31567f, null);
            this.f31568g = this.f31567f.length - 1;
            this.f31569h = 0;
            this.f31570i = 0;
        }

        C14183b(int i, boolean z, Buffer buffer) {
            this.f31564c = Integer.MAX_VALUE;
            this.f31567f = new C14180c[8];
            this.f31568g = this.f31567f.length - 1;
            this.f31569h = 0;
            this.f31570i = 0;
            this.f31566e = i;
            this.f31563b = z;
            this.f31562a = buffer;
        }

        /* renamed from: b */
        private int m45112b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f31567f.length;
                while (true) {
                    length--;
                    if (length < this.f31568g || i <= 0) {
                        C14180c[] cVarArr = this.f31567f;
                        int i3 = this.f31568g;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f31569h);
                        C14180c[] cVarArr2 = this.f31567f;
                        int i4 = this.f31568g;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i2, null);
                        this.f31568g += i2;
                    } else {
                        C14180c[] cVarArr3 = this.f31567f;
                        i -= cVarArr3[length].f31551c;
                        this.f31570i -= cVarArr3[length].f31551c;
                        this.f31569h--;
                        i2++;
                    }
                }
                C14180c[] cVarArr4 = this.f31567f;
                int i32 = this.f31568g;
                System.arraycopy(cVarArr4, i32 + 1, cVarArr4, i32 + 1 + i2, this.f31569h);
                C14180c[] cVarArr22 = this.f31567f;
                int i42 = this.f31568g;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i2, null);
                this.f31568g += i2;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36029a(List<C14180c> list) throws IOException {
            int i;
            int i2;
            if (this.f31565d) {
                int i3 = this.f31564c;
                if (i3 < this.f31566e) {
                    mo36028a(i3, 31, 32);
                }
                this.f31565d = false;
                this.f31564c = Integer.MAX_VALUE;
                mo36028a(this.f31566e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C14180c cVar = (C14180c) list.get(i4);
                ByteString k = cVar.f31549a.mo36392k();
                ByteString byteString = cVar.f31550b;
                Integer num = (Integer) C14181d.f31553b.get(k);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (Objects.equals(C14181d.f31552a[i2 - 1].f31550b, byteString)) {
                            i = i2;
                        } else if (Objects.equals(C14181d.f31552a[i2].f31550b, byteString)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f31568g + 1;
                    int length = this.f31567f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f31567f[i5].f31549a, k)) {
                            if (Objects.equals(this.f31567f[i5].f31550b, byteString)) {
                                i2 = C14181d.f31552a.length + (i5 - this.f31568g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f31568g) + C14181d.f31552a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo36028a(i2, 127, 128);
                } else if (i == -1) {
                    this.f31562a.writeByte(64);
                    mo36030a(k);
                    mo36030a(byteString);
                    m45111a(cVar);
                } else if (!k.mo36378b(C14180c.f31543d) || C14180c.f31548i.equals(k)) {
                    mo36028a(i, 63, 64);
                    mo36030a(byteString);
                    m45111a(cVar);
                } else {
                    mo36028a(i, 15, 0);
                    mo36030a(byteString);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36028a(int i, int i2, int i3) {
            if (i < i2) {
                this.f31562a.writeByte(i | i3);
                return;
            }
            this.f31562a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f31562a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f31562a.writeByte(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36030a(ByteString byteString) throws IOException {
            if (!this.f31563b || C14209k.m45263b().mo36106a(byteString) >= byteString.size()) {
                mo36028a(byteString.size(), 127, 0);
                this.f31562a.mo36318c(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            C14209k.m45263b().mo36107a(byteString, buffer);
            ByteString d = buffer.mo36323d();
            mo36028a(d.size(), 127, 128);
            this.f31562a.mo36318c(d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36027a(int i) {
            int min = Math.min(i, DateUtils.FORMAT_ABBREV_TIME);
            int i2 = this.f31566e;
            if (i2 != min) {
                if (min < i2) {
                    this.f31564c = Math.min(this.f31564c, min);
                }
                this.f31565d = true;
                this.f31566e = min;
                m45110a();
            }
        }

        /* renamed from: a */
        private void m45110a() {
            int i = this.f31566e;
            int i2 = this.f31570i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m45113b();
            } else {
                m45112b(i2 - i);
            }
        }
    }

    static {
        String str = "";
        f31552a = new C14180c[]{new C14180c(C14180c.f31548i, str), new C14180c(C14180c.f31545f, "GET"), new C14180c(C14180c.f31545f, "POST"), new C14180c(C14180c.f31546g, "/"), new C14180c(C14180c.f31546g, "/index.html"), new C14180c(C14180c.f31547h, "http"), new C14180c(C14180c.f31547h, "https"), new C14180c(C14180c.f31544e, "200"), new C14180c(C14180c.f31544e, "204"), new C14180c(C14180c.f31544e, "206"), new C14180c(C14180c.f31544e, "304"), new C14180c(C14180c.f31544e, "400"), new C14180c(C14180c.f31544e, "404"), new C14180c(C14180c.f31544e, "500"), new C14180c("accept-charset", str), new C14180c("accept-encoding", "gzip, deflate"), new C14180c("accept-language", str), new C14180c("accept-ranges", str), new C14180c("accept", str), new C14180c("access-control-allow-origin", str), new C14180c("age", str), new C14180c("allow", str), new C14180c("authorization", str), new C14180c("cache-control", str), new C14180c("content-disposition", str), new C14180c("content-encoding", str), new C14180c("content-language", str), new C14180c("content-length", str), new C14180c("content-location", str), new C14180c("content-range", str), new C14180c("content-type", str), new C14180c("cookie", str), new C14180c("date", str), new C14180c("etag", str), new C14180c("expect", str), new C14180c("expires", str), new C14180c("from", str), new C14180c("host", str), new C14180c("if-match", str), new C14180c("if-modified-since", str), new C14180c("if-none-match", str), new C14180c("if-range", str), new C14180c("if-unmodified-since", str), new C14180c("last-modified", str), new C14180c("link", str), new C14180c("location", str), new C14180c("max-forwards", str), new C14180c("proxy-authenticate", str), new C14180c("proxy-authorization", str), new C14180c("range", str), new C14180c("referer", str), new C14180c("refresh", str), new C14180c("retry-after", str), new C14180c("server", str), new C14180c("set-cookie", str), new C14180c("strict-transport-security", str), new C14180c("transfer-encoding", str), new C14180c("user-agent", str), new C14180c("vary", str), new C14180c("via", str), new C14180c("www-authenticate", str)};
    }

    /* renamed from: a */
    private static Map<ByteString, Integer> m45091a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f31552a.length);
        int i = 0;
        while (true) {
            C14180c[] cVarArr = f31552a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f31549a)) {
                linkedHashMap.put(f31552a[i].f31549a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: a */
    static ByteString m45092a(ByteString byteString) throws IOException {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            byte a = byteString.mo36369a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(byteString.mo36394m());
                throw new IOException(sb.toString());
            }
        }
        return byteString;
    }
}
