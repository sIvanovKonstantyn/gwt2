package com.example.foo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface LoginResources extends Messages {

    LoginResources GET = GWT.create(LoginResources.class);

    String login();
    String username();
    String password();
    String usernameRequired();
    String passwordRequired();
    String signIn();
    String logOut();
    String serverError();
    String moduleLoading();

    String welcome();
    String settings();
    String info();
    String roles();
    String rbcRoles();
    String headerVersion();
    String footer();
    String goToTheLoginPage();
    String refresh();
    String rbc();
    String newPayment();
    String paymentHistory();
    String paymentAttributes();
    String wordNew();
    String register();
    String delete();
    String deleteFromRegistry();
    String confirm();
    String close();
    String reopen();
    String add();
    String name();
    String description();
    String nsi();
    String appContext();
    String services();
    String processing();
    String fullName();
    String extServiceId();
    String extCategoryName();
    String csko();
    String servicesSearch();
    String basket();
    String fio();
    String showAccounts();
    String tel();
    String sum();
    String withRegion();
    String searchBoxPlaceHolder();
    String nextElement();
    String nextStep();
    String hideAccounts();
    String hrn();
    String cardNumber();
    String accountNumber();
    String isRoot();
    String rootServiceType();
    String rootServiceId();

    String extVarValue();
    String ok();
    String cancel();
    String connectors();
    String universalConnector();
    String type();
    String url();
    String providerId();
    String imageUrl();
    String checkBalance();
    String sendPaymentReport();
    String getPaymentReport();
    String availableBalance();
    String currency();
    String recordStatus();
    String operation();
    String maker();
    String makerDTStamp();
    String serviceId();
    String serviceName();
    String priority();
    String contactInfo();
    String logLevel();
    String required();
    String requiredFieldsAreEmpty();
    String apiVersion();
    String connVersion();
    String connStatus();
    String connErrorId();
    String connErrorCode();
    String connErrorMsg();
    String sysErrorMsg();
    String connectorId();
    String errors();
    String connectorErrors();
    String connErrorsDescription();
    String requiredInputFields();
    String status();
    String edit();
    String update();
    String reload();
    String upload();
    String event();

    String selectRecordMsg();
    String next();
    String previous();
    String fastForward();
    String firstPage();

    String areYouSureYouWantToDelete();
    String areYouSureYouWantToDeleteSelectedItem();
    String areYouSureYouWantToClose();
    String areYouSureYouWantToCloseSelectedItem();
    String areYouSureYouWantToCloseSelectedItems();
    String areYouSureYouWantToContinue();
    String role();
    String group();
    String ldapRoleMapings();
    String ldapRoleMapingsDescription();
    String roleName();
    String ldapGroup();
    String ldap();
    String extRoleCode();
    String formsMappings();
    String formsMappingsDescription();
    String form();
    String view();
    String availablePermissions();
    String selectedPermissions();
    String disabled();
    String available();
    String selected();
    String details();
    String permissions();
    String forms();
    String roleB();
    String function();
    String subscribe();
    String unsubscribe();
    String connect();
    String disconnect();
    String print();
    String open();
    String payerType();
    String region();
    String serviceDisabled();
    String items();
    String anonymous();
    String patronymic();
    String businessAdministration();
    String businessRules();
    String registries();
    String serviceGroups();
    String serviceSettings();
    String limitsSG();
    String ratesSG();
    String coverageSG();
    String reportFormsSG();
    String save();
    String filter();
    String resetFilter();
    String suspend();
    String saving();
    String dataChanged();
    String saveChanges();


    String footerInfo();
    String footerRbcVersion();
    String toBasket();
    String printDocuments();
    String meetTheBill();
    String serviceAttributes();
    String countersAndAccruals();
    String credited();
    String debt();
    String subsidy();
    String totalAll();
    String all();

    //CSKO dush method
    String cskoPaymentFrom();
    String cskoPaymentTo();
    String cskoPaymentPeriod();
    String cskoRegisterStatusB2();
    String cskoRegisterStatusPU();
    String cskoProcessingComplete();
    String cskoTypeService();
    String cskoCodeRegister();
    String cskoServiceProvider();
    String cskoRerviceProvider();
    String cskoReceiver();
    String cskoService();
    String cskoClear();
    String cskoSearch();
    String cskoGenerateRegister();
    String cskoGenerateReport();
    String cskoJournalRegistry();
    String cskoJournalPayment();
    String cskoReports();
    String cskoJournalActionRegistry();
    String cskoJournalActionPayments();
    String cskoRedefine();
    String cskoRedefinewithoutreq();
    String cskoProcess();
    String cskoGroup();
    String cskoConfirminb2();
    String cskoRegsendinpy();
    String cskoidColumn();
    String cskobatchIdColumn();
    String cskoProviderColumn();
    String cskoPayeeColumn();
    String cskoStatusOdbColumn();
    String cskoStatusSrvColumn();
    String cskoProcessingColumn();
    String cskoPaysCntColumn();
    String cskoNumErrorsColumn();
    String cskoDatefromColumn();
    String cskoDateToColumn();
    String cskoPayNumColumn();
    String cskoServiceColumn();
    String cskoExtServiceColumn();
    String cskoProviderTypeColumn();
    String cskoPaysSumTotalColumn();
    String cskoChargeSrvColumn();
    String cskoChargeOdbColumn();
    String cskoChargePayeeColumn();
    String cskoSumsentSrvColumn();
    String cskoDateSentSrvColumn();
    String cskoDatePayOdbColumn();
    String cskoNotifCodeSrvColumn();
    String cskoBuchSchemeColumn();
    String cskoTypeRegistryColumn();
    String cskoStatusFileColumn();
    String coverageDocumentsAndRegistriesLog();
    String registryCode();
    String processed();
    String paymentsCount();
    String conflictsCount();
    String paymentDateFrom();
    String paymentDateTo();
    String B2OperationInternalCode();
    String extServiceCode();
    String isRootPayment();
    String receivedPaymentsSum();
    String spChargeSum();
    String bankChargesSum();
    String payeeChargeSum();
    String spSentSum();
    String spSendDate();
    String b2ConfirmationDate();
    String spNotificationCode();
    String calculationSchemeCode();
    String payee();
    String generate_form_registry();
    String repeatProcessing();
    String reGenerate_reForm();
    String reGenerate_reForm_withoutCR();
    String confirmInB2();
    String cancelInB2();
    String registryPaymentsPeriod();
    String from();
    String to();
    String conflictsCRAndPaymentsFixing();
    String includePaymentToRegistryById();
    String includeByNumberB2();
    String excludeFromRegistry();
    String resetConflictMark();
    String reGenerateRegistry();
    String rbcPayments();
    String paymentId();
    String paymentSum();
    String paymentDestination();
    String paymentDate();
    String extPaymentId();
    String extPaymentSum();
    String checkWithSP();
    String paymentsLog();
    String confirmPayment();
    String makeRegistry();
    String sendToProcessing();
    String returnFromProcessing();
    String deletePayment();
    String b2PaymentID();
    String serviceProviderPaymentNumber();
    String serviceProvider();
    String coverDt();
    String comAccount();
    String comText();
    String tobo();
    String reportName();
    String reportParameters();
    String generatedReport();
    String cskoReportFileFormat();
    String closeRegistry();
    String modifyPaymentStatuses();
    String modifyPaymentComment();
    String cskoScheduler();
    String cskoSchedulerInterval();
    String cskoJob();
    String cskoJobLastExecutionDate();
    String cskoJobUser();
    String start();
    String stop();
    String setup();
    String archiveData();

    //String paymentDate();
    String bankDate();
    String accountPassingDate();
    String valueDate();
    String payerName();
    String payerAccount();
    String b2PaymentStatus();
    String serviceProviderPaymentStatus();
    String serviceProviderPaymentComment();
    String cardPaymentStatus();
    String paymentAmount();
    String paymentCurrency();
    String channel();
    String toolPayment();
    //String paymentId();
    String clearingFile();
    String authorizationDate();
    String payment();
    String payerInn();
    String payeeAccount();
    String paymentText();
    String cashSymbolDescription();
    String transitAccount();
    String fileRegistriesLog();
    String cskoReportsSP();
    String incorrectPaymentStatusDeletionConfirmation();
    String unsupportedDeletionConfirmation();
    String hasIncorrectPaymentsStatus();
    String hasUnsupportedDelete();
    String registryHistory();
    String showAll();
    String registryPayments();
    String checkResult();
    String paymentSumForProvider();
    String payerChargeSum();
    String paymentCoverage();
    String totalSum();
    String b2DocumentStatus();
    String b2DocumentNumber();
    String registryDetails();
    String sendToSP();
    String paymentRegistryId();
    String processManually();
    String reportsWillBeSentToReceivers();
    String paymentDeletionConfirmation();
    String paymentsDeletionConfirmation();
    String uncreatedB2Payment();
    String operationMessage();
    String servicesGroup();
    String commissionSum_Co();
    String bankCommissionsSum_Bc();
    String aggregatorCommissionSum_Co_Bc();
    String aggregatorCommissionSum_S_KK1();
    String paymentsSum();
    String spCommissionsSum();
    String confirmProviderPayment();
    String paymentCode();
    String serviceCode();
    String erbcStatus();
    String paymentRegistryCode();
    String fileRegistryCode();
    String parentPaymentCode();
    String startDateFilter();
    String endDateFilter();
    String MCCashFormTemplate();
    String MCCurrentAccountFormTemplate();
    String MCCardAccountFormTemplate();

    // BA RB Methods
    String limitServiceGroupId();
    String limitServiceGroupName();
    String limitServiceGroupStatus();
    String groupedLimitServiceId();
    String groupedLimitProviderServiceId();
    String groupedLimitServiceProvider();
    String groupedLimitServiceName();
    String groupedLimitServiceCategory();
    String newLimitServiceGroup();
    String modifyLimitServiceGroup();
    String closeLimitServiceGroup();
    String deleteGroupedLimitService();
    String addGroupedLimitService();
    String dictionaries();
    String providerRegions();
    String provider();
    String universalRegion();
    String providerRegion();
    String serviceRegionMappingClosing();
    String generalizedServices();
    String serviceNameRus();
    String category();
    String providerServiceId();
    String providerCategory();
    String generalizedServiceDetails();
    String serviceCategory();
    String serviceSubCategory();
    String groupServiceMark();
    String suspensionReason();
    String notSpecified();
    String limits();
    String limitId();
    String limitName();
    String actionLevel();
    String levelValue();
    String beginDate();
    String endDate();
    String serviceStandards();
    String newLimit();
    String copyLimit();
    String limitConditions();
    String conditionNumber();
    String paymentTool();
    String salesChannel();
    String payerKind();
    String branch();
    String limitBorder();
    String borderMin();
    String borderMax();
    String period();
    String actionType();
    String promptNotice();
    String limitBorderReachAction();
    String newLimitCondition();
    String serviceStandard();
    String limit();
    String copy();
    String deleting();
    String closing();
    String borderDetails();
    String cardType();
    String limitCondition();
    String tariffCondition();
    String tariff();
    String id();
    String tariffs();
    String tariffConditions();
    String providerType();
    String generalizedService();
    String serviceParameters();
    String serviceLimit();
    String serviceTariff();
    String registerParameters();
    String reportFormsParameters();
    String additionally();
    String parameter();
    String valueFromProvider();
    String service();
    String generalizedServiceId();
    String payeeOKPO();
    String payeeName();
    String payeeBankMFO();
    String payeeBankName();
    String payeeBankAccount();
    String extCategoryId();
    String extCategoryDesc();
    String updateMode();
    String minPaymentAmountInCents();
    String maxPaymentAmountInCents();
    String paymentWithPenny();
    String paymentAmountDifferentFromReceivedInBill();
    String paymentOfBillings();
    String billComment();
    String billSubscribeToDeliveryComment();
    String serviceType();
    String rootServiceCode();
    String modificationNumber();
    String providerAgreement();
    String serviceChannel();
    String cashSymbol();
    String processingMCC();
    String defaultCashSymbol();
    String processingTerminalId();
    String serviceSubcategory();
    String providers();
    String providerServices();
    String providerServiceName();
    String loadServices();
    String agreements();
    String unlinkedServices();
    String confirmation();
    String agreementNumber();
    String link();
    String itemSelectionProposition();
    String noProviders();
    String noAgreements();
    String country();
    String zip();
    String countryRegion();
    String district();
    String city();
    String street();
    String building();
    String appartment();
    String agreementText();
    String clientRepresentative();
    String clientRepresentativePosition();
    String bankRepresentative();
    String bankRepresentativePosition();
    String bankId();
    String selectAgreement();
    String shortName();
    String okpo();
    String registrationAddress();
    String address();
    String suspendText();
    String connector();
    String externalProvider();
    String select();
    String selectProvider();
    String agreement();
    String providerFullName();
    String providerDateFrom();
    String providerDateTo();
    String agreementDateFrom();
    String agreementDateTo();
    String additionalInfo();
    String field0();
    String field1();
    String field2();
    String field3();
    String field4();
    String field5();
    String field6();
    String field7();
    String field8();
    String field9();
    String field10();
    String agreementSelectionProposition();
    String connectorType();
    String serviceShouldBeSaved();
    String providerShouldBeSaved();
    String label();
    String paymentParameters();
    String paymentParameter();
    String hint();
    String mask();
    String regularExpression();
    String minLength();
    String maxLength();
    String orderNumber();
    String activate();
    String tariffServiceGroup();
    String limitServiceGroup();
    String bankMerchantId();
    String balanceTopUp();
    String armMCDisplayOrder();
    String branchCode();
    String accessForBranches();
    String paymentCountFrom();
    String paymentCountTo();
    String paymentSumFrom();
    String paymentSumTo();
    String commissionPercentage();
    String commissionMinSum();
    String commissionMaxSum();
    String fixedComissionSum();
    String mfo();
    String customerName();
    String fixedValue();
    String percent();
    String executeTransaction();
    String executeOnline();
    String registryName();
    String account();
    String collectingAccount();
    String registry();
    String linkBy();
    String registryGroup();
    String calendarType();
    String sendType();
    String schedule();
    String sendingStartDate();
    String startTimePeriod();
    String runTime();
    String registryType();
    String receiverChannel();
    String book();
    String archive();
    String checkRegistryQuery();
    String transactions();
    String accounts();
    String charges();
    String customer();
    String reportTemplate();
    String creationMode();
    String creationPeriod();
    String archivePassword();
    String errorTextForOperator();
    String mailFrom();
    String mailTo();
    String mailCopy();
    String mailSubject();
    String mailBody();
    String deleteMail();
    String paymentDetails();
    String templateName();
    String paymentDetailsTemplate();
    String clear();
    String calculationType();
    String addService();
    String removeService();
    String selectAll();
    String deselect();
    String serviceIdAtRBC();
    String resume();
    String makingConfirmCover();
    String nameOfService();
    String descriptionOfService();
    String close_open();
    String serviceCategories();
    String agreementDate();
    String providerCode();
    String listOfProhibitedRequisites();
    String messageType();
    String templatesOfPaymentPurpose();
    String templateOfPaymentPurpose();
    String transactionCode();
    String transactionName();
    String purposeOfPayment();
    String paymentMethod();
    String messageStatus();
    String errorText();
    String allowAll();
    String typeOfTransaction();
    String addFunction();
    String customMacros();
    String fieldName();
    String filteringCondition();
    String addFromTemplate();
    String macros();
    String directory();
    String customDirectory();
    String addDirectory();
    String nameOfDirectory();
    String reviewFunctions();
    String symbolCounter();
    String limitConditionExclusion();
    String symbolAsteriskReplaceAllSymbollsAllowSetByMask();
    String limitConditionShouldBeSaved();
    String registryFinalStatus();
    String needSendToSP();
    String autofill();
    String displayOrder();
    String alterDate();
    String transliterationName();
    String prohibition();
    String fileRegistryType();
    String linkedRegistries();
    String useEverywhere();
    String baRegistryId();
    String request();
    String response();
    String executionTime();
    String noPermissionForTabsDataCopying();
    String dataWillBeCopiedPartially();
    String accountsDictionary();
    String dictionariesUpdate();
    String userDictionary();
    String changeServicesParameters();
    String сhangeParameters();
    String useExternalCovers();

    //UI Common
    String nlMcPayments();
    String applicationError();
    String userUnAuthorized();
    String code();
    String value();
    String serviceTypeName();
    String providerName();
    String dateTo();
    String dateFrom();
    String override();
    String overload();
    String no();
    String yes();
    String amount();
    String total();
    String mail();
    String phone();
    String create();
    String requiredArgException();
    String numberArgException();
    String error();
    String warning();
    String successfully();
    String message();
    String allowEditing();
    String excludes();
    String finish();
    String reportGeneration();
    String attribute();
    String seconds();

    String bankDictionaries();
    String bankIsntSelected();
    String bankMfo();
    String bankName();
    String uah();
    String armMC();
    String admPage();
    String baPage();
    String cskoPage();
    String odd();
    String sessionId();
    String operationCompletedSuccessfully();
    String number();
    String dateAndTime();
    String notSelected();
    String export();

    String choose();
    String sortASC();
    String sortDESC();
    String showColumn();
    String hideColumn();

    //Payment status
    String statusNew();
    String statusPrepared();
    String statusPaymentMethodShouldBeChanged();
    String statusUnregistered();
    String statusRegistered();
    String statusReady();
    String statusPayed();
    String statusForPrint();
    String statusPrinted();
    String statusForConfirm();
    String statusUnconfirmed();
    String statusConfirmed();

    String balanceLessThanAmount();
    String amountLessThanMin();
    String changeAmount();
    String minPaymentAmountIs();
    String amountMoreThanMax();
    String maxPaymentAmountIs();
    String minValue();
    String maxValue();

    String currentAccLoad();
    String cardAccLoad();
    String accLoad();
    String complete();
    String symbols();

    //Data Validation
    String dvRequiredParameter();
    String dvUnimplementedValidator();
    String dvIncorrectPhoneNumber();
    String dvIncorrectNumberValue();
    String dvIncorrectStringValue();
    String dvStringIsNull();
    String dvIncorrectDateValue();
    String dvDateIsNull();
    String dvRegexIsNull();
    String dvBeginDateMoreThanEndDate();
    String dvValueMustContain();
    String dvRegexNotMatched();

    String templateIsBroken();
    String paramTypeIsNull();
    String paramLabelIsNull();
    String chooseAnotherTemplate();

    String savePassword();
    String saveLogin();
    String saveUserName();
    String saveCredentials();

    String userSettings();
    String regionalSettings();
    String interfaceLanguage();

    String noConditions();
    String newCondition();
    String theFilter();
    String logicalAnd();
    String logicalOr();
    String logicalNot();

    String regulations();
    String dataArchivation();
    String executeArchivation();
    String lastArchivationDate();
    String nextArchivationDate();
    String archivationAvailabilityMessage();

    String paymentParamsSpecificationTitle();
    String multiplePaymentsInNonRootServiceMessage();

    String skoMappings();
    String skoMapping();

    String copyToClipboard();

    String isMultiproviders();
    String isRbcConfigurable();
    String isSupportedGetPayment();
    String isSupportedCancelPayment();
    String isSupportedMailer();
    String projectCode();

    String paymentsCover();

    String finMonCheck();

    String messageTuning();

    String messageTemplates();

    String templateId();

    String messageDesc();

    String messageSource();

    String messageText();

    String theme();

    String returnPayments();

    String addByB2Code();
    String includePayments();
    String excludePayments();
    String excludePaymentQuestion();
    String excludePaymentsQuestion();
    String returnPaymentDetails();

    String foundMoreThanOneReturnPaymentInB2();

    String removeReturnPayment();

    String downloadPayments();
    String documentStateId();
    String operationId();

    String performReturn();
    String performReturnQuestion();
    String returnWithCommission();
    String isReturnPayment();

    String isReturnedToPayer();

    String confirmSpecifiedDataCorrectnessByReturnPaymentAndSourcePayment();
    String areYouSureYouWantToIncludePayments();

    String dayDayReturnPayment();

    String receiver();

    String periodity();

    String coverDocNumber();

    String coverageSGgrouped();

    String reportFormsSGAddService();

    String ratesSGAddServices();

    String servicesAvailable();

    String serviceTemplates();

    String branches();

    String b2NumberDocumentCover();

    String documentCoverDate();

    String pvDate();

    String pvPurposeOfPayment();

    String pvPaymentAmount();

    String pvPayerAccount();

    String pvBankMfo();

    String pvb2DocumentNumber();

    String pvStatus();

    String ipPaymentDate();

    String ipPaymentId();

    String ipB2PaymentNumber();

    String ipB2ConfirmationDate();

    String ipPaymentAmount();

    String ipTransitAccount();

    String ipToolPayment();

    String ipBankMfo();

    String ipPayerName();

    String ipIsProcessed();

    String parentServiceCategoryName();

    String parentServiceCategory();

    String language();

    String forbiddenMethodError();

    String objectIdIsEmpty();

    String chooseBank();

    String b2PaymentNumber();

    String regions();

    String merchants();

    String merchantId();

    String terminalId();

    String mcc();

    String merchantsMapping();

    String informationAboutIP();

    String maxQuantityOfIntervalsIs();

    String requiredTimeFormat();

    String withDelimiter();

    String paymentIdInRBCForIp();

    String objectStateChanged();

    String comments();

    String providerSName();
}
