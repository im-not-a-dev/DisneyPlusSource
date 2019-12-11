package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.p688d0.C14126e;
import okio.Buffer;
import okio.C14280f;

public final class FormBody extends C14262x {

    /* renamed from: c */
    private static final C14258u f31194c = C14258u.m45481a("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f31195a;

    /* renamed from: b */
    private final List<String> f31196b;

    public static final class Builder {

        /* renamed from: a */
        private final List<String> f31197a;

        /* renamed from: b */
        private final List<String> f31198b;

        /* renamed from: c */
        private final Charset f31199c;

        public Builder() {
            this(null);
        }

        /* renamed from: a */
        public Builder mo35744a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.f31197a.add(HttpUrl.m44633a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f31199c));
                String str4 = str2;
                this.f31198b.add(HttpUrl.m44633a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f31199c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public Builder(Charset charset) {
            this.f31197a = new ArrayList();
            this.f31198b = new ArrayList();
            this.f31199c = charset;
        }

        /* renamed from: a */
        public FormBody mo35745a() {
            return new FormBody(this.f31197a, this.f31198b);
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.f31195a = C14126e.m44823a(list);
        this.f31196b = C14126e.m44823a(list2);
    }

    /* renamed from: a */
    public long mo35741a() {
        return m44624a(null, true);
    }

    /* renamed from: b */
    public C14258u mo35743b() {
        return f31194c;
    }

    /* renamed from: a */
    public void mo35742a(C14280f fVar) throws IOException {
        m44624a(fVar, false);
    }

    /* renamed from: a */
    private long m44624a(C14280f fVar, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            buffer = fVar.mo36337h0();
        }
        int size = this.f31195a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.m45552a((String) this.f31195a.get(i));
            buffer.writeByte(61);
            buffer.m45552a((String) this.f31196b.get(i));
        }
        if (!z) {
            return 0;
        }
        long h = buffer.mo36335h();
        buffer.mo36308a();
        return h;
    }
}
