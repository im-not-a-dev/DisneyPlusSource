package com.facebook.stetho.dumpapp;

class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b, byte b2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected '");
        sb.append(b);
        sb.append("', got: '");
        sb.append(b2);
        sb.append("'");
        super(sb.toString());
    }
}
