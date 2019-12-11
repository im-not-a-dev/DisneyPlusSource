package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13152b0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation;

/* compiled from: JvmNameResolver.kt */
public final class JvmNameResolver implements NameResolver {
    public static final Companion Companion = new Companion(null);
    private static final List<String> PREDEFINED_STRINGS = C13185o.m40520c("kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator");
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;
    private final Set<Integer> localNameIndices;
    private final List<Record> records;
    private final String[] strings;
    private final StringTableTypes types;

    /* compiled from: JvmNameResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Operation.values().length];

        static {
            $EnumSwitchMapping$0[Operation.NONE.ordinal()] = 1;
            $EnumSwitchMapping$0[Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            $EnumSwitchMapping$0[Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
        }
    }

    static {
        Iterable<C13152b0> u = C13199w.m40610u(PREDEFINED_STRINGS);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) u, 10)), 16));
        for (C13152b0 b0Var : u) {
            linkedHashMap.put((String) b0Var.mo34197d(), Integer.valueOf(b0Var.mo34196c()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public JvmNameResolver(StringTableTypes stringTableTypes, String[] strArr) {
        this.types = stringTableTypes;
        this.strings = strArr;
        List localNameList = this.types.getLocalNameList();
        this.localNameIndices = localNameList.isEmpty() ? C13188p0.m40531a() : C13199w.m40609t(localNameList);
        ArrayList arrayList = new ArrayList();
        List<Record> recordList = this.types.getRecordList();
        arrayList.ensureCapacity(recordList.size());
        for (Record record : recordList) {
            Intrinsics.checkReturnedValueIsNotNull((Object) record, "record");
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        this.records = arrayList;
    }

    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    public String getString(int i) {
        String str;
        int i2 = i;
        Record record = (Record) this.records.get(i2);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                int size = PREDEFINED_STRINGS.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && size > predefinedIndex) {
                    str = (String) PREDEFINED_STRINGS.get(record.getPredefinedIndex());
                }
            }
            str = this.strings[i2];
        }
        String str2 = "null cannot be cast to non-null type java.lang.String";
        String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        String str4 = "string";
        if (record.getSubstringIndexCount() >= 2) {
            List substringIndexList = record.getSubstringIndexList();
            Integer num = (Integer) substringIndexList.get(0);
            Integer num2 = (Integer) substringIndexList.get(1);
            Intrinsics.checkReturnedValueIsNotNull((Object) num, "begin");
            if (Intrinsics.compare(0, num.intValue()) <= 0) {
                int intValue = num.intValue();
                Intrinsics.checkReturnedValueIsNotNull((Object) num2, "end");
                if (Intrinsics.compare(intValue, num2.intValue()) <= 0 && Intrinsics.compare(num2.intValue(), str.length()) <= 0) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) str, str4);
                    int intValue2 = num.intValue();
                    int intValue3 = num2.intValue();
                    if (str != null) {
                        str = str.substring(intValue2, intValue3);
                        Intrinsics.checkReturnedValueIsNotNull((Object) str, str3);
                    } else {
                        throw new C13142s(str2);
                    }
                }
            }
        }
        String str5 = str;
        if (record.getReplaceCharCount() >= 2) {
            List replaceCharList = record.getReplaceCharList();
            Integer num3 = (Integer) replaceCharList.get(0);
            Integer num4 = (Integer) replaceCharList.get(1);
            Intrinsics.checkReturnedValueIsNotNull((Object) str5, str4);
            str5 = C12832w.m40115a(str5, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        String str6 = str5;
        Operation operation = record.getOperation();
        if (operation == null) {
            operation = Operation.NONE;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                Intrinsics.checkReturnedValueIsNotNull((Object) str6, str4);
                str6 = C12832w.m40115a(str6, '$', '.', false, 4, (Object) null);
            } else if (i3 == 3) {
                if (str6.length() >= 2) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) str6, str4);
                    int length = str6.length() - 1;
                    if (str6 != null) {
                        str6 = str6.substring(1, length);
                        Intrinsics.checkReturnedValueIsNotNull((Object) str6, str3);
                    } else {
                        throw new C13142s(str2);
                    }
                }
                String str7 = str6;
                Intrinsics.checkReturnedValueIsNotNull((Object) str7, str4);
                str6 = C12832w.m40115a(str7, '$', '.', false, 4, (Object) null);
            }
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) str6, str4);
        return str6;
    }

    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }
}
