package com.bamtechmedia.dominguez.legal;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import com.bamtechmedia.dominguez.legal.api.LegalLink;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p132q.p133h.C4106b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalLinkSpanHelper;", "", "isTelevision", "", "(Z)V", "applySpans", "", "content", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "onNonUrlClicked", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/legal/api/LegalLink;", "", "televisionSpanned", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalLinkSpanHelper.kt */
public final class LegalLinkSpanHelper {
    private final boolean isTelevision;

    public LegalLinkSpanHelper(boolean z) {
        this.isTelevision = z;
    }

    private final CharSequence televisionSpanned(LegalDocContent legalDocContent) {
        int i;
        StringBuilder sb = new StringBuilder();
        List links = legalDocContent.getLinks();
        ArrayList arrayList = new ArrayList();
        Iterator it = links.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!C12832w.m40123b(((LegalLink) next).getHref(), "#", false, 2, null)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = C13199w.m40562a((Iterable) arrayList, (Comparator) new LegalLinkSpanHelper$televisionSpanned$$inlined$sortedBy$1()).iterator();
        while (true) {
            String str = "null cannot be cast to non-null type java.lang.String";
            if (it2.hasNext()) {
                LegalLink legalLink = (LegalLink) it2.next();
                String text = legalDocContent.getText();
                int start = legalLink.getStart() + legalLink.getLabel().length();
                if (text != null) {
                    String substring = text.substring(i, start);
                    Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append(' ');
                    sb.append('(');
                    sb.append(legalLink.getHref());
                    sb.append(')');
                    i = legalLink.getStart() + legalLink.getLabel().length();
                } else {
                    throw new C13142s(str);
                }
            } else {
                String text2 = legalDocContent.getText();
                if (text2 != null) {
                    String substring2 = text2.substring(i);
                    Intrinsics.checkReturnedValueIsNotNull((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring2);
                    String sb2 = sb.toString();
                    Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "builder.toString()");
                    return sb2;
                }
                throw new C13142s(str);
            }
        }
    }

    public final CharSequence applySpans(LegalDocContent legalDocContent, Function1<? super LegalLink, C13145v> function1) {
        String str;
        if (this.isTelevision) {
            return televisionSpanned(legalDocContent);
        }
        SpannableString spannableString = new SpannableString(legalDocContent.getText());
        C4106b.m14080a((Spannable) spannableString, 3);
        List links = legalDocContent.getLinks();
        ArrayList arrayList = new ArrayList();
        Iterator it = links.iterator();
        while (true) {
            boolean z = true;
            str = "#";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LegalLink legalLink = (LegalLink) next;
            if (C12832w.m40123b(legalLink.getHref(), str, false, 2, null) && legalLink.getDocumentCode() == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (LegalLink legalLink2 : C13199w.m40562a((Iterable) arrayList, (Comparator) new LegalLinkSpanHelper$applySpans$$inlined$sortedBy$1())) {
            spannableString.setSpan(Intrinsics.areEqual((Object) legalLink2.getHref(), (Object) str) ^ true ? new URLSpan(legalLink2.getHref()) : new LegalLinkSpanHelper$applySpans$$inlined$onEach$lambda$1(legalLink2, function1, spannableString), legalLink2.getStart(), legalLink2.getStart() + legalLink2.getLabel().length(), 33);
        }
        return spannableString;
    }
}
