package com.bamnet.iap.p035c.p037d;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p163g.p166b.p169b.p170a.C4790a;
import p163g.p166b.p169b.p170a.C4790a.C4791a;
import p686n.p687a.Timber;

/* renamed from: com.bamnet.iap.c.d.d */
/* compiled from: IabHelper */
public class C1662d {

    /* renamed from: a */
    boolean f5798a = false;

    /* renamed from: b */
    boolean f5799b = false;

    /* renamed from: c */
    boolean f5800c = false;

    /* renamed from: d */
    boolean f5801d = false;

    /* renamed from: e */
    boolean f5802e = false;

    /* renamed from: f */
    String f5803f = "";

    /* renamed from: g */
    Context f5804g;

    /* renamed from: h */
    C4790a f5805h;

    /* renamed from: i */
    ServiceConnection f5806i;

    /* renamed from: j */
    int f5807j;

    /* renamed from: k */
    String f5808k;

    /* renamed from: l */
    String f5809l = null;

    /* renamed from: m */
    C1668d f5810m;

    /* renamed from: com.bamnet.iap.c.d.d$a */
    /* compiled from: IabHelper */
    class C1663a implements ServiceConnection {

        /* renamed from: c */
        final /* synthetic */ C1669e f5812c;

        C1663a(C1669e eVar) {
            this.f5812c = eVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1662d dVar = C1662d.this;
            dVar.f5800c = false;
            if (!dVar.f5799b) {
                dVar.mo7313c("Billing service connected.");
                C1662d.this.f5805h = C4791a.m16693a(iBinder);
                String packageName = C1662d.this.f5804g.getPackageName();
                try {
                    C1662d.this.mo7313c("Checking for in-app billing 3 support.");
                    int a = C1662d.this.f5805h.mo16158a(3, packageName, "inapp");
                    if (a != 0) {
                        if (this.f5812c != null) {
                            this.f5812c.mo7249a(new C1671e(a, "Error checking for billing v3 support."));
                        }
                        C1662d.this.f5801d = false;
                        return;
                    }
                    C1662d dVar2 = C1662d.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("In-app billing version 3 supported for ");
                    sb.append(packageName);
                    dVar2.mo7313c(sb.toString());
                    int a2 = C1662d.this.f5805h.mo16158a(3, packageName, "subs");
                    if (a2 == 0) {
                        C1662d.this.mo7313c("Subscriptions AVAILABLE.");
                        C1662d.this.f5801d = true;
                    } else {
                        C1662d dVar3 = C1662d.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Subscriptions NOT AVAILABLE. Response: ");
                        sb2.append(a2);
                        dVar3.mo7313c(sb2.toString());
                    }
                    C1662d.this.f5798a = true;
                    C1669e eVar = this.f5812c;
                    if (eVar != null) {
                        eVar.mo7249a(new C1671e(0, "Setup successful."));
                    }
                } catch (RemoteException e) {
                    C1669e eVar2 = this.f5812c;
                    if (eVar2 != null) {
                        eVar2.mo7249a(new C1671e(-1001, "RemoteException while setting up in-app billing."));
                    }
                    e.printStackTrace();
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1662d.this.mo7313c("Billing service disconnected.");
            C1662d dVar = C1662d.this;
            dVar.f5805h = null;
            dVar.f5800c = true;
        }
    }

    /* renamed from: com.bamnet.iap.c.d.d$b */
    /* compiled from: IabHelper */
    class C1664b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Handler f5813U;

        /* renamed from: c */
        final /* synthetic */ C1670f f5815c;

        /* renamed from: com.bamnet.iap.c.d.d$b$a */
        /* compiled from: IabHelper */
        class C1665a implements Runnable {

            /* renamed from: U */
            final /* synthetic */ C1672f f5816U;

            /* renamed from: c */
            final /* synthetic */ C1671e f5818c;

            C1665a(C1671e eVar, C1672f fVar) {
                this.f5818c = eVar;
                this.f5816U = fVar;
            }

            public void run() {
                C1664b.this.f5815c.mo7250a(this.f5818c, this.f5816U);
            }
        }

        C1664b(C1670f fVar, Handler handler) {
            this.f5815c = fVar;
            this.f5813U = handler;
        }

        public void run() {
            C1671e eVar = new C1671e(0, "Inventory refresh successful.");
            C1672f fVar = new C1672f();
            try {
                int a = C1662d.this.mo7301a(fVar, "inapp");
                if (a == 0) {
                    if (C1662d.this.f5801d) {
                        int a2 = C1662d.this.mo7301a(fVar, "subs");
                        if (a2 != 0) {
                            throw new C1661c(a2, "Error refreshing inventory (querying owned subscriptions).");
                        }
                    }
                    C1662d.this.mo7312c();
                    if (!C1662d.this.f5799b && this.f5815c != null) {
                        this.f5813U.post(new C1665a(eVar, fVar));
                        return;
                    }
                    return;
                }
                throw new C1661c(a, "Error refreshing inventory (querying owned items).");
            } catch (RemoteException e) {
                eVar = new C1661c(-1001, "Remote exception while refreshing inventory.", e).mo7298a();
            } catch (JSONException e2) {
                eVar = new C1661c(-1002, "Error parsing JSON response while refreshing inventory.", e2).mo7298a();
            } catch (C1661c e3) {
                eVar = e3.mo7298a();
            } catch (Exception e4) {
                eVar = new C1661c(-1008, "An unknown error occured while refreshing inventory", e4).mo7298a();
            }
        }
    }

