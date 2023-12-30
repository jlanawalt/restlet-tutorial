/*
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 *
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 *
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 *
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 *
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Based on firstSteps
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

        // Defines first route
        router.attach("/hello", HelloWorldResource.class);
        // Add a contacts list route
	router.attach("/contacts/", ContactsResource.class);
        // Add a contact by email route
        router.attach("/contacts/{email}", ContactResource.class);
        return router;
    }
}
