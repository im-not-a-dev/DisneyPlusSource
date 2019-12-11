package com.appboy.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.C0478i.C0483d;
import com.appboy.C1483k;
import com.appboy.p024n.C1489b;

/* renamed from: com.appboy.push.b */
/* compiled from: AppboyNotificationFactory */
public class C1523b implements C1483k {

    /* renamed from: a */
    private static volatile C1523b f5561a;

    /* renamed from: a */
    public static C1523b m7175a() {
        if (f5561a == null) {
            synchronized (C1523b.class) {
                if (f5561a == null) {
                    f5561a = new C1523b();
                }
            }
        }
        return f5561a;
    }

    /* renamed from: b */
    public C0483d mo6767b(C1489b bVar, Context context, Bundle bundle, Bundle bundle2) {
        C1525d.m7223c(context, bundle);
        C0483d dVar = new C0483d(context, C1525d.m7196a(context, bVar, bundle));
        dVar.mo2657a(true);
        C1525d.m7225c(bVar, dVar, bundle);
        C1525d.m7217b(bVar, dVar, bundle);
        C1525d.m7236g(dVar, bundle);
        C1525d.m7227d(dVar, bundle);
        C1525d.m7201a(context, dVar, bundle);
        C1525d.m7213b(context, dVar, bundle);
        C1525d.m7190a(bVar, dVar);
        C1525d.m7207a(context, bVar, dVar, bundle);
        C1525d.m7232e(dVar, bundle);
        C1525d.m7234f(dVar, bundle);
        C1525d.m7224c(dVar, bundle);
        C1525d.m7202a(context, dVar, bundle, bundle2);
        C1522a.m7173a(context, dVar, bundle);
        C1525d.m7205a(bVar, dVar, bundle);
        C1525d.m7204a(dVar, bundle);
        C1525d.m7237h(dVar, bundle);
        C1525d.m7214b(context, bVar, dVar, bundle);
        C1525d.m7216b(dVar, bundle);
        return dVar;
    }

    /* renamed from: a */
    public Notification mo6664a(C1489b bVar, Context context, Bundle bundle, Bundle bundle2) {
        return mo6767b(bVar, context, bundle, bundle2).mo2644a();
    }
}
