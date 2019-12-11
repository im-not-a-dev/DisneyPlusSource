package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.C2215f;
import java.util.Map.Entry;
import java.util.Set;

public final class JsonObject extends JsonElement {

    /* renamed from: a */
    private final C2215f<String, JsonElement> f6125a = new C2215f<>();

    /* renamed from: a */
    public void mo11081a(String str, JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = C2233j.f6335a;
        }
        this.f6125a.put(str, jsonElement);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f6125a.equals(this.f6125a));
    }

    public int hashCode() {
        return this.f6125a.hashCode();
    }

    /* renamed from: j */
    public Set<Entry<String, JsonElement>> mo11086j() {
        return this.f6125a.entrySet();
    }

    /* renamed from: a */
    public void mo11083a(String str, String str2) {
        mo11081a(str, m8245a((Object) str2));
    }

    /* renamed from: a */
    public void mo11082a(String str, Boolean bool) {
        mo11081a(str, m8245a((Object) bool));
    }

    /* renamed from: a */
    private JsonElement m8245a(Object obj) {
        return obj == null ? C2233j.f6335a : new C2235l(obj);
    }

    /* renamed from: a */
    public JsonElement mo11080a(String str) {
        return (JsonElement) this.f6125a.get(str);
    }
}
