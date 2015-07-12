package springWebApp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimType {

	@JsonProperty("id")
	private int claimTypeId;
	@JsonProperty("copyid")
	private String copyId;
	@JsonProperty("order")
	private String sortOrder;

	/**
	 * @return the claimTypeId
	 */
	public int getClaimTypeId() {
		return claimTypeId;
	}

	/**
	 * @param claimTypeId
	 *            the claimTypeId to set
	 */
	public void setClaimTypeId(int claimTypeId) {
		this.claimTypeId = claimTypeId;
	}

	/**
	 * @return the copyId
	 */
	public String getCopyId() {
		return copyId;
	}

	/**
	 * @param copyId
	 *            the copyId to set
	 */
	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}

	/**
	 * @return the sortOrder
	 */
	public String getSortOrder() {
		return sortOrder;
	}

	/**
	 * @param sortOrder
	 *            the sortOrder to set
	 */
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
}