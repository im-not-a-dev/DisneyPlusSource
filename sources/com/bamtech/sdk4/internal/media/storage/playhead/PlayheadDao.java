package com.bamtech.sdk4.internal.media.storage.playhead;

import com.bamtech.sdk4.media.Playhead;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH'¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDao;", "", "addPlayhead", "", "playhead", "Lcom/bamtech/sdk4/media/Playhead;", "deleteAllPlayheads", "deletePlayheadForProfile", "profileId", "", "getPlayhead", "contentId", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayheadDao.kt */
public interface PlayheadDao {
    void addPlayhead(Playhead playhead);

    void deleteAllPlayheads();

    void deletePlayheadForProfile(String str);

    Playhead getPlayhead(String str, String str2);
}
