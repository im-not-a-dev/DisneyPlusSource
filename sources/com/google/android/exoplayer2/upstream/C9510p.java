package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.p393v0.C9532c0;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9542g;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9557m;
import com.google.android.exoplayer2.p393v0.C9557m.C9558a;
import com.google.android.exoplayer2.upstream.BandwidthMeter.C9434a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.p */
/* compiled from: DefaultBandwidthMeter */
public final class C9510p implements BandwidthMeter, TransferListener {

    /* renamed from: p */
    public static final Map<String, int[]> f22154p = m29227c();

    /* renamed from: q */
    public static final long[] f22155q = {5400000, 3400000, 1900000, 1100000, 400000};

    /* renamed from: r */
    public static final long[] f22156r = {170000, 139000, 122000, 107000, 90000};

    /* renamed from: s */
    public static final long[] f22157s = {2100000, 1300000, 960000, 770000, 450000};

    /* renamed from: t */
    public static final long[] f22158t = {6000000, 3400000, 2100000, 1400000, 570000};

    /* renamed from: a */
    private final Context f22159a;

    /* renamed from: b */
    private final SparseArray<Long> f22160b;

    /* renamed from: c */
    private final C9557m<C9434a> f22161c;

    /* renamed from: d */
    private final C9532c0 f22162d;

    /* renamed from: e */
    private final C9542g f22163e;

    /* renamed from: f */
    private int f22164f;

    /* renamed from: g */
    private long f22165g;

    /* renamed from: h */
    private long f22166h;

    /* renamed from: i */
    private int f22167i;

    /* renamed from: j */
    private long f22168j;

    /* renamed from: k */
    private long f22169k;

    /* renamed from: l */
    private long f22170l;

    /* renamed from: m */
    private long f22171m;

    /* renamed from: n */
    private boolean f22172n;

    /* renamed from: o */
    private int f22173o;

    /* renamed from: com.google.android.exoplayer2.upstream.p$b */
    /* compiled from: DefaultBandwidthMeter */
    public static final class C9512b {

        /* renamed from: a */
        private final Context f22174a;

        /* renamed from: b */
        private SparseArray<Long> f22175b;

        /* renamed from: c */
        private int f22176c;

        /* renamed from: d */
        private C9542g f22177d;

        /* renamed from: e */
        private boolean f22178e;

        public C9512b(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f22174a = context2;
            this.f22175b = m29234b(C9554k0.m29395a(context));
            this.f22176c = 2000;
            this.f22177d = C9542g.f22257a;
            this.f22178e = true;
        }

        /* renamed from: b */
        private static SparseArray<Long> m29234b(String str) {
            int[] a = m29233a(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, Long.valueOf(1000000));
            sparseArray.append(2, Long.valueOf(C9510p.f22155q[a[0]]));
            sparseArray.append(3, Long.valueOf(C9510p.f22156r[a[1]]));
            sparseArray.append(4, Long.valueOf(C9510p.f22157s[a[2]]));
            sparseArray.append(5, Long.valueOf(C9510p.f22158t[a[3]]));
            sparseArray.append(7, Long.valueOf(C9510p.f22155q[a[0]]));
            return sparseArray;
        }

        /* renamed from: a */
        public C9512b mo24578a(long j) {
            for (int i = 0; i < this.f22175b.size(); i++) {
                this.f22175b.setValueAt(i, Long.valueOf(j));
            }
            return this;
        }

        /* renamed from: a */
        public C9510p mo24579a() {
            C9510p pVar = new C9510p(this.f22174a, this.f22175b, this.f22176c, this.f22177d, this.f22178e);
            return pVar;
        }

