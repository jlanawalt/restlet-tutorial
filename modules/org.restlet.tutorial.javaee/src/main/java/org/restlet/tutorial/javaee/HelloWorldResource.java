/*
 * firstSteps
 * https://restlet.talend.com/documentation/user-guide/2.3/editions/jee/overview
 */

package org.restlet.tutorial.javaee;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 * @author Restlet
 */
public class HelloWorldResource extends ServerResource {
    @Get
    public String represent() {
        return "hello, world";
    }
}
