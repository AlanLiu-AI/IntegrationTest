
package com.aquarius.Publish;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aquarius.Publish package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _RatingCurveFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/AquariusDataService.Dto", "RatingCurveFilter");
    private final static QName _GetRatingTableExtensionResponseGetRatingTableExtensionResult_QNAME = new QName("http://tempuri.org/", "GetRatingTableExtensionResult");
    private final static QName _GetGradeListResponseGetGradeListResult_QNAME = new QName("http://tempuri.org/", "GetGradeListResult");
    private final static QName _GetRatingTableInputParameter_QNAME = new QName("http://tempuri.org/", "inputParameter");
    private final static QName _GetRatingTableOutputParameter_QNAME = new QName("http://tempuri.org/", "outputParameter");
    private final static QName _GetRatingTableLocationId_QNAME = new QName("http://tempuri.org/", "locationId");
    private final static QName _GetDataSetsListResponseGetDataSetsListResult_QNAME = new QName("http://tempuri.org/", "GetDataSetsListResult");
    private final static QName _GetLocationsFilter_QNAME = new QName("http://tempuri.org/", "filter");
    private final static QName _GetAuthTokenEncodedPassword_QNAME = new QName("http://tempuri.org/", "encodedPassword");
    private final static QName _GetAuthTokenUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _GetRatingTableExtensionLabel_QNAME = new QName("http://tempuri.org/", "label");
    private final static QName _GetTimeSeriesRawDataResponseGetTimeSeriesRawDataResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesRawDataResult");
    private final static QName _GetRatingTableAsCsvByIdentifierResponseGetRatingTableAsCsvByIdentifierResult_QNAME = new QName("http://tempuri.org/", "GetRatingTableAsCsvByIdentifierResult");
    private final static QName _GetRatingCurveListResponseGetRatingCurveListResult_QNAME = new QName("http://tempuri.org/", "GetRatingCurveListResult");
    private final static QName _GetTimeSeriesRawDataChangesSinceTime_QNAME = new QName("http://tempuri.org/", "changesSinceTime");
    private final static QName _GetTimeSeriesRawDataDataId_QNAME = new QName("http://tempuri.org/", "dataId");
    private final static QName _GetTimeSeriesRawDataQueryToTime_QNAME = new QName("http://tempuri.org/", "queryToTime");
    private final static QName _GetTimeSeriesRawDataAsAtTime_QNAME = new QName("http://tempuri.org/", "asAtTime");
    private final static QName _GetTimeSeriesRawDataPublishView_QNAME = new QName("http://tempuri.org/", "publishView");
    private final static QName _GetTimeSeriesRawDataQueryFromTime_QNAME = new QName("http://tempuri.org/", "queryFromTime");
    private final static QName _GetLocationsByFolderIdResponseGetLocationsByFolderIdResult_QNAME = new QName("http://tempuri.org/", "GetLocationsByFolderIdResult");
    private final static QName _GetTemplateListResponseGetTemplateListResult_QNAME = new QName("http://tempuri.org/", "GetTemplateListResult");
    private final static QName _GetTimeSeriesDataResampledAnchorTime_QNAME = new QName("http://tempuri.org/", "anchorTime");
    private final static QName _GetTimeSeriesDataResampledResponseGetTimeSeriesDataResampledResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesDataResampledResult");
    private final static QName _GetApprovalListResponseGetApprovalListResult_QNAME = new QName("http://tempuri.org/", "GetApprovalListResult");
    private final static QName _GetReportDataOutputPath_QNAME = new QName("http://tempuri.org/", "outputPath");
    private final static QName _GetReportDataReportName_QNAME = new QName("http://tempuri.org/", "reportName");
    private final static QName _GetReportDataReportId_QNAME = new QName("http://tempuri.org/", "reportId");
    private final static QName _GetRatingCurveListRatingCurveFilter_QNAME = new QName("http://tempuri.org/", "ratingCurveFilter");
    private final static QName _GetParameterListResponseGetParameterListResult_QNAME = new QName("http://tempuri.org/", "GetParameterListResult");
    private final static QName _GetAuthTokenResponseGetAuthTokenResult_QNAME = new QName("http://tempuri.org/", "GetAuthTokenResult");
    private final static QName _GetPublishViewListResponseGetPublishViewListResult_QNAME = new QName("http://tempuri.org/", "GetPublishViewListResult");
    private final static QName _GetLocationsResponseGetLocationsResult_QNAME = new QName("http://tempuri.org/", "GetLocationsResult");
    private final static QName _GetRatingTableAsCsvByIdentifierRatingCurveIdentifier_QNAME = new QName("http://tempuri.org/", "ratingCurveIdentifier");
    private final static QName _GetFlagListResponseGetFlagListResult_QNAME = new QName("http://tempuri.org/", "GetFlagListResult");
    private final static QName _GetTimeSeriesDataResponseGetTimeSeriesDataResult_QNAME = new QName("http://tempuri.org/", "GetTimeSeriesDataResult");
    private final static QName _GetRatingTableResponseGetRatingTableResult_QNAME = new QName("http://tempuri.org/", "GetRatingTableResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aquarius.Publish
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuthTokenResponse }
     * 
     */
    public GetAuthTokenResponse createGetAuthTokenResponse() {
        return new GetAuthTokenResponse();
    }

    /**
     * Create an instance of {@link GetRatingTableAsCsvByIdentifier }
     * 
     */
    public GetRatingTableAsCsvByIdentifier createGetRatingTableAsCsvByIdentifier() {
        return new GetRatingTableAsCsvByIdentifier();
    }

    /**
     * Create an instance of {@link KeepConnectionAlive }
     * 
     */
    public KeepConnectionAlive createKeepConnectionAlive() {
        return new KeepConnectionAlive();
    }

    /**
     * Create an instance of {@link GetTimeSeriesDataResponse }
     * 
     */
    public GetTimeSeriesDataResponse createGetTimeSeriesDataResponse() {
        return new GetTimeSeriesDataResponse();
    }

    /**
     * Create an instance of {@link GetReportDataResponse }
     * 
     */
    public GetReportDataResponse createGetReportDataResponse() {
        return new GetReportDataResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesDataResampledResponse }
     * 
     */
    public GetTimeSeriesDataResampledResponse createGetTimeSeriesDataResampledResponse() {
        return new GetTimeSeriesDataResampledResponse();
    }

    /**
     * Create an instance of {@link GetTimeSeriesDataResampled }
     * 
     */
    public GetTimeSeriesDataResampled createGetTimeSeriesDataResampled() {
        return new GetTimeSeriesDataResampled();
    }

    /**
     * Create an instance of {@link GetLocations }
     * 
     */
    public GetLocations createGetLocations() {
        return new GetLocations();
    }

    /**
     * Create an instance of {@link IsConnectionValidResponse }
     * 
     */
    public IsConnectionValidResponse createIsConnectionValidResponse() {
        return new IsConnectionValidResponse();
    }

    /**
     * Create an instance of {@link GetRatingTable }
     * 
     */
    public GetRatingTable createGetRatingTable() {
        return new GetRatingTable();
    }

    /**
     * Create an instance of {@link GetLocationsResponse }
     * 
     */
    public GetLocationsResponse createGetLocationsResponse() {
        return new GetLocationsResponse();
    }

    /**
     * Create an instance of {@link GetTemplateList }
     * 
     */
    public GetTemplateList createGetTemplateList() {
        return new GetTemplateList();
    }

    /**
     * Create an instance of {@link GetRatingCurveListResponse }
     * 
     */
    public GetRatingCurveListResponse createGetRatingCurveListResponse() {
        return new GetRatingCurveListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetTimeSeriesRawData }
     * 
     */
    public GetTimeSeriesRawData createGetTimeSeriesRawData() {
        return new GetTimeSeriesRawData();
    }

    /**
     * Create an instance of {@link GetRatingTableResponse }
     * 
     */
    public GetRatingTableResponse createGetRatingTableResponse() {
        return new GetRatingTableResponse();
    }

    /**
     * Create an instance of {@link GetFlagListResponse }
     * 
     */
    public GetFlagListResponse createGetFlagListResponse() {
        return new GetFlagListResponse();
    }

    /**
     * Create an instance of {@link GetRatingTableExtension }
     * 
     */
    public GetRatingTableExtension createGetRatingTableExtension() {
        return new GetRatingTableExtension();
    }

    /**
     * Create an instance of {@link GetTimeSeriesData }
     * 
     */
    public GetTimeSeriesData createGetTimeSeriesData() {
        return new GetTimeSeriesData();
    }

    /**
     * Create an instance of {@link GetAuthToken }
     * 
     */
    public GetAuthToken createGetAuthToken() {
        return new GetAuthToken();
    }

    /**
     * Create an instance of {@link GetTimeSeriesRawDataResponse }
     * 
     */
    public GetTimeSeriesRawDataResponse createGetTimeSeriesRawDataResponse() {
        return new GetTimeSeriesRawDataResponse();
    }

    /**
     * Create an instance of {@link GetTemplateListResponse }
     * 
     */
    public GetTemplateListResponse createGetTemplateListResponse() {
        return new GetTemplateListResponse();
    }

    /**
     * Create an instance of {@link GetRatingCurveList }
     * 
     */
    public GetRatingCurveList createGetRatingCurveList() {
        return new GetRatingCurveList();
    }

    /**
     * Create an instance of {@link RatingCurveFilter }
     * 
     */
    public RatingCurveFilter createRatingCurveFilter() {
        return new RatingCurveFilter();
    }

    /**
     * Create an instance of {@link GetParameterListResponse }
     * 
     */
    public GetParameterListResponse createGetParameterListResponse() {
        return new GetParameterListResponse();
    }

    /**
     * Create an instance of {@link GetParameterList }
     * 
     */
    public GetParameterList createGetParameterList() {
        return new GetParameterList();
    }

    /**
     * Create an instance of {@link GetPublishViewListResponse }
     * 
     */
    public GetPublishViewListResponse createGetPublishViewListResponse() {
        return new GetPublishViewListResponse();
    }

    /**
     * Create an instance of {@link GetRatingTableExtensionResponse }
     * 
     */
    public GetRatingTableExtensionResponse createGetRatingTableExtensionResponse() {
        return new GetRatingTableExtensionResponse();
    }

    /**
     * Create an instance of {@link GetPublishViewList }
     * 
     */
    public GetPublishViewList createGetPublishViewList() {
        return new GetPublishViewList();
    }

    /**
     * Create an instance of {@link GetDataSetsList }
     * 
     */
    public GetDataSetsList createGetDataSetsList() {
        return new GetDataSetsList();
    }

    /**
     * Create an instance of {@link GetFlagList }
     * 
     */
    public GetFlagList createGetFlagList() {
        return new GetFlagList();
    }

    /**
     * Create an instance of {@link GetGradeListResponse }
     * 
     */
    public GetGradeListResponse createGetGradeListResponse() {
        return new GetGradeListResponse();
    }

    /**
     * Create an instance of {@link GetGradeList }
     * 
     */
    public GetGradeList createGetGradeList() {
        return new GetGradeList();
    }

    /**
     * Create an instance of {@link GetDataSetsListResponse }
     * 
     */
    public GetDataSetsListResponse createGetDataSetsListResponse() {
        return new GetDataSetsListResponse();
    }

    /**
     * Create an instance of {@link IsConnectionValid }
     * 
     */
    public IsConnectionValid createIsConnectionValid() {
        return new IsConnectionValid();
    }

    /**
     * Create an instance of {@link GetLocationsByFolderIdResponse }
     * 
     */
    public GetLocationsByFolderIdResponse createGetLocationsByFolderIdResponse() {
        return new GetLocationsByFolderIdResponse();
    }

    /**
     * Create an instance of {@link GetApprovalList }
     * 
     */
    public GetApprovalList createGetApprovalList() {
        return new GetApprovalList();
    }

    /**
     * Create an instance of {@link GetRatingTableAsCsvByIdentifierResponse }
     * 
     */
    public GetRatingTableAsCsvByIdentifierResponse createGetRatingTableAsCsvByIdentifierResponse() {
        return new GetRatingTableAsCsvByIdentifierResponse();
    }

    /**
     * Create an instance of {@link KeepConnectionAliveResponse }
     * 
     */
    public KeepConnectionAliveResponse createKeepConnectionAliveResponse() {
        return new KeepConnectionAliveResponse();
    }

    /**
     * Create an instance of {@link GetLocationsByFolderId }
     * 
     */
    public GetLocationsByFolderId createGetLocationsByFolderId() {
        return new GetLocationsByFolderId();
    }

    /**
     * Create an instance of {@link GetReportData }
     * 
     */
    public GetReportData createGetReportData() {
        return new GetReportData();
    }

    /**
     * Create an instance of {@link GetApprovalListResponse }
     * 
     */
    public GetApprovalListResponse createGetApprovalListResponse() {
        return new GetApprovalListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingCurveFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AquariusDataService.Dto", name = "RatingCurveFilter")
    public JAXBElement<RatingCurveFilter> createRatingCurveFilter(RatingCurveFilter value) {
        return new JAXBElement<RatingCurveFilter>(_RatingCurveFilter_QNAME, RatingCurveFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRatingTableExtensionResult", scope = GetRatingTableExtensionResponse.class)
    public JAXBElement<String> createGetRatingTableExtensionResponseGetRatingTableExtensionResult(String value) {
        return new JAXBElement<String>(_GetRatingTableExtensionResponseGetRatingTableExtensionResult_QNAME, String.class, GetRatingTableExtensionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetGradeListResult", scope = GetGradeListResponse.class)
    public JAXBElement<String> createGetGradeListResponseGetGradeListResult(String value) {
        return new JAXBElement<String>(_GetGradeListResponseGetGradeListResult_QNAME, String.class, GetGradeListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inputParameter", scope = GetRatingTable.class)
    public JAXBElement<String> createGetRatingTableInputParameter(String value) {
        return new JAXBElement<String>(_GetRatingTableInputParameter_QNAME, String.class, GetRatingTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "outputParameter", scope = GetRatingTable.class)
    public JAXBElement<String> createGetRatingTableOutputParameter(String value) {
        return new JAXBElement<String>(_GetRatingTableOutputParameter_QNAME, String.class, GetRatingTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationId", scope = GetRatingTable.class)
    public JAXBElement<String> createGetRatingTableLocationId(String value) {
        return new JAXBElement<String>(_GetRatingTableLocationId_QNAME, String.class, GetRatingTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataSetsListResult", scope = GetDataSetsListResponse.class)
    public JAXBElement<String> createGetDataSetsListResponseGetDataSetsListResult(String value) {
        return new JAXBElement<String>(_GetDataSetsListResponseGetDataSetsListResult_QNAME, String.class, GetDataSetsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetLocations.class)
    public JAXBElement<String> createGetLocationsFilter(String value) {
        return new JAXBElement<String>(_GetLocationsFilter_QNAME, String.class, GetLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "encodedPassword", scope = GetAuthToken.class)
    public JAXBElement<String> createGetAuthTokenEncodedPassword(String value) {
        return new JAXBElement<String>(_GetAuthTokenEncodedPassword_QNAME, String.class, GetAuthToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetAuthToken.class)
    public JAXBElement<String> createGetAuthTokenUser(String value) {
        return new JAXBElement<String>(_GetAuthTokenUser_QNAME, String.class, GetAuthToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inputParameter", scope = GetRatingTableExtension.class)
    public JAXBElement<String> createGetRatingTableExtensionInputParameter(String value) {
        return new JAXBElement<String>(_GetRatingTableInputParameter_QNAME, String.class, GetRatingTableExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "label", scope = GetRatingTableExtension.class)
    public JAXBElement<String> createGetRatingTableExtensionLabel(String value) {
        return new JAXBElement<String>(_GetRatingTableExtensionLabel_QNAME, String.class, GetRatingTableExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "outputParameter", scope = GetRatingTableExtension.class)
    public JAXBElement<String> createGetRatingTableExtensionOutputParameter(String value) {
        return new JAXBElement<String>(_GetRatingTableOutputParameter_QNAME, String.class, GetRatingTableExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationId", scope = GetRatingTableExtension.class)
    public JAXBElement<String> createGetRatingTableExtensionLocationId(String value) {
        return new JAXBElement<String>(_GetRatingTableLocationId_QNAME, String.class, GetRatingTableExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesRawDataResult", scope = GetTimeSeriesRawDataResponse.class)
    public JAXBElement<String> createGetTimeSeriesRawDataResponseGetTimeSeriesRawDataResult(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataResponseGetTimeSeriesRawDataResult_QNAME, String.class, GetTimeSeriesRawDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRatingTableAsCsvByIdentifierResult", scope = GetRatingTableAsCsvByIdentifierResponse.class)
    public JAXBElement<String> createGetRatingTableAsCsvByIdentifierResponseGetRatingTableAsCsvByIdentifierResult(String value) {
        return new JAXBElement<String>(_GetRatingTableAsCsvByIdentifierResponseGetRatingTableAsCsvByIdentifierResult_QNAME, String.class, GetRatingTableAsCsvByIdentifierResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRatingCurveListResult", scope = GetRatingCurveListResponse.class)
    public JAXBElement<ArrayOfstring> createGetRatingCurveListResponseGetRatingCurveListResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetRatingCurveListResponseGetRatingCurveListResult_QNAME, ArrayOfstring.class, GetRatingCurveListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changesSinceTime", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataChangesSinceTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataChangesSinceTime_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataId", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataDataId(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataDataId_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryToTime", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataQueryToTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryToTime_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "asAtTime", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataAsAtTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataAsAtTime_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publishView", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataPublishView(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataPublishView_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryFromTime", scope = GetTimeSeriesRawData.class)
    public JAXBElement<String> createGetTimeSeriesRawDataQueryFromTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryFromTime_QNAME, String.class, GetTimeSeriesRawData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLocationsByFolderIdResult", scope = GetLocationsByFolderIdResponse.class)
    public JAXBElement<String> createGetLocationsByFolderIdResponseGetLocationsByFolderIdResult(String value) {
        return new JAXBElement<String>(_GetLocationsByFolderIdResponseGetLocationsByFolderIdResult_QNAME, String.class, GetLocationsByFolderIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTemplateListResult", scope = GetTemplateListResponse.class)
    public JAXBElement<String> createGetTemplateListResponseGetTemplateListResult(String value) {
        return new JAXBElement<String>(_GetTemplateListResponseGetTemplateListResult_QNAME, String.class, GetTemplateListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changesSinceTime", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataChangesSinceTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataChangesSinceTime_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataId", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataDataId(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataDataId_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryToTime", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataQueryToTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryToTime_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "asAtTime", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataAsAtTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataAsAtTime_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publishView", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataPublishView(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataPublishView_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryFromTime", scope = GetTimeSeriesData.class)
    public JAXBElement<String> createGetTimeSeriesDataQueryFromTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryFromTime_QNAME, String.class, GetTimeSeriesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataId", scope = GetTimeSeriesDataResampled.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledDataId(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataDataId_QNAME, String.class, GetTimeSeriesDataResampled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "anchorTime", scope = GetTimeSeriesDataResampled.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledAnchorTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesDataResampledAnchorTime_QNAME, String.class, GetTimeSeriesDataResampled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryToTime", scope = GetTimeSeriesDataResampled.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledQueryToTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryToTime_QNAME, String.class, GetTimeSeriesDataResampled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "publishView", scope = GetTimeSeriesDataResampled.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledPublishView(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataPublishView_QNAME, String.class, GetTimeSeriesDataResampled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryFromTime", scope = GetTimeSeriesDataResampled.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledQueryFromTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataQueryFromTime_QNAME, String.class, GetTimeSeriesDataResampled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filter", scope = GetLocationsByFolderId.class)
    public JAXBElement<String> createGetLocationsByFolderIdFilter(String value) {
        return new JAXBElement<String>(_GetLocationsFilter_QNAME, String.class, GetLocationsByFolderId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesDataResampledResult", scope = GetTimeSeriesDataResampledResponse.class)
    public JAXBElement<String> createGetTimeSeriesDataResampledResponseGetTimeSeriesDataResampledResult(String value) {
        return new JAXBElement<String>(_GetTimeSeriesDataResampledResponseGetTimeSeriesDataResampledResult_QNAME, String.class, GetTimeSeriesDataResampledResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetApprovalListResult", scope = GetApprovalListResponse.class)
    public JAXBElement<String> createGetApprovalListResponseGetApprovalListResult(String value) {
        return new JAXBElement<String>(_GetApprovalListResponseGetApprovalListResult_QNAME, String.class, GetApprovalListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataId", scope = GetReportData.class)
    public JAXBElement<String> createGetReportDataDataId(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataDataId_QNAME, String.class, GetReportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "outputPath", scope = GetReportData.class)
    public JAXBElement<String> createGetReportDataOutputPath(String value) {
        return new JAXBElement<String>(_GetReportDataOutputPath_QNAME, String.class, GetReportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reportName", scope = GetReportData.class)
    public JAXBElement<String> createGetReportDataReportName(String value) {
        return new JAXBElement<String>(_GetReportDataReportName_QNAME, String.class, GetReportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reportId", scope = GetReportData.class)
    public JAXBElement<String> createGetReportDataReportId(String value) {
        return new JAXBElement<String>(_GetReportDataReportId_QNAME, String.class, GetReportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingCurveFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ratingCurveFilter", scope = GetRatingCurveList.class)
    public JAXBElement<RatingCurveFilter> createGetRatingCurveListRatingCurveFilter(RatingCurveFilter value) {
        return new JAXBElement<RatingCurveFilter>(_GetRatingCurveListRatingCurveFilter_QNAME, RatingCurveFilter.class, GetRatingCurveList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetParameterListResult", scope = GetParameterListResponse.class)
    public JAXBElement<String> createGetParameterListResponseGetParameterListResult(String value) {
        return new JAXBElement<String>(_GetParameterListResponseGetParameterListResult_QNAME, String.class, GetParameterListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAuthTokenResult", scope = GetAuthTokenResponse.class)
    public JAXBElement<String> createGetAuthTokenResponseGetAuthTokenResult(String value) {
        return new JAXBElement<String>(_GetAuthTokenResponseGetAuthTokenResult_QNAME, String.class, GetAuthTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changesSinceTime", scope = GetDataSetsList.class)
    public JAXBElement<String> createGetDataSetsListChangesSinceTime(String value) {
        return new JAXBElement<String>(_GetTimeSeriesRawDataChangesSinceTime_QNAME, String.class, GetDataSetsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationId", scope = GetDataSetsList.class)
    public JAXBElement<String> createGetDataSetsListLocationId(String value) {
        return new JAXBElement<String>(_GetRatingTableLocationId_QNAME, String.class, GetDataSetsList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPublishViewListResult", scope = GetPublishViewListResponse.class)
    public JAXBElement<String> createGetPublishViewListResponseGetPublishViewListResult(String value) {
        return new JAXBElement<String>(_GetPublishViewListResponseGetPublishViewListResult_QNAME, String.class, GetPublishViewListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLocationsResult", scope = GetLocationsResponse.class)
    public JAXBElement<String> createGetLocationsResponseGetLocationsResult(String value) {
        return new JAXBElement<String>(_GetLocationsResponseGetLocationsResult_QNAME, String.class, GetLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ratingCurveIdentifier", scope = GetRatingTableAsCsvByIdentifier.class)
    public JAXBElement<String> createGetRatingTableAsCsvByIdentifierRatingCurveIdentifier(String value) {
        return new JAXBElement<String>(_GetRatingTableAsCsvByIdentifierRatingCurveIdentifier_QNAME, String.class, GetRatingTableAsCsvByIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFlagListResult", scope = GetFlagListResponse.class)
    public JAXBElement<String> createGetFlagListResponseGetFlagListResult(String value) {
        return new JAXBElement<String>(_GetFlagListResponseGetFlagListResult_QNAME, String.class, GetFlagListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimeSeriesDataResult", scope = GetTimeSeriesDataResponse.class)
    public JAXBElement<String> createGetTimeSeriesDataResponseGetTimeSeriesDataResult(String value) {
        return new JAXBElement<String>(_GetTimeSeriesDataResponseGetTimeSeriesDataResult_QNAME, String.class, GetTimeSeriesDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRatingTableResult", scope = GetRatingTableResponse.class)
    public JAXBElement<String> createGetRatingTableResponseGetRatingTableResult(String value) {
        return new JAXBElement<String>(_GetRatingTableResponseGetRatingTableResult_QNAME, String.class, GetRatingTableResponse.class, value);
    }

}
