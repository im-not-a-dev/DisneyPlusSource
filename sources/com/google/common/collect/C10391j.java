package com.google.common.collect;

import com.google.common.base.C10373e;
import com.google.common.base.C10374f;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.j */
/* compiled from: Lists */
public final class C10391j {
    /* renamed from: a */
    static boolean m32873a(List<?> list, Object obj) {
        C10374f.m32809a(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C10389i.m32872a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C10373e.m32807a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static int m32874b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m32875c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C10373e.m32807a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m32875c(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: d */
    static int m32876d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m32877e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C10373e.m32807a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m32877e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }
}
