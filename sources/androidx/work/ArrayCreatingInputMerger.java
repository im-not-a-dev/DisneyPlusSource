package androidx.work;

import androidx.work.Data.C1011a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends C1033g {
    /* renamed from: b */
    private Object m5441b(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: c */
    private Object m5442c(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: a */
    public Data mo5572a(List<Data> list) {
        C1011a aVar = new C1011a();
        HashMap hashMap = new HashMap();
        loop0:
        for (Data a : list) {
            Iterator it = a.mo5585a().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                value = m5441b(obj, value);
                            } else {
                                value = m5442c(obj, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m5440a(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m5440a(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = m5439a(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo5593a((Map<String, Object>) hashMap);
        return aVar.mo5594a();
    }

    /* renamed from: a */
    private Object m5440a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: a */
    private Object m5439a(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
