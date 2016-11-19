/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICUser extends Serializable {

	/**
	 * Setter for <code>cms.c_user.id</code>.
	 */
	public void setId(String value);

	/**
	 * Getter for <code>cms.c_user.id</code>.
	 */
	@NotNull
	@Size(max = 255)
	public String getId();

	/**
	 * Setter for <code>cms.c_user.createTime</code>.
	 */
	public void setCreatetime(Timestamp value);

	/**
	 * Getter for <code>cms.c_user.createTime</code>.
	 */
	@NotNull
	public Timestamp getCreatetime();

	/**
	 * Setter for <code>cms.c_user.expired</code>.
	 */
	public void setExpired(Long value);

	/**
	 * Getter for <code>cms.c_user.expired</code>.
	 */
	public Long getExpired();

	/**
	 * Setter for <code>cms.c_user.lastLoginTime</code>.
	 */
	public void setLastlogintime(Timestamp value);

	/**
	 * Getter for <code>cms.c_user.lastLoginTime</code>.
	 */
	@NotNull
	public Timestamp getLastlogintime();

	/**
	 * Setter for <code>cms.c_user.password</code>.
	 */
	public void setPassword(String value);

	/**
	 * Getter for <code>cms.c_user.password</code>.
	 */
	@NotNull
	@Size(max = 255)
	public String getPassword();

	/**
	 * Setter for <code>cms.c_user.token</code>.
	 */
	public void setToken(String value);

	/**
	 * Getter for <code>cms.c_user.token</code>.
	 */
	@Size(max = 255)
	public String getToken();

	/**
	 * Setter for <code>cms.c_user.username</code>.
	 */
	public void setUsername(String value);

	/**
	 * Getter for <code>cms.c_user.username</code>.
	 */
	@NotNull
	@Size(max = 255)
	public String getUsername();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ICUser
	 */
	public void from(diamond.cms.server.model.jooq.tables.interfaces.ICUser from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ICUser
	 */
	public <E extends diamond.cms.server.model.jooq.tables.interfaces.ICUser> E into(E into);
}