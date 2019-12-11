package com.bamtechmedia.dominguez.analytics.p057o0;

/* renamed from: com.bamtechmedia.dominguez.analytics.o0.b */
/* compiled from: AnalyticsPage.kt */
public enum C2433b {
    ACCOUNT_SETTINGS(r3, r3),
    ACCOUNT_SETTINGS_CHANGE_EMAIL("Account Settings - Change Email", r3),
    ACCOUNT_SETTINGS_CHANGE_PASSWORD("Account Settings - Change Password", r3),
    ACCOUNT_SETTINGS_CREATE_PASSWORD("OTP - Create New Password", r3),
    ACCOUNT_SETTINGS_FORGOT_PASSWORD(r2, r4),
    COMPLETE_SUBSCRIPTION("Complete Subscription", r3),
    EXPLORE("explore", "explore"),
    LOG_IN_ENTER_PASSWORD("Log In - Enter Password", r6),
    LOG_IN_ENTER_EMAIL("Log In - Enter Email", r6),
    MOVIE_DETAILS("Movie Details", "Movie Details"),
    ONBOARDING_EMAIL("Sign Up - Enter Email", r3),
    ONBOARDING_FORGOT_PASSWORD("OTP - Enter Passcode", r3),
    ONBOARDING_PAYWALL_IAP("Disney Plus IAP - Paywall", r3),
    ONBOARDING_PAYWALL_IAP_PURCHASE_CONFIRMED("Disney Plus IAP - Purchase Confirmed", r3),
    PROFILE_ADD_PROFILE("Profile - Add Profile", r2),
    PROFILE_EDIT_PROFILE("Edit Profile", r2),
    PROFILE_EDIT_PROFILE_ONBOARDING("Edit Profile", r3),
    RESTART_SUBSCRIPTION("Restart Subscription", r3),
    SERIES_DETAILS("Series Details", "Series Details"),
    FORGOT_PASSWORD_ENTER_CODE("OTP - Enter Passcode", r6),
    WATCHLIST("Watchlist", "Watchlist"),
    WELCOME("Welcome", "Welcome"),
    SIGN_UP_CREATE_PASSWORD("Sign Up - Create Password", r3),
    PROFILE_SWITCHER("Who's Watching", r3),
    PROFILE_SWITCHER_PROFILE("Who's Watching", r2),
    ADD_PROFILE("Create Profile", r3);
    

    /* renamed from: U */
    private final String f6725U;

    /* renamed from: c */
    private final String f6726c;

    private C2433b(String str, String str2) {
        this.f6726c = str;
        this.f6725U = str2;
    }

    /* renamed from: a */
    public final String mo11564a() {
        return this.f6726c;
    }

    /* renamed from: b */
    public final String mo11565b() {
        return this.f6725U;
    }
}
