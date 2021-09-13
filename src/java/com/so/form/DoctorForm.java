/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.form;

import com.so.beans.LicenseBean;
import com.so.util.UtilityFile;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Dell India
 */
public class DoctorForm extends org.apache.struts.action.ActionForm implements Serializable {

    private final int messageSetOrBlock = 1;//0 for message and 1 for block;
    private final BigDecimal zero = BigDecimal.ZERO;
    private ActionMessages mess;
    private int customerId;
    private String custName;
    private String custTitle;
    private String custNameAlt;
    private String custCode;
    private String custDesc;
    private String customerType;
    private String enterpriseType;
    private String natureOfBusiness;
    private String dateOfBirth;
    private String website;
    private String cinNo;
    private String otherNo;
    private int custNumber;
    private int userId;
    private int pkId;
    private String employeeNo;
    private String employeeNo1;
    private String title;
    private String name;
    private String otherName;
    private String code;
    private String desc;
    private int empTypeId;
    private String empType;
    private String title1;
    private String name1;
    private String otherName1;
    private String code1;
    private String desc1;
    private int empTypeId1;
    private String empType1;
    private String dob;
    private int entpriseTypeId;
    private String entpriseType;
    private int entpriseTypeId1;
    private String entpriseType1;
    private int status;
    private int siteId;
    private int siteCount;
    private int mraCount;
    private int tsCount;
    private int otherCount;
    private int templateCount;
    private String siteNo;
    private String siteName;
    private String otherSiteName;
    private String siteCode;
    private String siteZone;
    private int ouId;
    private String authStatus;
    private String accountType;//mail/salary/other
    private String bankName;
    private String bankAddress;
    private String bankAccountType;//saving/current
    private String accountHolderName;
    private String accountNo;
    private String ifscCode;
    private String remarks;
    private String startDate;
    private String endDate;
    private String mraDate;
    private int managerId;
    private String managerName;
    private int bdmId;
    private String bdmName;
    private int contactId;
    private int contactTypeId;
    private String contactType;
    private String contactPerson;
    private String designation;
    private String areaCode;
    private String phoneNo;
    private String mobileNo;
    private String emailId;
    private int contactId1;
    private int contactTypeId1;
    private String contactType1;
    private String contactPerson1;
    private String designation1;
    private String areaCode1;
    private String phoneNo1;
    private String mobileNo1;
    private String emailId1;
    private int addressId;
    private int addressTypeId;
    private String addressType;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private int countryId;
    private String countryName;
    private int stateId;
    private String stateName;
    private String stateCode;
    private String stateNumericCode;
    private int cityId;
    private String cityName;
    private String pincode;
    private int documentId;
    private int documentTypeId;
    private String documentType;
    private String documentName;
    private String documentPath;
    private List<FormFile> fileArr;
    private byte saltVal;
    private byte keyVal;
    private int encApplicable;
    private int documentIdS;
    private int documentTypeIdS;
    private String documentTypeS;
    private String documentNameS;
    private String documentPathS;
    private List<FormFile> fileArrS;
    private byte saltValS;
    private byte keyValS;
    private int encApplicableS;
    private int gstId;
    private int[] gstIdArr;
    private String vatRegNo;
    private String serviceTaxRegNo;
    private String gstType;
    private String gstVal;
    private String[] gstTypeArr;
    private String[] gstValArr;
    private String gstNo;
    private String lutNo;
    private String panNo;
    private String tinNo;
    private int[] statusArr;
    private int[] siteIdArr;
    private String[] siteNoArr;
    private String[] siteNameArr;
    private String[] otherSiteNameArr;
    private String[] siteCodeArr;
    private String[] siteZoneArr;
    private int[] ouIdArr;
    private String[] authStatusArr;
    private String[] authStatusDocumentArr;
    private String[] authStatusDocumentSArr;
    private String[] accountTypeArr;//mail/salary/other
    private int[] finDetIdArr;
    private String[] bankNameArr;
    private String[] bankAddressArr;
    private String[] bankAccountTypeArr;//saving/current
    private String[] accountHolderNameArr;
    private String[] accountNoArr;
    private String[] ifscCodeArr;
    private String[] remarksArr;
    private String[] startDateArr;
    private String[] endDateArr;
    private String[] startDateFinArr;
    private String[] endDateFinArr;
    private String[] startDateManagerArr;
    private String[] endDateManagerArr;
    private String[] startDateGstArr;
    private String[] endDateGstArr;
    private String[] startDateAddArr;
    private String[] endDateAddArr;
    private String[] mraDateArr;
    private int[] managerIdArr;
    private int[] accountManagerIdArr;
    private String[] accountManagerNameArr;
    private int[] bdmIdArr;
    private String[] bdmNameArr;
    private int[] contactIdArr;
    private int[] contactTypeIdArr;
    private String[] contactTypeArr;
    private String[] contactPersonArr;
    private String[] designationArr;
    private String[] areaCodeArr;
    private String[] phoneNoArr;
    private String[] mobileNoArr;
    private String[] emailIdArr;
    private int[] addressIdArr;
    private int[] addressTypeIdArr;
    private String[] addressTypeArr;
    private String[] addressLine1Arr;
    private String[] addressLine2Arr;
    private String[] addressLine3Arr;
    private int[] countryIdArr;
    private String[] countryNameArr;
    private int[] stateIdArr;
    private String[] stateNameArr;
    private int[] cityIdArr;
    private String[] cityNameArr;
    private String[] pincodeArr;
    private int[] documentIdAArr;
    private String[] documentPathAArr;
    private int[] documentIdArr;
    private int[] documentTypeIdArr;
    private String[] documentTypeArr;
    private String[] documentNameArr;
    private String[] documentPathArr;
    private byte saltValArr;
    private byte keyValArr;
    private int[] encApplicableArr;
    private int[] documentIdSArr;
    private int[] documentTypeIdSArr;
    private String[] documentTypeSArr;
    private String[] documentNameSArr;
    private String[] documentPathSArr;
    private byte saltValSArr;
    private byte keyValSArr;
    private int[] encApplicableSArr;
    private String[] vatRegNoArr;
    private String[] serviceTaxRegNoArr;
    private String[] gstNoArr;
    private String[] panNoArr;
    private String[] tinNoArr;
    private String[] otherNoArr;
    private int clientId;
    private List dataList1;
    private List dataList2;
    private List dataList3;
    private List dataList4;
    private List dataList5;
    private List dataList6;
    private List dataList7;
    private List dataList8;
    private List dataList9;
    private List dataList10;
    private List dataList11;
    private List dataList12;
    private List dataList13;
    private List dataList14;
    private List dataList15;
    private List dataList16;
    private List dataList17;
    private List dataList18;
    private List dataList19;
    private List dataList20;
    private List valueList1;
    private List valueList2;
    private List valueList3;
    private List valueList4;
    private List valueList5;
    private List valueList6;
    private List valueList7;
    private List valueList8;
    private List valueList9;
    private List valueList10;
    private List valueList11;
    private List countryList;
    private List deptList;
    private List userTypeList;
    private int totalRecords;
    private int totalPages;
    private int currentPage;
    private int currentPage1;
    private List paginationList;
    private int recordsPerPage;
    private int startCounter;
    private int endCounter;
    private String activeHead;
    private String activeSideMenu;
    private String firstName;
    private String middleName;
    private String lastName;
    private int deptId;
    private String deptName;
    private String uname1;
    private String upass1;
    private int uTypeId1;
    private int totalRecords1;
    private FormFile image;
    private String imagePath;
    private FormFile attachment1;
    private String attachment1Path;
    private FormFile attachment2;
    private String attachment2Path;
    private String validationVal;
    private String createdDate;
    private String updatedDate;
    private int count;
    private String cserialNo1;
    private int[] pkIdArr;
    private int contactSaved;
    private int addressSaved;
    private int documentSaved;
    private int documentSavedS;
    private int documentSaved1;
    private int documentSavedS1;
    private int gstSaved;
    private int managerSaved;
    private int finSaved;
    private int sigSaved;
    private int otherSaved;
    private String action;
    private int[] sigDetIdArr;
    private String[] userTypeArr;
    private String[] userNameArr;
    private String[] userDesignationArr;
    private String[] startDateSigArr;
    private String[] endDateSigArr;

    private int fieldType;
    private String fieldName;
    private String fieldDesc;
    private Integer isMandatory;
    private Integer isNameEditable;
    private Integer isApplicable;
    private Integer isDisabled;
    private Integer serialNo;
    private String orderNo;
    private Integer active;
    private Integer createdBy;
    private Integer updatedBy;
    private String serialNo1;
    private String serialNo2;
    private String serialNo3;
    private String serialNo4;
    private String serialNo5;
    private String serialNo6;
    private String serialNo7;
    private String serialNo8;
    private String serialNo9;
    private String serialNo10;
    private List fieldList;
    private List headList;
    private int orgId;
    private String ouName;
    private int orgId1;
    private String ouName1;
    private String ouCode;
    private String ouDesc;
    private int ouStatus;
    private int entityId;
    private String entityName;
    private String entityCode;
    private String entityDesc;
    private int entityStatus;
    private int approvalApplicableArr[];
    private int approvalDocApplicableArr[];
    private int approvalDocApplicableSArr[];
    private int approvalApplicable;
    private int mapIdArr[];
    private int funderId;
    private int funderSiteId;
    private String funderSiteName;
    private int funderIdArr[];
    private int funderSiteIdArr[];
    private String funderSiteNameArr[];
    private int superCategoryIdArr[];
    private String fundingRate;
    private String fundingRateArr[];
    private String sanctionedAmountArr[];
    private String sanctionRefNoArr[];
    private String authStatusFunArr[];
    private int approvalFunApplicableArr[];
    private String startDateFArr[];
    private String endDateFArr[];
    private int mapId;
    private int mraId;
    private String mraNo;
    private String mraEndDate;
    private String overdueRate;
    private int dayOfMonth;
    private String discountRate;
    private String breakageRate;
    private int noticePeriodDays;
    private String remarksM;
    private String remarksT;
    private String notifier;
    private String insuredBy;
    private String custOrg;
    private String authStatusM;
    private int approvalAppM;
    private int numberAutoM;
    private int documentId1;
    private int documentId2;
    private int documentId3;
    private int documentId4;
    private FormFile document1;
    private FormFile document2;
    private FormFile document3;
    private FormFile document4;
    private String documentPath1;
    private String documentPath2;
    private String documentPath3;
    private String documentPath4;
    private int mraLineId;
    private int mraLineIdArr[];
    private String overdueRateArr[];
    private String discountRateArr[];
    private String breakageRateArr[];
    private int noticePeriodDaysArr[];
    private String notifierArr[];
    private String authStatusMArr[];
    private int approvalAppMArr[];
    private int documentId1Arr[];
    private int documentId2Arr[];
    private int documentId3Arr[];
    private FormFile document1Arr[];
    private FormFile document2Arr[];
    private FormFile document3Arr[];
    private String documentPath1Arr[];
    private String documentPath2Arr[];
    private String documentPath3Arr[];
    private String startDateMArr[];
    private String endDateMArr[];
    private String startDateM;
    private String endDateM;
    private String startDateT;
    private String endDateT;
    private int tsId;
    private String tsNo;
    private int extApplicable;
    private int extApplicableArr[];
    private int termMonths;
    private int termMonthsExt;
    private int termMonthsArr[];
    private int termMonthsExtArr[];
    private String brValue;
    private String rentalRate;
    private String rentalRateExt;
    private String paymentTerm;
    private String paymentTermArr[];
    private String securityPerc;
    private String securityAmount;
    private String processingPerc;
    private String processingAmount;
    private String bankGuaranteePerc;
    private String bankGuaranteeAmount;
    private int dayOfMonthT;
    private String authStatusT;
    private int approvalAppT;
    private int numberAutoT;
    private int documentIdT1;
    private int documentIdT2;
    private int documentIdT3;
    private int documentIdT4;
    private FormFile documentT1;
    private FormFile documentT2;
    private FormFile documentT3;
    private FormFile documentT4;
    private String documentPathT1;
    private String documentPathT2;
    private String documentPathT3;
    private String documentPathT4;
    private String documentPathA;
    private List errorPresent;
    private int templateId;
    private String templateText;
    private String templateTextArr[];
    private int templateIdT;
    private String templateTextT;
    private int superCategoryIdT;
    private String superCategoryNameT;
    private int subCategoryIdT;
    private String subCategoryNameT;
    private int tsLineId;
    private int tsLineIdArr[];
    private int superCategoryIdTArr[];
    private String superCategoryNameTArr[];
    private int subCategoryIdTArr[];
    private String subCategoryNameTArr[];
    private String rentalRateArr[];
    private String securityPercArr[];
    private String securityAmountArr[];
    private String processingPercArr[];
    private String processingAmountArr[];
    private String bankGuaranteePercArr[];
    private String bankGuaranteeAmountArr[];
    private String rentalRateExtArr[];
    private int lineStatusMArr[];
    private int lineStatusTArr[];
    private int lineStatusM;
    private int lineCountT;
    private int lineStatusT;
    private int cbSiteArr[];
    private int cbDocArr[];
    private int cbDocSArr[];
    private int cbFundArr[];
    private int isSecondary;
    private int isSME;
    private int custSiteId;
    private String custSiteName;
    private String custSiteNameAlt;
    private String custSiteCode;
    private int custSiteNumber;
    private String multiCustName;
    private int sectionId;
    private int activityId;
    private int activitySaved;
    private List<FormFile> fileArrA;
    private String subject;
    private String remarkA;
    private String alertDate;
    private String activityType;
    private String arDate;
    private String corAddress;
    private int payReciptSaved;
    private int custSiteIdArr[];
    private String isSecondarytxt;
    private String isSMEtxt;
    private String statustxt;
    private int isPrimary;
    private int finYearId;
    private String finYearName;
    private String sanctionedAmount;
    private String sanctionRefNo;
    private String usedAmount;
    private String committedAmount;
    private String availableAmount;
    private int statusDocArr[];
    private int statusDocSArr[];
    private int orderColumn;
    private int ascDesc;
    private String customerIds;
    private String vendorIds;
    private int customerIdsArr[];
    private int vendorIdsArr[];
    private int idsArr[];
    private String tanNo;

