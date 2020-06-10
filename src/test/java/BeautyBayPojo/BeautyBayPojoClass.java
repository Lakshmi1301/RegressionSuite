package BeautyBayPojo;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautyBayPojoClass extends BaseClass {
	public  BeautyBayPojoClass() {
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(className="links-flag")
	  private WebElement clkFlags ;
	@FindBy(className="country-selector")
	  private WebElement clkCountry ;
	@FindBy(xpath="//button[text()='Continue Shopping']")
	  private WebElement clkContShopping ;
	@FindBy(xpath="//button[text()='Continue Shopping']")
	  private WebElement clkBtn ;
	@FindBy(xpath="(//a[@rel='nofollow'])[1]")
	  private WebElement clkBtnSigninIcon ;
	 @FindBy(xpath="//input[@type='email']")
	  private WebElement txtEmail ;
	 @FindBy(xpath="//input[@type='password']")
	  private WebElement txtPassword ;
	 @FindBy(xpath="//button[text()='Sign in']")
	  private WebElement clkBtnSigninIn ;
	 @FindBy(tagName="a")
	 private List<WebElement> brokenLinks;
	 @FindBy(tagName="img")
	 private List<WebElement> brokenImages;
	  @FindBy(xpath="//span[text()='Explore']")
	  private WebElement clkMoveToExplore ;
	  @FindBy(xpath="(//a[text()='Nude Palettes'])[1]")
	  private WebElement clkOnNude ;
	  
	  @FindBy(xpath="//button[text()='Continue Shopping']")
	  private WebElement clkOnContShopping ;
	

	@FindBy(className="links-flag")
	  private WebElement clkFlags1 ;
	  @FindBy(className="country-selector")
	  private WebElement clkCountry1 ;
	  @FindBy(xpath="//button[text()='Continue Shopping']")
	  private WebElement clkContShopping1 ;
	
	

	
	@FindBy(xpath="//*[text()='Sort: Staff Faves']")
	  private WebElement clkOnSort ;
	  @FindBy(xpath="//*[text()='Customer Rating']")
	  private WebElement clkOnCustomer ;
	  @FindBy(xpath="//*[text()='Filter']")
	  private WebElement clkOnFilter ;
	  @FindBy(xpath="//*[text()='Brand']")
	  private WebElement clkOnBrand ;
	  @FindBy(xpath="//span[text()='wet n wild']")
	  private WebElement clkOnWetNdWild ;
	  @FindBy(xpath="(//button[text()='Done'])[2]")
	  private WebElement clkOnDone ;
	  @FindBy(xpath="//p[text()='Color Icon 10-Pan Eyeshadow Palette - My Glamour Squad']")
	  private WebElement clkOnProduct ;
	  @FindBy(className="product-variants__select")
	  private WebElement selectDropDown ;
	  @FindBy(xpath="//button[text()='Add to bag']")
	  private WebElement clkBtnBag ;
	  @FindBy(xpath="//div[contains(text(),'View bag')]")
	  private WebElement clkViewBag ;
	  @FindBy(xpath="//span[text()='+']")
	  private WebElement clkPlus ;
	  @FindBy(xpath="(//input[@type='submit'])[1]")
	  private WebElement clkCheckoutSecurely ;
	  @FindBy(xpath="(//input[@type='submit'])[1]")
	  private WebElement clkNext ;
	  @FindBy(xpath="(//input[@type='submit'])[2]")
	  private WebElement clkNext2 ;
	  @FindBy(xpath="(//input[@type='submit'])[3]")
	  private WebElement clkNext3 ;
	  
	  public WebElement getClkFlags() {
			return clkFlags;
		}
		public WebElement getClkCountry() {
			return clkCountry;
		}
		public WebElement getClkContShopping() {
			return clkContShopping;
		}
	  
	  public WebElement getClkBtn() {
			return clkBtn;
		}
	  public WebElement getClkBtnSigninIcon() {
			return clkBtnSigninIcon;
		}
		public WebElement getTxtEmail() {
			return txtEmail;
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		public WebElement getClkBtnSigninIn() {
			return clkBtnSigninIn;
		}
		public List<WebElement> getBrokenLinks() {
			return brokenLinks;
		}
		public List<WebElement> getBrokenImages() {
			return brokenImages;
		}
		public WebElement getClkMoveToExplore() {
			return clkMoveToExplore;
		}
		public WebElement getClkOnNude() {
			return clkOnNude;
		}
		  public WebElement getClkOnContShopping() {
				return clkOnContShopping;
			}
		  public WebElement getClkFlags1() {
				return clkFlags1;
			}
		  public WebElement getClkCountry1() {
				return clkCountry1;
			}
			public WebElement getClkContShopping1() {
				return clkContShopping1;
			}
			
		public WebElement getClkOnSort() {
			return clkOnSort;
		}
		public WebElement getClkOnCustomer() {
			return clkOnCustomer;
		}
		public WebElement getClkOnFilter() {
			return clkOnFilter;
		}
		public WebElement getClkOnBrand() {
			return clkOnBrand;
		}
		public WebElement getClkOnWetNdWild() {
			return clkOnWetNdWild;
		}
		public WebElement getClkOnDone() {
			return clkOnDone;
		}
		public WebElement getClkOnProduct() {
			return clkOnProduct;
		}
		public WebElement getSelectDropDown() {
			return selectDropDown;
		}
		public WebElement getClkBtnBag() {
			return clkBtnBag;
		}
		public WebElement getClkViewBag() {
			return clkViewBag;
		}
		public WebElement getClkPlus() {
			return clkPlus;
		}
		public WebElement getClkCheckoutSecurely() {
			return clkCheckoutSecurely;
		}
		public WebElement getClkNext() {
			return clkNext;
		}
		public WebElement getClkNext2() {
			return clkNext2;
		}
		public WebElement getClkNext3() {
			return clkNext3;
		}
	  
	  
	  
	  
	 
	
}
