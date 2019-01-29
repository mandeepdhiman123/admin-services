package io.mosip.kernel.lkeymanager.entity.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import io.mosip.kernel.lkeymanager.entity.LicenseKey;
import lombok.Data;

/**
 * ID class for {@link LicenseKey}.
 * 
 * @author Sagar Mahapatra
 * @since 1.0.0
 *
 */
@Embeddable
@Data
public class LicenseKeyID implements Serializable {
	/**
	 * Serializable version ID.
	 */
	private static final long serialVersionUID = 3013351043966901511L;
	/**
	 * The TSP ID.
	 */
	@Column(name = "tsp_id", nullable = false)
	private String tspId;
	/**
	 * The License key.
	 */
	@Column(name = "lkey", nullable = false)
	private String lKey;
}
