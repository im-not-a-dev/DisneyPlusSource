package com.bamtech.sdk4.content;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/GraphQlErrorLocation;", "", "line", "", "column", "(II)V", "getColumn", "()I", "getLine", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlResponse.kt */
public final class GraphQlErrorLocation {
    private final int column;
    private final int line;

    public GraphQlErrorLocation(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public static /* synthetic */ GraphQlErrorLocation copy$default(GraphQlErrorLocation graphQlErrorLocation, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = graphQlErrorLocation.line;
        }
        if ((i3 & 2) != 0) {
            i2 = graphQlErrorLocation.column;
        }
        return graphQlErrorLocation.copy(i, i2);
    }

    public final int component1() {
        return this.line;
    }

    public final int component2() {
        return this.column;
    }

    public final GraphQlErrorLocation copy(int i, int i2) {
        return new GraphQlErrorLocation(i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphQlErrorLocation) {
                GraphQlErrorLocation graphQlErrorLocation = (GraphQlErrorLocation) obj;
                if (this.line == graphQlErrorLocation.line) {
                    if (this.column == graphQlErrorLocation.column) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getLine() {
        return this.line;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GraphQlErrorLocation(line=");
        sb.append(this.line);
        sb.append(", column=");
        sb.append(this.column);
        sb.append(")");
        return sb.toString();
    }
}
