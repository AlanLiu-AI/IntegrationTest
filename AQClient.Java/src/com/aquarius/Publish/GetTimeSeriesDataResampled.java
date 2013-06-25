
package com.aquarius.Publish;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishView" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleIntervalInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="anchorTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dataId",
    "publishView",
    "queryFromTime",
    "queryToTime",
    "sampleIntervalInMinutes",
    "anchorTime"
})
@XmlRootElement(name = "GetTimeSeriesDataResampled")
public class GetTimeSeriesDataResampled {

    @XmlElementRef(name = "dataId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataId;
    @XmlElementRef(name = "publishView", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publishView;
    @XmlElementRef(name = "queryFromTime", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryFromTime;
    @XmlElementRef(name = "queryToTime", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryToTime;
    protected Integer sampleIntervalInMinutes;
    @XmlElementRef(name = "anchorTime", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anchorTime;

    /**
     * Gets the value of the dataId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataId() {
        return dataId;
    }

    /**
     * Sets the value of the dataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataId(JAXBElement<String> value) {
        this.dataId = value;
    }

    /**
     * Gets the value of the publishView property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishView() {
        return publishView;
    }

    /**
     * Sets the value of the publishView property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishView(JAXBElement<String> value) {
        this.publishView = value;
    }

    /**
     * Gets the value of the queryFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryFromTime() {
        return queryFromTime;
    }

    /**
     * Sets the value of the queryFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryFromTime(JAXBElement<String> value) {
        this.queryFromTime = value;
    }

    /**
     * Gets the value of the queryToTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryToTime() {
        return queryToTime;
    }

    /**
     * Sets the value of the queryToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryToTime(JAXBElement<String> value) {
        this.queryToTime = value;
    }

    /**
     * Gets the value of the sampleIntervalInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleIntervalInMinutes() {
        return sampleIntervalInMinutes;
    }

    /**
     * Sets the value of the sampleIntervalInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleIntervalInMinutes(Integer value) {
        this.sampleIntervalInMinutes = value;
    }

    /**
     * Gets the value of the anchorTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnchorTime() {
        return anchorTime;
    }

    /**
     * Sets the value of the anchorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnchorTime(JAXBElement<String> value) {
        this.anchorTime = value;
    }

}
