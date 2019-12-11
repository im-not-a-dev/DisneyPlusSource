package com.appboy.p025o;

import com.appboy.p030r.C1535e;

/* renamed from: com.appboy.o.g */
public enum C1499g implements C1535e<String> {
    MALE,
    FEMALE,
    OTHER,
    UNKNOWN,
    NOT_APPLICABLE,
    PREFER_NOT_TO_SAY;

    /* renamed from: com.appboy.o.g$a */
    static /* synthetic */ class C1500a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5483a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.appboy.o.g[] r0 = com.appboy.p025o.C1499g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5483a = r0
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.MALE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.FEMALE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.OTHER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.NOT_APPLICABLE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f5483a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.appboy.o.g r1 = com.appboy.p025o.C1499g.PREFER_NOT_TO_SAY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p025o.C1499g.C1500a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String m7150b() {
        switch (C1500a.f5483a[ordinal()]) {
            case 1:
                return "m";
            case 2:
                return "f";
            case 3:
                return "o";
            case 4:
                return "u";
            case 5:
                return "n";
            case 6:
                return "p";
            default:
                return null;
        }
    }
}