    /* renamed from: com.bamnet.iap.c.d.d$c */
    /* compiled from: IabHelper */
    class C1666c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C1670f f5819U;

        /* renamed from: V */
        final /* synthetic */ Handler f5820V;

        /* renamed from: c */
        final /* synthetic */ List f5822c;

        /* renamed from: com.bamnet.iap.c.d.d$c$a */
        /* compiled from: IabHelper */
        class C1667a implements Runnable {

            /* renamed from: U */
            final /* synthetic */ C1672f f5823U;

            /* renamed from: c */
            final /* synthetic */ C1671e f5825c;

            C1667a(C1671e eVar, C1672f fVar) {
                this.f5825c = eVar;
                this.f5823U = fVar;
            }

            public void run() {
                C1666c.this.f5819U.mo7252b(this.f5825c, this.f5823U);
            }
        }

        C1666c(List list, C1670f fVar, Handler handler) {
            this.f5822c = list;
            this.f5819U = fVar;
            this.f5820V = handler;
        }

        public void run() {
            C1671e eVar = new C1671e(0, "Inventory refresh successful.");
            C1672f fVar = new C1672f();
            try {
                int a = C1662d.this.mo7302a("inapp", fVar, this.f5822c);
                if (a == 0) {
                    if (C1662d.this.f5801d) {
                        int a2 = C1662d.this.mo7302a("subs", fVar, this.f5822c);
                        if (a2 != 0) {
                            throw new C1661c(a2, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                    C1662d.this.mo7312c();
                    if (!C1662d.this.f5799b && this.f5819U != null) {
                        this.f5820V.post(new C1667a(eVar, fVar));
                        return;
                    }
                    return;
                }
                throw new C1661c(a, "Error refreshing inventory (querying prices of items).");
            } catch (RemoteException e) {
                eVar = new C1661c(-1001, "Remote exception while refreshing inventory.", e).mo7298a();
            } catch (JSONException e2) {
                eVar = new C1661c(-1002, "Error parsing JSON response while refreshing inventory.", e2).mo7298a();
            } catch (C1661c e3) {
                eVar = e3.mo7298a();
            }
        }
    }

    /* renamed from: com.bamnet.iap.c.d.d$d */
    /* compiled from: IabHelper */
    public interface C1668d {
        /* renamed from: a */
        void mo7251a(C1671e eVar, C1673g gVar);
    }

    /* renamed from: com.bamnet.iap.c.d.d$e */
    /* compiled from: IabHelper */
    public interface C1669e {
        /* renamed from: a */
        void mo7249a(C1671e eVar);
    }

    /* renamed from: com.bamnet.iap.c.d.d$f */
    /* compiled from: IabHelper */
    public interface C1670f {
        /* renamed from: a */
        void mo7250a(C1671e eVar, C1672f fVar);

        /* renamed from: b */
        void mo7252b(C1671e eVar, C1672f fVar);
    }

    public C1662d(Context context, String str) {
        this.f5804g = context.getApplicationContext();
        this.f5809l = str;
        mo7313c("IAB helper created.");
    }

    /* renamed from: d */
    private void m7670d() throws IllegalStateException {
        if (this.f5799b) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /* renamed from: a */
    public void mo7305a(C1669e eVar) {
        m7670d();
        if (!this.f5798a) {
            mo7313c("Starting in-app billing setup.");
            this.f5806i = new C1663a(eVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List queryIntentServices = this.f5804g.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f5804g.bindService(intent, this.f5806i, 1);
            } else if (eVar != null) {
                eVar.mo7249a(new C1671e(3, "Billing service unavailable on device."));
            }
        } else {
            throw new IllegalStateException("IAB helper is already set up.");
        }
    }

    /* renamed from: b */
    public void mo7310b() {
        mo7313c("Disposing.");
        this.f5798a = false;
        if (this.f5806i != null) {
            mo7313c("Unbinding from service.");
            Context context = this.f5804g;
            if (context != null) {
                context.unbindService(this.f5806i);
            }
        }
        this.f5799b = true;
        this.f5804g = null;
        this.f5806i = null;
        this.f5805h = null;
        this.f5810m = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7312c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ending async operation: ");
        sb.append(this.f5803f);
        mo7313c(sb.toString());
        this.f5803f = "";
        this.f5802e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7315e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("In-app billing warning: ");
        sb.append(str);
        Timber.m44532e(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7314d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("In-app billing error: ");
        sb.append(str);
        Timber.m44526b(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7313c(String str) {
        Timber.m44522a(str, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7311b(String str) {
        if (!this.f5802e) {
            this.f5803f = str;
            this.f5802e = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Starting async operation: ");
            sb.append(str);
            mo7313c(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't start async operation (");
        sb2.append(str);
        sb2.append(") because another async operation(");
        sb2.append(this.f5803f);
        sb2.append(") is in progress.");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: a */
    public void mo7304a(Activity activity, String str, String str2, int i, C1668d dVar, String str3) {
        String str4 = "launchPurchaseFlow";
        mo7311b(str4);
        try {
            m7670d();
            mo7303a();
            mo7308a(str4);
            if (!str2.equals("subs") || this.f5801d) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Constructing buy intent for ");
                    sb.append(str);
                    sb.append(", item type: ");
                    sb.append(str2);
                    mo7313c(sb.toString());
                    Bundle a = this.f5805h.mo16163a(3, this.f5804g.getPackageName(), str, str2, str3);
                    int a2 = mo7300a(a);
                    if (a2 != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to buy item, Error response: ");
                        sb2.append(m7669a(a2));
                        mo7314d(sb2.toString());
                        mo7312c();
                        C1671e eVar = new C1671e(a2, "Unable to buy item");
                        if (dVar != null) {
                            dVar.mo7251a(eVar, null);
                        }
                        return;
                    }
                    PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Launching buy intent for ");
                    sb3.append(str);
                    sb3.append(". Request code: ");
                    sb3.append(i);
                    mo7313c(sb3.toString());
                    this.f5807j = i;
                    this.f5810m = dVar;
                    this.f5808k = str2;
                    activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                } catch (SendIntentException e) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SendIntentException while launching purchase flow for sku ");
                    sb4.append(str);
                    mo7314d(sb4.toString());
                    e.printStackTrace();
                    mo7312c();
                    C1671e eVar2 = new C1671e(-1004, "Failed to send intent.");
                    if (dVar != null) {
                        dVar.mo7251a(eVar2, null);
                    }
                } catch (RemoteException e2) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("RemoteException while launching purchase flow for sku ");
                    sb5.append(str);
                    mo7314d(sb5.toString());
                    e2.printStackTrace();
                    mo7312c();
                    C1671e eVar3 = new C1671e(-1001, "Remote exception while starting purchase flow");
                    if (dVar != null) {
                        dVar.mo7251a(eVar3, null);
                    }
                }
            } else {
                C1671e eVar4 = new C1671e(-1009, "Subscriptions are not available.");
                mo7312c();
                if (dVar != null) {
                    dVar.mo7251a(eVar4, null);
                }
            }
        } catch (IllegalStateException e3) {
            C1671e a3 = new C1661c(-1011, "The IAB Helper is not ready to be used.", e3).mo7298a();
            mo7312c();
            if (dVar != null) {
                dVar.mo7251a(a3, null);
            }
        }
    }

    /* renamed from: a */
    public boolean mo7309a(int i, int i2, Intent intent) {
        C1671e eVar;
        String str = "Null data in IAB activity result.";
        if (i != this.f5807j) {
            return false;
        }
        try {
            m7670d();
            mo7303a();
            mo7308a("handleActivityResult");
            mo7312c();
            if (intent == null) {
                mo7314d(str);
                C1671e eVar2 = new C1671e(-1002, "Null data in IAB result");
                C1668d dVar = this.f5810m;
                if (dVar != null) {
                    dVar.mo7251a(eVar2, null);
                }
                return true;
            }
            int a = mo7299a(intent);
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (i2 == -1 && a == 0) {
                mo7313c("Successful resultcode from purchase activity.");
                StringBuilder sb = new StringBuilder();
                sb.append("Purchase data: ");
                sb.append(stringExtra);
                mo7313c(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Data signature: ");
                sb2.append(stringExtra2);
                mo7313c(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                String str2 = "Extras: ";
                sb3.append(str2);
                sb3.append(intent.getExtras());
                mo7313c(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Expected item type: ");
                sb4.append(this.f5808k);
                mo7313c(sb4.toString());
                if (stringExtra == null || stringExtra2 == null) {
                    mo7314d("BUG: either purchaseData or dataSignature is null.");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(intent.getExtras().toString());
                    mo7313c(sb5.toString());
                    C1671e eVar3 = new C1671e(-1008, "IAB returned null purchaseData or dataSignature");
                    C1668d dVar2 = this.f5810m;
                    if (dVar2 != null) {
                        dVar2.mo7251a(eVar3, null);
                    }
                    return true;
                }
                try {
                    C1673g gVar = new C1673g(this.f5808k, stringExtra, stringExtra2);
                    String f = gVar.mo7336f();
                    if (this.f5809l == null || C1674h.m7708a(this.f5809l, stringExtra, stringExtra2)) {
                        mo7313c("Purchase signature successfully verified.");
                        C1668d dVar3 = this.f5810m;
                        if (dVar3 != null) {
                            dVar3.mo7251a(new C1671e(0, "Success"), gVar);
                        }
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Purchase signature verification FAILED for sku ");
                        sb6.append(f);
                        mo7314d(sb6.toString());
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Signature verification failed for sku ");
                        sb7.append(f);
                        C1671e eVar4 = new C1671e(-1003, sb7.toString());
                        if (this.f5810m != null) {
                            this.f5810m.mo7251a(eVar4, gVar);
                        }
                        return true;
                    }
                } catch (JSONException e) {
                    String str3 = "Failed to parse purchase data.";
                    mo7314d(str3);
                    e.printStackTrace();
                    C1671e eVar5 = new C1671e(-1002, str3);
                    C1668d dVar4 = this.f5810m;
                    if (dVar4 != null) {
                        dVar4.mo7251a(eVar5, null);
                    }
                    return true;
                }
            } else if (i2 == -1) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Result code was OK but in-app billing response was not OK: ");
                sb8.append(m7669a(a));
                mo7313c(sb8.toString());
                if (this.f5810m != null) {
                    this.f5810m.mo7251a(new C1671e(a, "Problem purchashing item."), null);
                }
            } else if (i2 == 0) {
                if (a == 7) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Purchase Already Owned - Response: ");
                    sb9.append(m7669a(a));
                    mo7313c(sb9.toString());
                    eVar = new C1671e(7, null);
                } else {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Purchase canceled - Response: ");
                    sb10.append(m7669a(a));
                    mo7313c(sb10.toString());
                    eVar = new C1671e(-1005, "User canceled.");
                }
                C1668d dVar5 = this.f5810m;
                if (dVar5 != null) {
                    dVar5.mo7251a(eVar, null);
                }
            } else {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("Purchase failed. Result code: ");
                sb11.append(Integer.toString(i2));
                sb11.append(". Response: ");
                sb11.append(m7669a(a));
                mo7314d(sb11.toString());
                C1671e eVar6 = new C1671e(-1006, "Unknown purchase response.");
                C1668d dVar6 = this.f5810m;
                if (dVar6 != null) {
                    dVar6.mo7251a(eVar6, null);
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            mo7314d(str);
            C1671e a2 = new C1661c(-1011, "The IAB Helper is not ready to be used.", e2).mo7298a();
            C1668d dVar7 = this.f5810m;
            if (dVar7 != null) {
                dVar7.mo7251a(a2, null);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo7306a(C1670f fVar) {
        try {
            m7670d();
            mo7303a();
            mo7308a("queryInventory");
            Handler handler = new Handler();
            mo7311b("refresh inventory");
            new Thread(new C1664b(fVar, handler)).start();
        } catch (IllegalStateException e) {
            C1671e a = new C1661c(-1011, "The IAB Helper is not ready to be used.", e).mo7298a();
            if (fVar != null) {
                fVar.mo7250a(a, null);
            }
        }
    }

    /* renamed from: a */
    public void mo7307a(C1670f fVar, List<String> list) {
        try {
            m7670d();
            mo7303a();
            mo7308a("queryInventory");
            Handler handler = new Handler();
            mo7311b("refresh inventory");
            new Thread(new C1666c(list, fVar, handler)).start();
        } catch (IllegalStateException e) {
            C1671e a = new C1661c(-1011, "The IAB Helper is not ready to be used.", e).mo7298a();
            if (fVar != null) {
                fVar.mo7252b(a, null);
            }
        }
    }

    /* renamed from: a */
    public static String m7669a(int i) {
        String str = "/";
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split(str);
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt-1011:IabHelper Not Ready".split(str);
        if (i <= -1000) {
            int i2 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(i));
            sb.append(":Unknown IAB Helper Error");
            return sb.toString();
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(i));
            sb2.append(":Unknown");
            return sb2.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7303a() {
        if (this.f5800c) {
            throw new IllegalStateException("The IAB Service has been disconnected. We cannot proceed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7308a(String str) throws IllegalStateException {
        if (!this.f5798a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state for operation (");
            sb.append(str);
            sb.append("): IAB helper is not set up.");
            mo7314d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IAB helper is not set up. Can't perform operation: ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7300a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            mo7313c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo7314d("Unexpected type for bundle response code.");
            mo7314d(obj.getClass().getName());
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for bundle response code: ");
            sb.append(obj.getClass().getName());
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7299a(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            mo7314d("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo7314d("Unexpected type for intent response code.");
            mo7314d(obj.getClass().getName());
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for intent response code: ");
            sb.append(obj.getClass().getName());
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7301a(C1672f fVar, String str) throws JSONException, RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("Querying owned items, item type: ");
        sb.append(str);
        mo7313c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Package name: ");
        sb2.append(this.f5804g.getPackageName());
        mo7313c(sb2.toString());
        int i = 0;
        String str2 = null;
        boolean z = false;
        while (true) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Calling getPurchases with continuation token: ");
            sb3.append(str2);
            mo7313c(sb3.toString());
            Bundle a = this.f5805h.mo16161a(3, this.f5804g.getPackageName(), str, str2);
            int a2 = mo7300a(a);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Owned items response: ");
            sb4.append(String.valueOf(a2));
            mo7313c(sb4.toString());
            if (a2 == 0) {
                String str3 = "INAPP_PURCHASE_ITEM_LIST";
                if (!a.containsKey(str3)) {
                    break;
                }
                String str4 = "INAPP_PURCHASE_DATA_LIST";
                if (!a.containsKey(str4)) {
                    break;
                }
                String str5 = "INAPP_DATA_SIGNATURE_LIST";
                if (!a.containsKey(str5)) {
                    break;
                }
                ArrayList stringArrayList = a.getStringArrayList(str3);
                ArrayList stringArrayList2 = a.getStringArrayList(str4);
                ArrayList stringArrayList3 = a.getStringArrayList(str5);
                boolean z2 = z;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str6 = (String) stringArrayList2.get(i2);
                    String str7 = (String) stringArrayList3.get(i2);
                    String str8 = (String) stringArrayList.get(i2);
                    String str9 = this.f5809l;
                    if (str9 == null || C1674h.m7708a(str9, str6, str7)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Sku is owned: ");
                        sb5.append(str8);
                        mo7313c(sb5.toString());
                        C1673g gVar = new C1673g(str, str6, str7);
                        if (TextUtils.isEmpty(gVar.mo7337g())) {
                            mo7315e("BUG: empty/null token!");
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Purchase data: ");
                            sb6.append(str6);
                            mo7313c(sb6.toString());
                        }
                        fVar.mo7328a(gVar);
                    } else {
                        mo7315e("Purchase signature verification **FAILED**. Not adding item.");
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("   Purchase data: ");
                        sb7.append(str6);
                        mo7313c(sb7.toString());
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("   Signature: ");
                        sb8.append(str7);
                        mo7313c(sb8.toString());
                        z2 = true;
                    }
                }
                str2 = a.getString("INAPP_CONTINUATION_TOKEN");
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Continuation token: ");
                sb9.append(str2);
                mo7313c(sb9.toString());
                if (TextUtils.isEmpty(str2)) {
                    if (z2) {
                        i = -1003;
                    }
                    return i;
                }
                z = z2;
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("getPurchases() failed: ");
                sb10.append(m7669a(a2));
                mo7313c(sb10.toString());
                return a2;
            }
        }
        mo7314d("Bundle returned from getPurchases() doesn't contain required fields.");
        return -1002;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7302a(String str, C1672f fVar, List<String> list) throws RemoteException, JSONException {
        mo7313c("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fVar.mo7327a(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            mo7313c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        Bundle b = this.f5805h.mo16167b(3, this.f5804g.getPackageName(), str, bundle);
        String str3 = "DETAILS_LIST";
        if (!b.containsKey(str3)) {
            int a = mo7300a(b);
            if (a != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("getSkuDetails() failed: ");
                sb.append(m7669a(a));
                mo7313c(sb.toString());
                return a;
            }
            mo7314d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
            return -1002;
        }
        Iterator it = b.getStringArrayList(str3).iterator();
        while (it.hasNext()) {
            C1675i iVar = new C1675i(str, (String) it.next());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got sku details: ");
            sb2.append(iVar);
            mo7313c(sb2.toString());
            fVar.mo7329a(iVar);
        }
        return 0;
    }
}