    public String getLutNo() {
        return lutNo;
    }

    public void setLutNo(String lutNo) {
        this.lutNo = lutNo;
    }

    public List getValueList11() {
        return valueList11;
    }

    public void setValueList11(List valueList11) {
        this.valueList11 = valueList11;
    }

    public String getTanNo() {
        return tanNo;
    }

    public void setTanNo(String tanNo) {
        this.tanNo = tanNo;
    }

    public int[] getIdsArr() {
        return idsArr;
    }

    public void setIdsArr(int[] idsArr) {
        this.idsArr = idsArr;
    }

    public int[] getCustomerIdsArr() {
        return customerIdsArr;
    }

    public void setCustomerIdsArr(int[] customerIdsArr) {
        this.customerIdsArr = customerIdsArr;
    }

    public int[] getVendorIdsArr() {
        return vendorIdsArr;
    }

    public void setVendorIdsArr(int[] vendorIdsArr) {
        this.vendorIdsArr = vendorIdsArr;
    }

    public String getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(String customerIds) {
        this.customerIds = customerIds;
    }

    public String getVendorIds() {
        return vendorIds;
    }

    public void setVendorIds(String vendorIds) {
        this.vendorIds = vendorIds;
    }

    public int getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(int orderColumn) {
        this.orderColumn = orderColumn;
    }

    public int getAscDesc() {
        return ascDesc;
    }

    public void setAscDesc(int ascDesc) {
        this.ascDesc = ascDesc;
    }

    public int[] getStatusDocArr() {
        return statusDocArr;
    }

    public void setStatusDocArr(int[] statusDocArr) {
        this.statusDocArr = statusDocArr;
    }

    public int[] getStatusDocSArr() {
        return statusDocSArr;
    }

    public void setStatusDocSArr(int[] statusDocSArr) {
        this.statusDocSArr = statusDocSArr;
    }

    public String getFunderSiteName() {
        return funderSiteName;
    }

    public void setFunderSiteName(String funderSiteName) {
        this.funderSiteName = funderSiteName;
    }

    public String[] getFunderSiteNameArr() {
        return funderSiteNameArr;
    }

    public void setFunderSiteNameArr(String[] funderSiteNameArr) {
        this.funderSiteNameArr = funderSiteNameArr;
    }

    public String getSanctionedAmount() {
        return sanctionedAmount;
    }

    public void setSanctionedAmount(String sanctionedAmount) {
        this.sanctionedAmount = sanctionedAmount;
    }

    public String getSanctionRefNo() {
        return sanctionRefNo;
    }

    public void setSanctionRefNo(String sanctionRefNo) {
        this.sanctionRefNo = sanctionRefNo;
    }

    public String getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    public String getCommittedAmount() {
        return committedAmount;
    }

    public void setCommittedAmount(String committedAmount) {
        this.committedAmount = committedAmount;
    }

    public String getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public int getFinYearId() {
        return finYearId;
    }

    public void setFinYearId(int finYearId) {
        this.finYearId = finYearId;
    }

    public String getFinYearName() {
        return finYearName;
    }

    public void setFinYearName(String finYearName) {
        this.finYearName = finYearName;
    }

    public int getContactId1() {
        return contactId1;
    }

    public void setContactId1(int contactId1) {
        this.contactId1 = contactId1;
    }

    public int getContactTypeId1() {
        return contactTypeId1;
    }

    public void setContactTypeId1(int contactTypeId1) {
        this.contactTypeId1 = contactTypeId1;
    }

    public String getContactType1() {
        return contactType1;
    }

    public void setContactType1(String contactType1) {
        this.contactType1 = contactType1;
    }

    public String getContactPerson1() {
        return contactPerson1;
    }

    public void setContactPerson1(String contactPerson1) {
        this.contactPerson1 = contactPerson1;
    }

    public String getDesignation1() {
        return designation1;
    }

    public void setDesignation1(String designation1) {
        this.designation1 = designation1;
    }

    public String getAreaCode1() {
        return areaCode1;
    }

    public void setAreaCode1(String areaCode1) {
        this.areaCode1 = areaCode1;
    }

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getMobileNo1() {
        return mobileNo1;
    }

    public void setMobileNo1(String mobileNo1) {
        this.mobileNo1 = mobileNo1;
    }

    public String getEmailId1() {
        return emailId1;
    }

    public void setEmailId1(String emailId1) {
        this.emailId1 = emailId1;
    }

    public String getBreakageRate() {
        return breakageRate;
    }

    public void setBreakageRate(String breakageRate) {
        this.breakageRate = breakageRate;
    }

    public String[] getBreakageRateArr() {
        return breakageRateArr;
    }

    public void setBreakageRateArr(String[] breakageRateArr) {
        this.breakageRateArr = breakageRateArr;
    }

