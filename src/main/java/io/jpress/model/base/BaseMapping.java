
package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 *  Auto generated, do not modify this file.
 */
@SuppressWarnings("serial")
public class BaseMapping<M extends BaseMapping<M>> extends JbootModel<M> implements IBean {

	public static final String ACTION_ADD = "mapping:add";
	public static final String ACTION_DELETE = "mapping:delete";
	public static final String ACTION_UPDATE = "mapping:update";

	@Override
	protected String addAction() {
		return ACTION_ADD;
	}

	@Override
	protected String deleteAction() {
		return ACTION_DELETE;
	}

	@Override
	protected String updateAction() {
		return ACTION_UPDATE;
	}

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setContentId(java.math.BigInteger contentId) {
		set("content_id", contentId);
	}

	public java.math.BigInteger getContentId() {
		return get("content_id");
	}

	public void setCategoryId(java.math.BigInteger categoryId) {
		set("category_id", categoryId);
	}

	public java.math.BigInteger getCategoryId() {
		return get("category_id");
	}

}
