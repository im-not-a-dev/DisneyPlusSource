package com.appboy.p025o;

import com.appboy.p030r.C1535e;

/* renamed from: com.appboy.o.j */
public enum C1504j implements C1535e<String> {
    UNITY,
    REACT,
    CORDOVA,
    XAMARIN,
    SEGMENT,
    MPARTICLE;

    /* renamed from: com.appboy.o.j$a */
    static /* synthetic */ class C1505a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5511a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.appboy.o.j[] r0 = com.appboy.p025o.C1504j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5511a = r0
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.UNITY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.REACT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.CORDOVA     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.XAMARIN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.SEGMENT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f5511a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.appboy.o.j r1 = com.appboy.p025o.C1504j.MPARTICLE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p025o.C1504j.C1505a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String m7156b() {
        switch (C1505a.f5511a[ordinal()]) {
            case 1:
                return "unity";
            case 2:
                return "react";
            case 3:
                return "cordova";
            case 4:
                return "xamarin";
            case 5:
                return "segment";
            case 6:
                return "mparticle";
            default:
                return null;
        }
    }
}
