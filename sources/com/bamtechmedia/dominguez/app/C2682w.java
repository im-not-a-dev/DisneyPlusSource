package com.bamtechmedia.dominguez.app;

import com.bamtech.sdk4.content.GraphQlError;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11740c;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/app/GraphQlErrorJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "GraphQlErrorJsonAdapter", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.app.w */
/* compiled from: GraphQlErrorJsonAdapterFactory.kt */
public final class C2682w implements C11732g {

    /* renamed from: com.bamtechmedia.dominguez.app.w$a */
    /* compiled from: GraphQlErrorJsonAdapterFactory.kt */
    private static final class C2683a extends C11725h<GraphQlError> {

        /* renamed from: a */
        private final C11725h<GraphQlError> f7429a;

        public C2683a(C11725h<GraphQlError> hVar) {
            this.f7429a = hVar;
        }

        /* renamed from: a */
        public void toJson(C11747s sVar, GraphQlError graphQlError) {
            this.f7429a.toJson(sVar, graphQlError);
        }

        public GraphQlError fromJson(C11737m mVar) {
            if (mVar.peek() != C11740c.STRING) {
                return (GraphQlError) this.f7429a.fromJson(mVar);
            }
            String n = mVar.mo29779n();
            Intrinsics.checkReturnedValueIsNotNull((Object) n, "reader.nextString()");
            return new GraphQlError(n, null, 2, null);
        }
    }

    /* renamed from: a */
    public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
        if (!Intrinsics.areEqual((Object) type, (Object) GraphQlError.class)) {
            return null;
        }
        C11725h a = vVar.mo29865a((C11732g) this, type, set);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "moshi.nextAdapter(this, type, annotations)");
        return new C2683a(a);
    }
}
