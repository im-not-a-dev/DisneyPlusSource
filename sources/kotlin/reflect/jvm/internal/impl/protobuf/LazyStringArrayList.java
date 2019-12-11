package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public static final LazyStringList EMPTY = new LazyStringArrayList().getUnmodifiableView();
    private final List<Object> list;

    public LazyStringArrayList() {
        this.list = new ArrayList();
    }

    private static ByteString asByteString(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.list.clear();
        this.modCount++;
    }

    public ByteString getByteString(int i) {
        Object obj = this.list.get(i);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    public int size() {
        return this.list.size();
    }

    public void add(int i, String str) {
        this.list.add(i, str);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    public String remove(int i) {
        Object remove = this.list.remove(i);
        this.modCount++;
        return asString(remove);
    }

    public String set(int i, String str) {
        return asString(this.list.set(i, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    public void add(ByteString byteString) {
        this.list.add(byteString);
        this.modCount++;
    }
}
