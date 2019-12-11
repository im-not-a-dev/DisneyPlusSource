package p163g.p449j.p450a.p451a.p457d.p464g;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: g.j.a.a.d.g.h7 */
public final class C11142h7 {

    /* renamed from: b */
    private static final Method f26231b = m35272a();

    /* renamed from: c */
    private static final Method f26232c = m35273b();

    /* renamed from: a */
    private final JobScheduler f26233a;

    private C11142h7(JobScheduler jobScheduler) {
        this.f26233a = jobScheduler;
    }

    /* renamed from: a */
    private static Method m35272a() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Method m35273b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m35274c() {
        Method method = f26232c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final int m35270a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f26231b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f26233a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f26233a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m35271a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f26231b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C11142h7(jobScheduler).m35270a(jobInfo, str, m35274c(), str2);
    }
}
