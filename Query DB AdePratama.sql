SQL> create tablespace jobselection
 2 datafile 'D:\Praktikum\Basis Data\Modul
1\job_selection.dbf'
 3 size 40M;

 create user adepratama_07073
 2 identified by ade
 3 default tablespace jobselection
 4 quota 40M on jobselection;



 grant all privileges to
adepratama_07073;


 conn adepratama_07073/ade


 create table Pelamar
2 (
 3 id_pelamar INTEGER not null,
 4 nama VARCHAR2(15),
 5 alamat VARCHAR2(100),
 6 tempat_tanggal_lahir VARCHAR2(50),
 7 gender VARCHAR2(15),
 8 agama VARCHAR2(10)
 9 );


 create table Pekerjaan
 2 (
 3 id_pekerjaan INTEGER not null,
 4 spesialisasi_pekerjaan VARCHAR2(50),
 5 gaji INTEGER
 6 );


 create table Manajemen_Lowongan
 2 (
 3 id_gelombang INTEGER not null,
 4 tanggal DATE,
 5 id_pekerjaan INTEGER
 6 );


 create table Detail
 2 (
 3 id_gelombang INTEGER not null,
 4 id_pelamar INTEGER,
 5 tanggal_lamaran DATE
 6 );

 alter table Pelamar
 2 add constraint PK_pelamar primary key
(id_pelamar);


 alter table Pekerjaan
 2 add constraint PK_pekerjaan primary key
(id_pekerjaan);



 alter table Manajemen_Lowongan
 2 add constraint PK_lowongan primary key
(id_gelombang)
 3 add constraint FK_id_pekerjaan foreign
key (id_pekerjaan)
 4 references Pekerjaan (id_pekerjaan);


 alter table Detail
 2 add constraint FK_id_gelombang foreign
key (id_gelombang)
 3 references Manajemen_Lowongan
(id_gelombang)
 4 add constraint FK_id_pelamar foreign key
(id_pelamar)
 5 references Pelamar (id_pelamar);



create sequence id_pelamar
 2 minvalue 1
 3 maxvalue 9999
 4 start with 1
 5 increment by 1
 6 cache 30;


 ALTER TABLE Pekerjaan
 2 RENAME COLUMN ID_PEKERJAAN TO
"07073_Id_Pekerjaan";



 alter table pelamar
 2 modify agama UNIQUE;


 alter table pekerjaan
 2 modify gaji CHAR(30);



========================================================= MODUL 2 ===================================================

 insert into pelamar (id_pelamar, nama,
alamat, tanggal_lahir, gender, agama) values
(id_pelamar.nextval, 'Andi', 'Surabaya',
to_date('01/07/1998','dd/mm/yyyy'), 'Pria',
'Islam');




 insert into pelamar (id_pelamar, nama,
alamat, tanggal_lahir, gender, agama) values
(id_pelamar.nextval, 'Dimas', 'Madiun',
to_date('25/05/1997','dd/mm/yyyy'), 'Pria',
'Kristen');


 insert all
 2 into pelamar (id_pelamar, nama, alamat,
tanggal_lahir, gender, agama) values (3,
'Vivi', 'Cilacap',
to_date('08/12/1995','dd/mm/yyyy'), 'Wanita',
'Konghucu')
 3 into pelamar (id_pelamar, nama, alamat,
tanggal_lahir, gender, agama) values (4,
'Ika', 'Ngawi',
to_date('12/11/1998','dd/mm/yyyy'), 'Wanita',
'Katholik')
 4 into pelamar (id_pelamar, nama, alamat,
tanggal_lahir, gender, agama) values (5,
'Alfin', 'Bogor',
to_date('31/08/1998','dd/mm/yyyy'), 'Pria',
'Budha')
5  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (6, 'Didik', 'Ponorogo', to_date('07/01/1998','dd/mm/yyyy'), 'Wanita', 'Islam')
  6  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (7, 'Fajar', 'Ponorogo', to_date('08/09/1997','dd/mm/yyyy'), 'Pria', 'Islam')
  7  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (8, 'Ahmad', 'Surabaya', to_date('13/06/1999','dd/mm/yyyy'), 'Pria', 'Kristen')
  8  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (9, 'Wafi', 'Jombang', to_date('05/02/1997','dd/mm/yyyy'), 'Pria', 'Budha')
  9  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (10, 'Erika', 'Ngawi', to_date('19/03/1999','dd/mm/yyyy'), 'Wanita', 'Islam')
  10  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (11, 'Bastian', 'Surabaya', to_date('22/04/1997','dd/mm/yyyy'), 'Pria', 'Islam')
  11  select 1 from dual;



