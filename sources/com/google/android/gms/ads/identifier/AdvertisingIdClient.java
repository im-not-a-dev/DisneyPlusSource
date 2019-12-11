package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C9676a;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.C9828f;
import com.google.android.gms.common.C9830g;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p399o.C9928a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p163g.p449j.p450a.p451a.p457d.p458a.C10961d;
import p163g.p449j.p450a.p451a.p457d.p458a.C10962e;

public class AdvertisingIdClient {
    private final Context mContext;
    private C9676a zze;
    private C10961d zzf;
    private boolean zzg;
    private final Object zzh;
    private C9622a zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    static class C9622a extends Thread {

        /* renamed from: U */
        private long f22568U;

        /* renamed from: V */
        CountDownLatch f22569V = new CountDownLatch(1);

        /* renamed from: W */
        boolean f22570W = false;

        /* renamed from: c */
        private WeakReference<AdvertisingIdClient> f22571c;

        public C9622a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f22571c = new WeakReference<>(advertisingIdClient);
            this.f22568U = j;
            start();
        }

        /* renamed from: a */
        private final void m29877a() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f22571c.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f22570W = true;
            }
        }

        public final void run() {
            try {
                if (!this.f22569V.await(this.f22568U, TimeUnit.MILLISECONDS)) {
                    m29877a();
                }
            } catch (InterruptedException unused) {
                m29877a();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzh = new Object();
        C9908u.m30853a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, C9828f, C9830g {
        C9624b bVar = new C9624b(context);
        boolean a = bVar.mo24843a("gads:ad_id_app_context:enabled", false);
        float a2 = bVar.mo24841a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a3 = bVar.mo24842a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, a, bVar.mo24843a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, a, a2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, C9828f, C9830g {
        C9624b bVar = new C9624b(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, bVar.mo24843a("gads:ad_id_app_context:enabled", false), bVar.mo24843a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static C9676a zza(Context context, boolean z) throws IOException, C9828f, C9830g {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a = C9826e.m30607a().mo24977a(context, (int) C9832i.f23040a);
            if (a == 0 || a == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C9676a aVar = new C9676a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C9928a.m30943a().mo25456a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new C9828f(9);
        }
    }

    private static C10961d zza(Context context, C9676a aVar) throws IOException {
        try {
            return C10962e.m34651a(aVar.mo24992a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f22569V     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.zzk     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$a     // Catch:{ all -> 0x0026 }
            long r2 = r6.zzk     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.zzi = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) throws IOException, IllegalStateException, C9828f, C9830g {
        C9908u.m30867c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            this.zze = zza(this.mContext, this.zzj);
            this.zzf = zza(this.mContext, this.zze);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        String str3 = "0";
        hashMap.put("app_context", z ? str2 : str3);
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = str3;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C9623a(this, hashMap).start();
        return true;
    }

    private final boolean zzb() throws IOException {
        boolean e;
        C9908u.m30867c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f22570W) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            C9908u.m30853a(this.zze);
            C9908u.m30853a(this.zzf);
            e = this.zzf.mo28195e();
        }
        zza();
        return e;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C9908u.m30867c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.mContext     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.zze     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.zzg     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.o.a r0 = com.google.android.gms.common.p399o.C9928a.m30943a()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.mContext     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.zze     // Catch:{ all -> 0x001f }
            r0.mo25455a(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.zzg = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.zzf = r0     // Catch:{ all -> 0x0033 }
            r3.zze = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() throws IOException {
        Info info;
        C9908u.m30867c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f22570W) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C9908u.m30853a(this.zze);
            C9908u.m30853a(this.zzf);
            info = new Info(this.zzf.getId(), this.zzf.mo28196e(true));
        }
        zza();
        return info;
    }

    public void start() throws IOException, IllegalStateException, C9828f, C9830g {
        zza(true);
    }
}
