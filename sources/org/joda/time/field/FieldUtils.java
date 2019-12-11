package org.joda.time.field;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i, int i2, int i3, int i4) {
        return getWrappedValue(i + i2, i3, i4);
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The calculation caused an overflow: ");
        sb.append(i);
        sb.append(" + ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long safeDivide(long j, long j2) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return j / j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" / ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeMultiply(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows an int: ");
        sb.append(i);
        sb.append(" * ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeMultiplyToInt(long j, long j2) {
        return safeToInt(safeMultiply(j, j2));
    }

    public static int safeNegate(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The calculation caused an overflow: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static int safeToInt(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value cannot fit in an int: ");
        sb.append(j);
        throw new ArithmeticException(sb.toString());
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeField.getType(), (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }

    public static int getWrappedValue(int i, int i2, int i3) {
        if (i2 < i3) {
            int i4 = (i3 - i2) + 1;
            int i5 = i - i2;
            if (i5 >= 0) {
                return (i5 % i4) + i2;
            }
            int i6 = (-i5) % i4;
            return i6 == 0 ? i2 + 0 : (i4 - i6) + i2;
        }
        throw new IllegalArgumentException("MIN > MAX");
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The calculation caused an overflow: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static long safeMultiply(long j, int i) {
        String str = " * ";
        String str2 = "Multiplication overflows a long: ";
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(j);
            sb.append(str);
            sb.append(i);
            throw new ArithmeticException(sb.toString());
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(j);
            sb2.append(str);
            sb2.append(i);
            throw new ArithmeticException(sb2.toString());
        }
    }

    public static long safeDivide(long j, long j2, RoundingMode roundingMode) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return new BigDecimal(j).divide(new BigDecimal(j2), roundingMode).longValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" / ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }

    public static long safeMultiply(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static void verifyValueBounds(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(str, (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }
}
