package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: DescriptorRenderer.kt */
public enum RenderingFormat {
    ;

    /* compiled from: DescriptorRenderer.kt */
    static final class HTML extends RenderingFormat {
        HTML(String str, int i) {
            super(str, i, null);
        }

        public String escape(String str) {
            return C12832w.m40117a(C12832w.m40117a(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class PLAIN extends RenderingFormat {
        PLAIN(String str, int i) {
            super(str, i, null);
        }

        public String escape(String str) {
            return str;
        }
    }

    public abstract String escape(String str);
}
