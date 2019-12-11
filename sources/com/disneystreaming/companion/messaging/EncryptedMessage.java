package com.disneystreaming.companion.messaging;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/EncryptedMessage;", "Lcom/disneystreaming/companion/messaging/EncryptedMessagable;", "version", "", "signature", "", "payload", "(ILjava/lang/String;Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "setPayload", "(Ljava/lang/String;)V", "getSignature", "setSignature", "getVersion", "()I", "setVersion", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessageTypes.kt */
public final class EncryptedMessage implements C8566a {
    private String payload;
    private String signature;
    private int version;

    public EncryptedMessage(int i, String str, String str2) {
        this.version = i;
        this.signature = str;
        this.payload = str2;
    }

    public static /* synthetic */ EncryptedMessage copy$default(EncryptedMessage encryptedMessage, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = encryptedMessage.getVersion();
        }
        if ((i2 & 2) != 0) {
            str = encryptedMessage.getSignature();
        }
        if ((i2 & 4) != 0) {
            str2 = encryptedMessage.getPayload();
        }
        return encryptedMessage.copy(i, str, str2);
    }

    public final int component1() {
        return getVersion();
    }

    public final String component2() {
        return getSignature();
    }

    public final String component3() {
        return getPayload();
    }

    public final EncryptedMessage copy(int i, String str, String str2) {
        return new EncryptedMessage(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EncryptedMessage) {
                EncryptedMessage encryptedMessage = (EncryptedMessage) obj;
                if (!(getVersion() == encryptedMessage.getVersion()) || !C12880j.m40224a((Object) getSignature(), (Object) encryptedMessage.getSignature()) || !C12880j.m40224a((Object) getPayload(), (Object) encryptedMessage.getPayload())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getSignature() {
        return this.signature;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int a = Integer.valueOf(getVersion()).hashCode() * 31;
        String signature2 = getSignature();
        int i = 0;
        int hashCode = (a + (signature2 != null ? signature2.hashCode() : 0)) * 31;
        String payload2 = getPayload();
        if (payload2 != null) {
            i = payload2.hashCode();
        }
        return hashCode + i;
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedMessage(version=");
        sb.append(getVersion());
        sb.append(", signature=");
        sb.append(getSignature());
        sb.append(", payload=");
        sb.append(getPayload());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ EncryptedMessage(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        this(i, str, str2);
    }
}
