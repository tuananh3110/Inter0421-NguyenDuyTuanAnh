CREATE TABLE 'bophan' (
  'IdBoPhan' int PRIMARY KEY NOT NULL,
  'TenBoPhan' varchar(45)  NOT NULL,
   

CREATE TABLE 'kieuthue' (
  'IdKieuThue' int PRIMARY KEY  NOT NULL,
  'TenKieuThue' varchar(45)  NOT NULL,
  'Gia' int NOT NULL,

CREATE TABLE 'loaidichvu' (
  'IdLoaiDichVu' int PRIMARY KEY NOT NULL,
  'TenLoaiDichVu' varchar(45)  NOT NULL,

CREATE TABLE 'trinhdo' (
  'IdTrinhDo' int  PRIMARY KEY NOT NULL,
  'TrinhDo' varchar(45)  NOT NULL,
 
CREATE TABLE 'loaikhach' (
  'IdLoaiKhach' int PRIMARY KEY NOT NULL,
  'TenLoaiKhach' varchar(45)  NOT NULL,

CREATE TABLE 'vitri' (
  'Idvitri' int  PRIMARY KEY NOT NULL,
  'TenViTri' varchar(45)  NOT NULL,
 
  
CREATE TABLE 'dichvu' (
  'IdDichVu' int PRIMARY KEY NOT NULL,
  'TenDichVu' varchar(45)  NOT NULL,
  'DienTich' int NOT NULL,
  'SoTang' int NOT NULL,
  'SoNguoiToiDa' varchar(45)  NOT NULL,
  'ChiPhiThue' int NOT NULL,
  'IdKieuThue' int NOT NULL,
  'IdLoaiDichVu' int NOT NULL,
  'TrangThai' varchar(45)  NOT NULL,
  KEY 'IdKieuThue_idx' ('IdKieuThue'),
  KEY 'IdLoaiDichVu_idx' ('IdLoaiDichVu'),
  CONSTRAINT 'IdKieuThue' FOREIGN KEY ('IdKieuThue') REFERENCES 'kieuthue' ('IdKieuThue'),
  CONSTRAINT 'IdLoaiDichVu' FOREIGN KEY ('IdLoaiDichVu') REFERENCES 'loaidichvu' ('IdLoaiDichVu'),

CREATE TABLE 'dichvudikem' (
  'IdDichVuDiKem' int  PRIMARY KEY NOT NULL,
  'TenDichVuDiKem' varchar(45)  NOT NULL,
  'Gia' int NOT NULL,
  'DonVi' int NOT NULL,
  'TrangThaiKhaDung' varchar(45)  NOT NULL,

CREATE TABLE 'hopdong' (
  'IdHopDong' int PRIMARY KEY  NOT NULL,
  'IdNhanVien' int NOT NULL,
  'IdKhachHang' int NOT NULL,
  'IdDichVu' int NOT NULL,
  'NgayLamHopDong' date NOT NULL,
  'NgayKetThuc' date NOT NULL,
  'TienDatCoc' int NOT NULL,
  'TongTien' int NOT NULL,
  
  KEY 'IdNhanVien_idx' ('IdNhanVien'),
  KEY 'IdKhachHang_idx' ('IdKhachHang'),
  KEY 'IdDichVu_idx' ('IdDichVu'),
  CONSTRAINT 'IdDichVu' FOREIGN KEY ('IdDichVu') REFERENCES 'dichvu' ('IdDichVu'),
  CONSTRAINT 'IdKhachHang' FOREIGN KEY ('IdKhachHang') REFERENCES 'khachhang' ('IdKhachHang'),
  CONSTRAINT 'IdNhanVien' FOREIGN KEY ('IdNhanVien') REFERENCES 'nhanvien' ('IdNhanVien'),

CREATE TABLE 'hopdongchitiet' (
  'IdHopDongChiTiet' int PRIMARY KEY NOT NULL,
  'IdHopDong' int NOT NULL,
  'IdDichVuDiKem' int NOT NULL,
  'SoLuong' int NOT NULL,
  KEY 'IdDichVuDiKem_idx' ('IdDichVuDiKem'),
  KEY 'IdHopDong_idx' ('IdHopDong'),
  CONSTRAINT 'IdDichVuDiKem' FOREIGN KEY ('IdDichVuDiKem') REFERENCES 'dichvudikem' ('IdDichVuDiKem'),
  CONSTRAINT 'IdHopDong' FOREIGN KEY ('IdHopDong') REFERENCES 'hopdong' ('IdHopDong')
  
CREATE TABLE 'nhanvien' (
  'IdNhanVien' int NOT NULL,
  'HoTen' varchar(45)  NOT NULL,
  'IdViTri' int NOT NULL,
  'IdTrinhDo' int NOT NULL,
  'IdBoPhan' int NOT NULL,
  'NgaySinh' date NOT NULL,
  'SoCMND' varchar(45)  NOT NULL,
  'Luong' varchar(45)  NOT NULL,
  'SDT' varchar(45)  NOT NULL,
  'Email' varchar(45)  NOT NULL,
  'DiaChi' varchar(45)  NOT NULL,
  PRIMARY KEY ('IdNhanVien'),
  KEY 'IdViTri_idx' ('IdViTri'),
  KEY 'IdBoPhan_idx' ('IdBoPhan'),
  KEY 'IdTrinhDo_idx' ('IdTrinhDo'),
  CONSTRAINT 'IdBoPhan' FOREIGN KEY ('IdBoPhan') REFERENCES 'bophan' ('IdBoPhan'),
  CONSTRAINT 'IdTrinhDo' FOREIGN KEY ('IdTrinhDo') REFERENCES 'trinhdo' ('IdTrinhDo'),
  CONSTRAINT 'IdViTri' FOREIGN KEY ('IdViTri') REFERENCES 'vitri' ('Idvitri'),



CREATE TABLE 'khachhang' (
  'IdKhachHang' int NOT NULL,
  'IdLoaiKhach' int NOT NULL,
  'HoTen' varchar(45)  NOT NULL,
  'NgaySinh' date NOT NULL,
  'SoCMND' varchar(45)  NOT NULL,
  'SDT' varchar(45)  NOT NULL,
  'Email' varchar(45)  NOT NULL,
  'DiaChi' varchar(45)  NOT NULL,
  PRIMARY KEY ('IdKhachHang'),
  KEY 'IdLoaiKhach_idx' ('IdLoaiKhach'),
  CONSTRAINT 'IdLoaiKhach' FOREIGN KEY ('IdLoaiKhach') REFERENCES 'loaikhach' ('IdLoaiKhach')