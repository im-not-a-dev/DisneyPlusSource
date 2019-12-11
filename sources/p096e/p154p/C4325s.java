package p096e.p154p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.p.s */
/* compiled from: TransitionValues */
public class C4325s {

    /* renamed from: a */
    public final Map<String, Object> f10769a = new HashMap();

    /* renamed from: b */
    public View f10770b;

    /* renamed from: c */
    final ArrayList<C4309m> f10771c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof C4325s) {
            C4325s sVar = (C4325s) obj;
            if (this.f10770b == sVar.f10770b && this.f10769a.equals(sVar.f10769a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f10770b.hashCode() * 31) + this.f10769a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f10770b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.f10769a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.f10769a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
