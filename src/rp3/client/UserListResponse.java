
package rp3.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sysUserList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserListResponse", propOrder = {
    "sysUserList"
})
public class UserListResponse {

    protected String sysUserList;

    /**
     * Gets the value of the sysUserList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysUserList() {
        return sysUserList;
    }

    /**
     * Sets the value of the sysUserList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysUserList(String value) {
        this.sysUserList = value;
    }

}
