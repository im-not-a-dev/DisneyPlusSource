package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.C2198c;
import com.bamtech.shadow.gson.p050r.C2245b;
import com.bamtech.shadow.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C2243q {

    /* renamed from: c */
    private final C2198c f6165c;

    public JsonAdapterAnnotationTypeAdapterFactory(C2198c cVar) {
        this.f6165c = cVar;
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
        C2245b bVar = (C2245b) typeToken.getRawType().getAnnotation(C2245b.class);
        if (bVar == null) {
            return null;
        }
        return mo11119a(this.f6165c, gson, typeToken, bVar);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [com.bamtech.shadow.gson.p<?>, com.bamtech.shadow.gson.p] */
    /* JADX WARNING: type inference failed for: r9v13, types: [com.bamtech.shadow.gson.p] */
    /* JADX WARNING: type inference failed for: r9v14, types: [com.bamtech.shadow.gson.p] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.shadow.gson.C2241p<?> mo11119a(com.bamtech.shadow.gson.internal.C2198c r9, com.bamtech.shadow.gson.Gson r10, com.bamtech.shadow.gson.reflect.TypeToken<?> r11, com.bamtech.shadow.gson.p050r.C2245b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.bamtech.shadow.gson.reflect.TypeToken r0 = com.bamtech.shadow.gson.reflect.TypeToken.get(r0)
            com.bamtech.shadow.gson.internal.g r9 = r9.mo11198a(r0)
            java.lang.Object r9 = r9.mo11200a()
            boolean r0 = r9 instanceof com.bamtech.shadow.gson.C2241p
            if (r0 == 0) goto L_0x0017
            com.bamtech.shadow.gson.p r9 = (com.bamtech.shadow.gson.C2241p) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.bamtech.shadow.gson.C2243q
            if (r0 == 0) goto L_0x0022
            com.bamtech.shadow.gson.q r9 = (com.bamtech.shadow.gson.C2243q) r9
            com.bamtech.shadow.gson.p r9 = r9.mo11098a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.bamtech.shadow.gson.C2236m
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.bamtech.shadow.gson.C2132h
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.bamtech.shadow.gson.m r0 = (com.bamtech.shadow.gson.C2236m) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.bamtech.shadow.gson.C2132h
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.bamtech.shadow.gson.h r1 = (com.bamtech.shadow.gson.C2132h) r1
        L_0x006b:
            r4 = r1
            com.bamtech.shadow.gson.internal.bind.TreeTypeAdapter r9 = new com.bamtech.shadow.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.bamtech.shadow.gson.p r9 = r9.mo11270a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo11119a(com.bamtech.shadow.gson.internal.c, com.bamtech.shadow.gson.Gson, com.bamtech.shadow.gson.reflect.TypeToken, com.bamtech.shadow.gson.r.b):com.bamtech.shadow.gson.p");
    }
}
