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
 * Based on Restlet JAX-RS extension org.restlet.ext.jaxrs example
 * https://restlet.talend.com/documentation/user-guide/2.3/extensions/jaxrs
 */
package org.restlet.tutorial.jaxrs.javaee;

import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;

/**
 *
 * @author Restlet
 */
public class MyJaxRsApplication extends JaxRsApplication {

    public MyJaxRsApplication(Context context) {
        super(context);
        this.add(new ExampleApplication());
    }
}