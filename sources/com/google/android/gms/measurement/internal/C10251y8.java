package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9942f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import net.danlew.android.joda.DateUtils;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
public final class C10251y8 extends C10101k5 {

    /* renamed from: g */
    private static final String[] f24079g = {"firebase_", "google_", "ga_"};

    /* renamed from: c */
    private SecureRandom f24080c;

    /* renamed from: d */
    private final AtomicLong f24081d = new AtomicLong(0);

    /* renamed from: e */
    private int f24082e;

    /* renamed from: f */
    private Integer f24083f = null;

    static {
        Collections.unmodifiableList(Arrays.asList(new String[]{"source", "medium", "campaign", "term", "content"}));
    }

    C10251y8(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: e */
    static boolean m31984e(String str) {
        C9908u.m30863b(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m31986f(String str) {
        C9908u.m30853a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: g */
    private static int m31987g(String str) {
        if ("_ldl".equals(str)) {
            return DateUtils.FORMAT_NO_MIDNIGHT;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* renamed from: h */
    static boolean m31988h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: x */
    static MessageDigest m31989x() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo26213a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = "aclid";
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = "cp1";
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo25898e().mo25877w().mo25909a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo26234b(String str, String str2) {
        if (str2 == null) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo25898e().mo25876v().mo25910a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo25898e().mo25876v().mo25910a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo26237c(String str, String str2) {
        if (str2 == null) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo25898e().mo25876v().mo25910a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo25898e().mo25876v().mo25910a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo26239d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m31986f(str)) {
                if (this.f23701a.mo26035m()) {
                    mo25898e().mo25876v().mo25909a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C10099k3.m31423a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f23701a.mo26035m()) {
                mo25898e().mo25876v().mo25908a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m31986f(str2)) {
            mo25898e().mo25876v().mo25909a("Invalid admob_app_id. Analytics disabled.", C10099k3.m31423a(str2));
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo25886s() {
        mo25662j();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo25898e().mo25877w().mo25908a("Utils falling back to Random for random id");
            }
        }
        this.f24081d.set(nextLong);
    }

    /* renamed from: t */
    public final long mo26240t() {
        long andIncrement;
        long j;
        if (this.f24081d.get() == 0) {
            synchronized (this.f24081d) {
                long nextLong = new Random(System.nanoTime() ^ mo25896c().mo25474c()).nextLong();
                int i = this.f24082e + 1;
                this.f24082e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f24081d) {
            this.f24081d.compareAndSet(-1, 1);
            andIncrement = this.f24081d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final SecureRandom mo26241u() {
        mo25662j();
        if (this.f24080c == null) {
            this.f24080c = new SecureRandom();
        }
        return this.f24080c;
    }

    /* renamed from: v */
    public final int mo26242v() {
        if (this.f24083f == null) {
            this.f24083f = Integer.valueOf(C9826e.m30607a().mo25297b(mo25895b()) / 1000);
        }
        return this.f24083f.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final String mo26243w() {
        byte[] bArr = new byte[16];
        mo26241u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: e */
    static boolean m31985e(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo26232b(String str) {
        String str2 = "user property";
        if (!mo26237c(str2, str)) {
            return 6;
        }
        if (!mo26231a(str2, C10178r5.f23887a, str)) {
            return 15;
        }
        if (!mo26230a(str2, 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo26235c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m31968a(m31987g(str), obj, true);
        }
        return m31968a(m31987g(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo26238d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s = mo25900g().mo25840s();
        mo25894a();
        return s.equals(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo26233b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m31975a("user property referrer", str, m31987g(str), obj, false);
        } else {
            z = m31975a("user property", str, m31987g(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo26236c(String str) {
        mo25662j();
        if (C9931c.m30956a(mo25895b()).mo25458a(str) == 0) {
            return true;
        }
        mo25898e().mo25868A().mo25909a("Permission not granted", str);
        return false;
    }

    /* renamed from: b */
    private static boolean m31982b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: c */
    private final boolean m31983c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C9931c.m30956a(context).mo25464b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo25898e().mo25874t().mo25909a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo25898e().mo25874t().mo25909a("Package name not found", e2);
        }
        return true;
    }

    /* renamed from: b */
    public static Bundle m31980b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    static boolean m31972a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26231a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be null. Type", str);
            return false;
        }
        C9908u.m30853a(str2);
        String[] strArr2 = f24079g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo25898e().mo25876v().mo25910a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C9908u.m30853a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m31985e(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo25898e().mo25876v().mo25910a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m31981b(List<C10061g9> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C10061g9 g9Var : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", g9Var.f23502c);
            bundle.putString("origin", g9Var.f23494U);
            bundle.putLong("creation_timestamp", g9Var.f23496W);
            bundle.putString("name", g9Var.f23495V.f23959U);
            C10123m5.m31569a(bundle, g9Var.f23495V.mo26106c());
            bundle.putBoolean("active", g9Var.f23497X);
            String str = g9Var.f23498Y;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C10084j jVar = g9Var.f23499Z;
            if (jVar != null) {
                bundle.putString("timed_out_event_name", jVar.f23562c);
                C10073i iVar = g9Var.f23499Z.f23559U;
                if (iVar != null) {
                    bundle.putBundle("timed_out_event_params", iVar.mo25785c());
                }
            }
            bundle.putLong("trigger_timeout", g9Var.f23500a0);
            C10084j jVar2 = g9Var.f23501b0;
            if (jVar2 != null) {
                bundle.putString("triggered_event_name", jVar2.f23562c);
                C10073i iVar2 = g9Var.f23501b0.f23559U;
                if (iVar2 != null) {
                    bundle.putBundle("triggered_event_params", iVar2.mo25785c());
                }
            }
            bundle.putLong("triggered_timestamp", g9Var.f23495V.f23960V);
            bundle.putLong("time_to_live", g9Var.f23503c0);
            C10084j jVar3 = g9Var.f23504d0;
            if (jVar3 != null) {
                bundle.putString("expired_event_name", jVar3.f23562c);
                C10073i iVar3 = g9Var.f23504d0.f23559U;
                if (iVar3 != null) {
                    bundle.putBundle("expired_event_params", iVar3.mo25785c());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26230a(String str, int i, String str2) {
        if (str2 == null) {
            mo25898e().mo25876v().mo25909a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo25898e().mo25876v().mo25911a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo26211a(String str) {
        String str2 = "event";
        if (!mo26237c(str2, str)) {
            return 2;
        }
        if (!mo26231a(str2, C10157p5.f23851a, str)) {
            return 13;
        }
        if (!mo26230a(str2, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m31975a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    mo25898e().mo25879y().mo25911a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo25898e().mo25879y().mo25910a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            mo25898e().mo25879y().mo25910a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m31976a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: a */
    private static Object m31968a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m31969a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m31969a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo26217a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m31968a(256, obj, true);
        }
        if (!m31988h(str)) {
            i = 100;
        }
        return m31968a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m31979a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (mo26230a(r2, 40, r15) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (mo26230a(r2, 40, r15) == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo26215a(java.lang.String r17, java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = 0
            if (r8 == 0) goto L_0x0185
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>(r8)
            com.google.android.gms.measurement.internal.i9 r0 = r16.mo25900g()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C10106l.f23685v0
            boolean r0 = r0.mo25821e(r7, r1)
            if (r0 == 0) goto L_0x0026
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r19.keySet()
            r0.<init>(r1)
            goto L_0x002a
        L_0x0026:
            java.util.Set r0 = r19.keySet()
        L_0x002a:
            java.util.Iterator r12 = r0.iterator()
            r14 = 0
        L_0x002f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r12.next()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r5 = 40
            r0 = 3
            if (r9 == 0) goto L_0x004a
            boolean r1 = r9.contains(r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x0082
        L_0x004a:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r21 == 0) goto L_0x0068
            boolean r3 = r6.mo26234b(r2, r15)
            if (r3 != 0) goto L_0x0058
        L_0x0056:
            r3 = 3
            goto L_0x0069
        L_0x0058:
            boolean r3 = r6.mo26231a(r2, r10, r15)
            if (r3 != 0) goto L_0x0061
            r3 = 14
            goto L_0x0069
        L_0x0061:
            boolean r3 = r6.mo26230a(r2, r5, r15)
            if (r3 != 0) goto L_0x0068
            goto L_0x0056
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 != 0) goto L_0x0081
            boolean r3 = r6.mo26237c(r2, r15)
            if (r3 != 0) goto L_0x0073
        L_0x0071:
            r1 = 3
            goto L_0x0082
        L_0x0073:
            boolean r3 = r6.mo26231a(r2, r10, r15)
            if (r3 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            boolean r1 = r6.mo26230a(r2, r5, r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x0071
        L_0x0081:
            r1 = r3
        L_0x0082:
            java.lang.String r4 = "_ev"
            r3 = 1
            if (r1 == 0) goto L_0x009e
            boolean r2 = m31973a(r11, r1)
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = m31969a(r15, r5, r3)
            r11.putString(r4, r2)
            if (r1 != r0) goto L_0x0099
            m31970a(r11, r15)
        L_0x0099:
            r11.remove(r15)
            goto L_0x013e
        L_0x009e:
            java.lang.Object r2 = r8.get(r15)
            r16.mo25662j()
            if (r22 == 0) goto L_0x00dd
            boolean r0 = r2 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x00b0
            r0 = r2
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x00bb
        L_0x00b0:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00d4
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x00bb:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00d4
            com.google.android.gms.measurement.internal.k3 r1 = r16.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25879y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "param"
            java.lang.String r5 = "Parameter array is too long; discarded. Value kind, name, array length"
            r1.mo25911a(r5, r3, r15, r0)
            r0 = 0
            goto L_0x00d5
        L_0x00d4:
            r0 = 1
        L_0x00d5:
            if (r0 != 0) goto L_0x00dd
            r0 = 17
            r13 = r4
            r10 = 40
            goto L_0x011e
        L_0x00dd:
            com.google.android.gms.measurement.internal.i9 r0 = r16.mo25900g()
            boolean r0 = r0.mo25822f(r7)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = m31988h(r18)
            if (r0 != 0) goto L_0x00f3
        L_0x00ed:
            boolean r0 = m31988h(r15)
            if (r0 == 0) goto L_0x0107
        L_0x00f3:
            r3 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r16
            r5 = r2
            r2 = r15
            r10 = 1
            r13 = r4
            r4 = r5
            r10 = 40
            r5 = r22
            boolean r0 = r0.m31975a(r1, r2, r3, r4, r5)
            goto L_0x0119
        L_0x0107:
            r5 = r2
            r13 = r4
            r10 = 40
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r16
            r2 = r15
            r4 = r5
            r5 = r22
            boolean r0 = r0.m31975a(r1, r2, r3, r4, r5)
        L_0x0119:
            if (r0 == 0) goto L_0x011d
            r0 = 0
            goto L_0x011e
        L_0x011d:
            r0 = 4
        L_0x011e:
            if (r0 == 0) goto L_0x0141
            boolean r1 = r13.equals(r15)
            if (r1 != 0) goto L_0x0141
            boolean r0 = m31973a(r11, r0)
            if (r0 == 0) goto L_0x013b
            r0 = 1
            java.lang.String r0 = m31969a(r15, r10, r0)
            r11.putString(r13, r0)
            java.lang.Object r0 = r8.get(r15)
            m31970a(r11, r0)
        L_0x013b:
            r11.remove(r15)
        L_0x013e:
            r10 = 0
            goto L_0x002f
        L_0x0141:
            boolean r0 = m31984e(r15)
            if (r0 == 0) goto L_0x0182
            int r14 = r14 + 1
            r0 = 25
            if (r14 <= r0) goto L_0x0182
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.k3 r1 = r16.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25876v()
            com.google.android.gms.measurement.internal.i3 r2 = r16.mo25902l()
            r3 = r18
            java.lang.String r2 = r2.mo25795a(r3)
            com.google.android.gms.measurement.internal.i3 r4 = r16.mo25902l()
            java.lang.String r4 = r4.mo25792a(r8)
            r1.mo25910a(r0, r2, r4)
            r0 = 5
            m31973a(r11, r0)
            r11.remove(r15)
            goto L_0x013e
        L_0x0182:
            r3 = r18
            goto L_0x013e
        L_0x0185:
            r11 = 0
        L_0x0186:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10251y8.mo26215a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m31973a(Bundle bundle, int i) {
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m31970a(Bundle bundle, Object obj) {
        C9908u.m30853a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26221a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo25898e().mo25879y().mo25910a("Not putting event parameter. Invalid value type. name, type", mo25902l().mo25796b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26219a(int i, String str, String str2, int i2) {
        mo26229a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26229a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m31973a(bundle, i);
        if (mo25900g().mo25821e(str, C10106l.f23673p0)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f23701a.mo25894a();
        this.f23701a.mo26047y().mo26161b("auto", "_err", bundle);
    }

    /* renamed from: a */
    static long m31966a(byte[] bArr) {
        C9908u.m30853a(bArr);
        int i = 0;
        C9908u.m30864b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m31971a(Context context, boolean z) {
        C9908u.m30853a(context);
        if (VERSION.SDK_INT >= 24) {
            return m31982b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m31982b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a */
    static boolean m31974a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: a */
    static boolean m31977a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo26214a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo26217a(str, bundle.get(str));
                if (a == null) {
                    mo25898e().mo25879y().mo25909a("Param value can't be null", mo25902l().mo25796b(str));
                } else {
                    mo26221a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10084j mo26216a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo26211a(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            String str4 = "_o";
            bundle3.putString(str4, str3);
            String str5 = str2;
            C10084j jVar = new C10084j(str5, new C10073i(mo26214a(mo26215a(str, str2, bundle3, C9942f.m30973a(str4), false, false))), str3, j);
            return jVar;
        }
        mo25898e().mo25874t().mo25909a("Invalid conditional property event name", mo25902l().mo25797c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo26212a(Context context, String str) {
        mo25662j();
        C9908u.m30853a(context);
        C9908u.m30863b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest x = m31989x();
        if (x == null) {
            mo25898e().mo25874t().mo25908a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m31983c(context, str)) {
                    PackageInfo b = C9931c.m30956a(context).mo25464b(mo25895b().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m31966a(x.digest(b.signatures[0].toByteArray()));
                    }
                    mo25898e().mo25877w().mo25908a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo25898e().mo25874t().mo25909a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    static byte[] m31978a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final int mo26210a(int i) {
        return C9826e.m30607a().mo24977a(mo25895b(), (int) C9832i.f23040a);
    }

    /* renamed from: a */
    public static long m31965a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26220a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            mo25898e().mo25877w().mo25909a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    /* renamed from: a */
    public final void mo26225a(C11048bc bcVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo26223a(C11048bc bcVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo26222a(C11048bc bcVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo26228a(C11048bc bcVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo26227a(C11048bc bcVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo26224a(C11048bc bcVar, Bundle bundle) {
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public static Bundle m31967a(List<C10201t8> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C10201t8 t8Var : list) {
            String str = t8Var.f23962X;
            if (str != null) {
                bundle.putString(t8Var.f23959U, str);
            } else {
                Long l = t8Var.f23961W;
                if (l != null) {
                    bundle.putLong(t8Var.f23959U, l.longValue());
                } else {
                    Double d = t8Var.f23964Z;
                    if (d != null) {
                        bundle.putDouble(t8Var.f23959U, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo26226a(C11048bc bcVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23701a.mo25898e().mo25877w().mo25909a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final URL mo26218a(long j, String str, String str2) {
        try {
            C9908u.m30863b(str2);
            C9908u.m30863b(str);
            return new URL(String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(mo26242v())}), str2, str}));
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo25898e().mo25874t().mo25909a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }
}