    public int getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(int isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getIsSecondarytxt() {
        return isSecondarytxt;
    }

    public void setIsSecondarytxt(String isSecondarytxt) {
        this.isSecondarytxt = isSecondarytxt;
    }

    public String getIsSMEtxt() {
        return isSMEtxt;
    }

    public void setIsSMEtxt(String isSMEtxt) {
        this.isSMEtxt = isSMEtxt;
    }

    public String getStatustxt() {
        return statustxt;
    }

    public void setStatustxt(String statustxt) {
        this.statustxt = statustxt;
    }

    public int[] getCustSiteIdArr() {
        return custSiteIdArr;
    }

    public void setCustSiteIdArr(int[] custSiteIdArr) {
        this.custSiteIdArr = custSiteIdArr;
    }

    public int getOrgId1() {
        return orgId1;
    }

    public void setOrgId1(int orgId1) {
        this.orgId1 = orgId1;
    }

    public String getOuName1() {
        return ouName1;
    }

    public void setOuName1(String ouName1) {
        this.ouName1 = ouName1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getOtherName1() {
        return otherName1;
    }

    public void setOtherName1(String otherName1) {
        this.otherName1 = otherName1;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public int getEmpTypeId1() {
        return empTypeId1;
    }

    public void setEmpTypeId1(int empTypeId1) {
        this.empTypeId1 = empTypeId1;
    }

    public String getEmpType1() {
        return empType1;
    }

    public void setEmpType1(String empType1) {
        this.empType1 = empType1;
    }

    public int getEntpriseTypeId1() {
        return entpriseTypeId1;
    }

    public void setEntpriseTypeId1(int entpriseTypeId1) {
        this.entpriseTypeId1 = entpriseTypeId1;
    }

    public String getEntpriseType1() {
        return entpriseType1;
    }

    public void setEntpriseType1(String entpriseType1) {
        this.entpriseType1 = entpriseType1;
    }

    public int getPayReciptSaved() {
        return payReciptSaved;
    }

    public void setPayReciptSaved(int payReciptSaved) {
        this.payReciptSaved = payReciptSaved;
    }

    public String getCorAddress() {
        return corAddress;
    }

    public void setCorAddress(String corAddress) {
        this.corAddress = corAddress;
    }

    public int[] getExtApplicableArr() {
        return extApplicableArr;
    }

    public void setExtApplicableArr(int[] extApplicableArr) {
        this.extApplicableArr = extApplicableArr;
    }

    public int[] getTermMonthsArr() {
        return termMonthsArr;
    }

    public void setTermMonthsArr(int[] termMonthsArr) {
        this.termMonthsArr = termMonthsArr;
    }

    public int[] getTermMonthsExtArr() {
        return termMonthsExtArr;
    }

    public void setTermMonthsExtArr(int[] termMonthsExtArr) {
        this.termMonthsExtArr = termMonthsExtArr;
    }

    public String[] getPaymentTermArr() {
        return paymentTermArr;
    }

    public void setPaymentTermArr(String[] paymentTermArr) {
        this.paymentTermArr = paymentTermArr;
    }

    public int[] getDocumentIdAArr() {
        return documentIdAArr;
    }

    public void setDocumentIdAArr(int[] documentIdAArr) {
        this.documentIdAArr = documentIdAArr;
    }

    public String[] getDocumentPathAArr() {
        return documentPathAArr;
    }

    public void setDocumentPathAArr(String[] documentPathAArr) {
        this.documentPathAArr = documentPathAArr;
    }

    public int getFunderId() {
        return funderId;
    }

    public void setFunderId(int funderId) {
        this.funderId = funderId;
    }

    public int getFunderSiteId() {
        return funderSiteId;
    }

    public void setFunderSiteId(int funderSiteId) {
        this.funderSiteId = funderSiteId;
    }

    public String getArDate() {
        return arDate;
    }

    public void setArDate(String arDate) {
        this.arDate = arDate;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateNumericCode() {
        return stateNumericCode;
    }

    public void setStateNumericCode(String stateNumericCode) {
        this.stateNumericCode = stateNumericCode;
    }

    public String getDocumentPathA() {
        return documentPathA;
    }

    public void setDocumentPathA(String documentPathA) {
        this.documentPathA = documentPathA;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getarDate() {
        return arDate;
    }

    public void setarDate(String arDate) {
        this.arDate = arDate;
    }

    public String getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(String alertDate) {
        this.alertDate = alertDate;
    }

    public String getRemarkA() {
        return remarkA;
    }

    public void setRemarkA(String remarkA) {
        this.remarkA = remarkA;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<FormFile> getFileArrA() {
        return fileArrA;
    }

    public void setFileArrA(List<FormFile> fileArrA) {
        this.fileArrA = fileArrA;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivitySaved() {
        return activitySaved;
    }

    public void setActivitySaved(int activitySaved) {
        this.activitySaved = activitySaved;
    }

    public int getIsSME() {
        return isSME;
    }

    public void setIsSME(int isSME) {
        this.isSME = isSME;
    }

    public int getDocumentSaved1() {
        return documentSaved1;
    }

    public void setDocumentSaved1(int documentSaved1) {
        this.documentSaved1 = documentSaved1;
    }

    public int getDocumentSavedS1() {
        return documentSavedS1;
    }

    public void setDocumentSavedS1(int documentSavedS1) {
        this.documentSavedS1 = documentSavedS1;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int[] getCbDocArr() {
        return cbDocArr;
    }

    public void setCbDocArr(int[] cbDocArr) {
        this.cbDocArr = cbDocArr;
    }

    public int[] getCbDocSArr() {
        return cbDocSArr;
    }

    public void setCbDocSArr(int[] cbDocSArr) {
        this.cbDocSArr = cbDocSArr;
    }

    public int[] getCbFundArr() {
        return cbFundArr;
    }

    public void setCbFundArr(int[] cbFundArr) {
        this.cbFundArr = cbFundArr;
    }

    public List getHeadList() {
        return headList;
    }

    public void setHeadList(List headList) {
        this.headList = headList;
    }

    public String getMultiCustName() {
        return multiCustName;
    }

    public void setMultiCustName(String multiCustName) {
        this.multiCustName = multiCustName;
    }

    public int getCustSiteId() {
        return custSiteId;
    }

    public void setCustSiteId(int custSiteId) {
        this.custSiteId = custSiteId;
    }

    public String getCustSiteName() {
        return custSiteName;
    }

    public void setCustSiteName(String custSiteName) {
        this.custSiteName = custSiteName;
    }

    public String getCustSiteNameAlt() {
        return custSiteNameAlt;
    }

    public void setCustSiteNameAlt(String custSiteNameAlt) {
        this.custSiteNameAlt = custSiteNameAlt;
    }

    public String getCustSiteCode() {
        return custSiteCode;
    }

    public void setCustSiteCode(String custSiteCode) {
        this.custSiteCode = custSiteCode;
    }

    public int getCustSiteNumber() {
        return custSiteNumber;
    }

    public void setCustSiteNumber(int custSiteNumber) {
        this.custSiteNumber = custSiteNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public String getCustNameAlt() {
        return custNameAlt;
    }

    public void setCustNameAlt(String custNameAlt) {
        this.custNameAlt = custNameAlt;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCustDesc() {
        return custDesc;
    }

    public void setCustDesc(String custDesc) {
        this.custDesc = custDesc;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(int custNumber) {
        this.custNumber = custNumber;
    }

    public List getDataList15() {
        return dataList15;
    }

    public void setDataList15(List dataList15) {
        this.dataList15 = dataList15;
    }

    public List getDataList16() {
        return dataList16;
    }

    public void setDataList16(List dataList16) {
        this.dataList16 = dataList16;
    }

    public List getDataList17() {
        return dataList17;
    }

    public void setDataList17(List dataList17) {
        this.dataList17 = dataList17;
    }

    public List getDataList18() {
        return dataList18;
    }

    public void setDataList18(List dataList18) {
        this.dataList18 = dataList18;
    }

    public List getDataList19() {
        return dataList19;
    }

    public void setDataList19(List dataList19) {
        this.dataList19 = dataList19;
    }

    public List getDataList20() {
        return dataList20;
    }

    public void setDataList20(List dataList20) {
        this.dataList20 = dataList20;
    }

    public int[] getApprovalDocApplicableSArr() {
        return approvalDocApplicableSArr;
    }

    public void setApprovalDocApplicableSArr(int[] approvalDocApplicableSArr) {
        this.approvalDocApplicableSArr = approvalDocApplicableSArr;
    }

    public int getDocumentId4() {
        return documentId4;
    }

    public void setDocumentId4(int documentId4) {
        this.documentId4 = documentId4;
    }

    public FormFile getDocument4() {
        return document4;
    }

    public void setDocument4(FormFile document4) {
        this.document4 = document4;
    }

    public String getDocumentPath4() {
        return documentPath4;
    }

    public void setDocumentPath4(String documentPath4) {
        this.documentPath4 = documentPath4;
    }

    public int getDocumentIdT4() {
        return documentIdT4;
    }

    public void setDocumentIdT4(int documentIdT4) {
        this.documentIdT4 = documentIdT4;
    }

    public FormFile getDocumentT4() {
        return documentT4;
    }

    public void setDocumentT4(FormFile documentT4) {
        this.documentT4 = documentT4;
    }

    public String getDocumentPathT4() {
        return documentPathT4;
    }

    public void setDocumentPathT4(String documentPathT4) {
        this.documentPathT4 = documentPathT4;
    }

    public int getDocumentIdS() {
        return documentIdS;
    }

    public void setDocumentIdS(int documentIdS) {
        this.documentIdS = documentIdS;
    }

    public int getDocumentTypeIdS() {
        return documentTypeIdS;
    }

    public void setDocumentTypeIdS(int documentTypeIdS) {
        this.documentTypeIdS = documentTypeIdS;
    }

    public String getDocumentTypeS() {
        return documentTypeS;
    }

    public void setDocumentTypeS(String documentTypeS) {
        this.documentTypeS = documentTypeS;
    }

    public String getDocumentNameS() {
        return documentNameS;
    }

    public void setDocumentNameS(String documentNameS) {
        this.documentNameS = documentNameS;
    }

    public String getDocumentPathS() {
        return documentPathS;
    }

    public void setDocumentPathS(String documentPathS) {
        this.documentPathS = documentPathS;
    }

    public List<FormFile> getFileArrS() {
        return fileArrS;
    }

    public void setFileArrS(List<FormFile> fileArrS) {
        this.fileArrS = fileArrS;
    }

    public byte getSaltValS() {
        return saltValS;
    }

    public void setSaltValS(byte saltValS) {
        this.saltValS = saltValS;
    }

    public byte getKeyValS() {
        return keyValS;
    }

    public void setKeyValS(byte keyValS) {
        this.keyValS = keyValS;
    }

    public int getEncApplicableS() {
        return encApplicableS;
    }

    public void setEncApplicableS(int encApplicableS) {
        this.encApplicableS = encApplicableS;
    }

    public String[] getAuthStatusDocumentSArr() {
        return authStatusDocumentSArr;
    }

    public void setAuthStatusDocumentSArr(String[] authStatusDocumentSArr) {
        this.authStatusDocumentSArr = authStatusDocumentSArr;
    }

    public int[] getDocumentIdSArr() {
        return documentIdSArr;
    }

    public void setDocumentIdSArr(int[] documentIdSArr) {
        this.documentIdSArr = documentIdSArr;
    }

    public int[] getDocumentTypeIdSArr() {
        return documentTypeIdSArr;
    }

    public void setDocumentTypeIdSArr(int[] documentTypeIdSArr) {
        this.documentTypeIdSArr = documentTypeIdSArr;
    }

    public String[] getDocumentTypeSArr() {
        return documentTypeSArr;
    }

    public void setDocumentTypeSArr(String[] documentTypeSArr) {
        this.documentTypeSArr = documentTypeSArr;
    }

    public String[] getDocumentNameSArr() {
        return documentNameSArr;
    }

    public void setDocumentNameSArr(String[] documentNameSArr) {
        this.documentNameSArr = documentNameSArr;
    }

    public String[] getDocumentPathSArr() {
        return documentPathSArr;
    }

    public void setDocumentPathSArr(String[] documentPathSArr) {
        this.documentPathSArr = documentPathSArr;
    }

    public byte getSaltValSArr() {
        return saltValSArr;
    }

    public void setSaltValSArr(byte saltValSArr) {
        this.saltValSArr = saltValSArr;
    }

    public byte getKeyValSArr() {
        return keyValSArr;
    }

    public void setKeyValSArr(byte keyValSArr) {
        this.keyValSArr = keyValSArr;
    }

    public int[] getEncApplicableSArr() {
        return encApplicableSArr;
    }

    public void setEncApplicableSArr(int[] encApplicableSArr) {
        this.encApplicableSArr = encApplicableSArr;
    }

    public int getDocumentSavedS() {
        return documentSavedS;
    }

    public void setDocumentSavedS(int documentSavedS) {
        this.documentSavedS = documentSavedS;
    }

    public String getRemarksM() {
        return remarksM;
    }

    public void setRemarksM(String remarksM) {
        this.remarksM = remarksM;
    }

    public String getRemarksT() {
        return remarksT;
    }

    public void setRemarksT(String remarksT) {
        this.remarksT = remarksT;
    }

    public String getInsuredBy() {
        return insuredBy;
    }

    public void setInsuredBy(String insuredBy) {
        this.insuredBy = insuredBy;
    }

    public String getBrValue() {
        return brValue;
    }

    public void setBrValue(String brValue) {
        this.brValue = brValue;
    }

    public int getIsSecondary() {
        return isSecondary;
    }

    public void setIsSecondary(int isSecondary) {
        this.isSecondary = isSecondary;
    }

    public int[] getCbSiteArr() {
        return cbSiteArr;
    }

    public void setCbSiteArr(int[] cbSiteArr) {
        this.cbSiteArr = cbSiteArr;
    }

    public List getValueList5() {
        return valueList5;
    }

    public void setValueList5(List valueList5) {
        this.valueList5 = valueList5;
    }

    public List getValueList6() {
        return valueList6;
    }

    public void setValueList6(List valueList6) {
        this.valueList6 = valueList6;
    }

    public List getValueList7() {
        return valueList7;
    }

    public void setValueList7(List valueList7) {
        this.valueList7 = valueList7;
    }

    public List getValueList8() {
        return valueList8;
    }

    public void setValueList8(List valueList8) {
        this.valueList8 = valueList8;
    }

    public List getValueList9() {
        return valueList9;
    }

    public void setValueList9(List valueList9) {
        this.valueList9 = valueList9;
    }

    public List getValueList10() {
        return valueList10;
    }

    public void setValueList10(List valueList10) {
        this.valueList10 = valueList10;
    }

    public String getSiteZone() {
        return siteZone;
    }

    public void setSiteZone(String siteZone) {
        this.siteZone = siteZone;
    }

    public String[] getSiteZoneArr() {
        return siteZoneArr;
    }

    public void setSiteZoneArr(String[] siteZoneArr) {
        this.siteZoneArr = siteZoneArr;
    }

    public String[] getSanctionRefNoArr() {
        return sanctionRefNoArr;
    }

    public void setSanctionRefNoArr(String[] sanctionRefNoArr) {
        this.sanctionRefNoArr = sanctionRefNoArr;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFundingRate() {
        return fundingRate;
    }

    public void setFundingRate(String fundingRate) {
        this.fundingRate = fundingRate;
    }

    public String[] getFundingRateArr() {
        return fundingRateArr;
    }

    public void setFundingRateArr(String[] fundingRateArr) {
        this.fundingRateArr = fundingRateArr;
    }

    public ActionMessages getMess() {
        return mess;
    }

    public void setMess(ActionMessages mess) {
        this.mess = mess;
    }

    public int getLineCountT() {
        return lineCountT;
    }

    public void setLineCountT(int lineCountT) {
        this.lineCountT = lineCountT;
    }

    public int getLineStatusM() {
        return lineStatusM;
    }

    public void setLineStatusM(int lineStatusM) {
        this.lineStatusM = lineStatusM;
    }

    public int getLineStatusT() {
        return lineStatusT;
    }

    public void setLineStatusT(int lineStatusT) {
        this.lineStatusT = lineStatusT;
    }

    public int[] getLineStatusMArr() {
        return lineStatusMArr;
    }

    public void setLineStatusMArr(int[] lineStatusMArr) {
        this.lineStatusMArr = lineStatusMArr;
    }

    public int[] getLineStatusTArr() {
        return lineStatusTArr;
    }

    public void setLineStatusTArr(int[] lineStatusTArr) {
        this.lineStatusTArr = lineStatusTArr;
    }

    public String getStartDateM() {
        return startDateM;
    }

    public void setStartDateM(String startDateM) {
        this.startDateM = startDateM;
    }

    public String getEndDateM() {
        return endDateM;
    }

    public void setEndDateM(String endDateM) {
        this.endDateM = endDateM;
    }

    public int getMraLineId() {
        return mraLineId;
    }

    public void setMraLineId(int mraLineId) {
        this.mraLineId = mraLineId;
    }

    public String[] getTemplateTextArr() {
        return templateTextArr;
    }

    public void setTemplateTextArr(String[] templateTextArr) {
        this.templateTextArr = templateTextArr;
    }

    public int getExtApplicable() {
        return extApplicable;
    }

    public void setExtApplicable(int extApplicable) {
        this.extApplicable = extApplicable;
    }

    public int getTermMonthsExt() {
        return termMonthsExt;
    }

    public void setTermMonthsExt(int termMonthsExt) {
        this.termMonthsExt = termMonthsExt;
    }

    public String getRentalRateExt() {
        return rentalRateExt;
    }

    public void setRentalRateExt(String rentalRateExt) {
        this.rentalRateExt = rentalRateExt;
    }

    public String[] getRentalRateExtArr() {
        return rentalRateExtArr;
    }

    public void setRentalRateExtArr(String[] rentalRateExtArr) {
        this.rentalRateExtArr = rentalRateExtArr;
    }

    public int getNoticePeriodDays() {
        return noticePeriodDays;
    }

    public void setNoticePeriodDays(int noticePeriodDays) {
        this.noticePeriodDays = noticePeriodDays;
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }

    public int[] getMraLineIdArr() {
        return mraLineIdArr;
    }

    public void setMraLineIdArr(int[] mraLineIdArr) {
        this.mraLineIdArr = mraLineIdArr;
    }

    public String[] getOverdueRateArr() {
        return overdueRateArr;
    }

    public void setOverdueRateArr(String[] overdueRateArr) {
        this.overdueRateArr = overdueRateArr;
    }

    public String[] getDiscountRateArr() {
        return discountRateArr;
    }

    public void setDiscountRateArr(String[] discountRateArr) {
        this.discountRateArr = discountRateArr;
    }

    public int[] getNoticePeriodDaysArr() {
        return noticePeriodDaysArr;
    }

    public void setNoticePeriodDaysArr(int[] noticePeriodDaysArr) {
        this.noticePeriodDaysArr = noticePeriodDaysArr;
    }

    public String[] getNotifierArr() {
        return notifierArr;
    }

    public void setNotifierArr(String[] notifierArr) {
        this.notifierArr = notifierArr;
    }

    public String[] getAuthStatusMArr() {
        return authStatusMArr;
    }

    public void setAuthStatusMArr(String[] authStatusMArr) {
        this.authStatusMArr = authStatusMArr;
    }

    public int[] getApprovalAppMArr() {
        return approvalAppMArr;
    }

    public void setApprovalAppMArr(int[] approvalAppMArr) {
        this.approvalAppMArr = approvalAppMArr;
    }

    public int[] getDocumentId1Arr() {
        return documentId1Arr;
    }

    public void setDocumentId1Arr(int[] documentId1Arr) {
        this.documentId1Arr = documentId1Arr;
    }

    public int[] getDocumentId2Arr() {
        return documentId2Arr;
    }

    public void setDocumentId2Arr(int[] documentId2Arr) {
        this.documentId2Arr = documentId2Arr;
    }

    public int[] getDocumentId3Arr() {
        return documentId3Arr;
    }

    public void setDocumentId3Arr(int[] documentId3Arr) {
        this.documentId3Arr = documentId3Arr;
    }

    public FormFile[] getDocument1Arr() {
        return document1Arr;
    }

    public void setDocument1Arr(FormFile[] document1Arr) {
        this.document1Arr = document1Arr;
    }

    public FormFile[] getDocument2Arr() {
        return document2Arr;
    }

    public void setDocument2Arr(FormFile[] document2Arr) {
        this.document2Arr = document2Arr;
    }

    public FormFile[] getDocument3Arr() {
        return document3Arr;
    }

    public void setDocument3Arr(FormFile[] document3Arr) {
        this.document3Arr = document3Arr;
    }

    public String[] getDocumentPath1Arr() {
        return documentPath1Arr;
    }

    public void setDocumentPath1Arr(String[] documentPath1Arr) {
        this.documentPath1Arr = documentPath1Arr;
    }

    public String[] getDocumentPath2Arr() {
        return documentPath2Arr;
    }

    public void setDocumentPath2Arr(String[] documentPath2Arr) {
        this.documentPath2Arr = documentPath2Arr;
    }

    public String[] getDocumentPath3Arr() {
        return documentPath3Arr;
    }

    public void setDocumentPath3Arr(String[] documentPath3Arr) {
        this.documentPath3Arr = documentPath3Arr;
    }

    public String[] getStartDateMArr() {
        return startDateMArr;
    }

    public void setStartDateMArr(String[] startDateMArr) {
        this.startDateMArr = startDateMArr;
    }

    public String[] getEndDateMArr() {
        return endDateMArr;
    }

    public void setEndDateMArr(String[] endDateMArr) {
        this.endDateMArr = endDateMArr;
    }

    public int getTsLineId() {
        return tsLineId;
    }

    public void setTsLineId(int tsLineId) {
        this.tsLineId = tsLineId;
    }

    public int[] getTsLineIdArr() {
        return tsLineIdArr;
    }

    public void setTsLineIdArr(int[] tsLineIdArr) {
        this.tsLineIdArr = tsLineIdArr;
    }

    public int[] getSuperCategoryIdTArr() {
        return superCategoryIdTArr;
    }

    public void setSuperCategoryIdTArr(int[] superCategoryIdTArr) {
        this.superCategoryIdTArr = superCategoryIdTArr;
    }

    public String[] getSuperCategoryNameTArr() {
        return superCategoryNameTArr;
    }

    public void setSuperCategoryNameTArr(String[] superCategoryNameTArr) {
        this.superCategoryNameTArr = superCategoryNameTArr;
    }

    public int[] getSubCategoryIdTArr() {
        return subCategoryIdTArr;
    }

    public void setSubCategoryIdTArr(int[] subCategoryIdTArr) {
        this.subCategoryIdTArr = subCategoryIdTArr;
    }

    public String[] getSubCategoryNameTArr() {
        return subCategoryNameTArr;
    }

    public void setSubCategoryNameTArr(String[] subCategoryNameTArr) {
        this.subCategoryNameTArr = subCategoryNameTArr;
    }

    public String[] getRentalRateArr() {
        return rentalRateArr;
    }

    public void setRentalRateArr(String[] rentalRateArr) {
        this.rentalRateArr = rentalRateArr;
    }

    public String[] getSecurityPercArr() {
        return securityPercArr;
    }

    public void setSecurityPercArr(String[] securityPercArr) {
        this.securityPercArr = securityPercArr;
    }

    public String[] getSecurityAmountArr() {
        return securityAmountArr;
    }

    public void setSecurityAmountArr(String[] securityAmountArr) {
        this.securityAmountArr = securityAmountArr;
    }

    public String[] getProcessingPercArr() {
        return processingPercArr;
    }

    public void setProcessingPercArr(String[] processingPercArr) {
        this.processingPercArr = processingPercArr;
    }

    public String[] getProcessingAmountArr() {
        return processingAmountArr;
    }

    public void setProcessingAmountArr(String[] processingAmountArr) {
        this.processingAmountArr = processingAmountArr;
    }

    public String[] getBankGuaranteePercArr() {
        return bankGuaranteePercArr;
    }

    public void setBankGuaranteePercArr(String[] bankGuaranteePercArr) {
        this.bankGuaranteePercArr = bankGuaranteePercArr;
    }

    public String[] getBankGuaranteeAmountArr() {
        return bankGuaranteeAmountArr;
    }

    public void setBankGuaranteeAmountArr(String[] bankGuaranteeAmountArr) {
        this.bankGuaranteeAmountArr = bankGuaranteeAmountArr;
    }

    public int getMraCount() {
        return mraCount;
    }

    public void setMraCount(int mraCount) {
        this.mraCount = mraCount;
    }

    public int getTsCount() {
        return tsCount;
    }

    public void setTsCount(int tsCount) {
        this.tsCount = tsCount;
    }

    public int getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(int otherCount) {
        this.otherCount = otherCount;
    }

    public int getTemplateCount() {
        return templateCount;
    }

    public void setTemplateCount(int templateCount) {
        this.templateCount = templateCount;
    }

    public int getSuperCategoryIdT() {
        return superCategoryIdT;
    }

    public void setSuperCategoryIdT(int superCategoryIdT) {
        this.superCategoryIdT = superCategoryIdT;
    }

    public String getSuperCategoryNameT() {
        return superCategoryNameT;
    }

    public void setSuperCategoryNameT(String superCategoryNameT) {
        this.superCategoryNameT = superCategoryNameT;
    }

    public int getSubCategoryIdT() {
        return subCategoryIdT;
    }

    public void setSubCategoryIdT(int subCategoryIdT) {
        this.subCategoryIdT = subCategoryIdT;
    }

    public String getSubCategoryNameT() {
        return subCategoryNameT;
    }

    public void setSubCategoryNameT(String subCategoryNameT) {
        this.subCategoryNameT = subCategoryNameT;
    }

    public int getTemplateIdT() {
        return templateIdT;
    }

    public void setTemplateIdT(int templateIdT) {
        this.templateIdT = templateIdT;
    }

    public String getTemplateTextT() {
        return templateTextT;
    }

    public void setTemplateTextT(String templateTextT) {
        this.templateTextT = templateTextT;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTemplateText() {
        return templateText;
    }

    public void setTemplateText(String templateText) {
        this.templateText = templateText;
    }

    public String getAuthStatusM() {
        return authStatusM;
    }

    public void setAuthStatusM(String authStatusM) {
        this.authStatusM = authStatusM;
    }

    public int getApprovalAppM() {
        return approvalAppM;
    }

    public void setApprovalAppM(int approvalAppM) {
        this.approvalAppM = approvalAppM;
    }

    public int getNumberAutoM() {
        return numberAutoM;
    }

    public void setNumberAutoM(int numberAutoM) {
        this.numberAutoM = numberAutoM;
    }

    public String getAuthStatusT() {
        return authStatusT;
    }

    public void setAuthStatusT(String authStatusT) {
        this.authStatusT = authStatusT;
    }

    public int getApprovalAppT() {
        return approvalAppT;
    }

    public void setApprovalAppT(int approvalAppT) {
        this.approvalAppT = approvalAppT;
    }

    public int getNumberAutoT() {
        return numberAutoT;
    }

    public void setNumberAutoT(int numberAutoT) {
        this.numberAutoT = numberAutoT;
    }

    public List getErrorPresent() {
        return errorPresent;
    }

    public void setErrorPresent(List errorPresent) {
        this.errorPresent = errorPresent;
    }

    public int getTsId() {
        return tsId;
    }

    public void setTsId(int tsId) {
        this.tsId = tsId;
    }

    public String getDocumentPath1() {
        return documentPath1;
    }

    public void setDocumentPath1(String documentPath1) {
        this.documentPath1 = documentPath1;
    }

    public String getDocumentPath2() {
        return documentPath2;
    }

    public void setDocumentPath2(String documentPath2) {
        this.documentPath2 = documentPath2;
    }

    public String getDocumentPath3() {
        return documentPath3;
    }

    public void setDocumentPath3(String documentPath3) {
        this.documentPath3 = documentPath3;
    }

    public String getDocumentPathT1() {
        return documentPathT1;
    }

    public void setDocumentPathT1(String documentPathT1) {
        this.documentPathT1 = documentPathT1;
    }

    public String getDocumentPathT2() {
        return documentPathT2;
    }

    public void setDocumentPathT2(String documentPathT2) {
        this.documentPathT2 = documentPathT2;
    }

    public String getDocumentPathT3() {
        return documentPathT3;
    }

    public void setDocumentPathT3(String documentPathT3) {
        this.documentPathT3 = documentPathT3;
    }

    public int getDocumentId1() {
        return documentId1;
    }

    public void setDocumentId1(int documentId1) {
        this.documentId1 = documentId1;
    }

    public int getDocumentId2() {
        return documentId2;
    }

    public void setDocumentId2(int documentId2) {
        this.documentId2 = documentId2;
    }

    public int getDocumentId3() {
        return documentId3;
    }

    public void setDocumentId3(int documentId3) {
        this.documentId3 = documentId3;
    }

    public int getDocumentIdT1() {
        return documentIdT1;
    }

    public void setDocumentIdT1(int documentIdT1) {
        this.documentIdT1 = documentIdT1;
    }

    public int getDocumentIdT2() {
        return documentIdT2;
    }

    public void setDocumentIdT2(int documentIdT2) {
        this.documentIdT2 = documentIdT2;
    }

    public int getDocumentIdT3() {
        return documentIdT3;
    }

    public void setDocumentIdT3(int documentIdT3) {
        this.documentIdT3 = documentIdT3;
    }

    public FormFile getDocument1() {
        return document1;
    }

    public void setDocument1(FormFile document1) {
        this.document1 = document1;
    }

    public FormFile getDocument2() {
        return document2;
    }

    public void setDocument2(FormFile document2) {
        this.document2 = document2;
    }

    public FormFile getDocument3() {
        return document3;
    }

    public void setDocument3(FormFile document3) {
        this.document3 = document3;
    }

    public String getStartDateT() {
        return startDateT;
    }

    public void setStartDateT(String startDateT) {
        this.startDateT = startDateT;
    }

    public String getEndDateT() {
        return endDateT;
    }

    public void setEndDateT(String endDateT) {
        this.endDateT = endDateT;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public String getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(String rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getSecurityPerc() {
        return securityPerc;
    }

    public void setSecurityPerc(String securityPerc) {
        this.securityPerc = securityPerc;
    }

    public String getSecurityAmount() {
        return securityAmount;
    }

    public void setSecurityAmount(String securityAmount) {
        this.securityAmount = securityAmount;
    }

    public String getProcessingPerc() {
        return processingPerc;
    }

    public void setProcessingPerc(String processingPerc) {
        this.processingPerc = processingPerc;
    }

    public String getProcessingAmount() {
        return processingAmount;
    }

    public void setProcessingAmount(String processingAmount) {
        this.processingAmount = processingAmount;
    }

    public String getBankGuaranteePerc() {
        return bankGuaranteePerc;
    }

    public void setBankGuaranteePerc(String bankGuaranteePerc) {
        this.bankGuaranteePerc = bankGuaranteePerc;
    }

    public String getBankGuaranteeAmount() {
        return bankGuaranteeAmount;
    }

    public void setBankGuaranteeAmount(String bankGuaranteeAmount) {
        this.bankGuaranteeAmount = bankGuaranteeAmount;
    }

    public int getDayOfMonthT() {
        return dayOfMonthT;
    }

    public void setDayOfMonthT(int dayOfMonthT) {
        this.dayOfMonthT = dayOfMonthT;
    }

    public FormFile getDocumentT1() {
        return documentT1;
    }

    public void setDocumentT1(FormFile documentT1) {
        this.documentT1 = documentT1;
    }

    public FormFile getDocumentT2() {
        return documentT2;
    }

    public void setDocumentT2(FormFile documentT2) {
        this.documentT2 = documentT2;
    }

    public FormFile getDocumentT3() {
        return documentT3;
    }

    public void setDocumentT3(FormFile documentT3) {
        this.documentT3 = documentT3;
    }

    public int getMraId() {
        return mraId;
    }

    public void setMraId(int mraId) {
        this.mraId = mraId;
    }

    public String getMraEndDate() {
        return mraEndDate;
    }

    public void setMraEndDate(String mraEndDate) {
        this.mraEndDate = mraEndDate;
    }

    public String getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(String overdueRate) {
        this.overdueRate = overdueRate;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getCustOrg() {
        return custOrg;
    }

    public void setCustOrg(String custOrg) {
        this.custOrg = custOrg;
    }

    public String getMraNo() {
        return mraNo;
    }

    public void setMraNo(String mraNo) {
        this.mraNo = mraNo;
    }

    public String getTsNo() {
        return tsNo;
    }

    public void setTsNo(String tsNo) {
        this.tsNo = tsNo;
    }

    public int getApprovalApplicable() {
        return approvalApplicable;
    }

    public void setApprovalApplicable(int approvalApplicable) {
        this.approvalApplicable = approvalApplicable;
    }

    public String[] getAuthStatusFunArr() {
        return authStatusFunArr;
    }

    public void setAuthStatusFunArr(String[] authStatusFunArr) {
        this.authStatusFunArr = authStatusFunArr;
    }

    public int[] getApprovalFunApplicableArr() {
        return approvalFunApplicableArr;
    }

    public void setApprovalFunApplicableArr(int[] approvalFunApplicableArr) {
        this.approvalFunApplicableArr = approvalFunApplicableArr;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int[] getMapIdArr() {
        return mapIdArr;
    }

    public void setMapIdArr(int[] mapIdArr) {
        this.mapIdArr = mapIdArr;
    }

    public int[] getSuperCategoryIdArr() {
        return superCategoryIdArr;
    }

    public void setSuperCategoryIdArr(int[] superCategoryIdArr) {
        this.superCategoryIdArr = superCategoryIdArr;
    }

    public int[] getFunderIdArr() {
        return funderIdArr;
    }

    public void setFunderIdArr(int[] funderIdArr) {
        this.funderIdArr = funderIdArr;
    }

    public int[] getFunderSiteIdArr() {
        return funderSiteIdArr;
    }

    public void setFunderSiteIdArr(int[] funderSiteIdArr) {
        this.funderSiteIdArr = funderSiteIdArr;
    }

    public String[] getSanctionedAmountArr() {
        return sanctionedAmountArr;
    }

    public void setSanctionedAmountArr(String[] sanctionedAmountArr) {
        this.sanctionedAmountArr = sanctionedAmountArr;
    }

    public String[] getStartDateFArr() {
        return startDateFArr;
    }

    public void setStartDateFArr(String[] startDateFArr) {
        this.startDateFArr = startDateFArr;
    }

    public String[] getEndDateFArr() {
        return endDateFArr;
    }

    public void setEndDateFArr(String[] endDateFArr) {
        this.endDateFArr = endDateFArr;
    }

    public int[] getApprovalApplicableArr() {
        return approvalApplicableArr;
    }

    public void setApprovalApplicableArr(int[] approvalApplicableArr) {
        this.approvalApplicableArr = approvalApplicableArr;
    }

    public int[] getApprovalDocApplicableArr() {
        return approvalDocApplicableArr;
    }

    public void setApprovalDocApplicableArr(int[] approvalDocApplicableArr) {
        this.approvalDocApplicableArr = approvalDocApplicableArr;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String[] getCountryNameArr() {
        return countryNameArr;
    }

    public void setCountryNameArr(String[] countryNameArr) {
        this.countryNameArr = countryNameArr;
    }

    public String[] getStateNameArr() {
        return stateNameArr;
    }

    public void setStateNameArr(String[] stateNameArr) {
        this.stateNameArr = stateNameArr;
    }

    public String[] getCityNameArr() {
        return cityNameArr;
    }

    public void setCityNameArr(String[] cityNameArr) {
        this.cityNameArr = cityNameArr;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public String getOuCode() {
        return ouCode;
    }

    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    public String getOuDesc() {
        return ouDesc;
    }

    public void setOuDesc(String ouDesc) {
        this.ouDesc = ouDesc;
    }

    public int getOuStatus() {
        return ouStatus;
    }

    public void setOuStatus(int ouStatus) {
        this.ouStatus = ouStatus;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getEntityDesc() {
        return entityDesc;
    }

    public void setEntityDesc(String entityDesc) {
        this.entityDesc = entityDesc;
    }

    public int getEntityStatus() {
        return entityStatus;
    }

    public void setEntityStatus(int entityStatus) {
        this.entityStatus = entityStatus;
    }

    public int[] getSigDetIdArr() {
        return sigDetIdArr;
    }

    public void setSigDetIdArr(int[] sigDetIdArr) {
        this.sigDetIdArr = sigDetIdArr;
    }

    public String[] getUserTypeArr() {
        return userTypeArr;
    }

    public void setUserTypeArr(String[] userTypeArr) {
        this.userTypeArr = userTypeArr;
    }

    public String[] getUserNameArr() {
        return userNameArr;
    }

    public void setUserNameArr(String[] userNameArr) {
        this.userNameArr = userNameArr;
    }

    public String[] getUserDesignationArr() {
        return userDesignationArr;
    }

    public void setUserDesignationArr(String[] userDesignationArr) {
        this.userDesignationArr = userDesignationArr;
    }

    public String[] getStartDateSigArr() {
        return startDateSigArr;
    }

    public void setStartDateSigArr(String[] startDateSigArr) {
        this.startDateSigArr = startDateSigArr;
    }

    public String[] getEndDateSigArr() {
        return endDateSigArr;
    }

    public void setEndDateSigArr(String[] endDateSigArr) {
        this.endDateSigArr = endDateSigArr;
    }

    public int getSigSaved() {
        return sigSaved;
    }

    public void setSigSaved(int sigSaved) {
        this.sigSaved = sigSaved;
    }

    public int getOtherSaved() {
        return otherSaved;
    }

    public void setOtherSaved(int otherSaved) {
        this.otherSaved = otherSaved;
    }

    public List getFieldList() {
        return fieldList;
    }

    public void setFieldList(List fieldList) {
        this.fieldList = fieldList;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String[] getDesignationArr() {
        return designationArr;
    }

    public void setDesignationArr(String[] designationArr) {
        this.designationArr = designationArr;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public Integer getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Integer isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Integer getIsNameEditable() {
        return isNameEditable;
    }

    public void setIsNameEditable(Integer isNameEditable) {
        this.isNameEditable = isNameEditable;
    }

    public Integer getIsApplicable() {
        return isApplicable;
    }

    public void setIsApplicable(Integer isApplicable) {
        this.isApplicable = isApplicable;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getSerialNo1() {
        return serialNo1;
    }

    public void setSerialNo1(String serialNo1) {
        this.serialNo1 = serialNo1;
    }

    public String getSerialNo2() {
        return serialNo2;
    }

    public void setSerialNo2(String serialNo2) {
        this.serialNo2 = serialNo2;
    }

    public String getSerialNo3() {
        return serialNo3;
    }

    public void setSerialNo3(String serialNo3) {
        this.serialNo3 = serialNo3;
    }

    public String getSerialNo4() {
        return serialNo4;
    }

    public void setSerialNo4(String serialNo4) {
        this.serialNo4 = serialNo4;
    }

    public String getSerialNo5() {
        return serialNo5;
    }

    public void setSerialNo5(String serialNo5) {
        this.serialNo5 = serialNo5;
    }

    public String getSerialNo6() {
        return serialNo6;
    }

    public void setSerialNo6(String serialNo6) {
        this.serialNo6 = serialNo6;
    }

    public String getSerialNo7() {
        return serialNo7;
    }

    public void setSerialNo7(String serialNo7) {
        this.serialNo7 = serialNo7;
    }

    public String getSerialNo8() {
        return serialNo8;
    }

    public void setSerialNo8(String serialNo8) {
        this.serialNo8 = serialNo8;
    }

    public String getSerialNo9() {
        return serialNo9;
    }

    public void setSerialNo9(String serialNo9) {
        this.serialNo9 = serialNo9;
    }

    public String getSerialNo10() {
        return serialNo10;
    }

    public void setSerialNo10(String serialNo10) {
        this.serialNo10 = serialNo10;
    }

    public List<FormFile> getFileArr() {
        return fileArr;
    }

    public void setFileArr(List<FormFile> fileArr) {
        this.fileArr = fileArr;
    }

    public List getDataList5() {
        return dataList5;
    }

    public void setDataList5(List dataList5) {
        this.dataList5 = dataList5;
    }

    public List getDataList6() {
        return dataList6;
    }

    public void setDataList6(List dataList6) {
        this.dataList6 = dataList6;
    }

    public List getDataList7() {
        return dataList7;
    }

    public void setDataList7(List dataList7) {
        this.dataList7 = dataList7;
    }

    public List getDataList8() {
        return dataList8;
    }

    public void setDataList8(List dataList8) {
        this.dataList8 = dataList8;
    }

    public List getDataList9() {
        return dataList9;
    }

    public void setDataList9(List dataList9) {
        this.dataList9 = dataList9;
    }

    public List getDataList10() {
        return dataList10;
    }

    public void setDataList10(List dataList10) {
        this.dataList10 = dataList10;
    }

    public List getDataList11() {
        return dataList11;
    }

    public void setDataList11(List dataList11) {
        this.dataList11 = dataList11;
    }

    public List getDataList12() {
        return dataList12;
    }

    public void setDataList12(List dataList12) {
        this.dataList12 = dataList12;
    }

    public List getDataList13() {
        return dataList13;
    }

    public void setDataList13(List dataList13) {
        this.dataList13 = dataList13;
    }

    public List getDataList14() {
        return dataList14;
    }

    public void setDataList14(List dataList14) {
        this.dataList14 = dataList14;
    }

    public String getGstType() {
        return gstType;
    }

    public void setGstType(String gstType) {
        this.gstType = gstType;
    }

    public String getGstVal() {
        return gstVal;
    }

    public void setGstVal(String gstVal) {
        this.gstVal = gstVal;
    }

    public String[] getGstTypeArr() {
        return gstTypeArr;
    }

    public void setGstTypeArr(String[] gstTypeArr) {
        this.gstTypeArr = gstTypeArr;
    }

    public String[] getGstValArr() {
        return gstValArr;
    }

    public void setGstValArr(String[] gstValArr) {
        this.gstValArr = gstValArr;
    }

    public String[] getAuthStatusDocumentArr() {
        return authStatusDocumentArr;
    }

    public void setAuthStatusDocumentArr(String[] authStatusDocumentArr) {
        this.authStatusDocumentArr = authStatusDocumentArr;
    }

    public int getGstId() {
        return gstId;
    }

    public void setGstId(int gstId) {
        this.gstId = gstId;
    }

    public int[] getGstIdArr() {
        return gstIdArr;
    }

    public void setGstIdArr(int[] gstIdArr) {
        this.gstIdArr = gstIdArr;
    }

    public String[] getEndDateManagerArr() {
        return endDateManagerArr;
    }

    public void setEndDateManagerArr(String[] endDateManagerArr) {
        this.endDateManagerArr = endDateManagerArr;
    }

    public String[] getEndDateGstArr() {
        return endDateGstArr;
    }

    public void setEndDateGstArr(String[] endDateGstArr) {
        this.endDateGstArr = endDateGstArr;
    }

    public String[] getEndDateAddArr() {
        return endDateAddArr;
    }

    public void setEndDateAddArr(String[] endDateAddArr) {
        this.endDateAddArr = endDateAddArr;
    }

    public String[] getStartDateFinArr() {
        return startDateFinArr;
    }

    public void setStartDateFinArr(String[] startDateFinArr) {
        this.startDateFinArr = startDateFinArr;
    }

    public String[] getEndDateFinArr() {
        return endDateFinArr;
    }

    public void setEndDateFinArr(String[] endDateFinArr) {
        this.endDateFinArr = endDateFinArr;
    }

    public String[] getStartDateManagerArr() {
        return startDateManagerArr;
    }

    public void setStartDateManagerArr(String[] startDateManagerArr) {
        this.startDateManagerArr = startDateManagerArr;
    }

    public String[] getStartDateGstArr() {
        return startDateGstArr;
    }

    public void setStartDateGstArr(String[] startDateGstArr) {
        this.startDateGstArr = startDateGstArr;
    }

    public String[] getStartDateAddArr() {
        return startDateAddArr;
    }

    public void setStartDateAddArr(String[] startDateAddArr) {
        this.startDateAddArr = startDateAddArr;
    }

    public int[] getFinDetIdArr() {
        return finDetIdArr;
    }

    public void setFinDetIdArr(int[] finDetIdArr) {
        this.finDetIdArr = finDetIdArr;
    }

    public int[] getAccountManagerIdArr() {
        return accountManagerIdArr;
    }

    public void setAccountManagerIdArr(int[] accountManagerIdArr) {
        this.accountManagerIdArr = accountManagerIdArr;
    }

    public String[] getAccountManagerNameArr() {
        return accountManagerNameArr;
    }

    public void setAccountManagerNameArr(String[] accountManagerNameArr) {
        this.accountManagerNameArr = accountManagerNameArr;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public int[] getDocumentIdArr() {
        return documentIdArr;
    }

    public void setDocumentIdArr(int[] documentIdArr) {
        this.documentIdArr = documentIdArr;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getSiteCount() {
        return siteCount;
    }

    public void setSiteCount(int siteCount) {
        this.siteCount = siteCount;
    }

    public int getContactSaved() {
        return contactSaved;
    }

    public void setContactSaved(int contactSaved) {
        this.contactSaved = contactSaved;
    }

    public int getAddressSaved() {
        return addressSaved;
    }

    public void setAddressSaved(int addressSaved) {
        this.addressSaved = addressSaved;
    }

    public int getDocumentSaved() {
        return documentSaved;
    }

    public void setDocumentSaved(int documentSaved) {
        this.documentSaved = documentSaved;
    }

    public int getGstSaved() {
        return gstSaved;
    }

    public void setGstSaved(int gstSaved) {
        this.gstSaved = gstSaved;
    }

    public int getManagerSaved() {
        return managerSaved;
    }

    public void setManagerSaved(int managerSaved) {
        this.managerSaved = managerSaved;
    }

    public int getFinSaved() {
        return finSaved;
    }

    public void setFinSaved(int finSaved) {
        this.finSaved = finSaved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeNo1() {
        return employeeNo1;
    }

    public void setEmployeeNo1(String employeeNo1) {
        this.employeeNo1 = employeeNo1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(int empTypeId) {
        this.empTypeId = empTypeId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getEntpriseTypeId() {
        return entpriseTypeId;
    }

    public void setEntpriseTypeId(int entpriseTypeId) {
        this.entpriseTypeId = entpriseTypeId;
    }

    public String getEntpriseType() {
        return entpriseType;
    }

    public void setEntpriseType(String entpriseType) {
        this.entpriseType = entpriseType;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getCinNo() {
        return cinNo;
    }

    public void setCinNo(String cinNo) {
        this.cinNo = cinNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getOtherSiteName() {
        return otherSiteName;
    }

    public void setOtherSiteName(String otherSiteName) {
        this.otherSiteName = otherSiteName;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public int getOuId() {
        return ouId;
    }

    public void setOuId(int ouId) {
        this.ouId = ouId;
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getMraDate() {
        return mraDate;
    }

    public void setMraDate(String mraDate) {
        this.mraDate = mraDate;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getBdmId() {
        return bdmId;
    }

    public void setBdmId(int bdmId) {
        this.bdmId = bdmId;
    }

    public String getBdmName() {
        return bdmName;
    }

    public void setBdmName(String bdmName) {
        this.bdmName = bdmName;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(int contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(int addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(int documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public byte getSaltVal() {
        return saltVal;
    }

    public void setSaltVal(byte saltVal) {
        this.saltVal = saltVal;
    }

    public byte getKeyVal() {
        return keyVal;
    }

    public void setKeyVal(byte keyVal) {
        this.keyVal = keyVal;
    }

    public int getEncApplicable() {
        return encApplicable;
    }

    public void setEncApplicable(int encApplicable) {
        this.encApplicable = encApplicable;
    }

    public String getVatRegNo() {
        return vatRegNo;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }

    public String getServiceTaxRegNo() {
        return serviceTaxRegNo;
    }

    public void setServiceTaxRegNo(String serviceTaxRegNo) {
        this.serviceTaxRegNo = serviceTaxRegNo;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getTinNo() {
        return tinNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getOtherNo() {
        return otherNo;
    }

    public void setOtherNo(String otherNo) {
        this.otherNo = otherNo;
    }

    public int[] getStatusArr() {
        return statusArr;
    }

    public void setStatusArr(int[] statusArr) {
        this.statusArr = statusArr;
    }

    public int[] getSiteIdArr() {
        return siteIdArr;
    }

    public void setSiteIdArr(int[] siteIdArr) {
        this.siteIdArr = siteIdArr;
    }

    public String[] getSiteNoArr() {
        return siteNoArr;
    }

    public void setSiteNoArr(String[] siteNoArr) {
        this.siteNoArr = siteNoArr;
    }

    public String[] getSiteNameArr() {
        return siteNameArr;
    }

    public void setSiteNameArr(String[] siteNameArr) {
        this.siteNameArr = siteNameArr;
    }

    public String[] getOtherSiteNameArr() {
        return otherSiteNameArr;
    }

    public void setOtherSiteNameArr(String[] otherSiteNameArr) {
        this.otherSiteNameArr = otherSiteNameArr;
    }

    public String[] getSiteCodeArr() {
        return siteCodeArr;
    }

    public void setSiteCodeArr(String[] siteCodeArr) {
        this.siteCodeArr = siteCodeArr;
    }

    public int[] getOuIdArr() {
        return ouIdArr;
    }

    public void setOuIdArr(int[] ouIdArr) {
        this.ouIdArr = ouIdArr;
    }

    public String[] getAuthStatusArr() {
        return authStatusArr;
    }

    public void setAuthStatusArr(String[] authStatusArr) {
        this.authStatusArr = authStatusArr;
    }

    public String[] getAccountTypeArr() {
        return accountTypeArr;
    }

    public void setAccountTypeArr(String[] accountTypeArr) {
        this.accountTypeArr = accountTypeArr;
    }

    public String[] getBankNameArr() {
        return bankNameArr;
    }

    public void setBankNameArr(String[] bankNameArr) {
        this.bankNameArr = bankNameArr;
    }

    public String[] getBankAddressArr() {
        return bankAddressArr;
    }

    public void setBankAddressArr(String[] bankAddressArr) {
        this.bankAddressArr = bankAddressArr;
    }

    public String[] getBankAccountTypeArr() {
        return bankAccountTypeArr;
    }

    public void setBankAccountTypeArr(String[] bankAccountTypeArr) {
        this.bankAccountTypeArr = bankAccountTypeArr;
    }

    public String[] getAccountHolderNameArr() {
        return accountHolderNameArr;
    }

    public void setAccountHolderNameArr(String[] accountHolderNameArr) {
        this.accountHolderNameArr = accountHolderNameArr;
    }

    public String[] getAccountNoArr() {
        return accountNoArr;
    }

    public void setAccountNoArr(String[] accountNoArr) {
        this.accountNoArr = accountNoArr;
    }

    public String[] getIfscCodeArr() {
        return ifscCodeArr;
    }

    public void setIfscCodeArr(String[] ifscCodeArr) {
        this.ifscCodeArr = ifscCodeArr;
    }

    public String[] getRemarksArr() {
        return remarksArr;
    }

    public void setRemarksArr(String[] remarksArr) {
        this.remarksArr = remarksArr;
    }

    public String[] getStartDateArr() {
        return startDateArr;
    }

    public void setStartDateArr(String[] startDateArr) {
        this.startDateArr = startDateArr;
    }

    public String[] getEndDateArr() {
        return endDateArr;
    }

    public void setEndDateArr(String[] endDateArr) {
        this.endDateArr = endDateArr;
    }

    public String[] getMraDateArr() {
        return mraDateArr;
    }

    public void setMraDateArr(String[] mraDateArr) {
        this.mraDateArr = mraDateArr;
    }

    public int[] getManagerIdArr() {
        return managerIdArr;
    }

    public void setManagerIdArr(int[] managerIdArr) {
        this.managerIdArr = managerIdArr;
    }

    public int[] getBdmIdArr() {
        return bdmIdArr;
    }

    public void setBdmIdArr(int[] bdmIdArr) {
        this.bdmIdArr = bdmIdArr;
    }

    public String[] getBdmNameArr() {
        return bdmNameArr;
    }

    public void setBdmNameArr(String[] bdmNameArr) {
        this.bdmNameArr = bdmNameArr;
    }

    public int[] getContactIdArr() {
        return contactIdArr;
    }

    public void setContactIdArr(int[] contactIdArr) {
        this.contactIdArr = contactIdArr;
    }

    public int[] getContactTypeIdArr() {
        return contactTypeIdArr;
    }

    public void setContactTypeIdArr(int[] contactTypeIdArr) {
        this.contactTypeIdArr = contactTypeIdArr;
    }

    public String[] getContactTypeArr() {
        return contactTypeArr;
    }

    public void setContactTypeArr(String[] contactTypeArr) {
        this.contactTypeArr = contactTypeArr;
    }

    public String[] getContactPersonArr() {
        return contactPersonArr;
    }

    public void setContactPersonArr(String[] contactPersonArr) {
        this.contactPersonArr = contactPersonArr;
    }

    public String[] getAreaCodeArr() {
        return areaCodeArr;
    }

    public void setAreaCodeArr(String[] areaCodeArr) {
        this.areaCodeArr = areaCodeArr;
    }

    public String[] getPhoneNoArr() {
        return phoneNoArr;
    }

    public void setPhoneNoArr(String[] phoneNoArr) {
        this.phoneNoArr = phoneNoArr;
    }

    public String[] getMobileNoArr() {
        return mobileNoArr;
    }

    public void setMobileNoArr(String[] mobileNoArr) {
        this.mobileNoArr = mobileNoArr;
    }

    public String[] getEmailIdArr() {
        return emailIdArr;
    }

    public void setEmailIdArr(String[] emailIdArr) {
        this.emailIdArr = emailIdArr;
    }

    public int[] getAddressIdArr() {
        return addressIdArr;
    }

    public void setAddressIdArr(int[] addressIdArr) {
        this.addressIdArr = addressIdArr;
    }

    public int[] getAddressTypeIdArr() {
        return addressTypeIdArr;
    }

    public void setAddressTypeIdArr(int[] addressTypeIdArr) {
        this.addressTypeIdArr = addressTypeIdArr;
    }

    public String[] getAddressTypeArr() {
        return addressTypeArr;
    }

    public void setAddressTypeArr(String[] addressTypeArr) {
        this.addressTypeArr = addressTypeArr;
    }

    public String[] getAddressLine1Arr() {
        return addressLine1Arr;
    }

    public void setAddressLine1Arr(String[] addressLine1Arr) {
        this.addressLine1Arr = addressLine1Arr;
    }

    public String[] getAddressLine2Arr() {
        return addressLine2Arr;
    }

    public void setAddressLine2Arr(String[] addressLine2Arr) {
        this.addressLine2Arr = addressLine2Arr;
    }

    public String[] getAddressLine3Arr() {
        return addressLine3Arr;
    }

    public void setAddressLine3Arr(String[] addressLine3Arr) {
        this.addressLine3Arr = addressLine3Arr;
    }

    public int[] getCountryIdArr() {
        return countryIdArr;
    }

    public void setCountryIdArr(int[] countryIdArr) {
        this.countryIdArr = countryIdArr;
    }

    public int[] getStateIdArr() {
        return stateIdArr;
    }

    public void setStateIdArr(int[] stateIdArr) {
        this.stateIdArr = stateIdArr;
    }

    public int[] getCityIdArr() {
        return cityIdArr;
    }

    public void setCityIdArr(int[] cityIdArr) {
        this.cityIdArr = cityIdArr;
    }

    public String[] getPincodeArr() {
        return pincodeArr;
    }

    public void setPincodeArr(String[] pincodeArr) {
        this.pincodeArr = pincodeArr;
    }

    public int[] getDocumentTypeIdArr() {
        return documentTypeIdArr;
    }

    public void setDocumentTypeIdArr(int[] documentTypeIdArr) {
        this.documentTypeIdArr = documentTypeIdArr;
    }

    public String[] getDocumentTypeArr() {
        return documentTypeArr;
    }

    public void setDocumentTypeArr(String[] documentTypeArr) {
        this.documentTypeArr = documentTypeArr;
    }

    public String[] getDocumentNameArr() {
        return documentNameArr;
    }

    public void setDocumentNameArr(String[] documentNameArr) {
        this.documentNameArr = documentNameArr;
    }

    public String[] getDocumentPathArr() {
        return documentPathArr;
    }

    public void setDocumentPathArr(String[] documentPathArr) {
        this.documentPathArr = documentPathArr;
    }

    public byte getSaltValArr() {
        return saltValArr;
    }

    public void setSaltValArr(byte saltValArr) {
        this.saltValArr = saltValArr;
    }

    public byte getKeyValArr() {
        return keyValArr;
    }

    public void setKeyValArr(byte keyValArr) {
        this.keyValArr = keyValArr;
    }

    public int[] getEncApplicableArr() {
        return encApplicableArr;
    }

    public void setEncApplicableArr(int[] encApplicableArr) {
        this.encApplicableArr = encApplicableArr;
    }

    public String[] getVatRegNoArr() {
        return vatRegNoArr;
    }

    public void setVatRegNoArr(String[] vatRegNoArr) {
        this.vatRegNoArr = vatRegNoArr;
    }

    public String[] getServiceTaxRegNoArr() {
        return serviceTaxRegNoArr;
    }

    public void setServiceTaxRegNoArr(String[] serviceTaxRegNoArr) {
        this.serviceTaxRegNoArr = serviceTaxRegNoArr;
    }

    public String[] getGstNoArr() {
        return gstNoArr;
    }

    public void setGstNoArr(String[] gstNoArr) {
        this.gstNoArr = gstNoArr;
    }

    public String[] getPanNoArr() {
        return panNoArr;
    }

    public void setPanNoArr(String[] panNoArr) {
        this.panNoArr = panNoArr;
    }

    public String[] getTinNoArr() {
        return tinNoArr;
    }

    public void setTinNoArr(String[] tinNoArr) {
        this.tinNoArr = tinNoArr;
    }

    public String[] getOtherNoArr() {
        return otherNoArr;
    }

    public void setOtherNoArr(String[] otherNoArr) {
        this.otherNoArr = otherNoArr;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public List getDataList1() {
        return dataList1;
    }

    public void setDataList1(List dataList1) {
        this.dataList1 = dataList1;
    }

    public List getDataList2() {
        return dataList2;
    }

    public void setDataList2(List dataList2) {
        this.dataList2 = dataList2;
    }

    public List getDataList3() {
        return dataList3;
    }

    public void setDataList3(List dataList3) {
        this.dataList3 = dataList3;
    }

    public List getDataList4() {
        return dataList4;
    }

    public void setDataList4(List dataList4) {
        this.dataList4 = dataList4;
    }

    public List getValueList1() {
        return valueList1;
    }

    public void setValueList1(List valueList1) {
        this.valueList1 = valueList1;
    }

    public List getValueList2() {
        return valueList2;
    }

    public void setValueList2(List valueList2) {
        this.valueList2 = valueList2;
    }

    public List getValueList3() {
        return valueList3;
    }

    public void setValueList3(List valueList3) {
        this.valueList3 = valueList3;
    }

    public List getValueList4() {
        return valueList4;
    }

    public void setValueList4(List valueList4) {
        this.valueList4 = valueList4;
    }

    public List getCountryList() {
        return countryList;
    }

    public void setCountryList(List countryList) {
        this.countryList = countryList;
    }

    public List getDeptList() {
        return deptList;
    }

    public void setDeptList(List deptList) {
        this.deptList = deptList;
    }

    public List getUserTypeList() {
        return userTypeList;
    }

    public void setUserTypeList(List userTypeList) {
        this.userTypeList = userTypeList;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPage1() {
        return currentPage1;
    }

    public void setCurrentPage1(int currentPage1) {
        this.currentPage1 = currentPage1;
    }

    public List getPaginationList() {
        return paginationList;
    }

    public void setPaginationList(List paginationList) {
        this.paginationList = paginationList;
    }

    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(int recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public int getStartCounter() {
        return startCounter;
    }

    public void setStartCounter(int startCounter) {
        this.startCounter = startCounter;
    }

    public int getEndCounter() {
        return endCounter;
    }

    public void setEndCounter(int endCounter) {
        this.endCounter = endCounter;
    }

    public String getActiveHead() {
        return activeHead;
    }

    public void setActiveHead(String activeHead) {
        this.activeHead = activeHead;
    }

    public String getActiveSideMenu() {
        return activeSideMenu;
    }

    public void setActiveSideMenu(String activeSideMenu) {
        this.activeSideMenu = activeSideMenu;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUname1() {
        return uname1;
    }

    public void setUname1(String uname1) {
        this.uname1 = uname1;
    }

    public String getUpass1() {
        return upass1;
    }

    public void setUpass1(String upass1) {
        this.upass1 = upass1;
    }

    public int getuTypeId1() {
        return uTypeId1;
    }

    public void setuTypeId1(int uTypeId1) {
        this.uTypeId1 = uTypeId1;
    }

    public int getTotalRecords1() {
        return totalRecords1;
    }

    public void setTotalRecords1(int totalRecords1) {
        this.totalRecords1 = totalRecords1;
    }

    public FormFile getImage() {
        return image;
    }

    public void setImage(FormFile image) {
        this.image = image;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public FormFile getAttachment1() {
        return attachment1;
    }

    public void setAttachment1(FormFile attachment1) {
        this.attachment1 = attachment1;
    }

    public String getAttachment1Path() {
        return attachment1Path;
    }

    public void setAttachment1Path(String attachment1Path) {
        this.attachment1Path = attachment1Path;
    }

    public FormFile getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(FormFile attachment2) {
        this.attachment2 = attachment2;
    }

    public String getAttachment2Path() {
        return attachment2Path;
    }

    public void setAttachment2Path(String attachment2Path) {
        this.attachment2Path = attachment2Path;
    }

    public String getValidationVal() {
        return validationVal;
    }

    public void setValidationVal(String validationVal) {
        this.validationVal = validationVal;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCserialNo1() {
        return cserialNo1;
    }

    public void setCserialNo1(String cserialNo1) {
        this.cserialNo1 = cserialNo1;
    }

    public int[] getPkIdArr() {
        return pkIdArr;
    }

    public void setPkIdArr(int[] pkIdArr) {
        this.pkIdArr = pkIdArr;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        SessionForm form = (SessionForm) request.getSession(false).getAttribute("MainForm");
        ActionErrors errors = new ActionErrors();
        UtilityFile uf = new UtilityFile();
        String val = null;
        String arr[] = null;
        String ext = null;
        FormFile file = null;
        String dateVal = null;
        int recCount = 0;
        List errorPresentList = new ArrayList();
        int customerId = this.getUserId();
        int customerSiteId = this.getSiteId();
        Calendar cal = Calendar.getInstance();
        Timestamp selDate1 = null;
        Timestamp selDate2 = null;
        Timestamp today = null;
        today = new Timestamp(System.currentTimeMillis());
        dateVal = today.toString().substring(0, 10);
        today = uf.getDate(dateVal, 0);
        dateVal = null;
        List fields = this.getFieldList();
        LicenseBean bean = null;
        String key = "";
        if (form == null || form.getUserId() == 0) {//if session end by pass validation as check is there for login in action
            return errors;
        }
        if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST"))) {
            if (fields != null && fields.size() > 0) {
                for (int i = 0; i < fields.size(); i++) {
                    bean = (LicenseBean) fields.get(i);
                    if (bean.getField1() == 1 && bean.getField4() != 4 && bean.getIsApplicable() == 1) {//customer
                        switch (bean.getSerialNo()) {
                            case 2:
                                val = this.getEmployeeNo();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "employeeNo";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 3:
                                val = this.getCode();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "code";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 4:
                                val = this.getTitle();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "title";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 5:
                                val = this.getName();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "name";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 6:
                                val = this.getOtherName();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "otherName";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 7:
                                val = this.getDesc();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "desc";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 8:
                                val = this.getEmpType();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "empType";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 9:
                                val = this.getEntpriseType();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "entpriseType";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }

                                break;
                            case 10:
                                val = this.getNatureOfBusiness();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "natureOfBusiness";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }

                                break;
                            case 11:
                                val = this.getDob();
                                if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                    key = "dob";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                } else if (val != null && val.length() > 0) {
                                    selDate1 = uf.getTimestampToSave(val, form.getDateProperty());
                                    if (selDate1 != null && selDate1.after(today)) {
                                        errors.add("dob", new ActionMessage("errors.detail", bean.getFieldName() + " can not be in future"));
                                    }
                                }
                                break;
                            case 12:
                                val = this.getCinNo();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "cinNo";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 85:
                                val = this.getPanNo();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "panNo";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 90:
                                val = this.getTanNo();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "tanNo";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 86:
                                val = this.getWebsite();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "website";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 13:
                                if (bean.getIsMandatory() == 1 && this.getStatus() == 0) {
//                                   errors.add("status", new ActionMessage("errors.required", bean.getFieldName()));
                                }
                                break;
                        }
                    }
                }
            }

        } else if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST_CONTACT"))) {
            recCount = this.getContactSaved();
            if (recCount == 0) {
                errors.add("ContMsgDiv", new ActionMessage("errors.required", "minimum 1 row"));
            }
            for (int j = 0; j < recCount; j++) {
                if (fields != null && fields.size() > 0) {
                    for (int i = 0; i < fields.size(); i++) {
                        bean = (LicenseBean) fields.get(i);
                        if (bean.getField1() == 3 && bean.getField4() != 4 && bean.getIsApplicable() == 1) {//customer site contact
                            switch (bean.getSerialNo()) {
                                case 22:
                                    val = this.getContactTypeArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "contactTypeArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 23:
                                    val = this.getContactPersonArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "contactPersonArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 24:
                                    val = this.getDesignationArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "designationArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 25:
                                    val = this.getAreaCodeArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "areaCodeArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }

                                    break;
                                case 26:
                                    val = this.getPhoneNoArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "phoneNoArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }

                                    break;
                                case 27:
                                    val = this.getMobileNoArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "mobileNoArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    } else if (val != null && val.length() != 10 && val.length() != 12) {
                                        key = "mobileNoArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", bean.getFieldName() + " length should be valid"));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", bean.getFieldName() + " length should be valid"));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 28:
                                    val = this.getEmailIdArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "emailIdArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        } else if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST_ADDRESS"))) {
            recCount = this.getAddressSaved();
            if (recCount == 0) {
                errors.add("AddrMsgDiv", new ActionMessage("errors.required", "minimum 1 row"));
            }
            for (int j = 0; j < recCount; j++) {
                if (fields != null && fields.size() > 0) {
                    for (int i = 0; i < fields.size(); i++) {
                        bean = (LicenseBean) fields.get(i);
                        if (bean.getField1() == 4 && bean.getField4() != 4 && bean.getIsApplicable() == 1) {//customer site address
                            switch (bean.getSerialNo()) {
                                case 30:
                                    val = this.getAddressTypeArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "addressTypeArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 31:
                                    val = this.getAddressLine1Arr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "addressLine1Arr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 32:
                                    val = this.getAddressLine2Arr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "addressLine2Arr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 33:
                                    val = this.getAddressLine3Arr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "addressLine3Arr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 34:
                                    if (bean.getIsMandatory() == 1 && this.getCountryIdArr()[j] == 0) {
                                        key = "countryIdArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 35:
                                    if (bean.getIsMandatory() == 1 && this.getStateIdArr()[j] == 0) {
                                        key = "stateIdArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 36:
                                    if (bean.getIsMandatory() == 1 && this.getCityIdArr()[j] == 0) {
                                        key = "cityIdArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 37:
                                    val = this.getPincodeArr()[j];
                                    if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                        key = "pincodeArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    } else if (val != null && val.length() > 0 && (val.length() > 6 || val.length() < 5)) {
                                        errors.add("pincodeArr" + "[" + j + "]", new ActionMessage("errors.detail", "Invalid value for " + bean.getFieldName()));
                                    }
                                    break;
                                case 38:
                                    val = this.getStartDateAddArr()[j];
                                    if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                        key = "startDateAddArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    }
                                    break;
                                case 39:
                                    val = this.getEndDateAddArr()[j];
                                    if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                        key = "endDateAddArr";
                                        if (messageSetOrBlock == 0) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        } else if (messageSetOrBlock == 1) {
                                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                            errorPresentList.add(key + "[" + j + "]");
                                        }
                                    } else if (this.getStartDateAddArr()[j] != null && this.getStartDateAddArr()[j].length() > 0 && val != null && val.length() > 0) {
                                        selDate1 = uf.getTimestampToSave(this.getStartDateAddArr()[j], form.getDateProperty());
                                        selDate2 = uf.getTimestampToSave(val, form.getDateProperty());
                                        if (selDate1.after(selDate2)) {
                                            errors.add("endDateAddArr" + "[" + j + "]", new ActionMessage("errors.detail", bean.getFieldName() + " can not be before start date."));
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        } else if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST_DOCUMENT"))) {
            recCount = this.getDocumentSaved();
            if (recCount == 0) {
                errors.add("DocMsgDiv", new ActionMessage("errors.required", "minimum 1 row"));
            }
            String chk = null;
            int cbDocArrT[] = this.getCbDocArr();
            for (int j = 0; j < recCount; j++) {
                chk = request.getParameter("cbDocArr[" + j + "]");
                if (chk != null && chk.equalsIgnoreCase("1")) {
                    cbDocArrT[j] = 1;
                } else {
                    cbDocArrT[j] = 0;
                }
            }
            this.setCbDocArr(cbDocArrT);
            //apboolean setUpDone = uf.GetFileAllowedStep1(clientId, "");
            boolean setUpDone = false;
            for (int j = 0; j < recCount; j++) {
                if (this.getCbDocArr()[j] > 0) {
                    if (fields != null && fields.size() > 0) {
                        for (int i = 0; i < fields.size(); i++) {
                            bean = (LicenseBean) fields.get(i);
                            if (bean.getField1() == 5 && bean.getField4() != 4 && bean.getIsApplicable() == 1) {//customer site docs
                                switch (bean.getSerialNo()) {
                                    case 41:
                                        if (bean.getIsMandatory() == 1 && (this.getDocumentTypeIdArr()[j] == 0)) {
                                            key = "documentTypeIdArr";
                                            if (messageSetOrBlock == 0) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                            } else if (messageSetOrBlock == 1) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                                errorPresentList.add(key + "[" + j + "]");
                                            }
                                        }
                                        break;
                                    case 42:
                                        val = this.getDocumentNameArr()[j];
                                        if ((val == null || val.length() == 0) && bean.getIsMandatory() == 1) {
                                            key = "documentNameArr";
                                            if (messageSetOrBlock == 0) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                            } else if (messageSetOrBlock == 1) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                                errorPresentList.add(key + "[" + j + "]");
                                            }
                                        }
                                        break;
                                    case 43:
                                        break;
                                    case 44:
                                        file = this.getFileArr().get(j);
                                        key = "fileArr";
                                        if (bean.getIsMandatory() == 1 && (file == null || file.getFileSize() == 0) && (this.getDocumentPathArr()[j] == null || this.getDocumentPathArr()[j].length() == 0)) {
                                            if (messageSetOrBlock == 0) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                            } else if (messageSetOrBlock == 1) {
                                                errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                                                errorPresentList.add(key + "[" + j + "]");
                                            }
                                        }
                                        key = key + "[" + j + "]";
                                       //ap uf.ValidateFormFile(clientId, key, file, request, uf, setUpDone, errors, errorPresentList, "");
                                        break;
                                    case 45:
                                        val = this.getAuthStatusDocumentArr()[j];
                                        if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
//                                        errors.add("authStatusDocumentArr" + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }        
        } else if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST_OTHER"))) {
            if (fields != null && fields.size() > 0) {
                for (int i = 0; i < fields.size(); i++) {
                    bean = (LicenseBean) fields.get(i);
                    if (bean.getField1() == 10 && bean.getField4() != 4 && bean.getIsApplicable() == 1) {//customer site other details
                        switch (bean.getSerialNo()) {
                            case 75:
                                val = this.getSerialNo1();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo1";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 76:
                                val = this.getSerialNo2();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo2";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 77:
                                val = this.getSerialNo3();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo3";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 78:
                                val = this.getSerialNo4();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo4";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 79:
                                val = this.getSerialNo5();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo5";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 80:
                                val = this.getSerialNo6();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo6";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 81:
                                val = this.getSerialNo7();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo7";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 82:
                                val = this.getSerialNo8();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo8";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 83:
                                val = this.getSerialNo9();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo9";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                            case 84:
                                val = this.getSerialNo10();
                                if (bean.getIsMandatory() == 1 && (val == null || val.length() == 0)) {
                                    key = "serialNo10";
                                    if (messageSetOrBlock == 0) {
                                        errors.add(key, new ActionMessage("errors.required", bean.getFieldName()));
                                    } else if (messageSetOrBlock == 1) {
                                        errors.add(key, new ActionMessage("errors.detail", ""));
                                        errorPresentList.add(key);
                                    }
                                }
                                break;
                        }
                    }
                }
            }
        } else if (this.getAction() != null && (this.getAction().equalsIgnoreCase("CUST_FUNDER"))) {
            recCount = this.getCount();
            if (recCount == 0) {
                errors.add("FundMsgDiv", new ActionMessage("errors.required", "minimum 1 row"));
            }
            String chk = null;
            int cbDocArrT[] = this.getCbFundArr();
            for (int j = 0; j < recCount; j++) {
                chk = request.getParameter("cbFundArr[" + j + "]");
                if (chk != null && chk.equalsIgnoreCase("1")) {
                    cbDocArrT[j] = 1;
                } else {
                    cbDocArrT[j] = 0;
                }
            }
            this.setCbFundArr(cbDocArrT);
            //apboolean setUpDone = uf.GetFileAllowedStep1(clientId, "");
            boolean setUpDone = false;
            for (int j = 0; j < recCount; j++) {
                if (this.getCbFundArr()[j] > 0) {
                    if (this.getFunderIdArr()[j] == 0) {
                        key = "funderIdArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", bean.getFieldName()));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
//                    errors.add("funderIdArr" + "[" + j + "]", new ActionMessage("errors.required", "Funder Id"));
                    }
                    if (this.getFunderSiteIdArr()[j] == 0) {
                        key = "funderSiteIdArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", "Funder Id"));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
//                    errors.add("funderSiteIdArr" + "[" + j + "]", new ActionMessage("errors.required", "Funder Id"));
                    }
                    if (this.getFunderSiteIdArr()[j] == 0) {
                        key = "superCategoryIdArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", "Super Category"));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
//                    errors.add("funderSiteIdArr" + "[" + j + "]", new ActionMessage("errors.required", "Funder Id"));
                    }
                    if (uf.getAmountToSave(this.getFundingRateArr()[j]) == zero) {
                        key = "fundingRateArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", "Rate"));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
                    }
                    if (uf.getAmountToSave(this.getSanctionedAmountArr()[j]) == zero) {
                        key = "sanctionedAmountArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", "Amount"));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
//                    errors.add("sanctionedAmountArr" + "[" + j + "]", new ActionMessage("errors.required", "Amount"));
                    }
                    val = this.getStartDateFArr()[j];
                    if ((val == null || val.length() == 0)) {
                        key = "startDateFArr";
                        if (messageSetOrBlock == 0) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.required", "Start Date"));
                        } else if (messageSetOrBlock == 1) {
                            errors.add(key + "[" + j + "]", new ActionMessage("errors.detail", ""));
                            errorPresentList.add(key + "[" + j + "]");
                        }
//                    errors.add("startDateFArr" + "[" + j + "]", new ActionMessage("errors.required", "Start Date"));
                    }
                    val = this.getEndDateFArr()[j];
                    if ((val == null || val.length() == 0)) {
//                    errors.add("endDateFArr" + "[" + j + "]", new ActionMessage("errors.required", "End Date"));
                    } else if (this.getStartDateFArr()[j] != null && this.getStartDateFArr()[j].length() > 0 && val != null && val.length() > 0) {
                        selDate1 = uf.getTimestampToSave(this.getStartDateFArr()[j], form.getDateProperty());
                        selDate2 = uf.getTimestampToSave(val, form.getDateProperty());
                        if (selDate1.after(selDate2)) {
                            errors.add("endDateFArr" + "[" + j + "]", new ActionMessage("errors.detail", "End date can not be before start date."));
                        }
                    }
                    file = this.getFileArrA().get(j);
                    key = "fileArrA";
                    key = key + "[" + j + "]";
                    //apuf.ValidateFormFile(clientId, key, file, request, uf, setUpDone, errors, errorPresentList, "");
                }
            }
        }

        this.setErrorPresent(errorPresentList);
        return errors;
    }

}
