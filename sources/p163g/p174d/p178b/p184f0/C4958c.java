package p163g.p174d.p178b.p184f0;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.format.DateTimeFormatter;
import p163g.p174d.p178b.p196m0.C5303a;
import p686n.p687a.Timber;

/* renamed from: g.d.b.f0.c */
/* compiled from: HlsDateRangeParser */
public class C4958c {

    /* renamed from: c */
    static final Pattern f12182c = Pattern.compile(m17195i("START-DATE"));

    /* renamed from: d */
    static final Pattern f12183d = Pattern.compile(m17195i("END-DATE"));

    /* renamed from: e */
    static final Pattern f12184e = Pattern.compile(m17195i("ID"));

    /* renamed from: f */
    static final Pattern f12185f = Pattern.compile(m17194h("DURATION"));

    /* renamed from: g */
    static final Pattern f12186g = Pattern.compile(m17194h("PLANNED-DURATION"));

    /* renamed from: h */
    static final Pattern f12187h = Pattern.compile("(?<=X-)[\\w-]+(?==)");

    /* renamed from: i */
    static final Pattern f12188i = Pattern.compile(m17195i("END-ON-NEXT"));

    /* renamed from: j */
    static final Pattern f12189j = Pattern.compile(m17194h("SCTE35-OUT"));

    /* renamed from: k */
    static final Pattern f12190k = Pattern.compile(m17194h("SCTE35-IN"));

    /* renamed from: l */
    static final DateTimeFormatter f12191l = C5303a.f12787a;

    /* renamed from: a */
    HashMap<String, Pattern> f12192a = new HashMap<>();

    /* renamed from: b */
    HashMap<String, C4956a> f12193b = new HashMap<>();

    /* renamed from: h */
    static String m17194h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("(?<=%1$s=)", new Object[]{str}));
        sb.append("[\\w\\-_\\d:\\.]+");
        sb.append("(?=(,|$))");
        return sb.toString();
    }

    /* renamed from: i */
    static String m17195i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("(?<=%1$s=\")", new Object[]{str}));
        sb.append("[\\w\\-_\\d:\\.]+");
        sb.append("(?=\"(,|$))");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public HashMap<String, String> mo16429a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        Matcher matcher = f12187h.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            hashMap.put(group, mo16428a(group, str));
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo16432b(String str) {
        return f12188i.matcher(str).find();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo16433c(String str) {
        Matcher matcher = f12184e.matcher(str);
        matcher.find();
        return matcher.group();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo16434d(String str) {
        Matcher matcher = f12190k.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo16435e(String str) {
        Matcher matcher = f12189j.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* renamed from: f */
    public C4956a mo16436f(String str) {
        try {
            if (this.f12193b.containsKey(str)) {
                return (C4956a) this.f12193b.get(str);
            }
            if (!str.startsWith("#EXT-X-DATERANGE:")) {
                return null;
            }
            String g = mo16437g(str);
            C4956a aVar = new C4956a(str);
            aVar.f12176c = mo16433c(g);
            aVar.f12173Z = mo16429a(g);
            aVar.f12169V = mo16427a(f12182c, g);
            aVar.f12170W = mo16427a(f12183d, g);
            aVar.f12171X = mo16431b(f12185f, g);
            aVar.f12172Y = mo16431b(f12186g, g);
            aVar.f12174a0 = mo16432b(g);
            aVar.f12177c0 = mo16434d(g);
            aVar.f12175b0 = mo16435e(g);
            this.f12193b.put(str, aVar);
            return aVar;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not parse:\n");
            sb.append(str);
            Timber.m44528b(e, sb.toString(), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo16437g(String str) {
        String str2 = "#EXT-X-DATERANGE:";
        return str.startsWith(str2) ? str.replaceFirst(str2, "") : str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo16431b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return (long) (Float.parseFloat(matcher.group()) * 1000.0f);
        }
        return -2147483648L;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo16428a(String str, String str2) {
        if (!this.f12192a.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("X-");
            sb.append(str);
            this.f12192a.put(str, Pattern.compile(m17195i(sb.toString())));
        }
        Matcher matcher = ((Pattern) this.f12192a.get(str)).matcher(str2);
        matcher.find(0);
        return matcher.group();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo16427a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -2147483648L;
        }
        return f12191l.parseDateTime(matcher.group()).getMillis();
    }

    /* renamed from: a */
    public void mo16430a() {
        this.f12193b.clear();
    }
}
