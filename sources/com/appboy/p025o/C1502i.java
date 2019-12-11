package com.appboy.p025o;

import com.appboy.p030r.C1535e;

/* renamed from: com.appboy.o.i */
public enum C1502i implements C1535e<String> {
    OPTED_IN,
    SUBSCRIBED,
    UNSUBSCRIBED;

    /* renamed from: com.appboy.o.i$a */
    static /* synthetic */ class C1503a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5503a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.appboy.o.i[] r0 = com.appboy.p025o.C1502i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5503a = r0
                int[] r0 = f5503a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.i r1 = com.appboy.p025o.C1502i.UNSUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5503a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.i r1 = com.appboy.p025o.C1502i.SUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5503a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.i r1 = com.appboy.p025o.C1502i.OPTED_IN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p025o.C1502i.C1503a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String m7154b() {
        int i = C1503a.f5503a[ordinal()];
        if (i == 1) {
            return "unsubscribed";
        }
        if (i == 2) {
            return "subscribed";
        }
        if (i != 3) {
            return null;
        }
        return "opted_in";
    }
}
