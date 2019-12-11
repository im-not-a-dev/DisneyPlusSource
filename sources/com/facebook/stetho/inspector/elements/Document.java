package com.facebook.stetho.inspector.elements;

import android.os.SystemClock;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.ShadowDocument.Update;
import com.facebook.stetho.inspector.elements.ShadowDocument.UpdateBuilder;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

public final class Document extends ThreadBoundProxy {
    private AttributeListAccumulator mCachedAttributeAccumulator;
    private ChildEventingList mCachedChildEventingList;
    private ArrayListAccumulator<Object> mCachedChildrenAccumulator;
    private final Queue<Object> mCachedUpdateQueue = new ArrayDeque();
    /* access modifiers changed from: private */
    public DocumentProvider mDocumentProvider;
    private final DocumentProviderFactory mFactory;
    /* access modifiers changed from: private */
    public final ObjectIdMapper mObjectIdMapper = new DocumentObjectIdMapper();
    private int mReferenceCounter = 0;
    /* access modifiers changed from: private */
    public ShadowDocument mShadowDocument;
    /* access modifiers changed from: private */
    public UpdateListenerCollection mUpdateListeners = new UpdateListenerCollection();

    public static final class AttributeListAccumulator extends ArrayList<String> implements AttributeAccumulator {
        public void store(String str, String str2) {
            add(str);
            add(str2);
        }
    }

    private final class ChildEventingList extends ArrayList<Object> {
        private DocumentView mDocumentView;
        private Object mParentElement;
        private int mParentNodeId;

        private ChildEventingList() {
            this.mParentElement = null;
            this.mParentNodeId = -1;
        }

        public void acquire(Object obj, DocumentView documentView) {
            int i;
            this.mParentElement = obj;
            if (this.mParentElement == null) {
                i = -1;
            } else {
                i = Document.this.mObjectIdMapper.getIdForObject(this.mParentElement).intValue();
            }
            this.mParentNodeId = i;
            this.mDocumentView = documentView;
        }

        public void addWithEvent(int i, Object obj, Accumulator<Object> accumulator) {
            int i2;
            Object obj2 = i == 0 ? null : get(i - 1);
            if (obj2 == null) {
                i2 = -1;
            } else {
                i2 = Document.this.mObjectIdMapper.getIdForObject(obj2).intValue();
            }
            add(i, obj);
            Document.this.mUpdateListeners.onChildNodeInserted(this.mDocumentView, obj, this.mParentNodeId, i2, accumulator);
        }

        public void release() {
            clear();
            this.mParentElement = null;
            this.mParentNodeId = -1;
            this.mDocumentView = null;
        }

        public void removeWithEvent(int i) {
            Document.this.mUpdateListeners.onChildNodeRemoved(this.mParentNodeId, Document.this.mObjectIdMapper.getIdForObject(remove(i)).intValue());
        }
    }

    private final class DocumentObjectIdMapper extends ObjectIdMapper {
        private DocumentObjectIdMapper() {
        }

        /* access modifiers changed from: protected */
        public void onMapped(Object obj, int i) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(obj).hook(obj);
        }

