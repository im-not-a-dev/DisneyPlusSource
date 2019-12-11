package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;

/* compiled from: NameResolverImpl.kt */
public final class NameResolverImpl implements NameResolver {
    private final QualifiedNameTable qualifiedNames;
    private final StringTable strings;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.CLASS.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.PACKAGE.ordinal()] = 2;
            $EnumSwitchMapping$0[Kind.LOCAL.ordinal()] = 3;
        }
    }

    public NameResolverImpl(StringTable stringTable, QualifiedNameTable qualifiedNameTable) {
        this.strings = stringTable;
        this.qualifiedNames = qualifiedNameTable;
    }

    private final Triple<List<String>, List<String>, Boolean> traverseIds(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i);
            StringTable stringTable = this.strings;
            C12880j.m40222a((Object) qualifiedName, "proto");
            String string = stringTable.getString(qualifiedName.getShortName());
            Kind kind = qualifiedName.getKind();
            if (kind != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
                if (i2 == 1) {
                    linkedList2.addFirst(string);
                } else if (i2 == 2) {
                    linkedList.addFirst(string);
                } else if (i2 == 3) {
                    linkedList2.addFirst(string);
                    z = true;
                }
                i = qualifiedName.getParentQualifiedName();
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public String getQualifiedClassName(int i) {
        Triple traverseIds = traverseIds(i);
        List list = (List) traverseIds.mo31020a();
        String a = C13199w.m40559a((List) traverseIds.mo31021b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C13199w.m40559a(list, "/", null, null, 0, null, null, 62, null));
        sb.append('/');
        sb.append(a);
        return sb.toString();
    }

    public String getString(int i) {
        String string = this.strings.getString(i);
        C12880j.m40222a((Object) string, "strings.getString(index)");
        return string;
    }

    public boolean isLocalClassName(int i) {
        return ((Boolean) traverseIds(i).mo31026f()).booleanValue();
    }
}
