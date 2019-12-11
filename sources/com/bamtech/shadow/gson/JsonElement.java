package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.C2225i;
import com.bamtech.shadow.gson.p051s.C2252c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class JsonElement {
    /* renamed from: b */
    public C2131g mo11071b() {
        if (mo11075f()) {
            return (C2131g) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public JsonObject mo11072c() {
        if (mo11077h()) {
            return (JsonObject) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C2235l mo11073d() {
        if (mo11078i()) {
            return (C2235l) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public String mo11074e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public boolean mo11075f() {
        return this instanceof C2131g;
    }

    /* renamed from: g */
    public boolean mo11076g() {
        return this instanceof C2233j;
    }

    /* renamed from: h */
    public boolean mo11077h() {
        return this instanceof JsonObject;
    }

    /* renamed from: i */
    public boolean mo11078i() {
        return this instanceof C2235l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C2252c cVar = new C2252c(stringWriter);
            cVar.mo11290b(true);
            C2225i.m8575a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
