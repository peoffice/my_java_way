package mark.workspace.heberate_toturial;

import java.io.Serializable;
import java.sql.Blob;

public class ProductLine implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private Blob image;
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getHtmlDescription() {
		return htmlDescription;
	}
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
}
