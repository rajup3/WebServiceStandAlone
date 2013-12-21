
package rp3.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUserListRequest" type="{http://mdm.service.rp3/}UserListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserList", propOrder = {
    "getUserListRequest"
})
public class GetUserList {

    @XmlElement(name = "GetUserListRequest")
    protected UserListRequest getUserListRequest;

    /**
     * Gets the value of the getUserListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserListRequest }
     *     
     */
    public UserListRequest getGetUserListRequest() {
        return getUserListRequest;
    }

    /**
     * Sets the value of the getUserListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListRequest }
     *     
     */
    public void setGetUserListRequest(UserListRequest value) {
        this.getUserListRequest = value;
    }

}
