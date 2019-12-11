package com.appboy.p025o.p026k;

import com.appboy.p030r.C1535e;

/* renamed from: com.appboy.o.k.e */
public enum C1510e implements C1535e<String> {
    IMAGE_DOWNLOAD,
    TEMPLATE_REQUEST,
    ZIP_ASSET_DOWNLOAD,
    DISPLAY_VIEW_GENERATION,
    INTERNAL_TIMEOUT_EXCEEDED;

    /* renamed from: com.appboy.o.k.e$a */
    static /* synthetic */ class C1511a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5532a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.appboy.o.k.e[] r0 = com.appboy.p025o.p026k.C1510e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5532a = r0
                int[] r0 = f5532a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.k.e r1 = com.appboy.p025o.p026k.C1510e.IMAGE_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5532a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.k.e r1 = com.appboy.p025o.p026k.C1510e.TEMPLATE_REQUEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5532a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.k.e r1 = com.appboy.p025o.p026k.C1510e.ZIP_ASSET_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5532a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.k.e r1 = com.appboy.p025o.p026k.C1510e.DISPLAY_VIEW_GENERATION     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5532a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.appboy.o.k.e r1 = com.appboy.p025o.p026k.C1510e.INTERNAL_TIMEOUT_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p025o.p026k.C1510e.C1511a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String m7158b() {
        int i = C1511a.f5532a[ordinal()];
        if (i == 1) {
            return "if";
        }
        if (i == 2) {
            return "tf";
        }
        if (i == 3) {
            return "zf";
        }
        if (i == 4) {
            return "vf";
        }
        if (i != 5) {
            return null;
        }
        return "te";
    }
}
