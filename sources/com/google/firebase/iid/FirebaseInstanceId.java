package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.p401p.C9953b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p163g.p449j.p450a.p451a.p467f.C11434g;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11439k;
import p163g.p449j.p482b.C11510a;
import p163g.p449j.p482b.C11512c;
import p163g.p449j.p482b.p483e.C11520b;
import p163g.p449j.p482b.p483e.C11522d;
import p163g.p449j.p482b.p486h.C11531g;

/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public class FirebaseInstanceId {
    private static final long zza = TimeUnit.HOURS.toSeconds(8);
    private static C10499t zzb;
    private static ScheduledExecutorService zzc;
    private final Executor zzd;
    /* access modifiers changed from: private */
    public final C11512c zze;
    private final C10477i zzf;
    private final C10486m0 zzg;
    private final C10487n zzh;
    private final C10507x zzi;
    private boolean zzj;
    private final C10456a zzk;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    /* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
    private class C10456a {

        /* renamed from: a */
        private final boolean f24795a = m33029c();

        /* renamed from: b */
        private final C11522d f24796b;

        /* renamed from: c */
        private C11520b<C11510a> f24797c;

        /* renamed from: d */
        private Boolean f24798d = m33028b();

        C10456a(C11522d dVar) {
            this.f24796b = dVar;
            if (this.f24798d == null && this.f24795a) {
                this.f24797c = new C10484l0(this);
                dVar.mo27259a(C11510a.class, this.f24797c);
            }
        }

        /* renamed from: b */
        private final Boolean m33028b() {
            String str = "firebase_messaging_auto_init_enabled";
            Context a = FirebaseInstanceId.this.zze.mo29428a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m33029c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.zze.mo29428a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo27287a() {
            if (this.f24798d == null) {
                return this.f24795a && FirebaseInstanceId.this.zze.mo29433e();
            }
            return this.f24798d.booleanValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo27286a(boolean z) {
            if (this.f24797c != null) {
                this.f24796b.mo27261b(C11510a.class, this.f24797c);
                this.f24797c = null;
            }
            Editor edit = FirebaseInstanceId.this.zze.mo29428a().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzi();
            }
            this.f24798d = Boolean.valueOf(z);
        }
    }

    FirebaseInstanceId(C11512c cVar, C11522d dVar, C11531g gVar) {
        this(cVar, new C10477i(cVar.mo29428a()), C10469e0.m33045b(), C10469e0.m33045b(), dVar, gVar);
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(C11512c.m37128i());
    }

    static boolean zzd() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* access modifiers changed from: private */
    public final void zzi() {
        if (zza(zzb()) || this.zzi.mo27362a()) {
            zzj();
        }
    }

    private final synchronized void zzj() {
        if (!this.zzj) {
            zza(0);
        }
    }

    private static String zzk() {
        return zzb.mo27345b("").mo27349a();
    }

    public void deleteInstanceId() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzg.mo27321a(zzk()));
            zze();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void deleteToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zzd2 = zzd(str2);
            zza(this.zzg.mo27324b(zzk(), str, zzd2));
            zzb.mo27347b("", str, zzd2);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzb.mo27345b("").mo27350b();
    }

    public String getId() {
        zzi();
        return zzk();
    }

    public C11435h<C10458a> getInstanceId() {
        return zza(C10477i.m33056a(this.zze), "*");
    }

    @Deprecated
    public String getToken() {
        C10497s zzb2 = zzb();
        if (zza(zzb2)) {
            zzj();
        }
        return C10497s.m33121a(zzb2);
    }

    /* access modifiers changed from: 0000 */
    public final C11512c zza() {
        return this.zze;
    }

    /* access modifiers changed from: 0000 */
    public final C10497s zzb() {
        return zzb(C10477i.m33056a(this.zze), "*");
    }

    /* access modifiers changed from: 0000 */
    public final String zzc() throws IOException {
        return getToken(C10477i.m33056a(this.zze), "*");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zze() {
        zzb.mo27346b();
        if (this.zzk.mo27287a()) {
            zzj();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzf() {
        return this.zzf.mo27315a() != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void zzg() {
        zzb.mo27348c("");
        zzj();
    }

    public final boolean zzh() {
        return this.zzk.mo27287a();
    }

    @Keep
    public static FirebaseInstanceId getInstance(C11512c cVar) {
        return (FirebaseInstanceId) cVar.mo29429a(FirebaseInstanceId.class);
    }

    private static C10497s zzb(String str, String str2) {
        return zzb.mo27341a("", str, str2);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zza(boolean z) {
        this.zzj = z;
    }

    /* access modifiers changed from: 0000 */
    public final void zzc(String str) throws IOException {
        C10497s zzb2 = zzb();
        if (!zza(zzb2)) {
            zza(this.zzg.mo27326d(zzk(), zzb2.f24876a, str));
            return;
        }
        throw new IOException("token not available");
    }

    private static String zzd(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: 0000 */
    public final void zzb(String str) throws IOException {
        C10497s zzb2 = zzb();
        if (!zza(zzb2)) {
            zza(this.zzg.mo27325c(zzk(), zzb2.f24876a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void zza(long j) {
        C10503v vVar = new C10503v(this, this.zzf, this.zzi, Math.min(Math.max(30, j << 1), zza));
        zza((Runnable) vVar, j);
        this.zzj = true;
    }

    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C10458a) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    private FirebaseInstanceId(C11512c cVar, C10477i iVar, Executor executor, Executor executor2, C11522d dVar, C11531g gVar) {
        this.zzj = false;
        if (C10477i.m33056a(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzb == null) {
                    zzb = new C10499t(cVar.mo29428a());
                }
            }
            this.zze = cVar;
            this.zzf = iVar;
            this.zzg = new C10486m0(cVar, iVar, executor, gVar);
            this.zzd = executor2;
            this.zzi = new C10507x(zzb);
            this.zzk = new C10456a(dVar);
            this.zzh = new C10487n(executor);
            if (this.zzk.mo27287a()) {
                zzi();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzc == null) {
                zzc = new ScheduledThreadPoolExecutor(1, new C9953b("FirebaseInstanceId"));
            }
            zzc.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public final void zzb(boolean z) {
        this.zzk.mo27286a(z);
    }

    private final C11435h<C10458a> zza(String str, String str2) {
        return C11439k.m36959a(null).mo29262b(this.zzd, new C10478i0(this, str, zzd(str2)));
    }

    private final <T> T zza(C11435h<T> hVar) throws IOException {
        try {
            return C11439k.m36962a(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zze();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final synchronized C11435h<Void> zza(String str) {
        C11435h<Void> a;
        a = this.zzi.mo27361a(str);
        zzj();
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(C10497s sVar) {
        return sVar == null || sVar.mo27339a(this.zzf.mo27316b());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C11435h zza(String str, String str2, C11435h hVar) throws Exception {
        String zzk2 = zzk();
        C10497s zzb2 = zzb(str, str2);
        if (!zza(zzb2)) {
            return C11439k.m36959a(new C10504v0(zzk2, zzb2.f24876a));
        }
        return this.zzh.mo27328a(str, str2, new C10482k0(this, zzk2, str, str2));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C11435h zza(String str, String str2, String str3) {
        return this.zzg.mo27322a(str, str2, str3).mo29257a(this.zzd, (C11434g<TResult, TContinuationResult>) new C10480j0<TResult,TContinuationResult>(this, str2, str3, str));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C11435h zza(String str, String str2, String str3, String str4) throws Exception {
        zzb.mo27344a("", str, str2, str4, this.zzf.mo27316b());
        return C11439k.m36959a(new C10504v0(str3, str4));
    }
}
