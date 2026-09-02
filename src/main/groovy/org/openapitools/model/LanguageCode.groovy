package org.openapitools.model;

import groovy.transform.Canonical

enum LanguageCode {

    DE("DE"),
    
    EN("EN"),
    
    FR("FR"),
    
    ES("ES"),
    
    IT("IT"),
    
    NL("NL"),
    
    PL("PL"),
    
    PT("PT"),
    
    TR("TR"),
    
    RU("RU"),
    
    UK("UK"),
    
    CS("CS"),
    
    EL("EL"),
    
    HU("HU"),
    
    RO("RO"),
    
    SV("SV"),
    
    DA("DA"),
    
    FI("FI"),
    
    NO("NO"),
    
    SK("SK"),
    
    SL("SL"),
    
    HR("HR"),
    
    BG("BG"),
    
    ET("ET"),
    
    LV("LV"),
    
    LT("LT"),
    
    MT("MT"),
    
    AR("AR"),
    
    ZH("ZH"),
    
    JA("JA"),
    
    KO("KO"),
    
    TH("TH"),
    
    VI("VI"),
    
    ID("ID"),
    
    HI("HI"),
    
    AB("AB"),
    
    AA("AA"),
    
    AF("AF"),
    
    AK("AK"),
    
    SQ("SQ"),
    
    AM("AM"),
    
    AN("AN"),
    
    HY("HY"),
    
    AS("AS"),
    
    AV("AV"),
    
    AE("AE"),
    
    AY("AY"),
    
    AZ("AZ"),
    
    BM("BM"),
    
    BA("BA"),
    
    EU("EU"),
    
    BE("BE"),
    
    BN("BN"),
    
    BI("BI"),
    
    BS("BS"),
    
    BR("BR"),
    
    MY("MY"),
    
    CA("CA"),
    
    CH("CH"),
    
    CE("CE"),
    
    NY("NY"),
    
    CU("CU"),
    
    CV("CV"),
    
    KW("KW"),
    
    CO("CO"),
    
    CR("CR"),
    
    DV("DV"),
    
    DZ("DZ"),
    
    EO("EO"),
    
    EE("EE"),
    
    FO("FO"),
    
    FJ("FJ"),
    
    FY("FY"),
    
    FF("FF"),
    
    GD("GD"),
    
    GL("GL"),
    
    LG("LG"),
    
    KA("KA"),
    
    KL("KL"),
    
    GN("GN"),
    
    GU("GU"),
    
    HT("HT"),
    
    HA("HA"),
    
    HE("HE"),
    
    HZ("HZ"),
    
    HO("HO"),
    
    IS("IS"),
    
    IO("IO"),
    
    IG("IG"),
    
    IA("IA"),
    
    IE("IE"),
    
    IU("IU"),
    
    IK("IK"),
    
    GA("GA"),
    
    JV("JV"),
    
    KN("KN"),
    
    KR("KR"),
    
    KS("KS"),
    
    KK("KK"),
    
    KM("KM"),
    
    KI("KI"),
    
    RW("RW"),
    
    KY("KY"),
    
    KV("KV"),
    
    KG("KG"),
    
    KJ("KJ"),
    
    KU("KU"),
    
    LO("LO"),
    
    LA("LA"),
    
    LI("LI"),
    
    LN("LN"),
    
    LU("LU"),
    
    LB("LB"),
    
    MK("MK"),
    
    MG("MG"),
    
    MS("MS"),
    
    ML("ML"),
    
    GV("GV"),
    
    MI("MI"),
    
    MR("MR"),
    
    MH("MH"),
    
    MN("MN"),
    
    NA("NA"),
    
    NV("NV"),
    
    ND("ND"),
    
    NR("NR"),
    
    NG("NG"),
    
    NE("NE"),
    
    NB("NB"),
    
    NN("NN"),
    
    OC("OC"),
    
    OJ("OJ"),
    
    OR("OR"),
    
    OM("OM"),
    
    OS("OS"),
    
    PI("PI"),
    
    PS("PS"),
    
    FA("FA"),
    
    PA("PA"),
    
    QU("QU"),
    
    RM("RM"),
    
    RN("RN"),
    
    SE("SE"),
    
    SM("SM"),
    
    SG("SG"),
    
    SA("SA"),
    
    SC("SC"),
    
    SR("SR"),
    
    SN("SN"),
    
    SD("SD"),
    
    SI("SI"),
    
    SO("SO"),
    
    ST("ST"),
    
    SU("SU"),
    
    SW("SW"),
    
    SS("SS"),
    
    TL("TL"),
    
    TY("TY"),
    
    TG("TG"),
    
    TA("TA"),
    
    TT("TT"),
    
    TE("TE"),
    
    BO("BO"),
    
    TI("TI"),
    
    TO("TO"),
    
    TS("TS"),
    
    TN("TN"),
    
    TK("TK"),
    
    TW("TW"),
    
    UG("UG"),
    
    UR("UR"),
    
    UZ("UZ"),
    
    VE("VE"),
    
    VO("VO"),
    
    WA("WA"),
    
    CY("CY"),
    
    WO("WO"),
    
    XH("XH"),
    
    II("II"),
    
    YI("YI"),
    
    YO("YO"),
    
    ZA("ZA"),
    
    ZU("ZU"),
    
    BB("BB"),
    
    CB("CB"),
    
    DB("DB"),
    
    EB("EB"),
    
    FB("FB"),
    
    GB("GB"),
    
    HB("HB"),
    
    IB("IB"),
    
    JB("JB"),
    
    KB("KB"),
    
    MB("MB"),
    
    OB("OB"),
    
    PB("PB"),
    
    QB("QB"),
    
    RB("RB"),
    
    SB("SB"),
    
    TB("TB"),
    
    UB("UB"),
    
    VB("VB"),
    
    WB("WB"),
    
    XB("XB"),
    
    YB("YB"),
    
    ZB("ZB")

    private final String value

    LanguageCode(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
