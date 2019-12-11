package androidx.work;

import android.content.Context;

public abstract class WorkerFactory {

    /* renamed from: a */
    private static final String f4022a = C1034h.m5551a("WorkerFactory");

    /* renamed from: androidx.work.WorkerFactory$a */
    static class C1022a extends WorkerFactory {
        C1022a() {
        }

        /* renamed from: a */
        public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: a */
    public static WorkerFactory m5502a() {
        return new C1022a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo5649b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo5648a(context, str, workerParameters);
        if (a != null) {
            return a;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                C1034h a2 = C1034h.m5550a();
                String str2 = f4022a;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not instantiate ");
                sb.append(str);
                a2.mo5698b(str2, sb.toString(), e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            C1034h a3 = C1034h.m5550a();
            String str3 = f4022a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Class not found: ");
            sb2.append(str);
            a3.mo5698b(str3, sb2.toString(), new Throwable[0]);
            return null;
        }
    }
}
