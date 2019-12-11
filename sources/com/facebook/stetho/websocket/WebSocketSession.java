package com.facebook.stetho.websocket;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

class WebSocketSession implements SimpleSession {
    /* access modifiers changed from: private */
    public final SimpleEndpoint mEndpoint;
    private final WriteCallback mErrorForwardingWriteCallback = new WriteCallback() {
        public void onFailure(IOException iOException) {
            WebSocketSession.this.signalError(iOException);
        }

        public void onSuccess() {
        }
    };
    private AtomicBoolean mIsOpen = new AtomicBoolean(false);
    private final ReadCallback mReadCallback = new ReadCallback() {
        private void handleBinaryFrame(byte[] bArr, int i) {
            WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, bArr, i);
        }

        private void handleClose(byte[] bArr, int i) {
            String str;
            byte b;
            if (i >= 2) {
                b = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                str = i > 2 ? new String(bArr, 2, i - 2) : null;
            } else {
                b = 1006;
                str = "Unparseable close frame";
            }
            if (!WebSocketSession.this.mSentClose) {
                WebSocketSession.this.sendClose(1000, "Received close frame");
            }
            WebSocketSession.this.markAndSignalClosed(b, str);
        }

        private void handlePing(byte[] bArr, int i) {
            WebSocketSession.this.doWrite(FrameHelper.createPongFrame(bArr, i));
        }

        private void handlePong(byte[] bArr, int i) {
        }

        private void handleTextFrame(byte[] bArr, int i) {
            WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, new String(bArr, 0, i));
        }

        public void onCompleteFrame(byte b, byte[] bArr, int i) {
            if (b == 1) {
                handleTextFrame(bArr, i);
            } else if (b != 2) {
                switch (b) {
                    case 8:
                        handleClose(bArr, i);
                        return;
                    case 9:
                        handlePing(bArr, i);
                        return;
                    case 10:
                        handlePong(bArr, i);
                        return;
                    default:
                        WebSocketSession webSocketSession = WebSocketSession.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported frame opcode=");
                        sb.append(b);
                        webSocketSession.signalError(new IOException(sb.toString()));
                        return;
                }
            } else {
                handleBinaryFrame(bArr, i);
            }
        }
    };
    private final ReadHandler mReadHandler;
    /* access modifiers changed from: private */
    public volatile boolean mSentClose;
    private final WriteHandler mWriteHandler;

    public WebSocketSession(InputStream inputStream, OutputStream outputStream, SimpleEndpoint simpleEndpoint) {
        this.mReadHandler = new ReadHandler(inputStream, simpleEndpoint);
        this.mWriteHandler = new WriteHandler(outputStream);
        this.mEndpoint = simpleEndpoint;
    }

    /* access modifiers changed from: private */
    public void doWrite(Frame frame) {
        if (!signalErrorIfNotOpen()) {
            this.mWriteHandler.write(frame, this.mErrorForwardingWriteCallback);
        }
    }

    /* access modifiers changed from: private */
    public void sendClose(int i, String str) {
        doWrite(FrameHelper.createCloseFrame(i, str));
        markSentClose();
    }

    /* access modifiers changed from: private */
    public void signalError(IOException iOException) {
        this.mEndpoint.onError(this, iOException);
    }

    private boolean signalErrorIfNotOpen() {
        if (isOpen()) {
            return false;
        }
        signalError(new IOException("Session is closed"));
        return true;
    }

    public void close(int i, String str) {
        sendClose(i, str);
        markAndSignalClosed(i, str);
    }

    public void handle() throws IOException {
        markAndSignalOpen();
        try {
            this.mReadHandler.readLoop(this.mReadCallback);
        } catch (EOFException unused) {
            markAndSignalClosed(CloseCodes.UNEXPECTED_CONDITION, "EOF while reading");
        } catch (IOException e) {
            markAndSignalClosed(CloseCodes.CLOSED_ABNORMALLY, null);
            throw e;
        }
    }

    public boolean isOpen() {
        return this.mIsOpen.get();
    }

    /* access modifiers changed from: 0000 */
    public void markAndSignalClosed(int i, String str) {
        if (this.mIsOpen.getAndSet(false)) {
            this.mEndpoint.onClose(this, i, str);
        }
    }

    /* access modifiers changed from: 0000 */
    public void markAndSignalOpen() {
        if (!this.mIsOpen.getAndSet(true)) {
            this.mEndpoint.onOpen(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void markSentClose() {
        this.mSentClose = true;
    }

    public void sendBinary(byte[] bArr) {
        doWrite(FrameHelper.createBinaryFrame(bArr));
    }

    public void sendText(String str) {
        doWrite(FrameHelper.createTextFrame(str));
    }
}
