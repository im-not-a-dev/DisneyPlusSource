package com.bamtech.sdk4.media;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002:\u0001 B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0001J\u0013\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0001J\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0003H\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u0001R&\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n0\tX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSelectedEventData;", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "", "", "", "playbackSessionId", "payload", "(Ljava/lang/String;Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "getPlaybackSessionId", "()Ljava/lang/String;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "get", "isEmpty", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class PlaybackSelectedEventData implements BaseQosClientData, Map<String, Object>, C12872a {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ Map $$delegate_0;
    private final String playbackSessionId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSelectedEventData$Companion;", "", "()V", "init", "Lcom/bamtech/sdk4/media/PlaybackSelectedEventData;", "playbackSessionId", "", "playbackIntent", "Lcom/bamtech/sdk4/media/PlaybackIntent;", "preBuffer", "", "offline", "data", "", "(Ljava/lang/String;Lcom/bamtech/sdk4/media/PlaybackIntent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/bamtech/sdk4/media/PlaybackSelectedEventData;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: QOSEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final PlaybackSelectedEventData init(String str, PlaybackIntent playbackIntent, Boolean bool, Boolean bool2, Map<String, ? extends Object> map) {
            return new PlaybackSelectedEventData(str, C13173j0.m40353a(C13173j0.m40356a(C12907r.m40244a("playbackSessionId", str), C12907r.m40244a("playbackIntent", playbackIntent), C12907r.m40244a("preBuffer", bool), C12907r.m40244a("offline", bool2)), (Map) map));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlaybackSelectedEventData(String str, Map<String, ? extends Object> map) {
        this.$$delegate_0 = map;
        this.playbackSessionId = str;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public boolean containsKey(String str) {
        return this.$$delegate_0.containsKey(str);
    }

    public boolean containsValue(Object obj) {
        return this.$$delegate_0.containsValue(obj);
    }

    public final /* bridge */ Set<Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Object get(String str) {
        return this.$$delegate_0.get(str);
    }

    public Set<Entry<String, Object>> getEntries() {
        return this.$$delegate_0.entrySet();
    }

    public Set<String> getKeys() {
        return this.$$delegate_0.keySet();
    }

    public String getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public Collection<Object> getValues() {
        return this.$$delegate_0.values();
    }

    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
