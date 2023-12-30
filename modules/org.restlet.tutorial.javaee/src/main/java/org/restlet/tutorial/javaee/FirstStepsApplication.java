/*
 * firstSteps
 * https://restlet.talend.com/documentation/user-guide/2.3/editions/jee/overview
 */
package org.restlet.tutorial.javaee;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * 
 * @author Restlet
 */
public class FirstStepsApplication extends Application {
    /**
     * Creates a root Restlet that will receive all incoming calls.
     * @return router
     */
    @Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attach("/hello", HelloWorldResource.class);

        return router;
    }
}
