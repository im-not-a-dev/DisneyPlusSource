package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* compiled from: Jsr305State.kt */
final class Jsr305State$description$2 extends C12881k implements Function0<String[]> {
    final /* synthetic */ Jsr305State this$0;

    Jsr305State$description$2(Jsr305State jsr305State) {
        this.this$0 = jsr305State;
        super(0);
    }

    public final String[] invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.this$0.getGlobal().getDescription());
        ReportLevel migration = this.this$0.getMigration();
        if (migration != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("under-migration:");
            sb.append(migration.getDescription());
            arrayList.add(sb.toString());
        }
        for (Entry entry : this.this$0.getUser().entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append((String) entry.getKey());
            sb2.append(':');
            sb2.append(((ReportLevel) entry.getValue()).getDescription());
            arrayList.add(sb2.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
