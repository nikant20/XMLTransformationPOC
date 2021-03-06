//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.18 at 12:24:45 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flhk.webservice.flhkwebservice._1 package. 
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

    private final static QName _ApplicationOther_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "applicationOther");
    private final static QName _UpdateAccountDataResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "updateAccountDataResponse");
    private final static QName _ViewAccountDataResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "viewAccountDataResponse");
    private final static QName _SubmitApplication_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "submitApplication");
    private final static QName _SubmitRenewal_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "submitRenewal");
    private final static QName _AuthenticateAccount_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "authenticateAccount");
    private final static QName _SubmitRenewalResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "submitRenewalResponse");
    private final static QName _SubmitApplicationResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "submitApplicationResponse");
    private final static QName _UpdateAccountData_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "updateAccountData");
    private final static QName _ViewRenewalResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "viewRenewalResponse");
    private final static QName _ViewRenewal_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "viewRenewal");
    private final static QName _FamilyAccountId_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "familyAccountId");
    private final static QName _AuthenticateAccountResponse_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "authenticateAccountResponse");
    private final static QName _ViewAccountData_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "viewAccountData");
    private final static QName _IsAlive_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "isAlive");
    private final static QName _ApplicationChild_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "applicationChild");
    private final static QName _Application_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "application");
    private final static QName _ApplicationParent_QNAME = new QName("http://webservice.flhk.com/FLHKWebService/1.0", "applicationParent");
    private final static QName _AuthenticateAccountParentSSN_QNAME = new QName("", "parentSSN");
    private final static QName _AuthenticateAccountParentDOB_QNAME = new QName("", "parentDOB");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flhk.webservice.flhkwebservice._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link ChildMember }
     * 
     */
    public ChildMember createChildMember() {
        return new ChildMember();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link AuthenticateAccount }
     * 
     */
    public AuthenticateAccount createAuthenticateAccount() {
        return new AuthenticateAccount();
    }

    /**
     * Create an instance of {@link UpdateAccountData }
     * 
     */
    public UpdateAccountData createUpdateAccountData() {
        return new UpdateAccountData();
    }

    /**
     * Create an instance of {@link ViewRenewalResponse }
     * 
     */
    public ViewRenewalResponse createViewRenewalResponse() {
        return new ViewRenewalResponse();
    }

    /**
     * Create an instance of {@link SubmitRenewalResponse }
     * 
     */
    public SubmitRenewalResponse createSubmitRenewalResponse() {
        return new SubmitRenewalResponse();
    }

    /**
     * Create an instance of {@link SubmitApplicationResponse }
     * 
     */
    public SubmitApplicationResponse createSubmitApplicationResponse() {
        return new SubmitApplicationResponse();
    }

    /**
     * Create an instance of {@link SubmitApplication }
     * 
     */
    public SubmitApplication createSubmitApplication() {
        return new SubmitApplication();
    }

    /**
     * Create an instance of {@link ApplicationOther }
     * 
     */
    public ApplicationOther createApplicationOther() {
        return new ApplicationOther();
    }

    /**
     * Create an instance of {@link UpdateAccountDataResponse }
     * 
     */
    public UpdateAccountDataResponse createUpdateAccountDataResponse() {
        return new UpdateAccountDataResponse();
    }

    /**
     * Create an instance of {@link ViewAccountDataResponse }
     * 
     */
    public ViewAccountDataResponse createViewAccountDataResponse() {
        return new ViewAccountDataResponse();
    }

    /**
     * Create an instance of {@link IsAliveResponse }
     * 
     */
    public IsAliveResponse createIsAliveResponse() {
        return new IsAliveResponse();
    }

    /**
     * Create an instance of {@link SubmitRenewal }
     * 
     */
    public SubmitRenewal createSubmitRenewal() {
        return new SubmitRenewal();
    }

    /**
     * Create an instance of {@link ViewAccountData }
     * 
     */
    public ViewAccountData createViewAccountData() {
        return new ViewAccountData();
    }

    /**
     * Create an instance of {@link AuthenticateAccountResponse }
     * 
     */
    public AuthenticateAccountResponse createAuthenticateAccountResponse() {
        return new AuthenticateAccountResponse();
    }

    /**
     * Create an instance of {@link ApplicationParent }
     * 
     */
    public ApplicationParent createApplicationParent() {
        return new ApplicationParent();
    }

    /**
     * Create an instance of {@link ApplicationChild }
     * 
     */
    public ApplicationChild createApplicationChild() {
        return new ApplicationChild();
    }

    /**
     * Create an instance of {@link ViewRenewal }
     * 
     */
    public ViewRenewal createViewRenewal() {
        return new ViewRenewal();
    }

    /**
     * Create an instance of {@link UnearnedIncome }
     * 
     */
    public UnearnedIncome createUnearnedIncome() {
        return new UnearnedIncome();
    }

    /**
     * Create an instance of {@link AccountContactInfo }
     * 
     */
    public AccountContactInfo createAccountContactInfo() {
        return new AccountContactInfo();
    }

    /**
     * Create an instance of {@link OtherMember }
     * 
     */
    public OtherMember createOtherMember() {
        return new OtherMember();
    }

    /**
     * Create an instance of {@link InsuranceInfo }
     * 
     */
    public InsuranceInfo createInsuranceInfo() {
        return new InsuranceInfo();
    }

    /**
     * Create an instance of {@link HealthPlanChangeRequest }
     * 
     */
    public HealthPlanChangeRequest createHealthPlanChangeRequest() {
        return new HealthPlanChangeRequest();
    }

    /**
     * Create an instance of {@link MonthlyEnrollment }
     * 
     */
    public MonthlyEnrollment createMonthlyEnrollment() {
        return new MonthlyEnrollment();
    }

    /**
     * Create an instance of {@link ParentMember }
     * 
     */
    public ParentMember createParentMember() {
        return new ParentMember();
    }

    /**
     * Create an instance of {@link AccountMissingInfo }
     * 
     */
    public AccountMissingInfo createAccountMissingInfo() {
        return new AccountMissingInfo();
    }

    /**
     * Create an instance of {@link Confirmation }
     * 
     */
    public Confirmation createConfirmation() {
        return new Confirmation();
    }

    /**
     * Create an instance of {@link Expense }
     * 
     */
    public Expense createExpense() {
        return new Expense();
    }

    /**
     * Create an instance of {@link ExpenseMissingInfo }
     * 
     */
    public ExpenseMissingInfo createExpenseMissingInfo() {
        return new ExpenseMissingInfo();
    }

    /**
     * Create an instance of {@link IncomeMissingInfo }
     * 
     */
    public IncomeMissingInfo createIncomeMissingInfo() {
        return new IncomeMissingInfo();
    }

    /**
     * Create an instance of {@link HealthPlan }
     * 
     */
    public HealthPlan createHealthPlan() {
        return new HealthPlan();
    }

    /**
     * Create an instance of {@link Income }
     * 
     */
    public Income createIncome() {
        return new Income();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link CalendarMonth }
     * 
     */
    public CalendarMonth createCalendarMonth() {
        return new CalendarMonth();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link HouseholdCareExpense }
     * 
     */
    public HouseholdCareExpense createHouseholdCareExpense() {
        return new HouseholdCareExpense();
    }

    /**
     * Create an instance of {@link EarnedIncome }
     * 
     */
    public EarnedIncome createEarnedIncome() {
        return new EarnedIncome();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link SubmitAppResult }
     * 
     */
    public SubmitAppResult createSubmitAppResult() {
        return new SubmitAppResult();
    }

    /**
     * Create an instance of {@link MemberMissingInfo }
     * 
     */
    public MemberMissingInfo createMemberMissingInfo() {
        return new MemberMissingInfo();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link ChildSupportIncome }
     * 
     */
    public ChildSupportIncome createChildSupportIncome() {
        return new ChildSupportIncome();
    }

    /**
     * Create an instance of {@link AccountData.Members }
     * 
     */
    public AccountData.Members createAccountDataMembers() {
        return new AccountData.Members();
    }

    /**
     * Create an instance of {@link com.flhk.webservice.flhkwebservice._1.Member.Expenses }
     * 
     */
    public com.flhk.webservice.flhkwebservice._1.Member.Expenses createMemberExpenses() {
        return new com.flhk.webservice.flhkwebservice._1.Member.Expenses();
    }

    /**
     * Create an instance of {@link com.flhk.webservice.flhkwebservice._1.Member.IncomeMissingInfoItems }
     * 
     */
    public com.flhk.webservice.flhkwebservice._1.Member.IncomeMissingInfoItems createMemberIncomeMissingInfoItems() {
        return new com.flhk.webservice.flhkwebservice._1.Member.IncomeMissingInfoItems();
    }

    /**
     * Create an instance of {@link com.flhk.webservice.flhkwebservice._1.Member.ExpenseMissingInfoItems }
     * 
     */
    public com.flhk.webservice.flhkwebservice._1.Member.ExpenseMissingInfoItems createMemberExpenseMissingInfoItems() {
        return new com.flhk.webservice.flhkwebservice._1.Member.ExpenseMissingInfoItems();
    }

    /**
     * Create an instance of {@link com.flhk.webservice.flhkwebservice._1.Member.Incomes }
     * 
     */
    public com.flhk.webservice.flhkwebservice._1.Member.Incomes createMemberIncomes() {
        return new com.flhk.webservice.flhkwebservice._1.Member.Incomes();
    }

    /**
     * Create an instance of {@link ChildMember.AvailableMedicalPlans }
     * 
     */
    public ChildMember.AvailableMedicalPlans createChildMemberAvailableMedicalPlans() {
        return new ChildMember.AvailableMedicalPlans();
    }

    /**
     * Create an instance of {@link ChildMember.AvailableDentalPlans }
     * 
     */
    public ChildMember.AvailableDentalPlans createChildMemberAvailableDentalPlans() {
        return new ChildMember.AvailableDentalPlans();
    }

    /**
     * Create an instance of {@link Application.Applicants }
     * 
     */
    public Application.Applicants createApplicationApplicants() {
        return new Application.Applicants();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationOther }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "applicationOther")
    public JAXBElement<ApplicationOther> createApplicationOther(ApplicationOther value) {
        return new JAXBElement<ApplicationOther>(_ApplicationOther_QNAME, ApplicationOther.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "updateAccountDataResponse")
    public JAXBElement<UpdateAccountDataResponse> createUpdateAccountDataResponse(UpdateAccountDataResponse value) {
        return new JAXBElement<UpdateAccountDataResponse>(_UpdateAccountDataResponse_QNAME, UpdateAccountDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAccountDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "viewAccountDataResponse")
    public JAXBElement<ViewAccountDataResponse> createViewAccountDataResponse(ViewAccountDataResponse value) {
        return new JAXBElement<ViewAccountDataResponse>(_ViewAccountDataResponse_QNAME, ViewAccountDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "submitApplication")
    public JAXBElement<SubmitApplication> createSubmitApplication(SubmitApplication value) {
        return new JAXBElement<SubmitApplication>(_SubmitApplication_QNAME, SubmitApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitRenewal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "submitRenewal")
    public JAXBElement<SubmitRenewal> createSubmitRenewal(SubmitRenewal value) {
        return new JAXBElement<SubmitRenewal>(_SubmitRenewal_QNAME, SubmitRenewal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "authenticateAccount")
    public JAXBElement<AuthenticateAccount> createAuthenticateAccount(AuthenticateAccount value) {
        return new JAXBElement<AuthenticateAccount>(_AuthenticateAccount_QNAME, AuthenticateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitRenewalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "submitRenewalResponse")
    public JAXBElement<SubmitRenewalResponse> createSubmitRenewalResponse(SubmitRenewalResponse value) {
        return new JAXBElement<SubmitRenewalResponse>(_SubmitRenewalResponse_QNAME, SubmitRenewalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "submitApplicationResponse")
    public JAXBElement<SubmitApplicationResponse> createSubmitApplicationResponse(SubmitApplicationResponse value) {
        return new JAXBElement<SubmitApplicationResponse>(_SubmitApplicationResponse_QNAME, SubmitApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "updateAccountData")
    public JAXBElement<UpdateAccountData> createUpdateAccountData(UpdateAccountData value) {
        return new JAXBElement<UpdateAccountData>(_UpdateAccountData_QNAME, UpdateAccountData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewRenewalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "viewRenewalResponse")
    public JAXBElement<ViewRenewalResponse> createViewRenewalResponse(ViewRenewalResponse value) {
        return new JAXBElement<ViewRenewalResponse>(_ViewRenewalResponse_QNAME, ViewRenewalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewRenewal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "viewRenewal")
    public JAXBElement<ViewRenewal> createViewRenewal(ViewRenewal value) {
        return new JAXBElement<ViewRenewal>(_ViewRenewal_QNAME, ViewRenewal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "familyAccountId")
    public JAXBElement<Long> createFamilyAccountId(Long value) {
        return new JAXBElement<Long>(_FamilyAccountId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "authenticateAccountResponse")
    public JAXBElement<AuthenticateAccountResponse> createAuthenticateAccountResponse(AuthenticateAccountResponse value) {
        return new JAXBElement<AuthenticateAccountResponse>(_AuthenticateAccountResponse_QNAME, AuthenticateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAccountData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "viewAccountData")
    public JAXBElement<ViewAccountData> createViewAccountData(ViewAccountData value) {
        return new JAXBElement<ViewAccountData>(_ViewAccountData_QNAME, ViewAccountData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "isAlive")
    public JAXBElement<Object> createIsAlive(Object value) {
        return new JAXBElement<Object>(_IsAlive_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationChild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "applicationChild")
    public JAXBElement<ApplicationChild> createApplicationChild(ApplicationChild value) {
        return new JAXBElement<ApplicationChild>(_ApplicationChild_QNAME, ApplicationChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "application")
    public JAXBElement<Application> createApplication(Application value) {
        return new JAXBElement<Application>(_Application_QNAME, Application.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationParent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", name = "applicationParent")
    public JAXBElement<ApplicationParent> createApplicationParent(ApplicationParent value) {
        return new JAXBElement<ApplicationParent>(_ApplicationParent_QNAME, ApplicationParent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parentSSN", scope = AuthenticateAccount.class)
    public JAXBElement<String> createAuthenticateAccountParentSSN(String value) {
        return new JAXBElement<String>(_AuthenticateAccountParentSSN_QNAME, String.class, AuthenticateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parentDOB", scope = AuthenticateAccount.class)
    public JAXBElement<XMLGregorianCalendar> createAuthenticateAccountParentDOB(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AuthenticateAccountParentDOB_QNAME, XMLGregorianCalendar.class, AuthenticateAccount.class, value);
    }

}
