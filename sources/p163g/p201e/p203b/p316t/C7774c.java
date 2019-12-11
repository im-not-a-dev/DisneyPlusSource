package p163g.p201e.p203b.p316t;

import p163g.p201e.p202a.C5365h;

/* renamed from: g.e.b.t.c */
/* compiled from: OptionMenuItem.kt */
public enum C7774c {
    WATCHLIST(C5365h.nav_watchlist_title, false, true, null, 10, null),
    ACCOUNT(C5365h.nav_account, false, false, Integer.valueOf(C5365h.a11y_cdsettings_account), 6, null),
    LEGAL(C5365h.legalcenter_title, false, true, Integer.valueOf(C5365h.a11y_cdsettings_legalcenter), 2, null),
    HELP(C5365h.nav_help, false, false, Integer.valueOf(C5365h.a11y_cdsettings_help), 6, null),
    LOG_OUT(C5365h.nav_log_out, false, true, Integer.valueOf(C5365h.a11y_cdsettings_logout), 2, null),
    DEBUG_ABOUT(C5365h.debug_about, true, true, null, 8, null);
    

    /* renamed from: U */
    private final boolean f16859U;

    /* renamed from: V */
    private final Integer f16860V;

    /* renamed from: c */
    private final int f16861c;

    private C7774c(int i, boolean z, boolean z2, Integer num) {
        this.f16861c = i;
        this.f16859U = z2;
        this.f16860V = num;
    }

    /* renamed from: a */
    public final Integer mo20685a() {
        return this.f16860V;
    }

    /* renamed from: b */
    public final int mo20686b() {
        return this.f16861c;
    }

    /* renamed from: c */
    public final boolean mo20687c() {
        return this.f16859U;
    }
}
