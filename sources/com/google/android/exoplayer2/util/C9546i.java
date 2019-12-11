package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.v0.i */
/* compiled from: ColorParser */
public final class C9546i {

    /* renamed from: a */
    private static final Pattern f22268a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f22269b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f22270c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map<String, Integer> f22271d = new HashMap();

    static {
        f22271d.put("aliceblue", Integer.valueOf(-984833));
        f22271d.put("antiquewhite", Integer.valueOf(-332841));
        Map<String, Integer> map = f22271d;
        Integer valueOf = Integer.valueOf(-16711681);
        map.put("aqua", valueOf);
        f22271d.put("aquamarine", Integer.valueOf(-8388652));
        f22271d.put("azure", Integer.valueOf(-983041));
        f22271d.put("beige", Integer.valueOf(-657956));
        f22271d.put("bisque", Integer.valueOf(-6972));
        f22271d.put("black", Integer.valueOf(-16777216));
        f22271d.put("blanchedalmond", Integer.valueOf(-5171));
        f22271d.put("blue", Integer.valueOf(-16776961));
        f22271d.put("blueviolet", Integer.valueOf(-7722014));
        f22271d.put("brown", Integer.valueOf(-5952982));
        f22271d.put("burlywood", Integer.valueOf(-2180985));
        f22271d.put("cadetblue", Integer.valueOf(-10510688));
        f22271d.put("chartreuse", Integer.valueOf(-8388864));
        f22271d.put("chocolate", Integer.valueOf(-2987746));
        f22271d.put("coral", Integer.valueOf(-32944));
        f22271d.put("cornflowerblue", Integer.valueOf(-10185235));
        f22271d.put("cornsilk", Integer.valueOf(-1828));
        f22271d.put("crimson", Integer.valueOf(-2354116));
        f22271d.put("cyan", valueOf);
        f22271d.put("darkblue", Integer.valueOf(-16777077));
        f22271d.put("darkcyan", Integer.valueOf(-16741493));
        f22271d.put("darkgoldenrod", Integer.valueOf(-4684277));
        Map<String, Integer> map2 = f22271d;
        Integer valueOf2 = Integer.valueOf(-5658199);
        map2.put("darkgray", valueOf2);
        f22271d.put("darkgreen", Integer.valueOf(-16751616));
        f22271d.put("darkgrey", valueOf2);
        f22271d.put("darkkhaki", Integer.valueOf(-4343957));
        f22271d.put("darkmagenta", Integer.valueOf(-7667573));
        f22271d.put("darkolivegreen", Integer.valueOf(-11179217));
        f22271d.put("darkorange", Integer.valueOf(-29696));
        f22271d.put("darkorchid", Integer.valueOf(-6737204));
        f22271d.put("darkred", Integer.valueOf(-7667712));
        f22271d.put("darksalmon", Integer.valueOf(-1468806));
        f22271d.put("darkseagreen", Integer.valueOf(-7357297));
        f22271d.put("darkslateblue", Integer.valueOf(-12042869));
        Map<String, Integer> map3 = f22271d;
        Integer valueOf3 = Integer.valueOf(-13676721);
        map3.put("darkslategray", valueOf3);
        f22271d.put("darkslategrey", valueOf3);
        f22271d.put("darkturquoise", Integer.valueOf(-16724271));
        f22271d.put("darkviolet", Integer.valueOf(-7077677));
        f22271d.put("deeppink", Integer.valueOf(-60269));
        f22271d.put("deepskyblue", Integer.valueOf(-16728065));
        Map<String, Integer> map4 = f22271d;
        Integer valueOf4 = Integer.valueOf(-9868951);
        map4.put("dimgray", valueOf4);
        f22271d.put("dimgrey", valueOf4);
        f22271d.put("dodgerblue", Integer.valueOf(-14774017));
        f22271d.put("firebrick", Integer.valueOf(-5103070));
        f22271d.put("floralwhite", Integer.valueOf(-1296));
        f22271d.put("forestgreen", Integer.valueOf(-14513374));
        Map<String, Integer> map5 = f22271d;
        Integer valueOf5 = Integer.valueOf(-65281);
        map5.put("fuchsia", valueOf5);
        f22271d.put("gainsboro", Integer.valueOf(-2302756));
        f22271d.put("ghostwhite", Integer.valueOf(-460545));
        f22271d.put("gold", Integer.valueOf(-10496));
        f22271d.put("goldenrod", Integer.valueOf(-2448096));
        Map<String, Integer> map6 = f22271d;
        Integer valueOf6 = Integer.valueOf(-8355712);
        map6.put("gray", valueOf6);
        f22271d.put("green", Integer.valueOf(-16744448));
        f22271d.put("greenyellow", Integer.valueOf(-5374161));
        f22271d.put("grey", valueOf6);
        f22271d.put("honeydew", Integer.valueOf(-983056));
        f22271d.put("hotpink", Integer.valueOf(-38476));
        f22271d.put("indianred", Integer.valueOf(-3318692));
        f22271d.put("indigo", Integer.valueOf(-11861886));
        f22271d.put("ivory", Integer.valueOf(-16));
        f22271d.put("khaki", Integer.valueOf(-989556));
        f22271d.put("lavender", Integer.valueOf(-1644806));
        f22271d.put("lavenderblush", Integer.valueOf(-3851));
        f22271d.put("lawngreen", Integer.valueOf(-8586240));
        f22271d.put("lemonchiffon", Integer.valueOf(-1331));
        f22271d.put("lightblue", Integer.valueOf(-5383962));
        f22271d.put("lightcoral", Integer.valueOf(-1015680));
        f22271d.put("lightcyan", Integer.valueOf(-2031617));
        f22271d.put("lightgoldenrodyellow", Integer.valueOf(-329006));
        Map<String, Integer> map7 = f22271d;
        Integer valueOf7 = Integer.valueOf(-2894893);
        map7.put("lightgray", valueOf7);
        f22271d.put("lightgreen", Integer.valueOf(-7278960));
        f22271d.put("lightgrey", valueOf7);
        f22271d.put("lightpink", Integer.valueOf(-18751));
        f22271d.put("lightsalmon", Integer.valueOf(-24454));
        f22271d.put("lightseagreen", Integer.valueOf(-14634326));
        f22271d.put("lightskyblue", Integer.valueOf(-7876870));
        f22271d.put("lightslategray", Integer.valueOf(-8943463));
        f22271d.put("lightslategrey", Integer.valueOf(-8943463));
        f22271d.put("lightsteelblue", Integer.valueOf(-5192482));
        f22271d.put("lightyellow", Integer.valueOf(-32));
        f22271d.put("lime", Integer.valueOf(-16711936));
        f22271d.put("limegreen", Integer.valueOf(-13447886));
        f22271d.put("linen", Integer.valueOf(-331546));
        f22271d.put("magenta", valueOf5);
        f22271d.put("maroon", Integer.valueOf(-8388608));
        f22271d.put("mediumaquamarine", Integer.valueOf(-10039894));
        f22271d.put("mediumblue", Integer.valueOf(-16777011));
        f22271d.put("mediumorchid", Integer.valueOf(-4565549));
        f22271d.put("mediumpurple", Integer.valueOf(-7114533));
        f22271d.put("mediumseagreen", Integer.valueOf(-12799119));
        f22271d.put("mediumslateblue", Integer.valueOf(-8689426));
        f22271d.put("mediumspringgreen", Integer.valueOf(-16713062));
        f22271d.put("mediumturquoise", Integer.valueOf(-12004916));
        f22271d.put("mediumvioletred", Integer.valueOf(-3730043));
        f22271d.put("midnightblue", Integer.valueOf(-15132304));
        f22271d.put("mintcream", Integer.valueOf(-655366));
        f22271d.put("mistyrose", Integer.valueOf(-6943));
        f22271d.put("moccasin", Integer.valueOf(-6987));
        f22271d.put("navajowhite", Integer.valueOf(-8531));
        f22271d.put("navy", Integer.valueOf(-16777088));
        f22271d.put("oldlace", Integer.valueOf(-133658));
        f22271d.put("olive", Integer.valueOf(-8355840));
        f22271d.put("olivedrab", Integer.valueOf(-9728477));
        f22271d.put("orange", Integer.valueOf(-23296));
        f22271d.put("orangered", Integer.valueOf(-47872));
        f22271d.put("orchid", Integer.valueOf(-2461482));
        f22271d.put("palegoldenrod", Integer.valueOf(-1120086));
        f22271d.put("palegreen", Integer.valueOf(-6751336));
        f22271d.put("paleturquoise", Integer.valueOf(-5247250));
        f22271d.put("palevioletred", Integer.valueOf(-2396013));
        f22271d.put("papayawhip", Integer.valueOf(-4139));
        f22271d.put("peachpuff", Integer.valueOf(-9543));
        f22271d.put("peru", Integer.valueOf(-3308225));
        f22271d.put("pink", Integer.valueOf(-16181));
        f22271d.put("plum", Integer.valueOf(-2252579));
        f22271d.put("powderblue", Integer.valueOf(-5185306));
        f22271d.put("purple", Integer.valueOf(-8388480));
        f22271d.put("rebeccapurple", Integer.valueOf(-10079335));
        f22271d.put("red", Integer.valueOf(-65536));
        f22271d.put("rosybrown", Integer.valueOf(-4419697));
        f22271d.put("royalblue", Integer.valueOf(-12490271));
        f22271d.put("saddlebrown", Integer.valueOf(-7650029));
        f22271d.put("salmon", Integer.valueOf(-360334));
        f22271d.put("sandybrown", Integer.valueOf(-744352));
        f22271d.put("seagreen", Integer.valueOf(-13726889));
        f22271d.put("seashell", Integer.valueOf(-2578));
        f22271d.put("sienna", Integer.valueOf(-6270419));
        f22271d.put("silver", Integer.valueOf(-4144960));
        f22271d.put("skyblue", Integer.valueOf(-7876885));
        f22271d.put("slateblue", Integer.valueOf(-9807155));
        f22271d.put("slategray", Integer.valueOf(-9404272));
        f22271d.put("slategrey", Integer.valueOf(-9404272));
        f22271d.put("snow", Integer.valueOf(-1286));
        f22271d.put("springgreen", Integer.valueOf(-16711809));
        f22271d.put("steelblue", Integer.valueOf(-12156236));
        f22271d.put("tan", Integer.valueOf(-2968436));
        f22271d.put("teal", Integer.valueOf(-16744320));
        f22271d.put("thistle", Integer.valueOf(-2572328));
        f22271d.put("tomato", Integer.valueOf(-40121));
        f22271d.put("transparent", Integer.valueOf(0));
        f22271d.put("turquoise", Integer.valueOf(-12525360));
        f22271d.put("violet", Integer.valueOf(-1146130));
        f22271d.put("wheat", Integer.valueOf(-663885));
        f22271d.put("white", Integer.valueOf(-1));
        f22271d.put("whitesmoke", Integer.valueOf(-657931));
        f22271d.put("yellow", Integer.valueOf(-256));
        f22271d.put("yellowgreen", Integer.valueOf(-6632142));
    }

    /* renamed from: a */
    private static int m29354a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static int m29355a(String str) {
        return m29356a(str, true);
    }

    /* renamed from: b */
    public static int m29357b(String str) {
        return m29356a(str, false);
    }

    /* renamed from: a */
    private static int m29356a(String str, boolean z) {
        int i;
        int i2;
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                i2 = -16777216 | parseLong;
            } else if (replace.length() == 9) {
                i2 = ((parseLong & 255) << 24) | (parseLong >>> 8);
            } else {
                throw new IllegalArgumentException();
            }
            return i2;
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f22270c : f22269b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    i = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    i = Integer.parseInt(matcher.group(4), 10);
                }
                return m29354a(i, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f22268a.matcher(replace);
            if (matcher2.matches()) {
                return m29353a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = (Integer) f22271d.get(Util.m29457k(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static int m29353a(int i, int i2, int i3) {
        return m29354a(255, i, i2, i3);
    }
}
