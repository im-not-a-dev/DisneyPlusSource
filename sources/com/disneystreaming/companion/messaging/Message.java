package com.disneystreaming.companion.messaging;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/Message;", "Lcom/disneystreaming/companion/messaging/Messagable;", "version", "", "signature", "", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "(ILjava/lang/String;Lcom/disneystreaming/companion/messaging/Payload;)V", "getPayload", "()Lcom/disneystreaming/companion/messaging/Payload;", "setPayload", "(Lcom/disneystreaming/companion/messaging/Payload;)V", "getSignature", "()Ljava/lang/String;", "setSignature", "(Ljava/lang/String;)V", "getVersion", "()I", "setVersion", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessageTypes.kt */
public final class Message implements C8567b {
    private Payload payload;
    private String signature;
    private int version;

    public Message(int i, String str, Payload payload2) {
        this.version = i;
        this.signature = str;
        this.payload = payload2;
    }

    public static /* synthetic */ Message copy$default(Message message, int i, String str, Payload payload2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = message.getVersion();
        }
        if ((i2 & 2) != 0) {
            str = message.getSignature();
        }
        if ((i2 & 4) != 0) {
            payload2 = message.getPayload();
        }
        return message.copy(i, str, payload2);
    }

    public final int component1() {
        return getVersion();
    }

    public final String component2() {
        return getSignature();
    }

    public final Payload component3() {
        return getPayload();
    }

    public final Message copy(int i, String str, Payload payload2) {
        return new Message(i, str, payload2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Message) {
                Message message = (Message) obj;
                if (!(getVersion() == message.getVersion()) || !C12880j.m40224a((Object) getSignature(), (Object) message.getSignature()) || !C12880j.m40224a((Object) getPayload(), (Object) message.getPayload())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Payload getPayload() {
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
        Payload payload2 = getPayload();
        if (payload2 != null) {
            i = payload2.hashCode();
        }
        return hashCode + i;
    }

    public void setPayload(Payload payload2) {
        this.payload = payload2;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message(version=");
        sb.append(getVersion());
        sb.append(", signature=");
        sb.append(getSignature());
        sb.append(", payload=");
        sb.append(getPayload());
        sb.append(")");
        return sb.toString();
    }
}
