package com.appboy.p025o;

import net.danlew.android.joda.DateUtils;

/* renamed from: com.appboy.o.a */
public enum C1492a {
    NOTIFICATION_EXPANDED_IMAGE(478, 256),
    NOTIFICATION_LARGE_ICON(64, 64),
    NOTIFICATION_ONE_IMAGE_STORY(256, 128),
    BASE_CARD_VIEW(DateUtils.FORMAT_NO_NOON, DateUtils.FORMAT_NO_NOON),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);
    

    /* renamed from: U */
    final int f5405U;

    /* renamed from: c */
    final int f5406c;

    private C1492a(int i, int i2) {
        this.f5406c = i;
        this.f5405U = i2;
    }

    /* renamed from: a */
    public int mo6742a() {
        return this.f5405U;
    }

    /* renamed from: b */
    public int mo6743b() {
        return this.f5406c;
    }
}
