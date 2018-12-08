class HoaHong { // class Hoa hong voi cac dac tinh : mau_sac, mui_huong va cac ham getter,setter tuong ung;
	private String mau_sac;
	private String mui_huong;
	
	//getter
	public String getMauSac() {
		return mau_sac;
	}
	//setter
	public void setMauSac( String mau_sac) {
		this.mau_sac = mau_sac;
	}
	//getter
	public String getMuiHuong() {
		return mui_huong;
	}
	//setter
	public void setMuiHuong( String mui_huong) {
		this.mui_huong = mui_huong;
	}
}

class GiaoVien { // class Giao vien voi cac dac tinh : name , subject (mon hoc dang giang day) va cac ham getter,setter tuong ung;
	private String name;
	//getter
	public String getName() { return name ; }
	//setter
	public void setName(String name) { this.name = name ; }
	
	private String subject;
	//getter
	public String getSubject() { return subject ; }
	//setter
	public void setSubject(String subject) { this.subject = subject ; }
	
	
}

class SinhVien {  // class Sinh vien voi cac dac tinh : name , faculty (nganh hoc, khoa hoc) va cac ham getter,setter tuong ung;
	private String name;
	//getter
	public String getName() { return name ; }
	//setter
	public void setName(String name) { this.name = name ; }
	
	private String faculty;
	//getter
	public String getFaculty() { return faculty ; }
	//setter
	public void setFaculty(String faculty) { this.faculty = faculty ; }
	
}

class ConMeo { // class Con meo voi dac tinh : can nang, va cac ham getter ,setter tuong ung.
	private double can_nang;
	public int getCanNang() { return can_nang ;};
	public void setCanNang(int can_nang) { this.can_nang = can_nang;}
}

class MayTinh  { // class May tinh 
	private String hang; // hang may tinh
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
}

class TV  { // class TV
	private String hang; // hang TV
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
}

class TuLanh  { // class Tu lanh 
	private String hang; // hang tu lanh
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
}

class MayGiat  { // class May giat
	private String hang; // hang may giat
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
}

class LoViSong  { // class lo vi song
	private String hang; // hang lo vi song
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
}

class XeMay  { // class XeMay
	private String hang; // hang xe may
	public String getHang() { return hang; }; // getter
	public void setHang(String hang) { this.hang = hang; };	 // setter
	
	private double dung_tich; // dung tich cua xe.
	public int getDungTich() { return dung_tich; }; // getter
	public void setDungTich(double dung_tich) { this.dung_tich = dung_tich; }; // setter
}