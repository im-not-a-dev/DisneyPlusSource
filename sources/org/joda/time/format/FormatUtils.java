package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i, int i2) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j) {
        int i = 1;
        if (j >= 0) {
            if (j >= 10) {
                i = j < 100 ? 2 : j < 1000 ? 3 : j < 10000 ? 4 : 1 + ((int) (Math.log((double) j) / LOG_10));
            }
            return i;
        } else if (j != Long.MIN_VALUE) {
            return calculateDigitCount(-j) + 1;
        } else {
            return 20;
        }
    }

    static String createErrorMessage(String str, int i) {
        String str2;
        int i2 = i + 32;
        if (str.length() <= i2 + 3) {
            str2 = str;
        } else {
            str2 = str.substring(0, i2).concat("...");
        }
        String str3 = "Invalid format: \"";
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str2);
            sb.append('\"');
            return sb.toString();
        } else if (i >= str.length()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str2);
            sb2.append("\" is too short");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str2);
            sb3.append("\" is malformed at \"");
            sb3.append(str2.substring(i));
            sb3.append('\"');
            return sb3.toString();
        }
    }

    static int parseTwoDigits(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int i2) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    writer.write(48);
                    i2--;
                }
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i + 48);
        } else if (i < 100) {
            while (i2 > 2) {
                writer.write(48);
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            writer.write(i3 + 48);
            writer.write(((i - (i3 << 3)) - (i3 << 1)) + 48);
        } else {
            int i4 = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / LOG_10)) + 1;
            while (i2 > i4) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            writer.write(i + 48);
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        } else {
            writer.write(Integer.toString(i));
        }
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int i2) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
        } else {
            int i4 = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / LOG_10)) + 1;
            while (i2 > i4) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            appendable.append(Integer.toString(i));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            writeUnpaddedInteger(writer, i);
        } else {
            writer.write(Long.toString(j));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            appendUnpaddedInteger(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    public static void writePaddedInteger(Writer writer, long j, int i) throws IOException {
        int i2 = (int) j;
        if (((long) i2) == j) {
            writePaddedInteger(writer, i2, i);
        } else if (i <= 19) {
            writer.write(Long.toString(j));
        } else {
            if (j < 0) {
                writer.write(45);
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    while (i > 19) {
                        writer.write(48);
                        i--;
                    }
                    writer.write("9223372036854775808");
                    return;
                }
            }
            int log = ((int) (Math.log((double) j) / LOG_10)) + 1;
            while (i > log) {
                writer.write(48);
                i--;
            }
            writer.write(Long.toString(j));
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j, int i) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j, i);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j, int i) throws IOException {
        int i2 = (int) j;
        if (((long) i2) == j) {
            appendPaddedInteger(appendable, i2, i);
        } else if (i <= 19) {
            appendable.append(Long.toString(j));
        } else {
            if (j < 0) {
                appendable.append('-');
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    while (i > 19) {
                        appendable.append('0');
                        i--;
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
            }
            int log = ((int) (Math.log((double) j) / LOG_10)) + 1;
            while (i > log) {
                appendable.append('0');
                i--;
            }
            appendable.append(Long.toString(j));
        }
    }
}
