package p163g.p441i.p442a.p443a;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p163g.p441i.p442a.p443a.p448u.C10942h;

/* renamed from: g.i.a.a.f */
/* compiled from: JsonGenerator */
public abstract class C10903f implements Closeable, Flushable, C10914p {

    /* renamed from: c */
    protected C10911m f25860c;

    /* renamed from: g.i.a.a.f$a */
    /* compiled from: JsonGenerator */
    public enum C10904a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        

        /* renamed from: U */
        private final int f25872U;

        /* renamed from: c */
        private final boolean f25873c;

        private C10904a(boolean z) {
            this.f25873c = z;
            this.f25872U = 1 << ordinal();
        }

        /* renamed from: c */
        public static int m34410c() {
            C10904a[] values;
            int i = 0;
            for (C10904a aVar : values()) {
                if (aVar.mo28067a()) {
                    i |= aVar.mo28069b();
                }
            }
            return i;
        }

        /* renamed from: a */
        public boolean mo28067a() {
            return this.f25873c;
        }

        /* renamed from: b */
        public int mo28069b() {
            return this.f25872U;
        }

        /* renamed from: a */
        public boolean mo28068a(int i) {
            return (i & this.f25872U) != 0;
        }
    }

    protected C10903f() {
    }

    /* renamed from: a */
    public abstract void mo28037a(double d) throws IOException;

    /* renamed from: a */
    public abstract void mo28038a(float f) throws IOException;

    /* renamed from: a */
    public abstract void mo28039a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo28040a(C10897a aVar, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo28047a(BigDecimal bigDecimal) throws IOException;

    /* renamed from: a */
    public abstract void mo28048a(BigInteger bigInteger) throws IOException;

    /* renamed from: a */
    public abstract void mo28050a(boolean z) throws IOException;

    /* renamed from: a */
    public void mo28051a(byte[] bArr) throws IOException {
        mo28040a(C10898b.m34366a(), bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo28052b() throws IOException;

    /* renamed from: b */
    public abstract void mo28053b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo28054b(Object obj) throws IOException;

    /* renamed from: c */
    public abstract void mo28055c() throws IOException;

    public abstract void close() throws IOException;

    /* renamed from: d */
    public abstract void mo28057d() throws IOException;

    /* renamed from: e */
    public abstract void mo28058e() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28059e(String str) throws C10902e {
        throw new C10902e(str, this);
    }

    /* renamed from: f */
    public abstract void mo28060f() throws IOException;

    /* renamed from: f */
    public final void mo28061f(String str) throws IOException {
        mo28063g(str);
        mo28058e();
    }

    public abstract void flush() throws IOException;

    /* renamed from: g */
    public abstract void mo28063g(String str) throws IOException;

    /* renamed from: h */
    public final void mo28064h(String str) throws IOException {
        mo28063g(str);
        mo28057d();
    }

    /* renamed from: i */
    public final void mo28065i(String str) throws IOException {
        mo28063g(str);
        mo28060f();
    }

    /* renamed from: j */
    public abstract void mo28066j(String str) throws IOException;

    /* renamed from: a */
    public void mo28049a(short s) throws IOException {
        mo28053b((int) s);
    }

    /* renamed from: a */
    public void mo28045a(String str, String str2) throws IOException {
        mo28063g(str);
        mo28066j(str2);
    }

    /* renamed from: a */
    public final void mo28046a(String str, boolean z) throws IOException {
        mo28063g(str);
        mo28050a(z);
    }

    /* renamed from: a */
    public final void mo28042a(String str, int i) throws IOException {
        mo28063g(str);
        mo28053b(i);
    }

    /* renamed from: a */
    public final void mo28043a(String str, long j) throws IOException {
        mo28063g(str);
        mo28039a(j);
    }

    /* renamed from: a */
    public final void mo28044a(String str, Object obj) throws IOException {
        mo28063g(str);
        mo28054b(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28036a() {
        C10942h.m34635a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28041a(Object obj) throws IOException {
        if (obj == null) {
            mo28057d();
        } else if (obj instanceof String) {
            mo28066j((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    mo28053b(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    mo28039a(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    mo28037a(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    mo28038a(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    mo28049a(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    mo28049a((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    mo28048a((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    mo28047a((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    mo28053b(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    mo28039a(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                mo28051a((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                mo28050a(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                mo28050a(((AtomicBoolean) obj).get());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
            sb.append(obj.getClass().getName());
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }
}