insert into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (1, 'HRD', '3500000');


insert into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (2, 'IT_Project', '6000000');



insert all
  2  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (3, 'Web_Desain', '8000000')
  3  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (4, 'Akunting', '2400000')
  4  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (5, 'IT_Support', '4000000')
  5  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (6, 'Personalia', '3000000')
  6  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (7, 'Sekretaris', '3800000')
  7  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (8, 'Periklanan', '2700000')
  8  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (9, 'Desain Kreatif', '3300000')
  9  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (10, 'Manufaktur', '4100000')
 10  select 1 from dual;

insert into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (1, to_date('12/01/2020','dd/mm/yyyy'), 1);

insert into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (2, to_date('15/02/2020','dd/mm/yyyy'), 2);


insert all
  2  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (3, to_date('23/02/2020','dd/mm/yyyy'), 3)
  3  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (4, to_date('17/04/2020','dd/mm/yyyy'), 4)
  4  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (5, to_date('27/04/2020','dd/mm/yyyy'), 5)
  5  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (6, to_date('19/05/2020','dd/mm/yyyy'), 6)
  6  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (7, to_date('30/05/2020','dd/mm/yyyy'), 7)
  7  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (8, to_date('13/08/2020','dd/mm/yyyy'), 8)
  8  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (9, to_date('21/08/2020','dd/mm/yyyy'), 9)
  9  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (10, to_date('01/11/2020','dd/mm/yyyy'), 10)
 10  select 1 from dual;



insert into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (1, 1, to_date('08/09/2019','dd/mm/yyyy'));

insert into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (2, 2, to_date('19/11/2019','dd/mm/yyyy'));



insert all
  2  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (3, 3, to_date('07/12/2019','dd/mm/yyyy'))
  3  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (4, 4, to_date('11/01/2020','dd/mm/yyyy'))
  4  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (5, 5, to_date('20/02/2020','dd/mm/yyyy'))
  5  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (6, 6, to_date('08/03/2020','dd/mm/yyyy'))
  6  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (7, 7, to_date('17/03/2020','dd/mm/yyyy'))
  7  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (8, 8, to_date('08/05/2020','dd/mm/yyyy'))
  8  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (9, 9, to_date('08/06/2020','dd/mm/yyyy'))
  9  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (10, 10, to_date('11/09/2020','dd/mm/yyyy'))
 10  select 1 from dual;



 update pelamar set alamat = 'Jogja' where alamat LIKE '%ro%' AND gender LIKE '%r%' AND id_pelamar < 10;



 update pelamar set agama = 'Islam' where agama LIKE '%K%' AND gender LIKE '%Wa%' AND id_pelamar < 10;




update pekerjaan set gaji = '3700000' where gaji LIKE '%2%' AND spesialisasi_pekerjaan LIKE '%n%' AND "07073_ID_PEKERJAAN" < 9;


update manajemen_lowongan set tanggal = '01/aug/2020' where tanggal LIKE '%1%' AND id_pekerjaan > 7 AND ID_PEKERJAAN < 10;


update detail set tanggal_lamaran = '27/mar/2020' where tanggal_lamaran LIKE '%20%' AND id_pelamar > 5 AND id_gelombang < 8;



delete from detail where id_gelombang = 4 OR id_gelombang = 5 OR id_gelombang = 6;


savepoint adee;

commit;



rollback to adee;



select * from pelamar order by nama asc;


select alamat from pelamar group by alamat;


================================================================ MODUL 3 =======================================================





insert all
  2  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (12, 'Dinda', 'Cilacap', to_date('08/01/1995','dd/mm/yyyy'), 'Wanita', 'Kristen')
  3  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (13, 'Reni', 'Ngawi', to_date('12/02/1998','dd/mm/yyyy'), 'Wanita', 'Katholik')
  4  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (14, 'Bimo', 'Bogor', to_date('31/03/1998','dd/mm/yyyy'), 'Pria', 'Budha')
  5  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (15, 'Heru', 'Ponorogo', to_date('07/04/1998','dd/mm/yyyy'), 'Pria', 'Islam')
  6  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (16, 'Akmal', 'Jogja', to_date('08/05/1997','dd/mm/yyyy'), 'Pria', 'Islam')
  7  select 1 from dual;



