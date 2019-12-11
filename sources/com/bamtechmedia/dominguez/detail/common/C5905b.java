package com.bamtechmedia.dominguez.detail.common;

import com.bamtech.sdk4.bookmarks.Bookmark;

/* renamed from: com.bamtechmedia.dominguez.detail.common.b */
/* compiled from: BookmarkExt.kt */
public final class C5905b {
    /* renamed from: a */
    public static final boolean m18989a(Bookmark bookmark) {
        long playhead = bookmark.getPlayhead();
        Long ccMedia = bookmark.getCcMedia();
        return playhead >= (ccMedia != null ? ccMedia.longValue() : bookmark.getCcDefault());
    }
}