        /* access modifiers changed from: protected */
        public void onUnmapped(Object obj, int i) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(obj).unhook(obj);
        }
    }

    private final class ProviderListener implements DocumentProviderListener {
        private ProviderListener() {
        }

        public void onAttributeModified(Object obj, String str, String str2) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeModified(obj, str, str2);
        }

        public void onAttributeRemoved(Object obj, String str) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeRemoved(obj, str);
        }

        public void onInspectRequested(Object obj) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onInspectRequested(obj);
        }

        public void onPossiblyChanged() {
            Document.this.updateTree();
        }
    }

    public interface UpdateListener {
        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);

        void onChildNodeInserted(DocumentView documentView, Object obj, int i, int i2, Accumulator<Object> accumulator);

        void onChildNodeRemoved(int i, int i2);

        void onInspectRequested(Object obj);
    }

    private class UpdateListenerCollection implements UpdateListener {
        private final List<UpdateListener> mListeners = new ArrayList();
        private volatile UpdateListener[] mListenersSnapshot;

        public UpdateListenerCollection() {
        }

        private UpdateListener[] getListenersSnapshot() {
            while (true) {
                UpdateListener[] updateListenerArr = this.mListenersSnapshot;
                if (updateListenerArr != null) {
                    return updateListenerArr;
                }
                synchronized (this) {
                    if (this.mListenersSnapshot == null) {
                        this.mListenersSnapshot = (UpdateListener[]) this.mListeners.toArray(new UpdateListener[this.mListeners.size()]);
                        UpdateListener[] updateListenerArr2 = this.mListenersSnapshot;
                        return updateListenerArr2;
                    }
                }
            }
        }

        public synchronized void add(UpdateListener updateListener) {
            this.mListeners.add(updateListener);
            this.mListenersSnapshot = null;
        }

        public synchronized void clear() {
            this.mListeners.clear();
            this.mListenersSnapshot = null;
        }

        public void onAttributeModified(Object obj, String str, String str2) {
            for (UpdateListener onAttributeModified : getListenersSnapshot()) {
                onAttributeModified.onAttributeModified(obj, str, str2);
            }
        }

        public void onAttributeRemoved(Object obj, String str) {
            for (UpdateListener onAttributeRemoved : getListenersSnapshot()) {
                onAttributeRemoved.onAttributeRemoved(obj, str);
            }
        }

        public void onChildNodeInserted(DocumentView documentView, Object obj, int i, int i2, Accumulator<Object> accumulator) {
            for (UpdateListener onChildNodeInserted : getListenersSnapshot()) {
                onChildNodeInserted.onChildNodeInserted(documentView, obj, i, i2, accumulator);
            }
        }

        public void onChildNodeRemoved(int i, int i2) {
            for (UpdateListener onChildNodeRemoved : getListenersSnapshot()) {
                onChildNodeRemoved.onChildNodeRemoved(i, i2);
            }
        }

        public void onInspectRequested(Object obj) {
            for (UpdateListener onInspectRequested : getListenersSnapshot()) {
                onInspectRequested.onInspectRequested(obj);
            }
        }

        public synchronized void remove(UpdateListener updateListener) {
            this.mListeners.remove(updateListener);
            this.mListenersSnapshot = null;
        }
    }

    public Document(DocumentProviderFactory documentProviderFactory) {
        super(documentProviderFactory);
        this.mFactory = documentProviderFactory;
    }

    private AttributeListAccumulator acquireCachedAttributeAccumulator() {
        AttributeListAccumulator attributeListAccumulator = this.mCachedAttributeAccumulator;
        if (attributeListAccumulator == null) {
            attributeListAccumulator = new AttributeListAccumulator();
        }
        this.mCachedChildrenAccumulator = null;
        return attributeListAccumulator;
    }

    /* access modifiers changed from: private */
    public ChildEventingList acquireChildEventingList(Object obj, DocumentView documentView) {
        ChildEventingList childEventingList = this.mCachedChildEventingList;
        if (childEventingList == null) {
            childEventingList = new ChildEventingList();
        }
        this.mCachedChildEventingList = null;
        childEventingList.acquire(obj, documentView);
        return childEventingList;
    }

    private ArrayListAccumulator<Object> acquireChildrenAccumulator() {
        ArrayListAccumulator<Object> arrayListAccumulator = this.mCachedChildrenAccumulator;
        if (arrayListAccumulator == null) {
            arrayListAccumulator = new ArrayListAccumulator<>();
        }
        this.mCachedChildrenAccumulator = null;
        return arrayListAccumulator;
    }

    private void applyDocumentUpdate(final Update update) {
        final ArrayList arrayList = new ArrayList();
        update.getGarbageElements(new Accumulator<Object>() {
            public void store(Object obj) {
                Integer num = (Integer) Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(obj));
                if (update.getElementInfo(obj).parentElement == null) {
                    Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(Document.this.mShadowDocument.getElementInfo(obj).parentElement).intValue(), num.intValue());
                }
                arrayList.add(num);
            }
        });
        Collections.sort(arrayList);
        update.getChangedElements(new Accumulator<Object>() {
            public void store(Object obj) {
                Integer num = (Integer) Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(obj));
                if (Collections.binarySearch(arrayList, num) < 0) {
                    ElementInfo elementInfo = Document.this.mShadowDocument.getElementInfo(obj);
                    if (!(elementInfo == null || update.getElementInfo(obj).parentElement == elementInfo.parentElement)) {
                        Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(elementInfo.parentElement).intValue(), num.intValue());
                    }
                }
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mObjectIdMapper.removeObjectById(((Integer) arrayList.get(i)).intValue());
        }
        update.getChangedElements(new Accumulator<Object>() {
            private Accumulator<Object> insertedElements = new Accumulator<Object>() {
                public void store(Object obj) {
                    if (update.isElementChanged(obj)) {
                        C86165.this.listenerInsertedElements.add(obj);
                    }
                }
            };
            /* access modifiers changed from: private */
            public final HashSet<Object> listenerInsertedElements = new HashSet<>();

            public void store(Object obj) {
                List<Object> list;
                if (Document.this.mObjectIdMapper.containsObject(obj) && !this.listenerInsertedElements.contains(obj)) {
                    ElementInfo elementInfo = Document.this.mShadowDocument.getElementInfo(obj);
                    ElementInfo elementInfo2 = update.getElementInfo(obj);
                    if (elementInfo != null) {
                        list = elementInfo.children;
                    } else {
                        list = Collections.emptyList();
                    }
                    List<Object> list2 = elementInfo2.children;
                    ChildEventingList access$900 = Document.this.acquireChildEventingList(obj, update);
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = list.get(i);
                        if (Document.this.mObjectIdMapper.containsObject(obj2)) {
                            ElementInfo elementInfo3 = update.getElementInfo(obj2);
                            if (elementInfo3 == null || elementInfo3.parentElement == obj) {
                                access$900.add(obj2);
                            }
                        }
                    }
                    Document.updateListenerChildren(access$900, list2, this.insertedElements);
                    Document.this.releaseChildEventingList(access$900);
                }
            }
        });
        update.commit();
    }

    private void cleanUp() {
        this.mDocumentProvider.postAndWait((Runnable) new Runnable() {
            public void run() {
                Document.this.mDocumentProvider.setListener(null);
                Document.this.mShadowDocument = null;
                Document.this.mObjectIdMapper.clear();
                Document.this.mDocumentProvider.dispose();
                Document.this.mDocumentProvider = null;
            }
        });
        this.mUpdateListeners.clear();
    }

    /* access modifiers changed from: private */
    public Update createShadowDocumentUpdate() {
        verifyThreadAccess();
        if (this.mDocumentProvider.getRootElement() == this.mShadowDocument.getRootElement()) {
            ArrayListAccumulator acquireChildrenAccumulator = acquireChildrenAccumulator();
            UpdateBuilder beginUpdate = this.mShadowDocument.beginUpdate();
            this.mCachedUpdateQueue.add(this.mDocumentProvider.getRootElement());
            while (!this.mCachedUpdateQueue.isEmpty()) {
                Object remove = this.mCachedUpdateQueue.remove();
                NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(remove);
                this.mObjectIdMapper.putObject(remove);
                nodeDescriptor.getChildren(remove, acquireChildrenAccumulator);
                int size = acquireChildrenAccumulator.size();
                int i = 0;
                while (i < size) {
                    Object obj = acquireChildrenAccumulator.get(i);
                    if (obj != null) {
                        this.mCachedUpdateQueue.add(obj);
                    } else {
                        LogUtil.m24844e("%s.getChildren() emitted a null child at position %s for element %s", nodeDescriptor.getClass().getName(), Integer.toString(i), remove);
                        acquireChildrenAccumulator.remove(i);
                        i--;
                        size--;
                    }
                    i++;
                }
                beginUpdate.setElementChildren(remove, acquireChildrenAccumulator);
                acquireChildrenAccumulator.clear();
            }
            releaseChildrenAccumulator(acquireChildrenAccumulator);
            return beginUpdate.build();
        }
        throw new IllegalStateException();
    }

    private boolean doesElementMatch(Object obj, Pattern pattern) {
        AttributeListAccumulator acquireCachedAttributeAccumulator = acquireCachedAttributeAccumulator();
        NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(obj);
        nodeDescriptor.getAttributes(obj, acquireCachedAttributeAccumulator);
        int size = acquireCachedAttributeAccumulator.size();
        for (int i = 0; i < size; i++) {
            if (pattern.matcher((CharSequence) acquireCachedAttributeAccumulator.get(i)).find()) {
                releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
                return true;
            }
        }
        releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
        return pattern.matcher(nodeDescriptor.getNodeName(obj)).find();
    }

    private void findMatches(Object obj, Pattern pattern, Accumulator<Integer> accumulator) {
        ElementInfo elementInfo = this.mShadowDocument.getElementInfo(obj);
        int size = elementInfo.children.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = elementInfo.children.get(i);
            if (doesElementMatch(obj2, pattern)) {
                accumulator.store(this.mObjectIdMapper.getIdForObject(obj2));
            }
            findMatches(obj2, pattern, accumulator);
        }
    }

    private void init() {
        this.mDocumentProvider = this.mFactory.create();
        this.mDocumentProvider.postAndWait((Runnable) new Runnable() {
            public void run() {
                Document document = Document.this;
                document.mShadowDocument = new ShadowDocument(document.mDocumentProvider.getRootElement());
                Document.this.createShadowDocumentUpdate().commit();
                Document.this.mDocumentProvider.setListener(new ProviderListener());
            }
        });
    }

    private void releaseCachedAttributeAccumulator(AttributeListAccumulator attributeListAccumulator) {
        attributeListAccumulator.clear();
        if (this.mCachedAttributeAccumulator == null) {
            this.mCachedAttributeAccumulator = attributeListAccumulator;
        }
    }

    /* access modifiers changed from: private */
    public void releaseChildEventingList(ChildEventingList childEventingList) {
        childEventingList.release();
        if (this.mCachedChildEventingList == null) {
            this.mCachedChildEventingList = childEventingList;
        }
    }

    private void releaseChildrenAccumulator(ArrayListAccumulator<Object> arrayListAccumulator) {
        arrayListAccumulator.clear();
        if (this.mCachedChildrenAccumulator == null) {
            this.mCachedChildrenAccumulator = arrayListAccumulator;
        }
    }

    /* access modifiers changed from: private */
    public static void updateListenerChildren(ChildEventingList childEventingList, List<Object> list, Accumulator<Object> accumulator) {
        int i = 0;
        while (i <= childEventingList.size()) {
            if (i == childEventingList.size()) {
                if (i != list.size()) {
                    childEventingList.addWithEvent(i, list.get(i), accumulator);
                } else {
                    return;
                }
            } else if (i == list.size()) {
                childEventingList.removeWithEvent(i);
            } else {
                Object obj = childEventingList.get(i);
                Object obj2 = list.get(i);
                if (obj != obj2) {
                    int indexOf = childEventingList.indexOf(obj2);
                    if (indexOf == -1) {
                        childEventingList.addWithEvent(i, obj2, accumulator);
                    } else {
                        childEventingList.removeWithEvent(indexOf);
                        childEventingList.addWithEvent(i, obj2, accumulator);
                    }
                }
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    public void updateTree() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Update createShadowDocumentUpdate = createShadowDocumentUpdate();
        boolean isEmpty = createShadowDocumentUpdate.isEmpty();
        if (isEmpty) {
            createShadowDocumentUpdate.abandon();
        } else {
            applyDocumentUpdate(createShadowDocumentUpdate);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        Object[] objArr = new Object[2];
        objArr[0] = Long.toString(elapsedRealtime2);
        objArr[1] = isEmpty ? " (no changes)" : "";
        LogUtil.m24840d("Document.updateTree() completed in %s ms%s", objArr);
    }

    public synchronized void addRef() {
        int i = this.mReferenceCounter;
        this.mReferenceCounter = i + 1;
        if (i == 0) {
            init();
        }
    }

    public void addUpdateListener(UpdateListener updateListener) {
        this.mUpdateListeners.add(updateListener);
    }

    public void findMatchingElements(String str, Accumulator<Integer> accumulator) {
        verifyThreadAccess();
        findMatches(this.mDocumentProvider.getRootElement(), Pattern.compile(Pattern.quote(str), 2), accumulator);
    }

    public DocumentView getDocumentView() {
        verifyThreadAccess();
        return this.mShadowDocument;
    }

    public void getElementComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
        getNodeDescriptor(obj).getComputedStyles(obj, computedStyleAccumulator);
    }

    public Object getElementForNodeId(int i) {
        return this.mObjectIdMapper.getObjectForId(i);
    }

    public void getElementStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        getNodeDescriptor(obj).getStyleRuleNames(obj, styleRuleNameAccumulator);
    }

    public void getElementStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
        getNodeDescriptor(obj).getStyles(obj, str, styleAccumulator);
    }

    public NodeDescriptor getNodeDescriptor(Object obj) {
        verifyThreadAccess();
        return this.mDocumentProvider.getNodeDescriptor(obj);
    }

    public Integer getNodeIdForElement(Object obj) {
        return this.mObjectIdMapper.getIdForObject(obj);
    }

    public Object getRootElement() {
        verifyThreadAccess();
        Object rootElement = this.mDocumentProvider.getRootElement();
        if (rootElement == null) {
            throw new IllegalStateException();
        } else if (rootElement == this.mShadowDocument.getRootElement()) {
            return rootElement;
        } else {
            throw new IllegalStateException();
        }
    }

    public void hideHighlight() {
        verifyThreadAccess();
        this.mDocumentProvider.hideHighlight();
    }

    public void highlightElement(Object obj, int i) {
        verifyThreadAccess();
        this.mDocumentProvider.highlightElement(obj, i);
    }

    public synchronized void release() {
        if (this.mReferenceCounter > 0) {
            int i = this.mReferenceCounter - 1;
            this.mReferenceCounter = i;
            if (i == 0) {
                cleanUp();
            }
        }
    }

    public void removeUpdateListener(UpdateListener updateListener) {
        this.mUpdateListeners.remove(updateListener);
    }

    public void setAttributesAsText(Object obj, String str) {
        verifyThreadAccess();
        this.mDocumentProvider.setAttributesAsText(obj, str);
    }

    public void setElementStyle(Object obj, String str, String str2, String str3) {
        getNodeDescriptor(obj).setStyle(obj, str, str2, str3);
    }

    public void setInspectModeEnabled(boolean z) {
        verifyThreadAccess();
        this.mDocumentProvider.setInspectModeEnabled(z);
    }
}
