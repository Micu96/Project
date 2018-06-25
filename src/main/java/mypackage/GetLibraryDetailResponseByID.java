
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LibraryDetailsByID" type="{http://in28minutes.com/courses}LibraryDetailsByID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "libraryDetailsByID"
})
@XmlRootElement(name = "GetLibraryDetailResponseByID", namespace = "http://in28minutes.com/courses")
public class GetLibraryDetailResponseByID {

    @XmlElement(name = "LibraryDetailsByID", namespace = "http://in28minutes.com/courses", required = true)
    protected LibraryDetailsByID libraryDetailsByID;

    /**
     * Gets the value of the libraryDetailsByID property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDetailsByID }
     *     
     */
    public LibraryDetailsByID getLibraryDetailsByID() {
        return libraryDetailsByID;
    }

    /**
     * Sets the value of the libraryDetailsByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDetailsByID }
     *     
     */
    public void setLibraryDetailsByID(LibraryDetailsByID value) {
        this.libraryDetailsByID = value;
    }

}
