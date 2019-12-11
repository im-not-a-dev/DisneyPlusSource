package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: androidx.work.impl.utils.c */
/* compiled from: IdGenerator */
public class C1136c {

    /* renamed from: a */
    private final Context f4332a;

    /* renamed from: b */
    private SharedPreferences f4333b;

    /* renamed from: c */
    private boolean f4334c;

    public C1136c(Context context) {
        this.f4332a = context;
    }

    /* renamed from: b */
    private void m5913b() {
        if (!this.f4334c) {
            this.f4333b = this.f4332a.getSharedPreferences("androidx.work.util.id", 0);
            this.f4334c = true;
        }
    }

    /* renamed from: a */
    public int mo5905a(int i, int i2) {
        synchronized (C1136c.class) {
            m5913b();
            int a = m5911a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            m5912a("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    /* renamed from: a */
    public int mo5904a() {
        int a;
        synchronized (C1136c.class) {
            m5913b();
            a = m5911a("next_alarm_manager_id");
        }
        return a;
    }

    /* renamed from: a */
    private int m5911a(String str) {
        int i = 0;
        int i2 = this.f4333b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        m5912a(str, i);
        return i2;
    }

    /* renamed from: a */
    private void m5912a(String str, int i) {
        this.f4333b.edit().putInt(str, i).apply();
    }
}
