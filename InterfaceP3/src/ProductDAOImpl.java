
public class ProductDAOImpl implements ProductDAO
{

	@Override
	public void addProduct() {
	    System.out.println("This is addProduct");
		
	}

	@Override
	public void viewProduct(ProductModel p) {
		
		System.out.println("This is view product::"+p.getPname()+""+p.getPid());
		
	}

}
