package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: f.a.j3 */
public class C4480j3 {

    /* renamed from: a */
    private static final String f11114a = C1557c.m7461a(C4480j3.class);

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum m15505a(String str, Class<TargetEnum> cls) {
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    public static Set<String> m15507a(EnumSet enumSet) {
        HashSet hashSet = new HashSet();
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toString());
        }
        return hashSet;
    }

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> m15506a(Class<TargetEnum> cls, Set<String> set) {
        EnumSet<TargetEnum> noneOf = EnumSet.noneOf(cls);
        for (String str : set) {
            try {
                noneOf.add(m15505a(str.toUpperCase(Locale.US), cls));
            } catch (Exception unused) {
                String str2 = f11114a;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create valid device key enum from string: ");
                sb.append(str);
                C1557c.m7465b(str2, sb.toString());
            }
        }
        return noneOf;
    }
}
