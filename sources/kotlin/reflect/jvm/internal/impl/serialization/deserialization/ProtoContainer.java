package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: ProtoContainer.kt */
public abstract class ProtoContainer {
    private final NameResolver nameResolver;
    private final SourceElement source;
    private final TypeTable typeTable;

    /* compiled from: ProtoContainer.kt */
    public static final class Class extends ProtoContainer {
        private final ClassId classId;
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto;
        private final boolean isInner;
        private final Kind kind;
        private final Class outerClass;

        public Class(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classR, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class classR2) {
            super(nameResolver, typeTable, sourceElement, null);
            this.classProto = classR;
            this.outerClass = classR2;
            this.classId = NameResolverUtilKt.getClassId(nameResolver, this.classProto.getFqName());
            Kind kind2 = (Kind) Flags.CLASS_KIND.get(this.classProto.getFlags());
            if (kind2 == null) {
                kind2 = Kind.CLASS;
            }
            this.kind = kind2;
            Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
            C12880j.m40222a((Object) bool, "Flags.IS_INNER.get(classProto.flags)");
            this.isInner = bool.booleanValue();
        }

        public FqName debugFqName() {
            FqName asSingleFqName = this.classId.asSingleFqName();
            C12880j.m40222a((Object) asSingleFqName, "classId.asSingleFqName()");
            return asSingleFqName;
        }

        public final ClassId getClassId() {
            return this.classId;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        public final Kind getKind() {
            return this.kind;
        }

        public final Class getOuterClass() {
            return this.outerClass;
        }

        public final boolean isInner() {
            return this.isInner;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class Package extends ProtoContainer {
        private final FqName fqName;

        public Package(FqName fqName2, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            this.fqName = fqName2;
        }

        public FqName debugFqName() {
            return this.fqName;
        }
    }

    private ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement) {
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.source = sourceElement;
    }

    public abstract FqName debugFqName();

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final SourceElement getSource() {
        return this.source;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(debugFqName());
        return sb.toString();
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver2, typeTable2, sourceElement);
    }
}
