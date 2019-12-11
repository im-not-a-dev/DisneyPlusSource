package com.appboy.p024n;

import com.appboy.p025o.C1498f;
import com.appboy.p025o.C1504j;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.appboy.n.a */
public class C1486a {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final String f5325F = C1557c.m7461a(C1486a.class);

    /* renamed from: A */
    private final Boolean f5326A;

    /* renamed from: B */
    private final Boolean f5327B;

    /* renamed from: C */
    private final EnumSet<C1498f> f5328C;

    /* renamed from: D */
    private final Boolean f5329D;

    /* renamed from: E */
    private final List<String> f5330E;

    /* renamed from: a */
    private final String f5331a;

    /* renamed from: b */
    private final String f5332b;

    /* renamed from: c */
    private final String f5333c;

    /* renamed from: d */
    private final String f5334d;

    /* renamed from: e */
    private final String f5335e;

    /* renamed from: f */
    private final String f5336f;

    /* renamed from: g */
    private final String f5337g;

    /* renamed from: h */
    private final String f5338h;

    /* renamed from: i */
    private final String f5339i;

    /* renamed from: j */
    private final C1504j f5340j;

    /* renamed from: k */
    private final Integer f5341k;

    /* renamed from: l */
    private final Integer f5342l;

    /* renamed from: m */
    private final Integer f5343m;

    /* renamed from: n */
    private final Integer f5344n;

    /* renamed from: o */
    private final Integer f5345o;

    /* renamed from: p */
    private final Integer f5346p;

    /* renamed from: q */
    private final Boolean f5347q;

    /* renamed from: r */
    private final Boolean f5348r;

    /* renamed from: s */
    private final Boolean f5349s;

    /* renamed from: t */
    private final Boolean f5350t;

    /* renamed from: u */
    private final Boolean f5351u;

    /* renamed from: v */
    private final Boolean f5352v;

    /* renamed from: w */
    private final Boolean f5353w;

    /* renamed from: x */
    private final Boolean f5354x;

    /* renamed from: y */
    private final Boolean f5355y;

    /* renamed from: z */
    private final Boolean f5356z;

    /* renamed from: com.appboy.n.a$b */
    public static class C1488b {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public Boolean f5357A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public Boolean f5358B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public EnumSet<C1498f> f5359C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public Boolean f5360D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public List<String> f5361E;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5362a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f5363b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f5364c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f5365d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f5366e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f5367f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f5368g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f5369h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f5370i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1504j f5371j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Integer f5372k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Integer f5373l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Integer f5374m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Integer f5375n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Integer f5376o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Integer f5377p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Boolean f5378q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Boolean f5379r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public Boolean f5380s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Boolean f5381t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Boolean f5382u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public Boolean f5383v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public Boolean f5384w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public Boolean f5385x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public Boolean f5386y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public Boolean f5387z;

        /* renamed from: a */
        public C1486a mo6699a() {
            return new C1486a(this);
        }

        /* renamed from: b */
        public C1488b mo6700b(String str) {
            this.f5366e = str;
            return this;
        }

