package com.fkereki.sample.sampleproject.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("SampleprojectService")
public interface SampleprojectService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use SampleprojectService.App.getInstance() to access static instance of SampleprojectServiceAsync
     */
    public static class App {
        private static SampleprojectServiceAsync ourInstance = GWT.create(SampleprojectService.class);

        public static synchronized SampleprojectServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
