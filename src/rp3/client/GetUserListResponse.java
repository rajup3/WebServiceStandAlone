
package rp3.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUserListResponse" type="{http://mdm.service.rp3/}UserListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserListResponse", propOrder = {
    "getUserListResponse"
})
public class GetUserListResponse {

    @XmlElement(name = "GetUserListResponse")
    protected UserListResponse getUserListResponse;

    /**
     * Gets the value of the getUserListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserListResponse }
     *     
     */
    public UserListResponse getGetUserListResponse() {
        return getUserListResponse;
    }

    /**
     * Sets the value of the getUserListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListResponse }
     *     
     */
    public void setGetUserListResponse(UserListResponse value) {
        this.getUserListResponse = value;
    }

}
