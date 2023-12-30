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

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 *
 * @author Restlet
 */
public class HelloWorldResource extends ServerResource {

    // Adding the org.restlet.ext.jackson appears to make the responses vary
    // based on the request's Accept header values. String doesn't have
    // Jackson annotations so it returns the following error:
    // error on line 1 at column 1: Start tag expected, '<' not found
    // To avoid this, specify this @Get returns text/plain:
    @Get("txt")
    public String represent() {
        return "hello, world";
    }

    // Use a tool like bruno or curl, or a Restlet client to have more control
    // interacting with the API.
    
    // We can provide an XML response.
    @Get("xml")
    public String helloWorldXml() {
        return "<message>hello, world</message>";
    }

    // A JSON one
    @Get("json")
    public String helloWorldJson() {
        return "{\"message\": \"hello, world\"}";
    }

    // And HTML
    @Get("html")
    public String helloWorldHtml() {
        return "<!DOCTYPE html>\n"
                + "<html lang='en'>\n"
                + " <head>\n"
                + "  <title>hello, world</title>\n"
                + "  <meta charset='utf-8'>\n"
                + "  <style>\n"
                + "  </style>\n"
                + "  <script>\n"
                + "  </script>\n"
                + " </head>\n"
                + " <body>\n"
                + "hello, world\n"
                + " </body>\n"
                + "</html>";
    }
}
