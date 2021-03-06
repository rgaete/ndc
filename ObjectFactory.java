
package ndc;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ndc package. 
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

    private final static QName _SegmentKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SegmentKey");
    private final static QName _TourCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TourCode");
    private final static QName _ORARecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ORA_Recipient");
    private final static QName _VoucherMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "VoucherMethod");
    private final static QName _OfferPenaltyMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferPenaltyMetadata");
    private final static QName _DetailCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DetailCurrencyPrice");
    private final static QName _InstructionsList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InstructionsList");
    private final static QName _TransferPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TransferPreferences");
    private final static QName _CountryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CountryMetadata");
    private final static QName _PointOfSale_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PointOfSale");
    private final static QName _EnabledSystemRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EnabledSystemRecipient");
    private final static QName _PaymentCardQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCardQualifiers");
    private final static QName _SocialMediaQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SocialMediaQualifiers");
    private final static QName _FareRuleCategory_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareRuleCategory");
    private final static QName _TravelAgencyParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TravelAgencyParticipant");
    private final static QName _Direction_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Direction");
    private final static QName _ReferencePointDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ReferencePointDeparture");
    private final static QName _StateProvArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StateProvArrival");
    private final static QName _PriceGuaranteeTimeLimits_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PriceGuaranteeTimeLimits");
    private final static QName _OtherItem_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherItem");
    private final static QName _FlownAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlownAirlineInfo");
    private final static QName _CarrierFeeInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CarrierFeeInfo");
    private final static QName _CountryArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CountryArrival");
    private final static QName _TripTime_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TripTime");
    private final static QName _OfferMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferMetadata");
    private final static QName _PINAuthenticationAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PIN_AuthenticationAlert");
    private final static QName _OrderPenalty_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderPenalty");
    private final static QName _DisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DisclosureMetadata");
    private final static QName _ORASender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ORA_Sender");
    private final static QName _DirectBillMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectBillMethod");
    private final static QName _EnabledSystemParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EnabledSystemParticipant");
    private final static QName _ValidatingCarrier_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ValidatingCarrier");
    private final static QName _FareBasisCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareBasisCode");
    private final static QName _AgencyID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgencyID");
    private final static QName _ItineraryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ItineraryMetadata");
    private final static QName _Aggregator_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Aggregator");
    private final static QName _SeatReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatReference");
    private final static QName _TripPurposeQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TripPurposeQualifier");
    private final static QName _AltOtherOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AltOtherOffer");
    private final static QName _AddlReferenceID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddlReferenceID");
    private final static QName _PolicyAugmentation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PolicyAugmentation");
    private final static QName _Day_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Day");
    private final static QName _PassengerReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReference");
    private final static QName _CampaignReferral_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CampaignReferral");
    private final static QName _ItemStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ItemStatus");
    private final static QName _AircraftMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AircraftMetadata");
    private final static QName _OfferPenaltyReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferPenaltyReferences");
    private final static QName _StopLocations_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StopLocations");
    private final static QName _TicketByTimeLimit_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TicketByTimeLimit");
    private final static QName _EnabledSystemSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EnabledSystemSender");
    private final static QName _CarryOnAllowanceList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CarryOnAllowanceList");
    private final static QName _DateTime_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DateTime");
    private final static QName _FareInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareInfo");
    private final static QName _SpecialNeedQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SpecialNeedQualifiers");
    private final static QName _FlightDistance_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightDistance");
    private final static QName _MediaGroupreference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MediaGroupreference");
    private final static QName _PaymentRulesNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentRulesNotice");
    private final static QName _AirlineOfferSnapshot_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirlineOfferSnapshot");
    private final static QName _SeatMapMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatMapMetadata");
    private final static QName _CurrencyAmountValue_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CurrencyAmountValue");
    private final static QName _DepartureDate_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DepartureDate");
    private final static QName _AggregatorSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AggregatorSender");
    private final static QName _OriginDestinationReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OriginDestinationReferences");
    private final static QName _CheckedBagReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CheckedBagReferences");
    private final static QName _PaymentTimeLimit_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentTimeLimit");
    private final static QName _CabinPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CabinPreferences");
    private final static QName _ContentSourceList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ContentSourceList");
    private final static QName _FreeFormTextInstruction_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FreeFormTextInstruction");
    private final static QName _LanguageMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "LanguageMetadata");
    private final static QName _TimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TimePeriod");
    private final static QName _BaggageDisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageDisclosureMetadata");
    private final static QName _AirportCityDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirportCityDeparture");
    private final static QName _OrderCommision_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderCommision");
    private final static QName _POAParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "POA_Participant");
    private final static QName _FlightItem_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightItem");
    private final static QName _AllowanceDescription_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AllowanceDescription");
    private final static QName _OperatingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OperatingCarrierParticipant");
    private final static QName _PriceMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PriceMetadata");
    private final static QName _DescriptionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DescriptionMetadata");
    private final static QName _RetailerID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RetailerID");
    private final static QName _GroupBudget_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "GroupBudget");
    private final static QName _CouponInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CouponInfo");
    private final static QName _SimpleCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SimpleCurrencyPrice");
    private final static QName _PaymentCardMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCardMethod");
    private final static QName _OrderKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderKey");
    private final static QName _ServiceFilter_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceFilter");
    private final static QName _RetailPartnerSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RetailPartnerSender");
    private final static QName _MarketingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MarketingCarrierParticipant");
    private final static QName _DayPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DayPeriod");
    private final static QName _QuarterPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "QuarterPeriod");
    private final static QName _BaggagePricingQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggagePricingQualifier");
    private final static QName _DisclosureKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DisclosureKey");
    private final static QName _Match_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Match");
    private final static QName _FlightSegmentType_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightSegmentType");
    private final static QName _SecurePaymentAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SecurePaymentAlert");
    private final static QName _OrderReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderReference");
    private final static QName _AwardPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AwardPricing");
    private final static QName _YearPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "YearPeriod");
    private final static QName _CountryDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CountryDeparture");
    private final static QName _ServicePrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServicePrice");
    private final static QName _AgentUserSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgentUserSender");
    private final static QName _PassengerMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerMetadata");
    private final static QName _PaymentFormMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentFormMetadata");
    private final static QName _ClassOfServiceList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ClassOfServiceList");
    private final static QName _FareReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareReference");
    private final static QName _AssociatedService_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AssociatedService");
    private final static QName _AircraftCabin_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AircraftCabin");
    private final static QName _FareRules_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareRules");
    private final static QName _OfferInstructionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferInstructionMetadata");
    private final static QName _ServiceFilterNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceFilterNotice");
    private final static QName _TermsList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TermsList");
    private final static QName _AirportCityArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirportCityArrival");
    private final static QName _AgentUserRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgentUserRecipient");
    private final static QName _Total_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Total");
    private final static QName _ServiceItemQuantityRules_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceItemQuantityRules");
    private final static QName _MediaMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MediaMetadata");
    private final static QName _OtherAssociation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherAssociation");
    private final static QName _PerPersonBudget_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PerPersonBudget");
    private final static QName _ServiceCoupon_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceCoupon");
    private final static QName _MediaList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MediaList");
    private final static QName _PhoneContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PhoneContact");
    private final static QName _AddressMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressMetadata");
    private final static QName _MediaItemReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MediaItemReference");
    private final static QName _PaymentCard_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCard");
    private final static QName _FlightDuration_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightDuration");
    private final static QName _Attributes_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Attributes");
    private final static QName _TicketDocQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TicketDocQuantity");
    private final static QName _BaseFare_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaseFare");
    private final static QName _SegMaxTimePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SegMaxTimePreferences");
    private final static QName _TravelAgencySender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TravelAgencySender");
    private final static QName _MetadataKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MetadataKey");
    private final static QName _OrderID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderID");
    private final static QName _StateProvMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StateProvMetadata");
    private final static QName _SeatData_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatData");
    private final static QName _OtherFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherFulfillmentLocation");
    private final static QName _FareFiledIn_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareFiledIn");
    private final static QName _DirectBill_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectBill");
    private final static QName _TicketDesig_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TicketDesig");
    private final static QName _CarryOnBagMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CarryOnBagMetadata");
    private final static QName _OriginDestinationReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OriginDestinationReference");
    private final static QName _Itinerary_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Itinerary");
    private final static QName _TaxExemptionNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TaxExemptionNotice");
    private final static QName _EncodedCurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EncodedCurrencyAmount");
    private final static QName _PassengerReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReferences");
    private final static QName _PaymentStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentStatus");
    private final static QName _PaymentCardMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCardMetadata");
    private final static QName _AlliancePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AlliancePreferences");
    private final static QName _MonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MonthPeriod");
    private final static QName _PolicyLink_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PolicyLink");
    private final static QName _Device_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Device");
    private final static QName _PartnerID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PartnerID");
    private final static QName _MarketingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MarketingCarrierSender");
    private final static QName _CityName_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CityName");
    private final static QName _PaymentAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentAddress");
    private final static QName _YearMonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "YearMonthPeriod");
    private final static QName _ServiceID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceID");
    private final static QName _CurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CurrencyAmount");
    private final static QName _NodePath_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "NodePath");
    private final static QName _Errors_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Errors");
    private final static QName _AugmentationPoint_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AugmentationPoint");
    private final static QName _BagDisclosureList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BagDisclosureList");
    private final static QName _FarePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FarePreferences");
    private final static QName _CurrentAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CurrentAirlineInfo");
    private final static QName _TotalJourney_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TotalJourney");
    private final static QName _DatePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DatePeriod");
    private final static QName _PaymentMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentMethod");
    private final static QName _PriceClassReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PriceClassReference");
    private final static QName _ServiceFulfillment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceFulfillment");
    private final static QName _Alerts_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Alerts");
    private final static QName _OrderItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderItemID");
    private final static QName _OtherOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherOffer");
    private final static QName _AirportFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirportFulfillmentLocation");
    private final static QName _DescriptionReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DescriptionReferences");
    private final static QName _UnstructuredFareCalcInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "UnstructuredFareCalcInfo");
    private final static QName _Timestamp_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Timestamp");
    private final static QName _CheckedInAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CheckedInAirlineInfo");
    private final static QName _AssociatedPassenger_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AssociatedPassenger");
    private final static QName _OfferItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferItemID");
    private final static QName _FlightSegment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightSegment");
    private final static QName _AddressDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressDetail");
    private final static QName _Party_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Party");
    private final static QName _AltSeatOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AltSeatOffer");
    private final static QName _OrderKeys_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderKeys");
    private final static QName _AggregatorRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AggregatorRecipient");
    private final static QName _PaymentForm_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentForm");
    private final static QName _FareCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareCode");
    private final static QName _AirportMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirportMetadata");
    private final static QName _AgentUser_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgentUser");
    private final static QName _FareInd_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareInd");
    private final static QName _AirlinePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirlinePreferences");
    private final static QName _RetailSupplierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RetailSupplierParticipant");
    private final static QName _DisclosureList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DisclosureList");
    private final static QName _ServiceReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceReferences");
    private final static QName _TripDistance_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TripDistance");
    private final static QName _PenaltyMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PenaltyMetadata");
    private final static QName _AggregatorParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AggregatorParticipant");
    private final static QName _RFIC_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RFIC");
    private final static QName _BankAccount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BankAccount");
    private final static QName _OrderAssociations_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderAssociations");
    private final static QName _Fare_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Fare");
    private final static QName _RedemptionMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RedemptionMethod");
    private final static QName _LeadDatePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "LeadDatePeriod");
    private final static QName _RetailPartnerRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RetailPartnerRecipient");
    private final static QName _OfferReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferReferences");
    private final static QName _OfferDetailAssociation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferDetailAssociation");
    private final static QName _Year_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Year");
    private final static QName _InventoryGuarantee_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InventoryGuarantee");
    private final static QName _AllOffersSnapshot_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AllOffersSnapshot");
    private final static QName _POARecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "POA_Recipient");
    private final static QName _Frequency_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Frequency");
    private final static QName _PhoneNumber_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PhoneNumber");
    private final static QName _ShoppingResponseID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ShoppingResponseID");
    private final static QName _GroupReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "GroupReference");
    private final static QName _BaggageOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageOffer");
    private final static QName _EquivalentIDKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EquivalentID_Key");
    private final static QName _AggregatorID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AggregatorID");
    private final static QName _POASender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "POA_Sender");
    private final static QName _SystemID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SystemID");
    private final static QName _DimensionAllowance_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DimensionAllowance");
    private final static QName _ORAParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ORA_Participant");
    private final static QName _DetailedFlightItem_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DetailedFlightItem");
    private final static QName _Document_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Document");
    private final static QName _Month_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Month");
    private final static QName _EmailContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EmailContact");
    private final static QName _StayPeriodDateRange_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StayPeriodDateRange");
    private final static QName _FlightStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightStatus");
    private final static QName _CashMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CashMethod");
    private final static QName _InConnectionWithInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InConnectionWithInfo");
    private final static QName _CodesetMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CodesetMetadata");
    private final static QName _RuleMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RuleMetadata");
    private final static QName _IncludedService_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "IncludedService");
    private final static QName _PTCPriced_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PTC_Priced");
    private final static QName _MarketingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MarketingCarrierRecipient");
    private final static QName _DiscountPercent_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DiscountPercent");
    private final static QName _AltPricedFlightOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AltPricedFlightOffer");
    private final static QName _Status_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Status");
    private final static QName _AltBaggageOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AltBaggageOffer");
    private final static QName _AddressContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressContact");
    private final static QName _FareTextInd_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareTextInd");
    private final static QName _FareBasisCityPair_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareBasisCityPair");
    private final static QName _CityMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CityMetadata");
    private final static QName _ZoneMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ZoneMetadata");
    private final static QName _StructuredAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StructuredAddress");
    private final static QName _AgentUserID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgentUserID");
    private final static QName _DateTimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DateTimePeriod");
    private final static QName _Associations_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Associations");
    private final static QName _DiscountAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DiscountAmount");
    private final static QName _OfferInstructionReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferInstructionReferences");
    private final static QName _CombinationPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CombinationPricing");
    private final static QName _ContactMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ContactMetadata");
    private final static QName _OperatingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OperatingCarrierRecipient");
    private final static QName _StayPeriodSeason_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StayPeriodSeason");
    private final static QName _CheckedBagAllowanceList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CheckedBagAllowanceList");
    private final static QName _SeatMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatMetadata");
    private final static QName _PriceClassList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PriceClassList");
    private final static QName _WingPosition_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "WingPosition");
    private final static QName _DirectionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectionMetadata");
    private final static QName _ServiceQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceQualifier");
    private final static QName _PercentageValue_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PercentageValue");
    private final static QName _ClassOfService_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ClassOfService");
    private final static QName _SpecialFareQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SpecialFareQualifiers");
    private final static QName _BaggageItem_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageItem");
    private final static QName _ListKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ListKey");
    private final static QName _StateProvDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StateProvDeparture");
    private final static QName _FareDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareDetail");
    private final static QName _InstantPurchase_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InstantPurchase");
    private final static QName _OperatingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OperatingCarrierSender");
    private final static QName _AddressCore_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressCore");
    private final static QName _EquivalentIDMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EquivalentID_Metadata");
    private final static QName _LeadTimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "LeadTimePeriod");
    private final static QName _OtherMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherMethod");
    private final static QName _OtherContactMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherContactMethod");
    private final static QName _OfferTermsMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferTermsMetadata");
    private final static QName _StateCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StateCode");
    private final static QName _TravelAgencyRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TravelAgencyRecipient");
    private final static QName _CheckedBagMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CheckedBagMetadata");
    private final static QName _TaxExemption_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TaxExemption");
    private final static QName _Penalty_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Penalty");
    private final static QName _DefaultPolicy_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DefaultPolicy");
    private final static QName _InventoryGuaranteeNotif_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InventoryGuaranteeNotif");
    private final static QName _ClassOfServiceUpgrade_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ClassOfServiceUpgrade");
    private final static QName _CarryOnReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CarryOnReferences");
    private final static QName _Equipment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Equipment");
    private final static QName _DiscountProgramQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DiscountProgramQualifier");
    private final static QName _BagDisclosureKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BagDisclosureKey");
    private final static QName _Alert_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Alert");
    private final static QName _PricingMethodPreference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PricingMethodPreference");
    private final static QName _MediaAttachment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MediaAttachment");
    private final static QName _ReferencePointArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ReferencePointArrival");
    private final static QName _BaggageQueryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageQueryMetadata");
    private final static QName _BaggageDetailMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageDetailMetadata");
    private final static QName _PricingParametersNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PricingParametersNotice");
    private final static QName _OfferTermReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferTermReferences");
    private final static QName _SeatOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatOffer");
    private final static QName _Commission_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Commission");
    private final static QName _LanguageCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "LanguageCode");
    private final static QName _Remarks_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Remarks");
    private final static QName _ServiceBundleList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceBundleList");
    private final static QName _EncodedCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EncodedCurrencyPrice");
    private final static QName _InventoryDiscrepancyAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InventoryDiscrepancyAlert");
    private final static QName _MiscChargeMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MiscChargeMethod");
    private final static QName _FlightMileage_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightMileage");
    private final static QName _BilateralTimeLimits_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BilateralTimeLimits");
    private final static QName _SeatDisplayKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SeatDisplayKey");
    private final static QName _SimpleAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SimpleAddress");
    private final static QName _OriginDestinationKey_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OriginDestinationKey");
    private final static QName _DiscountMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DiscountMetadata");
    private final static QName _ContentMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ContentMetadata");
    private final static QName _RoleOfIntermediaryReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RoleOfIntermediaryReference");
    private final static QName _BagDisclosureReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BagDisclosureReferences");
    private final static QName _ShortDate_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ShortDate");
    private final static QName _BankAccountMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BankAccountMethod");
    private final static QName _FarePriceDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FarePriceDetail");
    private final static QName _ExitRowPosition_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ExitRowPosition");
    private final static QName _BundleReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BundleReference");
    private final static QName _PenaltyList_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PenaltyList");
    private final static QName _Arrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Arrival");
    private final static QName _OfferPenalty_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferPenalty");
    private final static QName _ServiceReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceReference");
    private final static QName _EquivFare_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EquivFare");
    private final static QName _FareComponent_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareComponent");
    private final static QName _MarketingCarrierAirline_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MarketingCarrierAirline");
    private final static QName _FlightPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightPreferences");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MaximumQuantity");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MinimumQuantity");
    private final static QName _SeatComponentTypeLocationsLocationSpaceRowRangeBegin_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Begin");
    private final static QName _SeatComponentTypeLocationsLocationSpaceRowRangeEnd_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "End");
    private final static QName _MsgPartiesTypeParticipants_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Participants");
    private final static QName _MsgPartiesTypeRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Recipient");
    private final static QName _OfferGroupSizeTypeMinimum_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Minimum");
    private final static QName _OfferGroupSizeTypeMaximum_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Maximum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ndc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncentiveProgramType }
     * 
     */
    public IncentiveProgramType createIncentiveProgramType() {
        return new IncentiveProgramType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier }
     * 
     */
    public PrePaidProgramQualifier createPrePaidProgramQualifier() {
        return new PrePaidProgramQualifier();
    }

    /**
     * Create an instance of {@link FlightMetadataType }
     * 
     */
    public FlightMetadataType createFlightMetadataType() {
        return new FlightMetadataType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType }
     * 
     */
    public OfferAssociationsType createOfferAssociationsType() {
        return new OfferAssociationsType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferType }
     * 
     */
    public PricedFlightOfferType createPricedFlightOfferType() {
        return new PricedFlightOfferType();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link ndc.TimeLimits }
     * 
     */
    public ndc.TimeLimits createTimeLimits() {
        return new ndc.TimeLimits();
    }

    /**
     * Create an instance of {@link Policies }
     * 
     */
    public Policies createPolicies() {
        return new Policies();
    }

    /**
     * Create an instance of {@link FareList }
     * 
     */
    public FareList createFareList() {
        return new FareList();
    }

    /**
     * Create an instance of {@link CorporateFare }
     * 
     */
    public CorporateFare createCorporateFare() {
        return new CorporateFare();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption }
     * 
     */
    public LoyaltyRedemption createLoyaltyRedemption() {
        return new LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link CouponAgentType }
     * 
     */
    public CouponAgentType createCouponAgentType() {
        return new CouponAgentType();
    }

    /**
     * Create an instance of {@link BookingReferenceType }
     * 
     */
    public BookingReferenceType createBookingReferenceType() {
        return new BookingReferenceType();
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link SeatQualifier }
     * 
     */
    public SeatQualifier createSeatQualifier() {
        return new SeatQualifier();
    }

    /**
     * Create an instance of {@link AdvanceTicketing }
     * 
     */
    public AdvanceTicketing createAdvanceTicketing() {
        return new AdvanceTicketing();
    }

    /**
     * Create an instance of {@link LeadPrice }
     * 
     */
    public LeadPrice createLeadPrice() {
        return new LeadPrice();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType }
     * 
     */
    public BagAllowancePieceType createBagAllowancePieceType() {
        return new BagAllowancePieceType();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link FlightDepartureType }
     * 
     */
    public FlightDepartureType createFlightDepartureType() {
        return new FlightDepartureType();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType }
     * 
     */
    public SecurePaymentPaxInfoType createSecurePaymentPaxInfoType() {
        return new SecurePaymentPaxInfoType();
    }

    /**
     * Create an instance of {@link ServiceCombinationType }
     * 
     */
    public ServiceCombinationType createServiceCombinationType() {
        return new ServiceCombinationType();
    }

    /**
     * Create an instance of {@link ndc.OriginDestination }
     * 
     */
    public ndc.OriginDestination createOriginDestination() {
        return new ndc.OriginDestination();
    }

    /**
     * Create an instance of {@link OrderItemDetails }
     * 
     */
    public OrderItemDetails createOrderItemDetails() {
        return new OrderItemDetails();
    }

    /**
     * Create an instance of {@link Notices }
     * 
     */
    public Notices createNotices() {
        return new Notices();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType }
     * 
     */
    public BagAllowanceWeightType createBagAllowanceWeightType() {
        return new BagAllowanceWeightType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType }
     * 
     */
    public AgencyCoreRepType createAgencyCoreRepType() {
        return new AgencyCoreRepType();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType }
     * 
     */
    public CarryOnAllowanceType createCarryOnAllowanceType() {
        return new CarryOnAllowanceType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link SeatDisplay }
     * 
     */
    public SeatDisplay createSeatDisplay() {
        return new SeatDisplay();
    }

    /**
     * Create an instance of {@link BaggageListRQ }
     * 
     */
    public BaggageListRQ createBaggageListRQ() {
        return new BaggageListRQ();
    }

    /**
     * Create an instance of {@link FareRulesRemarks }
     * 
     */
    public FareRulesRemarks createFareRulesRemarks() {
        return new FareRulesRemarks();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link PrimaryContact }
     * 
     */
    public PrimaryContact createPrimaryContact() {
        return new PrimaryContact();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType }
     * 
     */
    public PriceVarianceRuleNoticeType createPriceVarianceRuleNoticeType() {
        return new PriceVarianceRuleNoticeType();
    }

    /**
     * Create an instance of {@link MarketingMessages }
     * 
     */
    public MarketingMessages createMarketingMessages() {
        return new MarketingMessages();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType }
     * 
     */
    public CheckedBagAllowanceType createCheckedBagAllowanceType() {
        return new CheckedBagAllowanceType();
    }

    /**
     * Create an instance of {@link KeyWordType }
     * 
     */
    public KeyWordType createKeyWordType() {
        return new KeyWordType();
    }

    /**
     * Create an instance of {@link ResDateTime }
     * 
     */
    public ResDateTime createResDateTime() {
        return new ResDateTime();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link FileFareType }
     * 
     */
    public FileFareType createFileFareType() {
        return new FileFareType();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link DataListType }
     * 
     */
    public DataListType createDataListType() {
        return new DataListType();
    }

    /**
     * Create an instance of {@link DataListType.FlightList }
     * 
     */
    public DataListType.FlightList createDataListTypeFlightList() {
        return new DataListType.FlightList();
    }

    /**
     * Create an instance of {@link DataListType.FlightList.Flight }
     * 
     */
    public DataListType.FlightList.Flight createDataListTypeFlightListFlight() {
        return new DataListType.FlightList.Flight();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType }
     * 
     */
    public SupplierCoreRepType createSupplierCoreRepType() {
        return new SupplierCoreRepType();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType.OtherIDs }
     * 
     */
    public SupplierCoreRepType.OtherIDs createSupplierCoreRepTypeOtherIDs() {
        return new SupplierCoreRepType.OtherIDs();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType }
     * 
     */
    public SeatOfferCoreType createSeatOfferCoreType() {
        return new SeatOfferCoreType();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType }
     * 
     */
    public InfoPolicyNoticeType createInfoPolicyNoticeType() {
        return new InfoPolicyNoticeType();
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata }
     * 
     */
    public PolicyType.Metadata createPolicyTypeMetadata() {
        return new PolicyType.Metadata();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType }
     * 
     */
    public CorePeriodGrpType createCorePeriodGrpType() {
        return new CorePeriodGrpType();
    }

    /**
     * Create an instance of {@link EncSchemeType }
     * 
     */
    public EncSchemeType createEncSchemeType() {
        return new EncSchemeType();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail }
     * 
     */
    public EncSchemeType.Detail createEncSchemeTypeDetail() {
        return new EncSchemeType.Detail();
    }

    /**
     * Create an instance of {@link PolicyType.Nodes }
     * 
     */
    public PolicyType.Nodes createPolicyTypeNodes() {
        return new PolicyType.Nodes();
    }

    /**
     * Create an instance of {@link NodePathType }
     * 
     */
    public NodePathType createNodePathType() {
        return new NodePathType();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType }
     * 
     */
    public HistoryCouponInfoType createHistoryCouponInfoType() {
        return new HistoryCouponInfoType();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType }
     * 
     */
    public CouponSoldAirlineType createCouponSoldAirlineType() {
        return new CouponSoldAirlineType();
    }

    /**
     * Create an instance of {@link FlightPriceType }
     * 
     */
    public FlightPriceType createFlightPriceType() {
        return new FlightPriceType();
    }

    /**
     * Create an instance of {@link FeeSurchargeType }
     * 
     */
    public FeeSurchargeType createFeeSurchargeType() {
        return new FeeSurchargeType();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Breakdown }
     * 
     */
    public FeeSurchargeType.Breakdown createFeeSurchargeTypeBreakdown() {
        return new FeeSurchargeType.Breakdown();
    }

    /**
     * Create an instance of {@link CabinCameraPosType }
     * 
     */
    public CabinCameraPosType createCabinCameraPosType() {
        return new CabinCameraPosType();
    }

    /**
     * Create an instance of {@link CampaignUTMParameterType }
     * 
     */
    public CampaignUTMParameterType createCampaignUTMParameterType() {
        return new CampaignUTMParameterType();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType }
     * 
     */
    public OtherOfferCoreType createOtherOfferCoreType() {
        return new OtherOfferCoreType();
    }

    /**
     * Create an instance of {@link RenderingParameterType }
     * 
     */
    public RenderingParameterType createRenderingParameterType() {
        return new RenderingParameterType();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType }
     * 
     */
    public ServiceOtherAssocType createServiceOtherAssocType() {
        return new ServiceOtherAssocType();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType.OtherAssociation }
     * 
     */
    public ServiceOtherAssocType.OtherAssociation createServiceOtherAssocTypeOtherAssociation() {
        return new ServiceOtherAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link ServiceAssocType }
     * 
     */
    public ServiceAssocType createServiceAssocType() {
        return new ServiceAssocType();
    }

    /**
     * Create an instance of {@link PaymentProcessType }
     * 
     */
    public PaymentProcessType createPaymentProcessType() {
        return new PaymentProcessType();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotions }
     * 
     */
    public PaymentProcessType.Promotions createPaymentProcessTypePromotions() {
        return new PaymentProcessType.Promotions();
    }

    /**
     * Create an instance of {@link PaymentStatusType }
     * 
     */
    public PaymentStatusType createPaymentStatusType() {
        return new PaymentStatusType();
    }

    /**
     * Create an instance of {@link InstrClassUpgradeType }
     * 
     */
    public InstrClassUpgradeType createInstrClassUpgradeType() {
        return new InstrClassUpgradeType();
    }

    /**
     * Create an instance of {@link CountryQueryType }
     * 
     */
    public CountryQueryType createCountryQueryType() {
        return new CountryQueryType();
    }

    /**
     * Create an instance of {@link AugmentationType }
     * 
     */
    public AugmentationType createAugmentationType() {
        return new AugmentationType();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType }
     * 
     */
    public PinPhraseAnswerType createPinPhraseAnswerType() {
        return new PinPhraseAnswerType();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType }
     * 
     */
    public AircraftFeaturesQueryType createAircraftFeaturesQueryType() {
        return new AircraftFeaturesQueryType();
    }

    /**
     * Create an instance of {@link FeeDisclosureType }
     * 
     */
    public FeeDisclosureType createFeeDisclosureType() {
        return new FeeDisclosureType();
    }

    /**
     * Create an instance of {@link LinkDescriptionType }
     * 
     */
    public LinkDescriptionType createLinkDescriptionType() {
        return new LinkDescriptionType();
    }

    /**
     * Create an instance of {@link TravelerFOIDType }
     * 
     */
    public TravelerFOIDType createTravelerFOIDType() {
        return new TravelerFOIDType();
    }

    /**
     * Create an instance of {@link AwardRedemptionType }
     * 
     */
    public AwardRedemptionType createAwardRedemptionType() {
        return new AwardRedemptionType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType }
     * 
     */
    public PricedFlightOfferCoreType createPricedFlightOfferCoreType() {
        return new PricedFlightOfferCoreType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType }
     * 
     */
    public OfferPriceLeadType createOfferPriceLeadType() {
        return new OfferPriceLeadType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType }
     * 
     */
    public OfferPriceLeadDetailType createOfferPriceLeadDetailType() {
        return new OfferPriceLeadDetailType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail createOfferPriceLeadDetailTypePriceDetail() {
        return new OfferPriceLeadDetailType.PriceDetail();
    }

    /**
     * Create an instance of {@link OfferIncentiveType }
     * 
     */
    public OfferIncentiveType createOfferIncentiveType() {
        return new OfferIncentiveType();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive }
     * 
     */
    public OfferIncentiveType.Incentive createOfferIncentiveTypeIncentive() {
        return new OfferIncentiveType.Incentive();
    }

    /**
     * Create an instance of {@link PenaltyType }
     * 
     */
    public PenaltyType createPenaltyType() {
        return new PenaltyType();
    }

    /**
     * Create an instance of {@link PenaltyType.Details }
     * 
     */
    public PenaltyType.Details createPenaltyTypeDetails() {
        return new PenaltyType.Details();
    }

    /**
     * Create an instance of {@link PenaltyType.Details.Detail }
     * 
     */
    public PenaltyType.Details.Detail createPenaltyTypeDetailsDetail() {
        return new PenaltyType.Details.Detail();
    }

    /**
     * Create an instance of {@link PenaltyType.Details.Detail.Amounts }
     * 
     */
    public PenaltyType.Details.Detail.Amounts createPenaltyTypeDetailsDetailAmounts() {
        return new PenaltyType.Details.Detail.Amounts();
    }

    /**
     * Create an instance of {@link PenaltyType.Details.Detail.Amounts.Amount }
     * 
     */
    public PenaltyType.Details.Detail.Amounts.Amount createPenaltyTypeDetailsDetailAmountsAmount() {
        return new PenaltyType.Details.Detail.Amounts.Amount();
    }

    /**
     * Create an instance of {@link ServiceCoreType }
     * 
     */
    public ServiceCoreType createServiceCoreType() {
        return new ServiceCoreType();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions }
     * 
     */
    public ServiceCoreType.BookingInstructions createServiceCoreTypeBookingInstructions() {
        return new ServiceCoreType.BookingInstructions();
    }

    /**
     * Create an instance of {@link ServiceEncodingType }
     * 
     */
    public ServiceEncodingType createServiceEncodingType() {
        return new ServiceEncodingType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link FlightType.Flight }
     * 
     */
    public FlightType.Flight createFlightTypeFlight() {
        return new FlightType.Flight();
    }

    /**
     * Create an instance of {@link LocationProximityType }
     * 
     */
    public LocationProximityType createLocationProximityType() {
        return new LocationProximityType();
    }

    /**
     * Create an instance of {@link StateProvProximityType }
     * 
     */
    public StateProvProximityType createStateProvProximityType() {
        return new StateProvProximityType();
    }

    /**
     * Create an instance of {@link FarePriceBaseType }
     * 
     */
    public FarePriceBaseType createFarePriceBaseType() {
        return new FarePriceBaseType();
    }

    /**
     * Create an instance of {@link AgentUserType }
     * 
     */
    public AgentUserType createAgentUserType() {
        return new AgentUserType();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType }
     * 
     */
    public AllOffersSnapshotType createAllOffersSnapshotType() {
        return new AllOffersSnapshotType();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType }
     * 
     */
    public OrderCoreChangeType createOrderCoreChangeType() {
        return new OrderCoreChangeType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details }
     * 
     */
    public OrderCoreChangeType.Details createOrderCoreChangeTypeDetails() {
        return new OrderCoreChangeType.Details();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments }
     * 
     */
    public OrderCoreChangeType.Details.Amendments createOrderCoreChangeTypeDetailsAmendments() {
        return new OrderCoreChangeType.Details.Amendments();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment createOrderCoreChangeTypeDetailsAmendmentsAmendment() {
        return new OrderCoreChangeType.Details.Amendments.Amendment();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItem() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOfferItem() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOfferItemServices() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo createOrderCoreChangeTypeDetailsAmendmentsAmendmentTicketDocInfo() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse createOrderCoreChangeTypeDetailsShoppingResponse() {
        return new OrderCoreChangeType.Details.ShoppingResponse();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.OfferItems }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.OfferItems createOrderCoreChangeTypeDetailsShoppingResponseOfferItems() {
        return new OrderCoreChangeType.Details.ShoppingResponse.OfferItems();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations }
     * 
     */
    public OrderCoreChangeType.Associations createOrderCoreChangeTypeAssociations() {
        return new OrderCoreChangeType.Associations();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType }
     * 
     */
    public GroupFarePreferencesType createGroupFarePreferencesType() {
        return new GroupFarePreferencesType();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare }
     * 
     */
    public GroupFarePreferencesType.GroupFare createGroupFarePreferencesTypeGroupFare() {
        return new GroupFarePreferencesType.GroupFare();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType }
     * 
     */
    public CombinationPriceSimpleType createCombinationPriceSimpleType() {
        return new CombinationPriceSimpleType();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType.Partial }
     * 
     */
    public CombinationPriceSimpleType.Partial createCombinationPriceSimpleTypePartial() {
        return new CombinationPriceSimpleType.Partial();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType }
     * 
     */
    public ShoppingResponseOrderType createShoppingResponseOrderType() {
        return new ShoppingResponseOrderType();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers }
     * 
     */
    public ShoppingResponseOrderType.Offers createShoppingResponseOrderTypeOffers() {
        return new ShoppingResponseOrderType.Offers();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer createShoppingResponseOrderTypeOffersOffer() {
        return new ShoppingResponseOrderType.Offers.Offer();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems createShoppingResponseOrderTypeOffersOfferOfferItems() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItem() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemDetails() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemAssociatedServices() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemAssociatedServicesAssociatedService() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType }
     * 
     */
    public NonGeographicSpecificationType createNonGeographicSpecificationType() {
        return new NonGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link OrderItemCoreType }
     * 
     */
    public OrderItemCoreType createOrderItemCoreType() {
        return new OrderItemCoreType();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem }
     * 
     */
    public OrderItemCoreType.OrderItem createOrderItemCoreTypeOrderItem() {
        return new OrderItemCoreType.OrderItem();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations createOrderItemCoreTypeOrderItemAssociations() {
        return new OrderItemCoreType.OrderItem.Associations();
    }

    /**
     * Create an instance of {@link OrderItemRepriceType }
     * 
     */
    public OrderItemRepriceType createOrderItemRepriceType() {
        return new OrderItemRepriceType();
    }

    /**
     * Create an instance of {@link OrderItemRepriceType.OrderItem }
     * 
     */
    public OrderItemRepriceType.OrderItem createOrderItemRepriceTypeOrderItem() {
        return new OrderItemRepriceType.OrderItem();
    }

    /**
     * Create an instance of {@link FlightOnlyType }
     * 
     */
    public FlightOnlyType createFlightOnlyType() {
        return new FlightOnlyType();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType }
     * 
     */
    public MessageParamsBaseType createMessageParamsBaseType() {
        return new MessageParamsBaseType();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.CurrCodes }
     * 
     */
    public MessageParamsBaseType.CurrCodes createMessageParamsBaseTypeCurrCodes() {
        return new MessageParamsBaseType.CurrCodes();
    }

    /**
     * Create an instance of {@link StateProvQueryType }
     * 
     */
    public StateProvQueryType createStateProvQueryType() {
        return new StateProvQueryType();
    }

    /**
     * Create an instance of {@link StateProvQueryType.Keywords }
     * 
     */
    public StateProvQueryType.Keywords createStateProvQueryTypeKeywords() {
        return new StateProvQueryType.Keywords();
    }

    /**
     * Create an instance of {@link StateProvQueryType.StateCodes }
     * 
     */
    public StateProvQueryType.StateCodes createStateProvQueryTypeStateCodes() {
        return new StateProvQueryType.StateCodes();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType }
     * 
     */
    public OfferTimeLimitSetType createOfferTimeLimitSetType() {
        return new OfferTimeLimitSetType();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OtherLimits }
     * 
     */
    public OfferTimeLimitSetType.OtherLimits createOfferTimeLimitSetTypeOtherLimits() {
        return new OfferTimeLimitSetType.OtherLimits();
    }

    /**
     * Create an instance of {@link ProcessingErrorType }
     * 
     */
    public ProcessingErrorType createProcessingErrorType() {
        return new ProcessingErrorType();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error }
     * 
     */
    public ProcessingErrorType.Error createProcessingErrorTypeError() {
        return new ProcessingErrorType.Error();
    }

    /**
     * Create an instance of {@link ReissuedFlownType }
     * 
     */
    public ReissuedFlownType createReissuedFlownType() {
        return new ReissuedFlownType();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType }
     * 
     */
    public CouponFlightSegmentType createCouponFlightSegmentType() {
        return new CouponFlightSegmentType();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData }
     * 
     */
    public ReissuedFlownType.FlightCouponData createReissuedFlownTypeFlightCouponData() {
        return new ReissuedFlownType.FlightCouponData();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType }
     * 
     */
    public DetailCurrencyPriceType createDetailCurrencyPriceType() {
        return new DetailCurrencyPriceType();
    }

    /**
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown }
     * 
     */
    public TaxDetailType.Breakdown createTaxDetailTypeBreakdown() {
        return new TaxDetailType.Breakdown();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax }
     * 
     */
    public TaxDetailType.Breakdown.Tax createTaxDetailTypeBreakdownTax() {
        return new TaxDetailType.Breakdown.Tax();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details }
     * 
     */
    public DetailCurrencyPriceType.Details createDetailCurrencyPriceTypeDetails() {
        return new DetailCurrencyPriceType.Details();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType }
     * 
     */
    public IntermediaryCoreRepType createIntermediaryCoreRepType() {
        return new IntermediaryCoreRepType();
    }

    /**
     * Create an instance of {@link FlightDetailType }
     * 
     */
    public FlightDetailType createFlightDetailType() {
        return new FlightDetailType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType }
     * 
     */
    public PinPhraseQuestionType createPinPhraseQuestionType() {
        return new PinPhraseQuestionType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge }
     * 
     */
    public PinPhraseQuestionType.Challenge createPinPhraseQuestionTypeChallenge() {
        return new PinPhraseQuestionType.Challenge();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge.Parameters }
     * 
     */
    public PinPhraseQuestionType.Challenge.Parameters createPinPhraseQuestionTypeChallengeParameters() {
        return new PinPhraseQuestionType.Challenge.Parameters();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType }
     * 
     */
    public TicketAutoExchangeType createTicketAutoExchangeType() {
        return new TicketAutoExchangeType();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.TicketNumbers }
     * 
     */
    public TicketAutoExchangeType.TicketNumbers createTicketAutoExchangeTypeTicketNumbers() {
        return new TicketAutoExchangeType.TicketNumbers();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType }
     * 
     */
    public OrderPaymentFormType createOrderPaymentFormType() {
        return new OrderPaymentFormType();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer }
     * 
     */
    public OrderPaymentFormType.Payer createOrderPaymentFormTypePayer() {
        return new OrderPaymentFormType.Payer();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name }
     * 
     */
    public OrderPaymentFormType.Payer.Name createOrderPaymentFormTypePayerName() {
        return new OrderPaymentFormType.Payer.Name();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations }
     * 
     */
    public OrderPaymentFormType.Associations createOrderPaymentFormTypeAssociations() {
        return new OrderPaymentFormType.Associations();
    }

    /**
     * Create an instance of {@link TicketDocumentType }
     * 
     */
    public TicketDocumentType createTicketDocumentType() {
        return new TicketDocumentType();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType }
     * 
     */
    public ServiceDescriptionType createServiceDescriptionType() {
        return new ServiceDescriptionType();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType }
     * 
     */
    public FlightCabinCoreType createFlightCabinCoreType() {
        return new FlightCabinCoreType();
    }

    /**
     * Create an instance of {@link MarketingInfoType }
     * 
     */
    public MarketingInfoType createMarketingInfoType() {
        return new MarketingInfoType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType }
     * 
     */
    public GeographicSpecificationType createGeographicSpecificationType() {
        return new GeographicSpecificationType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates }
     * 
     */
    public GeographicSpecificationType.Coordinates createGeographicSpecificationTypeCoordinates() {
        return new GeographicSpecificationType.Coordinates();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType }
     * 
     */
    public FulfillmentPartnerType createFulfillmentPartnerType() {
        return new FulfillmentPartnerType();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments }
     * 
     */
    public FulfillmentPartnerType.Fulfillments createFulfillmentPartnerTypeFulfillments() {
        return new FulfillmentPartnerType.Fulfillments();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment createFulfillmentPartnerTypeFulfillmentsFulfillment() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDates() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType }
     * 
     */
    public ReferencePointQueryType createReferencePointQueryType() {
        return new ReferencePointQueryType();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity }
     * 
     */
    public ReferencePointQueryType.Proximity createReferencePointQueryTypeProximity() {
        return new ReferencePointQueryType.Proximity();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.ReferencePoints }
     * 
     */
    public ReferencePointQueryType.ReferencePoints createReferencePointQueryTypeReferencePoints() {
        return new ReferencePointQueryType.ReferencePoints();
    }

    /**
     * Create an instance of {@link OtherOrderAssocType }
     * 
     */
    public OtherOrderAssocType createOtherOrderAssocType() {
        return new OtherOrderAssocType();
    }

    /**
     * Create an instance of {@link OfferItemCoreType }
     * 
     */
    public OfferItemCoreType createOfferItemCoreType() {
        return new OfferItemCoreType();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType }
     * 
     */
    public SocialMediaQualifierType createSocialMediaQualifierType() {
        return new SocialMediaQualifierType();
    }

    /**
     * Create an instance of {@link CouponEffectiveType }
     * 
     */
    public CouponEffectiveType createCouponEffectiveType() {
        return new CouponEffectiveType();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType }
     * 
     */
    public ListOfFlightSegmentType createListOfFlightSegmentType() {
        return new ListOfFlightSegmentType();
    }

    /**
     * Create an instance of {@link AugPointAssocType }
     * 
     */
    public AugPointAssocType createAugPointAssocType() {
        return new AugPointAssocType();
    }

    /**
     * Create an instance of {@link NamedAssocType }
     * 
     */
    public NamedAssocType createNamedAssocType() {
        return new NamedAssocType();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc }
     * 
     */
    public NamedAssocType.NamedAssoc createNamedAssocTypeNamedAssoc() {
        return new NamedAssocType.NamedAssoc();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType }
     * 
     */
    public TaxCouponInfoType createTaxCouponInfoType() {
        return new TaxCouponInfoType();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument }
     * 
     */
    public TaxCouponInfoType.TicketDocument createTaxCouponInfoTypeTicketDocument() {
        return new TaxCouponInfoType.TicketDocument();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber createTaxCouponInfoTypeTicketDocumentCouponNumber() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber();
    }

    /**
     * Create an instance of {@link RuleSetType }
     * 
     */
    public RuleSetType createRuleSetType() {
        return new RuleSetType();
    }

    /**
     * Create an instance of {@link OrderFareRulesType }
     * 
     */
    public OrderFareRulesType createOrderFareRulesType() {
        return new OrderFareRulesType();
    }

    /**
     * Create an instance of {@link TravelerFQTVType }
     * 
     */
    public TravelerFQTVType createTravelerFQTVType() {
        return new TravelerFQTVType();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account }
     * 
     */
    public TravelerFQTVType.Account createTravelerFQTVTypeAccount() {
        return new TravelerFQTVType.Account();
    }

    /**
     * Create an instance of {@link FlightItemOfferType }
     * 
     */
    public FlightItemOfferType createFlightItemOfferType() {
        return new FlightItemOfferType();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Details }
     * 
     */
    public FlightItemOfferType.Details createFlightItemOfferTypeDetails() {
        return new FlightItemOfferType.Details();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Flight }
     * 
     */
    public FlightItemOfferType.Flight createFlightItemOfferTypeFlight() {
        return new FlightItemOfferType.Flight();
    }

    /**
     * Create an instance of {@link PriceClassAssocType }
     * 
     */
    public PriceClassAssocType createPriceClassAssocType() {
        return new PriceClassAssocType();
    }

    /**
     * Create an instance of {@link AirPassCoreType }
     * 
     */
    public AirPassCoreType createAirPassCoreType() {
        return new AirPassCoreType();
    }

    /**
     * Create an instance of {@link AirPassDetailType }
     * 
     */
    public AirPassDetailType createAirPassDetailType() {
        return new AirPassDetailType();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate }
     * 
     */
    public AirPassCoreType.Certificate createAirPassCoreTypeCertificate() {
        return new AirPassCoreType.Certificate();
    }

    /**
     * Create an instance of {@link OfferItemTimeLimitSetType }
     * 
     */
    public OfferItemTimeLimitSetType createOfferItemTimeLimitSetType() {
        return new OfferItemTimeLimitSetType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType }
     * 
     */
    public BaggageOfferCoreType createBaggageOfferCoreType() {
        return new BaggageOfferCoreType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails }
     * 
     */
    public BaggageOfferCoreType.BagDetails createBaggageOfferCoreTypeBagDetails() {
        return new BaggageOfferCoreType.BagDetails();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails.BagDetail }
     * 
     */
    public BaggageOfferCoreType.BagDetails.BagDetail createBaggageOfferCoreTypeBagDetailsBagDetail() {
        return new BaggageOfferCoreType.BagDetails.BagDetail();
    }

    /**
     * Create an instance of {@link OrderCoreType }
     * 
     */
    public OrderCoreType createOrderCoreType() {
        return new OrderCoreType();
    }

    /**
     * Create an instance of {@link OrderCoreType.TimeLimits }
     * 
     */
    public OrderCoreType.TimeLimits createOrderCoreTypeTimeLimits() {
        return new OrderCoreType.TimeLimits();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder }
     * 
     */
    public OrderCoreType.OriginalOrder createOrderCoreTypeOriginalOrder() {
        return new OrderCoreType.OriginalOrder();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuotes }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuotes createOrderCoreTypeOriginalOrderPriceQuotes() {
        return new OrderCoreType.OriginalOrder.PriceQuotes();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote createOrderCoreTypeOriginalOrderPriceQuotesPriceQuote() {
        return new OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType }
     * 
     */
    public MarketMsgAssocType createMarketMsgAssocType() {
        return new MarketMsgAssocType();
    }

    /**
     * Create an instance of {@link COSOtherAssocType }
     * 
     */
    public COSOtherAssocType createCOSOtherAssocType() {
        return new COSOtherAssocType();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType }
     * 
     */
    public OrderPaymentMethodType createOrderPaymentMethodType() {
        return new OrderPaymentMethodType();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations }
     * 
     */
    public OrderPaymentMethodType.Associations createOrderPaymentMethodTypeAssociations() {
        return new OrderPaymentMethodType.Associations();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Promotions }
     * 
     */
    public OrderPaymentMethodType.Promotions createOrderPaymentMethodTypePromotions() {
        return new OrderPaymentMethodType.Promotions();
    }

    /**
     * Create an instance of {@link LocalizationNoticeType }
     * 
     */
    public LocalizationNoticeType createLocalizationNoticeType() {
        return new LocalizationNoticeType();
    }

    /**
     * Create an instance of {@link QualifiersType }
     * 
     */
    public QualifiersType createQualifiersType() {
        return new QualifiersType();
    }

    /**
     * Create an instance of {@link LinkFormattedType }
     * 
     */
    public LinkFormattedType createLinkFormattedType() {
        return new LinkFormattedType();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType }
     * 
     */
    public RenderingInstructionsType createRenderingInstructionsType() {
        return new RenderingInstructionsType();
    }

    /**
     * Create an instance of {@link ServiceFilterType }
     * 
     */
    public ServiceFilterType createServiceFilterType() {
        return new ServiceFilterType();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType }
     * 
     */
    public OfferValidPeriodType createOfferValidPeriodType() {
        return new OfferValidPeriodType();
    }

    /**
     * Create an instance of {@link AugPointListType }
     * 
     */
    public AugPointListType createAugPointListType() {
        return new AugPointListType();
    }

    /**
     * Create an instance of {@link AugPointListType.List }
     * 
     */
    public AugPointListType.List createAugPointListTypeList() {
        return new AugPointListType.List();
    }

    /**
     * Create an instance of {@link SeatMapMessageType }
     * 
     */
    public SeatMapMessageType createSeatMapMessageType() {
        return new SeatMapMessageType();
    }

    /**
     * Create an instance of {@link ListOfServiceType }
     * 
     */
    public ListOfServiceType createListOfServiceType() {
        return new ListOfServiceType();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service }
     * 
     */
    public ListOfServiceType.Service createListOfServiceTypeService() {
        return new ListOfServiceType.Service();
    }

    /**
     * Create an instance of {@link SpecialType }
     * 
     */
    public SpecialType createSpecialType() {
        return new SpecialType();
    }

    /**
     * Create an instance of {@link ServiceCouponType }
     * 
     */
    public ServiceCouponType createServiceCouponType() {
        return new ServiceCouponType();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType }
     * 
     */
    public TotalFareTransactionType createTotalFareTransactionType() {
        return new TotalFareTransactionType();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType }
     * 
     */
    public FltArriveQualifiedQueryType createFltArriveQualifiedQueryType() {
        return new FltArriveQualifiedQueryType();
    }

    /**
     * Create an instance of {@link Voucher.Name }
     * 
     */
    public Voucher.Name createVoucherName() {
        return new Voucher.Name();
    }

    /**
     * Create an instance of {@link FareRulesType }
     * 
     */
    public FareRulesType createFareRulesType() {
        return new FareRulesType();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing }
     * 
     */
    public FareRulesType.Ticketing createFareRulesTypeTicketing() {
        return new FareRulesType.Ticketing();
    }

    /**
     * Create an instance of {@link PassengerMetadataType }
     * 
     */
    public PassengerMetadataType createPassengerMetadataType() {
        return new PassengerMetadataType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType }
     * 
     */
    public SecurePaymentAlertType createSecurePaymentAlertType() {
        return new SecurePaymentAlertType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos createSecurePaymentAlertTypeProcessingInfos() {
        return new SecurePaymentAlertType.ProcessingInfos();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo createSecurePaymentAlertTypeProcessingInfosProcessingInfo() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details }
     * 
     */
    public SecurePaymentAlertType.Details createSecurePaymentAlertTypeDetails() {
        return new SecurePaymentAlertType.Details();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference }
     * 
     */
    public SecurePaymentAlertType.Reference createSecurePaymentAlertTypeReference() {
        return new SecurePaymentAlertType.Reference();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline }
     * 
     */
    public SecurePaymentAlertType.Airline createSecurePaymentAlertTypeAirline() {
        return new SecurePaymentAlertType.Airline();
    }

    /**
     * Create an instance of {@link AlertsType }
     * 
     */
    public AlertsType createAlertsType() {
        return new AlertsType();
    }

    /**
     * Create an instance of {@link PaymentMethodType }
     * 
     */
    public PaymentMethodType createPaymentMethodType() {
        return new PaymentMethodType();
    }

    /**
     * Create an instance of {@link PaymentMethodType.Method }
     * 
     */
    public PaymentMethodType.Method createPaymentMethodTypeMethod() {
        return new PaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link PaymentMethodType.Method.Promotions }
     * 
     */
    public PaymentMethodType.Method.Promotions createPaymentMethodTypeMethodPromotions() {
        return new PaymentMethodType.Method.Promotions();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType }
     * 
     */
    public ServiceFulfillmentType createServiceFulfillmentType() {
        return new ServiceFulfillmentType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates createServiceFulfillmentTypeOfferValidDates() {
        return new ServiceFulfillmentType.OfferValidDates();
    }

    /**
     * Create an instance of {@link PaymentAddrType }
     * 
     */
    public PaymentAddrType createPaymentAddrType() {
        return new PaymentAddrType();
    }

    /**
     * Create an instance of {@link MediaMetadataType }
     * 
     */
    public MediaMetadataType createMediaMetadataType() {
        return new MediaMetadataType();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType }
     * 
     */
    public TaxExemptionNoticeType createTaxExemptionNoticeType() {
        return new TaxExemptionNoticeType();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results }
     * 
     */
    public TaxExemptionNoticeType.Results createTaxExemptionNoticeTypeResults() {
        return new TaxExemptionNoticeType.Results();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption createTaxExemptionNoticeTypeResultsTaxExemption() {
        return new TaxExemptionNoticeType.Results.TaxExemption();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query }
     * 
     */
    public TaxExemptionNoticeType.Query createTaxExemptionNoticeTypeQuery() {
        return new TaxExemptionNoticeType.Query();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named }
     * 
     */
    public TaxExemptionNoticeType.Query.Named createTaxExemptionNoticeTypeQueryNamed() {
        return new TaxExemptionNoticeType.Query.Named();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.TaxCodes }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.TaxCodes createTaxExemptionNoticeTypeQueryNamedTaxCodes() {
        return new TaxExemptionNoticeType.Query.Named.TaxCodes();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link SeatDataType }
     * 
     */
    public SeatDataType createSeatDataType() {
        return new SeatDataType();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType }
     * 
     */
    public BaseFareTransactionType createBaseFareTransactionType() {
        return new BaseFareTransactionType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link PolicyAugmentationType }
     * 
     */
    public PolicyAugmentationType createPolicyAugmentationType() {
        return new PolicyAugmentationType();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType }
     * 
     */
    public PINAuthTravelerType createPINAuthTravelerType() {
        return new PINAuthTravelerType();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType }
     * 
     */
    public CarrierFeeInfoType createCarrierFeeInfoType() {
        return new CarrierFeeInfoType();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees }
     * 
     */
    public CarrierFeeInfoType.CarrierFees createCarrierFeeInfoTypeCarrierFees() {
        return new CarrierFeeInfoType.CarrierFees();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee createCarrierFeeInfoTypeCarrierFeesFee() {
        return new CarrierFeeInfoType.CarrierFees.Fee();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results }
     * 
     */
    public PriceVarianceRuleNoticeType.Results createPriceVarianceRuleNoticeTypeResults() {
        return new PriceVarianceRuleNoticeType.Results();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance createPriceVarianceRuleNoticeTypeResultsPriceVariance() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query }
     * 
     */
    public PriceVarianceRuleNoticeType.Query createPriceVarianceRuleNoticeTypeQuery() {
        return new PriceVarianceRuleNoticeType.Query();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule createPriceVarianceRuleNoticeTypeQueryPriceVarianceRule() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name }
     * 
     */
    public PrimaryContact.Name createPrimaryContactName() {
        return new PrimaryContact.Name();
    }

    /**
     * Create an instance of {@link ListOfOfferInstructionsType }
     * 
     */
    public ListOfOfferInstructionsType createListOfOfferInstructionsType() {
        return new ListOfOfferInstructionsType();
    }

    /**
     * Create an instance of {@link VoucherMethodType }
     * 
     */
    public VoucherMethodType createVoucherMethodType() {
        return new VoucherMethodType();
    }

    /**
     * Create an instance of {@link BagListReqMetadataType }
     * 
     */
    public BagListReqMetadataType createBagListReqMetadataType() {
        return new BagListReqMetadataType();
    }

    /**
     * Create an instance of {@link BagListReqMetadataType.Other }
     * 
     */
    public BagListReqMetadataType.Other createBagListReqMetadataTypeOther() {
        return new BagListReqMetadataType.Other();
    }

    /**
     * Create an instance of {@link BaggageListRQ.DataLists }
     * 
     */
    public BaggageListRQ.DataLists createBaggageListRQDataLists() {
        return new BaggageListRQ.DataLists();
    }

    /**
     * Create an instance of {@link TransferPreferencesType }
     * 
     */
    public TransferPreferencesType createTransferPreferencesType() {
        return new TransferPreferencesType();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection }
     * 
     */
    public TransferPreferencesType.Connection createTransferPreferencesTypeConnection() {
        return new TransferPreferencesType.Connection();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Codes }
     * 
     */
    public TransferPreferencesType.Connection.Codes createTransferPreferencesTypeConnectionCodes() {
        return new TransferPreferencesType.Connection.Codes();
    }

    /**
     * Create an instance of {@link BaggageListRQ.Query }
     * 
     */
    public BaggageListRQ.Query createBaggageListRQQuery() {
        return new BaggageListRQ.Query();
    }

    /**
     * Create an instance of {@link BagListReqParamsType }
     * 
     */
    public BagListReqParamsType createBagListReqParamsType() {
        return new BagListReqParamsType();
    }

    /**
     * Create an instance of {@link BagListReqParamsType.Pricing }
     * 
     */
    public BagListReqParamsType.Pricing createBagListReqParamsTypePricing() {
        return new BagListReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link BagListReqParamsType.Pricing.FeeExemption }
     * 
     */
    public BagListReqParamsType.Pricing.FeeExemption createBagListReqParamsTypePricingFeeExemption() {
        return new BagListReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link BagListReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public BagListReqParamsType.Pricing.FeeExemption.Fee createBagListReqParamsTypePricingFeeExemptionFee() {
        return new BagListReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link PointOfSaleType }
     * 
     */
    public PointOfSaleType createPointOfSaleType() {
        return new PointOfSaleType();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint }
     * 
     */
    public PointOfSaleType.TouchPoint createPointOfSaleTypeTouchPoint() {
        return new PointOfSaleType.TouchPoint();
    }

    /**
     * Create an instance of {@link SeatComponentType }
     * 
     */
    public SeatComponentType createSeatComponentType() {
        return new SeatComponentType();
    }

    /**
     * Create an instance of {@link SeatComponentType.Dimensions }
     * 
     */
    public SeatComponentType.Dimensions createSeatComponentTypeDimensions() {
        return new SeatComponentType.Dimensions();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations }
     * 
     */
    public SeatComponentType.Locations createSeatComponentTypeLocations() {
        return new SeatComponentType.Locations();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location }
     * 
     */
    public SeatComponentType.Locations.Location createSeatComponentTypeLocationsLocation() {
        return new SeatComponentType.Locations.Location();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location.Space }
     * 
     */
    public SeatComponentType.Locations.Location.Space createSeatComponentTypeLocationsLocationSpace() {
        return new SeatComponentType.Locations.Location.Space();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType }
     * 
     */
    public ListOfContentSourceType createListOfContentSourceType() {
        return new ListOfContentSourceType();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType.ContentSource }
     * 
     */
    public ListOfContentSourceType.ContentSource createListOfContentSourceTypeContentSource() {
        return new ListOfContentSourceType.ContentSource();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType }
     * 
     */
    public TicketByTimeLimitType createTicketByTimeLimitType() {
        return new TicketByTimeLimitType();
    }

    /**
     * Create an instance of {@link MediaAttachmentType }
     * 
     */
    public MediaAttachmentType createMediaAttachmentType() {
        return new MediaAttachmentType();
    }

    /**
     * Create an instance of {@link DiscountProgramType }
     * 
     */
    public DiscountProgramType createDiscountProgramType() {
        return new DiscountProgramType();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType }
     * 
     */
    public InvGuaranteeNoticeType createInvGuaranteeNoticeType() {
        return new InvGuaranteeNoticeType();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results }
     * 
     */
    public InvGuaranteeNoticeType.Results createInvGuaranteeNoticeTypeResults() {
        return new InvGuaranteeNoticeType.Results();
    }

    /**
     * Create an instance of {@link PolicyDefaultType }
     * 
     */
    public PolicyDefaultType createPolicyDefaultType() {
        return new PolicyDefaultType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherIDs }
     * 
     */
    public AgencyCoreRepType.OtherIDs createAgencyCoreRepTypeOtherIDs() {
        return new AgencyCoreRepType.OtherIDs();
    }

    /**
     * Create an instance of {@link FareDetailType }
     * 
     */
    public FareDetailType createFareDetailType() {
        return new FareDetailType();
    }

    /**
     * Create an instance of {@link FlightPreferencesType }
     * 
     */
    public FlightPreferencesType createFlightPreferencesType() {
        return new FlightPreferencesType();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing }
     * 
     */
    public FlightPreferencesType.WaitListing createFlightPreferencesTypeWaitListing() {
        return new FlightPreferencesType.WaitListing();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic }
     * 
     */
    public FlightPreferencesType.Characteristic createFlightPreferencesTypeCharacteristic() {
        return new FlightPreferencesType.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft }
     * 
     */
    public FlightPreferencesType.Aircraft createFlightPreferencesTypeAircraft() {
        return new FlightPreferencesType.Aircraft();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows createFlightPreferencesTypeAircraftRows() {
        return new FlightPreferencesType.Aircraft.Rows();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats createFlightPreferencesTypeAircraftSeats() {
        return new FlightPreferencesType.Aircraft.Seats();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes createFlightPreferencesTypeAircraftClasses() {
        return new FlightPreferencesType.Aircraft.Classes();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins createFlightPreferencesTypeAircraftCabins() {
        return new FlightPreferencesType.Aircraft.Cabins();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType }
     * 
     */
    public EquivFareTransactionType createEquivFareTransactionType() {
        return new EquivFareTransactionType();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType }
     * 
     */
    public ListOfServiceBundleType createListOfServiceBundleType() {
        return new ListOfServiceBundleType();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle createListOfServiceBundleTypeServiceBundle() {
        return new ListOfServiceBundleType.ServiceBundle();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType }
     * 
     */
    public PricingParametersNoticeType createPricingParametersNoticeType() {
        return new PricingParametersNoticeType();
    }

    /**
     * Create an instance of {@link BaggageOfferType }
     * 
     */
    public BaggageOfferType createBaggageOfferType() {
        return new BaggageOfferType();
    }

    /**
     * Create an instance of {@link BaggageOfferType.BagDetails }
     * 
     */
    public BaggageOfferType.BagDetails createBaggageOfferTypeBagDetails() {
        return new BaggageOfferType.BagDetails();
    }

    /**
     * Create an instance of {@link BaggageOfferType.BagDetails.BagDetail }
     * 
     */
    public BaggageOfferType.BagDetails.BagDetail createBaggageOfferTypeBagDetailsBagDetail() {
        return new BaggageOfferType.BagDetails.BagDetail();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType }
     * 
     */
    public ShoppingResponseIDType createShoppingResponseIDType() {
        return new ShoppingResponseIDType();
    }

    /**
     * Create an instance of {@link InvGuaranteeType }
     * 
     */
    public InvGuaranteeType createInvGuaranteeType() {
        return new InvGuaranteeType();
    }

    /**
     * Create an instance of {@link Contacts.Contact }
     * 
     */
    public Contacts.Contact createContactsContact() {
        return new Contacts.Contact();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name }
     * 
     */
    public Contacts.Contact.Name createContactsContactName() {
        return new Contacts.Contact.Name();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType }
     * 
     */
    public AirlinePreferencesType createAirlinePreferencesType() {
        return new AirlinePreferencesType();
    }

    /**
     * Create an instance of {@link MsgPartiesType }
     * 
     */
    public MsgPartiesType createMsgPartiesType() {
        return new MsgPartiesType();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants }
     * 
     */
    public MsgPartiesType.Participants createMsgPartiesTypeParticipants() {
        return new MsgPartiesType.Participants();
    }

    /**
     * Create an instance of {@link OtherOfferType }
     * 
     */
    public OtherOfferType createOtherOfferType() {
        return new OtherOfferType();
    }

    /**
     * Create an instance of {@link SettlementType }
     * 
     */
    public SettlementType createSettlementType() {
        return new SettlementType();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.StopLocations }
     * 
     */
    public SecurePaymentPaxInfoType.StopLocations createSecurePaymentPaxInfoTypeStopLocations() {
        return new SecurePaymentPaxInfoType.StopLocations();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.DateTimes }
     * 
     */
    public SecurePaymentPaxInfoType.DateTimes createSecurePaymentPaxInfoTypeDateTimes() {
        return new SecurePaymentPaxInfoType.DateTimes();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.Carriers }
     * 
     */
    public SecurePaymentPaxInfoType.Carriers createSecurePaymentPaxInfoTypeCarriers() {
        return new SecurePaymentPaxInfoType.Carriers();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link PersonBudgetType }
     * 
     */
    public PersonBudgetType createPersonBudgetType() {
        return new PersonBudgetType();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType }
     * 
     */
    public ServiceFilterNoticeType createServiceFilterNoticeType() {
        return new ServiceFilterNoticeType();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results }
     * 
     */
    public ServiceFilterNoticeType.Results createServiceFilterNoticeTypeResults() {
        return new ServiceFilterNoticeType.Results();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters createServiceFilterNoticeTypeResultsAppliedFilters() {
        return new ServiceFilterNoticeType.Results.AppliedFilters();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilter() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociations() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOffer() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer();
    }

    /**
     * Create an instance of {@link ListOfClassOfServiceType }
     * 
     */
    public ListOfClassOfServiceType createListOfClassOfServiceType() {
        return new ListOfClassOfServiceType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType }
     * 
     */
    public PriceVarianceRuleType createPriceVarianceRuleType() {
        return new PriceVarianceRuleType();
    }

    /**
     * Create an instance of {@link ServicePriceType }
     * 
     */
    public ServicePriceType createServicePriceType() {
        return new ServicePriceType();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details }
     * 
     */
    public ServicePriceType.Details createServicePriceTypeDetails() {
        return new ServicePriceType.Details();
    }

    /**
     * Create an instance of {@link OfferMatchType }
     * 
     */
    public OfferMatchType createOfferMatchType() {
        return new OfferMatchType();
    }

    /**
     * Create an instance of {@link TotalJourneyType }
     * 
     */
    public TotalJourneyType createTotalJourneyType() {
        return new TotalJourneyType();
    }

    /**
     * Create an instance of {@link FarePreferencesType }
     * 
     */
    public FarePreferencesType createFarePreferencesType() {
        return new FarePreferencesType();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs }
     * 
     */
    public FarePreferencesType.TicketDesigs createFarePreferencesTypeTicketDesigs() {
        return new FarePreferencesType.TicketDesigs();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes }
     * 
     */
    public FarePreferencesType.FareCodes createFarePreferencesTypeFareCodes() {
        return new FarePreferencesType.FareCodes();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Types }
     * 
     */
    public FarePreferencesType.Types createFarePreferencesTypeTypes() {
        return new FarePreferencesType.Types();
    }

    /**
     * Create an instance of {@link ListOfBagDisclosureType }
     * 
     */
    public ListOfBagDisclosureType createListOfBagDisclosureType() {
        return new ListOfBagDisclosureType();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType }
     * 
     */
    public AlliancePreferencesType createAlliancePreferencesType() {
        return new AlliancePreferencesType();
    }

    /**
     * Create an instance of {@link ItineraryType }
     * 
     */
    public ItineraryType createItineraryType() {
        return new ItineraryType();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType }
     * 
     */
    public FltSegmentMaxTimePreferencesType createFltSegmentMaxTimePreferencesType() {
        return new FltSegmentMaxTimePreferencesType();
    }

    /**
     * Create an instance of {@link TaxExemptionType }
     * 
     */
    public TaxExemptionType createTaxExemptionType() {
        return new TaxExemptionType();
    }

    /**
     * Create an instance of {@link FareFilingType }
     * 
     */
    public FareFilingType createFareFilingType() {
        return new FareFilingType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link ListOfMediaType }
     * 
     */
    public ListOfMediaType createListOfMediaType() {
        return new ListOfMediaType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType }
     * 
     */
    public AddlBaggageInfoType createAddlBaggageInfoType() {
        return new AddlBaggageInfoType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag createAddlBaggageInfoTypeCheckedChargeableBag() {
        return new AddlBaggageInfoType.CheckedChargeableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag createAddlBaggageInfoTypeCarryOnChargeableBag() {
        return new AddlBaggageInfoType.CarryOnChargeableBag();
    }

    /**
     * Create an instance of {@link DirectBillMethodType }
     * 
     */
    public DirectBillMethodType createDirectBillMethodType() {
        return new DirectBillMethodType();
    }

    /**
     * Create an instance of {@link OrderKeysType }
     * 
     */
    public OrderKeysType createOrderKeysType() {
        return new OrderKeysType();
    }

    /**
     * Create an instance of {@link OrderKeysType.AssociatedIDs }
     * 
     */
    public OrderKeysType.AssociatedIDs createOrderKeysTypeAssociatedIDs() {
        return new OrderKeysType.AssociatedIDs();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType }
     * 
     */
    public OfferItemMetadataType createOfferItemMetadataType() {
        return new OfferItemMetadataType();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Matches }
     * 
     */
    public OfferItemMetadataType.Matches createOfferItemMetadataTypeMatches() {
        return new OfferItemMetadataType.Matches();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType }
     * 
     */
    public BaggageDetailMetadataType createBaggageDetailMetadataType() {
        return new BaggageDetailMetadataType();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType }
     * 
     */
    public PaymentCardMethodType createPaymentCardMethodType() {
        return new PaymentCardMethodType();
    }

    /**
     * Create an instance of {@link CouponInfoType }
     * 
     */
    public CouponInfoType createCouponInfoType() {
        return new CouponInfoType();
    }

    /**
     * Create an instance of {@link GroupBudgetType }
     * 
     */
    public GroupBudgetType createGroupBudgetType() {
        return new GroupBudgetType();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType }
     * 
     */
    public FltDepartQualifiedQueryType createFltDepartQualifiedQueryType() {
        return new FltDepartQualifiedQueryType();
    }

    /**
     * Create an instance of {@link FareQualifierType }
     * 
     */
    public FareQualifierType createFareQualifierType() {
        return new FareQualifierType();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType }
     * 
     */
    public FlightCOSCoreType createFlightCOSCoreType() {
        return new FlightCOSCoreType();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType }
     * 
     */
    public PaymentRulesNoticeType createPaymentRulesNoticeType() {
        return new PaymentRulesNoticeType();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment createPaymentRulesNoticeTypeFormOfPayment() {
        return new PaymentRulesNoticeType.FormOfPayment();
    }

    /**
     * Create an instance of {@link ETFareInfoType }
     * 
     */
    public ETFareInfoType createETFareInfoType() {
        return new ETFareInfoType();
    }

    /**
     * Create an instance of {@link ListOfCarryOnAllowanceType }
     * 
     */
    public ListOfCarryOnAllowanceType createListOfCarryOnAllowanceType() {
        return new ListOfCarryOnAllowanceType();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.Certificates }
     * 
     */
    public LoyaltyRedemption.Certificates createLoyaltyRedemptionCertificates() {
        return new LoyaltyRedemption.Certificates();
    }

    /**
     * Create an instance of {@link StopLocationType }
     * 
     */
    public StopLocationType createStopLocationType() {
        return new StopLocationType();
    }

    /**
     * Create an instance of {@link FareList.FareGroup }
     * 
     */
    public FareList.FareGroup createFareListFareGroup() {
        return new FareList.FareGroup();
    }

    /**
     * Create an instance of {@link CampaignReferralType }
     * 
     */
    public CampaignReferralType createCampaignReferralType() {
        return new CampaignReferralType();
    }

    /**
     * Create an instance of {@link CampaignReferralType.UTM }
     * 
     */
    public CampaignReferralType.UTM createCampaignReferralTypeUTM() {
        return new CampaignReferralType.UTM();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType }
     * 
     */
    public BilateralTimeLimitsType createBilateralTimeLimitsType() {
        return new BilateralTimeLimitsType();
    }

    /**
     * Create an instance of {@link AddressCoreType }
     * 
     */
    public AddressCoreType createAddressCoreType() {
        return new AddressCoreType();
    }

    /**
     * Create an instance of {@link AddressMetadataType }
     * 
     */
    public AddressMetadataType createAddressMetadataType() {
        return new AddressMetadataType();
    }

    /**
     * Create an instance of {@link AddressMetadataType.AddressFields }
     * 
     */
    public AddressMetadataType.AddressFields createAddressMetadataTypeAddressFields() {
        return new AddressMetadataType.AddressFields();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType }
     * 
     */
    public ServiceQualifierPriceType createServiceQualifierPriceType() {
        return new ServiceQualifierPriceType();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment createServiceQualifierPriceTypeFulfillment() {
        return new ServiceQualifierPriceType.Fulfillment();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates createServiceQualifierPriceTypeFulfillmentOfferValidDates() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link DirectionsType }
     * 
     */
    public DirectionsType createDirectionsType() {
        return new DirectionsType();
    }

    /**
     * Create an instance of {@link WingPositionType }
     * 
     */
    public WingPositionType createWingPositionType() {
        return new WingPositionType();
    }

    /**
     * Create an instance of {@link ListOfBagAllowanceType }
     * 
     */
    public ListOfBagAllowanceType createListOfBagAllowanceType() {
        return new ListOfBagAllowanceType();
    }

    /**
     * Create an instance of {@link FareComponentType }
     * 
     */
    public FareComponentType createFareComponentType() {
        return new FareComponentType();
    }

    /**
     * Create an instance of {@link FlightArrivalType }
     * 
     */
    public FlightArrivalType createFlightArrivalType() {
        return new FlightArrivalType();
    }

    /**
     * Create an instance of {@link ListOfOfferPenaltyType }
     * 
     */
    public ListOfOfferPenaltyType createListOfOfferPenaltyType() {
        return new ListOfOfferPenaltyType();
    }

    /**
     * Create an instance of {@link ExitPositionType }
     * 
     */
    public ExitPositionType createExitPositionType() {
        return new ExitPositionType();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows }
     * 
     */
    public ExitPositionType.Rows createExitPositionTypeRows() {
        return new ExitPositionType.Rows();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link BankAccountMethodType }
     * 
     */
    public BankAccountMethodType createBankAccountMethodType() {
        return new BankAccountMethodType();
    }

    /**
     * Create an instance of {@link SeatLocationType }
     * 
     */
    public SeatLocationType createSeatLocationType() {
        return new SeatLocationType();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristics }
     * 
     */
    public SeatLocationType.Characteristics createSeatLocationTypeCharacteristics() {
        return new SeatLocationType.Characteristics();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row }
     * 
     */
    public SeatLocationType.Row createSeatLocationTypeRow() {
        return new SeatLocationType.Row();
    }

    /**
     * Create an instance of {@link GenericPriceType }
     * 
     */
    public GenericPriceType createGenericPriceType() {
        return new GenericPriceType();
    }

    /**
     * Create an instance of {@link BaggageItemType }
     * 
     */
    public BaggageItemType createBaggageItemType() {
        return new BaggageItemType();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails }
     * 
     */
    public BaggageItemType.BagDetails createBaggageItemTypeBagDetails() {
        return new BaggageItemType.BagDetails();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails.BagDetail }
     * 
     */
    public BaggageItemType.BagDetails.BagDetail createBaggageItemTypeBagDetailsBagDetail() {
        return new BaggageItemType.BagDetails.BagDetail();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType }
     * 
     */
    public InvDiscrepencyAlertType createInvDiscrepencyAlertType() {
        return new InvDiscrepencyAlertType();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers createInvDiscrepencyAlertTypeAlternateOffers() {
        return new InvDiscrepencyAlertType.AlternateOffers();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType }
     * 
     */
    public PricedFlightOfferAssocType createPricedFlightOfferAssocType() {
        return new PricedFlightOfferAssocType();
    }

    /**
     * Create an instance of {@link SeatOfferType }
     * 
     */
    public SeatOfferType createSeatOfferType() {
        return new SeatOfferType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType }
     * 
     */
    public CodesetMetadataType createCodesetMetadataType() {
        return new CodesetMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source }
     * 
     */
    public CodesetMetadataType.Source createCodesetMetadataTypeSource() {
        return new CodesetMetadataType.Source();
    }

    /**
     * Create an instance of {@link OtherOfferAssocType }
     * 
     */
    public OtherOfferAssocType createOtherOfferAssocType() {
        return new OtherOfferAssocType();
    }

    /**
     * Create an instance of {@link MediaAssocType }
     * 
     */
    public MediaAssocType createMediaAssocType() {
        return new MediaAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.Services }
     * 
     */
    public OfferAssociationsType.Services createOfferAssociationsTypeServices() {
        return new OfferAssociationsType.Services();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType }
     * 
     */
    public PaymentCardMetadataType createPaymentCardMetadataType() {
        return new PaymentCardMetadataType();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.CardFields }
     * 
     */
    public PaymentCardMetadataType.CardFields createPaymentCardMetadataTypeCardFields() {
        return new PaymentCardMetadataType.CardFields();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType }
     * 
     */
    public AirlineOffersSnapshotType createAirlineOffersSnapshotType() {
        return new AirlineOffersSnapshotType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType }
     * 
     */
    public RedemptionMethodType createRedemptionMethodType() {
        return new RedemptionMethodType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.Certificates }
     * 
     */
    public RedemptionMethodType.Certificates createRedemptionMethodTypeCertificates() {
        return new RedemptionMethodType.Certificates();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link BankAccountType }
     * 
     */
    public BankAccountType createBankAccountType() {
        return new BankAccountType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail createPrePaidProgramQualifierPrepaidProgramDetail() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate createPrePaidProgramQualifierPrepaidProgramDetailCertificate() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate();
    }

    /**
     * Create an instance of {@link ListOfDisclosureType }
     * 
     */
    public ListOfDisclosureType createListOfDisclosureType() {
        return new ListOfDisclosureType();
    }

    /**
     * Create an instance of {@link AirportMetadataType }
     * 
     */
    public AirportMetadataType createAirportMetadataType() {
        return new AirportMetadataType();
    }

    /**
     * Create an instance of {@link AddressDetailType }
     * 
     */
    public AddressDetailType createAddressDetailType() {
        return new AddressDetailType();
    }

    /**
     * Create an instance of {@link CombinationPriceType }
     * 
     */
    public CombinationPriceType createCombinationPriceType() {
        return new CombinationPriceType();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial }
     * 
     */
    public CombinationPriceType.Partial createCombinationPriceTypePartial() {
        return new CombinationPriceType.Partial();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType }
     * 
     */
    public OrderItemAssociationType createOrderItemAssociationType() {
        return new OrderItemAssociationType();
    }

    /**
     * Create an instance of {@link RuleMetadataType }
     * 
     */
    public RuleMetadataType createRuleMetadataType() {
        return new RuleMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values }
     * 
     */
    public RuleMetadataType.Values createRuleMetadataTypeValues() {
        return new RuleMetadataType.Values();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values.Value }
     * 
     */
    public RuleMetadataType.Values.Value createRuleMetadataTypeValuesValue() {
        return new RuleMetadataType.Values.Value();
    }

    /**
     * Create an instance of {@link CashMethodType }
     * 
     */
    public CashMethodType createCashMethodType() {
        return new CashMethodType();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType }
     * 
     */
    public EquivalentIDMetadataType createEquivalentIDMetadataType() {
        return new EquivalentIDMetadataType();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType }
     * 
     */
    public BagAllowanceDimensionType createBagAllowanceDimensionType() {
        return new BagAllowanceDimensionType();
    }

    /**
     * Create an instance of {@link ORAAirlineParticipantType }
     * 
     */
    public ORAAirlineParticipantType createORAAirlineParticipantType() {
        return new ORAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link DiscountMetadatas }
     * 
     */
    public DiscountMetadatas createDiscountMetadatas() {
        return new DiscountMetadatas();
    }

    /**
     * Create an instance of {@link DisclosureMetadataType }
     * 
     */
    public DisclosureMetadataType createDisclosureMetadataType() {
        return new DisclosureMetadataType();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadatas }
     * 
     */
    public EquivalentIDMetadatas createEquivalentIDMetadatas() {
        return new EquivalentIDMetadatas();
    }

    /**
     * Create an instance of {@link StayPeriodDateRangeType }
     * 
     */
    public StayPeriodDateRangeType createStayPeriodDateRangeType() {
        return new StayPeriodDateRangeType();
    }

    /**
     * Create an instance of {@link InConnectionWithType }
     * 
     */
    public InConnectionWithType createInConnectionWithType() {
        return new InConnectionWithType();
    }

    /**
     * Create an instance of {@link PTCQuantityPricedType }
     * 
     */
    public PTCQuantityPricedType createPTCQuantityPricedType() {
        return new PTCQuantityPricedType();
    }

    /**
     * Create an instance of {@link ServiceInfoAssocType }
     * 
     */
    public ServiceInfoAssocType createServiceInfoAssocType() {
        return new ServiceInfoAssocType();
    }

    /**
     * Create an instance of {@link CodesetType }
     * 
     */
    public CodesetType createCodesetType() {
        return new CodesetType();
    }

    /**
     * Create an instance of {@link AltBaggageOfferType }
     * 
     */
    public AltBaggageOfferType createAltBaggageOfferType() {
        return new AltBaggageOfferType();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadatas }
     * 
     */
    public BaggageDisclosureMetadatas createBaggageDisclosureMetadatas() {
        return new BaggageDisclosureMetadatas();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadataType }
     * 
     */
    public BaggageDisclosureMetadataType createBaggageDisclosureMetadataType() {
        return new BaggageDisclosureMetadataType();
    }

    /**
     * Create an instance of {@link AltPricedFlightOfferType }
     * 
     */
    public AltPricedFlightOfferType createAltPricedFlightOfferType() {
        return new AltPricedFlightOfferType();
    }

    /**
     * Create an instance of {@link GeoSpecCode }
     * 
     */
    public GeoSpecCode createGeoSpecCode() {
        return new GeoSpecCode();
    }

    /**
     * Create an instance of {@link AddressContactType }
     * 
     */
    public AddressContactType createAddressContactType() {
        return new AddressContactType();
    }

    /**
     * Create an instance of {@link ZoneMetadataType }
     * 
     */
    public ZoneMetadataType createZoneMetadataType() {
        return new ZoneMetadataType();
    }

    /**
     * Create an instance of {@link AgentUserIDType }
     * 
     */
    public AgentUserIDType createAgentUserIDType() {
        return new AgentUserIDType();
    }

    /**
     * Create an instance of {@link IncentiveProgramQualifier }
     * 
     */
    public IncentiveProgramQualifier createIncentiveProgramQualifier() {
        return new IncentiveProgramQualifier();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.AccountID }
     * 
     */
    public IncentiveProgramType.AccountID createIncentiveProgramTypeAccountID() {
        return new IncentiveProgramType.AccountID();
    }

    /**
     * Create an instance of {@link ndc.AirlineID }
     * 
     */
    public ndc.AirlineID createAirlineID() {
        return new ndc.AirlineID();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.MemberStatus }
     * 
     */
    public IncentiveProgramType.MemberStatus createIncentiveProgramTypeMemberStatus() {
        return new IncentiveProgramType.MemberStatus();
    }

    /**
     * Create an instance of {@link DateTimePeriodRepType }
     * 
     */
    public DateTimePeriodRepType createDateTimePeriodRepType() {
        return new DateTimePeriodRepType();
    }

    /**
     * Create an instance of {@link CurrencyMetadata }
     * 
     */
    public CurrencyMetadata createCurrencyMetadata() {
        return new CurrencyMetadata();
    }

    /**
     * Create an instance of {@link CurrencyMetadataType }
     * 
     */
    public CurrencyMetadataType createCurrencyMetadataType() {
        return new CurrencyMetadataType();
    }

    /**
     * Create an instance of {@link MetadataObjectBaseType }
     * 
     */
    public MetadataObjectBaseType createMetadataObjectBaseType() {
        return new MetadataObjectBaseType();
    }

    /**
     * Create an instance of {@link AugPointInfoType }
     * 
     */
    public AugPointInfoType createAugPointInfoType() {
        return new AugPointInfoType();
    }

    /**
     * Create an instance of {@link ContactMetadataType }
     * 
     */
    public ContactMetadataType createContactMetadataType() {
        return new ContactMetadataType();
    }

    /**
     * Create an instance of {@link OperatingCarrierRecipientType }
     * 
     */
    public OperatingCarrierRecipientType createOperatingCarrierRecipientType() {
        return new OperatingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link OnTimePerformance }
     * 
     */
    public OnTimePerformance createOnTimePerformance() {
        return new OnTimePerformance();
    }

    /**
     * Create an instance of {@link StayPeriodSeasonType }
     * 
     */
    public StayPeriodSeasonType createStayPeriodSeasonType() {
        return new StayPeriodSeasonType();
    }

    /**
     * Create an instance of {@link UnstructuredFareCalcType }
     * 
     */
    public UnstructuredFareCalcType createUnstructuredFareCalcType() {
        return new UnstructuredFareCalcType();
    }

    /**
     * Create an instance of {@link PassengerInfoAssocType }
     * 
     */
    public PassengerInfoAssocType createPassengerInfoAssocType() {
        return new PassengerInfoAssocType();
    }

    /**
     * Create an instance of {@link ItemIDType }
     * 
     */
    public ItemIDType createItemIDType() {
        return new ItemIDType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentFormType }
     * 
     */
    public AcceptedPaymentFormType createAcceptedPaymentFormType() {
        return new AcceptedPaymentFormType();
    }

    /**
     * Create an instance of {@link AggregatorParticipantType }
     * 
     */
    public AggregatorParticipantType createAggregatorParticipantType() {
        return new AggregatorParticipantType();
    }

    /**
     * Create an instance of {@link PenaltyMetadataType }
     * 
     */
    public PenaltyMetadataType createPenaltyMetadataType() {
        return new PenaltyMetadataType();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link LeadDatePeriodType }
     * 
     */
    public LeadDatePeriodType createLeadDatePeriodType() {
        return new LeadDatePeriodType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link OfferDetailInfoAssocType }
     * 
     */
    public OfferDetailInfoAssocType createOfferDetailInfoAssocType() {
        return new OfferDetailInfoAssocType();
    }

    /**
     * Create an instance of {@link RetailSupplierRecipientType }
     * 
     */
    public RetailSupplierRecipientType createRetailSupplierRecipientType() {
        return new RetailSupplierRecipientType();
    }

    /**
     * Create an instance of {@link FlightMetadata }
     * 
     */
    public FlightMetadata createFlightMetadata() {
        return new FlightMetadata();
    }

    /**
     * Create an instance of {@link FlightFrequencyType }
     * 
     */
    public FlightFrequencyType createFlightFrequencyType() {
        return new FlightFrequencyType();
    }

    /**
     * Create an instance of {@link FlightMetadataType.Meals }
     * 
     */
    public FlightMetadataType.Meals createFlightMetadataTypeMeals() {
        return new FlightMetadataType.Meals();
    }

    /**
     * Create an instance of {@link YearRepType }
     * 
     */
    public YearRepType createYearRepType() {
        return new YearRepType();
    }

    /**
     * Create an instance of {@link ACSTxnReference }
     * 
     */
    public ACSTxnReference createACSTxnReference() {
        return new ACSTxnReference();
    }

    /**
     * Create an instance of {@link PaymentCardMetadatas }
     * 
     */
    public PaymentCardMetadatas createPaymentCardMetadatas() {
        return new PaymentCardMetadatas();
    }

    /**
     * Create an instance of {@link BaggageQueryMetadataType }
     * 
     */
    public BaggageQueryMetadataType createBaggageQueryMetadataType() {
        return new BaggageQueryMetadataType();
    }

    /**
     * Create an instance of {@link OfferAssociations }
     * 
     */
    public OfferAssociations createOfferAssociations() {
        return new OfferAssociations();
    }

    /**
     * Create an instance of {@link ShopperInfoAssocType }
     * 
     */
    public ShopperInfoAssocType createShopperInfoAssocType() {
        return new ShopperInfoAssocType();
    }

    /**
     * Create an instance of {@link FlightInfoAssocType }
     * 
     */
    public FlightInfoAssocType createFlightInfoAssocType() {
        return new FlightInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.PriceClass }
     * 
     */
    public OfferAssociationsType.PriceClass createOfferAssociationsTypePriceClass() {
        return new OfferAssociationsType.PriceClass();
    }

    /**
     * Create an instance of {@link BagDetailAssocType }
     * 
     */
    public BagDetailAssocType createBagDetailAssocType() {
        return new BagDetailAssocType();
    }

    /**
     * Create an instance of {@link CodesetMetadatas }
     * 
     */
    public CodesetMetadatas createCodesetMetadatas() {
        return new CodesetMetadatas();
    }

    /**
     * Create an instance of {@link LanguageCodeType }
     * 
     */
    public LanguageCodeType createLanguageCodeType() {
        return new LanguageCodeType();
    }

    /**
     * Create an instance of {@link PricedOffer }
     * 
     */
    public PricedOffer createPricedOffer() {
        return new PricedOffer();
    }

    /**
     * Create an instance of {@link KeyWithMetaOfferBaseType }
     * 
     */
    public KeyWithMetaOfferBaseType createKeyWithMetaOfferBaseType() {
        return new KeyWithMetaOfferBaseType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferType.OfferPrice }
     * 
     */
    public PricedFlightOfferType.OfferPrice createPricedFlightOfferTypeOfferPrice() {
        return new PricedFlightOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link BagDetailAssociation }
     * 
     */
    public BagDetailAssociation createBagDetailAssociation() {
        return new BagDetailAssociation();
    }

    /**
     * Create an instance of {@link FlightMileageType }
     * 
     */
    public FlightMileageType createFlightMileageType() {
        return new FlightMileageType();
    }

    /**
     * Create an instance of {@link OfferItemType }
     * 
     */
    public OfferItemType createOfferItemType() {
        return new OfferItemType();
    }

    /**
     * Create an instance of {@link FlightItemType }
     * 
     */
    public FlightItemType createFlightItemType() {
        return new FlightItemType();
    }

    /**
     * Create an instance of {@link OtherItemType }
     * 
     */
    public OtherItemType createOtherItemType() {
        return new OtherItemType();
    }

    /**
     * Create an instance of {@link SeatItem }
     * 
     */
    public SeatItem createSeatItem() {
        return new SeatItem();
    }

    /**
     * Create an instance of {@link SeatItemType }
     * 
     */
    public SeatItemType createSeatItemType() {
        return new SeatItemType();
    }

    /**
     * Create an instance of {@link ndc.Descriptions }
     * 
     */
    public ndc.Descriptions createDescriptions() {
        return new ndc.Descriptions();
    }

    /**
     * Create an instance of {@link SimpleAddrType }
     * 
     */
    public SimpleAddrType createSimpleAddrType() {
        return new SimpleAddrType();
    }

    /**
     * Create an instance of {@link ContentMetadataType }
     * 
     */
    public ContentMetadataType createContentMetadataType() {
        return new ContentMetadataType();
    }

    /**
     * Create an instance of {@link DateRepType }
     * 
     */
    public DateRepType createDateRepType() {
        return new DateRepType();
    }

    /**
     * Create an instance of {@link Failed }
     * 
     */
    public Failed createFailed() {
        return new Failed();
    }

    /**
     * Create an instance of {@link ServiceList }
     * 
     */
    public ServiceList createServiceList() {
        return new ServiceList();
    }

    /**
     * Create an instance of {@link SegmentReferences }
     * 
     */
    public SegmentReferences createSegmentReferences() {
        return new SegmentReferences();
    }

    /**
     * Create an instance of {@link CarryOnBagMetadatas }
     * 
     */
    public CarryOnBagMetadatas createCarryOnBagMetadatas() {
        return new CarryOnBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCarryOnMetadataType }
     * 
     */
    public BaggageCarryOnMetadataType createBaggageCarryOnMetadataType() {
        return new BaggageCarryOnMetadataType();
    }

    /**
     * Create an instance of {@link MiscChargeOrder }
     * 
     */
    public MiscChargeOrder createMiscChargeOrder() {
        return new MiscChargeOrder();
    }

    /**
     * Create an instance of {@link ServicePricingOnlyPreference }
     * 
     */
    public ServicePricingOnlyPreference createServicePricingOnlyPreference() {
        return new ServicePricingOnlyPreference();
    }

    /**
     * Create an instance of {@link MarketingCarrierType }
     * 
     */
    public MarketingCarrierType createMarketingCarrierType() {
        return new MarketingCarrierType();
    }

    /**
     * Create an instance of {@link ListOfPriceClassType }
     * 
     */
    public ListOfPriceClassType createListOfPriceClassType() {
        return new ListOfPriceClassType();
    }

    /**
     * Create an instance of {@link SeatMetadataType }
     * 
     */
    public SeatMetadataType createSeatMetadataType() {
        return new SeatMetadataType();
    }

    /**
     * Create an instance of {@link ndc.Directions }
     * 
     */
    public ndc.Directions createDirections() {
        return new ndc.Directions();
    }

    /**
     * Create an instance of {@link DirectionsMetadataType }
     * 
     */
    public DirectionsMetadataType createDirectionsMetadataType() {
        return new DirectionsMetadataType();
    }

    /**
     * Create an instance of {@link AddressMetadatas }
     * 
     */
    public AddressMetadatas createAddressMetadatas() {
        return new AddressMetadatas();
    }

    /**
     * Create an instance of {@link AffinityStateProvDepartType }
     * 
     */
    public AffinityStateProvDepartType createAffinityStateProvDepartType() {
        return new AffinityStateProvDepartType();
    }

    /**
     * Create an instance of {@link OperatingCarrierSenderType }
     * 
     */
    public OperatingCarrierSenderType createOperatingCarrierSenderType() {
        return new OperatingCarrierSenderType();
    }

    /**
     * Create an instance of {@link LeadTimePeriodType }
     * 
     */
    public LeadTimePeriodType createLeadTimePeriodType() {
        return new LeadTimePeriodType();
    }

    /**
     * Create an instance of {@link OtherMethodType }
     * 
     */
    public OtherMethodType createOtherMethodType() {
        return new OtherMethodType();
    }

    /**
     * Create an instance of {@link MinimumStay.DayQuantity }
     * 
     */
    public MinimumStay.DayQuantity createMinimumStayDayQuantity() {
        return new MinimumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link FlightSegmentReferences }
     * 
     */
    public FlightSegmentReferences createFlightSegmentReferences() {
        return new FlightSegmentReferences();
    }

    /**
     * Create an instance of {@link ndc.TimeLimits.PaymentTimeLimit }
     * 
     */
    public ndc.TimeLimits.PaymentTimeLimit createTimeLimitsPaymentTimeLimit() {
        return new ndc.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimit }
     * 
     */
    public PriceGuaranteeTimeLimit createPriceGuaranteeTimeLimit() {
        return new PriceGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link PriceGuarTimeLimitType }
     * 
     */
    public PriceGuarTimeLimitType createPriceGuarTimeLimitType() {
        return new PriceGuarTimeLimitType();
    }

    /**
     * Create an instance of {@link KeyWithMetaObjectBaseType }
     * 
     */
    public KeyWithMetaObjectBaseType createKeyWithMetaObjectBaseType() {
        return new KeyWithMetaObjectBaseType();
    }

    /**
     * Create an instance of {@link DepositTimeLimit }
     * 
     */
    public DepositTimeLimit createDepositTimeLimit() {
        return new DepositTimeLimit();
    }

    /**
     * Create an instance of {@link DepositTimeLimitType }
     * 
     */
    public DepositTimeLimitType createDepositTimeLimitType() {
        return new DepositTimeLimitType();
    }

    /**
     * Create an instance of {@link TicketingTimeLimits }
     * 
     */
    public TicketingTimeLimits createTicketingTimeLimits() {
        return new TicketingTimeLimits();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType }
     * 
     */
    public TicketingTimeLimitType createTicketingTimeLimitType() {
        return new TicketingTimeLimitType();
    }

    /**
     * Create an instance of {@link NamingTimeLimit }
     * 
     */
    public NamingTimeLimit createNamingTimeLimit() {
        return new NamingTimeLimit();
    }

    /**
     * Create an instance of {@link NamingTimeLimitType }
     * 
     */
    public NamingTimeLimitType createNamingTimeLimitType() {
        return new NamingTimeLimitType();
    }

    /**
     * Create an instance of {@link ContactMetadatas }
     * 
     */
    public ContactMetadatas createContactMetadatas() {
        return new ContactMetadatas();
    }

    /**
     * Create an instance of {@link BookingReferences }
     * 
     */
    public BookingReferences createBookingReferences() {
        return new BookingReferences();
    }

    /**
     * Create an instance of {@link RuleMetadatas }
     * 
     */
    public RuleMetadatas createRuleMetadatas() {
        return new RuleMetadatas();
    }

    /**
     * Create an instance of {@link SPMTxnReference }
     * 
     */
    public SPMTxnReference createSPMTxnReference() {
        return new SPMTxnReference();
    }

    /**
     * Create an instance of {@link BestPricingPreferencesType }
     * 
     */
    public BestPricingPreferencesType createBestPricingPreferencesType() {
        return new BestPricingPreferencesType();
    }

    /**
     * Create an instance of {@link AdvancePurchase }
     * 
     */
    public AdvancePurchase createAdvancePurchase() {
        return new AdvancePurchase();
    }

    /**
     * Create an instance of {@link AffinityReferencePointArriveType }
     * 
     */
    public AffinityReferencePointArriveType createAffinityReferencePointArriveType() {
        return new AffinityReferencePointArriveType();
    }

    /**
     * Create an instance of {@link CityCode }
     * 
     */
    public CityCode createCityCode() {
        return new CityCode();
    }

    /**
     * Create an instance of {@link CityCodeType }
     * 
     */
    public CityCodeType createCityCodeType() {
        return new CityCodeType();
    }

    /**
     * Create an instance of {@link Policies.Policy }
     * 
     */
    public Policies.Policy createPoliciesPolicy() {
        return new Policies.Policy();
    }

    /**
     * Create an instance of {@link ndc.Address }
     * 
     */
    public ndc.Address createAddress() {
        return new ndc.Address();
    }

    /**
     * Create an instance of {@link IssuingAirlineInfo }
     * 
     */
    public IssuingAirlineInfo createIssuingAirlineInfo() {
        return new IssuingAirlineInfo();
    }

    /**
     * Create an instance of {@link AirlineIssuanceType }
     * 
     */
    public AirlineIssuanceType createAirlineIssuanceType() {
        return new AirlineIssuanceType();
    }

    /**
     * Create an instance of {@link ndc.Flight }
     * 
     */
    public ndc.Flight createFlight() {
        return new ndc.Flight();
    }

    /**
     * Create an instance of {@link FlightMetadatas }
     * 
     */
    public FlightMetadatas createFlightMetadatas() {
        return new FlightMetadatas();
    }

    /**
     * Create an instance of {@link ItineraryMetadataType }
     * 
     */
    public ItineraryMetadataType createItineraryMetadataType() {
        return new ItineraryMetadataType();
    }

    /**
     * Create an instance of {@link KeyObjectBaseType }
     * 
     */
    public KeyObjectBaseType createKeyObjectBaseType() {
        return new KeyObjectBaseType();
    }

    /**
     * Create an instance of {@link CorporateFare.CompanyIndex }
     * 
     */
    public CorporateFare.CompanyIndex createCorporateFareCompanyIndex() {
        return new CorporateFare.CompanyIndex();
    }

    /**
     * Create an instance of {@link CorporateFare.Contract }
     * 
     */
    public CorporateFare.Contract createCorporateFareContract() {
        return new CorporateFare.Contract();
    }

    /**
     * Create an instance of {@link CorporateFare.Account }
     * 
     */
    public CorporateFare.Account createCorporateFareAccount() {
        return new CorporateFare.Account();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.MemberNumber }
     * 
     */
    public LoyaltyRedemption.MemberNumber createLoyaltyRedemptionMemberNumber() {
        return new LoyaltyRedemption.MemberNumber();
    }

    /**
     * Create an instance of {@link DateTimeRepType }
     * 
     */
    public DateTimeRepType createDateTimeRepType() {
        return new DateTimeRepType();
    }

    /**
     * Create an instance of {@link SpecialQualiferType }
     * 
     */
    public SpecialQualiferType createSpecialQualiferType() {
        return new SpecialQualiferType();
    }

    /**
     * Create an instance of {@link ApplicableFlight }
     * 
     */
    public ApplicableFlight createApplicableFlight() {
        return new ApplicableFlight();
    }

    /**
     * Create an instance of {@link FlightSegmentReference }
     * 
     */
    public FlightSegmentReference createFlightSegmentReference() {
        return new FlightSegmentReference();
    }

    /**
     * Create an instance of {@link SimpleAircraftCabinType }
     * 
     */
    public SimpleAircraftCabinType createSimpleAircraftCabinType() {
        return new SimpleAircraftCabinType();
    }

    /**
     * Create an instance of {@link FlightReferences }
     * 
     */
    public FlightReferences createFlightReferences() {
        return new FlightReferences();
    }

    /**
     * Create an instance of {@link ndc.Position }
     * 
     */
    public ndc.Position createPosition() {
        return new ndc.Position();
    }

    /**
     * Create an instance of {@link PositionType.Latitude }
     * 
     */
    public PositionType.Latitude createPositionTypeLatitude() {
        return new PositionType.Latitude();
    }

    /**
     * Create an instance of {@link PositionType.Longitude }
     * 
     */
    public PositionType.Longitude createPositionTypeLongitude() {
        return new PositionType.Longitude();
    }

    /**
     * Create an instance of {@link PositionType.Altitude }
     * 
     */
    public PositionType.Altitude createPositionTypeAltitude() {
        return new PositionType.Altitude();
    }

    /**
     * Create an instance of {@link LanguageMetadataType }
     * 
     */
    public LanguageMetadataType createLanguageMetadataType() {
        return new LanguageMetadataType();
    }

    /**
     * Create an instance of {@link FareQualifierCodes }
     * 
     */
    public FareQualifierCodes createFareQualifierCodes() {
        return new FareQualifierCodes();
    }

    /**
     * Create an instance of {@link OrderInstructions }
     * 
     */
    public OrderInstructions createOrderInstructions() {
        return new OrderInstructions();
    }

    /**
     * Create an instance of {@link OrderInstructionType }
     * 
     */
    public OrderInstructionType createOrderInstructionType() {
        return new OrderInstructionType();
    }

    /**
     * Create an instance of {@link OfferClassUpgradeType }
     * 
     */
    public OfferClassUpgradeType createOfferClassUpgradeType() {
        return new OfferClassUpgradeType();
    }

    /**
     * Create an instance of {@link FreeFormInstructionsType }
     * 
     */
    public FreeFormInstructionsType createFreeFormInstructionsType() {
        return new FreeFormInstructionsType();
    }

    /**
     * Create an instance of {@link BagAllowanceDescType }
     * 
     */
    public BagAllowanceDescType createBagAllowanceDescType() {
        return new BagAllowanceDescType();
    }

    /**
     * Create an instance of {@link PricingInfo }
     * 
     */
    public PricingInfo createPricingInfo() {
        return new PricingInfo();
    }

    /**
     * Create an instance of {@link PricingInfoType }
     * 
     */
    public PricingInfoType createPricingInfoType() {
        return new PricingInfoType();
    }

    /**
     * Create an instance of {@link ndc.CountryCode }
     * 
     */
    public ndc.CountryCode createCountryCode() {
        return new ndc.CountryCode();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link AgentID }
     * 
     */
    public AgentID createAgentID() {
        return new AgentID();
    }

    /**
     * Create an instance of {@link CouponAgentType.ID }
     * 
     */
    public CouponAgentType.ID createCouponAgentTypeID() {
        return new CouponAgentType.ID();
    }

    /**
     * Create an instance of {@link InventoryGuaranteeTimeLimits }
     * 
     */
    public InventoryGuaranteeTimeLimits createInventoryGuaranteeTimeLimits() {
        return new InventoryGuaranteeTimeLimits();
    }

    /**
     * Create an instance of {@link CoreDateGrpType }
     * 
     */
    public CoreDateGrpType createCoreDateGrpType() {
        return new CoreDateGrpType();
    }

    /**
     * Create an instance of {@link CountryMetadataType }
     * 
     */
    public CountryMetadataType createCountryMetadataType() {
        return new CountryMetadataType();
    }

    /**
     * Create an instance of {@link CardQualifierType }
     * 
     */
    public CardQualifierType createCardQualifierType() {
        return new CardQualifierType();
    }

    /**
     * Create an instance of {@link SocialQualiferType }
     * 
     */
    public SocialQualiferType createSocialQualiferType() {
        return new SocialQualiferType();
    }

    /**
     * Create an instance of {@link CurrCode }
     * 
     */
    public CurrCode createCurrCode() {
        return new CurrCode();
    }

    /**
     * Create an instance of {@link AffinityReferencePointDepartType }
     * 
     */
    public AffinityReferencePointDepartType createAffinityReferencePointDepartType() {
        return new AffinityReferencePointDepartType();
    }

    /**
     * Create an instance of {@link AffinityStateProvArriveType }
     * 
     */
    public AffinityStateProvArriveType createAffinityStateProvArriveType() {
        return new AffinityStateProvArriveType();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimitType }
     * 
     */
    public PriceGuaranteeTimeLimitType createPriceGuaranteeTimeLimitType() {
        return new PriceGuaranteeTimeLimitType();
    }

    /**
     * Create an instance of {@link AffinityCountryArriveType }
     * 
     */
    public AffinityCountryArriveType createAffinityCountryArriveType() {
        return new AffinityCountryArriveType();
    }

    /**
     * Create an instance of {@link DepartureCode }
     * 
     */
    public DepartureCode createDepartureCode() {
        return new DepartureCode();
    }

    /**
     * Create an instance of {@link TravelTimePreferencesType }
     * 
     */
    public TravelTimePreferencesType createTravelTimePreferencesType() {
        return new TravelTimePreferencesType();
    }

    /**
     * Create an instance of {@link ShopMetadataGroup }
     * 
     */
    public ShopMetadataGroup createShopMetadataGroup() {
        return new ShopMetadataGroup();
    }

    /**
     * Create an instance of {@link Baggage }
     * 
     */
    public Baggage createBaggage() {
        return new Baggage();
    }

    /**
     * Create an instance of {@link CheckedBagMetadatas }
     * 
     */
    public CheckedBagMetadatas createCheckedBagMetadatas() {
        return new CheckedBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCheckedMetadataType }
     * 
     */
    public BaggageCheckedMetadataType createBaggageCheckedMetadataType() {
        return new BaggageCheckedMetadataType();
    }

    /**
     * Create an instance of {@link ndc.Location }
     * 
     */
    public ndc.Location createLocation() {
        return new ndc.Location();
    }

    /**
     * Create an instance of {@link DirectionMetadatas }
     * 
     */
    public DirectionMetadatas createDirectionMetadatas() {
        return new DirectionMetadatas();
    }

    /**
     * Create an instance of {@link ndc.Offer }
     * 
     */
    public ndc.Offer createOffer() {
        return new ndc.Offer();
    }

    /**
     * Create an instance of {@link DisclosureMetadatas }
     * 
     */
    public DisclosureMetadatas createDisclosureMetadatas() {
        return new DisclosureMetadatas();
    }

    /**
     * Create an instance of {@link OfferMetadatas }
     * 
     */
    public OfferMetadatas createOfferMetadatas() {
        return new OfferMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadatas }
     * 
     */
    public OfferInstructionMetadatas createOfferInstructionMetadatas() {
        return new OfferInstructionMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadataType }
     * 
     */
    public OfferInstructionMetadataType createOfferInstructionMetadataType() {
        return new OfferInstructionMetadataType();
    }

    /**
     * Create an instance of {@link OfferPenaltyMetadatas }
     * 
     */
    public OfferPenaltyMetadatas createOfferPenaltyMetadatas() {
        return new OfferPenaltyMetadatas();
    }

    /**
     * Create an instance of {@link OfferTermsMetadatas }
     * 
     */
    public OfferTermsMetadatas createOfferTermsMetadatas() {
        return new OfferTermsMetadatas();
    }

    /**
     * Create an instance of {@link OfferTermsMetadataType }
     * 
     */
    public OfferTermsMetadataType createOfferTermsMetadataType() {
        return new OfferTermsMetadataType();
    }

    /**
     * Create an instance of {@link ndc.Pricing }
     * 
     */
    public ndc.Pricing createPricing() {
        return new ndc.Pricing();
    }

    /**
     * Create an instance of {@link ndc.Qualifier }
     * 
     */
    public ndc.Qualifier createQualifier() {
        return new ndc.Qualifier();
    }

    /**
     * Create an instance of {@link BaggagePricingQualifierType }
     * 
     */
    public BaggagePricingQualifierType createBaggagePricingQualifierType() {
        return new BaggagePricingQualifierType();
    }

    /**
     * Create an instance of {@link ExistingOrderQualifier }
     * 
     */
    public ExistingOrderQualifier createExistingOrderQualifier() {
        return new ExistingOrderQualifier();
    }

    /**
     * Create an instance of {@link OrderQualiferType }
     * 
     */
    public OrderQualiferType createOrderQualiferType() {
        return new OrderQualiferType();
    }

    /**
     * Create an instance of {@link BookingReference }
     * 
     */
    public BookingReference createBookingReference() {
        return new BookingReference();
    }

    /**
     * Create an instance of {@link BookingReferenceType.AirlineID }
     * 
     */
    public BookingReferenceType.AirlineID createBookingReferenceTypeAirlineID() {
        return new BookingReferenceType.AirlineID();
    }

    /**
     * Create an instance of {@link BookingReferenceType.OtherID }
     * 
     */
    public BookingReferenceType.OtherID createBookingReferenceTypeOtherID() {
        return new BookingReferenceType.OtherID();
    }

    /**
     * Create an instance of {@link ProgramQualifiers }
     * 
     */
    public ProgramQualifiers createProgramQualifiers() {
        return new ProgramQualifiers();
    }

    /**
     * Create an instance of {@link ProgramQualifierType }
     * 
     */
    public ProgramQualifierType createProgramQualifierType() {
        return new ProgramQualifierType();
    }

    /**
     * Create an instance of {@link PromotionQualifiers }
     * 
     */
    public PromotionQualifiers createPromotionQualifiers() {
        return new PromotionQualifiers();
    }

    /**
     * Create an instance of {@link PromoQualifierType }
     * 
     */
    public PromoQualifierType createPromoQualifierType() {
        return new PromoQualifierType();
    }

    /**
     * Create an instance of {@link PromotionType.Code }
     * 
     */
    public PromotionType.Code createPromotionTypeCode() {
        return new PromotionType.Code();
    }

    /**
     * Create an instance of {@link PromotionType.Issuer }
     * 
     */
    public PromotionType.Issuer createPromotionTypeIssuer() {
        return new PromotionType.Issuer();
    }

    /**
     * Create an instance of {@link SeatQualifier.Assignment }
     * 
     */
    public SeatQualifier.Assignment createSeatQualifierAssignment() {
        return new SeatQualifier.Assignment();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link SeatMetadatas }
     * 
     */
    public SeatMetadatas createSeatMetadatas() {
        return new SeatMetadatas();
    }

    /**
     * Create an instance of {@link SeatMapMetadatas }
     * 
     */
    public SeatMapMetadatas createSeatMapMetadatas() {
        return new SeatMapMetadatas();
    }

    /**
     * Create an instance of {@link SeatMapMetadataType }
     * 
     */
    public SeatMapMetadataType createSeatMapMetadataType() {
        return new SeatMapMetadataType();
    }

    /**
     * Create an instance of {@link CabinType }
     * 
     */
    public CabinType createCabinType() {
        return new CabinType();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link AircraftCode }
     * 
     */
    public AircraftCode createAircraftCode() {
        return new AircraftCode();
    }

    /**
     * Create an instance of {@link AircraftCodeType }
     * 
     */
    public AircraftCodeType createAircraftCodeType() {
        return new AircraftCodeType();
    }

    /**
     * Create an instance of {@link ndc.TicketDocument }
     * 
     */
    public ndc.TicketDocument createTicketDocument() {
        return new ndc.TicketDocument();
    }

    /**
     * Create an instance of {@link CouponTicketDocType }
     * 
     */
    public CouponTicketDocType createCouponTicketDocType() {
        return new CouponTicketDocType();
    }

    /**
     * Create an instance of {@link AggregatorType }
     * 
     */
    public AggregatorType createAggregatorType() {
        return new AggregatorType();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceReservation }
     * 
     */
    public AdvanceTicketing.AdvanceReservation createAdvanceTicketingAdvanceReservation() {
        return new AdvanceTicketing.AdvanceReservation();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceDeparture }
     * 
     */
    public AdvanceTicketing.AdvanceDeparture createAdvanceTicketingAdvanceDeparture() {
        return new AdvanceTicketing.AdvanceDeparture();
    }

    /**
     * Create an instance of {@link FlightDurationType }
     * 
     */
    public FlightDurationType createFlightDurationType() {
        return new FlightDurationType();
    }

    /**
     * Create an instance of {@link SegmentReference }
     * 
     */
    public SegmentReference createSegmentReference() {
        return new SegmentReference();
    }

    /**
     * Create an instance of {@link LeadPrice.TotalAmount }
     * 
     */
    public LeadPrice.TotalAmount createLeadPriceTotalAmount() {
        return new LeadPrice.TotalAmount();
    }

    /**
     * Create an instance of {@link CurrencyAmountOptType }
     * 
     */
    public CurrencyAmountOptType createCurrencyAmountOptType() {
        return new CurrencyAmountOptType();
    }

    /**
     * Create an instance of {@link LeadPrice.Surcharges }
     * 
     */
    public LeadPrice.Surcharges createLeadPriceSurcharges() {
        return new LeadPrice.Surcharges();
    }

    /**
     * Create an instance of {@link AwardPriceUnitType }
     * 
     */
    public AwardPriceUnitType createAwardPriceUnitType() {
        return new AwardPriceUnitType();
    }

    /**
     * Create an instance of {@link SrvcLocationAddressType }
     * 
     */
    public SrvcLocationAddressType createSrvcLocationAddressType() {
        return new SrvcLocationAddressType();
    }

    /**
     * Create an instance of {@link StateProvMetadataType }
     * 
     */
    public StateProvMetadataType createStateProvMetadataType() {
        return new StateProvMetadataType();
    }

    /**
     * Create an instance of {@link CurrencyAmountEncodedType }
     * 
     */
    public CurrencyAmountEncodedType createCurrencyAmountEncodedType() {
        return new CurrencyAmountEncodedType();
    }

    /**
     * Create an instance of {@link MarketingCarrierSenderType }
     * 
     */
    public MarketingCarrierSenderType createMarketingCarrierSenderType() {
        return new MarketingCarrierSenderType();
    }

    /**
     * Create an instance of {@link YearMonthPeriodRepType }
     * 
     */
    public YearMonthPeriodRepType createYearMonthPeriodRepType() {
        return new YearMonthPeriodRepType();
    }

    /**
     * Create an instance of {@link ServiceIDType }
     * 
     */
    public ServiceIDType createServiceIDType() {
        return new ServiceIDType();
    }

    /**
     * Create an instance of {@link CorporateParticipant }
     * 
     */
    public CorporateParticipant createCorporateParticipant() {
        return new CorporateParticipant();
    }

    /**
     * Create an instance of {@link MarketingCarrierParticipantType }
     * 
     */
    public MarketingCarrierParticipantType createMarketingCarrierParticipantType() {
        return new MarketingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link RetailSupplierSenderType }
     * 
     */
    public RetailSupplierSenderType createRetailSupplierSenderType() {
        return new RetailSupplierSenderType();
    }

    /**
     * Create an instance of {@link DayPeriodRepType }
     * 
     */
    public DayPeriodRepType createDayPeriodRepType() {
        return new DayPeriodRepType();
    }

    /**
     * Create an instance of {@link QuarterPeriodRepType }
     * 
     */
    public QuarterPeriodRepType createQuarterPeriodRepType() {
        return new QuarterPeriodRepType();
    }

    /**
     * Create an instance of {@link PaymentFormMetadatas }
     * 
     */
    public PaymentFormMetadatas createPaymentFormMetadatas() {
        return new PaymentFormMetadatas();
    }

    /**
     * Create an instance of {@link PaymentFormMetadataType }
     * 
     */
    public PaymentFormMetadataType createPaymentFormMetadataType() {
        return new PaymentFormMetadataType();
    }

    /**
     * Create an instance of {@link YearPeriodRepType }
     * 
     */
    public YearPeriodRepType createYearPeriodRepType() {
        return new YearPeriodRepType();
    }

    /**
     * Create an instance of {@link PieceAllowance }
     * 
     */
    public PieceAllowance createPieceAllowance() {
        return new PieceAllowance();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType.PieceMeasurements }
     * 
     */
    public BagAllowancePieceType.PieceMeasurements createBagAllowancePieceTypePieceMeasurements() {
        return new BagAllowancePieceType.PieceMeasurements();
    }

    /**
     * Create an instance of {@link PriceVarianceRules }
     * 
     */
    public PriceVarianceRules createPriceVarianceRules() {
        return new PriceVarianceRules();
    }

    /**
     * Create an instance of {@link SeatAssociation }
     * 
     */
    public SeatAssociation createSeatAssociation() {
        return new SeatAssociation();
    }

    /**
     * Create an instance of {@link AgentUserRecipientType }
     * 
     */
    public AgentUserRecipientType createAgentUserRecipientType() {
        return new AgentUserRecipientType();
    }

    /**
     * Create an instance of {@link ServiceItemQuantityType }
     * 
     */
    public ServiceItemQuantityType createServiceItemQuantityType() {
        return new ServiceItemQuantityType();
    }

    /**
     * Create an instance of {@link DescriptionMetadatas }
     * 
     */
    public DescriptionMetadatas createDescriptionMetadatas() {
        return new DescriptionMetadatas();
    }

    /**
     * Create an instance of {@link DescriptionMetadataType }
     * 
     */
    public DescriptionMetadataType createDescriptionMetadataType() {
        return new DescriptionMetadataType();
    }

    /**
     * Create an instance of {@link AircraftMetadatas }
     * 
     */
    public AircraftMetadatas createAircraftMetadatas() {
        return new AircraftMetadatas();
    }

    /**
     * Create an instance of {@link AircraftMetadataType }
     * 
     */
    public AircraftMetadataType createAircraftMetadataType() {
        return new AircraftMetadataType();
    }

    /**
     * Create an instance of {@link Warnings.Warning }
     * 
     */
    public Warnings.Warning createWarningsWarning() {
        return new Warnings.Warning();
    }

    /**
     * Create an instance of {@link POAAirlineSenderType }
     * 
     */
    public POAAirlineSenderType createPOAAirlineSenderType() {
        return new POAAirlineSenderType();
    }

    /**
     * Create an instance of {@link SystemIDType }
     * 
     */
    public SystemIDType createSystemIDType() {
        return new SystemIDType();
    }

    /**
     * Create an instance of {@link ndc.Languages }
     * 
     */
    public ndc.Languages createLanguages() {
        return new ndc.Languages();
    }

    /**
     * Create an instance of {@link MsgDocumentType }
     * 
     */
    public MsgDocumentType createMsgDocumentType() {
        return new MsgDocumentType();
    }

    /**
     * Create an instance of {@link MonthRepType }
     * 
     */
    public MonthRepType createMonthRepType() {
        return new MonthRepType();
    }

    /**
     * Create an instance of {@link Departure }
     * 
     */
    public Departure createDeparture() {
        return new Departure();
    }

    /**
     * Create an instance of {@link FlightDepartureType.AirportCode }
     * 
     */
    public FlightDepartureType.AirportCode createFlightDepartureTypeAirportCode() {
        return new FlightDepartureType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightDepartureType.Terminal }
     * 
     */
    public FlightDepartureType.Terminal createFlightDepartureTypeTerminal() {
        return new FlightDepartureType.Terminal();
    }

    /**
     * Create an instance of {@link ReservationInfo }
     * 
     */
    public ReservationInfo createReservationInfo() {
        return new ReservationInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.ClassesOfService }
     * 
     */
    public SecurePaymentPaxInfoType.ClassesOfService createSecurePaymentPaxInfoTypeClassesOfService() {
        return new SecurePaymentPaxInfoType.ClassesOfService();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.FareBasisCodes }
     * 
     */
    public SecurePaymentPaxInfoType.FareBasisCodes createSecurePaymentPaxInfoTypeFareBasisCodes() {
        return new SecurePaymentPaxInfoType.FareBasisCodes();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.FlightNumbers }
     * 
     */
    public SecurePaymentPaxInfoType.FlightNumbers createSecurePaymentPaxInfoTypeFlightNumbers() {
        return new SecurePaymentPaxInfoType.FlightNumbers();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.ResidenceCode }
     * 
     */
    public SecurePaymentPaxInfoType.ResidenceCode createSecurePaymentPaxInfoTypeResidenceCode() {
        return new SecurePaymentPaxInfoType.ResidenceCode();
    }

    /**
     * Create an instance of {@link MarketingCarrierRecipientType }
     * 
     */
    public MarketingCarrierRecipientType createMarketingCarrierRecipientType() {
        return new MarketingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link ServiceCombinations }
     * 
     */
    public ServiceCombinations createServiceCombinations() {
        return new ServiceCombinations();
    }

    /**
     * Create an instance of {@link ServiceCombinationType.Combination }
     * 
     */
    public ServiceCombinationType.Combination createServiceCombinationTypeCombination() {
        return new ServiceCombinationType.Combination();
    }

    /**
     * Create an instance of {@link CityMetadataType }
     * 
     */
    public CityMetadataType createCityMetadataType() {
        return new CityMetadataType();
    }

    /**
     * Create an instance of {@link StructuredAddrType }
     * 
     */
    public StructuredAddrType createStructuredAddrType() {
        return new StructuredAddrType();
    }

    /**
     * Create an instance of {@link OriginDestinationType }
     * 
     */
    public OriginDestinationType createOriginDestinationType() {
        return new OriginDestinationType();
    }

    /**
     * Create an instance of {@link ArrivalCode }
     * 
     */
    public ArrivalCode createArrivalCode() {
        return new ArrivalCode();
    }

    /**
     * Create an instance of {@link ndc.OriginDestination.CheckedBag }
     * 
     */
    public ndc.OriginDestination.CheckedBag createOriginDestinationCheckedBag() {
        return new ndc.OriginDestination.CheckedBag();
    }

    /**
     * Create an instance of {@link ndc.OriginDestination.CarryOnBag }
     * 
     */
    public ndc.OriginDestination.CarryOnBag createOriginDestinationCarryOnBag() {
        return new ndc.OriginDestination.CarryOnBag();
    }

    /**
     * Create an instance of {@link OrderItemDetails.OrderItemDetail }
     * 
     */
    public OrderItemDetails.OrderItemDetail createOrderItemDetailsOrderItemDetail() {
        return new OrderItemDetails.OrderItemDetail();
    }

    /**
     * Create an instance of {@link SrvcLocationAirportType }
     * 
     */
    public SrvcLocationAirportType createSrvcLocationAirportType() {
        return new SrvcLocationAirportType();
    }

    /**
     * Create an instance of {@link CurrencyMetadatas }
     * 
     */
    public CurrencyMetadatas createCurrencyMetadatas() {
        return new CurrencyMetadatas();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link AltSeatOfferType }
     * 
     */
    public AltSeatOfferType createAltSeatOfferType() {
        return new AltSeatOfferType();
    }

    /**
     * Create an instance of {@link AggregatorRecipientType }
     * 
     */
    public AggregatorRecipientType createAggregatorRecipientType() {
        return new AggregatorRecipientType();
    }

    /**
     * Create an instance of {@link Notices.Notice }
     * 
     */
    public Notices.Notice createNoticesNotice() {
        return new Notices.Notice();
    }

    /**
     * Create an instance of {@link ContentMetadatas }
     * 
     */
    public ContentMetadatas createContentMetadatas() {
        return new ContentMetadatas();
    }

    /**
     * Create an instance of {@link RetailSupplierParticipantType }
     * 
     */
    public RetailSupplierParticipantType createRetailSupplierParticipantType() {
        return new RetailSupplierParticipantType();
    }

    /**
     * Create an instance of {@link TravelDistancePreferencesType }
     * 
     */
    public TravelDistancePreferencesType createTravelDistancePreferencesType() {
        return new TravelDistancePreferencesType();
    }

    /**
     * Create an instance of {@link POAAirlineRecipientType }
     * 
     */
    public POAAirlineRecipientType createPOAAirlineRecipientType() {
        return new POAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link WeightAllowance }
     * 
     */
    public WeightAllowance createWeightAllowance() {
        return new WeightAllowance();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType.MaximumWeight }
     * 
     */
    public BagAllowanceWeightType.MaximumWeight createBagAllowanceWeightTypeMaximumWeight() {
        return new BagAllowanceWeightType.MaximumWeight();
    }

    /**
     * Create an instance of {@link AggregatorIDType }
     * 
     */
    public AggregatorIDType createAggregatorIDType() {
        return new AggregatorIDType();
    }

    /**
     * Create an instance of {@link ndc.Other }
     * 
     */
    public ndc.Other createOther() {
        return new ndc.Other();
    }

    /**
     * Create an instance of {@link AirportMetadatas }
     * 
     */
    public AirportMetadatas createAirportMetadatas() {
        return new AirportMetadatas();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link EncodedPriceType }
     * 
     */
    public EncodedPriceType createEncodedPriceType() {
        return new EncodedPriceType();
    }

    /**
     * Create an instance of {@link MiscChargeMethodType }
     * 
     */
    public MiscChargeMethodType createMiscChargeMethodType() {
        return new MiscChargeMethodType();
    }

    /**
     * Create an instance of {@link RoleOfIntermediaryReferenceType }
     * 
     */
    public RoleOfIntermediaryReferenceType createRoleOfIntermediaryReferenceType() {
        return new RoleOfIntermediaryReferenceType();
    }

    /**
     * Create an instance of {@link FarePriceDetailType }
     * 
     */
    public FarePriceDetailType createFarePriceDetailType() {
        return new FarePriceDetailType();
    }

    /**
     * Create an instance of {@link OfferPenaltyType }
     * 
     */
    public OfferPenaltyType createOfferPenaltyType() {
        return new OfferPenaltyType();
    }

    /**
     * Create an instance of {@link CountryMetadatas }
     * 
     */
    public CountryMetadatas createCountryMetadatas() {
        return new CountryMetadatas();
    }

    /**
     * Create an instance of {@link ImageID }
     * 
     */
    public ImageID createImageID() {
        return new ImageID();
    }

    /**
     * Create an instance of {@link ndc.Disclosures }
     * 
     */
    public ndc.Disclosures createDisclosures() {
        return new ndc.Disclosures();
    }

    /**
     * Create an instance of {@link DisclosureType }
     * 
     */
    public DisclosureType createDisclosureType() {
        return new DisclosureType();
    }

    /**
     * Create an instance of {@link FareReferenceKey }
     * 
     */
    public FareReferenceKey createFareReferenceKey() {
        return new FareReferenceKey();
    }

    /**
     * Create an instance of {@link LanguageMetadatas }
     * 
     */
    public LanguageMetadatas createLanguageMetadatas() {
        return new LanguageMetadatas();
    }

    /**
     * Create an instance of {@link MediaLink }
     * 
     */
    public MediaLink createMediaLink() {
        return new MediaLink();
    }

    /**
     * Create an instance of {@link OtherContactMethodType }
     * 
     */
    public OtherContactMethodType createOtherContactMethodType() {
        return new OtherContactMethodType();
    }

    /**
     * Create an instance of {@link TravelAgency }
     * 
     */
    public TravelAgency createTravelAgency() {
        return new TravelAgency();
    }

    /**
     * Create an instance of {@link TravelAgencyType }
     * 
     */
    public TravelAgencyType createTravelAgencyType() {
        return new TravelAgencyType();
    }

    /**
     * Create an instance of {@link SellerCoreRepType }
     * 
     */
    public SellerCoreRepType createSellerCoreRepType() {
        return new SellerCoreRepType();
    }

    /**
     * Create an instance of {@link ActorObjectType }
     * 
     */
    public ActorObjectType createActorObjectType() {
        return new ActorObjectType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.PseudoCity }
     * 
     */
    public AgencyCoreRepType.PseudoCity createAgencyCoreRepTypePseudoCity() {
        return new AgencyCoreRepType.PseudoCity();
    }

    /**
     * Create an instance of {@link AgencyIDType }
     * 
     */
    public AgencyIDType createAgencyIDType() {
        return new AgencyIDType();
    }

    /**
     * Create an instance of {@link StateProvCodeType }
     * 
     */
    public StateProvCodeType createStateProvCodeType() {
        return new StateProvCodeType();
    }

    /**
     * Create an instance of {@link TravelAgencyRecipientType }
     * 
     */
    public TravelAgencyRecipientType createTravelAgencyRecipientType() {
        return new TravelAgencyRecipientType();
    }

    /**
     * Create an instance of {@link PenaltyDetailType }
     * 
     */
    public PenaltyDetailType createPenaltyDetailType() {
        return new PenaltyDetailType();
    }

    /**
     * Create an instance of {@link AircraftSummaryType }
     * 
     */
    public AircraftSummaryType createAircraftSummaryType() {
        return new AircraftSummaryType();
    }

    /**
     * Create an instance of {@link OriginalIssueInfo }
     * 
     */
    public OriginalIssueInfo createOriginalIssueInfo() {
        return new OriginalIssueInfo();
    }

    /**
     * Create an instance of {@link OriginalIssueType }
     * 
     */
    public OriginalIssueType createOriginalIssueType() {
        return new OriginalIssueType();
    }

    /**
     * Create an instance of {@link CarryOnBags }
     * 
     */
    public CarryOnBags createCarryOnBags() {
        return new CarryOnBags();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.CarryOnBag }
     * 
     */
    public CarryOnAllowanceType.CarryOnBag createCarryOnAllowanceTypeCarryOnBag() {
        return new CarryOnAllowanceType.CarryOnBag();
    }

    /**
     * Create an instance of {@link AlertType }
     * 
     */
    public AlertType createAlertType() {
        return new AlertType();
    }

    /**
     * Create an instance of {@link EnabledSysSenderType }
     * 
     */
    public EnabledSysSenderType createEnabledSysSenderType() {
        return new EnabledSysSenderType();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link SecurityType.PseudoCityCode }
     * 
     */
    public SecurityType.PseudoCityCode createSecurityTypePseudoCityCode() {
        return new SecurityType.PseudoCityCode();
    }

    /**
     * Create an instance of {@link FlightDistanceType }
     * 
     */
    public FlightDistanceType createFlightDistanceType() {
        return new FlightDistanceType();
    }

    /**
     * Create an instance of {@link PriceMetadatas }
     * 
     */
    public PriceMetadatas createPriceMetadatas() {
        return new PriceMetadatas();
    }

    /**
     * Create an instance of {@link PriceMetadataType }
     * 
     */
    public PriceMetadataType createPriceMetadataType() {
        return new PriceMetadataType();
    }

    /**
     * Create an instance of {@link AggregatorSenderType }
     * 
     */
    public AggregatorSenderType createAggregatorSenderType() {
        return new AggregatorSenderType();
    }

    /**
     * Create an instance of {@link PaymentTimeLimitType }
     * 
     */
    public PaymentTimeLimitType createPaymentTimeLimitType() {
        return new PaymentTimeLimitType();
    }

    /**
     * Create an instance of {@link CabinPreferencesType }
     * 
     */
    public CabinPreferencesType createCabinPreferencesType() {
        return new CabinPreferencesType();
    }

    /**
     * Create an instance of {@link TimePeriodRepType }
     * 
     */
    public TimePeriodRepType createTimePeriodRepType() {
        return new TimePeriodRepType();
    }

    /**
     * Create an instance of {@link OrderCommissionType }
     * 
     */
    public OrderCommissionType createOrderCommissionType() {
        return new OrderCommissionType();
    }

    /**
     * Create an instance of {@link POAAirlineParticipantType }
     * 
     */
    public POAAirlineParticipantType createPOAAirlineParticipantType() {
        return new POAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link OperatingCarrierParticipantType }
     * 
     */
    public OperatingCarrierParticipantType createOperatingCarrierParticipantType() {
        return new OperatingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link SeatDisplay.Columns }
     * 
     */
    public SeatDisplay.Columns createSeatDisplayColumns() {
        return new SeatDisplay.Columns();
    }

    /**
     * Create an instance of {@link SeatDisplay.Rows }
     * 
     */
    public SeatDisplay.Rows createSeatDisplayRows() {
        return new SeatDisplay.Rows();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link RetailerIDType }
     * 
     */
    public RetailerIDType createRetailerIDType() {
        return new RetailerIDType();
    }

    /**
     * Create an instance of {@link ndc.AirportCode }
     * 
     */
    public ndc.AirportCode createAirportCode() {
        return new ndc.AirportCode();
    }

    /**
     * Create an instance of {@link SimpleCurrencyPriceType }
     * 
     */
    public SimpleCurrencyPriceType createSimpleCurrencyPriceType() {
        return new SimpleCurrencyPriceType();
    }

    /**
     * Create an instance of {@link FareRulesRemarks.FareRulesRemark }
     * 
     */
    public FareRulesRemarks.FareRulesRemark createFareRulesRemarksFareRulesRemark() {
        return new FareRulesRemarks.FareRulesRemark();
    }

    /**
     * Create an instance of {@link ndc.Description }
     * 
     */
    public ndc.Description createDescription() {
        return new ndc.Description();
    }

    /**
     * Create an instance of {@link DescriptionType.Text }
     * 
     */
    public DescriptionType.Text createDescriptionTypeText() {
        return new DescriptionType.Text();
    }

    /**
     * Create an instance of {@link DescriptionType.Media }
     * 
     */
    public DescriptionType.Media createDescriptionTypeMedia() {
        return new DescriptionType.Media();
    }

    /**
     * Create an instance of {@link ORAAirlineRecipientType }
     * 
     */
    public ORAAirlineRecipientType createORAAirlineRecipientType() {
        return new ORAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link EnabledSysRecipientType }
     * 
     */
    public EnabledSysRecipientType createEnabledSysRecipientType() {
        return new EnabledSysRecipientType();
    }

    /**
     * Create an instance of {@link TravelAgencyParticipantType }
     * 
     */
    public TravelAgencyParticipantType createTravelAgencyParticipantType() {
        return new TravelAgencyParticipantType();
    }

    /**
     * Create an instance of {@link Cash }
     * 
     */
    public Cash createCash() {
        return new Cash();
    }

    /**
     * Create an instance of {@link PrimaryContact.Contact }
     * 
     */
    public PrimaryContact.Contact createPrimaryContactContact() {
        return new PrimaryContact.Contact();
    }

    /**
     * Create an instance of {@link PriceVarianceNotice }
     * 
     */
    public PriceVarianceNotice createPriceVarianceNotice() {
        return new PriceVarianceNotice();
    }

    /**
     * Create an instance of {@link TrxProcessObjectBaseType }
     * 
     */
    public TrxProcessObjectBaseType createTrxProcessObjectBaseType() {
        return new TrxProcessObjectBaseType();
    }

    /**
     * Create an instance of {@link MarketingMessages.MarketMessage }
     * 
     */
    public MarketingMessages.MarketMessage createMarketingMessagesMarketMessage() {
        return new MarketingMessages.MarketMessage();
    }

    /**
     * Create an instance of {@link OrderPenaltyType }
     * 
     */
    public OrderPenaltyType createOrderPenaltyType() {
        return new OrderPenaltyType();
    }

    /**
     * Create an instance of {@link ORAAirlineSenderType }
     * 
     */
    public ORAAirlineSenderType createORAAirlineSenderType() {
        return new ORAAirlineSenderType();
    }

    /**
     * Create an instance of {@link EnabledSysParticipantType }
     * 
     */
    public EnabledSysParticipantType createEnabledSysParticipantType() {
        return new EnabledSysParticipantType();
    }

    /**
     * Create an instance of {@link CheckedBags }
     * 
     */
    public CheckedBags createCheckedBags() {
        return new CheckedBags();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.CheckedBag }
     * 
     */
    public CheckedBagAllowanceType.CheckedBag createCheckedBagAllowanceTypeCheckedBag() {
        return new CheckedBagAllowanceType.CheckedBag();
    }

    /**
     * Create an instance of {@link CorporateSender }
     * 
     */
    public CorporateSender createCorporateSender() {
        return new CorporateSender();
    }

    /**
     * Create an instance of {@link AdditionalReferenceType }
     * 
     */
    public AdditionalReferenceType createAdditionalReferenceType() {
        return new AdditionalReferenceType();
    }

    /**
     * Create an instance of {@link AltOtherOfferType }
     * 
     */
    public AltOtherOfferType createAltOtherOfferType() {
        return new AltOtherOfferType();
    }

    /**
     * Create an instance of {@link ndc.KeyWord }
     * 
     */
    public ndc.KeyWord createKeyWord() {
        return new ndc.KeyWord();
    }

    /**
     * Create an instance of {@link KeyWordType.Word }
     * 
     */
    public KeyWordType.Word createKeyWordTypeWord() {
        return new KeyWordType.Word();
    }

    /**
     * Create an instance of {@link KeyWordType.Value }
     * 
     */
    public KeyWordType.Value createKeyWordTypeValue() {
        return new KeyWordType.Value();
    }

    /**
     * Create an instance of {@link DayRepType }
     * 
     */
    public DayRepType createDayRepType() {
        return new DayRepType();
    }

    /**
     * Create an instance of {@link PhoneContactType }
     * 
     */
    public PhoneContactType createPhoneContactType() {
        return new PhoneContactType();
    }

    /**
     * Create an instance of {@link TravelAgencySenderType }
     * 
     */
    public TravelAgencySenderType createTravelAgencySenderType() {
        return new TravelAgencySenderType();
    }

    /**
     * Create an instance of {@link OrderIDType }
     * 
     */
    public OrderIDType createOrderIDType() {
        return new OrderIDType();
    }

    /**
     * Create an instance of {@link TicketDesignatorType }
     * 
     */
    public TicketDesignatorType createTicketDesignatorType() {
        return new TicketDesignatorType();
    }

    /**
     * Create an instance of {@link ndc.BundleID }
     * 
     */
    public ndc.BundleID createBundleID() {
        return new ndc.BundleID();
    }

    /**
     * Create an instance of {@link ResDateTime.Date }
     * 
     */
    public ResDateTime.Date createResDateTimeDate() {
        return new ResDateTime.Date();
    }

    /**
     * Create an instance of {@link MaximumStay.DayQuantity }
     * 
     */
    public MaximumStay.DayQuantity createMaximumStayDayQuantity() {
        return new MaximumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link MediaMetadatas }
     * 
     */
    public MediaMetadatas createMediaMetadatas() {
        return new MediaMetadatas();
    }

    /**
     * Create an instance of {@link MonthPeriodRepType }
     * 
     */
    public MonthPeriodRepType createMonthPeriodRepType() {
        return new MonthPeriodRepType();
    }

    /**
     * Create an instance of {@link PartnerCompanyIDType }
     * 
     */
    public PartnerCompanyIDType createPartnerCompanyIDType() {
        return new PartnerCompanyIDType();
    }

    /**
     * Create an instance of {@link CityMetadatas }
     * 
     */
    public CityMetadatas createCityMetadatas() {
        return new CityMetadatas();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link StateProvMetadatas }
     * 
     */
    public StateProvMetadatas createStateProvMetadatas() {
        return new StateProvMetadatas();
    }

    /**
     * Create an instance of {@link FiledFare }
     * 
     */
    public FiledFare createFiledFare() {
        return new FiledFare();
    }

    /**
     * Create an instance of {@link FileFareType.FareIndicatorCode }
     * 
     */
    public FileFareType.FareIndicatorCode createFileFareTypeFareIndicatorCode() {
        return new FileFareType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link FlightNumber }
     * 
     */
    public FlightNumber createFlightNumber() {
        return new FlightNumber();
    }

    /**
     * Create an instance of {@link DatePeriodRepType }
     * 
     */
    public DatePeriodRepType createDatePeriodRepType() {
        return new DatePeriodRepType();
    }

    /**
     * Create an instance of {@link ProgramStatusQualifier }
     * 
     */
    public ProgramStatusQualifier createProgramStatusQualifier() {
        return new ProgramStatusQualifier();
    }

    /**
     * Create an instance of {@link AffinityCountryDepartType }
     * 
     */
    public AffinityCountryDepartType createAffinityCountryDepartType() {
        return new AffinityCountryDepartType();
    }

    /**
     * Create an instance of {@link AgentUserSenderType }
     * 
     */
    public AgentUserSenderType createAgentUserSenderType() {
        return new AgentUserSenderType();
    }

    /**
     * Create an instance of {@link Voucher.EffectiveExpireDate }
     * 
     */
    public Voucher.EffectiveExpireDate createVoucherEffectiveExpireDate() {
        return new Voucher.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link ListOfOfferTermsType }
     * 
     */
    public ListOfOfferTermsType createListOfOfferTermsType() {
        return new ListOfOfferTermsType();
    }

    /**
     * Create an instance of {@link ZoneMetadatas }
     * 
     */
    public ZoneMetadatas createZoneMetadatas() {
        return new ZoneMetadatas();
    }

    /**
     * Create an instance of {@link OfferGroupSizeType }
     * 
     */
    public OfferGroupSizeType createOfferGroupSizeType() {
        return new OfferGroupSizeType();
    }

    /**
     * Create an instance of {@link DatePeriodType }
     * 
     */
    public DatePeriodType createDatePeriodType() {
        return new DatePeriodType();
    }

    /**
     * Create an instance of {@link S5Type }
     * 
     */
    public S5Type createS5Type() {
        return new S5Type();
    }

    /**
     * Create an instance of {@link SeatOfferAssocType }
     * 
     */
    public SeatOfferAssocType createSeatOfferAssocType() {
        return new SeatOfferAssocType();
    }

    /**
     * Create an instance of {@link SimpleFlightAssocType }
     * 
     */
    public SimpleFlightAssocType createSimpleFlightAssocType() {
        return new SimpleFlightAssocType();
    }

    /**
     * Create an instance of {@link EnabledSystemType }
     * 
     */
    public EnabledSystemType createEnabledSystemType() {
        return new EnabledSystemType();
    }

    /**
     * Create an instance of {@link OfferStatusType }
     * 
     */
    public OfferStatusType createOfferStatusType() {
        return new OfferStatusType();
    }

    /**
     * Create an instance of {@link RemarkTypeAIDM }
     * 
     */
    public RemarkTypeAIDM createRemarkTypeAIDM() {
        return new RemarkTypeAIDM();
    }

    /**
     * Create an instance of {@link PriceCoreType }
     * 
     */
    public PriceCoreType createPriceCoreType() {
        return new PriceCoreType();
    }

    /**
     * Create an instance of {@link COSAssocType }
     * 
     */
    public COSAssocType createCOSAssocType() {
        return new COSAssocType();
    }

    /**
     * Create an instance of {@link SeatCharacteristicType }
     * 
     */
    public SeatCharacteristicType createSeatCharacteristicType() {
        return new SeatCharacteristicType();
    }

    /**
     * Create an instance of {@link SeatDetailType }
     * 
     */
    public SeatDetailType createSeatDetailType() {
        return new SeatDetailType();
    }

    /**
     * Create an instance of {@link AssociatedObjectBaseType }
     * 
     */
    public AssociatedObjectBaseType createAssociatedObjectBaseType() {
        return new AssociatedObjectBaseType();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link AggregatorMsgPartyCoreType }
     * 
     */
    public AggregatorMsgPartyCoreType createAggregatorMsgPartyCoreType() {
        return new AggregatorMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link CoreBaseType }
     * 
     */
    public CoreBaseType createCoreBaseType() {
        return new CoreBaseType();
    }

    /**
     * Create an instance of {@link AircraftCabinType }
     * 
     */
    public AircraftCabinType createAircraftCabinType() {
        return new AircraftCabinType();
    }

    /**
     * Create an instance of {@link OrderItemDetailType }
     * 
     */
    public OrderItemDetailType createOrderItemDetailType() {
        return new OrderItemDetailType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link FlightPerformanceType }
     * 
     */
    public FlightPerformanceType createFlightPerformanceType() {
        return new FlightPerformanceType();
    }

    /**
     * Create an instance of {@link OfferItemDetailType }
     * 
     */
    public OfferItemDetailType createOfferItemDetailType() {
        return new OfferItemDetailType();
    }

    /**
     * Create an instance of {@link DateTimePeriodType }
     * 
     */
    public DateTimePeriodType createDateTimePeriodType() {
        return new DateTimePeriodType();
    }

    /**
     * Create an instance of {@link MediaIDType }
     * 
     */
    public MediaIDType createMediaIDType() {
        return new MediaIDType();
    }

    /**
     * Create an instance of {@link AugPointType }
     * 
     */
    public AugPointType createAugPointType() {
        return new AugPointType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link AircraftCodeQueryType }
     * 
     */
    public AircraftCodeQueryType createAircraftCodeQueryType() {
        return new AircraftCodeQueryType();
    }

    /**
     * Create an instance of {@link BaggageDeterminingCarrierType }
     * 
     */
    public BaggageDeterminingCarrierType createBaggageDeterminingCarrierType() {
        return new BaggageDeterminingCarrierType();
    }

    /**
     * Create an instance of {@link MultiAssociationType }
     * 
     */
    public MultiAssociationType createMultiAssociationType() {
        return new MultiAssociationType();
    }

    /**
     * Create an instance of {@link AuthAccountType }
     * 
     */
    public AuthAccountType createAuthAccountType() {
        return new AuthAccountType();
    }

    /**
     * Create an instance of {@link AllianceType }
     * 
     */
    public AllianceType createAllianceType() {
        return new AllianceType();
    }

    /**
     * Create an instance of {@link PartnerCoreRepType }
     * 
     */
    public PartnerCoreRepType createPartnerCoreRepType() {
        return new PartnerCoreRepType();
    }

    /**
     * Create an instance of {@link CountryProximityType }
     * 
     */
    public CountryProximityType createCountryProximityType() {
        return new CountryProximityType();
    }

    /**
     * Create an instance of {@link ContactCoreType }
     * 
     */
    public ContactCoreType createContactCoreType() {
        return new ContactCoreType();
    }

    /**
     * Create an instance of {@link MetaBaseType }
     * 
     */
    public MetaBaseType createMetaBaseType() {
        return new MetaBaseType();
    }

    /**
     * Create an instance of {@link ListOfSeatType }
     * 
     */
    public ListOfSeatType createListOfSeatType() {
        return new ListOfSeatType();
    }

    /**
     * Create an instance of {@link UniqueIDContextType }
     * 
     */
    public UniqueIDContextType createUniqueIDContextType() {
        return new UniqueIDContextType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramAccountType }
     * 
     */
    public LoyaltyProgramAccountType createLoyaltyProgramAccountType() {
        return new LoyaltyProgramAccountType();
    }

    /**
     * Create an instance of {@link SeatMapRowNbrType }
     * 
     */
    public SeatMapRowNbrType createSeatMapRowNbrType() {
        return new SeatMapRowNbrType();
    }

    /**
     * Create an instance of {@link PhoneTypeAIDM }
     * 
     */
    public PhoneTypeAIDM createPhoneTypeAIDM() {
        return new PhoneTypeAIDM();
    }

    /**
     * Create an instance of {@link OfferInstructionType }
     * 
     */
    public OfferInstructionType createOfferInstructionType() {
        return new OfferInstructionType();
    }

    /**
     * Create an instance of {@link LanguageUsageType }
     * 
     */
    public LanguageUsageType createLanguageUsageType() {
        return new LanguageUsageType();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     * 
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link OfferTermsType }
     * 
     */
    public OfferTermsType createOfferTermsType() {
        return new OfferTermsType();
    }

    /**
     * Create an instance of {@link OperatingCarrierFlightType }
     * 
     */
    public OperatingCarrierFlightType createOperatingCarrierFlightType() {
        return new OperatingCarrierFlightType();
    }

    /**
     * Create an instance of {@link OrderItemTimeLimitsType }
     * 
     */
    public OrderItemTimeLimitsType createOrderItemTimeLimitsType() {
        return new OrderItemTimeLimitsType();
    }

    /**
     * Create an instance of {@link EnabledSysMsgPartyCoreType }
     * 
     */
    public EnabledSysMsgPartyCoreType createEnabledSysMsgPartyCoreType() {
        return new EnabledSysMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AircraftCoreType }
     * 
     */
    public AircraftCoreType createAircraftCoreType() {
        return new AircraftCoreType();
    }

    /**
     * Create an instance of {@link OrderPriceType }
     * 
     */
    public OrderPriceType createOrderPriceType() {
        return new OrderPriceType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link PriceClassType }
     * 
     */
    public PriceClassType createPriceClassType() {
        return new PriceClassType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link ProcessingResultType }
     * 
     */
    public ProcessingResultType createProcessingResultType() {
        return new ProcessingResultType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link OperatingCarrierType }
     * 
     */
    public OperatingCarrierType createOperatingCarrierType() {
        return new OperatingCarrierType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link UriContextType }
     * 
     */
    public UriContextType createUriContextType() {
        return new UriContextType();
    }

    /**
     * Create an instance of {@link OrderTimeLimitsType }
     * 
     */
    public OrderTimeLimitsType createOrderTimeLimitsType() {
        return new OrderTimeLimitsType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link TaxCoreType }
     * 
     */
    public TaxCoreType createTaxCoreType() {
        return new TaxCoreType();
    }

    /**
     * Create an instance of {@link TicketDocHistoryType }
     * 
     */
    public TicketDocHistoryType createTicketDocHistoryType() {
        return new TicketDocHistoryType();
    }

    /**
     * Create an instance of {@link SecurePaymentUrlType }
     * 
     */
    public SecurePaymentUrlType createSecurePaymentUrlType() {
        return new SecurePaymentUrlType();
    }

    /**
     * Create an instance of {@link DataListObjectBaseType }
     * 
     */
    public DataListObjectBaseType createDataListObjectBaseType() {
        return new DataListObjectBaseType();
    }

    /**
     * Create an instance of {@link VisaType }
     * 
     */
    public VisaType createVisaType() {
        return new VisaType();
    }

    /**
     * Create an instance of {@link AgentUserMsgPartyCoreType }
     * 
     */
    public AgentUserMsgPartyCoreType createAgentUserMsgPartyCoreType() {
        return new AgentUserMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link AirlineTypeAIDM }
     * 
     */
    public AirlineTypeAIDM createAirlineTypeAIDM() {
        return new AirlineTypeAIDM();
    }

    /**
     * Create an instance of {@link MonthYearRepType }
     * 
     */
    public MonthYearRepType createMonthYearRepType() {
        return new MonthYearRepType();
    }

    /**
     * Create an instance of {@link SeatCoreType }
     * 
     */
    public SeatCoreType createSeatCoreType() {
        return new SeatCoreType();
    }

    /**
     * Create an instance of {@link OrderOfferItemType }
     * 
     */
    public OrderOfferItemType createOrderOfferItemType() {
        return new OrderOfferItemType();
    }

    /**
     * Create an instance of {@link IdentityDocumentType }
     * 
     */
    public IdentityDocumentType createIdentityDocumentType() {
        return new IdentityDocumentType();
    }

    /**
     * Create an instance of {@link MarketingCarrierFlightType }
     * 
     */
    public MarketingCarrierFlightType createMarketingCarrierFlightType() {
        return new MarketingCarrierFlightType();
    }

    /**
     * Create an instance of {@link EmailIDType }
     * 
     */
    public EmailIDType createEmailIDType() {
        return new EmailIDType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link ListBaseType }
     * 
     */
    public ListBaseType createListBaseType() {
        return new ListBaseType();
    }

    /**
     * Create an instance of {@link CouponOrderKeyType }
     * 
     */
    public CouponOrderKeyType createCouponOrderKeyType() {
        return new CouponOrderKeyType();
    }

    /**
     * Create an instance of {@link BagDisclosureType }
     * 
     */
    public BagDisclosureType createBagDisclosureType() {
        return new BagDisclosureType();
    }

    /**
     * Create an instance of {@link S7Type }
     * 
     */
    public S7Type createS7Type() {
        return new S7Type();
    }

    /**
     * Create an instance of {@link BagOfferAssocType }
     * 
     */
    public BagOfferAssocType createBagOfferAssocType() {
        return new BagOfferAssocType();
    }

    /**
     * Create an instance of {@link YearMonthRepType }
     * 
     */
    public YearMonthRepType createYearMonthRepType() {
        return new YearMonthRepType();
    }

    /**
     * Create an instance of {@link PTCQuantityType }
     * 
     */
    public PTCQuantityType createPTCQuantityType() {
        return new PTCQuantityType();
    }

    /**
     * Create an instance of {@link AirlineMsgPartyCoreType }
     * 
     */
    public AirlineMsgPartyCoreType createAirlineMsgPartyCoreType() {
        return new AirlineMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link DayOfWeekIndType }
     * 
     */
    public DayOfWeekIndType createDayOfWeekIndType() {
        return new DayOfWeekIndType();
    }

    /**
     * Create an instance of {@link ProfileOwnerType }
     * 
     */
    public ProfileOwnerType createProfileOwnerType() {
        return new ProfileOwnerType();
    }

    /**
     * Create an instance of {@link TicketIdentificationType }
     * 
     */
    public TicketIdentificationType createTicketIdentificationType() {
        return new TicketIdentificationType();
    }

    /**
     * Create an instance of {@link InstrRemarkType }
     * 
     */
    public InstrRemarkType createInstrRemarkType() {
        return new InstrRemarkType();
    }

    /**
     * Create an instance of {@link ndc.FOID }
     * 
     */
    public ndc.FOID createFOID() {
        return new ndc.FOID();
    }

    /**
     * Create an instance of {@link OrderProcessResultType }
     * 
     */
    public OrderProcessResultType createOrderProcessResultType() {
        return new OrderProcessResultType();
    }

    /**
     * Create an instance of {@link NoticeBaseType }
     * 
     */
    public NoticeBaseType createNoticeBaseType() {
        return new NoticeBaseType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link TrvlAgencyMsgPartyCoreType }
     * 
     */
    public TrvlAgencyMsgPartyCoreType createTrvlAgencyMsgPartyCoreType() {
        return new TrvlAgencyMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link OfferGeographicSpecificationType }
     * 
     */
    public OfferGeographicSpecificationType createOfferGeographicSpecificationType() {
        return new OfferGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link AircraftTailNmbrQueryType }
     * 
     */
    public AircraftTailNmbrQueryType createAircraftTailNmbrQueryType() {
        return new AircraftTailNmbrQueryType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link RetailerMsgPartyCoreType }
     * 
     */
    public RetailerMsgPartyCoreType createRetailerMsgPartyCoreType() {
        return new RetailerMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AirlineCoreRepType }
     * 
     */
    public AirlineCoreRepType createAirlineCoreRepType() {
        return new AirlineCoreRepType();
    }

    /**
     * Create an instance of {@link InstrCommissionType }
     * 
     */
    public InstrCommissionType createInstrCommissionType() {
        return new InstrCommissionType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link TimestampRepType }
     * 
     */
    public TimestampRepType createTimestampRepType() {
        return new TimestampRepType();
    }

    /**
     * Create an instance of {@link RetailerType }
     * 
     */
    public RetailerType createRetailerType() {
        return new RetailerType();
    }

    /**
     * Create an instance of {@link OfferOrderQuantityType }
     * 
     */
    public OfferOrderQuantityType createOfferOrderQuantityType() {
        return new OfferOrderQuantityType();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link DataListType.DescriptionList }
     * 
     */
    public DataListType.DescriptionList createDataListTypeDescriptionList() {
        return new DataListType.DescriptionList();
    }

    /**
     * Create an instance of {@link DataListType.FlightSegmentList }
     * 
     */
    public DataListType.FlightSegmentList createDataListTypeFlightSegmentList() {
        return new DataListType.FlightSegmentList();
    }

    /**
     * Create an instance of {@link DataListType.OriginDestinationList }
     * 
     */
    public DataListType.OriginDestinationList createDataListTypeOriginDestinationList() {
        return new DataListType.OriginDestinationList();
    }

    /**
     * Create an instance of {@link DataListType.SeatList }
     * 
     */
    public DataListType.SeatList createDataListTypeSeatList() {
        return new DataListType.SeatList();
    }

    /**
     * Create an instance of {@link DataListType.FlightList.Flight.Settlement }
     * 
     */
    public DataListType.FlightList.Flight.Settlement createDataListTypeFlightListFlightSettlement() {
        return new DataListType.FlightList.Flight.Settlement();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType.OtherIDs.OtherID }
     * 
     */
    public SupplierCoreRepType.OtherIDs.OtherID createSupplierCoreRepTypeOtherIDsOtherID() {
        return new SupplierCoreRepType.OtherIDs.OtherID();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType.OfferPrice }
     * 
     */
    public SeatOfferCoreType.OfferPrice createSeatOfferCoreTypeOfferPrice() {
        return new SeatOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType.Policy }
     * 
     */
    public InfoPolicyNoticeType.Policy createInfoPolicyNoticeTypePolicy() {
        return new InfoPolicyNoticeType.Policy();
    }

    /**
     * Create an instance of {@link PolicyType.Descriptions }
     * 
     */
    public PolicyType.Descriptions createPolicyTypeDescriptions() {
        return new PolicyType.Descriptions();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.EncodingScheme }
     * 
     */
    public PolicyType.Metadata.EncodingScheme createPolicyTypeMetadataEncodingScheme() {
        return new PolicyType.Metadata.EncodingScheme();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.ValidPeriod }
     * 
     */
    public PolicyType.Metadata.ValidPeriod createPolicyTypeMetadataValidPeriod() {
        return new PolicyType.Metadata.ValidPeriod();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType.TimeStamp }
     * 
     */
    public CorePeriodGrpType.TimeStamp createCorePeriodGrpTypeTimeStamp() {
        return new CorePeriodGrpType.TimeStamp();
    }

    /**
     * Create an instance of {@link EncSchemeType.Metadata }
     * 
     */
    public EncSchemeType.Metadata createEncSchemeTypeMetadata() {
        return new EncSchemeType.Metadata();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail.SupportedDomain }
     * 
     */
    public EncSchemeType.Detail.SupportedDomain createEncSchemeTypeDetailSupportedDomain() {
        return new EncSchemeType.Detail.SupportedDomain();
    }

    /**
     * Create an instance of {@link PolicyType.Nodes.Node }
     * 
     */
    public PolicyType.Nodes.Node createPolicyTypeNodesNode() {
        return new PolicyType.Nodes.Node();
    }

    /**
     * Create an instance of {@link NodePathType.Path }
     * 
     */
    public NodePathType.Path createNodePathTypePath() {
        return new NodePathType.Path();
    }

    /**
     * Create an instance of {@link NodePathType.TagName }
     * 
     */
    public NodePathType.TagName createNodePathTypeTagName() {
        return new NodePathType.TagName();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType.SoldAirlineInfo }
     * 
     */
    public HistoryCouponInfoType.SoldAirlineInfo createHistoryCouponInfoTypeSoldAirlineInfo() {
        return new HistoryCouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.DepartureDateTime }
     * 
     */
    public CouponSoldAirlineType.DepartureDateTime createCouponSoldAirlineTypeDepartureDateTime() {
        return new CouponSoldAirlineType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.ArrivalDateTime }
     * 
     */
    public CouponSoldAirlineType.ArrivalDateTime createCouponSoldAirlineTypeArrivalDateTime() {
        return new CouponSoldAirlineType.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.Stops }
     * 
     */
    public CouponSoldAirlineType.Stops createCouponSoldAirlineTypeStops() {
        return new CouponSoldAirlineType.Stops();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.OperatingCarrier }
     * 
     */
    public CouponSoldAirlineType.OperatingCarrier createCouponSoldAirlineTypeOperatingCarrier() {
        return new CouponSoldAirlineType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link FlightPriceType.Surcharges }
     * 
     */
    public FlightPriceType.Surcharges createFlightPriceTypeSurcharges() {
        return new FlightPriceType.Surcharges();
    }

    /**
     * Create an instance of {@link FlightPriceType.Fees }
     * 
     */
    public FlightPriceType.Fees createFlightPriceTypeFees() {
        return new FlightPriceType.Fees();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Total }
     * 
     */
    public FeeSurchargeType.Total createFeeSurchargeTypeTotal() {
        return new FeeSurchargeType.Total();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Breakdown.Fee }
     * 
     */
    public FeeSurchargeType.Breakdown.Fee createFeeSurchargeTypeBreakdownFee() {
        return new FeeSurchargeType.Breakdown.Fee();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Row }
     * 
     */
    public CabinCameraPosType.Row createCabinCameraPosTypeRow() {
        return new CabinCameraPosType.Row();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Column }
     * 
     */
    public CabinCameraPosType.Column createCabinCameraPosTypeColumn() {
        return new CabinCameraPosType.Column();
    }

    /**
     * Create an instance of {@link CampaignUTMParameterType.OtherUTM }
     * 
     */
    public CampaignUTMParameterType.OtherUTM createCampaignUTMParameterTypeOtherUTM() {
        return new CampaignUTMParameterType.OtherUTM();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType.OfferPrice }
     * 
     */
    public OtherOfferCoreType.OfferPrice createOtherOfferCoreTypeOfferPrice() {
        return new OtherOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link RenderingParameterType.Parameter }
     * 
     */
    public RenderingParameterType.Parameter createRenderingParameterTypeParameter() {
        return new RenderingParameterType.Parameter();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType.OtherAssociation.Type }
     * 
     */
    public ServiceOtherAssocType.OtherAssociation.Type createServiceOtherAssocTypeOtherAssociationType() {
        return new ServiceOtherAssocType.OtherAssociation.Type();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Passenger }
     * 
     */
    public ServiceAssocType.Passenger createServiceAssocTypePassenger() {
        return new ServiceAssocType.Passenger();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Flight }
     * 
     */
    public ServiceAssocType.Flight createServiceAssocTypeFlight() {
        return new ServiceAssocType.Flight();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Offer }
     * 
     */
    public ServiceAssocType.Offer createServiceAssocTypeOffer() {
        return new ServiceAssocType.Offer();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Status }
     * 
     */
    public PaymentProcessType.Status createPaymentProcessTypeStatus() {
        return new PaymentProcessType.Status();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Amount }
     * 
     */
    public PaymentProcessType.Amount createPaymentProcessTypeAmount() {
        return new PaymentProcessType.Amount();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Method }
     * 
     */
    public PaymentProcessType.Method createPaymentProcessTypeMethod() {
        return new PaymentProcessType.Method();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Variance }
     * 
     */
    public PaymentProcessType.Variance createPaymentProcessTypeVariance() {
        return new PaymentProcessType.Variance();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotions.Promotion }
     * 
     */
    public PaymentProcessType.Promotions.Promotion createPaymentProcessTypePromotionsPromotion() {
        return new PaymentProcessType.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment }
     * 
     */
    public PaymentStatusType.IncompletePayment createPaymentStatusTypeIncompletePayment() {
        return new PaymentStatusType.IncompletePayment();
    }

    /**
     * Create an instance of {@link InstrClassUpgradeType.Classes }
     * 
     */
    public InstrClassUpgradeType.Classes createInstrClassUpgradeTypeClasses() {
        return new InstrClassUpgradeType.Classes();
    }

    /**
     * Create an instance of {@link CountryQueryType.CountryCodes }
     * 
     */
    public CountryQueryType.CountryCodes createCountryQueryTypeCountryCodes() {
        return new CountryQueryType.CountryCodes();
    }

    /**
     * Create an instance of {@link CountryQueryType.Keywords }
     * 
     */
    public CountryQueryType.Keywords createCountryQueryTypeKeywords() {
        return new CountryQueryType.Keywords();
    }

    /**
     * Create an instance of {@link AugmentationType.Augmentations }
     * 
     */
    public AugmentationType.Augmentations createAugmentationTypeAugmentations() {
        return new AugmentationType.Augmentations();
    }

    /**
     * Create an instance of {@link RemarkType.Remark }
     * 
     */
    public RemarkType.Remark createRemarkTypeRemark() {
        return new RemarkType.Remark();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Status }
     * 
     */
    public PinPhraseAnswerType.Status createPinPhraseAnswerTypeStatus() {
        return new PinPhraseAnswerType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Device }
     * 
     */
    public PinPhraseAnswerType.Device createPinPhraseAnswerTypeDevice() {
        return new PinPhraseAnswerType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.OriginalTransactionID }
     * 
     */
    public PinPhraseAnswerType.OriginalTransactionID createPinPhraseAnswerTypeOriginalTransactionID() {
        return new PinPhraseAnswerType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link DeviceType.Type }
     * 
     */
    public DeviceType.Type createDeviceTypeType() {
        return new DeviceType.Type();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType.Feature }
     * 
     */
    public AircraftFeaturesQueryType.Feature createAircraftFeaturesQueryTypeFeature() {
        return new AircraftFeaturesQueryType.Feature();
    }

    /**
     * Create an instance of {@link FeeDisclosureType.Surcharges }
     * 
     */
    public FeeDisclosureType.Surcharges createFeeDisclosureTypeSurcharges() {
        return new FeeDisclosureType.Surcharges();
    }

    /**
     * Create an instance of {@link FeeDisclosureType.Fees }
     * 
     */
    public FeeDisclosureType.Fees createFeeDisclosureTypeFees() {
        return new FeeDisclosureType.Fees();
    }

    /**
     * Create an instance of {@link LinkDescriptionType.Links }
     * 
     */
    public LinkDescriptionType.Links createLinkDescriptionTypeLinks() {
        return new LinkDescriptionType.Links();
    }

    /**
     * Create an instance of {@link LinkDescriptionType.Texts }
     * 
     */
    public LinkDescriptionType.Texts createLinkDescriptionTypeTexts() {
        return new LinkDescriptionType.Texts();
    }

    /**
     * Create an instance of {@link TravelerFOIDType.FOID }
     * 
     */
    public TravelerFOIDType.FOID createTravelerFOIDTypeFOID() {
        return new TravelerFOIDType.FOID();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Unit }
     * 
     */
    public AwardRedemptionType.Unit createAwardRedemptionTypeUnit() {
        return new AwardRedemptionType.Unit();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Conversion }
     * 
     */
    public AwardRedemptionType.Conversion createAwardRedemptionTypeConversion() {
        return new AwardRedemptionType.Conversion();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType.OfferPrice }
     * 
     */
    public PricedFlightOfferCoreType.OfferPrice createPricedFlightOfferCoreTypeOfferPrice() {
        return new PricedFlightOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType.RequestedDate }
     * 
     */
    public OfferPriceLeadType.RequestedDate createOfferPriceLeadTypeRequestedDate() {
        return new OfferPriceLeadType.RequestedDate();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.TotalAmount }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.TotalAmount createOfferPriceLeadDetailTypePriceDetailTotalAmount() {
        return new OfferPriceLeadDetailType.PriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.Surcharges }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.Surcharges createOfferPriceLeadDetailTypePriceDetailSurcharges() {
        return new OfferPriceLeadDetailType.PriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.Fees }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.Fees createOfferPriceLeadDetailTypePriceDetailFees() {
        return new OfferPriceLeadDetailType.PriceDetail.Fees();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.ExpirationDate }
     * 
     */
    public OfferIncentiveType.Incentive.ExpirationDate createOfferIncentiveTypeIncentiveExpirationDate() {
        return new OfferIncentiveType.Incentive.ExpirationDate();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.OfferSubCode }
     * 
     */
    public OfferIncentiveType.Incentive.OfferSubCode createOfferIncentiveTypeIncentiveOfferSubCode() {
        return new OfferIncentiveType.Incentive.OfferSubCode();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.DiscountLevel }
     * 
     */
    public OfferIncentiveType.Incentive.DiscountLevel createOfferIncentiveTypeIncentiveDiscountLevel() {
        return new OfferIncentiveType.Incentive.DiscountLevel();
    }

    /**
     * Create an instance of {@link PenaltyType.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.ApplicableFeeRemarks createPenaltyTypeApplicableFeeRemarks() {
        return new PenaltyType.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks createPenaltyTypeDetailsDetailAmountsAmountApplicableFeeRemarks() {
        return new PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Name }
     * 
     */
    public ServiceCoreType.Name createServiceCoreTypeName() {
        return new ServiceCoreType.Name();
    }

    /**
     * Create an instance of {@link ServiceCoreType.FeeMethod }
     * 
     */
    public ServiceCoreType.FeeMethod createServiceCoreTypeFeeMethod() {
        return new ServiceCoreType.FeeMethod();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Settlement }
     * 
     */
    public ServiceCoreType.Settlement createServiceCoreTypeSettlement() {
        return new ServiceCoreType.Settlement();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Associations }
     * 
     */
    public ServiceCoreType.Associations createServiceCoreTypeAssociations() {
        return new ServiceCoreType.Associations();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceCoreType.BookingInstructions.UpgradeMethod createServiceCoreTypeBookingInstructionsUpgradeMethod() {
        return new ServiceCoreType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.Code }
     * 
     */
    public ServiceEncodingType.Code createServiceEncodingTypeCode() {
        return new ServiceEncodingType.Code();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.SubCode }
     * 
     */
    public ServiceEncodingType.SubCode createServiceEncodingTypeSubCode() {
        return new ServiceEncodingType.SubCode();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Indicators }
     * 
     */
    public FlightType.Flight.Indicators createFlightTypeFlightIndicators() {
        return new FlightType.Flight.Indicators();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Status }
     * 
     */
    public FlightType.Flight.Status createFlightTypeFlightStatus() {
        return new FlightType.Flight.Status();
    }

    /**
     * Create an instance of {@link FlightType.Flight.OperatingCarrier }
     * 
     */
    public FlightType.Flight.OperatingCarrier createFlightTypeFlightOperatingCarrier() {
        return new FlightType.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link LocationProximityType.AreaValue }
     * 
     */
    public LocationProximityType.AreaValue createLocationProximityTypeAreaValue() {
        return new LocationProximityType.AreaValue();
    }

    /**
     * Create an instance of {@link StateProvProximityType.StateCode }
     * 
     */
    public StateProvProximityType.StateCode createStateProvProximityTypeStateCode() {
        return new StateProvProximityType.StateCode();
    }

    /**
     * Create an instance of {@link FarePriceBaseType.Surcharges }
     * 
     */
    public FarePriceBaseType.Surcharges createFarePriceBaseTypeSurcharges() {
        return new FarePriceBaseType.Surcharges();
    }

    /**
     * Create an instance of {@link AgentUserType.AgentUserID }
     * 
     */
    public AgentUserType.AgentUserID createAgentUserTypeAgentUserID() {
        return new AgentUserType.AgentUserID();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.SubTotal }
     * 
     */
    public AllOffersSnapshotType.SubTotal createAllOffersSnapshotTypeSubTotal() {
        return new AllOffersSnapshotType.SubTotal();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.Highest }
     * 
     */
    public AllOffersSnapshotType.Highest createAllOffersSnapshotTypeHighest() {
        return new AllOffersSnapshotType.Highest();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.Lowest }
     * 
     */
    public AllOffersSnapshotType.Lowest createAllOffersSnapshotTypeLowest() {
        return new AllOffersSnapshotType.Lowest();
    }

    /**
     * Create an instance of {@link PassengerType.Remark }
     * 
     */
    public PassengerType.Remark createPassengerTypeRemark() {
        return new PassengerType.Remark();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.TimeLimits }
     * 
     */
    public OrderCoreChangeType.TimeLimits createOrderCoreChangeTypeTimeLimits() {
        return new OrderCoreChangeType.TimeLimits();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.ActionType }
     * 
     */
    public OrderCoreChangeType.ActionType createOrderCoreChangeTypeActionType() {
        return new OrderCoreChangeType.ActionType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.ActionType }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.ActionType createOrderCoreChangeTypeDetailsAmendmentsAmendmentActionType() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.ActionType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.Passengers createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemPassengers() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OtherAssociation createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOtherAssociation() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Passengers createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOfferItemPassengers() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.OtherAssociation createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOfferItemOtherAssociation() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services.Passengers createOrderCoreChangeTypeDetailsAmendmentsAmendmentOrderItemOfferItemServicesPassengers() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.Services.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.AgentIDs }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.AgentIDs createOrderCoreChangeTypeDetailsAmendmentsAmendmentTicketDocInfoAgentIDs() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.AgentIDs();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.Passengers createOrderCoreChangeTypeDetailsAmendmentsAmendmentTicketDocInfoPassengers() {
        return new OrderCoreChangeType.Details.Amendments.Amendment.TicketDocInfo.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.ResponseID }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.ResponseID createOrderCoreChangeTypeDetailsShoppingResponseResponseID() {
        return new OrderCoreChangeType.Details.ShoppingResponse.ResponseID();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.OfferID }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.OfferID createOrderCoreChangeTypeDetailsShoppingResponseOfferID() {
        return new OrderCoreChangeType.Details.ShoppingResponse.OfferID();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.OfferItems.OfferItem }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.OfferItems.OfferItem createOrderCoreChangeTypeDetailsShoppingResponseOfferItemsOfferItem() {
        return new OrderCoreChangeType.Details.ShoppingResponse.OfferItems.OfferItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations.Passengers }
     * 
     */
    public OrderCoreChangeType.Associations.Passengers createOrderCoreChangeTypeAssociationsPassengers() {
        return new OrderCoreChangeType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Associations.OtherAssociation createOrderCoreChangeTypeAssociationsOtherAssociation() {
        return new OrderCoreChangeType.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare.FareBasis }
     * 
     */
    public GroupFarePreferencesType.GroupFare.FareBasis createGroupFarePreferencesTypeGroupFareFareBasis() {
        return new GroupFarePreferencesType.GroupFare.FareBasis();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType.Partial.Currency }
     * 
     */
    public CombinationPriceSimpleType.Partial.Currency createCombinationPriceSimpleTypePartialCurrency() {
        return new CombinationPriceSimpleType.Partial.Currency();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.ResponseID }
     * 
     */
    public ShoppingResponseOrderType.ResponseID createShoppingResponseOrderTypeResponseID() {
        return new ShoppingResponseOrderType.ResponseID();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.TotalPrice }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.TotalPrice createShoppingResponseOrderTypeOffersOfferTotalPrice() {
        return new ShoppingResponseOrderType.Offers.Offer.TotalPrice();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemPassengers() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemTotalPrice() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemDetailsInventoryGuarantee() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers }
     * 
     */
    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers createShoppingResponseOrderTypeOffersOfferOfferItemsOfferItemAssociatedServicesAssociatedServicePassengers() {
        return new ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     */
    public NonGeographicSpecificationType.PointOfSaleCode createNonGeographicSpecificationTypePointOfSaleCode() {
        return new NonGeographicSpecificationType.PointOfSaleCode();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.InventoryGuarantee }
     * 
     */
    public OrderItemCoreType.OrderItem.InventoryGuarantee createOrderItemCoreTypeOrderItemInventoryGuarantee() {
        return new OrderItemCoreType.OrderItem.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations.Passengers }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations.Passengers createOrderItemCoreTypeOrderItemAssociationsPassengers() {
        return new OrderItemCoreType.OrderItem.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations.OtherAssociation }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations.OtherAssociation createOrderItemCoreTypeOrderItemAssociationsOtherAssociation() {
        return new OrderItemCoreType.OrderItem.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderItemRepriceType.OrderItem.InventoryGuarantee }
     * 
     */
    public OrderItemRepriceType.OrderItem.InventoryGuarantee createOrderItemRepriceTypeOrderItemInventoryGuarantee() {
        return new OrderItemRepriceType.OrderItem.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link OrderItemRepriceType.OrderItem.ActionType }
     * 
     */
    public OrderItemRepriceType.OrderItem.ActionType createOrderItemRepriceTypeOrderItemActionType() {
        return new OrderItemRepriceType.OrderItem.ActionType();
    }

    /**
     * Create an instance of {@link FlightOnlyType.OperatingCarrier }
     * 
     */
    public FlightOnlyType.OperatingCarrier createFlightOnlyTypeOperatingCarrier() {
        return new FlightOnlyType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.Languages }
     * 
     */
    public MessageParamsBaseType.Languages createMessageParamsBaseTypeLanguages() {
        return new MessageParamsBaseType.Languages();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.CurrCodes.FiledInCurrency }
     * 
     */
    public MessageParamsBaseType.CurrCodes.FiledInCurrency createMessageParamsBaseTypeCurrCodesFiledInCurrency() {
        return new MessageParamsBaseType.CurrCodes.FiledInCurrency();
    }

    /**
     * Create an instance of {@link StateProvQueryType.Keywords.KeyWord }
     * 
     */
    public StateProvQueryType.Keywords.KeyWord createStateProvQueryTypeKeywordsKeyWord() {
        return new StateProvQueryType.Keywords.KeyWord();
    }

    /**
     * Create an instance of {@link StateProvQueryType.StateCodes.StateCode }
     * 
     */
    public StateProvQueryType.StateCodes.StateCode createStateProvQueryTypeStateCodesStateCode() {
        return new StateProvQueryType.StateCodes.StateCode();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OfferExpiration }
     * 
     */
    public OfferTimeLimitSetType.OfferExpiration createOfferTimeLimitSetTypeOfferExpiration() {
        return new OfferTimeLimitSetType.OfferExpiration();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OtherLimits.OtherLimit }
     * 
     */
    public OfferTimeLimitSetType.OtherLimits.OtherLimit createOfferTimeLimitSetTypeOtherLimitsOtherLimit() {
        return new OfferTimeLimitSetType.OtherLimits.OtherLimit();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error.Code }
     * 
     */
    public ProcessingErrorType.Error.Code createProcessingErrorTypeErrorCode() {
        return new ProcessingErrorType.Error.Code();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error.InfoURL }
     * 
     */
    public ProcessingErrorType.Error.InfoURL createProcessingErrorTypeErrorInfoURL() {
        return new ProcessingErrorType.Error.InfoURL();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.DepartureDateTime }
     * 
     */
    public CouponFlightSegmentType.DepartureDateTime createCouponFlightSegmentTypeDepartureDateTime() {
        return new CouponFlightSegmentType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.OperatingCarrier }
     * 
     */
    public CouponFlightSegmentType.OperatingCarrier createCouponFlightSegmentTypeOperatingCarrier() {
        return new CouponFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData.IntermediateStop }
     * 
     */
    public ReissuedFlownType.FlightCouponData.IntermediateStop createReissuedFlownTypeFlightCouponDataIntermediateStop() {
        return new ReissuedFlownType.FlightCouponData.IntermediateStop();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Taxes }
     * 
     */
    public DetailCurrencyPriceType.Taxes createDetailCurrencyPriceTypeTaxes() {
        return new DetailCurrencyPriceType.Taxes();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Fees }
     * 
     */
    public DetailCurrencyPriceType.Fees createDetailCurrencyPriceTypeFees() {
        return new DetailCurrencyPriceType.Fees();
    }

    /**
     * Create an instance of {@link TaxDetailType.Total }
     * 
     */
    public TaxDetailType.Total createTaxDetailTypeTotal() {
        return new TaxDetailType.Total();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.CollectionPoint }
     * 
     */
    public TaxDetailType.Breakdown.Tax.CollectionPoint createTaxDetailTypeBreakdownTaxCollectionPoint() {
        return new TaxDetailType.Breakdown.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.Conversion }
     * 
     */
    public TaxDetailType.Breakdown.Tax.Conversion createTaxDetailTypeBreakdownTaxConversion() {
        return new TaxDetailType.Breakdown.Tax.Conversion();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details.Detail }
     * 
     */
    public DetailCurrencyPriceType.Details.Detail createDetailCurrencyPriceTypeDetailsDetail() {
        return new DetailCurrencyPriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType.Contact }
     * 
     */
    public IntermediaryCoreRepType.Contact createIntermediaryCoreRepTypeContact() {
        return new IntermediaryCoreRepType.Contact();
    }

    /**
     * Create an instance of {@link FlightDetailType.Stops }
     * 
     */
    public FlightDetailType.Stops createFlightDetailTypeStops() {
        return new FlightDetailType.Stops();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Status }
     * 
     */
    public PinPhraseQuestionType.Status createPinPhraseQuestionTypeStatus() {
        return new PinPhraseQuestionType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Device }
     * 
     */
    public PinPhraseQuestionType.Device createPinPhraseQuestionTypeDevice() {
        return new PinPhraseQuestionType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.OriginalTransactionID }
     * 
     */
    public PinPhraseQuestionType.OriginalTransactionID createPinPhraseQuestionTypeOriginalTransactionID() {
        return new PinPhraseQuestionType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge.Parameters.Positions }
     * 
     */
    public PinPhraseQuestionType.Challenge.Parameters.Positions createPinPhraseQuestionTypeChallengeParametersPositions() {
        return new PinPhraseQuestionType.Challenge.Parameters.Positions();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.Penalty }
     * 
     */
    public TicketAutoExchangeType.Penalty createTicketAutoExchangeTypePenalty() {
        return new TicketAutoExchangeType.Penalty();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.TicketNumbers.TicketNumber }
     * 
     */
    public TicketAutoExchangeType.TicketNumbers.TicketNumber createTicketAutoExchangeTypeTicketNumbersTicketNumber() {
        return new TicketAutoExchangeType.TicketNumbers.TicketNumber();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Method }
     * 
     */
    public OrderPaymentFormType.Method createOrderPaymentFormTypeMethod() {
        return new OrderPaymentFormType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Surname }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Surname createOrderPaymentFormTypePayerNameSurname() {
        return new OrderPaymentFormType.Payer.Name.Surname();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Given }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Given createOrderPaymentFormTypePayerNameGiven() {
        return new OrderPaymentFormType.Payer.Name.Given();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Middle }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Middle createOrderPaymentFormTypePayerNameMiddle() {
        return new OrderPaymentFormType.Payer.Name.Middle();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations.Passengers }
     * 
     */
    public OrderPaymentFormType.Associations.Passengers createOrderPaymentFormTypeAssociationsPassengers() {
        return new OrderPaymentFormType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations.OfferItemSets }
     * 
     */
    public OrderPaymentFormType.Associations.OfferItemSets createOrderPaymentFormTypeAssociationsOfferItemSets() {
        return new OrderPaymentFormType.Associations.OfferItemSets();
    }

    /**
     * Create an instance of {@link TicketDocumentType.CpnNbrs }
     * 
     */
    public TicketDocumentType.CpnNbrs createTicketDocumentTypeCpnNbrs() {
        return new TicketDocumentType.CpnNbrs();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType.Description }
     * 
     */
    public ServiceDescriptionType.Description createServiceDescriptionTypeDescription() {
        return new ServiceDescriptionType.Description();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.CabinDesignator }
     * 
     */
    public FlightCabinCoreType.CabinDesignator createFlightCabinCoreTypeCabinDesignator() {
        return new FlightCabinCoreType.CabinDesignator();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.MarketingName }
     * 
     */
    public FlightCabinCoreType.MarketingName createFlightCabinCoreTypeMarketingName() {
        return new FlightCabinCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link MarketingInfoType.Message }
     * 
     */
    public MarketingInfoType.Message createMarketingInfoTypeMessage() {
        return new MarketingInfoType.Message();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
     * 
     */
    public GeographicSpecificationType.Coordinates.CoordinateRadius createGeographicSpecificationTypeCoordinatesCoordinateRadius() {
        return new GeographicSpecificationType.Coordinates.CoordinateRadius();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.Location createFulfillmentPartnerTypeFulfillmentsFulfillmentLocation() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDatesStart() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDatesEnd() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.Proximity.ReferencePoint createReferencePointQueryTypeProximityReferencePoint() {
        return new ReferencePointQueryType.Proximity.ReferencePoint();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.AreaValue }
     * 
     */
    public ReferencePointQueryType.Proximity.AreaValue createReferencePointQueryTypeProximityAreaValue() {
        return new ReferencePointQueryType.Proximity.AreaValue();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.ReferencePoints.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.ReferencePoints.ReferencePoint createReferencePointQueryTypeReferencePointsReferencePoint() {
        return new ReferencePointQueryType.ReferencePoints.ReferencePoint();
    }

    /**
     * Create an instance of {@link OtherOrderAssocType.OtherAssociation }
     * 
     */
    public OtherOrderAssocType.OtherAssociation createOtherOrderAssocTypeOtherAssociation() {
        return new OtherOrderAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link OfferItemCoreType.Parameters }
     * 
     */
    public OfferItemCoreType.Parameters createOfferItemCoreTypeParameters() {
        return new OfferItemCoreType.Parameters();
    }

    /**
     * Create an instance of {@link OfferItemCoreType.TotalPrice }
     * 
     */
    public OfferItemCoreType.TotalPrice createOfferItemCoreTypeTotalPrice() {
        return new OfferItemCoreType.TotalPrice();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.Service }
     * 
     */
    public SocialMediaQualifierType.Service createSocialMediaQualifierTypeService() {
        return new SocialMediaQualifierType.Service();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.User }
     * 
     */
    public SocialMediaQualifierType.User createSocialMediaQualifierTypeUser() {
        return new SocialMediaQualifierType.User();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.EmailAddress }
     * 
     */
    public SocialMediaQualifierType.EmailAddress createSocialMediaQualifierTypeEmailAddress() {
        return new SocialMediaQualifierType.EmailAddress();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDatePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDatePeriod createCouponEffectiveTypeEffectiveDatePeriod() {
        return new CouponEffectiveType.EffectiveDatePeriod();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDateTimePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDateTimePeriod createCouponEffectiveTypeEffectiveDateTimePeriod() {
        return new CouponEffectiveType.EffectiveDateTimePeriod();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.OperatingCarrier }
     * 
     */
    public ListOfFlightSegmentType.OperatingCarrier createListOfFlightSegmentTypeOperatingCarrier() {
        return new ListOfFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.Settlement }
     * 
     */
    public ListOfFlightSegmentType.Settlement createListOfFlightSegmentTypeSettlement() {
        return new ListOfFlightSegmentType.Settlement();
    }

    /**
     * Create an instance of {@link AugPointAssocType.AugPointAssoc }
     * 
     */
    public AugPointAssocType.AugPointAssoc createAugPointAssocTypeAugPointAssoc() {
        return new AugPointAssocType.AugPointAssoc();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.Group }
     * 
     */
    public NamedAssocType.NamedAssoc.Group createNamedAssocTypeNamedAssocGroup() {
        return new NamedAssocType.NamedAssoc.Group();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.List }
     * 
     */
    public NamedAssocType.NamedAssoc.List createNamedAssocTypeNamedAssocList() {
        return new NamedAssocType.NamedAssoc.List();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.UniqueKeyID }
     * 
     */
    public NamedAssocType.NamedAssoc.UniqueKeyID createNamedAssocTypeNamedAssocUniqueKeyID() {
        return new NamedAssocType.NamedAssoc.UniqueKeyID();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo createTaxCouponInfoTypeTicketDocumentCouponNumberTaxCouponInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.Tax }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.Tax createTaxCouponInfoTypeTicketDocumentCouponNumberTax() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.Tax();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo createTaxCouponInfoTypeTicketDocumentCouponNumberUnticketedPointInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleSetID }
     * 
     */
    public RuleSetType.RuleSetID createRuleSetTypeRuleSetID() {
        return new RuleSetType.RuleSetID();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleValid }
     * 
     */
    public RuleSetType.RuleValid createRuleSetTypeRuleValid() {
        return new RuleSetType.RuleValid();
    }

    /**
     * Create an instance of {@link OrderFareRulesType.AdvanceStay }
     * 
     */
    public OrderFareRulesType.AdvanceStay createOrderFareRulesTypeAdvanceStay() {
        return new OrderFareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.SignInID }
     * 
     */
    public TravelerFQTVType.Account.SignInID createTravelerFQTVTypeAccountSignInID() {
        return new TravelerFQTVType.Account.SignInID();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.Number }
     * 
     */
    public TravelerFQTVType.Account.Number createTravelerFQTVTypeAccountNumber() {
        return new TravelerFQTVType.Account.Number();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Pricing }
     * 
     */
    public FlightItemOfferType.Pricing createFlightItemOfferTypePricing() {
        return new FlightItemOfferType.Pricing();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.AircraftEquipment }
     * 
     */
    public FlightItemOfferType.AircraftEquipment createFlightItemOfferTypeAircraftEquipment() {
        return new FlightItemOfferType.AircraftEquipment();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Passengers }
     * 
     */
    public FlightItemOfferType.Passengers createFlightItemOfferTypePassengers() {
        return new FlightItemOfferType.Passengers();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Details.InventoryGuarantee }
     * 
     */
    public FlightItemOfferType.Details.InventoryGuarantee createFlightItemOfferTypeDetailsInventoryGuarantee() {
        return new FlightItemOfferType.Details.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Flight.OperatingCarrier }
     * 
     */
    public FlightItemOfferType.Flight.OperatingCarrier createFlightItemOfferTypeFlightOperatingCarrier() {
        return new FlightItemOfferType.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link PriceClassAssocType.Association }
     * 
     */
    public PriceClassAssocType.Association createPriceClassAssocTypeAssociation() {
        return new PriceClassAssocType.Association();
    }

    /**
     * Create an instance of {@link AirPassDetailType.ProgramName }
     * 
     */
    public AirPassDetailType.ProgramName createAirPassDetailTypeProgramName() {
        return new AirPassDetailType.ProgramName();
    }

    /**
     * Create an instance of {@link AirPassDetailType.Holder }
     * 
     */
    public AirPassDetailType.Holder createAirPassDetailTypeHolder() {
        return new AirPassDetailType.Holder();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate.Number }
     * 
     */
    public AirPassCoreType.Certificate.Number createAirPassCoreTypeCertificateNumber() {
        return new AirPassCoreType.Certificate.Number();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate.EffectivePeriod }
     * 
     */
    public AirPassCoreType.Certificate.EffectivePeriod createAirPassCoreTypeCertificateEffectivePeriod() {
        return new AirPassCoreType.Certificate.EffectivePeriod();
    }

    /**
     * Create an instance of {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     */
    public OfferItemTimeLimitSetType.TimeLimit createOfferItemTimeLimitSetTypeTimeLimit() {
        return new OfferItemTimeLimitSetType.TimeLimit();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.TotalPrice }
     * 
     */
    public BaggageOfferCoreType.TotalPrice createBaggageOfferCoreTypeTotalPrice() {
        return new BaggageOfferCoreType.TotalPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
     * 
     */
    public BaggageOfferCoreType.BagDetails.BagDetail.Price createBaggageOfferCoreTypeBagDetailsBagDetailPrice() {
        return new BaggageOfferCoreType.BagDetails.BagDetail.Price();
    }

    /**
     * Create an instance of {@link OrderCoreType.TotalOrderPrice }
     * 
     */
    public OrderCoreType.TotalOrderPrice createOrderCoreTypeTotalOrderPrice() {
        return new OrderCoreType.TotalOrderPrice();
    }

    /**
     * Create an instance of {@link OrderCoreType.Status }
     * 
     */
    public OrderCoreType.Status createOrderCoreTypeStatus() {
        return new OrderCoreType.Status();
    }

    /**
     * Create an instance of {@link OrderCoreType.Payments }
     * 
     */
    public OrderCoreType.Payments createOrderCoreTypePayments() {
        return new OrderCoreType.Payments();
    }

    /**
     * Create an instance of {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
     * 
     */
    public OrderCoreType.TimeLimits.PaymentTimeLimit createOrderCoreTypeTimeLimitsPaymentTimeLimit() {
        return new OrderCoreType.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount createOrderCoreTypeOriginalOrderPriceQuotesPriceQuoteAmount() {
        return new OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source createOrderCoreTypeOriginalOrderPriceQuotesPriceQuoteSource() {
        return new OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType.Association }
     * 
     */
    public MarketMsgAssocType.Association createMarketMsgAssocTypeAssociation() {
        return new MarketMsgAssocType.Association();
    }

    /**
     * Create an instance of {@link COSOtherAssocType.OtherAssociation }
     * 
     */
    public COSOtherAssocType.OtherAssociation createCOSOtherAssocTypeOtherAssociation() {
        return new COSOtherAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Method }
     * 
     */
    public OrderPaymentMethodType.Method createOrderPaymentMethodTypeMethod() {
        return new OrderPaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations.Passengers }
     * 
     */
    public OrderPaymentMethodType.Associations.Passengers createOrderPaymentMethodTypeAssociationsPassengers() {
        return new OrderPaymentMethodType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations.OtherAssociation }
     * 
     */
    public OrderPaymentMethodType.Associations.OtherAssociation createOrderPaymentMethodTypeAssociationsOtherAssociation() {
        return new OrderPaymentMethodType.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Promotions.Promotion }
     * 
     */
    public OrderPaymentMethodType.Promotions.Promotion createOrderPaymentMethodTypePromotionsPromotion() {
        return new OrderPaymentMethodType.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link LocalizationNoticeType.Currencies }
     * 
     */
    public LocalizationNoticeType.Currencies createLocalizationNoticeTypeCurrencies() {
        return new LocalizationNoticeType.Currencies();
    }

    /**
     * Create an instance of {@link QualifiersType.Qualifier }
     * 
     */
    public QualifiersType.Qualifier createQualifiersTypeQualifier() {
        return new QualifiersType.Qualifier();
    }

    /**
     * Create an instance of {@link LinkFormattedType.Link }
     * 
     */
    public LinkFormattedType.Link createLinkFormattedTypeLink() {
        return new LinkFormattedType.Link();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.OutputFormat }
     * 
     */
    public RenderingInstructionsType.OutputFormat createRenderingInstructionsTypeOutputFormat() {
        return new RenderingInstructionsType.OutputFormat();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.AttachmentURI }
     * 
     */
    public RenderingInstructionsType.AttachmentURI createRenderingInstructionsTypeAttachmentURI() {
        return new RenderingInstructionsType.AttachmentURI();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Parameters }
     * 
     */
    public RenderingInstructionsType.Parameters createRenderingInstructionsTypeParameters() {
        return new RenderingInstructionsType.Parameters();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Overview }
     * 
     */
    public RenderingInstructionsType.Overview createRenderingInstructionsTypeOverview() {
        return new RenderingInstructionsType.Overview();
    }

    /**
     * Create an instance of {@link ServiceFilterType.GroupCode }
     * 
     */
    public ServiceFilterType.GroupCode createServiceFilterTypeGroupCode() {
        return new ServiceFilterType.GroupCode();
    }

    /**
     * Create an instance of {@link ServiceFilterType.SubGroupCode }
     * 
     */
    public ServiceFilterType.SubGroupCode createServiceFilterTypeSubGroupCode() {
        return new ServiceFilterType.SubGroupCode();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Earliest }
     * 
     */
    public OfferValidPeriodType.Earliest createOfferValidPeriodTypeEarliest() {
        return new OfferValidPeriodType.Earliest();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Latest }
     * 
     */
    public OfferValidPeriodType.Latest createOfferValidPeriodTypeLatest() {
        return new OfferValidPeriodType.Latest();
    }

    /**
     * Create an instance of {@link AugPointListType.List.AugPointAssoc }
     * 
     */
    public AugPointListType.List.AugPointAssoc createAugPointListTypeListAugPointAssoc() {
        return new AugPointListType.List.AugPointAssoc();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Images }
     * 
     */
    public SeatMapMessageType.Images createSeatMapMessageTypeImages() {
        return new SeatMapMessageType.Images();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Links }
     * 
     */
    public SeatMapMessageType.Links createSeatMapMessageTypeLinks() {
        return new SeatMapMessageType.Links();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.Name }
     * 
     */
    public ListOfServiceType.Service.Name createListOfServiceTypeServiceName() {
        return new ListOfServiceType.Service.Name();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.FeeMethod }
     * 
     */
    public ListOfServiceType.Service.FeeMethod createListOfServiceTypeServiceFeeMethod() {
        return new ListOfServiceType.Service.FeeMethod();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.Settlement }
     * 
     */
    public ListOfServiceType.Service.Settlement createListOfServiceTypeServiceSettlement() {
        return new ListOfServiceType.Service.Settlement();
    }

    /**
     * Create an instance of {@link SpecialType.Code }
     * 
     */
    public SpecialType.Code createSpecialTypeCode() {
        return new SpecialType.Code();
    }

    /**
     * Create an instance of {@link SpecialType.Description }
     * 
     */
    public SpecialType.Description createSpecialTypeDescription() {
        return new SpecialType.Description();
    }

    /**
     * Create an instance of {@link ServiceCouponType.CouponType }
     * 
     */
    public ServiceCouponType.CouponType createServiceCouponTypeCouponType() {
        return new ServiceCouponType.CouponType();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType.Amount }
     * 
     */
    public TotalFareTransactionType.Amount createTotalFareTransactionTypeAmount() {
        return new TotalFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType.LocationCode }
     * 
     */
    public FltArriveQualifiedQueryType.LocationCode createFltArriveQualifiedQueryTypeLocationCode() {
        return new FltArriveQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType.LeadPricing }
     * 
     */
    public FltArriveQualifiedQueryType.LeadPricing createFltArriveQualifiedQueryTypeLeadPricing() {
        return new FltArriveQualifiedQueryType.LeadPricing();
    }

    /**
     * Create an instance of {@link Voucher.Name.Surname }
     * 
     */
    public Voucher.Name.Surname createVoucherNameSurname() {
        return new Voucher.Name.Surname();
    }

    /**
     * Create an instance of {@link Voucher.Name.Given }
     * 
     */
    public Voucher.Name.Given createVoucherNameGiven() {
        return new Voucher.Name.Given();
    }

    /**
     * Create an instance of {@link Voucher.Name.Middle }
     * 
     */
    public Voucher.Name.Middle createVoucherNameMiddle() {
        return new Voucher.Name.Middle();
    }

    /**
     * Create an instance of {@link FareRulesType.AdvanceStay }
     * 
     */
    public FareRulesType.AdvanceStay createFareRulesTypeAdvanceStay() {
        return new FareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing.Endorsements }
     * 
     */
    public FareRulesType.Ticketing.Endorsements createFareRulesTypeTicketingEndorsements() {
        return new FareRulesType.Ticketing.Endorsements();
    }

    /**
     * Create an instance of {@link PassengerMetadataType.NameDetail }
     * 
     */
    public PassengerMetadataType.NameDetail createPassengerMetadataTypeNameDetail() {
        return new PassengerMetadataType.NameDetail();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.PayerAuth }
     * 
     */
    public SecurePaymentAlertType.PayerAuth createSecurePaymentAlertTypePayerAuth() {
        return new SecurePaymentAlertType.PayerAuth();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.TransactionType }
     * 
     */
    public SecurePaymentAlertType.TransactionType createSecurePaymentAlertTypeTransactionType() {
        return new SecurePaymentAlertType.TransactionType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.EnrollmentStatus }
     * 
     */
    public SecurePaymentAlertType.EnrollmentStatus createSecurePaymentAlertTypeEnrollmentStatus() {
        return new SecurePaymentAlertType.EnrollmentStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.URLs }
     * 
     */
    public SecurePaymentAlertType.URLs createSecurePaymentAlertTypeURLs() {
        return new SecurePaymentAlertType.URLs();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification createSecurePaymentAlertTypeProcessingInfosProcessingInfoAddrVerification() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus createSecurePaymentAlertTypeProcessingInfosProcessingInfoCustomerAuthStatus() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.ClientType }
     * 
     */
    public SecurePaymentAlertType.Details.ClientType createSecurePaymentAlertTypeDetailsClientType() {
        return new SecurePaymentAlertType.Details.ClientType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.CustomerDevice }
     * 
     */
    public SecurePaymentAlertType.Details.CustomerDevice createSecurePaymentAlertTypeDetailsCustomerDevice() {
        return new SecurePaymentAlertType.Details.CustomerDevice();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.Currency }
     * 
     */
    public SecurePaymentAlertType.Details.Currency createSecurePaymentAlertTypeDetailsCurrency() {
        return new SecurePaymentAlertType.Details.Currency();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.TxnDatas }
     * 
     */
    public SecurePaymentAlertType.Details.TxnDatas createSecurePaymentAlertTypeDetailsTxnDatas() {
        return new SecurePaymentAlertType.Details.TxnDatas();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference.OriginalTransactionID }
     * 
     */
    public SecurePaymentAlertType.Reference.OriginalTransactionID createSecurePaymentAlertTypeReferenceOriginalTransactionID() {
        return new SecurePaymentAlertType.Reference.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference.TxnDatas }
     * 
     */
    public SecurePaymentAlertType.Reference.TxnDatas createSecurePaymentAlertTypeReferenceTxnDatas() {
        return new SecurePaymentAlertType.Reference.TxnDatas();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.ID }
     * 
     */
    public SecurePaymentAlertType.Airline.ID createSecurePaymentAlertTypeAirlineID() {
        return new SecurePaymentAlertType.Airline.ID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.Name }
     * 
     */
    public SecurePaymentAlertType.Airline.Name createSecurePaymentAlertTypeAirlineName() {
        return new SecurePaymentAlertType.Airline.Name();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.CountryCode }
     * 
     */
    public SecurePaymentAlertType.Airline.CountryCode createSecurePaymentAlertTypeAirlineCountryCode() {
        return new SecurePaymentAlertType.Airline.CountryCode();
    }

    /**
     * Create an instance of {@link AlertsType.Alert }
     * 
     */
    public AlertsType.Alert createAlertsTypeAlert() {
        return new AlertsType.Alert();
    }

    /**
     * Create an instance of {@link PaymentMethodType.Method.Promotions.Promotion }
     * 
     */
    public PaymentMethodType.Method.Promotions.Promotion createPaymentMethodTypeMethodPromotionsPromotion() {
        return new PaymentMethodType.Method.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.Location }
     * 
     */
    public ServiceFulfillmentType.Location createServiceFulfillmentTypeLocation() {
        return new ServiceFulfillmentType.Location();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.Start }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.Start createServiceFulfillmentTypeOfferValidDatesStart() {
        return new ServiceFulfillmentType.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.End }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.End createServiceFulfillmentTypeOfferValidDatesEnd() {
        return new ServiceFulfillmentType.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link PaymentAddrType.City }
     * 
     */
    public PaymentAddrType.City createPaymentAddrTypeCity() {
        return new PaymentAddrType.City();
    }

    /**
     * Create an instance of {@link MediaMetadataType.Dimensions }
     * 
     */
    public MediaMetadataType.Dimensions createMediaMetadataTypeDimensions() {
        return new MediaMetadataType.Dimensions();
    }

    /**
     * Create an instance of {@link MediaMetadataType.MediaSource }
     * 
     */
    public MediaMetadataType.MediaSource createMediaMetadataTypeMediaSource() {
        return new MediaMetadataType.MediaSource();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption.RuleID }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption.RuleID createTaxExemptionNoticeTypeResultsTaxExemptionRuleID() {
        return new TaxExemptionNoticeType.Results.TaxExemption.RuleID();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Countries }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Countries createTaxExemptionNoticeTypeQueryNamedCountries() {
        return new TaxExemptionNoticeType.Query.Named.Countries();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Entities }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Entities createTaxExemptionNoticeTypeQueryNamedEntities() {
        return new TaxExemptionNoticeType.Query.Named.Entities();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Territories }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Territories createTaxExemptionNoticeTypeQueryNamedTerritories() {
        return new TaxExemptionNoticeType.Query.Named.Territories();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode createTaxExemptionNoticeTypeQueryNamedTaxCodesTaxCode() {
        return new TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode();
    }

    /**
     * Create an instance of {@link DirectBillType.Address }
     * 
     */
    public DirectBillType.Address createDirectBillTypeAddress() {
        return new DirectBillType.Address();
    }

    /**
     * Create an instance of {@link SeatDataType.Keywords }
     * 
     */
    public SeatDataType.Keywords createSeatDataTypeKeywords() {
        return new SeatDataType.Keywords();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing }
     * 
     */
    public SeatDataType.Marketing createSeatDataTypeMarketing() {
        return new SeatDataType.Marketing();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType.Amount }
     * 
     */
    public BaseFareTransactionType.Amount createBaseFareTransactionTypeAmount() {
        return new BaseFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link AttributesType.Group }
     * 
     */
    public AttributesType.Group createAttributesTypeGroup() {
        return new AttributesType.Group();
    }

    /**
     * Create an instance of {@link AttributesType.SubGroup }
     * 
     */
    public AttributesType.SubGroup createAttributesTypeSubGroup() {
        return new AttributesType.SubGroup();
    }

    /**
     * Create an instance of {@link AttributesType.Desc1 }
     * 
     */
    public AttributesType.Desc1 createAttributesTypeDesc1() {
        return new AttributesType.Desc1();
    }

    /**
     * Create an instance of {@link AttributesType.Desc2 }
     * 
     */
    public AttributesType.Desc2 createAttributesTypeDesc2() {
        return new AttributesType.Desc2();
    }

    /**
     * Create an instance of {@link PhoneType.Number }
     * 
     */
    public PhoneType.Number createPhoneTypeNumber() {
        return new PhoneType.Number();
    }

    /**
     * Create an instance of {@link PolicyAugmentationType.Policy }
     * 
     */
    public PolicyAugmentationType.Policy createPolicyAugmentationTypePolicy() {
        return new PolicyAugmentationType.Policy();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType.AuthRequest }
     * 
     */
    public PINAuthTravelerType.AuthRequest createPINAuthTravelerTypeAuthRequest() {
        return new PINAuthTravelerType.AuthRequest();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Taxes }
     * 
     */
    public CarrierFeeInfoType.Taxes createCarrierFeeInfoTypeTaxes() {
        return new CarrierFeeInfoType.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.FeeAmount }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.FeeAmount createCarrierFeeInfoTypeCarrierFeesFeeFeeAmount() {
        return new CarrierFeeInfoType.CarrierFees.Fee.FeeAmount();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.Taxes }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.Taxes createCarrierFeeInfoTypeCarrierFeesFeeTaxes() {
        return new CarrierFeeInfoType.CarrierFees.Fee.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.FareComponent }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.FareComponent createCarrierFeeInfoTypeCarrierFeesFeeFareComponent() {
        return new CarrierFeeInfoType.CarrierFees.Fee.FareComponent();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.AirlineID }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.AirlineID createCarrierFeeInfoTypeCarrierFeesFeeAirlineID() {
        return new CarrierFeeInfoType.CarrierFees.Fee.AirlineID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID createPriceVarianceRuleNoticeTypeResultsPriceVarianceRuleID() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.Amount }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.Amount createPriceVarianceRuleNoticeTypeResultsPriceVarianceAmount() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleID() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleAcceptableVariance() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleName() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleValid() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleCurrencies() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Surname }
     * 
     */
    public PrimaryContact.Name.Surname createPrimaryContactNameSurname() {
        return new PrimaryContact.Name.Surname();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Given }
     * 
     */
    public PrimaryContact.Name.Given createPrimaryContactNameGiven() {
        return new PrimaryContact.Name.Given();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Middle }
     * 
     */
    public PrimaryContact.Name.Middle createPrimaryContactNameMiddle() {
        return new PrimaryContact.Name.Middle();
    }

    /**
     * Create an instance of {@link ListOfOfferInstructionsType.Instruction }
     * 
     */
    public ListOfOfferInstructionsType.Instruction createListOfOfferInstructionsTypeInstruction() {
        return new ListOfOfferInstructionsType.Instruction();
    }

    /**
     * Create an instance of {@link VoucherMethodType.EffectiveExpireDate }
     * 
     */
    public VoucherMethodType.EffectiveExpireDate createVoucherMethodTypeEffectiveExpireDate() {
        return new VoucherMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link BagListReqMetadataType.Shopping }
     * 
     */
    public BagListReqMetadataType.Shopping createBagListReqMetadataTypeShopping() {
        return new BagListReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link BagListReqMetadataType.Passenger }
     * 
     */
    public BagListReqMetadataType.Passenger createBagListReqMetadataTypePassenger() {
        return new BagListReqMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link BagListReqMetadataType.Other.OtherMetadata }
     * 
     */
    public BagListReqMetadataType.Other.OtherMetadata createBagListReqMetadataTypeOtherOtherMetadata() {
        return new BagListReqMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link BaggageListRQ.DataLists.PassengerList }
     * 
     */
    public BaggageListRQ.DataLists.PassengerList createBaggageListRQDataListsPassengerList() {
        return new BaggageListRQ.DataLists.PassengerList();
    }

    /**
     * Create an instance of {@link BaggageListRQ.DataLists.ContactList }
     * 
     */
    public BaggageListRQ.DataLists.ContactList createBaggageListRQDataListsContactList() {
        return new BaggageListRQ.DataLists.ContactList();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Pricing }
     * 
     */
    public TransferPreferencesType.Pricing createTransferPreferencesTypePricing() {
        return new TransferPreferencesType.Pricing();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Interline }
     * 
     */
    public TransferPreferencesType.Connection.Interline createTransferPreferencesTypeConnectionInterline() {
        return new TransferPreferencesType.Connection.Interline();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Codes.Code }
     * 
     */
    public TransferPreferencesType.Connection.Codes.Code createTransferPreferencesTypeConnectionCodesCode() {
        return new TransferPreferencesType.Connection.Codes.Code();
    }

    /**
     * Create an instance of {@link BaggageListRQ.Query.OriginDestination }
     * 
     */
    public BaggageListRQ.Query.OriginDestination createBaggageListRQQueryOriginDestination() {
        return new BaggageListRQ.Query.OriginDestination();
    }

    /**
     * Create an instance of {@link BaggageListRQ.Query.Flight }
     * 
     */
    public BaggageListRQ.Query.Flight createBaggageListRQQueryFlight() {
        return new BaggageListRQ.Query.Flight();
    }

    /**
     * Create an instance of {@link BagListReqParamsType.ServiceFilters }
     * 
     */
    public BagListReqParamsType.ServiceFilters createBagListReqParamsTypeServiceFilters() {
        return new BagListReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link BagListReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public BagListReqParamsType.Pricing.FeeExemption.Fee.Code createBagListReqParamsTypePricingFeeExemptionFeeCode() {
        return new BagListReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link PointOfSaleType.Location }
     * 
     */
    public PointOfSaleType.Location createPointOfSaleTypeLocation() {
        return new PointOfSaleType.Location();
    }

    /**
     * Create an instance of {@link PointOfSaleType.RequestTime }
     * 
     */
    public PointOfSaleType.RequestTime createPointOfSaleTypeRequestTime() {
        return new PointOfSaleType.RequestTime();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint.Device }
     * 
     */
    public PointOfSaleType.TouchPoint.Device createPointOfSaleTypeTouchPointDevice() {
        return new PointOfSaleType.TouchPoint.Device();
    }

    /**
     * Create an instance of {@link SeatComponentType.Dimensions.ActualSize }
     * 
     */
    public SeatComponentType.Dimensions.ActualSize createSeatComponentTypeDimensionsActualSize() {
        return new SeatComponentType.Dimensions.ActualSize();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location.Row }
     * 
     */
    public SeatComponentType.Locations.Location.Row createSeatComponentTypeLocationsLocationRow() {
        return new SeatComponentType.Locations.Location.Row();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location.Column }
     * 
     */
    public SeatComponentType.Locations.Location.Column createSeatComponentTypeLocationsLocationColumn() {
        return new SeatComponentType.Locations.Location.Column();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location.Space.RowRange }
     * 
     */
    public SeatComponentType.Locations.Location.Space.RowRange createSeatComponentTypeLocationsLocationSpaceRowRange() {
        return new SeatComponentType.Locations.Location.Space.RowRange();
    }

    /**
     * Create an instance of {@link SeatComponentType.Locations.Location.Space.ColumnRange }
     * 
     */
    public SeatComponentType.Locations.Location.Space.ColumnRange createSeatComponentTypeLocationsLocationSpaceColumnRange() {
        return new SeatComponentType.Locations.Location.Space.ColumnRange();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType.ContentSource.OtherID }
     * 
     */
    public ListOfContentSourceType.ContentSource.OtherID createListOfContentSourceTypeContentSourceOtherID() {
        return new ListOfContentSourceType.ContentSource.OtherID();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType.TicketBy }
     * 
     */
    public TicketByTimeLimitType.TicketBy createTicketByTimeLimitTypeTicketBy() {
        return new TicketByTimeLimitType.TicketBy();
    }

    /**
     * Create an instance of {@link MediaAttachmentType.AttachmentURI }
     * 
     */
    public MediaAttachmentType.AttachmentURI createMediaAttachmentTypeAttachmentURI() {
        return new MediaAttachmentType.AttachmentURI();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Account }
     * 
     */
    public DiscountProgramType.Account createDiscountProgramTypeAccount() {
        return new DiscountProgramType.Account();
    }

    /**
     * Create an instance of {@link DiscountProgramType.AssocCode }
     * 
     */
    public DiscountProgramType.AssocCode createDiscountProgramTypeAssocCode() {
        return new DiscountProgramType.AssocCode();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Name }
     * 
     */
    public DiscountProgramType.Name createDiscountProgramTypeName() {
        return new DiscountProgramType.Name();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Query }
     * 
     */
    public InvGuaranteeNoticeType.Query createInvGuaranteeNoticeTypeQuery() {
        return new InvGuaranteeNoticeType.Query();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
     * 
     */
    public InvGuaranteeNoticeType.Results.InventoryGuarantee createInvGuaranteeNoticeTypeResultsInventoryGuarantee() {
        return new InvGuaranteeNoticeType.Results.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link PolicyDefaultType.Policy }
     * 
     */
    public PolicyDefaultType.Policy createPolicyDefaultTypePolicy() {
        return new PolicyDefaultType.Policy();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherIDs.OtherID }
     * 
     */
    public AgencyCoreRepType.OtherIDs.OtherID createAgencyCoreRepTypeOtherIDsOtherID() {
        return new AgencyCoreRepType.OtherIDs.OtherID();
    }

    /**
     * Create an instance of {@link FareDetailType.FareIndicatorCode }
     * 
     */
    public FareDetailType.FareIndicatorCode createFareDetailTypeFareIndicatorCode() {
        return new FareDetailType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing.WaitListPreferences }
     * 
     */
    public FlightPreferencesType.WaitListing.WaitListPreferences createFlightPreferencesTypeWaitListingWaitListPreferences() {
        return new FlightPreferencesType.WaitListing.WaitListPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.NonStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.NonStopPreferences createFlightPreferencesTypeCharacteristicNonStopPreferences() {
        return new FlightPreferencesType.Characteristic.NonStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.DirectPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.DirectPreferences createFlightPreferencesTypeCharacteristicDirectPreferences() {
        return new FlightPreferencesType.Characteristic.DirectPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.OvernightStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.OvernightStopPreferences createFlightPreferencesTypeCharacteristicOvernightStopPreferences() {
        return new FlightPreferencesType.Characteristic.OvernightStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.AirportChangePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.AirportChangePreferences createFlightPreferencesTypeCharacteristicAirportChangePreferences() {
        return new FlightPreferencesType.Characteristic.AirportChangePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.RedEyePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.RedEyePreferences createFlightPreferencesTypeCharacteristicRedEyePreferences() {
        return new FlightPreferencesType.Characteristic.RedEyePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Equipment }
     * 
     */
    public FlightPreferencesType.Aircraft.Equipment createFlightPreferencesTypeAircraftEquipment() {
        return new FlightPreferencesType.Aircraft.Equipment();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Feature }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Feature createFlightPreferencesTypeAircraftRowsFeature() {
        return new FlightPreferencesType.Aircraft.Rows.Feature();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Number }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Number createFlightPreferencesTypeAircraftRowsNumber() {
        return new FlightPreferencesType.Aircraft.Rows.Number();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Characteristic }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Characteristic createFlightPreferencesTypeAircraftSeatsCharacteristic() {
        return new FlightPreferencesType.Aircraft.Seats.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Position }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Position createFlightPreferencesTypeAircraftSeatsPosition() {
        return new FlightPreferencesType.Aircraft.Seats.Position();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes.Class }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes.Class createFlightPreferencesTypeAircraftClassesClass() {
        return new FlightPreferencesType.Aircraft.Classes.Class();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins.Cabin }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins.Cabin createFlightPreferencesTypeAircraftCabinsCabin() {
        return new FlightPreferencesType.Aircraft.Cabins.Cabin();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType.Amount }
     * 
     */
    public EquivFareTransactionType.Amount createEquivFareTransactionTypeAmount() {
        return new EquivFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.Associations }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.Associations createListOfServiceBundleTypeServiceBundleAssociations() {
        return new ListOfServiceBundleType.ServiceBundle.Associations();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.Selection }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.Selection createListOfServiceBundleTypeServiceBundleSelection() {
        return new ListOfServiceBundleType.ServiceBundle.Selection();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.BundleID }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.BundleID createListOfServiceBundleTypeServiceBundleBundleID() {
        return new ListOfServiceBundleType.ServiceBundle.BundleID();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Query }
     * 
     */
    public PricingParametersNoticeType.Query createPricingParametersNoticeTypeQuery() {
        return new PricingParametersNoticeType.Query();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Results }
     * 
     */
    public PricingParametersNoticeType.Results createPricingParametersNoticeTypeResults() {
        return new PricingParametersNoticeType.Results();
    }

    /**
     * Create an instance of {@link BaggageOfferType.TotalPrice }
     * 
     */
    public BaggageOfferType.TotalPrice createBaggageOfferTypeTotalPrice() {
        return new BaggageOfferType.TotalPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferType.BagDetails.BagDetail.Price }
     * 
     */
    public BaggageOfferType.BagDetails.BagDetail.Price createBaggageOfferTypeBagDetailsBagDetailPrice() {
        return new BaggageOfferType.BagDetails.BagDetail.Price();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType.ResponseID }
     * 
     */
    public ShoppingResponseIDType.ResponseID createShoppingResponseIDTypeResponseID() {
        return new ShoppingResponseIDType.ResponseID();
    }

    /**
     * Create an instance of {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     * 
     */
    public InvGuaranteeType.InvGuaranteeTimeLimit createInvGuaranteeTypeInvGuaranteeTimeLimit() {
        return new InvGuaranteeType.InvGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Surname }
     * 
     */
    public Contacts.Contact.Name.Surname createContactsContactNameSurname() {
        return new Contacts.Contact.Name.Surname();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Given }
     * 
     */
    public Contacts.Contact.Name.Given createContactsContactNameGiven() {
        return new Contacts.Contact.Name.Given();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Middle }
     * 
     */
    public Contacts.Contact.Name.Middle createContactsContactNameMiddle() {
        return new Contacts.Contact.Name.Middle();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType.Airline }
     * 
     */
    public AirlinePreferencesType.Airline createAirlinePreferencesTypeAirline() {
        return new AirlinePreferencesType.Airline();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Sender }
     * 
     */
    public MsgPartiesType.Sender createMsgPartiesTypeSender() {
        return new MsgPartiesType.Sender();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Recipient }
     * 
     */
    public MsgPartiesType.Recipient createMsgPartiesTypeRecipient() {
        return new MsgPartiesType.Recipient();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants.Participant }
     * 
     */
    public MsgPartiesType.Participants.Participant createMsgPartiesTypeParticipantsParticipant() {
        return new MsgPartiesType.Participants.Participant();
    }

    /**
     * Create an instance of {@link OtherOfferType.OfferPrice }
     * 
     */
    public OtherOfferType.OfferPrice createOtherOfferTypeOfferPrice() {
        return new OtherOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link SettlementType.Surcharges }
     * 
     */
    public SettlementType.Surcharges createSettlementTypeSurcharges() {
        return new SettlementType.Surcharges();
    }

    /**
     * Create an instance of {@link SettlementType.Fees }
     * 
     */
    public SettlementType.Fees createSettlementTypeFees() {
        return new SettlementType.Fees();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.StopLocations.StopLocation }
     * 
     */
    public SecurePaymentPaxInfoType.StopLocations.StopLocation createSecurePaymentPaxInfoTypeStopLocationsStopLocation() {
        return new SecurePaymentPaxInfoType.StopLocations.StopLocation();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.DateTimes.DateTime }
     * 
     */
    public SecurePaymentPaxInfoType.DateTimes.DateTime createSecurePaymentPaxInfoTypeDateTimesDateTime() {
        return new SecurePaymentPaxInfoType.DateTimes.DateTime();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.Carriers.Carrier }
     * 
     */
    public SecurePaymentPaxInfoType.Carriers.Carrier createSecurePaymentPaxInfoTypeCarriersCarrier() {
        return new SecurePaymentPaxInfoType.Carriers.Carrier();
    }

    /**
     * Create an instance of {@link EmailType.Address }
     * 
     */
    public EmailType.Address createEmailTypeAddress() {
        return new EmailType.Address();
    }

    /**
     * Create an instance of {@link PersonBudgetType.Amount }
     * 
     */
    public PersonBudgetType.Amount createPersonBudgetTypeAmount() {
        return new PersonBudgetType.Amount();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Query }
     * 
     */
    public ServiceFilterNoticeType.Query createServiceFilterNoticeTypeQuery() {
        return new ServiceFilterNoticeType.Query();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOfferPriceClass() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOfferOtherAssociation() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation();
    }

    /**
     * Create an instance of {@link ListOfClassOfServiceType.ServiceClass }
     * 
     */
    public ListOfClassOfServiceType.ServiceClass createListOfClassOfServiceTypeServiceClass() {
        return new ListOfClassOfServiceType.ServiceClass();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleType.AcceptableVariance createPriceVarianceRuleTypeAcceptableVariance() {
        return new PriceVarianceRuleType.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.Name }
     * 
     */
    public PriceVarianceRuleType.Name createPriceVarianceRuleTypeName() {
        return new PriceVarianceRuleType.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.EffectivePeriod }
     * 
     */
    public PriceVarianceRuleType.EffectivePeriod createPriceVarianceRuleTypeEffectivePeriod() {
        return new PriceVarianceRuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link ServicePriceType.RefundableValue }
     * 
     */
    public ServicePriceType.RefundableValue createServicePriceTypeRefundableValue() {
        return new ServicePriceType.RefundableValue();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.SubTotal }
     * 
     */
    public ServicePriceType.Details.SubTotal createServicePriceTypeDetailsSubTotal() {
        return new ServicePriceType.Details.SubTotal();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.Detail }
     * 
     */
    public ServicePriceType.Details.Detail createServicePriceTypeDetailsDetail() {
        return new ServicePriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link OfferMatchType.MatchResult }
     * 
     */
    public OfferMatchType.MatchResult createOfferMatchTypeMatchResult() {
        return new OfferMatchType.MatchResult();
    }

    /**
     * Create an instance of {@link TotalJourneyType.Distance }
     * 
     */
    public TotalJourneyType.Distance createTotalJourneyTypeDistance() {
        return new TotalJourneyType.Distance();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Exclusion }
     * 
     */
    public FarePreferencesType.Exclusion createFarePreferencesTypeExclusion() {
        return new FarePreferencesType.Exclusion();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs.TicketDesig }
     * 
     */
    public FarePreferencesType.TicketDesigs.TicketDesig createFarePreferencesTypeTicketDesigsTicketDesig() {
        return new FarePreferencesType.TicketDesigs.TicketDesig();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes.Code }
     * 
     */
    public FarePreferencesType.FareCodes.Code createFarePreferencesTypeFareCodesCode() {
        return new FarePreferencesType.FareCodes.Code();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Types.Type }
     * 
     */
    public FarePreferencesType.Types.Type createFarePreferencesTypeTypesType() {
        return new FarePreferencesType.Types.Type();
    }

    /**
     * Create an instance of {@link ListOfBagDisclosureType.BagDisclosure }
     * 
     */
    public ListOfBagDisclosureType.BagDisclosure createListOfBagDisclosureTypeBagDisclosure() {
        return new ListOfBagDisclosureType.BagDisclosure();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType.Alliance }
     * 
     */
    public AlliancePreferencesType.Alliance createAlliancePreferencesTypeAlliance() {
        return new AlliancePreferencesType.Alliance();
    }

    /**
     * Create an instance of {@link ItineraryType.Flight }
     * 
     */
    public ItineraryType.Flight createItineraryTypeFlight() {
        return new ItineraryType.Flight();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType.MaxFlightTime }
     * 
     */
    public FltSegmentMaxTimePreferencesType.MaxFlightTime createFltSegmentMaxTimePreferencesTypeMaxFlightTime() {
        return new FltSegmentMaxTimePreferencesType.MaxFlightTime();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Total }
     * 
     */
    public TaxExemptionType.Total createTaxExemptionTypeTotal() {
        return new TaxExemptionType.Total();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Entities }
     * 
     */
    public TaxExemptionType.Entities createTaxExemptionTypeEntities() {
        return new TaxExemptionType.Entities();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Territories }
     * 
     */
    public TaxExemptionType.Territories createTaxExemptionTypeTerritories() {
        return new TaxExemptionType.Territories();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Countries }
     * 
     */
    public TaxExemptionType.Countries createTaxExemptionTypeCountries() {
        return new TaxExemptionType.Countries();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Tax }
     * 
     */
    public TaxExemptionType.Tax createTaxExemptionTypeTax() {
        return new TaxExemptionType.Tax();
    }

    /**
     * Create an instance of {@link FareFilingType.NUCAmount }
     * 
     */
    public FareFilingType.NUCAmount createFareFilingTypeNUCAmount() {
        return new FareFilingType.NUCAmount();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardNumber }
     * 
     */
    public PaymentCardType.CardNumber createPaymentCardTypeCardNumber() {
        return new PaymentCardType.CardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.SeriesCode }
     * 
     */
    public PaymentCardType.SeriesCode createPaymentCardTypeSeriesCode() {
        return new PaymentCardType.SeriesCode();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderName }
     * 
     */
    public PaymentCardType.CardHolderName createPaymentCardTypeCardHolderName() {
        return new PaymentCardType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderBillingAddress }
     * 
     */
    public PaymentCardType.CardHolderBillingAddress createPaymentCardTypeCardHolderBillingAddress() {
        return new PaymentCardType.CardHolderBillingAddress();
    }

    /**
     * Create an instance of {@link PaymentCardType.MaskedCardNumber }
     * 
     */
    public PaymentCardType.MaskedCardNumber createPaymentCardTypeMaskedCardNumber() {
        return new PaymentCardType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.Surcharge }
     * 
     */
    public PaymentCardType.Surcharge createPaymentCardTypeSurcharge() {
        return new PaymentCardType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardType.EffectiveExpireDate }
     * 
     */
    public PaymentCardType.EffectiveExpireDate createPaymentCardTypeEffectiveExpireDate() {
        return new PaymentCardType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link ListOfMediaType.Media }
     * 
     */
    public ListOfMediaType.Media createListOfMediaTypeMedia() {
        return new ListOfMediaType.Media();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.AllowableBag }
     * 
     */
    public AddlBaggageInfoType.AllowableBag createAddlBaggageInfoTypeAllowableBag() {
        return new AddlBaggageInfoType.AllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.BagCharge }
     * 
     */
    public AddlBaggageInfoType.BagCharge createAddlBaggageInfoTypeBagCharge() {
        return new AddlBaggageInfoType.BagCharge();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnAllowableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnAllowableBag createAddlBaggageInfoTypeCarryOnAllowableBag() {
        return new AddlBaggageInfoType.CarryOnAllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnFree }
     * 
     */
    public AddlBaggageInfoType.CarryOnFree createAddlBaggageInfoTypeCarryOnFree() {
        return new AddlBaggageInfoType.CarryOnFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedFree }
     * 
     */
    public AddlBaggageInfoType.CheckedFree createAddlBaggageInfoTypeCheckedFree() {
        return new AddlBaggageInfoType.CheckedFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag.Embargo createAddlBaggageInfoTypeCheckedChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CheckedChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag.Embargo createAddlBaggageInfoTypeCarryOnChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CarryOnChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link DirectBillMethodType.Address }
     * 
     */
    public DirectBillMethodType.Address createDirectBillMethodTypeAddress() {
        return new DirectBillMethodType.Address();
    }

    /**
     * Create an instance of {@link OrderKeysType.AssociatedIDs.AssociatedID }
     * 
     */
    public OrderKeysType.AssociatedIDs.AssociatedID createOrderKeysTypeAssociatedIDsAssociatedID() {
        return new OrderKeysType.AssociatedIDs.AssociatedID();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.ATPCO }
     * 
     */
    public OfferItemMetadataType.ATPCO createOfferItemMetadataTypeATPCO() {
        return new OfferItemMetadataType.ATPCO();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Incentives }
     * 
     */
    public OfferItemMetadataType.Incentives createOfferItemMetadataTypeIncentives() {
        return new OfferItemMetadataType.Incentives();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Terms }
     * 
     */
    public OfferItemMetadataType.Terms createOfferItemMetadataTypeTerms() {
        return new OfferItemMetadataType.Terms();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.TimeLimits }
     * 
     */
    public OfferItemMetadataType.TimeLimits createOfferItemMetadataTypeTimeLimits() {
        return new OfferItemMetadataType.TimeLimits();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Rule }
     * 
     */
    public OfferItemMetadataType.Rule createOfferItemMetadataTypeRule() {
        return new OfferItemMetadataType.Rule();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Matches.Match }
     * 
     */
    public OfferItemMetadataType.Matches.Match createOfferItemMetadataTypeMatchesMatch() {
        return new OfferItemMetadataType.Matches.Match();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType.FareTariff }
     * 
     */
    public BaggageDetailMetadataType.FareTariff createBaggageDetailMetadataTypeFareTariff() {
        return new BaggageDetailMetadataType.FareTariff();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.MaskedCardNumber }
     * 
     */
    public PaymentCardMethodType.MaskedCardNumber createPaymentCardMethodTypeMaskedCardNumber() {
        return new PaymentCardMethodType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardHolderName }
     * 
     */
    public PaymentCardMethodType.CardHolderName createPaymentCardMethodTypeCardHolderName() {
        return new PaymentCardMethodType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardIssuerName }
     * 
     */
    public PaymentCardMethodType.CardIssuerName createPaymentCardMethodTypeCardIssuerName() {
        return new PaymentCardMethodType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardholderAddress }
     * 
     */
    public PaymentCardMethodType.CardholderAddress createPaymentCardMethodTypeCardholderAddress() {
        return new PaymentCardMethodType.CardholderAddress();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.EffectiveExpireDate }
     * 
     */
    public PaymentCardMethodType.EffectiveExpireDate createPaymentCardMethodTypeEffectiveExpireDate() {
        return new PaymentCardMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link CouponInfoType.SoldAirlineInfo }
     * 
     */
    public CouponInfoType.SoldAirlineInfo createCouponInfoTypeSoldAirlineInfo() {
        return new CouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.PresentInfo }
     * 
     */
    public CouponInfoType.PresentInfo createCouponInfoTypePresentInfo() {
        return new CouponInfoType.PresentInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ReasonForIssuance }
     * 
     */
    public CouponInfoType.ReasonForIssuance createCouponInfoTypeReasonForIssuance() {
        return new CouponInfoType.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link CouponInfoType.FiledFeeInfo }
     * 
     */
    public CouponInfoType.FiledFeeInfo createCouponInfoTypeFiledFeeInfo() {
        return new CouponInfoType.FiledFeeInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ProductCharacteristic }
     * 
     */
    public CouponInfoType.ProductCharacteristic createCouponInfoTypeProductCharacteristic() {
        return new CouponInfoType.ProductCharacteristic();
    }

    /**
     * Create an instance of {@link CouponInfoType.AdditionalServicesInfo }
     * 
     */
    public CouponInfoType.AdditionalServicesInfo createCouponInfoTypeAdditionalServicesInfo() {
        return new CouponInfoType.AdditionalServicesInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ExcessBaggage }
     * 
     */
    public CouponInfoType.ExcessBaggage createCouponInfoTypeExcessBaggage() {
        return new CouponInfoType.ExcessBaggage();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResDesigAirportCityCode }
     * 
     */
    public CouponInfoType.ResDesigAirportCityCode createCouponInfoTypeResDesigAirportCityCode() {
        return new CouponInfoType.ResDesigAirportCityCode();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightDepartureTime }
     * 
     */
    public CouponInfoType.ResFlightDepartureTime createCouponInfoTypeResFlightDepartureTime() {
        return new CouponInfoType.ResFlightDepartureTime();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightNumber }
     * 
     */
    public CouponInfoType.ResFlightNumber createCouponInfoTypeResFlightNumber() {
        return new CouponInfoType.ResFlightNumber();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResOriginAirportCityCode }
     * 
     */
    public CouponInfoType.ResOriginAirportCityCode createCouponInfoTypeResOriginAirportCityCode() {
        return new CouponInfoType.ResOriginAirportCityCode();
    }

    /**
     * Create an instance of {@link GroupBudgetType.Amount }
     * 
     */
    public GroupBudgetType.Amount createGroupBudgetTypeAmount() {
        return new GroupBudgetType.Amount();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType.LocationCode }
     * 
     */
    public FltDepartQualifiedQueryType.LocationCode createFltDepartQualifiedQueryTypeLocationCode() {
        return new FltDepartQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType.LeadPricing }
     * 
     */
    public FltDepartQualifiedQueryType.LeadPricing createFltDepartQualifiedQueryTypeLeadPricing() {
        return new FltDepartQualifiedQueryType.LeadPricing();
    }

    /**
     * Create an instance of {@link FareQualifierType.CompanyIndex }
     * 
     */
    public FareQualifierType.CompanyIndex createFareQualifierTypeCompanyIndex() {
        return new FareQualifierType.CompanyIndex();
    }

    /**
     * Create an instance of {@link FareQualifierType.Contract }
     * 
     */
    public FareQualifierType.Contract createFareQualifierTypeContract() {
        return new FareQualifierType.Contract();
    }

    /**
     * Create an instance of {@link FareQualifierType.Account }
     * 
     */
    public FareQualifierType.Account createFareQualifierTypeAccount() {
        return new FareQualifierType.Account();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.Code }
     * 
     */
    public FlightCOSCoreType.Code createFlightCOSCoreTypeCode() {
        return new FlightCOSCoreType.Code();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.MarketingName }
     * 
     */
    public FlightCOSCoreType.MarketingName createFlightCOSCoreTypeMarketingName() {
        return new FlightCOSCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Query }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Query createPaymentRulesNoticeTypeFormOfPaymentQuery() {
        return new PaymentRulesNoticeType.FormOfPayment.Query();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Results }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Results createPaymentRulesNoticeTypeFormOfPaymentResults() {
        return new PaymentRulesNoticeType.FormOfPayment.Results();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Waiver }
     * 
     */
    public ETFareInfoType.Waiver createETFareInfoTypeWaiver() {
        return new ETFareInfoType.Waiver();
    }

    /**
     * Create an instance of {@link ETFareInfoType.RuleInd }
     * 
     */
    public ETFareInfoType.RuleInd createETFareInfoTypeRuleInd() {
        return new ETFareInfoType.RuleInd();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Detail }
     * 
     */
    public ETFareInfoType.Detail createETFareInfoTypeDetail() {
        return new ETFareInfoType.Detail();
    }

    /**
     * Create an instance of {@link ListOfCarryOnAllowanceType.CarryOnAllowance }
     * 
     */
    public ListOfCarryOnAllowanceType.CarryOnAllowance createListOfCarryOnAllowanceTypeCarryOnAllowance() {
        return new ListOfCarryOnAllowanceType.CarryOnAllowance();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.Certificates.CertificateNumber }
     * 
     */
    public LoyaltyRedemption.Certificates.CertificateNumber createLoyaltyRedemptionCertificatesCertificateNumber() {
        return new LoyaltyRedemption.Certificates.CertificateNumber();
    }

    /**
     * Create an instance of {@link StopLocationType.StopLocation }
     * 
     */
    public StopLocationType.StopLocation createStopLocationTypeStopLocation() {
        return new StopLocationType.StopLocation();
    }

    /**
     * Create an instance of {@link FareList.FareGroup.Fare }
     * 
     */
    public FareList.FareGroup.Fare createFareListFareGroupFare() {
        return new FareList.FareGroup.Fare();
    }

    /**
     * Create an instance of {@link FareList.FareGroup.FareBasisCode }
     * 
     */
    public FareList.FareGroup.FareBasisCode createFareListFareGroupFareBasisCode() {
        return new FareList.FareGroup.FareBasisCode();
    }

    /**
     * Create an instance of {@link CampaignReferralType.Localization }
     * 
     */
    public CampaignReferralType.Localization createCampaignReferralTypeLocalization() {
        return new CampaignReferralType.Localization();
    }

    /**
     * Create an instance of {@link CampaignReferralType.UTM.OtherUTMs }
     * 
     */
    public CampaignReferralType.UTM.OtherUTMs createCampaignReferralTypeUTMOtherUTMs() {
        return new CampaignReferralType.UTM.OtherUTMs();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType.BilateralTimeLimit }
     * 
     */
    public BilateralTimeLimitsType.BilateralTimeLimit createBilateralTimeLimitsTypeBilateralTimeLimit() {
        return new BilateralTimeLimitsType.BilateralTimeLimit();
    }

    /**
     * Create an instance of {@link AddressCoreType.Address }
     * 
     */
    public AddressCoreType.Address createAddressCoreTypeAddress() {
        return new AddressCoreType.Address();
    }

    /**
     * Create an instance of {@link AddressMetadataType.AddressFields.FieldName }
     * 
     */
    public AddressMetadataType.AddressFields.FieldName createAddressMetadataTypeAddressFieldsFieldName() {
        return new AddressMetadataType.AddressFields.FieldName();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Associations }
     * 
     */
    public ServiceQualifierPriceType.Associations createServiceQualifierPriceTypeAssociations() {
        return new ServiceQualifierPriceType.Associations();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.Location }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.Location createServiceQualifierPriceTypeFulfillmentLocation() {
        return new ServiceQualifierPriceType.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start createServiceQualifierPriceTypeFulfillmentOfferValidDatesStart() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.End }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.End createServiceQualifierPriceTypeFulfillmentOfferValidDatesEnd() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link DirectionsType.Text }
     * 
     */
    public DirectionsType.Text createDirectionsTypeText() {
        return new DirectionsType.Text();
    }

    /**
     * Create an instance of {@link WingPositionType.Rows }
     * 
     */
    public WingPositionType.Rows createWingPositionTypeRows() {
        return new WingPositionType.Rows();
    }

    /**
     * Create an instance of {@link ListOfBagAllowanceType.CheckedBagAllowance }
     * 
     */
    public ListOfBagAllowanceType.CheckedBagAllowance createListOfBagAllowanceTypeCheckedBagAllowance() {
        return new ListOfBagAllowanceType.CheckedBagAllowance();
    }

    /**
     * Create an instance of {@link FareComponentType.Parameters }
     * 
     */
    public FareComponentType.Parameters createFareComponentTypeParameters() {
        return new FareComponentType.Parameters();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceBreakdown }
     * 
     */
    public FareComponentType.PriceBreakdown createFareComponentTypePriceBreakdown() {
        return new FareComponentType.PriceBreakdown();
    }

    /**
     * Create an instance of {@link FareComponentType.FareBasis }
     * 
     */
    public FareComponentType.FareBasis createFareComponentTypeFareBasis() {
        return new FareComponentType.FareBasis();
    }

    /**
     * Create an instance of {@link FlightArrivalType.AirportCode }
     * 
     */
    public FlightArrivalType.AirportCode createFlightArrivalTypeAirportCode() {
        return new FlightArrivalType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightArrivalType.Terminal }
     * 
     */
    public FlightArrivalType.Terminal createFlightArrivalTypeTerminal() {
        return new FlightArrivalType.Terminal();
    }

    /**
     * Create an instance of {@link ListOfOfferPenaltyType.Penalty }
     * 
     */
    public ListOfOfferPenaltyType.Penalty createListOfOfferPenaltyTypePenalty() {
        return new ListOfOfferPenaltyType.Penalty();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows.First }
     * 
     */
    public ExitPositionType.Rows.First createExitPositionTypeRowsFirst() {
        return new ExitPositionType.Rows.First();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows.Last }
     * 
     */
    public ExitPositionType.Rows.Last createExitPositionTypeRowsLast() {
        return new ExitPositionType.Rows.Last();
    }

    /**
     * Create an instance of {@link ServiceDetailType.Detail }
     * 
     */
    public ServiceDetailType.Detail createServiceDetailTypeDetail() {
        return new ServiceDetailType.Detail();
    }

    /**
     * Create an instance of {@link BankAccountMethodType.Name }
     * 
     */
    public BankAccountMethodType.Name createBankAccountMethodTypeName() {
        return new BankAccountMethodType.Name();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristics.Characteristic }
     * 
     */
    public SeatLocationType.Characteristics.Characteristic createSeatLocationTypeCharacteristicsCharacteristic() {
        return new SeatLocationType.Characteristics.Characteristic();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row.SeatData }
     * 
     */
    public SeatLocationType.Row.SeatData createSeatLocationTypeRowSeatData() {
        return new SeatLocationType.Row.SeatData();
    }

    /**
     * Create an instance of {@link GenericPriceType.Surcharges }
     * 
     */
    public GenericPriceType.Surcharges createGenericPriceTypeSurcharges() {
        return new GenericPriceType.Surcharges();
    }

    /**
     * Create an instance of {@link GenericPriceType.Fees }
     * 
     */
    public GenericPriceType.Fees createGenericPriceTypeFees() {
        return new GenericPriceType.Fees();
    }

    /**
     * Create an instance of {@link GenericPriceType.Total }
     * 
     */
    public GenericPriceType.Total createGenericPriceTypeTotal() {
        return new GenericPriceType.Total();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails.BagDetail.Price }
     * 
     */
    public BaggageItemType.BagDetails.BagDetail.Price createBaggageItemTypeBagDetailsBagDetailPrice() {
        return new BaggageItemType.BagDetails.BagDetail.Price();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers.AlternateOffer createInvDiscrepencyAlertTypeAlternateOffersAlternateOffer() {
        return new InvDiscrepencyAlertType.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType.PriceClass }
     * 
     */
    public PricedFlightOfferAssocType.PriceClass createPricedFlightOfferAssocTypePriceClass() {
        return new PricedFlightOfferAssocType.PriceClass();
    }

    /**
     * Create an instance of {@link SeatOfferType.OfferPrice }
     * 
     */
    public SeatOfferType.OfferPrice createSeatOfferTypeOfferPrice() {
        return new SeatOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.OtherLanguage }
     * 
     */
    public CodesetMetadataType.OtherLanguage createCodesetMetadataTypeOtherLanguage() {
        return new CodesetMetadataType.OtherLanguage();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source.OwnerID }
     * 
     */
    public CodesetMetadataType.Source.OwnerID createCodesetMetadataTypeSourceOwnerID() {
        return new CodesetMetadataType.Source.OwnerID();
    }

    /**
     * Create an instance of {@link OtherOfferAssocType.OtherAssociation }
     * 
     */
    public OtherOfferAssocType.OtherAssociation createOtherOfferAssocTypeOtherAssociation() {
        return new OtherOfferAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link MediaAssocType.MediaItems }
     * 
     */
    public MediaAssocType.MediaItems createMediaAssocTypeMediaItems() {
        return new MediaAssocType.MediaItems();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.Services.Service }
     * 
     */
    public OfferAssociationsType.Services.Service createOfferAssociationsTypeServicesService() {
        return new OfferAssociationsType.Services.Service();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.Surcharge }
     * 
     */
    public PaymentCardMetadataType.Surcharge createPaymentCardMetadataTypeSurcharge() {
        return new PaymentCardMetadataType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.CardFields.FieldName }
     * 
     */
    public PaymentCardMetadataType.CardFields.FieldName createPaymentCardMetadataTypeCardFieldsFieldName() {
        return new PaymentCardMetadataType.CardFields.FieldName();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.PassengerQuantity }
     * 
     */
    public AirlineOffersSnapshotType.PassengerQuantity createAirlineOffersSnapshotTypePassengerQuantity() {
        return new AirlineOffersSnapshotType.PassengerQuantity();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.SubTotal }
     * 
     */
    public AirlineOffersSnapshotType.SubTotal createAirlineOffersSnapshotTypeSubTotal() {
        return new AirlineOffersSnapshotType.SubTotal();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Highest }
     * 
     */
    public AirlineOffersSnapshotType.Highest createAirlineOffersSnapshotTypeHighest() {
        return new AirlineOffersSnapshotType.Highest();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Lowest }
     * 
     */
    public AirlineOffersSnapshotType.Lowest createAirlineOffersSnapshotTypeLowest() {
        return new AirlineOffersSnapshotType.Lowest();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.MemberNumber }
     * 
     */
    public RedemptionMethodType.MemberNumber createRedemptionMethodTypeMemberNumber() {
        return new RedemptionMethodType.MemberNumber();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.Certificates.CertificateNumber }
     * 
     */
    public RedemptionMethodType.Certificates.CertificateNumber createRedemptionMethodTypeCertificatesCertificateNumber() {
        return new RedemptionMethodType.Certificates.CertificateNumber();
    }

    /**
     * Create an instance of {@link RuleType.Value }
     * 
     */
    public RuleType.Value createRuleTypeValue() {
        return new RuleType.Value();
    }

    /**
     * Create an instance of {@link RuleType.Name }
     * 
     */
    public RuleType.Name createRuleTypeName() {
        return new RuleType.Name();
    }

    /**
     * Create an instance of {@link RuleType.EffectivePeriod }
     * 
     */
    public RuleType.EffectivePeriod createRuleTypeEffectivePeriod() {
        return new RuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link BankAccountType.Name }
     * 
     */
    public BankAccountType.Name createBankAccountTypeName() {
        return new BankAccountType.Name();
    }

    /**
     * Create an instance of {@link BankAccountType.BankID }
     * 
     */
    public BankAccountType.BankID createBankAccountTypeBankID() {
        return new BankAccountType.BankID();
    }

    /**
     * Create an instance of {@link BankAccountType.AccountNumber }
     * 
     */
    public BankAccountType.AccountNumber createBankAccountTypeAccountNumber() {
        return new BankAccountType.AccountNumber();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName createPrePaidProgramQualifierPrepaidProgramDetailProgramName() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Holder createPrePaidProgramQualifierPrepaidProgramDetailHolder() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Holder();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number createPrePaidProgramQualifierPrepaidProgramDetailCertificateNumber() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod createPrePaidProgramQualifierPrepaidProgramDetailCertificateEffectivePeriod() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod();
    }

    /**
     * Create an instance of {@link ListOfDisclosureType.Disclosures }
     * 
     */
    public ListOfDisclosureType.Disclosures createListOfDisclosureTypeDisclosures() {
        return new ListOfDisclosureType.Disclosures();
    }

    /**
     * Create an instance of {@link AirportMetadataType.Directions }
     * 
     */
    public AirportMetadataType.Directions createAirportMetadataTypeDirections() {
        return new AirportMetadataType.Directions();
    }

    /**
     * Create an instance of {@link AddressDetailType.Directions }
     * 
     */
    public AddressDetailType.Directions createAddressDetailTypeDirections() {
        return new AddressDetailType.Directions();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial.Currency }
     * 
     */
    public CombinationPriceType.Partial.Currency createCombinationPriceTypePartialCurrency() {
        return new CombinationPriceType.Partial.Currency();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Passengers }
     * 
     */
    public OrderItemAssociationType.Passengers createOrderItemAssociationTypePassengers() {
        return new OrderItemAssociationType.Passengers();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Flight }
     * 
     */
    public OrderItemAssociationType.Flight createOrderItemAssociationTypeFlight() {
        return new OrderItemAssociationType.Flight();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.OrderItems }
     * 
     */
    public OrderItemAssociationType.OrderItems createOrderItemAssociationTypeOrderItems() {
        return new OrderItemAssociationType.OrderItems();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.OfferItems }
     * 
     */
    public OrderItemAssociationType.OfferItems createOrderItemAssociationTypeOfferItems() {
        return new OrderItemAssociationType.OfferItems();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Services }
     * 
     */
    public OrderItemAssociationType.Services createOrderItemAssociationTypeServices() {
        return new OrderItemAssociationType.Services();
    }

    /**
     * Create an instance of {@link RuleMetadataType.RuleID }
     * 
     */
    public RuleMetadataType.RuleID createRuleMetadataTypeRuleID() {
        return new RuleMetadataType.RuleID();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Status }
     * 
     */
    public RuleMetadataType.Status createRuleMetadataTypeStatus() {
        return new RuleMetadataType.Status();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values.Value.Instruction }
     * 
     */
    public RuleMetadataType.Values.Value.Instruction createRuleMetadataTypeValuesValueInstruction() {
        return new RuleMetadataType.Values.Value.Instruction();
    }

    /**
     * Create an instance of {@link CashMethodType.Address }
     * 
     */
    public CashMethodType.Address createCashMethodTypeAddress() {
        return new CashMethodType.Address();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType.EquivID }
     * 
     */
    public EquivalentIDMetadataType.EquivID createEquivalentIDMetadataTypeEquivID() {
        return new EquivalentIDMetadataType.EquivID();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MaxLinear }
     * 
     */
    public BagAllowanceDimensionType.MaxLinear createBagAllowanceDimensionTypeMaxLinear() {
        return new BagAllowanceDimensionType.MaxLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MinLinear }
     * 
     */
    public BagAllowanceDimensionType.MinLinear createBagAllowanceDimensionTypeMinLinear() {
        return new BagAllowanceDimensionType.MinLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.Dimensions }
     * 
     */
    public BagAllowanceDimensionType.Dimensions createBagAllowanceDimensionTypeDimensions() {
        return new BagAllowanceDimensionType.Dimensions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SegmentKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSegmentKey(String value) {
        return new JAXBElement<String>(_SegmentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TourCode")
    public JAXBElement<String> createTourCode(String value) {
        return new JAXBElement<String>(_TourCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ORA_Recipient")
    public JAXBElement<ORAAirlineRecipientType> createORARecipient(ORAAirlineRecipientType value) {
        return new JAXBElement<ORAAirlineRecipientType>(_ORARecipient_QNAME, ORAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "VoucherMethod")
    public JAXBElement<VoucherMethodType> createVoucherMethod(VoucherMethodType value) {
        return new JAXBElement<VoucherMethodType>(_VoucherMethod_QNAME, VoucherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferPenaltyMetadata")
    public JAXBElement<PenaltyMetadataType> createOfferPenaltyMetadata(PenaltyMetadataType value) {
        return new JAXBElement<PenaltyMetadataType>(_OfferPenaltyMetadata_QNAME, PenaltyMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DetailCurrencyPrice")
    public JAXBElement<DetailCurrencyPriceType> createDetailCurrencyPrice(DetailCurrencyPriceType value) {
        return new JAXBElement<DetailCurrencyPriceType>(_DetailCurrencyPrice_QNAME, DetailCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InstructionsList")
    public JAXBElement<ListOfOfferInstructionsType> createInstructionsList(ListOfOfferInstructionsType value) {
        return new JAXBElement<ListOfOfferInstructionsType>(_InstructionsList_QNAME, ListOfOfferInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TransferPreferences")
    public JAXBElement<TransferPreferencesType> createTransferPreferences(TransferPreferencesType value) {
        return new JAXBElement<TransferPreferencesType>(_TransferPreferences_QNAME, TransferPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CountryMetadata")
    public JAXBElement<CountryMetadataType> createCountryMetadata(CountryMetadataType value) {
        return new JAXBElement<CountryMetadataType>(_CountryMetadata_QNAME, CountryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfSaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PointOfSale")
    public JAXBElement<PointOfSaleType> createPointOfSale(PointOfSaleType value) {
        return new JAXBElement<PointOfSaleType>(_PointOfSale_QNAME, PointOfSaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EnabledSystemRecipient")
    public JAXBElement<EnabledSysRecipientType> createEnabledSystemRecipient(EnabledSysRecipientType value) {
        return new JAXBElement<EnabledSysRecipientType>(_EnabledSystemRecipient_QNAME, EnabledSysRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCardQualifiers")
    public JAXBElement<CardQualifierType> createPaymentCardQualifiers(CardQualifierType value) {
        return new JAXBElement<CardQualifierType>(_PaymentCardQualifiers_QNAME, CardQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQualiferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SocialMediaQualifiers")
    public JAXBElement<SocialQualiferType> createSocialMediaQualifiers(SocialQualiferType value) {
        return new JAXBElement<SocialQualiferType>(_SocialMediaQualifiers_QNAME, SocialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareRuleCategory")
    public JAXBElement<String> createFareRuleCategory(String value) {
        return new JAXBElement<String>(_FareRuleCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TravelAgencyParticipant")
    public JAXBElement<TravelAgencyParticipantType> createTravelAgencyParticipant(TravelAgencyParticipantType value) {
        return new JAXBElement<TravelAgencyParticipantType>(_TravelAgencyParticipant_QNAME, TravelAgencyParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Direction")
    public JAXBElement<DirectionsType> createDirection(DirectionsType value) {
        return new JAXBElement<DirectionsType>(_Direction_QNAME, DirectionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ReferencePointDeparture")
    public JAXBElement<AffinityReferencePointDepartType> createReferencePointDeparture(AffinityReferencePointDepartType value) {
        return new JAXBElement<AffinityReferencePointDepartType>(_ReferencePointDeparture_QNAME, AffinityReferencePointDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StateProvArrival")
    public JAXBElement<AffinityStateProvArriveType> createStateProvArrival(AffinityStateProvArriveType value) {
        return new JAXBElement<AffinityStateProvArriveType>(_StateProvArrival_QNAME, AffinityStateProvArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceGuaranteeTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PriceGuaranteeTimeLimits")
    public JAXBElement<PriceGuaranteeTimeLimitType> createPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        return new JAXBElement<PriceGuaranteeTimeLimitType>(_PriceGuaranteeTimeLimits_QNAME, PriceGuaranteeTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherItem")
    public JAXBElement<OtherItemType> createOtherItem(OtherItemType value) {
        return new JAXBElement<OtherItemType>(_OtherItem_QNAME, OtherItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlownAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createFlownAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_FlownAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierFeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CarrierFeeInfo")
    public JAXBElement<CarrierFeeInfoType> createCarrierFeeInfo(CarrierFeeInfoType value) {
        return new JAXBElement<CarrierFeeInfoType>(_CarrierFeeInfo_QNAME, CarrierFeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CountryArrival")
    public JAXBElement<AffinityCountryArriveType> createCountryArrival(AffinityCountryArriveType value) {
        return new JAXBElement<AffinityCountryArriveType>(_CountryArrival_QNAME, AffinityCountryArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelTimePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TripTime")
    public JAXBElement<TravelTimePreferencesType> createTripTime(TravelTimePreferencesType value) {
        return new JAXBElement<TravelTimePreferencesType>(_TripTime_QNAME, TravelTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferItemMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferMetadata")
    public JAXBElement<OfferItemMetadataType> createOfferMetadata(OfferItemMetadataType value) {
        return new JAXBElement<OfferItemMetadataType>(_OfferMetadata_QNAME, OfferItemMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINAuthTravelerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PIN_AuthenticationAlert")
    public JAXBElement<PINAuthTravelerType> createPINAuthenticationAlert(PINAuthTravelerType value) {
        return new JAXBElement<PINAuthTravelerType>(_PINAuthenticationAlert_QNAME, PINAuthTravelerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderPenalty")
    public JAXBElement<OrderPenaltyType> createOrderPenalty(OrderPenaltyType value) {
        return new JAXBElement<OrderPenaltyType>(_OrderPenalty_QNAME, OrderPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DisclosureMetadata")
    public JAXBElement<DisclosureMetadataType> createDisclosureMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DisclosureMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ORA_Sender")
    public JAXBElement<ORAAirlineSenderType> createORASender(ORAAirlineSenderType value) {
        return new JAXBElement<ORAAirlineSenderType>(_ORASender_QNAME, ORAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DirectBillMethod")
    public JAXBElement<DirectBillMethodType> createDirectBillMethod(DirectBillMethodType value) {
        return new JAXBElement<DirectBillMethodType>(_DirectBillMethod_QNAME, DirectBillMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EnabledSystemParticipant")
    public JAXBElement<EnabledSysParticipantType> createEnabledSystemParticipant(EnabledSysParticipantType value) {
        return new JAXBElement<EnabledSysParticipantType>(_EnabledSystemParticipant_QNAME, EnabledSysParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ValidatingCarrier")
    public JAXBElement<String> createValidatingCarrier(String value) {
        return new JAXBElement<String>(_ValidatingCarrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareBasisCode")
    public JAXBElement<FareBasisCodeType> createFareBasisCode(FareBasisCodeType value) {
        return new JAXBElement<FareBasisCodeType>(_FareBasisCode_QNAME, FareBasisCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgencyID")
    public JAXBElement<AgencyIDType> createAgencyID(AgencyIDType value) {
        return new JAXBElement<AgencyIDType>(_AgencyID_QNAME, AgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ItineraryMetadata")
    public JAXBElement<ItineraryMetadataType> createItineraryMetadata(ItineraryMetadataType value) {
        return new JAXBElement<ItineraryMetadataType>(_ItineraryMetadata_QNAME, ItineraryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Aggregator")
    public JAXBElement<AggregatorType> createAggregator(AggregatorType value) {
        return new JAXBElement<AggregatorType>(_Aggregator_QNAME, AggregatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatReference")
    @XmlIDREF
    public JAXBElement<Object> createSeatReference(Object value) {
        return new JAXBElement<Object>(_SeatReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripPurposeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TripPurposeQualifier")
    public JAXBElement<TripPurposeListType> createTripPurposeQualifier(TripPurposeListType value) {
        return new JAXBElement<TripPurposeListType>(_TripPurposeQualifier_QNAME, TripPurposeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltOtherOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AltOtherOffer")
    public JAXBElement<AltOtherOfferType> createAltOtherOffer(AltOtherOfferType value) {
        return new JAXBElement<AltOtherOfferType>(_AltOtherOffer_QNAME, AltOtherOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddlReferenceID")
    public JAXBElement<AdditionalReferenceType> createAddlReferenceID(AdditionalReferenceType value) {
        return new JAXBElement<AdditionalReferenceType>(_AddlReferenceID_QNAME, AdditionalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyAugmentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PolicyAugmentation")
    public JAXBElement<PolicyAugmentationType> createPolicyAugmentation(PolicyAugmentationType value) {
        return new JAXBElement<PolicyAugmentationType>(_PolicyAugmentation_QNAME, PolicyAugmentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Day")
    public JAXBElement<DayRepType> createDay(DayRepType value) {
        return new JAXBElement<DayRepType>(_Day_QNAME, DayRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PassengerReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createPassengerReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_PassengerReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignReferralType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CampaignReferral")
    public JAXBElement<CampaignReferralType> createCampaignReferral(CampaignReferralType value) {
        return new JAXBElement<CampaignReferralType>(_CampaignReferral_QNAME, CampaignReferralType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ItemStatus")
    public JAXBElement<String> createItemStatus(String value) {
        return new JAXBElement<String>(_ItemStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AircraftMetadata")
    public JAXBElement<AircraftMetadataType> createAircraftMetadata(AircraftMetadataType value) {
        return new JAXBElement<AircraftMetadataType>(_AircraftMetadata_QNAME, AircraftMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferPenaltyReferences")
    @XmlIDREF
    public JAXBElement<Object> createOfferPenaltyReferences(Object value) {
        return new JAXBElement<Object>(_OfferPenaltyReferences_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StopLocations")
    public JAXBElement<StopLocationType> createStopLocations(StopLocationType value) {
        return new JAXBElement<StopLocationType>(_StopLocations_QNAME, StopLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketByTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TicketByTimeLimit")
    public JAXBElement<TicketByTimeLimitType> createTicketByTimeLimit(TicketByTimeLimitType value) {
        return new JAXBElement<TicketByTimeLimitType>(_TicketByTimeLimit_QNAME, TicketByTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EnabledSystemSender")
    public JAXBElement<EnabledSysSenderType> createEnabledSystemSender(EnabledSysSenderType value) {
        return new JAXBElement<EnabledSysSenderType>(_EnabledSystemSender_QNAME, EnabledSysSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCarryOnAllowanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CarryOnAllowanceList")
    public JAXBElement<ListOfCarryOnAllowanceType> createCarryOnAllowanceList(ListOfCarryOnAllowanceType value) {
        return new JAXBElement<ListOfCarryOnAllowanceType>(_CarryOnAllowanceList_QNAME, ListOfCarryOnAllowanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DateTime")
    public JAXBElement<DateTimeRepType> createDateTime(DateTimeRepType value) {
        return new JAXBElement<DateTimeRepType>(_DateTime_QNAME, DateTimeRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETFareInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareInfo")
    public JAXBElement<ETFareInfoType> createFareInfo(ETFareInfoType value) {
        return new JAXBElement<ETFareInfoType>(_FareInfo_QNAME, ETFareInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialQualiferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SpecialNeedQualifiers")
    public JAXBElement<SpecialQualiferType> createSpecialNeedQualifiers(SpecialQualiferType value) {
        return new JAXBElement<SpecialQualiferType>(_SpecialNeedQualifiers_QNAME, SpecialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightDistance")
    public JAXBElement<FlightDistanceType> createFlightDistance(FlightDistanceType value) {
        return new JAXBElement<FlightDistanceType>(_FlightDistance_QNAME, FlightDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MediaGroupreference")
    @XmlIDREF
    public JAXBElement<Object> createMediaGroupreference(Object value) {
        return new JAXBElement<Object>(_MediaGroupreference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRulesNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentRulesNotice")
    public JAXBElement<PaymentRulesNoticeType> createPaymentRulesNotice(PaymentRulesNoticeType value) {
        return new JAXBElement<PaymentRulesNoticeType>(_PaymentRulesNotice_QNAME, PaymentRulesNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirlineOfferSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAirlineOfferSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AirlineOfferSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMapMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatMapMetadata")
    public JAXBElement<SeatMapMetadataType> createSeatMapMetadata(SeatMapMetadataType value) {
        return new JAXBElement<SeatMapMetadataType>(_SeatMapMetadata_QNAME, SeatMapMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CurrencyAmountValue")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmountValue(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmountValue_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DepartureDate")
    public JAXBElement<XMLGregorianCalendar> createDepartureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AggregatorSender")
    public JAXBElement<AggregatorSenderType> createAggregatorSender(AggregatorSenderType value) {
        return new JAXBElement<AggregatorSenderType>(_AggregatorSender_QNAME, AggregatorSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OriginDestinationReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOriginDestinationReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OriginDestinationReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CheckedBagReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createCheckedBagReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_CheckedBagReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentTimeLimit")
    public JAXBElement<PaymentTimeLimitType> createPaymentTimeLimit(PaymentTimeLimitType value) {
        return new JAXBElement<PaymentTimeLimitType>(_PaymentTimeLimit_QNAME, PaymentTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CabinPreferences")
    public JAXBElement<CabinPreferencesType> createCabinPreferences(CabinPreferencesType value) {
        return new JAXBElement<CabinPreferencesType>(_CabinPreferences_QNAME, CabinPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfContentSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ContentSourceList")
    public JAXBElement<ListOfContentSourceType> createContentSourceList(ListOfContentSourceType value) {
        return new JAXBElement<ListOfContentSourceType>(_ContentSourceList_QNAME, ListOfContentSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FreeFormTextInstruction")
    public JAXBElement<FreeFormInstructionsType> createFreeFormTextInstruction(FreeFormInstructionsType value) {
        return new JAXBElement<FreeFormInstructionsType>(_FreeFormTextInstruction_QNAME, FreeFormInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "LanguageMetadata")
    public JAXBElement<LanguageMetadataType> createLanguageMetadata(LanguageMetadataType value) {
        return new JAXBElement<LanguageMetadataType>(_LanguageMetadata_QNAME, LanguageMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TimePeriod")
    public JAXBElement<TimePeriodRepType> createTimePeriod(TimePeriodRepType value) {
        return new JAXBElement<TimePeriodRepType>(_TimePeriod_QNAME, TimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageDisclosureMetadata")
    public JAXBElement<BaggageDisclosureMetadataType> createBaggageDisclosureMetadata(BaggageDisclosureMetadataType value) {
        return new JAXBElement<BaggageDisclosureMetadataType>(_BaggageDisclosureMetadata_QNAME, BaggageDisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirportCityDeparture")
    public JAXBElement<FltDepartQualifiedQueryType> createAirportCityDeparture(FltDepartQualifiedQueryType value) {
        return new JAXBElement<FltDepartQualifiedQueryType>(_AirportCityDeparture_QNAME, FltDepartQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderCommision")
    public JAXBElement<OrderCommissionType> createOrderCommision(OrderCommissionType value) {
        return new JAXBElement<OrderCommissionType>(_OrderCommision_QNAME, OrderCommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "POA_Participant")
    public JAXBElement<POAAirlineParticipantType> createPOAParticipant(POAAirlineParticipantType value) {
        return new JAXBElement<POAAirlineParticipantType>(_POAParticipant_QNAME, POAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightItem")
    public JAXBElement<FlightItemType> createFlightItem(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_FlightItem_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AllowanceDescription")
    public JAXBElement<BagAllowanceDescType> createAllowanceDescription(BagAllowanceDescType value) {
        return new JAXBElement<BagAllowanceDescType>(_AllowanceDescription_QNAME, BagAllowanceDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OperatingCarrierParticipant")
    public JAXBElement<OperatingCarrierParticipantType> createOperatingCarrierParticipant(OperatingCarrierParticipantType value) {
        return new JAXBElement<OperatingCarrierParticipantType>(_OperatingCarrierParticipant_QNAME, OperatingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PriceMetadata")
    public JAXBElement<PriceMetadataType> createPriceMetadata(PriceMetadataType value) {
        return new JAXBElement<PriceMetadataType>(_PriceMetadata_QNAME, PriceMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DescriptionMetadata")
    public JAXBElement<DescriptionMetadataType> createDescriptionMetadata(DescriptionMetadataType value) {
        return new JAXBElement<DescriptionMetadataType>(_DescriptionMetadata_QNAME, DescriptionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailerIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RetailerID")
    public JAXBElement<RetailerIDType> createRetailerID(RetailerIDType value) {
        return new JAXBElement<RetailerIDType>(_RetailerID_QNAME, RetailerIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupBudgetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "GroupBudget")
    public JAXBElement<GroupBudgetType> createGroupBudget(GroupBudgetType value) {
        return new JAXBElement<GroupBudgetType>(_GroupBudget_QNAME, GroupBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CouponInfo")
    public JAXBElement<CouponInfoType> createCouponInfo(CouponInfoType value) {
        return new JAXBElement<CouponInfoType>(_CouponInfo_QNAME, CouponInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SimpleCurrencyPrice")
    public JAXBElement<SimpleCurrencyPriceType> createSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
        return new JAXBElement<SimpleCurrencyPriceType>(_SimpleCurrencyPrice_QNAME, SimpleCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCardMethod")
    public JAXBElement<PaymentCardMethodType> createPaymentCardMethod(PaymentCardMethodType value) {
        return new JAXBElement<PaymentCardMethodType>(_PaymentCardMethod_QNAME, PaymentCardMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOrderKey(String value) {
        return new JAXBElement<String>(_OrderKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceFilter")
    public JAXBElement<Object> createServiceFilter(Object value) {
        return new JAXBElement<Object>(_ServiceFilter_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RetailPartnerSender")
    public JAXBElement<RetailSupplierSenderType> createRetailPartnerSender(RetailSupplierSenderType value) {
        return new JAXBElement<RetailSupplierSenderType>(_RetailPartnerSender_QNAME, RetailSupplierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MarketingCarrierParticipant")
    public JAXBElement<MarketingCarrierParticipantType> createMarketingCarrierParticipant(MarketingCarrierParticipantType value) {
        return new JAXBElement<MarketingCarrierParticipantType>(_MarketingCarrierParticipant_QNAME, MarketingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DayPeriod")
    public JAXBElement<DayPeriodRepType> createDayPeriod(DayPeriodRepType value) {
        return new JAXBElement<DayPeriodRepType>(_DayPeriod_QNAME, DayPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "QuarterPeriod")
    public JAXBElement<QuarterPeriodRepType> createQuarterPeriod(QuarterPeriodRepType value) {
        return new JAXBElement<QuarterPeriodRepType>(_QuarterPeriod_QNAME, QuarterPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggagePricingQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggagePricingQualifier")
    public JAXBElement<BaggagePricingQualifierType> createBaggagePricingQualifier(BaggagePricingQualifierType value) {
        return new JAXBElement<BaggagePricingQualifierType>(_BaggagePricingQualifier_QNAME, BaggagePricingQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DisclosureKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createDisclosureKey(String value) {
        return new JAXBElement<String>(_DisclosureKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Match")
    public JAXBElement<OfferMatchType> createMatch(OfferMatchType value) {
        return new JAXBElement<OfferMatchType>(_Match_QNAME, OfferMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightSegmentType")
    public JAXBElement<String> createFlightSegmentType(String value) {
        return new JAXBElement<String>(_FlightSegmentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurePaymentAlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SecurePaymentAlert")
    public JAXBElement<SecurePaymentAlertType> createSecurePaymentAlert(SecurePaymentAlertType value) {
        return new JAXBElement<SecurePaymentAlertType>(_SecurePaymentAlert_QNAME, SecurePaymentAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderReference")
    @XmlIDREF
    public JAXBElement<Object> createOrderReference(Object value) {
        return new JAXBElement<Object>(_OrderReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AwardPricing")
    public JAXBElement<AwardPriceUnitType> createAwardPricing(AwardPriceUnitType value) {
        return new JAXBElement<AwardPriceUnitType>(_AwardPricing_QNAME, AwardPriceUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "YearPeriod")
    public JAXBElement<YearPeriodRepType> createYearPeriod(YearPeriodRepType value) {
        return new JAXBElement<YearPeriodRepType>(_YearPeriod_QNAME, YearPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CountryDeparture")
    public JAXBElement<AffinityCountryDepartType> createCountryDeparture(AffinityCountryDepartType value) {
        return new JAXBElement<AffinityCountryDepartType>(_CountryDeparture_QNAME, AffinityCountryDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServicePrice")
    public JAXBElement<ServicePriceType> createServicePrice(ServicePriceType value) {
        return new JAXBElement<ServicePriceType>(_ServicePrice_QNAME, ServicePriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgentUserSender")
    public JAXBElement<AgentUserSenderType> createAgentUserSender(AgentUserSenderType value) {
        return new JAXBElement<AgentUserSenderType>(_AgentUserSender_QNAME, AgentUserSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PassengerMetadata")
    public JAXBElement<PassengerMetadataType> createPassengerMetadata(PassengerMetadataType value) {
        return new JAXBElement<PassengerMetadataType>(_PassengerMetadata_QNAME, PassengerMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentFormMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentFormMetadata")
    public JAXBElement<PaymentFormMetadataType> createPaymentFormMetadata(PaymentFormMetadataType value) {
        return new JAXBElement<PaymentFormMetadataType>(_PaymentFormMetadata_QNAME, PaymentFormMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfClassOfServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ClassOfServiceList")
    public JAXBElement<ListOfClassOfServiceType> createClassOfServiceList(ListOfClassOfServiceType value) {
        return new JAXBElement<ListOfClassOfServiceType>(_ClassOfServiceList_QNAME, ListOfClassOfServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createFareReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_FareReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AssociatedService")
    public JAXBElement<ServiceInfoAssocType> createAssociatedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_AssociatedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AircraftCabin")
    public JAXBElement<String> createAircraftCabin(String value) {
        return new JAXBElement<String>(_AircraftCabin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareRules")
    public JAXBElement<FareRulesType> createFareRules(FareRulesType value) {
        return new JAXBElement<FareRulesType>(_FareRules_QNAME, FareRulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferInstructionMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferInstructionMetadata")
    public JAXBElement<OfferInstructionMetadataType> createOfferInstructionMetadata(OfferInstructionMetadataType value) {
        return new JAXBElement<OfferInstructionMetadataType>(_OfferInstructionMetadata_QNAME, OfferInstructionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFilterNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceFilterNotice")
    public JAXBElement<ServiceFilterNoticeType> createServiceFilterNotice(ServiceFilterNoticeType value) {
        return new JAXBElement<ServiceFilterNoticeType>(_ServiceFilterNotice_QNAME, ServiceFilterNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TermsList")
    public JAXBElement<ListOfOfferTermsType> createTermsList(ListOfOfferTermsType value) {
        return new JAXBElement<ListOfOfferTermsType>(_TermsList_QNAME, ListOfOfferTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltArriveQualifiedQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirportCityArrival")
    public JAXBElement<FltArriveQualifiedQueryType> createAirportCityArrival(FltArriveQualifiedQueryType value) {
        return new JAXBElement<FltArriveQualifiedQueryType>(_AirportCityArrival_QNAME, FltArriveQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgentUserRecipient")
    public JAXBElement<AgentUserRecipientType> createAgentUserRecipient(AgentUserRecipientType value) {
        return new JAXBElement<AgentUserRecipientType>(_AgentUserRecipient_QNAME, AgentUserRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Total")
    public JAXBElement<TotalFareTransactionType> createTotal(TotalFareTransactionType value) {
        return new JAXBElement<TotalFareTransactionType>(_Total_QNAME, TotalFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceItemQuantityRules")
    public JAXBElement<ServiceItemQuantityType> createServiceItemQuantityRules(ServiceItemQuantityType value) {
        return new JAXBElement<ServiceItemQuantityType>(_ServiceItemQuantityRules_QNAME, ServiceItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MediaMetadata")
    public JAXBElement<MediaMetadataType> createMediaMetadata(MediaMetadataType value) {
        return new JAXBElement<MediaMetadataType>(_MediaMetadata_QNAME, MediaMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherOfferAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherAssociation")
    public JAXBElement<OtherOfferAssocType> createOtherAssociation(OtherOfferAssocType value) {
        return new JAXBElement<OtherOfferAssocType>(_OtherAssociation_QNAME, OtherOfferAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonBudgetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PerPersonBudget")
    public JAXBElement<PersonBudgetType> createPerPersonBudget(PersonBudgetType value) {
        return new JAXBElement<PersonBudgetType>(_PerPersonBudget_QNAME, PersonBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceCoupon")
    public JAXBElement<ServiceCouponType> createServiceCoupon(ServiceCouponType value) {
        return new JAXBElement<ServiceCouponType>(_ServiceCoupon_QNAME, ServiceCouponType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MediaList")
    public JAXBElement<ListOfMediaType> createMediaList(ListOfMediaType value) {
        return new JAXBElement<ListOfMediaType>(_MediaList_QNAME, ListOfMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PhoneContact")
    public JAXBElement<PhoneContactType> createPhoneContact(PhoneContactType value) {
        return new JAXBElement<PhoneContactType>(_PhoneContact_QNAME, PhoneContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressMetadata")
    public JAXBElement<AddressMetadataType> createAddressMetadata(AddressMetadataType value) {
        return new JAXBElement<AddressMetadataType>(_AddressMetadata_QNAME, AddressMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MediaItemReference")
    @XmlIDREF
    public JAXBElement<Object> createMediaItemReference(Object value) {
        return new JAXBElement<Object>(_MediaItemReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCard")
    public JAXBElement<PaymentCardType> createPaymentCard(PaymentCardType value) {
        return new JAXBElement<PaymentCardType>(_PaymentCard_QNAME, PaymentCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightDuration")
    public JAXBElement<FlightDurationType> createFlightDuration(FlightDurationType value) {
        return new JAXBElement<FlightDurationType>(_FlightDuration_QNAME, FlightDurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Attributes")
    public JAXBElement<AttributesType> createAttributes(AttributesType value) {
        return new JAXBElement<AttributesType>(_Attributes_QNAME, AttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TicketDocQuantity")
    public JAXBElement<BigInteger> createTicketDocQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TicketDocQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaseFare")
    public JAXBElement<BaseFareTransactionType> createBaseFare(BaseFareTransactionType value) {
        return new JAXBElement<BaseFareTransactionType>(_BaseFare_QNAME, BaseFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltSegmentMaxTimePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SegMaxTimePreferences")
    public JAXBElement<FltSegmentMaxTimePreferencesType> createSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
        return new JAXBElement<FltSegmentMaxTimePreferencesType>(_SegMaxTimePreferences_QNAME, FltSegmentMaxTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencySenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TravelAgencySender")
    public JAXBElement<TravelAgencySenderType> createTravelAgencySender(TravelAgencySenderType value) {
        return new JAXBElement<TravelAgencySenderType>(_TravelAgencySender_QNAME, TravelAgencySenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MetadataKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createMetadataKey(String value) {
        return new JAXBElement<String>(_MetadataKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderID")
    public JAXBElement<OrderIDType> createOrderID(OrderIDType value) {
        return new JAXBElement<OrderIDType>(_OrderID_QNAME, OrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StateProvMetadata")
    public JAXBElement<StateProvMetadataType> createStateProvMetadata(StateProvMetadataType value) {
        return new JAXBElement<StateProvMetadataType>(_StateProvMetadata_QNAME, StateProvMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatData")
    public JAXBElement<SeatDataType> createSeatData(SeatDataType value) {
        return new JAXBElement<SeatDataType>(_SeatData_QNAME, SeatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherFulfillmentLocation")
    public JAXBElement<SrvcLocationAddressType> createOtherFulfillmentLocation(SrvcLocationAddressType value) {
        return new JAXBElement<SrvcLocationAddressType>(_OtherFulfillmentLocation_QNAME, SrvcLocationAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareFiledIn")
    public JAXBElement<FareFilingType> createFareFiledIn(FareFilingType value) {
        return new JAXBElement<FareFilingType>(_FareFiledIn_QNAME, FareFilingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DirectBill")
    public JAXBElement<DirectBillType> createDirectBill(DirectBillType value) {
        return new JAXBElement<DirectBillType>(_DirectBill_QNAME, DirectBillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TicketDesig")
    public JAXBElement<TicketDesignatorType> createTicketDesig(TicketDesignatorType value) {
        return new JAXBElement<TicketDesignatorType>(_TicketDesig_QNAME, TicketDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCarryOnMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CarryOnBagMetadata")
    public JAXBElement<BaggageCarryOnMetadataType> createCarryOnBagMetadata(BaggageCarryOnMetadataType value) {
        return new JAXBElement<BaggageCarryOnMetadataType>(_CarryOnBagMetadata_QNAME, BaggageCarryOnMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OriginDestinationReference")
    @XmlIDREF
    public JAXBElement<Object> createOriginDestinationReference(Object value) {
        return new JAXBElement<Object>(_OriginDestinationReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Itinerary")
    public JAXBElement<ItineraryType> createItinerary(ItineraryType value) {
        return new JAXBElement<ItineraryType>(_Itinerary_QNAME, ItineraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TaxExemptionNotice")
    public JAXBElement<TaxExemptionNoticeType> createTaxExemptionNotice(TaxExemptionNoticeType value) {
        return new JAXBElement<TaxExemptionNoticeType>(_TaxExemptionNotice_QNAME, TaxExemptionNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EncodedCurrencyAmount")
    public JAXBElement<CurrencyAmountEncodedType> createEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
        return new JAXBElement<CurrencyAmountEncodedType>(_EncodedCurrencyAmount_QNAME, CurrencyAmountEncodedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PassengerReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createPassengerReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_PassengerReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentStatus")
    public JAXBElement<PaymentStatusType> createPaymentStatus(PaymentStatusType value) {
        return new JAXBElement<PaymentStatusType>(_PaymentStatus_QNAME, PaymentStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCardMetadata")
    public JAXBElement<PaymentCardMetadataType> createPaymentCardMetadata(PaymentCardMetadataType value) {
        return new JAXBElement<PaymentCardMetadataType>(_PaymentCardMetadata_QNAME, PaymentCardMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlliancePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AlliancePreferences")
    public JAXBElement<AlliancePreferencesType> createAlliancePreferences(AlliancePreferencesType value) {
        return new JAXBElement<AlliancePreferencesType>(_AlliancePreferences_QNAME, AlliancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MonthPeriod")
    public JAXBElement<MonthPeriodRepType> createMonthPeriod(MonthPeriodRepType value) {
        return new JAXBElement<MonthPeriodRepType>(_MonthPeriod_QNAME, MonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PolicyLink")
    public JAXBElement<String> createPolicyLink(String value) {
        return new JAXBElement<String>(_PolicyLink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Device")
    public JAXBElement<DeviceType> createDevice(DeviceType value) {
        return new JAXBElement<DeviceType>(_Device_QNAME, DeviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PartnerID")
    public JAXBElement<PartnerCompanyIDType> createPartnerID(PartnerCompanyIDType value) {
        return new JAXBElement<PartnerCompanyIDType>(_PartnerID_QNAME, PartnerCompanyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MarketingCarrierSender")
    public JAXBElement<MarketingCarrierSenderType> createMarketingCarrierSender(MarketingCarrierSenderType value) {
        return new JAXBElement<MarketingCarrierSenderType>(_MarketingCarrierSender_QNAME, MarketingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CityName")
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentAddress")
    public JAXBElement<PaymentAddrType> createPaymentAddress(PaymentAddrType value) {
        return new JAXBElement<PaymentAddrType>(_PaymentAddress_QNAME, PaymentAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "YearMonthPeriod")
    public JAXBElement<YearMonthPeriodRepType> createYearMonthPeriod(YearMonthPeriodRepType value) {
        return new JAXBElement<YearMonthPeriodRepType>(_YearMonthPeriod_QNAME, YearMonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceID")
    public JAXBElement<ServiceIDType> createServiceID(ServiceIDType value) {
        return new JAXBElement<ServiceIDType>(_ServiceID_QNAME, ServiceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CurrencyAmount")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodePathType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "NodePath")
    public JAXBElement<NodePathType> createNodePath(NodePathType value) {
        return new JAXBElement<NodePathType>(_NodePath_QNAME, NodePathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Errors")
    public JAXBElement<ErrorsType> createErrors(ErrorsType value) {
        return new JAXBElement<ErrorsType>(_Errors_QNAME, ErrorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AugPointInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AugmentationPoint")
    public JAXBElement<AugPointInfoType> createAugmentationPoint(AugPointInfoType value) {
        return new JAXBElement<AugPointInfoType>(_AugmentationPoint_QNAME, AugPointInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfBagDisclosureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BagDisclosureList")
    public JAXBElement<ListOfBagDisclosureType> createBagDisclosureList(ListOfBagDisclosureType value) {
        return new JAXBElement<ListOfBagDisclosureType>(_BagDisclosureList_QNAME, ListOfBagDisclosureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FarePreferences")
    public JAXBElement<FarePreferencesType> createFarePreferences(FarePreferencesType value) {
        return new JAXBElement<FarePreferencesType>(_FarePreferences_QNAME, FarePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CurrentAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCurrentAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CurrentAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalJourneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TotalJourney")
    public JAXBElement<TotalJourneyType> createTotalJourney(TotalJourneyType value) {
        return new JAXBElement<TotalJourneyType>(_TotalJourney_QNAME, TotalJourneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DatePeriod")
    public JAXBElement<DatePeriodRepType> createDatePeriod(DatePeriodRepType value) {
        return new JAXBElement<DatePeriodRepType>(_DatePeriod_QNAME, DatePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentMethod")
    public JAXBElement<PaymentMethodType> createPaymentMethod(PaymentMethodType value) {
        return new JAXBElement<PaymentMethodType>(_PaymentMethod_QNAME, PaymentMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PriceClassReference")
    @XmlIDREF
    public JAXBElement<Object> createPriceClassReference(Object value) {
        return new JAXBElement<Object>(_PriceClassReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceFulfillment")
    public JAXBElement<ServiceFulfillmentType> createServiceFulfillment(ServiceFulfillmentType value) {
        return new JAXBElement<ServiceFulfillmentType>(_ServiceFulfillment_QNAME, ServiceFulfillmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Alerts")
    public JAXBElement<AlertsType> createAlerts(AlertsType value) {
        return new JAXBElement<AlertsType>(_Alerts_QNAME, AlertsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderItemID")
    public JAXBElement<ItemIDType> createOrderItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OrderItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherOffer")
    public JAXBElement<OtherOfferType> createOtherOffer(OtherOfferType value) {
        return new JAXBElement<OtherOfferType>(_OtherOffer_QNAME, OtherOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirportFulfillmentLocation")
    public JAXBElement<SrvcLocationAirportType> createAirportFulfillmentLocation(SrvcLocationAirportType value) {
        return new JAXBElement<SrvcLocationAirportType>(_AirportFulfillmentLocation_QNAME, SrvcLocationAirportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DescriptionReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createDescriptionReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_DescriptionReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnstructuredFareCalcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "UnstructuredFareCalcInfo")
    public JAXBElement<UnstructuredFareCalcType> createUnstructuredFareCalcInfo(UnstructuredFareCalcType value) {
        return new JAXBElement<UnstructuredFareCalcType>(_UnstructuredFareCalcInfo_QNAME, UnstructuredFareCalcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CheckedInAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCheckedInAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CheckedInAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AssociatedPassenger")
    public JAXBElement<PassengerInfoAssocType> createAssociatedPassenger(PassengerInfoAssocType value) {
        return new JAXBElement<PassengerInfoAssocType>(_AssociatedPassenger_QNAME, PassengerInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferItemID")
    public JAXBElement<ItemIDType> createOfferItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OfferItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponFlightSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightSegment")
    public JAXBElement<CouponFlightSegmentType> createFlightSegment(CouponFlightSegmentType value) {
        return new JAXBElement<CouponFlightSegmentType>(_FlightSegment_QNAME, CouponFlightSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressDetail")
    public JAXBElement<AddressDetailType> createAddressDetail(AddressDetailType value) {
        return new JAXBElement<AddressDetailType>(_AddressDetail_QNAME, AddressDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Party")
    public JAXBElement<MsgPartiesType> createParty(MsgPartiesType value) {
        return new JAXBElement<MsgPartiesType>(_Party_QNAME, MsgPartiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltSeatOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AltSeatOffer")
    public JAXBElement<AltSeatOfferType> createAltSeatOffer(AltSeatOfferType value) {
        return new JAXBElement<AltSeatOfferType>(_AltSeatOffer_QNAME, AltSeatOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderKeys")
    public JAXBElement<OrderKeysType> createOrderKeys(OrderKeysType value) {
        return new JAXBElement<OrderKeysType>(_OrderKeys_QNAME, OrderKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AggregatorRecipient")
    public JAXBElement<AggregatorRecipientType> createAggregatorRecipient(AggregatorRecipientType value) {
        return new JAXBElement<AggregatorRecipientType>(_AggregatorRecipient_QNAME, AggregatorRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptedPaymentFormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentForm")
    public JAXBElement<AcceptedPaymentFormType> createPaymentForm(AcceptedPaymentFormType value) {
        return new JAXBElement<AcceptedPaymentFormType>(_PaymentForm_QNAME, AcceptedPaymentFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareCode")
    public JAXBElement<String> createFareCode(String value) {
        return new JAXBElement<String>(_FareCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirportMetadata")
    public JAXBElement<AirportMetadataType> createAirportMetadata(AirportMetadataType value) {
        return new JAXBElement<AirportMetadataType>(_AirportMetadata_QNAME, AirportMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgentUser")
    public JAXBElement<AgentUserType> createAgentUser(AgentUserType value) {
        return new JAXBElement<AgentUserType>(_AgentUser_QNAME, AgentUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareInd")
    public JAXBElement<String> createFareInd(String value) {
        return new JAXBElement<String>(_FareInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlinePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirlinePreferences")
    public JAXBElement<AirlinePreferencesType> createAirlinePreferences(AirlinePreferencesType value) {
        return new JAXBElement<AirlinePreferencesType>(_AirlinePreferences_QNAME, AirlinePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RetailSupplierParticipant")
    public JAXBElement<RetailSupplierParticipantType> createRetailSupplierParticipant(RetailSupplierParticipantType value) {
        return new JAXBElement<RetailSupplierParticipantType>(_RetailSupplierParticipant_QNAME, RetailSupplierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfDisclosureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DisclosureList")
    public JAXBElement<ListOfDisclosureType> createDisclosureList(ListOfDisclosureType value) {
        return new JAXBElement<ListOfDisclosureType>(_DisclosureList_QNAME, ListOfDisclosureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createServiceReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ServiceReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelDistancePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TripDistance")
    public JAXBElement<TravelDistancePreferencesType> createTripDistance(TravelDistancePreferencesType value) {
        return new JAXBElement<TravelDistancePreferencesType>(_TripDistance_QNAME, TravelDistancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PenaltyMetadata")
    public JAXBElement<PenaltyMetadataType> createPenaltyMetadata(PenaltyMetadataType value) {
        return new JAXBElement<PenaltyMetadataType>(_PenaltyMetadata_QNAME, PenaltyMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AggregatorParticipant")
    public JAXBElement<AggregatorParticipantType> createAggregatorParticipant(AggregatorParticipantType value) {
        return new JAXBElement<AggregatorParticipantType>(_AggregatorParticipant_QNAME, AggregatorParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RFIC")
    public JAXBElement<String> createRFIC(String value) {
        return new JAXBElement<String>(_RFIC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BankAccount")
    public JAXBElement<BankAccountType> createBankAccount(BankAccountType value) {
        return new JAXBElement<BankAccountType>(_BankAccount_QNAME, BankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderAssociations")
    public JAXBElement<OrderItemAssociationType> createOrderAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_OrderAssociations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Fare")
    public JAXBElement<FareType> createFare(FareType value) {
        return new JAXBElement<FareType>(_Fare_QNAME, FareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RedemptionMethod")
    public JAXBElement<RedemptionMethodType> createRedemptionMethod(RedemptionMethodType value) {
        return new JAXBElement<RedemptionMethodType>(_RedemptionMethod_QNAME, RedemptionMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadDatePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "LeadDatePeriod")
    public JAXBElement<LeadDatePeriodType> createLeadDatePeriod(LeadDatePeriodType value) {
        return new JAXBElement<LeadDatePeriodType>(_LeadDatePeriod_QNAME, LeadDatePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RetailPartnerRecipient")
    public JAXBElement<RetailSupplierRecipientType> createRetailPartnerRecipient(RetailSupplierRecipientType value) {
        return new JAXBElement<RetailSupplierRecipientType>(_RetailPartnerRecipient_QNAME, RetailSupplierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOfferReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OfferReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferDetailInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferDetailAssociation")
    public JAXBElement<OfferDetailInfoAssocType> createOfferDetailAssociation(OfferDetailInfoAssocType value) {
        return new JAXBElement<OfferDetailInfoAssocType>(_OfferDetailAssociation_QNAME, OfferDetailInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Year")
    public JAXBElement<YearRepType> createYear(YearRepType value) {
        return new JAXBElement<YearRepType>(_Year_QNAME, YearRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InventoryGuarantee")
    public JAXBElement<InvGuaranteeType> createInventoryGuarantee(InvGuaranteeType value) {
        return new JAXBElement<InvGuaranteeType>(_InventoryGuarantee_QNAME, InvGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AllOffersSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAllOffersSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AllOffersSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "POA_Recipient")
    public JAXBElement<POAAirlineRecipientType> createPOARecipient(POAAirlineRecipientType value) {
        return new JAXBElement<POAAirlineRecipientType>(_POARecipient_QNAME, POAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Frequency")
    public JAXBElement<FlightFrequencyType> createFrequency(FlightFrequencyType value) {
        return new JAXBElement<FlightFrequencyType>(_Frequency_QNAME, FlightFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PhoneNumber")
    public JAXBElement<PhoneType> createPhoneNumber(PhoneType value) {
        return new JAXBElement<PhoneType>(_PhoneNumber_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ShoppingResponseID")
    public JAXBElement<ShoppingResponseIDType> createShoppingResponseID(ShoppingResponseIDType value) {
        return new JAXBElement<ShoppingResponseIDType>(_ShoppingResponseID_QNAME, ShoppingResponseIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "GroupReference")
    @XmlIDREF
    public JAXBElement<Object> createGroupReference(Object value) {
        return new JAXBElement<Object>(_GroupReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageOffer")
    public JAXBElement<BaggageOfferType> createBaggageOffer(BaggageOfferType value) {
        return new JAXBElement<BaggageOfferType>(_BaggageOffer_QNAME, BaggageOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EquivalentID_Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createEquivalentIDKey(String value) {
        return new JAXBElement<String>(_EquivalentIDKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AggregatorID")
    public JAXBElement<AggregatorIDType> createAggregatorID(AggregatorIDType value) {
        return new JAXBElement<AggregatorIDType>(_AggregatorID_QNAME, AggregatorIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "POA_Sender")
    public JAXBElement<POAAirlineSenderType> createPOASender(POAAirlineSenderType value) {
        return new JAXBElement<POAAirlineSenderType>(_POASender_QNAME, POAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SystemID")
    public JAXBElement<SystemIDType> createSystemID(SystemIDType value) {
        return new JAXBElement<SystemIDType>(_SystemID_QNAME, SystemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DimensionAllowance")
    public JAXBElement<BagAllowanceDimensionType> createDimensionAllowance(BagAllowanceDimensionType value) {
        return new JAXBElement<BagAllowanceDimensionType>(_DimensionAllowance_QNAME, BagAllowanceDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ORA_Participant")
    public JAXBElement<ORAAirlineParticipantType> createORAParticipant(ORAAirlineParticipantType value) {
        return new JAXBElement<ORAAirlineParticipantType>(_ORAParticipant_QNAME, ORAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DetailedFlightItem")
    public JAXBElement<FlightItemType> createDetailedFlightItem(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_DetailedFlightItem_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Document")
    public JAXBElement<MsgDocumentType> createDocument(MsgDocumentType value) {
        return new JAXBElement<MsgDocumentType>(_Document_QNAME, MsgDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Month")
    public JAXBElement<MonthRepType> createMonth(MonthRepType value) {
        return new JAXBElement<MonthRepType>(_Month_QNAME, MonthRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EmailContact")
    public JAXBElement<EmailType> createEmailContact(EmailType value) {
        return new JAXBElement<EmailType>(_EmailContact_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StayPeriodDateRange")
    public JAXBElement<StayPeriodDateRangeType> createStayPeriodDateRange(StayPeriodDateRangeType value) {
        return new JAXBElement<StayPeriodDateRangeType>(_StayPeriodDateRange_QNAME, StayPeriodDateRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightStatus")
    public JAXBElement<String> createFlightStatus(String value) {
        return new JAXBElement<String>(_FlightStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CashMethod")
    public JAXBElement<CashMethodType> createCashMethod(CashMethodType value) {
        return new JAXBElement<CashMethodType>(_CashMethod_QNAME, CashMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InConnectionWithType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InConnectionWithInfo")
    public JAXBElement<InConnectionWithType> createInConnectionWithInfo(InConnectionWithType value) {
        return new JAXBElement<InConnectionWithType>(_InConnectionWithInfo_QNAME, InConnectionWithType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CodesetMetadata")
    public JAXBElement<CodesetMetadataType> createCodesetMetadata(CodesetMetadataType value) {
        return new JAXBElement<CodesetMetadataType>(_CodesetMetadata_QNAME, CodesetMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RuleMetadata")
    public JAXBElement<RuleMetadataType> createRuleMetadata(RuleMetadataType value) {
        return new JAXBElement<RuleMetadataType>(_RuleMetadata_QNAME, RuleMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "IncludedService")
    public JAXBElement<ServiceInfoAssocType> createIncludedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_IncludedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTCQuantityPricedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PTC_Priced")
    public JAXBElement<PTCQuantityPricedType> createPTCPriced(PTCQuantityPricedType value) {
        return new JAXBElement<PTCQuantityPricedType>(_PTCPriced_QNAME, PTCQuantityPricedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MarketingCarrierRecipient")
    public JAXBElement<MarketingCarrierRecipientType> createMarketingCarrierRecipient(MarketingCarrierRecipientType value) {
        return new JAXBElement<MarketingCarrierRecipientType>(_MarketingCarrierRecipient_QNAME, MarketingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DiscountPercent")
    public JAXBElement<Integer> createDiscountPercent(Integer value) {
        return new JAXBElement<Integer>(_DiscountPercent_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltPricedFlightOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AltPricedFlightOffer")
    public JAXBElement<AltPricedFlightOfferType> createAltPricedFlightOffer(AltPricedFlightOfferType value) {
        return new JAXBElement<AltPricedFlightOfferType>(_AltPricedFlightOffer_QNAME, AltPricedFlightOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Status")
    public JAXBElement<CodesetType> createStatus(CodesetType value) {
        return new JAXBElement<CodesetType>(_Status_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltBaggageOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AltBaggageOffer")
    public JAXBElement<AltBaggageOfferType> createAltBaggageOffer(AltBaggageOfferType value) {
        return new JAXBElement<AltBaggageOfferType>(_AltBaggageOffer_QNAME, AltBaggageOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressContact")
    public JAXBElement<AddressContactType> createAddressContact(AddressContactType value) {
        return new JAXBElement<AddressContactType>(_AddressContact_QNAME, AddressContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareTextInd")
    public JAXBElement<String> createFareTextInd(String value) {
        return new JAXBElement<String>(_FareTextInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareBasisCityPair")
    public JAXBElement<String> createFareBasisCityPair(String value) {
        return new JAXBElement<String>(_FareBasisCityPair_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CityMetadata")
    public JAXBElement<CityMetadataType> createCityMetadata(CityMetadataType value) {
        return new JAXBElement<CityMetadataType>(_CityMetadata_QNAME, CityMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ZoneMetadata")
    public JAXBElement<ZoneMetadataType> createZoneMetadata(ZoneMetadataType value) {
        return new JAXBElement<ZoneMetadataType>(_ZoneMetadata_QNAME, ZoneMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StructuredAddress")
    public JAXBElement<StructuredAddrType> createStructuredAddress(StructuredAddrType value) {
        return new JAXBElement<StructuredAddrType>(_StructuredAddress_QNAME, StructuredAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgentUserID")
    public JAXBElement<AgentUserIDType> createAgentUserID(AgentUserIDType value) {
        return new JAXBElement<AgentUserIDType>(_AgentUserID_QNAME, AgentUserIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DateTimePeriod")
    public JAXBElement<DateTimePeriodRepType> createDateTimePeriod(DateTimePeriodRepType value) {
        return new JAXBElement<DateTimePeriodRepType>(_DateTimePeriod_QNAME, DateTimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Associations")
    public JAXBElement<OrderItemAssociationType> createAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_Associations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DiscountAmount")
    public JAXBElement<CurrencyAmountOptType> createDiscountAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_DiscountAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferInstructionReferences")
    @XmlIDREF
    public JAXBElement<Object> createOfferInstructionReferences(Object value) {
        return new JAXBElement<Object>(_OfferInstructionReferences_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CombinationPricing")
    public JAXBElement<CombinationPriceType> createCombinationPricing(CombinationPriceType value) {
        return new JAXBElement<CombinationPriceType>(_CombinationPricing_QNAME, CombinationPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ContactMetadata")
    public JAXBElement<ContactMetadataType> createContactMetadata(ContactMetadataType value) {
        return new JAXBElement<ContactMetadataType>(_ContactMetadata_QNAME, ContactMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OperatingCarrierRecipient")
    public JAXBElement<OperatingCarrierRecipientType> createOperatingCarrierRecipient(OperatingCarrierRecipientType value) {
        return new JAXBElement<OperatingCarrierRecipientType>(_OperatingCarrierRecipient_QNAME, OperatingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodSeasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StayPeriodSeason")
    public JAXBElement<StayPeriodSeasonType> createStayPeriodSeason(StayPeriodSeasonType value) {
        return new JAXBElement<StayPeriodSeasonType>(_StayPeriodSeason_QNAME, StayPeriodSeasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfBagAllowanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CheckedBagAllowanceList")
    public JAXBElement<ListOfBagAllowanceType> createCheckedBagAllowanceList(ListOfBagAllowanceType value) {
        return new JAXBElement<ListOfBagAllowanceType>(_CheckedBagAllowanceList_QNAME, ListOfBagAllowanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatMetadata")
    public JAXBElement<SeatMetadataType> createSeatMetadata(SeatMetadataType value) {
        return new JAXBElement<SeatMetadataType>(_SeatMetadata_QNAME, SeatMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfPriceClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PriceClassList")
    public JAXBElement<ListOfPriceClassType> createPriceClassList(ListOfPriceClassType value) {
        return new JAXBElement<ListOfPriceClassType>(_PriceClassList_QNAME, ListOfPriceClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WingPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "WingPosition")
    public JAXBElement<WingPositionType> createWingPosition(WingPositionType value) {
        return new JAXBElement<WingPositionType>(_WingPosition_QNAME, WingPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DirectionMetadata")
    public JAXBElement<DirectionsMetadataType> createDirectionMetadata(DirectionsMetadataType value) {
        return new JAXBElement<DirectionsMetadataType>(_DirectionMetadata_QNAME, DirectionsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQualifierPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceQualifier")
    public JAXBElement<ServiceQualifierPriceType> createServiceQualifier(ServiceQualifierPriceType value) {
        return new JAXBElement<ServiceQualifierPriceType>(_ServiceQualifier_QNAME, ServiceQualifierPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PercentageValue")
    public JAXBElement<BigDecimal> createPercentageValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentageValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ClassOfService")
    public JAXBElement<FlightCOSCoreType> createClassOfService(FlightCOSCoreType value) {
        return new JAXBElement<FlightCOSCoreType>(_ClassOfService_QNAME, FlightCOSCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SpecialFareQualifiers")
    public JAXBElement<FareQualifierType> createSpecialFareQualifiers(FareQualifierType value) {
        return new JAXBElement<FareQualifierType>(_SpecialFareQualifiers_QNAME, FareQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageItem")
    public JAXBElement<BaggageItemType> createBaggageItem(BaggageItemType value) {
        return new JAXBElement<BaggageItemType>(_BaggageItem_QNAME, BaggageItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ListKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createListKey(String value) {
        return new JAXBElement<String>(_ListKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StateProvDeparture")
    public JAXBElement<AffinityStateProvDepartType> createStateProvDeparture(AffinityStateProvDepartType value) {
        return new JAXBElement<AffinityStateProvDepartType>(_StateProvDeparture_QNAME, AffinityStateProvDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareDetail")
    public JAXBElement<FareDetailType> createFareDetail(FareDetailType value) {
        return new JAXBElement<FareDetailType>(_FareDetail_QNAME, FareDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InstantPurchase")
    public JAXBElement<String> createInstantPurchase(String value) {
        return new JAXBElement<String>(_InstantPurchase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OperatingCarrierSender")
    public JAXBElement<OperatingCarrierSenderType> createOperatingCarrierSender(OperatingCarrierSenderType value) {
        return new JAXBElement<OperatingCarrierSenderType>(_OperatingCarrierSender_QNAME, OperatingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressCore")
    public JAXBElement<AddressCoreType> createAddressCore(AddressCoreType value) {
        return new JAXBElement<AddressCoreType>(_AddressCore_QNAME, AddressCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivalentIDMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EquivalentID_Metadata")
    public JAXBElement<EquivalentIDMetadataType> createEquivalentIDMetadata(EquivalentIDMetadataType value) {
        return new JAXBElement<EquivalentIDMetadataType>(_EquivalentIDMetadata_QNAME, EquivalentIDMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadTimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "LeadTimePeriod")
    public JAXBElement<LeadTimePeriodType> createLeadTimePeriod(LeadTimePeriodType value) {
        return new JAXBElement<LeadTimePeriodType>(_LeadTimePeriod_QNAME, LeadTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherMethod")
    public JAXBElement<OtherMethodType> createOtherMethod(OtherMethodType value) {
        return new JAXBElement<OtherMethodType>(_OtherMethod_QNAME, OtherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherContactMethod")
    public JAXBElement<OtherContactMethodType> createOtherContactMethod(OtherContactMethodType value) {
        return new JAXBElement<OtherContactMethodType>(_OtherContactMethod_QNAME, OtherContactMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferTermsMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferTermsMetadata")
    public JAXBElement<OfferTermsMetadataType> createOfferTermsMetadata(OfferTermsMetadataType value) {
        return new JAXBElement<OfferTermsMetadataType>(_OfferTermsMetadata_QNAME, OfferTermsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StateCode")
    public JAXBElement<StateProvCodeType> createStateCode(StateProvCodeType value) {
        return new JAXBElement<StateProvCodeType>(_StateCode_QNAME, StateProvCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TravelAgencyRecipient")
    public JAXBElement<TravelAgencyRecipientType> createTravelAgencyRecipient(TravelAgencyRecipientType value) {
        return new JAXBElement<TravelAgencyRecipientType>(_TravelAgencyRecipient_QNAME, TravelAgencyRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCheckedMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CheckedBagMetadata")
    public JAXBElement<BaggageCheckedMetadataType> createCheckedBagMetadata(BaggageCheckedMetadataType value) {
        return new JAXBElement<BaggageCheckedMetadataType>(_CheckedBagMetadata_QNAME, BaggageCheckedMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TaxExemption")
    public JAXBElement<TaxExemptionType> createTaxExemption(TaxExemptionType value) {
        return new JAXBElement<TaxExemptionType>(_TaxExemption_QNAME, TaxExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Penalty")
    public JAXBElement<PenaltyDetailType> createPenalty(PenaltyDetailType value) {
        return new JAXBElement<PenaltyDetailType>(_Penalty_QNAME, PenaltyDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyDefaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DefaultPolicy")
    public JAXBElement<PolicyDefaultType> createDefaultPolicy(PolicyDefaultType value) {
        return new JAXBElement<PolicyDefaultType>(_DefaultPolicy_QNAME, PolicyDefaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InventoryGuaranteeNotif")
    public JAXBElement<InvGuaranteeNoticeType> createInventoryGuaranteeNotif(InvGuaranteeNoticeType value) {
        return new JAXBElement<InvGuaranteeNoticeType>(_InventoryGuaranteeNotif_QNAME, InvGuaranteeNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferClassUpgradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ClassOfServiceUpgrade")
    public JAXBElement<OfferClassUpgradeType> createClassOfServiceUpgrade(OfferClassUpgradeType value) {
        return new JAXBElement<OfferClassUpgradeType>(_ClassOfServiceUpgrade_QNAME, OfferClassUpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CarryOnReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createCarryOnReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_CarryOnReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Equipment")
    public JAXBElement<AircraftSummaryType> createEquipment(AircraftSummaryType value) {
        return new JAXBElement<AircraftSummaryType>(_Equipment_QNAME, AircraftSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DiscountProgramQualifier")
    public JAXBElement<DiscountProgramType> createDiscountProgramQualifier(DiscountProgramType value) {
        return new JAXBElement<DiscountProgramType>(_DiscountProgramQualifier_QNAME, DiscountProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BagDisclosureKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createBagDisclosureKey(String value) {
        return new JAXBElement<String>(_BagDisclosureKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Alert")
    public JAXBElement<AlertType> createAlert(AlertType value) {
        return new JAXBElement<AlertType>(_Alert_QNAME, AlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestPricingPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PricingMethodPreference")
    public JAXBElement<BestPricingPreferencesType> createPricingMethodPreference(BestPricingPreferencesType value) {
        return new JAXBElement<BestPricingPreferencesType>(_PricingMethodPreference_QNAME, BestPricingPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MediaAttachment")
    public JAXBElement<MediaAttachmentType> createMediaAttachment(MediaAttachmentType value) {
        return new JAXBElement<MediaAttachmentType>(_MediaAttachment_QNAME, MediaAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ReferencePointArrival")
    public JAXBElement<AffinityReferencePointArriveType> createReferencePointArrival(AffinityReferencePointArriveType value) {
        return new JAXBElement<AffinityReferencePointArriveType>(_ReferencePointArrival_QNAME, AffinityReferencePointArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageQueryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageQueryMetadata")
    public JAXBElement<BaggageQueryMetadataType> createBaggageQueryMetadata(BaggageQueryMetadataType value) {
        return new JAXBElement<BaggageQueryMetadataType>(_BaggageQueryMetadata_QNAME, BaggageQueryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDetailMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageDetailMetadata")
    public JAXBElement<BaggageDetailMetadataType> createBaggageDetailMetadata(BaggageDetailMetadataType value) {
        return new JAXBElement<BaggageDetailMetadataType>(_BaggageDetailMetadata_QNAME, BaggageDetailMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingParametersNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PricingParametersNotice")
    public JAXBElement<PricingParametersNoticeType> createPricingParametersNotice(PricingParametersNoticeType value) {
        return new JAXBElement<PricingParametersNoticeType>(_PricingParametersNotice_QNAME, PricingParametersNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferTermReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOfferTermReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OfferTermReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatOffer")
    public JAXBElement<SeatOfferType> createSeatOffer(SeatOfferType value) {
        return new JAXBElement<SeatOfferType>(_SeatOffer_QNAME, SeatOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Commission")
    public JAXBElement<CommissionType> createCommission(CommissionType value) {
        return new JAXBElement<CommissionType>(_Commission_QNAME, CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "LanguageCode")
    public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
        return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Remarks")
    public JAXBElement<RemarkType> createRemarks(RemarkType value) {
        return new JAXBElement<RemarkType>(_Remarks_QNAME, RemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfServiceBundleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceBundleList")
    public JAXBElement<ListOfServiceBundleType> createServiceBundleList(ListOfServiceBundleType value) {
        return new JAXBElement<ListOfServiceBundleType>(_ServiceBundleList_QNAME, ListOfServiceBundleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EncodedCurrencyPrice")
    public JAXBElement<EncodedPriceType> createEncodedCurrencyPrice(EncodedPriceType value) {
        return new JAXBElement<EncodedPriceType>(_EncodedCurrencyPrice_QNAME, EncodedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvDiscrepencyAlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InventoryDiscrepancyAlert")
    public JAXBElement<InvDiscrepencyAlertType> createInventoryDiscrepancyAlert(InvDiscrepencyAlertType value) {
        return new JAXBElement<InvDiscrepencyAlertType>(_InventoryDiscrepancyAlert_QNAME, InvDiscrepencyAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscChargeMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MiscChargeMethod")
    public JAXBElement<MiscChargeMethodType> createMiscChargeMethod(MiscChargeMethodType value) {
        return new JAXBElement<MiscChargeMethodType>(_MiscChargeMethod_QNAME, MiscChargeMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightMileageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightMileage")
    public JAXBElement<FlightMileageType> createFlightMileage(FlightMileageType value) {
        return new JAXBElement<FlightMileageType>(_FlightMileage_QNAME, FlightMileageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilateralTimeLimitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BilateralTimeLimits")
    public JAXBElement<BilateralTimeLimitsType> createBilateralTimeLimits(BilateralTimeLimitsType value) {
        return new JAXBElement<BilateralTimeLimitsType>(_BilateralTimeLimits_QNAME, BilateralTimeLimitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SeatDisplayKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSeatDisplayKey(String value) {
        return new JAXBElement<String>(_SeatDisplayKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SimpleAddress")
    public JAXBElement<SimpleAddrType> createSimpleAddress(SimpleAddrType value) {
        return new JAXBElement<SimpleAddrType>(_SimpleAddress_QNAME, SimpleAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OriginDestinationKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOriginDestinationKey(String value) {
        return new JAXBElement<String>(_OriginDestinationKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DiscountMetadata")
    public JAXBElement<DisclosureMetadataType> createDiscountMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DiscountMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ContentMetadata")
    public JAXBElement<ContentMetadataType> createContentMetadata(ContentMetadataType value) {
        return new JAXBElement<ContentMetadataType>(_ContentMetadata_QNAME, ContentMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfIntermediaryReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RoleOfIntermediaryReference")
    public JAXBElement<RoleOfIntermediaryReferenceType> createRoleOfIntermediaryReference(RoleOfIntermediaryReferenceType value) {
        return new JAXBElement<RoleOfIntermediaryReferenceType>(_RoleOfIntermediaryReference_QNAME, RoleOfIntermediaryReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BagDisclosureReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createBagDisclosureReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_BagDisclosureReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ShortDate")
    public JAXBElement<DateRepType> createShortDate(DateRepType value) {
        return new JAXBElement<DateRepType>(_ShortDate_QNAME, DateRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BankAccountMethod")
    public JAXBElement<BankAccountMethodType> createBankAccountMethod(BankAccountMethodType value) {
        return new JAXBElement<BankAccountMethodType>(_BankAccountMethod_QNAME, BankAccountMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarePriceDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FarePriceDetail")
    public JAXBElement<FarePriceDetailType> createFarePriceDetail(FarePriceDetailType value) {
        return new JAXBElement<FarePriceDetailType>(_FarePriceDetail_QNAME, FarePriceDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ExitRowPosition")
    public JAXBElement<ExitPositionType> createExitRowPosition(ExitPositionType value) {
        return new JAXBElement<ExitPositionType>(_ExitRowPosition_QNAME, ExitPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BundleReference")
    @XmlIDREF
    public JAXBElement<Object> createBundleReference(Object value) {
        return new JAXBElement<Object>(_BundleReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PenaltyList")
    public JAXBElement<ListOfOfferPenaltyType> createPenaltyList(ListOfOfferPenaltyType value) {
        return new JAXBElement<ListOfOfferPenaltyType>(_PenaltyList_QNAME, ListOfOfferPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Arrival")
    public JAXBElement<FlightArrivalType> createArrival(FlightArrivalType value) {
        return new JAXBElement<FlightArrivalType>(_Arrival_QNAME, FlightArrivalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferPenalty")
    public JAXBElement<OfferPenaltyType> createOfferPenalty(OfferPenaltyType value) {
        return new JAXBElement<OfferPenaltyType>(_OfferPenalty_QNAME, OfferPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceReference")
    @XmlIDREF
    public JAXBElement<Object> createServiceReference(Object value) {
        return new JAXBElement<Object>(_ServiceReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EquivFare")
    public JAXBElement<EquivFareTransactionType> createEquivFare(EquivFareTransactionType value) {
        return new JAXBElement<EquivFareTransactionType>(_EquivFare_QNAME, EquivFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareComponent")
    public JAXBElement<FareComponentType> createFareComponent(FareComponentType value) {
        return new JAXBElement<FareComponentType>(_FareComponent_QNAME, FareComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MarketingCarrierAirline")
    public JAXBElement<MarketingCarrierType> createMarketingCarrierAirline(MarketingCarrierType value) {
        return new JAXBElement<MarketingCarrierType>(_MarketingCarrierAirline_QNAME, MarketingCarrierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightPreferences")
    public JAXBElement<FlightPreferencesType> createFlightPreferences(FlightPreferencesType value) {
        return new JAXBElement<FlightPreferencesType>(_FlightPreferences_QNAME, FlightPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MaximumQuantity", scope = ListOfServiceBundleType.ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME, BigInteger.class, ListOfServiceBundleType.ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MinimumQuantity", scope = ListOfServiceBundleType.ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME, BigInteger.class, ListOfServiceBundleType.ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Begin", scope = SeatComponentType.Locations.Location.Space.RowRange.class)
    public JAXBElement<BigInteger> createSeatComponentTypeLocationsLocationSpaceRowRangeBegin(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatComponentTypeLocationsLocationSpaceRowRangeBegin_QNAME, BigInteger.class, SeatComponentType.Locations.Location.Space.RowRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "End", scope = SeatComponentType.Locations.Location.Space.RowRange.class)
    public JAXBElement<BigInteger> createSeatComponentTypeLocationsLocationSpaceRowRangeEnd(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatComponentTypeLocationsLocationSpaceRowRangeEnd_QNAME, BigInteger.class, SeatComponentType.Locations.Location.Space.RowRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Begin", scope = SeatComponentType.Locations.Location.Space.ColumnRange.class)
    public JAXBElement<String> createSeatComponentTypeLocationsLocationSpaceColumnRangeBegin(String value) {
        return new JAXBElement<String>(_SeatComponentTypeLocationsLocationSpaceRowRangeBegin_QNAME, String.class, SeatComponentType.Locations.Location.Space.ColumnRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "End", scope = SeatComponentType.Locations.Location.Space.ColumnRange.class)
    public JAXBElement<String> createSeatComponentTypeLocationsLocationSpaceColumnRangeEnd(String value) {
        return new JAXBElement<String>(_SeatComponentTypeLocationsLocationSpaceRowRangeEnd_QNAME, String.class, SeatComponentType.Locations.Location.Space.ColumnRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Participants", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Participants> createMsgPartiesTypeParticipants(MsgPartiesType.Participants value) {
        return new JAXBElement<MsgPartiesType.Participants>(_MsgPartiesTypeParticipants_QNAME, MsgPartiesType.Participants.class, MsgPartiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Recipient", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Recipient> createMsgPartiesTypeRecipient(MsgPartiesType.Recipient value) {
        return new JAXBElement<MsgPartiesType.Recipient>(_MsgPartiesTypeRecipient_QNAME, MsgPartiesType.Recipient.class, MsgPartiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Minimum", scope = OfferGroupSizeType.class)
    public JAXBElement<BigInteger> createOfferGroupSizeTypeMinimum(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferGroupSizeTypeMinimum_QNAME, BigInteger.class, OfferGroupSizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Maximum", scope = OfferGroupSizeType.class)
    public JAXBElement<BigInteger> createOfferGroupSizeTypeMaximum(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferGroupSizeTypeMaximum_QNAME, BigInteger.class, OfferGroupSizeType.class, value);
    }

}
