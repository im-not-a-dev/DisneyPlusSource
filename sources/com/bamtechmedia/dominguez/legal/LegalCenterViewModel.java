package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.legal.LegalDocumentFinder.LegalItem;
import com.bamtechmedia.dominguez.legal.api.LegalApi;
import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0016\u0010\u001c\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0012\u0010\u001d\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0011J\f\u0010%\u001a\u00020&*\u00020\"H\u0002J\u0013\u0010'\u001a\u0004\u0018\u00010\u0016*\u00020\u0002H\u0002¢\u0006\u0002\u0010(R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "legalApi", "Lcom/bamtechmedia/dominguez/legal/api/LegalApi;", "spanHelper", "Lcom/bamtechmedia/dominguez/legal/LegalLinkSpanHelper;", "analytics", "Lcom/bamtechmedia/dominguez/legal/LegalCenterAnalytics;", "isTelevision", "", "legalDocumentFinder", "Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder;", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "openDocumentCode", "", "requestedLegalItem", "Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "(Lcom/bamtechmedia/dominguez/legal/api/LegalApi;Lcom/bamtechmedia/dominguez/legal/LegalLinkSpanHelper;Lcom/bamtechmedia/dominguez/legal/LegalCenterAnalytics;ZLcom/bamtechmedia/dominguez/legal/LegalDocumentFinder;Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;)V", "loadAllDisclosures", "", "loadDocumentContents", "currentState", "loadSingleDocumentContent", "Lio/reactivex/Completable;", "code", "onDisclosuresLoaded", "onDocumentSelected", "document", "onLegalContentLoadFailed", "onLegalContentLoaded", "content", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "retryLoadContent", "documentCode", "toSpannableString", "", "trackPageLoad", "(Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;)Lkotlin/Unit;", "State", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
public final class LegalCenterViewModel extends C5741g<State> {
    /* access modifiers changed from: private */
    public final LegalCenterAnalytics analytics;
    /* access modifiers changed from: private */
    public final boolean isTelevision;
    private final LegalApi legalApi;
    /* access modifiers changed from: private */
    public final LegalDocumentFinder legalDocumentFinder;
    /* access modifiers changed from: private */
    public final String openDocumentCode;
    /* access modifiers changed from: private */
    public final LegalItem requestedLegalItem;
    private final LegalLinkSpanHelper spanHelper;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\u0010\u000eJ\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003JW\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0001J\u0013\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "", "allDocuments", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "openDocumentCode", "", "spannedDocumentContent", "", "", "loadDocumentsError", "", "failedContentDocumentCodes", "", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;Ljava/util/Set;)V", "getAllDocuments", "()Ljava/util/List;", "getFailedContentDocumentCodes", "()Ljava/util/Set;", "isOffline", "", "()Z", "getLoadDocumentsError", "()Ljava/lang/Throwable;", "loading", "getLoading", "openDocument", "getOpenDocument", "()Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "getOpenDocumentCode", "()Ljava/lang/String;", "openDocumentSpanned", "getOpenDocumentSpanned", "()Ljava/lang/CharSequence;", "getSpannedDocumentContent", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LegalCenterViewModel.kt */
    public static final class State {
        private final List<LegalDocument> allDocuments;
        private final Set<String> failedContentDocumentCodes;
        private final Throwable loadDocumentsError;
        private final String openDocumentCode;
        private final Map<String, CharSequence> spannedDocumentContent;

        public State() {
            this(null, null, null, null, null, 31, null);
        }

        public State(List<LegalDocument> list, String str, Map<String, ? extends CharSequence> map, Throwable th, Set<String> set) {
            this.allDocuments = list;
            this.openDocumentCode = str;
            this.spannedDocumentContent = map;
            this.loadDocumentsError = th;
            this.failedContentDocumentCodes = set;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument>, for r4v0, types: [java.util.List] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.CharSequence>, for r6v0, types: [java.util.Map] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.String>, for r8v0, types: [java.util.Set] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State copy$default(com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State r3, java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.CharSequence> r6, java.lang.Throwable r7, java.util.Set<java.lang.String> r8, int r9, java.lang.Object r10) {
            /*
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r4 = r3.allDocuments
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                java.lang.String r5 = r3.openDocumentCode
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                java.util.Map<java.lang.String, java.lang.CharSequence> r6 = r3.spannedDocumentContent
            L_0x0013:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                java.lang.Throwable r7 = r3.loadDocumentsError
            L_0x001a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                java.util.Set<java.lang.String> r8 = r3.failedContentDocumentCodes
            L_0x0021:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State r3 = r5.copy(r6, r7, r8, r9, r10)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State.copy$default(com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State, java.util.List, java.lang.String, java.util.Map, java.lang.Throwable, java.util.Set, int, java.lang.Object):com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State");
        }

        public final List<LegalDocument> component1() {
            return this.allDocuments;
        }

        public final String component2() {
            return this.openDocumentCode;
        }

        public final Map<String, CharSequence> component3() {
            return this.spannedDocumentContent;
        }

        public final Throwable component4() {
            return this.loadDocumentsError;
        }

        public final Set<String> component5() {
            return this.failedContentDocumentCodes;
        }

        public final State copy(List<LegalDocument> list, String str, Map<String, ? extends CharSequence> map, Throwable th, Set<String> set) {
            State state = new State(list, str, map, th, set);
            return state;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.failedContentDocumentCodes, (java.lang.Object) r3.failedContentDocumentCodes) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State r3 = (com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State) r3
                java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r0 = r2.allDocuments
                java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r1 = r3.allDocuments
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.openDocumentCode
                java.lang.String r1 = r3.openDocumentCode
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.util.Map<java.lang.String, java.lang.CharSequence> r0 = r2.spannedDocumentContent
                java.util.Map<java.lang.String, java.lang.CharSequence> r1 = r3.spannedDocumentContent
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Throwable r0 = r2.loadDocumentsError
                java.lang.Throwable r1 = r3.loadDocumentsError
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.util.Set<java.lang.String> r0 = r2.failedContentDocumentCodes
                java.util.Set<java.lang.String> r3 = r3.failedContentDocumentCodes
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State.equals(java.lang.Object):boolean");
        }

        public final List<LegalDocument> getAllDocuments() {
            return this.allDocuments;
        }

        public final Set<String> getFailedContentDocumentCodes() {
            return this.failedContentDocumentCodes;
        }

        public final Throwable getLoadDocumentsError() {
            return this.loadDocumentsError;
        }

        public final boolean getLoading() {
            return this.allDocuments.isEmpty() && this.loadDocumentsError == null;
        }

        public final LegalDocument getOpenDocument() {
            Object obj;
            Iterator it = this.allDocuments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12880j.m40224a((Object) ((LegalDocument) obj).getDocumentCode(), (Object) this.openDocumentCode)) {
                    break;
                }
            }
            return (LegalDocument) obj;
        }

        public final String getOpenDocumentCode() {
            return this.openDocumentCode;
        }

        public final CharSequence getOpenDocumentSpanned() {
            String str = this.openDocumentCode;
            if (str != null) {
                return (CharSequence) this.spannedDocumentContent.get(str);
            }
            return null;
        }

        public final Map<String, CharSequence> getSpannedDocumentContent() {
            return this.spannedDocumentContent;
        }

        public int hashCode() {
            List<LegalDocument> list = this.allDocuments;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.openDocumentCode;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Map<String, CharSequence> map = this.spannedDocumentContent;
            int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
            Throwable th = this.loadDocumentsError;
            int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
            Set<String> set = this.failedContentDocumentCodes;
            if (set != null) {
                i = set.hashCode();
            }
            return hashCode4 + i;
        }

        public final boolean isOffline() {
            return this.allDocuments.isEmpty() && this.loadDocumentsError != null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(allDocuments=");
            sb.append(this.allDocuments);
            sb.append(", openDocumentCode=");
            sb.append(this.openDocumentCode);
            sb.append(", spannedDocumentContent=");
            sb.append(this.spannedDocumentContent);
            sb.append(", loadDocumentsError=");
            sb.append(this.loadDocumentsError);
            sb.append(", failedContentDocumentCodes=");
            sb.append(this.failedContentDocumentCodes);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ State(List list, String str, Map map, Throwable th, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            Throwable th2 = null;
            String str2 = (i & 2) != 0 ? null : str;
            if ((i & 4) != 0) {
                map = C13173j0.m40350a();
            }
            Map map2 = map;
            if ((i & 8) == 0) {
                th2 = th;
            }
            if ((i & 16) != 0) {
                set = C13188p0.m40531a();
            }
            this(list, str2, map2, th2, set);
        }
    }

    public LegalCenterViewModel(LegalApi legalApi2, LegalLinkSpanHelper legalLinkSpanHelper, LegalCenterAnalytics legalCenterAnalytics, boolean z, LegalDocumentFinder legalDocumentFinder2, List<LegalDocument> list, String str, LegalItem legalItem) {
        List<LegalDocument> list2 = list;
        super(null, 1, null);
        this.legalApi = legalApi2;
        this.spanHelper = legalLinkSpanHelper;
        this.analytics = legalCenterAnalytics;
        this.isTelevision = z;
        this.legalDocumentFinder = legalDocumentFinder2;
        this.openDocumentCode = str;
        this.requestedLegalItem = legalItem;
        State state = new State(null, null, null, null, null, 31, null);
        createState(state);
        if (list2 != null) {
            onDisclosuresLoaded(list2);
        } else {
            loadAllDisclosures();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadDocumentContents(java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r5, com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State r6) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0009:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.bamtechmedia.dominguez.legal.api.LegalDocument r2 = (com.bamtechmedia.dominguez.legal.api.LegalDocument) r2
            java.lang.String r2 = r2.getDocumentCode()
            java.lang.String r3 = r6.getOpenDocumentCode()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x002a:
            java.lang.String r5 = r6.getOpenDocumentCode()
            if (r5 == 0) goto L_0x0037
            io.reactivex.Completable r5 = r4.loadSingleDocumentContent(r5)
            if (r5 == 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            io.reactivex.Completable r5 = p520io.reactivex.Completable.m38169h()
            java.lang.String r6 = "Completable.complete()"
            kotlin.jvm.internal.C12880j.m40222a(r5, r6)
        L_0x0040:
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r0, r1)
            r6.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r0.next()
            com.bamtechmedia.dominguez.legal.api.LegalDocument r1 = (com.bamtechmedia.dominguez.legal.api.LegalDocument) r1
            java.lang.String r1 = r1.getDocumentCode()
            io.reactivex.Completable r1 = r4.loadSingleDocumentContent(r1)
            r6.add(r1)
            goto L_0x004f
        L_0x0067:
            io.reactivex.Completable r6 = p520io.reactivex.Completable.m38161b(r6)
            io.reactivex.Completable r5 = r5.mo30034a(r6)
            java.lang.String r6 = "(currentState.openDocume…tent(it.documentCode) }))"
            kotlin.jvm.internal.C12880j.m40222a(r5, r6)
            g.n.a.c0 r6 = r4.getViewModelScope()
            g.n.a.h r6 = p163g.p503n.p504a.C11793e.m37930a(r6)
            java.lang.Object r5 = r5.mo30048a(r6)
            java.lang.String r6 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r5, r6)
            g.n.a.v r5 = (p163g.p503n.p504a.C11839v) r5
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel$loadDocumentContents$3 r6 = com.bamtechmedia.dominguez.legal.LegalCenterViewModel$loadDocumentContents$3.INSTANCE
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel$loadDocumentContents$4 r0 = com.bamtechmedia.dominguez.legal.LegalCenterViewModel$loadDocumentContents$4.INSTANCE
            r5.mo29926a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterViewModel.loadDocumentContents(java.util.List, com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State):void");
    }

    private final Completable loadSingleDocumentContent(String str) {
        Completable f = this.legalApi.getLegalDocContent(str).mo30227d((Consumer<? super T>) new LegalCenterViewModel$loadSingleDocumentContent$1<Object>(this, str)).mo30218b((Consumer<? super Throwable>) new LegalCenterViewModel$loadSingleDocumentContent$2<Object>(this, str)).mo30228e().mo30036a((Consumer<? super Throwable>) LegalCenterViewModel$loadSingleDocumentContent$3.INSTANCE).mo30055f();
        C12880j.m40222a((Object) f, "legalApi.getLegalDocCont…       .onErrorComplete()");
        return f;
    }

    /* access modifiers changed from: private */
    public final void onDisclosuresLoaded(List<LegalDocument> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Legal disclosures loaded: ");
        List<LegalDocument> list2 = list;
        sb.append(C13199w.m40559a(list2, ",", null, null, 0, null, LegalCenterViewModel$onDisclosuresLoaded$1.INSTANCE, 30, null));
        C14100a.m44529c(sb.toString(), new Object[0]);
        updateState(new LegalCenterViewModel$onDisclosuresLoaded$2(this, list));
    }

    public static /* synthetic */ void onDocumentSelected$default(LegalCenterViewModel legalCenterViewModel, LegalDocument legalDocument, int i, Object obj) {
        if ((i & 1) != 0) {
            legalDocument = null;
        }
        legalCenterViewModel.onDocumentSelected(legalDocument);
    }

    /* access modifiers changed from: private */
    public final void onLegalContentLoadFailed(String str) {
        updateState(new LegalCenterViewModel$onLegalContentLoadFailed$1(str));
    }

    /* access modifiers changed from: private */
    public final void onLegalContentLoaded(String str, LegalDocContent legalDocContent) {
        updateState(new LegalCenterViewModel$onLegalContentLoaded$1(this, str, legalDocContent));
    }

    /* access modifiers changed from: private */
    public final CharSequence toSpannableString(LegalDocContent legalDocContent) {
        return this.spanHelper.applySpans(legalDocContent, new LegalCenterViewModel$toSpannableString$1(this));
    }

    /* access modifiers changed from: private */
    public final C13145v trackPageLoad(State state) {
        LegalDocument openDocument = state.getOpenDocument();
        if (openDocument == null) {
            return null;
        }
        this.analytics.trackSectionOpened(openDocument.getTitle());
        return C13145v.f29587a;
    }

    public final void loadAllDisclosures() {
        C14100a.m44529c("Loading all Legal Disclosures", new Object[0]);
        Single g = this.legalApi.getLegalData().mo30233g(LegalCenterViewModel$loadAllDisclosures$1.INSTANCE);
        C12880j.m40222a((Object) g, "legalApi.getLegalData()\n…umentCode }\n            }");
        Object a = g.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new LegalCenterViewModel$loadAllDisclosures$2(this), new LegalCenterViewModel$loadAllDisclosures$3(this));
    }

    public final void onDocumentSelected(LegalDocument legalDocument) {
        updateState(new LegalCenterViewModel$onDocumentSelected$1(this, legalDocument));
    }

    public final void retryLoadContent(String str) {
        Object a = loadSingleDocumentContent(str).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(LegalCenterViewModel$retryLoadContent$1.INSTANCE, LegalCenterViewModel$retryLoadContent$2.INSTANCE);
    }
}
