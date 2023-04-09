package pages.merchantpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Attributes_Food {
    public Attributes_Food() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage = new SignUp_Login_DashboardHomePage();
    @FindBy(xpath = "//a[text()='Food']")//merchant girişten sonra cıkan food sekmesi
    public  WebElement foodlink;
@FindBy (xpath = "//a[text()='Items']")//food/items sekmesii
public WebElement FoodItemsLink;

    @FindBy(xpath = "//a[text()='Category']")//merchant firisten sonra food/category sekmesi
    public  WebElement foodCategoryLink;
    @FindBy(xpath = "//div[@class='p-2']")//merchant giris yapıldıktan   sonra sekmelerden -->food/category
    public  WebElement categoryAddLink;
    @FindBy(xpath = "//i[@class='zmdi zmdi-sort-asc']")//merchant giris yapıldıktan   sonra sekmelerden -->food/category
    // sayfasındaki ilk cıkan ADDNEW --> butonunun yanındaki "SHORT"
    public  WebElement categoryShortLink;
    @FindBy (xpath = "(//img[@class='rounded float-left cursor-pointer'])[1]")
    public WebElement category_short_FirsImage;
    @FindBy(xpath = "//a[@href='/backoffice/food/category_update/id/89']")
    //merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //menulerin en sağındaki düzenle kalem işareti "UPDATE"butonu
    public  WebElement categoryUpdate;
    @FindBy (xpath = "//i[@class='zmdi zmdi-info-outline']")
    public WebElement Update_Details;
    @FindBy(xpath = "(//i[@class='zmdi zmdi-delete'])[1]")///merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //menulerin en sağındaki düzenle kalem işareti "update"butonunun yanındaki "DELETE" butonu"
    public  WebElement categoryDelete;
    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement categoryDelete_textCon;
    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement category_next_Show_text;
    @FindBy(xpath = "//input[@type='search']")////merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //sag üstteki SEARCH " butonu TEXT YAZI GİRME ALANI
    public  WebElement categorySearchtext;
    @FindBy(xpath = "//i[@class='zmdi zmdi-search']")//merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //sag üstteki SEARCH " butonu TEXT YAZI GİRME ALANININ yanındaki MERCEK İŞARETİ
    public  WebElement categorySearchButton;
    @FindBy(xpath = "//tbody//h6[1]")
    public WebElement serch_first_name;
    @FindBy(xpath = "//a[text()='Next']")///merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //sayfanın en altındaki NEXT button
    public  WebElement categoryNextButton;
    @FindBy(xpath = "//a[text()='Previous']")///merchant giris yapıldıktan   sonra sekmelerden -->food/category
    //sayfanın en altındaki Previous button
    public  WebElement categoryPreviousButton;
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")//food/category/add new/name alanı
    public  WebElement categoryAddname;
@FindBy(xpath = "//textarea[@placeholder='Description']")//food/category/add new/Descriptionalanı
public WebElement categoryAddDescription;
@FindBy(xpath = "//span[@role='combobox']")
public WebElement categoryAddDishtextButton;
@FindBy(xpath = "//li[@class='select2-selection__choice']")
public WebElement categoryAddDishMealsText;
@FindBy(xpath = "//li[@role='option']")
public  WebElement category_Add_Dish_meals_click;
@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]/h6")
public WebElement newCategory;

