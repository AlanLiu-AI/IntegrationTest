
package com.aquarius.DataAcquisition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FieldVisitMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldVisitMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalLevelID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DisplayId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldVisitID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LaboratoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MeasurementDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeasurementEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MeasurementID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeasurementMediaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeasurementTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MeasurementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Results" type="{http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto}ArrayOfFieldVisitResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldVisitMeasurement", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", propOrder = {
    "approvalLevelID",
    "displayId",
    "fieldVisitID",
    "laboratoryId",
    "lastModified",
    "measurementDetails",
    "measurementEndTime",
    "measurementID",
    "measurementMediaId",
    "measurementTime",
    "measurementType",
    "remarks",
    "results"
})
public class FieldVisitMeasurement {

    @XmlElement(name = "ApprovalLevelID", required = true, type = Long.class, nillable = true)
    protected Long approvalLevelID;
    @XmlElementRef(name = "DisplayId", namespace = "http://schemas.datacontract.org/2004/07/AQAcquisitionService.Dto", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayId;
    @XmlElement(name = "FieldVisitID")
    protected long fieldVisitID;
    @XmlElement(name = "LaboratoryId", required = true, nillable = true)
    protected String laboratoryId;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "MeasurementDetails", required = true, nillable = true)
    protected String measurementDetails;
    @XmlElement(name = "MeasurementEndTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementEndTime;
    @XmlElement(name = "MeasurementID")
    protected long measurementID;
    @XmlElement(name = "MeasurementMediaId", required = true, type = Long.class, nillable = true)
    protected Long measurementMediaId;
    @XmlElement(name = "MeasurementTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementTime;
    @XmlElement(name = "MeasurementType", required = true, nillable = true)
    protected String measurementType;
    @XmlElement(name = "Remarks", required = true, nillable = true)
    protected String remarks;
    @XmlElement(name = "Results", required = true, nillable = true)
    protected ArrayOfFieldVisitResult results;

    /**
     * Gets the value of the approvalLevelID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApprovalLevelID() {
        return approvalLevelID;
    }

    /**
     * Sets the value of the approvalLevelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApprovalLevelID(Long value) {
        this.approvalLevelID = value;
    }

    /**
     * Gets the value of the displayId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayId() {
        return displayId;
    }

    /**
     * Sets the value of the displayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayId(JAXBElement<String> value) {
        this.displayId = value;
    }

    /**
     * Gets the value of the fieldVisitID property.
     * 
     */
    public long getFieldVisitID() {
        return fieldVisitID;
    }

    /**
     * Sets the value of the fieldVisitID property.
     * 
     */
    public void setFieldVisitID(long value) {
        this.fieldVisitID = value;
    }

    /**
     * Gets the value of the laboratoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaboratoryId() {
        return laboratoryId;
    }

    /**
     * Sets the value of the laboratoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaboratoryId(String value) {
        this.laboratoryId = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the measurementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementDetails() {
        return measurementDetails;
    }

    /**
     * Sets the value of the measurementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementDetails(String value) {
        this.measurementDetails = value;
    }

    /**
     * Gets the value of the measurementEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementEndTime() {
        return measurementEndTime;
    }

    /**
     * Sets the value of the measurementEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementEndTime(XMLGregorianCalendar value) {
        this.measurementEndTime = value;
    }

    /**
     * Gets the value of the measurementID property.
     * 
     */
    public long getMeasurementID() {
        return measurementID;
    }

    /**
     * Sets the value of the measurementID property.
     * 
     */
    public void setMeasurementID(long value) {
        this.measurementID = value;
    }

    /**
     * Gets the value of the measurementMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeasurementMediaId() {
        return measurementMediaId;
    }

    /**
     * Sets the value of the measurementMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurementMediaId(Long value) {
        this.measurementMediaId = value;
    }

    /**
     * Gets the value of the measurementTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementTime() {
        return measurementTime;
    }

    /**
     * Sets the value of the measurementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementTime(XMLGregorianCalendar value) {
        this.measurementTime = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldVisitResult }
     *     
     */
    public ArrayOfFieldVisitResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldVisitResult }
     *     
     */
    public void setResults(ArrayOfFieldVisitResult value) {
        this.results = value;
    }

}
