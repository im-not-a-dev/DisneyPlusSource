package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {
    /* access modifiers changed from: private */
    public final LazyStringList list;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    public LazyStringList getUnmodifiableView() {
        return this;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            Iterator<String> iter = UnmodifiableLazyStringList.this.list.iterator();

            public boolean hasNext() {
                return this.iter.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public String next() {
                return (String) this.iter.next();
            }
        };
    }

    public ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>() {
            ListIterator<String> iter = UnmodifiableLazyStringList.this.list.listIterator(i);

            public boolean hasNext() {
                return this.iter.hasNext();
            }

            public boolean hasPrevious() {
                return this.iter.hasPrevious();
            }

            public int nextIndex() {
                return this.iter.nextIndex();
            }

            public int previousIndex() {
                return this.iter.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            public String next() {
                return (String) this.iter.next();
            }

            public String previous() {
                return (String) this.iter.previous();
            }

            public void set(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return this.list.size();
    }

    public String get(int i) {
        return (String) this.list.get(i);
    }
}
