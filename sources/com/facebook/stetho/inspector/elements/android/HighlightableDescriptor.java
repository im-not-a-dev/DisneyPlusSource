package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;

public interface HighlightableDescriptor<E> {
    Object getElementToHighlightAtPosition(E e, int i, int i2, Rect rect);

    View getViewAndBoundsForHighlighting(E e, Rect rect);
}
