package com.bamtechmedia.dominguez.legal;

import p512h.p515d.C11895c;

public final class LegalLinkHandler_Factory implements C11895c<LegalLinkHandler> {
    private static final LegalLinkHandler_Factory INSTANCE = new LegalLinkHandler_Factory();

    public static LegalLinkHandler_Factory create() {
        return INSTANCE;
    }

    public static LegalLinkHandler newInstance() {
        return new LegalLinkHandler();
    }

    public LegalLinkHandler get() {
        return new LegalLinkHandler();
    }
}
