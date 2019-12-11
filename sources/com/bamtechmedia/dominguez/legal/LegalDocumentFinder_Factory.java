package com.bamtechmedia.dominguez.legal;

import p512h.p515d.C11895c;

public final class LegalDocumentFinder_Factory implements C11895c<LegalDocumentFinder> {
    private static final LegalDocumentFinder_Factory INSTANCE = new LegalDocumentFinder_Factory();

    public static LegalDocumentFinder_Factory create() {
        return INSTANCE;
    }

    public static LegalDocumentFinder newInstance() {
        return new LegalDocumentFinder();
    }

    public LegalDocumentFinder get() {
        return new LegalDocumentFinder();
    }
}
