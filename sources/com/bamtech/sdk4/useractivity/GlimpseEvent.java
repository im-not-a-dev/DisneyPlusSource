package com.bamtech.sdk4.useractivity;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0001\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "", "eventUrn", "", "(Ljava/lang/String;)V", "getEventUrn", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Custom", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent$Custom;", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GlimpseEvent.kt */
public abstract class GlimpseEvent {
    /* access modifiers changed from: private */
    public static final Custom AppLaunched = new Custom("urn:dss:glimpse:event:app-lifecycle:app-launched");
    /* access modifiers changed from: private */
    public static final Custom BackgroundPlaybackExited = new Custom("urn:dss:glimpse:track-action:background-playback-exited");
    /* access modifiers changed from: private */
    public static final Custom BackgroundPlaybackStarted = new Custom("urn:dss:glimpse:track-action:background-playback-started");
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final Custom ContentSelected = new Custom("urn:dss:glimpse:event:track-action:content-selected");
    /* access modifiers changed from: private */
    public static final Custom DownloadCompleted = new Custom("urn:dss:event:fed:content:download:completed");
    /* access modifiers changed from: private */
    public static final Custom DownloadDeleted = new Custom("urn:dss:event:fed:content:download:deleted");
    /* access modifiers changed from: private */
    public static final Custom DownloadFailed = new Custom("urn:dss:event:fed:content:download:failed");
    /* access modifiers changed from: private */
    public static final Custom DownloadRequested = new Custom("urn:dss:event:fed:content:download:requested");
    /* access modifiers changed from: private */
    public static final Custom DownloadResumed = new Custom("urn:dss:event:fed:content:download:resumed");
    /* access modifiers changed from: private */
    public static final Custom DownloadStateChange = new Custom("urn:dss:event:fed:content:download:stateChange");
    /* access modifiers changed from: private */
    public static final Custom PlaybackExited = new Custom("urn:dss:glimpse:event:track-action:playback-exited");
    /* access modifiers changed from: private */
    public static final Custom PlaybackSelected = new Custom("urn:dss:glimpse:event:track-action:playback-selected");
    /* access modifiers changed from: private */
    public static final Custom PurchaseCompleted = new Custom("urn:dss:glimpse:event:track-action:purchase-completed");
    /* access modifiers changed from: private */
    public static final Custom SearchViewLoaded = new Custom("urn:dss:glimpse:event:track-action:search-view-loaded");
    /* access modifiers changed from: private */
    public static final Custom ViewLoaded = new Custom("urn:dss:glimpse:event:track-state:view-loaded");
    private final String eventUrn;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/GlimpseEvent$Companion;", "", "()V", "AppLaunched", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent$Custom;", "getAppLaunched", "()Lcom/bamtech/sdk4/useractivity/GlimpseEvent$Custom;", "BackgroundPlaybackExited", "getBackgroundPlaybackExited", "BackgroundPlaybackStarted", "getBackgroundPlaybackStarted", "ContentSelected", "getContentSelected", "DownloadCompleted", "getDownloadCompleted", "DownloadDeleted", "getDownloadDeleted", "DownloadFailed", "getDownloadFailed", "DownloadRequested", "getDownloadRequested", "DownloadResumed", "getDownloadResumed", "DownloadStateChange", "getDownloadStateChange", "PlaybackExited", "getPlaybackExited", "PlaybackSelected", "getPlaybackSelected", "PurchaseCompleted", "getPurchaseCompleted", "SearchViewLoaded", "getSearchViewLoaded", "ViewLoaded", "getViewLoaded", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GlimpseEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Custom getAppLaunched() {
            return GlimpseEvent.AppLaunched;
        }

        public final Custom getContentSelected() {
            return GlimpseEvent.ContentSelected;
        }

        public final Custom getPlaybackExited() {
            return GlimpseEvent.PlaybackExited;
        }

        public final Custom getPlaybackSelected() {
            return GlimpseEvent.PlaybackSelected;
        }

        public final Custom getPurchaseCompleted() {
            return GlimpseEvent.PurchaseCompleted;
        }

        public final Custom getSearchViewLoaded() {
            return GlimpseEvent.SearchViewLoaded;
        }

        public final Custom getViewLoaded() {
            return GlimpseEvent.ViewLoaded;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/GlimpseEvent$Custom;", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "customEventUrn", "", "(Ljava/lang/String;)V", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GlimpseEvent.kt */
    public static final class Custom extends GlimpseEvent {
        public Custom(String str) {
            super(str, null);
        }
    }

    private GlimpseEvent(String str) {
        this.eventUrn = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GlimpseEvent) && Intrinsics.areEqual((Object) this.eventUrn, (Object) ((GlimpseEvent) obj).eventUrn);
    }

    public final String getEventUrn() {
        return this.eventUrn;
    }

    public int hashCode() {
        return this.eventUrn.hashCode();
    }

    public String toString() {
        return this.eventUrn;
    }

    public /* synthetic */ GlimpseEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
