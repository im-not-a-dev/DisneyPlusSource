package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C0478i.C0482c;
import androidx.core.app.C0478i.C0483d;
import androidx.core.app.C0478i.C0485f;
import androidx.fragment.app.C0532d;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C9726e;
import com.google.android.gms.common.api.internal.C9735f1;
import com.google.android.gms.common.api.internal.C9739g1;
import com.google.android.gms.common.internal.C9868e;
import com.google.android.gms.common.internal.C9870f;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9945i;
import com.google.android.gms.common.util.C9948l;
import java.util.ArrayList;
import java.util.Arrays;
import p163g.p449j.p450a.p451a.p455b.C10952a;
import p163g.p449j.p450a.p451a.p455b.C10953b;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;
import p163g.p449j.p450a.p451a.p467f.C11424a;
import p163g.p449j.p450a.p451a.p467f.C11435h;

public class GoogleApiAvailability extends C9826e {

    /* renamed from: d */
    private static final Object f22685d = new Object();

    /* renamed from: e */
    private static final GoogleApiAvailability f22686e = new GoogleApiAvailability();

    /* renamed from: c */
    private String f22687c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    private class C9675a extends C10997h {

        /* renamed from: a */
        private final Context f22688a;

        public C9675a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f22688a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c = GoogleApiAvailability.this.mo24987c(this.f22688a);
            if (GoogleApiAvailability.this.mo24989c(c)) {
                GoogleApiAvailability.this.mo24988c(this.f22688a, c);
            }
        }
    }

    /* renamed from: a */
    public static GoogleApiAvailability m30032a() {
        return f22686e;
    }

    /* renamed from: b */
    public boolean mo24986b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo24978a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m30033a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: c */
    public void mo24988c(Context context, int i) {
        m30034a(context, i, (String) null, mo25293a(context, i, 0, "n"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo24990d(Context context) {
        new C9675a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: a */
    public Dialog mo24978a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m30031a((Context) activity, i, C9870f.m30767a(activity, mo24981a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: b */
    private final String m30035b() {
        String str;
        synchronized (f22685d) {
            str = this.f22687c;
        }
        return str;
    }

    /* renamed from: c */
    public int mo24987c(Context context) {
        return super.mo24987c(context);
    }

    /* renamed from: c */
    public final boolean mo24989c(int i) {
        return super.mo24989c(i);
    }

    /* renamed from: a */
    public final boolean mo24984a(Context context, C9820b bVar, int i) {
        PendingIntent a = mo24980a(context, bVar);
        if (a == null) {
            return false;
        }
        m30034a(context, bVar.mo25270c(), (String) null, GoogleApiActivity.m30052a(context, a, i));
        return true;
    }

    /* renamed from: b */
    public final String mo24985b(int i) {
        return super.mo24985b(i);
    }

    /* renamed from: a */
    public final C9735f1 mo24982a(Context context, C9739g1 g1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C9735f1 f1Var = new C9735f1(g1Var);
        context.registerReceiver(f1Var, intentFilter);
        f1Var.mo25169a(context);
        if (mo25296a(context, "com.google.android.gms")) {
            return f1Var;
        }
        g1Var.mo25173a();
        f1Var.mo25168a();
        return null;
    }

    /* renamed from: a */
    public C11435h<Void> mo24983a(C9695e<?> eVar, C9695e<?>... eVarArr) {
        String str = "Requested API must not be null.";
        C9908u.m30854a(eVar, (Object) str);
        for (C9695e<?> a : eVarArr) {
            C9908u.m30854a(a, (Object) str);
        }
        ArrayList arrayList = new ArrayList(eVarArr.length + 1);
        arrayList.add(eVar);
        arrayList.addAll(Arrays.asList(eVarArr));
        return C9726e.m30195e().mo25134a((Iterable<? extends C9695e<?>>) arrayList).mo29248a((C11424a<TResult, TContinuationResult>) new C9932q<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    public int mo24977a(Context context, int i) {
        return super.mo24977a(context, i);
    }

    /* renamed from: a */
    public Intent mo24981a(Context context, int i, String str) {
        return super.mo24981a(context, i, str);
    }

    /* renamed from: a */
    public PendingIntent mo24979a(Context context, int i, int i2) {
        return super.mo24979a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo24980a(Context context, C9820b bVar) {
        if (bVar.mo25274f()) {
            return bVar.mo25272e();
        }
        return mo24979a(context, bVar.mo25270c(), 0);
    }

    /* renamed from: a */
    static Dialog m30031a(Context context, int i, C9870f fVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C9868e.m30762b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = C9868e.m30758a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, fVar);
        }
        String e = C9868e.m30765e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m30033a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C0532d) {
            C9925l.m30938a(dialog, onCancelListener).show(((C0532d) activity).getSupportFragmentManager(), str);
            return;
        }
        C9822c.m30597a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m30034a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo24990d(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String d = C9868e.m30764d(context, i);
            String c = C9868e.m30763c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0483d dVar = new C0483d(context);
            dVar.mo2663b(true);
            dVar.mo2657a(true);
            dVar.mo2661b((CharSequence) d);
            C0482c cVar = new C0482c();
            cVar.mo2641a((CharSequence) c);
            dVar.mo2654a((C0485f) cVar);
            if (C9945i.m30983b(context)) {
                C9908u.m30864b(C9948l.m30993f());
                dVar.mo2673e(context.getApplicationInfo().icon);
                dVar.mo2669d(2);
                if (C9945i.m30984c(context)) {
                    dVar.mo2646a(C10952a.common_full_open_on_phone, resources.getString(C10953b.common_open_on_phone), pendingIntent);
                } else {
                    dVar.mo2649a(pendingIntent);
                }
            } else {
                dVar.mo2673e(17301642);
                dVar.mo2670d((CharSequence) resources.getString(C10953b.common_google_play_services_notification_ticker));
                dVar.mo2647a(System.currentTimeMillis());
                dVar.mo2649a(pendingIntent);
                dVar.mo2655a((CharSequence) c);
            }
            if (C9948l.m30996i()) {
                C9908u.m30864b(C9948l.m30996i());
                String b = m30035b();
                if (b == null) {
                    b = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
                    String b2 = C9868e.m30761b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(b, b2, 4));
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.mo2662b(b);
            }
            Notification a = dVar.mo2644a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C9832i.f23043d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        }
    }
}
