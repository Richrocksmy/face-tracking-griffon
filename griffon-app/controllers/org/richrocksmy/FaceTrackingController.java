package org.richrocksmy;

import griffon.core.artifact.GriffonController;
import griffon.core.controller.ControllerAction;
import griffon.inject.MVCMember;
import griffon.metadata.ArtifactProviderFor;

import griffon.transform.Threading;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonController;

import javax.annotation.Nonnull;

@ArtifactProviderFor(GriffonController.class)
public class FaceTrackingController extends AbstractGriffonController {
    private FaceTrackingModel model;

    @MVCMember
    public void setModel(@Nonnull FaceTrackingModel model) {
        this.model = model;
    }

    @ControllerAction
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    public void click() {
        model.setClickCount(model.getClickCount() + 1);
    }
}
