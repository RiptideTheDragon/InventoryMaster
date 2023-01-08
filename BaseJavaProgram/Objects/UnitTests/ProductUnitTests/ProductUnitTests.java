// Unit Tests for Product.java
import Product.*;

import static org.juint.Assert.*;

import org.juint.BeforeEach;
import org.juint.DisplayName;
import org.juint.RepeatedTest;
import org.juint.Test;

public class ProductUnitTest {

	/*
		Test consturctor to create product class with Name and DiscontinuedFlag.

	*/
	@Test
	@DisplayName("Create Product with Name and DiscontinuedFlag")
	public void createProduct_With_Name_And_DiscontinuedFlag() {
		String Name = "TestName";
		Boolean DiscontinuedFlag = false;

		Product product = new Product(Name, DiscontinuedFlag);

		assertEquals(product != null);
		assertEquals(product.getProductName(), Name);
		assertEquals(product.getProductDiscontinuedFlag(), DiscontinuedFlag);

	}

}