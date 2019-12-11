package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Map;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;

/* compiled from: ClassMapperLite.kt */
final class ClassMapperLite$map$1$1 extends C12881k implements Function2<String, String, C13145v> {
    final /* synthetic */ Map $this_apply;

    ClassMapperLite$map$1$1(Map map) {
        this.$this_apply = map;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C13145v.f29587a;
    }

    public final void invoke(String str, String str2) {
        Map map = this.$this_apply;
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin/");
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append('L');
        sb3.append(str2);
        sb3.append(';');
        map.put(sb2, sb3.toString());
    }
}
