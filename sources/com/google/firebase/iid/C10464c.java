package com.google.firebase.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.firebase.iid.c */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10464c {
    /* renamed from: a */
    public static KeyPair m33040a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(DateUtils.FORMAT_NO_MIDNIGHT);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
