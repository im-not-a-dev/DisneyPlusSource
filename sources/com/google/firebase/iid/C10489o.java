package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.C10471f0.C10472a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p096e.p113e.C3941i;
import p163g.p449j.p450a.p451a.p467f.C11436i;
import p163g.p449j.p450a.p451a.p467f.C11439k;

/* renamed from: com.google.firebase.iid.o */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10489o {

    /* renamed from: g */
    private static int f24857g;

    /* renamed from: h */
    private static PendingIntent f24858h;

    /* renamed from: a */
    private final C3941i<String, C11436i<Bundle>> f24859a = new C3941i<>();

    /* renamed from: b */
    private final Context f24860b;

    /* renamed from: c */
    private final C10477i f24861c;

    /* renamed from: d */
    private Messenger f24862d;

    /* renamed from: e */
    private Messenger f24863e;

    /* renamed from: f */
    private C10471f0 f24864f;

    public C10489o(Context context, C10477i iVar) {
        this.f24860b = context;
        this.f24861c = iVar;
        this.f24862d = new Messenger(new C10495r(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33088a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C10472a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C10471f0) {
                        this.f24864f = (C10471f0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f24863e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("FirebaseInstanceId", sb.toString());
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str2 = "Received InstanceID error ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str3 = split[2];
                                    String str4 = split[3];
                                    if (str4.startsWith(":")) {
                                        str4 = str4.substring(1);
                                    }
                                    m33090a(str3, intent2.putExtra("error", str4).getExtras());
                                }
                            }
                            String str5 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            Log.w("FirebaseInstanceId", valueOf4.length() != 0 ? str5.concat(valueOf4) : new String(str5));
                        } else {
                            synchronized (this.f24859a) {
                                for (int i = 0; i < this.f24859a.size(); i++) {
                                    m33090a((String) this.f24859a.mo14151b(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? str6.concat(valueOf5) : new String(str6));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m33090a(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: b */
    private final Bundle m33091b(Bundle bundle) throws IOException {
        Bundle c = m33092c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        Bundle c2 = m33092c(bundle);
        if (c2 == null || !c2.containsKey(str)) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m33092c(android.os.Bundle r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = m33086a()
            g.j.a.a.f.i r1 = new g.j.a.a.f.i
            r1.<init>()
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r2 = r7.f24859a
            monitor-enter(r2)
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r3 = r7.f24859a     // Catch:{ all -> 0x0126 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            com.google.firebase.iid.i r2 = r7.f24861c
            int r2 = r2.mo27315a()
            if (r2 == 0) goto L_0x011e
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.i r3 = r7.f24861c
            int r3 = r3.mo27315a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r8)
            android.content.Context r8 = r7.f24860b
            m33087a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0096
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0096:
            android.os.Messenger r3 = r7.f24862d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f24863e
            if (r3 != 0) goto L_0x00a5
            com.google.firebase.iid.f0 r3 = r7.f24864f
            if (r3 == 0) goto L_0x00cb
        L_0x00a5:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f24863e     // Catch:{ RemoteException -> 0x00bb }
            if (r5 == 0) goto L_0x00b5
            android.os.Messenger r5 = r7.f24863e     // Catch:{ RemoteException -> 0x00bb }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00b5:
            com.google.firebase.iid.f0 r5 = r7.f24864f     // Catch:{ RemoteException -> 0x00bb }
            r5.mo27302a(r3)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00bb:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00cb
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00cb:
            com.google.firebase.iid.i r8 = r7.f24861c
            int r8 = r8.mo27315a()
            if (r8 != r4) goto L_0x00d9
            android.content.Context r8 = r7.f24860b
            r8.sendBroadcast(r2)
            goto L_0x00de
        L_0x00d9:
            android.content.Context r8 = r7.f24860b
            r8.startService(r2)
        L_0x00de:
            g.j.a.a.f.h r8 = r1.mo29271a()     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            java.lang.Object r8 = p163g.p449j.p450a.p451a.p467f.C11439k.m36962a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r1 = r7.f24859a
            monitor-enter(r1)
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r2 = r7.f24859a     // Catch:{ all -> 0x00f6 }
            r2.remove(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            return r8
        L_0x00f6:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            throw r8
        L_0x00f9:
            r8 = move-exception
            goto L_0x0111
        L_0x00fb:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r8)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x0102:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00f9 }
            throw r8     // Catch:{ all -> 0x00f9 }
        L_0x0111:
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r1 = r7.f24859a
            monitor-enter(r1)
            e.e.i<java.lang.String, g.j.a.a.f.i<android.os.Bundle>> r2 = r7.f24859a     // Catch:{ all -> 0x011b }
            r2.remove(r0)     // Catch:{ all -> 0x011b }
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011b:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0126:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10489o.m33092c(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: a */
    private static synchronized void m33087a(Context context, Intent intent) {
        synchronized (C10489o.class) {
            if (f24858h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f24858h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f24858h);
        }
    }

    /* renamed from: a */
    private final void m33090a(String str, Bundle bundle) {
        synchronized (this.f24859a) {
            C11436i iVar = (C11436i) this.f24859a.remove(str);
            if (iVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            iVar.mo29273a(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo27329a(Bundle bundle) throws IOException {
        if (this.f24861c.mo27318d() < 12000000) {
            return m33091b(bundle);
        }
        try {
            return (Bundle) C11439k.m36961a(C10506w0.m33147a(this.f24860b).mo27360b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if (!(e.getCause() instanceof C10473g) || ((C10473g) e.getCause()).mo27308a() != 4) {
                return null;
            }
            return m33091b(bundle);
        }
    }

    /* renamed from: a */
    private static synchronized String m33086a() {
        String num;
        synchronized (C10489o.class) {
            int i = f24857g;
            f24857g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }
}
