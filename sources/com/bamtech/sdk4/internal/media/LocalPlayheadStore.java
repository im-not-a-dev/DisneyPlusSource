package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.plugin.Extension;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "Lcom/bamtech/sdk4/plugin/Extension;", "fetchPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "serviceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "contentId", "", "importPlayhead", "", "playhead", "removeAllPlayheads", "removePlayheadsForProfile", "profileId", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocalPlayheadStore.kt */
public interface LocalPlayheadStore extends Extension {
    Playhead fetchPlayhead(ServiceTransaction serviceTransaction, String str);

    void importPlayhead(ServiceTransaction serviceTransaction, Playhead playhead);
}
