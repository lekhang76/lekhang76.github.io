package entity;

public class MyFile {
	private String name;
	private long size;
	private String fullpath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFullpath() {
		return fullpath;
	}

	public void setFullpath(String fullpath) {
		this.fullpath = fullpath;
	}
	
	public MyFile() {
		super();
	}
	
	public MyFile(String name, long size, String fullpath) {
		super();
		this.name = name;
		this.size = size;
		this.fullpath = fullpath;
	}
}
