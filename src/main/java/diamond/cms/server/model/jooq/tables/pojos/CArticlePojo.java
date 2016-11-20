/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.pojos;


import diamond.cms.server.model.jooq.tables.interfaces.ICArticle;

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
public class CArticlePojo implements ICArticle {

	private static final long serialVersionUID = -127657622;

	private String    id;
	private String    title;
	private String    content;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String    catalogId;

	public CArticlePojo() {}

	public CArticlePojo(CArticlePojo value) {
		this.id = value.id;
		this.title = value.title;
		this.content = value.content;
		this.createTime = value.createTime;
		this.updateTime = value.updateTime;
		this.catalogId = value.catalogId;
	}

	public CArticlePojo(
		String    id,
		String    title,
		String    content,
		Timestamp createTime,
		Timestamp updateTime,
		String    catalogId
	) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.catalogId = catalogId;
	}

	@NotNull
	@Size(max = 40)
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@NotNull
	@Size(max = 255)
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Size(max = 65535)
	@Override
	public String getContent() {
		return this.content;
	}

	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@NotNull
	@Override
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	@Override
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@NotNull
	@Override
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	@Override
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Size(max = 40)
	@Override
	public String getCatalogId() {
		return this.catalogId;
	}

	@Override
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CArticlePojo (");

		sb.append(id);
		sb.append(", ").append(title);
		sb.append(", ").append(content);
		sb.append(", ").append(createTime);
		sb.append(", ").append(updateTime);
		sb.append(", ").append(catalogId);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ICArticle from) {
		setId(from.getId());
		setTitle(from.getTitle());
		setContent(from.getContent());
		setCreateTime(from.getCreateTime());
		setUpdateTime(from.getUpdateTime());
		setCatalogId(from.getCatalogId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ICArticle> E into(E into) {
		into.from(this);
		return into;
	}
}
