package test.resources.ProductUnitTests;

import main.resources.Product.*;

import org.junit.Assert;
import org.junit.Test;

/*
 * Unit Tests for Product resource class with focus on Constructors.
 * Does not test Getters and Setters.
 */
public class ProductUnitTests {

	/*
	 * Test ProductUnitTests constructor to create product class with Name and DiscontinuedFlag.
	 * Inputs: Name, DiscontinuedFlag
	 */
	@Test
	public void createProduct_With_Name_And_DiscontinuedFlag() {
		String Name = "TestProductName";
		Boolean DiscontinuedFlag = false;

		Product product = new Product(Name, DiscontinuedFlag);

		Assert.assertNotNull(product);
		Assert.assertEquals(product.getProductName(), Name);
		Assert.assertEquals(product.getProductDiscontinuedFlag(), DiscontinuedFlag);
	}
	
	/*
	 * Test ProductUnitTests constructor to create product class with Name and DiscontinuedFlag.
	 * Inputs: Name, Description, Discontinued Flag
	 */
	@Test
	public void createProduct_With_Name_Description_And_DiscontinuedFlag() {
		String Name = "TestProductName";
		String Description = "Test Description For Product.";
		Boolean DiscontinuedFlag = false;
	
		Product product = new Product(Name, Description, DiscontinuedFlag);
	
		Assert.assertNotNull(product);
		Assert.assertEquals(product.getProductName(), Name);
		Assert.assertEquals(product.getProductDescription(), Description);
		Assert.assertEquals(product.getProductDiscontinuedFlag(), DiscontinuedFlag);
	}
	
	/*
	 * Test ProductUnitTests constructor to create product class with all inputs.
	 * Inputs: Name, Description, Discontinued Flag, UnitCount, PricePerUnit
	 */
	@Test
	public void createProduct_With_All_Inputs() {
		String Name = "TestProductName";
		String Description = "Test Description For Product.";
		Boolean DiscontinuedFlag = false;
		Integer UnitCount = 100;
		Double PricePerUnit = 10.10;
	
		Product product = new Product(Name, Description, DiscontinuedFlag, UnitCount, PricePerUnit);
	
		Assert.assertNotNull(product);
		Assert.assertEquals(product.getProductName(), Name);
		Assert.assertEquals(product.getProductDescription(), Description);
		Assert.assertEquals(product.getProductDiscontinuedFlag(), DiscontinuedFlag);
		Assert.assertEquals(product.getProductUnitCount(), UnitCount);
		Assert.assertEquals(product.getProductPricePerUnit(), PricePerUnit);
	}
}