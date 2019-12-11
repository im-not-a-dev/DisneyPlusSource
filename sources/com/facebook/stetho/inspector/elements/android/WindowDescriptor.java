package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.Descriptor.Host;

final class WindowDescriptor extends AbstractChainedDescriptor<Window> implements HighlightableDescriptor<Window> {
    WindowDescriptor() {
    }

    public Object getElementToHighlightAtPosition(Window window, int i, int i2, Rect rect) {
        Object obj;
        HighlightableDescriptor highlightableDescriptor;
        Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            obj = window.peekDecorView();
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(obj);
        } else {
            obj = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getElementToHighlightAtPosition(obj, i, i2, rect);
    }

    public View getViewAndBoundsForHighlighting(Window window, Rect rect) {
        return window.peekDecorView();
    }

    /* access modifiers changed from: protected */
    public void onGetChildren(Window window, Accumulator<Object> accumulator) {
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            accumulator.store(peekDecorView);
        }
    }
}
