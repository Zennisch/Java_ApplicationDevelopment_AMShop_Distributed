package service_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

import entity.NhanVien;

public interface IService_NhanVien extends Remote {
	
	public void createNhanVien(NhanVien nhanVien) throws RemoteException;
	
	public void updateNhanVien(NhanVien nhanVien) throws RemoteException;

	public List<NhanVien> getAllNhanVien() throws RemoteException;
	
	public NhanVien getNhanVienTheoMaNhanVien(String maNhanVien) throws RemoteException;
	
	public NhanVien getNhanVienTheoSoDienThoai(String soDienThoai) throws RemoteException;
	
	public NhanVien getNhanVienTheoCanCuocCongDan(String canCuocCongDan) throws RemoteException;
	
	public List<NhanVien> getDanhSachNhanVienChuaCoTrongNgayLamViec(LocalDate ngayLamViec) throws RemoteException;
	
	public NhanVien getNhanVienCuoi(String prefix) throws RemoteException;
	
	public NhanVien getNhanVienTheoThongTinDangNhap(String maNhanVien, String matKhau) throws RemoteException;
	
}
