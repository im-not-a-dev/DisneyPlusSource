package com.bamtech.core.networking.converters.shadow.gson;

import com.bamtech.shadow.gson.C2132h;
import com.bamtech.shadow.gson.C2234k;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonDeserializationContext;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonObject;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0005J-\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J%\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/core/networking/converters/shadow/gson/InterfaceAdapter;", "T", "", "Lcom/bamtech/shadow/gson/JsonSerializer;", "Lcom/bamtech/shadow/gson/JsonDeserializer;", "()V", "deserialize", "jsonElement", "Lcom/bamtech/shadow/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "jsonDeserializationContext", "Lcom/bamtech/shadow/gson/JsonDeserializationContext;", "(Lcom/bamtech/shadow/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/bamtech/shadow/gson/JsonDeserializationContext;)Ljava/lang/Object;", "getObjectClass", "Ljava/lang/Class;", "className", "", "serialize", "jsonSerializationContext", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/bamtech/shadow/gson/JsonSerializationContext;)Lcom/bamtech/shadow/gson/JsonElement;", "Companion", "networking-gson-shadow"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: InterfaceAdapter.kt */
public final class InterfaceAdapter<T> implements C2236m<T>, C2132h<T> {

    /* renamed from: a */
    private static final String f5878a = f5878a;

    /* renamed from: b */
    private static final String f5879b = f5879b;

    /* renamed from: com.bamtech.core.networking.converters.shadow.gson.InterfaceAdapter$a */
    /* compiled from: InterfaceAdapter.kt */
    public static final class C1687a {
        private C1687a() {
        }

        public /* synthetic */ C1687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1687a(null);
    }

    /* renamed from: a */
    public final Class<?> mo7499a(String str) throws ClassNotFoundException {
        Class<?> cls = Class.forName(str);
        Intrinsics.checkReturnedValueIsNotNull((Object) cls, "Class.forName(className)");
        return cls;
    }

    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws C2234k, ClassNotFoundException {
        T t = null;
        if (jsonElement != null) {
            JsonObject c = jsonElement.mo11072c();
            if (c != null) {
                JsonElement a = c.mo11080a(f5878a);
                if (a != null) {
                    String e = ((C2235l) a).mo11074e();
                    Intrinsics.checkReturnedValueIsNotNull((Object) e, "className");
                    Class a2 = mo7499a(e);
                    if (jsonDeserializationContext != null) {
                        t = jsonDeserializationContext.mo11070a(c.mo11080a(f5879b), a2);
                    }
                    return t;
                }
                throw new C13142s("null cannot be cast to non-null type com.bamtech.shadow.gson.JsonPrimitive");
            }
        }
        return null;
    }

    public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.mo11083a(f5878a, t.getClass().getName());
        jsonObject.mo11081a(f5879b, jsonSerializationContext.serialize(t));
        return jsonObject;
    }
}
