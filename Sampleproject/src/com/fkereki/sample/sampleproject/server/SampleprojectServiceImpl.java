package com.fkereki.sample.sampleproject.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.fkereki.sample.sampleproject.client.SampleprojectService;

public class SampleprojectServiceImpl extends RemoteServiceServlet implements SampleprojectService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}