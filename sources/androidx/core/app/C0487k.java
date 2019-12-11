package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0478i.C0479a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.core.app.k */
/* compiled from: NotificationCompatJellybean */
class C0487k {

    /* renamed from: a */
    private static final Object f2179a = new Object();

    /* renamed from: b */
    private static Field f2180b;

    /* renamed from: c */
    private static boolean f2181c;

    /* renamed from: a */
    public static SparseArray<Bundle> m2607a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m2604a(Notification notification) {
        synchronized (f2179a) {
            if (f2181c) {
                return null;
            }
            try {
                if (f2180b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2181c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2180b = declaredField;
                }
                Bundle bundle = (Bundle) f2180b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2180b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f2181c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f2181c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2603a(Builder builder, C0479a aVar) {
        builder.addAction(aVar.mo2629e(), aVar.mo2633i(), aVar.mo2625a());
        Bundle bundle = new Bundle(aVar.mo2628d());
        if (aVar.mo2630f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2608a(aVar.mo2630f()));
        }
        if (aVar.mo2627c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2608a(aVar.mo2627c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2626b());
        return bundle;
    }

    /* renamed from: a */
    static Bundle m2605a(C0479a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.mo2629e());
        bundle2.putCharSequence("title", aVar.mo2633i());
        bundle2.putParcelable("actionIntent", aVar.mo2625a());
        if (aVar.mo2628d() != null) {
            bundle = new Bundle(aVar.mo2628d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2626b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2608a(aVar.mo2630f()));
        bundle2.putBoolean("showsUserInterface", aVar.mo2632h());
        bundle2.putInt("semanticAction", aVar.mo2631g());
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m2606a(C0488l lVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", lVar.mo2693f());
        bundle.putCharSequence("label", lVar.mo2692e());
        bundle.putCharSequenceArray("choices", lVar.mo2690c());
        bundle.putBoolean("allowFreeFormInput", lVar.mo2688a());
        bundle.putBundle("extras", lVar.mo2691d());
        Set<String> b = lVar.mo2689b();
        if (b != null && !b.isEmpty()) {
            ArrayList arrayList = new ArrayList(b.size());
            for (String add : b) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle[] m2608a(C0488l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            bundleArr[i] = m2606a(lVarArr[i]);
        }
        return bundleArr;
    }
}