        /* renamed from: c */
        public C1488b mo6703c(boolean z) {
            this.f5379r = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C1488b mo6704d(boolean z) {
            this.f5385x = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C1488b mo6697a(String str) {
            if (!C1563i.m7490d(str)) {
                this.f5362a = str;
            } else {
                C1557c.m7465b(C1486a.f5325F, "Cannot set Braze API key to null or blank string. API key field not set");
            }
            return this;
        }

        /* renamed from: b */
        public C1488b mo6701b(boolean z) {
            this.f5381t = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C1488b mo6702c(String str) {
            if (!C1563i.m7491e(str)) {
                this.f5370i = str;
            } else {
                C1557c.m7465b(C1486a.f5325F, "Cannot set Firebase Cloud Messaging Sender Id to null or empty string. Firebase Cloud Messaging Sender Id field not set");
            }
            return this;
        }

        /* renamed from: a */
        public C1488b mo6698a(boolean z) {
            this.f5378q = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: A */
    public C1504j mo6665A() {
        return this.f5340j;
    }

    /* renamed from: B */
    public String mo6666B() {
        return this.f5332b;
    }

    /* renamed from: C */
    public Integer mo6667C() {
        return this.f5341k;
    }

    /* renamed from: D */
    public String mo6668D() {
        return this.f5333c;
    }

    /* renamed from: E */
    public Integer mo6669E() {
        return this.f5343m;
    }

    /* renamed from: a */
    public Boolean mo6670a() {
        return this.f5347q;
    }

    /* renamed from: b */
    public String mo6671b() {
        return this.f5331a;
    }

    /* renamed from: c */
    public Integer mo6672c() {
        return this.f5344n;
    }

    /* renamed from: d */
    public Boolean mo6673d() {
        return this.f5355y;
    }

    /* renamed from: e */
    public String mo6674e() {
        return this.f5335e;
    }

    /* renamed from: f */
    public Integer mo6675f() {
        return this.f5342l;
    }

    /* renamed from: g */
    public String mo6676g() {
        return this.f5337g;
    }

    /* renamed from: h */
    public String mo6677h() {
        return this.f5336f;
    }

    /* renamed from: i */
    public EnumSet<C1498f> mo6678i() {
        return this.f5328C;
    }

    /* renamed from: j */
    public Boolean mo6679j() {
        return this.f5329D;
    }

    /* renamed from: k */
    public Boolean mo6680k() {
        return this.f5350t;
    }

    /* renamed from: l */
    public String mo6681l() {
        return this.f5339i;
    }

    /* renamed from: m */
    public Integer mo6682m() {
        return this.f5345o;
    }

    /* renamed from: n */
    public Integer mo6683n() {
        return this.f5346p;
    }

    /* renamed from: o */
    public Boolean mo6684o() {
        return this.f5348r;
    }

    /* renamed from: p */
    public Boolean mo6685p() {
        return this.f5354x;
    }

    /* renamed from: q */
    public Boolean mo6686q() {
        return this.f5329D;
    }

    /* renamed from: r */
    public Boolean mo6687r() {
        return this.f5351u;
    }

    /* renamed from: s */
    public Boolean mo6688s() {
        return this.f5327B;
    }

    /* renamed from: t */
    public Boolean mo6689t() {
        return this.f5326A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppboyConfig{ApiKey = '");
        sb.append(this.f5331a);
        sb.append('\'');
        sb.append("\nServerTarget = '");
        sb.append(this.f5332b);
        sb.append('\'');
        sb.append("\nSdkFlavor = '");
        sb.append(this.f5340j);
        sb.append('\'');
        sb.append("\nSmallNotificationIcon = '");
        sb.append(this.f5333c);
        sb.append('\'');
        sb.append("\nLargeNotificationIcon = '");
        sb.append(this.f5334d);
        sb.append('\'');
        sb.append("\nSessionTimeout = ");
        sb.append(this.f5341k);
        sb.append("\nDefaultNotificationAccentColor = ");
        sb.append(this.f5342l);
        sb.append("\nTriggerActionMinimumTimeIntervalSeconds = ");
        sb.append(this.f5343m);
        sb.append("\nBadNetworkInterval = ");
        sb.append(this.f5344n);
        sb.append("\nGoodNetworkInterval = ");
        sb.append(this.f5345o);
        sb.append("\nGreatNetworkInterval = ");
        sb.append(this.f5346p);
        sb.append("\nAdmMessagingRegistrationEnabled = ");
        sb.append(this.f5347q);
        sb.append("\nHandlePushDeepLinksAutomatically = ");
        sb.append(this.f5348r);
        sb.append("\nNotificationsEnabledTrackingOn = ");
        sb.append(this.f5349s);
        sb.append("\nDisableLocationCollection = ");
        sb.append(this.f5350t);
        sb.append("\nIsNewsFeedVisualIndicatorOn = ");
        sb.append(this.f5351u);
        sb.append("\nLocaleToApiMapping = ");
        sb.append(this.f5330E);
        sb.append("\nSessionStartBasedTimeoutEnabled = ");
        sb.append(this.f5353w);
        sb.append("\nIsFirebaseCloudMessagingRegistrationEnabled = ");
        sb.append(this.f5354x);
        sb.append("\nFirebaseCloudMessagingSenderIdKey = '");
        sb.append(this.f5339i);
        sb.append('\'');
        sb.append("\nIsDeviceObjectWhitelistEnabled = ");
        sb.append(this.f5329D);
        sb.append("\nDeviceObjectWhitelist = ");
        sb.append(this.f5328C);
        sb.append("\nIsInAppMessageAccessibilityExclusiveModeEnabled = ");
        sb.append(this.f5356z);
        sb.append("\nIsPushWakeScreenForNotificationEnabled = ");
        sb.append(this.f5326A);
        sb.append("\nPushHtmlRenderingEnabled = ");
        sb.append(this.f5327B);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public Boolean mo6691u() {
        return this.f5353w;
    }

    /* renamed from: v */
    public String mo6692v() {
        return this.f5334d;
    }

    /* renamed from: w */
    public List<String> mo6693w() {
        return this.f5330E;
    }

    @Deprecated
    /* renamed from: x */
    public Boolean mo6694x() {
        return this.f5349s;
    }

    /* renamed from: y */
    public String mo6695y() {
        return this.f5338h;
    }

    /* renamed from: z */
    public Boolean mo6696z() {
        return this.f5352v;
    }

    private C1486a(C1488b bVar) {
        this.f5331a = bVar.f5362a;
        this.f5347q = bVar.f5378q;
        this.f5333c = bVar.f5364c;
        this.f5334d = bVar.f5365d;
        this.f5335e = bVar.f5366e;
        this.f5341k = bVar.f5372k;
        this.f5330E = bVar.f5361E;
        this.f5350t = bVar.f5381t;
        this.f5342l = bVar.f5373l;
        this.f5343m = bVar.f5374m;
        this.f5348r = bVar.f5379r;
        this.f5349s = bVar.f5380s;
        this.f5351u = bVar.f5382u;
        this.f5344n = bVar.f5375n;
        this.f5345o = bVar.f5376o;
        this.f5346p = bVar.f5377p;
        this.f5332b = bVar.f5363b;
        this.f5340j = bVar.f5371j;
        this.f5336f = bVar.f5367f;
        this.f5337g = bVar.f5368g;
        this.f5352v = bVar.f5383v;
        this.f5338h = bVar.f5369h;
        this.f5353w = bVar.f5384w;
        this.f5339i = bVar.f5370i;
        this.f5354x = bVar.f5385x;
        this.f5355y = bVar.f5386y;
        this.f5328C = bVar.f5359C;
        this.f5329D = bVar.f5360D;
        this.f5356z = bVar.f5387z;
        this.f5326A = bVar.f5357A;
        this.f5327B = bVar.f5358B;
    }
}
