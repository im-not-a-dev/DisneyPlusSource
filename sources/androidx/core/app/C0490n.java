package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p121h.p122j.C4025a;

/* renamed from: androidx.core.app.n */
/* compiled from: TaskStackBuilder */
public final class C0490n implements Iterable<Intent> {

    /* renamed from: U */
    private final Context f2188U;

    /* renamed from: c */
    private final ArrayList<Intent> f2189c = new ArrayList<>();

    /* renamed from: androidx.core.app.n$a */
    /* compiled from: TaskStackBuilder */
    public interface C0491a {
        /* renamed from: c */
        Intent mo438c();
    }

    private C0490n(Context context) {
        this.f2188U = context;
    }

    /* renamed from: a */
    public static C0490n m2621a(Context context) {
        return new C0490n(context);
    }

    /* renamed from: b */
    public void mo2702b() {
        mo2701a((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2189c.iterator();
    }

    /* renamed from: a */
    public C0490n mo2700a(Intent intent) {
        this.f2189c.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0490n mo2698a(Activity activity) {
        Intent c = activity instanceof C0491a ? ((C0491a) activity).mo438c() : null;
        if (c == null) {
            c = C0476g.m2513a(activity);
        }
        if (c != null) {
            ComponentName component = c.getComponent();
            if (component == null) {
                component = c.resolveActivity(this.f2188U.getPackageManager());
            }
            mo2699a(component);
            mo2700a(c);
        }
        return this;
    }

    /* renamed from: a */
    public C0490n mo2699a(ComponentName componentName) {
        int size = this.f2189c.size();
        try {
            Intent a = C0476g.m2514a(this.f2188U, componentName);
            while (a != null) {
                this.f2189c.add(size, a);
                a = C0476g.m2514a(this.f2188U, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public void mo2701a(Bundle bundle) {
        if (!this.f2189c.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2189c;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4025a.m13794a(this.f2188U, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2188U.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
