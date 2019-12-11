package com.facebook.stetho.inspector.helper;

import android.util.SparseArray;
import java.util.IdentityHashMap;
import java.util.Map;

public class ObjectIdMapper {
    private SparseArray<Object> mIdToObjectMap = new SparseArray<>();
    private int mNextId = 1;
    private final Map<Object, Integer> mObjectToIdMap = new IdentityHashMap();
    protected final Object mSync = new Object();

    public void clear() {
        SparseArray<Object> sparseArray;
        synchronized (this.mSync) {
            sparseArray = this.mIdToObjectMap;
            this.mObjectToIdMap.clear();
            this.mIdToObjectMap = new SparseArray<>();
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            onUnmapped(sparseArray.valueAt(i), sparseArray.keyAt(i));
        }
    }

    public boolean containsId(int i) {
        boolean z;
        synchronized (this.mSync) {
            z = this.mIdToObjectMap.get(i) != null;
        }
        return z;
    }

    public boolean containsObject(Object obj) {
        boolean containsKey;
        synchronized (this.mSync) {
            containsKey = this.mObjectToIdMap.containsKey(obj);
        }
        return containsKey;
    }

    public Integer getIdForObject(Object obj) {
        Integer num;
        synchronized (this.mSync) {
            num = (Integer) this.mObjectToIdMap.get(obj);
        }
        return num;
    }

    public Object getObjectForId(int i) {
        Object obj;
        synchronized (this.mSync) {
            obj = this.mIdToObjectMap.get(i);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void onMapped(Object obj, int i) {
    }

    /* access modifiers changed from: protected */
    public void onUnmapped(Object obj, int i) {
    }

    public int putObject(Object obj) {
        synchronized (this.mSync) {
            Integer num = (Integer) this.mObjectToIdMap.get(obj);
            if (num != null) {
                int intValue = num.intValue();
                return intValue;
            }
            int i = this.mNextId;
            this.mNextId = i + 1;
            Integer valueOf = Integer.valueOf(i);
            this.mObjectToIdMap.put(obj, valueOf);
            this.mIdToObjectMap.put(valueOf.intValue(), obj);
            onMapped(obj, valueOf.intValue());
            return valueOf.intValue();
        }
    }

    public Integer removeObject(Object obj) {
        synchronized (this.mSync) {
            Integer num = (Integer) this.mObjectToIdMap.remove(obj);
            if (num == null) {
                return null;
            }
            this.mIdToObjectMap.remove(num.intValue());
            onUnmapped(obj, num.intValue());
            return num;
        }
    }

    public Object removeObjectById(int i) {
        synchronized (this.mSync) {
            Object obj = this.mIdToObjectMap.get(i);
            if (obj == null) {
                return null;
            }
            this.mIdToObjectMap.remove(i);
            this.mObjectToIdMap.remove(obj);
            onUnmapped(obj, i);
            return obj;
        }
    }

    public int size() {
        int size;
        synchronized (this.mSync) {
            size = this.mObjectToIdMap.size();
        }
        return size;
    }
}
