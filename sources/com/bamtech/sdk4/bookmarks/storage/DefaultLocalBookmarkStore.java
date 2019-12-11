package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoExtension.DefaultImpls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/storage/DefaultLocalBookmarkStore;", "Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "sessionManager", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "dao", "Lcom/bamtech/sdk4/bookmarks/storage/BookmarksDao;", "(Lcom/bamtech/sdk4/session/SessionInfoExtension;Lcom/bamtech/sdk4/bookmarks/storage/BookmarksDao;)V", "fetchBookmarks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentIds", "", "importBookmarks", "", "newValues", "mergeBookmarks", "remoteValues", "cachedValues", "removeAllBookmarks", "Lio/reactivex/Completable;", "removeBookmarksForProfile", "profileId", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalBookmarkStore.kt */
public final class DefaultLocalBookmarkStore implements LocalBookmarkStore {
    /* access modifiers changed from: private */
    public final BookmarksDao dao;
    private final SessionInfoExtension sessionManager;

    public DefaultLocalBookmarkStore(SessionInfoExtension sessionInfoExtension, BookmarksDao bookmarksDao) {
        this.sessionManager = sessionInfoExtension;
        this.dao = bookmarksDao;
    }

    public Single<List<Bookmark>> fetchBookmarks(ServiceTransaction serviceTransaction, List<String> list) {
        Single<List<Bookmark>> g = DefaultImpls.getSessionInfo$default(this.sessionManager, serviceTransaction, false, 2, null).mo30233g(DefaultLocalBookmarkStore$fetchBookmarks$1.INSTANCE).mo30233g(new DefaultLocalBookmarkStore$fetchBookmarks$2(this, list));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "sessionManager.getSessio…      }\n                }");
        return g;
    }

    public void importBookmarks(List<Bookmark> list) {
        BookmarksDao bookmarksDao = this.dao;
        if (bookmarksDao != null) {
            bookmarksDao.addBookmarks(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00e2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bamtech.sdk4.bookmarks.Bookmark> mergeBookmarks(java.util.List<com.bamtech.sdk4.bookmarks.Bookmark> r23, java.util.List<com.bamtech.sdk4.bookmarks.Bookmark> r24) {
        /*
            r22 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r23.iterator()
        L_0x0009:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.bamtech.sdk4.bookmarks.Bookmark r3 = (com.bamtech.sdk4.bookmarks.Bookmark) r3
            boolean r3 = r3.isMetaDataValid()
            if (r3 == 0) goto L_0x0009
            r0.add(r2)
            goto L_0x0009
        L_0x0020:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r2.next()
            r7 = r3
            com.bamtech.sdk4.bookmarks.Bookmark r7 = (com.bamtech.sdk4.bookmarks.Bookmark) r7
            java.util.Iterator r8 = r24.iterator()
        L_0x003d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0059
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.bamtech.sdk4.bookmarks.Bookmark r10 = (com.bamtech.sdk4.bookmarks.Bookmark) r10
            java.lang.String r11 = r7.getContentId()
            java.lang.String r10 = r10.getContentId()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r10)
            if (r10 == 0) goto L_0x003d
            r5 = r9
        L_0x0059:
            com.bamtech.sdk4.bookmarks.Bookmark r5 = (com.bamtech.sdk4.bookmarks.Bookmark) r5
            if (r5 == 0) goto L_0x006b
            long r8 = r5.getOccurredOn()
            long r10 = r7.getOccurredOn()
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            if (r4 == 0) goto L_0x0029
            r1.add(r3)
            goto L_0x0029
        L_0x0071:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r7 = kotlin.p590y.C13187p.m40525a(r1, r3)
            r2.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L_0x0080:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0094
            java.lang.Object r8 = r7.next()
            com.bamtech.sdk4.bookmarks.Bookmark r8 = (com.bamtech.sdk4.bookmarks.Bookmark) r8
            java.lang.String r8 = r8.getContentId()
            r2.add(r8)
            goto L_0x0080
        L_0x0094:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r3 = kotlin.p590y.C13187p.m40525a(r0, r3)
            r7.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x00a1:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r3.next()
            com.bamtech.sdk4.bookmarks.Bookmark r8 = (com.bamtech.sdk4.bookmarks.Bookmark) r8
            java.lang.String r8 = r8.getContentId()
            r7.add(r8)
            goto L_0x00a1
        L_0x00b5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r24.iterator()
        L_0x00be:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d9
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.bamtech.sdk4.bookmarks.Bookmark r10 = (com.bamtech.sdk4.bookmarks.Bookmark) r10
            java.lang.String r10 = r10.getContentId()
            boolean r10 = r2.contains(r10)
            if (r10 != 0) goto L_0x00be
            r3.add(r9)
            goto L_0x00be
        L_0x00d9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e2:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x014e
            java.lang.Object r8 = r3.next()
            r9 = r8
            com.bamtech.sdk4.bookmarks.Bookmark r9 = (com.bamtech.sdk4.bookmarks.Bookmark) r9
            java.lang.String r10 = r9.getContentId()
            boolean r10 = r7.contains(r10)
            if (r10 == 0) goto L_0x0147
            java.util.Iterator r10 = r0.iterator()
        L_0x00fd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0119
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.bamtech.sdk4.bookmarks.Bookmark r12 = (com.bamtech.sdk4.bookmarks.Bookmark) r12
            java.lang.String r12 = r12.getContentId()
            java.lang.String r13 = r9.getContentId()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r12 == 0) goto L_0x00fd
            goto L_0x011a
        L_0x0119:
            r11 = r5
        L_0x011a:
            com.bamtech.sdk4.bookmarks.Bookmark r11 = (com.bamtech.sdk4.bookmarks.Bookmark) r11
            if (r11 == 0) goto L_0x0147
            long r12 = r11.getCcDefault()
            long r14 = r9.getCcDefault()
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x0145
            java.lang.Long r10 = r11.getCcMedia()
            java.lang.Long r12 = r9.getCcMedia()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r12)
            r10 = r10 ^ r4
            if (r10 != 0) goto L_0x0145
            long r10 = r11.getRuntime()
            long r12 = r9.getRuntime()
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0147
        L_0x0145:
            r9 = 1
            goto L_0x0148
        L_0x0147:
            r9 = 0
        L_0x0148:
            if (r9 == 0) goto L_0x00e2
            r2.add(r8)
            goto L_0x00e2
        L_0x014e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0157:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.bamtech.sdk4.bookmarks.Bookmark r8 = (com.bamtech.sdk4.bookmarks.Bookmark) r8
            java.util.Iterator r7 = r0.iterator()
        L_0x0168:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0184
            java.lang.Object r9 = r7.next()
            r10 = r9
            com.bamtech.sdk4.bookmarks.Bookmark r10 = (com.bamtech.sdk4.bookmarks.Bookmark) r10
            java.lang.String r10 = r10.getContentId()
            java.lang.String r11 = r8.getContentId()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r10 == 0) goto L_0x0168
            goto L_0x0185
        L_0x0184:
            r9 = r5
        L_0x0185:
            com.bamtech.sdk4.bookmarks.Bookmark r9 = (com.bamtech.sdk4.bookmarks.Bookmark) r9
            if (r9 == 0) goto L_0x01a5
            r7 = 0
            r10 = 0
            long r12 = r9.getRuntime()
            r14 = 0
            r15 = 0
            long r17 = r9.getCcDefault()
            java.lang.Long r19 = r9.getCcMedia()
            r20 = 27
            r21 = 0
            r9 = r7
            com.bamtech.sdk4.bookmarks.Bookmark r7 = com.bamtech.sdk4.bookmarks.Bookmark.copy$default(r8, r9, r10, r12, r14, r15, r17, r19, r20, r21)
            goto L_0x01a6
        L_0x01a5:
            r7 = r5
        L_0x01a6:
            if (r7 == 0) goto L_0x0157
            r3.add(r7)
            goto L_0x0157
        L_0x01ac:
            r0 = 2
            java.util.List[] r0 = new java.util.List[r0]
            r0[r6] = r1
            r0[r4] = r3
            java.util.List r0 = kotlin.p590y.C13185o.m40520c(r0)
            java.util.List r0 = kotlin.p590y.C13187p.m40528b(r0)
            r1 = r22
            r1.importBookmarks(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.bookmarks.storage.DefaultLocalBookmarkStore.mergeBookmarks(java.util.List, java.util.List):java.util.List");
    }

    public Completable removeAllBookmarks() {
        Completable c = Completable.m38166c((C11945a) new DefaultLocalBookmarkStore$removeAllBookmarks$1(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.fromAction {…eAllBookmarks()\n        }");
        return c;
    }

    public Completable removeBookmarksForProfile(String str) {
        Completable c = Completable.m38166c((C11945a) new DefaultLocalBookmarkStore$removeBookmarksForProfile$1(this, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.fromAction {…file(profileId)\n        }");
        return c;
    }
}
