package com.appboy.p034ui.contentcards.handlers;

import android.content.Context;
import android.view.ViewGroup;
import com.appboy.p025o.C1496d;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p034ui.contentcards.view.BannerImageContentCardView;
import com.appboy.p034ui.contentcards.view.BaseContentCardView;
import com.appboy.p034ui.contentcards.view.CaptionedImageContentCardView;
import com.appboy.p034ui.contentcards.view.ContentCardViewHolder;
import com.appboy.p034ui.contentcards.view.DefaultContentCardView;
import com.appboy.p034ui.contentcards.view.ShortNewsContentCardView;
import com.appboy.p034ui.contentcards.view.TextAnnouncementContentCardView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appboy.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler */
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    private final Map<C1496d, BaseContentCardView> mContentCardViewCache = new HashMap();

    /* renamed from: com.appboy.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$1 */
    static /* synthetic */ class C15861 {
        static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$CardType = new int[C1496d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.appboy.o.d[] r0 = com.appboy.p025o.C1496d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$enums$CardType = r0
                int[] r0 = $SwitchMap$com$appboy$enums$CardType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.BANNER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$appboy$enums$CardType     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.CAPTIONED_IMAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$appboy$enums$CardType     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.SHORT_NEWS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$appboy$enums$CardType     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.TEXT_ANNOUNCEMENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p034ui.contentcards.handlers.DefaultContentCardsViewBindingHandler.C15861.<clinit>():void");
        }
    }

    /* access modifiers changed from: 0000 */
    public BaseContentCardView getContentCardsViewFromCache(Context context, C1496d dVar) {
        Object obj;
        if (!this.mContentCardViewCache.containsKey(dVar)) {
            int i = C15861.$SwitchMap$com$appboy$enums$CardType[dVar.ordinal()];
            if (i == 1) {
                obj = new BannerImageContentCardView(context);
            } else if (i == 2) {
                obj = new CaptionedImageContentCardView(context);
            } else if (i == 3) {
                obj = new ShortNewsContentCardView(context);
            } else if (i != 4) {
                obj = new DefaultContentCardView(context);
            } else {
                obj = new TextAnnouncementContentCardView(context);
            }
            this.mContentCardViewCache.put(dVar, obj);
        }
        return (BaseContentCardView) this.mContentCardViewCache.get(dVar);
    }

    public int getItemViewType(Context context, List<C1547c> list, int i) {
        return ((C1547c) list.get(i)).mo6855I().mo6748a();
    }

    public void onBindViewHolder(Context context, List<C1547c> list, ContentCardViewHolder contentCardViewHolder, int i) {
        C1547c cVar = (C1547c) list.get(i);
        getContentCardsViewFromCache(context, cVar.mo6855I()).bindViewHolder(contentCardViewHolder, cVar);
    }

    public ContentCardViewHolder onCreateViewHolder(Context context, List<C1547c> list, ViewGroup viewGroup, int i) {
        return getContentCardsViewFromCache(context, C1496d.m7146a(i)).createViewHolder(viewGroup);
    }
}
