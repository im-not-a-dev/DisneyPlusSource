package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;

/* compiled from: protoTypeTableUtil.kt */
public final class ProtoTypeTableUtilKt {
    public static final Type abbreviatedType(Type type, TypeTable typeTable) {
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final Type expandedType(TypeAlias typeAlias, TypeTable typeTable) {
        if (typeAlias.hasExpandedType()) {
            Type expandedType = typeAlias.getExpandedType();
            C12880j.m40222a((Object) expandedType, "expandedType");
            return expandedType;
        } else if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final Type flexibleUpperBound(Type type, TypeTable typeTable) {
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(Function function) {
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final Type outerType(Type type, TypeTable typeTable) {
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    public static final Type receiverType(Function function, TypeTable typeTable) {
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final Type returnType(Function function, TypeTable typeTable) {
        if (function.hasReturnType()) {
            Type returnType = function.getReturnType();
            C12880j.m40222a((Object) returnType, "returnType");
            return returnType;
        } else if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    public static final List<Type> supertypes(Class classR, TypeTable typeTable) {
        List<Type> supertypeList = classR.getSupertypeList();
        if (!(!supertypeList.isEmpty())) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = classR.getSupertypeIdList();
            C12880j.m40222a((Object) supertypeIdList, "supertypeIdList");
            supertypeList = new ArrayList<>(C13187p.m40525a((Iterable) supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                C12880j.m40222a((Object) num, "it");
                supertypeList.add(typeTable.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final Type type(Argument argument, TypeTable typeTable) {
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final Type underlyingType(TypeAlias typeAlias, TypeTable typeTable) {
        if (typeAlias.hasUnderlyingType()) {
            Type underlyingType = typeAlias.getUnderlyingType();
            C12880j.m40222a((Object) underlyingType, "underlyingType");
            return underlyingType;
        } else if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final List<Type> upperBounds(TypeParameter typeParameter, TypeTable typeTable) {
        List<Type> upperBoundList = typeParameter.getUpperBoundList();
        if (!(!upperBoundList.isEmpty())) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            C12880j.m40222a((Object) upperBoundIdList, "upperBoundIdList");
            upperBoundList = new ArrayList<>(C13187p.m40525a((Iterable) upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                C12880j.m40222a((Object) num, "it");
                upperBoundList.add(typeTable.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final Type varargElementType(ValueParameter valueParameter, TypeTable typeTable) {
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(Property property) {
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final Type receiverType(Property property, TypeTable typeTable) {
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final Type type(ValueParameter valueParameter, TypeTable typeTable) {
        if (valueParameter.hasType()) {
            Type type = valueParameter.getType();
            C12880j.m40222a((Object) type, "type");
            return type;
        } else if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    public static final Type returnType(Property property, TypeTable typeTable) {
        if (property.hasReturnType()) {
            Type returnType = property.getReturnType();
            C12880j.m40222a((Object) returnType, "returnType");
            return returnType;
        } else if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }
}
