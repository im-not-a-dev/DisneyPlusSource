package p163g.p164a.p165a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.v */
/* compiled from: MessageMatcher */
abstract class C4770v {

    /* renamed from: c */
    private static final Map<String, Class> f11864c = new C4771a();

    /* renamed from: a */
    protected String f11865a;

    /* renamed from: b */
    protected ArrayList<Object> f11866b;

    /* renamed from: g.a.a.v$a */
    /* compiled from: MessageMatcher */
    static class C4771a extends HashMap<String, Class> {
        C4771a() {
            put("eq", C4782y.class);
            put("ne", C4672f0.class);
            put("gt", C4647a0.class);
            put("ge", C4656b0.class);
            put("lt", C4659c0.class);
            put("le", C4665d0.class);
            put("co", C4776w.class);
            put("nc", C4668e0.class);
            put("sw", C4686h0.class);
            put("ew", C4778x.class);
            put("ex", C4786z.class);
            put("nx", C4683g0.class);
        }
    }

    C4770v() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static p163g.p164a.p165a.C4770v m16563a(org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "Messages - error creating matcher, key is required"
            java.lang.String r1 = "Messages - Error creating matcher (%s)"
            r2 = 0
            java.lang.String r3 = "matches"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ JSONException -> 0x001b }
            if (r3 == 0) goto L_0x0024
            int r4 = r3.length()     // Catch:{ JSONException -> 0x001b }
            if (r4 > 0) goto L_0x0024
            java.lang.String r4 = "Messages - message matcher type is empty"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x001b }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r5)     // Catch:{ JSONException -> 0x001b }
            goto L_0x0024
        L_0x001b:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Messages - message matcher type is required"
            p163g.p164a.p165a.C4783y0.m16640c(r4, r3)
            java.lang.String r3 = "UNKNOWN"
        L_0x0024:
            java.util.Map<java.lang.String, java.lang.Class> r4 = f11864c
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            r5 = 1
            if (r4 != 0) goto L_0x003a
            java.lang.Class<g.a.a.i0> r4 = p163g.p164a.p165a.C4688i0.class
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r2] = r3
            java.lang.String r3 = "Messages - message matcher type \"%s\" is invalid"
            p163g.p164a.p165a.C4783y0.m16640c(r3, r6)
        L_0x003a:
            java.lang.Object r3 = r4.newInstance()     // Catch:{ InstantiationException -> 0x004e, IllegalAccessException -> 0x0041 }
            g.a.a.v r3 = (p163g.p164a.p165a.C4770v) r3     // Catch:{ InstantiationException -> 0x004e, IllegalAccessException -> 0x0041 }
            goto L_0x005b
        L_0x0041:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r3 = r3.getMessage()
            r4[r2] = r3
            p163g.p164a.p165a.C4783y0.m16636b(r1, r4)
            goto L_0x005a
        L_0x004e:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r3 = r3.getMessage()
            r4[r2] = r3
            p163g.p164a.p165a.C4783y0.m16636b(r1, r4)
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x00c4
            java.lang.String r1 = "key"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            r3.f11865a = r1     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            java.lang.String r1 = r3.f11865a     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r3.f11865a     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            if (r1 > 0) goto L_0x0088
            java.lang.String r1 = "Messages - error creating matcher, key is empty"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            p163g.p164a.p165a.C4783y0.m16640c(r1, r4)     // Catch:{ JSONException -> 0x0083, NullPointerException -> 0x007d }
            goto L_0x0088
        L_0x007d:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            p163g.p164a.p165a.C4783y0.m16640c(r0, r1)
            goto L_0x0088
        L_0x0083:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            p163g.p164a.p165a.C4783y0.m16640c(r0, r1)
        L_0x0088:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00bd }
            r0.<init>()     // Catch:{ JSONException -> 0x00bd }
            r3.f11866b = r0     // Catch:{ JSONException -> 0x00bd }
            boolean r0 = r3 instanceof p163g.p164a.p165a.C4786z     // Catch:{ JSONException -> 0x00bd }
            if (r0 == 0) goto L_0x0094
            return r3
        L_0x0094:
            java.lang.String r0 = "values"
            org.json.JSONArray r7 = r7.getJSONArray(r0)     // Catch:{ JSONException -> 0x00bd }
            int r0 = r7.length()     // Catch:{ JSONException -> 0x00bd }
            r1 = 0
        L_0x009f:
            if (r1 >= r0) goto L_0x00ad
            java.util.ArrayList<java.lang.Object> r4 = r3.f11866b     // Catch:{ JSONException -> 0x00bd }
            java.lang.Object r5 = r7.get(r1)     // Catch:{ JSONException -> 0x00bd }
            r4.add(r5)     // Catch:{ JSONException -> 0x00bd }
            int r1 = r1 + 1
            goto L_0x009f
        L_0x00ad:
            java.util.ArrayList<java.lang.Object> r7 = r3.f11866b     // Catch:{ JSONException -> 0x00bd }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x00bd }
            if (r7 != 0) goto L_0x00c4
            java.lang.String r7 = "Messages - error creating matcher, values is empty"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x00bd }
            p163g.p164a.p165a.C4783y0.m16640c(r7, r0)     // Catch:{ JSONException -> 0x00bd }
            goto L_0x00c4
        L_0x00bd:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r0 = "Messages - error creating matcher, values is required"
            p163g.p164a.p165a.C4783y0.m16640c(r0, r7)
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4770v.m16563a(org.json.JSONObject):g.a.a.v");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15963a(Object obj) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Double mo16153b(Object obj) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16025a(Map<String, Object>... mapArr) {
        if (mapArr == null || mapArr.length <= 0) {
            return false;
        }
        Object obj = null;
        int length = mapArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Map<String, Object> map = mapArr[i];
            if (map != null && map.containsKey(this.f11865a)) {
                obj = map.get(this.f11865a);
                break;
            }
            i++;
        }
        if (obj == null || !mo15963a(obj)) {
            return false;
        }
        return true;
    }
}
