package mark.workspace.mongodb_tutorial.data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class ManagedObject {
	protected String id;
	protected String name;
	protected String description;
	protected String creatorId;
	protected Date createTime;
	protected Date updateTime;
	protected String parentId;
	protected List<String> dataObjs;
	public ManagedObject(){
		this.id = UUID.randomUUID().toString();
		this.name = "name";
		this.description = "description";
		this.createTime = new Date();
		this.updateTime = this.createTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<String> getDataObjs() {
		return dataObjs;
	}
	public void setDataObjs(List<String> dataObjs) {
		this.dataObjs = dataObjs;
	}
	
}
