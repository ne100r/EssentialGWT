package com.fkereki.sample.sampleproject.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SampleprojectServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
