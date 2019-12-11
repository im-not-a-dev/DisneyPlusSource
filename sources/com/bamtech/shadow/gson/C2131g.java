package com.bamtech.shadow.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bamtech.shadow.gson.g */
/* compiled from: JsonArray */
public final class C2131g extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: c */
    private final List<JsonElement> f6135c = new ArrayList();

    /* renamed from: a */
    public void mo11094a(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = C2233j.f6335a;
        }
        this.f6135c.add(jsonElement);
    }

    /* renamed from: e */
    public String mo11074e() {
        if (this.f6135c.size() == 1) {
            return ((JsonElement) this.f6135c.get(0)).mo11074e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2131g) && ((C2131g) obj).f6135c.equals(this.f6135c));
    }

    public int hashCode() {
        return this.f6135c.hashCode();
    }

    public Iterator<JsonElement> iterator() {
        return this.f6135c.iterator();
    }
}
