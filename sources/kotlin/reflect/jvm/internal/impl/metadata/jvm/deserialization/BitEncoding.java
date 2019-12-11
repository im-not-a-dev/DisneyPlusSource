package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

public class BitEncoding {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean FORCE_8TO7_ENCODING;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = str2;
        } else {
            objArr[0] = "data";
        }
        String str3 = "dropMarker";
        String str4 = "decodeBytes";
        String str5 = "splitBytesToStringArray";
        String str6 = "encode8to7";
        String str7 = "encodeBytes";
        if (i2 == 1) {
            objArr[1] = str7;
        } else if (i2 == 3) {
            objArr[1] = str6;
        } else if (i2 == 6) {
            objArr[1] = str5;
        } else if (i2 == 8) {
            objArr[1] = str4;
        } else if (i2 == 10) {
            objArr[1] = str3;
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = str2;
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = str6;
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = str5;
                break;
            case 7:
                objArr[2] = str4;
                break;
            case 9:
                objArr[2] = str3;
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = str7;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        FORCE_8TO7_ENCODING = "true".equals(str);
    }

    private BitEncoding() {
    }

    private static void addModuloByte(byte[] bArr, int i) {
        if (bArr == null) {
            $$$reportNull$$$0(4);
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    private static byte[] combineStringArrayIntoBytes(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(11);
        }
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int length2 = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str = strArr[i2];
            int length3 = str.length();
            int i4 = i3;
            int i5 = 0;
            while (i5 < length3) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) str.charAt(i5);
                i5++;
                i4 = i6;
            }
            i2++;
            i3 = i4;
        }
        return bArr;
    }

    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 32
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] decode7to8(byte[] r11) {
        /*
            if (r11 != 0) goto L_0x0007
            r0 = 13
            $$$reportNull$$$0(r0)
        L_0x0007:
            int r0 = r11.length
            int r0 = r0 * 7
            int r0 = r0 / 8
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0012:
            if (r3 >= r0) goto L_0x0036
            byte r6 = r11[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 >>> r5
            r7 = 1
            int r4 = r4 + r7
            byte r8 = r11[r4]
            int r9 = r5 + 1
            int r10 = r7 << r9
            int r10 = r10 - r7
            r7 = r8 & r10
            int r8 = 7 - r5
            int r7 = r7 << r8
            int r6 = r6 + r7
            byte r6 = (byte) r6
            r1[r3] = r6
            r6 = 6
            if (r5 != r6) goto L_0x0032
            int r4 = r4 + 1
            r5 = 0
            goto L_0x0033
        L_0x0032:
            r5 = r9
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decode7to8(byte[]):byte[]");
    }

    public static byte[] decodeBytes(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] stringsToBytes = UtfEncodingKt.stringsToBytes(dropMarker(strArr));
                if (stringsToBytes == null) {
                    $$$reportNull$$$0(8);
                }
                return stringsToBytes;
            } else if (charAt == 65535) {
                strArr = dropMarker(strArr);
            }
        }
        byte[] combineStringArrayIntoBytes = combineStringArrayIntoBytes(strArr);
        addModuloByte(combineStringArrayIntoBytes, 127);
        return decode7to8(combineStringArrayIntoBytes);
    }

    private static String[] dropMarker(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        if (strArr2 == null) {
            $$$reportNull$$$0(10);
        }
        return strArr2;
    }
}
