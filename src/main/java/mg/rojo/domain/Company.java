package mg.rojo.domain;

import java.util.Objects;

/**
 * Created by dida on 11/22/16.
 */
public class Company {

    private String brand;
	private Integer yearOfCreation;
	public Company(String brand, Integer yearOfCreation) {
		this.brand = Objects.requireNonNull(brand);
		if(yearOfCreation<=0) throw new IllegalAccessError("yearOfCreation is negative or 0 "+yearOfCreation );
		this.yearOfCreation = yearOfCreation;
	}
	public String getBrand() {
		return brand;
	}
	public Integer getYearOfCreation() {
		return yearOfCreation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((yearOfCreation == null) ? 0 : yearOfCreation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (yearOfCreation == null) {
			if (other.yearOfCreation != null)
				return false;
		} else if (!yearOfCreation.equals(other.yearOfCreation))
			return false;
		return true;
	}
	
	
    
}
