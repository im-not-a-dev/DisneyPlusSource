package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ListUtil;
import com.facebook.stetho.common.Util;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ShadowDocument implements DocumentView {
    /* access modifiers changed from: private */
    public final IdentityHashMap<Object, ElementInfo> mElementToInfoMap = new IdentityHashMap<>();
    /* access modifiers changed from: private */
    public boolean mIsUpdating;
    /* access modifiers changed from: private */
    public final Object mRootElement;

    public final class Update implements DocumentView {
        private final Map<Object, ElementInfo> mElementToInfoChangesMap;
        private final Set<Object> mRootElementChangesSet;

        public Update(Map<Object, ElementInfo> map, Set<Object> set) {
            this.mElementToInfoChangesMap = map;
            this.mRootElementChangesSet = set;
        }

        private void removeGarbageSubTree(Map<Object, ElementInfo> map, Object obj) {
            ElementInfo elementInfo = (ElementInfo) map.get(obj);
            Object obj2 = elementInfo.parentElement;
            if (obj2 == null || !map.containsKey(obj2)) {
                map.remove(obj);
                int size = elementInfo.children.size();
                for (int i = 0; i < size; i++) {
                    removeGarbageSubTree(map, elementInfo.children.get(i));
                }
            }
        }

        private void validateTree(Map<Object, ElementInfo> map) {
            HashSet hashSet = new HashSet();
            for (Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ElementInfo elementInfo = (ElementInfo) entry.getValue();
                if (key == elementInfo.element) {
                    int size = elementInfo.children.size();
                    int i = 0;
                    while (i < size) {
                        ElementInfo elementInfo2 = (ElementInfo) map.get(elementInfo.children.get(i));
                        if (elementInfo2 == null) {
                            throw new IllegalStateException(String.format("elementInfo.get(elementInfo.children.get(%s)) == null", new Object[]{Integer.valueOf(i)}));
                        } else if (elementInfo2.parentElement == key) {
                            i++;
                        } else {
                            throw new IllegalStateException("childElementInfo.parentElement != element");
                        }
                    }
                    Object obj = elementInfo.parentElement;
                    if (obj == null) {
                        hashSet.add(key);
                    } else {
                        ElementInfo elementInfo3 = (ElementInfo) map.get(obj);
                        if (elementInfo3 == null) {
                            throw new IllegalStateException("elementToInfoMap.get(elementInfo.parentElementInfo) == NULL");
                        } else if (elementInfo.parentElement != elementInfo3.element) {
                            throw new IllegalStateException("elementInfo.parentElementInfo != parentElementInfo.parent");
                        } else if (!elementInfo3.children.contains(key)) {
                            throw new IllegalStateException("parentElementInfo.children.contains(element) == FALSE");
                        }
                    }
                } else {
                    throw new IllegalStateException("element != elementInfo.element");
                }
            }
            if (hashSet.size() != 1) {
                throw new IllegalStateException("elementToInfoMap is a forest, not a tree. rootElements.size() != 1");
            }
        }

        public void abandon() {
            if (ShadowDocument.this.mIsUpdating) {
                ShadowDocument.this.mIsUpdating = false;
                return;
            }
            throw new IllegalStateException();
        }

        public void commit() {
            if (ShadowDocument.this.mIsUpdating) {
                ShadowDocument.this.mElementToInfoMap.putAll(this.mElementToInfoChangesMap);
                for (Object removeGarbageSubTree : this.mRootElementChangesSet) {
                    removeGarbageSubTree(ShadowDocument.this.mElementToInfoMap, removeGarbageSubTree);
                }
                ShadowDocument.this.mIsUpdating = false;
                return;
            }
            throw new IllegalStateException();
        }

        public void getChangedElements(Accumulator<Object> accumulator) {
            for (Object store : this.mElementToInfoChangesMap.keySet()) {
                accumulator.store(store);
            }
        }

        public ElementInfo getElementInfo(Object obj) {
            ElementInfo elementInfo = (ElementInfo) this.mElementToInfoChangesMap.get(obj);
            if (elementInfo != null) {
                return elementInfo;
            }
            return (ElementInfo) ShadowDocument.this.mElementToInfoMap.get(obj);
        }

        public void getGarbageElements(Accumulator<Object> accumulator) {
            ArrayDeque arrayDeque = new ArrayDeque();
            for (Object next : this.mRootElementChangesSet) {
                ElementInfo elementInfo = getElementInfo(next);
                if (next != ShadowDocument.this.mRootElement && elementInfo.parentElement == null) {
                    arrayDeque.add(next);
                    arrayDeque.add(next);
                }
            }
            while (!arrayDeque.isEmpty()) {
                Object remove = arrayDeque.remove();
                Object remove2 = arrayDeque.remove();
                if (remove == remove2) {
                    remove2 = null;
                }
                if (getElementInfo(remove).parentElement == remove2) {
                    accumulator.store(remove);
                    ElementInfo elementInfo2 = ShadowDocument.this.getElementInfo(remove);
                    if (elementInfo2 != null) {
                        int size = elementInfo2.children.size();
                        for (int i = 0; i < size; i++) {
                            arrayDeque.add(elementInfo2.children.get(i));
                            arrayDeque.add(remove);
                        }
                    }
                }
            }
        }

        public Object getRootElement() {
            return ShadowDocument.this.getRootElement();
        }

        public boolean isElementChanged(Object obj) {
            return this.mElementToInfoChangesMap.containsKey(obj);
        }

        public boolean isEmpty() {
            return this.mElementToInfoChangesMap.isEmpty();
        }
    }

    public final class UpdateBuilder {
        private HashSet<Object> mCachedNotNewChildrenSet;
        private final Map<Object, ElementInfo> mElementToInfoChangesMap = new LinkedHashMap();
        private final HashSet<Object> mRootElementChanges = new HashSet<>();

        public UpdateBuilder() {
        }

        private HashSet<Object> acquireNotNewChildrenHashSet() {
            HashSet<Object> hashSet = this.mCachedNotNewChildrenSet;
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
            this.mCachedNotNewChildrenSet = null;
            return hashSet;
        }

        private void releaseNotNewChildrenHashSet(HashSet<Object> hashSet) {
            hashSet.clear();
            if (this.mCachedNotNewChildrenSet == null) {
                this.mCachedNotNewChildrenSet = hashSet;
            }
        }

        private void setElementParent(Object obj, Object obj2) {
            ElementInfo elementInfo = (ElementInfo) this.mElementToInfoChangesMap.get(obj);
            if (elementInfo == null || obj2 != elementInfo.parentElement) {
                ElementInfo elementInfo2 = (ElementInfo) ShadowDocument.this.mElementToInfoMap.get(obj);
                if (elementInfo != null || elementInfo2 == null || obj2 != elementInfo2.parentElement) {
                    if (elementInfo == null || elementInfo2 == null || obj2 != elementInfo2.parentElement || !ListUtil.identityEquals(elementInfo2.children, elementInfo.children)) {
                        List<Object> list = elementInfo != null ? elementInfo.children : elementInfo2 != null ? elementInfo2.children : Collections.emptyList();
                        this.mElementToInfoChangesMap.put(obj, new ElementInfo(obj, obj2, list));
                        if (obj2 == null) {
                            this.mRootElementChanges.add(obj);
                        } else {
                            this.mRootElementChanges.remove(obj);
                        }
                        return;
                    }
                    this.mElementToInfoChangesMap.remove(obj);
                    if (obj2 == null) {
                        this.mRootElementChanges.remove(obj);
                    }
                }
            }
        }

        public Update build() {
            return new Update(this.mElementToInfoChangesMap, this.mRootElementChanges);
        }

        public void setElementChildren(Object obj, List<Object> list) {
            ElementInfo elementInfo;
            ElementInfo elementInfo2 = (ElementInfo) this.mElementToInfoChangesMap.get(obj);
            if (elementInfo2 == null || !ListUtil.identityEquals(list, elementInfo2.children)) {
                ElementInfo elementInfo3 = (ElementInfo) ShadowDocument.this.mElementToInfoMap.get(obj);
                if (elementInfo2 != null || elementInfo3 == null || !ListUtil.identityEquals(list, elementInfo3.children)) {
                    if (elementInfo2 == null || elementInfo3 == null || elementInfo3.parentElement != elementInfo2.parentElement || !ListUtil.identityEquals(list, elementInfo3.children)) {
                        Object obj2 = elementInfo2 != null ? elementInfo2.parentElement : elementInfo3 != null ? elementInfo3.parentElement : null;
                        ElementInfo elementInfo4 = new ElementInfo(obj, obj2, list);
                        this.mElementToInfoChangesMap.put(obj, elementInfo4);
                        elementInfo = elementInfo4;
                    } else {
                        elementInfo = (ElementInfo) ShadowDocument.this.mElementToInfoMap.get(obj);
                        this.mElementToInfoChangesMap.remove(obj);
                    }
                    HashSet acquireNotNewChildrenHashSet = acquireNotNewChildrenHashSet();
                    if (elementInfo3 != null) {
                        List<Object> list2 = elementInfo3.children;
                        if (list2 != elementInfo.children) {
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                acquireNotNewChildrenHashSet.add(elementInfo3.children.get(i));
                            }
                        }
                    }
                    if (elementInfo2 != null) {
                        List<Object> list3 = elementInfo2.children;
                        if (list3 != elementInfo.children) {
                            int size2 = list3.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                acquireNotNewChildrenHashSet.add(elementInfo2.children.get(i2));
                            }
                        }
                    }
                    int size3 = elementInfo.children.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        Object obj3 = elementInfo.children.get(i3);
                        setElementParent(obj3, obj);
                        acquireNotNewChildrenHashSet.remove(obj3);
                    }
                    Iterator it = acquireNotNewChildrenHashSet.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        ElementInfo elementInfo5 = (ElementInfo) this.mElementToInfoChangesMap.get(next);
                        if (elementInfo5 == null || elementInfo5.parentElement == obj) {
                            ElementInfo elementInfo6 = (ElementInfo) ShadowDocument.this.mElementToInfoMap.get(next);
                            if (elementInfo6 != null && elementInfo6.parentElement == obj) {
                                setElementParent(next, null);
                            }
                        }
                    }
                    releaseNotNewChildrenHashSet(acquireNotNewChildrenHashSet);
                }
            }
        }
    }

    public ShadowDocument(Object obj) {
        this.mRootElement = Util.throwIfNull(obj);
    }

    public UpdateBuilder beginUpdate() {
        if (!this.mIsUpdating) {
            this.mIsUpdating = true;
            return new UpdateBuilder();
        }
        throw new IllegalStateException();
    }

    public ElementInfo getElementInfo(Object obj) {
        return (ElementInfo) this.mElementToInfoMap.get(obj);
    }

    public Object getRootElement() {
        return this.mRootElement;
    }
}
