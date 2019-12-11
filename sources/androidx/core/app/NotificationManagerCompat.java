package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.p001v4.app.C0001a;
import android.support.p001v4.app.C0001a.C0002a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    private static C0457d sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager = ((NotificationManager) this.mContext.getSystemService("notification"));

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    private static class C0454a implements C0459e {

        /* renamed from: a */
        final String f2053a;

        /* renamed from: b */
        final int f2054b;

        /* renamed from: c */
        final String f2055c;

        /* renamed from: d */
        final boolean f2056d;

        C0454a(String str) {
            this.f2053a = str;
            this.f2054b = 0;
            this.f2055c = null;
            this.f2056d = true;
        }

        /* renamed from: a */
        public void mo2600a(C0001a aVar) throws RemoteException {
            if (this.f2056d) {
                aVar.mo9a(this.f2053a);
            } else {
                aVar.mo10a(this.f2053a, this.f2054b, this.f2055c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f2053a);
            sb.append(", id:");
            sb.append(this.f2054b);
            sb.append(", tag:");
            sb.append(this.f2055c);
            sb.append(", all:");
            sb.append(this.f2056d);
            sb.append("]");
            return sb.toString();
        }

        C0454a(String str, int i, String str2) {
            this.f2053a = str;
            this.f2054b = i;
            this.f2055c = str2;
            this.f2056d = false;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    private static class C0455b implements C0459e {

        /* renamed from: a */
        final String f2057a;

        /* renamed from: b */
        final int f2058b;

        /* renamed from: c */
        final String f2059c;

        /* renamed from: d */
        final Notification f2060d;

        C0455b(String str, int i, String str2, Notification notification) {
            this.f2057a = str;
            this.f2058b = i;
            this.f2059c = str2;
            this.f2060d = notification;
        }

        /* renamed from: a */
        public void mo2600a(C0001a aVar) throws RemoteException {
            aVar.mo11a(this.f2057a, this.f2058b, this.f2059c, this.f2060d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f2057a);
            sb.append(", id:");
            sb.append(this.f2058b);
            sb.append(", tag:");
            sb.append(this.f2059c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    private static class C0456c {

        /* renamed from: a */
        final ComponentName f2061a;

        /* renamed from: b */
        final IBinder f2062b;

        C0456c(ComponentName componentName, IBinder iBinder) {
            this.f2061a = componentName;
            this.f2062b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    private static class C0457d implements Callback, ServiceConnection {

        /* renamed from: U */
        private final HandlerThread f2063U;

        /* renamed from: V */
        private final Handler f2064V;

        /* renamed from: W */
        private final Map<ComponentName, C0458a> f2065W = new HashMap();

        /* renamed from: X */
        private Set<String> f2066X = new HashSet();

        /* renamed from: c */
        private final Context f2067c;

        /* renamed from: androidx.core.app.NotificationManagerCompat$d$a */
        private static class C0458a {

            /* renamed from: a */
            final ComponentName f2068a;

            /* renamed from: b */
            boolean f2069b = false;

            /* renamed from: c */
            C0001a f2070c;

            /* renamed from: d */
            ArrayDeque<C0459e> f2071d = new ArrayDeque<>();

            /* renamed from: e */
            int f2072e = 0;

            C0458a(ComponentName componentName) {
                this.f2068a = componentName;
            }
        }

        C0457d(Context context) {
            this.f2067c = context;
            this.f2063U = new HandlerThread("NotificationManagerCompat");
            this.f2063U.start();
            this.f2064V = new Handler(this.f2063U.getLooper(), this);
        }

        /* renamed from: b */
        private void m2483b(C0459e eVar) {
            m2477a();
            for (C0458a aVar : this.f2065W.values()) {
                aVar.f2071d.add(eVar);
                m2484c(aVar);
            }
        }

        /* renamed from: c */
        private void m2484c(C0458a aVar) {
            String str = NotificationManagerCompat.TAG;
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f2068a);
                sb.append(", ");
                sb.append(aVar.f2071d.size());
                sb.append(" queued tasks");
                Log.d(str, sb.toString());
            }
            if (!aVar.f2071d.isEmpty()) {
                if (!m2480a(aVar) || aVar.f2070c == null) {
                    m2485d(aVar);
                    return;
                }
                while (true) {
                    C0459e eVar = (C0459e) aVar.f2071d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                            Log.d(str, sb2.toString());
                        }
                        eVar.mo2600a(aVar.f2070c);
                        aVar.f2071d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f2068a);
                            Log.d(str, sb3.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f2068a);
                        Log.w(str, sb4.toString(), e);
                    }
                }
                if (!aVar.f2071d.isEmpty()) {
                    m2485d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m2485d(C0458a aVar) {
            if (!this.f2064V.hasMessages(3, aVar.f2068a)) {
                aVar.f2072e++;
                int i = aVar.f2072e;
                String str = NotificationManagerCompat.TAG;
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f2071d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f2068a);
                    sb.append(" after ");
                    sb.append(aVar.f2072e);
                    sb.append(" retries");
                    Log.w(str, sb.toString());
                    aVar.f2071d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                    Log.d(str, sb2.toString());
                }
                this.f2064V.sendMessageDelayed(this.f2064V.obtainMessage(3, aVar.f2068a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo2603a(C0459e eVar) {
            this.f2064V.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m2483b((C0459e) message.obj);
                return true;
            } else if (i == 1) {
                C0456c cVar = (C0456c) message.obj;
                m2479a(cVar.f2061a, cVar.f2062b);
                return true;
            } else if (i == 2) {
                m2481b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m2478a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = NotificationManagerCompat.TAG;
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.f2064V.obtainMessage(1, new C0456c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String str = NotificationManagerCompat.TAG;
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.f2064V.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m2479a(ComponentName componentName, IBinder iBinder) {
            C0458a aVar = (C0458a) this.f2065W.get(componentName);
            if (aVar != null) {
                aVar.f2070c = C0002a.m4a(iBinder);
                aVar.f2072e = 0;
                m2484c(aVar);
            }
        }

        /* renamed from: b */
        private void m2481b(ComponentName componentName) {
            C0458a aVar = (C0458a) this.f2065W.get(componentName);
            if (aVar != null) {
                m2482b(aVar);
            }
        }

        /* renamed from: a */
        private void m2478a(ComponentName componentName) {
            C0458a aVar = (C0458a) this.f2065W.get(componentName);
            if (aVar != null) {
                m2484c(aVar);
            }
        }

        /* renamed from: b */
        private void m2482b(C0458a aVar) {
            if (aVar.f2069b) {
                this.f2067c.unbindService(this);
                aVar.f2069b = false;
            }
            aVar.f2070c = null;
        }

        /* renamed from: a */
        private void m2477a() {
            String str;
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f2067c);
            if (!enabledListenerPackages.equals(this.f2066X)) {
                this.f2066X = enabledListenerPackages;
                List queryIntentServices = this.f2067c.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                Iterator it = queryIntentServices.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = NotificationManagerCompat.TAG;
                    if (!hasNext) {
                        break;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w(str, sb.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2065W.containsKey(componentName2)) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d(str, sb2.toString());
                        }
                        this.f2065W.put(componentName2, new C0458a(componentName2));
                    }
                }
                Iterator it2 = this.f2065W.entrySet().iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(entry.getKey());
                            Log.d(str, sb3.toString());
                        }
                        m2482b((C0458a) entry.getValue());
                        it2.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m2480a(C0458a aVar) {
            if (aVar.f2069b) {
                return true;
            }
            aVar.f2069b = this.f2067c.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f2068a), this, 33);
            if (aVar.f2069b) {
                aVar.f2072e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f2068a);
                Log.w(NotificationManagerCompat.TAG, sb.toString());
                this.f2067c.unbindService(this);
            }
            return aVar.f2069b;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$e */
    private interface C0459e {
        /* renamed from: a */
        void mo2600a(C0001a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(C0459e eVar) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new C0457d(this.mContext.getApplicationContext());
            }
            sSideChannelManager.mo2603a(eVar);
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle a = C0478i.m2520a(notification);
        return a != null && a.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return this.mNotificationManager.areNotificationsEnabled();
        }
        boolean z = true;
        if (i >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.mContext.getSystemService("appops");
            ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
            String packageName = this.mContext.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod(CHECK_OP_NO_THROW, new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() != 0) {
                    z = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return z;
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
        if (VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new C0454a(this.mContext.getPackageName()));
        }
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void deleteNotificationChannel(String str) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public int getImportance() {
        return VERSION.SDK_INT >= 24 ? this.mNotificationManager.getImportance() : IMPORTANCE_UNSPECIFIED;
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        if (VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new C0454a(this.mContext.getPackageName(), i, str));
        }
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new C0455b(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }
}
