// Product Class
package Product;

public class Product {

	private Integer IdNumber;

	private String Name;
	private String Description;
	private Boolean DiscontinuedFlag;
	private Integer UnitCount;
	private Float PricePerUnit;

	public Product(String Name, Boolean Discontinued) {
		this.Name = Name;
		this.DiscontinuedFlag = DiscontinuedFlag;
	}

	public Product(String Name, String Description, Boolean Discontinued) {
		this.Name = Name;
		this.Description = Description;
		this.DiscontinuedFlag = DiscontinuedFlag;
	}

	public Product(String Name, String Description, String Discontinued, Integer UnitCount, Float PricePerUnit) {
		this.Name = Name;
		this.Description = Description;
		this.DiscontinuedFlag = DiscontinuedFlag;
		this.UnitCount = UnitCount;
		this.PricePerUnit = PricePerUnit;
	}

	private void setProductIdNumber(Integer IdNumber) {
		this.IdNumber = IdNumber;
	}

	public Integer getProductIdNumber() {
		return this.IdNumber;
	}

	public void setProductName(String Name) {
		this.Name = Name;
	}

	public String getProductName() {
		return this.Name;
	}

	public void setProductDescription(String Description) {
		this.Description = Description;
	}

	public String getProductDescription() {
		return this.Description;
	}

	public void setProductDiscontinued(Boolean Discontinued) {
		this.DiscontinuedFlag = Discontinued;
	}

	public Boolean getProductDiscontinued() {
		return this.DiscontinuedFlag;
	}

	public void setProductUnitCount(Integer UnitCount) {
		this.UnitCount = UnitCount;
	}

	public Integer getProductUnitCount() {
		return this.UnitCount;
	}

	public void setPricePerUnit(Float PricePerUnit) {
		this.PricePerUnit = PricePerUnit;
	}

	public Float getPricePerUnit() {
		return this.PricePerUnit ;
	}

}