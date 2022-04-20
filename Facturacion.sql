Create database Sfw_Facturacion
go
use Sfw_Facturacion
go

create table Categorias(
id_categoria int primary key,
nombre varchar(20)
);

create table Inventario(
id_Producto int primary key,
nombre varchar(40),
cantidad int,
categoria int foreign key (categoria) references Categorias(id_categoria),
);

create table Cliente(
id_cliente int primary key,
nombre varchar(20),
apellido varchar(20),
telefono int,
);

create table Factura(
numero int primary key,
id_cliente int foreign key (id_cliente) references Cliente(id_cliente),
fecha date,
pago_total float,
);