package com.appboy.p034ui.inappmessage.factories;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.p025o.p026k.C1514h;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1543m;
import com.appboy.p034ui.inappmessage.IInAppMessageAnimationFactory;
import com.appboy.p034ui.support.AnimationUtils;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyInAppMessageAnimationFactory */
public class AppboyInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(17694720);

    public Animation getClosingAnimation(C1532b bVar) {
        if (!(bVar instanceof C1543m)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationUtils.setAnimationParams(alphaAnimation, (long) this.mShortAnimationDurationMillis, false);
            return alphaAnimation;
        } else if (((C1543m) bVar).mo6845d() == C1514h.TOP) {
            return AnimationUtils.createVerticalAnimation(0.0f, -1.0f, (long) this.mShortAnimationDurationMillis, false);
        } else {
            return AnimationUtils.createVerticalAnimation(0.0f, 1.0f, (long) this.mShortAnimationDurationMillis, false);
        }
    }

    public Animation getOpeningAnimation(C1532b bVar) {
        if (!(bVar instanceof C1543m)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationUtils.setAnimationParams(alphaAnimation, (long) this.mShortAnimationDurationMillis, true);
            return alphaAnimation;
        } else if (((C1543m) bVar).mo6845d() == C1514h.TOP) {
            return AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, (long) this.mShortAnimationDurationMillis, false);
        } else {
            return AnimationUtils.createVerticalAnimation(1.0f, 0.0f, (long) this.mShortAnimationDurationMillis, false);
        }
    }
}
