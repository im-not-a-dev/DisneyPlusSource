package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0418a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* compiled from: Key */
public abstract class C0321d {

    /* renamed from: e */
    public static int f1442e = -1;

    /* renamed from: a */
    int f1443a;

    /* renamed from: b */
    int f1444b;

    /* renamed from: c */
    String f1445c = null;

    /* renamed from: d */
    HashMap<String, C0418a> f1446d;

    public C0321d() {
        int i = f1442e;
        this.f1443a = i;
        this.f1444b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo2192a(Context context, AttributeSet attributeSet);

    /* renamed from: a */
    public abstract void mo2193a(HashMap<String, C0363u> hashMap);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo2194a(HashSet<String> hashSet);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2195a(String str) {
        String str2 = this.f1445c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: b */
    public void mo2196b(HashMap<String, Integer> hashMap) {
    }
}