insert all
  2  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (12, 'OB', '1800000')
  3  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (13, 'UI Designer', '5100000')
  4  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (14, 'DBA', '3300000')
  5  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (15, 'System Analyst', '3700000')
  6  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (16, 'Pentester', '2800000')
  7  select 1 from dual;




insert all
  2  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (11, to_date('23/02/2020','dd/mm/yyyy'), 12)
  3  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (12, to_date('17/04/2020','dd/mm/yyyy'), 13)
  4  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (13, to_date('27/04/2020','dd/mm/yyyy'), 14)
  5  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (14, to_date('19/05/2020','dd/mm/yyyy'), 15)
  6  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (15, to_date('30/05/2020','dd/mm/yyyy'), 16)
  7  select 1 from dual;



insert all
  2  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (11, 12, to_date('08/12/2019','dd/mm/yyyy'))
  3  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (12, 13, to_date('12/01/2020','dd/mm/yyyy'))
  4  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (13, 14, to_date('22/02/2020','dd/mm/yyyy'))
  5  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (14, 15, to_date('10/03/2020','dd/mm/yyyy'))
  6  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (15, 16, to_date('20/03/2020','dd/mm/yyyy'))
  7  select 1 from dual;



select max(gaji) as max, min(gaji) as min from pekerjaan;


select "07073_Id_Pekerjaan", count("07073_Id_Pekerjaan") as banyaknya from pekerjaan where "07073_Id_Pekerjaan" = 3 or "07073_Id_Pekerjaan" = 4 or "07073_Id_Pekerjaan" = 5 group by "07073_Id_Pekerjaan";


select sum(gaji) as Total_gaji_lowongan from pekerjaan;


select avg(gaji) as rata_rata from pekerjaan where "07073_Id_Pekerjaan" = 7 or "07073_Id_Pekerjaan" = 12;






select "07073_Id_Pekerjaan", max(gaji) as
  2  terbanyak, min(gaji) as terendah from pekerjaan
  3  group by "07073_Id_Pekerjaan";



select "07073_Id_Pekerjaan", (select count(gaji) from pekerjaan where "07073_Id_Pekerjaan" < 10 AND "07073_Id_Pekerjaan" > 5 OR "07073_Id_Pekerjaan" = 7)
  2  as banyak from pekerjaan;



select "07073_Id_Pekerjaan", (select sum(gaji) from pekerjaan where "07073_Id_Pekerjaan" < 10 AND "07073_Id_Pekerjaan" > 5 OR "07073_Id_Pekerjaan" = 7)
  2  as total from pekerjaan; 



select "07073_Id_Pekerjaan", spesialisasi_pekerjaan
  2  from pekerjaan where gaji >= ( select avg(gaji) from pekerjaan);



select "07073_Id_Pekerjaan",(select avg(gaji) from pekerjaan)
  2  as rata_rata from pekerjaan group by "07073_Id_Pekerjaan";



select gaji from pekerjaan where gaji = (select max(gaji) from pekerjaan);



select "07073_Id_Pekerjaan", (select avg(gaji) from pekerjaan
  2  where gaji < (select max(gaji) from pekerjaan
  3  where "07073_Id_Pekerjaan" > (select "07073_Id_Pekerjaan" from pekerjaan where "07073_Id_Pekerjaan" = 6)))
  4  as nilai from pekerjaan;



================================================================== MODUL 4 ==============================================








insert all
  2  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (12, 'Desia', 'Cilacap', to_date('08/01/1995','dd/mm/yyyy'), 'Wanita', 'Islam')
  3  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (13, 'Reni', 'Ngawi', to_date('12/02/1998','dd/mm/yyyy'), 'Wanita', 'Kristen')
  4  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (14, 'Bima', 'Bogor', to_date('31/03/1998','dd/mm/yyyy'), 'Pria', 'Kristen')
  5  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (15, 'Hermawan', 'Ponorogo', to_date('07/04/1998','dd/mm/yyyy'), 'Pria', 'Islam')
  6  into pelamar (id_pelamar, nama, alamat, tanggal_lahir, gender, agama) values (16, 'Akmalul', 'Jogja', to_date('08/05/1997','dd/mm/yyyy'), 'Pria', 'Islam')
  7  select 1 from dual;



