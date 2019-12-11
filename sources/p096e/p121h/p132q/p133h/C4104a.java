package p096e.p121h.p132q.p133h;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e.h.q.h.a */
/* compiled from: FindAddress */
class C4104a {

    /* renamed from: a */
    private static final C4105a[] f10361a = {new C4105a(99, 99, -1, -1), new C4105a(35, 36, -1, -1), new C4105a(71, 72, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(85, 86, -1, -1), new C4105a(90, 96, -1, -1), new C4105a(80, 81, -1, -1), new C4105a(6, 6, -1, -1), new C4105a(20, 20, -1, -1), new C4105a(19, 19, -1, -1), new C4105a(32, 34, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(30, 31, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(50, 52, -1, -1), new C4105a(83, 83, -1, -1), new C4105a(60, 62, -1, -1), new C4105a(46, 47, -1, -1), new C4105a(66, 67, 73, -1), new C4105a(40, 42, -1, -1), new C4105a(70, 71, -1, -1), new C4105a(1, 2, -1, -1), new C4105a(20, 21, -1, -1), new C4105a(3, 4, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(48, 49, -1, -1), new C4105a(55, 56, -1, -1), new C4105a(63, 65, -1, -1), new C4105a(96, 96, -1, -1), new C4105a(38, 39, -1, -1), new C4105a(55, 56, -1, -1), new C4105a(27, 28, -1, -1), new C4105a(58, 58, -1, -1), new C4105a(68, 69, -1, -1), new C4105a(3, 4, -1, -1), new C4105a(7, 8, -1, -1), new C4105a(87, 88, 86, -1), new C4105a(88, 89, 96, -1), new C4105a(10, 14, 0, 6), new C4105a(43, 45, -1, -1), new C4105a(73, 74, -1, -1), new C4105a(97, 97, -1, -1), new C4105a(15, 19, -1, -1), new C4105a(6, 6, 0, 9), new C4105a(96, 96, -1, -1), new C4105a(2, 2, -1, -1), new C4105a(29, 29, -1, -1), new C4105a(57, 57, -1, -1), new C4105a(37, 38, -1, -1), new C4105a(75, 79, 87, 88), new C4105a(84, 84, -1, -1), new C4105a(22, 24, 20, -1), new C4105a(6, 9, -1, -1), new C4105a(5, 5, -1, -1), new C4105a(98, 99, -1, -1), new C4105a(53, 54, -1, -1), new C4105a(24, 26, -1, -1), new C4105a(82, 83, -1, -1)};

    /* renamed from: b */
    private static final Pattern f10362b = Pattern.compile("[^,*•\t                　\n\u000b\f\r  ]+(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: c */
    private static final Pattern f10363c = Pattern.compile("(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: d */
    private static final Pattern f10364d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: e */
    private static final Pattern f10365e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: f */
    private static final Pattern f10366f = Pattern.compile("(\\d+)(st|nd|rd|th)", 2);

    /* renamed from: g */
    private static final Pattern f10367g = Pattern.compile("(?:\\d{5}(?:-\\d{4})?)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: e.h.q.h.a$a */
    /* compiled from: FindAddress */
    private static class C4105a {

        /* renamed from: a */
        int f10368a;

        /* renamed from: b */
        int f10369b;

        /* renamed from: c */
        int f10370c;

        /* renamed from: d */
        int f10371d;

        C4105a(int i, int i2, int i3, int i4) {
            this.f10368a = i;
            this.f10369b = i2;
            this.f10370c = i3;
            this.f10371d = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo14657a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            if ((this.f10368a <= parseInt && parseInt <= this.f10369b) || parseInt == this.f10370c || parseInt == this.f10371d) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m14068a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f10366f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i3 = parseInt % 10;
        String str2 = "th";
        if (i3 == 1) {
            if (parseInt % 100 != 11) {
                str2 = "st";
            }
            return lowerCase.equals(str2);
        } else if (i3 == 2) {
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        } else if (i3 != 3) {
            return lowerCase.equals(str2);
        } else {
            if (parseInt % 100 != 13) {
                str2 = "rd";
            }
            return lowerCase.equals(str2);
        }
    }

    /* renamed from: b */
    public static MatchResult m14070b(String str, int i) {
        MatchResult matchResult = null;
        if (i > 0) {
            if (",*•\t                　\n\u000b\f\r  ".indexOf(str.charAt(i - 1)) == -1) {
                return null;
            }
        }
        Matcher region = f10364d.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            matchResult = region.toMatchResult();
        }
        return matchResult;
    }

    /* renamed from: c */
    public static boolean m14072c(String str) {
        return f10365e.matcher(str).matches();
    }

    /* renamed from: b */
    private static boolean m14071b(String str, MatchResult matchResult) {
        boolean z = false;
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i;
                break;
            }
            groupCount = i;
        }
        if (f10367g.matcher(str).matches() && f10361a[groupCount].mo14657a(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    static String m14069b(String str) {
        Matcher matcher = f10363c.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            if (m14068a(matcher.group(0))) {
                int start = matcher.start();
                int a = m14066a(str, (MatchResult) matcher);
                if (a > 0) {
                    return str.substring(start, a);
                }
                i = -a;
            } else {
                i = matcher.end();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static MatchResult m14067a(String str, int i) {
        if (i > 0) {
            if (":,\"'\t                　\n\u000b\f\r  ".indexOf(str.charAt(i - 1)) == -1) {
                return null;
            }
        }
        Matcher region = f10363c.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (m14068a(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        return -r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14066a(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            int r14 = r14.end()
            java.util.regex.Pattern r0 = f10362b
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            r9 = r4
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = -1
            r10 = -1
        L_0x0016:
            int r11 = r13.length()
            if (r14 >= r11) goto L_0x00d7
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L_0x0028
            int r13 = r13.length()
        L_0x0026:
            int r13 = -r13
            return r13
        L_0x0028:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L_0x003a
            int r13 = r0.end()
            goto L_0x0026
        L_0x003a:
            int r11 = r0.start()
            if (r14 >= r11) goto L_0x0052
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r  "
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L_0x0050
            int r4 = r4 + 1
        L_0x0050:
            r14 = r11
            goto L_0x003a
        L_0x0052:
            r11 = 5
            if (r4 <= r11) goto L_0x0057
            goto L_0x00d7
        L_0x0057:
            int r5 = r5 + r3
            r12 = 14
            if (r5 <= r12) goto L_0x005e
            goto L_0x00d7
        L_0x005e:
            java.util.regex.MatchResult r12 = m14067a(r13, r14)
            if (r12 == 0) goto L_0x006e
            if (r6 == 0) goto L_0x006a
            if (r4 <= r3) goto L_0x006a
            int r13 = -r14
            return r13
        L_0x006a:
            if (r8 != r1) goto L_0x00cd
            r8 = r14
            goto L_0x00cd
        L_0x006e:
            java.lang.String r6 = r0.group(r2)
            boolean r6 = m14072c(r6)
            if (r6 == 0) goto L_0x007b
            r6 = 0
            r7 = 1
            goto L_0x00cd
        L_0x007b:
            if (r5 != r11) goto L_0x0084
            if (r7 != 0) goto L_0x0084
            int r14 = r0.end()
            goto L_0x00d7
        L_0x0084:
            if (r7 == 0) goto L_0x00cc
            r6 = 4
            if (r5 <= r6) goto L_0x00cc
            java.util.regex.MatchResult r14 = m14070b(r13, r14)
            if (r14 == 0) goto L_0x00cc
            java.lang.String r6 = "et"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x00a8
            java.lang.String r6 = r14.group(r2)
            java.lang.String r9 = "al"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x00a8
            int r14 = r14.end()
            goto L_0x00d7
        L_0x00a8:
            java.util.regex.Pattern r6 = f10362b
            java.util.regex.Matcher r6 = r6.matcher(r13)
            int r9 = r14.end()
            boolean r9 = r6.find(r9)
            if (r9 == 0) goto L_0x00c7
            java.lang.String r9 = r6.group(r2)
            boolean r14 = m14071b(r9, r14)
            if (r14 == 0) goto L_0x00cc
            int r13 = r6.end()
            return r13
        L_0x00c7:
            int r14 = r14.end()
            r10 = r14
        L_0x00cc:
            r6 = 0
        L_0x00cd:
            java.lang.String r9 = r0.group(r2)
            int r14 = r0.end()
            goto L_0x0016
        L_0x00d7:
            if (r10 <= 0) goto L_0x00da
            return r10
        L_0x00da:
            if (r8 <= 0) goto L_0x00dd
            r14 = r8
        L_0x00dd:
            int r13 = -r14
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p132q.p133h.C4104a.m14066a(java.lang.String, java.util.regex.MatchResult):int");
    }
}
