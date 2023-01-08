package main.resources.Product;

public class Product {

	private Integer IdNumber;

	private String Name;
	private String Description;
	private Boolean DiscontinuedFlag;
	private Integer UnitCount;
	private Double PricePerUnit;

	public Product(String Name, Boolean DiscontinuedFlag) {
		this.Name = Name;
		this.DiscontinuedFlag = DiscontinuedFlag;
	}

	public Product(String Name, String Description, Boolean DiscontinuedFlag) {
		this.Name = Name;
		this.Description = Description;
		this.DiscontinuedFlag = DiscontinuedFlag;
	}

	public Product(String Name, String Description, Boolean DiscontinuedFlag, Integer UnitCount, Double PricePerUnit) {
		this.Name = Name;
		this.Description = Description;
		this.DiscontinuedFlag = DiscontinuedFlag;
		this.UnitCount = UnitCount;
		this.PricePerUnit = PricePerUnit;
	}

	public void setProductIdNumber(Integer IdNumber) {
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

	public void setProductDiscontinuedFlag(Boolean Discontinued) {
		this.DiscontinuedFlag = Discontinued;
	}

	public Boolean getProductDiscontinuedFlag() {
		return this.DiscontinuedFlag;
	}

	public void setProductUnitCount(Integer UnitCount) {
		this.UnitCount = UnitCount;
	}

	public Integer getProductUnitCount() {
		return this.UnitCount;
	}

	public void setProductPricePerUnit(Double PricePerUnit) {
		this.PricePerUnit = PricePerUnit;
	}

	public Double getProductPricePerUnit() {
		return this.PricePerUnit ;
	}

}