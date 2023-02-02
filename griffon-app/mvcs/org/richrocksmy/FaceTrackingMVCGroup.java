package org.richrocksmy;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("FaceTracking")
public class FaceTrackingMVCGroup extends AbstractTypedMVCGroup<FaceTrackingModel, FaceTrackingView, FaceTrackingController> {
    public FaceTrackingMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}
