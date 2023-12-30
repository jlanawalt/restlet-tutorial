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
public class ContactsResource extends ServerResource {

    protected static final Contact[] contacts = new Contact[8];
    
    static {
        // Create static set of contacts
        contacts[0] = new Contact("john.doe@person.net","John","Doe");
        contacts[1] = new Contact("jane.doe@person.net","Jane","Doe");
        contacts[2] = new Contact("navn.navnesen@person.net","Navn","Navnesen");
        contacts[3] = new Contact("jan.jansen@person.net","Jan","Jansen");
        contacts[4] = new Contact("jan.modaal@person.net","Jan","Modaal");
        contacts[5] = new Contact("jan.soldaat@person.net","Jan","Soldaat");
        contacts[6] = new Contact("nomen.nescio@person.net","Nomen","Nescio");
        contacts[7] = new Contact("jean.dupont@person.net","Jean","Dupont");
    }
    
    @Get
    public Contacts getContacts() {
        Contacts list = new Contacts();
        list.setList(Arrays.asList(contacts));
        return list;
    }
}
