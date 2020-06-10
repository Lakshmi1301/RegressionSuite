package BeautyBayPojo;

public class PageObjModel {
	BeautyBayPojoClass login;
	public BeautyBayPojoClass getLoginPage() 
	{ 
		return (login == null) ? login = new BeautyBayPojoClass() : login;
	} 
	 
	 
	 
	 
}
