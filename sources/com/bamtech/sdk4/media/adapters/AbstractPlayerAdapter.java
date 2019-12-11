package com.bamtech.sdk4.media.adapters;

import com.bamtech.sdk4.media.drm.DrmProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0016\u0010\n\u001a\u00020!2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0012H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u000e8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00128DX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001c@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "()V", "QOSListener", "Lcom/bamtech/sdk4/media/QOSListener;", "getQOSListener", "()Lcom/bamtech/sdk4/media/QOSListener;", "<set-?>", "", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "drmProviders", "getDrmProviders", "()Ljava/util/Set;", "internalPlaybackEventBroadcaster", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "getInternalPlaybackEventBroadcaster$extension_media_release", "()Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "internalQosEventBroadcaster", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "getInternalQosEventBroadcaster$extension_media_release", "()Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "listeners", "", "listenersQOS", "playbackEventBroadcaster", "getPlaybackEventBroadcaster", "qosEventBroadcaster", "getQosEventBroadcaster", "", "token", "getToken", "()Ljava/lang/String;", "addListener", "", "listener", "listenerQOS", "clean", "getQosMetaData", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$QosMetadata;", "onQosEvent", "event", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "removeListener", "QosMetadata", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AbstractPlayerAdapter.kt */
public abstract class AbstractPlayerAdapter implements PlayerAdapter {
    private Set<? extends DrmProvider> drmProviders;
    private final PlaybackEventListener internalPlaybackEventBroadcaster = new AbstractPlayerAdapter$internalPlaybackEventBroadcaster$1(this);
    private final QOSPlaybackEventListener internalQosEventBroadcaster = new AbstractPlayerAdapter$internalQosEventBroadcaster$1(this);
    /* access modifiers changed from: private */
    public final List<PlaybackEventListener> listeners = new ArrayList();
    /* access modifiers changed from: private */
    public final List<QOSPlaybackEventListener> listenersQOS = new ArrayList();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b-\b\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003Jx\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018¨\u0006;"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$QosMetadata;", "", "audioChannels", "", "audioCodec", "", "audioLanguage", "audioName", "subtitleLanguage", "subtitleName", "subtitleVisibility", "", "videoCodec", "playhead", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;J)V", "getAudioChannels", "()Ljava/lang/Integer;", "setAudioChannels", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAudioCodec", "()Ljava/lang/String;", "setAudioCodec", "(Ljava/lang/String;)V", "getAudioLanguage", "setAudioLanguage", "getAudioName", "setAudioName", "getPlayhead", "()J", "setPlayhead", "(J)V", "getSubtitleLanguage", "setSubtitleLanguage", "getSubtitleName", "setSubtitleName", "getSubtitleVisibility", "()Ljava/lang/Boolean;", "setSubtitleVisibility", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getVideoCodec", "setVideoCodec", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;J)Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$QosMetadata;", "equals", "other", "hashCode", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AbstractPlayerAdapter.kt */
    public static final class QosMetadata {
        private Integer audioChannels;
        private String audioCodec;
        private String audioLanguage;
        private String audioName;
        private long playhead;
        private String subtitleLanguage;
        private String subtitleName;
        private Boolean subtitleVisibility;
        private String videoCodec;

        public QosMetadata() {
            this(null, null, null, null, null, null, null, null, 0, 511, null);
        }

        public QosMetadata(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, long j) {
            this.audioChannels = num;
            this.audioCodec = str;
            this.audioLanguage = str2;
            this.audioName = str3;
            this.subtitleLanguage = str4;
            this.subtitleName = str5;
            this.subtitleVisibility = bool;
            this.videoCodec = str6;
            this.playhead = j;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof QosMetadata) {
                    QosMetadata qosMetadata = (QosMetadata) obj;
                    if (Intrinsics.areEqual((Object) this.audioChannels, (Object) qosMetadata.audioChannels) && Intrinsics.areEqual((Object) this.audioCodec, (Object) qosMetadata.audioCodec) && Intrinsics.areEqual((Object) this.audioLanguage, (Object) qosMetadata.audioLanguage) && Intrinsics.areEqual((Object) this.audioName, (Object) qosMetadata.audioName) && Intrinsics.areEqual((Object) this.subtitleLanguage, (Object) qosMetadata.subtitleLanguage) && Intrinsics.areEqual((Object) this.subtitleName, (Object) qosMetadata.subtitleName) && Intrinsics.areEqual((Object) this.subtitleVisibility, (Object) qosMetadata.subtitleVisibility) && Intrinsics.areEqual((Object) this.videoCodec, (Object) qosMetadata.videoCodec)) {
                        if (this.playhead == qosMetadata.playhead) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final Integer getAudioChannels() {
            return this.audioChannels;
        }

        public final String getAudioCodec() {
            return this.audioCodec;
        }

        public final String getAudioLanguage() {
            return this.audioLanguage;
        }

        public final String getAudioName() {
            return this.audioName;
        }

        public final String getSubtitleLanguage() {
            return this.subtitleLanguage;
        }

        public final String getSubtitleName() {
            return this.subtitleName;
        }

        public final Boolean getSubtitleVisibility() {
            return this.subtitleVisibility;
        }

        public final String getVideoCodec() {
            return this.videoCodec;
        }

        public int hashCode() {
            Integer num = this.audioChannels;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.audioCodec;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.audioLanguage;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.audioName;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.subtitleLanguage;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.subtitleName;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Boolean bool = this.subtitleVisibility;
            int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
            String str6 = this.videoCodec;
            if (str6 != null) {
                i = str6.hashCode();
            }
            int i2 = (hashCode7 + i) * 31;
            long j = this.playhead;
            return i2 + ((int) (j ^ (j >>> 32)));
        }

        public final void setAudioChannels(Integer num) {
            this.audioChannels = num;
        }

        public final void setAudioCodec(String str) {
            this.audioCodec = str;
        }

        public final void setAudioLanguage(String str) {
            this.audioLanguage = str;
        }

        public final void setAudioName(String str) {
            this.audioName = str;
        }

        public final void setPlayhead(long j) {
            this.playhead = j;
        }

        public final void setSubtitleLanguage(String str) {
            this.subtitleLanguage = str;
        }

        public final void setSubtitleName(String str) {
            this.subtitleName = str;
        }

        public final void setVideoCodec(String str) {
            this.videoCodec = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QosMetadata(audioChannels=");
            sb.append(this.audioChannels);
            sb.append(", audioCodec=");
            sb.append(this.audioCodec);
            sb.append(", audioLanguage=");
            sb.append(this.audioLanguage);
            sb.append(", audioName=");
            sb.append(this.audioName);
            sb.append(", subtitleLanguage=");
            sb.append(this.subtitleLanguage);
            sb.append(", subtitleName=");
            sb.append(this.subtitleName);
            sb.append(", subtitleVisibility=");
            sb.append(this.subtitleVisibility);
            sb.append(", videoCodec=");
            sb.append(this.videoCodec);
            sb.append(", playhead=");
            sb.append(this.playhead);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ QosMetadata(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            int i2 = i;
            String str7 = null;
            Integer num2 = (i2 & 1) != 0 ? null : num;
            String str8 = (i2 & 2) != 0 ? null : str;
            String str9 = (i2 & 4) != 0 ? null : str2;
            String str10 = (i2 & 8) != 0 ? null : str3;
            String str11 = (i2 & 16) != 0 ? null : str4;
            String str12 = (i2 & 32) != 0 ? null : str5;
            Boolean bool2 = (i2 & 64) != 0 ? null : bool;
            if ((i2 & 128) == 0) {
                str7 = str6;
            }
            this(num2, str8, str9, str10, str11, str12, bool2, str7, (i2 & 256) != 0 ? 0 : j);
        }
    }

    public void addListener(PlaybackEventListener playbackEventListener) {
        this.listeners.add(playbackEventListener);
    }

    public void clean() {
        this.listeners.clear();
        this.listenersQOS.clear();
    }

    public void drmProviders(Set<? extends DrmProvider> set) {
        this.drmProviders = set;
    }

    /* access modifiers changed from: protected */
    public final Set<DrmProvider> getDrmProviders() {
        Set<? extends DrmProvider> set = this.drmProviders;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drmProviders");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final PlaybackEventListener getPlaybackEventBroadcaster() {
        return this.internalPlaybackEventBroadcaster;
    }

    /* access modifiers changed from: protected */
    public final QOSPlaybackEventListener getQosEventBroadcaster() {
        return this.internalQosEventBroadcaster;
    }

    public void addListener(QOSPlaybackEventListener qOSPlaybackEventListener) {
        this.listenersQOS.add(qOSPlaybackEventListener);
    }
}
