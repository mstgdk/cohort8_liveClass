--tablo oluşturma 
create table yazarlar4(
id serial primary key, -- primary key = unique + not null
	isim varchar(30) not null,
	soy_isim varchar(30),
	birthday DATE
);
select * from yazarlar;

--tabloya data girişi yapmak
INSERT INTO yazarlar4 (isim,soy_isim,birthday) 
values('kerem','gedik','200-01-10');
INSERT INTO yazarlar (isim,birthday) values('mesut','200-01-10');

--aynı tablodan tekrar oluşturma
create table yazarlar2 (like yazarlar);

--bir tabloya başka tablodan veri ekleme
insert into yazarlar2 select * from yazarlar where isim='mesut';

--bir tablodan verileriyle birlikte tablo oluşturma
create table yazarlar3 as select * from yazarlar;

--tablo silme DROP
drop table yazarlar4;
drop table if exists yazarlar4;
drop table yazarlar3;

--tablo verilerini silme  1-TRUNCATE 2-DELETE
truncate yazarlar3;

--DELETE
begin;
select * from yazarlar4;
delete from yazarlar4 where isim='mesut';
select * from yazarlar4;
rollback;
select * from yazarlar4;













