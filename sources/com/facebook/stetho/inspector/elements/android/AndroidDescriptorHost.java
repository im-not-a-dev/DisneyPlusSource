package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.inspector.elements.Descriptor.Host;

interface AndroidDescriptorHost extends Host {
    HighlightableDescriptor getHighlightableDescriptor(Object obj);
}
