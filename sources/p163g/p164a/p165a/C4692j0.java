package p163g.p164a.p165a;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;

/* renamed from: g.a.a.j0 */
/* compiled from: MessageNotificationHandler */
public class C4692j0 extends BroadcastReceiver {
    /* renamed from: a */
    private String m16338a() {
        String str = "";
        try {
            PackageManager packageManager = C4783y0.m16603A().getPackageManager();
            if (packageManager == null) {
                return str;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(C4783y0.m16603A().getPackageName(), 0);
            if (applicationInfo == null || packageManager.getApplicationLabel(applicationInfo) == null) {
                return str;
            }
            return (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (NameNotFoundException e) {
            C4783y0.m16630a("Messages - unable to retrieve app name for local notification (%s)", e.getMessage());
            return str;
        } catch (C4785b e2) {
            C4783y0.m16630a("Messages - unable to get app name (%s)", e2.getMessage());
            return str;
        }
    }

    /* renamed from: b */
    private Bitmap m16339b() throws ClassNotFoundException, NoSuchMethodException, C4785b, IllegalAccessException, InvocationTargetException {
        Drawable drawable;
        int d = C4721o0.m16416d();
        if (d != -1) {
            Context A = C4783y0.m16603A();
            if (VERSION.SDK_INT > 20) {
                drawable = (Drawable) Resources.class.getDeclaredMethod("getDrawable", new Class[]{Integer.TYPE, Theme.class}).invoke(A.getResources(), new Object[]{Integer.valueOf(d), A.getTheme()});
            } else {
                drawable = (Drawable) Resources.class.getDeclaredMethod("getDrawable", new Class[]{Integer.TYPE}).invoke(A.getResources(), new Object[]{Integer.valueOf(d)});
            }
        } else {
            ApplicationInfo applicationInfo = C4783y0.m16603A().getApplicationInfo();
            if (applicationInfo != null) {
                PackageManager packageManager = C4783y0.m16603A().getPackageManager();
                if (packageManager != null) {
                    drawable = packageManager.getApplicationIcon(applicationInfo);
                }
            }
            drawable = null;
        }
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return m16337a(drawable);
    }

    /* renamed from: c */
    private int m16340c() {
        if (C4721o0.m16417e() != -1) {
            return C4721o0.m16417e();
        }
        return 17301651;
    }

    public void onReceive(Context context, Intent intent) {
        Notification notification;
        String str = "userData";
        String str2 = "adb_m_l_id";
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C4783y0.m16630a("Messages - unable to load extras from local notification intent", new Object[0]);
            return;
        }
        try {
            String string = extras.getString("alarm_message");
            int i = extras.getInt("adbMessageCode");
            int i2 = extras.getInt("requestCode");
            String string2 = extras.getString(str2);
            String string3 = extras.getString("adb_deeplink");
            String string4 = extras.getString(str);
            if (i == C4721o0.f11736a.intValue()) {
                if (string == null) {
                    C4783y0.m16630a("Messages - local notification message was empty ", new Object[0]);
                    return;
                }
                try {
                    Activity m = C4783y0.m16653m();
                    try {
                        Context A = C4783y0.m16603A();
                        Activity activity = null;
                        try {
                            activity = C4783y0.m16653m();
                        } catch (C4784a unused) {
                            C4783y0.m16636b("Messages - unable to find activity for your notification, using default", new Object[0]);
                        }
                        if (string3 != null && !string3.isEmpty()) {
                            intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(string3));
                        } else if (activity != null) {
                            intent = activity.getIntent();
                        }
                        intent.setFlags(603979776);
                        intent.putExtra(str2, string2);
                        intent.putExtra(str, string4);
                        int i3 = VERSION.SDK_INT;
                        try {
                            PendingIntent activity2 = PendingIntent.getActivity(A, i2, intent, 134217728);
                            if (activity2 == null) {
                                C4783y0.m16630a("Messages - could not retrieve sender from broadcast, unable to post notification", new Object[0]);
                                return;
                            }
                            if (i3 >= 11) {
                                Class loadClass = BroadcastReceiver.class.getClassLoader().loadClass("android.app.Notification$Builder");
                                Constructor constructor = loadClass.getConstructor(new Class[]{Context.class});
                                constructor.setAccessible(true);
                                Object newInstance = constructor.newInstance(new Object[]{C4783y0.m16603A()});
                                loadClass.getDeclaredMethod("setSmallIcon", new Class[]{Integer.TYPE}).invoke(newInstance, new Object[]{Integer.valueOf(m16340c())});
                                Bitmap b = m16339b();
                                if (b != null) {
                                    loadClass.getDeclaredMethod("setLargeIcon", new Class[]{Bitmap.class}).invoke(newInstance, new Object[]{b});
                                }
                                loadClass.getDeclaredMethod("setContentTitle", new Class[]{CharSequence.class}).invoke(newInstance, new Object[]{m16338a()});
                                loadClass.getDeclaredMethod("setContentText", new Class[]{CharSequence.class}).invoke(newInstance, new Object[]{string});
                                loadClass.getDeclaredMethod("setContentIntent", new Class[]{PendingIntent.class}).invoke(newInstance, new Object[]{activity2});
                                loadClass.getDeclaredMethod("setAutoCancel", new Class[]{Boolean.TYPE}).invoke(newInstance, new Object[]{Boolean.valueOf(true)});
                                if (i3 >= 16) {
                                    notification = loadClass.getDeclaredMethod("build", new Class[0]).invoke(newInstance, new Object[0]);
                                } else {
                                    notification = loadClass.getDeclaredMethod("getNotification", new Class[0]).invoke(newInstance, new Object[0]);
                                }
                                if (notification == 0) {
                                    return;
                                }
                            } else {
                                notification = new Notification();
                                Notification.class.getDeclaredMethod("setLatestEventInfo", new Class[]{Context.class, String.class, String.class, PendingIntent.class}).invoke(notification, new Object[]{A, m16338a(), string, activity2});
                                Notification.class.getField("icon").set(notification, Integer.valueOf(m16340c()));
                                notification.flags = 16;
                            }
                            ((NotificationManager) m.getSystemService("notification")).notify(new SecureRandom().nextInt(), notification);
                        } catch (ClassNotFoundException e) {
                            C4783y0.m16636b("Messages - error posting notification, class not found (%s)", e.getMessage());
                        } catch (NoSuchMethodException e2) {
                            C4783y0.m16636b("Messages - error posting notification, method not found (%s)", e2.getMessage());
                        } catch (C4785b e3) {
                            C4783y0.m16636b("Messages - error posting notification (%s)", e3.getMessage());
                        } catch (Exception e4) {
                            C4783y0.m16636b("Messages - unexpected error posting notification (%s)", e4.getMessage());
                        }
                    } catch (C4785b e5) {
                        C4783y0.m16636b(e5.getMessage(), new Object[0]);
                    }
                } catch (C4784a e6) {
                    C4783y0.m16636b(e6.getMessage(), new Object[0]);
                }
            }
        } catch (Exception e7) {
            C4783y0.m16630a("Messages - unable to load message from local notification (%s)", e7.getMessage());
        }
    }

    /* renamed from: a */
    private Bitmap m16337a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
