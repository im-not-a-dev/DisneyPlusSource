package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityToken;
import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.Storage.DefaultImpls;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"BAM_IDENTITY_TOKEN", "", "IDENTITY_TOKEN_TYPE", "deleteIdentity", "", "Lcom/bamtech/sdk4/internal/core/Storage;", "getIdentity", "Lcom/bamtech/sdk4/identity/IdentityToken;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "saveIdentity", "token", "plugin-identity-bam"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityToken.kt */
public final class BamIdentityTokenKt {
    public static final IdentityToken getIdentity(Storage storage, Converter converter) {
        IdentityToken identityToken;
        Class<RedeemedPasscodeToken> cls = RedeemedPasscodeToken.class;
        String str = (String) DefaultImpls.get$default(storage, "IDENTITY_TOKEN_TYPE", C12895y.m40230a(String.class), null, 4, null);
        String str2 = "BAM_IDENTITY_TOKEN";
        if (C12880j.m40224a((Object) str, (Object) cls.getSimpleName())) {
            DefaultImpls.save$default(storage, "IDENTITY_TOKEN_TYPE", cls.getSimpleName(), null, 4, null);
            identityToken = (IdentityToken) storage.get(str2, C12895y.m40230a((Class) cls), converter);
        } else if (C12880j.m40224a((Object) str, (Object) cls.getSimpleName())) {
            identityToken = (IdentityToken) storage.get(str2, C12895y.m40230a((Class) cls), converter);
        } else {
            identityToken = (IdentityToken) storage.get(str2, C12895y.m40230a(BamIdentityToken.class), converter);
        }
        if ((identityToken != null ? identityToken.getIssuedAt() : null) == null) {
            return null;
        }
        return identityToken;
    }

    public static final void saveIdentity(Storage storage, IdentityToken identityToken, Converter converter) {
        storage.save("BAM_IDENTITY_TOKEN", identityToken, converter);
        boolean z = identityToken instanceof RedeemedPasscodeToken;
        String str = "IDENTITY_TOKEN_TYPE";
        if (z || z) {
            storage.save(str, RedeemedPasscodeToken.class.getSimpleName(), converter);
        } else {
            storage.save(str, identityToken.getClass().getSimpleName(), converter);
        }
    }
}