insert all
  2  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (12, 'OB', '2900000')
  3  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (13, 'UI Designer', '3100000')
  4  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (14, 'DBA', '3300000')
  5  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (15, 'System Analyst', '4300000')
  6  into pekerjaan ("07073_Id_Pekerjaan", spesialisasi_pekerjaan, gaji) values (16, 'Pentester', '2700000')
  7  select 1 from dual;





insert all
  2  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (11, to_date('23/02/2020','dd/mm/yyyy'), 12)
  3  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (12, to_date('17/04/2020','dd/mm/yyyy'), 13)
  4  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (13, to_date('27/04/2020','dd/mm/yyyy'), 14)
  5  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (14, to_date('19/05/2020','dd/mm/yyyy'), 15)
  6  into manajemen_lowongan (id_gelombang, tanggal, id_pekerjaan) values (15, to_date('30/05/2020','dd/mm/yyyy'), 16)
  7  select 1 from dual;


insert all
  2  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (11, 12, to_date('08/12/2019','dd/mm/yyyy'))
  3  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (12, 13, to_date('12/01/2020','dd/mm/yyyy'))
  4  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (13, 14, to_date('22/02/2020','dd/mm/yyyy'))
  5  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (14, 15, to_date('10/03/2020','dd/mm/yyyy'))
  6  into detail (id_gelombang, id_pelamar, tanggal_lamaran) values (15, 16, to_date('20/03/2020','dd/mm/yyyy'))
  7  select 1 from dual;



select a.spesialisasi_pekerjaan, b.id_gelombang
  2  from pekerjaan a join
  3  manajemen_lowongan b
  4  on a."07073_Id_Pekerjaan" = b.id_gelombang
  5  where id_gelombang > 0;



select a.nama, b.spesialisasi_pekerjaan, c.tanggal_lamaran
  2  from pelamar a
  3  left join pekerjaan b
  4  on a.id_pelamar = b."07073_Id_Pekerjaan"
  5  left join detail c
  6  on a.id_pelamar = c.id_gelombang
  7  where nama IN ( select nama from pelamar where id_pelamar <= 16 );





select distinct(a.tanggal_lamaran) as tgl_lamaran, c.id_pekerjaan, d.id_pelamar
  2  from detail a
  3  right join pekerjaan b
  4  right join manajemen_lowongan c
  5  on b."07073_Id_Pekerjaan" = c.id_gelombang
  6  right join pelamar d
  7  on c.id_gelombang = d.id_pelamar
  8  on d.id_pelamar = a.id_gelombang
  9  where d.id_pelamar > 0 OR c.id_pekerjaan <= 16;



create view v_pelamar_ins as
select * from pelamar;
insert into v_pelamar_ins
values (20, 'teris', 'Solo', to_date('10/07/1997','dd/mm/yyyy'), 'Pria', 'Islam');




create view v_detail_pekerjaan as
  2  select a.spesialisasi_pekerjaan, b.id_gelombang
  3  from pekerjaan a join
  4  manajemen_lowongan b
  5  on a."07073_Id_Pekerjaan" = b.id_gelombang
  6  where id_gelombang > 0;



create view v_detail_lamaran as
  2  select a.nama, b.spesialisasi_pekerjaan, c.tanggal_lamaran
  3  from pelamar a
  4  left join pekerjaan b
  5  on a.id_pelamar = b."07073_Id_Pekerjaan"
  6  left join detail c
  7  on a.id_pelamar = c.id_gelombang
  8  where nama IN ( select nama from pelamar where id_pelamar <= 16 );




create view v_detail_id as
  2  select distinct(a.tanggal_lamaran) as tgl_lamaran, c.id_pekerjaan, d.id_pelamar
  3  from detail a
  4  right join pekerjaan b
  5  right join manajemen_lowongan c
  6  on b."07073_Id_Pekerjaan" = c.id_gelombang
  7  right join pelamar d
  8  on c.id_gelombang = d.id_pelamar
  9  on d.id_pelamar = a.id_gelombang
 10  where d.id_pelamar > 0 OR c.id_pekerjaan <= 16;




delete from v_detail_pekerjaan where id_gelombang = 15;



delete from v_detail_lamaran where tanggal_lamaran LIKE '%20%';


delete from v_detail_id where tgl_lamaran LIKE '%10%';