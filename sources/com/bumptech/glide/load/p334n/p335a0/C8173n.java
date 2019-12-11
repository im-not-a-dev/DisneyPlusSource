package com.bumptech.glide.load.p334n.p335a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.n.a0.n */
/* compiled from: SizeConfigStrategy */
public class C8173n implements C8171l {

    /* renamed from: d */
    private static final Config[] f17461d;

    /* renamed from: e */
    private static final Config[] f17462e = f17461d;

    /* renamed from: f */
    private static final Config[] f17463f = {Config.RGB_565};

    /* renamed from: g */
    private static final Config[] f17464g = {Config.ARGB_4444};

    /* renamed from: h */
    private static final Config[] f17465h = {Config.ALPHA_8};

    /* renamed from: a */
    private final C8176c f17466a = new C8176c();

    /* renamed from: b */
    private final C8162h<C8175b, Bitmap> f17467b = new C8162h<>();

    /* renamed from: c */
    private final Map<Config, NavigableMap<Integer, Integer>> f17468c = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.n$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C8174a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17469a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17469a = r0
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f17469a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.p335a0.C8173n.C8174a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$b */
    /* compiled from: SizeConfigStrategy */
    static final class C8175b implements C8172m {

        /* renamed from: a */
        private final C8176c f17470a;

        /* renamed from: b */
        int f17471b;

        /* renamed from: c */
        private Config f17472c;

        public C8175b(C8176c cVar) {
            this.f17470a = cVar;
        }

        /* renamed from: a */
        public void mo21264a(int i, Config config) {
            this.f17471b = i;
            this.f17472c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8175b)) {
                return false;
            }
            C8175b bVar = (C8175b) obj;
            if (this.f17471b != bVar.f17471b || !C10775k.m34034b((Object) this.f17472c, (Object) bVar.f17472c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f17471b * 31;
            Config config = this.f17472c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8173n.m23748b(this.f17471b, this.f17472c);
        }

        /* renamed from: a */
        public void mo21232a() {
            this.f17470a.mo21239a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$c */
    /* compiled from: SizeConfigStrategy */
    static class C8176c extends C8158d<C8175b> {
        C8176c() {
        }

        /* renamed from: a */
        public C8175b mo21268a(int i, Config config) {
            C8175b bVar = (C8175b) mo21240b();
            bVar.mo21264a(i, config);
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8175b m23759a() {
            return new C8175b(this);
        }
    }

    static {
        Config[] configArr = {Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, configArr.length + 1);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f17461d = configArr;
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m23749b(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f17468c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f17468c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public void mo21227a(Bitmap bitmap) {
        C8175b a = this.f17466a.mo21268a(C10775k.m34022a(bitmap), bitmap.getConfig());
        this.f17467b.mo21249a(a, bitmap);
        NavigableMap b = m23749b(bitmap.getConfig());
        Integer num = (Integer) b.get(Integer.valueOf(a.f17471b));
        Integer valueOf = Integer.valueOf(a.f17471b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: c */
    public String mo21230c(Bitmap bitmap) {
        return m23748b(C10775k.m34022a(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f17467b);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f17468c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f17468c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: b */
    public String mo21229b(int i, int i2, Config config) {
        return m23748b(C10775k.m34020a(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo21228b(Bitmap bitmap) {
        return C10775k.m34022a(bitmap);
    }

    /* renamed from: b */
    static String m23748b(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public Bitmap mo21226a(int i, int i2, Config config) {
        C8175b a = m23745a(C10775k.m34020a(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f17467b.mo21248a(a);
        if (bitmap != null) {
            m23746a(Integer.valueOf(a.f17471b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: a */
    private C8175b m23745a(int i, Config config) {
        C8175b a = this.f17466a.mo21268a(i, config);
        Config[] a2 = m23747a(config);
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = a2[i2];
            Integer num = (Integer) m23749b(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f17466a.mo21239a(a);
                return this.f17466a.mo21268a(num.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo21225a() {
        Bitmap bitmap = (Bitmap) this.f17467b.mo21247a();
        if (bitmap != null) {
            m23746a(Integer.valueOf(C10775k.m34022a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    private void m23746a(Integer num, Bitmap bitmap) {
        NavigableMap b = m23749b(bitmap.getConfig());
        Integer num2 = (Integer) b.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(mo21230c(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            b.remove(num);
        } else {
            b.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private static Config[] m23747a(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f17462e;
        }
        int i = C8174a.f17469a[config.ordinal()];
        if (i == 1) {
            return f17461d;
        }
        if (i == 2) {
            return f17463f;
        }
        if (i == 3) {
            return f17464g;
        }
        if (i == 4) {
            return f17465h;
        }
        return new Config[]{config};
    }
}
