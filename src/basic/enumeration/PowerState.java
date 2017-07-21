package basic.enumeration;

public enum PowerState {
	OFF("전원끔"),ON("전원킴"),SUSPEND("먹통");
	
	private String description;//enum에 설명 붙이는 것 가능
	
	private PowerState(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return getDescription();
	}
}

