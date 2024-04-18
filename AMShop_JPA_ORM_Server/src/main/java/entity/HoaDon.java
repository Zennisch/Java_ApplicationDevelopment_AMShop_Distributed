package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable {

	private static final long serialVersionUID = -3005357045012742305L;

	@Id
	@Column(name = "MaHoaDon", columnDefinition = "nvarchar(12)", nullable = false)
	private String maHoaDon;

	@ToString.Exclude
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaCuaHang")
	private CuaHang cuaHang;

	@ToString.Exclude
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNhanVien")
	private NhanVien nhanVien;

	@ToString.Exclude
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKhachHang")
	private KhachHang khachHang;

	@Column(name = "TienKhachDua", columnDefinition = "decimal", nullable = false)
	private double tienKhachDua;

	@Column(name = "ThoiGianTao", columnDefinition = "datetime", nullable = false)
	private LocalDateTime thoiGianTao;

}
