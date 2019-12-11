package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
final class C10261z8 extends SSLSocket {

    /* renamed from: c */
    private final SSLSocket f24095c;

    C10261z8(C10241x8 x8Var, SSLSocket sSLSocket) {
        this.f24095c = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f24095c.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f24095c.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f24095c.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f24095c.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f24095c.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f24095c.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f24095c.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f24095c.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f24095c.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f24095c.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f24095c.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f24095c.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f24095c.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f24095c.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f24095c.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f24095c.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f24095c.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f24095c.getOutputStream();
    }

    public final int getPort() {
        return this.f24095c.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f24095c.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f24095c.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f24095c.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f24095c.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f24095c.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.f24095c.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f24095c.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f24095c.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f24095c.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f24095c.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f24095c.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f24095c.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f24095c.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f24095c.isBound();
    }

    public final boolean isClosed() {
        return this.f24095c.isClosed();
    }

    public final boolean isConnected() {
        return this.f24095c.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f24095c.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f24095c.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f24095c.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f24095c.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f24095c.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f24095c.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            String str = "SSLv3";
            if (Arrays.asList(strArr).contains(str)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f24095c.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove(str);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
        this.f24095c.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f24095c.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f24095c.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f24095c.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f24095c.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f24095c.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f24095c.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f24095c.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f24095c.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f24095c.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f24095c.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f24095c.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f24095c.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f24095c.setWantClientAuth(z);
    }

    public final void shutdownInput() throws IOException {
        this.f24095c.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f24095c.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.f24095c.startHandshake();
    }

    public final String toString() {
        return this.f24095c.toString();
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f24095c.connect(socketAddress, i);
    }
}
