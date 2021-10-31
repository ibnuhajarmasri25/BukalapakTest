package configs;

public class ElementInspect {

    public static final String xpathEmailNew = "//input[contains(@class,'bl-text-field__input')]";
    public static final String xpathNext = "//span[contains(.,'Daftar')]";
//            "//input[contains(@id,'email_or_phone')]";
    public static final String xpathValidAlreadyEmail = "";
    public static final String sendCode = "//span[contains(.,'Ya, kirim kode')]";

    public static final String xpathLoginPage = "(//p[contains(@class,'pr-4 sigil-header__nav-action bl-text bl-text--body-small bl-text--semi-bold')])[2]";
    public static final String xpathValidationLogin = "//p[@class='mv-48 transition__basic bl-text bl-text--subheading-1 bl-text--center bl-text--semi-bold'][contains(.,'Login dulu, yuk')]";
//            "//div[@class='o-layout o-layout--responsive u-align-center'][contains(.,'Silakan masuk ke dalam akun kamu')]";
    public static final String xpathUsername = "//input[contains(@id,'user_identity_textfield')]";
    public static final String xpathSubmitNext = "//button[contains(@id,'submit_button')]";
    public static final String xpathPassword = "//input[contains(@id,'input-password')]";
    public static final String RememberMe = "//input[contains(@id,'user_session_remember_me')]";
    public static final String clickLogin = "//button[contains(@id,'btn-login')]";
    public static final String searchType = "//input[contains(@id,'v-omnisearch__input')]";
    public static final String submitSearch = "(//div[contains(@class,'v-omnisearch-result--keyword')])[1]";
    //            "(//span[contains(@class,'filter-txt-gray')])[1]";
    public static final String searchResult = "//p[@class='bl-text bl-text--subheading-3'][contains(.,'Hasil pencarian')]";
    public static final String xpathHome = "//img[@src='https://s1.bukalapak.com/ast/sigil/bukalapak-logo-primary.svg']";
    public static final String xpathClickBarang = "(//img[contains(@class,'bl-thumbnail--img')])[2]";
    public static final String xpathAddtoChart = "(//button[contains(.,'Masukkan Keranjang')])[2]";
    public static final String xpathAvatar     = "//div[contains(@class,'bl-avatar sigil-avatar')]";
    public static final String xpathLogout1     = "//div[@class='bl-list-item__title'][contains(.,'Logout')]";
    public static final String xpathclose       = "//span[@class='c-icon c-icon--base c-icon--close']";
    public static final String xpathRegistration = "(//p[contains(@class,'pr-4 sigil-header__nav-action bl-text bl-text--body-small bl-text--semi-bold')])[1]";
    public static final String xpathFullname = "//input[contains(@id,'user_name')]";
    public static final String getXpathValidAlreadyEmail = "//p[contains(.,'Akun sudah terdaftar')]";
    public static final String xpathLoginTab      = "//span[contains(.,'Login')]";
}
