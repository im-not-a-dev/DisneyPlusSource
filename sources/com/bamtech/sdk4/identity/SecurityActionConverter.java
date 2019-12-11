package com.bamtech.sdk4.identity;

import com.bamtech.shadow.gson.C2132h;
import com.bamtech.shadow.gson.C2233j;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonDeserializationContext;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/SecurityActionConverter;", "Lcom/bamtech/shadow/gson/JsonDeserializer;", "Lcom/bamtech/sdk4/identity/SecurityAction;", "Lcom/bamtech/shadow/gson/JsonSerializer;", "()V", "deserialize", "element", "Lcom/bamtech/shadow/gson/JsonElement;", "p1", "Ljava/lang/reflect/Type;", "p2", "Lcom/bamtech/shadow/gson/JsonDeserializationContext;", "serialize", "item", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityToken.kt */
public final class SecurityActionConverter implements C2132h<SecurityAction>, C2236m<SecurityAction> {
    public SecurityAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            String e = jsonElement.mo11074e();
            if (e != null) {
                return SecurityAction.Companion.toType(e);
            }
        }
        return null;
    }

    public JsonElement serialize(SecurityAction securityAction, Type type, JsonSerializationContext jsonSerializationContext) {
        if (securityAction != null) {
            return new C2235l(SecurityAction.Companion.toString(securityAction));
        }
        C2233j jVar = C2233j.f6335a;
        C12880j.m40222a((Object) jVar, "JsonNull.INSTANCE");
        return jVar;
    }
}
