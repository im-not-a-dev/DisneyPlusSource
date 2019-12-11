package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    static class LazyEntry<K> implements Entry<K, Object> {
        private Entry<K, LazyField> entry;

        public K getKey() {
            return this.entry.getKey();
        }

        public Object getValue() {
            LazyField lazyField = (LazyField) this.entry.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.entry.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private LazyEntry(Entry<K, LazyField> entry2) {
            this.entry = entry2;
        }
    }

    static class LazyIterator<K> implements Iterator<Entry<K, Object>> {
        private Iterator<Entry<K, Object>> iterator;

        public LazyIterator(Iterator<Entry<K, Object>> it) {
            this.iterator = it;
        }

        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        public void remove() {
            this.iterator.remove();
        }

        public Entry<K, Object> next() {
            Entry<K, Object> entry = (Entry) this.iterator.next();
            return entry.getValue() instanceof LazyField ? new LazyEntry(entry) : entry;
        }
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
