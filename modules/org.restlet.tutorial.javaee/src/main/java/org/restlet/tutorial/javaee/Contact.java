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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Simple Contact.
 * @author Jacob
 */
@JacksonXmlRootElement(localName = "contact")
@JsonInclude(Include.NON_NULL)
public class Contact {
    
    private String email;

    private String givenName;

    private String familyName;

    /** The URL of this resource. */
    private String self;

    public Contact(String email, String givenName, String familyName) {
        this.email = email;
        this.givenName = givenName;
        this.familyName = familyName;
        // Keeping it simple. Normally this would not be in the entity, nor hard-coded.
        this.self = "/contacts/" + email;
    }

    /**
     * Get the value of self
     *
     * @return the value of self
     */
    public String getSelf() {
        return self;
    }

    /**
     * Set the value of self
     *
     * @param self new value of self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * Get the value of familyName
     *
     * @return the value of familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Set the value of familyName
     *
     * @param familyName new value of familyName
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * Get the value of givenName
     *
     * @return the value of givenName
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Set the value of givenName
     *
     * @param givenName new value of givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
