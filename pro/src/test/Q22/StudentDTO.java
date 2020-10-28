package test.Q22;

public class StudentDTO {

	private int sno;
	private String name;
	
	StudentDTO(){}
	
	StudentDTO(int sno, String name){
		this.sno=sno;
		this.name=name;
	}
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof StudentDTO) {
			StudentDTO sDTO=(StudentDTO)obj;
			if(this.sno==sDTO.getSno()) {			
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno;
	}
	
	
	
}
