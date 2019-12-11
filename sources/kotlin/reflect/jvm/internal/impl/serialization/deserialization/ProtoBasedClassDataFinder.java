package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: ProtoBasedClassDataFinder.kt */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {
    private final Map<ClassId, Class> classIdToProto;
    private final Function1<ClassId, SourceElement> classSource;
    private final BinaryVersion metadataVersion;
    private final NameResolver nameResolver;

    public ProtoBasedClassDataFinder(PackageFragment packageFragment, NameResolver nameResolver2, BinaryVersion binaryVersion, Function1<? super ClassId, ? extends SourceElement> function1) {
        this.nameResolver = nameResolver2;
        this.metadataVersion = binaryVersion;
        this.classSource = function1;
        List class_List = packageFragment.getClass_List();
        C12880j.m40222a((Object) class_List, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) class_List, 10)), 16));
        for (Object next : class_List) {
            Class classR = (Class) next;
            NameResolver nameResolver3 = this.nameResolver;
            C12880j.m40222a((Object) classR, "klass");
            linkedHashMap.put(NameResolverUtilKt.getClassId(nameResolver3, classR.getFqName()), next);
        }
        this.classIdToProto = linkedHashMap;
    }

    public ClassData findClassData(ClassId classId) {
        Class classR = (Class) this.classIdToProto.get(classId);
        if (classR != null) {
            return new ClassData(this.nameResolver, classR, this.metadataVersion, (SourceElement) this.classSource.invoke(classId));
        }
        return null;
    }

    public final Collection<ClassId> getAllClassIds() {
        return this.classIdToProto.keySet();
    }
}
