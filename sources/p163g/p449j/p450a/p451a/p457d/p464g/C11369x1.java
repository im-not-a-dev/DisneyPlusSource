package p163g.p449j.p450a.p451a.p457d.p464g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g.j.a.a.d.g.x1 */
public final class C11369x1 implements C11164j1 {

    /* renamed from: f */
    static final Map<String, C11369x1> f26596f = new HashMap();

    /* renamed from: a */
    private final SharedPreferences f26597a;

    /* renamed from: b */
    private final OnSharedPreferenceChangeListener f26598b = new C11023a2(this);

    /* renamed from: c */
    private final Object f26599c = new Object();

    /* renamed from: d */
    private volatile Map<String, ?> f26600d;

    /* renamed from: e */
    private final List<C11178k1> f26601e = new ArrayList();

    private C11369x1(SharedPreferences sharedPreferences) {
        this.f26597a = sharedPreferences;
        this.f26597a.registerOnSharedPreferenceChangeListener(this.f26598b);
    }

    /* renamed from: a */
    static C11369x1 m36702a(Context context, String str) {
        C11369x1 x1Var;
        SharedPreferences sharedPreferences;
        if (!((!C11122g1.m35237a() || str.startsWith("direct_boot:")) ? true : C11122g1.m35238a(context))) {
            return null;
        }
        synchronized (C11369x1.class) {
            x1Var = (C11369x1) f26596f.get(str);
            if (x1Var == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C11122g1.m35237a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                x1Var = new C11369x1(sharedPreferences);
                f26596f.put(str, x1Var);
            }
        }
        return x1Var;
    }

    /* renamed from: a */
    public final Object mo28505a(String str) {
        Map<String, ?> map = this.f26600d;
        if (map == null) {
            synchronized (this.f26599c) {
                map = this.f26600d;
                if (map == null) {
                    map = this.f26597a.getAll();
                    this.f26600d = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29145a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f26599c) {
            this.f26600d = null;
            C11283r1.m36018c();
        }
        synchronized (this) {
            for (C11178k1 a : this.f26601e) {
                a.mo28618a();
            }
        }
    }
}
