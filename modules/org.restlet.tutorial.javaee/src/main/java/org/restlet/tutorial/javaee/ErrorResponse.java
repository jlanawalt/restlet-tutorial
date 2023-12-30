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
 */
package org.restlet.tutorial.javaee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.restlet.resource.Status;

/**
 * 404 not found exception.
 * 
 * The {@link Status} annotation allows the framework to
 * serialize the thrown exception and set the status of the HTTP response.<br>
 * This sample code leverages the {@link JsonIgnoreProperties} annotation in
 order to control the serialization: some properties are simply hidden. By
 default, only the exception message and the status property are serialized.
 any subclass is allowed to add some specific properties.
 
 Based off of RFSampleFullWebAPI ErrorResponse & BusinessException
 * @author Jacob
 */
@JsonIgnoreProperties({ "cause", "localizedMessage", "stackTrace", "suppressed" })
@Status(404)
public class ErrorResponse extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private final int status = 404;

    public ErrorResponse(String message) {
        super(message);
    }
    
    public ErrorResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public int getStatus() {
        return status;
    }
}
