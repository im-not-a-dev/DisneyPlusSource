package com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p299m.C7562t;
import p163g.p201e.p203b.p299m.p300y.C7569c;
import p163g.p201e.p203b.p299m.p300y.p301h.C7577a;
import p520io.reactivex.subjects.C11978b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier0/customview/mobile/Tier0MessageView;", "Lcom/bamtechmedia/dominguez/dialogs/tier0/customview/AbstractTier0MessageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "launchAllToastAnimations", "", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Tier0MessageView.kt */
public final class Tier0MessageView extends C7577a {

    /* renamed from: s0 */
    private HashMap f13937s0;

    public Tier0MessageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public Tier0MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ Tier0MessageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo18304a(C11978b bVar) {
        int width = getWidth() / 2;
        Context context = getContext();
        String str = "context";
        C12880j.m40222a((Object) context, str);
        C6052b bVar2 = new C6052b(context);
        ImageView imageView = (ImageView) mo2145c(C7562t.messageIcon);
        String str2 = "messageIcon";
        C12880j.m40222a((Object) imageView, str2);
        TextView textView = (TextView) mo2145c(C7562t.messageText);
        String str3 = "messageText";
        C12880j.m40222a((Object) textView, str3);
        View c = mo2145c(C7562t.leftCapBackground);
        String str4 = "leftCapBackground";
        C12880j.m40222a((Object) c, str4);
        View c2 = mo2145c(C7562t.rightCapBackground);
        String str5 = "rightCapBackground";
        C12880j.m40222a((Object) c2, str5);
        View c3 = mo2145c(C7562t.interCapBackground);
        String str6 = "interCapBackground";
        C12880j.m40222a((Object) c3, str6);
        C7569c cVar = new C7569c(imageView, textView, c, c2, c3);
        bVar2.mo18307a(cVar, width);
        Context context2 = getContext();
        C12880j.m40222a((Object) context2, str);
        C6049a aVar = new C6049a(context2);
        ImageView imageView2 = (ImageView) mo2145c(C7562t.messageIcon);
        C12880j.m40222a((Object) imageView2, str2);
        TextView textView2 = (TextView) mo2145c(C7562t.messageText);
        C12880j.m40222a((Object) textView2, str3);
        View c4 = mo2145c(C7562t.leftCapBackground);
        C12880j.m40222a((Object) c4, str4);
        View c5 = mo2145c(C7562t.rightCapBackground);
        C12880j.m40222a((Object) c5, str5);
        View c6 = mo2145c(C7562t.interCapBackground);
        C12880j.m40222a((Object) c6, str6);
        C7569c cVar2 = new C7569c(imageView2, textView2, c4, c5, c6);
        aVar.mo18305a(cVar2, bVar).start();
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13937s0 == null) {
            this.f13937s0 = new HashMap();
        }
        View view = (View) this.f13937s0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13937s0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public Tier0MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
