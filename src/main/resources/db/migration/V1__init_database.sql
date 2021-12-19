drop table if exists person;
drop table if exists customer;
drop table if exists employee;
drop table if exists event;
drop table if exists portfolio;
drop table if exists event_employee;

create table customer (
    id bigint not null auto_increment,
    first_name varchar(255),
    last_name varchar(255),
    gender varchar(20),
    email varchar(255),
    birthday date,
    phone_number varchar(255),
    user_name varchar(255) unique ,
    password varchar(255),
    person_id bigint unique ,

    primary key (id)
) engine = InnoDB;

create table employee (
    id bigint not null auto_increment,
    first_name varchar(255),
    last_name varchar(255),
    gender varchar(20),
    email varchar(255),
    birthday date,
    phone_number varchar(255),
    user_name varchar(255) unique ,
    password varchar(255),
    specialist varchar(255),
    price int,
    about varchar(255),
    company_name varchar(255),
    person_id bigint unique ,

    primary key (id)
) engine = InnoDB;

create table person (
    id bigint not null auto_increment,
    user_name varchar(255) unique ,
    password varchar(255),
    role varchar(50),

    primary key (id)
) engine = InnoDB;

create table event (
    id bigint not null auto_increment,
    date_of_event date,
    price int,
    serial_number varchar(255),
    type varchar(255),
    description varchar(255),
    customer_id bigint,

    primary key (id)
) engine = InnoDB;

create table event_employee (
    event_id bigint not null ,
    employee_id bigint not null
) engine = InnoDB;

create table portfolio (
    id bigint not null auto_increment,
    name varchar(255),
    url varchar(255),
    employee_id bigint,

    primary key (id)
) engine = InnoDB;


alter table customer
    add constraint FKnvxfigj5o3te7ig37cq7qo0bc
        foreign key (person_id)
            references person (id);

alter table employee
    add constraint FKfm68kmqett1iydj8xgfb6two8
        foreign key (person_id)
            references person (id);

alter table event
    add constraint FKjnpnunfdwdeowuemq97etk5yg
        foreign key (customer_id)
            references customer (id);

alter table event_employee
    add constraint FKoxb81s02hvuf5e9f2yl0cvu1j
        foreign key (employee_id)
            references employee (id);

alter table event_employee
    add constraint FKpo90q6v9rra6j549vpbhav675
        foreign key (event_id)
            references event (id);

alter table portfolio
    add constraint FK16x10r2t9mdgjiuv5bjyxv7yd
        foreign key (employee_id)
            references employee (id);

