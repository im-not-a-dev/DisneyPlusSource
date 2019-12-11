package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2131g;
import com.bamtech.shadow.gson.C2233j;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonObject;
import com.bamtech.shadow.gson.p051s.C2252c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bamtech.shadow.gson.internal.bind.b */
/* compiled from: JsonTreeWriter */
public final class C2194b extends C2252c {

    /* renamed from: h0 */
    private static final Writer f6283h0 = new C2195a();

    /* renamed from: i0 */
    private static final C2235l f6284i0 = new C2235l("closed");

    /* renamed from: e0 */
    private final List<JsonElement> f6285e0 = new ArrayList();

    /* renamed from: f0 */
    private String f6286f0;

    /* renamed from: g0 */
    private JsonElement f6287g0 = C2233j.f6335a;

    /* renamed from: com.bamtech.shadow.gson.internal.bind.b$a */
    /* compiled from: JsonTreeWriter */
    static class C2195a extends Writer {
        C2195a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C2194b() {
        super(f6283h0);
    }

    /* renamed from: a */
    private void m8516a(JsonElement jsonElement) {
        if (this.f6286f0 != null) {
            if (!jsonElement.mo11076g() || mo11292e()) {
                ((JsonObject) peek()).mo11081a(this.f6286f0, jsonElement);
            }
            this.f6286f0 = null;
        } else if (this.f6285e0.isEmpty()) {
            this.f6287g0 = jsonElement;
        } else {
            JsonElement peek = peek();
            if (peek instanceof C2131g) {
                ((C2131g) peek).mo11094a(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private JsonElement peek() {
        List<JsonElement> list = this.f6285e0;
        return (JsonElement) list.get(list.size() - 1);
    }

    /* renamed from: b */
    public C2252c mo11185b() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m8516a((JsonElement) jsonObject);
        this.f6285e0.add(jsonObject);
        return this;
    }

    /* renamed from: c */
    public C2252c mo11186c() throws IOException {
        if (this.f6285e0.isEmpty() || this.f6286f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C2131g) {
            List<JsonElement> list = this.f6285e0;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() throws IOException {
        if (this.f6285e0.isEmpty()) {
            this.f6285e0.add(f6284i0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C2252c mo11188d() throws IOException {
        if (this.f6285e0.isEmpty() || this.f6286f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof JsonObject) {
            List<JsonElement> list = this.f6285e0;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public C2252c mo11190e(String str) throws IOException {
        if (this.f6285e0.isEmpty() || this.f6286f0 != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof JsonObject) {
            this.f6286f0 = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    /* renamed from: g */
    public C2252c mo11192g(String str) throws IOException {
        if (str == null) {
            mo11193h();
            return this;
        }
        m8516a((JsonElement) new C2235l(str));
        return this;
    }

    /* renamed from: h */
    public C2252c mo11193h() throws IOException {
        m8516a((JsonElement) C2233j.f6335a);
        return this;
    }

    /* renamed from: i */
    public JsonElement mo11194i() {
        if (this.f6285e0.isEmpty()) {
            return this.f6287g0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(this.f6285e0);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C2252c mo11189d(boolean z) throws IOException {
        m8516a((JsonElement) new C2235l(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C2252c mo11181a() throws IOException {
        C2131g gVar = new C2131g();
        m8516a((JsonElement) gVar);
        this.f6285e0.add(gVar);
        return this;
    }

    /* renamed from: a */
    public C2252c mo11183a(Boolean bool) throws IOException {
        if (bool == null) {
            mo11193h();
            return this;
        }
        m8516a((JsonElement) new C2235l(bool));
        return this;
    }

    /* renamed from: a */
    public C2252c mo11182a(long j) throws IOException {
        m8516a((JsonElement) new C2235l((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C2252c mo11184a(Number number) throws IOException {
        if (number == null) {
            mo11193h();
            return this;
        }
        if (!mo11295g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m8516a((JsonElement) new C2235l(number));
        return this;
    }
}
