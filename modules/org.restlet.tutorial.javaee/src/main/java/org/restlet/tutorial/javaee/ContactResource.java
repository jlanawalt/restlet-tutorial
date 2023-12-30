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

import java.util.Arrays;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
/**
 *
 * @author Jacob
 */
public class ContactResource extends ServerResource {
    
    /**
     * Return a Contact.
     * Jackson will return JSON by default, or XML if requested via Accept.
     * @return contact
     */
    @Get
    public Contact getContact() {
        String email = getAttribute("email");
        
        Contact contact = Arrays.stream(ContactsResource.contacts)
                .filter(c -> email.equals(c.getEmail()) )
                .findFirst().orElse(null);
                
        if (contact == null) {
            setExisting(false);
            throw new ErrorResponse("No contact with email: " + email);
        }
        else {
            setExisting(true);
        }
        
        return contact;
    }
}
