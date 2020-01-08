package lop1k.com.test;

import dangthuongngo.com.SinhVien;

public class TestSinhVien {
	
	public static void main(String[] args) {
		//SinhVien là class đại diện cho tập các đối tượng có chung đặt tả
		SinhVien teo = new SinhVien();
		//dùng từ khóa new để xin cấp phát bộ nhớ
		//muốn thay đổi dữ liệu ta dùng các setter
		teo.setMa("K18406077");
		teo.setTen("Trần Duy Tèo");
		teo.setDiem(10);
		//ta không được phép: teo.ma="K18406077" hay teo.diem=9;
		//Vì các thuộc tính đã được đóng gói (private)
		
		System.out.println("Mã: "+teo.getMa());
		System.out.println("Tên: "+teo.getTen());
		System.out.println("Điểm= "+teo.getDiem());
		
	}
}
