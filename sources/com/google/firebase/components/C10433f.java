package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class C10433f<T> {

    /* renamed from: a */
    private final T f24762a;

    /* renamed from: b */
    private final C10436c<T> f24763b;

    /* renamed from: com.google.firebase.components.f$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C10435b implements C10436c<Context> {
        private C10435b() {
        }

        /* renamed from: b */
        private static Bundle m32984b(Context context) {
            String str = "ComponentDiscovery";
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(str, "ComponentDiscoveryService has no service info.");
                return null;
            } catch (NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public List<String> mo27237a(Context context) {
            Bundle b = m32984b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.f$c */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    interface C10436c<T> {
        /* renamed from: a */
        List<String> mo27237a(T t);
    }

    C10433f(T t, C10436c<T> cVar) {
        this.f24762a = t;
        this.f24763b = cVar;
    }

    /* renamed from: a */
    public static C10433f<Context> m32981a(Context context) {
        return new C10433f<>(context, new C10435b());
    }

    /* renamed from: a */
    public List<C10438h> mo27235a() {
        return m32982a(this.f24763b.mo27237a(this.f24762a));
    }

    /* renamed from: a */
    private static List<C10438h> m32982a(List<String> list) {
        String str = "Could not instantiate %s";
        String str2 = "Could not instantiate %s.";
        String str3 = "ComponentDiscovery";
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            try {
                Class cls = Class.forName(str4);
                if (!C10438h.class.isAssignableFrom(cls)) {
                    Log.w(str3, String.format("Class %s is not an instance of %s", new Object[]{str4, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((C10438h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                Log.w(str3, String.format("Class %s is not an found.", new Object[]{str4}), e);
            } catch (IllegalAccessException e2) {
                Log.w(str3, String.format(str2, new Object[]{str4}), e2);
            } catch (InstantiationException e3) {
                Log.w(str3, String.format(str2, new Object[]{str4}), e3);
            } catch (NoSuchMethodException e4) {
                Log.w(str3, String.format(str, new Object[]{str4}), e4);
            } catch (InvocationTargetException e5) {
                Log.w(str3, String.format(str, new Object[]{str4}), e5);
            }
        }
        return arrayList;
    }
}
