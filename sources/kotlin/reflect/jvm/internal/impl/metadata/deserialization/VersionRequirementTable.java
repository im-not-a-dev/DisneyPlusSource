package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement;

/* compiled from: VersionRequirement.kt */
public final class VersionRequirementTable {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final VersionRequirementTable EMPTY = new VersionRequirementTable(C13185o.m40513a());
    private final List<VersionRequirement> infos;

    /* compiled from: VersionRequirement.kt */
    public static final class Companion {
        private Companion() {
        }

        public final VersionRequirementTable create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable) {
            if (versionRequirementTable.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List requirementList = versionRequirementTable.getRequirementList();
            C12880j.m40222a((Object) requirementList, "table.requirementList");
            return new VersionRequirementTable(requirementList, null);
        }

        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private VersionRequirementTable(List<VersionRequirement> list) {
        this.infos = list;
    }

    public final VersionRequirement get(int i) {
        return (VersionRequirement) C13199w.m40578d((List) this.infos, i);
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
