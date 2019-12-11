package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.content.BufferedGraphQlResponseConverter;
import com.bamtech.sdk4.content.GraphQlError;
import com.bamtech.sdk4.content.GraphQlResponse;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.C12880j;
import okio.BufferedSource;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;
import p686n.p687a.C14100a;

/* renamed from: g.e.b.b0.t */
/* compiled from: MoshiGraphQlResponseConverter.kt */
public final class C7226t extends BufferedGraphQlResponseConverter {

    /* renamed from: a */
    private final C11760v f15952a;

    public C7226t(C11760v vVar) {
        this.f15952a = vVar;
    }

    public <T> GraphQlResponse<T> deserialize(BufferedSource bufferedSource, Type type) {
        try {
            if (C12880j.m40224a((Object) type, (Object) Void.class)) {
                return new GraphQlResponse<>(null, C13183n.m40498a(new GraphQlError(bufferedSource.mo36327e0(), null, 2, null)));
            }
            C11725h a = this.f15952a.mo29867a((Type) C11780y.m37894a((Type) GraphQlResponse.class, type));
            C12880j.m40222a((Object) a, "moshi.adapter(map)");
            GraphQlResponse<T> graphQlResponse = (GraphQlResponse) a.fromJson(bufferedSource);
            if (graphQlResponse != null) {
                return graphQlResponse;
            }
            throw new C11734j("Could not parse GraphQlResponse");
        } catch (Exception e) {
            C14100a.m44528b(e, "Failed to parse response with moshi", new Object[0]);
            throw e;
        }
    }

    public <T> String serialize(T t) {
        C11725h hVar;
        if (t instanceof String) {
            return (String) t;
        }
        if (t instanceof Map) {
            hVar = this.f15952a.mo29867a((Type) Map.class);
            C12880j.m40222a((Object) hVar, "moshi.adapter<Any>(Map::class.java)");
        } else {
            hVar = this.f15952a.mo29866a(Object.class);
            C12880j.m40222a((Object) hVar, "moshi.adapter<Any>(Any::class.java)");
        }
        String json = hVar.toJson(t);
        C12880j.m40222a((Object) json, "adapter.toJson(model)");
        return json;
    }
}
