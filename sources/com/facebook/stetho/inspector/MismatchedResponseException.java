package com.facebook.stetho.inspector;

public class MismatchedResponseException extends MessageHandlingException {
    public long mRequestId;

    public MismatchedResponseException(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Response for request id ");
        sb.append(j);
        sb.append(", but no such request is pending");
        super(sb.toString());
        this.mRequestId = j;
    }

    public long getRequestId() {
        return this.mRequestId;
    }
}
