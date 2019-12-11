package p512h.p513c;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import p512h.p515d.C11897e;

/* renamed from: h.c.a */
/* compiled from: AndroidInjection */
public final class C11870a {
    /* renamed from: a */
    public static void m38100a(Activity activity) {
        C11871b bVar;
        C11897e.m38130a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof C11880i) {
            bVar = ((C11880i) application).androidInjector();
            C11897e.m38131a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof C11879h) {
            bVar = ((C11879h) application).mo30021a();
            C11897e.m38131a(bVar, "%s.activityInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), C11880i.class.getCanonicalName(), C11879h.class.getCanonicalName()}));
        }
        bVar.mo11603a(activity);
    }

    /* renamed from: a */
    public static void m38101a(BroadcastReceiver broadcastReceiver, Context context) {
        C11871b bVar;
        C11897e.m38130a(broadcastReceiver, "broadcastReceiver");
        C11897e.m38130a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof C11880i) {
            bVar = ((C11880i) application).androidInjector();
            C11897e.m38131a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof C11881j) {
            bVar = ((C11881j) application).mo30022a();
            C11897e.m38131a(bVar, "%s.broadcastReceiverInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), C11880i.class.getCanonicalName(), C11881j.class.getCanonicalName()}));
        }
        bVar.mo11603a(broadcastReceiver);
    }
}
