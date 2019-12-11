package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C1034h;

/* renamed from: androidx.work.impl.utils.d */
/* compiled from: PackageManagerHelper */
public class C1137d {

    /* renamed from: a */
    private static final String f4335a = C1034h.m5551a("PackageManagerHelper");

    /* renamed from: a */
    public static void m5916a(Context context, Class cls, boolean z) {
        String str = "enabled";
        String str2 = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1034h a = C1034h.m5550a();
            String str3 = f4335a;
            String str4 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : str2;
            a.mo5697a(str3, String.format(str4, objArr), new Throwable[0]);
        } catch (Exception e) {
            C1034h a2 = C1034h.m5550a();
            String str5 = f4335a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = str2;
            }
            objArr2[1] = str;
            a2.mo5697a(str5, String.format("%s could not be %s", objArr2), e);
        }
    }
}
