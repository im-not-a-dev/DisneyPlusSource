package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.p590y.C13180m;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;

/* compiled from: TypeTable.kt */
public final class TypeTable {
    private final List<Type> types;

    public TypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
        List<Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List typeList2 = typeTable.getTypeList();
            C12880j.m40222a((Object) typeList2, "typeTable.typeList");
            List<Type> arrayList = new ArrayList<>(C13187p.m40525a((Iterable) typeList2, 10));
            int i = 0;
            for (Object next : typeList2) {
                int i2 = i + 1;
                if (i >= 0) {
                    Type type = (Type) next;
                    if (i >= firstNullable) {
                        type = type.toBuilder().setNullable(true).build();
                    }
                    arrayList.add(type);
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
            typeList = arrayList;
        } else {
            C12880j.m40222a((Object) typeList, "originalTypes");
        }
        this.types = typeList;
    }

    public final Type get(int i) {
        return (Type) this.types.get(i);
    }
}
