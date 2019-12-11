package com.bamtechmedia.dominguez.core.content.containers;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "", "configKey", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getConfigKey", "()Ljava/lang/String;", "HeroContainer", "HeroFullBleedContainer", "GridContainer", "ShelfContainer", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@Keep
/* compiled from: ContainerModels.kt */
public enum ContainerType {
    HeroContainer("hero"),
    HeroFullBleedContainer("hero_full_bleed"),
    GridContainer(r2),
    ShelfContainer(r2);
    
    private final String configKey;

    private ContainerType(String str) {
        this.configKey = str;
    }

    public final String getConfigKey() {
        return this.configKey;
    }
}
