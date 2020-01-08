package dangthuongngo.com;

public class SinhVien {
	private String ten;
	private String ma;
	private double diem;
	
	// bên ngoài không truy suất vào được, 
	// phải truy suất thông qua các thuộc tính
	// cách truy suất thông qua các phương thức đặt biệt ->
	// -> cung cấp các getter (lấy dữ liệu), setter (sửa dữ liệu)
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	//this là đối tượng hiện tại bản thân của lớp này
	// instance variable: biến khai báo ngoài hàm
	//local variable: khai báo trong đối số của hàm 
	//hoặc trong nội dung hàm
	
}
