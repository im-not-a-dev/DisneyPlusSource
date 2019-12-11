package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.v */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10503v implements Runnable {

    /* renamed from: U */
    private final WakeLock f24887U = ((PowerManager) mo27355a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: V */
    private final FirebaseInstanceId f24888V;

    /* renamed from: W */
    private final C10507x f24889W;

    /* renamed from: c */
    private final long f24890c;

    C10503v(FirebaseInstanceId firebaseInstanceId, C10477i iVar, C10507x xVar, long j) {
        this.f24888V = firebaseInstanceId;
        this.f24889W = xVar;
        this.f24890c = j;
        this.f24887U.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m33141c() throws IOException {
        String str = "FirebaseInstanceId";
        C10497s zzb = this.f24888V.zzb();
        if (!this.f24888V.zza(zzb)) {
            return true;
        }
        try {
            String zzc = this.f24888V.zzc();
            if (zzc == null) {
                Log.e(str, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Token successfully retrieved");
            }
            if ((zzb == null || (zzb != null && !zzc.equals(zzb.f24876a))) && "[DEFAULT]".equals(this.f24888V.zza().mo29430b())) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Invoking onNewToken for app: ";
                    String valueOf = String.valueOf(this.f24888V.zza().mo29430b());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", zzc);
                Context a = mo27355a();
                Intent intent2 = new Intent(a, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                if (!"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    if (e.getMessage() == null) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                        sb.append("Token retrieval failed: ");
                        sb.append(message);
                        sb.append(". Will retry token retrieval");
                        Log.e(str, sb.toString());
                        return false;
                    }
                    throw e;
                }
            }
            Log.e(str, "Token retrieval failed without exception message. Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.e(str, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo27355a() {
        return this.f24888V.zza().mo29428a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo27356b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo27355a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C10493q.m33097b().mo27334a(mo27355a())) {
            this.f24887U.acquire();
        }
        try {
            this.f24888V.zza(true);
            if (!this.f24888V.zzf()) {
                this.f24888V.zza(false);
                if (C10493q.m33097b().mo27334a(mo27355a())) {
                    this.f24887U.release();
                }
            } else if (!C10493q.m33097b().mo27335b(mo27355a()) || mo27356b()) {
                if (!m33141c() || !this.f24889W.mo27363a(this.f24888V)) {
                    this.f24888V.zza(this.f24890c);
                } else {
                    this.f24888V.zza(false);
                }
                if (C10493q.m33097b().mo27334a(mo27355a())) {
                    this.f24887U.release();
                }
            } else {
                new C10501u(this).mo27353a();
                if (C10493q.m33097b().mo27334a(mo27355a())) {
                    this.f24887U.release();
                }
            }
        } catch (IOException e) {
            String str = "FirebaseInstanceId";
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e(str, sb.toString());
            this.f24888V.zza(false);
            if (C10493q.m33097b().mo27334a(mo27355a())) {
                this.f24887U.release();
            }
        } catch (Throwable th) {
            if (C10493q.m33097b().mo27334a(mo27355a())) {
                this.f24887U.release();
            }
            throw th;
        }
    }
}