        /* renamed from: a */
        private static int[] m29233a(String str) {
            int[] iArr = (int[]) C9510p.f22154p.get(str);
            if (iArr == null) {
                return new int[]{2, 2, 2, 2};
            }
            return iArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.p$c */
    /* compiled from: DefaultBandwidthMeter */
    private static class C9513c extends BroadcastReceiver {

        /* renamed from: c */
        private static C9513c f22179c;

        /* renamed from: a */
        private final Handler f22180a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final ArrayList<WeakReference<C9510p>> f22181b = new ArrayList<>();

        private C9513c() {
        }

        /* renamed from: a */
        public static synchronized C9513c m29237a(Context context) {
            C9513c cVar;
            synchronized (C9513c.class) {
                if (f22179c == null) {
                    f22179c = new C9513c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f22179c, intentFilter);
                }
                cVar = f22179c;
            }
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void mo24580a(C9510p pVar) {
            pVar.m29228d();
        }

        /* renamed from: b */
        public synchronized void mo24581b(C9510p pVar) {
            m29238a();
            this.f22181b.add(new WeakReference(pVar));
            this.f22180a.post(new C9451b(this, pVar));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                m29238a();
                for (int i = 0; i < this.f22181b.size(); i++) {
                    C9510p pVar = (C9510p) ((WeakReference) this.f22181b.get(i)).get();
                    if (pVar != null) {
                        mo24580a(pVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m29238a() {
            for (int size = this.f22181b.size() - 1; size >= 0; size--) {
                if (((C9510p) ((WeakReference) this.f22181b.get(size)).get()) == null) {
                    this.f22181b.remove(size);
                }
            }
        }
    }

    /* renamed from: c */
    private static Map<String, int[]> m29227c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 1});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 2, 1, 1});
        hashMap.put("AI", new int[]{1, 0, 1, 3});
        hashMap.put("AL", new int[]{1, 2, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 3, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 3, 4, 1});
        hashMap.put("AT", new int[]{0, 2, 0, 0});
        hashMap.put("AU", new int[]{0, 1, 1, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 2});
        hashMap.put("AX", new int[]{0, 2, 1, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 2, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 3, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 3});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 2, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 0, 3, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 0, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 3, 1});
        hashMap.put("CA", new int[]{0, 3, 3, 3});
        hashMap.put("CD", new int[]{4, 4, 3, 2});
        hashMap.put("CF", new int[]{4, 3, 3, 4});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 1});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 2, 1});
        hashMap.put("CN", new int[]{2, 2, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 2, 4});
        hashMap.put("CW", new int[]{1, 0, 0, 0});
        hashMap.put("CX", new int[]{2, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 1, 1});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 3, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{1, 0, 0, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 4, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 1, 3, 3});
        hashMap.put("FK", new int[]{4, 2, 2, 3});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 3, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 2});
        hashMap.put("GN", new int[]{4, 4, 4, 0});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 3, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 3, 3, 4});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 1, 4, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 4, 4, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 3, 2});
        hashMap.put("IL", new int[]{0, 1, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 4, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 4});
        hashMap.put("IR", new int[]{1, 0, 1, 0});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 1});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 2, 2, 1});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 2, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put("KG", new int[]{1, 1, 2, 3});
        hashMap.put("KH", new int[]{2, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 3, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 4});
        hashMap.put("KP", new int[]{1, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 3, 0, 2});
        hashMap.put("KW", new int[]{2, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 1, 1, 0});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 4, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 1, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 3, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 2, 1});
        hashMap.put("MG", new int[]{3, 4, 1, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 4, 3});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 4});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 4, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 0, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{3, 2, 1, 1});
        hashMap.put("MW", new int[]{4, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 2});
        hashMap.put("MY", new int[]{2, 2, 2, 3});
        hashMap.put("MZ", new int[]{3, 4, 2, 2});
        hashMap.put("NA", new int[]{3, 2, 2, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 2});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 2});
        hashMap.put("NI", new int[]{3, 3, 3, 4});
        hashMap.put("NL", new int[]{0, 2, 4, 3});
        hashMap.put("NO", new int[]{0, 1, 0, 0});
        hashMap.put("NP", new int[]{3, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 4, 0});
        hashMap.put("NU", new int[]{2, 2, 2, 1});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{3, 1, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 1, 1});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 1, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 0, 0});
        hashMap.put("PR", new int[]{2, 1, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 1});
        hashMap.put("PW", new int[]{2, 2, 1, 1});
        hashMap.put("PY", new int[]{3, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 0, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 1, 2});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 2});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 1, 0, 1});
        hashMap.put("SJ", new int[]{0, 0, 2, 0});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{0, 0, 1, 3});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{4, 4, 4, 4});
        hashMap.put("SR", new int[]{3, 2, 2, 4});
        hashMap.put("SS", new int[]{4, 2, 4, 2});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 4, 1, 0});
        hashMap.put("SZ", new int[]{3, 4, 2, 3});
        hashMap.put("TC", new int[]{1, 1, 3, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 3});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 1});
        hashMap.put("TT", new int[]{2, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 2, 3});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 2, 2});
        hashMap.put("UZ", new int[]{3, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 1, 0, 0});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{2, 1, 1, 2});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 2, 3, 1});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{2, 0, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 3, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 3, 1});
        return Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m29228d() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f22172n     // Catch:{ all -> 0x005a }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.f22173o     // Catch:{ all -> 0x005a }
            goto L_0x0015
        L_0x0009:
            android.content.Context r0 = r10.f22159a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0015
        L_0x000f:
            android.content.Context r0 = r10.f22159a     // Catch:{ all -> 0x005a }
            int r0 = com.google.android.exoplayer2.p393v0.C9554k0.m29427b(r0)     // Catch:{ all -> 0x005a }
        L_0x0015:
            int r2 = r10.f22167i     // Catch:{ all -> 0x005a }
            if (r2 != r0) goto L_0x001b
            monitor-exit(r10)
            return
        L_0x001b:
            r10.f22167i = r0     // Catch:{ all -> 0x005a }
            r2 = 1
            if (r0 == r2) goto L_0x0058
            if (r0 == 0) goto L_0x0058
            r2 = 8
            if (r0 != r2) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            long r2 = r10.m29223a(r0)     // Catch:{ all -> 0x005a }
            r10.f22170l = r2     // Catch:{ all -> 0x005a }
            com.google.android.exoplayer2.v0.g r0 = r10.f22163e     // Catch:{ all -> 0x005a }
            long r2 = r0.mo24605a()     // Catch:{ all -> 0x005a }
            int r0 = r10.f22164f     // Catch:{ all -> 0x005a }
            if (r0 <= 0) goto L_0x003e
            long r0 = r10.f22165g     // Catch:{ all -> 0x005a }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x005a }
            r5 = r1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            long r6 = r10.f22166h     // Catch:{ all -> 0x005a }
            long r8 = r10.f22170l     // Catch:{ all -> 0x005a }
            r4 = r10
            r4.m29224a(r5, r6, r8)     // Catch:{ all -> 0x005a }
            r10.f22165g = r2     // Catch:{ all -> 0x005a }
            r0 = 0
            r10.f22166h = r0     // Catch:{ all -> 0x005a }
            r10.f22169k = r0     // Catch:{ all -> 0x005a }
            r10.f22168j = r0     // Catch:{ all -> 0x005a }
            com.google.android.exoplayer2.v0.c0 r0 = r10.f22162d     // Catch:{ all -> 0x005a }
            r0.mo24599a()     // Catch:{ all -> 0x005a }
            monitor-exit(r10)
            return
        L_0x0058:
            monitor-exit(r10)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C9510p.m29228d():void");
    }

    /* renamed from: a */
    public TransferListener mo24444a() {
        return this;
    }

    /* renamed from: b */
    public synchronized long mo24447b() {
        return this.f22170l;
    }

    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (z) {
            this.f22166h += (long) i;
        }
    }

    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            C9537e.m29301b(this.f22164f > 0);
            long a = this.f22163e.mo24605a();
            int i = (int) (a - this.f22165g);
            long j = (long) i;
            this.f22168j += j;
            this.f22169k += this.f22166h;
            if (i > 0) {
                this.f22162d.mo24600a((int) Math.sqrt((double) this.f22166h), (float) ((this.f22166h * 8000) / j));
                if (this.f22168j >= 2000 || this.f22169k >= 524288) {
                    this.f22170l = (long) this.f22162d.mo24598a(0.5f);
                }
                m29224a(i, this.f22166h, this.f22170l);
                this.f22165g = a;
                this.f22166h = 0;
            }
            this.f22164f--;
        }
    }

    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            if (this.f22164f == 0) {
                this.f22165g = this.f22163e.mo24605a();
            }
            this.f22164f++;
        }
    }

    @Deprecated
    public C9510p() {
        this(null, new SparseArray(), 2000, C9542g.f22257a, false);
    }

    /* renamed from: a */
    public void mo24445a(Handler handler, C9434a aVar) {
        this.f22161c.mo24647a(handler, aVar);
    }

    private C9510p(Context context, SparseArray<Long> sparseArray, int i, C9542g gVar, boolean z) {
        Context context2;
        int i2;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f22159a = context2;
        this.f22160b = sparseArray;
        this.f22161c = new C9557m<>();
        this.f22162d = new C9532c0(i);
        this.f22163e = gVar;
        if (context == null) {
            i2 = 0;
        } else {
            i2 = C9554k0.m29427b(context);
        }
        this.f22167i = i2;
        this.f22170l = m29223a(this.f22167i);
        if (context != null && z) {
            C9513c.m29237a(context).mo24581b(this);
        }
    }

    /* renamed from: a */
    public void mo24446a(C9434a aVar) {
        this.f22161c.mo24649a(aVar);
    }

    /* renamed from: a */
    private void m29224a(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f22171m) {
            this.f22171m = j2;
            C9557m<C9434a> mVar = this.f22161c;
            C9441a aVar = new C9441a(i, j, j2);
            mVar.mo24648a((C9558a<T>) aVar);
        }
    }

    /* renamed from: a */
    private long m29223a(int i) {
        Long l = (Long) this.f22160b.get(i);
        if (l == null) {
            l = (Long) this.f22160b.get(0);
        }
        if (l == null) {
            l = Long.valueOf(1000000);
        }
        return l.longValue();
    }
}
