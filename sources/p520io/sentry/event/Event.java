package p520io.sentry.event;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import p520io.sentry.event.p550f.C12582h;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: io.sentry.event.Event */
public class Event implements Serializable {
    private static final C13459b _logger = C13460c.m41415a(Event.class);
    private List<C12559a> breadcrumbs = new ArrayList();
    private String checksum;
    private Map<String, Map<String, Object>> contexts = new HashMap();
    private String culprit;
    private String dist;
    private String environment;
    private transient Map<String, Object> extra = new HashMap();
    private List<String> fingerprint;

    /* renamed from: id */
    private final UUID f29092id;
    private C12558a level;
    private String logger;
    private String message;
    private String platform;
    private String release;
    private C12566c sdk;
    private Map<String, C12582h> sentryInterfaces = new HashMap();
    private String serverName;
    private Map<String, String> tags = new HashMap();
    private Date timestamp;
    private String transaction;

    /* renamed from: io.sentry.event.Event$a */
    public enum C12558a {
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    Event(UUID uuid) {
        if (uuid != null) {
            this.f29092id = uuid;
            return;
        }
        throw new IllegalArgumentException("The id can't be null");
    }

    private static HashMap<String, ? super Serializable> convertToSerializable(Map<String, Object> map) {
        HashMap<String, ? super Serializable> hashMap = new HashMap<>(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() == null) {
                hashMap.put(entry.getKey(), null);
            } else if (entry.getValue() instanceof Serializable) {
                hashMap.put(entry.getKey(), (Serializable) entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.extra = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(convertToSerializable(this.extra));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Event.class != obj.getClass()) {
            return false;
        }
        return this.f29092id.equals(((Event) obj).f29092id);
    }

    public List<C12559a> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public Map<String, Map<String, Object>> getContexts() {
        return this.contexts;
    }

    public String getCulprit() {
        return this.culprit;
    }

    public String getDist() {
        return this.dist;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Map<String, Object> getExtra() {
        if (this.extra == null) {
            this.extra = new HashMap();
            _logger.mo34724b("`extra` field was null, deserialization must not have been called, please check your ProGuard (or other obfuscation) configuration.");
        }
        return this.extra;
    }

    public List<String> getFingerprint() {
        return this.fingerprint;
    }

    public UUID getId() {
        return this.f29092id;
    }

    public C12558a getLevel() {
        return this.level;
    }

    public String getLogger() {
        return this.logger;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRelease() {
        return this.release;
    }

    public C12566c getSdk() {
        return this.sdk;
    }

    public Map<String, C12582h> getSentryInterfaces() {
        return this.sentryInterfaces;
    }

    public String getServerName() {
        return this.serverName;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        return this.f29092id.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public void setBreadcrumbs(List<C12559a> list) {
        this.breadcrumbs = list;
    }

    /* access modifiers changed from: 0000 */
    public void setChecksum(String str) {
        this.checksum = str;
    }

    public void setContexts(Map<String, Map<String, Object>> map) {
        this.contexts = map;
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    public void setCulprit(String str) {
        this.culprit = str;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    /* access modifiers changed from: 0000 */
    public void setEnvironment(String str) {
        this.environment = str;
    }

    /* access modifiers changed from: 0000 */
    public void setExtra(Map<String, Object> map) {
        this.extra = map;
    }

    public void setFingerprint(List<String> list) {
        this.fingerprint = list;
    }

    /* access modifiers changed from: 0000 */
    public void setLevel(C12558a aVar) {
        this.level = aVar;
    }

    /* access modifiers changed from: 0000 */
    public void setLogger(String str) {
        this.logger = str;
    }

    /* access modifiers changed from: 0000 */
    public void setMessage(String str) {
        this.message = str;
    }

    /* access modifiers changed from: 0000 */
    public void setPlatform(String str) {
        this.platform = str;
    }

    /* access modifiers changed from: 0000 */
    public void setRelease(String str) {
        this.release = str;
    }

    public void setSdk(C12566c cVar) {
        this.sdk = cVar;
    }

    /* access modifiers changed from: 0000 */
    public void setSentryInterfaces(Map<String, C12582h> map) {
        this.sentryInterfaces = map;
    }

    /* access modifiers changed from: 0000 */
    public void setServerName(String str) {
        this.serverName = str;
    }

    /* access modifiers changed from: 0000 */
    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    /* access modifiers changed from: 0000 */
    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    /* access modifiers changed from: 0000 */
    public void setTransaction(String str) {
        this.transaction = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event{level=");
        sb.append(this.level);
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", logger='");
        sb.append(this.logger);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
