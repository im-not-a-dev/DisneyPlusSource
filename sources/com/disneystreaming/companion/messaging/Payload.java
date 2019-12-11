package com.disneystreaming.companion.messaging;

import com.disneystreaming.companion.messaging.MessageType.C8545a;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010$\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u000bHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006-"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/Payload;", "Lcom/disneystreaming/companion/messaging/MessagablePayload;", "messageType", "Lcom/disneystreaming/companion/messaging/MessageType;", "messageId", "", "peerId", "appId", "deviceName", "context", "", "Lcom/disneystreaming/companion/messaging/PayloadContext;", "(Lcom/disneystreaming/companion/messaging/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getContext", "()Ljava/util/Map;", "setContext", "(Ljava/util/Map;)V", "getDeviceName", "setDeviceName", "getMessageId", "setMessageId", "getMessageType", "()Lcom/disneystreaming/companion/messaging/MessageType;", "setMessageType", "(Lcom/disneystreaming/companion/messaging/MessageType;)V", "getPeerId", "setPeerId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessageTypes.kt */
public final class Payload implements C8568c {
    private String appId;
    private Map<String, String> context;
    private String deviceName;
    private String messageId;
    private MessageType messageType;
    private String peerId;

    public Payload() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Payload(MessageType messageType2, String str, String str2, String str3, String str4, Map<String, String> map) {
        this.messageType = messageType2;
        this.messageId = str;
        this.peerId = str2;
        this.appId = str3;
        this.deviceName = str4;
        this.context = map;
    }

    public static /* synthetic */ Payload copy$default(Payload payload, MessageType messageType2, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            messageType2 = payload.getMessageType();
        }
        if ((i & 2) != 0) {
            str = payload.getMessageId();
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = payload.getPeerId();
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = payload.getAppId();
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = payload.getDeviceName();
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            map = payload.getContext();
        }
        return payload.copy(messageType2, str5, str6, str7, str8, map);
    }

    public final MessageType component1() {
        return getMessageType();
    }

    public final String component2() {
        return getMessageId();
    }

    public final String component3() {
        return getPeerId();
    }

    public final String component4() {
        return getAppId();
    }

    public final String component5() {
        return getDeviceName();
    }

    public final Map<String, String> component6() {
        return getContext();
    }

    public final Payload copy(MessageType messageType2, String str, String str2, String str3, String str4, Map<String, String> map) {
        Payload payload = new Payload(messageType2, str, str2, str3, str4, map);
        return payload;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getContext(), (java.lang.Object) r3.getContext()) != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005f
            boolean r0 = r3 instanceof com.disneystreaming.companion.messaging.Payload
            if (r0 == 0) goto L_0x005d
            com.disneystreaming.companion.messaging.Payload r3 = (com.disneystreaming.companion.messaging.Payload) r3
            com.disneystreaming.companion.messaging.MessageType r0 = r2.getMessageType()
            com.disneystreaming.companion.messaging.MessageType r1 = r3.getMessageType()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.getMessageId()
            java.lang.String r1 = r3.getMessageId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.getPeerId()
            java.lang.String r1 = r3.getPeerId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.getAppId()
            java.lang.String r1 = r3.getAppId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r2.getDeviceName()
            java.lang.String r1 = r3.getDeviceName()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005d
            java.util.Map r0 = r2.getContext()
            java.util.Map r3 = r3.getContext()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r3 = 0
            return r3
        L_0x005f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.messaging.Payload.equals(java.lang.Object):boolean");
    }

    public String getAppId() {
        return this.appId;
    }

    public Map<String, String> getContext() {
        return this.context;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public String getPeerId() {
        return this.peerId;
    }

    public int hashCode() {
        MessageType messageType2 = getMessageType();
        int i = 0;
        int hashCode = (messageType2 != null ? messageType2.hashCode() : 0) * 31;
        String messageId2 = getMessageId();
        int hashCode2 = (hashCode + (messageId2 != null ? messageId2.hashCode() : 0)) * 31;
        String peerId2 = getPeerId();
        int hashCode3 = (hashCode2 + (peerId2 != null ? peerId2.hashCode() : 0)) * 31;
        String appId2 = getAppId();
        int hashCode4 = (hashCode3 + (appId2 != null ? appId2.hashCode() : 0)) * 31;
        String deviceName2 = getDeviceName();
        int hashCode5 = (hashCode4 + (deviceName2 != null ? deviceName2.hashCode() : 0)) * 31;
        Map context2 = getContext();
        if (context2 != null) {
            i = context2.hashCode();
        }
        return hashCode5 + i;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setContext(Map<String, String> map) {
        this.context = map;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setMessageType(MessageType messageType2) {
        this.messageType = messageType2;
    }

    public void setPeerId(String str) {
        this.peerId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payload(messageType=");
        sb.append(getMessageType());
        sb.append(", messageId=");
        sb.append(getMessageId());
        sb.append(", peerId=");
        sb.append(getPeerId());
        sb.append(", appId=");
        sb.append(getAppId());
        sb.append(", deviceName=");
        sb.append(getDeviceName());
        sb.append(", context=");
        sb.append(getContext());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Payload(MessageType messageType2, String str, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            messageType2 = new C8545a("standard");
        }
        MessageType messageType3 = messageType2;
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            C12880j.m40222a((Object) str, "UUID.randomUUID().toString()");
        }
        this(messageType3, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : map);
    }
}
