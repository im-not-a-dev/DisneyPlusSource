package com.bamnet.iap.p035c.p037d;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p686n.p687a.Timber;

/* renamed from: com.bamnet.iap.c.d.h */
/* compiled from: Security */
public class C1674h {
    /* renamed from: a */
    public static boolean m7708a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m7709a(m7707a(str), str2, str3);
        }
        Timber.m44526b("Purchase verification failed: missing data.", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public static PublicKey m7707a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C1659a.m7663a(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Timber.m44526b("Invalid key specification.", new Object[0]);
            throw new IllegalArgumentException(e2);
        } catch (C1660b e3) {
            Timber.m44526b("Base64 decoding failed.", new Object[0]);
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: a */
    public static boolean m7709a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(C1659a.m7663a(str2))) {
                return true;
            }
            Timber.m44526b("Signature verification failed.", new Object[0]);
            return false;
        } catch (NoSuchAlgorithmException e) {
            Timber.m44528b(e, "NoSuchAlgorithmException.", new Object[0]);
            return false;
        } catch (InvalidKeyException e2) {
            Timber.m44528b(e2, "Invalid key specification.", new Object[0]);
            return false;
        } catch (SignatureException e3) {
            Timber.m44528b(e3, "Signature exception.", new Object[0]);
            return false;
        } catch (C1660b e4) {
            Timber.m44528b(e4, "Base64 decoding failed.", new Object[0]);
            return false;
        }
    }
}
