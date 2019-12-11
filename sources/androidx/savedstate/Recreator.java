package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0714h;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.savedstate.SavedStateRegistry.C0954a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C0714h {

    /* renamed from: c */
    private final C0957b f3781c;

    Recreator(C0957b bVar) {
        this.f3781c = bVar;
    }

    /* renamed from: a */
    public void mo330a(C0722m mVar, C0716a aVar) {
        if (aVar == C0716a.ON_CREATE) {
            mVar.getLifecycle().mo4135b(this);
            Bundle a = this.f3781c.getSavedStateRegistry().mo5295a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m5170a((String) it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    /* renamed from: a */
    private void m5170a(String str) {
        try {
            Class asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0954a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((C0954a) declaredConstructor.newInstance(new Object[0])).mo5300a(this.f3781c);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e3);
        }
    }
}
