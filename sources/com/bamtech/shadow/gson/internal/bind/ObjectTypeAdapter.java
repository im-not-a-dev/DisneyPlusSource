package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.C2215f;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends C2241p<Object> {

    /* renamed from: b */
    public static final C2243q f6172b = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* renamed from: a */
    private final Gson f6173a;

    /* renamed from: com.bamtech.shadow.gson.internal.bind.ObjectTypeAdapter$a */
    static /* synthetic */ class C2145a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6174a = new int[C2251b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bamtech.shadow.gson.s.b[] r0 = com.bamtech.shadow.gson.p051s.C2251b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6174a = r0
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f6174a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bamtech.shadow.gson.s.b r1 = com.bamtech.shadow.gson.p051s.C2251b.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.bind.ObjectTypeAdapter.C2145a.<clinit>():void");
        }
    }

    ObjectTypeAdapter(Gson gson) {
        this.f6173a = gson;
    }

    /* renamed from: a */
    public Object mo11055a(C2249a aVar) throws IOException {
        switch (C2145a.f6174a[aVar.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo11161a();
                while (aVar.mo11166f()) {
                    arrayList.add(mo11055a(aVar));
                }
                aVar.mo11164d();
                return arrayList;
            case 2:
                C2215f fVar = new C2215f();
                aVar.mo11162b();
                while (aVar.mo11166f()) {
                    fVar.put(aVar.mo11172m(), mo11055a(aVar));
                }
                aVar.mo11165e();
                return fVar;
            case 3:
                return aVar.mo11174o();
            case 4:
                return Double.valueOf(aVar.mo11168j());
            case 5:
                return Boolean.valueOf(aVar.mo11167i());
            case 6:
                aVar.mo11173n();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo11057a(C2252c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo11193h();
            return;
        }
        C2241p a = this.f6173a.mo11037a(obj.getClass());
        if (a instanceof ObjectTypeAdapter) {
            cVar.mo11185b();
            cVar.mo11188d();
            return;
        }
        a.mo11057a(cVar, obj);
    }
}