@FindBy(xpath = "(//button[text()='Browse'])[1]")//food/category/add new/ilk featured browsebutton
public WebElement categoryaddFirstBrowseButton;
@FindBy(xpath = "(//img[@src='https://qa.mealscenter.com/backoffice/../upload/2/0b23bedc-c732-11ed-ac97-2cea7f508bb0.jpg'])[1]")
public WebElement categoryBroser_FirstImage;
@FindBy(xpath = "//img[@class='rounded']")
public WebElement categoryUploadedImage;
@FindBy(xpath = "//span[text()='Add Files']")
public WebElement firtsImage_AddFilesButton;

    @FindBy(xpath = "(//button[text()='Browse'])[2]")////food/category/add new/ilk icon browsebutton
    public WebElement categoryaddsecondBrowseButton;
    @FindBy (xpath = "//input[@type='submit']")//food/category/add new/submit buton
    public WebElement categoryAddSubmitButton;
    @FindBy(xpath = "//a[text()='All Category']")//catyegoride new menu ekledikten sonra submit e bastıktan sonra
    public WebElement categorySubmit_and_ReturnallCategorys;
    @FindBy (xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement categoryDelete_delete_buton;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement categoryAddWrongText;
    @FindBy(xpath = "//select[@id='AR_category_status']")
public WebElement categoryAddStatusButton;
    @FindBy(xpath = "//option[.='Draft']")
    public WebElement category_ADDStatusText;
    @FindBy (xpath = "//option[@value='draft']")
    public WebElement categoryAddDraftText;
    @FindBy(xpath = "(//img[@src='https://qa.mealscenter.com/backoffice/../upload/2/0b23bedc-c732-11ed-ac97-2cea7f508bb0.jpg'])[1]")
    public  WebElement categoryAddBrowserFirstImage;

    @FindBy(xpath = "(//i[@class='zmdi zmdi-border-color'])[1]")//items/kalem butonu
    public WebElement Food_Items_CreateButton;
    @FindBy(xpath = "//i[@class='zmdi zmdi-info-outline']")
    public WebElement Food_Items_Create_detailsButton;
    @FindBy(xpath = "//input[@name='yt0']")
    public WebElement Food_Items__Create_submit;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public  WebElement Food_Items__create_alert;
    @FindBy(xpath = "//select[@id='AR_item_status']")
    public WebElement Food_Items_Create_Status_button;
    @FindBy(xpath = " @FindBy(xpath = \"//select[@id='AR_item_status']\")")
    public WebElement Food_Items_Create_Status_draft;
    @FindBy (xpath = "//input[@id='AR_item_color_hex']")
    public WebElement Food_ItemsCreColorButton;

    @FindBy (xpath = "//textarea[@id='AR_item_item_short_description']")
    public WebElement Food_ItemsCreshodesButton;
    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement Food_ItemsCreLongButton;
    @FindBy(xpath = "//select[@id='AR_item_item_unit']")
    public WebElement Food_CreateSelectButton;
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[1]")
    public WebElement Food_Create_Itemprice;
    @FindBy (xpath = "//button[normalize-space()='Browse']")
    public WebElement FoodCr_Brow_But;
    @FindBy (xpath = "(//img[@src='https://qa.mealscenter.com/backoffice/../upload/2/0b23bedc-c732-11ed-ac97-2cea7f508bb0.jpg'])"
    )
    public WebElement Fo_Cr_Neximage;
    @FindBy (xpath = "(//button[@class='btn btn-green'])[2]")
    public WebElement Food_CreNewimageADD;
    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement Fo_creaddItemsTrans;
    @FindBy(xpath = "//h6[normalize-space()='Japanese translation']")
    public WebElement Fo_Cre_TransClass;
    @FindBy(xpath = "//img[@class='rounded']")
            public WebElement NewImageshow;
    @FindBy(xpath = "//option[.='Junior']")
    public WebElement Food_CreateSelectButton_Junior;
    @FindBy(xpath = "//span[@title='black']//span[@class='sp-thumb-inner']")
    public WebElement Food_CreColorBlack;
    @FindBy (xpath = "(//a[@class='ref_delete normal btn btn-light tool_tips'])[1]")//items/delete butonu
    public WebElement Food_Items_Deletebutton;
    @FindBy(xpath = "//i[@class='zmdi zmdi-sort-asc']")//items short butoon
public WebElement Food_Items_ShortButton;

    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")//ıtems addbutonu
    public WebElement Food_Items_AddButton;
    @FindBy(xpath = "//a[.='Details']")
    public WebElement Food_Add_Details;
    @FindBy (xpath = "//input[@type='search']")//ıtemsearch çalışmayan yer
    public WebElement Food_Items_SearchText;
    @FindBy(xpath ="//th[text()='Category']")//sağ üst categoti itemsda
    public  WebElement Food_Items_CategoryButonu;
    @FindBy(xpath = "//h6[text()='Crispy Garlic Chicken']")//sağ üst i name butonu
    public WebElement Food_Items_avaible_First;
    @FindBy(xpath = "(//th[@class='sorting'])[1]") //items--sağ üst avaible
    public WebElement Food_Items_AvaibleButton;

    @FindBy(xpath = "//a[text()='Next']")//items en altta next button
    public WebElement Food_Items_nextButton;
    @FindBy (xpath = "//a[text()='Previous']")//items en altta previous butonu
    public WebElement Food_Items_PreviousButton;





    public void  foodAddnewLink(){//food_ItemsaddNewtıklama
    Attributes_Food attributesFood = new Attributes_Food();
    foodItemsGiris();
    attributesFood. Food_Items_AddButton.click();

}
    public void foodItemsGiris(){//food/ıtems sekme tıklama
        Attributes_Food attributesFood = new Attributes_Food();
        foodGiris();
        attributesFood.FoodItemsLink.click();

    }

    public  void foodGiris() {//food'a tıklama
        SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage = new SignUp_Login_DashboardHomePage();
        Attributes_Food attributesFood = new Attributes_Food();
        SignUp_Login_DashboardHomePage.loginMethod();
        foodlink.click();
    }
    public  void foodCategoryGiris() {//thaiAdmin merchantSayfası /sol alttaki seçeneklerden--> Food/altındaki /Category bolumunu acma
        Attributes_Food attributesFood = new Attributes_Food();

        foodGiris();

        attributesFood.foodCategoryLink.click();
    }


    public  void categoryIlkaddLink() {//thaiAdmin //merchant giriş /food/category butonuna tıklayıp ilk ekrandaki ADD New butonuna tıklama
        //tan sonra açılan bölüm

        Attributes_Food attributesFood = new Attributes_Food();


        attributesFood.foodCategoryGiris();
        categoryAddLink.click();
    }

    public   void categoryIlkShortLink() {//thaiAdmin //merchant giriş /food/category butonuna tıklayıp ekranda
        //sağ üstte ADD NEW butonun yanındaki "SHORT" butonu
        Attributes_Food attributesFood = new Attributes_Food();

        attributesFood.foodCategoryGiris();
        categoryShortLink.click();
    }

    public  void categoryUpdateLink() {//thai admin giriş//food/categori tıklanıp ilk menu sayfasındaki "SHORT" butonu
        Attributes_Food attributesFood = new Attributes_Food();

        attributesFood.foodCategoryGiris();

        categoryUpdate.click();
    }

    public void categoryDeleteLink() {//thai admin mercant sayfası/food/categori bolumundeki  menulerin  en sağında
        // (update/kalem işareti )yanındaki   DELETE  butonu
        Attributes_Food attributesFood = new Attributes_Food();

foodCategoryGiris();
        categoryDelete.click();
    }

























    //Dshboard/Attributes
    @FindBy(xpath ="//a[text()='Attributes']")
    public   WebElement AttributesButonu;

    //Dshboard/Attributes/Size
    @FindBy(xpath ="//a[text()='Size']")
    public   WebElement SizeButonu;

    //Dshboard/Attributes/Size/Add new
    @FindBy(xpath ="//i[@class='zmdi zmdi-plus']")
    public   WebElement AddNewButonu;
      @FindBy(xpath ="//label[@for='AR_size_size_name']")
    public   WebElement SizeNameButonu;

   //  @FindBy(xpath ="//h5[@class='m-0']")
   //public   WebElement ;
   //  @FindBy(xpath ="//h5[@class='m-0']")
   //public   WebElement AddNewButonu;

    //Dshboard/Attributes/Size/Searchbox
    @FindBy(xpath ="//input[@placeholder='Search']")
    public   WebElement SearchboxButonu;

    //Dshboard/Attributes/Size/Name
    @FindBy(xpath ="(//th[@class='sorting'])[1]")
    public   WebElement NameButonu;

    //Dshboard/Attributes/Size/Name yanindaki Asagi-yukarıisareti
    @FindBy(xpath ="//th[@aria-label='#: activate to sort column ascending']")
    public   WebElement AsagiYUkarıButonu;

    //Dshboard/Attributes/Size/müşteri ismi butonu
    @FindBy(xpath ="//a[@id='dropdownMenuLink']")
    public   WebElement MüşteriİsmiButonu;

    //Dshboard/Attributes/Size/müşteri ismi butonu/profil linki
    @FindBy(xpath ="//a[@class='dropdown-item']")
    public   WebElement ProfilButonu;

    //Dshboard/Attributes/Size/müşteri ismi/profil/Save butonu
    @FindBy(xpath ="//input[@name='yt0']")
    public   WebElement SaveButonu;

    //Dshboard/Attributes/Ingrediends/
    @FindBy(xpath ="//a[normalize-space()='Ingredients']")
    public   WebElement IngrediendsButonu;
    @FindBy(xpath ="//div[contains(text(),'Item translations')]")
    public   WebElement translationsButonu;
   // @FindBy(xpath ="")
   // public   WebElement ;
   @FindBy(xpath ="//th[@aria-label='Actions: activate to sort column ascending']")
   public   WebElement ActionsButonu;
    @FindBy(xpath ="//tbody/tr[1]/td[5]/div[1]/a[1]/i[1]")
    public   WebElement UpdateButonu;
    @FindBy(xpath ="(//i[@class='zmdi zmdi-border-color'])[1]")
    public   WebElement UpdateMenuButonu;


    @FindBy(xpath ="//a[normalize-space()='Cooking Reference']")
    public   WebElement CookingReferenceButonu;
 @FindBy(xpath ="//label[@for='AR_cookingref_cooking_name']")
    public   WebElement IngredientsNameButonu;
 //@FindBy(xpath ="//a[normalize-space()='Cooking Reference']")
 //   public   WebElement CookingReferenceButonu;


    }




