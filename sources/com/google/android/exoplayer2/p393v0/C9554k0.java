package com.google.android.exoplayer2.p393v0;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.joda.time.DateTimeConstants;

/* renamed from: com.google.android.exoplayer2.v0.k0 */
/* compiled from: Util */
public final class C9554k0 {

    /* renamed from: a */
    public static final int f22281a = VERSION.SDK_INT;

    /* renamed from: b */
    public static final String f22282b = Build.DEVICE;

    /* renamed from: c */
    public static final String f22283c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f22284d = Build.MODEL;

    /* renamed from: e */
    public static final String f22285e;

    /* renamed from: f */
    public static final byte[] f22286f = new byte[0];

    /* renamed from: g */
    private static final Pattern f22287g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f22288h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f22289i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static HashMap<String, String> f22290j;

    /* renamed from: k */
    private static final String[] f22291k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};

    /* renamed from: l */
    private static final int[] f22292l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f22282b);
        String str = ", ";
        sb.append(str);
        sb.append(f22284d);
        sb.append(str);
        sb.append(f22283c);
        sb.append(str);
        sb.append(f22281a);
        f22285e = sb.toString();
    }

    /* renamed from: a */
    public static long m29389a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: a */
    public static <T> T m29394a(T t) {
        return t;
    }

    /* renamed from: a */
    public static boolean m29411a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: a */
    public static <T> T[] m29419a(T[] tArr) {
        return tArr;
    }

    /* renamed from: b */
    public static int m29424b(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static int m29426b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: b */
    public static Looper m29432b() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: c */
    public static int m29438c(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    /* renamed from: c */
    public static long m29439c(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: d */
    public static long m29444d(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: d */
    public static boolean m29445d(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    /* renamed from: d */
    public static byte[] m29447d(String str) {
        return str.getBytes(Charset.forName(Utf8Charset.NAME));
    }

    /* renamed from: e */
    public static ExecutorService m29449e(String str) {
        return Executors.newSingleThreadExecutor(new C9535d(str));
    }

    /* renamed from: e */
    public static boolean m29450e(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: f */
    public static String m29451f(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (f22281a >= 21) {
            replace = m29453g(replace);
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String k = m29457k(str);
        String str2 = m29437b(k, "-")[0];
        if (str2.length() == 3) {
            if (f22290j == null) {
                f22290j = m29402a();
            }
            String str3 = (String) f22290j.get(str2);
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(k.substring(3));
                k = sb.toString();
            }
        }
        return k;
    }

    /* renamed from: f */
    public static boolean m29452f(int i) {
        return i == 10 || i == 13;
    }

    @TargetApi(21)
    /* renamed from: g */
    private static String m29453g(String str) {
        return Locale.forLanguageTag(str).toLanguageTag();
    }

    /* renamed from: h */
    public static long m29454h(String str) throws C8723g0 {
        Matcher matcher = f22287g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder sb = new StringBuilder();
                sb.append("0.");
                sb.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - ((long) (i * DateTimeConstants.MILLIS_PER_MINUTE)) : timeInMillis;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid date/time format: ");
        sb2.append(str);
        throw new C8723g0(sb2.toString());
    }

    /* renamed from: i */
    public static long m29455i(String str) {
        Matcher matcher = f22288h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? 3600.0d * Double.parseDouble(group4) : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j = (long) ((parseDouble5 + d) * 1000.0d);
        if (isEmpty) {
            j = -j;
        }
        return j;
    }

    /* renamed from: j */
    public static String[] m29456j(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m29423a(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: k */
    public static String m29457k(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: l */
    public static String m29458l(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    /* renamed from: m */
    public static String m29459m(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f22289i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append(str, i, matcher.start());
            sb.append(parseInt);
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb.append(str, i, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m29446d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: a */
    public static boolean m29414a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static String[] m29437b(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: a */
    public static boolean m29415a(Object[] objArr, Object obj) {
        for (Object a : objArr) {
            if (m29414a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static long m29431b(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: d */
    private static String[] m29448d() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f22281a;
        if (i >= 24) {
            return m29436b(configuration);
        }
        if (i >= 21) {
            return m29422a(configuration);
        }
        return new String[]{configuration.locale.toString()};
    }

    /* renamed from: b */
    public static int m29429b(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static <T> void m29409a(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: c */
    public static String[] m29443c() {
        String[] d = m29448d();
        for (int i = 0; i < d.length; i++) {
            d[i] = m29451f(d[i]);
        }
        return d;
    }

    /* renamed from: b */
    public static long m29430b(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* renamed from: a */
    public static <T> T[] m29420a(T[] tArr, int i) {
        C9537e.m29299a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: b */
    public static int m29428b(String str) {
        int length = str.length();
        C9537e.m29299a(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: c */
    public static Point m29440c(Context context) {
        return m29391a(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    /* renamed from: a */
    public static <T> T[] m29421a(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    /* renamed from: c */
    private static String m29441c(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read system property ");
            sb.append(str);
            C9563q.m29496a("Util", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m29433b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Handler m29392a(Callback callback) {
        return m29393a(m29432b(), callback);
    }

    /* renamed from: a */
    public static Handler m29393a(Looper looper, Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    static /* synthetic */ Thread m29401a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @TargetApi(23)
    /* renamed from: c */
    private static void m29442c(Display display, Point point) {
        Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: a */
    public static void m29405a(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29406a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m29412a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static int m29425b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 * 2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 * 4;
    }

    /* renamed from: a */
    public static void m29403a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    private static <T extends Throwable> void m29435b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static String m29399a(byte[] bArr) {
        return new String(bArr, Charset.forName(Utf8Charset.NAME));
    }

    /* renamed from: b */
    public static int m29427b(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m29383a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: a */
    public static String m29400a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName(Utf8Charset.NAME));
    }

    /* renamed from: a */
    public static String[] m29423a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: a */
    public static String m29397a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static int m29381a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static long m29388a(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    @TargetApi(17)
    /* renamed from: b */
    private static void m29434b(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: a */
    public static int m29382a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    @TargetApi(24)
    /* renamed from: b */
    private static String[] m29436b(Configuration configuration) {
        return m29423a(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: a */
    public static float m29379a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> int m29384a(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static int m29386a(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    /* renamed from: a */
    public static long[] m29418a(List<Long> list, long j, long j2) {
        long[] jArr = new long[list.size()];
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = ((Long) list.get(i)).longValue() / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) ((Long) list.get(i)).longValue()) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = ((Long) list.get(i)).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: a */
    public static void m29410a(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: a */
    public static long m29387a(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: a */
    public static long m29390a(long j, SeekParameters seekParameters, long j2, long j3) {
        if (SeekParameters.f18389c.equals(seekParameters)) {
            return j;
        }
        long d = m29444d(j, seekParameters.f18391a, Long.MIN_VALUE);
        long a = m29389a(j, seekParameters.f18392b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = d <= j2 && j2 <= a;
        if (d > j3 || j3 > a) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : d;
    }

    /* renamed from: a */
    public static int[] m29417a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static byte[] m29416a(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m29396a(String str, int i) {
        String[] j = m29456j(str);
        String str2 = null;
        if (j.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : j) {
            if (i == C9566t.m29515h(str3)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            str2 = sb.toString();
        }
        return str2;
    }

    /* renamed from: a */
    public static int m29380a(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f22281a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static String m29398a(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}).toString();
        }
        return formatter.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)}).toString();
    }

    /* renamed from: a */
    public static void m29408a(Throwable th) {
        m29435b(th);
        throw null;
    }

    /* renamed from: a */
    public static void m29407a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File a : listFiles) {
                m29407a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    public static int m29385a(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f22292l[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public static String m29395a(Context context) {
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    return m29458l(networkCountryIso);
                }
            }
        }
        return m29458l(Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public static boolean m29413a(C9572w wVar, C9572w wVar2, Inflater inflater) {
        if (wVar.mo24679a() <= 0) {
            return false;
        }
        byte[] bArr = wVar2.f22333a;
        if (bArr.length < wVar.mo24679a()) {
            bArr = new byte[(wVar.mo24679a() * 2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(wVar.f22333a, wVar.mo24688c(), wVar.mo24679a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(bArr, i, bArr.length - i);
                if (inflater.finished()) {
                    wVar2.mo24684a(bArr, i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Point m29391a(Context context, Display display) {
        String str;
        if (f22281a <= 28 && display.getDisplayId() == 0 && m29446d(context)) {
            if ("Sony".equals(f22283c) && f22284d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (f22281a < 28) {
                str = m29441c("sys.display-size");
            } else {
                str = m29441c("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] a = m29423a(str.trim(), "x");
                    if (a.length == 2) {
                        int parseInt = Integer.parseInt(a[0]);
                        int parseInt2 = Integer.parseInt(a[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid display size: ");
                sb.append(str);
                C9563q.m29497b("Util", sb.toString());
            }
        }
        Point point = new Point();
        int i = f22281a;
        if (i >= 23) {
            m29442c(display, point);
        } else if (i >= 17) {
            m29434b(display, point);
        } else {
            m29404a(display, point);
        }
        return point;
    }

    /* renamed from: a */
    private static void m29404a(Display display, Point point) {
        display.getSize(point);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static String[] m29422a(Configuration configuration) {
        return new String[]{configuration.locale.toLanguageTag()};
    }

    /* renamed from: a */
    private static int m29383a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                return 6;
        }
    }

    /* renamed from: a */
    private static HashMap<String, String> m29402a() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f22291k.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f22291k;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }
}
