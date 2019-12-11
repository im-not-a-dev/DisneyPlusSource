package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType;

final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<FieldDescriptorType, Object> fields = SmallSortedMap.newFieldMap(16);
    private boolean hasLazyField = false;
    private boolean isImmutable;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1 */
    static /* synthetic */ class C130701 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = new int[FieldType.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = new int[JavaType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0129 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0133 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0014 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x001f }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x002a }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r4 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0035 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0040 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x004b }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r7 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                r6 = 7
                int[] r7 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0056 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                r7 = 8
                int[] r8 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0062 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r8 = 9
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x006e }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x006e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x007a }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x007a }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0086 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x0092 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x009e }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00aa }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00b6 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00c2 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00ce }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch:{ NoSuchFieldError -> 0x00da }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00da }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                $SwitchMap$com$google$protobuf$WireFormat$JavaType = r9
                int[] r9 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x00ed }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00ed }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x00ed }
            L_0x00ed:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x00f7 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0101 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x010b }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x010b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0115 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x011f }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0129 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0133 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x0133 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0133 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0133 }
            L_0x0133:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x013d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x013d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.C130701.<clinit>():void");
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        JavaType getLiteJavaType();

        FieldType getLiteType();

        int getNumber();

        Builder internalMergeFrom(Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
    }

    private Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int computeElementSize(FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    private static int computeElementSizeNoTag(FieldType fieldType, Object obj) {
        switch (C130701.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 10:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 17:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 18:
                if (obj instanceof EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int i = 0;
        if (fieldDescriptorLite.isPacked()) {
            for (Object computeElementSizeNoTag : (List) obj) {
                i += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
            }
            return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeRawVarint32Size(i);
        }
        for (Object computeElementSize : (List) obj) {
            i += computeElementSize(liteType, number, computeElementSize);
        }
        return i;
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    static int getWireFormatForFieldType(FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private void mergeFromField(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object field = getField(fieldDescriptorLite);
            if (field == null) {
                field = new ArrayList();
            }
            for (Object cloneIfMutable : (List) value) {
                ((List) field).add(cloneIfMutable(cloneIfMutable));
            }
            this.fields.put(fieldDescriptorLite, field);
        } else if (fieldDescriptorLite.getLiteJavaType() == JavaType.MESSAGE) {
            Object field2 = getField(fieldDescriptorLite);
            if (field2 == null) {
                this.fields.put(fieldDescriptorLite, cloneIfMutable(value));
                return;
            }
            this.fields.put(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
        } else {
            this.fields.put(fieldDescriptorLite, cloneIfMutable(value));
        }
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z) throws IOException {
        switch (C130701.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                if (z) {
                    return codedInputStream.readStringRequireUtf8();
                }
                return codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void verifyType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x004c
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.C130701.$SwitchMap$com$google$protobuf$WireFormat$JavaType
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003c;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0041
        L_0x0014:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField
            if (r2 == 0) goto L_0x0041
        L_0x001c:
            r1 = 1
            goto L_0x0041
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            if (r2 == 0) goto L_0x0041
            goto L_0x001c
        L_0x0027:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0041
            goto L_0x001c
        L_0x0030:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0041
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0041
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0041
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0041
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0041
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.verifyType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    private static void writeElement(CodedOutputStream codedOutputStream, FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
        writeElementNoTag(codedOutputStream, fieldType, obj);
    }

    private static void writeElementNoTag(CodedOutputStream codedOutputStream, FieldType fieldType, Object obj) throws IOException {
        switch (C130701.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeStringNoTag((String) obj);
                return;
            case 10:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 17:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 18:
                if (obj instanceof EnumLite) {
                    codedOutputStream.writeEnumNoTag(((EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object computeElementSizeNoTag : list) {
                    i += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
                }
                codedOutputStream.writeRawVarint32(i);
                for (Object writeElementNoTag : list) {
                    writeElementNoTag(codedOutputStream, liteType, writeElementNoTag);
                }
                return;
            }
            for (Object writeElement : list) {
                writeElement(codedOutputStream, liteType, number, writeElement);
            }
        } else if (obj instanceof LazyField) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public void addRepeatedField(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.isRepeated()) {
            verifyType(fielddescriptortype.getLiteType(), obj);
            Object field = getField(fielddescriptortype);
            if (field == null) {
                list = new ArrayList();
                this.fields.put(fielddescriptortype, list);
            } else {
                list = (List) field;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public Object getField(FieldDescriptorType fielddescriptortype) {
        Object obj = this.fields.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public Object getRepeatedField(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.isRepeated()) {
            Object field = getField(fielddescriptortype);
            if (field != null) {
                return ((List) field).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            Object field = getField(fielddescriptortype);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Entry arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry entry : this.fields.getOverflowEntries()) {
            i += computeFieldSize((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public boolean hasField(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.fields.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        for (Entry isInitialized : this.fields.getOverflowEntries()) {
            if (!isInitialized(isInitialized)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        if (this.hasLazyField) {
            return new LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (!this.isImmutable) {
            this.fields.makeImmutable();
            this.isImmutable = true;
        }
    }

    public void mergeFrom(FieldSet<FieldDescriptorType> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        for (Entry mergeFromField : fieldSet.fields.getOverflowEntries()) {
            mergeFromField(mergeFromField);
        }
    }

    public void setField(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            verifyType(fielddescriptortype.getLiteType(), obj);
            r5 = obj;
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object verifyType : arrayList) {
                verifyType(fielddescriptortype.getLiteType(), verifyType);
            }
            r5 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r5 instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(fielddescriptortype, r5);
    }

    public FieldSet<FieldDescriptorType> clone() {
        FieldSet<FieldDescriptorType> newFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Entry arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private FieldSet(boolean z) {
        makeImmutable();
    }

    private boolean isInitialized(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (MessageLite isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLite) {
                    if (!((MessageLite) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof LazyField) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }
}
