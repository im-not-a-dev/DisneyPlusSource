package androidx.work.impl.p011m;

import androidx.work.C1024a;
import androidx.work.C1036i;
import androidx.work.WorkInfo.State;

/* renamed from: androidx.work.impl.m.p */
/* compiled from: WorkTypeConverters */
public class C1130p {

    /* renamed from: androidx.work.impl.m.p$a */
    /* compiled from: WorkTypeConverters */
    static /* synthetic */ class C1131a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4315a = new int[State.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f4316b = new int[C1024a.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f4317c = new int[C1036i.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        static {
            /*
                androidx.work.i[] r0 = androidx.work.C1036i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4317c = r0
                r0 = 1
                int[] r1 = f4317c     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.work.i r2 = androidx.work.C1036i.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f4317c     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.work.i r3 = androidx.work.C1036i.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f4317c     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.work.i r4 = androidx.work.C1036i.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f4317c     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.work.i r5 = androidx.work.C1036i.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f4317c     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.work.i r6 = androidx.work.C1036i.METERED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.work.a[] r5 = androidx.work.C1024a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4316b = r5
                int[] r5 = f4316b     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.work.a r6 = androidx.work.C1024a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r5 = f4316b     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.work.a r6 = androidx.work.C1024a.LINEAR     // Catch:{ NoSuchFieldError -> 0x005d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                androidx.work.WorkInfo$State[] r5 = androidx.work.WorkInfo.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4315a = r5
                int[] r5 = f4315a     // Catch:{ NoSuchFieldError -> 0x0070 }
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = f4315a     // Catch:{ NoSuchFieldError -> 0x007a }
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.RUNNING     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f4315a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f4315a     // Catch:{ NoSuchFieldError -> 0x008e }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.FAILED     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = f4315a     // Catch:{ NoSuchFieldError -> 0x0098 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r0 = f4315a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p011m.C1130p.C1131a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m5881a(State state) {
        switch (C1131a.f4315a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(state);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static C1036i m5887b(int i) {
        if (i == 0) {
            return C1036i.NOT_REQUIRED;
        }
        if (i == 1) {
            return C1036i.CONNECTED;
        }
        if (i == 2) {
            return C1036i.UNMETERED;
        }
        if (i == 3) {
            return C1036i.NOT_ROAMING;
        }
        if (i == 4) {
            return C1036i.METERED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static State m5888c(int i) {
        if (i == 0) {
            return State.ENQUEUED;
        }
        if (i == 1) {
            return State.RUNNING;
        }
        if (i == 2) {
            return State.SUCCEEDED;
        }
        if (i == 3) {
            return State.FAILED;
        }
        if (i == 4) {
            return State.BLOCKED;
        }
        if (i == 5) {
            return State.CANCELLED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static int m5882a(C1024a aVar) {
        int i = C1131a.f4316b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(aVar);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C1024a m5884a(int i) {
        if (i == 0) {
            return C1024a.EXPONENTIAL;
        }
        if (i == 1) {
            return C1024a.LINEAR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static int m5883a(C1036i iVar) {
        int i = C1131a.f4317c[iVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(iVar);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC, Splitter:B:26:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC, Splitter:B:37:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0062=Splitter:B:30:0x0062, B:15:0x0048=Splitter:B:15:0x0048} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5886a(androidx.work.C1029d r4) {
        /*
            int r0 = r4.mo5690b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0054 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0054 }
            int r1 = r4.mo5690b()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            java.util.Set r4 = r4.mo5688a()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            androidx.work.d$a r1 = (androidx.work.C1029d.C1030a) r1     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            android.net.Uri r3 = r1.mo5693a()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            boolean r1 = r1.mo5694b()     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x004e, all -> 0x004c }
            goto L_0x0021
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0048:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x004c:
            r4 = move-exception
            goto L_0x006f
        L_0x004e:
            r4 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0051:
            r4 = move-exception
            r2 = r1
            goto L_0x006f
        L_0x0054:
            r4 = move-exception
        L_0x0055:
            r4.printStackTrace()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0062:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006a:
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x006f:
            if (r2 == 0) goto L_0x0079
            r2.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0079:
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0081:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p011m.C1130p.m5886a(androidx.work.d):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[SYNTHETIC, Splitter:B:36:0x005a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1029d m5885a(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x0037 }
        L_0x0017:
            if (r6 <= 0) goto L_0x002b
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x0037 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0037 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x0037 }
            r0.mo5689a(r3, r4)     // Catch:{ IOException -> 0x0037 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0037:
            r6 = move-exception
            goto L_0x0041
        L_0x0039:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L_0x0058
        L_0x003d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x0041:
            r6.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004e:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p011m.C1130p.m5885a(byte[]):androidx.work.d");
    }
}
