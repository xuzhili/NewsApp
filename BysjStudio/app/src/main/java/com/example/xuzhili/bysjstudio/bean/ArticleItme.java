package com.example.xuzhili.bysjstudio.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.ArrayList;

@DatabaseTable(tableName = "tb_article_item")
public class ArticleItme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6395291554556777477L;
	/*
	 * "contentid": 193, "modelid": 1, "title":
	 * "519b8bad670d5e9f726952297528 65f65c1a5feb95ea", "thumb":
	 * "http://upload.univs.cn/2014/1022/thumb_160_120_1413992041971.jpg",
	 * "description":
	 * "1067081765e5ff0c57286d596c5f4f205a925b66966268504e616821533aff0c4e2d53481270b96574ff0c968f77404e0096358282594f5f3a70c8768497f34e5058f054cd8d77ff0c4e007fa451456ee1751f673a6d3b529b768459275b66751f51fa73b057285b666821751f6d3b533a95e853e373a98d774e8665f65c1a5feb95eaff0c8fd94e9b5b66751f7a7f7684201c65f65c1a201d670d88c5662f4ed64eec5728519b8bad65f6768465e7519b8bad670d88c575318be568218bbe8ba1827a672f"
	 * , "comments": 0, "sorttime": 1414135295
	 */
	@DatabaseField(id = true, columnName = "mid", unique = true)
	private int contentid;
//	@DatabaseField(id = true, columnName = "mid", unique = true)
//    public long id_;
	@DatabaseField
	private int modelid;
	@DatabaseField
	private String title;
	@DatabaseField
	private String thumb;
	@DatabaseField
	private String image;
	@DatabaseField
	private String description;
	@DatabaseField
	private int comments;
	@DatabaseField
	private long sorttime;
	private ArrayList<SpecialItme> data;

	public int getContentid() {
		return contentid;
	}

	public void setContentid(int contentid) {
		this.contentid = contentid;
	}

	public int getModelid() {
		return modelid;
	}

	public void setModelid(int modelid) {
		this.modelid = modelid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public long getSorttime() {
		return sorttime;
	}

	public void setSorttime(long sorttime) {
		this.sorttime = sorttime;
	}

	public ArrayList<SpecialItme> getData() {
		return data;
	}

	public void setData(ArrayList<SpecialItme> data) {
		this.data = data;
	}

	public ArticleItme() {
		super();
	}

	public ArticleItme(int contentid, int modelid, String title,
			String thumb, String image, String description, int comments, long sorttime,
			ArrayList<SpecialItme> data) {
		super();
		this.contentid = contentid;
		this.modelid = modelid;
		this.title = title;
		this.thumb = thumb;
		this.image = image;
		this.description = description;
		this.comments = comments;
		this.sorttime = sorttime;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ArticleItme [contentid=" + contentid + ", modelid=" + modelid
				+ ", title=" + title + ", thumb=" + thumb + ", description="
				+ description + ", comments=" + comments + ", sorttime="
				+ sorttime + ", data=" + data + "]";
	}

}
